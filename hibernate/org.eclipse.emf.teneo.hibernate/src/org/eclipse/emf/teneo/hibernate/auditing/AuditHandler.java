/**
 * <copyright>
 *
 * Copyright (c) 2012 Springsite BV (The Netherlands) and others
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Martin Taal
 * </copyright>
 *
 * $Id: AnyEObjectType.java,v 1.7 2010/11/12 09:33:33 mtaal Exp $
 */
package org.eclipse.emf.teneo.hibernate.auditing;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.FeatureMapUtil;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
import org.eclipse.emf.teneo.Constants;
import org.eclipse.emf.teneo.PersistenceOptions;
import org.eclipse.emf.teneo.extension.ExtensionPoint;
import org.eclipse.emf.teneo.hibernate.HbDataStore;
import org.eclipse.emf.teneo.hibernate.HbStoreException;
import org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing.TeneoAuditEntry;
import org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing.TeneoauditingPackage;
import org.eclipse.emf.teneo.util.StoreUtil;
import org.hibernate.Session;
import org.hibernate.engine.spi.SessionImplementor;

/**
 * Creates the audit model(s) on the basis of a set of EPackages. Provides other utility methods for
 * copying from a revision to a real object, getting the entity name etc.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 */
public class AuditHandler implements ExtensionPoint {

	public static final String ID_SEPARATOR = ";";

	/** Constructor by id */
	private final ConcurrentHashMap<String, Constructor<?>> constructors = new ConcurrentHashMap<String, Constructor<?>>();

	private HbDataStore dataStore;

	/**
	 * Copy the content from the source to the target, the copy action will translate all
	 * {@link EReference} values to a String containing the id.
	 */
	@SuppressWarnings("unchecked")
	public void copyContentToAuditEntry(Session session, EObject source, TeneoAuditEntry auditEntry,
			boolean copyCollections) {
		final EClass sourceEClass = source.eClass();
		final EClass targetEClass = auditEntry.eClass();
		for (EStructuralFeature targetEFeature : targetEClass.getEAllStructuralFeatures()) {

			if (!copyCollections && targetEFeature.isMany()) {
				continue;
			}

			// initialize with new arrays always to prevent hibernate from complaining if the
			// same array is re-used accross entities
			if (targetEFeature.getEType().getInstanceClass() != null
					&& targetEFeature.getEType().getInstanceClass().isArray()) {
				auditEntry.eSet(targetEFeature,
						Array.newInstance(targetEFeature.getEType().getInstanceClass().getComponentType(), 0));
			}

			final EStructuralFeature sourceEFeature = sourceEClass.getEStructuralFeature(targetEFeature
					.getName());
			if (sourceEFeature != null && (sourceEFeature.isMany() || source.eIsSet(sourceEFeature))) {
				if (targetEFeature instanceof EAttribute && sourceEFeature instanceof EReference) {
					if (sourceEFeature.isMany()) {
						for (Object value : (Collection<?>) source.eGet(sourceEFeature)) {
							final String idAsString = entityToIdString(session, value);
							((Collection<Object>) auditEntry.eGet(targetEFeature)).add(idAsString);
						}
					} else {
						final String idAsString = entityToIdString(session, source.eGet(sourceEFeature));
						auditEntry.eSet(targetEFeature, idAsString);
					}
				} else {
					if (sourceEFeature.isMany()) {
						if (FeatureMapUtil.isFeatureMap(sourceEFeature)) {
							for (Object value : ((Collection<?>) source.eGet(sourceEFeature))) {
								final FeatureMap.Entry sourceEntry = (FeatureMap.Entry) value;
								final EStructuralFeature targetEntryFeature = getAuditingModelElement(
										sourceEntry.getEStructuralFeature(), auditEntry.eClass().getName());
								final FeatureMap.Entry targetEntry = createFeatureMapEntry(session,
										targetEntryFeature, sourceEntry);
								((Collection<Object>) auditEntry.eGet(targetEFeature)).add(targetEntry);
							}
						} else {
							for (Object value : (Collection<?>) source.eGet(sourceEFeature)) {
								((Collection<Object>) auditEntry.eGet(targetEFeature)).add(convertValue(
										targetEFeature, value));
							}
						}
					} else {
						auditEntry.eSet(targetEFeature,
								convertValue(targetEFeature, source.eGet(sourceEFeature)));
					}
				}
			}
		}
	}

	/**
	 * Clones an array if the value is an array, otherwise just returns the value.
	 */
	public Object convertValue(EStructuralFeature eFeature, Object value) {
		if (value == null) {
			return value;
		}

		if (eFeature instanceof EReference && ((EReference) eFeature).isContainment()) {
			return EcoreUtil.copy((EObject) value);
		}

		// copy the array
		if (value.getClass().isArray()) {
			final int length = Array.getLength(value);
			final Object newArray = Array.newInstance(value.getClass().getComponentType(), length);
			for (int i = 0; i < length; i++) {
				Array.set(newArray, i, Array.get(value, i));
			}
			return newArray;
		}
		return value;
	}

	private FeatureMap.Entry createFeatureMapEntry(Session session, EStructuralFeature eFeature,
			FeatureMap.Entry sourceEntry) {
		Object value = sourceEntry.getValue();
		if (sourceEntry.getEStructuralFeature() instanceof EReference) {
			value = entityToIdString(session, value);
		}
		return FeatureMapUtil.createEntry(eFeature, value);
	}

	/**
	 * Create a string which reflects the id of the entity.
	 */
	public String entityToIdString(Session session, Object entity) {
		final String entityName = ((SessionImplementor) session).bestGuessEntityName(entity);
		final Serializable id = ((SessionImplementor) session).getEntityPersister(entityName, entity)
				.getIdentifier(entity, (SessionImplementor) session);
		return entityName + ID_SEPARATOR + id.getClass().getName() + ID_SEPARATOR + id;
	}

	/**
	 * Create an id String from the {@link EClass} and id. The id string is used in proxy resolving.
	 * It contains the entity name, id class and id itself.
	 */
	public String idToString(EClass eClass, Object id) {
		final String entityName = eClass.getEAnnotation(Constants.ANNOTATION_SOURCE_TENEO_JPA)
				.getDetails().get(Constants.ANNOTATION_KEY_ENTITY_NAME);
		return entityName + ID_SEPARATOR + id.getClass().getName() + ID_SEPARATOR + id;
	}

	/**
	 * Derive the entity name and id from the id string.
	 */
	public AuditReference fromString(String idString) {
		final String[] parts = idString.split(ID_SEPARATOR);
		final AuditReference auditReference = new AuditReference();
		auditReference.setTimeStamp(Long.parseLong(parts[0]));
		auditReference.setEntityName(parts[1]);
		auditReference.setId(getId(parts[3], parts[2]));
		return auditReference;
	}

	/** Creates an id object of the correct type */
	private Serializable getId(String idStr, String idType) {
		try {
			Constructor<?> constructor = constructors.get(idType);
			if (constructor == null) {
				final Class<?> idClass = this.getClass().getClassLoader().loadClass(idType);
				constructor = idClass.getConstructor(new Class[] { String.class });
				constructors.put(idType, constructor);
			}
			return (Serializable) constructor.newInstance(new Object[] { idStr });
		} catch (Exception e) {
			throw new HbStoreException("Could not create id type for " + idType + " and id " + idStr, e);
		}
	}

	/**
	 * Returns the model element representing this audit model element.
	 * 
	 * @see #setAuditingAssociation(EModelElement, EModelElement)
	 */
	@SuppressWarnings("unchecked")
	public <T extends EModelElement> T getModelElement(T auditModelElement) {
		final EAnnotation eAnnotation = auditModelElement
				.getEAnnotation(Constants.ANNOTATION_SOURCE_AUDITING);
		if (eAnnotation == null) {
			return null;
		}
		final String id = eAnnotation.getDetails().get(Constants.ANNOTATION_AUDITING_MODELELEMENT);
		if (id == null) {
			return null;
		}
		if (auditModelElement instanceof EClass) {
			return (T) StoreUtil.stringToEClass(dataStore.getPackageRegistry(), id);
		}
		return (T) StoreUtil.stringToStructureFeature(id);
	}

	public EClass getAuditingModelElement(EClass modelElement) {
		return getAuditingModelElement(modelElement, null);
	}

	/**
	 * Return the audit model element used to audit the passed in model element.
	 * 
	 * The qualifier is used to handle an efeature in a super class which is copied multiple times to
	 * auditing subclasses.
	 * 
	 * @see #setAuditingAssociation(EModelElement, EModelElement)
	 */
	@SuppressWarnings("unchecked")
	public <T extends EModelElement> T getAuditingModelElement(T modelElement, String qualifier) {
		final EAnnotation eAnnotation = modelElement
				.getEAnnotation(Constants.ANNOTATION_SOURCE_AUDITING);

		if (eAnnotation == null
				&& modelElement instanceof EStructuralFeature
				&& ((EStructuralFeature) modelElement).getEContainingClass().getEPackage() == XMLTypePackage.eINSTANCE) {
			return modelElement;
		}

		if (eAnnotation == null) {
			return null;
		}
		// note a qualifier is needed because a feature is created
		// multiple times for an audit feature in the audit table
		// so qualify using the audit eclass
		final String id = eAnnotation.getDetails().get(
				Constants.ANNOTATION_AUDITING_MODELELEMENT_AUDITING + (qualifier == null ? "" : qualifier));
		if (id == null) {
			return null;
		}
		if (modelElement instanceof EClass) {
			return (T) StoreUtil.stringToEClass(dataStore.getPackageRegistry(), id);
		}
		return (T) StoreUtil.stringToStructureFeature(id);
	}

	/**
	 * Returns true if the model element should not be audited.
	 */
	public <T extends EModelElement> boolean isNoAuditing(PersistenceOptions po, T modelElement) {

		final EAnnotation teneoAnnotation = modelElement
				.getEAnnotation(Constants.ANNOTATION_SOURCE_TENEO_JPA);
		if (teneoAnnotation != null) {
			// note check all keys, see EClassAnnotator
			boolean noEAVPresent = false;
			for (String value : teneoAnnotation.getDetails().values()) {
				if (value != null
						&& (value.contains("@EAV") || value.contains("@Transient") || value
								.contains(Constants.ANNOTATION_AUDITING_NOT))) {
					return true;
				}
				noEAVPresent = noEAVPresent || (value != null && value.contains("@NoEAV"));
			}
			// eav mapped
			if (po.isEAVMapping() && !noEAVPresent) {
				return true;
			}
		} else if (po.isEAVMapping()) {
			return true;
		}

		if (modelElement instanceof EStructuralFeature) {
			final EStructuralFeature eStructuralFeature = (EStructuralFeature) modelElement;

			// part of a featuremap, still incorporate in auditing
			if (ExtendedMetaData.INSTANCE.getGroup(eStructuralFeature) != null) {
				return false;
			}
			if (ExtendedMetaData.INSTANCE.getAffiliation(eStructuralFeature) != null) {
				return false;
			}

			if (!eStructuralFeature.isChangeable() || eStructuralFeature.isVolatile()
					|| eStructuralFeature.isDerived()) {
				// special case the eclass is mixed
				if (ExtendedMetaData.INSTANCE.getMixedFeature(eStructuralFeature.getEContainingClass()) != null) {
					return false;
				}

				return true;
			}

			if (eStructuralFeature instanceof EReference) {
				final EReference eReference = (EReference) eStructuralFeature;
				if (isNoAuditing(po, eReference.getEType())) {
					return true;
				}
			}

			return eStructuralFeature.isTransient()
					&& (eStructuralFeature instanceof EAttribute
							|| ((EReference) eStructuralFeature).getEOpposite() == null
							|| !((EReference) eStructuralFeature).getEOpposite().isContainment() || ((EReference) eStructuralFeature)
							.getEOpposite().isTransient());
		}
		return false;
	}

	/**
	 * Make sure that the model element and its auditing model element have links to eachother.
	 * 
	 * @see #getAuditingModelElement(EModelElement)
	 * @see #getModelElement(EModelElement)
	 */
	public <T extends EModelElement> void setAuditingAssociation(T source, T auditing,
			String qualifier) {
		{
			EAnnotation eAnnotation = auditing.getEAnnotation(Constants.ANNOTATION_SOURCE_AUDITING);
			if (eAnnotation == null) {
				eAnnotation = EcoreFactory.eINSTANCE.createEAnnotation();
				eAnnotation.setSource(Constants.ANNOTATION_SOURCE_AUDITING);
				auditing.getEAnnotations().add(eAnnotation);
			}
			if (source instanceof EClass) {
				eAnnotation.getDetails().put(Constants.ANNOTATION_AUDITING_MODELELEMENT,
						StoreUtil.eClassToString((EClass) source));
			} else {
				eAnnotation.getDetails().put(Constants.ANNOTATION_AUDITING_MODELELEMENT,
						StoreUtil.structuralFeatureToString((EStructuralFeature) source));
			}
		}
		{
			EAnnotation eAnnotation = source.getEAnnotation(Constants.ANNOTATION_SOURCE_AUDITING);
			if (eAnnotation == null) {
				eAnnotation = EcoreFactory.eINSTANCE.createEAnnotation();
				eAnnotation.setSource(Constants.ANNOTATION_SOURCE_AUDITING);
				source.getEAnnotations().add(eAnnotation);
			}

			// note a qualifier is needed because a feature is created
			// multiple times for an audit feature in the audit table
			// so qualify using the audit eclass
			final String localQualifier = qualifier != null ? qualifier : "";
			if (auditing instanceof EClass) {
				eAnnotation.getDetails().put(
						Constants.ANNOTATION_AUDITING_MODELELEMENT_AUDITING + localQualifier,
						StoreUtil.eClassToString((EClass) auditing));
			} else {
				eAnnotation.getDetails().put(
						Constants.ANNOTATION_AUDITING_MODELELEMENT_AUDITING + localQualifier,
						StoreUtil.structuralFeatureToString((EStructuralFeature) auditing));
			}
		}
	}

	/**
	 * Entry point for creating all auditing types needed to audit the sourceEPackage.
	 */
	public EPackage createAuditingEPackage(HbDataStore dataStore, EPackage sourceEPackage,
			EPackage.Registry registry, PersistenceOptions po) {
		final EPackage eAuditingPackage = EcoreFactory.eINSTANCE.createEPackage();
		eAuditingPackage.setName(sourceEPackage.getName() + "Auditing");
		eAuditingPackage.setNsPrefix(sourceEPackage.getNsPrefix() + "Auditing");
		eAuditingPackage.setNsURI(sourceEPackage.getNsURI() + "Auditing");
		for (EClassifier eClassifier : sourceEPackage.getEClassifiers()) {
			if (eClassifier instanceof EClass) {

				if (isNoAuditing(po, eClassifier)) {
					continue;
				}

				final EClass eClass = (EClass) eClassifier;
				final EClass auditingEClass = EcoreFactory.eINSTANCE.createEClass();
				auditingEClass.setName(po.getAuditingEntityPrefix() + eClass.getName()
						+ po.getAuditingEntityPostfix());
				auditingEClass.getESuperTypes().add(TeneoauditingPackage.eINSTANCE.getTeneoAuditEntry());

				eAuditingPackage.getEClassifiers().add(auditingEClass);
				setAuditingAssociation(eClass, auditingEClass, null);

				if (null != eClass.getEAnnotation(ExtendedMetaData.ANNOTATION_URI)) {
					auditingEClass.getEAnnotations().add(
							EcoreUtil.copy(eClass.getEAnnotation(ExtendedMetaData.ANNOTATION_URI)));
				}

				if (eClass.getEAnnotation(Constants.ANNOTATION_SOURCE_TENEO_JPA_AUDITING) != null) {
					final EAnnotation teneoAnnotation = EcoreUtil.copy(eClass
							.getEAnnotation(Constants.ANNOTATION_SOURCE_TENEO_JPA));
					teneoAnnotation.setSource(Constants.ANNOTATION_SOURCE_TENEO_JPA);
					auditingEClass.getEAnnotations().add(teneoAnnotation);
				} else {
					// at least add an entity annotation
					final EAnnotation eAnnotation = EcoreFactory.eINSTANCE.createEAnnotation();
					eAnnotation.setSource(Constants.ANNOTATION_SOURCE_TENEO_JPA);
					eAnnotation.getDetails().put("value", "@Entity");
					auditingEClass.getEAnnotations().add(eAnnotation);
				}

				for (EStructuralFeature eFeature : eClass.getEAllStructuralFeatures()) {
					if (isNoAuditing(po, eFeature)) {
						continue;
					}
					EStructuralFeature auditingEFeature;

					if (eFeature instanceof EReference && StoreUtil.isMap(eFeature)) {
						auditingEFeature = EcoreUtil.copy(eFeature);
					} else if (eFeature instanceof EReference && dataStore.isEmbedded((EReference) eFeature)) {
						auditingEFeature = EcoreUtil.copy(eFeature);
					} else if (eFeature instanceof EReference) {
						auditingEFeature = EcoreFactory.eINSTANCE.createEAttribute();
						auditingEFeature.setEType(XMLTypePackage.eINSTANCE.getString());
						for (EAnnotation eAnnotation : eFeature.getEAnnotations()) {
							auditingEFeature.getEAnnotations().add(EcoreUtil.copy(eAnnotation));
						}

						// copy all values
						for (EAttribute eSAttribute : EcorePackage.eINSTANCE.getEStructuralFeature()
								.getEAllAttributes()) {
							if (eSAttribute.isDerived() || eSAttribute.isVolatile()) {
								continue;
							}
							if (eFeature.eIsSet(eSAttribute)) {
								auditingEFeature.eSet(eSAttribute, eFeature.eGet(eSAttribute));
							}
						}
					} else {
						auditingEFeature = EcoreUtil.copy(eFeature);
					}

					// get rid of all teneo.jpa eannotations
					auditingEFeature.getEAnnotations().remove(
							auditingEFeature.getEAnnotation(Constants.ANNOTATION_SOURCE_TENEO_JPA));
					auditingEFeature.getEAnnotations().remove(
							auditingEFeature.getEAnnotation(Constants.ANNOTATION_SOURCE_TENEO_HIBERNATE));
					// re-use the other ones
					if (eFeature.getEAnnotation(Constants.ANNOTATION_SOURCE_TENEO_JPA_AUDITING) != null) {
						final EAnnotation teneoAnnotation = EcoreUtil.copy(eFeature
								.getEAnnotation(Constants.ANNOTATION_SOURCE_TENEO_JPA_AUDITING));
						teneoAnnotation.setSource(Constants.ANNOTATION_SOURCE_TENEO_JPA);
						auditingEFeature.getEAnnotations().add(teneoAnnotation);
					}

					// never be an id
					if (auditingEFeature instanceof EAttribute) {
						((EAttribute) auditingEFeature).setID(false);
					}
					// remove later...
					auditingEFeature.setLowerBound(0);

					auditingEClass.getEStructuralFeatures().add(auditingEFeature);
					setAuditingAssociation(eFeature, auditingEFeature, auditingEClass.getName());
				}
			}
		}

		registry.put(eAuditingPackage.getNsURI(), eAuditingPackage);

		return eAuditingPackage;
	}

	public HbDataStore getDataStore() {
		return dataStore;
	}

	public void setDataStore(HbDataStore dataStore) {
		this.dataStore = dataStore;
	}
}
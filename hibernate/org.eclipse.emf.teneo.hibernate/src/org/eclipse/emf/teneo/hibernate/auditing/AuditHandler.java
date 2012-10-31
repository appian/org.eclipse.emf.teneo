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
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
import org.eclipse.emf.teneo.Constants;
import org.eclipse.emf.teneo.PersistenceOptions;
import org.eclipse.emf.teneo.hibernate.HbStoreException;
import org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing.TeneoauditingPackage;
import org.eclipse.emf.teneo.util.StoreUtil;
import org.hibernate.Session;
import org.hibernate.engine.internal.ForeignKeys;
import org.hibernate.engine.spi.SessionImplementor;

/**
 * Creates the audit model(s) on the basis of a set of EPackages. Provides other utility methods for
 * copying from a revision to a real object, getting the entity name etc.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 */
public class AuditHandler {

	public static final String ID_SEPARATOR = ";";

	private static AuditHandler instance = new AuditHandler();

	public static AuditHandler getInstance() {
		return instance;
	}

	public static void setInstance(AuditHandler instance) {
		AuditHandler.instance = instance;
	}

	/** Constructor by id */
	private final ConcurrentHashMap<String, Constructor<?>> constructors = new ConcurrentHashMap<String, Constructor<?>>();

	/**
	 * Copy the content from the source to the target, the copy action will translate all
	 * {@link EReference} values to a String containing the id.
	 */
	@SuppressWarnings("unchecked")
	public void copyContent(Session session, EObject source, EObject target, boolean copyCollections) {
		final EClass sourceEClass = source.eClass();
		final EClass targetEClass = target.eClass();
		for (EStructuralFeature targetEFeature : targetEClass.getEAllStructuralFeatures()) {
			final EStructuralFeature sourceEFeature = sourceEClass.getEStructuralFeature(targetEFeature
					.getName());
			if (sourceEFeature != null && (sourceEFeature.isMany() || source.eIsSet(sourceEFeature))) {
				if (sourceEFeature instanceof EReference) {
					if (sourceEFeature.isMany()) {
						if (copyCollections) {
							for (Object value : (Collection<?>) source.eGet(sourceEFeature)) {
								final String idAsString = AuditHandler.getInstance().idToString(session, value);
								((Collection<Object>) target.eGet(targetEFeature)).add(idAsString);
							}
						}
					} else {
						final String idAsString = AuditHandler.getInstance().idToString(session,
								source.eGet(sourceEFeature));
						target.eSet(targetEFeature, idAsString);
					}
				} else {
					if (sourceEFeature.isMany()) {
						if (copyCollections) {
							for (Object value : (Collection<?>) source.eGet(sourceEFeature)) {
								((Collection<Object>) target.eGet(targetEFeature)).add(value);
							}
						}
					} else {
						target.eSet(targetEFeature, source.eGet(sourceEFeature));
					}
				}
			}
		}
	}

	/**
	 * Create a string which reflects the id of the entity.
	 */
	public String idToString(Session session, Object entity) {
		final String entityName = ((SessionImplementor) session).bestGuessEntityName(entity);
		final Serializable id = ForeignKeys.getEntityIdentifierIfNotUnsaved(entityName, entity,
				(SessionImplementor) session);
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
		auditReference.setEntityName(parts[0]);
		auditReference.setId(getId(parts[2], parts[1]));
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
			return (T) StoreUtil.stringToEClass(id);
		}
		return (T) StoreUtil.stringToStructureFeature(id);
	}

	/**
	 * Return the audit model element used to audit the passed in model element.
	 * 
	 * @see #setAuditingAssociation(EModelElement, EModelElement)
	 */
	@SuppressWarnings("unchecked")
	public <T extends EModelElement> T getAuditingModelElement(T modelElement) {
		final EAnnotation eAnnotation = modelElement
				.getEAnnotation(Constants.ANNOTATION_SOURCE_AUDITING);
		if (eAnnotation == null) {
			return null;
		}
		final String id = eAnnotation.getDetails().get(
				Constants.ANNOTATION_AUDITING_MODELELEMENT_AUDITING);
		if (id == null) {
			return null;
		}
		if (modelElement instanceof EClass) {
			return (T) StoreUtil.stringToEClass(id);
		}
		return (T) StoreUtil.stringToStructureFeature(id);
	}

	/**
	 * Returns true if the model element should not be audited.
	 */
	public <T extends EModelElement> boolean isNoAuditing(T modelElement) {
		final EAnnotation teneoAnnotation = modelElement
				.getEAnnotation(Constants.ANNOTATION_SOURCE_TENEO_JPA);
		if (teneoAnnotation == null) {
			return false;
		}

		for (String value : teneoAnnotation.getDetails().values()) {
			if (value != null
					&& (value.contains("@Transient") || value.contains(Constants.ANNOTATION_AUDITING_NOT))) {
				return true;
			}
		}

		if (modelElement instanceof EStructuralFeature) {
			final EStructuralFeature eStructuralFeature = (EStructuralFeature) modelElement;

			if (eStructuralFeature.isVolatile() || eStructuralFeature.isDerived()) {
				return true;
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
	public <T extends EModelElement> void setAuditingAssociation(T source, T auditing) {
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
			if (auditing instanceof EClass) {
				eAnnotation.getDetails().put(Constants.ANNOTATION_AUDITING_MODELELEMENT_AUDITING,
						StoreUtil.eClassToString((EClass) auditing));
			} else {
				eAnnotation.getDetails().put(Constants.ANNOTATION_AUDITING_MODELELEMENT_AUDITING,
						StoreUtil.structuralFeatureToString((EStructuralFeature) auditing));
			}
		}
	}

	/**
	 * Entry point for creating all auditing types needed to audit the sourceEPackage.
	 */
	public EPackage createAuditingEPackage(EPackage sourceEPackage, EPackage.Registry registry,
			PersistenceOptions po) {
		final EPackage eAuditingPackage = EcoreFactory.eINSTANCE.createEPackage();
		eAuditingPackage.setName(sourceEPackage.getName() + "-auditing");
		eAuditingPackage.setNsPrefix(sourceEPackage.getNsPrefix() + "-auditing");
		eAuditingPackage.setNsURI(sourceEPackage.getNsURI() + "/auditing");
		for (EClassifier eClassifier : sourceEPackage.getEClassifiers()) {
			if (eClassifier instanceof EClass) {
				if (isNoAuditing(eClassifier)) {
					continue;
				}

				final EClass eClass = (EClass) eClassifier;
				final EClass auditingEClass = EcoreFactory.eINSTANCE.createEClass();
				auditingEClass.setName(eClass.getName());
				auditingEClass.getESuperTypes().add(TeneoauditingPackage.eINSTANCE.getTeneoAuditObject());

				eAuditingPackage.getEClassifiers().add(auditingEClass);
				setAuditingAssociation(eClass, auditingEClass);

				if (eClass.getEAnnotation(Constants.ANNOTATION_SOURCE_TENEO_JPA_AUDITING) != null) {
					final EAnnotation teneoAnnotation = EcoreUtil.copy(eClass
							.getEAnnotation(Constants.ANNOTATION_SOURCE_TENEO_JPA));
					teneoAnnotation.setSource(Constants.ANNOTATION_SOURCE_TENEO_JPA);
					auditingEClass.getEAnnotations().add(teneoAnnotation);
				}

				// set the entity name
				setEntityNameAndNamedQuery(auditingEClass, po);

				for (EStructuralFeature eFeature : eClass.getEAllStructuralFeatures()) {
					if (isNoAuditing(eFeature)) {
						continue;
					}
					EAttribute eAttribute;
					if (eFeature instanceof EReference) {
						eAttribute = EcoreFactory.eINSTANCE.createEAttribute();
						eAttribute.setEType(XMLTypePackage.eINSTANCE.getString());
					} else {
						eAttribute = (EAttribute) EcoreUtil.copy(eFeature);
					}
					for (EAttribute eSAttribute : EcorePackage.eINSTANCE.getEStructuralFeature()
							.getEAllAttributes()) {
						if (eSAttribute.isDerived() || eSAttribute.isVolatile()) {
							continue;
						}
						if (eFeature.eIsSet(eSAttribute)) {
							eAttribute.eSet(eSAttribute, eFeature.eGet(eSAttribute));
						}
					}
					// never be an id
					eAttribute.setID(false);
					// remove later...
					eAttribute.setLowerBound(0);

					if (eFeature.getEAnnotation(Constants.ANNOTATION_SOURCE_TENEO_JPA_AUDITING) != null) {
						final EAnnotation teneoAnnotation = EcoreUtil.copy(eFeature
								.getEAnnotation(Constants.ANNOTATION_SOURCE_TENEO_JPA));
						teneoAnnotation.setSource(Constants.ANNOTATION_SOURCE_TENEO_JPA);
						eAttribute.getEAnnotations().add(teneoAnnotation);
					}

					auditingEClass.getEStructuralFeatures().add(eAttribute);
				}
			}
		}

		registry.put(eAuditingPackage.getNsURI(), eAuditingPackage);

		return eAuditingPackage;
	}

	/**
	 * Return the correct entity name using pre and postfix options.
	 * 
	 * @see PersistenceOptions#getAuditingEntityPostfix()
	 * @see PersistenceOptions#getAuditingEntityPrefix()
	 */
	public String getEntityName(EClass auditingEClass, PersistenceOptions po) {
		return po.getAuditingEntityPrefix() + auditingEClass.getName() + po.getAuditingEntityPostfix();
	}

	private void setEntityNameAndNamedQuery(EClass auditingEClass, PersistenceOptions po) {
		final String entityName = getEntityName(auditingEClass, po);
		final String entityNameJPA = "@Entity(name=\"" + entityName + "\")";
		final String namedQuery = "@NamedQuery(name=\"" + entityName + ".previousVersion\", "
				+ "	query=\"select e from " + entityName
				+ " e where teneo_object_id=:objectId and teneo_end=-1\")";
		if (auditingEClass.getEAnnotation(Constants.ANNOTATION_SOURCE_TENEO_JPA) != null) {
			final EAnnotation eAnnotation = auditingEClass
					.getEAnnotation(Constants.ANNOTATION_SOURCE_TENEO_JPA);
			boolean addEntity = true;
			String foundKey = null;
			String foundValue = null;
			for (String key : eAnnotation.getDetails().keySet()) {
				final String value = eAnnotation.getDetails().get(key);
				if (value.contains("@Entity")) {
					addEntity = false;
					eAnnotation.getDetails().put(key, value + "\n" + namedQuery);
				}
				if (key.equals(Constants.ANNOTATION_KEY_VALUE)
						|| key.equals(Constants.ANNOTATION_KEY_APPINFO)) {
					foundKey = key;
					foundValue = value;
				}
			}
			if (addEntity) {
				if (foundKey != null) {
					eAnnotation.getDetails().put(foundKey,
							foundValue + "\n" + entityNameJPA + "\n" + namedQuery);
				} else {
					eAnnotation.getDetails().put(Constants.ANNOTATION_KEY_VALUE,
							entityNameJPA + "\n" + namedQuery);
				}
			}
		} else {
			final EAnnotation eAnnotation = EcoreFactory.eINSTANCE.createEAnnotation();
			eAnnotation.setSource(Constants.ANNOTATION_SOURCE_TENEO_JPA);
			eAnnotation.getDetails().put(Constants.ANNOTATION_KEY_VALUE,
					entityNameJPA + "\n" + namedQuery);
			auditingEClass.getEAnnotations().add(eAnnotation);
		}
	}
}
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

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
import org.eclipse.emf.teneo.Constants;
import org.eclipse.emf.teneo.PersistenceOptions;
import org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing.TeneoauditingPackage;
import org.eclipse.emf.teneo.util.AssertUtil;
import org.eclipse.emf.teneo.util.StoreUtil;

/**
 * Creates the audit model(s) on the basis of a set of EPackages.
 * 
 * @author <a href="mailto:mkanaley@tibco.com">Mike Kanaley</a>
 */
public class AuditHandler {

	private static AuditHandler instance = new AuditHandler();

	public static AuditHandler getInstance() {
		return instance;
	}

	public static void setInstance(AuditHandler instance) {
		AuditHandler.instance = instance;
	}

	@SuppressWarnings("unchecked")
	public <T extends EModelElement> T getModelElement(T t) {
		final EAnnotation eAnnotation = t.getEAnnotation(Constants.ANNOTATION_SOURCE_AUDITING);
		if (eAnnotation == null) {
			return null;
		}
		final String id = eAnnotation.getDetails().get(Constants.ANNOTATION_AUDITING_MODELELEMENT);
		if (id == null) {
			return null;
		}
		if (t instanceof EClass) {
			return (T) StoreUtil.stringToEClass(id);
		}
		return (T) StoreUtil.stringToStructureFeature(id);
	}

	@SuppressWarnings("unchecked")
	public <T extends EModelElement> T getAuditingModelElement(T t) {
		final EAnnotation eAnnotation = t.getEAnnotation(Constants.ANNOTATION_SOURCE_AUDITING);
		if (eAnnotation == null) {
			return null;
		}
		final String id = eAnnotation.getDetails().get(
				Constants.ANNOTATION_AUDITING_MODELELEMENT_AUDITING);
		if (id == null) {
			return null;
		}
		if (t instanceof EClass) {
			return (T) StoreUtil.stringToEClass(id);
		}
		return (T) StoreUtil.stringToStructureFeature(id);
	}

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

	public <T extends EModelElement> void setAuditingAssociation(T source, T auditing) {
		AssertUtil.assertIsNull(getAuditingModelElement(source));
		AssertUtil.assertIsNull(getModelElement(auditing));

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
				setEntityName(auditingEClass, po);

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

	private void setEntityName(EClass auditingEClass, PersistenceOptions po) {
		final String entityNameJPA = "@Entity(name=\"" + po.getAuditingEntityPrefix()
				+ auditingEClass.getName() + po.getAuditingEntityPostfix() + "\")";
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
				}
				if (key.equals("value") || key.equals("appInfo")) {
					foundKey = key;
					foundValue = value;
				}
			}
			if (addEntity) {
				if (foundKey != null) {
					eAnnotation.getDetails().put(foundKey, foundValue + "\n" + entityNameJPA);
				} else {
					eAnnotation.getDetails().put("value", entityNameJPA);
				}
			}
		} else {
			final EAnnotation eAnnotation = EcoreFactory.eINSTANCE.createEAnnotation();
			eAnnotation.setSource(Constants.ANNOTATION_SOURCE_TENEO_JPA);
			eAnnotation.getDetails().put("value", entityNameJPA);
		}
	}
}
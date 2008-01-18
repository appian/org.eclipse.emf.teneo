/**
 * <copyright>
 *
 * Copyright (c) 2005, 2006, 2007 Springsite BV (The Netherlands) and others
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Martin Taal
 * </copyright>
 *
 * $Id: EClassFeatureMapper.java,v 1.12 2008/01/18 06:20:41 mtaal Exp $
 */

package org.eclipse.emf.teneo.jpox.mapper.property;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.teneo.annotations.mapper.StoreMappingException;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEAttribute;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEClass;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEReference;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEStructuralFeature;
import org.eclipse.emf.teneo.ecore.EModelResolver;
import org.eclipse.emf.teneo.extension.ExtensionPoint;
import org.eclipse.emf.teneo.jpox.mapper.AbstractMapper;
import org.eclipse.emf.teneo.simpledom.Element;

/**
 * Mapps the features of a passed annotated class, the class itself is not mapped here.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.12 $
 */

public class EClassFeatureMapper extends AbstractMapper implements ExtensionPoint {
	/** The logger for all these exceptions */
	protected static final Log log = LogFactory.getLog(EClassFeatureMapper.class);

	/** Process the id annotation */
	public void map(PAnnotatedEClass aClass, Element classElement) {
		log.debug("Processing aclass: " + aClass.getModelEClass().getName() + "/" + aClass.getModelElement().getName());

		final Class<?> implClass = EModelResolver.instance().getJavaClass(aClass.getModelEClass());

		// collect all the features to map
		final List<PAnnotatedEStructuralFeature> features =
				new ArrayList<PAnnotatedEStructuralFeature>(aClass.getPaEStructuralFeatures());
		final List<PAnnotatedEStructuralFeature> inheritedFeatures = mappingContext.getInheritedFeatures(aClass);
		features.addAll(inheritedFeatures);

		// now handle the structural features
		for (PAnnotatedEStructuralFeature aStructuralFeature : features) {

			// columns which are not updatable and not insertable must be transient
			boolean isTransient = aStructuralFeature.getTransient() != null;
			if (!isTransient && aStructuralFeature.getColumn() != null) {
				isTransient =
						isTransient ||
								(!aStructuralFeature.getColumn().isInsertable() && !aStructuralFeature.getColumn()
									.isUpdatable());
			}

			// ignore container references as these do not have a java repr.
			if (aStructuralFeature.getModelElement() instanceof EReference) {
				EReference eref = (EReference) aStructuralFeature.getModelElement();
				if (eref.isContainer()) {
					continue;
				}
			}

			// in jdo transient members should still be mapped
			if (isTransient && hasJavaMember(implClass, aStructuralFeature.getModelEStructuralFeature())) {
				Element field = classElement.addElement("field");
				field.addAttribute(
					"name",
					namingHandler
						.correctName(mappingContext, (EStructuralFeature) aStructuralFeature.getModelElement()))
					.addAttribute("persistence-modifier", "none");
				log.debug("TRANSIENT: " + aStructuralFeature.getModelElement().getName());
				continue;
			} else if (isTransient) {
				continue;
			}

			// TODO: move start and endMapping call to the mappers
			mappingContext.startMapping(aStructuralFeature);
			processPersistableMember(classElement, aStructuralFeature);
			mappingContext.endMapping(aStructuralFeature);
		}

		// then for each non structural feature add a persistence modifier none
		setNotPersistable(classElement, implClass, features);
//		
// // now also handle the case that the supertype of the eclass is an interface only
// // class, in this case the efeatures of the supertype are to be mapped here!
// for (int i = 0; i < aClass.getAnnotatedEClass().getESuperTypes().size(); i++) {
// final EClass ec = (EClass)aClass.getAnnotatedEClass().getESuperTypes().get(i);
// if (ec.isInterface()) {
// log.debug("SuperType is interface, also mapping it " + ec.getName());
// map(aClass.getPaModel().getPAnnotated(ec), classElement);
// }
// }
	}

	/** Sets persistence none for each non-model field */
	protected void setNotPersistable(Element classElement, Class<?> implClass,
			List<PAnnotatedEStructuralFeature> features) {
		Field[] fields = implClass.getFields();
		for (Field field : fields) {
			if (Modifier.isStatic(field.getModifiers())) {
				continue;
			}

			// todo: externalize
			if (field.getName().endsWith("ESet")) {
				continue; // special case, these are handled earlier
			}

			boolean esfField = false;
			for (PAnnotatedEStructuralFeature asf : features) {
				if (asf.getModelEStructuralFeature().getName().compareToIgnoreCase(field.getName()) == 0) {
					esfField = true;
					break;
				}
			}
			if (!esfField) {
				classElement.addElement("field").addAttribute("name", field.getName()).addAttribute(
					"persistence-modifier", "none");
			}
		}
	}

	/** Handles the annotated fields of a PAnnotatedEClass */
	protected void processPersistableMember(Element eclassElement, PAnnotatedEStructuralFeature aStructuralFeature) {

		if (aStructuralFeature instanceof PAnnotatedEAttribute) { // simple field
			PAnnotatedEAttribute aAttribute = (PAnnotatedEAttribute) aStructuralFeature;
			// do the primary key handling
			if (aAttribute.getId() != null) {
				mappingContext.getIdMapper().map(aAttribute, eclassElement);
			} else if (aAttribute.getOneToMany() != null) {
				mappingContext.getManyBasicMapper().map(aAttribute, eclassElement);
			} else if (aAttribute.getBasic() != null) {
				mappingContext.getBasicMapper().map(aAttribute, eclassElement);
			} else if (aAttribute.getVersion() != null) {
				// for jpox the version is an anonymous field which is not, versioning is done
				// through the version tag
				Element field = eclassElement.addElement("field");
				field.addAttribute(
					"name",
					namingHandler
						.correctName(mappingContext, (EStructuralFeature) aStructuralFeature.getModelElement()))
					.addAttribute("persistence-modifier", "none");
			}
		} else { // must be ereference
			PAnnotatedEReference aReference = (PAnnotatedEReference) aStructuralFeature; // cast
			// to
			// check
			if (aReference.getManyToMany() != null) {
				mappingContext.getManyToManyMapper().map(eclassElement, aReference);
			} else if (aReference.getOneToMany() != null) {
				mappingContext.getOneToManyMapper().map(aReference, eclassElement);
			} else if (aReference.getOneToOne() != null) {
				mappingContext.getOneToOneMapper().map(aReference, eclassElement);
			} else if (aReference.getManyToOne() != null) {
				mappingContext.getManyToOneMapper().map(aReference, eclassElement);
			} else {
				throw new StoreMappingException("No otm, mtm, mto, oto for ereference " +
						aReference.getModelElement().getName());
			}
		}
	}

	/** Checks if a certain feature has a java repr. with the same name */
	public boolean hasJavaMember(Class implClass, EStructuralFeature efeature) {
		String featureName = efeature.getName();
		Field[] fields = implClass.getDeclaredFields();
		for (Field element : fields) {
			log.debug(element.getName() + "-" + efeature.getName());
			if (element.getName().compareToIgnoreCase(featureName) == 0) {
				return true;
			}
		}
		return false;
	}

}
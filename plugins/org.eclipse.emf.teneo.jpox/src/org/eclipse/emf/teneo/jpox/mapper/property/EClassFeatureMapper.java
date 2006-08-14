/**
 * <copyright>
 *
 * Copyright (c) 2005, 2006 Springsite BV (The Netherlands) and others
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Martin Taal
 * </copyright>
 *
 * $Id: EClassFeatureMapper.java,v 1.2 2006/08/14 05:09:18 mtaal Exp $
 */

package org.eclipse.emf.teneo.jpox.mapper.property;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Iterator;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.teneo.simpledom.Element;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.teneo.ERuntime;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEAttribute;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEClass;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEReference;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEStructuralFeature;
import org.eclipse.emf.teneo.jpox.mapper.AbstractMapper;
import org.eclipse.emf.teneo.jpox.mapper.MappingContext;
import org.eclipse.emf.teneo.mapper.StoreMappingException;

/**
 * Mapps the features of a passed annotated class, the class itself is not mapped here.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.2 $
 */

public class EClassFeatureMapper extends AbstractMapper {
	/** The logger for all these exceptions */
	protected static final Log log = LogFactory.getLog(EClassFeatureMapper.class);

	/** Constructor */
	public EClassFeatureMapper(MappingContext mappingContext) {
		super(mappingContext);
	}

	/** Process the id annotation */
	public void map(PAnnotatedEClass aClass, Element classElement) {
		log.debug("Processing aclass: " + aClass.getAnnotatedEClass().getName() + "/" + aClass.getAnnotatedElement().getName());
		
		Class implClass = ERuntime.INSTANCE.getInstanceClass(aClass.getAnnotatedEClass());

		// now handle the structural features
		for (Iterator it = aClass.getPaEStructuralFeatures().iterator(); it.hasNext();) {
			PAnnotatedEStructuralFeature aStructuralFeature = (PAnnotatedEStructuralFeature) it.next();

			// columns which are not updatable and not insertable must be transient
			boolean isTransient = aStructuralFeature.getTransient() != null;
			if (!isTransient && aStructuralFeature.getColumn() != null) {
				isTransient = isTransient
						|| (!aStructuralFeature.getColumn().isInsertable() && !aStructuralFeature.getColumn().isUpdatable());
			}

			// ignore container references as these do not have a java repr.
			if (aStructuralFeature.getAnnotatedElement() instanceof EReference) {
				EReference eref = (EReference) aStructuralFeature.getAnnotatedElement();
				if (eref.isContainer()) continue;
			}

			// in jdo transient members should still be mapped
			if (isTransient && hasJavaMember(implClass, aStructuralFeature.getAnnotatedEStructuralFeature())) {
				Element field = classElement.addElement("field");
				field.addAttribute("name", namingHandler.correctName(mappingContext, (EStructuralFeature) aStructuralFeature.getAnnotatedElement()))
						.addAttribute("persistence-modifier", "none");
				log.debug("TRANSIENT: " + aStructuralFeature.getAnnotatedElement().getName());
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
		Field[] fields = implClass.getFields();
		for (int i = 0; i < fields.length; i++) {
			Field field = fields[i];
			if (Modifier.isStatic(field.getModifiers())) continue;

			if (field.getName().endsWith("ESet")) continue; // special case, these are handled earlier

			boolean esfField = false;
			for (Iterator esfIterator = aClass.getAnnotatedEClass().getEStructuralFeatures().iterator(); esfIterator.hasNext();) {
				EStructuralFeature esf = (EStructuralFeature) esfIterator.next();
				if (esf.getName().compareToIgnoreCase(field.getName()) == 0) {
					esfField = true;
					break;
				}
			}
			if (!esfField) {
				classElement.addElement("field").addAttribute("name", field.getName()).addAttribute("persistence-modifier", "none");
			}
		}
		
		// now also handle the case that the supertype of the eclass is an interface only
		// class, in this case the efeatures of the supertype are to be mapped here!
		for (int i = 0; i < aClass.getAnnotatedEClass().getESuperTypes().size(); i++) {
			final EClass ec = (EClass)aClass.getAnnotatedEClass().getESuperTypes().get(i);
			if (ec.isInterface()) {
				log.debug("SuperType is interface, also mapping it " + ec.getName());
				map(aClass.getPaModel().getPAnnotated(ec), classElement);
			}
		}
	}

	/** Handles the annotated fields of a PAnnotatedEClass */
	private void processPersistableMember(Element eclassElement, PAnnotatedEStructuralFeature aStructuralFeature) {

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
				// for jpox the version is an anonymous field which is not, versioning is done through the version tag
				Element field = eclassElement.addElement("field");
				field.addAttribute("name", namingHandler.correctName(mappingContext, (EStructuralFeature) aStructuralFeature.getAnnotatedElement()))
						.addAttribute("persistence-modifier", "none");
			}
		} else { // must be ereference
			PAnnotatedEReference aReference = (PAnnotatedEReference) aStructuralFeature; // cast to check
			if (aReference.getManyToMany() != null) {
				mappingContext.getManyToManyMapper().map(eclassElement, aReference);
			} else if (aReference.getOneToMany() != null) {
				mappingContext.getOneToManyMapper().map(aReference, eclassElement);
			} else if (aReference.getOneToOne() != null) {
				mappingContext.getOneToOneMapper().map(aReference, eclassElement);
			} else if (aReference.getManyToOne() != null) {
				mappingContext.getManyToOneMapper().map(aReference, eclassElement);
			} else {
				throw new StoreMappingException("No otm, mtm, mto, oto for ereference " + aReference.getAnnotatedElement().getName());
			}
		}
	}

	/** Checks if a certain feature has a java repr. with the same name */
	public boolean hasJavaMember(Class implClass, EStructuralFeature efeature) {
		String featureName = efeature.getName();
		Field[] fields = implClass.getDeclaredFields();
		for (int i = 0; i < fields.length; i++) {
			log.debug(fields[i].getName() + "-" + efeature.getName());
			if (fields[i].getName().compareToIgnoreCase(featureName) == 0) return true;
		}
		return false;
	}

}
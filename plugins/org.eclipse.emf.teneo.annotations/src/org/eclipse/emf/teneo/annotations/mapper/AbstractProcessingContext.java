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
 * $Id: AbstractProcessingContext.java,v 1.3.2.2 2007/03/21 16:10:13 mtaal Exp $
 */

package org.eclipse.emf.teneo.annotations.mapper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Stack;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEAttribute;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEClass;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEReference;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEStructuralFeature;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedModel;
import org.eclipse.emf.teneo.annotations.pannotation.AssociationOverride;
import org.eclipse.emf.teneo.annotations.pannotation.AttributeOverride;
import org.eclipse.emf.teneo.annotations.pannotation.Column;

/**
 * ProcessingContext which handles attributes overrides.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.3.2.2 $
 */

public class AbstractProcessingContext {

	/** The logger for all these exceptions */
	protected static final Log log = LogFactory.getLog(AbstractProcessingContext.class);

	/** The current list of overrides */
	private Map currentOverrides = new HashMap();

	/** Pushes the current overrides on the stack, to be popped later, this is to handle nested components */
	private Stack overrideStack = new Stack();

	/**
	 * Pushes the current embedding feature on the stack, to be popped later, this is to handle nested components and
	 * automatic renaming of props
	 */
	private Stack embeddingFeatureStack = new Stack();

	/** Add attribute overrides, happens for each mapped superclass and each embedded component */
	public void addAttributeOverrides(EList aos) {
		if (aos != null) {
			for (Iterator i = aos.iterator(); i.hasNext();) {
				AttributeOverride override = (AttributeOverride) i.next();
				currentOverrides.put(override.getName(), override.getColumn());
			}
		}
	}

	/** Add association overrides, for each mapped subclass */
	public void addAssociationOverrides(EList overrides) {
		if (overrides != null) {
			for (Iterator it = overrides.iterator(); it.hasNext();) {
				AssociationOverride override = (AssociationOverride) it.next();
				currentOverrides.put(override.getName(), override.getJoinColumns());
			}
		}
	}

	/** Pushes the current overrides on the stack, to be popped later, this is to handle nested components */
	public void pushOverrideOnStack() {
		overrideStack.push(new HashMap(currentOverrides));
	}

	/** Pop the current overrides on the stack */
	public void popOverrideStack() {
		currentOverrides = (HashMap) overrideStack.pop();
	}

	/** Pushes the current embedding feature on the stack */
	public void pushEmbeddingFeature(PAnnotatedEReference er) {
		embeddingFeatureStack.push(er);
	}

	/** Pops the current embedding feature from the stack */
	public void popEmbeddingFeature() {
		embeddingFeatureStack.pop();
	}

	/** Peeks for the current embedding feature */
	public PAnnotatedEReference getEmbeddingFeature() {
		if (embeddingFeatureStack.isEmpty())
			return null;
		return (PAnnotatedEReference) embeddingFeatureStack.peek();
	}

	/** Clear the override is done before an entity is processed */
	public void clearOverrides() {
		currentOverrides.clear();
	}

	/** Return the overridden column for the passed attribute */
	public Column getOverride(PAnnotatedEAttribute paAttribute) {
		return (Column) currentOverrides.get(paAttribute.getAnnotatedEAttribute().getName());
	}

	/** Return the overridden JoinColumns for this reference */
	public List getOverride(PAnnotatedEReference paReference) {
		return (List) currentOverrides.get(paReference.getAnnotatedEReference().getName());
	}
    
    /** Return the overridden Joincolumns for the indicated featureName */
    public Column getOverride(String featureName) {
        return (Column) currentOverrides.get(featureName);
    }

	/**
	 * This method returns all inherited features which need to be added to the
	 * mapping of the aclass itself. The method makes a distinction makes a
	 * distinction between the first supertype (the first one in the list) and
	 * later ones. The features of the first type are only added to the mapping
	 * if the first type is a mappedsuperclass, in all other cases the features
	 * of the first type are not mapped in the aclass itself because they are
	 * inherited (the mapping describes the inheritance relation). For the other
	 * supertypes (located at index 1 and up in getESuperTypes) the features are
	 * mapped as properties in the class itself.
	 */
	public List getInheritedFeatures(
			PAnnotatedEClass aClass) {
		// if no supertypes then there are no inherited features
		final EClass eclass = aClass.getAnnotatedEClass();
		if (eclass.getESuperTypes().size() == 0) {
			return new ArrayList();
		}
		log
				.debug("Determining inherited features which are mapped locally for "
						+ aClass.getAnnotatedEClass().getName());
		final List inheritedFeatures = new ArrayList(
				eclass.getEAllStructuralFeatures());

		// remove all the features of the eclass itself
		inheritedFeatures.removeAll(eclass.getEStructuralFeatures());

		// check if the type has a supertype (a non-transient, non-mappedsuperclass, if so then
		// remove all features inherited from the first supertype
		// as this inheritance is done in the mapping file
		if (aClass.getPaSuperEntity() != null) {
			inheritedFeatures.removeAll(aClass.getPaSuperEntity().getAnnotatedEClass()
					.getEAllStructuralFeatures());
		}

		// get all efeatures from direct mappedsuperclasses
		// the id feature inherited from a direct mappedsuperclass should be
		// maintained in other cases the id features are not mapped locally.
		// The system can also ignore this and let the user be more carefull not
		// to
		// add id features here and there in the inheritance structure but this
		// is
		// more robust
		removeIdFeatures(aClass, inheritedFeatures);

		// convert the result
		final PAnnotatedModel paModel = aClass.getPaModel();
		final ArrayList result = new ArrayList();
		for (Iterator it = inheritedFeatures.iterator(); it.hasNext();) {
			EStructuralFeature esf = (EStructuralFeature)it.next();
			result.add(paModel.getPAnnotated(esf));
		}
		
		return result;
	}

	/** Remove all id-features not inherited from a direct mapped superclass */
	private void removeIdFeatures(PAnnotatedEClass aClass,
			List inheritedFeatures) {
		// first get all the mapped superclasses
		final ArrayList mappedSuperEClasses = new ArrayList();
		for (Iterator it = aClass.getAnnotatedEClass().getESuperTypes().iterator(); it.hasNext();) {
			EClass superEClass = (EClass)it.next();
			final PAnnotatedEClass superPAClass = aClass.getPaModel()
					.getPAnnotated(superEClass);
			if (superPAClass != null
					&& superPAClass.getMappedSuperclass() != null) {
				mappedSuperEClasses.add(superPAClass.getAnnotatedEClass());
			}
		}

		// now get all the efeatures of the mappedsuperclasses to prevent any id
		// features from them being removed, only do that when the aclass does not 
		// have a real super type, in that case the id can be inherited from the
		// mappedsuperclass
		final ArrayList mappedSuperFeatures = new ArrayList();
		if (aClass.getPaSuperEntity() == null) {
			for (Iterator it = mappedSuperEClasses.iterator(); it.hasNext();) {
				final EClass mappedSuperEClass = (EClass)it.next();
				mappedSuperFeatures.removeAll(mappedSuperEClass
						.getEAllStructuralFeatures());
				mappedSuperFeatures.addAll(mappedSuperEClass
						.getEAllStructuralFeatures());
			}
		}

		// now remove all id features not coming from a direct mapped superclass
		final ArrayList toRemove = new ArrayList();
		for (Iterator it = inheritedFeatures.iterator(); it.hasNext();) {
			EStructuralFeature esf = (EStructuralFeature)it.next();
			final PAnnotatedEStructuralFeature pef = aClass.getPaModel()
					.getPAnnotated(esf);

			if (pef instanceof PAnnotatedEAttribute
					&& ((PAnnotatedEAttribute) pef).getId() != null
					&& !mappedSuperFeatures.contains(esf)) {
				toRemove.add(esf);
			}
		}
		inheritedFeatures.removeAll(toRemove);
	}

	/** Returns true if the eclass only has mappedsuperclasses without id annotated property */
	public boolean mustAddSyntheticID(PAnnotatedEClass entity) {
		if (entity.hasIdAnnotatedFeature()) {
			return false;
		}
		for (Iterator it = entity.getAnnotatedEClass().getEAllSuperTypes().iterator(); it.hasNext();) {
			final EClass superEClass = (EClass) it.next();
			PAnnotatedEClass superPAClass = entity.getPaModel().getPAnnotated(superEClass);
			if (superPAClass != null && superPAClass.getMappedSuperclass() == null) {
				return false;
			} else if (superPAClass != null && superPAClass.getMappedSuperclass() != null) {
				if (superPAClass.hasIdAnnotatedFeature()) {
					return false;
				}
			}
		}

		return true;
	}
}
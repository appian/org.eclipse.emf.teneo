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
 * $Id: AbstractProcessingContext.java,v 1.4 2007/02/08 23:12:35 mtaal Exp $
 */

package org.eclipse.emf.teneo.annotations.mapper;

import java.util.ArrayList;
import java.util.HashMap;
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
import org.eclipse.emf.teneo.annotations.pannotation.AssociationOverride;
import org.eclipse.emf.teneo.annotations.pannotation.AttributeOverride;
import org.eclipse.emf.teneo.annotations.pannotation.Column;
import org.eclipse.emf.teneo.annotations.pannotation.JoinColumn;

/**
 * ProcessingContext which handles attributes overrides.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.4 $
 */

public class AbstractProcessingContext {

	/** The logger for all these exceptions */
	protected static final Log log = LogFactory
			.getLog(AbstractProcessingContext.class);

	/** The current list of overrides */
	private Map<String, Object> currentOverrides = new HashMap<String, Object>();

	/**
	 * Pushes the current overrides on the stack, to be popped later, this is to
	 * handle nested components
	 */
	private Stack<Map<String, Object>> overrideStack = new Stack<Map<String, Object>>();

	/**
	 * Pushes the current embedding feature on the stack, to be popped later,
	 * this is to handle nested components and automatic renaming of props
	 */
	private Stack<PAnnotatedEReference> embeddingFeatureStack = new Stack<PAnnotatedEReference>();

	/**
	 * Add attribute overrides, happens for each mapped superclass and each
	 * embedded component
	 */
	public void addAttributeOverrides(EList<AttributeOverride> aos) {
		if (aos != null) {
			for (AttributeOverride override : aos) {
				currentOverrides.put(override.getName(), override.getColumn());
			}
		}
	}

	/** Add association overrides, for each mapped subclass */
	public void addAssociationOverrides(EList<AssociationOverride> overrides) {
		if (overrides != null) {
			for (AssociationOverride override : overrides) {
				currentOverrides.put(override.getName(), override
						.getJoinColumns());
			}
		}
	}

	/**
	 * Pushes the current overrides on the stack, to be popped later, this is to
	 * handle nested components
	 */
	public void pushOverrideOnStack() {
		overrideStack.push(new HashMap<String, Object>(currentOverrides));
	}

	/** Pop the current overrides on the stack */
	public void popOverrideStack() {
		currentOverrides = overrideStack.pop();
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
		return (Column) currentOverrides.get(paAttribute
				.getAnnotatedEAttribute().getName());
	}

	/** Return the overridden JoinColumns for this reference */
	@SuppressWarnings("unchecked")
	public EList<JoinColumn> getOverride(PAnnotatedEReference paReference) {
		return (EList<JoinColumn>) currentOverrides.get(paReference
				.getAnnotatedEReference().getName());
	}

	/** Return the overridden Joincolumns for the indicated featureName */
	public Column getOverride(String featureName) {
		return (Column) currentOverrides.get(featureName);
	}

	/**
	 * Returns the flattened list of all features of the supertypes for which
	 * the features should be added to the mapping of the passed eclass. This is
	 * required to (more-or-less) support multiple inheritance scenarios. In the
	 * case of multiple inheritance the first supertype is the 'real' mapped
	 * supertype, the other types are treated as mappedsuperclasses.
	 */
	public List<PAnnotatedEStructuralFeature> getMultipleInheritedFeatures(
			PAnnotatedEClass aClass) {
		// if one or less supertype then no multiple inheritance
		if (aClass.getAnnotatedEClass().getESuperTypes().size() <= 1) {
			return new ArrayList<PAnnotatedEStructuralFeature>();
		}

		log.debug("Determining synthetic mapped features for "
				+ aClass.getAnnotatedEClass().getName());
		final List<EStructuralFeature> mappedFeatures = new ArrayList<EStructuralFeature>(
				aClass.getAnnotatedEClass().getEAllStructuralFeatures());
		// remove all first inherited features
		mappedFeatures.removeAll(getFirstInheritedFeatures(aClass
				.getAnnotatedEClass(), new ArrayList<EStructuralFeature>()));

		// then remove all id features, these can not be used
		final ArrayList<PAnnotatedEStructuralFeature> toReturn = new ArrayList<PAnnotatedEStructuralFeature>();
		for (EStructuralFeature esf : mappedFeatures) {
			final PAnnotatedEStructuralFeature pef = aClass.getPaModel()
					.getPAnnotated(esf);
			if (!(pef instanceof PAnnotatedEAttribute)
					|| ((PAnnotatedEAttribute) pef).getId() == null) {
				toReturn.add(pef);
			}
		}
		return toReturn;
	}

	/**
	 * Returns the list of all features which are in the first inheritance
	 * structure
	 */
	private List<EStructuralFeature> getFirstInheritedFeatures(EClass eClass,
			List<EStructuralFeature> features) {
		features.addAll(eClass.getEStructuralFeatures());
		if (eClass.getESuperTypes().size() > 0) {
			return getFirstInheritedFeatures((EClass) eClass.getESuperTypes()
					.get(0), features);
		}
		return features;
	}

	/** Returns all mapped super classes */
	public List<PAnnotatedEClass> getMappedSuperClasses(PAnnotatedEClass entity) {
		final List<PAnnotatedEClass> result = new ArrayList<PAnnotatedEClass>();
		for (EClass superEClass : entity.getAnnotatedEClass().getESuperTypes()) {
			final PAnnotatedEClass superPAClass = entity.getPaModel()
					.getPAnnotated(superEClass);
			if (superPAClass != null
					&& superPAClass.getMappedSuperclass() != null) {
				result.add(superPAClass);
				// and add the mapped super classes of the mapped superclass
				// note that only the unbroken chain of mappedsuperclasses is
				// added to the result, if there
				// is a non-mappedsuperclass in the inheritance then it stops
				// there
				// issue also identified by Douglas Bitting
				result.addAll(getMappedSuperClasses(superPAClass));
			}
		}

		return result;
	}

	/**
	 * Returns true if the eclass only has mappedsuperclasses without id
	 * annotated property
	 */
	public boolean mustAddSyntheticID(PAnnotatedEClass entity) {
		if (entity.hasIdAnnotatedFeature()) {
			return false;
		}
		for (EClass superEClass : entity.getAnnotatedEClass()
				.getEAllSuperTypes()) {
			final PAnnotatedEClass superPAClass = entity.getPaModel()
					.getPAnnotated(superEClass);
			if (superPAClass != null
					&& superPAClass.getMappedSuperclass() == null) {
				return false;
			} else if (superPAClass != null
					&& superPAClass.getMappedSuperclass() != null) {
				if (superPAClass.hasIdAnnotatedFeature()) {
					return false;
				}
			}
		}

		return true;
	}
}
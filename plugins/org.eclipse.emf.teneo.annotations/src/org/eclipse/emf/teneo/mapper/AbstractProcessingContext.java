/*
 *	Copyright 2005-2006, Elver.org (http://www.eclipse.org/emf/teneo).
 *
 *	Licensed under the Apache License, Version 2.0 (the "License");
 *	you may not use this file except in compliance with the License.
 *	You may obtain a copy of the License at
 *
 *		http://www.apache.org/licenses/LICENSE-2.0
 *
 *	Unless required by applicable law or agreed to in writing, software
 *	distributed under the License is distributed on an "AS IS" BASIS,
 *	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *	See the License for the specific language governing permissions and
 *	limitations under the License.
 */

package org.eclipse.emf.teneo.mapper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Stack;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEAttribute;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEClass;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEReference;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEStructuralFeature;
import org.eclipse.emf.teneo.annotations.pannotation.AssociationOverride;
import org.eclipse.emf.teneo.annotations.pannotation.AssociationOverrides;
import org.eclipse.emf.teneo.annotations.pannotation.AttributeOverride;
import org.eclipse.emf.teneo.annotations.pannotation.AttributeOverrides;
import org.eclipse.emf.teneo.annotations.pannotation.Column;

/**
 * ProcessingContext which handles attributes overrides.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.2 $
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
	public void addOverrides(AttributeOverrides aos) {
		if (aos != null) {
			for (Iterator i = aos.getValue().iterator(); i.hasNext();) {
				AttributeOverride override = (AttributeOverride) i.next();
				currentOverrides.put(override.getName(), override.getColumn());
			}
		}
	}

	/** Add association overrides, for each mapped subclass */
	public void addOverrides(AssociationOverrides overrides) {
		if (overrides != null) {
			for (Iterator it = overrides.getValue().iterator(); it.hasNext();) {
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
		return (Column) currentOverrides.get(paAttribute.getAnnotatedEStructuralFeature().getName());
	}

	/** Return the overridden JoinColumns for this reference */
	public List getOverride(PAnnotatedEReference paReference) {
		return (List) currentOverrides.get(paReference.getAnnotatedEReference().getName());
	}

	/**
	 * Returns the flattened list of all features of the supertypes for which the features should be added to the
	 * mapping of the passed eclass. This is required to (more-or-less) support multiple inheritance scenarios. In the
	 * case of multiple inheritance the first supertype is the 'real' mapped supertype, the other types are treated as
	 * mappedsuperclasses.
	 */
	public List getMultipleInheritedFeatures(PAnnotatedEClass aClass) {
		log.debug("Determining synthetic mapped features for " + aClass.getAnnotatedEClass().getName());
		final List mappedFeatures = new ArrayList(aClass.getAnnotatedEClass().getEAllStructuralFeatures());
		// remove all first inherited features
		mappedFeatures.removeAll(getFirstInheritedFeatures(aClass.getAnnotatedEClass(), new ArrayList()));

		// then remove all id features, these can not be used
		final ArrayList toReturn = new ArrayList();
		for (Iterator it = mappedFeatures.iterator(); it.hasNext();) {
			final EStructuralFeature esf = (EStructuralFeature) it.next();
			final PAnnotatedEStructuralFeature pef = aClass.getPaModel().getPAnnotated(esf);
			if (!(pef instanceof PAnnotatedEAttribute) || ((PAnnotatedEAttribute) pef).getId() == null) {
				toReturn.add(pef);
			}
		}
		return toReturn;
	}

	/** Returns the list of all features which are in the first inheritance structure */
	private List getFirstInheritedFeatures(EClass eClass, List features) {
		features.addAll(eClass.getEStructuralFeatures());
		if (eClass.getESuperTypes().size() > 0) {
			return getFirstInheritedFeatures((EClass) eClass.getESuperTypes().get(0), features);
		}
		return features;
	}

	/** Returns all mapped super classes */
	public List getMappedSuperClasses(PAnnotatedEClass entity) {
		final List result = new ArrayList();
		for (Iterator it = entity.getAnnotatedEClass().getESuperTypes().iterator(); it.hasNext();) {
			final EClass superEClass = (EClass) it.next();
			PAnnotatedEClass superPAClass = entity.getPaModel().getPAnnotated(superEClass);
			if (superPAClass != null && superPAClass.getMappedSuperclass() != null) {
				result.add(superPAClass);
				// and add the mapped super classes of the mapped superclass
				// note that only the unbroken chain of mappedsuperclasses is added to the result, if there
				// is a non-mappedsuperclass in the inheritance then it stops there
				// issue also identified by Douglas Bitting
				result.addAll(getMappedSuperClasses(superPAClass));
			}
		}

		return result;
	}
}
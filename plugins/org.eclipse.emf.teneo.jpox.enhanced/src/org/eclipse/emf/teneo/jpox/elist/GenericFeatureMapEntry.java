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
 * $Id: GenericFeatureMapEntry.java,v 1.2 2007/02/01 12:35:15 mtaal Exp $
 */

package org.eclipse.emf.teneo.jpox.elist;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.teneo.type.FeatureMapEntry;
import org.eclipse.emf.teneo.util.StoreUtil;

/**
 * Concrete implementation of generic feature map entry.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.2 $
 */

public class GenericFeatureMapEntry extends FeatureMapEntry {
	
	/** The logger */
//	private static Log log = LogFactory.getLog(GenericFeatureMapEntry.class);

	/** Field contains the path identifying the store feature */
	private String featurePath;

	/** The main types separated in separate local values to help jpox to use the correct column types. */
	private Object localAnyValue;

	private String localStringValue;

	/**
	 * The local reference value is always an EObject, but type object is required to force jpox to use its own
	 * reference mapping NOTE: this member name is used in the JPOXEmfDataStore
	 */
	private Object localReferenceValue;

	/**
	 * The local reference value is always an EObject, but type object is required to force jpox to use its own
	 * reference mapping NOTE: this member name is used in the JPOXEmfDataStore
	 */
	private Object localContainmentReferenceValue;

	/* Constructor */
	public GenericFeatureMapEntry() {
	}

	/* Constructor */
	public GenericFeatureMapEntry(EStructuralFeature feature, Object value) {
		super(feature, value);
	}
 
	/** Create copy with same feature and different value */
	public Internal createEntry(Object value) {
		return new GenericFeatureMapEntry(getEStructuralFeature(), value);
	}

	/** Returns the unique string by which the featureid is stored in the db */
	protected String getStructuralFeatureDBID() {
		return featurePath;
	}

	/* Sets the value from the db specific values, is done already at initialization time */
	protected Object getValueFromSpecificImplementation(EStructuralFeature eFeature) {
		if (eFeature instanceof EReference && ((EReference) eFeature).isContainment()) {
			return localContainmentReferenceValue;
		} else if (eFeature instanceof EReference) {
			return localReferenceValue;
		}

		Class instanceClass = eFeature.getEType().getInstanceClass();

		if (String.class.isAssignableFrom(instanceClass)) {
			return localStringValue;
		}
		return localAnyValue;
	}

	/** Implementation does nothing here */
	public void initializeSpecificImplementation() {
		featurePath = StoreUtil.structuralFeatureToString(getEStructuralFeature());
		Object val = getValue();
		if (val instanceof EObject) {
			EReference eref = (EReference) getEStructuralFeature();
			if (eref.isContainment()) {
				localContainmentReferenceValue = val;
			} else {
				localReferenceValue = val;
			}
		} else if (val instanceof String) {
			localStringValue = (String) val;
		} else {
			localAnyValue = val;
		}
	}
}
/**
 * <copyright>
 *
 * Copyright (c) 2009 Springsite BV (The Netherlands) and others
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Martin Taal - Initial API and implementation
 *
 * </copyright>
 *
 * $Id: EStructuralFeatureValueHolder.java,v 1.1 2009/08/19 16:17:47 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.mapping.eav;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * The EStructuralFeatureValueHolder is used to store estructuralfeature values of an EObject in one large list. The
 * elements in the list are the EStructuralValueHolders.
 * 
 * It holds both single valued efeatures as multi-valued. Multi-valued efeatures are flattened into the list, the value
 * holder has an index field to keep the index of the original list-entry.
 * 
 * The value holder also supports feature maps through the fmEntryFeature.
 * 
 * @author <a href="mtaal@elver.org">Martin Taal</a>
 */

// NOTES:
// the container reference is stored in the eobject itself!

public class EStructuralFeatureValueHolder {

	private EObject owner;
	private long id;
	private long version;
	private String stringValue;
	private Date dateValue;
	private BigDecimal numericValue;
	private long longValue;
	private String valueAsString;
	private EObject referenceValue;
	private EObject containedReferenceValue;
	private int index = -1;
	private EStructuralFeature eStructuralFeature;
	private EStructuralFeature fmEntryFeature;
	private Object objectValue;

	public void set(EStructuralFeature eFeature, Object value, int listIndex) {
		set(eFeature, value, listIndex, true);
	}

	public void set(EStructuralFeature eFeature, Object value, int listIndex, boolean nullifyCurrentData) {

		// nullify old data
		if (nullifyCurrentData) {
			stringValue = null;
			dateValue = null;
			numericValue = null;
			longValue = 0;
			valueAsString = null;
			referenceValue = null;
			containedReferenceValue = null;
			index = -1;
			eStructuralFeature = null;
			fmEntryFeature = null;
			objectValue = null;
		}

		if (value instanceof FeatureMap.Entry) {
			fmEntryFeature = eFeature;
			final FeatureMap.Entry fmEntry = (FeatureMap.Entry) value;
			set(fmEntry.getEStructuralFeature(), fmEntry.getValue(), listIndex, false);
			return;
		}

		index = listIndex;
		eStructuralFeature = eFeature;
		objectValue = value;

		// do type specific handling
		if (eFeature instanceof EReference) {
			if (((EReference) eFeature).isContainment()) {
				containedReferenceValue = (EObject) value;
			} else {
				referenceValue = (EObject) value;
			}
		} else {

			final EDataType eDataType = (EDataType) eFeature.getEType();
			if (value != null) {
				final EFactory eFactory = eDataType.getEPackage().getEFactoryInstance();
				valueAsString = eFactory.convertToString(eDataType, value);
			}

			if (value instanceof String) {
				stringValue = (String) value;
			} else if (value instanceof Date) {
				dateValue = (Date) value;
			} else if (value instanceof Number) {
				if (value instanceof BigDecimal) {
					numericValue = (BigDecimal) value;
				} else if (value instanceof BigInteger) {
					longValue = ((BigInteger) value).longValue();
				} else if (value instanceof Double || value instanceof Float) {
					numericValue = new BigDecimal(((Number) value).doubleValue());
				} else if (value instanceof Integer || value instanceof Long || value instanceof Short
						|| value instanceof Byte) {
					longValue = ((Number) value).longValue();
				} else {
					throw new UnsupportedOperationException("Primitive type " + value.getClass()
							+ " not supported here.");
				}
			}
		}

	}

	public void setValue(EObject target) {

		if (index < 0) {
			setSingleValue(target);
		} else if (fmEntryFeature != null) {
			setFeatureMapValue(target);
		} else if (eStructuralFeature instanceof EAttribute) {
			setMultiEAttributeValue(target);
		} else if (eStructuralFeature instanceof EReference) {
			setMultiEReferenceValue(target);
		} else {
			throw new IllegalStateException("Not supported");
		}
	}

	private void setMultiEReferenceValue(EObject target) {
	}

	private void setMultiEAttributeValue(EObject target) {
	}

	private void setFeatureMapValue(EObject target) {
	}

	private void setSingleValue(EObject target) {
		// a single value
		final Object curValue = target.eGet(eStructuralFeature);
		if (eStructuralFeature instanceof EAttribute) {
			if (objectValue == null && valueAsString != null) {
				final EDataType eDataType = (EDataType) eStructuralFeature.getEType();
				final EFactory eFactory = eDataType.getEPackage().getEFactoryInstance();
				objectValue = eFactory.createFromString(eDataType, valueAsString);
			}
			target.eSet(eStructuralFeature, objectValue);
		} else {
			final EReference eReference = (EReference) eStructuralFeature;
			final boolean isBidirectional = eReference.getEOpposite() != null
					&& !eReference.getEOpposite().isTransient();
			if (isBidirectional) {
				if (referenceValue != curValue) {
					int featureId = target.eClass().getFeatureID(eStructuralFeature);
					if (referenceValue == null) { // remove
						final NotificationChain nots = ((InternalEObject) target).eInverseRemove(
								(InternalEObject) curValue, featureId, eReference.getEType().getInstanceClass(), null);
						if (nots != null) {
							nots.dispatch();
						}
					} else {
						final NotificationChain nots = ((InternalEObject) target).eInverseAdd(
								(InternalEObject) referenceValue, featureId, eReference.getEType().getInstanceClass(),
								null);
						if (nots != null) {
							nots.dispatch();
						}
					}
				}
			} else {
				target.eSet(eStructuralFeature, referenceValue);
			}
		}
	}

	public String getStringValue() {
		return stringValue;
	}

	public void setStringValue(String stringValue) {
		this.stringValue = stringValue;
	}

	public Date getDateValue() {
		return dateValue;
	}

	public void setDateValue(Date dateValue) {
		this.dateValue = dateValue;
	}

	public BigDecimal getNumericValue() {
		return numericValue;
	}

	public void setNumericValue(BigDecimal numericValue) {
		this.numericValue = numericValue;
	}

	public long getLongValue() {
		return longValue;
	}

	public void setLongValue(long longValue) {
		this.longValue = longValue;
	}

	public String getValueAsString() {
		return valueAsString;
	}

	public void setValueAsString(String valueAsString) {
		this.valueAsString = valueAsString;
	}

	public EObject getReferenceValue() {
		return referenceValue;
	}

	public void setReferenceValue(EObject referenceValue) {
		this.referenceValue = referenceValue;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public EStructuralFeature geteStructuralFeature() {
		return eStructuralFeature;
	}

	public void seteStructuralFeature(EStructuralFeature eStructuralFeature) {
		this.eStructuralFeature = eStructuralFeature;
	}

	public EStructuralFeature getFmEntryFeature() {
		return fmEntryFeature;
	}

	public void setFmEntryFeature(EStructuralFeature fmEntryFeature) {
		this.fmEntryFeature = fmEntryFeature;
	}

	public EObject getOwner() {
		return owner;
	}

	public void setOwner(EObject owner) {
		this.owner = owner;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getVersion() {
		return version;
	}

	public void setVersion(long version) {
		this.version = version;
	}
}
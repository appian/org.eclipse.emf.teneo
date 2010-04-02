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
 * $Id: EAVSingleEAttributeValueHolder.java,v 1.9 2010/04/02 15:24:10 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.mapping.eav;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.util.Date;

import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEAttribute;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEDataType;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEStructuralFeature;
import org.eclipse.emf.teneo.annotations.pannotation.FetchType;
import org.eclipse.emf.teneo.hibernate.HbDataStore;

/**
 * This class holds a single EAttribute value.
 * 
 * @author <a href="mtaal@elver.org">Martin Taal</a>
 */
public class EAVSingleEAttributeValueHolder extends EAVValueHolder {

	private static final int MAX_PRECISION = 38;

	private String type;
	private String typeNeutralValue;
	private String stringValue;
	private Date dateValue;
	private BigDecimal numericValue;
	private double doubleValue;
	private long longValue;
	private Object objectValue;
	private EAVBlobValue blobValue;
	private EAVTextValue textValue;

	public void set(Object value) {

		// nullify old data
		stringValue = null;
		dateValue = null;
		numericValue = null;
		longValue = 0;
		setValueIsSet(false);
		setMandatoryValue(null);

		objectValue = value;

		// stop here as everything has been nullified anyway
		if (value == null) {
			return;
		}

		// value is not null, set the mandatory trigger
		setMandatoryValue(NOT_NULL_VALUE);

		// do type specific handling
		final boolean isBlob = value instanceof byte[]
				|| (value instanceof String && isClob(getEStructuralFeature()));
		final EDataType eDataType = (EDataType) getEStructuralFeature()
				.getEType();
		final EFactory eFactory = eDataType.getEPackage().getEFactoryInstance();
		if (!isBlob) {
			typeNeutralValue = eFactory.convertToString(eDataType, value);
		}
		type = value.getClass().getName();

		if (value instanceof byte[]) {
			blobValue = new EAVBlobValue();
			blobValue.setBlobValue((byte[]) value);
			blobValue.setValueHolder(this);
		} else if (value instanceof Enumerator) {
			stringValue = ((Enumerator) value).getName();
		} else if (value instanceof String && isBlob) {
			textValue = new EAVTextValue();
			textValue.setTextValue((String) value);
			textValue.setValueHolder(this);
		} else if (value instanceof String) {
			stringValue = (String) value;
		} else if (value instanceof Date) {
			dateValue = (Date) value;
		} else if (value instanceof Number) {
			if (value instanceof BigDecimal) {
				final BigDecimal bdValue = (BigDecimal) value;
				if (bdValue.precision() > MAX_PRECISION) {
					final MathContext mathContext = new MathContext(
							MAX_PRECISION);
					numericValue = bdValue.round(mathContext);
				} else {
					numericValue = bdValue;
				}
			} else if (value instanceof BigInteger) {
				longValue = ((BigInteger) value).longValue();
			} else if (value instanceof Double || value instanceof Float) {
				doubleValue = ((Number) value).doubleValue();
			} else if (value instanceof Integer || value instanceof Long
					|| value instanceof Short || value instanceof Byte) {
				longValue = ((Number) value).longValue();
			} else {
				throw new UnsupportedOperationException("Primitive type "
						+ value.getClass() + " not supported here.");
			}
		}
	}

	public Object get(InternalEObject owner) {
		if (objectValue == null && blobValue != null) {
			objectValue = blobValue.getBlobValue();
		} else if (objectValue == null && textValue != null) {
			objectValue = textValue.getTextValue();
		} else if (objectValue == null && typeNeutralValue != null) {
			final EDataType eDataType = (EDataType) getEStructuralFeature()
					.getEType();
			final EFactory eFactory = eDataType.getEPackage()
					.getEFactoryInstance();
			objectValue = eFactory
					.createFromString(eDataType, typeNeutralValue);
		}

		return objectValue;
	}

	public Object getValue() {
		return get(null);
	}

	public void setValueInOwner(InternalEObject owner) {
		if (getEStructuralFeature().isUnsettable() && !isValueIsSet()) {
			owner.eUnset(getEStructuralFeature());
		} else {
			owner.eSet(getEStructuralFeature(), get(owner));
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getTypeNeutralValue() {
		return typeNeutralValue;
	}

	public void setTypeNeutralValue(String typeNeutralValue) {
		this.typeNeutralValue = typeNeutralValue;
	}

	public EAVBlobValue getBlobValue() {
		return blobValue;
	}

	public void setBlobValue(EAVBlobValue blobValue) {
		this.blobValue = blobValue;
	}

	public EAVTextValue getTextValue() {
		return textValue;
	}

	public void setTextValue(EAVTextValue textValue) {
		this.textValue = textValue;
	}

	private boolean isClob(EStructuralFeature eFeature) {
		final EAttribute eAttribute = (EAttribute) eFeature;
		try {
			final PAnnotatedEAttribute paEAttribute = getHbDataStore()
					.getPaModel().getPAnnotated(eAttribute);
			if (paEAttribute == null) {
				return false;
			}
			if (paEAttribute.getLob() != null) {
				return true;
			}
			final PAnnotatedEDataType paDataType = getHbDataStore()
					.getPaModel().getPAnnotated(eAttribute.getEAttributeType());
			if (paDataType == null) {
				return false;
			}
			return paDataType.getLob() != null;
		} catch (IllegalArgumentException e) {
			// no problem, happens in some cases with featuremaps
			return false;
		}
	}

	protected static boolean isFeatureExtraLazy(HbDataStore hbDataStore,
			EStructuralFeature eFeature) {
		if (hbDataStore.getPersistenceOptions().isFetchAssociationExtraLazy()) {
			return true;
		}
		final PAnnotatedEStructuralFeature paFeature = hbDataStore.getPaModel()
				.getPAnnotated(eFeature);
		if (paFeature.getOneToMany() != null
				&& paFeature.getOneToMany().getFetch().equals(FetchType.EXTRA)) {
			return Boolean.TRUE;
		}
		return false;
	}

	public double getDoubleValue() {
		return doubleValue;
	}

	public void setDoubleValue(double doubleValue) {
		this.doubleValue = doubleValue;
	}
}
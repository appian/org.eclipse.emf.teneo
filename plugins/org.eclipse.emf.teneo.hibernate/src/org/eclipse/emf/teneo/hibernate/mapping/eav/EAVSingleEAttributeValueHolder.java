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
 * $Id: EAVSingleEAttributeValueHolder.java,v 1.3 2009/08/22 00:09:53 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.mapping.eav;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * This class holds a single EAttribute value.
 * 
 * @author <a href="mtaal@elver.org">Martin Taal</a>
 */
public class EAVSingleEAttributeValueHolder extends EAVValueHolder {

	private String stringValue;
	private Date dateValue;
	private BigDecimal numericValue;
	private long longValue;
	private Object objectValue;

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
		final EDataType eDataType = (EDataType) getEStructuralFeature().getEType();
		if (value != null) {
			final EFactory eFactory = eDataType.getEPackage().getEFactoryInstance();
			stringValue = eFactory.convertToString(eDataType, value);
		}

		if (value instanceof Enumerator) {
			stringValue = ((Enumerator) value).getName();
		} else if (value instanceof String) {
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
				throw new UnsupportedOperationException("Primitive type " + value.getClass() + " not supported here.");
			}
		}
	}

	public Object get(InternalEObject owner) {
		if (objectValue == null && stringValue != null) {
			final EDataType eDataType = (EDataType) getEStructuralFeature().getEType();
			final EFactory eFactory = eDataType.getEPackage().getEFactoryInstance();
			objectValue = eFactory.createFromString(eDataType, stringValue);
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
}
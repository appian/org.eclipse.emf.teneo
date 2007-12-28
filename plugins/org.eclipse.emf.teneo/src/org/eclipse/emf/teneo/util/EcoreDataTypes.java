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
 *   Davide Marchignoli
 *   Brian Vetter (bugzilla 175909)
 *   Alexandros Karypidis (bugzilla 207799)
 * </copyright>
 *
 * $Id: EcoreDataTypes.java,v 1.7 2007/12/28 14:36:28 mtaal Exp $
 */

package org.eclipse.emf.teneo.util;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
import org.eclipse.emf.teneo.TeneoException;

/**
 * Utility class to classify Ecore datatypes.
 * 
 * @author <a href="mailto:marchign at elver.org">Davide Marchignoli</a>
 */
public class EcoreDataTypes {

	// The xml types
	private static XMLTypePackage xmlTypePackage = XMLTypePackage.eINSTANCE;
	private static EDataType xmlDateEDataType = xmlTypePackage.getDate();
	private static EDataType xmlDateTimeEDataType = xmlTypePackage.getDateTime();

	// XML datatype factory instance
	private final DatatypeFactory dataTypeFactory;

	private static final List<EDataType> PRIMITIVES_ETYPES_LIST =
			Collections.unmodifiableList(Arrays.asList(new EDataType[] { EcorePackage.eINSTANCE.getEBoolean(),
					EcorePackage.eINSTANCE.getEByte(), EcorePackage.eINSTANCE.getEChar(),
					EcorePackage.eINSTANCE.getEDouble(), EcorePackage.eINSTANCE.getEFloat(),
					EcorePackage.eINSTANCE.getEInt(), EcorePackage.eINSTANCE.getELong(),
					EcorePackage.eINSTANCE.getEShort(), }));

	private static final List<EDataType> WRAPPERS_ETYPES_LIST =
			Collections.unmodifiableList(Arrays.asList(new EDataType[] { EcorePackage.eINSTANCE.getEBooleanObject(),
					EcorePackage.eINSTANCE.getEByteObject(), EcorePackage.eINSTANCE.getECharacterObject(),
					EcorePackage.eINSTANCE.getEDoubleObject(), EcorePackage.eINSTANCE.getEFloatObject(),
					EcorePackage.eINSTANCE.getEIntegerObject(), EcorePackage.eINSTANCE.getELongObject(),
					EcorePackage.eINSTANCE.getEShortObject(), }));

	public static EcoreDataTypes INSTANCE = new EcoreDataTypes();

	private EcoreDataTypes() {
		try {
			dataTypeFactory = DatatypeFactory.newInstance();
		} catch (DatatypeConfigurationException e) {
			throw new TeneoException("Exception ", e);
		}
	}

	// TODO: Make all utility methods static.

	/** Return a XMLGregorianCalendar on the basis of the date */
	public XMLGregorianCalendar getXMLGregorianCalendar(Date date) {
		final XMLGregorianCalendar gregCalendar = dataTypeFactory.newXMLGregorianCalendar();
		final Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		gregCalendar.setYear(calendar.get(Calendar.YEAR));
		gregCalendar.setMonth(calendar.get(Calendar.MONTH) + 1); // note the correction with 1
		gregCalendar.setDay(calendar.get(Calendar.DAY_OF_MONTH));
		return gregCalendar;
	}

	/** Return a XMLGregorianCalendar on datetime level (milliseconds) */
	public XMLGregorianCalendar getXMLGregorianCalendarDateTime(Date date) {
		final XMLGregorianCalendar gregCalendar = dataTypeFactory.newXMLGregorianCalendar();
		final Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		gregCalendar.setYear(calendar.get(Calendar.YEAR));
		gregCalendar.setMonth(calendar.get(Calendar.MONTH) + 1); // correct with 1 on purpose
		gregCalendar.setDay(calendar.get(Calendar.DAY_OF_MONTH));
		gregCalendar.setHour(calendar.get(Calendar.HOUR_OF_DAY));
		gregCalendar.setMinute(calendar.get(Calendar.MINUTE));
		gregCalendar.setSecond(calendar.get(Calendar.SECOND));
		gregCalendar.setMillisecond(calendar.get(Calendar.MILLISECOND));
		return gregCalendar;
	}

	/**
	 * @return Returns an immutable list of the Ecore EDataType for java primitives.
	 */
	public List<EDataType> getEPrimitives() {
		return PRIMITIVES_ETYPES_LIST;
	}

	/**
	 * @return Returns true if and only if the the given eDataType is the Ecore EDataType for a
	 *         primitive type.
	 */
	public boolean isEPrimitive(EDataType eDataType) {
		return (eDataType != null) && (eDataType.getInstanceClass() != null) &&
				(eDataType.getInstanceClass().isPrimitive());
	}

	/**
	 * @return Returns an immutable list of the Ecore EDataType for java primitive wrapper classes.
	 */
	public List<EDataType> getEWrappers() {
		return WRAPPERS_ETYPES_LIST;
	}

	/**
	 * @return Returns true if and only if the the given eDataType is the Ecore EDataType for a
	 *         primitive wrapper class.
	 */
	public boolean isEWrapper(EDataType eDataType) {
		return WRAPPERS_ETYPES_LIST.contains(eDataType);
	}

	/**
	 * @return true if and only if the given dataType is a string datatype.
	 */
	public boolean isEString(EDataType eDataType) {
		// should be eDataType == EString but does not work due to XML type
		// implementations
		return String.class == eDataType.getInstanceClass();
	}

	/**
	 * - *
	 * 
	 * @return true if and only if the given dataType is a date datatype.
	 */
	public boolean isEDate(EDataType eDataType) {
		if (eDataType.equals(xmlDateEDataType)) {
			return true;
		}
		/*
		 * There is some ambiguity around the Java Date class since it can also hold time - a
		 * conflict with the DateTime class
		 */
		Class<?> ic = eDataType.getInstanceClass();
		// do a string comparison to prevent another dependency for this teneo library.
		if (eDataType.getInstanceClassName() != null &&
				eDataType.getInstanceClassName().compareTo("javax.xml.datatype.XMLGregorianCalendar") == 0) {
			return true;
		}
		return java.util.Date.class == ic || java.util.Calendar.class == ic || java.sql.Date.class == ic;
	}

	/**
	 * @return true if and only if the given dataType is a datetime/timestamp datatype.
	 */
	public boolean isEDateTime(EDataType eDataType) {
		if (eDataType.equals(xmlDateTimeEDataType)) {
			return true;
		}
		/*
		 * the InstanceClass for date type can be "Object" for XSD types. I'm not sure about ecore
		 * itself so I have kept the original check against the java classes.
		 */
		Class<?> ic = eDataType.getInstanceClass();
		if (ic == Object.class) {
			// could be an XML date type
			return eDataType.equals(xmlDateTimeEDataType);
		}
		return java.sql.Timestamp.class == ic;
	}

	/**
	 * @return Returns true if and only if the given type is either a primitive or a wrapper or
	 *         string or a date.
	 */
	public boolean isSimpleType(EDataType eType) {
		// TODO move elsewhere
		return isEPrimitive(eType) || isEWrapper(eType) || isEString(eType) || isEDate(eType);
	}

	/**
	 * EJB3-SPEC 9.1.16
	 * 
	 * @return Returns true if the given eDataType is a Basic type
	 */
	public boolean isBasicType(EDataType eDataType) {
		// TODO consider also BigInteger, BigDecimal, java.util.Calendar,
		// java.sql.Date
		// java.sql.Time, java.sql.Timestamp, byte[], Byte[], char[],
		// Character[]
		// and any other type that implements Serializable
		return isSimpleType(eDataType) || isEnum(eDataType);
	}

	/**
	 * @return Returns true if the given EDataType is an Ecore enumerated type.
	 */
	public boolean isEnum(EClassifier eClassifier) {
		return (eClassifier instanceof EEnum);
	}

	/**
	 * @return true if the eType is a byte array.
	 */
	public boolean isByteArray(EDataType eType) {
		final Class<?> clazz = eType.getInstanceClass();
		if (clazz != null) {
			return (clazz.isArray() && clazz.getComponentType().equals(Byte.TYPE));
		} else {
			return false;
		}
	}
}

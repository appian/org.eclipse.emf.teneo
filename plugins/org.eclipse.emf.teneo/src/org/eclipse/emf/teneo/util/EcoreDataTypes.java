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
 *   Brian Vetter
 * </copyright>
 *
 * $Id: EcoreDataTypes.java,v 1.4 2007/03/04 21:18:33 mtaal Exp $
 */

package org.eclipse.emf.teneo.util;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

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
	
	private static final List<EDataType> PRIMITIVES_ETYPES_LIST = Collections
			.unmodifiableList(Arrays.asList(new EDataType[] {
					EcorePackage.eINSTANCE.getEBoolean(),
					EcorePackage.eINSTANCE.getEByte(),
					EcorePackage.eINSTANCE.getEChar(),
					EcorePackage.eINSTANCE.getEDouble(),
					EcorePackage.eINSTANCE.getEFloat(),
					EcorePackage.eINSTANCE.getEInt(),
					EcorePackage.eINSTANCE.getELong(),
					EcorePackage.eINSTANCE.getEShort(), }));

	private static final List<EDataType> WRAPPERS_ETYPES_LIST = Collections
			.unmodifiableList(Arrays.asList(new EDataType[] {
					EcorePackage.eINSTANCE.getEBooleanObject(),
					EcorePackage.eINSTANCE.getEByteObject(),
					EcorePackage.eINSTANCE.getECharacterObject(),
					EcorePackage.eINSTANCE.getEDoubleObject(),
					EcorePackage.eINSTANCE.getEFloatObject(),
					EcorePackage.eINSTANCE.getEIntegerObject(),
					EcorePackage.eINSTANCE.getELongObject(),
					EcorePackage.eINSTANCE.getEShortObject(), }));

	public static EcoreDataTypes INSTANCE = new EcoreDataTypes();

	private EcoreDataTypes() {
	}

	// TODO: Make all utility methods static.

	/**
	 * @return Returns an immutable list of the Ecore EDataType for java
	 *         primitives.
	 */
	public List<EDataType> getEPrimitives() {
		return PRIMITIVES_ETYPES_LIST;
	}

	/**
	 * @return Returns true if and only if the the given eDataType is the Ecore
	 *         EDataType for a primitive type.
	 */
	public boolean isEPrimitive(EDataType eDataType) {
		return (eDataType != null) && (eDataType.getInstanceClass() != null)
				&& (eDataType.getInstanceClass().isPrimitive());
	}

	/**
	 * @return Returns an immutable list of the Ecore EDataType for java
	 *         primitive wrapper classes.
	 */
	public List<EDataType> getEWrappers() {
		return WRAPPERS_ETYPES_LIST;
	}

	/**
	 * @return Returns true if and only if the the given eDataType is the Ecore
	 *         EDataType for a primitive wrapper class.
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
 
 	/**
-	 * @return true if and only if the given dataType is a string datatype.
+	 * @return true if and only if the given dataType is a date datatype.
 	 */
 	public boolean isEDate(EDataType eDataType) {
		/*
		 *	the InstanceClass for date type can be "Object" for XSD types. I'm not sure about
		 *  ecore itself so I have kept the original check against the java classes.
		 *  
		 *  There is some ambiguity around the Java Date class since it can also hold time - 
		 *  a conflict with the DateTime class
		 */
 		Class<?> ic = eDataType.getInstanceClass();
		if (ic == Object.class) {
			// could be an XML date type
			return eDataType.equals(xmlDateEDataType);
		}
 		return java.util.Date.class == ic || java.util.Calendar.class == ic || java.sql.Date.class == ic;
	}

	/**
	 * @return true if and only if the given dataType is a datetime/timestamp datatype.
	 */
	public boolean isEDateTime(EDataType eDataType) {
		/*
		 *	the InstanceClass for date type can be "Object" for XSD types. I'm not sure about
		 *  ecore itself so I have kept the original check against the java classes.	
		 */
		Class<?> ic = eDataType.getInstanceClass();
		if (ic == Object.class) {
			// could be an XML date type
			return eDataType.equals(xmlDateTimeEDataType);
		}
		return java.sql.Timestamp.class == ic;
	}
 
	/**
	 * @return Returns true if and only if the given type is either a primitive
	 *         or a wrapper or string or a date.
	 */
	public boolean isSimpleType(EDataType eType) {
		// TODO move elsewhere
		return isEPrimitive(eType) || isEWrapper(eType) || isEString(eType)
				|| isEDate(eType);
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
	public static boolean isByteArray(EDataType eType) {
		final Class<?> clazz = eType.getInstanceClass();
		if (clazz != null) {
			return (clazz.isArray() && clazz.getComponentType().equals(
					Byte.TYPE));
		} else {
			return false;
		}
	}
}

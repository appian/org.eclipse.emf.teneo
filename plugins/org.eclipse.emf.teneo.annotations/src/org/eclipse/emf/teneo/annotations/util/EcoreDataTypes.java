/*
 *	Copyright 2004-2005, Elver.org (http://www.eclipse.org/emf/teneo).
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
package org.eclipse.emf.teneo.annotations.util;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EcorePackage;

/**
 * Utility class to classify Ecore datatypes.
 * 
 * @author <a href="mailto:marchign at elver.org">Davide Marchignoli</a>
 */
public class EcoreDataTypes {

	private static final List PRIMITIVES_ETYPES_LIST = Collections.unmodifiableList(Arrays.asList(new EDataType[] {
			EcorePackage.eINSTANCE.getEBoolean(), EcorePackage.eINSTANCE.getEByte(), EcorePackage.eINSTANCE.getEChar(),
			EcorePackage.eINSTANCE.getEDouble(), EcorePackage.eINSTANCE.getEFloat(), EcorePackage.eINSTANCE.getEInt(),
			EcorePackage.eINSTANCE.getELong(), EcorePackage.eINSTANCE.getEShort(), }));

	private static final List WRAPPERS_ETYPES_LIST = Collections.unmodifiableList(Arrays.asList(new EDataType[] {
			EcorePackage.eINSTANCE.getEBooleanObject(), EcorePackage.eINSTANCE.getEByteObject(),
			EcorePackage.eINSTANCE.getECharacterObject(), EcorePackage.eINSTANCE.getEDoubleObject(),
			EcorePackage.eINSTANCE.getEFloatObject(), EcorePackage.eINSTANCE.getEIntegerObject(),
			EcorePackage.eINSTANCE.getELongObject(), EcorePackage.eINSTANCE.getEShortObject(), }));

	public static EcoreDataTypes INSTANCE = new EcoreDataTypes();

	private EcoreDataTypes() {
	}

	// TODO: Make all utility methods static.

	/**
	 * @return Returns an immutable list of the Ecore EDataType for java primitives.
	 */
	public List getEPrimitives() {
		return PRIMITIVES_ETYPES_LIST;
	}

	/**
	 * @return Returns true if and only if the the given eDataType is the Ecore EDataType for a primitive type.
	 */
	public boolean isEPrimitive(EDataType eDataType) {
		return (eDataType != null) && (eDataType.getInstanceClass() != null)
				&& (eDataType.getInstanceClass().isPrimitive());
	}

	/**
	 * @return Returns an immutable list of the Ecore EDataType for java primitive wrapper classes.
	 */
	public List getEWrappers() {
		return WRAPPERS_ETYPES_LIST;
	}

	/**
	 * @return Returns true if and only if the the given eDataType is the Ecore EDataType for a primitive wrapper class.
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
	 * @return true if and only if the given dataType is a string datatype.
	 */
	public boolean isEDate(EDataType eDataType) {
		Class ic = eDataType.getInstanceClass();
		return java.util.Date.class == ic || java.util.Calendar.class == ic || java.sql.Date.class == ic;
	}

	/**
	 * @return Returns true if and only if the given type is either a primitive or a wrapper or string or a date.
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
	public static boolean isByteArray(EDataType eType) {
		final Class clazz = eType.getInstanceClass();
		if (clazz != null) {
			return (clazz.isArray() && clazz.getComponentType().equals(Byte.TYPE));
		} else {
			return false;
		}
	}
}

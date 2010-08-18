/**
 * <copyright>
 * </copyright>
 *
 * $Id: EntityModeType.java,v 1.1 2010/08/18 09:25:26 cbouhier Exp $
 */
package org.eclipse.emf.teneo.db2m.hbm30;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Entity Mode Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getEntityModeType()
 * @model extendedMetaData="name='entity-mode_._type'"
 * @generated
 */
public enum EntityModeType implements Enumerator {
	/**
	 * The '<em><b>Pojo</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POJO_VALUE
	 * @generated
	 * @ordered
	 */
	POJO(0, "pojo", "pojo"),

	/**
	 * The '<em><b>Dom4j</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOM4J_VALUE
	 * @generated
	 * @ordered
	 */
	DOM4J(1, "dom4j", "dom4j"),

	/**
	 * The '<em><b>Dynamic Map</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DYNAMIC_MAP_VALUE
	 * @generated
	 * @ordered
	 */
	DYNAMIC_MAP(2, "dynamicMap", "dynamic-map");

	/**
	 * The '<em><b>Pojo</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Pojo</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #POJO
	 * @model name="pojo"
	 * @generated
	 * @ordered
	 */
	public static final int POJO_VALUE = 0;

	/**
	 * The '<em><b>Dom4j</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Dom4j</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DOM4J
	 * @model name="dom4j"
	 * @generated
	 * @ordered
	 */
	public static final int DOM4J_VALUE = 1;

	/**
	 * The '<em><b>Dynamic Map</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Dynamic Map</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DYNAMIC_MAP
	 * @model name="dynamicMap" literal="dynamic-map"
	 * @generated
	 * @ordered
	 */
	public static final int DYNAMIC_MAP_VALUE = 2;

	/**
	 * An array of all the '<em><b>Entity Mode Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EntityModeType[] VALUES_ARRAY =
		new EntityModeType[] {
			POJO,
			DOM4J,
			DYNAMIC_MAP,
		};

	/**
	 * A public read-only list of all the '<em><b>Entity Mode Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EntityModeType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Entity Mode Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EntityModeType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EntityModeType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Entity Mode Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EntityModeType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EntityModeType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Entity Mode Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EntityModeType get(int value) {
		switch (value) {
			case POJO_VALUE: return POJO;
			case DOM4J_VALUE: return DOM4J;
			case DYNAMIC_MAP_VALUE: return DYNAMIC_MAP;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EntityModeType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //EntityModeType

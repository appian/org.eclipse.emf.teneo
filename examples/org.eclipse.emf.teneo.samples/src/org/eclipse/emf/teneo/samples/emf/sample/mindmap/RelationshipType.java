/**
 * <copyright>
 * </copyright>
 *
 * $Id: RelationshipType.java,v 1.1 2006/11/15 17:18:17 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.sample.mindmap;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Relationship Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.teneo.samples.emf.sample.mindmap.MindmapPackage#getRelationshipType()
 * @model
 * @generated
 */
public final class RelationshipType extends AbstractEnumerator {
	/**
	 * The '<em><b>DEPENDENCY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DEPENDENCY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DEPENDENCY_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DEPENDENCY = 0;

	/**
	 * The '<em><b>INCLUDES</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>INCLUDES</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INCLUDES_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INCLUDES = 1;

	/**
	 * The '<em><b>EXTENDS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>EXTENDS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EXTENDS_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EXTENDS = 2;

	/**
	 * The '<em><b>DEPENDENCY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEPENDENCY
	 * @generated
	 * @ordered
	 */
	public static final RelationshipType DEPENDENCY_LITERAL = new RelationshipType(DEPENDENCY, "DEPENDENCY", "DEPENDENCY");

	/**
	 * The '<em><b>INCLUDES</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INCLUDES
	 * @generated
	 * @ordered
	 */
	public static final RelationshipType INCLUDES_LITERAL = new RelationshipType(INCLUDES, "INCLUDES", "INCLUDES");

	/**
	 * The '<em><b>EXTENDS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXTENDS
	 * @generated
	 * @ordered
	 */
	public static final RelationshipType EXTENDS_LITERAL = new RelationshipType(EXTENDS, "EXTENDS", "EXTENDS");

	/**
	 * An array of all the '<em><b>Relationship Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final RelationshipType[] VALUES_ARRAY =
		new RelationshipType[] {
			DEPENDENCY_LITERAL,
			INCLUDES_LITERAL,
			EXTENDS_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Relationship Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Relationship Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RelationshipType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RelationshipType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Relationship Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RelationshipType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RelationshipType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Relationship Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RelationshipType get(int value) {
		switch (value) {
			case DEPENDENCY: return DEPENDENCY_LITERAL;
			case INCLUDES: return INCLUDES_LITERAL;
			case EXTENDS: return EXTENDS_LITERAL;
		}
		return null;	
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private RelationshipType(int value, String name, String literal) {
		super(value, name, literal);
	}

} //RelationshipType

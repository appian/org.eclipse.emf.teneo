/**
 * <copyright>
 * </copyright>
 *
 * $Id: Priority.java,v 1.1 2006/11/23 06:12:13 mtaal Exp $
 */
package org.example.mindmap;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Priority</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.example.mindmap.MindmapPackage#getPriority()
 * @model
 * @generated
 */
public final class Priority extends AbstractEnumerator {
	/**
	 * The '<em><b>ZERO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ZERO</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ZERO_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ZERO = 0;

	/**
	 * The '<em><b>ONE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ONE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ONE_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ONE = 1;

	/**
	 * The '<em><b>TWO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TWO</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TWO_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TWO = 2;

	/**
	 * The '<em><b>THREE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>THREE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #THREE_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int THREE = 3;

	/**
	 * The '<em><b>FOUR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FOUR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FOUR_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FOUR = 4;

	/**
	 * The '<em><b>FIVE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FIVE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FIVE_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FIVE = 5;

	/**
	 * The '<em><b>ZERO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ZERO
	 * @generated
	 * @ordered
	 */
	public static final Priority ZERO_LITERAL = new Priority(ZERO, "ZERO", "ZERO");

	/**
	 * The '<em><b>ONE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ONE
	 * @generated
	 * @ordered
	 */
	public static final Priority ONE_LITERAL = new Priority(ONE, "ONE", "ONE");

	/**
	 * The '<em><b>TWO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TWO
	 * @generated
	 * @ordered
	 */
	public static final Priority TWO_LITERAL = new Priority(TWO, "TWO", "TWO");

	/**
	 * The '<em><b>THREE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #THREE
	 * @generated
	 * @ordered
	 */
	public static final Priority THREE_LITERAL = new Priority(THREE, "THREE", "THREE");

	/**
	 * The '<em><b>FOUR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FOUR
	 * @generated
	 * @ordered
	 */
	public static final Priority FOUR_LITERAL = new Priority(FOUR, "FOUR", "FOUR");

	/**
	 * The '<em><b>FIVE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FIVE
	 * @generated
	 * @ordered
	 */
	public static final Priority FIVE_LITERAL = new Priority(FIVE, "FIVE", "FIVE");

	/**
	 * An array of all the '<em><b>Priority</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Priority[] VALUES_ARRAY =
		new Priority[] {
			ZERO_LITERAL,
			ONE_LITERAL,
			TWO_LITERAL,
			THREE_LITERAL,
			FOUR_LITERAL,
			FIVE_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Priority</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Priority</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Priority get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Priority result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Priority</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Priority getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Priority result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Priority</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Priority get(int value) {
		switch (value) {
			case ZERO: return ZERO_LITERAL;
			case ONE: return ONE_LITERAL;
			case TWO: return TWO_LITERAL;
			case THREE: return THREE_LITERAL;
			case FOUR: return FOUR_LITERAL;
			case FIVE: return FIVE_LITERAL;
		}
		return null;	
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Priority(int value, String name, String literal) {
		super(value, name, literal);
	}

} //Priority

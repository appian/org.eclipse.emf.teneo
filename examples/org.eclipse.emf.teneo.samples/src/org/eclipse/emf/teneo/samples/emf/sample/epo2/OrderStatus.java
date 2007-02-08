/**
 * <copyright>
 * </copyright>
 *
 * $Id: OrderStatus.java,v 1.2 2007/02/08 23:09:20 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.sample.epo2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Order Status</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.teneo.samples.emf.sample.epo2.EPO2Package#getOrderStatus()
 * @model
 * @generated
 */
public enum OrderStatus implements Enumerator
{
	/**
	 * The '<em><b>Pending</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PENDING
	 * @generated
	 * @ordered
	 */
	PENDING_LITERAL(0, "Pending", "Pending"),
	/**
	 * The '<em><b>Back Order</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BACK_ORDER
	 * @generated
	 * @ordered
	 */
	BACK_ORDER_LITERAL(1, "BackOrder", "BackOrder"),
	/**
	 * The '<em><b>Complete</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPLETE
	 * @generated
	 * @ordered
	 */
	COMPLETE_LITERAL(2, "Complete", "Complete");
	/**
	 * The '<em><b>Pending</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Pending</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PENDING_LITERAL
	 * @model name="Pending"
	 * @generated
	 * @ordered
	 */
	public static final int PENDING = 0;

	/**
	 * The '<em><b>Back Order</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Back Order</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BACK_ORDER_LITERAL
	 * @model name="BackOrder"
	 * @generated
	 * @ordered
	 */
	public static final int BACK_ORDER = 1;

	/**
	 * The '<em><b>Complete</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Complete</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COMPLETE_LITERAL
	 * @model name="Complete"
	 * @generated
	 * @ordered
	 */
	public static final int COMPLETE = 2;

	/**
	 * An array of all the '<em><b>Order Status</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final OrderStatus[] VALUES_ARRAY =
		new OrderStatus[] {
			PENDING_LITERAL,
			BACK_ORDER_LITERAL,
			COMPLETE_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Order Status</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<OrderStatus> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Order Status</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OrderStatus get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			OrderStatus result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Order Status</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OrderStatus getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			OrderStatus result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Order Status</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OrderStatus get(int value) {
		switch (value) {
			case PENDING: return PENDING_LITERAL;
			case BACK_ORDER: return BACK_ORDER_LITERAL;
			case COMPLETE: return COMPLETE_LITERAL;
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
	private OrderStatus(int value, String name, String literal) {
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
}

/**
 * <copyright>
 * </copyright>
 *
 * $Id: OrderStatus.java,v 1.1 2006/07/11 16:56:56 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.sample.epo2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Order Status</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.teneo.samples.emf.sample.epo2.EPO2Package#getOrderStatus()
 * @model
 * @generated
 */
public final class OrderStatus extends AbstractEnumerator {
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
	 * The '<em><b>Pending</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PENDING
	 * @generated
	 * @ordered
	 */
	public static final OrderStatus PENDING_LITERAL = new OrderStatus(PENDING, "Pending");

	/**
	 * The '<em><b>Back Order</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BACK_ORDER
	 * @generated
	 * @ordered
	 */
	public static final OrderStatus BACK_ORDER_LITERAL = new OrderStatus(BACK_ORDER, "BackOrder");

	/**
	 * The '<em><b>Complete</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPLETE
	 * @generated
	 * @ordered
	 */
	public static final OrderStatus COMPLETE_LITERAL = new OrderStatus(COMPLETE, "Complete");

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
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Order Status</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OrderStatus get(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			OrderStatus result = VALUES_ARRAY[i];
			if (result.toString().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Order Status</b></em>' literal with the specified value.
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
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private OrderStatus(int value, String name) {
		super(value, name);
	}

} //OrderStatus

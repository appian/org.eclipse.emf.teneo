/**
 * <copyright>
 * </copyright>
 *
 * $Id: BooleanValue.java,v 1.1 2007/03/07 23:34:08 mtaal Exp $
 */
package datacore.types;

import datacore.CSMValue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link datacore.types.BooleanValue#isValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see datacore.types.TypesPackage#getBooleanValue()
 * @model
 * @generated
 */
public interface BooleanValue extends CSMValue {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(boolean)
	 * @see datacore.types.TypesPackage#getBooleanValue_Value()
	 * @model
	 * @generated
	 */
	boolean isValue();

	/**
	 * Sets the value of the '{@link datacore.types.BooleanValue#isValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #isValue()
	 * @generated
	 */
	void setValue(boolean value);

} // BooleanValue

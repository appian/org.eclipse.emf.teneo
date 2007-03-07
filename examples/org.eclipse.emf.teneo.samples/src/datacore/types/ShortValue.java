/**
 * <copyright>
 * </copyright>
 *
 * $Id: ShortValue.java,v 1.1 2007/03/07 23:34:08 mtaal Exp $
 */
package datacore.types;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Short Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link datacore.types.ShortValue#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see datacore.types.TypesPackage#getShortValue()
 * @model
 * @generated
 */
public interface ShortValue extends CSMNumberValue {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(short)
	 * @see datacore.types.TypesPackage#getShortValue_Value()
	 * @model
	 * @generated
	 */
	short getValue();

	/**
	 * Sets the value of the '{@link datacore.types.ShortValue#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(short value);

} // ShortValue

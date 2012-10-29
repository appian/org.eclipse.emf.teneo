/**
 * <copyright>
 * </copyright>
 *
 * $Id: Addressable.java,v 1.1 2006/08/14 05:08:58 mtaal Exp $
 */
package extlibrary;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Addressable</b></em>'. <!--
 * end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link extlibrary.Addressable#getAddress <em>Address</em>}</li>
 * </ul>
 * </p>
 * 
 * @see extlibrary.ExtlibraryPackage#getAddressable()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Addressable extends EObject {
	/**
	 * Returns the value of the '<em><b>Address</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Address</em>' attribute isn't clear, there really should be more of
	 * a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Address</em>' attribute.
	 * @see #setAddress(String)
	 * @see extlibrary.ExtlibraryPackage#getAddressable_Address()
	 * @model
	 * @generated
	 */
	String getAddress();

	/**
	 * Sets the value of the '{@link extlibrary.Addressable#getAddress <em>Address</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Address</em>' attribute.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(String value);

} // Addressable
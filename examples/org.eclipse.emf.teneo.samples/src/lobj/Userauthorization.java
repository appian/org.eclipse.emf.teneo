/**
 * <copyright>
 * </copyright>
 *
 * $Id: Userauthorization.java,v 1.1 2006/11/23 06:12:08 mtaal Exp $
 */
package lobj;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Userauthorization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link lobj.Userauthorization#getUser <em>User</em>}</li>
 *   <li>{@link lobj.Userauthorization#getAuthType <em>Auth Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see lobj.LobjPackage#getUserauthorization()
 * @model extendedMetaData="name='authorization' kind='elementOnly'"
 * @generated
 */
public interface Userauthorization extends EObject {
	/**
	 * Returns the value of the '<em><b>User</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User</em>' reference.
	 * @see #setUser(User)
	 * @see lobj.LobjPackage#getUserauthorization_User()
	 * @model annotation="http://annotation.elver.org/Indexed value='false'"
	 * @generated
	 */
	User getUser();

	/**
	 * Sets the value of the '{@link lobj.Userauthorization#getUser <em>User</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User</em>' reference.
	 * @see #getUser()
	 * @generated
	 */
	void setUser(User value);

	/**
	 * Returns the value of the '<em><b>Auth Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auth Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auth Type</em>' reference.
	 * @see #setAuthType(AuthorizationTypes)
	 * @see lobj.LobjPackage#getUserauthorization_AuthType()
	 * @model annotation="http://annotation.elver.org/Indexed value='false'"
	 * @generated
	 */
	AuthorizationTypes getAuthType();

	/**
	 * Sets the value of the '{@link lobj.Userauthorization#getAuthType <em>Auth Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auth Type</em>' reference.
	 * @see #getAuthType()
	 * @generated
	 */
	void setAuthType(AuthorizationTypes value);

} // Userauthorization
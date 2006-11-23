/**
 * <copyright>
 * </copyright>
 *
 * $Id: AuthorizationTypes.java,v 1.1 2006/11/23 06:12:08 mtaal Exp $
 */
package lobj;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Authorization Types</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link lobj.AuthorizationTypes#getAuthType <em>Auth Type</em>}</li>
 *   <li>{@link lobj.AuthorizationTypes#getAuthTypeDesc <em>Auth Type Desc</em>}</li>
 *   <li>{@link lobj.AuthorizationTypes#isReadOnly <em>Read Only</em>}</li>
 * </ul>
 * </p>
 *
 * @see lobj.LobjPackage#getAuthorizationTypes()
 * @model extendedMetaData="name='authorizationTypes' kind='elementOnly'"
 * @generated
 */
public interface AuthorizationTypes extends EObject {
	/**
	 * Returns the value of the '<em><b>Auth Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auth Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auth Type</em>' attribute.
	 * @see #setAuthType(String)
	 * @see lobj.LobjPackage#getAuthorizationTypes_AuthType()
	 * @model required="true"
	 *        extendedMetaData="kind='element' name='authType' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAuthType();

	/**
	 * Sets the value of the '{@link lobj.AuthorizationTypes#getAuthType <em>Auth Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auth Type</em>' attribute.
	 * @see #getAuthType()
	 * @generated
	 */
	void setAuthType(String value);

	/**
	 * Returns the value of the '<em><b>Auth Type Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auth Type Desc</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auth Type Desc</em>' attribute.
	 * @see #setAuthTypeDesc(String)
	 * @see lobj.LobjPackage#getAuthorizationTypes_AuthTypeDesc()
	 * @model extendedMetaData="kind='element' name='authTypeDesc' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAuthTypeDesc();

	/**
	 * Sets the value of the '{@link lobj.AuthorizationTypes#getAuthTypeDesc <em>Auth Type Desc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auth Type Desc</em>' attribute.
	 * @see #getAuthTypeDesc()
	 * @generated
	 */
	void setAuthTypeDesc(String value);

	/**
	 * Returns the value of the '<em><b>Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Read Only</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Read Only</em>' attribute.
	 * @see #setReadOnly(boolean)
	 * @see lobj.LobjPackage#getAuthorizationTypes_ReadOnly()
	 * @model unique="false" required="true"
	 *        extendedMetaData="kind='element' name='readOnly' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isReadOnly();

	/**
	 * Sets the value of the '{@link lobj.AuthorizationTypes#isReadOnly <em>Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Read Only</em>' attribute.
	 * @see #isReadOnly()
	 * @generated
	 */
	void setReadOnly(boolean value);

} // AuthorizationTypes
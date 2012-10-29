/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package lobj;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Authorization Types</b></em>
 * '. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link lobj.AuthorizationTypes#getAuthType <em>Auth Type</em>}</li>
 * <li>{@link lobj.AuthorizationTypes#getAuthTypeDesc <em>Auth Type Desc</em>}</li>
 * <li>{@link lobj.AuthorizationTypes#isReadOnly <em>Read Only</em>}</li>
 * <li>{@link lobj.AuthorizationTypes#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 * 
 * @see lobj.LobjPackage#getAuthorizationTypes()
 * @model extendedMetaData="kind='elementOnly'"
 * @generated
 */
public interface AuthorizationTypes extends EObject {
	/**
	 * Returns the value of the '<em><b>Auth Type</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auth Type</em>' attribute isn't clear, there really should be more
	 * of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Auth Type</em>' attribute.
	 * @see #setAuthType(String)
	 * @see lobj.LobjPackage#getAuthorizationTypes_AuthType()
	 * @model extendedMetaData="kind='element'"
	 * @generated
	 */
	String getAuthType();

	/**
	 * Sets the value of the '{@link lobj.AuthorizationTypes#getAuthType <em>Auth Type</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Auth Type</em>' attribute.
	 * @see #getAuthType()
	 * @generated
	 */
	void setAuthType(String value);

	/**
	 * Returns the value of the '<em><b>Auth Type Desc</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auth Type Desc</em>' attribute isn't clear, there really should be
	 * more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Auth Type Desc</em>' attribute.
	 * @see #setAuthTypeDesc(String)
	 * @see lobj.LobjPackage#getAuthorizationTypes_AuthTypeDesc()
	 * @model extendedMetaData="kind='element'"
	 * @generated
	 */
	String getAuthTypeDesc();

	/**
	 * Sets the value of the '{@link lobj.AuthorizationTypes#getAuthTypeDesc <em>Auth Type Desc</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Auth Type Desc</em>' attribute.
	 * @see #getAuthTypeDesc()
	 * @generated
	 */
	void setAuthTypeDesc(String value);

	/**
	 * Returns the value of the '<em><b>Read Only</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Read Only</em>' attribute isn't clear, there really should be more
	 * of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Read Only</em>' attribute.
	 * @see #setReadOnly(boolean)
	 * @see lobj.LobjPackage#getAuthorizationTypes_ReadOnly()
	 * @model unique="false" extendedMetaData="kind='element'"
	 * @generated
	 */
	boolean isReadOnly();

	/**
	 * Sets the value of the '{@link lobj.AuthorizationTypes#isReadOnly <em>Read Only</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Read Only</em>' attribute.
	 * @see #isReadOnly()
	 * @generated
	 */
	void setReadOnly(boolean value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see lobj.LobjPackage#getAuthorizationTypes_Id()
	 * @model unique="false" id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link lobj.AuthorizationTypes#getId <em>Id</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // AuthorizationTypes

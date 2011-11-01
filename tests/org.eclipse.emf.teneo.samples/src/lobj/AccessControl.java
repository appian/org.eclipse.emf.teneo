/**
 * <copyright>
 * </copyright>
 *
 * $Id: AccessControl.java,v 1.3 2007/03/28 13:56:50 mtaal Exp $
 */
package lobj;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Access Control</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link lobj.AccessControl#getOwner <em>Owner</em>}</li>
 *   <li>{@link lobj.AccessControl#getLastModified <em>Last Modified</em>}</li>
 *   <li>{@link lobj.AccessControl#getLastModifiedBy <em>Last Modified By</em>}</li>
 *   <li>{@link lobj.AccessControl#getStatus <em>Status</em>}</li>
 *   <li>{@link lobj.AccessControl#getLastStatusChange <em>Last Status Change</em>}</li>
 *   <li>{@link lobj.AccessControl#getLastStatusChangeBy <em>Last Status Change By</em>}</li>
 *   <li>{@link lobj.AccessControl#getSharednotes <em>Sharednotes</em>}</li>
 *   <li>{@link lobj.AccessControl#getAuthorizes <em>Authorizes</em>}</li>
 *   <li>{@link lobj.AccessControl#getEditionHistory <em>Edition History</em>}</li>
 *   <li>{@link lobj.AccessControl#isGlobalAccess <em>Global Access</em>}</li>
 *   <li>{@link lobj.AccessControl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see lobj.LobjPackage#getAccessControl()
 * @model extendedMetaData="kind='elementOnly'"
 * @generated
 */
public interface AccessControl extends EObject {
	/**
	 * Returns the value of the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' reference.
	 * @see #setOwner(User)
	 * @see lobj.LobjPackage#getAccessControl_Owner()
	 * @model extendedMetaData="kind='element' namespace='##targetNamespace'"
	 * @generated
	 */
	User getOwner();

	/**
	 * Sets the value of the '{@link lobj.AccessControl#getOwner <em>Owner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' reference.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(User value);

	/**
	 * Returns the value of the '<em><b>Last Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Modified</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Modified</em>' attribute.
	 * @see #setLastModified(Date)
	 * @see lobj.LobjPackage#getAccessControl_LastModified()
	 * @model unique="false"
	 *        extendedMetaData="kind='element'"
	 * @generated
	 */
	Date getLastModified();

	/**
	 * Sets the value of the '{@link lobj.AccessControl#getLastModified <em>Last Modified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Modified</em>' attribute.
	 * @see #getLastModified()
	 * @generated
	 */
	void setLastModified(Date value);

	/**
	 * Returns the value of the '<em><b>Last Modified By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Modified By</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Modified By</em>' reference.
	 * @see #setLastModifiedBy(User)
	 * @see lobj.LobjPackage#getAccessControl_LastModifiedBy()
	 * @model resolveProxies="false"
	 *        extendedMetaData="kind='element' namespace='##targetNamespace'"
	 * @generated
	 */
	User getLastModifiedBy();

	/**
	 * Sets the value of the '{@link lobj.AccessControl#getLastModifiedBy <em>Last Modified By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Modified By</em>' reference.
	 * @see #getLastModifiedBy()
	 * @generated
	 */
	void setLastModifiedBy(User value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see #setStatus(String)
	 * @see lobj.LobjPackage#getAccessControl_Status()
	 * @model unique="false"
	 *        extendedMetaData="kind='element'"
	 * @generated
	 */
	String getStatus();

	/**
	 * Sets the value of the '{@link lobj.AccessControl#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(String value);

	/**
	 * Returns the value of the '<em><b>Last Status Change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Status Change</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Status Change</em>' attribute.
	 * @see #setLastStatusChange(Date)
	 * @see lobj.LobjPackage#getAccessControl_LastStatusChange()
	 * @model unique="false"
	 *        extendedMetaData="kind='element'"
	 * @generated
	 */
	Date getLastStatusChange();

	/**
	 * Sets the value of the '{@link lobj.AccessControl#getLastStatusChange <em>Last Status Change</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Status Change</em>' attribute.
	 * @see #getLastStatusChange()
	 * @generated
	 */
	void setLastStatusChange(Date value);

	/**
	 * Returns the value of the '<em><b>Last Status Change By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Status Change By</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Status Change By</em>' reference.
	 * @see #setLastStatusChangeBy(User)
	 * @see lobj.LobjPackage#getAccessControl_LastStatusChangeBy()
	 * @model resolveProxies="false"
	 *        extendedMetaData="kind='element' namespace='##targetNamespace'"
	 * @generated
	 */
	User getLastStatusChangeBy();

	/**
	 * Sets the value of the '{@link lobj.AccessControl#getLastStatusChangeBy <em>Last Status Change By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Status Change By</em>' reference.
	 * @see #getLastStatusChangeBy()
	 * @generated
	 */
	void setLastStatusChangeBy(User value);

	/**
	 * Returns the value of the '<em><b>Sharednotes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sharednotes</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sharednotes</em>' containment reference.
	 * @see #setSharednotes(Sharednotes)
	 * @see lobj.LobjPackage#getAccessControl_Sharednotes()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' namespace='##targetNamespace'"
	 * @generated
	 */
	Sharednotes getSharednotes();

	/**
	 * Sets the value of the '{@link lobj.AccessControl#getSharednotes <em>Sharednotes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sharednotes</em>' containment reference.
	 * @see #getSharednotes()
	 * @generated
	 */
	void setSharednotes(Sharednotes value);

	/**
	 * Returns the value of the '<em><b>Authorizes</b></em>' containment reference list.
	 * The list contents are of type {@link lobj.Userauthorization}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Authorizes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authorizes</em>' containment reference list.
	 * @see lobj.LobjPackage#getAccessControl_Authorizes()
	 * @model type="lobj.Userauthorization" containment="true"
	 *        extendedMetaData="kind='element' namespace='##targetNamespace'"
	 *        annotation="http://annotation.elver.org/Indexed value='false'"
	 * @generated
	 */
	EList getAuthorizes();

	/**
	 * Returns the value of the '<em><b>Edition History</b></em>' containment reference list.
	 * The list contents are of type {@link lobj.Edition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edition History</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edition History</em>' containment reference list.
	 * @see lobj.LobjPackage#getAccessControl_EditionHistory()
	 * @model type="lobj.Edition" containment="true"
	 *        extendedMetaData="kind='element' namespace='##targetNamespace'"
	 *        annotation="http://annotation.elver.org/Indexed value='false'"
	 * @generated
	 */
	EList getEditionHistory();

	/**
	 * Returns the value of the '<em><b>Global Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Global Access</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Global Access</em>' attribute.
	 * @see #setGlobalAccess(boolean)
	 * @see lobj.LobjPackage#getAccessControl_GlobalAccess()
	 * @model unique="false"
	 *        extendedMetaData="kind='element'"
	 * @generated
	 */
	boolean isGlobalAccess();

	/**
	 * Sets the value of the '{@link lobj.AccessControl#isGlobalAccess <em>Global Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Global Access</em>' attribute.
	 * @see #isGlobalAccess()
	 * @generated
	 */
	void setGlobalAccess(boolean value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see lobj.LobjPackage#getAccessControl_Id()
	 * @model unique="false" id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link lobj.AccessControl#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // AccessControl

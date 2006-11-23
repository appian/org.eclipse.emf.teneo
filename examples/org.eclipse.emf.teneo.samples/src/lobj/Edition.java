/**
 * <copyright>
 * </copyright>
 *
 * $Id: Edition.java,v 1.1 2006/11/23 06:12:08 mtaal Exp $
 */
package lobj;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Edition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link lobj.Edition#getEditionNumber <em>Edition Number</em>}</li>
 *   <li>{@link lobj.Edition#getEditedBy <em>Edited By</em>}</li>
 *   <li>{@link lobj.Edition#isIsVersion <em>Is Version</em>}</li>
 *   <li>{@link lobj.Edition#getLastVersionNumber <em>Last Version Number</em>}</li>
 *   <li>{@link lobj.Edition#getStatus <em>Status</em>}</li>
 *   <li>{@link lobj.Edition#getEditionCreationDate <em>Edition Creation Date</em>}</li>
 * </ul>
 * </p>
 *
 * @see lobj.LobjPackage#getEdition()
 * @model extendedMetaData="name='edition' kind='empty'"
 * @generated
 */
public interface Edition extends EObject {
	/**
	 * Returns the value of the '<em><b>Edition Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edition Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edition Number</em>' attribute.
	 * @see #setEditionNumber(String)
	 * @see lobj.LobjPackage#getEdition_EditionNumber()
	 * @model unique="false" id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='editionNumber'"
	 * @generated
	 */
	String getEditionNumber();

	/**
	 * Sets the value of the '{@link lobj.Edition#getEditionNumber <em>Edition Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Edition Number</em>' attribute.
	 * @see #getEditionNumber()
	 * @generated
	 */
	void setEditionNumber(String value);

	/**
	 * Returns the value of the '<em><b>Edited By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edited By</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edited By</em>' attribute.
	 * @see #setEditedBy(String)
	 * @see lobj.LobjPackage#getEdition_EditedBy()
	 * @model unique="false"
	 *        extendedMetaData="kind='attribute' name='editedBy'"
	 * @generated
	 */
	String getEditedBy();

	/**
	 * Sets the value of the '{@link lobj.Edition#getEditedBy <em>Edited By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Edited By</em>' attribute.
	 * @see #getEditedBy()
	 * @generated
	 */
	void setEditedBy(String value);

	/**
	 * Returns the value of the '<em><b>Is Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Version</em>' attribute.
	 * @see #isSetIsVersion()
	 * @see #unsetIsVersion()
	 * @see #setIsVersion(boolean)
	 * @see lobj.LobjPackage#getEdition_IsVersion()
	 * @model unique="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='isVersion'"
	 * @generated
	 */
	boolean isIsVersion();

	/**
	 * Sets the value of the '{@link lobj.Edition#isIsVersion <em>Is Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Version</em>' attribute.
	 * @see #isSetIsVersion()
	 * @see #unsetIsVersion()
	 * @see #isIsVersion()
	 * @generated
	 */
	void setIsVersion(boolean value);

	/**
	 * Unsets the value of the '{@link lobj.Edition#isIsVersion <em>Is Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsVersion()
	 * @see #isIsVersion()
	 * @see #setIsVersion(boolean)
	 * @generated
	 */
	void unsetIsVersion();

	/**
	 * Returns whether the value of the '{@link lobj.Edition#isIsVersion <em>Is Version</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Version</em>' attribute is set.
	 * @see #unsetIsVersion()
	 * @see #isIsVersion()
	 * @see #setIsVersion(boolean)
	 * @generated
	 */
	boolean isSetIsVersion();

	/**
	 * Returns the value of the '<em><b>Last Version Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Version Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Version Number</em>' attribute.
	 * @see #setLastVersionNumber(String)
	 * @see lobj.LobjPackage#getEdition_LastVersionNumber()
	 * @model unique="false"
	 *        extendedMetaData="kind='attribute' name='lastVersionNumber'"
	 * @generated
	 */
	String getLastVersionNumber();

	/**
	 * Sets the value of the '{@link lobj.Edition#getLastVersionNumber <em>Last Version Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Version Number</em>' attribute.
	 * @see #getLastVersionNumber()
	 * @generated
	 */
	void setLastVersionNumber(String value);

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
	 * @see lobj.LobjPackage#getEdition_Status()
	 * @model unique="false"
	 *        extendedMetaData="kind='attribute' name='status'"
	 * @generated
	 */
	String getStatus();

	/**
	 * Sets the value of the '{@link lobj.Edition#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(String value);

	/**
	 * Returns the value of the '<em><b>Edition Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edition Creation Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edition Creation Date</em>' attribute.
	 * @see #setEditionCreationDate(Date)
	 * @see lobj.LobjPackage#getEdition_EditionCreationDate()
	 * @model unique="false"
	 *        extendedMetaData="kind='element' name='editionCreationDate' namespace='##targetNamespace'"
	 * @generated
	 */
	Date getEditionCreationDate();

	/**
	 * Sets the value of the '{@link lobj.Edition#getEditionCreationDate <em>Edition Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Edition Creation Date</em>' attribute.
	 * @see #getEditionCreationDate()
	 * @generated
	 */
	void setEditionCreationDate(Date value);

} // Edition
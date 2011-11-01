/**
 * <copyright>
 * </copyright>
 *
 * $Id$
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
 *   <li>{@link lobj.Edition#getEditionNr <em>Edition Nr</em>}</li>
 *   <li>{@link lobj.Edition#getEditedBy <em>Edited By</em>}</li>
 *   <li>{@link lobj.Edition#isVersion <em>Version</em>}</li>
 *   <li>{@link lobj.Edition#getLastVersionNumber <em>Last Version Number</em>}</li>
 *   <li>{@link lobj.Edition#getStatus <em>Status</em>}</li>
 *   <li>{@link lobj.Edition#getEditionCreationDate <em>Edition Creation Date</em>}</li>
 *   <li>{@link lobj.Edition#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see lobj.LobjPackage#getEdition()
 * @model extendedMetaData="kind='elementOnly'"
 * @generated
 */
public interface Edition extends EObject {
	/**
	 * Returns the value of the '<em><b>Edition Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edition Nr</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edition Nr</em>' attribute.
	 * @see #setEditionNr(String)
	 * @see lobj.LobjPackage#getEdition_EditionNr()
	 * @model unique="false"
	 *        extendedMetaData="kind='element'"
	 * @generated
	 */
	String getEditionNr();

	/**
	 * Sets the value of the '{@link lobj.Edition#getEditionNr <em>Edition Nr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Edition Nr</em>' attribute.
	 * @see #getEditionNr()
	 * @generated
	 */
	void setEditionNr(String value);

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
	 *        extendedMetaData="kind='element'"
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
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #isSetVersion()
	 * @see #unsetVersion()
	 * @see #setVersion(boolean)
	 * @see lobj.LobjPackage#getEdition_Version()
	 * @model unique="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element'"
	 * @generated
	 */
	boolean isVersion();

	/**
	 * Sets the value of the '{@link lobj.Edition#isVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #isSetVersion()
	 * @see #unsetVersion()
	 * @see #isVersion()
	 * @generated
	 */
	void setVersion(boolean value);

	/**
	 * Unsets the value of the '{@link lobj.Edition#isVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVersion()
	 * @see #isVersion()
	 * @see #setVersion(boolean)
	 * @generated
	 */
	void unsetVersion();

	/**
	 * Returns whether the value of the '{@link lobj.Edition#isVersion <em>Version</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Version</em>' attribute is set.
	 * @see #unsetVersion()
	 * @see #isVersion()
	 * @see #setVersion(boolean)
	 * @generated
	 */
	boolean isSetVersion();

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
	 *        extendedMetaData="kind='element'"
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
	 *        extendedMetaData="kind='element'"
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
	 *        extendedMetaData="kind='element'"
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
	 * @see lobj.LobjPackage#getEdition_Id()
	 * @model unique="false" id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link lobj.Edition#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // Edition

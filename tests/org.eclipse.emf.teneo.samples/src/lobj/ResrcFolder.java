/**
 * <copyright>
 * </copyright>
 *
 * $Id: ResrcFolder.java,v 1.3 2007/03/28 13:56:49 mtaal Exp $
 */
package lobj;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resrc Folder</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link lobj.ResrcFolder#getFolderMeta <em>Folder Meta</em>}</li>
 *   <li>{@link lobj.ResrcFolder#getResrcFolder <em>Resrc Folder</em>}</li>
 *   <li>{@link lobj.ResrcFolder#getAccessControl <em>Access Control</em>}</li>
 *   <li>{@link lobj.ResrcFolder#isDeleteScheduled <em>Delete Scheduled</em>}</li>
 *   <li>{@link lobj.ResrcFolder#getResrcFile <em>Resrc File</em>}</li>
 * </ul>
 * </p>
 *
 * @see lobj.LobjPackage#getResrcFolder()
 * @model extendedMetaData="kind='elementOnly'"
 * @generated
 */
public interface ResrcFolder extends LearningObject {
	/**
	 * Returns the value of the '<em><b>Folder Meta</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Folder Meta</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Folder Meta</em>' containment reference.
	 * @see #setFolderMeta(FolderMeta)
	 * @see lobj.LobjPackage#getResrcFolder_FolderMeta()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' namespace='##targetNamespace'"
	 * @generated
	 */
	FolderMeta getFolderMeta();

	/**
	 * Sets the value of the '{@link lobj.ResrcFolder#getFolderMeta <em>Folder Meta</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Folder Meta</em>' containment reference.
	 * @see #getFolderMeta()
	 * @generated
	 */
	void setFolderMeta(FolderMeta value);

	/**
	 * Returns the value of the '<em><b>Resrc Folder</b></em>' containment reference list.
	 * The list contents are of type {@link lobj.ResrcFolder}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resrc Folder</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resrc Folder</em>' containment reference list.
	 * @see lobj.LobjPackage#getResrcFolder_ResrcFolder()
	 * @model type="lobj.ResrcFolder" containment="true"
	 *        extendedMetaData="kind='element' namespace='##targetNamespace'"
	 *        annotation="http://annotation.elver.org/Indexed value='false'"
	 * @generated
	 */
	EList getResrcFolder();

	/**
	 * Returns the value of the '<em><b>Access Control</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Access Control</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access Control</em>' containment reference.
	 * @see #setAccessControl(AccessControl)
	 * @see lobj.LobjPackage#getResrcFolder_AccessControl()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' namespace='##targetNamespace'"
	 * @generated
	 */
	AccessControl getAccessControl();

	/**
	 * Sets the value of the '{@link lobj.ResrcFolder#getAccessControl <em>Access Control</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Control</em>' containment reference.
	 * @see #getAccessControl()
	 * @generated
	 */
	void setAccessControl(AccessControl value);

	/**
	 * Returns the value of the '<em><b>Delete Scheduled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delete Scheduled</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delete Scheduled</em>' attribute.
	 * @see #setDeleteScheduled(boolean)
	 * @see lobj.LobjPackage#getResrcFolder_DeleteScheduled()
	 * @model unique="false"
	 *        extendedMetaData="kind='element'"
	 * @generated
	 */
	boolean isDeleteScheduled();

	/**
	 * Sets the value of the '{@link lobj.ResrcFolder#isDeleteScheduled <em>Delete Scheduled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delete Scheduled</em>' attribute.
	 * @see #isDeleteScheduled()
	 * @generated
	 */
	void setDeleteScheduled(boolean value);

	/**
	 * Returns the value of the '<em><b>Resrc File</b></em>' containment reference list.
	 * The list contents are of type {@link lobj.ResrcFile}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resrc File</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resrc File</em>' containment reference list.
	 * @see lobj.LobjPackage#getResrcFolder_ResrcFile()
	 * @model type="lobj.ResrcFile" containment="true"
	 *        extendedMetaData="kind='element' namespace='##targetNamespace'"
	 *        annotation="http://annotation.elver.org/Indexed value='false'"
	 * @generated
	 */
	EList getResrcFile();

} // ResrcFolder

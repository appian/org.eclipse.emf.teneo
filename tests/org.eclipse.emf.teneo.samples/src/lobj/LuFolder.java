/**
 * <copyright>
 * </copyright>
 *
 * $Id: LuFolder.java,v 1.3 2007/03/28 13:56:50 mtaal Exp $
 */
package lobj;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lu Folder</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link lobj.LuFolder#getFolderMeta <em>Folder Meta</em>}</li>
 *   <li>{@link lobj.LuFolder#getLuFolder <em>Lu Folder</em>}</li>
 *   <li>{@link lobj.LuFolder#getLearningUnit <em>Learning Unit</em>}</li>
 *   <li>{@link lobj.LuFolder#getAccessControl <em>Access Control</em>}</li>
 * </ul>
 * </p>
 *
 * @see lobj.LobjPackage#getLuFolder()
 * @model extendedMetaData="kind='elementOnly'"
 * @generated
 */
public interface LuFolder extends LearningObject {
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
	 * @see lobj.LobjPackage#getLuFolder_FolderMeta()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' namespace='##targetNamespace'"
	 * @generated
	 */
	FolderMeta getFolderMeta();

	/**
	 * Sets the value of the '{@link lobj.LuFolder#getFolderMeta <em>Folder Meta</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Folder Meta</em>' containment reference.
	 * @see #getFolderMeta()
	 * @generated
	 */
	void setFolderMeta(FolderMeta value);

	/**
	 * Returns the value of the '<em><b>Lu Folder</b></em>' containment reference list.
	 * The list contents are of type {@link lobj.LuFolder}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lu Folder</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lu Folder</em>' containment reference list.
	 * @see lobj.LobjPackage#getLuFolder_LuFolder()
	 * @model type="lobj.LuFolder" containment="true"
	 *        extendedMetaData="kind='element' namespace='##targetNamespace'"
	 *        annotation="http://annotation.elver.org/Indexed value='false'"
	 * @generated
	 */
	EList getLuFolder();

	/**
	 * Returns the value of the '<em><b>Learning Unit</b></em>' containment reference list.
	 * The list contents are of type {@link lobj.LearningUnit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Learning Unit</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Learning Unit</em>' containment reference list.
	 * @see lobj.LobjPackage#getLuFolder_LearningUnit()
	 * @model type="lobj.LearningUnit" containment="true"
	 *        extendedMetaData="kind='element' namespace='##targetNamespace'"
	 *        annotation="http://annotation.elver.org/Indexed value='false'"
	 * @generated
	 */
	EList getLearningUnit();

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
	 * @see lobj.LobjPackage#getLuFolder_AccessControl()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' namespace='##targetNamespace'"
	 * @generated
	 */
	AccessControl getAccessControl();

	/**
	 * Sets the value of the '{@link lobj.LuFolder#getAccessControl <em>Access Control</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Control</em>' containment reference.
	 * @see #getAccessControl()
	 * @generated
	 */
	void setAccessControl(AccessControl value);

} // LuFolder

/**
 * <copyright>
 * </copyright>
 *
 * $Id: ModuleFolder.java,v 1.1 2006/11/23 06:12:07 mtaal Exp $
 */
package lobj;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Module Folder</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link lobj.ModuleFolder#getFolderMeta <em>Folder Meta</em>}</li>
 *   <li>{@link lobj.ModuleFolder#getModuleFolder <em>Module Folder</em>}</li>
 *   <li>{@link lobj.ModuleFolder#getModule <em>Module</em>}</li>
 *   <li>{@link lobj.ModuleFolder#getAccessControl <em>Access Control</em>}</li>
 * </ul>
 * </p>
 *
 * @see lobj.LobjPackage#getModuleFolder()
 * @model extendedMetaData="name='moduleFolder' kind='elementOnly'"
 * @generated
 */
public interface ModuleFolder extends LearningObject {
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
	 * @see lobj.LobjPackage#getModuleFolder_FolderMeta()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='folderMeta' namespace='##targetNamespace'"
	 * @generated
	 */
	FolderMeta getFolderMeta();

	/**
	 * Sets the value of the '{@link lobj.ModuleFolder#getFolderMeta <em>Folder Meta</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Folder Meta</em>' containment reference.
	 * @see #getFolderMeta()
	 * @generated
	 */
	void setFolderMeta(FolderMeta value);

	/**
	 * Returns the value of the '<em><b>Module Folder</b></em>' containment reference list.
	 * The list contents are of type {@link lobj.ModuleFolder}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Module Folder</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Module Folder</em>' containment reference list.
	 * @see lobj.LobjPackage#getModuleFolder_ModuleFolder()
	 * @model type="lobj.ModuleFolder" containment="true"
	 *        extendedMetaData="kind='element' name='moduleFolder' namespace='##targetNamespace'"
	 *        annotation="http://annotation.elver.org/Indexed value='false'"
	 * @generated
	 */
	EList getModuleFolder();

	/**
	 * Returns the value of the '<em><b>Module</b></em>' containment reference list.
	 * The list contents are of type {@link lobj.Module}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Module</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Module</em>' containment reference list.
	 * @see lobj.LobjPackage#getModuleFolder_Module()
	 * @model type="lobj.Module" containment="true"
	 *        extendedMetaData="kind='element' name='module' namespace='##targetNamespace'"
	 *        annotation="http://annotation.elver.org/Indexed value='false'"
	 * @generated
	 */
	EList getModule();

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
	 * @see lobj.LobjPackage#getModuleFolder_AccessControl()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='accessControl' namespace='##targetNamespace'"
	 * @generated
	 */
	AccessControl getAccessControl();

	/**
	 * Sets the value of the '{@link lobj.ModuleFolder#getAccessControl <em>Access Control</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Control</em>' containment reference.
	 * @see #getAccessControl()
	 * @generated
	 */
	void setAccessControl(AccessControl value);

} // ModuleFolder
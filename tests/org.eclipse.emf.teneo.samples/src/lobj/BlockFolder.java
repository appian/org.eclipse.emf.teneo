/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package lobj;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Block Folder</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link lobj.BlockFolder#getFolderMeta <em>Folder Meta</em>}</li>
 *   <li>{@link lobj.BlockFolder#getBlockFolder <em>Block Folder</em>}</li>
 *   <li>{@link lobj.BlockFolder#getBlock <em>Block</em>}</li>
 *   <li>{@link lobj.BlockFolder#getAccessControl <em>Access Control</em>}</li>
 * </ul>
 * </p>
 *
 * @see lobj.LobjPackage#getBlockFolder()
 * @model extendedMetaData="kind='elementOnly'"
 * @generated
 */
public interface BlockFolder extends LearningObject {
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
	 * @see lobj.LobjPackage#getBlockFolder_FolderMeta()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' namespace='##targetNamespace'"
	 * @generated
	 */
	FolderMeta getFolderMeta();

	/**
	 * Sets the value of the '{@link lobj.BlockFolder#getFolderMeta <em>Folder Meta</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Folder Meta</em>' containment reference.
	 * @see #getFolderMeta()
	 * @generated
	 */
	void setFolderMeta(FolderMeta value);

	/**
	 * Returns the value of the '<em><b>Block Folder</b></em>' containment reference list.
	 * The list contents are of type {@link lobj.BlockFolder}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Block Folder</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Block Folder</em>' containment reference list.
	 * @see lobj.LobjPackage#getBlockFolder_BlockFolder()
	 * @model type="lobj.BlockFolder" containment="true"
	 *        extendedMetaData="kind='element' namespace='##targetNamespace'"
	 *        annotation="http://annotation.elver.org/Indexed value='false'"
	 * @generated
	 */
	EList getBlockFolder();

	/**
	 * Returns the value of the '<em><b>Block</b></em>' containment reference list.
	 * The list contents are of type {@link lobj.Block}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Block</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Block</em>' containment reference list.
	 * @see lobj.LobjPackage#getBlockFolder_Block()
	 * @model type="lobj.Block" containment="true"
	 *        extendedMetaData="kind='element' namespace='##targetNamespace'"
	 *        annotation="http://annotation.elver.org/Indexed value='false'"
	 * @generated
	 */
	EList getBlock();

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
	 * @see lobj.LobjPackage#getBlockFolder_AccessControl()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' namespace='##targetNamespace'"
	 * @generated
	 */
	AccessControl getAccessControl();

	/**
	 * Sets the value of the '{@link lobj.BlockFolder#getAccessControl <em>Access Control</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Control</em>' containment reference.
	 * @see #getAccessControl()
	 * @generated
	 */
	void setAccessControl(AccessControl value);

} // BlockFolder

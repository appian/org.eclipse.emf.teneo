/**
 * <copyright>
 * </copyright>
 *
 * $Id: Block.java,v 1.3 2007/03/28 13:56:50 mtaal Exp $
 */
package lobj;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link lobj.Block#getBlockMeta <em>Block Meta</em>}</li>
 *   <li>{@link lobj.Block#getExternalMetadata <em>External Metadata</em>}</li>
 *   <li>{@link lobj.Block#getAccessControl <em>Access Control</em>}</li>
 * </ul>
 * </p>
 *
 * @see lobj.LobjPackage#getBlock()
 * @model abstract="true"
 *        extendedMetaData="kind='elementOnly'"
 * @generated
 */
public interface Block extends LearningObject {
	/**
	 * Returns the value of the '<em><b>Block Meta</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Block Meta</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Block Meta</em>' containment reference.
	 * @see #setBlockMeta(BlockMeta)
	 * @see lobj.LobjPackage#getBlock_BlockMeta()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' namespace='##targetNamespace'"
	 * @generated
	 */
	BlockMeta getBlockMeta();

	/**
	 * Sets the value of the '{@link lobj.Block#getBlockMeta <em>Block Meta</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Block Meta</em>' containment reference.
	 * @see #getBlockMeta()
	 * @generated
	 */
	void setBlockMeta(BlockMeta value);

	/**
	 * Returns the value of the '<em><b>External Metadata</b></em>' containment reference list.
	 * The list contents are of type {@link lobj.ExternalMetadata}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>External Metadata</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External Metadata</em>' containment reference list.
	 * @see lobj.LobjPackage#getBlock_ExternalMetadata()
	 * @model type="lobj.ExternalMetadata" containment="true" ordered="false"
	 *        extendedMetaData="kind='element' namespace='##targetNamespace'"
	 *        annotation="http://annotation.elver.org/Indexed value='false'"
	 * @generated
	 */
	EList getExternalMetadata();

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
	 * @see lobj.LobjPackage#getBlock_AccessControl()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' namespace='##targetNamespace'"
	 * @generated
	 */
	AccessControl getAccessControl();

	/**
	 * Sets the value of the '{@link lobj.Block#getAccessControl <em>Access Control</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Control</em>' containment reference.
	 * @see #getAccessControl()
	 * @generated
	 */
	void setAccessControl(AccessControl value);

} // Block

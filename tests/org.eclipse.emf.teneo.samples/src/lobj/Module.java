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
 * A representation of the model object '<em><b>Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link lobj.Module#getModuleMeta <em>Module Meta</em>}</li>
 *   <li>{@link lobj.Module#getExternalMetadata <em>External Metadata</em>}</li>
 *   <li>{@link lobj.Module#getRootNode <em>Root Node</em>}</li>
 *   <li>{@link lobj.Module#getModuleFile <em>Module File</em>}</li>
 *   <li>{@link lobj.Module#getTreeAsXml <em>Tree As Xml</em>}</li>
 *   <li>{@link lobj.Module#getAccessControl <em>Access Control</em>}</li>
 * </ul>
 * </p>
 *
 * @see lobj.LobjPackage#getModule()
 * @model extendedMetaData="kind='elementOnly'"
 * @generated
 */
public interface Module extends LearningObject {
	/**
	 * Returns the value of the '<em><b>Module Meta</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Module Meta</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Module Meta</em>' containment reference.
	 * @see #setModuleMeta(ModuleMeta)
	 * @see lobj.LobjPackage#getModule_ModuleMeta()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' namespace='##targetNamespace'"
	 * @generated
	 */
	ModuleMeta getModuleMeta();

	/**
	 * Sets the value of the '{@link lobj.Module#getModuleMeta <em>Module Meta</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Module Meta</em>' containment reference.
	 * @see #getModuleMeta()
	 * @generated
	 */
	void setModuleMeta(ModuleMeta value);

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
	 * @see lobj.LobjPackage#getModule_ExternalMetadata()
	 * @model type="lobj.ExternalMetadata" containment="true" ordered="false"
	 *        extendedMetaData="kind='element' namespace='##targetNamespace'"
	 *        annotation="http://annotation.elver.org/Indexed value='false'"
	 * @generated
	 */
	EList getExternalMetadata();

	/**
	 * Returns the value of the '<em><b>Root Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root Node</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root Node</em>' containment reference.
	 * @see #setRootNode(Node)
	 * @see lobj.LobjPackage#getModule_RootNode()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' namespace='##targetNamespace'"
	 * @generated
	 */
	Node getRootNode();

	/**
	 * Sets the value of the '{@link lobj.Module#getRootNode <em>Root Node</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root Node</em>' containment reference.
	 * @see #getRootNode()
	 * @generated
	 */
	void setRootNode(Node value);

	/**
	 * Returns the value of the '<em><b>Module File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Module File</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Module File</em>' attribute.
	 * @see #setModuleFile(String)
	 * @see lobj.LobjPackage#getModule_ModuleFile()
	 * @model unique="false"
	 *        extendedMetaData="kind='element'"
	 * @generated
	 */
	String getModuleFile();

	/**
	 * Sets the value of the '{@link lobj.Module#getModuleFile <em>Module File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Module File</em>' attribute.
	 * @see #getModuleFile()
	 * @generated
	 */
	void setModuleFile(String value);

	/**
	 * Returns the value of the '<em><b>Tree As Xml</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tree As Xml</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tree As Xml</em>' attribute.
	 * @see #setTreeAsXml(String)
	 * @see lobj.LobjPackage#getModule_TreeAsXml()
	 * @model unique="false"
	 *        extendedMetaData="kind='element'"
	 * @generated
	 */
	String getTreeAsXml();

	/**
	 * Sets the value of the '{@link lobj.Module#getTreeAsXml <em>Tree As Xml</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tree As Xml</em>' attribute.
	 * @see #getTreeAsXml()
	 * @generated
	 */
	void setTreeAsXml(String value);

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
	 * @see lobj.LobjPackage#getModule_AccessControl()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' namespace='##targetNamespace'"
	 * @generated
	 */
	AccessControl getAccessControl();

	/**
	 * Sets the value of the '{@link lobj.Module#getAccessControl <em>Access Control</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Control</em>' containment reference.
	 * @see #getAccessControl()
	 * @generated
	 */
	void setAccessControl(AccessControl value);

} // Module

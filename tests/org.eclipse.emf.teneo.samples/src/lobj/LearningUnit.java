/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package lobj;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Learning Unit</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link lobj.LearningUnit#getLuMeta <em>Lu Meta</em>}</li>
 * <li>{@link lobj.LearningUnit#getExternalMetadata <em>External Metadata</em>}</li>
 * <li>{@link lobj.LearningUnit#getTreeAsXml <em>Tree As Xml</em>}</li>
 * <li>{@link lobj.LearningUnit#getLuFile <em>Lu File</em>}</li>
 * <li>{@link lobj.LearningUnit#getAccessControl <em>Access Control</em>}</li>
 * <li>{@link lobj.LearningUnit#getItem <em>Item</em>}</li>
 * </ul>
 * </p>
 * 
 * @see lobj.LobjPackage#getLearningUnit()
 * @model extendedMetaData="kind='elementOnly'"
 * @generated
 */
public interface LearningUnit extends LearningObject {
	/**
	 * Returns the value of the '<em><b>Lu Meta</b></em>' containment reference. <!-- begin-user-doc
	 * -->
	 * <p>
	 * If the meaning of the '<em>Lu Meta</em>' containment reference isn't clear, there really should
	 * be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Lu Meta</em>' containment reference.
	 * @see #setLuMeta(LuMeta)
	 * @see lobj.LobjPackage#getLearningUnit_LuMeta()
	 * @model containment="true" extendedMetaData="kind='element' namespace='##targetNamespace'"
	 * @generated
	 */
	LuMeta getLuMeta();

	/**
	 * Sets the value of the '{@link lobj.LearningUnit#getLuMeta <em>Lu Meta</em>}' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Lu Meta</em>' containment reference.
	 * @see #getLuMeta()
	 * @generated
	 */
	void setLuMeta(LuMeta value);

	/**
	 * Returns the value of the '<em><b>External Metadata</b></em>' containment reference list. The
	 * list contents are of type {@link lobj.ExternalMetadata}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>External Metadata</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>External Metadata</em>' containment reference list.
	 * @see lobj.LobjPackage#getLearningUnit_ExternalMetadata()
	 * @model type="lobj.ExternalMetadata" containment="true" ordered="false"
	 *        extendedMetaData="kind='element' namespace='##targetNamespace'"
	 *        annotation="http://annotation.elver.org/Indexed value='false'"
	 * @generated
	 */
	EList getExternalMetadata();

	/**
	 * Returns the value of the '<em><b>Tree As Xml</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tree As Xml</em>' attribute isn't clear, there really should be more
	 * of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Tree As Xml</em>' attribute.
	 * @see #setTreeAsXml(String)
	 * @see lobj.LobjPackage#getLearningUnit_TreeAsXml()
	 * @model unique="false" extendedMetaData="kind='element'"
	 * @generated
	 */
	String getTreeAsXml();

	/**
	 * Sets the value of the '{@link lobj.LearningUnit#getTreeAsXml <em>Tree As Xml</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Tree As Xml</em>' attribute.
	 * @see #getTreeAsXml()
	 * @generated
	 */
	void setTreeAsXml(String value);

	/**
	 * Returns the value of the '<em><b>Lu File</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lu File</em>' attribute isn't clear, there really should be more of
	 * a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Lu File</em>' attribute.
	 * @see #setLuFile(String)
	 * @see lobj.LobjPackage#getLearningUnit_LuFile()
	 * @model unique="false" extendedMetaData="kind='element'"
	 * @generated
	 */
	String getLuFile();

	/**
	 * Sets the value of the '{@link lobj.LearningUnit#getLuFile <em>Lu File</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Lu File</em>' attribute.
	 * @see #getLuFile()
	 * @generated
	 */
	void setLuFile(String value);

	/**
	 * Returns the value of the '<em><b>Access Control</b></em>' containment reference. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Access Control</em>' containment reference isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Access Control</em>' containment reference.
	 * @see #setAccessControl(AccessControl)
	 * @see lobj.LobjPackage#getLearningUnit_AccessControl()
	 * @model containment="true" extendedMetaData="kind='element' namespace='##targetNamespace'"
	 * @generated
	 */
	AccessControl getAccessControl();

	/**
	 * Sets the value of the '{@link lobj.LearningUnit#getAccessControl <em>Access Control</em>}'
	 * containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Access Control</em>' containment reference.
	 * @see #getAccessControl()
	 * @generated
	 */
	void setAccessControl(AccessControl value);

	/**
	 * Returns the value of the '<em><b>Item</b></em>' containment reference list. The list contents
	 * are of type {@link lobj.Item}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Item</em>' containment reference list isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Item</em>' containment reference list.
	 * @see lobj.LobjPackage#getLearningUnit_Item()
	 * @model type="lobj.Item" containment="true"
	 * @generated
	 */
	EList getItem();

} // LearningUnit

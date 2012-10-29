/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package lobj;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Item</b></em>'. <!--
 * end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link lobj.Item#getCorrBlock <em>Corr Block</em>}</li>
 * <li>{@link lobj.Item#getChilditems <em>Childitems</em>}</li>
 * <li>{@link lobj.Item#getLuRef <em>Lu Ref</em>}</li>
 * <li>{@link lobj.Item#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 * 
 * @see lobj.LobjPackage#getItem()
 * @model extendedMetaData="kind='elementOnly'"
 * @generated
 */
public interface Item extends EObject {
	/**
	 * Returns the value of the '<em><b>Corr Block</b></em>' containment reference list. The list
	 * contents are of type {@link lobj.CorrBlock}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Corr Block</em>' containment reference list isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Corr Block</em>' containment reference list.
	 * @see lobj.LobjPackage#getItem_CorrBlock()
	 * @model type="lobj.CorrBlock" containment="true"
	 *        extendedMetaData="kind='element' namespace='##targetNamespace'"
	 *        annotation="http://annotation.elver.org/Indexed value='false'"
	 * @generated
	 */
	EList getCorrBlock();

	/**
	 * Returns the value of the '<em><b>Childitems</b></em>' containment reference list. The list
	 * contents are of type {@link lobj.Item}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Childitems</em>' containment reference list isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Childitems</em>' containment reference list.
	 * @see lobj.LobjPackage#getItem_Childitems()
	 * @model type="lobj.Item" containment="true"
	 *        extendedMetaData="kind='element' namespace='##targetNamespace'"
	 * @generated
	 */
	EList getChilditems();

	/**
	 * Returns the value of the '<em><b>Lu Ref</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lu Ref</em>' attribute isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Lu Ref</em>' attribute.
	 * @see #setLuRef(String)
	 * @see lobj.LobjPackage#getItem_LuRef()
	 * @model extendedMetaData="kind='element'"
	 * @generated
	 */
	String getLuRef();

	/**
	 * Sets the value of the '{@link lobj.Item#getLuRef <em>Lu Ref</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Lu Ref</em>' attribute.
	 * @see #getLuRef()
	 * @generated
	 */
	void setLuRef(String value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see lobj.LobjPackage#getItem_Id()
	 * @model unique="false" id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link lobj.Item#getId <em>Id</em>}' attribute. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // Item

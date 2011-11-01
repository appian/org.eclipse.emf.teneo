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
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Corr Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link lobj.CorrBlock#getPresentationBlock <em>Presentation Block</em>}</li>
 *   <li>{@link lobj.CorrBlock#getTitleMeta <em>Title Meta</em>}</li>
 *   <li>{@link lobj.CorrBlock#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see lobj.LobjPackage#getCorrBlock()
 * @model extendedMetaData="kind='elementOnly'"
 * @generated
 */
public interface CorrBlock extends EObject {
	/**
	 * Returns the value of the '<em><b>Presentation Block</b></em>' containment reference list.
	 * The list contents are of type {@link lobj.PresentationBlock}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Presentation Block</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Presentation Block</em>' containment reference list.
	 * @see lobj.LobjPackage#getCorrBlock_PresentationBlock()
	 * @model type="lobj.PresentationBlock" containment="true"
	 *        extendedMetaData="kind='element' namespace='##targetNamespace'"
	 *        annotation="http://annotation.elver.org/Indexed value='false'"
	 * @generated
	 */
	EList getPresentationBlock();

	/**
	 * Returns the value of the '<em><b>Title Meta</b></em>' containment reference list.
	 * The list contents are of type {@link lobj.TitleMeta}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title Meta</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title Meta</em>' containment reference list.
	 * @see lobj.LobjPackage#getCorrBlock_TitleMeta()
	 * @model type="lobj.TitleMeta" containment="true"
	 *        extendedMetaData="kind='element' namespace='##targetNamespace'"
	 *        annotation="http://annotation.elver.org/Indexed value='false'"
	 * @generated
	 */
	EList getTitleMeta();

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
	 * @see lobj.LobjPackage#getCorrBlock_Id()
	 * @model unique="false" id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link lobj.CorrBlock#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // CorrBlock

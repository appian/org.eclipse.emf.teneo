/**
 * <copyright>
 * </copyright>
 *
 * $Id: CorrBlock.java,v 1.1 2006/11/23 06:12:08 mtaal Exp $
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
 * </ul>
 * </p>
 *
 * @see lobj.LobjPackage#getCorrBlock()
 * @model extendedMetaData="name='corrBlock' kind='elementOnly'"
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
	 *        extendedMetaData="kind='element' name='presentationBlock' namespace='##targetNamespace'"
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
	 *        extendedMetaData="kind='element' name='categoryDidacMeta' namespace='##targetNamespace'"
	 *        annotation="http://annotation.elver.org/Indexed value='false'"
	 * @generated
	 */
	EList getTitleMeta();

} // CorrBlock
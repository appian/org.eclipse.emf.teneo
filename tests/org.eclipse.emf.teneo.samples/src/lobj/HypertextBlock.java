/**
 * <copyright>
 * </copyright>
 *
 * $Id: HypertextBlock.java,v 1.3 2007/03/28 13:56:50 mtaal Exp $
 */
package lobj;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hypertext Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link lobj.HypertextBlock#getHypertextContent <em>Hypertext Content</em>}</li>
 * </ul>
 * </p>
 *
 * @see lobj.LobjPackage#getHypertextBlock()
 * @model extendedMetaData="kind='elementOnly'"
 * @generated
 */
public interface HypertextBlock extends Block {
	/**
	 * Returns the value of the '<em><b>Hypertext Content</b></em>' containment reference list.
	 * The list contents are of type {@link lobj.HypertextContent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hypertext Content</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hypertext Content</em>' containment reference list.
	 * @see lobj.LobjPackage#getHypertextBlock_HypertextContent()
	 * @model type="lobj.HypertextContent" containment="true"
	 *        extendedMetaData="kind='element' namespace='##targetNamespace'"
	 *        annotation="http://annotation.elver.org/Indexed value='false'"
	 * @generated
	 */
	EList getHypertextContent();

} // HypertextBlock

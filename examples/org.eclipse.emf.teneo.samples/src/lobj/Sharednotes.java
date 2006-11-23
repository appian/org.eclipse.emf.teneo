/**
 * <copyright>
 * </copyright>
 *
 * $Id: Sharednotes.java,v 1.1 2006/11/23 06:12:08 mtaal Exp $
 */
package lobj;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sharednotes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link lobj.Sharednotes#getNotes <em>Notes</em>}</li>
 * </ul>
 * </p>
 *
 * @see lobj.LobjPackage#getSharednotes()
 * @model extendedMetaData="name='sharednotes' kind='elementOnly'"
 * @generated
 */
public interface Sharednotes extends EObject {
	/**
	 * Returns the value of the '<em><b>Notes</b></em>' containment reference list.
	 * The list contents are of type {@link lobj.Note}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Notes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notes</em>' containment reference list.
	 * @see lobj.LobjPackage#getSharednotes_Notes()
	 * @model type="lobj.Note" containment="true"
	 *        extendedMetaData="kind='element' name='note' namespace='##targetNamespace'"
	 *        annotation="http://annotation.elver.org/Indexed value='false'"
	 * @generated
	 */
	EList getNotes();

} // Sharednotes
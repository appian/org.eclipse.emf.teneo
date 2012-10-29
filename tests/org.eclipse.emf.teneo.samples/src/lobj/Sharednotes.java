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
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Sharednotes</b></em>'. <!--
 * end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link lobj.Sharednotes#getNotes <em>Notes</em>}</li>
 * <li>{@link lobj.Sharednotes#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 * 
 * @see lobj.LobjPackage#getSharednotes()
 * @model extendedMetaData="kind='elementOnly'"
 * @generated
 */
public interface Sharednotes extends EObject {
	/**
	 * Returns the value of the '<em><b>Notes</b></em>' containment reference list. The list contents
	 * are of type {@link lobj.Note}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Notes</em>' containment reference list isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Notes</em>' containment reference list.
	 * @see lobj.LobjPackage#getSharednotes_Notes()
	 * @model type="lobj.Note" containment="true"
	 *        extendedMetaData="kind='element' namespace='##targetNamespace'"
	 *        annotation="http://annotation.elver.org/Indexed value='false'"
	 * @generated
	 */
	EList getNotes();

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
	 * @see lobj.LobjPackage#getSharednotes_Id()
	 * @model unique="false" id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link lobj.Sharednotes#getId <em>Id</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // Sharednotes

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package lobj;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Theme</b></em>'. <!--
 * end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link lobj.Theme#getSimpleDidacMeta <em>Simple Didac Meta</em>}</li>
 * </ul>
 * </p>
 * 
 * @see lobj.LobjPackage#getTheme()
 * @model extendedMetaData="kind='elementOnly'"
 * @generated
 */
public interface Theme extends LearningObject {
	/**
	 * Returns the value of the '<em><b>Simple Didac Meta</b></em>' containment reference list. The
	 * list contents are of type {@link lobj.SimpleDidacMeta}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Simple Didac Meta</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Simple Didac Meta</em>' containment reference list.
	 * @see lobj.LobjPackage#getTheme_SimpleDidacMeta()
	 * @model type="lobj.SimpleDidacMeta" containment="true"
	 *        extendedMetaData="kind='element' namespace='##targetNamespace'"
	 *        annotation="http://annotation.elver.org/Indexed value='false'"
	 * @generated
	 */
	EList getSimpleDidacMeta();

} // Theme

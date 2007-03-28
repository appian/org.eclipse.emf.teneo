/**
 * <copyright>
 * </copyright>
 *
 * $Id: ThemeNode.java,v 1.3 2007/03/28 13:56:49 mtaal Exp $
 */
package lobj;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Theme Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link lobj.ThemeNode#getTheme <em>Theme</em>}</li>
 *   <li>{@link lobj.ThemeNode#getChildnodes <em>Childnodes</em>}</li>
 * </ul>
 * </p>
 *
 * @see lobj.LobjPackage#getThemeNode()
 * @model extendedMetaData="kind='elementOnly'"
 * @generated
 */
public interface ThemeNode extends Node {
	/**
	 * Returns the value of the '<em><b>Theme</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Theme</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Theme</em>' containment reference.
	 * @see #setTheme(Theme)
	 * @see lobj.LobjPackage#getThemeNode_Theme()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' namespace='##targetNamespace'"
	 * @generated
	 */
	Theme getTheme();

	/**
	 * Sets the value of the '{@link lobj.ThemeNode#getTheme <em>Theme</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Theme</em>' containment reference.
	 * @see #getTheme()
	 * @generated
	 */
	void setTheme(Theme value);

	/**
	 * Returns the value of the '<em><b>Childnodes</b></em>' containment reference list.
	 * The list contents are of type {@link lobj.Node}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Childnodes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Childnodes</em>' containment reference list.
	 * @see lobj.LobjPackage#getThemeNode_Childnodes()
	 * @model type="lobj.Node" containment="true"
	 *        extendedMetaData="kind='element' namespace='##targetNamespace'"
	 * @generated
	 */
	EList getChildnodes();

} // ThemeNode

/**
 * <copyright>
 * </copyright>
 *
 * $Id: BaseGroup.java,v 1.1 2006/09/21 00:56:52 mtaal Exp $
 */
package main;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Base Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link main.BaseGroup#getComponents <em>Components</em>}</li>
 * </ul>
 * </p>
 *
 * @see main.MainPackage#getBaseGroup()
 * @model
 * @generated
 */
public interface BaseGroup extends BaseComponent {
	/**
	 * Returns the value of the '<em><b>Components</b></em>' containment reference list.
	 * The list contents are of type {@link main.BaseComponent}.
	 * It is bidirectional and its opposite is '{@link main.BaseComponent#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Components</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Components</em>' containment reference list.
	 * @see main.MainPackage#getBaseGroup_Components()
	 * @see main.BaseComponent#getGroup
	 * @model type="main.BaseComponent" opposite="group" containment="true"
	 * @generated
	 */
	EList getComponents();

} // BaseGroup
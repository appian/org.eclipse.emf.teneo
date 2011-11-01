/**
 * <copyright>
 * </copyright>
 *
 * $Id: ApplesRoot.java,v 1.1 2007/07/09 12:55:20 mtaal Exp $
 */
package tc.apple;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Apples Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link tc.apple.ApplesRoot#getFruit <em>Fruit</em>}</li>
 * </ul>
 * </p>
 *
 * @see tc.apple.ApplePackage#getApplesRoot()
 * @model extendedMetaData="name='ApplesRoot' kind='elementOnly'"
 * @generated
 */
public interface ApplesRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Fruit</b></em>' containment reference list.
	 * The list contents are of type {@link tc.apple.Fruit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fruit</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fruit</em>' containment reference list.
	 * @see tc.apple.ApplePackage#getApplesRoot_Fruit()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='fruit' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Fruit> getFruit();

} // ApplesRoot

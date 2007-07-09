/**
 * <copyright>
 * </copyright>
 *
 * $Id: Fruit.java,v 1.1 2007/07/09 12:55:20 mtaal Exp $
 */
package tc.apple;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import tc.tree.BigTree;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fruit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link tc.apple.Fruit#getBigtree <em>Bigtree</em>}</li>
 *   <li>{@link tc.apple.Fruit#getUniqueName <em>Unique Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see tc.apple.ApplePackage#getFruit()
 * @model extendedMetaData="name='Fruit' kind='elementOnly'"
 * @generated
 */
public interface Fruit extends EObject {
	/**
	 * Returns the value of the '<em><b>Bigtree</b></em>' containment reference list.
	 * The list contents are of type {@link tc.tree.BigTree}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bigtree</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bigtree</em>' containment reference list.
	 * @see tc.apple.ApplePackage#getFruit_Bigtree()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='bigtree' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<BigTree> getBigtree();

	/**
	 * Returns the value of the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unique Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unique Name</em>' attribute.
	 * @see #setUniqueName(String)
	 * @see tc.apple.ApplePackage#getFruit_UniqueName()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='uniqueName'"
	 * @generated
	 */
	String getUniqueName();

	/**
	 * Sets the value of the '{@link tc.apple.Fruit#getUniqueName <em>Unique Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unique Name</em>' attribute.
	 * @see #getUniqueName()
	 * @generated
	 */
	void setUniqueName(String value);

} // Fruit

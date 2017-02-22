/**
 */
package org.eclipse.emf.teneo.samples.issues.refreshextra;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Item Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.refreshextra.ItemContainer#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.refreshextra.ItemContainer#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see org.eclipse.emf.teneo.samples.issues.refreshextra.RefreshextraPackage#getItemContainer()
 * @model extendedMetaData="name='Item' kind='elementOnly'"
 * @generated
 */
public interface ItemContainer extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.emf.teneo.samples.issues.refreshextra.RefreshextraPackage#getItemContainer_Name()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.issues.refreshextra.ItemContainer#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.samples.issues.refreshextra.ItemElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see org.eclipse.emf.teneo.samples.issues.refreshextra.RefreshextraPackage#getItemContainer_Elements()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='lineOne'"
	 * @generated
	 */
	EList<ItemElement> getElements();

} // ItemContainer

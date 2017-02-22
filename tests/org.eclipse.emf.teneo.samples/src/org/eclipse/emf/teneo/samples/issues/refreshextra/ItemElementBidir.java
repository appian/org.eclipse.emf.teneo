/**
 */
package org.eclipse.emf.teneo.samples.issues.refreshextra;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Item Element Bidir</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.refreshextra.ItemElementBidir#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.refreshextra.ItemElementBidir#getItem <em>Item</em>}</li>
 * </ul>
 *
 * @see org.eclipse.emf.teneo.samples.issues.refreshextra.RefreshextraPackage#getItemElementBidir()
 * @model extendedMetaData="name='LineOne' kind='elementOnly'"
 * @generated
 */
public interface ItemElementBidir extends EObject {
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
	 * @see org.eclipse.emf.teneo.samples.issues.refreshextra.RefreshextraPackage#getItemElementBidir_Name()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.issues.refreshextra.ItemElementBidir#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Item</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.emf.teneo.samples.issues.refreshextra.ItemContainer2#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Item</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item</em>' container reference.
	 * @see #setItem(ItemContainer2)
	 * @see org.eclipse.emf.teneo.samples.issues.refreshextra.RefreshextraPackage#getItemElementBidir_Item()
	 * @see org.eclipse.emf.teneo.samples.issues.refreshextra.ItemContainer2#getElements
	 * @model opposite="elements" transient="false"
	 * @generated
	 */
	ItemContainer2 getItem();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.issues.refreshextra.ItemElementBidir#getItem <em>Item</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item</em>' container reference.
	 * @see #getItem()
	 * @generated
	 */
	void setItem(ItemContainer2 value);

} // ItemElementBidir

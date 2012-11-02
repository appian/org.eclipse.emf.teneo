/**
 */
package org.eclipse.emf.teneo.samples.issues.simplearray;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.simplearray.SimpleList#getIntArray <em>Int Array</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.simplearray.SimpleList#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.issues.simplearray.SimplearrayPackage#getSimpleList()
 * @model extendedMetaData="name='SimpleList' kind='elementOnly'"
 * @generated
 */
public interface SimpleList extends EObject {
	/**
	 * Returns the value of the '<em><b>Int Array</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Int Array</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Int Array</em>' attribute.
	 * @see #setIntArray(int[])
	 * @see org.eclipse.emf.teneo.samples.issues.simplearray.SimplearrayPackage#getSimpleList_IntArray()
	 * @model dataType="org.eclipse.emf.teneo.samples.issues.simplearray.IntArray" required="true"
	 *        extendedMetaData="kind='element' name='intArray'"
	 * @generated
	 */
	int[] getIntArray();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.issues.simplearray.SimpleList#getIntArray <em>Int Array</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Int Array</em>' attribute.
	 * @see #getIntArray()
	 * @generated
	 */
	void setIntArray(int[] value);

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
	 * @see org.eclipse.emf.teneo.samples.issues.simplearray.SimplearrayPackage#getSimpleList_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.issues.simplearray.SimpleList#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // SimpleList

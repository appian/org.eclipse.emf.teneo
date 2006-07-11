/**
 * <copyright>
 * </copyright>
 *
 * $Id: SupplierType.java,v 1.1 2006/07/11 16:57:17 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.sample.product;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Supplier Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.product.SupplierType#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.product.SupplierType#getNoOfEmployees <em>No Of Employees</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.emf.sample.product.ProductPackage#getSupplierType()
 * @model extendedMetaData="name='SupplierType' kind='elementOnly'"
 * @generated
 */
public interface SupplierType extends EObject {
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
	 * @see org.eclipse.emf.teneo.samples.emf.sample.product.ProductPackage#getSupplierType_Name()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='Name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.product.SupplierType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>No Of Employees</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>No Of Employees</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>No Of Employees</em>' attribute.
	 * @see #isSetNoOfEmployees()
	 * @see #unsetNoOfEmployees()
	 * @see #setNoOfEmployees(int)
	 * @see org.eclipse.emf.teneo.samples.emf.sample.product.ProductPackage#getSupplierType_NoOfEmployees()
	 * @model unique="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int" required="true"
	 *        extendedMetaData="kind='element' name='NoOfEmployees'"
	 * @generated
	 */
	int getNoOfEmployees();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.product.SupplierType#getNoOfEmployees <em>No Of Employees</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>No Of Employees</em>' attribute.
	 * @see #isSetNoOfEmployees()
	 * @see #unsetNoOfEmployees()
	 * @see #getNoOfEmployees()
	 * @generated
	 */
	void setNoOfEmployees(int value);

	/**
	 * Unsets the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.product.SupplierType#getNoOfEmployees <em>No Of Employees</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNoOfEmployees()
	 * @see #getNoOfEmployees()
	 * @see #setNoOfEmployees(int)
	 * @generated
	 */
	void unsetNoOfEmployees();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.product.SupplierType#getNoOfEmployees <em>No Of Employees</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>No Of Employees</em>' attribute is set.
	 * @see #unsetNoOfEmployees()
	 * @see #getNoOfEmployees()
	 * @see #setNoOfEmployees(int)
	 * @generated
	 */
	boolean isSetNoOfEmployees();

} // SupplierType

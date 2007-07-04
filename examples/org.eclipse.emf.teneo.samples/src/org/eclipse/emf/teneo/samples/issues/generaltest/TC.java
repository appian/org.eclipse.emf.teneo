/**
 * <copyright>
 * </copyright>
 *
 * $Id: TC.java,v 1.1 2007/07/04 19:29:56 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.generaltest;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TC</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.generaltest.TC#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.generaltest.TC#getAddress <em>Address</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.issues.generaltest.GeneralTestPackage#getTC()
 * @model
 * @generated
 */
public interface TC extends EObject {
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
	 * @see org.eclipse.emf.teneo.samples.issues.generaltest.GeneralTestPackage#getTC_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.issues.generaltest.TC#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Address</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.emf.teneo.samples.issues.generaltest.Address#getTc <em>Tc</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Address</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address</em>' container reference.
	 * @see #setAddress(Address)
	 * @see org.eclipse.emf.teneo.samples.issues.generaltest.GeneralTestPackage#getTC_Address()
	 * @see org.eclipse.emf.teneo.samples.issues.generaltest.Address#getTc
	 * @model opposite="tc" resolveProxies="false" transient="false"
	 * @generated
	 */
	Address getAddress();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.issues.generaltest.TC#getAddress <em>Address</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' container reference.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(Address value);

} // TC

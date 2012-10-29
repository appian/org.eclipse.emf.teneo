/**
 * <copyright>
 * </copyright>
 *
 * $Id: Library.java,v 1.5 2010/03/03 14:34:11 mtaal Exp $
 */
package org.eclipse.emf.teneo.hibernate.examples.extlibrary;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Library</b></em>'. <!--
 * end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.emf.teneo.hibernate.examples.extlibrary.Library#getName <em>Name</em>}</li>
 * <li>{@link org.eclipse.emf.teneo.hibernate.examples.extlibrary.Library#getWriters <em>Writers
 * </em>}</li>
 * <li>{@link org.eclipse.emf.teneo.hibernate.examples.extlibrary.Library#getEmployees <em>Employees
 * </em>}</li>
 * <li>{@link org.eclipse.emf.teneo.hibernate.examples.extlibrary.Library#getBorrowers <em>Borrowers
 * </em>}</li>
 * <li>{@link org.eclipse.emf.teneo.hibernate.examples.extlibrary.Library#getStock <em>Stock</em>}</li>
 * <li>{@link org.eclipse.emf.teneo.hibernate.examples.extlibrary.Library#getBooks <em>Books</em>}</li>
 * <li>{@link org.eclipse.emf.teneo.hibernate.examples.extlibrary.Library#getPeople <em>People</em>}
 * </li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.emf.teneo.hibernate.examples.extlibrary.ExtlibraryPackage#getLibrary()
 * @model
 * @generated
 */
public interface Library extends Addressable {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.emf.teneo.hibernate.examples.extlibrary.ExtlibraryPackage#getLibrary_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '
	 * {@link org.eclipse.emf.teneo.hibernate.examples.extlibrary.Library#getName <em>Name</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Writers</b></em>' containment reference list. The list
	 * contents are of type {@link org.eclipse.emf.teneo.hibernate.examples.extlibrary.Writer}. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Writers</em>' containment reference list isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Writers</em>' containment reference list.
	 * @see org.eclipse.emf.teneo.hibernate.examples.extlibrary.ExtlibraryPackage#getLibrary_Writers()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="group='#people'" annotation="teneo.jpa value='@IdBag'"
	 * @generated
	 */
	EList<Writer> getWriters();

	/**
	 * Returns the value of the '<em><b>Employees</b></em>' containment reference list. The list
	 * contents are of type {@link org.eclipse.emf.teneo.hibernate.examples.extlibrary.Employee}. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Employees</em>' containment reference list isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Employees</em>' containment reference list.
	 * @see org.eclipse.emf.teneo.hibernate.examples.extlibrary.ExtlibraryPackage#getLibrary_Employees()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="group='#people'"
	 * @generated
	 */
	EList<Employee> getEmployees();

	/**
	 * Returns the value of the '<em><b>Borrowers</b></em>' containment reference list. The list
	 * contents are of type {@link org.eclipse.emf.teneo.hibernate.examples.extlibrary.Borrower}. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Borrowers</em>' containment reference list isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Borrowers</em>' containment reference list.
	 * @see org.eclipse.emf.teneo.hibernate.examples.extlibrary.ExtlibraryPackage#getLibrary_Borrowers()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="group='#people'"
	 * @generated
	 */
	EList<Borrower> getBorrowers();

	/**
	 * Returns the value of the '<em><b>Stock</b></em>' containment reference list. The list contents
	 * are of type {@link org.eclipse.emf.teneo.hibernate.examples.extlibrary.Item}. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stock</em>' containment reference list isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Stock</em>' containment reference list.
	 * @see org.eclipse.emf.teneo.hibernate.examples.extlibrary.ExtlibraryPackage#getLibrary_Stock()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Item> getStock();

	/**
	 * Returns the value of the '<em><b>Books</b></em>' reference list. The list contents are of type
	 * {@link org.eclipse.emf.teneo.hibernate.examples.extlibrary.Book}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Books</em>' reference list isn't clear, there really should be more
	 * of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Books</em>' reference list.
	 * @see org.eclipse.emf.teneo.hibernate.examples.extlibrary.ExtlibraryPackage#getLibrary_Books()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Book> getBooks();

	/**
	 * Returns the value of the '<em><b>People</b></em>' attribute list. The list contents are of type
	 * {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>People</em>' attribute list isn't clear, there really should be more
	 * of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>People</em>' attribute list.
	 * @see org.eclipse.emf.teneo.hibernate.examples.extlibrary.ExtlibraryPackage#getLibrary_People()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group'"
	 * @generated
	 */
	FeatureMap getPeople();

} // Library

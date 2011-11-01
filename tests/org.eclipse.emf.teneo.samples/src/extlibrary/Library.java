/**
 * <copyright>
 * </copyright>
 *
 * $Id: Library.java,v 1.1 2006/08/14 05:08:58 mtaal Exp $
 */
package extlibrary;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Library</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link extlibrary.Library#getName <em>Name</em>}</li>
 *   <li>{@link extlibrary.Library#getWriters <em>Writers</em>}</li>
 *   <li>{@link extlibrary.Library#getEmployees <em>Employees</em>}</li>
 *   <li>{@link extlibrary.Library#getBorrowers <em>Borrowers</em>}</li>
 *   <li>{@link extlibrary.Library#getStock <em>Stock</em>}</li>
 *   <li>{@link extlibrary.Library#getBooks <em>Books</em>}</li>
 *   <li>{@link extlibrary.Library#getBranches <em>Branches</em>}</li>
 *   <li>{@link extlibrary.Library#getParentBranch <em>Parent Branch</em>}</li>
 *   <li>{@link extlibrary.Library#getPeople <em>People</em>}</li>
 * </ul>
 * </p>
 *
 * @see extlibrary.ExtlibraryPackage#getLibrary()
 * @model
 * @generated
 */
public interface Library extends Addressable {
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
	 * @see extlibrary.ExtlibraryPackage#getLibrary_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link extlibrary.Library#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Writers</b></em>' containment reference list.
	 * The list contents are of type {@link extlibrary.Writer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Writers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Writers</em>' containment reference list.
	 * @see extlibrary.ExtlibraryPackage#getLibrary_Writers()
	 * @model type="extlibrary.Writer" containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="group='#people'"
	 * @generated
	 */
	EList getWriters();

	/**
	 * Returns the value of the '<em><b>Employees</b></em>' containment reference list.
	 * The list contents are of type {@link extlibrary.Employee}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Employees</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Employees</em>' containment reference list.
	 * @see extlibrary.ExtlibraryPackage#getLibrary_Employees()
	 * @model type="extlibrary.Employee" containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="group='#people'"
	 * @generated
	 */
	EList getEmployees();

	/**
	 * Returns the value of the '<em><b>Borrowers</b></em>' containment reference list.
	 * The list contents are of type {@link extlibrary.Borrower}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Borrowers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Borrowers</em>' containment reference list.
	 * @see extlibrary.ExtlibraryPackage#getLibrary_Borrowers()
	 * @model type="extlibrary.Borrower" containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="group='#people'"
	 * @generated
	 */
	EList getBorrowers();

	/**
	 * Returns the value of the '<em><b>Stock</b></em>' containment reference list.
	 * The list contents are of type {@link extlibrary.Item}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stock</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stock</em>' containment reference list.
	 * @see extlibrary.ExtlibraryPackage#getLibrary_Stock()
	 * @model type="extlibrary.Item" containment="true" ordered="false"
	 * @generated
	 */
	EList getStock();

	/**
	 * Returns the value of the '<em><b>Books</b></em>' reference list.
	 * The list contents are of type {@link extlibrary.Book}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Books</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Books</em>' reference list.
	 * @see extlibrary.ExtlibraryPackage#getLibrary_Books()
	 * @model type="extlibrary.Book" transient="true" derived="true" ordered="false"
	 * @generated
	 */
	EList getBooks();

	/**
	 * Returns the value of the '<em><b>Branches</b></em>' containment reference list.
	 * The list contents are of type {@link extlibrary.Library}.
	 * It is bidirectional and its opposite is '{@link extlibrary.Library#getParentBranch <em>Parent Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Branches</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Branches</em>' containment reference list.
	 * @see extlibrary.ExtlibraryPackage#getLibrary_Branches()
	 * @see extlibrary.Library#getParentBranch
	 * @model type="extlibrary.Library" opposite="parentBranch" containment="true"
	 * @generated
	 */
	EList getBranches();

	/**
	 * Returns the value of the '<em><b>Parent Branch</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link extlibrary.Library#getBranches <em>Branches</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Branch</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Branch</em>' container reference.
	 * @see #setParentBranch(Library)
	 * @see extlibrary.ExtlibraryPackage#getLibrary_ParentBranch()
	 * @see extlibrary.Library#getBranches
	 * @model opposite="branches"
	 * @generated
	 */
	Library getParentBranch();

	/**
	 * Sets the value of the '{@link extlibrary.Library#getParentBranch <em>Parent Branch</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Branch</em>' container reference.
	 * @see #getParentBranch()
	 * @generated
	 */
	void setParentBranch(Library value);

	/**
	 * Returns the value of the '<em><b>People</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>People</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>People</em>' attribute list.
	 * @see extlibrary.ExtlibraryPackage#getLibrary_People()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group'"
	 * @generated
	 */
	FeatureMap getPeople();

} // Library
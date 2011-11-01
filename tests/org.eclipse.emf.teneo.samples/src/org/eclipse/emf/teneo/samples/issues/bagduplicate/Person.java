/**
 * <copyright>
 * </copyright>
 *
 * $Id: Person.java,v 1.2 2006/11/07 10:22:28 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.bagduplicate;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bagduplicate.Person#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bagduplicate.Person#getFather <em>Father</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bagduplicate.Person#getMother <em>Mother</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bagduplicate.Person#getChildren <em>Children</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.issues.bagduplicate.BagduplicatePackage#getPerson()
 * @model extendedMetaData="name='Person' kind='elementOnly'"
 * @generated
 */
public interface Person extends EObject {
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
	 * @see org.eclipse.emf.teneo.samples.issues.bagduplicate.BagduplicatePackage#getPerson_Name()
	 * @model unique="false" id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='element' name='Name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.issues.bagduplicate.Person#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Father</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Father</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Father</em>' reference.
	 * @see #setFather(Person)
	 * @see org.eclipse.emf.teneo.samples.issues.bagduplicate.BagduplicatePackage#getPerson_Father()
	 * @model resolveProxies="false"
	 *        extendedMetaData="kind='element' name='father'"
	 * @generated
	 */
	Person getFather();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.issues.bagduplicate.Person#getFather <em>Father</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Father</em>' reference.
	 * @see #getFather()
	 * @generated
	 */
	void setFather(Person value);

	/**
	 * Returns the value of the '<em><b>Mother</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mother</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mother</em>' reference.
	 * @see #setMother(Person)
	 * @see org.eclipse.emf.teneo.samples.issues.bagduplicate.BagduplicatePackage#getPerson_Mother()
	 * @model resolveProxies="false"
	 *        extendedMetaData="kind='element' name='mother'"
	 * @generated
	 */
	Person getMother();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.issues.bagduplicate.Person#getMother <em>Mother</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mother</em>' reference.
	 * @see #getMother()
	 * @generated
	 */
	void setMother(Person value);

	/**
	 * Returns the value of the '<em><b>Children</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.samples.issues.bagduplicate.Person}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' reference list.
	 * @see org.eclipse.emf.teneo.samples.issues.bagduplicate.BagduplicatePackage#getPerson_Children()
	 * @model type="org.eclipse.emf.teneo.samples.issues.bagduplicate.Person" resolveProxies="false"
	 *        annotation="teneo.jpa appinfo='\n\t\t\t\t\t\t@OneToMany(unique=false indexed=false)\n\t\t\t\t\t'"
	 *        extendedMetaData="kind='element' name='children'"
	 * @generated
	 */
	EList getChildren();

} // Person

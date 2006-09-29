/**
 * <copyright>
 * </copyright>
 *
 * $Id: Person.java,v 1.2 2006/09/29 12:30:05 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.annotations.toone;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.toone.Person#getAddress <em>Address</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.toone.Person#getHead <em>Head</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.emf.annotations.toone.ToonePackage#getPerson()
 * @model extendedMetaData="name='Person' kind='elementOnly'"
 * @generated
 */
public interface Person extends EObject {
	/**
	 * Returns the value of the '<em><b>Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Address</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address</em>' reference.
	 * @see #setAddress(Address)
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.toone.ToonePackage#getPerson_Address()
	 * @model resolveProxies="false"
	 *        annotation="teneo.jpa appinfo='@ManyToOne(fetch=EAGER cascade={MERGE,PERSIST,REFRESH} targetEntity=\"Address\" optional=true)'"
	 *        extendedMetaData="kind='element' name='address'"
	 * @generated
	 */
	Address getAddress();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.annotations.toone.Person#getAddress <em>Address</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' reference.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(Address value);

	/**
	 * Returns the value of the '<em><b>Head</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.emf.teneo.samples.emf.annotations.toone.Head#getPerson <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Head</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Head</em>' reference.
	 * @see #setHead(Head)
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.toone.ToonePackage#getPerson_Head()
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.toone.Head#getPerson
	 * @model opposite="person" resolveProxies="false"
	 *        annotation="teneo.jpa appinfo='@OneToOne(fetch=EAGER cascade=ALL targetEntity=\"Head\" optional=true)'"
	 *        extendedMetaData="kind='element' name='head'"
	 * @generated
	 */
	Head getHead();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.annotations.toone.Person#getHead <em>Head</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Head</em>' reference.
	 * @see #getHead()
	 * @generated
	 */
	void setHead(Head value);

} // Person

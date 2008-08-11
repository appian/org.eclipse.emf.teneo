/**
 * <copyright>
 * </copyright>
 *
 * $Id: City.java,v 1.3 2008/08/11 20:40:39 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.annotations.hibernate;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>City</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.hibernate.City#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.hibernate.City#getStreets <em>Streets</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.emf.annotations.hibernate.HibernatePackage#getCity()
 * @model annotation="teneo.jpa appinfo='@Entity(name=\"Stad\")'"
 * @generated
 */
public interface City extends EObject {
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
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.hibernate.HibernatePackage#getCity_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='title'"
	 *        annotation="teneo.jpa value='@Id'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.annotations.hibernate.City#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Streets</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.samples.emf.annotations.hibernate.Street}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.emf.teneo.samples.emf.annotations.hibernate.Street#getCity <em>City</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Streets</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Streets</em>' containment reference list.
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.hibernate.HibernatePackage#getCity_Streets()
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.hibernate.Street#getCity
	 * @model opposite="city" containment="true"
	 *        annotation="teneo.jpa appinfo='@NotFound(action=IGNORE)\n@OneToMany(mappedBy=\"city\", indexed=false)\n@JoinColumn(name=\"CITY_FK\", nullable=false)\n'"
	 * @generated
	 */
	EList<Street> getStreets();

} // City

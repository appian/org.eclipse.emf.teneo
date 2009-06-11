/**
 * <copyright>
 * </copyright>
 *
 * $Id: City.java,v 1.1.2.1 2009/06/11 04:50:51 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.hibernate.usertype;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>City</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.hibernate.usertype.City#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.hibernate.usertype.City#getSize <em>Size</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.emf.hibernate.usertype.UsertypePackage#getCity()
 * @model
 * @generated
 */
public interface City extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(long)
	 * @see org.eclipse.emf.teneo.samples.emf.hibernate.usertype.UsertypePackage#getCity_Id()
	 * @model default="0" id="true"
	 *        annotation="teneo.jpa value='@GeneratedValue(strategy=\"ASSIGNED\")'"
	 * @generated
	 */
	long getId();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.hibernate.usertype.City#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(long value);

	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * The default value is <code>"MEDIUM"</code>.
	 * The literals are from the enumeration {@link org.eclipse.emf.teneo.samples.emf.hibernate.usertype.CitySize}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see org.eclipse.emf.teneo.samples.emf.hibernate.usertype.CitySize
	 * @see #isSetSize()
	 * @see #unsetSize()
	 * @see #setSize(CitySize)
	 * @see org.eclipse.emf.teneo.samples.emf.hibernate.usertype.UsertypePackage#getCity_Size()
	 * @model default="MEDIUM" unsettable="true"
	 * @generated
	 */
	CitySize getSize();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.hibernate.usertype.City#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see org.eclipse.emf.teneo.samples.emf.hibernate.usertype.CitySize
	 * @see #isSetSize()
	 * @see #unsetSize()
	 * @see #getSize()
	 * @generated
	 */
	void setSize(CitySize value);

	/**
	 * Unsets the value of the '{@link org.eclipse.emf.teneo.samples.emf.hibernate.usertype.City#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSize()
	 * @see #getSize()
	 * @see #setSize(CitySize)
	 * @generated
	 */
	void unsetSize();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.teneo.samples.emf.hibernate.usertype.City#getSize <em>Size</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Size</em>' attribute is set.
	 * @see #unsetSize()
	 * @see #getSize()
	 * @see #setSize(CitySize)
	 * @generated
	 */
	boolean isSetSize();

} // City

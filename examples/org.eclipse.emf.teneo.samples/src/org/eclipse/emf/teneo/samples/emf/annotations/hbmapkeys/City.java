/**
 * <copyright>
 * </copyright>
 *
 * $Id: City.java,v 1.1 2008/07/06 16:25:35 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.annotations.hbmapkeys;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>City</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.hbmapkeys.City#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.hbmapkeys.City#getCityWriter <em>City Writer</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.emf.annotations.hbmapkeys.HbmapkeysPackage#getCity()
 * @model extendedMetaData="name='City' kind='elementOnly'"
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
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.hbmapkeys.HbmapkeysPackage#getCity_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.annotations.hbmapkeys.City#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>City Writer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>City Writer</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>City Writer</em>' reference.
	 * @see #setCityWriter(Writer)
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.hbmapkeys.HbmapkeysPackage#getCity_CityWriter()
	 * @model resolveProxies="false" required="true"
	 *        annotation="teneo.jpa appinfo='\n\t\t\t\t\t\t@JoinColumn(name=\"THE_CITYWRITER_ID\")\n\t\t\t\t\t'"
	 *        extendedMetaData="kind='element' name='cityWriter'"
	 * @generated
	 */
	Writer getCityWriter();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.annotations.hbmapkeys.City#getCityWriter <em>City Writer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>City Writer</em>' reference.
	 * @see #getCityWriter()
	 * @generated
	 */
	void setCityWriter(Writer value);

} // City

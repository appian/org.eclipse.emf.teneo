/**
 * <copyright>
 * </copyright>
 *
 * $Id: SpecificCustomer.java,v 1.1 2008/03/10 22:19:03 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.abstractsuper;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specific Customer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.abstractsuper.SpecificCustomer#getSpecificName <em>Specific Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.issues.abstractsuper.AbstractsuperPackage#getSpecificCustomer()
 * @model extendedMetaData="name='Price' kind='elementOnly'"
 * @generated
 */
public interface SpecificCustomer extends Customer {
	/**
	 * Returns the value of the '<em><b>Specific Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specific Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specific Name</em>' attribute.
	 * @see #setSpecificName(String)
	 * @see org.eclipse.emf.teneo.samples.issues.abstractsuper.AbstractsuperPackage#getSpecificCustomer_SpecificName()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='name'"
	 * @generated
	 */
	String getSpecificName();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.issues.abstractsuper.SpecificCustomer#getSpecificName <em>Specific Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specific Name</em>' attribute.
	 * @see #getSpecificName()
	 * @generated
	 */
	void setSpecificName(String value);

} // SpecificCustomer

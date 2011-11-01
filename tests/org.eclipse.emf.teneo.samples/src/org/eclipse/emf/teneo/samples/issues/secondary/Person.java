/**
 * <copyright>
 * </copyright>
 *
 * $Id: Person.java,v 1.1 2008/06/10 05:25:51 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.secondary;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.secondary.Person#getAddress <em>Address</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.secondary.Person#getPhoto <em>Photo</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.issues.secondary.SecondaryPackage#getPerson()
 * @model annotation="teneo.jpa appinfo='@SecondaryTables({\n\t\t\t\t@SecondaryTable(name=\"person_address\"),\n\t\t\t\t@SecondaryTable(name=\"person_photo\")})'"
 *        extendedMetaData="name='Person' kind='elementOnly'"
 * @generated
 */
public interface Person extends Generic {
	/**
	 * Returns the value of the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Address</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address</em>' attribute.
	 * @see #setAddress(String)
	 * @see org.eclipse.emf.teneo.samples.issues.secondary.SecondaryPackage#getPerson_Address()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        annotation="teneo.jpa appinfo='@Lob\n\t\t\t\t\t@Column(table=\"person_address\")'"
	 *        extendedMetaData="kind='element' name='address'"
	 * @generated
	 */
	String getAddress();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.issues.secondary.Person#getAddress <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' attribute.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(String value);

	/**
	 * Returns the value of the '<em><b>Photo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Photo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Photo</em>' attribute.
	 * @see #setPhoto(byte[])
	 * @see org.eclipse.emf.teneo.samples.issues.secondary.SecondaryPackage#getPerson_Photo()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Base64Binary"
	 *        annotation="teneo.jpa appinfo='@Lob\n\t\t\t\t\t@Column(table=\"person_photo\" length=\"1000000\")'"
	 *        extendedMetaData="kind='element' name='photo'"
	 * @generated
	 */
	byte[] getPhoto();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.issues.secondary.Person#getPhoto <em>Photo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Photo</em>' attribute.
	 * @see #getPhoto()
	 * @generated
	 */
	void setPhoto(byte[] value);

} // Person

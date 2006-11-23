/**
 * <copyright>
 * </copyright>
 *
 * $Id: Person.java,v 1.1 2006/11/23 06:12:08 mtaal Exp $
 */
package lobj;

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
 *   <li>{@link lobj.Person#getHonorific <em>Honorific</em>}</li>
 *   <li>{@link lobj.Person#getFirstname <em>Firstname</em>}</li>
 *   <li>{@link lobj.Person#getSurname <em>Surname</em>}</li>
 *   <li>{@link lobj.Person#getContrib <em>Contrib</em>}</li>
 *   <li>{@link lobj.Person#getAffiliations <em>Affiliations</em>}</li>
 *   <li>{@link lobj.Person#getPersonblurb <em>Personblurb</em>}</li>
 * </ul>
 * </p>
 *
 * @see lobj.LobjPackage#getPerson()
 * @model extendedMetaData="name='person' kind='elementOnly'"
 * @generated
 */
public interface Person extends EObject {
	/**
	 * Returns the value of the '<em><b>Honorific</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Honorific</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Honorific</em>' attribute.
	 * @see #setHonorific(String)
	 * @see lobj.LobjPackage#getPerson_Honorific()
	 * @model unique="false"
	 *        extendedMetaData="kind='element' name='honorific' namespace='##targetNamespace'"
	 * @generated
	 */
	String getHonorific();

	/**
	 * Sets the value of the '{@link lobj.Person#getHonorific <em>Honorific</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Honorific</em>' attribute.
	 * @see #getHonorific()
	 * @generated
	 */
	void setHonorific(String value);

	/**
	 * Returns the value of the '<em><b>Firstname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Firstname</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Firstname</em>' attribute.
	 * @see #setFirstname(String)
	 * @see lobj.LobjPackage#getPerson_Firstname()
	 * @model unique="false" required="true"
	 *        extendedMetaData="kind='element' name='firstname' namespace='##targetNamespace'"
	 * @generated
	 */
	String getFirstname();

	/**
	 * Sets the value of the '{@link lobj.Person#getFirstname <em>Firstname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Firstname</em>' attribute.
	 * @see #getFirstname()
	 * @generated
	 */
	void setFirstname(String value);

	/**
	 * Returns the value of the '<em><b>Surname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Surname</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Surname</em>' attribute.
	 * @see #setSurname(String)
	 * @see lobj.LobjPackage#getPerson_Surname()
	 * @model unique="false" required="true"
	 *        extendedMetaData="kind='element' name='surname' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSurname();

	/**
	 * Sets the value of the '{@link lobj.Person#getSurname <em>Surname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Surname</em>' attribute.
	 * @see #getSurname()
	 * @generated
	 */
	void setSurname(String value);

	/**
	 * Returns the value of the '<em><b>Contrib</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contrib</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contrib</em>' attribute.
	 * @see #setContrib(String)
	 * @see lobj.LobjPackage#getPerson_Contrib()
	 * @model unique="false"
	 *        extendedMetaData="kind='element' name='contrib' namespace='##targetNamespace'"
	 * @generated
	 */
	String getContrib();

	/**
	 * Sets the value of the '{@link lobj.Person#getContrib <em>Contrib</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contrib</em>' attribute.
	 * @see #getContrib()
	 * @generated
	 */
	void setContrib(String value);

	/**
	 * Returns the value of the '<em><b>Affiliations</b></em>' containment reference list.
	 * The list contents are of type {@link lobj.Affiliation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Affiliations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Affiliations</em>' containment reference list.
	 * @see lobj.LobjPackage#getPerson_Affiliations()
	 * @model type="lobj.Affiliation" containment="true"
	 *        extendedMetaData="kind='element' name='affiliation' namespace='##targetNamespace'"
	 *        annotation="http://annotation.elver.org/Indexed value='false'"
	 * @generated
	 */
	EList getAffiliations();

	/**
	 * Returns the value of the '<em><b>Personblurb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Personblurb</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Personblurb</em>' attribute.
	 * @see #setPersonblurb(String)
	 * @see lobj.LobjPackage#getPerson_Personblurb()
	 * @model unique="false"
	 *        extendedMetaData="kind='element' name='personblurb' namespace='##targetNamespace'"
	 * @generated
	 */
	String getPersonblurb();

	/**
	 * Sets the value of the '{@link lobj.Person#getPersonblurb <em>Personblurb</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Personblurb</em>' attribute.
	 * @see #getPersonblurb()
	 * @generated
	 */
	void setPersonblurb(String value);

} // Person
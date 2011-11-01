/**
 * <copyright>
 * </copyright>
 *
 * $Id: DetachfeaturemapPackage.java,v 1.1 2006/07/11 16:57:05 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.detach.detachfeaturemap;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.teneo.samples.emf.detach.detachfeaturemap.DetachfeaturemapFactory
 * @model kind="package"
 * @generated
 */
public interface DetachfeaturemapPackage extends EPackage{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "detachfeaturemap";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/emf/teneo/store/test/emf/detach/detachfeaturemap";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "detachfeaturemap";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DetachfeaturemapPackage eINSTANCE = org.eclipse.emf.teneo.samples.emf.detach.detachfeaturemap.impl.DetachfeaturemapPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.detach.detachfeaturemap.impl.ContactsImpl <em>Contacts</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.detach.detachfeaturemap.impl.ContactsImpl
	 * @see org.eclipse.emf.teneo.samples.emf.detach.detachfeaturemap.impl.DetachfeaturemapPackageImpl#getContacts()
	 * @generated
	 */
	int CONTACTS = 0;

	/**
	 * The feature id for the '<em><b>Persons</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACTS__PERSONS = 0;

	/**
	 * The number of structural features of the the '<em>Contacts</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACTS_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.detach.detachfeaturemap.impl.PersonImpl <em>Person</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.detach.detachfeaturemap.impl.PersonImpl
	 * @see org.eclipse.emf.teneo.samples.emf.detach.detachfeaturemap.impl.DetachfeaturemapPackageImpl#getPerson()
	 * @generated
	 */
	int PERSON = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__NAME = 0;

	/**
	 * The feature id for the '<em><b>Phones</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__PHONES = 1;

	/**
	 * The feature id for the '<em><b>Office</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__OFFICE = 2;

	/**
	 * The feature id for the '<em><b>Mobile</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__MOBILE = 3;

	/**
	 * The feature id for the '<em><b>Fax</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__FAX = 4;

	/**
	 * The feature id for the '<em><b>Home</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__HOME = 5;

	/**
	 * The number of structural features of the the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_FEATURE_COUNT = 6;


	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.detach.detachfeaturemap.impl.SpecialPersonImpl <em>Special Person</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.detach.detachfeaturemap.impl.SpecialPersonImpl
	 * @see org.eclipse.emf.teneo.samples.emf.detach.detachfeaturemap.impl.DetachfeaturemapPackageImpl#getSpecialPerson()
	 * @generated
	 */
	int SPECIAL_PERSON = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIAL_PERSON__NAME = PERSON__NAME;

	/**
	 * The feature id for the '<em><b>Phones</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIAL_PERSON__PHONES = PERSON__PHONES;

	/**
	 * The feature id for the '<em><b>Office</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIAL_PERSON__OFFICE = PERSON__OFFICE;

	/**
	 * The feature id for the '<em><b>Mobile</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIAL_PERSON__MOBILE = PERSON__MOBILE;

	/**
	 * The feature id for the '<em><b>Fax</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIAL_PERSON__FAX = PERSON__FAX;

	/**
	 * The feature id for the '<em><b>Home</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIAL_PERSON__HOME = PERSON__HOME;

	/**
	 * The number of structural features of the the '<em>Special Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIAL_PERSON_FEATURE_COUNT = PERSON_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.detach.detachfeaturemap.Contacts <em>Contacts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contacts</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.detach.detachfeaturemap.Contacts
	 * @generated
	 */
	EClass getContacts();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.samples.emf.detach.detachfeaturemap.Contacts#getPersons <em>Persons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Persons</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.detach.detachfeaturemap.Contacts#getPersons()
	 * @see #getContacts()
	 * @generated
	 */
	EReference getContacts_Persons();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.detach.detachfeaturemap.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.detach.detachfeaturemap.Person
	 * @generated
	 */
	EClass getPerson();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.detach.detachfeaturemap.Person#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.detach.detachfeaturemap.Person#getName()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Name();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.emf.teneo.samples.emf.detach.detachfeaturemap.Person#getPhones <em>Phones</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Phones</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.detach.detachfeaturemap.Person#getPhones()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Phones();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.emf.teneo.samples.emf.detach.detachfeaturemap.Person#getOffice <em>Office</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Office</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.detach.detachfeaturemap.Person#getOffice()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Office();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.emf.teneo.samples.emf.detach.detachfeaturemap.Person#getMobile <em>Mobile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mobile</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.detach.detachfeaturemap.Person#getMobile()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Mobile();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.emf.teneo.samples.emf.detach.detachfeaturemap.Person#getFax <em>Fax</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Fax</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.detach.detachfeaturemap.Person#getFax()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Fax();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.emf.teneo.samples.emf.detach.detachfeaturemap.Person#getHome <em>Home</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Home</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.detach.detachfeaturemap.Person#getHome()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Home();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.detach.detachfeaturemap.SpecialPerson <em>Special Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Special Person</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.detach.detachfeaturemap.SpecialPerson
	 * @generated
	 */
	EClass getSpecialPerson();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DetachfeaturemapFactory getDetachfeaturemapFactory();

} //DetachfeaturemapPackage

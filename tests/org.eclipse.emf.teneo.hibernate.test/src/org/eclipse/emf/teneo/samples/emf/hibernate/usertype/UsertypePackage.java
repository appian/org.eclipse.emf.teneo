/**
 * <copyright>
 * </copyright>
 *
 * $Id: UsertypePackage.java,v 1.10 2009/06/11 04:59:10 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.hibernate.usertype;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc --> The <b>Package</b> for the model. It contains accessors for the meta
 * objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.teneo.samples.emf.hibernate.usertype.UsertypeFactory
 * @model kind="package"
 *        annotation="teneo.hibernate appinfo='\t\t\t\t\t\t@NamedQuery(name=\"getPersonByBirthPlace2\" query=\"select p from Person p where p.birthPlace=?\")\n\t\t\t\t\t'"
 * @generated
 */
public interface UsertypePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "usertype";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.elver.org/samples/emf/hibernate/usertype";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "usertype";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	UsertypePackage eINSTANCE = org.eclipse.emf.teneo.samples.emf.hibernate.usertype.impl.UsertypePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.hibernate.usertype.impl.PersonImpl <em>Person</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.hibernate.usertype.impl.PersonImpl
	 * @see org.eclipse.emf.teneo.samples.emf.hibernate.usertype.impl.UsertypePackageImpl#getPerson()
	 * @generated
	 */
	int PERSON = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__NAME = 0;

	/**
	 * The feature id for the '<em><b>Numbers</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__NUMBERS = 1;

	/**
	 * The feature id for the '<em><b>Phone Numbers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__PHONE_NUMBERS = 2;

	/**
	 * The feature id for the '<em><b>Emergency Contact</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__EMERGENCY_CONTACT = 3;

	/**
	 * The feature id for the '<em><b>Addresses</b></em>' reference list.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__ADDRESSES = 4;

	/**
	 * The feature id for the '<em><b>Birth Place</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__BIRTH_PLACE = 5;

	/**
	 * The feature id for the '<em><b>Double</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__DOUBLE = 6;

	/**
	 * The feature id for the '<em><b>Certificate</b></em>' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__CERTIFICATE = 7;

	/**
	 * The feature id for the '<em><b>Certificates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__CERTIFICATES = 8;

	/**
	 * The number of structural features of the '<em>Person</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.hibernate.usertype.impl.AddressImpl <em>Address</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.hibernate.usertype.impl.AddressImpl
	 * @see org.eclipse.emf.teneo.samples.emf.hibernate.usertype.impl.UsertypePackageImpl#getAddress()
	 * @generated
	 */
	int ADDRESS = 1;

	/**
	 * The feature id for the '<em><b>Address Info</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__ADDRESS_INFO = 0;

	/**
	 * The feature id for the '<em><b>Person</b></em>' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__PERSON = 1;

	/**
	 * The number of structural features of the '<em>Address</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.hibernate.usertype.impl.CityImpl <em>City</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.hibernate.usertype.impl.CityImpl
	 * @see org.eclipse.emf.teneo.samples.emf.hibernate.usertype.impl.UsertypePackageImpl#getCity()
	 * @generated
	 */
	int CITY = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY__ID = 0;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY__SIZE = 1;

	/**
	 * The number of structural features of the '<em>City</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.hibernate.usertype.impl.CertificateImpl <em>Certificate</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.hibernate.usertype.impl.CertificateImpl
	 * @see org.eclipse.emf.teneo.samples.emf.hibernate.usertype.impl.UsertypePackageImpl#getCertificate()
	 * @generated
	 */
	int CERTIFICATE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERTIFICATE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERTIFICATE__LENGTH = 1;

	/**
	 * The number of structural features of the '<em>Certificate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERTIFICATE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.hibernate.usertype.CitySize <em>City Size</em>}' enum.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.hibernate.usertype.CitySize
	 * @see org.eclipse.emf.teneo.samples.emf.hibernate.usertype.impl.UsertypePackageImpl#getCitySize()
	 * @generated
	 */
	int CITY_SIZE = 4;

	/**
	 * The meta object id for the '<em>Name</em>' data type. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see org.eclipse.emf.teneo.samples.emf.hibernate.usertype.Name
	 * @see org.eclipse.emf.teneo.samples.emf.hibernate.usertype.impl.UsertypePackageImpl#getName_()
	 * @generated
	 */
	int NAME = 5;

	/**
	 * The meta object id for the '<em>Phone Number</em>' data type.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.hibernate.usertype.UsaPhoneNumber
	 * @see org.eclipse.emf.teneo.samples.emf.hibernate.usertype.impl.UsertypePackageImpl#getPhoneNumber()
	 * @generated
	 */
	int PHONE_NUMBER = 6;

	/**
	 * The meta object id for the '<em>Int Array</em>' data type.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.hibernate.usertype.impl.UsertypePackageImpl#getIntArray()
	 * @generated
	 */
	int INT_ARRAY = 7;

	/**
	 * The meta object id for the '<em>my Double Type</em>' data type.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see java.lang.Double
	 * @see org.eclipse.emf.teneo.samples.emf.hibernate.usertype.impl.UsertypePackageImpl#getmyDoubleType()
	 * @generated
	 */
	int MY_DOUBLE_TYPE = 8;

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.emf.teneo.samples.emf.hibernate.usertype.Person <em>Person</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Person</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.hibernate.usertype.Person
	 * @generated
	 */
	EClass getPerson();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.hibernate.usertype.Person#getName <em>Name</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.hibernate.usertype.Person#getName()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.hibernate.usertype.Person#getNumbers <em>Numbers</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Numbers</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.hibernate.usertype.Person#getNumbers()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Numbers();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.emf.teneo.samples.emf.hibernate.usertype.Person#getPhoneNumbers <em>Phone Numbers</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Phone Numbers</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.hibernate.usertype.Person#getPhoneNumbers()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_PhoneNumbers();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.hibernate.usertype.Person#getEmergencyContact <em>Emergency Contact</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Emergency Contact</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.hibernate.usertype.Person#getEmergencyContact()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_EmergencyContact();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.emf.teneo.samples.emf.hibernate.usertype.Person#getAddresses <em>Addresses</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Addresses</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.hibernate.usertype.Person#getAddresses()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_Addresses();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.hibernate.usertype.Person#getBirthPlace <em>Birth Place</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Birth Place</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.hibernate.usertype.Person#getBirthPlace()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_BirthPlace();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.hibernate.usertype.Person#getDouble <em>Double</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Double</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.hibernate.usertype.Person#getDouble()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Double();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.teneo.samples.emf.hibernate.usertype.Person#getCertificate <em>Certificate</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Certificate</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.hibernate.usertype.Person#getCertificate()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_Certificate();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.emf.teneo.samples.emf.hibernate.usertype.Person#getCertificates <em>Certificates</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Certificates</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.hibernate.usertype.Person#getCertificates()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_Certificates();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.emf.teneo.samples.emf.hibernate.usertype.Address <em>Address</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Address</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.hibernate.usertype.Address
	 * @generated
	 */
	EClass getAddress();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.hibernate.usertype.Address#getAddressInfo <em>Address Info</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address Info</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.hibernate.usertype.Address#getAddressInfo()
	 * @see #getAddress()
	 * @generated
	 */
	EAttribute getAddress_AddressInfo();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.teneo.samples.emf.hibernate.usertype.Address#getPerson <em>Person</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Person</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.hibernate.usertype.Address#getPerson()
	 * @see #getAddress()
	 * @generated
	 */
	EReference getAddress_Person();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.emf.teneo.samples.emf.hibernate.usertype.City <em>City</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>City</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.hibernate.usertype.City
	 * @generated
	 */
	EClass getCity();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.emf.teneo.samples.emf.hibernate.usertype.City#getId <em>Id</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.hibernate.usertype.City#getId()
	 * @see #getCity()
	 * @generated
	 */
	EAttribute getCity_Id();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.emf.teneo.samples.emf.hibernate.usertype.City#getSize <em>Size</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.hibernate.usertype.City#getSize()
	 * @see #getCity()
	 * @generated
	 */
	EAttribute getCity_Size();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.hibernate.usertype.Certificate <em>Certificate</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Certificate</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.hibernate.usertype.Certificate
	 * @generated
	 */
	EClass getCertificate();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.hibernate.usertype.Certificate#getName <em>Name</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.hibernate.usertype.Certificate#getName()
	 * @see #getCertificate()
	 * @generated
	 */
	EAttribute getCertificate_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.hibernate.usertype.Certificate#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.hibernate.usertype.Certificate#getLength()
	 * @see #getCertificate()
	 * @generated
	 */
	EAttribute getCertificate_Length();

	/**
	 * Returns the meta object for enum '
	 * {@link org.eclipse.emf.teneo.samples.emf.hibernate.usertype.CitySize <em>City Size</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for enum '<em>City Size</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.hibernate.usertype.CitySize
	 * @generated
	 */
	EEnum getCitySize();

	/**
	 * Returns the meta object for data type '
	 * {@link org.eclipse.emf.teneo.samples.emf.hibernate.usertype.Name <em>Name</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for data type '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.hibernate.usertype.Name
	 * @model instanceClass="org.eclipse.emf.teneo.samples.emf.hibernate.usertype.Name"
	 *        annotation="teneo.jpa appinfo='\n\t\t\t\t\t\t@TypeDef(name=\"nameType\" typeClass=\
	 *        "org.eclipse.emf.teneo.samples.emf.hibernate.usertype.NameType\")\n\t\t\t\t\t\t@Columns(
	 *        {@Column(name=\"first_name\"), 
	 *        @Column(name=\"last_name\")})\n\t\t\t\t\t'" extendedMetaData="name='Name'"
	 * @generated
	 */
	EDataType getName_();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.emf.teneo.samples.emf.hibernate.usertype.UsaPhoneNumber <em>Phone Number</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Phone Number</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.hibernate.usertype.UsaPhoneNumber
	 * @model instanceClass="org.eclipse.emf.teneo.samples.emf.hibernate.usertype.UsaPhoneNumber"
	 * @generated
	 */
	EDataType getPhoneNumber();

/**
	 * Returns the meta object for data type '<em>Int Array</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for data type '<em>Int Array</em>'.
	 * @model instanceClass="int[]" extendedMetaData="name='IntArray'"
	 *        annotation="teneo.jpa
	 *        appinfo='\n\t\t\t\t\t\t@TypeDef(name=\"intArrayType\" typeClass=\
	 *        "org.eclipse.emf.teneo.hibernate.mapping.DefaultToStringUserType\",
	 *        parameters=       {@Parameter(name=\"epackage\"
	 *  
	 *        value=\"http://www.elver.org/samples/emf/hibernate/usertype\"),
	 *        @Parameter(name=\"edatatype\", value=\"IntArray\")})\n\t\t\t\t\t'"
	 * @generated
	 */
	EDataType getIntArray();

	/**
	 * Returns the meta object for data type '{@link java.lang.Double <em>my Double Type</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for data type '<em>my Double Type</em>'.
	 * @see java.lang.Double
	 * @model instanceClass="java.lang.Double" extendedMetaData="name='IntArray'"
	 *        annotation="teneo.jpa appinfo=
	 *        '\n\t\t\t\t\t\t@Type(type=\"org.eclipse.emf.teneo.hibernate.mapping.DefaultToStringUserType\",
	 *        parameters={@Parameter(name=\"epackage\" 
	 *        value=\"http://www.elver.org/samples/emf/hibernate/usertype\"),
	 *        @Parameter(name=\"edatatype\", value=\"myDoubleType\")})\n\t\t\t\t\t'"
	 * @generated
	 */
	EDataType getmyDoubleType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	UsertypeFactory getUsertypeFactory();

	/**
	 * <!-- begin-user-doc --> Defines literals for the meta objects that represent
	 * <ul>
	 * <li>each class,</li>
	 * <li>each feature of each class,</li>
	 * <li>each enum,</li>
	 * <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.emf.hibernate.usertype.impl.PersonImpl <em>Person</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.emf.hibernate.usertype.impl.PersonImpl
		 * @see org.eclipse.emf.teneo.samples.emf.hibernate.usertype.impl.UsertypePackageImpl#getPerson()
		 * @generated
		 */
		EClass PERSON = eINSTANCE.getPerson();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__NAME = eINSTANCE.getPerson_Name();

		/**
		 * The meta object literal for the '<em><b>Numbers</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute PERSON__NUMBERS = eINSTANCE.getPerson_Numbers();

		/**
		 * The meta object literal for the '<em><b>Phone Numbers</b></em>' attribute list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute PERSON__PHONE_NUMBERS = eINSTANCE.getPerson_PhoneNumbers();

		/**
		 * The meta object literal for the '<em><b>Emergency Contact</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute PERSON__EMERGENCY_CONTACT = eINSTANCE.getPerson_EmergencyContact();

		/**
		 * The meta object literal for the '<em><b>Addresses</b></em>' reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference PERSON__ADDRESSES = eINSTANCE.getPerson_Addresses();

		/**
		 * The meta object literal for the '<em><b>Birth Place</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute PERSON__BIRTH_PLACE = eINSTANCE.getPerson_BirthPlace();

		/**
		 * The meta object literal for the '<em><b>Double</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute PERSON__DOUBLE = eINSTANCE.getPerson_Double();

		/**
		 * The meta object literal for the '<em><b>Certificate</b></em>' reference feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference PERSON__CERTIFICATE = eINSTANCE.getPerson_Certificate();

		/**
		 * The meta object literal for the '<em><b>Certificates</b></em>' reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference PERSON__CERTIFICATES = eINSTANCE.getPerson_Certificates();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.emf.hibernate.usertype.impl.AddressImpl <em>Address</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.emf.hibernate.usertype.impl.AddressImpl
		 * @see org.eclipse.emf.teneo.samples.emf.hibernate.usertype.impl.UsertypePackageImpl#getAddress()
		 * @generated
		 */
		EClass ADDRESS = eINSTANCE.getAddress();

		/**
		 * The meta object literal for the '<em><b>Address Info</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute ADDRESS__ADDRESS_INFO = eINSTANCE.getAddress_AddressInfo();

		/**
		 * The meta object literal for the '<em><b>Person</b></em>' reference feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference ADDRESS__PERSON = eINSTANCE.getAddress_Person();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.emf.hibernate.usertype.impl.CityImpl <em>City</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.emf.hibernate.usertype.impl.CityImpl
		 * @see org.eclipse.emf.teneo.samples.emf.hibernate.usertype.impl.UsertypePackageImpl#getCity()
		 * @generated
		 */
		EClass CITY = eINSTANCE.getCity();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CITY__ID = eINSTANCE.getCity_Id();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CITY__SIZE = eINSTANCE.getCity_Size();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.emf.hibernate.usertype.impl.CertificateImpl <em>Certificate</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.emf.hibernate.usertype.impl.CertificateImpl
		 * @see org.eclipse.emf.teneo.samples.emf.hibernate.usertype.impl.UsertypePackageImpl#getCertificate()
		 * @generated
		 */
		EClass CERTIFICATE = eINSTANCE.getCertificate();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CERTIFICATE__NAME = eINSTANCE.getCertificate_Name();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute CERTIFICATE__LENGTH = eINSTANCE.getCertificate_Length();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.emf.hibernate.usertype.CitySize <em>City Size</em>}' enum.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.emf.hibernate.usertype.CitySize
		 * @see org.eclipse.emf.teneo.samples.emf.hibernate.usertype.impl.UsertypePackageImpl#getCitySize()
		 * @generated
		 */
		EEnum CITY_SIZE = eINSTANCE.getCitySize();

		/**
		 * The meta object literal for the '<em>Name</em>' data type.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.emf.hibernate.usertype.Name
		 * @see org.eclipse.emf.teneo.samples.emf.hibernate.usertype.impl.UsertypePackageImpl#getName_()
		 * @generated
		 */
		EDataType NAME = eINSTANCE.getName_();

		/**
		 * The meta object literal for the '<em>Phone Number</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.emf.hibernate.usertype.UsaPhoneNumber
		 * @see org.eclipse.emf.teneo.samples.emf.hibernate.usertype.impl.UsertypePackageImpl#getPhoneNumber()
		 * @generated
		 */
		EDataType PHONE_NUMBER = eINSTANCE.getPhoneNumber();

		/**
		 * The meta object literal for the '<em>Int Array</em>' data type.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.emf.hibernate.usertype.impl.UsertypePackageImpl#getIntArray()
		 * @generated
		 */
		EDataType INT_ARRAY = eINSTANCE.getIntArray();

		/**
		 * The meta object literal for the '<em>my Double Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Double
		 * @see org.eclipse.emf.teneo.samples.emf.hibernate.usertype.impl.UsertypePackageImpl#getmyDoubleType()
		 * @generated
		 */
		EDataType MY_DOUBLE_TYPE = eINSTANCE.getmyDoubleType();

	}

} // UsertypePackage

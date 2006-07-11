/**
 * <copyright>
 * </copyright>
 *
 * $Id: RestrictionPackage.java,v 1.1 2006/07/11 16:57:18 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.schemaconstructs.restriction;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.restriction.RestrictionFactory
 * @model kind="package"
 * @generated
 */
public interface RestrictionPackage extends EPackage{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "restriction";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/emf/teneo/store/test/emf/schemaconstructs/restriction";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "restriction";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RestrictionPackage eINSTANCE = org.eclipse.emf.teneo.samples.emf.schemaconstructs.restriction.impl.RestrictionPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.restriction.impl.XMLDeviantImpl <em>XML Deviant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.restriction.impl.XMLDeviantImpl
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.restriction.impl.RestrictionPackageImpl#getXMLDeviant()
	 * @generated
	 */
	int XML_DEVIANT = 1;

	/**
	 * The feature id for the '<em><b>Num Posts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_DEVIANT__NUM_POSTS = 0;

	/**
	 * The feature id for the '<em><b>Signature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_DEVIANT__SIGNATURE = 1;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_DEVIANT__EMAIL = 2;

	/**
	 * The feature id for the '<em><b>First Subscribed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_DEVIANT__FIRST_SUBSCRIBED = 3;

	/**
	 * The feature id for the '<em><b>Mail Reader</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_DEVIANT__MAIL_READER = 4;

	/**
	 * The number of structural features of the the '<em>XML Deviant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_DEVIANT_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.restriction.impl.MemberImpl <em>Member</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.restriction.impl.MemberImpl
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.restriction.impl.RestrictionPackageImpl#getMember()
	 * @generated
	 */
	int MEMBER = 0;

	/**
	 * The feature id for the '<em><b>Num Posts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__NUM_POSTS = XML_DEVIANT__NUM_POSTS;

	/**
	 * The feature id for the '<em><b>Signature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__SIGNATURE = XML_DEVIANT__SIGNATURE;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__EMAIL = XML_DEVIANT__EMAIL;

	/**
	 * The feature id for the '<em><b>First Subscribed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__FIRST_SUBSCRIBED = XML_DEVIANT__FIRST_SUBSCRIBED;

	/**
	 * The feature id for the '<em><b>Mail Reader</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__MAIL_READER = XML_DEVIANT__MAIL_READER;

	/**
	 * The number of structural features of the the '<em>Member</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_FEATURE_COUNT = XML_DEVIANT_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.restriction.Member <em>Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Member</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.restriction.Member
	 * @generated
	 */
	EClass getMember();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.restriction.XMLDeviant <em>XML Deviant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XML Deviant</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.restriction.XMLDeviant
	 * @generated
	 */
	EClass getXMLDeviant();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.restriction.XMLDeviant#getNumPosts <em>Num Posts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num Posts</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.restriction.XMLDeviant#getNumPosts()
	 * @see #getXMLDeviant()
	 * @generated
	 */
	EAttribute getXMLDeviant_NumPosts();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.restriction.XMLDeviant#getSignature <em>Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Signature</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.restriction.XMLDeviant#getSignature()
	 * @see #getXMLDeviant()
	 * @generated
	 */
	EAttribute getXMLDeviant_Signature();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.restriction.XMLDeviant#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.restriction.XMLDeviant#getEmail()
	 * @see #getXMLDeviant()
	 * @generated
	 */
	EAttribute getXMLDeviant_Email();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.restriction.XMLDeviant#getFirstSubscribed <em>First Subscribed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Subscribed</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.restriction.XMLDeviant#getFirstSubscribed()
	 * @see #getXMLDeviant()
	 * @generated
	 */
	EAttribute getXMLDeviant_FirstSubscribed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.restriction.XMLDeviant#getMailReader <em>Mail Reader</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mail Reader</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.restriction.XMLDeviant#getMailReader()
	 * @see #getXMLDeviant()
	 * @generated
	 */
	EAttribute getXMLDeviant_MailReader();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RestrictionFactory getRestrictionFactory();

} //RestrictionPackage

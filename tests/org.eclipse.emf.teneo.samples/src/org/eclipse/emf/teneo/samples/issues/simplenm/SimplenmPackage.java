/**
 * <copyright>
 * </copyright>
 *
 * $Id: SimplenmPackage.java,v 1.1 2006/07/11 16:57:12 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.simplenm;

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
 * @see org.eclipse.emf.teneo.samples.issues.simplenm.SimplenmFactory
 * @model kind="package"
 * @generated
 */
public interface SimplenmPackage extends EPackage{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "simplenm";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/emf/teneo/store/test/issues/simplenm";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "simplenm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SimplenmPackage eINSTANCE = org.eclipse.emf.teneo.samples.issues.simplenm.impl.SimplenmPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.issues.simplenm.impl.MeImpl <em>Me</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.issues.simplenm.impl.MeImpl
	 * @see org.eclipse.emf.teneo.samples.issues.simplenm.impl.SimplenmPackageImpl#getMe()
	 * @generated
	 */
	int ME = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ME__NAME = 0;

	/**
	 * The feature id for the '<em><b>You</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ME__YOU = 1;

	/**
	 * The number of structural features of the the '<em>Me</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ME_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.issues.simplenm.impl.YouImpl <em>You</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.issues.simplenm.impl.YouImpl
	 * @see org.eclipse.emf.teneo.samples.issues.simplenm.impl.SimplenmPackageImpl#getYou()
	 * @generated
	 */
	int YOU = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YOU__NAME = 0;

	/**
	 * The feature id for the '<em><b>Me</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YOU__ME = 1;

	/**
	 * The number of structural features of the the '<em>You</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YOU_FEATURE_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.issues.simplenm.Me <em>Me</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Me</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.simplenm.Me
	 * @generated
	 */
	EClass getMe();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.simplenm.Me#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.simplenm.Me#getName()
	 * @see #getMe()
	 * @generated
	 */
	EAttribute getMe_Name();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.emf.teneo.samples.issues.simplenm.Me#getYou <em>You</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>You</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.simplenm.Me#getYou()
	 * @see #getMe()
	 * @generated
	 */
	EReference getMe_You();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.issues.simplenm.You <em>You</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>You</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.simplenm.You
	 * @generated
	 */
	EClass getYou();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.simplenm.You#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.simplenm.You#getName()
	 * @see #getYou()
	 * @generated
	 */
	EAttribute getYou_Name();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.emf.teneo.samples.issues.simplenm.You#getMe <em>Me</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Me</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.simplenm.You#getMe()
	 * @see #getYou()
	 * @generated
	 */
	EReference getYou_Me();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SimplenmFactory getSimplenmFactory();

} //SimplenmPackage

/**
 * <copyright>
 * </copyright>
 *
 * $Id: TopclassesPackage.java,v 1.1 2006/07/11 16:56:58 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.topclasses;

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
 * @see org.eclipse.emf.teneo.samples.issues.topclasses.TopclassesFactory
 * @model kind="package"
 * @generated
 */
public interface TopclassesPackage extends EPackage{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "topclasses";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/emf/teneo/store/test/issues/topclasses";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "topclasses";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TopclassesPackage eINSTANCE = org.eclipse.emf.teneo.samples.issues.topclasses.impl.TopclassesPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.issues.topclasses.impl.AbstractSuperImpl <em>Abstract Super</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.issues.topclasses.impl.AbstractSuperImpl
	 * @see org.eclipse.emf.teneo.samples.issues.topclasses.impl.TopclassesPackageImpl#getAbstractSuper()
	 * @generated
	 */
	int ABSTRACT_SUPER = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SUPER__NAME = 0;

	/**
	 * The number of structural features of the the '<em>Abstract Super</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SUPER_FEATURE_COUNT = 1;


	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.issues.topclasses.impl.MImpl <em>M</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.issues.topclasses.impl.MImpl
	 * @see org.eclipse.emf.teneo.samples.issues.topclasses.impl.TopclassesPackageImpl#getM()
	 * @generated
	 */
	int M = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M__NAME = ABSTRACT_SUPER__NAME;

	/**
	 * The feature id for the '<em><b>P</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M__P = ABSTRACT_SUPER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the the '<em>M</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int M_FEATURE_COUNT = ABSTRACT_SUPER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.issues.topclasses.impl.MListImpl <em>MList</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.issues.topclasses.impl.MListImpl
	 * @see org.eclipse.emf.teneo.samples.issues.topclasses.impl.TopclassesPackageImpl#getMList()
	 * @generated
	 */
	int MLIST = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MLIST__NAME = ABSTRACT_SUPER__NAME;

	/**
	 * The feature id for the '<em><b>M</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MLIST__M = ABSTRACT_SUPER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the the '<em>MList</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MLIST_FEATURE_COUNT = ABSTRACT_SUPER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.issues.topclasses.impl.PImpl <em>P</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.issues.topclasses.impl.PImpl
	 * @see org.eclipse.emf.teneo.samples.issues.topclasses.impl.TopclassesPackageImpl#getP()
	 * @generated
	 */
	int P = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int P__NAME = ABSTRACT_SUPER__NAME;

	/**
	 * The feature id for the '<em><b>M</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int P__M = ABSTRACT_SUPER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the the '<em>P</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int P_FEATURE_COUNT = ABSTRACT_SUPER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.issues.topclasses.impl.PListImpl <em>PList</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.issues.topclasses.impl.PListImpl
	 * @see org.eclipse.emf.teneo.samples.issues.topclasses.impl.TopclassesPackageImpl#getPList()
	 * @generated
	 */
	int PLIST = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLIST__NAME = ABSTRACT_SUPER__NAME;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLIST__P = ABSTRACT_SUPER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the the '<em>PList</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLIST_FEATURE_COUNT = ABSTRACT_SUPER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.issues.topclasses.impl.RImpl <em>R</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.issues.topclasses.impl.RImpl
	 * @see org.eclipse.emf.teneo.samples.issues.topclasses.impl.TopclassesPackageImpl#getR()
	 * @generated
	 */
	int R = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int R__NAME = ABSTRACT_SUPER__NAME;

	/**
	 * The feature id for the '<em><b>Plist</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int R__PLIST = ABSTRACT_SUPER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Mlist</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int R__MLIST = ABSTRACT_SUPER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the the '<em>R</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int R_FEATURE_COUNT = ABSTRACT_SUPER_FEATURE_COUNT + 2;

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.issues.topclasses.AbstractSuper <em>Abstract Super</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Super</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.topclasses.AbstractSuper
	 * @generated
	 */
	EClass getAbstractSuper();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.topclasses.AbstractSuper#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.topclasses.AbstractSuper#getName()
	 * @see #getAbstractSuper()
	 * @generated
	 */
	EAttribute getAbstractSuper_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.issues.topclasses.M <em>M</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>M</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.topclasses.M
	 * @generated
	 */
	EClass getM();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.emf.teneo.samples.issues.topclasses.M#getP <em>P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>P</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.topclasses.M#getP()
	 * @see #getM()
	 * @generated
	 */
	EReference getM_P();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.issues.topclasses.MList <em>MList</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MList</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.topclasses.MList
	 * @generated
	 */
	EClass getMList();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.samples.issues.topclasses.MList#getM <em>M</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>M</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.topclasses.MList#getM()
	 * @see #getMList()
	 * @generated
	 */
	EReference getMList_M();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.issues.topclasses.P <em>P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>P</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.topclasses.P
	 * @generated
	 */
	EClass getP();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.emf.teneo.samples.issues.topclasses.P#getM <em>M</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>M</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.topclasses.P#getM()
	 * @see #getP()
	 * @generated
	 */
	EReference getP_M();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.issues.topclasses.PList <em>PList</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PList</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.topclasses.PList
	 * @generated
	 */
	EClass getPList();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.samples.issues.topclasses.PList#getP <em>P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>P</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.topclasses.PList#getP()
	 * @see #getPList()
	 * @generated
	 */
	EReference getPList_P();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.issues.topclasses.R <em>R</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>R</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.topclasses.R
	 * @generated
	 */
	EClass getR();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.samples.issues.topclasses.R#getPlist <em>Plist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Plist</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.topclasses.R#getPlist()
	 * @see #getR()
	 * @generated
	 */
	EReference getR_Plist();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.samples.issues.topclasses.R#getMlist <em>Mlist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mlist</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.topclasses.R#getMlist()
	 * @see #getR()
	 * @generated
	 */
	EReference getR_Mlist();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TopclassesFactory getTopclassesFactory();

} //TopclassesPackage

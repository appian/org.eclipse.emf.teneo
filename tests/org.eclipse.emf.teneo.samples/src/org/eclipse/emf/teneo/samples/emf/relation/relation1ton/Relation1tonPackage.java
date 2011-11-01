/**
 * <copyright>
 * </copyright>
 *
 * $Id: Relation1tonPackage.java,v 1.1 2006/07/11 16:57:14 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.relation.relation1ton;

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
 * @see org.eclipse.emf.teneo.samples.emf.relation.relation1ton.Relation1tonFactory
 * @model kind="package"
 * @generated
 */
public interface Relation1tonPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "relation1ton";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/emf/teneo/samples/emf/relation/relation1ton";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "relation1ton";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Relation1tonPackage eINSTANCE = org.eclipse.emf.teneo.samples.emf.relation.relation1ton.impl.Relation1tonPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.relation.relation1ton.impl.MainImpl <em>Main</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.relation.relation1ton.impl.MainImpl
	 * @see org.eclipse.emf.teneo.samples.emf.relation.relation1ton.impl.Relation1tonPackageImpl#getMain()
	 * @generated
	 */
	int MAIN = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN__NAME = 0;

	/**
	 * The feature id for the '<em><b>Onecr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN__ONECR = 1;

	/**
	 * The feature id for the '<em><b>Onecn</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN__ONECN = 2;

	/**
	 * The feature id for the '<em><b>Onenr</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN__ONENR = 3;

	/**
	 * The feature id for the '<em><b>Onenn</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN__ONENN = 4;

	/**
	 * The feature id for the '<em><b>Twocr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN__TWOCR = 5;

	/**
	 * The feature id for the '<em><b>Twocn</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN__TWOCN = 6;

	/**
	 * The feature id for the '<em><b>Twonr</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN__TWONR = 7;

	/**
	 * The feature id for the '<em><b>Twonn</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN__TWONN = 8;

	/**
	 * The number of structural features of the '<em>Main</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.relation.relation1ton.impl.OneCNImpl <em>One CN</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.relation.relation1ton.impl.OneCNImpl
	 * @see org.eclipse.emf.teneo.samples.emf.relation.relation1ton.impl.Relation1tonPackageImpl#getOneCN()
	 * @generated
	 */
	int ONE_CN = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_CN__NAME = 0;

	/**
	 * The number of structural features of the '<em>One CN</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_CN_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.relation.relation1ton.impl.OneCRImpl <em>One CR</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.relation.relation1ton.impl.OneCRImpl
	 * @see org.eclipse.emf.teneo.samples.emf.relation.relation1ton.impl.Relation1tonPackageImpl#getOneCR()
	 * @generated
	 */
	int ONE_CR = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_CR__NAME = 0;

	/**
	 * The number of structural features of the '<em>One CR</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_CR_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.relation.relation1ton.impl.OneNNImpl <em>One NN</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.relation.relation1ton.impl.OneNNImpl
	 * @see org.eclipse.emf.teneo.samples.emf.relation.relation1ton.impl.Relation1tonPackageImpl#getOneNN()
	 * @generated
	 */
	int ONE_NN = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_NN__NAME = 0;

	/**
	 * The number of structural features of the '<em>One NN</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_NN_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.relation.relation1ton.impl.OneNRImpl <em>One NR</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.relation.relation1ton.impl.OneNRImpl
	 * @see org.eclipse.emf.teneo.samples.emf.relation.relation1ton.impl.Relation1tonPackageImpl#getOneNR()
	 * @generated
	 */
	int ONE_NR = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_NR__NAME = 0;

	/**
	 * The number of structural features of the '<em>One NR</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_NR_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.relation.relation1ton.impl.TwoCNImpl <em>Two CN</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.relation.relation1ton.impl.TwoCNImpl
	 * @see org.eclipse.emf.teneo.samples.emf.relation.relation1ton.impl.Relation1tonPackageImpl#getTwoCN()
	 * @generated
	 */
	int TWO_CN = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWO_CN__NAME = 0;

	/**
	 * The feature id for the '<em><b>Main</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWO_CN__MAIN = 1;

	/**
	 * The number of structural features of the '<em>Two CN</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWO_CN_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.relation.relation1ton.impl.TwoCRImpl <em>Two CR</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.relation.relation1ton.impl.TwoCRImpl
	 * @see org.eclipse.emf.teneo.samples.emf.relation.relation1ton.impl.Relation1tonPackageImpl#getTwoCR()
	 * @generated
	 */
	int TWO_CR = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWO_CR__NAME = 0;

	/**
	 * The feature id for the '<em><b>Main</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWO_CR__MAIN = 1;

	/**
	 * The number of structural features of the '<em>Two CR</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWO_CR_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.relation.relation1ton.impl.TwoNNImpl <em>Two NN</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.relation.relation1ton.impl.TwoNNImpl
	 * @see org.eclipse.emf.teneo.samples.emf.relation.relation1ton.impl.Relation1tonPackageImpl#getTwoNN()
	 * @generated
	 */
	int TWO_NN = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWO_NN__NAME = 0;

	/**
	 * The feature id for the '<em><b>Main</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWO_NN__MAIN = 1;

	/**
	 * The number of structural features of the '<em>Two NN</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWO_NN_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.relation.relation1ton.impl.TwoNRImpl <em>Two NR</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.relation.relation1ton.impl.TwoNRImpl
	 * @see org.eclipse.emf.teneo.samples.emf.relation.relation1ton.impl.Relation1tonPackageImpl#getTwoNR()
	 * @generated
	 */
	int TWO_NR = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWO_NR__NAME = 0;

	/**
	 * The feature id for the '<em><b>Main</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWO_NR__MAIN = 1;

	/**
	 * The number of structural features of the '<em>Two NR</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWO_NR_FEATURE_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.relation.relation1ton.Main <em>Main</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Main</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.relation.relation1ton.Main
	 * @generated
	 */
	EClass getMain();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.relation.relation1ton.Main#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.relation.relation1ton.Main#getName()
	 * @see #getMain()
	 * @generated
	 */
	EAttribute getMain_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.samples.emf.relation.relation1ton.Main#getOnecr <em>Onecr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Onecr</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.relation.relation1ton.Main#getOnecr()
	 * @see #getMain()
	 * @generated
	 */
	EReference getMain_Onecr();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.samples.emf.relation.relation1ton.Main#getOnecn <em>Onecn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Onecn</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.relation.relation1ton.Main#getOnecn()
	 * @see #getMain()
	 * @generated
	 */
	EReference getMain_Onecn();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.emf.teneo.samples.emf.relation.relation1ton.Main#getOnenr <em>Onenr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Onenr</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.relation.relation1ton.Main#getOnenr()
	 * @see #getMain()
	 * @generated
	 */
	EReference getMain_Onenr();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.emf.teneo.samples.emf.relation.relation1ton.Main#getOnenn <em>Onenn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Onenn</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.relation.relation1ton.Main#getOnenn()
	 * @see #getMain()
	 * @generated
	 */
	EReference getMain_Onenn();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.samples.emf.relation.relation1ton.Main#getTwocr <em>Twocr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Twocr</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.relation.relation1ton.Main#getTwocr()
	 * @see #getMain()
	 * @generated
	 */
	EReference getMain_Twocr();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.samples.emf.relation.relation1ton.Main#getTwocn <em>Twocn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Twocn</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.relation.relation1ton.Main#getTwocn()
	 * @see #getMain()
	 * @generated
	 */
	EReference getMain_Twocn();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.emf.teneo.samples.emf.relation.relation1ton.Main#getTwonr <em>Twonr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Twonr</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.relation.relation1ton.Main#getTwonr()
	 * @see #getMain()
	 * @generated
	 */
	EReference getMain_Twonr();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.emf.teneo.samples.emf.relation.relation1ton.Main#getTwonn <em>Twonn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Twonn</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.relation.relation1ton.Main#getTwonn()
	 * @see #getMain()
	 * @generated
	 */
	EReference getMain_Twonn();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.relation.relation1ton.OneCN <em>One CN</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>One CN</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.relation.relation1ton.OneCN
	 * @generated
	 */
	EClass getOneCN();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.relation.relation1ton.OneCN#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.relation.relation1ton.OneCN#getName()
	 * @see #getOneCN()
	 * @generated
	 */
	EAttribute getOneCN_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.relation.relation1ton.OneCR <em>One CR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>One CR</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.relation.relation1ton.OneCR
	 * @generated
	 */
	EClass getOneCR();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.relation.relation1ton.OneCR#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.relation.relation1ton.OneCR#getName()
	 * @see #getOneCR()
	 * @generated
	 */
	EAttribute getOneCR_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.relation.relation1ton.OneNN <em>One NN</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>One NN</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.relation.relation1ton.OneNN
	 * @generated
	 */
	EClass getOneNN();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.relation.relation1ton.OneNN#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.relation.relation1ton.OneNN#getName()
	 * @see #getOneNN()
	 * @generated
	 */
	EAttribute getOneNN_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.relation.relation1ton.OneNR <em>One NR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>One NR</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.relation.relation1ton.OneNR
	 * @generated
	 */
	EClass getOneNR();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.relation.relation1ton.OneNR#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.relation.relation1ton.OneNR#getName()
	 * @see #getOneNR()
	 * @generated
	 */
	EAttribute getOneNR_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.relation.relation1ton.TwoCN <em>Two CN</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Two CN</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.relation.relation1ton.TwoCN
	 * @generated
	 */
	EClass getTwoCN();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.relation.relation1ton.TwoCN#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.relation.relation1ton.TwoCN#getName()
	 * @see #getTwoCN()
	 * @generated
	 */
	EAttribute getTwoCN_Name();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.emf.teneo.samples.emf.relation.relation1ton.TwoCN#getMain <em>Main</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Main</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.relation.relation1ton.TwoCN#getMain()
	 * @see #getTwoCN()
	 * @generated
	 */
	EReference getTwoCN_Main();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.relation.relation1ton.TwoCR <em>Two CR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Two CR</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.relation.relation1ton.TwoCR
	 * @generated
	 */
	EClass getTwoCR();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.relation.relation1ton.TwoCR#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.relation.relation1ton.TwoCR#getName()
	 * @see #getTwoCR()
	 * @generated
	 */
	EAttribute getTwoCR_Name();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.emf.teneo.samples.emf.relation.relation1ton.TwoCR#getMain <em>Main</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Main</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.relation.relation1ton.TwoCR#getMain()
	 * @see #getTwoCR()
	 * @generated
	 */
	EReference getTwoCR_Main();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.relation.relation1ton.TwoNN <em>Two NN</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Two NN</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.relation.relation1ton.TwoNN
	 * @generated
	 */
	EClass getTwoNN();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.relation.relation1ton.TwoNN#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.relation.relation1ton.TwoNN#getName()
	 * @see #getTwoNN()
	 * @generated
	 */
	EAttribute getTwoNN_Name();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.teneo.samples.emf.relation.relation1ton.TwoNN#getMain <em>Main</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Main</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.relation.relation1ton.TwoNN#getMain()
	 * @see #getTwoNN()
	 * @generated
	 */
	EReference getTwoNN_Main();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.relation.relation1ton.TwoNR <em>Two NR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Two NR</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.relation.relation1ton.TwoNR
	 * @generated
	 */
	EClass getTwoNR();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.relation.relation1ton.TwoNR#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.relation.relation1ton.TwoNR#getName()
	 * @see #getTwoNR()
	 * @generated
	 */
	EAttribute getTwoNR_Name();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.teneo.samples.emf.relation.relation1ton.TwoNR#getMain <em>Main</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Main</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.relation.relation1ton.TwoNR#getMain()
	 * @see #getTwoNR()
	 * @generated
	 */
	EReference getTwoNR_Main();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Relation1tonFactory getRelation1tonFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals  {
		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.emf.relation.relation1ton.impl.MainImpl <em>Main</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.emf.relation.relation1ton.impl.MainImpl
		 * @see org.eclipse.emf.teneo.samples.emf.relation.relation1ton.impl.Relation1tonPackageImpl#getMain()
		 * @generated
		 */
		EClass MAIN = eINSTANCE.getMain();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAIN__NAME = eINSTANCE.getMain_Name();

		/**
		 * The meta object literal for the '<em><b>Onecr</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAIN__ONECR = eINSTANCE.getMain_Onecr();

		/**
		 * The meta object literal for the '<em><b>Onecn</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAIN__ONECN = eINSTANCE.getMain_Onecn();

		/**
		 * The meta object literal for the '<em><b>Onenr</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAIN__ONENR = eINSTANCE.getMain_Onenr();

		/**
		 * The meta object literal for the '<em><b>Onenn</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAIN__ONENN = eINSTANCE.getMain_Onenn();

		/**
		 * The meta object literal for the '<em><b>Twocr</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAIN__TWOCR = eINSTANCE.getMain_Twocr();

		/**
		 * The meta object literal for the '<em><b>Twocn</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAIN__TWOCN = eINSTANCE.getMain_Twocn();

		/**
		 * The meta object literal for the '<em><b>Twonr</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAIN__TWONR = eINSTANCE.getMain_Twonr();

		/**
		 * The meta object literal for the '<em><b>Twonn</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAIN__TWONN = eINSTANCE.getMain_Twonn();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.emf.relation.relation1ton.impl.OneCNImpl <em>One CN</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.emf.relation.relation1ton.impl.OneCNImpl
		 * @see org.eclipse.emf.teneo.samples.emf.relation.relation1ton.impl.Relation1tonPackageImpl#getOneCN()
		 * @generated
		 */
		EClass ONE_CN = eINSTANCE.getOneCN();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ONE_CN__NAME = eINSTANCE.getOneCN_Name();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.emf.relation.relation1ton.impl.OneCRImpl <em>One CR</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.emf.relation.relation1ton.impl.OneCRImpl
		 * @see org.eclipse.emf.teneo.samples.emf.relation.relation1ton.impl.Relation1tonPackageImpl#getOneCR()
		 * @generated
		 */
		EClass ONE_CR = eINSTANCE.getOneCR();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ONE_CR__NAME = eINSTANCE.getOneCR_Name();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.emf.relation.relation1ton.impl.OneNNImpl <em>One NN</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.emf.relation.relation1ton.impl.OneNNImpl
		 * @see org.eclipse.emf.teneo.samples.emf.relation.relation1ton.impl.Relation1tonPackageImpl#getOneNN()
		 * @generated
		 */
		EClass ONE_NN = eINSTANCE.getOneNN();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ONE_NN__NAME = eINSTANCE.getOneNN_Name();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.emf.relation.relation1ton.impl.OneNRImpl <em>One NR</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.emf.relation.relation1ton.impl.OneNRImpl
		 * @see org.eclipse.emf.teneo.samples.emf.relation.relation1ton.impl.Relation1tonPackageImpl#getOneNR()
		 * @generated
		 */
		EClass ONE_NR = eINSTANCE.getOneNR();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ONE_NR__NAME = eINSTANCE.getOneNR_Name();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.emf.relation.relation1ton.impl.TwoCNImpl <em>Two CN</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.emf.relation.relation1ton.impl.TwoCNImpl
		 * @see org.eclipse.emf.teneo.samples.emf.relation.relation1ton.impl.Relation1tonPackageImpl#getTwoCN()
		 * @generated
		 */
		EClass TWO_CN = eINSTANCE.getTwoCN();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TWO_CN__NAME = eINSTANCE.getTwoCN_Name();

		/**
		 * The meta object literal for the '<em><b>Main</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TWO_CN__MAIN = eINSTANCE.getTwoCN_Main();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.emf.relation.relation1ton.impl.TwoCRImpl <em>Two CR</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.emf.relation.relation1ton.impl.TwoCRImpl
		 * @see org.eclipse.emf.teneo.samples.emf.relation.relation1ton.impl.Relation1tonPackageImpl#getTwoCR()
		 * @generated
		 */
		EClass TWO_CR = eINSTANCE.getTwoCR();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TWO_CR__NAME = eINSTANCE.getTwoCR_Name();

		/**
		 * The meta object literal for the '<em><b>Main</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TWO_CR__MAIN = eINSTANCE.getTwoCR_Main();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.emf.relation.relation1ton.impl.TwoNNImpl <em>Two NN</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.emf.relation.relation1ton.impl.TwoNNImpl
		 * @see org.eclipse.emf.teneo.samples.emf.relation.relation1ton.impl.Relation1tonPackageImpl#getTwoNN()
		 * @generated
		 */
		EClass TWO_NN = eINSTANCE.getTwoNN();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TWO_NN__NAME = eINSTANCE.getTwoNN_Name();

		/**
		 * The meta object literal for the '<em><b>Main</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TWO_NN__MAIN = eINSTANCE.getTwoNN_Main();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.emf.relation.relation1ton.impl.TwoNRImpl <em>Two NR</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.emf.relation.relation1ton.impl.TwoNRImpl
		 * @see org.eclipse.emf.teneo.samples.emf.relation.relation1ton.impl.Relation1tonPackageImpl#getTwoNR()
		 * @generated
		 */
		EClass TWO_NR = eINSTANCE.getTwoNR();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TWO_NR__NAME = eINSTANCE.getTwoNR_Name();

		/**
		 * The meta object literal for the '<em><b>Main</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TWO_NR__MAIN = eINSTANCE.getTwoNR_Main();

	}

} //Relation1tonPackage

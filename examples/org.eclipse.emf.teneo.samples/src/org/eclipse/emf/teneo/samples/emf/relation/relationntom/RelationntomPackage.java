/**
 * <copyright>
 * </copyright>
 *
 * $Id: RelationntomPackage.java,v 1.1 2006/07/11 16:56:55 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.relation.relationntom;

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
 * @see org.eclipse.emf.teneo.samples.emf.relation.relationntom.RelationntomFactory
 * @model kind="package"
 * @generated
 */
public interface RelationntomPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "relationntom";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/emf/teneo/store/test/emf/relation/relationntom";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "relationntom";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RelationntomPackage eINSTANCE = org.eclipse.emf.teneo.samples.emf.relation.relationntom.impl.RelationntomPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.relation.relationntom.impl.MainImpl <em>Main</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.relation.relationntom.impl.MainImpl
	 * @see org.eclipse.emf.teneo.samples.emf.relation.relationntom.impl.RelationntomPackageImpl#getMain()
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
	 * The feature id for the '<em><b>Multinr</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN__MULTINR = 1;

	/**
	 * The feature id for the '<em><b>Multirn</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN__MULTIRN = 2;

	/**
	 * The feature id for the '<em><b>Multinn</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN__MULTINN = 3;

	/**
	 * The number of structural features of the the '<em>Main</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.relation.relationntom.impl.MultiNNImpl <em>Multi NN</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.relation.relationntom.impl.MultiNNImpl
	 * @see org.eclipse.emf.teneo.samples.emf.relation.relationntom.impl.RelationntomPackageImpl#getMultiNN()
	 * @generated
	 */
	int MULTI_NN = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_NN__NAME = 0;

	/**
	 * The feature id for the '<em><b>Main</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_NN__MAIN = 1;

	/**
	 * The number of structural features of the the '<em>Multi NN</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_NN_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.relation.relationntom.impl.MultiNRImpl <em>Multi NR</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.relation.relationntom.impl.MultiNRImpl
	 * @see org.eclipse.emf.teneo.samples.emf.relation.relationntom.impl.RelationntomPackageImpl#getMultiNR()
	 * @generated
	 */
	int MULTI_NR = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_NR__NAME = 0;

	/**
	 * The feature id for the '<em><b>Main</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_NR__MAIN = 1;

	/**
	 * The number of structural features of the the '<em>Multi NR</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_NR_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.relation.relationntom.impl.MultiRNImpl <em>Multi RN</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.relation.relationntom.impl.MultiRNImpl
	 * @see org.eclipse.emf.teneo.samples.emf.relation.relationntom.impl.RelationntomPackageImpl#getMultiRN()
	 * @generated
	 */
	int MULTI_RN = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_RN__NAME = 0;

	/**
	 * The feature id for the '<em><b>Main</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_RN__MAIN = 1;

	/**
	 * The number of structural features of the the '<em>Multi RN</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_RN_FEATURE_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.relation.relationntom.Main <em>Main</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Main</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.relation.relationntom.Main
	 * @generated
	 */
	EClass getMain();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.relation.relationntom.Main#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.relation.relationntom.Main#getName()
	 * @see #getMain()
	 * @generated
	 */
	EAttribute getMain_Name();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.emf.teneo.samples.emf.relation.relationntom.Main#getMultinr <em>Multinr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Multinr</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.relation.relationntom.Main#getMultinr()
	 * @see #getMain()
	 * @generated
	 */
	EReference getMain_Multinr();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.emf.teneo.samples.emf.relation.relationntom.Main#getMultirn <em>Multirn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Multirn</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.relation.relationntom.Main#getMultirn()
	 * @see #getMain()
	 * @generated
	 */
	EReference getMain_Multirn();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.emf.teneo.samples.emf.relation.relationntom.Main#getMultinn <em>Multinn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Multinn</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.relation.relationntom.Main#getMultinn()
	 * @see #getMain()
	 * @generated
	 */
	EReference getMain_Multinn();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.relation.relationntom.MultiNN <em>Multi NN</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multi NN</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.relation.relationntom.MultiNN
	 * @generated
	 */
	EClass getMultiNN();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.relation.relationntom.MultiNN#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.relation.relationntom.MultiNN#getName()
	 * @see #getMultiNN()
	 * @generated
	 */
	EAttribute getMultiNN_Name();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.emf.teneo.samples.emf.relation.relationntom.MultiNN#getMain <em>Main</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Main</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.relation.relationntom.MultiNN#getMain()
	 * @see #getMultiNN()
	 * @generated
	 */
	EReference getMultiNN_Main();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.relation.relationntom.MultiNR <em>Multi NR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multi NR</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.relation.relationntom.MultiNR
	 * @generated
	 */
	EClass getMultiNR();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.relation.relationntom.MultiNR#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.relation.relationntom.MultiNR#getName()
	 * @see #getMultiNR()
	 * @generated
	 */
	EAttribute getMultiNR_Name();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.emf.teneo.samples.emf.relation.relationntom.MultiNR#getMain <em>Main</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Main</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.relation.relationntom.MultiNR#getMain()
	 * @see #getMultiNR()
	 * @generated
	 */
	EReference getMultiNR_Main();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.relation.relationntom.MultiRN <em>Multi RN</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multi RN</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.relation.relationntom.MultiRN
	 * @generated
	 */
	EClass getMultiRN();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.relation.relationntom.MultiRN#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.relation.relationntom.MultiRN#getName()
	 * @see #getMultiRN()
	 * @generated
	 */
	EAttribute getMultiRN_Name();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.emf.teneo.samples.emf.relation.relationntom.MultiRN#getMain <em>Main</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Main</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.relation.relationntom.MultiRN#getMain()
	 * @see #getMultiRN()
	 * @generated
	 */
	EReference getMultiRN_Main();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RelationntomFactory getRelationntomFactory();

} //RelationntomPackage

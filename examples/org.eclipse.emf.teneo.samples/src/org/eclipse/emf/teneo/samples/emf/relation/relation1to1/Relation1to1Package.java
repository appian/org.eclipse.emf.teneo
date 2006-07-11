/**
 * <copyright>
 * </copyright>
 *
 * $Id: Relation1to1Package.java,v 1.1 2006/07/11 16:57:09 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.relation.relation1to1;

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
 * @see org.eclipse.emf.teneo.samples.emf.relation.relation1to1.Relation1to1Factory
 * @model kind="package"
 * @generated
 */
public interface Relation1to1Package extends EPackage{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "relation1to1";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/emf/teneo/store/test/emf/relation/relation1to1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "relation1to1";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Relation1to1Package eINSTANCE = org.eclipse.emf.teneo.samples.emf.relation.relation1to1.impl.Relation1to1PackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.relation.relation1to1.impl.ContainedChildNRImpl <em>Contained Child NR</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.relation.relation1to1.impl.ContainedChildNRImpl
	 * @see org.eclipse.emf.teneo.samples.emf.relation.relation1to1.impl.Relation1to1PackageImpl#getContainedChildNR()
	 * @generated
	 */
	int CONTAINED_CHILD_NR = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINED_CHILD_NR__NAME = 0;

	/**
	 * The number of structural features of the the '<em>Contained Child NR</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINED_CHILD_NR_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.relation.relation1to1.impl.ContainedChildRImpl <em>Contained Child R</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.relation.relation1to1.impl.ContainedChildRImpl
	 * @see org.eclipse.emf.teneo.samples.emf.relation.relation1to1.impl.Relation1to1PackageImpl#getContainedChildR()
	 * @generated
	 */
	int CONTAINED_CHILD_R = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINED_CHILD_R__NAME = 0;

	/**
	 * The number of structural features of the the '<em>Contained Child R</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINED_CHILD_R_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.relation.relation1to1.impl.MainImpl <em>Main</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.relation.relation1to1.impl.MainImpl
	 * @see org.eclipse.emf.teneo.samples.emf.relation.relation1to1.impl.Relation1to1PackageImpl#getMain()
	 * @generated
	 */
	int MAIN = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN__NAME = 0;

	/**
	 * The feature id for the '<em><b>Containedonewayrequired</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN__CONTAINEDONEWAYREQUIRED = 1;

	/**
	 * The feature id for the '<em><b>Containedone Waynotrequired</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN__CONTAINEDONE_WAYNOTREQUIRED = 2;

	/**
	 * The feature id for the '<em><b>Notcontainedonewayrequired</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN__NOTCONTAINEDONEWAYREQUIRED = 3;

	/**
	 * The feature id for the '<em><b>Notcontainedonewaynotrequired</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN__NOTCONTAINEDONEWAYNOTREQUIRED = 4;

	/**
	 * The feature id for the '<em><b>Notcontainedtwowaynotrequired</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN__NOTCONTAINEDTWOWAYNOTREQUIRED = 5;

	/**
	 * The feature id for the '<em><b>Notcontainedtwowayrequirednr</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN__NOTCONTAINEDTWOWAYREQUIREDNR = 6;

	/**
	 * The feature id for the '<em><b>Notcontainedtwowaynotrequirednr</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN__NOTCONTAINEDTWOWAYNOTREQUIREDNR = 7;

	/**
	 * The number of structural features of the the '<em>Main</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.relation.relation1to1.impl.NotContainedChildNRImpl <em>Not Contained Child NR</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.relation.relation1to1.impl.NotContainedChildNRImpl
	 * @see org.eclipse.emf.teneo.samples.emf.relation.relation1to1.impl.Relation1to1PackageImpl#getNotContainedChildNR()
	 * @generated
	 */
	int NOT_CONTAINED_CHILD_NR = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_CONTAINED_CHILD_NR__NAME = 0;

	/**
	 * The number of structural features of the the '<em>Not Contained Child NR</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_CONTAINED_CHILD_NR_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.relation.relation1to1.impl.NotContainedChildNRTImpl <em>Not Contained Child NRT</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.relation.relation1to1.impl.NotContainedChildNRTImpl
	 * @see org.eclipse.emf.teneo.samples.emf.relation.relation1to1.impl.Relation1to1PackageImpl#getNotContainedChildNRT()
	 * @generated
	 */
	int NOT_CONTAINED_CHILD_NRT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_CONTAINED_CHILD_NRT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Main</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_CONTAINED_CHILD_NRT__MAIN = 1;

	/**
	 * The number of structural features of the the '<em>Not Contained Child NRT</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_CONTAINED_CHILD_NRT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.relation.relation1to1.impl.NotContainedChildNRTNRImpl <em>Not Contained Child NRTNR</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.relation.relation1to1.impl.NotContainedChildNRTNRImpl
	 * @see org.eclipse.emf.teneo.samples.emf.relation.relation1to1.impl.Relation1to1PackageImpl#getNotContainedChildNRTNR()
	 * @generated
	 */
	int NOT_CONTAINED_CHILD_NRTNR = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_CONTAINED_CHILD_NRTNR__NAME = 0;

	/**
	 * The feature id for the '<em><b>Main</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_CONTAINED_CHILD_NRTNR__MAIN = 1;

	/**
	 * The number of structural features of the the '<em>Not Contained Child NRTNR</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_CONTAINED_CHILD_NRTNR_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.relation.relation1to1.impl.NotContainedChildRImpl <em>Not Contained Child R</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.relation.relation1to1.impl.NotContainedChildRImpl
	 * @see org.eclipse.emf.teneo.samples.emf.relation.relation1to1.impl.Relation1to1PackageImpl#getNotContainedChildR()
	 * @generated
	 */
	int NOT_CONTAINED_CHILD_R = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_CONTAINED_CHILD_R__NAME = 0;

	/**
	 * The number of structural features of the the '<em>Not Contained Child R</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_CONTAINED_CHILD_R_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.relation.relation1to1.impl.NotContainedChildRTNRImpl <em>Not Contained Child RTNR</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.relation.relation1to1.impl.NotContainedChildRTNRImpl
	 * @see org.eclipse.emf.teneo.samples.emf.relation.relation1to1.impl.Relation1to1PackageImpl#getNotContainedChildRTNR()
	 * @generated
	 */
	int NOT_CONTAINED_CHILD_RTNR = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_CONTAINED_CHILD_RTNR__NAME = 0;

	/**
	 * The feature id for the '<em><b>Main</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_CONTAINED_CHILD_RTNR__MAIN = 1;

	/**
	 * The number of structural features of the the '<em>Not Contained Child RTNR</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_CONTAINED_CHILD_RTNR_FEATURE_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.relation.relation1to1.ContainedChildNR <em>Contained Child NR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contained Child NR</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.relation.relation1to1.ContainedChildNR
	 * @generated
	 */
	EClass getContainedChildNR();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.relation.relation1to1.ContainedChildNR#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.relation.relation1to1.ContainedChildNR#getName()
	 * @see #getContainedChildNR()
	 * @generated
	 */
	EAttribute getContainedChildNR_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.relation.relation1to1.ContainedChildR <em>Contained Child R</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contained Child R</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.relation.relation1to1.ContainedChildR
	 * @generated
	 */
	EClass getContainedChildR();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.relation.relation1to1.ContainedChildR#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.relation.relation1to1.ContainedChildR#getName()
	 * @see #getContainedChildR()
	 * @generated
	 */
	EAttribute getContainedChildR_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.relation.relation1to1.Main <em>Main</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Main</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.relation.relation1to1.Main
	 * @generated
	 */
	EClass getMain();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.relation.relation1to1.Main#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.relation.relation1to1.Main#getName()
	 * @see #getMain()
	 * @generated
	 */
	EAttribute getMain_Name();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.samples.emf.relation.relation1to1.Main#getContainedonewayrequired <em>Containedonewayrequired</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Containedonewayrequired</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.relation.relation1to1.Main#getContainedonewayrequired()
	 * @see #getMain()
	 * @generated
	 */
	EReference getMain_Containedonewayrequired();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.samples.emf.relation.relation1to1.Main#getContainedoneWaynotrequired <em>Containedone Waynotrequired</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Containedone Waynotrequired</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.relation.relation1to1.Main#getContainedoneWaynotrequired()
	 * @see #getMain()
	 * @generated
	 */
	EReference getMain_ContainedoneWaynotrequired();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.teneo.samples.emf.relation.relation1to1.Main#getNotcontainedonewayrequired <em>Notcontainedonewayrequired</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Notcontainedonewayrequired</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.relation.relation1to1.Main#getNotcontainedonewayrequired()
	 * @see #getMain()
	 * @generated
	 */
	EReference getMain_Notcontainedonewayrequired();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.teneo.samples.emf.relation.relation1to1.Main#getNotcontainedonewaynotrequired <em>Notcontainedonewaynotrequired</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Notcontainedonewaynotrequired</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.relation.relation1to1.Main#getNotcontainedonewaynotrequired()
	 * @see #getMain()
	 * @generated
	 */
	EReference getMain_Notcontainedonewaynotrequired();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.teneo.samples.emf.relation.relation1to1.Main#getNotcontainedtwowaynotrequired <em>Notcontainedtwowaynotrequired</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Notcontainedtwowaynotrequired</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.relation.relation1to1.Main#getNotcontainedtwowaynotrequired()
	 * @see #getMain()
	 * @generated
	 */
	EReference getMain_Notcontainedtwowaynotrequired();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.teneo.samples.emf.relation.relation1to1.Main#getNotcontainedtwowayrequirednr <em>Notcontainedtwowayrequirednr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Notcontainedtwowayrequirednr</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.relation.relation1to1.Main#getNotcontainedtwowayrequirednr()
	 * @see #getMain()
	 * @generated
	 */
	EReference getMain_Notcontainedtwowayrequirednr();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.teneo.samples.emf.relation.relation1to1.Main#getNotcontainedtwowaynotrequirednr <em>Notcontainedtwowaynotrequirednr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Notcontainedtwowaynotrequirednr</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.relation.relation1to1.Main#getNotcontainedtwowaynotrequirednr()
	 * @see #getMain()
	 * @generated
	 */
	EReference getMain_Notcontainedtwowaynotrequirednr();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.relation.relation1to1.NotContainedChildNR <em>Not Contained Child NR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Not Contained Child NR</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.relation.relation1to1.NotContainedChildNR
	 * @generated
	 */
	EClass getNotContainedChildNR();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.relation.relation1to1.NotContainedChildNR#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.relation.relation1to1.NotContainedChildNR#getName()
	 * @see #getNotContainedChildNR()
	 * @generated
	 */
	EAttribute getNotContainedChildNR_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.relation.relation1to1.NotContainedChildNRT <em>Not Contained Child NRT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Not Contained Child NRT</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.relation.relation1to1.NotContainedChildNRT
	 * @generated
	 */
	EClass getNotContainedChildNRT();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.relation.relation1to1.NotContainedChildNRT#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.relation.relation1to1.NotContainedChildNRT#getName()
	 * @see #getNotContainedChildNRT()
	 * @generated
	 */
	EAttribute getNotContainedChildNRT_Name();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.teneo.samples.emf.relation.relation1to1.NotContainedChildNRT#getMain <em>Main</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Main</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.relation.relation1to1.NotContainedChildNRT#getMain()
	 * @see #getNotContainedChildNRT()
	 * @generated
	 */
	EReference getNotContainedChildNRT_Main();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.relation.relation1to1.NotContainedChildNRTNR <em>Not Contained Child NRTNR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Not Contained Child NRTNR</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.relation.relation1to1.NotContainedChildNRTNR
	 * @generated
	 */
	EClass getNotContainedChildNRTNR();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.relation.relation1to1.NotContainedChildNRTNR#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.relation.relation1to1.NotContainedChildNRTNR#getName()
	 * @see #getNotContainedChildNRTNR()
	 * @generated
	 */
	EAttribute getNotContainedChildNRTNR_Name();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.teneo.samples.emf.relation.relation1to1.NotContainedChildNRTNR#getMain <em>Main</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Main</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.relation.relation1to1.NotContainedChildNRTNR#getMain()
	 * @see #getNotContainedChildNRTNR()
	 * @generated
	 */
	EReference getNotContainedChildNRTNR_Main();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.relation.relation1to1.NotContainedChildR <em>Not Contained Child R</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Not Contained Child R</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.relation.relation1to1.NotContainedChildR
	 * @generated
	 */
	EClass getNotContainedChildR();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.relation.relation1to1.NotContainedChildR#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.relation.relation1to1.NotContainedChildR#getName()
	 * @see #getNotContainedChildR()
	 * @generated
	 */
	EAttribute getNotContainedChildR_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.relation.relation1to1.NotContainedChildRTNR <em>Not Contained Child RTNR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Not Contained Child RTNR</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.relation.relation1to1.NotContainedChildRTNR
	 * @generated
	 */
	EClass getNotContainedChildRTNR();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.relation.relation1to1.NotContainedChildRTNR#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.relation.relation1to1.NotContainedChildRTNR#getName()
	 * @see #getNotContainedChildRTNR()
	 * @generated
	 */
	EAttribute getNotContainedChildRTNR_Name();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.teneo.samples.emf.relation.relation1to1.NotContainedChildRTNR#getMain <em>Main</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Main</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.relation.relation1to1.NotContainedChildRTNR#getMain()
	 * @see #getNotContainedChildRTNR()
	 * @generated
	 */
	EReference getNotContainedChildRTNR_Main();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Relation1to1Factory getRelation1to1Factory();

} //Relation1to1Package

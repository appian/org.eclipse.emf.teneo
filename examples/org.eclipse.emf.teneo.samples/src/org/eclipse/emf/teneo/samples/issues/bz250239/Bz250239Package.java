/**
 * <copyright>
 * </copyright>
 *
 * $Id: Bz250239Package.java,v 1.1 2008/10/27 13:18:30 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.bz250239;

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
 * @see org.eclipse.emf.teneo.samples.issues.bz250239.Bz250239Factory
 * @model kind="package"
 *        annotation="teneo.jpa appinfo='\t\t\t@SequenceStyleGenerator(name=\"GENERATORSTYLE\" sequenceName=\"mySequenceStyle\" optimizer=HILO initialValue=5 incrementSize=25)\n\t\t\t@SequenceGenerator(name=\"GENERATOR\" sequenceName=\"mySequenceName\" initialValue=10 allocationSize=100)\n\t\t\t@SequenceGenerator(name=\"GENERATORTWO\" sequenceName=\"myOtherSequenceName\" initialValue=5 allocationSize=50)\n\t\t\t@SequenceGenerator(name=\"mySequence\" sequenceName=\"mySequence\")'"
 * @generated
 */
public interface Bz250239Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "bz250239";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/emf/teneo/samples/issues/bz250239";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "bz250239";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Bz250239Package eINSTANCE = org.eclipse.emf.teneo.samples.issues.bz250239.impl.Bz250239PackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.issues.bz250239.impl.IdentityIDImpl <em>Identity ID</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.issues.bz250239.impl.IdentityIDImpl
	 * @see org.eclipse.emf.teneo.samples.issues.bz250239.impl.Bz250239PackageImpl#getIdentityID()
	 * @generated
	 */
	int IDENTITY_ID = 0;

	/**
	 * The feature id for the '<em><b>Myid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTITY_ID__MYID = 0;

	/**
	 * The number of structural features of the '<em>Identity ID</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTITY_ID_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.issues.bz250239.impl.SimpleIDImpl <em>Simple ID</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.issues.bz250239.impl.SimpleIDImpl
	 * @see org.eclipse.emf.teneo.samples.issues.bz250239.impl.Bz250239PackageImpl#getSimpleID()
	 * @generated
	 */
	int SIMPLE_ID = 1;

	/**
	 * The feature id for the '<em><b>Auto ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ID__AUTO_ID = 0;

	/**
	 * The number of structural features of the '<em>Simple ID</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ID_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.issues.bz250239.impl.TableIDImpl <em>Table ID</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.issues.bz250239.impl.TableIDImpl
	 * @see org.eclipse.emf.teneo.samples.issues.bz250239.impl.Bz250239PackageImpl#getTableID()
	 * @generated
	 */
	int TABLE_ID = 2;

	/**
	 * The feature id for the '<em><b>Myid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ID__MYID = 0;

	/**
	 * The number of structural features of the '<em>Table ID</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ID_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.issues.bz250239.impl.TableGeneratorIDImpl <em>Table Generator ID</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.issues.bz250239.impl.TableGeneratorIDImpl
	 * @see org.eclipse.emf.teneo.samples.issues.bz250239.impl.Bz250239PackageImpl#getTableGeneratorID()
	 * @generated
	 */
	int TABLE_GENERATOR_ID = 3;

	/**
	 * The feature id for the '<em><b>Myid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_GENERATOR_ID__MYID = 0;

	/**
	 * The number of structural features of the '<em>Table Generator ID</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_GENERATOR_ID_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.issues.bz250239.impl.AutoIDImpl <em>Auto ID</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.issues.bz250239.impl.AutoIDImpl
	 * @see org.eclipse.emf.teneo.samples.issues.bz250239.impl.Bz250239PackageImpl#getAutoID()
	 * @generated
	 */
	int AUTO_ID = 4;

	/**
	 * The feature id for the '<em><b>Auto ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTO_ID__AUTO_ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTO_ID__NAME = 1;

	/**
	 * The number of structural features of the '<em>Auto ID</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTO_ID_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.issues.bz250239.impl.OtherTableGeneratorIDImpl <em>Other Table Generator ID</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.issues.bz250239.impl.OtherTableGeneratorIDImpl
	 * @see org.eclipse.emf.teneo.samples.issues.bz250239.impl.Bz250239PackageImpl#getOtherTableGeneratorID()
	 * @generated
	 */
	int OTHER_TABLE_GENERATOR_ID = 5;

	/**
	 * The feature id for the '<em><b>Myid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_TABLE_GENERATOR_ID__MYID = 0;

	/**
	 * The number of structural features of the '<em>Other Table Generator ID</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_TABLE_GENERATOR_ID_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.issues.bz250239.impl.SequenceIDImpl <em>Sequence ID</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.issues.bz250239.impl.SequenceIDImpl
	 * @see org.eclipse.emf.teneo.samples.issues.bz250239.impl.Bz250239PackageImpl#getSequenceID()
	 * @generated
	 */
	int SEQUENCE_ID = 6;

	/**
	 * The feature id for the '<em><b>Myid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_ID__MYID = 0;

	/**
	 * The number of structural features of the '<em>Sequence ID</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_ID_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.issues.bz250239.impl.SequenceStyleIDImpl <em>Sequence Style ID</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.issues.bz250239.impl.SequenceStyleIDImpl
	 * @see org.eclipse.emf.teneo.samples.issues.bz250239.impl.Bz250239PackageImpl#getSequenceStyleID()
	 * @generated
	 */
	int SEQUENCE_STYLE_ID = 7;

	/**
	 * The feature id for the '<em><b>Myid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_STYLE_ID__MYID = 0;

	/**
	 * The number of structural features of the '<em>Sequence Style ID</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_STYLE_ID_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.issues.bz250239.impl.RealSequenceIDImpl <em>Real Sequence ID</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.issues.bz250239.impl.RealSequenceIDImpl
	 * @see org.eclipse.emf.teneo.samples.issues.bz250239.impl.Bz250239PackageImpl#getRealSequenceID()
	 * @generated
	 */
	int REAL_SEQUENCE_ID = 8;

	/**
	 * The feature id for the '<em><b>Myid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_SEQUENCE_ID__MYID = 0;

	/**
	 * The number of structural features of the '<em>Real Sequence ID</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_SEQUENCE_ID_FEATURE_COUNT = 1;


	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.issues.bz250239.IdentityID <em>Identity ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identity ID</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz250239.IdentityID
	 * @generated
	 */
	EClass getIdentityID();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.bz250239.IdentityID#getMyid <em>Myid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Myid</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz250239.IdentityID#getMyid()
	 * @see #getIdentityID()
	 * @generated
	 */
	EAttribute getIdentityID_Myid();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.issues.bz250239.SimpleID <em>Simple ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple ID</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz250239.SimpleID
	 * @generated
	 */
	EClass getSimpleID();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.bz250239.SimpleID#getAutoID <em>Auto ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Auto ID</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz250239.SimpleID#getAutoID()
	 * @see #getSimpleID()
	 * @generated
	 */
	EAttribute getSimpleID_AutoID();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.issues.bz250239.TableID <em>Table ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table ID</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz250239.TableID
	 * @generated
	 */
	EClass getTableID();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.bz250239.TableID#getMyid <em>Myid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Myid</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz250239.TableID#getMyid()
	 * @see #getTableID()
	 * @generated
	 */
	EAttribute getTableID_Myid();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.issues.bz250239.TableGeneratorID <em>Table Generator ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table Generator ID</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz250239.TableGeneratorID
	 * @generated
	 */
	EClass getTableGeneratorID();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.bz250239.TableGeneratorID#getMyid <em>Myid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Myid</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz250239.TableGeneratorID#getMyid()
	 * @see #getTableGeneratorID()
	 * @generated
	 */
	EAttribute getTableGeneratorID_Myid();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.issues.bz250239.AutoID <em>Auto ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Auto ID</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz250239.AutoID
	 * @generated
	 */
	EClass getAutoID();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.bz250239.AutoID#getAutoID <em>Auto ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Auto ID</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz250239.AutoID#getAutoID()
	 * @see #getAutoID()
	 * @generated
	 */
	EAttribute getAutoID_AutoID();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.bz250239.AutoID#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz250239.AutoID#getName()
	 * @see #getAutoID()
	 * @generated
	 */
	EAttribute getAutoID_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.issues.bz250239.OtherTableGeneratorID <em>Other Table Generator ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Other Table Generator ID</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz250239.OtherTableGeneratorID
	 * @generated
	 */
	EClass getOtherTableGeneratorID();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.bz250239.OtherTableGeneratorID#getMyid <em>Myid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Myid</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz250239.OtherTableGeneratorID#getMyid()
	 * @see #getOtherTableGeneratorID()
	 * @generated
	 */
	EAttribute getOtherTableGeneratorID_Myid();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.issues.bz250239.SequenceID <em>Sequence ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequence ID</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz250239.SequenceID
	 * @generated
	 */
	EClass getSequenceID();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.bz250239.SequenceID#getMyid <em>Myid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Myid</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz250239.SequenceID#getMyid()
	 * @see #getSequenceID()
	 * @generated
	 */
	EAttribute getSequenceID_Myid();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.issues.bz250239.SequenceStyleID <em>Sequence Style ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequence Style ID</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz250239.SequenceStyleID
	 * @generated
	 */
	EClass getSequenceStyleID();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.bz250239.SequenceStyleID#getMyid <em>Myid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Myid</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz250239.SequenceStyleID#getMyid()
	 * @see #getSequenceStyleID()
	 * @generated
	 */
	EAttribute getSequenceStyleID_Myid();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.issues.bz250239.RealSequenceID <em>Real Sequence ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Real Sequence ID</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz250239.RealSequenceID
	 * @generated
	 */
	EClass getRealSequenceID();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.bz250239.RealSequenceID#getMyid <em>Myid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Myid</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz250239.RealSequenceID#getMyid()
	 * @see #getRealSequenceID()
	 * @generated
	 */
	EAttribute getRealSequenceID_Myid();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Bz250239Factory getBz250239Factory();

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
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.issues.bz250239.impl.IdentityIDImpl <em>Identity ID</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.issues.bz250239.impl.IdentityIDImpl
		 * @see org.eclipse.emf.teneo.samples.issues.bz250239.impl.Bz250239PackageImpl#getIdentityID()
		 * @generated
		 */
		EClass IDENTITY_ID = eINSTANCE.getIdentityID();

		/**
		 * The meta object literal for the '<em><b>Myid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTITY_ID__MYID = eINSTANCE.getIdentityID_Myid();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.issues.bz250239.impl.SimpleIDImpl <em>Simple ID</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.issues.bz250239.impl.SimpleIDImpl
		 * @see org.eclipse.emf.teneo.samples.issues.bz250239.impl.Bz250239PackageImpl#getSimpleID()
		 * @generated
		 */
		EClass SIMPLE_ID = eINSTANCE.getSimpleID();

		/**
		 * The meta object literal for the '<em><b>Auto ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_ID__AUTO_ID = eINSTANCE.getSimpleID_AutoID();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.issues.bz250239.impl.TableIDImpl <em>Table ID</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.issues.bz250239.impl.TableIDImpl
		 * @see org.eclipse.emf.teneo.samples.issues.bz250239.impl.Bz250239PackageImpl#getTableID()
		 * @generated
		 */
		EClass TABLE_ID = eINSTANCE.getTableID();

		/**
		 * The meta object literal for the '<em><b>Myid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_ID__MYID = eINSTANCE.getTableID_Myid();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.issues.bz250239.impl.TableGeneratorIDImpl <em>Table Generator ID</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.issues.bz250239.impl.TableGeneratorIDImpl
		 * @see org.eclipse.emf.teneo.samples.issues.bz250239.impl.Bz250239PackageImpl#getTableGeneratorID()
		 * @generated
		 */
		EClass TABLE_GENERATOR_ID = eINSTANCE.getTableGeneratorID();

		/**
		 * The meta object literal for the '<em><b>Myid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_GENERATOR_ID__MYID = eINSTANCE.getTableGeneratorID_Myid();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.issues.bz250239.impl.AutoIDImpl <em>Auto ID</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.issues.bz250239.impl.AutoIDImpl
		 * @see org.eclipse.emf.teneo.samples.issues.bz250239.impl.Bz250239PackageImpl#getAutoID()
		 * @generated
		 */
		EClass AUTO_ID = eINSTANCE.getAutoID();

		/**
		 * The meta object literal for the '<em><b>Auto ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTO_ID__AUTO_ID = eINSTANCE.getAutoID_AutoID();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTO_ID__NAME = eINSTANCE.getAutoID_Name();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.issues.bz250239.impl.OtherTableGeneratorIDImpl <em>Other Table Generator ID</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.issues.bz250239.impl.OtherTableGeneratorIDImpl
		 * @see org.eclipse.emf.teneo.samples.issues.bz250239.impl.Bz250239PackageImpl#getOtherTableGeneratorID()
		 * @generated
		 */
		EClass OTHER_TABLE_GENERATOR_ID = eINSTANCE.getOtherTableGeneratorID();

		/**
		 * The meta object literal for the '<em><b>Myid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OTHER_TABLE_GENERATOR_ID__MYID = eINSTANCE.getOtherTableGeneratorID_Myid();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.issues.bz250239.impl.SequenceIDImpl <em>Sequence ID</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.issues.bz250239.impl.SequenceIDImpl
		 * @see org.eclipse.emf.teneo.samples.issues.bz250239.impl.Bz250239PackageImpl#getSequenceID()
		 * @generated
		 */
		EClass SEQUENCE_ID = eINSTANCE.getSequenceID();

		/**
		 * The meta object literal for the '<em><b>Myid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEQUENCE_ID__MYID = eINSTANCE.getSequenceID_Myid();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.issues.bz250239.impl.SequenceStyleIDImpl <em>Sequence Style ID</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.issues.bz250239.impl.SequenceStyleIDImpl
		 * @see org.eclipse.emf.teneo.samples.issues.bz250239.impl.Bz250239PackageImpl#getSequenceStyleID()
		 * @generated
		 */
		EClass SEQUENCE_STYLE_ID = eINSTANCE.getSequenceStyleID();

		/**
		 * The meta object literal for the '<em><b>Myid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEQUENCE_STYLE_ID__MYID = eINSTANCE.getSequenceStyleID_Myid();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.issues.bz250239.impl.RealSequenceIDImpl <em>Real Sequence ID</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.issues.bz250239.impl.RealSequenceIDImpl
		 * @see org.eclipse.emf.teneo.samples.issues.bz250239.impl.Bz250239PackageImpl#getRealSequenceID()
		 * @generated
		 */
		EClass REAL_SEQUENCE_ID = eINSTANCE.getRealSequenceID();

		/**
		 * The meta object literal for the '<em><b>Myid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REAL_SEQUENCE_ID__MYID = eINSTANCE.getRealSequenceID_Myid();

	}

} //Bz250239Package

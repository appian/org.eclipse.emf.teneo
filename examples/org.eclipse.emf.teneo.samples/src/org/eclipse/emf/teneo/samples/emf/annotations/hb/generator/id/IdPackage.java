/**
 * <copyright>
 * </copyright>
 *
 * $Id: IdPackage.java,v 1.1 2006/08/31 22:47:46 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.annotations.hb.generator.id;

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
 * @see org.eclipse.emf.teneo.samples.emf.annotations.hb.generator.id.IdFactory
 * @model kind="package"
 *        annotation="teneo.hibernate appinfo='\n@GenericGenerator(name=\"hibseq\", strategy = \"hilo\",\n    parameters = {\n        @Parameter(name=\"table\", value = \"hilo_table\"),\n        @Parameter(name=\"column\", value=\"the_hilo_column\")\n    }\n)\n\t\t'"
 * @generated
 */
public interface IdPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "id";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/emf/teneo/samples/emf/annotations/hb/generator/id";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "id";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IdPackage eINSTANCE = org.eclipse.emf.teneo.samples.emf.annotations.hb.generator.id.impl.IdPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.annotations.hb.generator.id.impl.IdentityIDImpl <em>Identity ID</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.hb.generator.id.impl.IdentityIDImpl
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.hb.generator.id.impl.IdPackageImpl#getIdentityID()
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
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.annotations.hb.generator.id.impl.SimpleIDImpl <em>Simple ID</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.hb.generator.id.impl.SimpleIDImpl
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.hb.generator.id.impl.IdPackageImpl#getSimpleID()
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
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.annotations.hb.generator.id.impl.TableIDImpl <em>Table ID</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.hb.generator.id.impl.TableIDImpl
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.hb.generator.id.impl.IdPackageImpl#getTableID()
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
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.annotations.hb.generator.id.IdentityID <em>Identity ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identity ID</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.hb.generator.id.IdentityID
	 * @generated
	 */
	EClass getIdentityID();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.annotations.hb.generator.id.IdentityID#getMyid <em>Myid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Myid</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.hb.generator.id.IdentityID#getMyid()
	 * @see #getIdentityID()
	 * @generated
	 */
	EAttribute getIdentityID_Myid();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.annotations.hb.generator.id.SimpleID <em>Simple ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple ID</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.hb.generator.id.SimpleID
	 * @generated
	 */
	EClass getSimpleID();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.annotations.hb.generator.id.SimpleID#getAutoID <em>Auto ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Auto ID</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.hb.generator.id.SimpleID#getAutoID()
	 * @see #getSimpleID()
	 * @generated
	 */
	EAttribute getSimpleID_AutoID();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.annotations.hb.generator.id.TableID <em>Table ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table ID</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.hb.generator.id.TableID
	 * @generated
	 */
	EClass getTableID();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.annotations.hb.generator.id.TableID#getMyid <em>Myid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Myid</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.hb.generator.id.TableID#getMyid()
	 * @see #getTableID()
	 * @generated
	 */
	EAttribute getTableID_Myid();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	IdFactory getIdFactory();

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
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.emf.annotations.hb.generator.id.impl.IdentityIDImpl <em>Identity ID</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.emf.annotations.hb.generator.id.impl.IdentityIDImpl
		 * @see org.eclipse.emf.teneo.samples.emf.annotations.hb.generator.id.impl.IdPackageImpl#getIdentityID()
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
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.emf.annotations.hb.generator.id.impl.SimpleIDImpl <em>Simple ID</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.emf.annotations.hb.generator.id.impl.SimpleIDImpl
		 * @see org.eclipse.emf.teneo.samples.emf.annotations.hb.generator.id.impl.IdPackageImpl#getSimpleID()
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
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.emf.annotations.hb.generator.id.impl.TableIDImpl <em>Table ID</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.emf.annotations.hb.generator.id.impl.TableIDImpl
		 * @see org.eclipse.emf.teneo.samples.emf.annotations.hb.generator.id.impl.IdPackageImpl#getTableID()
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

	}

} //IdPackage

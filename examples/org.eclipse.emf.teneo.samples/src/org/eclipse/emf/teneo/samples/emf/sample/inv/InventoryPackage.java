/**
 * <copyright>
 * </copyright>
 *
 * $Id: InventoryPackage.java,v 1.1 2006/07/11 16:57:04 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.sample.inv;

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
 * @see org.eclipse.emf.teneo.samples.emf.sample.inv.InventoryFactory
 * @model kind="package"
 *        annotation="http://annotation.elver.org/SequenceGenerator name='GENERATOR' sequenceName='IDSEQUENCE'"
 * @generated
 */
public interface InventoryPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "inv";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/emf/teneo/samples/emf/sample/inv";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "inv";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	InventoryPackage eINSTANCE = org.eclipse.emf.teneo.samples.emf.sample.inv.impl.InventoryPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.sample.inv.impl.PTypeImpl <em>PType</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.sample.inv.impl.PTypeImpl
	 * @see org.eclipse.emf.teneo.samples.emf.sample.inv.impl.InventoryPackageImpl#getPType()
	 * @generated
	 */
	int PTYPE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTYPE__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTYPE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Base</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTYPE__BASE = 2;

	/**
	 * The feature id for the '<em><b>Sub Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTYPE__SUB_TYPES = 3;

	/**
	 * The feature id for the '<em><b>Sub NO Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTYPE__SUB_NO_TYPES = 4;

	/**
	 * The feature id for the '<em><b>Info References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTYPE__INFO_REFERENCES = 5;

	/**
	 * The number of structural features of the '<em>PType</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTYPE_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.sample.inv.impl.PDeclarationImpl <em>PDeclaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.sample.inv.impl.PDeclarationImpl
	 * @see org.eclipse.emf.teneo.samples.emf.sample.inv.impl.InventoryPackageImpl#getPDeclaration()
	 * @generated
	 */
	int PDECLARATION = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDECLARATION__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDECLARATION__NAME = 1;

	/**
	 * The number of structural features of the '<em>PDeclaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDECLARATION_FEATURE_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.sample.inv.PType <em>PType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PType</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.inv.PType
	 * @generated
	 */
	EClass getPType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.sample.inv.PType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.inv.PType#getId()
	 * @see #getPType()
	 * @generated
	 */
	EAttribute getPType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.sample.inv.PType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.inv.PType#getName()
	 * @see #getPType()
	 * @generated
	 */
	EAttribute getPType_Name();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.teneo.samples.emf.sample.inv.PType#getBase <em>Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.inv.PType#getBase()
	 * @see #getPType()
	 * @generated
	 */
	EReference getPType_Base();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.emf.teneo.samples.emf.sample.inv.PType#getSubTypes <em>Sub Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sub Types</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.inv.PType#getSubTypes()
	 * @see #getPType()
	 * @generated
	 */
	EReference getPType_SubTypes();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.emf.teneo.samples.emf.sample.inv.PType#getSubNOTypes <em>Sub NO Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sub NO Types</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.inv.PType#getSubNOTypes()
	 * @see #getPType()
	 * @generated
	 */
	EReference getPType_SubNOTypes();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.emf.teneo.samples.emf.sample.inv.PType#getInfoReferences <em>Info References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Info References</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.inv.PType#getInfoReferences()
	 * @see #getPType()
	 * @generated
	 */
	EReference getPType_InfoReferences();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.sample.inv.PDeclaration <em>PDeclaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PDeclaration</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.inv.PDeclaration
	 * @generated
	 */
	EClass getPDeclaration();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.sample.inv.PDeclaration#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.inv.PDeclaration#getId()
	 * @see #getPDeclaration()
	 * @generated
	 */
	EAttribute getPDeclaration_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.sample.inv.PDeclaration#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.inv.PDeclaration#getName()
	 * @see #getPDeclaration()
	 * @generated
	 */
	EAttribute getPDeclaration_Name();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	InventoryFactory getInventoryFactory();

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
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.emf.sample.inv.impl.PTypeImpl <em>PType</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.emf.sample.inv.impl.PTypeImpl
		 * @see org.eclipse.emf.teneo.samples.emf.sample.inv.impl.InventoryPackageImpl#getPType()
		 * @generated
		 */
		EClass PTYPE = eINSTANCE.getPType();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PTYPE__ID = eINSTANCE.getPType_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PTYPE__NAME = eINSTANCE.getPType_Name();

		/**
		 * The meta object literal for the '<em><b>Base</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PTYPE__BASE = eINSTANCE.getPType_Base();

		/**
		 * The meta object literal for the '<em><b>Sub Types</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PTYPE__SUB_TYPES = eINSTANCE.getPType_SubTypes();

		/**
		 * The meta object literal for the '<em><b>Sub NO Types</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PTYPE__SUB_NO_TYPES = eINSTANCE.getPType_SubNOTypes();

		/**
		 * The meta object literal for the '<em><b>Info References</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PTYPE__INFO_REFERENCES = eINSTANCE.getPType_InfoReferences();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.emf.sample.inv.impl.PDeclarationImpl <em>PDeclaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.emf.sample.inv.impl.PDeclarationImpl
		 * @see org.eclipse.emf.teneo.samples.emf.sample.inv.impl.InventoryPackageImpl#getPDeclaration()
		 * @generated
		 */
		EClass PDECLARATION = eINSTANCE.getPDeclaration();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PDECLARATION__ID = eINSTANCE.getPDeclaration_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PDECLARATION__NAME = eINSTANCE.getPDeclaration_Name();

	}

} //InventoryPackage

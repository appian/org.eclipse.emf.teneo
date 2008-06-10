/**
 * <copyright>
 * </copyright>
 *
 * $Id: IntegerdiscriminatorPackage.java,v 1.2 2008/06/10 08:25:05 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.annotations.integerdiscriminator;

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
 * @see org.eclipse.emf.teneo.samples.emf.annotations.integerdiscriminator.IntegerdiscriminatorFactory
 * @model kind="package"
 * @generated
 */
public interface IntegerdiscriminatorPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "integerdiscriminator";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/emf/teneo/samples/emf/annotations/integerdiscriminator";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "integerdiscriminator";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IntegerdiscriminatorPackage eINSTANCE = org.eclipse.emf.teneo.samples.emf.annotations.integerdiscriminator.impl.IntegerdiscriminatorPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.annotations.integerdiscriminator.impl.SuperImpl <em>Super</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.integerdiscriminator.impl.SuperImpl
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.integerdiscriminator.impl.IntegerdiscriminatorPackageImpl#getSuper()
	 * @generated
	 */
	int SUPER = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER__NAME = 0;

	/**
	 * The number of structural features of the '<em>Super</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_FEATURE_COUNT = 1;


	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.annotations.integerdiscriminator.impl.SubImpl <em>Sub</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.integerdiscriminator.impl.SubImpl
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.integerdiscriminator.impl.IntegerdiscriminatorPackageImpl#getSub()
	 * @generated
	 */
	int SUB = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB__NAME = SUPER__NAME;

	/**
	 * The number of structural features of the '<em>Sub</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_FEATURE_COUNT = SUPER_FEATURE_COUNT + 0;


	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.annotations.integerdiscriminator.impl.OtherSubImpl <em>Other Sub</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.integerdiscriminator.impl.OtherSubImpl
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.integerdiscriminator.impl.IntegerdiscriminatorPackageImpl#getOtherSub()
	 * @generated
	 */
	int OTHER_SUB = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_SUB__NAME = SUPER__NAME;

	/**
	 * The number of structural features of the '<em>Other Sub</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_SUB_FEATURE_COUNT = SUPER_FEATURE_COUNT + 0;


	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.annotations.integerdiscriminator.impl.AbstractSubImpl <em>Abstract Sub</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.integerdiscriminator.impl.AbstractSubImpl
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.integerdiscriminator.impl.IntegerdiscriminatorPackageImpl#getAbstractSub()
	 * @generated
	 */
	int ABSTRACT_SUB = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SUB__NAME = SUPER__NAME;

	/**
	 * The number of structural features of the '<em>Abstract Sub</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SUB_FEATURE_COUNT = SUPER_FEATURE_COUNT + 0;


	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.annotations.integerdiscriminator.impl.SuperFormulaImpl <em>Super Formula</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.integerdiscriminator.impl.SuperFormulaImpl
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.integerdiscriminator.impl.IntegerdiscriminatorPackageImpl#getSuperFormula()
	 * @generated
	 */
	int SUPER_FORMULA = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_FORMULA__NAME = 0;

	/**
	 * The number of structural features of the '<em>Super Formula</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_FORMULA_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.annotations.integerdiscriminator.impl.SubFormulaImpl <em>Sub Formula</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.integerdiscriminator.impl.SubFormulaImpl
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.integerdiscriminator.impl.IntegerdiscriminatorPackageImpl#getSubFormula()
	 * @generated
	 */
	int SUB_FORMULA = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_FORMULA__NAME = SUPER_FORMULA__NAME;

	/**
	 * The number of structural features of the '<em>Sub Formula</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_FORMULA_FEATURE_COUNT = SUPER_FORMULA_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.annotations.integerdiscriminator.Super <em>Super</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Super</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.integerdiscriminator.Super
	 * @generated
	 */
	EClass getSuper();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.annotations.integerdiscriminator.Super#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.integerdiscriminator.Super#getName()
	 * @see #getSuper()
	 * @generated
	 */
	EAttribute getSuper_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.annotations.integerdiscriminator.Sub <em>Sub</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.integerdiscriminator.Sub
	 * @generated
	 */
	EClass getSub();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.annotations.integerdiscriminator.OtherSub <em>Other Sub</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Other Sub</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.integerdiscriminator.OtherSub
	 * @generated
	 */
	EClass getOtherSub();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.annotations.integerdiscriminator.AbstractSub <em>Abstract Sub</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Sub</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.integerdiscriminator.AbstractSub
	 * @generated
	 */
	EClass getAbstractSub();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.annotations.integerdiscriminator.SuperFormula <em>Super Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Super Formula</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.integerdiscriminator.SuperFormula
	 * @generated
	 */
	EClass getSuperFormula();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.annotations.integerdiscriminator.SuperFormula#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.integerdiscriminator.SuperFormula#getName()
	 * @see #getSuperFormula()
	 * @generated
	 */
	EAttribute getSuperFormula_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.annotations.integerdiscriminator.SubFormula <em>Sub Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Formula</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.integerdiscriminator.SubFormula
	 * @generated
	 */
	EClass getSubFormula();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	IntegerdiscriminatorFactory getIntegerdiscriminatorFactory();

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
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.emf.annotations.integerdiscriminator.impl.SuperImpl <em>Super</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.emf.annotations.integerdiscriminator.impl.SuperImpl
		 * @see org.eclipse.emf.teneo.samples.emf.annotations.integerdiscriminator.impl.IntegerdiscriminatorPackageImpl#getSuper()
		 * @generated
		 */
		EClass SUPER = eINSTANCE.getSuper();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUPER__NAME = eINSTANCE.getSuper_Name();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.emf.annotations.integerdiscriminator.impl.SubImpl <em>Sub</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.emf.annotations.integerdiscriminator.impl.SubImpl
		 * @see org.eclipse.emf.teneo.samples.emf.annotations.integerdiscriminator.impl.IntegerdiscriminatorPackageImpl#getSub()
		 * @generated
		 */
		EClass SUB = eINSTANCE.getSub();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.emf.annotations.integerdiscriminator.impl.OtherSubImpl <em>Other Sub</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.emf.annotations.integerdiscriminator.impl.OtherSubImpl
		 * @see org.eclipse.emf.teneo.samples.emf.annotations.integerdiscriminator.impl.IntegerdiscriminatorPackageImpl#getOtherSub()
		 * @generated
		 */
		EClass OTHER_SUB = eINSTANCE.getOtherSub();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.emf.annotations.integerdiscriminator.impl.AbstractSubImpl <em>Abstract Sub</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.emf.annotations.integerdiscriminator.impl.AbstractSubImpl
		 * @see org.eclipse.emf.teneo.samples.emf.annotations.integerdiscriminator.impl.IntegerdiscriminatorPackageImpl#getAbstractSub()
		 * @generated
		 */
		EClass ABSTRACT_SUB = eINSTANCE.getAbstractSub();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.emf.annotations.integerdiscriminator.impl.SuperFormulaImpl <em>Super Formula</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.emf.annotations.integerdiscriminator.impl.SuperFormulaImpl
		 * @see org.eclipse.emf.teneo.samples.emf.annotations.integerdiscriminator.impl.IntegerdiscriminatorPackageImpl#getSuperFormula()
		 * @generated
		 */
		EClass SUPER_FORMULA = eINSTANCE.getSuperFormula();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUPER_FORMULA__NAME = eINSTANCE.getSuperFormula_Name();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.emf.annotations.integerdiscriminator.impl.SubFormulaImpl <em>Sub Formula</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.emf.annotations.integerdiscriminator.impl.SubFormulaImpl
		 * @see org.eclipse.emf.teneo.samples.emf.annotations.integerdiscriminator.impl.IntegerdiscriminatorPackageImpl#getSubFormula()
		 * @generated
		 */
		EClass SUB_FORMULA = eINSTANCE.getSubFormula();

	}

} //IntegerdiscriminatorPackage

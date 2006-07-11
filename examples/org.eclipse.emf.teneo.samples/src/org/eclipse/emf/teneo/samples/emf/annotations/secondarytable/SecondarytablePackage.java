/**
 * <copyright>
 * </copyright>
 *
 * $Id: SecondarytablePackage.java,v 1.1 2006/07/11 16:57:15 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.annotations.secondarytable;

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
 * @see org.eclipse.emf.teneo.samples.emf.annotations.secondarytable.SecondarytableFactory
 * @model kind="package"
 * @generated
 */
public interface SecondarytablePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "secondarytable";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/emf/teneo/samples/emf/annotations/secondarytable";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "secondarytable";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SecondarytablePackage eINSTANCE = org.eclipse.emf.teneo.samples.emf.annotations.secondarytable.impl.SecondarytablePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.annotations.secondarytable.impl.PrinterImpl <em>Printer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.secondarytable.impl.PrinterImpl
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.secondarytable.impl.SecondarytablePackageImpl#getPrinter()
	 * @generated
	 */
	int PRINTER = 0;

	/**
	 * The feature id for the '<em><b>Make</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINTER__MAKE = 0;

	/**
	 * The feature id for the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINTER__MODEL = 1;

	/**
	 * The feature id for the '<em><b>Toner Make</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINTER__TONER_MAKE = 2;

	/**
	 * The feature id for the '<em><b>Toner Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINTER__TONER_MODEL = 3;

	/**
	 * The number of structural features of the '<em>Printer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINTER_FEATURE_COUNT = 4;


	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.annotations.secondarytable.Printer <em>Printer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Printer</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.secondarytable.Printer
	 * @generated
	 */
	EClass getPrinter();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.annotations.secondarytable.Printer#getMake <em>Make</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Make</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.secondarytable.Printer#getMake()
	 * @see #getPrinter()
	 * @generated
	 */
	EAttribute getPrinter_Make();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.annotations.secondarytable.Printer#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.secondarytable.Printer#getModel()
	 * @see #getPrinter()
	 * @generated
	 */
	EAttribute getPrinter_Model();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.annotations.secondarytable.Printer#getTonerMake <em>Toner Make</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Toner Make</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.secondarytable.Printer#getTonerMake()
	 * @see #getPrinter()
	 * @generated
	 */
	EAttribute getPrinter_TonerMake();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.annotations.secondarytable.Printer#getTonerModel <em>Toner Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Toner Model</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.secondarytable.Printer#getTonerModel()
	 * @see #getPrinter()
	 * @generated
	 */
	EAttribute getPrinter_TonerModel();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SecondarytableFactory getSecondarytableFactory();

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
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.emf.annotations.secondarytable.impl.PrinterImpl <em>Printer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.emf.annotations.secondarytable.impl.PrinterImpl
		 * @see org.eclipse.emf.teneo.samples.emf.annotations.secondarytable.impl.SecondarytablePackageImpl#getPrinter()
		 * @generated
		 */
		EClass PRINTER = eINSTANCE.getPrinter();

		/**
		 * The meta object literal for the '<em><b>Make</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRINTER__MAKE = eINSTANCE.getPrinter_Make();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRINTER__MODEL = eINSTANCE.getPrinter_Model();

		/**
		 * The meta object literal for the '<em><b>Toner Make</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRINTER__TONER_MAKE = eINSTANCE.getPrinter_TonerMake();

		/**
		 * The meta object literal for the '<em><b>Toner Model</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRINTER__TONER_MODEL = eINSTANCE.getPrinter_TonerModel();

	}

} //SecondarytablePackage

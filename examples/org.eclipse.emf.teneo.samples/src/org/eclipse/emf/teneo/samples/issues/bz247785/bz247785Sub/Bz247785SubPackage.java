/**
 * <copyright>
 * </copyright>
 *
 * $Id: Bz247785SubPackage.java,v 1.1 2008/09/20 21:20:21 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.bz247785.bz247785Sub;

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
 * @see org.eclipse.emf.teneo.samples.issues.bz247785.bz247785Sub.Bz247785SubFactory
 * @model kind="package"
 * @generated
 */
public interface Bz247785SubPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "bz247785Sub";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/emf/teneo/samples/issues/bz247785/sub";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "bz247785Sub";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Bz247785SubPackage eINSTANCE = org.eclipse.emf.teneo.samples.issues.bz247785.bz247785Sub.impl.Bz247785SubPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.issues.bz247785.bz247785Sub.impl.AnimalImpl <em>Animal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.issues.bz247785.bz247785Sub.impl.AnimalImpl
	 * @see org.eclipse.emf.teneo.samples.issues.bz247785.bz247785Sub.impl.Bz247785SubPackageImpl#getAnimal()
	 * @generated
	 */
	int ANIMAL = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMAL__ID = 0;

	/**
	 * The number of structural features of the '<em>Animal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMAL_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.issues.bz247785.bz247785Sub.impl.CatImpl <em>Cat</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.issues.bz247785.bz247785Sub.impl.CatImpl
	 * @see org.eclipse.emf.teneo.samples.issues.bz247785.bz247785Sub.impl.Bz247785SubPackageImpl#getCat()
	 * @generated
	 */
	int CAT = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAT__ID = ANIMAL__ID;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAT__OWNER = ANIMAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Cat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAT_FEATURE_COUNT = ANIMAL_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.issues.bz247785.bz247785Sub.Animal <em>Animal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Animal</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz247785.bz247785Sub.Animal
	 * @generated
	 */
	EClass getAnimal();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.bz247785.bz247785Sub.Animal#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz247785.bz247785Sub.Animal#getId()
	 * @see #getAnimal()
	 * @generated
	 */
	EAttribute getAnimal_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.issues.bz247785.bz247785Sub.Cat <em>Cat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cat</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz247785.bz247785Sub.Cat
	 * @generated
	 */
	EClass getCat();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.teneo.samples.issues.bz247785.bz247785Sub.Cat#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Owner</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz247785.bz247785Sub.Cat#getOwner()
	 * @see #getCat()
	 * @generated
	 */
	EReference getCat_Owner();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Bz247785SubFactory getBz247785SubFactory();

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
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.issues.bz247785.bz247785Sub.impl.AnimalImpl <em>Animal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.issues.bz247785.bz247785Sub.impl.AnimalImpl
		 * @see org.eclipse.emf.teneo.samples.issues.bz247785.bz247785Sub.impl.Bz247785SubPackageImpl#getAnimal()
		 * @generated
		 */
		EClass ANIMAL = eINSTANCE.getAnimal();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANIMAL__ID = eINSTANCE.getAnimal_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.issues.bz247785.bz247785Sub.impl.CatImpl <em>Cat</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.issues.bz247785.bz247785Sub.impl.CatImpl
		 * @see org.eclipse.emf.teneo.samples.issues.bz247785.bz247785Sub.impl.Bz247785SubPackageImpl#getCat()
		 * @generated
		 */
		EClass CAT = eINSTANCE.getCat();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAT__OWNER = eINSTANCE.getCat_Owner();

	}

} //Bz247785SubPackage

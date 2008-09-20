/**
 * <copyright>
 * </copyright>
 *
 * $Id: Bz247939Package.java,v 1.1 2008/09/20 21:20:21 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.bz247939;

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
 * @see org.eclipse.emf.teneo.samples.issues.bz247939.Bz247939Factory
 * @model kind="package"
 *        annotation="teneo.jpa appinfo=''"
 * @generated
 */
public interface Bz247939Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "bz247939";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/emf/teneo/samples/issues/bz247939";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "bz247939";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Bz247939Package eINSTANCE = org.eclipse.emf.teneo.samples.issues.bz247939.impl.Bz247939PackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.issues.bz247939.impl.AnimalImpl <em>Animal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.issues.bz247939.impl.AnimalImpl
	 * @see org.eclipse.emf.teneo.samples.issues.bz247939.impl.Bz247939PackageImpl#getAnimal()
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
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.issues.bz247939.impl.OwnerImpl <em>Owner</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.issues.bz247939.impl.OwnerImpl
	 * @see org.eclipse.emf.teneo.samples.issues.bz247939.impl.Bz247939PackageImpl#getOwner()
	 * @generated
	 */
	int OWNER = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWNER__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWNER__NAME = 1;

	/**
	 * The feature id for the '<em><b>Owned Cats</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWNER__OWNED_CATS = 2;

	/**
	 * The number of structural features of the '<em>Owner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWNER_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.issues.bz247939.impl.CatImpl <em>Cat</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.issues.bz247939.impl.CatImpl
	 * @see org.eclipse.emf.teneo.samples.issues.bz247939.impl.Bz247939PackageImpl#getCat()
	 * @generated
	 */
	int CAT = 2;

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
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.issues.bz247939.Animal <em>Animal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Animal</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz247939.Animal
	 * @generated
	 */
	EClass getAnimal();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.bz247939.Animal#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz247939.Animal#getId()
	 * @see #getAnimal()
	 * @generated
	 */
	EAttribute getAnimal_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.issues.bz247939.Owner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Owner</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz247939.Owner
	 * @generated
	 */
	EClass getOwner();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.bz247939.Owner#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz247939.Owner#getId()
	 * @see #getOwner()
	 * @generated
	 */
	EAttribute getOwner_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.bz247939.Owner#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz247939.Owner#getName()
	 * @see #getOwner()
	 * @generated
	 */
	EAttribute getOwner_Name();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.emf.teneo.samples.issues.bz247939.Owner#getOwnedCats <em>Owned Cats</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Owned Cats</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz247939.Owner#getOwnedCats()
	 * @see #getOwner()
	 * @generated
	 */
	EReference getOwner_OwnedCats();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.issues.bz247939.Cat <em>Cat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cat</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz247939.Cat
	 * @generated
	 */
	EClass getCat();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.teneo.samples.issues.bz247939.Cat#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Owner</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz247939.Cat#getOwner()
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
	Bz247939Factory getBz247939Factory();

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
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.issues.bz247939.impl.AnimalImpl <em>Animal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.issues.bz247939.impl.AnimalImpl
		 * @see org.eclipse.emf.teneo.samples.issues.bz247939.impl.Bz247939PackageImpl#getAnimal()
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
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.issues.bz247939.impl.OwnerImpl <em>Owner</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.issues.bz247939.impl.OwnerImpl
		 * @see org.eclipse.emf.teneo.samples.issues.bz247939.impl.Bz247939PackageImpl#getOwner()
		 * @generated
		 */
		EClass OWNER = eINSTANCE.getOwner();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OWNER__ID = eINSTANCE.getOwner_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OWNER__NAME = eINSTANCE.getOwner_Name();

		/**
		 * The meta object literal for the '<em><b>Owned Cats</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OWNER__OWNED_CATS = eINSTANCE.getOwner_OwnedCats();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.issues.bz247939.impl.CatImpl <em>Cat</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.issues.bz247939.impl.CatImpl
		 * @see org.eclipse.emf.teneo.samples.issues.bz247939.impl.Bz247939PackageImpl#getCat()
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

} //Bz247939Package

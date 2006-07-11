/**
 * <copyright>
 * </copyright>
 *
 * $Id: InheritancePackage.java,v 1.1 2006/07/11 16:57:09 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.inheritance;

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
 * @see org.eclipse.emf.teneo.samples.issues.inheritance.InheritanceFactory
 * @model kind="package"
 * @generated
 */
public interface InheritancePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "inheritance";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/emf/teneo/samples/issues/inheritance";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "inheritance";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	InheritancePackage eINSTANCE = org.eclipse.emf.teneo.samples.issues.inheritance.impl.InheritancePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.issues.inheritance.impl.ThingImpl <em>Thing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.issues.inheritance.impl.ThingImpl
	 * @see org.eclipse.emf.teneo.samples.issues.inheritance.impl.InheritancePackageImpl#getThing()
	 * @generated
	 */
	int THING = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING__NAME = 0;

	/**
	 * The feature id for the '<em><b>Things</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING__THINGS = 1;

	/**
	 * The number of structural features of the '<em>Thing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.issues.inheritance.impl.AnnotationImpl <em>Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.issues.inheritance.impl.AnnotationImpl
	 * @see org.eclipse.emf.teneo.samples.issues.inheritance.impl.InheritancePackageImpl#getAnnotation()
	 * @generated
	 */
	int ANNOTATION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__NAME = THING__NAME;

	/**
	 * The feature id for the '<em><b>Things</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__THINGS = THING__THINGS;

	/**
	 * The number of structural features of the '<em>Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_FEATURE_COUNT = THING_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.issues.inheritance.impl.InterestImpl <em>Interest</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.issues.inheritance.impl.InterestImpl
	 * @see org.eclipse.emf.teneo.samples.issues.inheritance.impl.InheritancePackageImpl#getInterest()
	 * @generated
	 */
	int INTEREST = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEREST__NAME = THING__NAME;

	/**
	 * The feature id for the '<em><b>Things</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEREST__THINGS = THING__THINGS;

	/**
	 * The number of structural features of the '<em>Interest</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEREST_FEATURE_COUNT = THING_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.issues.inheritance.impl.SubOneImpl <em>Sub One</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.issues.inheritance.impl.SubOneImpl
	 * @see org.eclipse.emf.teneo.samples.issues.inheritance.impl.InheritancePackageImpl#getSubOne()
	 * @generated
	 */
	int SUB_ONE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_ONE__NAME = ANNOTATION__NAME;

	/**
	 * The feature id for the '<em><b>Things</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_ONE__THINGS = ANNOTATION__THINGS;

	/**
	 * The number of structural features of the '<em>Sub One</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_ONE_FEATURE_COUNT = ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.issues.inheritance.impl.SubThingImpl <em>Sub Thing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.issues.inheritance.impl.SubThingImpl
	 * @see org.eclipse.emf.teneo.samples.issues.inheritance.impl.InheritancePackageImpl#getSubThing()
	 * @generated
	 */
	int SUB_THING = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_THING__NAME = 0;

	/**
	 * The number of structural features of the '<em>Sub Thing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_THING_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.issues.inheritance.impl.SubTwoImpl <em>Sub Two</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.issues.inheritance.impl.SubTwoImpl
	 * @see org.eclipse.emf.teneo.samples.issues.inheritance.impl.InheritancePackageImpl#getSubTwo()
	 * @generated
	 */
	int SUB_TWO = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TWO__NAME = ANNOTATION__NAME;

	/**
	 * The feature id for the '<em><b>Things</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TWO__THINGS = ANNOTATION__THINGS;

	/**
	 * The number of structural features of the '<em>Sub Two</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TWO_FEATURE_COUNT = ANNOTATION_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.issues.inheritance.Annotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.inheritance.Annotation
	 * @generated
	 */
	EClass getAnnotation();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.issues.inheritance.Interest <em>Interest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interest</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.inheritance.Interest
	 * @generated
	 */
	EClass getInterest();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.issues.inheritance.SubOne <em>Sub One</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub One</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.inheritance.SubOne
	 * @generated
	 */
	EClass getSubOne();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.issues.inheritance.SubThing <em>Sub Thing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Thing</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.inheritance.SubThing
	 * @generated
	 */
	EClass getSubThing();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.inheritance.SubThing#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.inheritance.SubThing#getName()
	 * @see #getSubThing()
	 * @generated
	 */
	EAttribute getSubThing_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.issues.inheritance.SubTwo <em>Sub Two</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Two</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.inheritance.SubTwo
	 * @generated
	 */
	EClass getSubTwo();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.issues.inheritance.Thing <em>Thing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Thing</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.inheritance.Thing
	 * @generated
	 */
	EClass getThing();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.inheritance.Thing#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.inheritance.Thing#getName()
	 * @see #getThing()
	 * @generated
	 */
	EAttribute getThing_Name();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.emf.teneo.samples.issues.inheritance.Thing#getThings <em>Things</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Things</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.inheritance.Thing#getThings()
	 * @see #getThing()
	 * @generated
	 */
	EReference getThing_Things();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	InheritanceFactory getInheritanceFactory();

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
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.issues.inheritance.impl.AnnotationImpl <em>Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.issues.inheritance.impl.AnnotationImpl
		 * @see org.eclipse.emf.teneo.samples.issues.inheritance.impl.InheritancePackageImpl#getAnnotation()
		 * @generated
		 */
		EClass ANNOTATION = eINSTANCE.getAnnotation();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.issues.inheritance.impl.InterestImpl <em>Interest</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.issues.inheritance.impl.InterestImpl
		 * @see org.eclipse.emf.teneo.samples.issues.inheritance.impl.InheritancePackageImpl#getInterest()
		 * @generated
		 */
		EClass INTEREST = eINSTANCE.getInterest();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.issues.inheritance.impl.SubOneImpl <em>Sub One</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.issues.inheritance.impl.SubOneImpl
		 * @see org.eclipse.emf.teneo.samples.issues.inheritance.impl.InheritancePackageImpl#getSubOne()
		 * @generated
		 */
		EClass SUB_ONE = eINSTANCE.getSubOne();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.issues.inheritance.impl.SubThingImpl <em>Sub Thing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.issues.inheritance.impl.SubThingImpl
		 * @see org.eclipse.emf.teneo.samples.issues.inheritance.impl.InheritancePackageImpl#getSubThing()
		 * @generated
		 */
		EClass SUB_THING = eINSTANCE.getSubThing();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB_THING__NAME = eINSTANCE.getSubThing_Name();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.issues.inheritance.impl.SubTwoImpl <em>Sub Two</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.issues.inheritance.impl.SubTwoImpl
		 * @see org.eclipse.emf.teneo.samples.issues.inheritance.impl.InheritancePackageImpl#getSubTwo()
		 * @generated
		 */
		EClass SUB_TWO = eINSTANCE.getSubTwo();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.issues.inheritance.impl.ThingImpl <em>Thing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.issues.inheritance.impl.ThingImpl
		 * @see org.eclipse.emf.teneo.samples.issues.inheritance.impl.InheritancePackageImpl#getThing()
		 * @generated
		 */
		EClass THING = eINSTANCE.getThing();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THING__NAME = eINSTANCE.getThing_Name();

		/**
		 * The meta object literal for the '<em><b>Things</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THING__THINGS = eINSTANCE.getThing_Things();

	}

} //InheritancePackage

/**
 * <copyright>
 * </copyright>
 *
 * $Id: EmbeddedPackage.java,v 1.3 2007/07/11 18:28:20 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.annotations.embedded;

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
 * @see org.eclipse.emf.teneo.samples.emf.annotations.embedded.EmbeddedFactory
 * @model kind="package"
 * @generated
 */
public interface EmbeddedPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "embedded";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/emf/teneo/samples/emf/annotations/embedded";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "embedded";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EmbeddedPackage eINSTANCE = org.eclipse.emf.teneo.samples.emf.annotations.embedded.impl.EmbeddedPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.annotations.embedded.impl.AlsoEmbeddableImpl <em>Also Embeddable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.embedded.impl.AlsoEmbeddableImpl
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.embedded.impl.EmbeddedPackageImpl#getAlsoEmbeddable()
	 * @generated
	 */
	int ALSO_EMBEDDABLE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALSO_EMBEDDABLE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Also Embeddable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALSO_EMBEDDABLE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.annotations.embedded.impl.EmbeddableImpl <em>Embeddable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.embedded.impl.EmbeddableImpl
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.embedded.impl.EmbeddedPackageImpl#getEmbeddable()
	 * @generated
	 */
	int EMBEDDABLE = 1;

	/**
	 * The feature id for the '<em><b>My String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBEDDABLE__MY_STRING = 0;

	/**
	 * The feature id for the '<em><b>My Integer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBEDDABLE__MY_INTEGER = 1;

	/**
	 * The number of structural features of the '<em>Embeddable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBEDDABLE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.annotations.embedded.impl.EmbedderImpl <em>Embedder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.embedded.impl.EmbedderImpl
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.embedded.impl.EmbeddedPackageImpl#getEmbedder()
	 * @generated
	 */
	int EMBEDDER = 2;

	/**
	 * The feature id for the '<em><b>First Embedded</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBEDDER__FIRST_EMBEDDED = 0;

	/**
	 * The feature id for the '<em><b>Second Embedded</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBEDDER__SECOND_EMBEDDED = 1;

	/**
	 * The feature id for the '<em><b>Third Embedded</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBEDDER__THIRD_EMBEDDED = 2;

	/**
	 * The feature id for the '<em><b>Fourth Embedded</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBEDDER__FOURTH_EMBEDDED = 3;

	/**
	 * The feature id for the '<em><b>Fifth Embedded</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBEDDER__FIFTH_EMBEDDED = 4;

	/**
	 * The feature id for the '<em><b>Also Embeddable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBEDDER__ALSO_EMBEDDABLE = 5;

	/**
	 * The number of structural features of the '<em>Embedder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBEDDER_FEATURE_COUNT = 6;


	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.annotations.embedded.AlsoEmbeddable <em>Also Embeddable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Also Embeddable</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.embedded.AlsoEmbeddable
	 * @generated
	 */
	EClass getAlsoEmbeddable();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.annotations.embedded.AlsoEmbeddable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.embedded.AlsoEmbeddable#getName()
	 * @see #getAlsoEmbeddable()
	 * @generated
	 */
	EAttribute getAlsoEmbeddable_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.annotations.embedded.Embeddable <em>Embeddable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Embeddable</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.embedded.Embeddable
	 * @generated
	 */
	EClass getEmbeddable();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.annotations.embedded.Embeddable#getMyString <em>My String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>My String</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.embedded.Embeddable#getMyString()
	 * @see #getEmbeddable()
	 * @generated
	 */
	EAttribute getEmbeddable_MyString();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.annotations.embedded.Embeddable#getMyInteger <em>My Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>My Integer</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.embedded.Embeddable#getMyInteger()
	 * @see #getEmbeddable()
	 * @generated
	 */
	EAttribute getEmbeddable_MyInteger();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.annotations.embedded.Embedder <em>Embedder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Embedder</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.embedded.Embedder
	 * @generated
	 */
	EClass getEmbedder();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.samples.emf.annotations.embedded.Embedder#getFirstEmbedded <em>First Embedded</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>First Embedded</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.embedded.Embedder#getFirstEmbedded()
	 * @see #getEmbedder()
	 * @generated
	 */
	EReference getEmbedder_FirstEmbedded();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.samples.emf.annotations.embedded.Embedder#getSecondEmbedded <em>Second Embedded</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Second Embedded</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.embedded.Embedder#getSecondEmbedded()
	 * @see #getEmbedder()
	 * @generated
	 */
	EReference getEmbedder_SecondEmbedded();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.samples.emf.annotations.embedded.Embedder#getThirdEmbedded <em>Third Embedded</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Third Embedded</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.embedded.Embedder#getThirdEmbedded()
	 * @see #getEmbedder()
	 * @generated
	 */
	EReference getEmbedder_ThirdEmbedded();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.samples.emf.annotations.embedded.Embedder#getFourthEmbedded <em>Fourth Embedded</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fourth Embedded</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.embedded.Embedder#getFourthEmbedded()
	 * @see #getEmbedder()
	 * @generated
	 */
	EReference getEmbedder_FourthEmbedded();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.samples.emf.annotations.embedded.Embedder#getFifthEmbedded <em>Fifth Embedded</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fifth Embedded</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.embedded.Embedder#getFifthEmbedded()
	 * @see #getEmbedder()
	 * @generated
	 */
	EReference getEmbedder_FifthEmbedded();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.samples.emf.annotations.embedded.Embedder#getAlsoEmbeddable <em>Also Embeddable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Also Embeddable</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.embedded.Embedder#getAlsoEmbeddable()
	 * @see #getEmbedder()
	 * @generated
	 */
	EReference getEmbedder_AlsoEmbeddable();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EmbeddedFactory getEmbeddedFactory();

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
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.emf.annotations.embedded.impl.AlsoEmbeddableImpl <em>Also Embeddable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.emf.annotations.embedded.impl.AlsoEmbeddableImpl
		 * @see org.eclipse.emf.teneo.samples.emf.annotations.embedded.impl.EmbeddedPackageImpl#getAlsoEmbeddable()
		 * @generated
		 */
		EClass ALSO_EMBEDDABLE = eINSTANCE.getAlsoEmbeddable();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALSO_EMBEDDABLE__NAME = eINSTANCE.getAlsoEmbeddable_Name();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.emf.annotations.embedded.impl.EmbeddableImpl <em>Embeddable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.emf.annotations.embedded.impl.EmbeddableImpl
		 * @see org.eclipse.emf.teneo.samples.emf.annotations.embedded.impl.EmbeddedPackageImpl#getEmbeddable()
		 * @generated
		 */
		EClass EMBEDDABLE = eINSTANCE.getEmbeddable();

		/**
		 * The meta object literal for the '<em><b>My String</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMBEDDABLE__MY_STRING = eINSTANCE.getEmbeddable_MyString();

		/**
		 * The meta object literal for the '<em><b>My Integer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMBEDDABLE__MY_INTEGER = eINSTANCE.getEmbeddable_MyInteger();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.emf.annotations.embedded.impl.EmbedderImpl <em>Embedder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.emf.annotations.embedded.impl.EmbedderImpl
		 * @see org.eclipse.emf.teneo.samples.emf.annotations.embedded.impl.EmbeddedPackageImpl#getEmbedder()
		 * @generated
		 */
		EClass EMBEDDER = eINSTANCE.getEmbedder();

		/**
		 * The meta object literal for the '<em><b>First Embedded</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMBEDDER__FIRST_EMBEDDED = eINSTANCE.getEmbedder_FirstEmbedded();

		/**
		 * The meta object literal for the '<em><b>Second Embedded</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMBEDDER__SECOND_EMBEDDED = eINSTANCE.getEmbedder_SecondEmbedded();

		/**
		 * The meta object literal for the '<em><b>Third Embedded</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMBEDDER__THIRD_EMBEDDED = eINSTANCE.getEmbedder_ThirdEmbedded();

		/**
		 * The meta object literal for the '<em><b>Fourth Embedded</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMBEDDER__FOURTH_EMBEDDED = eINSTANCE.getEmbedder_FourthEmbedded();

		/**
		 * The meta object literal for the '<em><b>Fifth Embedded</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMBEDDER__FIFTH_EMBEDDED = eINSTANCE.getEmbedder_FifthEmbedded();

		/**
		 * The meta object literal for the '<em><b>Also Embeddable</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMBEDDER__ALSO_EMBEDDABLE = eINSTANCE.getEmbedder_AlsoEmbeddable();

	}

} //EmbeddedPackage

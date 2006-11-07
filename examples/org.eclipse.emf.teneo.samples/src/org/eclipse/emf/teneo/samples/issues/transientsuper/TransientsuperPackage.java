/**
 * <copyright>
 * </copyright>
 *
 * $Id: TransientsuperPackage.java,v 1.2 2006/11/07 10:22:27 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.transientsuper;

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
 * @see org.eclipse.emf.teneo.samples.issues.transientsuper.TransientsuperFactory
 * @model kind="package"
 * @generated
 */
public interface TransientsuperPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "transientsuper";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/emf/teneo/samples/issues/transientsuper";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "transientsuper";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TransientsuperPackage eINSTANCE = org.eclipse.emf.teneo.samples.issues.transientsuper.impl.TransientsuperPackageImpl.init();

	/**
	 * The meta object id for the '{@link java.io.Serializable <em>Serializable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.io.Serializable
	 * @see org.eclipse.emf.teneo.samples.issues.transientsuper.impl.TransientsuperPackageImpl#getSerializable()
	 * @generated
	 */
	int SERIALIZABLE = 1;

	/**
	 * The number of structural features of the '<em>Serializable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIALIZABLE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.issues.transientsuper.impl.PBaseObjectImpl <em>PBase Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.issues.transientsuper.impl.PBaseObjectImpl
	 * @see org.eclipse.emf.teneo.samples.issues.transientsuper.impl.TransientsuperPackageImpl#getPBaseObject()
	 * @generated
	 */
	int PBASE_OBJECT = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PBASE_OBJECT__ID = SERIALIZABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PBASE_OBJECT__NAME = SERIALIZABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PBASE_OBJECT__CHILDREN = SERIALIZABLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>PBase Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PBASE_OBJECT_FEATURE_COUNT = SERIALIZABLE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.issues.transientsuper.impl.PVersionObjectImpl <em>PVersion Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.issues.transientsuper.impl.PVersionObjectImpl
	 * @see org.eclipse.emf.teneo.samples.issues.transientsuper.impl.TransientsuperPackageImpl#getPVersionObject()
	 * @generated
	 */
	int PVERSION_OBJECT = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PVERSION_OBJECT__ID = PBASE_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PVERSION_OBJECT__NAME = PBASE_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PVERSION_OBJECT__CHILDREN = PBASE_OBJECT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Version Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PVERSION_OBJECT__VERSION_NUMBER = PBASE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PVERSION_OBJECT__COMMENT = PBASE_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>PVersion Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PVERSION_OBJECT_FEATURE_COUNT = PBASE_OBJECT_FEATURE_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.issues.transientsuper.PBaseObject <em>PBase Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PBase Object</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.transientsuper.PBaseObject
	 * @generated
	 */
	EClass getPBaseObject();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.transientsuper.PBaseObject#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.transientsuper.PBaseObject#getId()
	 * @see #getPBaseObject()
	 * @generated
	 */
	EAttribute getPBaseObject_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.transientsuper.PBaseObject#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.transientsuper.PBaseObject#getName()
	 * @see #getPBaseObject()
	 * @generated
	 */
	EAttribute getPBaseObject_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.samples.issues.transientsuper.PBaseObject#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.transientsuper.PBaseObject#getChildren()
	 * @see #getPBaseObject()
	 * @generated
	 */
	EReference getPBaseObject_Children();

	/**
	 * Returns the meta object for class '{@link java.io.Serializable <em>Serializable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Serializable</em>'.
	 * @see java.io.Serializable
	 * @model instanceClass="java.io.Serializable"
	 *        annotation="teneo.jpa appinfo='@Transient'"
	 * @generated
	 */
	EClass getSerializable();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.issues.transientsuper.PVersionObject <em>PVersion Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PVersion Object</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.transientsuper.PVersionObject
	 * @generated
	 */
	EClass getPVersionObject();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.transientsuper.PVersionObject#getVersionNumber <em>Version Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version Number</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.transientsuper.PVersionObject#getVersionNumber()
	 * @see #getPVersionObject()
	 * @generated
	 */
	EAttribute getPVersionObject_VersionNumber();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.transientsuper.PVersionObject#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.transientsuper.PVersionObject#getComment()
	 * @see #getPVersionObject()
	 * @generated
	 */
	EAttribute getPVersionObject_Comment();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TransientsuperFactory getTransientsuperFactory();

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
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.issues.transientsuper.impl.PBaseObjectImpl <em>PBase Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.issues.transientsuper.impl.PBaseObjectImpl
		 * @see org.eclipse.emf.teneo.samples.issues.transientsuper.impl.TransientsuperPackageImpl#getPBaseObject()
		 * @generated
		 */
		EClass PBASE_OBJECT = eINSTANCE.getPBaseObject();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PBASE_OBJECT__ID = eINSTANCE.getPBaseObject_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PBASE_OBJECT__NAME = eINSTANCE.getPBaseObject_Name();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PBASE_OBJECT__CHILDREN = eINSTANCE.getPBaseObject_Children();

		/**
		 * The meta object literal for the '{@link java.io.Serializable <em>Serializable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.io.Serializable
		 * @see org.eclipse.emf.teneo.samples.issues.transientsuper.impl.TransientsuperPackageImpl#getSerializable()
		 * @generated
		 */
		EClass SERIALIZABLE = eINSTANCE.getSerializable();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.issues.transientsuper.impl.PVersionObjectImpl <em>PVersion Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.issues.transientsuper.impl.PVersionObjectImpl
		 * @see org.eclipse.emf.teneo.samples.issues.transientsuper.impl.TransientsuperPackageImpl#getPVersionObject()
		 * @generated
		 */
		EClass PVERSION_OBJECT = eINSTANCE.getPVersionObject();

		/**
		 * The meta object literal for the '<em><b>Version Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PVERSION_OBJECT__VERSION_NUMBER = eINSTANCE.getPVersionObject_VersionNumber();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PVERSION_OBJECT__COMMENT = eINSTANCE.getPVersionObject_Comment();

	}

} //TransientsuperPackage

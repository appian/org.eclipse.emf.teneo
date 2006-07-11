/**
 * <copyright>
 * </copyright>
 *
 * $Id: MappedsuperclassPackage.java,v 1.1 2006/07/11 16:57:16 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.annotations.mappedsuperclass;

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
 * @see org.eclipse.emf.teneo.samples.emf.annotations.mappedsuperclass.MappedsuperclassFactory
 * @model kind="package"
 * @generated
 */
public interface MappedsuperclassPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "mappedsuperclass";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/emf/teneo/samples/emf/annotations/mappedsuperclass";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mappedsuperclass";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MappedsuperclassPackage eINSTANCE = org.eclipse.emf.teneo.samples.emf.annotations.mappedsuperclass.impl.MappedsuperclassPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.annotations.mappedsuperclass.impl.DocumentImpl <em>Document</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.mappedsuperclass.impl.DocumentImpl
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.mappedsuperclass.impl.MappedsuperclassPackageImpl#getDocument()
	 * @generated
	 */
	int DOCUMENT = 0;

	/**
	 * The feature id for the '<em><b>My Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__MY_ID = 0;

	/**
	 * The feature id for the '<em><b>My Generic Info</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__MY_GENERIC_INFO = 1;

	/**
	 * The number of structural features of the '<em>Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.annotations.mappedsuperclass.impl.ParentDocumentImpl <em>Parent Document</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.mappedsuperclass.impl.ParentDocumentImpl
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.mappedsuperclass.impl.MappedsuperclassPackageImpl#getParentDocument()
	 * @generated
	 */
	int PARENT_DOCUMENT = 1;

	/**
	 * The feature id for the '<em><b>My Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARENT_DOCUMENT__MY_ID = DOCUMENT__MY_ID;

	/**
	 * The feature id for the '<em><b>My Generic Info</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARENT_DOCUMENT__MY_GENERIC_INFO = DOCUMENT__MY_GENERIC_INFO;

	/**
	 * The feature id for the '<em><b>My Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARENT_DOCUMENT__MY_NAME = DOCUMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Parent Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARENT_DOCUMENT_FEATURE_COUNT = DOCUMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.annotations.mappedsuperclass.impl.SpecificDocumentImpl <em>Specific Document</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.mappedsuperclass.impl.SpecificDocumentImpl
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.mappedsuperclass.impl.MappedsuperclassPackageImpl#getSpecificDocument()
	 * @generated
	 */
	int SPECIFIC_DOCUMENT = 2;

	/**
	 * The feature id for the '<em><b>My Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_DOCUMENT__MY_ID = PARENT_DOCUMENT__MY_ID;

	/**
	 * The feature id for the '<em><b>My Generic Info</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_DOCUMENT__MY_GENERIC_INFO = PARENT_DOCUMENT__MY_GENERIC_INFO;

	/**
	 * The feature id for the '<em><b>My Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_DOCUMENT__MY_NAME = PARENT_DOCUMENT__MY_NAME;

	/**
	 * The feature id for the '<em><b>My Specific Info</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_DOCUMENT__MY_SPECIFIC_INFO = PARENT_DOCUMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Specific Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_DOCUMENT_FEATURE_COUNT = PARENT_DOCUMENT_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.annotations.mappedsuperclass.Document <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.mappedsuperclass.Document
	 * @generated
	 */
	EClass getDocument();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.annotations.mappedsuperclass.Document#getMyId <em>My Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>My Id</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.mappedsuperclass.Document#getMyId()
	 * @see #getDocument()
	 * @generated
	 */
	EAttribute getDocument_MyId();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.annotations.mappedsuperclass.Document#getMyGenericInfo <em>My Generic Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>My Generic Info</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.mappedsuperclass.Document#getMyGenericInfo()
	 * @see #getDocument()
	 * @generated
	 */
	EAttribute getDocument_MyGenericInfo();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.annotations.mappedsuperclass.ParentDocument <em>Parent Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parent Document</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.mappedsuperclass.ParentDocument
	 * @generated
	 */
	EClass getParentDocument();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.annotations.mappedsuperclass.ParentDocument#getMyName <em>My Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>My Name</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.mappedsuperclass.ParentDocument#getMyName()
	 * @see #getParentDocument()
	 * @generated
	 */
	EAttribute getParentDocument_MyName();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.annotations.mappedsuperclass.SpecificDocument <em>Specific Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specific Document</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.mappedsuperclass.SpecificDocument
	 * @generated
	 */
	EClass getSpecificDocument();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.annotations.mappedsuperclass.SpecificDocument#getMySpecificInfo <em>My Specific Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>My Specific Info</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.mappedsuperclass.SpecificDocument#getMySpecificInfo()
	 * @see #getSpecificDocument()
	 * @generated
	 */
	EAttribute getSpecificDocument_MySpecificInfo();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MappedsuperclassFactory getMappedsuperclassFactory();

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
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.emf.annotations.mappedsuperclass.impl.DocumentImpl <em>Document</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.emf.annotations.mappedsuperclass.impl.DocumentImpl
		 * @see org.eclipse.emf.teneo.samples.emf.annotations.mappedsuperclass.impl.MappedsuperclassPackageImpl#getDocument()
		 * @generated
		 */
		EClass DOCUMENT = eINSTANCE.getDocument();

		/**
		 * The meta object literal for the '<em><b>My Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT__MY_ID = eINSTANCE.getDocument_MyId();

		/**
		 * The meta object literal for the '<em><b>My Generic Info</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT__MY_GENERIC_INFO = eINSTANCE.getDocument_MyGenericInfo();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.emf.annotations.mappedsuperclass.impl.ParentDocumentImpl <em>Parent Document</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.emf.annotations.mappedsuperclass.impl.ParentDocumentImpl
		 * @see org.eclipse.emf.teneo.samples.emf.annotations.mappedsuperclass.impl.MappedsuperclassPackageImpl#getParentDocument()
		 * @generated
		 */
		EClass PARENT_DOCUMENT = eINSTANCE.getParentDocument();

		/**
		 * The meta object literal for the '<em><b>My Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARENT_DOCUMENT__MY_NAME = eINSTANCE.getParentDocument_MyName();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.emf.annotations.mappedsuperclass.impl.SpecificDocumentImpl <em>Specific Document</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.emf.annotations.mappedsuperclass.impl.SpecificDocumentImpl
		 * @see org.eclipse.emf.teneo.samples.emf.annotations.mappedsuperclass.impl.MappedsuperclassPackageImpl#getSpecificDocument()
		 * @generated
		 */
		EClass SPECIFIC_DOCUMENT = eINSTANCE.getSpecificDocument();

		/**
		 * The meta object literal for the '<em><b>My Specific Info</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECIFIC_DOCUMENT__MY_SPECIFIC_INFO = eINSTANCE.getSpecificDocument_MySpecificInfo();

	}

} //MappedsuperclassPackage

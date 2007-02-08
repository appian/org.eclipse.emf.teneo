/**
 * <copyright>
 * </copyright>
 *
 * $Id: MixedPackage.java,v 1.2 2007/02/08 23:09:21 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.schemaconstructs.mixed;

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
 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.mixed.MixedFactory
 * @model kind="package"
 * @generated
 */
public interface MixedPackage extends EPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "";

	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "mixed";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/emf/teneo/samples/emf/schemaconstructs/mixed";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mixed";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MixedPackage eINSTANCE = org.eclipse.emf.teneo.samples.emf.schemaconstructs.mixed.impl.MixedPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.mixed.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.mixed.impl.DocumentRootImpl
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.mixed.impl.MixedPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 0;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Letter Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LETTER_BODY = 3;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.mixed.impl.LetterBodyTypeImpl <em>Letter Body Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.mixed.impl.LetterBodyTypeImpl
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.mixed.impl.MixedPackageImpl#getLetterBodyType()
	 * @generated
	 */
	int LETTER_BODY_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LETTER_BODY_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Salutation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LETTER_BODY_TYPE__SALUTATION = 1;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LETTER_BODY_TYPE__QUANTITY = 2;

	/**
	 * The feature id for the '<em><b>Product Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LETTER_BODY_TYPE__PRODUCT_NAME = 3;

	/**
	 * The feature id for the '<em><b>Ship Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LETTER_BODY_TYPE__SHIP_DATE = 4;

	/**
	 * The number of structural features of the '<em>Letter Body Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LETTER_BODY_TYPE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.mixed.impl.SalutationTypeImpl <em>Salutation Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.mixed.impl.SalutationTypeImpl
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.mixed.impl.MixedPackageImpl#getSalutationType()
	 * @generated
	 */
	int SALUTATION_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALUTATION_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALUTATION_TYPE__NAME = 1;

	/**
	 * The number of structural features of the '<em>Salutation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALUTATION_TYPE_FEATURE_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.mixed.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.mixed.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.mixed.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.mixed.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.mixed.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.mixed.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.mixed.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.mixed.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.mixed.DocumentRoot#getLetterBody <em>Letter Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Letter Body</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.mixed.DocumentRoot#getLetterBody()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_LetterBody();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.mixed.LetterBodyType <em>Letter Body Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Letter Body Type</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.mixed.LetterBodyType
	 * @generated
	 */
	EClass getLetterBodyType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.mixed.LetterBodyType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.mixed.LetterBodyType#getMixed()
	 * @see #getLetterBodyType()
	 * @generated
	 */
	EAttribute getLetterBodyType_Mixed();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.mixed.LetterBodyType#getSalutation <em>Salutation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Salutation</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.mixed.LetterBodyType#getSalutation()
	 * @see #getLetterBodyType()
	 * @generated
	 */
	EReference getLetterBodyType_Salutation();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.mixed.LetterBodyType#getQuantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.mixed.LetterBodyType#getQuantity()
	 * @see #getLetterBodyType()
	 * @generated
	 */
	EAttribute getLetterBodyType_Quantity();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.mixed.LetterBodyType#getProductName <em>Product Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product Name</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.mixed.LetterBodyType#getProductName()
	 * @see #getLetterBodyType()
	 * @generated
	 */
	EAttribute getLetterBodyType_ProductName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.mixed.LetterBodyType#getShipDate <em>Ship Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ship Date</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.mixed.LetterBodyType#getShipDate()
	 * @see #getLetterBodyType()
	 * @generated
	 */
	EAttribute getLetterBodyType_ShipDate();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.mixed.SalutationType <em>Salutation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Salutation Type</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.mixed.SalutationType
	 * @generated
	 */
	EClass getSalutationType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.mixed.SalutationType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.mixed.SalutationType#getMixed()
	 * @see #getSalutationType()
	 * @generated
	 */
	EAttribute getSalutationType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.mixed.SalutationType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.mixed.SalutationType#getName()
	 * @see #getSalutationType()
	 * @generated
	 */
	EAttribute getSalutationType_Name();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MixedFactory getMixedFactory();

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
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.mixed.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.mixed.impl.DocumentRootImpl
		 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.mixed.impl.MixedPackageImpl#getDocumentRoot()
		 * @generated
		 */
		EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

		/**
		 * The meta object literal for the '<em><b>Letter Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__LETTER_BODY = eINSTANCE.getDocumentRoot_LetterBody();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.mixed.impl.LetterBodyTypeImpl <em>Letter Body Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.mixed.impl.LetterBodyTypeImpl
		 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.mixed.impl.MixedPackageImpl#getLetterBodyType()
		 * @generated
		 */
		EClass LETTER_BODY_TYPE = eINSTANCE.getLetterBodyType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LETTER_BODY_TYPE__MIXED = eINSTANCE.getLetterBodyType_Mixed();

		/**
		 * The meta object literal for the '<em><b>Salutation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LETTER_BODY_TYPE__SALUTATION = eINSTANCE.getLetterBodyType_Salutation();

		/**
		 * The meta object literal for the '<em><b>Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LETTER_BODY_TYPE__QUANTITY = eINSTANCE.getLetterBodyType_Quantity();

		/**
		 * The meta object literal for the '<em><b>Product Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LETTER_BODY_TYPE__PRODUCT_NAME = eINSTANCE.getLetterBodyType_ProductName();

		/**
		 * The meta object literal for the '<em><b>Ship Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LETTER_BODY_TYPE__SHIP_DATE = eINSTANCE.getLetterBodyType_ShipDate();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.mixed.impl.SalutationTypeImpl <em>Salutation Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.mixed.impl.SalutationTypeImpl
		 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.mixed.impl.MixedPackageImpl#getSalutationType()
		 * @generated
		 */
		EClass SALUTATION_TYPE = eINSTANCE.getSalutationType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SALUTATION_TYPE__MIXED = eINSTANCE.getSalutationType_Mixed();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SALUTATION_TYPE__NAME = eINSTANCE.getSalutationType_Name();

	}

} //MixedPackage

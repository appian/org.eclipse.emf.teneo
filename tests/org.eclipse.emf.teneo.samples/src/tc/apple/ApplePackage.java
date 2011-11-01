/**
 * <copyright>
 * </copyright>
 *
 * $Id: ApplePackage.java,v 1.1 2007/07/09 12:55:20 mtaal Exp $
 */
package tc.apple;

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
 * @see tc.apple.AppleFactory
 * @model kind="package"
 *        annotation="http://www.w3.org/XML/1998/namespace lang='en'"
 * @generated
 */
public interface ApplePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "apple";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "tc-apple.xsd";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "apple";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ApplePackage eINSTANCE = tc.apple.impl.ApplePackageImpl.init();

	/**
	 * The meta object id for the '{@link tc.apple.impl.ApplesRootImpl <em>Apples Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tc.apple.impl.ApplesRootImpl
	 * @see tc.apple.impl.ApplePackageImpl#getApplesRoot()
	 * @generated
	 */
	int APPLES_ROOT = 0;

	/**
	 * The feature id for the '<em><b>Fruit</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLES_ROOT__FRUIT = 0;

	/**
	 * The number of structural features of the '<em>Apples Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLES_ROOT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link tc.apple.impl.AppleStemImpl <em>Stem</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tc.apple.impl.AppleStemImpl
	 * @see tc.apple.impl.ApplePackageImpl#getAppleStem()
	 * @generated
	 */
	int APPLE_STEM = 1;

	/**
	 * The feature id for the '<em><b>Bigtree</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLE_STEM__BIGTREE = 0;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLE_STEM__UNIQUE_NAME = 1;

	/**
	 * The number of structural features of the '<em>Stem</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLE_STEM_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link tc.apple.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tc.apple.impl.DocumentRootImpl
	 * @see tc.apple.impl.ApplePackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 2;

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
	 * The feature id for the '<em><b>Apples</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__APPLES = 3;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link tc.apple.impl.FruitImpl <em>Fruit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tc.apple.impl.FruitImpl
	 * @see tc.apple.impl.ApplePackageImpl#getFruit()
	 * @generated
	 */
	int FRUIT = 3;

	/**
	 * The feature id for the '<em><b>Bigtree</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRUIT__BIGTREE = 0;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRUIT__UNIQUE_NAME = 1;

	/**
	 * The number of structural features of the '<em>Fruit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRUIT_FEATURE_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link tc.apple.ApplesRoot <em>Apples Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Apples Root</em>'.
	 * @see tc.apple.ApplesRoot
	 * @generated
	 */
	EClass getApplesRoot();

	/**
	 * Returns the meta object for the containment reference list '{@link tc.apple.ApplesRoot#getFruit <em>Fruit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fruit</em>'.
	 * @see tc.apple.ApplesRoot#getFruit()
	 * @see #getApplesRoot()
	 * @generated
	 */
	EReference getApplesRoot_Fruit();

	/**
	 * Returns the meta object for class '{@link tc.apple.AppleStem <em>Stem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stem</em>'.
	 * @see tc.apple.AppleStem
	 * @generated
	 */
	EClass getAppleStem();

	/**
	 * Returns the meta object for the containment reference list '{@link tc.apple.AppleStem#getBigtree <em>Bigtree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bigtree</em>'.
	 * @see tc.apple.AppleStem#getBigtree()
	 * @see #getAppleStem()
	 * @generated
	 */
	EReference getAppleStem_Bigtree();

	/**
	 * Returns the meta object for the attribute '{@link tc.apple.AppleStem#getUniqueName <em>Unique Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unique Name</em>'.
	 * @see tc.apple.AppleStem#getUniqueName()
	 * @see #getAppleStem()
	 * @generated
	 */
	EAttribute getAppleStem_UniqueName();

	/**
	 * Returns the meta object for class '{@link tc.apple.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see tc.apple.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link tc.apple.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see tc.apple.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link tc.apple.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see tc.apple.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link tc.apple.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see tc.apple.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link tc.apple.DocumentRoot#getApples <em>Apples</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Apples</em>'.
	 * @see tc.apple.DocumentRoot#getApples()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Apples();

	/**
	 * Returns the meta object for class '{@link tc.apple.Fruit <em>Fruit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fruit</em>'.
	 * @see tc.apple.Fruit
	 * @generated
	 */
	EClass getFruit();

	/**
	 * Returns the meta object for the containment reference list '{@link tc.apple.Fruit#getBigtree <em>Bigtree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bigtree</em>'.
	 * @see tc.apple.Fruit#getBigtree()
	 * @see #getFruit()
	 * @generated
	 */
	EReference getFruit_Bigtree();

	/**
	 * Returns the meta object for the attribute '{@link tc.apple.Fruit#getUniqueName <em>Unique Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unique Name</em>'.
	 * @see tc.apple.Fruit#getUniqueName()
	 * @see #getFruit()
	 * @generated
	 */
	EAttribute getFruit_UniqueName();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AppleFactory getAppleFactory();

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
		 * The meta object literal for the '{@link tc.apple.impl.ApplesRootImpl <em>Apples Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tc.apple.impl.ApplesRootImpl
		 * @see tc.apple.impl.ApplePackageImpl#getApplesRoot()
		 * @generated
		 */
		EClass APPLES_ROOT = eINSTANCE.getApplesRoot();

		/**
		 * The meta object literal for the '<em><b>Fruit</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLES_ROOT__FRUIT = eINSTANCE.getApplesRoot_Fruit();

		/**
		 * The meta object literal for the '{@link tc.apple.impl.AppleStemImpl <em>Stem</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tc.apple.impl.AppleStemImpl
		 * @see tc.apple.impl.ApplePackageImpl#getAppleStem()
		 * @generated
		 */
		EClass APPLE_STEM = eINSTANCE.getAppleStem();

		/**
		 * The meta object literal for the '<em><b>Bigtree</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLE_STEM__BIGTREE = eINSTANCE.getAppleStem_Bigtree();

		/**
		 * The meta object literal for the '<em><b>Unique Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLE_STEM__UNIQUE_NAME = eINSTANCE.getAppleStem_UniqueName();

		/**
		 * The meta object literal for the '{@link tc.apple.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tc.apple.impl.DocumentRootImpl
		 * @see tc.apple.impl.ApplePackageImpl#getDocumentRoot()
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
		 * The meta object literal for the '<em><b>Apples</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__APPLES = eINSTANCE.getDocumentRoot_Apples();

		/**
		 * The meta object literal for the '{@link tc.apple.impl.FruitImpl <em>Fruit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tc.apple.impl.FruitImpl
		 * @see tc.apple.impl.ApplePackageImpl#getFruit()
		 * @generated
		 */
		EClass FRUIT = eINSTANCE.getFruit();

		/**
		 * The meta object literal for the '<em><b>Bigtree</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FRUIT__BIGTREE = eINSTANCE.getFruit_Bigtree();

		/**
		 * The meta object literal for the '<em><b>Unique Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FRUIT__UNIQUE_NAME = eINSTANCE.getFruit_UniqueName();

	}

} //ApplePackage

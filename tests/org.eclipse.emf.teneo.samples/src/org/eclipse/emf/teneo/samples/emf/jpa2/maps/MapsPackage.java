/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.emf.teneo.samples.emf.jpa2.maps;

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
 * @see org.eclipse.emf.teneo.samples.emf.jpa2.maps.MapsFactory
 * @model kind="package"
 * @generated
 */
public interface MapsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "maps";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/emf/teneo/samples/emf/jpa2/maps";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "maps";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MapsPackage eINSTANCE = org.eclipse.emf.teneo.samples.emf.jpa2.maps.impl.MapsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.jpa2.maps.impl.ImagesImpl <em>Images</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.jpa2.maps.impl.ImagesImpl
	 * @see org.eclipse.emf.teneo.samples.emf.jpa2.maps.impl.MapsPackageImpl#getImages()
	 * @generated
	 */
	int IMAGES = 0;

	/**
	 * The feature id for the '<em><b>Image Files</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGES__IMAGE_FILES = 0;

	/**
	 * The number of structural features of the '<em>Images</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGES_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.jpa2.maps.impl.PhotoBookImpl <em>Photo Book</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.jpa2.maps.impl.PhotoBookImpl
	 * @see org.eclipse.emf.teneo.samples.emf.jpa2.maps.impl.MapsPackageImpl#getPhotoBook()
	 * @generated
	 */
	int PHOTO_BOOK = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHOTO_BOOK__NAME = 0;

	/**
	 * The number of structural features of the '<em>Photo Book</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHOTO_BOOK_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.jpa2.maps.impl.StringToStringMapEntryImpl <em>String To String Map Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.jpa2.maps.impl.StringToStringMapEntryImpl
	 * @see org.eclipse.emf.teneo.samples.emf.jpa2.maps.impl.MapsPackageImpl#getStringToStringMapEntry()
	 * @generated
	 */
	int STRING_TO_STRING_MAP_ENTRY = 2;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_STRING_MAP_ENTRY__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_STRING_MAP_ENTRY__VALUE = 1;

	/**
	 * The number of structural features of the '<em>String To String Map Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_STRING_MAP_ENTRY_FEATURE_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.jpa2.maps.Images <em>Images</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Images</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.jpa2.maps.Images
	 * @generated
	 */
	EClass getImages();

	/**
	 * Returns the meta object for the map '{@link org.eclipse.emf.teneo.samples.emf.jpa2.maps.Images#getImageFiles <em>Image Files</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Image Files</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.jpa2.maps.Images#getImageFiles()
	 * @see #getImages()
	 * @generated
	 */
	EReference getImages_ImageFiles();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.jpa2.maps.PhotoBook <em>Photo Book</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Photo Book</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.jpa2.maps.PhotoBook
	 * @generated
	 */
	EClass getPhotoBook();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.jpa2.maps.PhotoBook#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.jpa2.maps.PhotoBook#getName()
	 * @see #getPhotoBook()
	 * @generated
	 */
	EAttribute getPhotoBook_Name();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>String To String Map Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String To String Map Entry</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.xml.type.String"
	 *        keyExtendedMetaData="kind='attribute' name='key'"
	 *        valueDataType="org.eclipse.emf.ecore.xml.type.String"
	 *        valueExtendedMetaData="kind='attribute' name='value'"
	 *        extendedMetaData="name='StringToStringMapEntry' kind='empty'"
	 * @generated
	 */
	EClass getStringToStringMapEntry();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToStringMapEntry()
	 * @generated
	 */
	EAttribute getStringToStringMapEntry_Key();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToStringMapEntry()
	 * @generated
	 */
	EAttribute getStringToStringMapEntry_Value();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MapsFactory getMapsFactory();

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
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.emf.jpa2.maps.impl.ImagesImpl <em>Images</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.emf.jpa2.maps.impl.ImagesImpl
		 * @see org.eclipse.emf.teneo.samples.emf.jpa2.maps.impl.MapsPackageImpl#getImages()
		 * @generated
		 */
		EClass IMAGES = eINSTANCE.getImages();

		/**
		 * The meta object literal for the '<em><b>Image Files</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMAGES__IMAGE_FILES = eINSTANCE.getImages_ImageFiles();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.emf.jpa2.maps.impl.PhotoBookImpl <em>Photo Book</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.emf.jpa2.maps.impl.PhotoBookImpl
		 * @see org.eclipse.emf.teneo.samples.emf.jpa2.maps.impl.MapsPackageImpl#getPhotoBook()
		 * @generated
		 */
		EClass PHOTO_BOOK = eINSTANCE.getPhotoBook();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHOTO_BOOK__NAME = eINSTANCE.getPhotoBook_Name();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.emf.jpa2.maps.impl.StringToStringMapEntryImpl <em>String To String Map Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.emf.jpa2.maps.impl.StringToStringMapEntryImpl
		 * @see org.eclipse.emf.teneo.samples.emf.jpa2.maps.impl.MapsPackageImpl#getStringToStringMapEntry()
		 * @generated
		 */
		EClass STRING_TO_STRING_MAP_ENTRY = eINSTANCE.getStringToStringMapEntry();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_TO_STRING_MAP_ENTRY__KEY = eINSTANCE.getStringToStringMapEntry_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_TO_STRING_MAP_ENTRY__VALUE = eINSTANCE.getStringToStringMapEntry_Value();

	}

} //MapsPackage

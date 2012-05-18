/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.emf.teneo.samples.emf.jpa2.maps;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
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
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.jpa2.maps.impl.DateToStringMapEntryImpl <em>Date To String Map Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.jpa2.maps.impl.DateToStringMapEntryImpl
	 * @see org.eclipse.emf.teneo.samples.emf.jpa2.maps.impl.MapsPackageImpl#getDateToStringMapEntry()
	 * @generated
	 */
	int DATE_TO_STRING_MAP_ENTRY = 0;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TO_STRING_MAP_ENTRY__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TO_STRING_MAP_ENTRY__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Date To String Map Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TO_STRING_MAP_ENTRY_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.jpa2.maps.impl.EnumToStringMapEntryImpl <em>Enum To String Map Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.jpa2.maps.impl.EnumToStringMapEntryImpl
	 * @see org.eclipse.emf.teneo.samples.emf.jpa2.maps.impl.MapsPackageImpl#getEnumToStringMapEntry()
	 * @generated
	 */
	int ENUM_TO_STRING_MAP_ENTRY = 1;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_TO_STRING_MAP_ENTRY__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_TO_STRING_MAP_ENTRY__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Enum To String Map Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_TO_STRING_MAP_ENTRY_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.jpa2.maps.impl.ImagesImpl <em>Images</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.jpa2.maps.impl.ImagesImpl
	 * @see org.eclipse.emf.teneo.samples.emf.jpa2.maps.impl.MapsPackageImpl#getImages()
	 * @generated
	 */
	int IMAGES = 2;

	/**
	 * The feature id for the '<em><b>Image Files</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGES__IMAGE_FILES = 0;

	/**
	 * The feature id for the '<em><b>Image Type Names</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGES__IMAGE_TYPE_NAMES = 1;

	/**
	 * The feature id for the '<em><b>Image Date Descriptions</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGES__IMAGE_DATE_DESCRIPTIONS = 2;

	/**
	 * The feature id for the '<em><b>Photo Parts</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGES__PHOTO_PARTS = 3;

	/**
	 * The number of structural features of the '<em>Images</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGES_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.jpa2.maps.impl.PhotoPartImpl <em>Photo Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.jpa2.maps.impl.PhotoPartImpl
	 * @see org.eclipse.emf.teneo.samples.emf.jpa2.maps.impl.MapsPackageImpl#getPhotoPart()
	 * @generated
	 */
	int PHOTO_PART = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHOTO_PART__NAME = 0;

	/**
	 * The number of structural features of the '<em>Photo Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHOTO_PART_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.jpa2.maps.impl.StringToPartMapEntryImpl <em>String To Part Map Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.jpa2.maps.impl.StringToPartMapEntryImpl
	 * @see org.eclipse.emf.teneo.samples.emf.jpa2.maps.impl.MapsPackageImpl#getStringToPartMapEntry()
	 * @generated
	 */
	int STRING_TO_PART_MAP_ENTRY = 4;

	/**
	 * The feature id for the '<em><b>Key</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_PART_MAP_ENTRY__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_PART_MAP_ENTRY__VALUE = 1;

	/**
	 * The number of structural features of the '<em>String To Part Map Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_PART_MAP_ENTRY_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.jpa2.maps.impl.StringToStringMapEntryImpl <em>String To String Map Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.jpa2.maps.impl.StringToStringMapEntryImpl
	 * @see org.eclipse.emf.teneo.samples.emf.jpa2.maps.impl.MapsPackageImpl#getStringToStringMapEntry()
	 * @generated
	 */
	int STRING_TO_STRING_MAP_ENTRY = 5;

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
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.jpa2.maps.EnumType <em>Enum Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.jpa2.maps.EnumType
	 * @see org.eclipse.emf.teneo.samples.emf.jpa2.maps.impl.MapsPackageImpl#getEnumType()
	 * @generated
	 */
	int ENUM_TYPE = 6;

	/**
	 * The meta object id for the '<em>Enum Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.jpa2.maps.EnumType
	 * @see org.eclipse.emf.teneo.samples.emf.jpa2.maps.impl.MapsPackageImpl#getEnumTypeObject()
	 * @generated
	 */
	int ENUM_TYPE_OBJECT = 7;

	/**
	 * The meta object id for the '<em>My Date</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Date
	 * @see org.eclipse.emf.teneo.samples.emf.jpa2.maps.impl.MapsPackageImpl#getMyDate()
	 * @generated
	 */
	int MY_DATE = 8;


	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>Date To String Map Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Date To String Map Entry</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.teneo.samples.emf.jpa2.maps.MyDate"
	 *        keyExtendedMetaData="kind='attribute' name='key'"
	 *        valueDataType="org.eclipse.emf.ecore.xml.type.String"
	 *        valueExtendedMetaData="kind='attribute' name='value'"
	 *        extendedMetaData="name='DateToStringMapEntry' kind='empty'"
	 * @generated
	 */
	EClass getDateToStringMapEntry();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getDateToStringMapEntry()
	 * @generated
	 */
	EAttribute getDateToStringMapEntry_Key();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getDateToStringMapEntry()
	 * @generated
	 */
	EAttribute getDateToStringMapEntry_Value();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>Enum To String Map Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enum To String Map Entry</em>'.
	 * @see java.util.Map.Entry
	 * @model keyUnsettable="true" keyDataType="org.eclipse.emf.teneo.samples.emf.jpa2.maps.EnumType"
	 *        keyExtendedMetaData="kind='attribute' name='key'"
	 *        valueDataType="org.eclipse.emf.ecore.xml.type.String"
	 *        valueExtendedMetaData="kind='attribute' name='value'"
	 *        extendedMetaData="name='EnumToStringMapEntry' kind='empty'"
	 * @generated
	 */
	EClass getEnumToStringMapEntry();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getEnumToStringMapEntry()
	 * @generated
	 */
	EAttribute getEnumToStringMapEntry_Key();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getEnumToStringMapEntry()
	 * @generated
	 */
	EAttribute getEnumToStringMapEntry_Value();

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
	 * Returns the meta object for the map '{@link org.eclipse.emf.teneo.samples.emf.jpa2.maps.Images#getImageTypeNames <em>Image Type Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Image Type Names</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.jpa2.maps.Images#getImageTypeNames()
	 * @see #getImages()
	 * @generated
	 */
	EReference getImages_ImageTypeNames();

	/**
	 * Returns the meta object for the map '{@link org.eclipse.emf.teneo.samples.emf.jpa2.maps.Images#getImageDateDescriptions <em>Image Date Descriptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Image Date Descriptions</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.jpa2.maps.Images#getImageDateDescriptions()
	 * @see #getImages()
	 * @generated
	 */
	EReference getImages_ImageDateDescriptions();

	/**
	 * Returns the meta object for the map '{@link org.eclipse.emf.teneo.samples.emf.jpa2.maps.Images#getPhotoParts <em>Photo Parts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Photo Parts</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.jpa2.maps.Images#getPhotoParts()
	 * @see #getImages()
	 * @generated
	 */
	EReference getImages_PhotoParts();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.jpa2.maps.PhotoPart <em>Photo Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Photo Part</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.jpa2.maps.PhotoPart
	 * @generated
	 */
	EClass getPhotoPart();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.jpa2.maps.PhotoPart#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.jpa2.maps.PhotoPart#getName()
	 * @see #getPhotoPart()
	 * @generated
	 */
	EAttribute getPhotoPart_Name();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>String To Part Map Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String To Part Map Entry</em>'.
	 * @see java.util.Map.Entry
	 * @model keyType="org.eclipse.emf.teneo.samples.emf.jpa2.maps.PhotoPart"
	 *        keyExtendedMetaData="kind='attribute' name='key'"
	 *        valueDataType="org.eclipse.emf.ecore.xml.type.String"
	 *        valueExtendedMetaData="kind='attribute' name='value'"
	 *        extendedMetaData="name='StringToPartMapEntry' kind='empty'"
	 * @generated
	 */
	EClass getStringToPartMapEntry();

	/**
	 * Returns the meta object for the reference '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToPartMapEntry()
	 * @generated
	 */
	EReference getStringToPartMapEntry_Key();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToPartMapEntry()
	 * @generated
	 */
	EAttribute getStringToPartMapEntry_Value();

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
	 * Returns the meta object for enum '{@link org.eclipse.emf.teneo.samples.emf.jpa2.maps.EnumType <em>Enum Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Enum Type</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.jpa2.maps.EnumType
	 * @generated
	 */
	EEnum getEnumType();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.emf.teneo.samples.emf.jpa2.maps.EnumType <em>Enum Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Enum Type Object</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.jpa2.maps.EnumType
	 * @model instanceClass="org.eclipse.emf.teneo.samples.emf.jpa2.maps.EnumType"
	 *        extendedMetaData="name='enumType:Object' baseType='enumType'"
	 * @generated
	 */
	EDataType getEnumTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.util.Date <em>My Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>My Date</em>'.
	 * @see java.util.Date
	 * @model instanceClass="java.util.Date"
	 *        extendedMetaData="name='myDate'"
	 * @generated
	 */
	EDataType getMyDate();

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
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.emf.jpa2.maps.impl.DateToStringMapEntryImpl <em>Date To String Map Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.emf.jpa2.maps.impl.DateToStringMapEntryImpl
		 * @see org.eclipse.emf.teneo.samples.emf.jpa2.maps.impl.MapsPackageImpl#getDateToStringMapEntry()
		 * @generated
		 */
		EClass DATE_TO_STRING_MAP_ENTRY = eINSTANCE.getDateToStringMapEntry();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_TO_STRING_MAP_ENTRY__KEY = eINSTANCE.getDateToStringMapEntry_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_TO_STRING_MAP_ENTRY__VALUE = eINSTANCE.getDateToStringMapEntry_Value();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.emf.jpa2.maps.impl.EnumToStringMapEntryImpl <em>Enum To String Map Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.emf.jpa2.maps.impl.EnumToStringMapEntryImpl
		 * @see org.eclipse.emf.teneo.samples.emf.jpa2.maps.impl.MapsPackageImpl#getEnumToStringMapEntry()
		 * @generated
		 */
		EClass ENUM_TO_STRING_MAP_ENTRY = eINSTANCE.getEnumToStringMapEntry();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUM_TO_STRING_MAP_ENTRY__KEY = eINSTANCE.getEnumToStringMapEntry_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUM_TO_STRING_MAP_ENTRY__VALUE = eINSTANCE.getEnumToStringMapEntry_Value();

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
		 * The meta object literal for the '<em><b>Image Type Names</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMAGES__IMAGE_TYPE_NAMES = eINSTANCE.getImages_ImageTypeNames();

		/**
		 * The meta object literal for the '<em><b>Image Date Descriptions</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMAGES__IMAGE_DATE_DESCRIPTIONS = eINSTANCE.getImages_ImageDateDescriptions();

		/**
		 * The meta object literal for the '<em><b>Photo Parts</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMAGES__PHOTO_PARTS = eINSTANCE.getImages_PhotoParts();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.emf.jpa2.maps.impl.PhotoPartImpl <em>Photo Part</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.emf.jpa2.maps.impl.PhotoPartImpl
		 * @see org.eclipse.emf.teneo.samples.emf.jpa2.maps.impl.MapsPackageImpl#getPhotoPart()
		 * @generated
		 */
		EClass PHOTO_PART = eINSTANCE.getPhotoPart();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHOTO_PART__NAME = eINSTANCE.getPhotoPart_Name();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.emf.jpa2.maps.impl.StringToPartMapEntryImpl <em>String To Part Map Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.emf.jpa2.maps.impl.StringToPartMapEntryImpl
		 * @see org.eclipse.emf.teneo.samples.emf.jpa2.maps.impl.MapsPackageImpl#getStringToPartMapEntry()
		 * @generated
		 */
		EClass STRING_TO_PART_MAP_ENTRY = eINSTANCE.getStringToPartMapEntry();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRING_TO_PART_MAP_ENTRY__KEY = eINSTANCE.getStringToPartMapEntry_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_TO_PART_MAP_ENTRY__VALUE = eINSTANCE.getStringToPartMapEntry_Value();

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

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.emf.jpa2.maps.EnumType <em>Enum Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.emf.jpa2.maps.EnumType
		 * @see org.eclipse.emf.teneo.samples.emf.jpa2.maps.impl.MapsPackageImpl#getEnumType()
		 * @generated
		 */
		EEnum ENUM_TYPE = eINSTANCE.getEnumType();

		/**
		 * The meta object literal for the '<em>Enum Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.emf.jpa2.maps.EnumType
		 * @see org.eclipse.emf.teneo.samples.emf.jpa2.maps.impl.MapsPackageImpl#getEnumTypeObject()
		 * @generated
		 */
		EDataType ENUM_TYPE_OBJECT = eINSTANCE.getEnumTypeObject();

		/**
		 * The meta object literal for the '<em>My Date</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.Date
		 * @see org.eclipse.emf.teneo.samples.emf.jpa2.maps.impl.MapsPackageImpl#getMyDate()
		 * @generated
		 */
		EDataType MY_DATE = eINSTANCE.getMyDate();

	}

} //MapsPackage

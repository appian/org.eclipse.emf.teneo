/**
 * <copyright>
 * </copyright>
 *
 * $Id: HbmapkeysPackage.java,v 1.1 2008/07/06 16:25:35 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.annotations.hbmapkeys;

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
 * @see org.eclipse.emf.teneo.samples.emf.annotations.hbmapkeys.HbmapkeysFactory
 * @model kind="package"
 * @generated
 */
public interface HbmapkeysPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "hbmapkeys";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/emf/teneo/samples/emf/annotations/hbmapkeys";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "hbmapkeys";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HbmapkeysPackage eINSTANCE = org.eclipse.emf.teneo.samples.emf.annotations.hbmapkeys.impl.HbmapkeysPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.annotations.hbmapkeys.impl.BookImpl <em>Book</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.hbmapkeys.impl.BookImpl
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.hbmapkeys.impl.HbmapkeysPackageImpl#getBook()
	 * @generated
	 */
	int BOOK = 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Writers By Name</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK__WRITERS_BY_NAME = 1;

	/**
	 * The feature id for the '<em><b>City By Writer</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK__CITY_BY_WRITER = 2;

	/**
	 * The number of structural features of the '<em>Book</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.annotations.hbmapkeys.impl.CityImpl <em>City</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.hbmapkeys.impl.CityImpl
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.hbmapkeys.impl.HbmapkeysPackageImpl#getCity()
	 * @generated
	 */
	int CITY = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY__NAME = 0;

	/**
	 * The feature id for the '<em><b>City Writer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY__CITY_WRITER = 1;

	/**
	 * The number of structural features of the '<em>City</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.annotations.hbmapkeys.impl.StringToWriterMapEntryImpl <em>String To Writer Map Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.hbmapkeys.impl.StringToWriterMapEntryImpl
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.hbmapkeys.impl.HbmapkeysPackageImpl#getStringToWriterMapEntry()
	 * @generated
	 */
	int STRING_TO_WRITER_MAP_ENTRY = 2;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_WRITER_MAP_ENTRY__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_WRITER_MAP_ENTRY__VALUE = 1;

	/**
	 * The number of structural features of the '<em>String To Writer Map Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_WRITER_MAP_ENTRY_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.annotations.hbmapkeys.impl.WriterImpl <em>Writer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.hbmapkeys.impl.WriterImpl
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.hbmapkeys.impl.HbmapkeysPackageImpl#getWriter()
	 * @generated
	 */
	int WRITER = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITER__NAME = 0;

	/**
	 * The number of structural features of the '<em>Writer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITER_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.annotations.hbmapkeys.impl.WriterToCityMapEntryImpl <em>Writer To City Map Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.hbmapkeys.impl.WriterToCityMapEntryImpl
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.hbmapkeys.impl.HbmapkeysPackageImpl#getWriterToCityMapEntry()
	 * @generated
	 */
	int WRITER_TO_CITY_MAP_ENTRY = 4;

	/**
	 * The feature id for the '<em><b>Key</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITER_TO_CITY_MAP_ENTRY__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITER_TO_CITY_MAP_ENTRY__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Writer To City Map Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITER_TO_CITY_MAP_ENTRY_FEATURE_COUNT = 2;

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.annotations.hbmapkeys.Book <em>Book</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Book</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.hbmapkeys.Book
	 * @generated
	 */
	EClass getBook();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.annotations.hbmapkeys.Book#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.hbmapkeys.Book#getTitle()
	 * @see #getBook()
	 * @generated
	 */
	EAttribute getBook_Title();

	/**
	 * Returns the meta object for the map '{@link org.eclipse.emf.teneo.samples.emf.annotations.hbmapkeys.Book#getWritersByName <em>Writers By Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Writers By Name</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.hbmapkeys.Book#getWritersByName()
	 * @see #getBook()
	 * @generated
	 */
	EReference getBook_WritersByName();

	/**
	 * Returns the meta object for the map '{@link org.eclipse.emf.teneo.samples.emf.annotations.hbmapkeys.Book#getCityByWriter <em>City By Writer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>City By Writer</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.hbmapkeys.Book#getCityByWriter()
	 * @see #getBook()
	 * @generated
	 */
	EReference getBook_CityByWriter();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.annotations.hbmapkeys.City <em>City</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>City</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.hbmapkeys.City
	 * @generated
	 */
	EClass getCity();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.annotations.hbmapkeys.City#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.hbmapkeys.City#getName()
	 * @see #getCity()
	 * @generated
	 */
	EAttribute getCity_Name();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.teneo.samples.emf.annotations.hbmapkeys.City#getCityWriter <em>City Writer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>City Writer</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.hbmapkeys.City#getCityWriter()
	 * @see #getCity()
	 * @generated
	 */
	EReference getCity_CityWriter();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>String To Writer Map Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String To Writer Map Entry</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.xml.type.String"
	 *        keyExtendedMetaData="kind='attribute' name='key'"
	 *        valueType="org.eclipse.emf.teneo.samples.emf.annotations.hbmapkeys.Writer" valueResolveProxies="false"
	 *        valueExtendedMetaData="kind='attribute' name='value'"
	 *        extendedMetaData="name='StringToWriterMapEntry' kind='empty'"
	 * @generated
	 */
	EClass getStringToWriterMapEntry();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToWriterMapEntry()
	 * @generated
	 */
	EAttribute getStringToWriterMapEntry_Key();

	/**
	 * Returns the meta object for the reference '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToWriterMapEntry()
	 * @generated
	 */
	EReference getStringToWriterMapEntry_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.annotations.hbmapkeys.Writer <em>Writer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Writer</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.hbmapkeys.Writer
	 * @generated
	 */
	EClass getWriter();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.annotations.hbmapkeys.Writer#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.hbmapkeys.Writer#getName()
	 * @see #getWriter()
	 * @generated
	 */
	EAttribute getWriter_Name();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>Writer To City Map Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Writer To City Map Entry</em>'.
	 * @see java.util.Map.Entry
	 * @model keyType="org.eclipse.emf.teneo.samples.emf.annotations.hbmapkeys.Writer" keyResolveProxies="false"
	 *        keyExtendedMetaData="kind='attribute' name='key'"
	 *        valueType="org.eclipse.emf.teneo.samples.emf.annotations.hbmapkeys.City" valueResolveProxies="false"
	 *        valueExtendedMetaData="kind='attribute' name='value'"
	 *        extendedMetaData="name='WriterToCityMapEntry' kind='empty'"
	 * @generated
	 */
	EClass getWriterToCityMapEntry();

	/**
	 * Returns the meta object for the reference '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getWriterToCityMapEntry()
	 * @generated
	 */
	EReference getWriterToCityMapEntry_Key();

	/**
	 * Returns the meta object for the reference '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getWriterToCityMapEntry()
	 * @generated
	 */
	EReference getWriterToCityMapEntry_Value();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	HbmapkeysFactory getHbmapkeysFactory();

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
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.emf.annotations.hbmapkeys.impl.BookImpl <em>Book</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.emf.annotations.hbmapkeys.impl.BookImpl
		 * @see org.eclipse.emf.teneo.samples.emf.annotations.hbmapkeys.impl.HbmapkeysPackageImpl#getBook()
		 * @generated
		 */
		EClass BOOK = eINSTANCE.getBook();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOK__TITLE = eINSTANCE.getBook_Title();

		/**
		 * The meta object literal for the '<em><b>Writers By Name</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOK__WRITERS_BY_NAME = eINSTANCE.getBook_WritersByName();

		/**
		 * The meta object literal for the '<em><b>City By Writer</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOK__CITY_BY_WRITER = eINSTANCE.getBook_CityByWriter();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.emf.annotations.hbmapkeys.impl.CityImpl <em>City</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.emf.annotations.hbmapkeys.impl.CityImpl
		 * @see org.eclipse.emf.teneo.samples.emf.annotations.hbmapkeys.impl.HbmapkeysPackageImpl#getCity()
		 * @generated
		 */
		EClass CITY = eINSTANCE.getCity();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CITY__NAME = eINSTANCE.getCity_Name();

		/**
		 * The meta object literal for the '<em><b>City Writer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CITY__CITY_WRITER = eINSTANCE.getCity_CityWriter();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.emf.annotations.hbmapkeys.impl.StringToWriterMapEntryImpl <em>String To Writer Map Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.emf.annotations.hbmapkeys.impl.StringToWriterMapEntryImpl
		 * @see org.eclipse.emf.teneo.samples.emf.annotations.hbmapkeys.impl.HbmapkeysPackageImpl#getStringToWriterMapEntry()
		 * @generated
		 */
		EClass STRING_TO_WRITER_MAP_ENTRY = eINSTANCE.getStringToWriterMapEntry();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_TO_WRITER_MAP_ENTRY__KEY = eINSTANCE.getStringToWriterMapEntry_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRING_TO_WRITER_MAP_ENTRY__VALUE = eINSTANCE.getStringToWriterMapEntry_Value();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.emf.annotations.hbmapkeys.impl.WriterImpl <em>Writer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.emf.annotations.hbmapkeys.impl.WriterImpl
		 * @see org.eclipse.emf.teneo.samples.emf.annotations.hbmapkeys.impl.HbmapkeysPackageImpl#getWriter()
		 * @generated
		 */
		EClass WRITER = eINSTANCE.getWriter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WRITER__NAME = eINSTANCE.getWriter_Name();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.emf.annotations.hbmapkeys.impl.WriterToCityMapEntryImpl <em>Writer To City Map Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.emf.annotations.hbmapkeys.impl.WriterToCityMapEntryImpl
		 * @see org.eclipse.emf.teneo.samples.emf.annotations.hbmapkeys.impl.HbmapkeysPackageImpl#getWriterToCityMapEntry()
		 * @generated
		 */
		EClass WRITER_TO_CITY_MAP_ENTRY = eINSTANCE.getWriterToCityMapEntry();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WRITER_TO_CITY_MAP_ENTRY__KEY = eINSTANCE.getWriterToCityMapEntry_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WRITER_TO_CITY_MAP_ENTRY__VALUE = eINSTANCE.getWriterToCityMapEntry_Value();

	}

} //HbmapkeysPackage

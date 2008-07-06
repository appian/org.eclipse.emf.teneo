/**
 * <copyright>
 * </copyright>
 *
 * $Id: HbmapkeysFactoryImpl.java,v 1.1 2008/07/06 16:25:35 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.annotations.hbmapkeys.impl;

import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.teneo.samples.emf.annotations.hbmapkeys.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class HbmapkeysFactoryImpl extends EFactoryImpl implements HbmapkeysFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static HbmapkeysFactory init() {
		try {
			HbmapkeysFactory theHbmapkeysFactory = (HbmapkeysFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/emf/teneo/samples/emf/annotations/hbmapkeys"); 
			if (theHbmapkeysFactory != null) {
				return theHbmapkeysFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new HbmapkeysFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HbmapkeysFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case HbmapkeysPackage.BOOK: return createBook();
			case HbmapkeysPackage.CITY: return createCity();
			case HbmapkeysPackage.STRING_TO_WRITER_MAP_ENTRY: return (EObject)createStringToWriterMapEntry();
			case HbmapkeysPackage.WRITER: return createWriter();
			case HbmapkeysPackage.WRITER_TO_CITY_MAP_ENTRY: return (EObject)createWriterToCityMapEntry();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Book createBook() {
		BookImpl book = new BookImpl();
		return book;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public City createCity() {
		CityImpl city = new CityImpl();
		return city;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<String, Writer> createStringToWriterMapEntry() {
		StringToWriterMapEntryImpl stringToWriterMapEntry = new StringToWriterMapEntryImpl();
		return stringToWriterMapEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Writer createWriter() {
		WriterImpl writer = new WriterImpl();
		return writer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<Writer, City> createWriterToCityMapEntry() {
		WriterToCityMapEntryImpl writerToCityMapEntry = new WriterToCityMapEntryImpl();
		return writerToCityMapEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HbmapkeysPackage getHbmapkeysPackage() {
		return (HbmapkeysPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static HbmapkeysPackage getPackage() {
		return HbmapkeysPackage.eINSTANCE;
	}

} //HbmapkeysFactoryImpl

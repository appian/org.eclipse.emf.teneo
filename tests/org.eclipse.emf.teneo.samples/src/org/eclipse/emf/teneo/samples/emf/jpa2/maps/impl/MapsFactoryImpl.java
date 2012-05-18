/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.emf.teneo.samples.emf.jpa2.maps.impl;

import java.util.Date;
import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.teneo.samples.emf.jpa2.maps.*;
import org.eclipse.emf.teneo.samples.emf.jpa2.maps.EnumType;
import org.eclipse.emf.teneo.samples.emf.jpa2.maps.Images;
import org.eclipse.emf.teneo.samples.emf.jpa2.maps.MapsFactory;
import org.eclipse.emf.teneo.samples.emf.jpa2.maps.MapsPackage;
import org.eclipse.emf.teneo.samples.emf.jpa2.maps.PhotoPart;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MapsFactoryImpl extends EFactoryImpl implements MapsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MapsFactory init() {
		try {
			MapsFactory theMapsFactory = (MapsFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/emf/teneo/samples/emf/jpa2/maps"); 
			if (theMapsFactory != null) {
				return theMapsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MapsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MapsFactoryImpl() {
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
			case MapsPackage.DATE_TO_STRING_MAP_ENTRY: return (EObject)createDateToStringMapEntry();
			case MapsPackage.ENUM_TO_STRING_MAP_ENTRY: return (EObject)createEnumToStringMapEntry();
			case MapsPackage.IMAGES: return createImages();
			case MapsPackage.PHOTO_PART: return createPhotoPart();
			case MapsPackage.STRING_TO_PART_MAP_ENTRY: return (EObject)createStringToPartMapEntry();
			case MapsPackage.STRING_TO_STRING_MAP_ENTRY: return (EObject)createStringToStringMapEntry();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case MapsPackage.ENUM_TYPE:
				return createEnumTypeFromString(eDataType, initialValue);
			case MapsPackage.ENUM_TYPE_OBJECT:
				return createEnumTypeObjectFromString(eDataType, initialValue);
			case MapsPackage.MY_DATE:
				return createMyDateFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case MapsPackage.ENUM_TYPE:
				return convertEnumTypeToString(eDataType, instanceValue);
			case MapsPackage.ENUM_TYPE_OBJECT:
				return convertEnumTypeObjectToString(eDataType, instanceValue);
			case MapsPackage.MY_DATE:
				return convertMyDateToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<Date, String> createDateToStringMapEntry() {
		DateToStringMapEntryImpl dateToStringMapEntry = new DateToStringMapEntryImpl();
		return dateToStringMapEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<EnumType, String> createEnumToStringMapEntry() {
		EnumToStringMapEntryImpl enumToStringMapEntry = new EnumToStringMapEntryImpl();
		return enumToStringMapEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Images createImages() {
		ImagesImpl images = new ImagesImpl();
		return images;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhotoPart createPhotoPart() {
		PhotoPartImpl photoPart = new PhotoPartImpl();
		return photoPart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<PhotoPart, String> createStringToPartMapEntry() {
		StringToPartMapEntryImpl stringToPartMapEntry = new StringToPartMapEntryImpl();
		return stringToPartMapEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<String, String> createStringToStringMapEntry() {
		StringToStringMapEntryImpl stringToStringMapEntry = new StringToStringMapEntryImpl();
		return stringToStringMapEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumType createEnumTypeFromString(EDataType eDataType, String initialValue) {
		EnumType result = EnumType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEnumTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumType createEnumTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createEnumTypeFromString(MapsPackage.Literals.ENUM_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEnumTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertEnumTypeToString(MapsPackage.Literals.ENUM_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date createMyDateFromString(EDataType eDataType, String initialValue) {
		return (Date)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMyDateToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MapsPackage getMapsPackage() {
		return (MapsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MapsPackage getPackage() {
		return MapsPackage.eINSTANCE;
	}

} //MapsFactoryImpl

/**
 * <copyright>
 * </copyright>
 *
 * $Id: FeaturemapFactoryImpl.java,v 1.2 2007/02/08 23:09:23 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.elist.featuremap.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.teneo.samples.emf.elist.featuremap.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FeaturemapFactoryImpl extends EFactoryImpl implements FeaturemapFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FeaturemapFactory init() {
		try {
			FeaturemapFactory theFeaturemapFactory = (FeaturemapFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/emf/teneo/store/test/emf/elist/featuremap"); 
			if (theFeaturemapFactory != null) {
				return theFeaturemapFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FeaturemapFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeaturemapFactoryImpl() {
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
			case FeaturemapPackage.PRICE_BY_QUANTITY_TYPE: return createPriceByQuantityType();
			case FeaturemapPackage.PRODUCT_TYPE: return createProductType();
			case FeaturemapPackage.SUPPLIER_PRICE_TYPE: return createSupplierPriceType();
			case FeaturemapPackage.TRANSLATED_DESCRIPTION_TYPE: return createTranslatedDescriptionType();
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
			case FeaturemapPackage.PRODUCT_CLASSIFICATION:
				return createProductClassificationFromString(eDataType, initialValue);
			case FeaturemapPackage.PRODUCT_CLASSIFICATION_OBJECT:
				return createProductClassificationObjectFromString(eDataType, initialValue);
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
			case FeaturemapPackage.PRODUCT_CLASSIFICATION:
				return convertProductClassificationToString(eDataType, instanceValue);
			case FeaturemapPackage.PRODUCT_CLASSIFICATION_OBJECT:
				return convertProductClassificationObjectToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PriceByQuantityType createPriceByQuantityType() {
		PriceByQuantityTypeImpl priceByQuantityType = new PriceByQuantityTypeImpl();
		return priceByQuantityType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductType createProductType() {
		ProductTypeImpl productType = new ProductTypeImpl();
		return productType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupplierPriceType createSupplierPriceType() {
		SupplierPriceTypeImpl supplierPriceType = new SupplierPriceTypeImpl();
		return supplierPriceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TranslatedDescriptionType createTranslatedDescriptionType() {
		TranslatedDescriptionTypeImpl translatedDescriptionType = new TranslatedDescriptionTypeImpl();
		return translatedDescriptionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductClassification createProductClassificationFromString(EDataType eDataType, String initialValue) {
		ProductClassification result = ProductClassification.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProductClassificationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductClassification createProductClassificationObjectFromString(EDataType eDataType, String initialValue) {
		return createProductClassificationFromString(FeaturemapPackage.Literals.PRODUCT_CLASSIFICATION, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProductClassificationObjectToString(EDataType eDataType, Object instanceValue) {
		return convertProductClassificationToString(FeaturemapPackage.Literals.PRODUCT_CLASSIFICATION, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeaturemapPackage getFeaturemapPackage() {
		return (FeaturemapPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static FeaturemapPackage getPackage() {
		return FeaturemapPackage.eINSTANCE;
	}

} //FeaturemapFactoryImpl

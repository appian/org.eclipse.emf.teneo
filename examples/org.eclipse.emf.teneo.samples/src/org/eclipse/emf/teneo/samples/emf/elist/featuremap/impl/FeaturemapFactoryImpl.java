/**
 * <copyright>
 * </copyright>
 *
 * $Id: FeaturemapFactoryImpl.java,v 1.1 2006/07/11 16:57:09 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.elist.featuremap.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.teneo.samples.emf.elist.featuremap.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FeaturemapFactoryImpl extends EFactoryImpl implements FeaturemapFactory {
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
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case FeaturemapPackage.PRODUCT_CLASSIFICATION: {
				ProductClassification result = ProductClassification.get(initialValue);
				if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
				return result;
			}
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
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case FeaturemapPackage.PRODUCT_CLASSIFICATION:
				return instanceValue == null ? null : instanceValue.toString();
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
	public ProductClassification createProductClassificationObjectFromString(EDataType eDataType, String initialValue) {
		return (ProductClassification)FeaturemapFactory.eINSTANCE.createFromString(FeaturemapPackage.eINSTANCE.getProductClassification(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProductClassificationObjectToString(EDataType eDataType, Object instanceValue) {
		return FeaturemapFactory.eINSTANCE.convertToString(FeaturemapPackage.eINSTANCE.getProductClassification(), instanceValue);
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
	public static FeaturemapPackage getPackage() {
		return FeaturemapPackage.eINSTANCE;
	}

} //FeaturemapFactoryImpl

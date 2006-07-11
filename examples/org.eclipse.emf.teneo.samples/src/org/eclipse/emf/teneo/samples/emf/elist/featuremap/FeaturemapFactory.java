/**
 * <copyright>
 * </copyright>
 *
 * $Id: FeaturemapFactory.java,v 1.1 2006/07/11 16:56:59 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.elist.featuremap;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.teneo.samples.emf.elist.featuremap.FeaturemapPackage
 * @generated
 */
public interface FeaturemapFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FeaturemapFactory eINSTANCE = new org.eclipse.emf.teneo.samples.emf.elist.featuremap.impl.FeaturemapFactoryImpl();

	/**
	 * Returns a new object of class '<em>Price By Quantity Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Price By Quantity Type</em>'.
	 * @generated
	 */
	PriceByQuantityType createPriceByQuantityType();

	/**
	 * Returns a new object of class '<em>Product Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product Type</em>'.
	 * @generated
	 */
	ProductType createProductType();

	/**
	 * Returns a new object of class '<em>Supplier Price Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Supplier Price Type</em>'.
	 * @generated
	 */
	SupplierPriceType createSupplierPriceType();

	/**
	 * Returns a new object of class '<em>Translated Description Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Translated Description Type</em>'.
	 * @generated
	 */
	TranslatedDescriptionType createTranslatedDescriptionType();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	FeaturemapPackage getFeaturemapPackage();

} //FeaturemapFactory

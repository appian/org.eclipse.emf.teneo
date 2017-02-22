/**
 */
package org.eclipse.emf.teneo.samples.issues.refreshextra.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.teneo.samples.issues.refreshextra.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RefreshextraFactoryImpl extends EFactoryImpl implements RefreshextraFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RefreshextraFactory init() {
		try {
			RefreshextraFactory theRefreshextraFactory = (RefreshextraFactory)EPackage.Registry.INSTANCE.getEFactory(RefreshextraPackage.eNS_URI);
			if (theRefreshextraFactory != null) {
				return theRefreshextraFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RefreshextraFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefreshextraFactoryImpl() {
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
			case RefreshextraPackage.ITEM_CONTAINER: return createItemContainer();
			case RefreshextraPackage.ITEM_ELEMENT: return createItemElement();
			case RefreshextraPackage.ITEM_NON_CONTAINER: return createItemNonContainer();
			case RefreshextraPackage.ITEM_NON_CONTAINER2: return createItemNonContainer2();
			case RefreshextraPackage.ITEM_CONTAINER2: return createItemContainer2();
			case RefreshextraPackage.ITEM_ELEMENT_BIDIR: return createItemElementBidir();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItemContainer createItemContainer() {
		ItemContainerImpl itemContainer = new ItemContainerImpl();
		return itemContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItemElement createItemElement() {
		ItemElementImpl itemElement = new ItemElementImpl();
		return itemElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItemNonContainer createItemNonContainer() {
		ItemNonContainerImpl itemNonContainer = new ItemNonContainerImpl();
		return itemNonContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItemNonContainer2 createItemNonContainer2() {
		ItemNonContainer2Impl itemNonContainer2 = new ItemNonContainer2Impl();
		return itemNonContainer2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItemContainer2 createItemContainer2() {
		ItemContainer2Impl itemContainer2 = new ItemContainer2Impl();
		return itemContainer2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItemElementBidir createItemElementBidir() {
		ItemElementBidirImpl itemElementBidir = new ItemElementBidirImpl();
		return itemElementBidir;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefreshextraPackage getRefreshextraPackage() {
		return (RefreshextraPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RefreshextraPackage getPackage() {
		return RefreshextraPackage.eINSTANCE;
	}

} //RefreshextraFactoryImpl

/**
 * <copyright>
 * </copyright>
 *
 * $Id: NmsetFactoryImpl.java,v 1.5 2007/02/08 23:09:21 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.annotations.nmset.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.teneo.samples.emf.annotations.nmset.*;
import org.eclipse.emf.teneo.samples.emf.annotations.nmset.MyItem;
import org.eclipse.emf.teneo.samples.emf.annotations.nmset.NmsetFactory;
import org.eclipse.emf.teneo.samples.emf.annotations.nmset.NmsetPackage;
import org.eclipse.emf.teneo.samples.emf.annotations.nmset.YourItem;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class NmsetFactoryImpl extends EFactoryImpl implements NmsetFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static NmsetFactory init() {
		try {
			NmsetFactory theNmsetFactory = (NmsetFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/emf/teneo/samples/emf/annotations/nmset"); 
			if (theNmsetFactory != null) {
				return theNmsetFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new NmsetFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NmsetFactoryImpl() {
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
			case NmsetPackage.MY_ITEM: return createMyItem();
			case NmsetPackage.YOUR_ITEM: return createYourItem();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MyItem createMyItem() {
		MyItemImpl myItem = new MyItemImpl();
		return myItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YourItem createYourItem() {
		YourItemImpl yourItem = new YourItemImpl();
		return yourItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NmsetPackage getNmsetPackage() {
		return (NmsetPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static NmsetPackage getPackage() {
		return NmsetPackage.eINSTANCE;
	}

} //NmsetFactoryImpl

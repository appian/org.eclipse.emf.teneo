/**
 * <copyright>
 * </copyright>
 *
 * $Id: HbModelFactoryImpl.java,v 1.2 2006/11/13 14:53:00 mtaal Exp $
 */
package org.eclipse.emf.teneo.hibernate.hbmodel.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.teneo.hibernate.hbmodel.HbAnnotatedEAttribute;
import org.eclipse.emf.teneo.hibernate.hbmodel.HbAnnotatedEClass;
import org.eclipse.emf.teneo.hibernate.hbmodel.HbAnnotatedEDataType;
import org.eclipse.emf.teneo.hibernate.hbmodel.HbAnnotatedEPackage;
import org.eclipse.emf.teneo.hibernate.hbmodel.HbAnnotatedEReference;
import org.eclipse.emf.teneo.hibernate.hbmodel.HbModelFactory;
import org.eclipse.emf.teneo.hibernate.hbmodel.HbModelPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!-- end-user-doc -->
 * 
 * @generated
 */
public class HbModelFactoryImpl extends EFactoryImpl implements HbModelFactory {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2005, 2006 Springsite BV (The Netherlands) and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public\nLicense v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n   Martin Taal\n   Douglas Bitting\n";

	/**
	 * Creates the default factory implementation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static HbModelFactory init() {
		try {
			HbModelFactory theHbModelFactory = (HbModelFactory) EPackage.Registry.INSTANCE
					.getEFactory("http://www.eclipse.org/emf/teneo/2006/HbModel");
			if (theHbModelFactory != null) {
				return theHbModelFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new HbModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public HbModelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case HbModelPackage.HB_ANNOTATED_EATTRIBUTE:
			return createHbAnnotatedEAttribute();
		case HbModelPackage.HB_ANNOTATED_ECLASS:
			return createHbAnnotatedEClass();
		case HbModelPackage.HB_ANNOTATED_EPACKAGE:
			return createHbAnnotatedEPackage();
		case HbModelPackage.HB_ANNOTATED_EREFERENCE:
			return createHbAnnotatedEReference();
		case HbModelPackage.HB_ANNOTATED_EDATA_TYPE:
			return createHbAnnotatedEDataType();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public HbAnnotatedEAttribute createHbAnnotatedEAttribute() {
		HbAnnotatedEAttributeImpl hbAnnotatedEAttribute = new HbAnnotatedEAttributeImpl();
		return hbAnnotatedEAttribute;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public HbAnnotatedEClass createHbAnnotatedEClass() {
		HbAnnotatedEClassImpl hbAnnotatedEClass = new HbAnnotatedEClassImpl();
		return hbAnnotatedEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public HbAnnotatedEPackage createHbAnnotatedEPackage() {
		HbAnnotatedEPackageImpl hbAnnotatedEPackage = new HbAnnotatedEPackageImpl();
		return hbAnnotatedEPackage;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public HbAnnotatedEReference createHbAnnotatedEReference() {
		HbAnnotatedEReferenceImpl hbAnnotatedEReference = new HbAnnotatedEReferenceImpl();
		return hbAnnotatedEReference;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public HbAnnotatedEDataType createHbAnnotatedEDataType() {
		HbAnnotatedEDataTypeImpl hbAnnotatedEDataType = new HbAnnotatedEDataTypeImpl();
		return hbAnnotatedEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public HbModelPackage getHbModelPackage() {
		return (HbModelPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @deprecated
	 * @generated
	 */
	public static HbModelPackage getPackage() {
		return HbModelPackage.eINSTANCE;
	}

} // HbModelFactoryImpl

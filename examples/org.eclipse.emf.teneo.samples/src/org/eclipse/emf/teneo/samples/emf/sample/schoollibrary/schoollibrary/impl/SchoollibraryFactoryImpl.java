/**
 * <copyright>
 * </copyright>
 *
 * $Id: SchoollibraryFactoryImpl.java,v 1.1 2006/07/11 16:56:57 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.sample.schoollibrary.schoollibrary.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.teneo.samples.emf.sample.schoollibrary.schoollibrary.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SchoollibraryFactoryImpl extends EFactoryImpl implements SchoollibraryFactory {
	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchoollibraryFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case SchoollibraryPackage.ASSET: return createAsset();
			case SchoollibraryPackage.SCHOOL_BOOK: return createSchoolBook();
			case SchoollibraryPackage.SCHOOL_LIBRARY: return createSchoolLibrary();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Asset createAsset() {
		AssetImpl asset = new AssetImpl();
		return asset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchoolBook createSchoolBook() {
		SchoolBookImpl schoolBook = new SchoolBookImpl();
		return schoolBook;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchoolLibrary createSchoolLibrary() {
		SchoolLibraryImpl schoolLibrary = new SchoolLibraryImpl();
		return schoolLibrary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchoollibraryPackage getSchoollibraryPackage() {
		return (SchoollibraryPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	public static SchoollibraryPackage getPackage() {
		return SchoollibraryPackage.eINSTANCE;
	}

} //SchoollibraryFactoryImpl

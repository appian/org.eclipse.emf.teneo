/**
 * <copyright>
 * </copyright>
 *
 * $Id: MappedsuperclassFactoryImpl.java,v 1.4 2007/08/10 20:30:43 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.annotations.mappedsuperclass.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.teneo.samples.emf.annotations.mappedsuperclass.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MappedsuperclassFactoryImpl extends EFactoryImpl implements MappedsuperclassFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MappedsuperclassFactory init() {
		try {
			MappedsuperclassFactory theMappedsuperclassFactory = (MappedsuperclassFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/emf/teneo/samples/emf/annotations/mappedsuperclass"); 
			if (theMappedsuperclassFactory != null) {
				return theMappedsuperclassFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MappedsuperclassFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappedsuperclassFactoryImpl() {
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
			case MappedsuperclassPackage.ADD_ID_DOCUMENT: return createAddIDDocument();
			case MappedsuperclassPackage.DOCUMENT: return createDocument();
			case MappedsuperclassPackage.PARENT_DOCUMENT: return createParentDocument();
			case MappedsuperclassPackage.SPECIFIC_DOCUMENT: return createSpecificDocument();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddIDDocument createAddIDDocument() {
		AddIDDocumentImpl addIDDocument = new AddIDDocumentImpl();
		return addIDDocument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Document createDocument() {
		DocumentImpl document = new DocumentImpl();
		return document;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParentDocument createParentDocument() {
		ParentDocumentImpl parentDocument = new ParentDocumentImpl();
		return parentDocument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecificDocument createSpecificDocument() {
		SpecificDocumentImpl specificDocument = new SpecificDocumentImpl();
		return specificDocument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappedsuperclassPackage getMappedsuperclassPackage() {
		return (MappedsuperclassPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MappedsuperclassPackage getPackage() {
		return MappedsuperclassPackage.eINSTANCE;
	}

} //MappedsuperclassFactoryImpl

/**
 * <copyright>
 * </copyright>
 *
 * $Id: CarXMLProcessor.java,v 1.1 2007/08/10 20:17:32 mtaal Exp $
 */
package com.example.car.util;

import com.example.car.CarPackage;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CarXMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CarXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		CarPackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the CarResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new CarResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new CarResourceFactoryImpl());
		}
		return registrations;
	}

} //CarXMLProcessor

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.emf.teneo.samples.issues.bz363777.util;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

import org.eclipse.emf.teneo.samples.issues.bz363777.Bz363777Package;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Bz363777XMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bz363777XMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		Bz363777Package.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the Bz363777ResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new Bz363777ResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new Bz363777ResourceFactoryImpl());
		}
		return registrations;
	}

} //Bz363777XMLProcessor

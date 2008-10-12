/**
 * <copyright>
 * </copyright>
 *
 * $Id: Bz249246XMLProcessor.java,v 1.1 2008/10/12 11:24:38 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.bz249246.util;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

import org.eclipse.emf.teneo.samples.issues.bz249246.Bz249246Package;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Bz249246XMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bz249246XMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		Bz249246Package.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the Bz249246ResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new Bz249246ResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new Bz249246ResourceFactoryImpl());
		}
		return registrations;
	}

} //Bz249246XMLProcessor

/**
 * <copyright>
 * </copyright>
 *
 * $Id: Bz225296XMLProcessor.java,v 1.1 2008/04/04 11:50:24 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.bz225296.util;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

import org.eclipse.emf.teneo.samples.issues.bz225296.Bz225296Package;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Bz225296XMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bz225296XMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		Bz225296Package.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the Bz225296ResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new Bz225296ResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new Bz225296ResourceFactoryImpl());
		}
		return registrations;
	}

} //Bz225296XMLProcessor

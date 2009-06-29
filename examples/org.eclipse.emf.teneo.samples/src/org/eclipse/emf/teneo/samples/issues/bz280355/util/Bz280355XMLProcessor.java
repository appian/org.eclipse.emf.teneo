/**
 * <copyright>
 * </copyright>
 *
 * $Id: Bz280355XMLProcessor.java,v 1.1 2009/06/29 22:54:13 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.bz280355.util;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

import org.eclipse.emf.teneo.samples.issues.bz280355.Bz280355Package;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Bz280355XMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bz280355XMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		Bz280355Package.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the Bz280355ResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new Bz280355ResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new Bz280355ResourceFactoryImpl());
		}
		return registrations;
	}

} //Bz280355XMLProcessor

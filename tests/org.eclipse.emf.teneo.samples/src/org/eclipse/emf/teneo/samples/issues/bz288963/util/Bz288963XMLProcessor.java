/**
 * <copyright>
 * </copyright>
 *
 * $Id: Bz288963XMLProcessor.java,v 1.1 2009/09/12 04:47:31 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.bz288963.util;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

import org.eclipse.emf.teneo.samples.issues.bz288963.Bz288963Package;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Bz288963XMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bz288963XMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		Bz288963Package.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the Bz288963ResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new Bz288963ResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new Bz288963ResourceFactoryImpl());
		}
		return registrations;
	}

} //Bz288963XMLProcessor

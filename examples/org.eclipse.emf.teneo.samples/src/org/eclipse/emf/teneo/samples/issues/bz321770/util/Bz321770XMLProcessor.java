/**
 * <copyright>
 * </copyright>
 *
 * $Id: Bz321770XMLProcessor.java,v 1.1 2010/08/18 13:40:04 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.bz321770.util;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

import org.eclipse.emf.teneo.samples.issues.bz321770.Bz321770Package;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Bz321770XMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bz321770XMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		Bz321770Package.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the Bz321770ResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new Bz321770ResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new Bz321770ResourceFactoryImpl());
		}
		return registrations;
	}

} //Bz321770XMLProcessor

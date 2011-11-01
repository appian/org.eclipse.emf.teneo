/**
 * <copyright>
 * </copyright>
 *
 * $Id: Bz321773XMLProcessor.java,v 1.1 2010/08/19 08:34:52 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.bz321773.util;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

import org.eclipse.emf.teneo.samples.issues.bz321773.Bz321773Package;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Bz321773XMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bz321773XMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		Bz321773Package.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the Bz321773ResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new Bz321773ResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new Bz321773ResourceFactoryImpl());
		}
		return registrations;
	}

} //Bz321773XMLProcessor

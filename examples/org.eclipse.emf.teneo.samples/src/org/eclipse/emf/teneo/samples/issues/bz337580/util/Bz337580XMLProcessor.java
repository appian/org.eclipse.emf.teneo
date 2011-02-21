/**
 * <copyright>
 * </copyright>
 *
 * $Id: Bz337580XMLProcessor.java,v 1.1 2011/02/21 06:40:19 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.bz337580.util;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

import org.eclipse.emf.teneo.samples.issues.bz337580.Bz337580Package;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Bz337580XMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bz337580XMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		Bz337580Package.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the Bz337580ResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new Bz337580ResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new Bz337580ResourceFactoryImpl());
		}
		return registrations;
	}

} //Bz337580XMLProcessor

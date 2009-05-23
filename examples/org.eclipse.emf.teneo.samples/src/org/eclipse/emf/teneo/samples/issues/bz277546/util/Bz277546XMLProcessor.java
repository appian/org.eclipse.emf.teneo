/**
 * <copyright>
 * </copyright>
 *
 * $Id: Bz277546XMLProcessor.java,v 1.1.2.1 2009/05/23 10:33:40 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.bz277546.util;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

import org.eclipse.emf.teneo.samples.issues.bz277546.Bz277546Package;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Bz277546XMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bz277546XMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		Bz277546Package.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the Bz277546ResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new Bz277546ResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new Bz277546ResourceFactoryImpl());
		}
		return registrations;
	}

} //Bz277546XMLProcessor

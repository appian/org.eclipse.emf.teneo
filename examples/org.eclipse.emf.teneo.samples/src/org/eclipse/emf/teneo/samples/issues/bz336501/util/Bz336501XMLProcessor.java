/**
 * <copyright>
 * </copyright>
 *
 * $Id: Bz336501XMLProcessor.java,v 1.1 2011/02/21 05:47:40 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.bz336501.util;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

import org.eclipse.emf.teneo.samples.issues.bz336501.Bz336501Package;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Bz336501XMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bz336501XMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		Bz336501Package.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the Bz336501ResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new Bz336501ResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new Bz336501ResourceFactoryImpl());
		}
		return registrations;
	}

} //Bz336501XMLProcessor

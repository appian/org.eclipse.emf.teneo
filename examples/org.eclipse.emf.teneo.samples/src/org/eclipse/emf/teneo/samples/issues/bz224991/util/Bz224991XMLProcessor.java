/**
 * <copyright>
 * </copyright>
 *
 * $Id: Bz224991XMLProcessor.java,v 1.1 2008/04/04 11:50:25 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.bz224991.util;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

import org.eclipse.emf.teneo.samples.issues.bz224991.Bz224991Package;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Bz224991XMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bz224991XMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		Bz224991Package.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the Bz224991ResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new Bz224991ResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new Bz224991ResourceFactoryImpl());
		}
		return registrations;
	}

} //Bz224991XMLProcessor

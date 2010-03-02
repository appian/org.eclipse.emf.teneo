/**
 * <copyright>
 * </copyright>
 *
 * $Id: ExtlibraryXMLProcessor.java,v 1.2 2010/03/02 06:08:35 mtaal Exp $
 */
package org.eclipse.emf.teneo.hibernate.examples.extlibrary.util;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

import org.eclipse.emf.teneo.hibernate.examples.extlibrary.ExtlibraryPackage;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ExtlibraryXMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtlibraryXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		ExtlibraryPackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the ExtlibraryResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new ExtlibraryResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new ExtlibraryResourceFactoryImpl());
		}
		return registrations;
	}

} //ExtlibraryXMLProcessor

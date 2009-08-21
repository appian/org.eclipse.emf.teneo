/**
 * <copyright>
 * </copyright>
 *
 * $Id: EavlibraryXMLProcessor.java,v 1.1 2009/08/21 15:01:54 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.annotations.eavlibrary.util;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

import org.eclipse.emf.teneo.samples.emf.annotations.eavlibrary.EavlibraryPackage;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EavlibraryXMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EavlibraryXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		EavlibraryPackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the EavlibraryResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new EavlibraryResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new EavlibraryResourceFactoryImpl());
		}
		return registrations;
	}

} //EavlibraryXMLProcessor

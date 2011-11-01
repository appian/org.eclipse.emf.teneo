/**
 * <copyright>
 * </copyright>
 *
 * $Id: ExternalXMLProcessor.java,v 1.1 2008/12/16 20:40:24 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.annotations.external.util;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

import org.eclipse.emf.teneo.samples.emf.annotations.external.ExternalPackage;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ExternalXMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		ExternalPackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the ExternalResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new ExternalResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new ExternalResourceFactoryImpl());
		}
		return registrations;
	}

} //ExternalXMLProcessor

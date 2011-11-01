/**
 * <copyright>
 * </copyright>
 *
 * $Id: ForcedidbagXMLProcessor.java,v 1.1 2007/03/21 15:45:37 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.annotations.forcedidbag.util;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

import org.eclipse.emf.teneo.samples.emf.annotations.forcedidbag.ForcedidbagPackage;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ForcedidbagXMLProcessor extends XMLProcessor {
	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForcedidbagXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		ForcedidbagPackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the ForcedidbagResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new ForcedidbagResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new ForcedidbagResourceFactoryImpl());
		}
		return registrations;
	}

} //ForcedidbagXMLProcessor

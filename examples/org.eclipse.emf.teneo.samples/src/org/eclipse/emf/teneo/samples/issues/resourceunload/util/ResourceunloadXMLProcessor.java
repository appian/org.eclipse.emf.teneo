/**
 * <copyright>
 * </copyright>
 *
 * $Id: ResourceunloadXMLProcessor.java,v 1.1 2008/04/16 21:08:13 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.resourceunload.util;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

import org.eclipse.emf.teneo.samples.issues.resourceunload.ResourceunloadPackage;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ResourceunloadXMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceunloadXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		ResourceunloadPackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the ResourceunloadResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new ResourceunloadResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new ResourceunloadResourceFactoryImpl());
		}
		return registrations;
	}

} //ResourceunloadXMLProcessor

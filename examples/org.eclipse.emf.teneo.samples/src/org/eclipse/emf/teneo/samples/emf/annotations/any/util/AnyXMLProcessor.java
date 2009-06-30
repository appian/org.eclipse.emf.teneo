/**
 * <copyright>
 * </copyright>
 *
 * $Id: AnyXMLProcessor.java,v 1.1.2.2 2009/06/30 07:29:58 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.annotations.any.util;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

import org.eclipse.emf.teneo.samples.emf.annotations.any.AnyPackage;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AnyXMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnyXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		AnyPackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the AnyResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new AnyResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new AnyResourceFactoryImpl());
		}
		return registrations;
	}

} //AnyXMLProcessor

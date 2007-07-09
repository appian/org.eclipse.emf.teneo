/**
 * <copyright>
 * </copyright>
 *
 * $Id: ExtralazyXMLProcessor.java,v 1.1 2007/07/09 12:55:19 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.annotations.extralazy.util;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

import org.eclipse.emf.teneo.samples.emf.annotations.extralazy.ExtralazyPackage;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ExtralazyXMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtralazyXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		ExtralazyPackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the ExtralazyResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new ExtralazyResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new ExtralazyResourceFactoryImpl());
		}
		return registrations;
	}

} //ExtralazyXMLProcessor

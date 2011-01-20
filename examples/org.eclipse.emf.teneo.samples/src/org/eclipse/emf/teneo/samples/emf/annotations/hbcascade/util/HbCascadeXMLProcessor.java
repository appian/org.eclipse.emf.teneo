/**
 * <copyright>
 * </copyright>
 *
 * $Id: HbCascadeXMLProcessor.java,v 1.1 2011/01/20 17:13:39 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.annotations.hbcascade.util;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

import org.eclipse.emf.teneo.samples.emf.annotations.hbcascade.HbCascadePackage;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class HbCascadeXMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HbCascadeXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		HbCascadePackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the HbCascadeResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new HbCascadeResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new HbCascadeResourceFactoryImpl());
		}
		return registrations;
	}

} //HbCascadeXMLProcessor

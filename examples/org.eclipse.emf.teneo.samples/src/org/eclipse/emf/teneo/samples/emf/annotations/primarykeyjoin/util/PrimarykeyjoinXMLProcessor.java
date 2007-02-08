/**
 * <copyright>
 * </copyright>
 *
 * $Id: PrimarykeyjoinXMLProcessor.java,v 1.2 2007/02/08 23:09:26 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.annotations.primarykeyjoin.util;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

import org.eclipse.emf.teneo.samples.emf.annotations.primarykeyjoin.PrimarykeyjoinPackage;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PrimarykeyjoinXMLProcessor extends XMLProcessor {
	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimarykeyjoinXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		PrimarykeyjoinPackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the PrimarykeyjoinResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new PrimarykeyjoinResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new PrimarykeyjoinResourceFactoryImpl());
		}
		return registrations;
	}

} //PrimarykeyjoinXMLProcessor

/**
 * <copyright>
 * </copyright>
 *
 * $Id: CatalogXMLProcessor.java,v 1.2 2007/02/08 23:09:25 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.sample.catalog.util;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

import org.eclipse.emf.teneo.samples.emf.sample.catalog.CatalogPackage;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CatalogXMLProcessor extends XMLProcessor {
	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CatalogXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		CatalogPackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the CatalogResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new CatalogResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new CatalogResourceFactoryImpl());
		}
		return registrations;
	}

} //CatalogXMLProcessor

/**
 * <copyright>
 * </copyright>
 *
 * $Id: DocumentrootXMLProcessor.java,v 1.1 2009/07/27 22:11:53 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.schemaconstructs.documentroot.util;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

import org.eclipse.emf.teneo.samples.emf.schemaconstructs.documentroot.DocumentrootPackage;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DocumentrootXMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentrootXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		DocumentrootPackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the DocumentrootResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new DocumentrootResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new DocumentrootResourceFactoryImpl());
		}
		return registrations;
	}

} //DocumentrootXMLProcessor

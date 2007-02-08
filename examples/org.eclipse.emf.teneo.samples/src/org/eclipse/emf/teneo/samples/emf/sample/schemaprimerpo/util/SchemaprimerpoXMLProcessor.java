/**
 * <copyright>
 * </copyright>
 *
 * $Id: SchemaprimerpoXMLProcessor.java,v 1.1 2007/02/08 23:09:24 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.sample.schemaprimerpo.util;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

import org.eclipse.emf.teneo.samples.emf.sample.schemaprimerpo.SchemaprimerpoPackage;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SchemaprimerpoXMLProcessor extends XMLProcessor {
	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchemaprimerpoXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		SchemaprimerpoPackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the SchemaprimerpoResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new SchemaprimerpoResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new SchemaprimerpoResourceFactoryImpl());
		}
		return registrations;
	}

} //SchemaprimerpoXMLProcessor

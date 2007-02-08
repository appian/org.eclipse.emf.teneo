/**
 * <copyright>
 * </copyright>
 *
 * $Id: SecondarytablehibernateXMLProcessor.java,v 1.3 2007/02/08 23:09:23 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.annotations.secondarytablehibernate.util;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

import org.eclipse.emf.teneo.samples.emf.annotations.secondarytablehibernate.SecondarytablehibernatePackage;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SecondarytablehibernateXMLProcessor extends XMLProcessor {
	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecondarytablehibernateXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		SecondarytablehibernatePackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the SecondarytablehibernateResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new SecondarytablehibernateResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new SecondarytablehibernateResourceFactoryImpl());
		}
		return registrations;
	}

} //SecondarytablehibernateXMLProcessor

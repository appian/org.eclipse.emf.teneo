/**
 * <copyright>
 * </copyright>
 *
 * $Id: TopXMLProcessor.java,v 1.1 2008/03/19 22:25:41 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.top.util;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

import org.eclipse.emf.teneo.samples.issues.top.TopPackage;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TopXMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TopXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		TopPackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the TopResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new TopResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new TopResourceFactoryImpl());
		}
		return registrations;
	}

} //TopXMLProcessor

/**
 * <copyright>
 * </copyright>
 *
 * $Id: EmbeddedidXMLProcessor.java,v 1.1 2006/07/11 16:57:01 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.annotations.embeddedid.util;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

import org.eclipse.emf.teneo.samples.emf.annotations.embeddedid.EmbeddedidPackage;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EmbeddedidXMLProcessor extends XMLProcessor {
	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmbeddedidXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		EmbeddedidPackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the EmbeddedidResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Map getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new EmbeddedidResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new EmbeddedidResourceFactoryImpl());
		}
		return registrations;
	}

} //EmbeddedidXMLProcessor

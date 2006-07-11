/**
 * <copyright>
 * </copyright>
 *
 * $Id: LobXMLProcessor.java,v 1.1 2006/07/11 16:57:08 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.annotations.lob.util;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

import org.eclipse.emf.teneo.samples.emf.annotations.lob.LobPackage;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class LobXMLProcessor extends XMLProcessor {
	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LobXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		LobPackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the LobResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Map getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new LobResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new LobResourceFactoryImpl());
		}
		return registrations;
	}

} //LobXMLProcessor

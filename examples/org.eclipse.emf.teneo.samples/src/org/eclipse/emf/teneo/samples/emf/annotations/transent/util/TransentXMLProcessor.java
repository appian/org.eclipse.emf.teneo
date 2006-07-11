/**
 * <copyright>
 * </copyright>
 *
 * $Id: TransentXMLProcessor.java,v 1.1 2006/07/11 16:57:03 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.annotations.transent.util;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

import org.eclipse.emf.teneo.samples.emf.annotations.transent.TransentPackage;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TransentXMLProcessor extends XMLProcessor {
	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransentXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		TransentPackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the TransentResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Map getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new TransentResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new TransentResourceFactoryImpl());
		}
		return registrations;
	}

} //TransentXMLProcessor

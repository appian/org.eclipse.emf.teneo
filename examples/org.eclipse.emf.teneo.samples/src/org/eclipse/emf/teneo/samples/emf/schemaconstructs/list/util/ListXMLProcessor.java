/**
 * <copyright>
 * </copyright>
 *
 * $Id: ListXMLProcessor.java,v 1.1 2006/07/11 16:56:54 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.schemaconstructs.list.util;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

import org.eclipse.emf.teneo.samples.emf.schemaconstructs.list.ListPackage;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ListXMLProcessor extends XMLProcessor {
	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		ListPackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the ListResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Map getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new ListResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new ListResourceFactoryImpl());
		}
		return registrations;
	}

} //ListXMLProcessor

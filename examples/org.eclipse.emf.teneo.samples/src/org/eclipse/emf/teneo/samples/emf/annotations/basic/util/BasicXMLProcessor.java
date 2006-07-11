/**
 * <copyright>
 * </copyright>
 *
 * $Id: BasicXMLProcessor.java,v 1.1 2006/07/11 16:57:15 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.annotations.basic.util;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.xmi.util.XMLProcessor;
import org.eclipse.emf.teneo.samples.emf.annotations.basic.BasicPackage;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BasicXMLProcessor extends XMLProcessor {
	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		BasicPackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the BasicResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Map getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new BasicResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new BasicResourceFactoryImpl());
		}
		return registrations;
	}

} //BasicXMLProcessor

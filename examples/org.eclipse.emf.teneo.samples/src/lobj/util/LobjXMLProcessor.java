/**
 * <copyright>
 * </copyright>
 *
 * $Id: LobjXMLProcessor.java,v 1.3 2007/03/28 13:56:53 mtaal Exp $
 */
package lobj.util;

import java.util.Map;

import lobj.LobjPackage;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class LobjXMLProcessor extends XMLProcessor {
	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LobjXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		LobjPackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the LobjResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Map getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new LobjResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new LobjResourceFactoryImpl());
		}
		return registrations;
	}

} //LobjXMLProcessor

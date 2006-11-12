/**
 * <copyright>
 * </copyright>
 *
 * $Id: MtmsameXMLProcessor.java,v 1.1 2006/11/12 00:08:30 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.mtmsame.util;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

import org.eclipse.emf.teneo.samples.issues.mtmsame.MtmsamePackage;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MtmsameXMLProcessor extends XMLProcessor {
	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MtmsameXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		MtmsamePackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the MtmsameResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Map getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new MtmsameResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new MtmsameResourceFactoryImpl());
		}
		return registrations;
	}

} //MtmsameXMLProcessor

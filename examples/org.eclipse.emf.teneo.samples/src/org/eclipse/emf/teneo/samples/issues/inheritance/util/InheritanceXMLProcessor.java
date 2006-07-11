/**
 * <copyright>
 * </copyright>
 *
 * $Id: InheritanceXMLProcessor.java,v 1.1 2006/07/11 16:57:13 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.inheritance.util;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

import org.eclipse.emf.teneo.samples.issues.inheritance.InheritancePackage;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class InheritanceXMLProcessor extends XMLProcessor {
	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InheritanceXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		InheritancePackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the InheritanceResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Map getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new InheritanceResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new InheritanceResourceFactoryImpl());
		}
		return registrations;
	}

} //InheritanceXMLProcessor

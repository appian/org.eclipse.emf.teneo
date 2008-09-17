/**
 * <copyright>
 * </copyright>
 *
 * $Id: InterfacetrueXMLProcessor.java,v 1.1 2008/09/17 20:28:02 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.interfacetrue.util;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

import org.eclipse.emf.teneo.samples.issues.interfacetrue.InterfacetruePackage;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class InterfacetrueXMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfacetrueXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		InterfacetruePackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the InterfacetrueResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new InterfacetrueResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new InterfacetrueResourceFactoryImpl());
		}
		return registrations;
	}

} //InterfacetrueXMLProcessor

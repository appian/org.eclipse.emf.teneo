/**
 * <copyright>
 * </copyright>
 *
 * $Id: EmapXMLProcessor.java,v 1.2 2007/02/08 23:09:26 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.schemaconstructs.emap.util;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

import org.eclipse.emf.teneo.samples.emf.schemaconstructs.emap.EmapPackage;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EmapXMLProcessor extends XMLProcessor {
	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmapXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		EmapPackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the EmapResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new EmapResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new EmapResourceFactoryImpl());
		}
		return registrations;
	}

} //EmapXMLProcessor

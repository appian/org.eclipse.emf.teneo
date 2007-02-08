/**
 * <copyright>
 * </copyright>
 *
 * $Id: SimpletypesXMLProcessor.java,v 1.2 2007/02/08 23:09:20 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.util;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

import org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpletypesPackage;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SimpletypesXMLProcessor extends XMLProcessor {
	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpletypesXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		SimpletypesPackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the SimpletypesResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new SimpletypesResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new SimpletypesResourceFactoryImpl());
		}
		return registrations;
	}

} //SimpletypesXMLProcessor

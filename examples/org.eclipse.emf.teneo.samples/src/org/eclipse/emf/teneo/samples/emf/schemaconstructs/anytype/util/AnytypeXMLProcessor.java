/**
 * <copyright>
 * </copyright>
 *
 * $Id: AnytypeXMLProcessor.java,v 1.1 2007/02/08 23:09:27 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.schemaconstructs.anytype.util;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

import org.eclipse.emf.teneo.samples.emf.schemaconstructs.anytype.AnytypePackage;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AnytypeXMLProcessor extends XMLProcessor {
	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnytypeXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		AnytypePackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the AnytypeResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new AnytypeResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new AnytypeResourceFactoryImpl());
		}
		return registrations;
	}

} //AnytypeXMLProcessor

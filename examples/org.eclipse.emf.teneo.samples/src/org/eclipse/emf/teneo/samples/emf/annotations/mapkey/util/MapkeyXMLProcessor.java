/**
 * <copyright>
 * </copyright>
 *
 * $Id: MapkeyXMLProcessor.java,v 1.1 2007/03/18 19:19:26 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.annotations.mapkey.util;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

import org.eclipse.emf.teneo.samples.emf.annotations.mapkey.MapkeyPackage;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MapkeyXMLProcessor extends XMLProcessor {
	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MapkeyXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		MapkeyPackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the MapkeyResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new MapkeyResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new MapkeyResourceFactoryImpl());
		}
		return registrations;
	}

} //MapkeyXMLProcessor

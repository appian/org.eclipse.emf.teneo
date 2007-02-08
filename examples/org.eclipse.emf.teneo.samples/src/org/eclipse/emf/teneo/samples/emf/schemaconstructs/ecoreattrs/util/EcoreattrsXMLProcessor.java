/**
 * <copyright>
 * </copyright>
 *
 * $Id: EcoreattrsXMLProcessor.java,v 1.1 2007/02/08 23:09:17 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.schemaconstructs.ecoreattrs.util;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

import org.eclipse.emf.teneo.samples.emf.schemaconstructs.ecoreattrs.EcoreattrsPackage;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EcoreattrsXMLProcessor extends XMLProcessor {
	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EcoreattrsXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		EcoreattrsPackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the EcoreattrsResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new EcoreattrsResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new EcoreattrsResourceFactoryImpl());
		}
		return registrations;
	}

} //EcoreattrsXMLProcessor

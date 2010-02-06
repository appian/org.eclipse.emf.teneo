/**
 * <copyright>
 * </copyright>
 *
 * $Id: IdbagXMLProcessor.java,v 1.3 2010/02/06 18:17:46 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.annotations.idbag.util;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

import org.eclipse.emf.teneo.samples.emf.annotations.idbag.IdbagPackage;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class IdbagXMLProcessor extends XMLProcessor {
	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdbagXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		IdbagPackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the IdbagResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new IdbagResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new IdbagResourceFactoryImpl());
		}
		return registrations;
	}

} //IdbagXMLProcessor

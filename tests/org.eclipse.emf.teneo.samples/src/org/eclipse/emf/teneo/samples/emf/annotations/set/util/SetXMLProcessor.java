/**
 * <copyright>
 * </copyright>
 *
 * $Id: SetXMLProcessor.java,v 1.3 2009/03/03 15:48:47 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.annotations.set.util;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

import org.eclipse.emf.teneo.samples.emf.annotations.set.SetPackage;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SetXMLProcessor extends XMLProcessor {
	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		SetPackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the SetResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new SetResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new SetResourceFactoryImpl());
		}
		return registrations;
	}

} //SetXMLProcessor

/**
 * <copyright>
 * </copyright>
 *
 * $Id: UpdateXMLProcessor.java,v 1.1 2007/06/29 07:30:49 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.update.util;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

import org.eclipse.emf.teneo.samples.issues.update.UpdatePackage;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class UpdateXMLProcessor extends XMLProcessor {
	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpdateXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		UpdatePackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the UpdateResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new UpdateResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new UpdateResourceFactoryImpl());
		}
		return registrations;
	}

} //UpdateXMLProcessor

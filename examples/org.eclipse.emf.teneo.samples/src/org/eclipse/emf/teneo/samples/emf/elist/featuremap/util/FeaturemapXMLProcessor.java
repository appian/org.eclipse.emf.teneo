/**
 * <copyright>
 * </copyright>
 *
 * $Id: FeaturemapXMLProcessor.java,v 1.1 2007/02/08 23:09:25 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.elist.featuremap.util;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

import org.eclipse.emf.teneo.samples.emf.elist.featuremap.FeaturemapPackage;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FeaturemapXMLProcessor extends XMLProcessor {
	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeaturemapXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		FeaturemapPackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the FeaturemapResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new FeaturemapResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new FeaturemapResourceFactoryImpl());
		}
		return registrations;
	}

} //FeaturemapXMLProcessor

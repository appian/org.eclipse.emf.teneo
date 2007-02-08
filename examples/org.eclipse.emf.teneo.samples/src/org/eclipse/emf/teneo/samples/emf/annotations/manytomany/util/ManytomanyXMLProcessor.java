/**
 * <copyright>
 * </copyright>
 *
 * $Id: ManytomanyXMLProcessor.java,v 1.2 2007/02/08 23:09:27 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.annotations.manytomany.util;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

import org.eclipse.emf.teneo.samples.emf.annotations.manytomany.ManytomanyPackage;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ManytomanyXMLProcessor extends XMLProcessor {
	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ManytomanyXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		ManytomanyPackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the ManytomanyResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new ManytomanyResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new ManytomanyResourceFactoryImpl());
		}
		return registrations;
	}

} //ManytomanyXMLProcessor

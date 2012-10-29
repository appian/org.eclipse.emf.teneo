/**
 * <copyright>
 * </copyright>
 *
 * $Id: RentalXMLProcessor.java,v 1.1 2007/03/07 23:34:08 mtaal Exp $
 */
package org.eclipse.emf.teneo.rental.util;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

import org.eclipse.emf.teneo.rental.RentalPackage;

/**
 * This class contains helper methods to serialize and deserialize XML documents <!-- begin-user-doc
 * --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class RentalXMLProcessor extends XMLProcessor {
	/**
	 * Public constructor to instantiate the helper. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public RentalXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		RentalPackage.eINSTANCE.eClass();
	}

	/**
	 * Register for "*" and "xml" file extensions the RentalResourceFactoryImpl factory. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new RentalResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new RentalResourceFactoryImpl());
		}
		return registrations;
	}

} // RentalXMLProcessor

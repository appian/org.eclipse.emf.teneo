/**
 * <copyright>
 * </copyright>
 *
 * $Id: HibernateXMLProcessor.java,v 1.1 2008/08/04 05:15:08 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.annotations.hibernate.util;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

import org.eclipse.emf.teneo.samples.emf.annotations.hibernate.HibernatePackage;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class HibernateXMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HibernateXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		HibernatePackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the HibernateResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new HibernateResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new HibernateResourceFactoryImpl());
		}
		return registrations;
	}

} //HibernateXMLProcessor

/**
 * <copyright>
 * </copyright>
 *
 * $Id: EntityXMLProcessor.java,v 1.1 2007/07/11 14:40:34 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.annotations.entity.util;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

import org.eclipse.emf.teneo.samples.emf.annotations.entity.EntityPackage;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EntityXMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		EntityPackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the EntityResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new EntityResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new EntityResourceFactoryImpl());
		}
		return registrations;
	}

} //EntityXMLProcessor

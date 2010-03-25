/**
 * <copyright>
 * </copyright>
 *
 * $Id: ModelgroupXMLProcessor.java,v 1.1 2010/03/25 00:29:10 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.schemaconstructs.modelgroup.util;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

import org.eclipse.emf.teneo.samples.emf.schemaconstructs.modelgroup.ModelgroupPackage;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelgroupXMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgroupXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		ModelgroupPackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the ModelgroupResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new ModelgroupResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new ModelgroupResourceFactoryImpl());
		}
		return registrations;
	}

} //ModelgroupXMLProcessor

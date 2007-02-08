/**
 * <copyright>
 * </copyright>
 *
 * $Id: EdatatypeColumnXMLProcessor.java,v 1.2 2007/02/08 23:09:25 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.annotations.edatatypeColumn.util;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

import org.eclipse.emf.teneo.samples.emf.annotations.edatatypeColumn.EdatatypeColumnPackage;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EdatatypeColumnXMLProcessor extends XMLProcessor {
	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EdatatypeColumnXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		EdatatypeColumnPackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the EdatatypeColumnResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new EdatatypeColumnResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new EdatatypeColumnResourceFactoryImpl());
		}
		return registrations;
	}

} //EdatatypeColumnXMLProcessor

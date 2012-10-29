/**
 * <copyright>
 * </copyright>
 *
 * $Id: TestXMLProcessor.java,v 1.1 2007/12/13 06:52:44 mtaal Exp $
 */
package com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.util;

import com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.TestPackage;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

/**
 * This class contains helper methods to serialize and deserialize XML documents <!-- begin-user-doc
 * --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class TestXMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public TestXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		TestPackage.eINSTANCE.eClass();
	}

	/**
	 * Register for "*" and "xml" file extensions the TestResourceFactoryImpl factory. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new TestResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new TestResourceFactoryImpl());
		}
		return registrations;
	}

} // TestXMLProcessor

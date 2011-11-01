/**
 * <copyright>
 * </copyright>
 *
 * $Id: EmployeeXMLProcessor.java,v 1.1 2008/04/23 15:45:24 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.sample.employee.util;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

import org.eclipse.emf.teneo.samples.emf.sample.employee.EmployeePackage;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EmployeeXMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmployeeXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		EmployeePackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the EmployeeResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new EmployeeResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new EmployeeResourceFactoryImpl());
		}
		return registrations;
	}

} //EmployeeXMLProcessor

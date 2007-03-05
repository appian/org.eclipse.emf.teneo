/**
 * <copyright>
 * </copyright>
 *
 * $Id: DatetimeXMLProcessor.java,v 1.1.2.2 2007/03/05 18:07:52 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.schemaconstructs.datetime.util;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

import org.eclipse.emf.teneo.samples.emf.schemaconstructs.datetime.DatetimePackage;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DatetimeXMLProcessor extends XMLProcessor {
	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatetimeXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		DatetimePackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the DatetimeResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Map getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new DatetimeResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new DatetimeResourceFactoryImpl());
		}
		return registrations;
	}

} //DatetimeXMLProcessor

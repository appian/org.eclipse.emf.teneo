/**
 * <copyright>
 * </copyright>
 *
 * $Id: ColumnXMLProcessor.java,v 1.1 2006/07/11 16:56:55 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.annotations.column.util;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.xmi.util.XMLProcessor;
import org.eclipse.emf.teneo.samples.emf.annotations.column.ColumnPackage;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ColumnXMLProcessor extends XMLProcessor {
	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColumnXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		ColumnPackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the ColumnResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Map getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new ColumnResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new ColumnResourceFactoryImpl());
		}
		return registrations;
	}

} //ColumnXMLProcessor

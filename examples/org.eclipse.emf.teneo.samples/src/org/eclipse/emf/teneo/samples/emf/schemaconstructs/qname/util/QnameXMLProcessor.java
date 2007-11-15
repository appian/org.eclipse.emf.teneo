/**
 * <copyright>
 * </copyright>
 *
 * $Id: QnameXMLProcessor.java,v 1.1 2007/11/15 19:56:40 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.schemaconstructs.qname.util;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

import org.eclipse.emf.teneo.samples.emf.schemaconstructs.qname.QnamePackage;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class QnameXMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QnameXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		QnamePackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the QnameResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new QnameResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new QnameResourceFactoryImpl());
		}
		return registrations;
	}

} //QnameXMLProcessor

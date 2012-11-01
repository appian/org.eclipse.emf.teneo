/**
 * <copyright>
 * </copyright>
 *
 * $Id: UsertypeXMLProcessor.java,v 1.4 2010/02/06 20:50:46 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.hibernate.usertype.util;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.util.XMLProcessor;
import org.eclipse.emf.teneo.samples.emf.hibernate.usertype.UsertypePackage;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc
 * --> <!-- end-user-doc -->
 * @generated
 */
public class UsertypeXMLProcessor extends XMLProcessor {
	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public UsertypeXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		UsertypePackage.eINSTANCE.eClass();
	}

	/**
	 * Register for "*" and "xml" file extensions the UsertypeResourceFactoryImpl factory. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generatedNOT
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new UsertypeResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new UsertypeResourceFactoryImpl());
		}
		return registrations;
	}

} // UsertypeXMLProcessor

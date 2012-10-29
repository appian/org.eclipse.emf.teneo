/**
 * <copyright>
 * </copyright>
 *
 * $Id: TransientotmXMLProcessor.java,v 1.1 2007/07/09 14:02:31 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.hibernate.transientotm.util;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.util.XMLProcessor;
import org.eclipse.emf.teneo.samples.emf.hibernate.transientotm.TransientotmPackage;

/**
 * This class contains helper methods to serialize and deserialize XML documents <!-- begin-user-doc
 * --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class TransientotmXMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public TransientotmXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		TransientotmPackage.eINSTANCE.eClass();
	}

	/**
	 * Register for "*" and "xml" file extensions the TransientotmResourceFactoryImpl factory. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new TransientotmResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new TransientotmResourceFactoryImpl());
		}
		return registrations;
	}

} // TransientotmXMLProcessor

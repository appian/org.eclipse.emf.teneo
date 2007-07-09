/**
 * <copyright>
 * </copyright>
 *
 * $Id: AppleXMLProcessor.java,v 1.1 2007/07/09 12:55:19 mtaal Exp $
 */
package tc.apple.util;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

import tc.apple.ApplePackage;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AppleXMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AppleXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		ApplePackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the AppleResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new AppleResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new AppleResourceFactoryImpl());
		}
		return registrations;
	}

} //AppleXMLProcessor

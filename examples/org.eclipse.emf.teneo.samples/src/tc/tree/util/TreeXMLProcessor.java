/**
 * <copyright>
 * </copyright>
 *
 * $Id: TreeXMLProcessor.java,v 1.1 2007/07/09 12:55:20 mtaal Exp $
 */
package tc.tree.util;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

import tc.tree.TreePackage;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TreeXMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TreeXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		TreePackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the TreeResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new TreeResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new TreeResourceFactoryImpl());
		}
		return registrations;
	}

} //TreeXMLProcessor

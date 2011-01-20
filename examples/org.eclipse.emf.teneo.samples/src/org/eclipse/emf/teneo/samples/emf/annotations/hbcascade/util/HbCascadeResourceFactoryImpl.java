/**
 * <copyright>
 * </copyright>
 *
 * $Id: HbCascadeResourceFactoryImpl.java,v 1.1 2011/01/20 17:13:39 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.annotations.hbcascade.util;

import org.eclipse.emf.common.util.URI;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;

import org.eclipse.emf.ecore.xmi.XMLResource;

/**
 * <!-- begin-user-doc -->
 * The <b>Resource Factory</b> associated with the package.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.teneo.samples.emf.annotations.hbcascade.util.HbCascadeResourceImpl
 * @generated
 */
public class HbCascadeResourceFactoryImpl extends ResourceFactoryImpl {
	/**
	 * Creates an instance of the resource factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HbCascadeResourceFactoryImpl() {
		super();
	}

	/**
	 * Creates an instance of the resource.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Resource createResource(URI uri) {
		Resource result = new HbCascadeResourceImpl(uri);
		return result;
	}

} //HbCascadeResourceFactoryImpl

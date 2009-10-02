/**
 * <copyright>
 * </copyright>
 *
 * $Id: Bz290969ResourceFactoryImpl.java,v 1.1 2009/10/02 07:47:37 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.bz290969.util;

import org.eclipse.emf.common.util.URI;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;

import org.eclipse.emf.ecore.xmi.XMLResource;

/**
 * <!-- begin-user-doc -->
 * The <b>Resource Factory</b> associated with the package.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.teneo.samples.issues.bz290969.util.Bz290969ResourceImpl
 * @generated
 */
public class Bz290969ResourceFactoryImpl extends ResourceFactoryImpl {
	/**
	 * Creates an instance of the resource factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bz290969ResourceFactoryImpl() {
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
		Resource result = new Bz290969ResourceImpl(uri);
		return result;
	}

} //Bz290969ResourceFactoryImpl

/**
 * <copyright>
 * </copyright>
 *
 * $Id: ChildOneImpl.java,v 1.1 2008/03/12 07:30:27 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.ChildOne;
import org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.InheritancemappingPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Child One</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ChildOneImpl extends ParentOneImpl implements ChildOne {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChildOneImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InheritancemappingPackage.Literals.CHILD_ONE;
	}

} //ChildOneImpl

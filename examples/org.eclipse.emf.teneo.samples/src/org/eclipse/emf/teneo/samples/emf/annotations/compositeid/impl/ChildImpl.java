/**
 * <copyright>
 * </copyright>
 *
 * $Id: ChildImpl.java,v 1.4 2007/02/08 23:09:17 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.annotations.compositeid.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.teneo.samples.emf.annotations.compositeid.Child;
import org.eclipse.emf.teneo.samples.emf.annotations.compositeid.CompositeidPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Child</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ChildImpl extends PersonImpl implements Child {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChildImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CompositeidPackage.Literals.CHILD;
	}

} //ChildImpl
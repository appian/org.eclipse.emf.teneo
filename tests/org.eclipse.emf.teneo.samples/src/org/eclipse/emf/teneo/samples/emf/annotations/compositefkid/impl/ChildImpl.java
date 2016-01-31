/**
 */
package org.eclipse.emf.teneo.samples.emf.annotations.compositefkid.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.teneo.samples.emf.annotations.compositefkid.Child;
import org.eclipse.emf.teneo.samples.emf.annotations.compositefkid.CompositefkidPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Child</b></em>'.
 * <!-- end-user-doc -->
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
		return CompositefkidPackage.Literals.CHILD;
	}

} //ChildImpl

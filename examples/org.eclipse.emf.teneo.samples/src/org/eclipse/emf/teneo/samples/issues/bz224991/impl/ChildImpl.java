/**
 * <copyright>
 * </copyright>
 *
 * $Id: ChildImpl.java,v 1.1 2008/04/04 11:50:24 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.bz224991.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.teneo.samples.issues.bz224991.Bz224991Package;
import org.eclipse.emf.teneo.samples.issues.bz224991.Child;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Child</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ChildImpl extends ParentImpl implements Child {
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
		return Bz224991Package.Literals.CHILD;
	}

} //ChildImpl

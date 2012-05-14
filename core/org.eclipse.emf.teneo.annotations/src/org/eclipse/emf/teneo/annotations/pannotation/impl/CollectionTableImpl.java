/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.emf.teneo.annotations.pannotation.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.emf.teneo.annotations.pannotation.CollectionTable;
import org.eclipse.emf.teneo.annotations.pannotation.JoinColumn;
import org.eclipse.emf.teneo.annotations.pannotation.PannotationPackage;
import org.eclipse.emf.teneo.annotations.pannotation.UniqueConstraint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Collection Table</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class CollectionTableImpl extends JoinTableImpl implements CollectionTable {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CollectionTableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PannotationPackage.Literals.COLLECTION_TABLE;
	}

} //CollectionTableImpl

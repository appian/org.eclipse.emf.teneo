/**
 * <copyright>
 * </copyright>
 *
 * $Id: PortImpl.java,v 1.1 2006/07/11 16:57:00 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.sample.workflow.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.teneo.samples.emf.sample.workflow.Port;
import org.eclipse.emf.teneo.samples.emf.sample.workflow.WorkflowPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class PortImpl extends WorkflowElementImpl implements Port {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2003 IBM Corporation";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return WorkflowPackage.eINSTANCE.getPort();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case WorkflowPackage.PORT__NAME:
				return getName();
			case WorkflowPackage.PORT__COMMENT:
				return getComment();
			case WorkflowPackage.PORT__X:
				return new Integer(getX());
			case WorkflowPackage.PORT__Y:
				return new Integer(getY());
			case WorkflowPackage.PORT__WIDTH:
				return new Integer(getWidth());
			case WorkflowPackage.PORT__HEIGHT:
				return new Integer(getHeight());
			case WorkflowPackage.PORT__ID:
				return getId();
		}
		return eDynamicGet(eFeature, resolve);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(EStructuralFeature eFeature, Object newValue) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case WorkflowPackage.PORT__NAME:
				setName((String)newValue);
				return;
			case WorkflowPackage.PORT__COMMENT:
				setComment((String)newValue);
				return;
			case WorkflowPackage.PORT__X:
				setX(((Integer)newValue).intValue());
				return;
			case WorkflowPackage.PORT__Y:
				setY(((Integer)newValue).intValue());
				return;
			case WorkflowPackage.PORT__WIDTH:
				setWidth(((Integer)newValue).intValue());
				return;
			case WorkflowPackage.PORT__HEIGHT:
				setHeight(((Integer)newValue).intValue());
				return;
			case WorkflowPackage.PORT__ID:
				setId((String)newValue);
				return;
		}
		eDynamicSet(eFeature, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case WorkflowPackage.PORT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case WorkflowPackage.PORT__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case WorkflowPackage.PORT__X:
				setX(X_EDEFAULT);
				return;
			case WorkflowPackage.PORT__Y:
				setY(Y_EDEFAULT);
				return;
			case WorkflowPackage.PORT__WIDTH:
				setWidth(WIDTH_EDEFAULT);
				return;
			case WorkflowPackage.PORT__HEIGHT:
				setHeight(HEIGHT_EDEFAULT);
				return;
			case WorkflowPackage.PORT__ID:
				setId(ID_EDEFAULT);
				return;
		}
		eDynamicUnset(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case WorkflowPackage.PORT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case WorkflowPackage.PORT__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
			case WorkflowPackage.PORT__X:
				return x != X_EDEFAULT;
			case WorkflowPackage.PORT__Y:
				return y != Y_EDEFAULT;
			case WorkflowPackage.PORT__WIDTH:
				return width != WIDTH_EDEFAULT;
			case WorkflowPackage.PORT__HEIGHT:
				return height != HEIGHT_EDEFAULT;
			case WorkflowPackage.PORT__ID:
				return ID_EDEFAULT == null ? getId() != null : !ID_EDEFAULT.equals(getId());
		}
		return eDynamicIsSet(eFeature);
	}

} //PortImpl

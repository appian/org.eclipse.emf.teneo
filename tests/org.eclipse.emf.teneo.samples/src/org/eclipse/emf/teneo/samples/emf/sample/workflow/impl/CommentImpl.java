/**
 * <copyright>
 * </copyright>
 *
 * $Id: CommentImpl.java,v 1.1 2006/07/11 16:57:00 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.sample.workflow.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import org.eclipse.emf.teneo.samples.emf.sample.workflow.Comment;
import org.eclipse.emf.teneo.samples.emf.sample.workflow.Workflow;
import org.eclipse.emf.teneo.samples.emf.sample.workflow.WorkflowPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Comment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.workflow.impl.CommentImpl#getWorkflow <em>Workflow</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CommentImpl extends WorkflowElementImpl implements Comment {
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
	protected CommentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return WorkflowPackage.eINSTANCE.getComment();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Workflow getWorkflow() {
		if (eContainerFeatureID != WorkflowPackage.COMMENT__WORKFLOW) return null;
		return (Workflow)eContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWorkflow(Workflow newWorkflow) {
		if (newWorkflow != eContainer || (eContainerFeatureID != WorkflowPackage.COMMENT__WORKFLOW && newWorkflow != null)) {
			if (EcoreUtil.isAncestor(this, newWorkflow))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eContainer != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newWorkflow != null)
				msgs = ((InternalEObject)newWorkflow).eInverseAdd(this, WorkflowPackage.WORKFLOW__COMMENTS, Workflow.class, msgs);
			msgs = eBasicSetContainer((InternalEObject)newWorkflow, WorkflowPackage.COMMENT__WORKFLOW, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.COMMENT__WORKFLOW, newWorkflow, newWorkflow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case WorkflowPackage.COMMENT__WORKFLOW:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, WorkflowPackage.COMMENT__WORKFLOW, msgs);
				default:
					return eDynamicInverseAdd(otherEnd, featureID, baseClass, msgs);
			}
		}
		if (eContainer != null)
			msgs = eBasicRemoveFromContainer(msgs);
		return eBasicSetContainer(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case WorkflowPackage.COMMENT__WORKFLOW:
					return eBasicSetContainer(null, WorkflowPackage.COMMENT__WORKFLOW, msgs);
				default:
					return eDynamicInverseRemove(otherEnd, featureID, baseClass, msgs);
			}
		}
		return eBasicSetContainer(null, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eBasicRemoveFromContainer(NotificationChain msgs) {
		if (eContainerFeatureID >= 0) {
			switch (eContainerFeatureID) {
				case WorkflowPackage.COMMENT__WORKFLOW:
					return eContainer.eInverseRemove(this, WorkflowPackage.WORKFLOW__COMMENTS, Workflow.class, msgs);
				default:
					return eDynamicBasicRemoveFromContainer(msgs);
			}
		}
		return eContainer.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - eContainerFeatureID, null, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case WorkflowPackage.COMMENT__NAME:
				return getName();
			case WorkflowPackage.COMMENT__COMMENT:
				return getComment();
			case WorkflowPackage.COMMENT__X:
				return new Integer(getX());
			case WorkflowPackage.COMMENT__Y:
				return new Integer(getY());
			case WorkflowPackage.COMMENT__WIDTH:
				return new Integer(getWidth());
			case WorkflowPackage.COMMENT__HEIGHT:
				return new Integer(getHeight());
			case WorkflowPackage.COMMENT__ID:
				return getId();
			case WorkflowPackage.COMMENT__WORKFLOW:
				return getWorkflow();
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
			case WorkflowPackage.COMMENT__NAME:
				setName((String)newValue);
				return;
			case WorkflowPackage.COMMENT__COMMENT:
				setComment((String)newValue);
				return;
			case WorkflowPackage.COMMENT__X:
				setX(((Integer)newValue).intValue());
				return;
			case WorkflowPackage.COMMENT__Y:
				setY(((Integer)newValue).intValue());
				return;
			case WorkflowPackage.COMMENT__WIDTH:
				setWidth(((Integer)newValue).intValue());
				return;
			case WorkflowPackage.COMMENT__HEIGHT:
				setHeight(((Integer)newValue).intValue());
				return;
			case WorkflowPackage.COMMENT__ID:
				setId((String)newValue);
				return;
			case WorkflowPackage.COMMENT__WORKFLOW:
				setWorkflow((Workflow)newValue);
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
			case WorkflowPackage.COMMENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case WorkflowPackage.COMMENT__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case WorkflowPackage.COMMENT__X:
				setX(X_EDEFAULT);
				return;
			case WorkflowPackage.COMMENT__Y:
				setY(Y_EDEFAULT);
				return;
			case WorkflowPackage.COMMENT__WIDTH:
				setWidth(WIDTH_EDEFAULT);
				return;
			case WorkflowPackage.COMMENT__HEIGHT:
				setHeight(HEIGHT_EDEFAULT);
				return;
			case WorkflowPackage.COMMENT__ID:
				setId(ID_EDEFAULT);
				return;
			case WorkflowPackage.COMMENT__WORKFLOW:
				setWorkflow((Workflow)null);
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
			case WorkflowPackage.COMMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case WorkflowPackage.COMMENT__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
			case WorkflowPackage.COMMENT__X:
				return x != X_EDEFAULT;
			case WorkflowPackage.COMMENT__Y:
				return y != Y_EDEFAULT;
			case WorkflowPackage.COMMENT__WIDTH:
				return width != WIDTH_EDEFAULT;
			case WorkflowPackage.COMMENT__HEIGHT:
				return height != HEIGHT_EDEFAULT;
			case WorkflowPackage.COMMENT__ID:
				return ID_EDEFAULT == null ? getId() != null : !ID_EDEFAULT.equals(getId());
			case WorkflowPackage.COMMENT__WORKFLOW:
				return getWorkflow() != null;
		}
		return eDynamicIsSet(eFeature);
	}

} //CommentImpl

/**
 * <copyright>
 * </copyright>
 *
 * $Id: TaskImpl.java,v 1.1 2006/07/11 16:57:00 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.sample.workflow.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.emf.teneo.samples.emf.sample.workflow.Task;
import org.eclipse.emf.teneo.samples.emf.sample.workflow.Workflow;
import org.eclipse.emf.teneo.samples.emf.sample.workflow.WorkflowPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class TaskImpl extends WorkflowNodeImpl implements Task {
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
	protected TaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return WorkflowPackage.eINSTANCE.getTask();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case WorkflowPackage.TASK__WORKFLOW:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, WorkflowPackage.TASK__WORKFLOW, msgs);
				case WorkflowPackage.TASK__OUTPUTS:
					return ((InternalEList)getOutputs()).basicAdd(otherEnd, msgs);
				case WorkflowPackage.TASK__INPUTS:
					return ((InternalEList)getInputs()).basicAdd(otherEnd, msgs);
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
				case WorkflowPackage.TASK__WORKFLOW:
					return eBasicSetContainer(null, WorkflowPackage.TASK__WORKFLOW, msgs);
				case WorkflowPackage.TASK__OUTPUTS:
					return ((InternalEList)getOutputs()).basicRemove(otherEnd, msgs);
				case WorkflowPackage.TASK__INPUTS:
					return ((InternalEList)getInputs()).basicRemove(otherEnd, msgs);
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
				case WorkflowPackage.TASK__WORKFLOW:
					return eContainer.eInverseRemove(this, WorkflowPackage.WORKFLOW__NODES, Workflow.class, msgs);
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
			case WorkflowPackage.TASK__NAME:
				return getName();
			case WorkflowPackage.TASK__COMMENT:
				return getComment();
			case WorkflowPackage.TASK__X:
				return new Integer(getX());
			case WorkflowPackage.TASK__Y:
				return new Integer(getY());
			case WorkflowPackage.TASK__WIDTH:
				return new Integer(getWidth());
			case WorkflowPackage.TASK__HEIGHT:
				return new Integer(getHeight());
			case WorkflowPackage.TASK__ID:
				return getId();
			case WorkflowPackage.TASK__WORKFLOW:
				return getWorkflow();
			case WorkflowPackage.TASK__OUTPUTS:
				return getOutputs();
			case WorkflowPackage.TASK__INPUTS:
				return getInputs();
			case WorkflowPackage.TASK__IS_START:
				return isIsStart() ? Boolean.TRUE : Boolean.FALSE;
			case WorkflowPackage.TASK__IS_FINISH:
				return isIsFinish() ? Boolean.TRUE : Boolean.FALSE;
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
			case WorkflowPackage.TASK__NAME:
				setName((String)newValue);
				return;
			case WorkflowPackage.TASK__COMMENT:
				setComment((String)newValue);
				return;
			case WorkflowPackage.TASK__X:
				setX(((Integer)newValue).intValue());
				return;
			case WorkflowPackage.TASK__Y:
				setY(((Integer)newValue).intValue());
				return;
			case WorkflowPackage.TASK__WIDTH:
				setWidth(((Integer)newValue).intValue());
				return;
			case WorkflowPackage.TASK__HEIGHT:
				setHeight(((Integer)newValue).intValue());
				return;
			case WorkflowPackage.TASK__ID:
				setId((String)newValue);
				return;
			case WorkflowPackage.TASK__WORKFLOW:
				setWorkflow((Workflow)newValue);
				return;
			case WorkflowPackage.TASK__OUTPUTS:
				getOutputs().clear();
				getOutputs().addAll((Collection)newValue);
				return;
			case WorkflowPackage.TASK__INPUTS:
				getInputs().clear();
				getInputs().addAll((Collection)newValue);
				return;
			case WorkflowPackage.TASK__IS_START:
				setIsStart(((Boolean)newValue).booleanValue());
				return;
			case WorkflowPackage.TASK__IS_FINISH:
				setIsFinish(((Boolean)newValue).booleanValue());
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
			case WorkflowPackage.TASK__NAME:
				setName(NAME_EDEFAULT);
				return;
			case WorkflowPackage.TASK__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case WorkflowPackage.TASK__X:
				setX(X_EDEFAULT);
				return;
			case WorkflowPackage.TASK__Y:
				setY(Y_EDEFAULT);
				return;
			case WorkflowPackage.TASK__WIDTH:
				setWidth(WIDTH_EDEFAULT);
				return;
			case WorkflowPackage.TASK__HEIGHT:
				setHeight(HEIGHT_EDEFAULT);
				return;
			case WorkflowPackage.TASK__ID:
				setId(ID_EDEFAULT);
				return;
			case WorkflowPackage.TASK__WORKFLOW:
				setWorkflow((Workflow)null);
				return;
			case WorkflowPackage.TASK__OUTPUTS:
				getOutputs().clear();
				return;
			case WorkflowPackage.TASK__INPUTS:
				getInputs().clear();
				return;
			case WorkflowPackage.TASK__IS_START:
				setIsStart(IS_START_EDEFAULT);
				return;
			case WorkflowPackage.TASK__IS_FINISH:
				setIsFinish(IS_FINISH_EDEFAULT);
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
			case WorkflowPackage.TASK__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case WorkflowPackage.TASK__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
			case WorkflowPackage.TASK__X:
				return x != X_EDEFAULT;
			case WorkflowPackage.TASK__Y:
				return y != Y_EDEFAULT;
			case WorkflowPackage.TASK__WIDTH:
				return width != WIDTH_EDEFAULT;
			case WorkflowPackage.TASK__HEIGHT:
				return height != HEIGHT_EDEFAULT;
			case WorkflowPackage.TASK__ID:
				return ID_EDEFAULT == null ? getId() != null : !ID_EDEFAULT.equals(getId());
			case WorkflowPackage.TASK__WORKFLOW:
				return getWorkflow() != null;
			case WorkflowPackage.TASK__OUTPUTS:
				return outputs != null && !outputs.isEmpty();
			case WorkflowPackage.TASK__INPUTS:
				return inputs != null && !inputs.isEmpty();
			case WorkflowPackage.TASK__IS_START:
				return isStart != IS_START_EDEFAULT;
			case WorkflowPackage.TASK__IS_FINISH:
				return isFinish != IS_FINISH_EDEFAULT;
		}
		return eDynamicIsSet(eFeature);
	}

} //TaskImpl

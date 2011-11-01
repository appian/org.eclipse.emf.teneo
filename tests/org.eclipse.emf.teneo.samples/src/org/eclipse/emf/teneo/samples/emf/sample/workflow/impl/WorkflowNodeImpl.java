/**
 * <copyright>
 * </copyright>
 *
 * $Id: WorkflowNodeImpl.java,v 1.1 2006/07/11 16:57:00 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.sample.workflow.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.emf.teneo.samples.emf.sample.workflow.InputPort;
import org.eclipse.emf.teneo.samples.emf.sample.workflow.OutputPort;
import org.eclipse.emf.teneo.samples.emf.sample.workflow.Workflow;
import org.eclipse.emf.teneo.samples.emf.sample.workflow.WorkflowNode;
import org.eclipse.emf.teneo.samples.emf.sample.workflow.WorkflowPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.workflow.impl.WorkflowNodeImpl#getWorkflow <em>Workflow</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.workflow.impl.WorkflowNodeImpl#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.workflow.impl.WorkflowNodeImpl#getInputs <em>Inputs</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.workflow.impl.WorkflowNodeImpl#isIsStart <em>Is Start</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.workflow.impl.WorkflowNodeImpl#isIsFinish <em>Is Finish</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class WorkflowNodeImpl extends WorkflowElementImpl implements WorkflowNode {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2003 IBM Corporation";

	/**
	 * The cached value of the '{@link #getOutputs() <em>Outputs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputs()
	 * @generated
	 * @ordered
	 */
	protected EList outputs = null;

	/**
	 * The cached value of the '{@link #getInputs() <em>Inputs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputs()
	 * @generated
	 * @ordered
	 */
	protected EList inputs = null;

	/**
	 * The default value of the '{@link #isIsStart() <em>Is Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsStart()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_START_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsStart() <em>Is Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsStart()
	 * @generated
	 * @ordered
	 */
	protected boolean isStart = IS_START_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsFinish() <em>Is Finish</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsFinish()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_FINISH_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsFinish() <em>Is Finish</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsFinish()
	 * @generated
	 * @ordered
	 */
	protected boolean isFinish = IS_FINISH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkflowNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return WorkflowPackage.eINSTANCE.getWorkflowNode();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Workflow getWorkflow() {
		if (eContainerFeatureID != WorkflowPackage.WORKFLOW_NODE__WORKFLOW) return null;
		return (Workflow)eContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWorkflow(Workflow newWorkflow) {
		if (newWorkflow != eContainer || (eContainerFeatureID != WorkflowPackage.WORKFLOW_NODE__WORKFLOW && newWorkflow != null)) {
			if (EcoreUtil.isAncestor(this, newWorkflow))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eContainer != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newWorkflow != null)
				msgs = ((InternalEObject)newWorkflow).eInverseAdd(this, WorkflowPackage.WORKFLOW__NODES, Workflow.class, msgs);
			msgs = eBasicSetContainer((InternalEObject)newWorkflow, WorkflowPackage.WORKFLOW_NODE__WORKFLOW, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.WORKFLOW_NODE__WORKFLOW, newWorkflow, newWorkflow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOutputs() {
		if (outputs == null) {
			outputs = new EObjectContainmentWithInverseEList(OutputPort.class, this, WorkflowPackage.WORKFLOW_NODE__OUTPUTS, WorkflowPackage.OUTPUT_PORT__NODE);
		}
		return outputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getInputs() {
		if (inputs == null) {
			inputs = new EObjectContainmentWithInverseEList(InputPort.class, this, WorkflowPackage.WORKFLOW_NODE__INPUTS, WorkflowPackage.INPUT_PORT__NODE);
		}
		return inputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsStart() {
		return isStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsStart(boolean newIsStart) {
		boolean oldIsStart = isStart;
		isStart = newIsStart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.WORKFLOW_NODE__IS_START, oldIsStart, isStart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsFinish() {
		return isFinish;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsFinish(boolean newIsFinish) {
		boolean oldIsFinish = isFinish;
		isFinish = newIsFinish;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.WORKFLOW_NODE__IS_FINISH, oldIsFinish, isFinish));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case WorkflowPackage.WORKFLOW_NODE__WORKFLOW:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, WorkflowPackage.WORKFLOW_NODE__WORKFLOW, msgs);
				case WorkflowPackage.WORKFLOW_NODE__OUTPUTS:
					return ((InternalEList)getOutputs()).basicAdd(otherEnd, msgs);
				case WorkflowPackage.WORKFLOW_NODE__INPUTS:
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
				case WorkflowPackage.WORKFLOW_NODE__WORKFLOW:
					return eBasicSetContainer(null, WorkflowPackage.WORKFLOW_NODE__WORKFLOW, msgs);
				case WorkflowPackage.WORKFLOW_NODE__OUTPUTS:
					return ((InternalEList)getOutputs()).basicRemove(otherEnd, msgs);
				case WorkflowPackage.WORKFLOW_NODE__INPUTS:
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
				case WorkflowPackage.WORKFLOW_NODE__WORKFLOW:
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
			case WorkflowPackage.WORKFLOW_NODE__NAME:
				return getName();
			case WorkflowPackage.WORKFLOW_NODE__COMMENT:
				return getComment();
			case WorkflowPackage.WORKFLOW_NODE__X:
				return new Integer(getX());
			case WorkflowPackage.WORKFLOW_NODE__Y:
				return new Integer(getY());
			case WorkflowPackage.WORKFLOW_NODE__WIDTH:
				return new Integer(getWidth());
			case WorkflowPackage.WORKFLOW_NODE__HEIGHT:
				return new Integer(getHeight());
			case WorkflowPackage.WORKFLOW_NODE__ID:
				return getId();
			case WorkflowPackage.WORKFLOW_NODE__WORKFLOW:
				return getWorkflow();
			case WorkflowPackage.WORKFLOW_NODE__OUTPUTS:
				return getOutputs();
			case WorkflowPackage.WORKFLOW_NODE__INPUTS:
				return getInputs();
			case WorkflowPackage.WORKFLOW_NODE__IS_START:
				return isIsStart() ? Boolean.TRUE : Boolean.FALSE;
			case WorkflowPackage.WORKFLOW_NODE__IS_FINISH:
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
			case WorkflowPackage.WORKFLOW_NODE__NAME:
				setName((String)newValue);
				return;
			case WorkflowPackage.WORKFLOW_NODE__COMMENT:
				setComment((String)newValue);
				return;
			case WorkflowPackage.WORKFLOW_NODE__X:
				setX(((Integer)newValue).intValue());
				return;
			case WorkflowPackage.WORKFLOW_NODE__Y:
				setY(((Integer)newValue).intValue());
				return;
			case WorkflowPackage.WORKFLOW_NODE__WIDTH:
				setWidth(((Integer)newValue).intValue());
				return;
			case WorkflowPackage.WORKFLOW_NODE__HEIGHT:
				setHeight(((Integer)newValue).intValue());
				return;
			case WorkflowPackage.WORKFLOW_NODE__ID:
				setId((String)newValue);
				return;
			case WorkflowPackage.WORKFLOW_NODE__WORKFLOW:
				setWorkflow((Workflow)newValue);
				return;
			case WorkflowPackage.WORKFLOW_NODE__OUTPUTS:
				getOutputs().clear();
				getOutputs().addAll((Collection)newValue);
				return;
			case WorkflowPackage.WORKFLOW_NODE__INPUTS:
				getInputs().clear();
				getInputs().addAll((Collection)newValue);
				return;
			case WorkflowPackage.WORKFLOW_NODE__IS_START:
				setIsStart(((Boolean)newValue).booleanValue());
				return;
			case WorkflowPackage.WORKFLOW_NODE__IS_FINISH:
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
			case WorkflowPackage.WORKFLOW_NODE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case WorkflowPackage.WORKFLOW_NODE__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case WorkflowPackage.WORKFLOW_NODE__X:
				setX(X_EDEFAULT);
				return;
			case WorkflowPackage.WORKFLOW_NODE__Y:
				setY(Y_EDEFAULT);
				return;
			case WorkflowPackage.WORKFLOW_NODE__WIDTH:
				setWidth(WIDTH_EDEFAULT);
				return;
			case WorkflowPackage.WORKFLOW_NODE__HEIGHT:
				setHeight(HEIGHT_EDEFAULT);
				return;
			case WorkflowPackage.WORKFLOW_NODE__ID:
				setId(ID_EDEFAULT);
				return;
			case WorkflowPackage.WORKFLOW_NODE__WORKFLOW:
				setWorkflow((Workflow)null);
				return;
			case WorkflowPackage.WORKFLOW_NODE__OUTPUTS:
				getOutputs().clear();
				return;
			case WorkflowPackage.WORKFLOW_NODE__INPUTS:
				getInputs().clear();
				return;
			case WorkflowPackage.WORKFLOW_NODE__IS_START:
				setIsStart(IS_START_EDEFAULT);
				return;
			case WorkflowPackage.WORKFLOW_NODE__IS_FINISH:
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
			case WorkflowPackage.WORKFLOW_NODE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case WorkflowPackage.WORKFLOW_NODE__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
			case WorkflowPackage.WORKFLOW_NODE__X:
				return x != X_EDEFAULT;
			case WorkflowPackage.WORKFLOW_NODE__Y:
				return y != Y_EDEFAULT;
			case WorkflowPackage.WORKFLOW_NODE__WIDTH:
				return width != WIDTH_EDEFAULT;
			case WorkflowPackage.WORKFLOW_NODE__HEIGHT:
				return height != HEIGHT_EDEFAULT;
			case WorkflowPackage.WORKFLOW_NODE__ID:
				return ID_EDEFAULT == null ? getId() != null : !ID_EDEFAULT.equals(getId());
			case WorkflowPackage.WORKFLOW_NODE__WORKFLOW:
				return getWorkflow() != null;
			case WorkflowPackage.WORKFLOW_NODE__OUTPUTS:
				return outputs != null && !outputs.isEmpty();
			case WorkflowPackage.WORKFLOW_NODE__INPUTS:
				return inputs != null && !inputs.isEmpty();
			case WorkflowPackage.WORKFLOW_NODE__IS_START:
				return isStart != IS_START_EDEFAULT;
			case WorkflowPackage.WORKFLOW_NODE__IS_FINISH:
				return isFinish != IS_FINISH_EDEFAULT;
		}
		return eDynamicIsSet(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (isStart: ");
		result.append(isStart);
		result.append(", isFinish: ");
		result.append(isFinish);
		result.append(')');
		return result.toString();
	}

} //WorkflowNodeImpl

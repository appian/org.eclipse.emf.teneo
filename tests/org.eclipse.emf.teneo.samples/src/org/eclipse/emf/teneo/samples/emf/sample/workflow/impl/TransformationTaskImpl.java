/**
 * <copyright>
 * </copyright>
 *
 * $Id: TransformationTaskImpl.java,v 1.1 2006/07/11 16:57:00 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.sample.workflow.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.emf.teneo.samples.emf.sample.workflow.TransformationTask;
import org.eclipse.emf.teneo.samples.emf.sample.workflow.Workflow;
import org.eclipse.emf.teneo.samples.emf.sample.workflow.WorkflowPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transformation Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.workflow.impl.TransformationTaskImpl#getTransformExpression <em>Transform Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TransformationTaskImpl extends WorkflowNodeImpl implements TransformationTask {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2003 IBM Corporation";

	/**
	 * The default value of the '{@link #getTransformExpression() <em>Transform Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String TRANSFORM_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTransformExpression() <em>Transform Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformExpression()
	 * @generated
	 * @ordered
	 */
	protected String transformExpression = TRANSFORM_EXPRESSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransformationTaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return WorkflowPackage.eINSTANCE.getTransformationTask();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTransformExpression() {
		return transformExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransformExpression(String newTransformExpression) {
		String oldTransformExpression = transformExpression;
		transformExpression = newTransformExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.TRANSFORMATION_TASK__TRANSFORM_EXPRESSION, oldTransformExpression, transformExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case WorkflowPackage.TRANSFORMATION_TASK__WORKFLOW:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, WorkflowPackage.TRANSFORMATION_TASK__WORKFLOW, msgs);
				case WorkflowPackage.TRANSFORMATION_TASK__OUTPUTS:
					return ((InternalEList)getOutputs()).basicAdd(otherEnd, msgs);
				case WorkflowPackage.TRANSFORMATION_TASK__INPUTS:
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
				case WorkflowPackage.TRANSFORMATION_TASK__WORKFLOW:
					return eBasicSetContainer(null, WorkflowPackage.TRANSFORMATION_TASK__WORKFLOW, msgs);
				case WorkflowPackage.TRANSFORMATION_TASK__OUTPUTS:
					return ((InternalEList)getOutputs()).basicRemove(otherEnd, msgs);
				case WorkflowPackage.TRANSFORMATION_TASK__INPUTS:
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
				case WorkflowPackage.TRANSFORMATION_TASK__WORKFLOW:
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
			case WorkflowPackage.TRANSFORMATION_TASK__NAME:
				return getName();
			case WorkflowPackage.TRANSFORMATION_TASK__COMMENT:
				return getComment();
			case WorkflowPackage.TRANSFORMATION_TASK__X:
				return new Integer(getX());
			case WorkflowPackage.TRANSFORMATION_TASK__Y:
				return new Integer(getY());
			case WorkflowPackage.TRANSFORMATION_TASK__WIDTH:
				return new Integer(getWidth());
			case WorkflowPackage.TRANSFORMATION_TASK__HEIGHT:
				return new Integer(getHeight());
			case WorkflowPackage.TRANSFORMATION_TASK__ID:
				return getId();
			case WorkflowPackage.TRANSFORMATION_TASK__WORKFLOW:
				return getWorkflow();
			case WorkflowPackage.TRANSFORMATION_TASK__OUTPUTS:
				return getOutputs();
			case WorkflowPackage.TRANSFORMATION_TASK__INPUTS:
				return getInputs();
			case WorkflowPackage.TRANSFORMATION_TASK__IS_START:
				return isIsStart() ? Boolean.TRUE : Boolean.FALSE;
			case WorkflowPackage.TRANSFORMATION_TASK__IS_FINISH:
				return isIsFinish() ? Boolean.TRUE : Boolean.FALSE;
			case WorkflowPackage.TRANSFORMATION_TASK__TRANSFORM_EXPRESSION:
				return getTransformExpression();
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
			case WorkflowPackage.TRANSFORMATION_TASK__NAME:
				setName((String)newValue);
				return;
			case WorkflowPackage.TRANSFORMATION_TASK__COMMENT:
				setComment((String)newValue);
				return;
			case WorkflowPackage.TRANSFORMATION_TASK__X:
				setX(((Integer)newValue).intValue());
				return;
			case WorkflowPackage.TRANSFORMATION_TASK__Y:
				setY(((Integer)newValue).intValue());
				return;
			case WorkflowPackage.TRANSFORMATION_TASK__WIDTH:
				setWidth(((Integer)newValue).intValue());
				return;
			case WorkflowPackage.TRANSFORMATION_TASK__HEIGHT:
				setHeight(((Integer)newValue).intValue());
				return;
			case WorkflowPackage.TRANSFORMATION_TASK__ID:
				setId((String)newValue);
				return;
			case WorkflowPackage.TRANSFORMATION_TASK__WORKFLOW:
				setWorkflow((Workflow)newValue);
				return;
			case WorkflowPackage.TRANSFORMATION_TASK__OUTPUTS:
				getOutputs().clear();
				getOutputs().addAll((Collection)newValue);
				return;
			case WorkflowPackage.TRANSFORMATION_TASK__INPUTS:
				getInputs().clear();
				getInputs().addAll((Collection)newValue);
				return;
			case WorkflowPackage.TRANSFORMATION_TASK__IS_START:
				setIsStart(((Boolean)newValue).booleanValue());
				return;
			case WorkflowPackage.TRANSFORMATION_TASK__IS_FINISH:
				setIsFinish(((Boolean)newValue).booleanValue());
				return;
			case WorkflowPackage.TRANSFORMATION_TASK__TRANSFORM_EXPRESSION:
				setTransformExpression((String)newValue);
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
			case WorkflowPackage.TRANSFORMATION_TASK__NAME:
				setName(NAME_EDEFAULT);
				return;
			case WorkflowPackage.TRANSFORMATION_TASK__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case WorkflowPackage.TRANSFORMATION_TASK__X:
				setX(X_EDEFAULT);
				return;
			case WorkflowPackage.TRANSFORMATION_TASK__Y:
				setY(Y_EDEFAULT);
				return;
			case WorkflowPackage.TRANSFORMATION_TASK__WIDTH:
				setWidth(WIDTH_EDEFAULT);
				return;
			case WorkflowPackage.TRANSFORMATION_TASK__HEIGHT:
				setHeight(HEIGHT_EDEFAULT);
				return;
			case WorkflowPackage.TRANSFORMATION_TASK__ID:
				setId(ID_EDEFAULT);
				return;
			case WorkflowPackage.TRANSFORMATION_TASK__WORKFLOW:
				setWorkflow((Workflow)null);
				return;
			case WorkflowPackage.TRANSFORMATION_TASK__OUTPUTS:
				getOutputs().clear();
				return;
			case WorkflowPackage.TRANSFORMATION_TASK__INPUTS:
				getInputs().clear();
				return;
			case WorkflowPackage.TRANSFORMATION_TASK__IS_START:
				setIsStart(IS_START_EDEFAULT);
				return;
			case WorkflowPackage.TRANSFORMATION_TASK__IS_FINISH:
				setIsFinish(IS_FINISH_EDEFAULT);
				return;
			case WorkflowPackage.TRANSFORMATION_TASK__TRANSFORM_EXPRESSION:
				setTransformExpression(TRANSFORM_EXPRESSION_EDEFAULT);
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
			case WorkflowPackage.TRANSFORMATION_TASK__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case WorkflowPackage.TRANSFORMATION_TASK__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
			case WorkflowPackage.TRANSFORMATION_TASK__X:
				return x != X_EDEFAULT;
			case WorkflowPackage.TRANSFORMATION_TASK__Y:
				return y != Y_EDEFAULT;
			case WorkflowPackage.TRANSFORMATION_TASK__WIDTH:
				return width != WIDTH_EDEFAULT;
			case WorkflowPackage.TRANSFORMATION_TASK__HEIGHT:
				return height != HEIGHT_EDEFAULT;
			case WorkflowPackage.TRANSFORMATION_TASK__ID:
				return ID_EDEFAULT == null ? getId() != null : !ID_EDEFAULT.equals(getId());
			case WorkflowPackage.TRANSFORMATION_TASK__WORKFLOW:
				return getWorkflow() != null;
			case WorkflowPackage.TRANSFORMATION_TASK__OUTPUTS:
				return outputs != null && !outputs.isEmpty();
			case WorkflowPackage.TRANSFORMATION_TASK__INPUTS:
				return inputs != null && !inputs.isEmpty();
			case WorkflowPackage.TRANSFORMATION_TASK__IS_START:
				return isStart != IS_START_EDEFAULT;
			case WorkflowPackage.TRANSFORMATION_TASK__IS_FINISH:
				return isFinish != IS_FINISH_EDEFAULT;
			case WorkflowPackage.TRANSFORMATION_TASK__TRANSFORM_EXPRESSION:
				return TRANSFORM_EXPRESSION_EDEFAULT == null ? transformExpression != null : !TRANSFORM_EXPRESSION_EDEFAULT.equals(transformExpression);
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
		result.append(" (transformExpression: ");
		result.append(transformExpression);
		result.append(')');
		return result.toString();
	}

} //TransformationTaskImpl

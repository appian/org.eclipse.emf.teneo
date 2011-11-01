/**
 * <copyright>
 * </copyright>
 *
 * $Id: ConditionalOutputPortImpl.java,v 1.1 2006/07/11 16:57:00 mtaal Exp $
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

import org.eclipse.emf.teneo.samples.emf.sample.workflow.ConditionalOutputPort;
import org.eclipse.emf.teneo.samples.emf.sample.workflow.WorkflowNode;
import org.eclipse.emf.teneo.samples.emf.sample.workflow.WorkflowPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conditional Output Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.workflow.impl.ConditionalOutputPortImpl#getCondition <em>Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConditionalOutputPortImpl extends OutputPortImpl implements ConditionalOutputPort {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2003 IBM Corporation";

	/**
	 * The default value of the '{@link #getCondition() <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected static final String CONDITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected String condition = CONDITION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionalOutputPortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return WorkflowPackage.eINSTANCE.getConditionalOutputPort();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondition(String newCondition) {
		String oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.CONDITIONAL_OUTPUT_PORT__CONDITION, oldCondition, condition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case WorkflowPackage.CONDITIONAL_OUTPUT_PORT__NODE:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, WorkflowPackage.CONDITIONAL_OUTPUT_PORT__NODE, msgs);
				case WorkflowPackage.CONDITIONAL_OUTPUT_PORT__EDGES:
					return ((InternalEList)getEdges()).basicAdd(otherEnd, msgs);
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
				case WorkflowPackage.CONDITIONAL_OUTPUT_PORT__NODE:
					return eBasicSetContainer(null, WorkflowPackage.CONDITIONAL_OUTPUT_PORT__NODE, msgs);
				case WorkflowPackage.CONDITIONAL_OUTPUT_PORT__EDGES:
					return ((InternalEList)getEdges()).basicRemove(otherEnd, msgs);
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
				case WorkflowPackage.CONDITIONAL_OUTPUT_PORT__NODE:
					return eContainer.eInverseRemove(this, WorkflowPackage.WORKFLOW_NODE__OUTPUTS, WorkflowNode.class, msgs);
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
			case WorkflowPackage.CONDITIONAL_OUTPUT_PORT__NAME:
				return getName();
			case WorkflowPackage.CONDITIONAL_OUTPUT_PORT__COMMENT:
				return getComment();
			case WorkflowPackage.CONDITIONAL_OUTPUT_PORT__X:
				return new Integer(getX());
			case WorkflowPackage.CONDITIONAL_OUTPUT_PORT__Y:
				return new Integer(getY());
			case WorkflowPackage.CONDITIONAL_OUTPUT_PORT__WIDTH:
				return new Integer(getWidth());
			case WorkflowPackage.CONDITIONAL_OUTPUT_PORT__HEIGHT:
				return new Integer(getHeight());
			case WorkflowPackage.CONDITIONAL_OUTPUT_PORT__ID:
				return getId();
			case WorkflowPackage.CONDITIONAL_OUTPUT_PORT__NODE:
				return getNode();
			case WorkflowPackage.CONDITIONAL_OUTPUT_PORT__EDGES:
				return getEdges();
			case WorkflowPackage.CONDITIONAL_OUTPUT_PORT__CONDITION:
				return getCondition();
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
			case WorkflowPackage.CONDITIONAL_OUTPUT_PORT__NAME:
				setName((String)newValue);
				return;
			case WorkflowPackage.CONDITIONAL_OUTPUT_PORT__COMMENT:
				setComment((String)newValue);
				return;
			case WorkflowPackage.CONDITIONAL_OUTPUT_PORT__X:
				setX(((Integer)newValue).intValue());
				return;
			case WorkflowPackage.CONDITIONAL_OUTPUT_PORT__Y:
				setY(((Integer)newValue).intValue());
				return;
			case WorkflowPackage.CONDITIONAL_OUTPUT_PORT__WIDTH:
				setWidth(((Integer)newValue).intValue());
				return;
			case WorkflowPackage.CONDITIONAL_OUTPUT_PORT__HEIGHT:
				setHeight(((Integer)newValue).intValue());
				return;
			case WorkflowPackage.CONDITIONAL_OUTPUT_PORT__ID:
				setId((String)newValue);
				return;
			case WorkflowPackage.CONDITIONAL_OUTPUT_PORT__NODE:
				setNode((WorkflowNode)newValue);
				return;
			case WorkflowPackage.CONDITIONAL_OUTPUT_PORT__EDGES:
				getEdges().clear();
				getEdges().addAll((Collection)newValue);
				return;
			case WorkflowPackage.CONDITIONAL_OUTPUT_PORT__CONDITION:
				setCondition((String)newValue);
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
			case WorkflowPackage.CONDITIONAL_OUTPUT_PORT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case WorkflowPackage.CONDITIONAL_OUTPUT_PORT__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case WorkflowPackage.CONDITIONAL_OUTPUT_PORT__X:
				setX(X_EDEFAULT);
				return;
			case WorkflowPackage.CONDITIONAL_OUTPUT_PORT__Y:
				setY(Y_EDEFAULT);
				return;
			case WorkflowPackage.CONDITIONAL_OUTPUT_PORT__WIDTH:
				setWidth(WIDTH_EDEFAULT);
				return;
			case WorkflowPackage.CONDITIONAL_OUTPUT_PORT__HEIGHT:
				setHeight(HEIGHT_EDEFAULT);
				return;
			case WorkflowPackage.CONDITIONAL_OUTPUT_PORT__ID:
				setId(ID_EDEFAULT);
				return;
			case WorkflowPackage.CONDITIONAL_OUTPUT_PORT__NODE:
				setNode((WorkflowNode)null);
				return;
			case WorkflowPackage.CONDITIONAL_OUTPUT_PORT__EDGES:
				getEdges().clear();
				return;
			case WorkflowPackage.CONDITIONAL_OUTPUT_PORT__CONDITION:
				setCondition(CONDITION_EDEFAULT);
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
			case WorkflowPackage.CONDITIONAL_OUTPUT_PORT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case WorkflowPackage.CONDITIONAL_OUTPUT_PORT__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
			case WorkflowPackage.CONDITIONAL_OUTPUT_PORT__X:
				return x != X_EDEFAULT;
			case WorkflowPackage.CONDITIONAL_OUTPUT_PORT__Y:
				return y != Y_EDEFAULT;
			case WorkflowPackage.CONDITIONAL_OUTPUT_PORT__WIDTH:
				return width != WIDTH_EDEFAULT;
			case WorkflowPackage.CONDITIONAL_OUTPUT_PORT__HEIGHT:
				return height != HEIGHT_EDEFAULT;
			case WorkflowPackage.CONDITIONAL_OUTPUT_PORT__ID:
				return ID_EDEFAULT == null ? getId() != null : !ID_EDEFAULT.equals(getId());
			case WorkflowPackage.CONDITIONAL_OUTPUT_PORT__NODE:
				return getNode() != null;
			case WorkflowPackage.CONDITIONAL_OUTPUT_PORT__EDGES:
				return edges != null && !edges.isEmpty();
			case WorkflowPackage.CONDITIONAL_OUTPUT_PORT__CONDITION:
				return CONDITION_EDEFAULT == null ? condition != null : !CONDITION_EDEFAULT.equals(condition);
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
		result.append(" (condition: ");
		result.append(condition);
		result.append(')');
		return result.toString();
	}

} //ConditionalOutputPortImpl

/**
 * <copyright>
 * </copyright>
 *
 * $Id: InputPortImpl.java,v 1.1 2006/07/11 16:56:59 mtaal Exp $
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

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.emf.teneo.samples.emf.sample.workflow.Edge;
import org.eclipse.emf.teneo.samples.emf.sample.workflow.InputPort;
import org.eclipse.emf.teneo.samples.emf.sample.workflow.WorkflowNode;
import org.eclipse.emf.teneo.samples.emf.sample.workflow.WorkflowPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Input Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.workflow.impl.InputPortImpl#getNode <em>Node</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.workflow.impl.InputPortImpl#getEdges <em>Edges</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InputPortImpl extends PortImpl implements InputPort {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2003 IBM Corporation";

	/**
	 * The cached value of the '{@link #getEdges() <em>Edges</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdges()
	 * @generated
	 * @ordered
	 */
	protected EList edges = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InputPortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return WorkflowPackage.eINSTANCE.getInputPort();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkflowNode getNode() {
		if (eContainerFeatureID != WorkflowPackage.INPUT_PORT__NODE) return null;
		return (WorkflowNode)eContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNode(WorkflowNode newNode) {
		if (newNode != eContainer || (eContainerFeatureID != WorkflowPackage.INPUT_PORT__NODE && newNode != null)) {
			if (EcoreUtil.isAncestor(this, newNode))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eContainer != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newNode != null)
				msgs = ((InternalEObject)newNode).eInverseAdd(this, WorkflowPackage.WORKFLOW_NODE__INPUTS, WorkflowNode.class, msgs);
			msgs = eBasicSetContainer((InternalEObject)newNode, WorkflowPackage.INPUT_PORT__NODE, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.INPUT_PORT__NODE, newNode, newNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getEdges() {
		if (edges == null) {
			edges = new EObjectWithInverseResolvingEList(Edge.class, this, WorkflowPackage.INPUT_PORT__EDGES, WorkflowPackage.EDGE__TARGET);
		}
		return edges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case WorkflowPackage.INPUT_PORT__NODE:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, WorkflowPackage.INPUT_PORT__NODE, msgs);
				case WorkflowPackage.INPUT_PORT__EDGES:
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
				case WorkflowPackage.INPUT_PORT__NODE:
					return eBasicSetContainer(null, WorkflowPackage.INPUT_PORT__NODE, msgs);
				case WorkflowPackage.INPUT_PORT__EDGES:
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
				case WorkflowPackage.INPUT_PORT__NODE:
					return eContainer.eInverseRemove(this, WorkflowPackage.WORKFLOW_NODE__INPUTS, WorkflowNode.class, msgs);
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
			case WorkflowPackage.INPUT_PORT__NAME:
				return getName();
			case WorkflowPackage.INPUT_PORT__COMMENT:
				return getComment();
			case WorkflowPackage.INPUT_PORT__X:
				return new Integer(getX());
			case WorkflowPackage.INPUT_PORT__Y:
				return new Integer(getY());
			case WorkflowPackage.INPUT_PORT__WIDTH:
				return new Integer(getWidth());
			case WorkflowPackage.INPUT_PORT__HEIGHT:
				return new Integer(getHeight());
			case WorkflowPackage.INPUT_PORT__ID:
				return getId();
			case WorkflowPackage.INPUT_PORT__NODE:
				return getNode();
			case WorkflowPackage.INPUT_PORT__EDGES:
				return getEdges();
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
			case WorkflowPackage.INPUT_PORT__NAME:
				setName((String)newValue);
				return;
			case WorkflowPackage.INPUT_PORT__COMMENT:
				setComment((String)newValue);
				return;
			case WorkflowPackage.INPUT_PORT__X:
				setX(((Integer)newValue).intValue());
				return;
			case WorkflowPackage.INPUT_PORT__Y:
				setY(((Integer)newValue).intValue());
				return;
			case WorkflowPackage.INPUT_PORT__WIDTH:
				setWidth(((Integer)newValue).intValue());
				return;
			case WorkflowPackage.INPUT_PORT__HEIGHT:
				setHeight(((Integer)newValue).intValue());
				return;
			case WorkflowPackage.INPUT_PORT__ID:
				setId((String)newValue);
				return;
			case WorkflowPackage.INPUT_PORT__NODE:
				setNode((WorkflowNode)newValue);
				return;
			case WorkflowPackage.INPUT_PORT__EDGES:
				getEdges().clear();
				getEdges().addAll((Collection)newValue);
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
			case WorkflowPackage.INPUT_PORT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case WorkflowPackage.INPUT_PORT__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case WorkflowPackage.INPUT_PORT__X:
				setX(X_EDEFAULT);
				return;
			case WorkflowPackage.INPUT_PORT__Y:
				setY(Y_EDEFAULT);
				return;
			case WorkflowPackage.INPUT_PORT__WIDTH:
				setWidth(WIDTH_EDEFAULT);
				return;
			case WorkflowPackage.INPUT_PORT__HEIGHT:
				setHeight(HEIGHT_EDEFAULT);
				return;
			case WorkflowPackage.INPUT_PORT__ID:
				setId(ID_EDEFAULT);
				return;
			case WorkflowPackage.INPUT_PORT__NODE:
				setNode((WorkflowNode)null);
				return;
			case WorkflowPackage.INPUT_PORT__EDGES:
				getEdges().clear();
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
			case WorkflowPackage.INPUT_PORT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case WorkflowPackage.INPUT_PORT__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
			case WorkflowPackage.INPUT_PORT__X:
				return x != X_EDEFAULT;
			case WorkflowPackage.INPUT_PORT__Y:
				return y != Y_EDEFAULT;
			case WorkflowPackage.INPUT_PORT__WIDTH:
				return width != WIDTH_EDEFAULT;
			case WorkflowPackage.INPUT_PORT__HEIGHT:
				return height != HEIGHT_EDEFAULT;
			case WorkflowPackage.INPUT_PORT__ID:
				return ID_EDEFAULT == null ? getId() != null : !ID_EDEFAULT.equals(getId());
			case WorkflowPackage.INPUT_PORT__NODE:
				return getNode() != null;
			case WorkflowPackage.INPUT_PORT__EDGES:
				return edges != null && !edges.isEmpty();
		}
		return eDynamicIsSet(eFeature);
	}

} //InputPortImpl

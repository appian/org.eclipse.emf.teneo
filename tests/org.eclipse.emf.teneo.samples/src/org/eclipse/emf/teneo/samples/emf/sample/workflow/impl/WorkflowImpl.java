/**
 * <copyright>
 * </copyright>
 *
 * $Id: WorkflowImpl.java,v 1.1 2006/07/11 16:56:59 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.sample.workflow.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.emf.teneo.samples.emf.sample.workflow.Comment;
import org.eclipse.emf.teneo.samples.emf.sample.workflow.Edge;
import org.eclipse.emf.teneo.samples.emf.sample.workflow.Workflow;
import org.eclipse.emf.teneo.samples.emf.sample.workflow.WorkflowNode;
import org.eclipse.emf.teneo.samples.emf.sample.workflow.WorkflowPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Workflow</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.workflow.impl.WorkflowImpl#getNodes <em>Nodes</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.workflow.impl.WorkflowImpl#getEdges <em>Edges</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.workflow.impl.WorkflowImpl#getComments <em>Comments</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WorkflowImpl extends WorkflowElementImpl implements Workflow {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2003 IBM Corporation";

	/**
	 * The cached value of the '{@link #getNodes() <em>Nodes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodes()
	 * @generated
	 * @ordered
	 */
	protected EList nodes = null;

	/**
	 * The cached value of the '{@link #getEdges() <em>Edges</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdges()
	 * @generated
	 * @ordered
	 */
	protected EList edges = null;

	/**
	 * The cached value of the '{@link #getComments() <em>Comments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComments()
	 * @generated
	 * @ordered
	 */
	protected EList comments = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkflowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return WorkflowPackage.eINSTANCE.getWorkflow();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getNodes() {
		if (nodes == null) {
			nodes = new EObjectContainmentWithInverseEList(WorkflowNode.class, this, WorkflowPackage.WORKFLOW__NODES, WorkflowPackage.WORKFLOW_NODE__WORKFLOW);
		}
		return nodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getEdges() {
		if (edges == null) {
			edges = new EObjectContainmentWithInverseEList(Edge.class, this, WorkflowPackage.WORKFLOW__EDGES, WorkflowPackage.EDGE__WORKFLOW);
		}
		return edges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getComments() {
		if (comments == null) {
			comments = new EObjectContainmentWithInverseEList(Comment.class, this, WorkflowPackage.WORKFLOW__COMMENTS, WorkflowPackage.COMMENT__WORKFLOW);
		}
		return comments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case WorkflowPackage.WORKFLOW__NODES:
					return ((InternalEList)getNodes()).basicAdd(otherEnd, msgs);
				case WorkflowPackage.WORKFLOW__EDGES:
					return ((InternalEList)getEdges()).basicAdd(otherEnd, msgs);
				case WorkflowPackage.WORKFLOW__COMMENTS:
					return ((InternalEList)getComments()).basicAdd(otherEnd, msgs);
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
				case WorkflowPackage.WORKFLOW__NODES:
					return ((InternalEList)getNodes()).basicRemove(otherEnd, msgs);
				case WorkflowPackage.WORKFLOW__EDGES:
					return ((InternalEList)getEdges()).basicRemove(otherEnd, msgs);
				case WorkflowPackage.WORKFLOW__COMMENTS:
					return ((InternalEList)getComments()).basicRemove(otherEnd, msgs);
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
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case WorkflowPackage.WORKFLOW__NAME:
				return getName();
			case WorkflowPackage.WORKFLOW__COMMENT:
				return getComment();
			case WorkflowPackage.WORKFLOW__X:
				return new Integer(getX());
			case WorkflowPackage.WORKFLOW__Y:
				return new Integer(getY());
			case WorkflowPackage.WORKFLOW__WIDTH:
				return new Integer(getWidth());
			case WorkflowPackage.WORKFLOW__HEIGHT:
				return new Integer(getHeight());
			case WorkflowPackage.WORKFLOW__ID:
				return getId();
			case WorkflowPackage.WORKFLOW__NODES:
				return getNodes();
			case WorkflowPackage.WORKFLOW__EDGES:
				return getEdges();
			case WorkflowPackage.WORKFLOW__COMMENTS:
				return getComments();
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
			case WorkflowPackage.WORKFLOW__NAME:
				setName((String)newValue);
				return;
			case WorkflowPackage.WORKFLOW__COMMENT:
				setComment((String)newValue);
				return;
			case WorkflowPackage.WORKFLOW__X:
				setX(((Integer)newValue).intValue());
				return;
			case WorkflowPackage.WORKFLOW__Y:
				setY(((Integer)newValue).intValue());
				return;
			case WorkflowPackage.WORKFLOW__WIDTH:
				setWidth(((Integer)newValue).intValue());
				return;
			case WorkflowPackage.WORKFLOW__HEIGHT:
				setHeight(((Integer)newValue).intValue());
				return;
			case WorkflowPackage.WORKFLOW__ID:
				setId((String)newValue);
				return;
			case WorkflowPackage.WORKFLOW__NODES:
				getNodes().clear();
				getNodes().addAll((Collection)newValue);
				return;
			case WorkflowPackage.WORKFLOW__EDGES:
				getEdges().clear();
				getEdges().addAll((Collection)newValue);
				return;
			case WorkflowPackage.WORKFLOW__COMMENTS:
				getComments().clear();
				getComments().addAll((Collection)newValue);
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
			case WorkflowPackage.WORKFLOW__NAME:
				setName(NAME_EDEFAULT);
				return;
			case WorkflowPackage.WORKFLOW__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case WorkflowPackage.WORKFLOW__X:
				setX(X_EDEFAULT);
				return;
			case WorkflowPackage.WORKFLOW__Y:
				setY(Y_EDEFAULT);
				return;
			case WorkflowPackage.WORKFLOW__WIDTH:
				setWidth(WIDTH_EDEFAULT);
				return;
			case WorkflowPackage.WORKFLOW__HEIGHT:
				setHeight(HEIGHT_EDEFAULT);
				return;
			case WorkflowPackage.WORKFLOW__ID:
				setId(ID_EDEFAULT);
				return;
			case WorkflowPackage.WORKFLOW__NODES:
				getNodes().clear();
				return;
			case WorkflowPackage.WORKFLOW__EDGES:
				getEdges().clear();
				return;
			case WorkflowPackage.WORKFLOW__COMMENTS:
				getComments().clear();
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
			case WorkflowPackage.WORKFLOW__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case WorkflowPackage.WORKFLOW__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
			case WorkflowPackage.WORKFLOW__X:
				return x != X_EDEFAULT;
			case WorkflowPackage.WORKFLOW__Y:
				return y != Y_EDEFAULT;
			case WorkflowPackage.WORKFLOW__WIDTH:
				return width != WIDTH_EDEFAULT;
			case WorkflowPackage.WORKFLOW__HEIGHT:
				return height != HEIGHT_EDEFAULT;
			case WorkflowPackage.WORKFLOW__ID:
				return ID_EDEFAULT == null ? getId() != null : !ID_EDEFAULT.equals(getId());
			case WorkflowPackage.WORKFLOW__NODES:
				return nodes != null && !nodes.isEmpty();
			case WorkflowPackage.WORKFLOW__EDGES:
				return edges != null && !edges.isEmpty();
			case WorkflowPackage.WORKFLOW__COMMENTS:
				return comments != null && !comments.isEmpty();
		}
		return eDynamicIsSet(eFeature);
	}

} //WorkflowImpl

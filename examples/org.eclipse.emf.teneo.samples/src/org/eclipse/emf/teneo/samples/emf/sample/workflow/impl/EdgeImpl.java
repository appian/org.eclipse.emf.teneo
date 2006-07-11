/**
 * <copyright>
 * </copyright>
 *
 * $Id: EdgeImpl.java,v 1.1 2006/07/11 16:56:59 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.sample.workflow.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import org.eclipse.emf.teneo.samples.emf.sample.workflow.Edge;
import org.eclipse.emf.teneo.samples.emf.sample.workflow.InputPort;
import org.eclipse.emf.teneo.samples.emf.sample.workflow.OutputPort;
import org.eclipse.emf.teneo.samples.emf.sample.workflow.Workflow;
import org.eclipse.emf.teneo.samples.emf.sample.workflow.WorkflowPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Edge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.workflow.impl.EdgeImpl#getWorkflow <em>Workflow</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.workflow.impl.EdgeImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.workflow.impl.EdgeImpl#getSource <em>Source</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EdgeImpl extends WorkflowElementImpl implements Edge {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2003 IBM Corporation";

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected InputPort target = null;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected OutputPort source = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EdgeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return WorkflowPackage.eINSTANCE.getEdge();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Workflow getWorkflow() {
		if (eContainerFeatureID != WorkflowPackage.EDGE__WORKFLOW) return null;
		return (Workflow)eContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWorkflow(Workflow newWorkflow) {
		if (newWorkflow != eContainer || (eContainerFeatureID != WorkflowPackage.EDGE__WORKFLOW && newWorkflow != null)) {
			if (EcoreUtil.isAncestor(this, newWorkflow))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eContainer != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newWorkflow != null)
				msgs = ((InternalEObject)newWorkflow).eInverseAdd(this, WorkflowPackage.WORKFLOW__EDGES, Workflow.class, msgs);
			msgs = eBasicSetContainer((InternalEObject)newWorkflow, WorkflowPackage.EDGE__WORKFLOW, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.EDGE__WORKFLOW, newWorkflow, newWorkflow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPort getTarget() {
		if (target != null && target.eIsProxy()) {
			InputPort oldTarget = target;
			target = (InputPort)eResolveProxy((InternalEObject)target);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WorkflowPackage.EDGE__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPort basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTarget(InputPort newTarget, NotificationChain msgs) {
		InputPort oldTarget = target;
		target = newTarget;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WorkflowPackage.EDGE__TARGET, oldTarget, newTarget);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(InputPort newTarget) {
		if (newTarget != target) {
			NotificationChain msgs = null;
			if (target != null)
				msgs = ((InternalEObject)target).eInverseRemove(this, WorkflowPackage.INPUT_PORT__EDGES, InputPort.class, msgs);
			if (newTarget != null)
				msgs = ((InternalEObject)newTarget).eInverseAdd(this, WorkflowPackage.INPUT_PORT__EDGES, InputPort.class, msgs);
			msgs = basicSetTarget(newTarget, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.EDGE__TARGET, newTarget, newTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputPort getSource() {
		if (source != null && source.eIsProxy()) {
			OutputPort oldSource = source;
			source = (OutputPort)eResolveProxy((InternalEObject)source);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WorkflowPackage.EDGE__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputPort basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(OutputPort newSource, NotificationChain msgs) {
		OutputPort oldSource = source;
		source = newSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WorkflowPackage.EDGE__SOURCE, oldSource, newSource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(OutputPort newSource) {
		if (newSource != source) {
			NotificationChain msgs = null;
			if (source != null)
				msgs = ((InternalEObject)source).eInverseRemove(this, WorkflowPackage.OUTPUT_PORT__EDGES, OutputPort.class, msgs);
			if (newSource != null)
				msgs = ((InternalEObject)newSource).eInverseAdd(this, WorkflowPackage.OUTPUT_PORT__EDGES, OutputPort.class, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.EDGE__SOURCE, newSource, newSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case WorkflowPackage.EDGE__WORKFLOW:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, WorkflowPackage.EDGE__WORKFLOW, msgs);
				case WorkflowPackage.EDGE__TARGET:
					if (target != null)
						msgs = ((InternalEObject)target).eInverseRemove(this, WorkflowPackage.INPUT_PORT__EDGES, InputPort.class, msgs);
					return basicSetTarget((InputPort)otherEnd, msgs);
				case WorkflowPackage.EDGE__SOURCE:
					if (source != null)
						msgs = ((InternalEObject)source).eInverseRemove(this, WorkflowPackage.OUTPUT_PORT__EDGES, OutputPort.class, msgs);
					return basicSetSource((OutputPort)otherEnd, msgs);
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
				case WorkflowPackage.EDGE__WORKFLOW:
					return eBasicSetContainer(null, WorkflowPackage.EDGE__WORKFLOW, msgs);
				case WorkflowPackage.EDGE__TARGET:
					return basicSetTarget(null, msgs);
				case WorkflowPackage.EDGE__SOURCE:
					return basicSetSource(null, msgs);
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
				case WorkflowPackage.EDGE__WORKFLOW:
					return eContainer.eInverseRemove(this, WorkflowPackage.WORKFLOW__EDGES, Workflow.class, msgs);
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
			case WorkflowPackage.EDGE__NAME:
				return getName();
			case WorkflowPackage.EDGE__COMMENT:
				return getComment();
			case WorkflowPackage.EDGE__X:
				return new Integer(getX());
			case WorkflowPackage.EDGE__Y:
				return new Integer(getY());
			case WorkflowPackage.EDGE__WIDTH:
				return new Integer(getWidth());
			case WorkflowPackage.EDGE__HEIGHT:
				return new Integer(getHeight());
			case WorkflowPackage.EDGE__ID:
				return getId();
			case WorkflowPackage.EDGE__WORKFLOW:
				return getWorkflow();
			case WorkflowPackage.EDGE__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case WorkflowPackage.EDGE__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
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
			case WorkflowPackage.EDGE__NAME:
				setName((String)newValue);
				return;
			case WorkflowPackage.EDGE__COMMENT:
				setComment((String)newValue);
				return;
			case WorkflowPackage.EDGE__X:
				setX(((Integer)newValue).intValue());
				return;
			case WorkflowPackage.EDGE__Y:
				setY(((Integer)newValue).intValue());
				return;
			case WorkflowPackage.EDGE__WIDTH:
				setWidth(((Integer)newValue).intValue());
				return;
			case WorkflowPackage.EDGE__HEIGHT:
				setHeight(((Integer)newValue).intValue());
				return;
			case WorkflowPackage.EDGE__ID:
				setId((String)newValue);
				return;
			case WorkflowPackage.EDGE__WORKFLOW:
				setWorkflow((Workflow)newValue);
				return;
			case WorkflowPackage.EDGE__TARGET:
				setTarget((InputPort)newValue);
				return;
			case WorkflowPackage.EDGE__SOURCE:
				setSource((OutputPort)newValue);
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
			case WorkflowPackage.EDGE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case WorkflowPackage.EDGE__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case WorkflowPackage.EDGE__X:
				setX(X_EDEFAULT);
				return;
			case WorkflowPackage.EDGE__Y:
				setY(Y_EDEFAULT);
				return;
			case WorkflowPackage.EDGE__WIDTH:
				setWidth(WIDTH_EDEFAULT);
				return;
			case WorkflowPackage.EDGE__HEIGHT:
				setHeight(HEIGHT_EDEFAULT);
				return;
			case WorkflowPackage.EDGE__ID:
				setId(ID_EDEFAULT);
				return;
			case WorkflowPackage.EDGE__WORKFLOW:
				setWorkflow((Workflow)null);
				return;
			case WorkflowPackage.EDGE__TARGET:
				setTarget((InputPort)null);
				return;
			case WorkflowPackage.EDGE__SOURCE:
				setSource((OutputPort)null);
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
			case WorkflowPackage.EDGE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case WorkflowPackage.EDGE__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
			case WorkflowPackage.EDGE__X:
				return x != X_EDEFAULT;
			case WorkflowPackage.EDGE__Y:
				return y != Y_EDEFAULT;
			case WorkflowPackage.EDGE__WIDTH:
				return width != WIDTH_EDEFAULT;
			case WorkflowPackage.EDGE__HEIGHT:
				return height != HEIGHT_EDEFAULT;
			case WorkflowPackage.EDGE__ID:
				return ID_EDEFAULT == null ? getId() != null : !ID_EDEFAULT.equals(getId());
			case WorkflowPackage.EDGE__WORKFLOW:
				return getWorkflow() != null;
			case WorkflowPackage.EDGE__TARGET:
				return target != null;
			case WorkflowPackage.EDGE__SOURCE:
				return source != null;
		}
		return eDynamicIsSet(eFeature);
	}

} //EdgeImpl

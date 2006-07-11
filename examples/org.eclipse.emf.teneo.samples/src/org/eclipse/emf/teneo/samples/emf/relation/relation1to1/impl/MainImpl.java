/**
 * <copyright>
 * </copyright>
 *
 * $Id: MainImpl.java,v 1.1 2006/07/11 16:56:59 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.relation.relation1to1.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.teneo.samples.emf.relation.relation1to1.ContainedChildNR;
import org.eclipse.emf.teneo.samples.emf.relation.relation1to1.ContainedChildR;
import org.eclipse.emf.teneo.samples.emf.relation.relation1to1.Main;
import org.eclipse.emf.teneo.samples.emf.relation.relation1to1.NotContainedChildNR;
import org.eclipse.emf.teneo.samples.emf.relation.relation1to1.NotContainedChildNRT;
import org.eclipse.emf.teneo.samples.emf.relation.relation1to1.NotContainedChildNRTNR;
import org.eclipse.emf.teneo.samples.emf.relation.relation1to1.NotContainedChildR;
import org.eclipse.emf.teneo.samples.emf.relation.relation1to1.NotContainedChildRTNR;
import org.eclipse.emf.teneo.samples.emf.relation.relation1to1.Relation1to1Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Main</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.relation.relation1to1.impl.MainImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.relation.relation1to1.impl.MainImpl#getContainedonewayrequired <em>Containedonewayrequired</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.relation.relation1to1.impl.MainImpl#getContainedoneWaynotrequired <em>Containedone Waynotrequired</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.relation.relation1to1.impl.MainImpl#getNotcontainedonewayrequired <em>Notcontainedonewayrequired</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.relation.relation1to1.impl.MainImpl#getNotcontainedonewaynotrequired <em>Notcontainedonewaynotrequired</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.relation.relation1to1.impl.MainImpl#getNotcontainedtwowaynotrequired <em>Notcontainedtwowaynotrequired</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.relation.relation1to1.impl.MainImpl#getNotcontainedtwowayrequirednr <em>Notcontainedtwowayrequirednr</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.relation.relation1to1.impl.MainImpl#getNotcontainedtwowaynotrequirednr <em>Notcontainedtwowaynotrequirednr</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MainImpl extends EObjectImpl implements Main {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "c1";

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * This is true if the Name attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nameESet = false;

	/**
	 * The cached value of the '{@link #getContainedonewayrequired() <em>Containedonewayrequired</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedonewayrequired()
	 * @generated
	 * @ordered
	 */
	protected ContainedChildR containedonewayrequired = null;

	/**
	 * The cached value of the '{@link #getContainedoneWaynotrequired() <em>Containedone Waynotrequired</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedoneWaynotrequired()
	 * @generated
	 * @ordered
	 */
	protected ContainedChildNR containedoneWaynotrequired = null;

	/**
	 * The cached value of the '{@link #getNotcontainedonewayrequired() <em>Notcontainedonewayrequired</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotcontainedonewayrequired()
	 * @generated
	 * @ordered
	 */
	protected NotContainedChildR notcontainedonewayrequired = null;

	/**
	 * The cached value of the '{@link #getNotcontainedonewaynotrequired() <em>Notcontainedonewaynotrequired</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotcontainedonewaynotrequired()
	 * @generated
	 * @ordered
	 */
	protected NotContainedChildNR notcontainedonewaynotrequired = null;

	/**
	 * The cached value of the '{@link #getNotcontainedtwowaynotrequired() <em>Notcontainedtwowaynotrequired</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotcontainedtwowaynotrequired()
	 * @generated
	 * @ordered
	 */
	protected NotContainedChildNRT notcontainedtwowaynotrequired = null;

	/**
	 * The cached value of the '{@link #getNotcontainedtwowayrequirednr() <em>Notcontainedtwowayrequirednr</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotcontainedtwowayrequirednr()
	 * @generated
	 * @ordered
	 */
	protected NotContainedChildRTNR notcontainedtwowayrequirednr = null;

	/**
	 * The cached value of the '{@link #getNotcontainedtwowaynotrequirednr() <em>Notcontainedtwowaynotrequirednr</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotcontainedtwowaynotrequirednr()
	 * @generated
	 * @ordered
	 */
	protected NotContainedChildNRTNR notcontainedtwowaynotrequirednr = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MainImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return Relation1to1Package.eINSTANCE.getMain();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		boolean oldNameESet = nameESet;
		nameESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Relation1to1Package.MAIN__NAME, oldName, name, !oldNameESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetName() {
		String oldName = name;
		boolean oldNameESet = nameESet;
		name = NAME_EDEFAULT;
		nameESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Relation1to1Package.MAIN__NAME, oldName, NAME_EDEFAULT, oldNameESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetName() {
		return nameESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainedChildR getContainedonewayrequired() {
		return containedonewayrequired;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainedonewayrequired(ContainedChildR newContainedonewayrequired, NotificationChain msgs) {
		ContainedChildR oldContainedonewayrequired = containedonewayrequired;
		containedonewayrequired = newContainedonewayrequired;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Relation1to1Package.MAIN__CONTAINEDONEWAYREQUIRED, oldContainedonewayrequired, newContainedonewayrequired);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainedonewayrequired(ContainedChildR newContainedonewayrequired) {
		if (newContainedonewayrequired != containedonewayrequired) {
			NotificationChain msgs = null;
			if (containedonewayrequired != null)
				msgs = ((InternalEObject)containedonewayrequired).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Relation1to1Package.MAIN__CONTAINEDONEWAYREQUIRED, null, msgs);
			if (newContainedonewayrequired != null)
				msgs = ((InternalEObject)newContainedonewayrequired).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Relation1to1Package.MAIN__CONTAINEDONEWAYREQUIRED, null, msgs);
			msgs = basicSetContainedonewayrequired(newContainedonewayrequired, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Relation1to1Package.MAIN__CONTAINEDONEWAYREQUIRED, newContainedonewayrequired, newContainedonewayrequired));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainedChildNR getContainedoneWaynotrequired() {
		return containedoneWaynotrequired;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainedoneWaynotrequired(ContainedChildNR newContainedoneWaynotrequired, NotificationChain msgs) {
		ContainedChildNR oldContainedoneWaynotrequired = containedoneWaynotrequired;
		containedoneWaynotrequired = newContainedoneWaynotrequired;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Relation1to1Package.MAIN__CONTAINEDONE_WAYNOTREQUIRED, oldContainedoneWaynotrequired, newContainedoneWaynotrequired);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainedoneWaynotrequired(ContainedChildNR newContainedoneWaynotrequired) {
		if (newContainedoneWaynotrequired != containedoneWaynotrequired) {
			NotificationChain msgs = null;
			if (containedoneWaynotrequired != null)
				msgs = ((InternalEObject)containedoneWaynotrequired).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Relation1to1Package.MAIN__CONTAINEDONE_WAYNOTREQUIRED, null, msgs);
			if (newContainedoneWaynotrequired != null)
				msgs = ((InternalEObject)newContainedoneWaynotrequired).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Relation1to1Package.MAIN__CONTAINEDONE_WAYNOTREQUIRED, null, msgs);
			msgs = basicSetContainedoneWaynotrequired(newContainedoneWaynotrequired, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Relation1to1Package.MAIN__CONTAINEDONE_WAYNOTREQUIRED, newContainedoneWaynotrequired, newContainedoneWaynotrequired));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotContainedChildR getNotcontainedonewayrequired() {
		return notcontainedonewayrequired;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNotcontainedonewayrequired(NotContainedChildR newNotcontainedonewayrequired) {
		NotContainedChildR oldNotcontainedonewayrequired = notcontainedonewayrequired;
		notcontainedonewayrequired = newNotcontainedonewayrequired;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Relation1to1Package.MAIN__NOTCONTAINEDONEWAYREQUIRED, oldNotcontainedonewayrequired, notcontainedonewayrequired));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotContainedChildNR getNotcontainedonewaynotrequired() {
		return notcontainedonewaynotrequired;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNotcontainedonewaynotrequired(NotContainedChildNR newNotcontainedonewaynotrequired) {
		NotContainedChildNR oldNotcontainedonewaynotrequired = notcontainedonewaynotrequired;
		notcontainedonewaynotrequired = newNotcontainedonewaynotrequired;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Relation1to1Package.MAIN__NOTCONTAINEDONEWAYNOTREQUIRED, oldNotcontainedonewaynotrequired, notcontainedonewaynotrequired));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotContainedChildNRT getNotcontainedtwowaynotrequired() {
		return notcontainedtwowaynotrequired;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNotcontainedtwowaynotrequired(NotContainedChildNRT newNotcontainedtwowaynotrequired, NotificationChain msgs) {
		NotContainedChildNRT oldNotcontainedtwowaynotrequired = notcontainedtwowaynotrequired;
		notcontainedtwowaynotrequired = newNotcontainedtwowaynotrequired;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Relation1to1Package.MAIN__NOTCONTAINEDTWOWAYNOTREQUIRED, oldNotcontainedtwowaynotrequired, newNotcontainedtwowaynotrequired);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNotcontainedtwowaynotrequired(NotContainedChildNRT newNotcontainedtwowaynotrequired) {
		if (newNotcontainedtwowaynotrequired != notcontainedtwowaynotrequired) {
			NotificationChain msgs = null;
			if (notcontainedtwowaynotrequired != null)
				msgs = ((InternalEObject)notcontainedtwowaynotrequired).eInverseRemove(this, Relation1to1Package.NOT_CONTAINED_CHILD_NRT__MAIN, NotContainedChildNRT.class, msgs);
			if (newNotcontainedtwowaynotrequired != null)
				msgs = ((InternalEObject)newNotcontainedtwowaynotrequired).eInverseAdd(this, Relation1to1Package.NOT_CONTAINED_CHILD_NRT__MAIN, NotContainedChildNRT.class, msgs);
			msgs = basicSetNotcontainedtwowaynotrequired(newNotcontainedtwowaynotrequired, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Relation1to1Package.MAIN__NOTCONTAINEDTWOWAYNOTREQUIRED, newNotcontainedtwowaynotrequired, newNotcontainedtwowaynotrequired));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotContainedChildRTNR getNotcontainedtwowayrequirednr() {
		return notcontainedtwowayrequirednr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNotcontainedtwowayrequirednr(NotContainedChildRTNR newNotcontainedtwowayrequirednr, NotificationChain msgs) {
		NotContainedChildRTNR oldNotcontainedtwowayrequirednr = notcontainedtwowayrequirednr;
		notcontainedtwowayrequirednr = newNotcontainedtwowayrequirednr;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Relation1to1Package.MAIN__NOTCONTAINEDTWOWAYREQUIREDNR, oldNotcontainedtwowayrequirednr, newNotcontainedtwowayrequirednr);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNotcontainedtwowayrequirednr(NotContainedChildRTNR newNotcontainedtwowayrequirednr) {
		if (newNotcontainedtwowayrequirednr != notcontainedtwowayrequirednr) {
			NotificationChain msgs = null;
			if (notcontainedtwowayrequirednr != null)
				msgs = ((InternalEObject)notcontainedtwowayrequirednr).eInverseRemove(this, Relation1to1Package.NOT_CONTAINED_CHILD_RTNR__MAIN, NotContainedChildRTNR.class, msgs);
			if (newNotcontainedtwowayrequirednr != null)
				msgs = ((InternalEObject)newNotcontainedtwowayrequirednr).eInverseAdd(this, Relation1to1Package.NOT_CONTAINED_CHILD_RTNR__MAIN, NotContainedChildRTNR.class, msgs);
			msgs = basicSetNotcontainedtwowayrequirednr(newNotcontainedtwowayrequirednr, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Relation1to1Package.MAIN__NOTCONTAINEDTWOWAYREQUIREDNR, newNotcontainedtwowayrequirednr, newNotcontainedtwowayrequirednr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotContainedChildNRTNR getNotcontainedtwowaynotrequirednr() {
		return notcontainedtwowaynotrequirednr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNotcontainedtwowaynotrequirednr(NotContainedChildNRTNR newNotcontainedtwowaynotrequirednr, NotificationChain msgs) {
		NotContainedChildNRTNR oldNotcontainedtwowaynotrequirednr = notcontainedtwowaynotrequirednr;
		notcontainedtwowaynotrequirednr = newNotcontainedtwowaynotrequirednr;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Relation1to1Package.MAIN__NOTCONTAINEDTWOWAYNOTREQUIREDNR, oldNotcontainedtwowaynotrequirednr, newNotcontainedtwowaynotrequirednr);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNotcontainedtwowaynotrequirednr(NotContainedChildNRTNR newNotcontainedtwowaynotrequirednr) {
		if (newNotcontainedtwowaynotrequirednr != notcontainedtwowaynotrequirednr) {
			NotificationChain msgs = null;
			if (notcontainedtwowaynotrequirednr != null)
				msgs = ((InternalEObject)notcontainedtwowaynotrequirednr).eInverseRemove(this, Relation1to1Package.NOT_CONTAINED_CHILD_NRTNR__MAIN, NotContainedChildNRTNR.class, msgs);
			if (newNotcontainedtwowaynotrequirednr != null)
				msgs = ((InternalEObject)newNotcontainedtwowaynotrequirednr).eInverseAdd(this, Relation1to1Package.NOT_CONTAINED_CHILD_NRTNR__MAIN, NotContainedChildNRTNR.class, msgs);
			msgs = basicSetNotcontainedtwowaynotrequirednr(newNotcontainedtwowaynotrequirednr, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Relation1to1Package.MAIN__NOTCONTAINEDTWOWAYNOTREQUIREDNR, newNotcontainedtwowaynotrequirednr, newNotcontainedtwowaynotrequirednr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case Relation1to1Package.MAIN__NOTCONTAINEDTWOWAYNOTREQUIRED:
					if (notcontainedtwowaynotrequired != null)
						msgs = ((InternalEObject)notcontainedtwowaynotrequired).eInverseRemove(this, Relation1to1Package.NOT_CONTAINED_CHILD_NRT__MAIN, NotContainedChildNRT.class, msgs);
					return basicSetNotcontainedtwowaynotrequired((NotContainedChildNRT)otherEnd, msgs);
				case Relation1to1Package.MAIN__NOTCONTAINEDTWOWAYREQUIREDNR:
					if (notcontainedtwowayrequirednr != null)
						msgs = ((InternalEObject)notcontainedtwowayrequirednr).eInverseRemove(this, Relation1to1Package.NOT_CONTAINED_CHILD_RTNR__MAIN, NotContainedChildRTNR.class, msgs);
					return basicSetNotcontainedtwowayrequirednr((NotContainedChildRTNR)otherEnd, msgs);
				case Relation1to1Package.MAIN__NOTCONTAINEDTWOWAYNOTREQUIREDNR:
					if (notcontainedtwowaynotrequirednr != null)
						msgs = ((InternalEObject)notcontainedtwowaynotrequirednr).eInverseRemove(this, Relation1to1Package.NOT_CONTAINED_CHILD_NRTNR__MAIN, NotContainedChildNRTNR.class, msgs);
					return basicSetNotcontainedtwowaynotrequirednr((NotContainedChildNRTNR)otherEnd, msgs);
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
				case Relation1to1Package.MAIN__CONTAINEDONEWAYREQUIRED:
					return basicSetContainedonewayrequired(null, msgs);
				case Relation1to1Package.MAIN__CONTAINEDONE_WAYNOTREQUIRED:
					return basicSetContainedoneWaynotrequired(null, msgs);
				case Relation1to1Package.MAIN__NOTCONTAINEDTWOWAYNOTREQUIRED:
					return basicSetNotcontainedtwowaynotrequired(null, msgs);
				case Relation1to1Package.MAIN__NOTCONTAINEDTWOWAYREQUIREDNR:
					return basicSetNotcontainedtwowayrequirednr(null, msgs);
				case Relation1to1Package.MAIN__NOTCONTAINEDTWOWAYNOTREQUIREDNR:
					return basicSetNotcontainedtwowaynotrequirednr(null, msgs);
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
			case Relation1to1Package.MAIN__NAME:
				return getName();
			case Relation1to1Package.MAIN__CONTAINEDONEWAYREQUIRED:
				return getContainedonewayrequired();
			case Relation1to1Package.MAIN__CONTAINEDONE_WAYNOTREQUIRED:
				return getContainedoneWaynotrequired();
			case Relation1to1Package.MAIN__NOTCONTAINEDONEWAYREQUIRED:
				return getNotcontainedonewayrequired();
			case Relation1to1Package.MAIN__NOTCONTAINEDONEWAYNOTREQUIRED:
				return getNotcontainedonewaynotrequired();
			case Relation1to1Package.MAIN__NOTCONTAINEDTWOWAYNOTREQUIRED:
				return getNotcontainedtwowaynotrequired();
			case Relation1to1Package.MAIN__NOTCONTAINEDTWOWAYREQUIREDNR:
				return getNotcontainedtwowayrequirednr();
			case Relation1to1Package.MAIN__NOTCONTAINEDTWOWAYNOTREQUIREDNR:
				return getNotcontainedtwowaynotrequirednr();
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
			case Relation1to1Package.MAIN__NAME:
				setName((String)newValue);
				return;
			case Relation1to1Package.MAIN__CONTAINEDONEWAYREQUIRED:
				setContainedonewayrequired((ContainedChildR)newValue);
				return;
			case Relation1to1Package.MAIN__CONTAINEDONE_WAYNOTREQUIRED:
				setContainedoneWaynotrequired((ContainedChildNR)newValue);
				return;
			case Relation1to1Package.MAIN__NOTCONTAINEDONEWAYREQUIRED:
				setNotcontainedonewayrequired((NotContainedChildR)newValue);
				return;
			case Relation1to1Package.MAIN__NOTCONTAINEDONEWAYNOTREQUIRED:
				setNotcontainedonewaynotrequired((NotContainedChildNR)newValue);
				return;
			case Relation1to1Package.MAIN__NOTCONTAINEDTWOWAYNOTREQUIRED:
				setNotcontainedtwowaynotrequired((NotContainedChildNRT)newValue);
				return;
			case Relation1to1Package.MAIN__NOTCONTAINEDTWOWAYREQUIREDNR:
				setNotcontainedtwowayrequirednr((NotContainedChildRTNR)newValue);
				return;
			case Relation1to1Package.MAIN__NOTCONTAINEDTWOWAYNOTREQUIREDNR:
				setNotcontainedtwowaynotrequirednr((NotContainedChildNRTNR)newValue);
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
			case Relation1to1Package.MAIN__NAME:
				unsetName();
				return;
			case Relation1to1Package.MAIN__CONTAINEDONEWAYREQUIRED:
				setContainedonewayrequired((ContainedChildR)null);
				return;
			case Relation1to1Package.MAIN__CONTAINEDONE_WAYNOTREQUIRED:
				setContainedoneWaynotrequired((ContainedChildNR)null);
				return;
			case Relation1to1Package.MAIN__NOTCONTAINEDONEWAYREQUIRED:
				setNotcontainedonewayrequired((NotContainedChildR)null);
				return;
			case Relation1to1Package.MAIN__NOTCONTAINEDONEWAYNOTREQUIRED:
				setNotcontainedonewaynotrequired((NotContainedChildNR)null);
				return;
			case Relation1to1Package.MAIN__NOTCONTAINEDTWOWAYNOTREQUIRED:
				setNotcontainedtwowaynotrequired((NotContainedChildNRT)null);
				return;
			case Relation1to1Package.MAIN__NOTCONTAINEDTWOWAYREQUIREDNR:
				setNotcontainedtwowayrequirednr((NotContainedChildRTNR)null);
				return;
			case Relation1to1Package.MAIN__NOTCONTAINEDTWOWAYNOTREQUIREDNR:
				setNotcontainedtwowaynotrequirednr((NotContainedChildNRTNR)null);
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
			case Relation1to1Package.MAIN__NAME:
				return isSetName();
			case Relation1to1Package.MAIN__CONTAINEDONEWAYREQUIRED:
				return containedonewayrequired != null;
			case Relation1to1Package.MAIN__CONTAINEDONE_WAYNOTREQUIRED:
				return containedoneWaynotrequired != null;
			case Relation1to1Package.MAIN__NOTCONTAINEDONEWAYREQUIRED:
				return notcontainedonewayrequired != null;
			case Relation1to1Package.MAIN__NOTCONTAINEDONEWAYNOTREQUIRED:
				return notcontainedonewaynotrequired != null;
			case Relation1to1Package.MAIN__NOTCONTAINEDTWOWAYNOTREQUIRED:
				return notcontainedtwowaynotrequired != null;
			case Relation1to1Package.MAIN__NOTCONTAINEDTWOWAYREQUIREDNR:
				return notcontainedtwowayrequirednr != null;
			case Relation1to1Package.MAIN__NOTCONTAINEDTWOWAYNOTREQUIREDNR:
				return notcontainedtwowaynotrequirednr != null;
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
		result.append(" (name: ");
		if (nameESet) result.append(name); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //MainImpl

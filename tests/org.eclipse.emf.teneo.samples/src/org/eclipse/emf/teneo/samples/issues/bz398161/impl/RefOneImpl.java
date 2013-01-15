/**
 */
package org.eclipse.emf.teneo.samples.issues.bz398161.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.teneo.samples.issues.bz398161.Bz398161Package;
import org.eclipse.emf.teneo.samples.issues.bz398161.RefOne;
import org.eclipse.emf.teneo.samples.issues.bz398161.RefTwo;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ref One</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz398161.impl.RefOneImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz398161.impl.RefOneImpl#getRefTwo <em>Ref Two</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RefOneImpl extends EObjectImpl implements RefOne {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final long ID_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected long id = ID_EDEFAULT;

	/**
	 * This is true if the Id attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean idESet;

	/**
	 * The cached value of the '{@link #getRefTwo() <em>Ref Two</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefTwo()
	 * @generated
	 * @ordered
	 */
	protected RefTwo refTwo;

	/**
	 * This is true if the Ref Two containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean refTwoESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RefOneImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Bz398161Package.Literals.REF_ONE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(long newId) {
		long oldId = id;
		id = newId;
		boolean oldIdESet = idESet;
		idESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Bz398161Package.REF_ONE__ID, oldId, id, !oldIdESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetId() {
		long oldId = id;
		boolean oldIdESet = idESet;
		id = ID_EDEFAULT;
		idESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Bz398161Package.REF_ONE__ID, oldId, ID_EDEFAULT, oldIdESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetId() {
		return idESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefTwo getRefTwo() {
		return refTwo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRefTwo(RefTwo newRefTwo, NotificationChain msgs) {
		RefTwo oldRefTwo = refTwo;
		refTwo = newRefTwo;
		boolean oldRefTwoESet = refTwoESet;
		refTwoESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Bz398161Package.REF_ONE__REF_TWO, oldRefTwo, newRefTwo, !oldRefTwoESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefTwo(RefTwo newRefTwo) {
		if (newRefTwo != refTwo) {
			NotificationChain msgs = null;
			if (refTwo != null)
				msgs = ((InternalEObject)refTwo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Bz398161Package.REF_ONE__REF_TWO, null, msgs);
			if (newRefTwo != null)
				msgs = ((InternalEObject)newRefTwo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Bz398161Package.REF_ONE__REF_TWO, null, msgs);
			msgs = basicSetRefTwo(newRefTwo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldRefTwoESet = refTwoESet;
			refTwoESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, Bz398161Package.REF_ONE__REF_TWO, newRefTwo, newRefTwo, !oldRefTwoESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetRefTwo(NotificationChain msgs) {
		RefTwo oldRefTwo = refTwo;
		refTwo = null;
		boolean oldRefTwoESet = refTwoESet;
		refTwoESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, Bz398161Package.REF_ONE__REF_TWO, oldRefTwo, null, oldRefTwoESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRefTwo() {
		if (refTwo != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)refTwo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Bz398161Package.REF_ONE__REF_TWO, null, msgs);
			msgs = basicUnsetRefTwo(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldRefTwoESet = refTwoESet;
			refTwoESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, Bz398161Package.REF_ONE__REF_TWO, null, null, oldRefTwoESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRefTwo() {
		return refTwoESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Bz398161Package.REF_ONE__REF_TWO:
				return basicUnsetRefTwo(msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Bz398161Package.REF_ONE__ID:
				return getId();
			case Bz398161Package.REF_ONE__REF_TWO:
				return getRefTwo();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Bz398161Package.REF_ONE__ID:
				setId((Long)newValue);
				return;
			case Bz398161Package.REF_ONE__REF_TWO:
				setRefTwo((RefTwo)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Bz398161Package.REF_ONE__ID:
				unsetId();
				return;
			case Bz398161Package.REF_ONE__REF_TWO:
				unsetRefTwo();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Bz398161Package.REF_ONE__ID:
				return isSetId();
			case Bz398161Package.REF_ONE__REF_TWO:
				return isSetRefTwo();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (id: ");
		if (idESet) result.append(id); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //RefOneImpl

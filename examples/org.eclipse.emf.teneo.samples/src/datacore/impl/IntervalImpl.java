/**
 * <copyright>
 * </copyright>
 *
 * $Id: IntervalImpl.java,v 1.1 2007/03/07 23:34:08 mtaal Exp $
 */
package datacore.impl;

import datacore.CSMValue;
import datacore.DatacorePackage;
import datacore.Interval;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interval</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link datacore.impl.IntervalImpl#getMin <em>Min</em>}</li>
 *   <li>{@link datacore.impl.IntervalImpl#getMax <em>Max</em>}</li>
 *   <li>{@link datacore.impl.IntervalImpl#isIncludeMin <em>Include Min</em>}</li>
 *   <li>{@link datacore.impl.IntervalImpl#isIncludeMax <em>Include Max</em>}</li>
 *   <li>{@link datacore.impl.IntervalImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link datacore.impl.IntervalImpl#getIncrement <em>Increment</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IntervalImpl extends CSMValueSetImpl implements Interval {
	/**
	 * The cached value of the '{@link #getMin() <em>Min</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMin()
	 * @generated
	 * @ordered
	 */
	protected CSMValue min = null;

	/**
	 * The cached value of the '{@link #getMax() <em>Max</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax()
	 * @generated
	 * @ordered
	 */
	protected CSMValue max = null;

	/**
	 * The default value of the '{@link #isIncludeMin() <em>Include Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIncludeMin()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INCLUDE_MIN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIncludeMin() <em>Include Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIncludeMin()
	 * @generated
	 * @ordered
	 */
	protected boolean includeMin = INCLUDE_MIN_EDEFAULT;

	/**
	 * The default value of the '{@link #isIncludeMax() <em>Include Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIncludeMax()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INCLUDE_MAX_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIncludeMax() <em>Include Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIncludeMax()
	 * @generated
	 * @ordered
	 */
	protected boolean includeMax = INCLUDE_MAX_EDEFAULT;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected CSMValue kind = null;

	/**
	 * The cached value of the '{@link #getIncrement() <em>Increment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncrement()
	 * @generated
	 * @ordered
	 */
	protected CSMValue increment = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntervalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatacorePackage.Literals.INTERVAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSMValue getMin() {
		return min;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMin(CSMValue newMin, NotificationChain msgs) {
		CSMValue oldMin = min;
		min = newMin;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DatacorePackage.INTERVAL__MIN, oldMin, newMin);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMin(CSMValue newMin) {
		if (newMin != min) {
			NotificationChain msgs = null;
			if (min != null)
				msgs = ((InternalEObject)min).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DatacorePackage.INTERVAL__MIN, null, msgs);
			if (newMin != null)
				msgs = ((InternalEObject)newMin).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DatacorePackage.INTERVAL__MIN, null, msgs);
			msgs = basicSetMin(newMin, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatacorePackage.INTERVAL__MIN, newMin, newMin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSMValue getMax() {
		return max;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMax(CSMValue newMax, NotificationChain msgs) {
		CSMValue oldMax = max;
		max = newMax;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DatacorePackage.INTERVAL__MAX, oldMax, newMax);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMax(CSMValue newMax) {
		if (newMax != max) {
			NotificationChain msgs = null;
			if (max != null)
				msgs = ((InternalEObject)max).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DatacorePackage.INTERVAL__MAX, null, msgs);
			if (newMax != null)
				msgs = ((InternalEObject)newMax).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DatacorePackage.INTERVAL__MAX, null, msgs);
			msgs = basicSetMax(newMax, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatacorePackage.INTERVAL__MAX, newMax, newMax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIncludeMin() {
		return includeMin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncludeMin(boolean newIncludeMin) {
		boolean oldIncludeMin = includeMin;
		includeMin = newIncludeMin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatacorePackage.INTERVAL__INCLUDE_MIN, oldIncludeMin, includeMin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIncludeMax() {
		return includeMax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncludeMax(boolean newIncludeMax) {
		boolean oldIncludeMax = includeMax;
		includeMax = newIncludeMax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatacorePackage.INTERVAL__INCLUDE_MAX, oldIncludeMax, includeMax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSMValue getKind() {
		if (kind != null && kind.eIsProxy()) {
			InternalEObject oldKind = (InternalEObject)kind;
			kind = (CSMValue)eResolveProxy(oldKind);
			if (kind != oldKind) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DatacorePackage.INTERVAL__KIND, oldKind, kind));
			}
		}
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSMValue basicGetKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(CSMValue newKind) {
		CSMValue oldKind = kind;
		kind = newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatacorePackage.INTERVAL__KIND, oldKind, kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSMValue getIncrement() {
		return increment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIncrement(CSMValue newIncrement, NotificationChain msgs) {
		CSMValue oldIncrement = increment;
		increment = newIncrement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DatacorePackage.INTERVAL__INCREMENT, oldIncrement, newIncrement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncrement(CSMValue newIncrement) {
		if (newIncrement != increment) {
			NotificationChain msgs = null;
			if (increment != null)
				msgs = ((InternalEObject)increment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DatacorePackage.INTERVAL__INCREMENT, null, msgs);
			if (newIncrement != null)
				msgs = ((InternalEObject)newIncrement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DatacorePackage.INTERVAL__INCREMENT, null, msgs);
			msgs = basicSetIncrement(newIncrement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatacorePackage.INTERVAL__INCREMENT, newIncrement, newIncrement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DatacorePackage.INTERVAL__MIN:
				return basicSetMin(null, msgs);
			case DatacorePackage.INTERVAL__MAX:
				return basicSetMax(null, msgs);
			case DatacorePackage.INTERVAL__INCREMENT:
				return basicSetIncrement(null, msgs);
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
			case DatacorePackage.INTERVAL__MIN:
				return getMin();
			case DatacorePackage.INTERVAL__MAX:
				return getMax();
			case DatacorePackage.INTERVAL__INCLUDE_MIN:
				return isIncludeMin() ? Boolean.TRUE : Boolean.FALSE;
			case DatacorePackage.INTERVAL__INCLUDE_MAX:
				return isIncludeMax() ? Boolean.TRUE : Boolean.FALSE;
			case DatacorePackage.INTERVAL__KIND:
				if (resolve) return getKind();
				return basicGetKind();
			case DatacorePackage.INTERVAL__INCREMENT:
				return getIncrement();
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
			case DatacorePackage.INTERVAL__MIN:
				setMin((CSMValue)newValue);
				return;
			case DatacorePackage.INTERVAL__MAX:
				setMax((CSMValue)newValue);
				return;
			case DatacorePackage.INTERVAL__INCLUDE_MIN:
				setIncludeMin(((Boolean)newValue).booleanValue());
				return;
			case DatacorePackage.INTERVAL__INCLUDE_MAX:
				setIncludeMax(((Boolean)newValue).booleanValue());
				return;
			case DatacorePackage.INTERVAL__KIND:
				setKind((CSMValue)newValue);
				return;
			case DatacorePackage.INTERVAL__INCREMENT:
				setIncrement((CSMValue)newValue);
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
			case DatacorePackage.INTERVAL__MIN:
				setMin((CSMValue)null);
				return;
			case DatacorePackage.INTERVAL__MAX:
				setMax((CSMValue)null);
				return;
			case DatacorePackage.INTERVAL__INCLUDE_MIN:
				setIncludeMin(INCLUDE_MIN_EDEFAULT);
				return;
			case DatacorePackage.INTERVAL__INCLUDE_MAX:
				setIncludeMax(INCLUDE_MAX_EDEFAULT);
				return;
			case DatacorePackage.INTERVAL__KIND:
				setKind((CSMValue)null);
				return;
			case DatacorePackage.INTERVAL__INCREMENT:
				setIncrement((CSMValue)null);
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
			case DatacorePackage.INTERVAL__MIN:
				return min != null;
			case DatacorePackage.INTERVAL__MAX:
				return max != null;
			case DatacorePackage.INTERVAL__INCLUDE_MIN:
				return includeMin != INCLUDE_MIN_EDEFAULT;
			case DatacorePackage.INTERVAL__INCLUDE_MAX:
				return includeMax != INCLUDE_MAX_EDEFAULT;
			case DatacorePackage.INTERVAL__KIND:
				return kind != null;
			case DatacorePackage.INTERVAL__INCREMENT:
				return increment != null;
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
		result.append(" (includeMin: ");
		result.append(includeMin);
		result.append(", includeMax: ");
		result.append(includeMax);
		result.append(')');
		return result.toString();
	}

} //IntervalImpl

/**
 * <copyright>
 * </copyright>
 *
 * $Id: AImpl.java,v 1.1 2006/07/11 16:56:56 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.schemaconstructs.anytype.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.teneo.samples.emf.schemaconstructs.anytype.A;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.anytype.AnytypePackage;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.anytype.B;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>A</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.anytype.impl.AImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.anytype.impl.AImpl#getDoub <em>Doub</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.anytype.impl.AImpl#getLon <em>Lon</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.anytype.impl.AImpl#getMyB <em>My B</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AImpl extends EObjectImpl implements A {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

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
	 * The default value of the '{@link #getDoub() <em>Doub</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoub()
	 * @generated
	 * @ordered
	 */
	protected static final double DOUB_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getDoub() <em>Doub</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoub()
	 * @generated
	 * @ordered
	 */
	protected double doub = DOUB_EDEFAULT;

	/**
	 * This is true if the Doub attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean doubESet = false;

	/**
	 * The default value of the '{@link #getLon() <em>Lon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLon()
	 * @generated
	 * @ordered
	 */
	protected static final long LON_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getLon() <em>Lon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLon()
	 * @generated
	 * @ordered
	 */
	protected long lon = LON_EDEFAULT;

	/**
	 * This is true if the Lon attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean lonESet = false;

	/**
	 * The cached value of the '{@link #getMyB() <em>My B</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMyB()
	 * @generated
	 * @ordered
	 */
	protected B myB = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return AnytypePackage.eINSTANCE.getA();
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
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnytypePackage.A__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getDoub() {
		return doub;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDoub(double newDoub) {
		double oldDoub = doub;
		doub = newDoub;
		boolean oldDoubESet = doubESet;
		doubESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnytypePackage.A__DOUB, oldDoub, doub, !oldDoubESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDoub() {
		double oldDoub = doub;
		boolean oldDoubESet = doubESet;
		doub = DOUB_EDEFAULT;
		doubESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AnytypePackage.A__DOUB, oldDoub, DOUB_EDEFAULT, oldDoubESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDoub() {
		return doubESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getLon() {
		return lon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLon(long newLon) {
		long oldLon = lon;
		lon = newLon;
		boolean oldLonESet = lonESet;
		lonESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnytypePackage.A__LON, oldLon, lon, !oldLonESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLon() {
		long oldLon = lon;
		boolean oldLonESet = lonESet;
		lon = LON_EDEFAULT;
		lonESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AnytypePackage.A__LON, oldLon, LON_EDEFAULT, oldLonESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLon() {
		return lonESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public B getMyB() {
		return myB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMyB(B newMyB) {
		B oldMyB = myB;
		myB = newMyB;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnytypePackage.A__MY_B, oldMyB, myB));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case AnytypePackage.A__NAME:
				return getName();
			case AnytypePackage.A__DOUB:
				return new Double(getDoub());
			case AnytypePackage.A__LON:
				return new Long(getLon());
			case AnytypePackage.A__MY_B:
				return getMyB();
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
			case AnytypePackage.A__NAME:
				setName((String)newValue);
				return;
			case AnytypePackage.A__DOUB:
				setDoub(((Double)newValue).doubleValue());
				return;
			case AnytypePackage.A__LON:
				setLon(((Long)newValue).longValue());
				return;
			case AnytypePackage.A__MY_B:
				setMyB((B)newValue);
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
			case AnytypePackage.A__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AnytypePackage.A__DOUB:
				unsetDoub();
				return;
			case AnytypePackage.A__LON:
				unsetLon();
				return;
			case AnytypePackage.A__MY_B:
				setMyB((B)null);
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
			case AnytypePackage.A__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AnytypePackage.A__DOUB:
				return isSetDoub();
			case AnytypePackage.A__LON:
				return isSetLon();
			case AnytypePackage.A__MY_B:
				return myB != null;
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
		result.append(name);
		result.append(", doub: ");
		if (doubESet) result.append(doub); else result.append("<unset>");
		result.append(", lon: ");
		if (lonESet) result.append(lon); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //AImpl

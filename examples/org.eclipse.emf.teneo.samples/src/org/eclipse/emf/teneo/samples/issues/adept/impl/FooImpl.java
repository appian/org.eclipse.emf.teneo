/**
 * <copyright>
 * </copyright>
 *
 * $Id: FooImpl.java,v 1.1.2.1 2009/05/23 13:09:17 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.adept.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.emf.teneo.samples.issues.adept.Bar;
import org.eclipse.emf.teneo.samples.issues.adept.Biff;
import org.eclipse.emf.teneo.samples.issues.adept.Bz277570Package;
import org.eclipse.emf.teneo.samples.issues.adept.Foo;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Foo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.adept.impl.FooImpl#getBars <em>Bars</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.adept.impl.FooImpl#getBiffs <em>Biffs</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.adept.impl.FooImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FooImpl extends EObjectImpl implements Foo {
	/**
	 * The cached value of the '{@link #getBars() <em>Bars</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBars()
	 * @generated
	 * @ordered
	 */
	protected EList<Bar> bars;

	/**
	 * The cached value of the '{@link #getBiffs() <em>Biffs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBiffs()
	 * @generated
	 * @ordered
	 */
	protected EList<Biff> biffs;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FooImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Bz277570Package.Literals.FOO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Bar> getBars() {
		if (bars == null) {
			bars = new EObjectContainmentEList<Bar>(Bar.class, this, Bz277570Package.FOO__BARS);
		}
		return bars;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Biff> getBiffs() {
		if (biffs == null) {
			biffs = new EObjectContainmentEList<Biff>(Biff.class, this, Bz277570Package.FOO__BIFFS);
		}
		return biffs;
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
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Bz277570Package.FOO__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Bz277570Package.FOO__BARS:
				return ((InternalEList<?>)getBars()).basicRemove(otherEnd, msgs);
			case Bz277570Package.FOO__BIFFS:
				return ((InternalEList<?>)getBiffs()).basicRemove(otherEnd, msgs);
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
			case Bz277570Package.FOO__BARS:
				return getBars();
			case Bz277570Package.FOO__BIFFS:
				return getBiffs();
			case Bz277570Package.FOO__ID:
				return getId();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Bz277570Package.FOO__BARS:
				getBars().clear();
				getBars().addAll((Collection<? extends Bar>)newValue);
				return;
			case Bz277570Package.FOO__BIFFS:
				getBiffs().clear();
				getBiffs().addAll((Collection<? extends Biff>)newValue);
				return;
			case Bz277570Package.FOO__ID:
				setId((Long)newValue);
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
			case Bz277570Package.FOO__BARS:
				getBars().clear();
				return;
			case Bz277570Package.FOO__BIFFS:
				getBiffs().clear();
				return;
			case Bz277570Package.FOO__ID:
				setId(ID_EDEFAULT);
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
			case Bz277570Package.FOO__BARS:
				return bars != null && !bars.isEmpty();
			case Bz277570Package.FOO__BIFFS:
				return biffs != null && !biffs.isEmpty();
			case Bz277570Package.FOO__ID:
				return id != ID_EDEFAULT;
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
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //FooImpl

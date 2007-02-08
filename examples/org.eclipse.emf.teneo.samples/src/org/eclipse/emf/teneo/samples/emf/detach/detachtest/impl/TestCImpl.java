/**
 * <copyright>
 * </copyright>
 *
 * $Id: TestCImpl.java,v 1.2 2007/02/08 23:09:23 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.detach.detachtest.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.emf.teneo.samples.emf.detach.detachtest.DetachtestPackage;
import org.eclipse.emf.teneo.samples.emf.detach.detachtest.TestB;
import org.eclipse.emf.teneo.samples.emf.detach.detachtest.TestC;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Test C</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.detach.detachtest.impl.TestCImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.detach.detachtest.impl.TestCImpl#getMyDate <em>My Date</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.detach.detachtest.impl.TestCImpl#getTestB <em>Test B</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TestCImpl extends EObjectImpl implements TestC {
	/**
	 * The default value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected String code = CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMyDate() <em>My Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMyDate()
	 * @generated
	 * @ordered
	 */
	protected static final Object MY_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMyDate() <em>My Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMyDate()
	 * @generated
	 * @ordered
	 */
	protected Object myDate = MY_DATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTestB() <em>Test B</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestB()
	 * @generated
	 * @ordered
	 */
	protected EList<TestB> testB = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestCImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DetachtestPackage.Literals.TEST_C;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCode(String newCode) {
		String oldCode = code;
		code = newCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DetachtestPackage.TEST_C__CODE, oldCode, code));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getMyDate() {
		return myDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMyDate(Object newMyDate) {
		Object oldMyDate = myDate;
		myDate = newMyDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DetachtestPackage.TEST_C__MY_DATE, oldMyDate, myDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TestB> getTestB() {
		if (testB == null) {
			testB = new EObjectContainmentEList<TestB>(TestB.class, this, DetachtestPackage.TEST_C__TEST_B);
		}
		return testB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DetachtestPackage.TEST_C__TEST_B:
				return ((InternalEList<?>)getTestB()).basicRemove(otherEnd, msgs);
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
			case DetachtestPackage.TEST_C__CODE:
				return getCode();
			case DetachtestPackage.TEST_C__MY_DATE:
				return getMyDate();
			case DetachtestPackage.TEST_C__TEST_B:
				return getTestB();
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
			case DetachtestPackage.TEST_C__CODE:
				setCode((String)newValue);
				return;
			case DetachtestPackage.TEST_C__MY_DATE:
				setMyDate(newValue);
				return;
			case DetachtestPackage.TEST_C__TEST_B:
				getTestB().clear();
				getTestB().addAll((Collection<? extends TestB>)newValue);
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
			case DetachtestPackage.TEST_C__CODE:
				setCode(CODE_EDEFAULT);
				return;
			case DetachtestPackage.TEST_C__MY_DATE:
				setMyDate(MY_DATE_EDEFAULT);
				return;
			case DetachtestPackage.TEST_C__TEST_B:
				getTestB().clear();
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
			case DetachtestPackage.TEST_C__CODE:
				return CODE_EDEFAULT == null ? code != null : !CODE_EDEFAULT.equals(code);
			case DetachtestPackage.TEST_C__MY_DATE:
				return MY_DATE_EDEFAULT == null ? myDate != null : !MY_DATE_EDEFAULT.equals(myDate);
			case DetachtestPackage.TEST_C__TEST_B:
				return testB != null && !testB.isEmpty();
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
		result.append(" (code: ");
		result.append(code);
		result.append(", myDate: ");
		result.append(myDate);
		result.append(')');
		return result.toString();
	}

} //TestCImpl

/**
 * <copyright>
 * </copyright>
 *
 * $Id: TestAImpl.java,v 1.3 2007/07/04 19:29:56 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.detach.detachtest.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.teneo.samples.emf.detach.detachtest.DetachtestPackage;
import org.eclipse.emf.teneo.samples.emf.detach.detachtest.TestA;
import org.eclipse.emf.teneo.samples.emf.detach.detachtest.TestB;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Test A</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.detach.detachtest.impl.TestAImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.detach.detachtest.impl.TestAImpl#getTestB <em>Test B</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TestAImpl extends EObjectImpl implements TestA {
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
	 * The cached value of the '{@link #getTestB() <em>Test B</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestB()
	 * @generated
	 * @ordered
	 */
	protected EObject testB;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestAImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DetachtestPackage.Literals.TEST_A;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DetachtestPackage.TEST_A__CODE, oldCode, code));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getTestB() {
		return testB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTestB(EObject newTestB) {
		EObject oldTestB = testB;
		testB = newTestB;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DetachtestPackage.TEST_A__TEST_B, oldTestB, testB));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DetachtestPackage.TEST_A__CODE:
				return getCode();
			case DetachtestPackage.TEST_A__TEST_B:
				return getTestB();
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
			case DetachtestPackage.TEST_A__CODE:
				setCode((String)newValue);
				return;
			case DetachtestPackage.TEST_A__TEST_B:
				setTestB((EObject)newValue);
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
			case DetachtestPackage.TEST_A__CODE:
				setCode(CODE_EDEFAULT);
				return;
			case DetachtestPackage.TEST_A__TEST_B:
				setTestB((EObject)null);
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
			case DetachtestPackage.TEST_A__CODE:
				return CODE_EDEFAULT == null ? code != null : !CODE_EDEFAULT.equals(code);
			case DetachtestPackage.TEST_A__TEST_B:
				return testB != null;
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
		result.append(')');
		return result.toString();
	}

} //TestAImpl

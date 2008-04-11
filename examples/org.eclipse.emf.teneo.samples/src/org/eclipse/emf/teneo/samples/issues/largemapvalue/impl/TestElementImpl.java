/**
 * <copyright>
 * </copyright>
 *
 * $Id: TestElementImpl.java,v 1.1 2008/04/11 03:21:47 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.largemapvalue.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.emf.teneo.samples.issues.largemapvalue.LargemapvaluePackage;
import org.eclipse.emf.teneo.samples.issues.largemapvalue.TestElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Test Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.largemapvalue.impl.TestElementImpl#getTestMap <em>Test Map</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.largemapvalue.impl.TestElementImpl#getTestProp <em>Test Prop</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TestElementImpl extends EObjectImpl implements TestElement {
	/**
	 * The cached value of the '{@link #getTestMap() <em>Test Map</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestMap()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> testMap;

	/**
	 * The default value of the '{@link #getTestProp() <em>Test Prop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestProp()
	 * @generated
	 * @ordered
	 */
	protected static final String TEST_PROP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTestProp() <em>Test Prop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestProp()
	 * @generated
	 * @ordered
	 */
	protected String testProp = TEST_PROP_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LargemapvaluePackage.Literals.TEST_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getTestMap() {
		if (testMap == null) {
			testMap = new EcoreEMap<String,String>(LargemapvaluePackage.Literals.STRING_TO_STRING_MAP, StringToStringMapImpl.class, this, LargemapvaluePackage.TEST_ELEMENT__TEST_MAP);
		}
		return testMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTestProp() {
		return testProp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTestProp(String newTestProp) {
		String oldTestProp = testProp;
		testProp = newTestProp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LargemapvaluePackage.TEST_ELEMENT__TEST_PROP, oldTestProp, testProp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LargemapvaluePackage.TEST_ELEMENT__TEST_MAP:
				return ((InternalEList<?>)getTestMap()).basicRemove(otherEnd, msgs);
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
			case LargemapvaluePackage.TEST_ELEMENT__TEST_MAP:
				if (coreType) return getTestMap();
				else return getTestMap().map();
			case LargemapvaluePackage.TEST_ELEMENT__TEST_PROP:
				return getTestProp();
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
			case LargemapvaluePackage.TEST_ELEMENT__TEST_MAP:
				((EStructuralFeature.Setting)getTestMap()).set(newValue);
				return;
			case LargemapvaluePackage.TEST_ELEMENT__TEST_PROP:
				setTestProp((String)newValue);
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
			case LargemapvaluePackage.TEST_ELEMENT__TEST_MAP:
				getTestMap().clear();
				return;
			case LargemapvaluePackage.TEST_ELEMENT__TEST_PROP:
				setTestProp(TEST_PROP_EDEFAULT);
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
			case LargemapvaluePackage.TEST_ELEMENT__TEST_MAP:
				return testMap != null && !testMap.isEmpty();
			case LargemapvaluePackage.TEST_ELEMENT__TEST_PROP:
				return TEST_PROP_EDEFAULT == null ? testProp != null : !TEST_PROP_EDEFAULT.equals(testProp);
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
		result.append(" (testProp: ");
		result.append(testProp);
		result.append(')');
		return result.toString();
	}

} //TestElementImpl

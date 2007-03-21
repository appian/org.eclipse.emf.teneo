/**
 * <copyright>
 * </copyright>
 *
 * $Id: ParentTwoImpl.java,v 1.1.2.2 2007/03/21 16:09:27 mtaal Exp $
 */
package testinheritance.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import testinheritance.ParentTwo;
import testinheritance.TestinheritancePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parent Two</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link testinheritance.impl.ParentTwoImpl#getTestId <em>Test Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParentTwoImpl extends EObjectImpl implements ParentTwo {
	/**
	 * The default value of the '{@link #getTestId() <em>Test Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestId()
	 * @generated
	 * @ordered
	 */
	protected static final long TEST_ID_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getTestId() <em>Test Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestId()
	 * @generated
	 * @ordered
	 */
	protected long testId = TEST_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParentTwoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return TestinheritancePackage.Literals.PARENT_TWO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getTestId() {
		return testId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTestId(long newTestId) {
		long oldTestId = testId;
		testId = newTestId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestinheritancePackage.PARENT_TWO__TEST_ID, oldTestId, testId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TestinheritancePackage.PARENT_TWO__TEST_ID:
				return new Long(getTestId());
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TestinheritancePackage.PARENT_TWO__TEST_ID:
				setTestId(((Long)newValue).longValue());
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case TestinheritancePackage.PARENT_TWO__TEST_ID:
				setTestId(TEST_ID_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TestinheritancePackage.PARENT_TWO__TEST_ID:
				return testId != TEST_ID_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (testId: ");
		result.append(testId);
		result.append(')');
		return result.toString();
	}

} //ParentTwoImpl
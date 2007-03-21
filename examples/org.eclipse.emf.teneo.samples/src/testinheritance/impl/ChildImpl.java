/**
 * <copyright>
 * </copyright>
 *
 * $Id: ChildImpl.java,v 1.1.2.2 2007/03/21 16:09:27 mtaal Exp $
 */
package testinheritance.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import testinheritance.Child;
import testinheritance.ParentTwo;
import testinheritance.TestinheritancePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Child</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link testinheritance.impl.ChildImpl#getTestId <em>Test Id</em>}</li>
 *   <li>{@link testinheritance.impl.ChildImpl#getAge <em>Age</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ChildImpl extends ParentZeroImpl implements Child {
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
	 * The default value of the '{@link #getAge() <em>Age</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAge()
	 * @generated
	 * @ordered
	 */
	protected static final long AGE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getAge() <em>Age</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAge()
	 * @generated
	 * @ordered
	 */
	protected long age = AGE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChildImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return TestinheritancePackage.Literals.CHILD;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TestinheritancePackage.CHILD__TEST_ID, oldTestId, testId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getAge() {
		return age;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAge(long newAge) {
		long oldAge = age;
		age = newAge;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestinheritancePackage.CHILD__AGE, oldAge, age));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TestinheritancePackage.CHILD__TEST_ID:
				return new Long(getTestId());
			case TestinheritancePackage.CHILD__AGE:
				return new Long(getAge());
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
			case TestinheritancePackage.CHILD__TEST_ID:
				setTestId(((Long)newValue).longValue());
				return;
			case TestinheritancePackage.CHILD__AGE:
				setAge(((Long)newValue).longValue());
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
			case TestinheritancePackage.CHILD__TEST_ID:
				setTestId(TEST_ID_EDEFAULT);
				return;
			case TestinheritancePackage.CHILD__AGE:
				setAge(AGE_EDEFAULT);
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
			case TestinheritancePackage.CHILD__TEST_ID:
				return testId != TEST_ID_EDEFAULT;
			case TestinheritancePackage.CHILD__AGE:
				return age != AGE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class baseClass) {
		if (baseClass == ParentTwo.class) {
			switch (derivedFeatureID) {
				case TestinheritancePackage.CHILD__TEST_ID: return TestinheritancePackage.PARENT_TWO__TEST_ID;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class baseClass) {
		if (baseClass == ParentTwo.class) {
			switch (baseFeatureID) {
				case TestinheritancePackage.PARENT_TWO__TEST_ID: return TestinheritancePackage.CHILD__TEST_ID;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(", age: ");
		result.append(age);
		result.append(')');
		return result.toString();
	}

} //ChildImpl
/**
 * <copyright>
 * </copyright>
 *
 * $Id: SomeBaseClassImpl.java,v 1.1 2007/03/18 22:28:33 mtaal Exp $
 */
package testinheritance.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import testinheritance.SomeBaseClass;
import testinheritance.TestinheritancePackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Some Base Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link testinheritance.impl.SomeBaseClassImpl#getAnotherProperty <em>Another Property</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class SomeBaseClassImpl extends EObjectImpl implements SomeBaseClass {
	/**
	 * The default value of the '{@link #getAnotherProperty() <em>Another Property</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getAnotherProperty()
	 * @generated
	 * @ordered
	 */
	protected static final long ANOTHER_PROPERTY_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getAnotherProperty() <em>Another Property</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getAnotherProperty()
	 * @generated
	 * @ordered
	 */
	protected long anotherProperty = ANOTHER_PROPERTY_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected SomeBaseClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TestinheritancePackage.Literals.SOME_BASE_CLASS;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public long getAnotherProperty() {
		return anotherProperty;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setAnotherProperty(long newAnotherProperty) {
		long oldAnotherProperty = anotherProperty;
		anotherProperty = newAnotherProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TestinheritancePackage.SOME_BASE_CLASS__ANOTHER_PROPERTY, oldAnotherProperty,
					anotherProperty));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TestinheritancePackage.SOME_BASE_CLASS__ANOTHER_PROPERTY:
			return new Long(getAnotherProperty());
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case TestinheritancePackage.SOME_BASE_CLASS__ANOTHER_PROPERTY:
			setAnotherProperty(((Long) newValue).longValue());
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case TestinheritancePackage.SOME_BASE_CLASS__ANOTHER_PROPERTY:
			setAnotherProperty(ANOTHER_PROPERTY_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case TestinheritancePackage.SOME_BASE_CLASS__ANOTHER_PROPERTY:
			return anotherProperty != ANOTHER_PROPERTY_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (anotherProperty: ");
		result.append(anotherProperty);
		result.append(')');
		return result.toString();
	}

} // SomeBaseClassImpl

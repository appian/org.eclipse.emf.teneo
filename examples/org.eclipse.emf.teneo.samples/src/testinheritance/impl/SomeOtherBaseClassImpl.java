/**
 * <copyright>
 * </copyright>
 *
 * $Id: SomeOtherBaseClassImpl.java,v 1.2 2007/07/09 12:55:19 mtaal Exp $
 */
package testinheritance.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import testinheritance.NameValuePair;
import testinheritance.SomeOtherBaseClass;
import testinheritance.TestinheritancePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Some Other Base Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link testinheritance.impl.SomeOtherBaseClassImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link testinheritance.impl.SomeOtherBaseClassImpl#getNameValuePairs <em>Name Value Pairs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SomeOtherBaseClassImpl extends EObjectImpl implements SomeOtherBaseClass {
	/**
	 * The default value of the '{@link #getProperty() <em>Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperty()
	 * @generated
	 * @ordered
	 */
	protected static final String PROPERTY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProperty() <em>Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperty()
	 * @generated
	 * @ordered
	 */
	protected String property = PROPERTY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNameValuePairs() <em>Name Value Pairs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameValuePairs()
	 * @generated
	 * @ordered
	 */
	protected EList<NameValuePair> nameValuePairs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SomeOtherBaseClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TestinheritancePackage.Literals.SOME_OTHER_BASE_CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProperty() {
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProperty(String newProperty) {
		String oldProperty = property;
		property = newProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestinheritancePackage.SOME_OTHER_BASE_CLASS__PROPERTY, oldProperty, property));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NameValuePair> getNameValuePairs() {
		if (nameValuePairs == null) {
			nameValuePairs = new EObjectResolvingEList<NameValuePair>(NameValuePair.class, this, TestinheritancePackage.SOME_OTHER_BASE_CLASS__NAME_VALUE_PAIRS);
		}
		return nameValuePairs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TestinheritancePackage.SOME_OTHER_BASE_CLASS__PROPERTY:
				return getProperty();
			case TestinheritancePackage.SOME_OTHER_BASE_CLASS__NAME_VALUE_PAIRS:
				return getNameValuePairs();
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
			case TestinheritancePackage.SOME_OTHER_BASE_CLASS__PROPERTY:
				setProperty((String)newValue);
				return;
			case TestinheritancePackage.SOME_OTHER_BASE_CLASS__NAME_VALUE_PAIRS:
				getNameValuePairs().clear();
				getNameValuePairs().addAll((Collection<? extends NameValuePair>)newValue);
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
			case TestinheritancePackage.SOME_OTHER_BASE_CLASS__PROPERTY:
				setProperty(PROPERTY_EDEFAULT);
				return;
			case TestinheritancePackage.SOME_OTHER_BASE_CLASS__NAME_VALUE_PAIRS:
				getNameValuePairs().clear();
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
			case TestinheritancePackage.SOME_OTHER_BASE_CLASS__PROPERTY:
				return PROPERTY_EDEFAULT == null ? property != null : !PROPERTY_EDEFAULT.equals(property);
			case TestinheritancePackage.SOME_OTHER_BASE_CLASS__NAME_VALUE_PAIRS:
				return nameValuePairs != null && !nameValuePairs.isEmpty();
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
		result.append(" (property: ");
		result.append(property);
		result.append(')');
		return result.toString();
	}

} //SomeOtherBaseClassImpl

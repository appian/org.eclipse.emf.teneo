/**
 * <copyright>
 * </copyright>
 *
 * $Id: SomeResourceImpl.java,v 1.1 2007/03/18 22:28:33 mtaal Exp $
 */
package testinheritance.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import testinheritance.SomeBaseClass;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import testinheritance.NameValuePair;
import testinheritance.SomeOtherBaseClass;
import testinheritance.SomeResource;
import testinheritance.TestinheritancePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Some Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link testinheritance.impl.SomeResourceImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link testinheritance.impl.SomeResourceImpl#getNameValuePairs <em>Name Value Pairs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SomeResourceImpl extends SomeBaseClassImpl implements SomeResource {
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
	protected EList<NameValuePair> nameValuePairs = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SomeResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TestinheritancePackage.Literals.SOME_RESOURCE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TestinheritancePackage.SOME_RESOURCE__PROPERTY, oldProperty, property));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NameValuePair> getNameValuePairs() {
		if (nameValuePairs == null) {
			nameValuePairs = new EObjectResolvingEList<NameValuePair>(NameValuePair.class, this, TestinheritancePackage.SOME_RESOURCE__NAME_VALUE_PAIRS);
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
			case TestinheritancePackage.SOME_RESOURCE__PROPERTY:
				return getProperty();
			case TestinheritancePackage.SOME_RESOURCE__NAME_VALUE_PAIRS:
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
			case TestinheritancePackage.SOME_RESOURCE__PROPERTY:
				setProperty((String)newValue);
				return;
			case TestinheritancePackage.SOME_RESOURCE__NAME_VALUE_PAIRS:
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
			case TestinheritancePackage.SOME_RESOURCE__PROPERTY:
				setProperty(PROPERTY_EDEFAULT);
				return;
			case TestinheritancePackage.SOME_RESOURCE__NAME_VALUE_PAIRS:
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
			case TestinheritancePackage.SOME_RESOURCE__PROPERTY:
				return PROPERTY_EDEFAULT == null ? property != null : !PROPERTY_EDEFAULT.equals(property);
			case TestinheritancePackage.SOME_RESOURCE__NAME_VALUE_PAIRS:
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
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == SomeOtherBaseClass.class) {
			switch (derivedFeatureID) {
				case TestinheritancePackage.SOME_RESOURCE__PROPERTY: return TestinheritancePackage.SOME_OTHER_BASE_CLASS__PROPERTY;
				case TestinheritancePackage.SOME_RESOURCE__NAME_VALUE_PAIRS: return TestinheritancePackage.SOME_OTHER_BASE_CLASS__NAME_VALUE_PAIRS;
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
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == SomeOtherBaseClass.class) {
			switch (baseFeatureID) {
				case TestinheritancePackage.SOME_OTHER_BASE_CLASS__PROPERTY: return TestinheritancePackage.SOME_RESOURCE__PROPERTY;
				case TestinheritancePackage.SOME_OTHER_BASE_CLASS__NAME_VALUE_PAIRS: return TestinheritancePackage.SOME_RESOURCE__NAME_VALUE_PAIRS;
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
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (property: ");
		result.append(property);
		result.append(')');
		return result.toString();
	}

} //SomeResourceImpl

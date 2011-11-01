/**
 * <copyright>
 * </copyright>
 *
 * $Id: Test.java,v 1.1 2010/04/22 17:57:47 mtaal Exp $
 */
package org.eclipse.emf.teneo.eclipselink.examples.suppressinterfaces;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.eclipselink.examples.suppressinterfaces.Test#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.eclipselink.examples.suppressinterfaces.Test#getTestEmbedded <em>Test Embedded</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.eclipselink.examples.suppressinterfaces.SuppressinterfacesPackage#getTest()
 * @model kind="class"
 * @generated
 */
public class Test extends Identifiable {
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
	 * The cached value of the '{@link #getTestEmbedded() <em>Test Embedded</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestEmbedded()
	 * @generated
	 * @ordered
	 */
	protected TestEmbedded testEmbedded;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Test() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SuppressinterfacesPackage.Literals.TEST;
	}

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.emf.teneo.eclipselink.examples.suppressinterfaces.SuppressinterfacesPackage#getTest_Name()
	 * @model
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.eclipselink.examples.suppressinterfaces.Test#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SuppressinterfacesPackage.TEST__NAME, oldName, name));
	}

	/**
	 * Returns the value of the '<em><b>Test Embedded</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Test Embedded</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Embedded</em>' reference.
	 * @see #setTestEmbedded(TestEmbedded)
	 * @see org.eclipse.emf.teneo.eclipselink.examples.suppressinterfaces.SuppressinterfacesPackage#getTest_TestEmbedded()
	 * @model annotation="teneo.jpa value='@Embedded'"
	 * @generated
	 */
	public TestEmbedded getTestEmbedded() {
		if (testEmbedded != null && testEmbedded.eIsProxy()) {
			InternalEObject oldTestEmbedded = (InternalEObject)testEmbedded;
			testEmbedded = (TestEmbedded)eResolveProxy(oldTestEmbedded);
			if (testEmbedded != oldTestEmbedded) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SuppressinterfacesPackage.TEST__TEST_EMBEDDED, oldTestEmbedded, testEmbedded));
			}
		}
		return testEmbedded;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestEmbedded basicGetTestEmbedded() {
		return testEmbedded;
	}

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.eclipselink.examples.suppressinterfaces.Test#getTestEmbedded <em>Test Embedded</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Test Embedded</em>' reference.
	 * @see #getTestEmbedded()
	 * @generated
	 */
	public void setTestEmbedded(TestEmbedded newTestEmbedded) {
		TestEmbedded oldTestEmbedded = testEmbedded;
		testEmbedded = newTestEmbedded;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SuppressinterfacesPackage.TEST__TEST_EMBEDDED, oldTestEmbedded, testEmbedded));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SuppressinterfacesPackage.TEST__NAME:
				return getName();
			case SuppressinterfacesPackage.TEST__TEST_EMBEDDED:
				if (resolve) return getTestEmbedded();
				return basicGetTestEmbedded();
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
			case SuppressinterfacesPackage.TEST__NAME:
				setName((String)newValue);
				return;
			case SuppressinterfacesPackage.TEST__TEST_EMBEDDED:
				setTestEmbedded((TestEmbedded)newValue);
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
			case SuppressinterfacesPackage.TEST__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SuppressinterfacesPackage.TEST__TEST_EMBEDDED:
				setTestEmbedded((TestEmbedded)null);
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
			case SuppressinterfacesPackage.TEST__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SuppressinterfacesPackage.TEST__TEST_EMBEDDED:
				return testEmbedded != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} // Test

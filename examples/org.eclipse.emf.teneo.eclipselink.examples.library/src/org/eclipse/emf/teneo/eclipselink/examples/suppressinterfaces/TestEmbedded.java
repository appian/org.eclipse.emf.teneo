/**
 * <copyright>
 * </copyright>
 *
 * $Id: TestEmbedded.java,v 1.1 2010/04/22 17:57:47 mtaal Exp $
 */
package org.eclipse.emf.teneo.eclipselink.examples.suppressinterfaces;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Embedded</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.eclipselink.examples.suppressinterfaces.TestEmbedded#getNameEmbedded <em>Name Embedded</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.eclipselink.examples.suppressinterfaces.SuppressinterfacesPackage#getTestEmbedded()
 * @model kind="class"
 *        annotation="teneo.jpa value='@Embeddable'"
 * @generated
 */
public class TestEmbedded extends EObjectImpl implements EObject {
	/**
	 * The default value of the '{@link #getNameEmbedded() <em>Name Embedded</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameEmbedded()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EMBEDDED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNameEmbedded() <em>Name Embedded</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameEmbedded()
	 * @generated
	 * @ordered
	 */
	protected String nameEmbedded = NAME_EMBEDDED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestEmbedded() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SuppressinterfacesPackage.Literals.TEST_EMBEDDED;
	}

	/**
	 * Returns the value of the '<em><b>Name Embedded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name Embedded</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name Embedded</em>' attribute.
	 * @see #setNameEmbedded(String)
	 * @see org.eclipse.emf.teneo.eclipselink.examples.suppressinterfaces.SuppressinterfacesPackage#getTestEmbedded_NameEmbedded()
	 * @model
	 * @generated
	 */
	public String getNameEmbedded() {
		return nameEmbedded;
	}

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.eclipselink.examples.suppressinterfaces.TestEmbedded#getNameEmbedded <em>Name Embedded</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Embedded</em>' attribute.
	 * @see #getNameEmbedded()
	 * @generated
	 */
	public void setNameEmbedded(String newNameEmbedded) {
		String oldNameEmbedded = nameEmbedded;
		nameEmbedded = newNameEmbedded;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SuppressinterfacesPackage.TEST_EMBEDDED__NAME_EMBEDDED, oldNameEmbedded, nameEmbedded));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SuppressinterfacesPackage.TEST_EMBEDDED__NAME_EMBEDDED:
				return getNameEmbedded();
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
			case SuppressinterfacesPackage.TEST_EMBEDDED__NAME_EMBEDDED:
				setNameEmbedded((String)newValue);
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
			case SuppressinterfacesPackage.TEST_EMBEDDED__NAME_EMBEDDED:
				setNameEmbedded(NAME_EMBEDDED_EDEFAULT);
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
			case SuppressinterfacesPackage.TEST_EMBEDDED__NAME_EMBEDDED:
				return NAME_EMBEDDED_EDEFAULT == null ? nameEmbedded != null : !NAME_EMBEDDED_EDEFAULT.equals(nameEmbedded);
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
		result.append(" (nameEmbedded: ");
		result.append(nameEmbedded);
		result.append(')');
		return result.toString();
	}

} // TestEmbedded

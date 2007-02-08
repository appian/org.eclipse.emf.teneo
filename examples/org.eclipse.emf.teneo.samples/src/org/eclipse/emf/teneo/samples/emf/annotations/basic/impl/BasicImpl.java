/**
 * <copyright>
 * </copyright>
 *
 * $Id: BasicImpl.java,v 1.2 2007/02/08 23:09:24 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.annotations.basic.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.teneo.samples.emf.annotations.basic.Basic;
import org.eclipse.emf.teneo.samples.emf.annotations.basic.BasicPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Basic</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.basic.impl.BasicImpl#getMyOptionalBasic <em>My Optional Basic</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.basic.impl.BasicImpl#getMyVersion <em>My Version</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.basic.impl.BasicImpl#getMyTransient <em>My Transient</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BasicImpl extends EObjectImpl implements Basic {
	/**
	 * The default value of the '{@link #getMyOptionalBasic() <em>My Optional Basic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMyOptionalBasic()
	 * @generated
	 * @ordered
	 */
	protected static final String MY_OPTIONAL_BASIC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMyOptionalBasic() <em>My Optional Basic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMyOptionalBasic()
	 * @generated
	 * @ordered
	 */
	protected String myOptionalBasic = MY_OPTIONAL_BASIC_EDEFAULT;

	/**
	 * The default value of the '{@link #getMyVersion() <em>My Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMyVersion()
	 * @generated
	 * @ordered
	 */
	protected static final long MY_VERSION_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getMyVersion() <em>My Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMyVersion()
	 * @generated
	 * @ordered
	 */
	protected long myVersion = MY_VERSION_EDEFAULT;

	/**
	 * This is true if the My Version attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean myVersionESet = false;

	/**
	 * The default value of the '{@link #getMyTransient() <em>My Transient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMyTransient()
	 * @generated
	 * @ordered
	 */
	protected static final String MY_TRANSIENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMyTransient() <em>My Transient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMyTransient()
	 * @generated
	 * @ordered
	 */
	protected String myTransient = MY_TRANSIENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BasicImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasicPackage.Literals.BASIC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMyOptionalBasic() {
		return myOptionalBasic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMyOptionalBasic(String newMyOptionalBasic) {
		String oldMyOptionalBasic = myOptionalBasic;
		myOptionalBasic = newMyOptionalBasic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicPackage.BASIC__MY_OPTIONAL_BASIC, oldMyOptionalBasic, myOptionalBasic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getMyVersion() {
		return myVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMyVersion(long newMyVersion) {
		long oldMyVersion = myVersion;
		myVersion = newMyVersion;
		boolean oldMyVersionESet = myVersionESet;
		myVersionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicPackage.BASIC__MY_VERSION, oldMyVersion, myVersion, !oldMyVersionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMyVersion() {
		long oldMyVersion = myVersion;
		boolean oldMyVersionESet = myVersionESet;
		myVersion = MY_VERSION_EDEFAULT;
		myVersionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BasicPackage.BASIC__MY_VERSION, oldMyVersion, MY_VERSION_EDEFAULT, oldMyVersionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMyVersion() {
		return myVersionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMyTransient() {
		return myTransient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMyTransient(String newMyTransient) {
		String oldMyTransient = myTransient;
		myTransient = newMyTransient;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicPackage.BASIC__MY_TRANSIENT, oldMyTransient, myTransient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BasicPackage.BASIC__MY_OPTIONAL_BASIC:
				return getMyOptionalBasic();
			case BasicPackage.BASIC__MY_VERSION:
				return new Long(getMyVersion());
			case BasicPackage.BASIC__MY_TRANSIENT:
				return getMyTransient();
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
			case BasicPackage.BASIC__MY_OPTIONAL_BASIC:
				setMyOptionalBasic((String)newValue);
				return;
			case BasicPackage.BASIC__MY_VERSION:
				setMyVersion(((Long)newValue).longValue());
				return;
			case BasicPackage.BASIC__MY_TRANSIENT:
				setMyTransient((String)newValue);
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
			case BasicPackage.BASIC__MY_OPTIONAL_BASIC:
				setMyOptionalBasic(MY_OPTIONAL_BASIC_EDEFAULT);
				return;
			case BasicPackage.BASIC__MY_VERSION:
				unsetMyVersion();
				return;
			case BasicPackage.BASIC__MY_TRANSIENT:
				setMyTransient(MY_TRANSIENT_EDEFAULT);
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
			case BasicPackage.BASIC__MY_OPTIONAL_BASIC:
				return MY_OPTIONAL_BASIC_EDEFAULT == null ? myOptionalBasic != null : !MY_OPTIONAL_BASIC_EDEFAULT.equals(myOptionalBasic);
			case BasicPackage.BASIC__MY_VERSION:
				return isSetMyVersion();
			case BasicPackage.BASIC__MY_TRANSIENT:
				return MY_TRANSIENT_EDEFAULT == null ? myTransient != null : !MY_TRANSIENT_EDEFAULT.equals(myTransient);
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
		result.append(" (myOptionalBasic: ");
		result.append(myOptionalBasic);
		result.append(", myVersion: ");
		if (myVersionESet) result.append(myVersion); else result.append("<unset>");
		result.append(", myTransient: ");
		result.append(myTransient);
		result.append(')');
		return result.toString();
	}

} //BasicImpl

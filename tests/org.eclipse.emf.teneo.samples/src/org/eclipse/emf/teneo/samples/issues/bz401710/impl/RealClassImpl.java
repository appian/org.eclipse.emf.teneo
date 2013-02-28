/**
 */
package org.eclipse.emf.teneo.samples.issues.bz401710.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.teneo.samples.issues.bz401710.Bz401710Package;
import org.eclipse.emf.teneo.samples.issues.bz401710.IIdentifiable;
import org.eclipse.emf.teneo.samples.issues.bz401710.RealClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Real Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz401710.impl.RealClassImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz401710.impl.RealClassImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz401710.impl.RealClassImpl#getBdsVersion <em>Bds Version</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RealClassImpl extends EObjectImpl implements RealClass {
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
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getBdsVersion() <em>Bds Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBdsVersion()
	 * @generated
	 * @ordered
	 */
	protected static final long BDS_VERSION_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getBdsVersion() <em>Bds Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBdsVersion()
	 * @generated
	 * @ordered
	 */
	protected long bdsVersion = BDS_VERSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RealClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Bz401710Package.Literals.REAL_CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Bz401710Package.REAL_CLASS__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Bz401710Package.REAL_CLASS__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getBdsVersion() {
		return bdsVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBdsVersion(long newBdsVersion) {
		long oldBdsVersion = bdsVersion;
		bdsVersion = newBdsVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Bz401710Package.REAL_CLASS__BDS_VERSION, oldBdsVersion, bdsVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Bz401710Package.REAL_CLASS__NAME:
				return getName();
			case Bz401710Package.REAL_CLASS__ID:
				return getId();
			case Bz401710Package.REAL_CLASS__BDS_VERSION:
				return getBdsVersion();
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
			case Bz401710Package.REAL_CLASS__NAME:
				setName((String)newValue);
				return;
			case Bz401710Package.REAL_CLASS__ID:
				setId((String)newValue);
				return;
			case Bz401710Package.REAL_CLASS__BDS_VERSION:
				setBdsVersion((Long)newValue);
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
			case Bz401710Package.REAL_CLASS__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Bz401710Package.REAL_CLASS__ID:
				setId(ID_EDEFAULT);
				return;
			case Bz401710Package.REAL_CLASS__BDS_VERSION:
				setBdsVersion(BDS_VERSION_EDEFAULT);
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
			case Bz401710Package.REAL_CLASS__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Bz401710Package.REAL_CLASS__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case Bz401710Package.REAL_CLASS__BDS_VERSION:
				return bdsVersion != BDS_VERSION_EDEFAULT;
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
		if (baseClass == IIdentifiable.class) {
			switch (derivedFeatureID) {
				case Bz401710Package.REAL_CLASS__ID: return Bz401710Package.IIDENTIFIABLE__ID;
				case Bz401710Package.REAL_CLASS__BDS_VERSION: return Bz401710Package.IIDENTIFIABLE__BDS_VERSION;
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
		if (baseClass == IIdentifiable.class) {
			switch (baseFeatureID) {
				case Bz401710Package.IIDENTIFIABLE__ID: return Bz401710Package.REAL_CLASS__ID;
				case Bz401710Package.IIDENTIFIABLE__BDS_VERSION: return Bz401710Package.REAL_CLASS__BDS_VERSION;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", id: ");
		result.append(id);
		result.append(", bdsVersion: ");
		result.append(bdsVersion);
		result.append(')');
		return result.toString();
	}

} //RealClassImpl

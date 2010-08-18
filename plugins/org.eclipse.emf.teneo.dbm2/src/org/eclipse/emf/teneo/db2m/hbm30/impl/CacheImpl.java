/**
 * <copyright>
 * </copyright>
 *
 * $Id: CacheImpl.java,v 1.1 2010/08/18 09:21:39 cbouhier Exp $
 */
package org.eclipse.emf.teneo.db2m.hbm30.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.teneo.db2m.hbm30.Cache;
import org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package;
import org.eclipse.emf.teneo.db2m.hbm30.IncludeType;
import org.eclipse.emf.teneo.db2m.hbm30.UsageType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cache</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.CacheImpl#getInclude <em>Include</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.CacheImpl#getRegion <em>Region</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.CacheImpl#getUsage <em>Usage</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CacheImpl extends EObjectImpl implements Cache {
	/**
	 * The default value of the '{@link #getInclude() <em>Include</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInclude()
	 * @generated
	 * @ordered
	 */
	protected static final IncludeType INCLUDE_EDEFAULT = IncludeType.ALL;

	/**
	 * The cached value of the '{@link #getInclude() <em>Include</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInclude()
	 * @generated
	 * @ordered
	 */
	protected IncludeType include = INCLUDE_EDEFAULT;

	/**
	 * This is true if the Include attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean includeESet;

	/**
	 * The default value of the '{@link #getRegion() <em>Region</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegion()
	 * @generated
	 * @ordered
	 */
	protected static final String REGION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRegion() <em>Region</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegion()
	 * @generated
	 * @ordered
	 */
	protected String region = REGION_EDEFAULT;

	/**
	 * The default value of the '{@link #getUsage() <em>Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsage()
	 * @generated
	 * @ordered
	 */
	protected static final UsageType USAGE_EDEFAULT = UsageType.READ_ONLY;

	/**
	 * The cached value of the '{@link #getUsage() <em>Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsage()
	 * @generated
	 * @ordered
	 */
	protected UsageType usage = USAGE_EDEFAULT;

	/**
	 * This is true if the Usage attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean usageESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CacheImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Hbm30Package.eINSTANCE.getCache();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IncludeType getInclude() {
		return include;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInclude(IncludeType newInclude) {
		IncludeType oldInclude = include;
		include = newInclude == null ? INCLUDE_EDEFAULT : newInclude;
		boolean oldIncludeESet = includeESet;
		includeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.CACHE__INCLUDE, oldInclude, include, !oldIncludeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetInclude() {
		IncludeType oldInclude = include;
		boolean oldIncludeESet = includeESet;
		include = INCLUDE_EDEFAULT;
		includeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Hbm30Package.CACHE__INCLUDE, oldInclude, INCLUDE_EDEFAULT, oldIncludeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetInclude() {
		return includeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRegion() {
		return region;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegion(String newRegion) {
		String oldRegion = region;
		region = newRegion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.CACHE__REGION, oldRegion, region));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsageType getUsage() {
		return usage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsage(UsageType newUsage) {
		UsageType oldUsage = usage;
		usage = newUsage == null ? USAGE_EDEFAULT : newUsage;
		boolean oldUsageESet = usageESet;
		usageESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.CACHE__USAGE, oldUsage, usage, !oldUsageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUsage() {
		UsageType oldUsage = usage;
		boolean oldUsageESet = usageESet;
		usage = USAGE_EDEFAULT;
		usageESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Hbm30Package.CACHE__USAGE, oldUsage, USAGE_EDEFAULT, oldUsageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUsage() {
		return usageESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Hbm30Package.CACHE__INCLUDE:
				return getInclude();
			case Hbm30Package.CACHE__REGION:
				return getRegion();
			case Hbm30Package.CACHE__USAGE:
				return getUsage();
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
			case Hbm30Package.CACHE__INCLUDE:
				setInclude((IncludeType)newValue);
				return;
			case Hbm30Package.CACHE__REGION:
				setRegion((String)newValue);
				return;
			case Hbm30Package.CACHE__USAGE:
				setUsage((UsageType)newValue);
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
			case Hbm30Package.CACHE__INCLUDE:
				unsetInclude();
				return;
			case Hbm30Package.CACHE__REGION:
				setRegion(REGION_EDEFAULT);
				return;
			case Hbm30Package.CACHE__USAGE:
				unsetUsage();
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
			case Hbm30Package.CACHE__INCLUDE:
				return isSetInclude();
			case Hbm30Package.CACHE__REGION:
				return REGION_EDEFAULT == null ? region != null : !REGION_EDEFAULT.equals(region);
			case Hbm30Package.CACHE__USAGE:
				return isSetUsage();
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
		result.append(" (include: ");
		if (includeESet) result.append(include); else result.append("<unset>");
		result.append(", region: ");
		result.append(region);
		result.append(", usage: ");
		if (usageESet) result.append(usage); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //CacheImpl

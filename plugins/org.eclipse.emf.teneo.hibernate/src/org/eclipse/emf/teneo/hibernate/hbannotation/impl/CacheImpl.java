/**
 * <copyright>
 * </copyright>
 *
 * $Id: CacheImpl.java,v 1.1 2006/10/20 13:21:49 mtaal Exp $
 */
package org.eclipse.emf.teneo.hibernate.hbannotation.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.teneo.hibernate.hbannotation.Cache;
import org.eclipse.emf.teneo.hibernate.hbannotation.CacheConcurrencyStrategy;
import org.eclipse.emf.teneo.hibernate.hbannotation.HbAnnotationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cache</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.hibernate.hbannotation.impl.CacheImpl#getEModelElement <em>EModel Element</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.hibernate.hbannotation.impl.CacheImpl#getUsage <em>Usage</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.hibernate.hbannotation.impl.CacheImpl#getRegion <em>Region</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.hibernate.hbannotation.impl.CacheImpl#getInclude <em>Include</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CacheImpl extends EObjectImpl implements Cache {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2005, 2006 Springsite BV (The Netherlands) and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public\nLicense v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n   Martin Taal\n   Douglas Bitting\n";

	/**
	 * The cached value of the '{@link #getEModelElement() <em>EModel Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEModelElement()
	 * @generated
	 * @ordered
	 */
	protected EModelElement eModelElement = null;

	/**
	 * The default value of the '{@link #getUsage() <em>Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsage()
	 * @generated
	 * @ordered
	 */
	protected static final CacheConcurrencyStrategy USAGE_EDEFAULT = CacheConcurrencyStrategy.NONE_LITERAL;

	/**
	 * The cached value of the '{@link #getUsage() <em>Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsage()
	 * @generated
	 * @ordered
	 */
	protected CacheConcurrencyStrategy usage = USAGE_EDEFAULT;

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
	 * The default value of the '{@link #getInclude() <em>Include</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInclude()
	 * @generated
	 * @ordered
	 */
	protected static final String INCLUDE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInclude() <em>Include</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInclude()
	 * @generated
	 * @ordered
	 */
	protected String include = INCLUDE_EDEFAULT;

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
	protected EClass eStaticClass() {
		return HbAnnotationPackage.Literals.CACHE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EModelElement getEModelElement() {
		if (eModelElement != null && eModelElement.eIsProxy()) {
			InternalEObject oldEModelElement = (InternalEObject)eModelElement;
			eModelElement = (EModelElement)eResolveProxy(oldEModelElement);
			if (eModelElement != oldEModelElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HbAnnotationPackage.CACHE__EMODEL_ELEMENT, oldEModelElement, eModelElement));
			}
		}
		return eModelElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EModelElement basicGetEModelElement() {
		return eModelElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEModelElement(EModelElement newEModelElement) {
		EModelElement oldEModelElement = eModelElement;
		eModelElement = newEModelElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HbAnnotationPackage.CACHE__EMODEL_ELEMENT, oldEModelElement, eModelElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CacheConcurrencyStrategy getUsage() {
		return usage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsage(CacheConcurrencyStrategy newUsage) {
		CacheConcurrencyStrategy oldUsage = usage;
		usage = newUsage == null ? USAGE_EDEFAULT : newUsage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HbAnnotationPackage.CACHE__USAGE, oldUsage, usage));
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
			eNotify(new ENotificationImpl(this, Notification.SET, HbAnnotationPackage.CACHE__REGION, oldRegion, region));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInclude() {
		return include;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInclude(String newInclude) {
		String oldInclude = include;
		include = newInclude;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HbAnnotationPackage.CACHE__INCLUDE, oldInclude, include));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HbAnnotationPackage.CACHE__EMODEL_ELEMENT:
				if (resolve) return getEModelElement();
				return basicGetEModelElement();
			case HbAnnotationPackage.CACHE__USAGE:
				return getUsage();
			case HbAnnotationPackage.CACHE__REGION:
				return getRegion();
			case HbAnnotationPackage.CACHE__INCLUDE:
				return getInclude();
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
			case HbAnnotationPackage.CACHE__EMODEL_ELEMENT:
				setEModelElement((EModelElement)newValue);
				return;
			case HbAnnotationPackage.CACHE__USAGE:
				setUsage((CacheConcurrencyStrategy)newValue);
				return;
			case HbAnnotationPackage.CACHE__REGION:
				setRegion((String)newValue);
				return;
			case HbAnnotationPackage.CACHE__INCLUDE:
				setInclude((String)newValue);
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
			case HbAnnotationPackage.CACHE__EMODEL_ELEMENT:
				setEModelElement((EModelElement)null);
				return;
			case HbAnnotationPackage.CACHE__USAGE:
				setUsage(USAGE_EDEFAULT);
				return;
			case HbAnnotationPackage.CACHE__REGION:
				setRegion(REGION_EDEFAULT);
				return;
			case HbAnnotationPackage.CACHE__INCLUDE:
				setInclude(INCLUDE_EDEFAULT);
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
			case HbAnnotationPackage.CACHE__EMODEL_ELEMENT:
				return eModelElement != null;
			case HbAnnotationPackage.CACHE__USAGE:
				return usage != USAGE_EDEFAULT;
			case HbAnnotationPackage.CACHE__REGION:
				return REGION_EDEFAULT == null ? region != null : !REGION_EDEFAULT.equals(region);
			case HbAnnotationPackage.CACHE__INCLUDE:
				return INCLUDE_EDEFAULT == null ? include != null : !INCLUDE_EDEFAULT.equals(include);
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
		result.append(" (usage: ");
		result.append(usage);
		result.append(", region: ");
		result.append(region);
		result.append(", include: ");
		result.append(include);
		result.append(')');
		return result.toString();
	}

} //CacheImpl
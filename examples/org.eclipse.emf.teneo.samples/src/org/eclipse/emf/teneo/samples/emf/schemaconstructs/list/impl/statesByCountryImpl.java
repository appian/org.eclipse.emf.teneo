/**
 * <copyright>
 * </copyright>
 *
 * $Id: statesByCountryImpl.java,v 1.1 2006/07/11 16:57:11 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.schemaconstructs.list.impl;

import java.util.List;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.teneo.samples.emf.schemaconstructs.list.ListPackage;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.list.statesByCountry;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>states By Country</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.list.impl.statesByCountryImpl#getCountry <em>Country</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.list.impl.statesByCountryImpl#getIndex <em>Index</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.list.impl.statesByCountryImpl#getAllStates <em>All States</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.list.impl.statesByCountryImpl#getSixImportantStates <em>Six Important States</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class statesByCountryImpl extends EObjectImpl implements statesByCountry {
	/**
	 * The default value of the '{@link #getCountry() <em>Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountry()
	 * @generated
	 * @ordered
	 */
	protected static final String COUNTRY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCountry() <em>Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountry()
	 * @generated
	 * @ordered
	 */
	protected String country = COUNTRY_EDEFAULT;

	/**
	 * The default value of the '{@link #getIndex() <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndex()
	 * @generated
	 * @ordered
	 */
	protected static final int INDEX_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getIndex() <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndex()
	 * @generated
	 * @ordered
	 */
	protected int index = INDEX_EDEFAULT;

	/**
	 * This is true if the Index attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean indexESet = false;

	/**
	 * The default value of the '{@link #getAllStates() <em>All States</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllStates()
	 * @generated
	 * @ordered
	 */
	protected static final List ALL_STATES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAllStates() <em>All States</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllStates()
	 * @generated
	 * @ordered
	 */
	protected List allStates = ALL_STATES_EDEFAULT;

	/**
	 * The default value of the '{@link #getSixImportantStates() <em>Six Important States</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSixImportantStates()
	 * @generated
	 * @ordered
	 */
	protected static final List SIX_IMPORTANT_STATES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSixImportantStates() <em>Six Important States</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSixImportantStates()
	 * @generated
	 * @ordered
	 */
	protected List sixImportantStates = SIX_IMPORTANT_STATES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected statesByCountryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ListPackage.Literals.STATES_BY_COUNTRY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCountry(String newCountry) {
		String oldCountry = country;
		country = newCountry;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ListPackage.STATES_BY_COUNTRY__COUNTRY, oldCountry, country));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getIndex() {
		return index;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndex(int newIndex) {
		int oldIndex = index;
		index = newIndex;
		boolean oldIndexESet = indexESet;
		indexESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ListPackage.STATES_BY_COUNTRY__INDEX, oldIndex, index, !oldIndexESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIndex() {
		int oldIndex = index;
		boolean oldIndexESet = indexESet;
		index = INDEX_EDEFAULT;
		indexESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ListPackage.STATES_BY_COUNTRY__INDEX, oldIndex, INDEX_EDEFAULT, oldIndexESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIndex() {
		return indexESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getAllStates() {
		return allStates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllStates(List newAllStates) {
		List oldAllStates = allStates;
		allStates = newAllStates;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ListPackage.STATES_BY_COUNTRY__ALL_STATES, oldAllStates, allStates));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getSixImportantStates() {
		return sixImportantStates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSixImportantStates(List newSixImportantStates) {
		List oldSixImportantStates = sixImportantStates;
		sixImportantStates = newSixImportantStates;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ListPackage.STATES_BY_COUNTRY__SIX_IMPORTANT_STATES, oldSixImportantStates, sixImportantStates));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ListPackage.STATES_BY_COUNTRY__COUNTRY:
				return getCountry();
			case ListPackage.STATES_BY_COUNTRY__INDEX:
				return new Integer(getIndex());
			case ListPackage.STATES_BY_COUNTRY__ALL_STATES:
				return getAllStates();
			case ListPackage.STATES_BY_COUNTRY__SIX_IMPORTANT_STATES:
				return getSixImportantStates();
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
			case ListPackage.STATES_BY_COUNTRY__COUNTRY:
				setCountry((String)newValue);
				return;
			case ListPackage.STATES_BY_COUNTRY__INDEX:
				setIndex(((Integer)newValue).intValue());
				return;
			case ListPackage.STATES_BY_COUNTRY__ALL_STATES:
				setAllStates((List)newValue);
				return;
			case ListPackage.STATES_BY_COUNTRY__SIX_IMPORTANT_STATES:
				setSixImportantStates((List)newValue);
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
			case ListPackage.STATES_BY_COUNTRY__COUNTRY:
				setCountry(COUNTRY_EDEFAULT);
				return;
			case ListPackage.STATES_BY_COUNTRY__INDEX:
				unsetIndex();
				return;
			case ListPackage.STATES_BY_COUNTRY__ALL_STATES:
				setAllStates(ALL_STATES_EDEFAULT);
				return;
			case ListPackage.STATES_BY_COUNTRY__SIX_IMPORTANT_STATES:
				setSixImportantStates(SIX_IMPORTANT_STATES_EDEFAULT);
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
			case ListPackage.STATES_BY_COUNTRY__COUNTRY:
				return COUNTRY_EDEFAULT == null ? country != null : !COUNTRY_EDEFAULT.equals(country);
			case ListPackage.STATES_BY_COUNTRY__INDEX:
				return isSetIndex();
			case ListPackage.STATES_BY_COUNTRY__ALL_STATES:
				return ALL_STATES_EDEFAULT == null ? allStates != null : !ALL_STATES_EDEFAULT.equals(allStates);
			case ListPackage.STATES_BY_COUNTRY__SIX_IMPORTANT_STATES:
				return SIX_IMPORTANT_STATES_EDEFAULT == null ? sixImportantStates != null : !SIX_IMPORTANT_STATES_EDEFAULT.equals(sixImportantStates);
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
		result.append(" (country: ");
		result.append(country);
		result.append(", index: ");
		if (indexESet) result.append(index); else result.append("<unset>");
		result.append(", allStates: ");
		result.append(allStates);
		result.append(", sixImportantStates: ");
		result.append(sixImportantStates);
		result.append(')');
		return result.toString();
	}

} //statesByCountryImpl

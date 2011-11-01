/**
 * <copyright>
 * </copyright>
 *
 * $Id: statesByCountryImpl.java,v 1.2 2007/02/08 23:09:25 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.schemaconstructs.listunion.impl;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.eclipse.emf.teneo.samples.emf.schemaconstructs.listunion.ListunionPackage;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.listunion.statesByCountry;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>states By Country</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.listunion.impl.statesByCountryImpl#getCountry <em>Country</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.listunion.impl.statesByCountryImpl#getAllStates <em>All States</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.listunion.impl.statesByCountryImpl#getSixImportantStates <em>Six Important States</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.listunion.impl.statesByCountryImpl#getZipUnion <em>Zip Union</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.listunion.impl.statesByCountryImpl#getZipUnions <em>Zip Unions</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.listunion.impl.statesByCountryImpl#getSimpleUnion <em>Simple Union</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.listunion.impl.statesByCountryImpl#getSimpleUnions <em>Simple Unions</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.listunion.impl.statesByCountryImpl#getSimpleStringUnion <em>Simple String Union</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.listunion.impl.statesByCountryImpl#getSimpleStringUnions <em>Simple String Unions</em>}</li>
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
	 * The default value of the '{@link #getAllStates() <em>All States</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllStates()
	 * @generated
	 * @ordered
	 */
	protected static final List<String> ALL_STATES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAllStates() <em>All States</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllStates()
	 * @generated
	 * @ordered
	 */
	protected List<String> allStates = ALL_STATES_EDEFAULT;

	/**
	 * The default value of the '{@link #getSixImportantStates() <em>Six Important States</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSixImportantStates()
	 * @generated
	 * @ordered
	 */
	protected static final List<String> SIX_IMPORTANT_STATES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSixImportantStates() <em>Six Important States</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSixImportantStates()
	 * @generated
	 * @ordered
	 */
	protected List<String> sixImportantStates = SIX_IMPORTANT_STATES_EDEFAULT;

	/**
	 * The default value of the '{@link #getZipUnion() <em>Zip Union</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZipUnion()
	 * @generated
	 * @ordered
	 */
	protected static final String ZIP_UNION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getZipUnion() <em>Zip Union</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZipUnion()
	 * @generated
	 * @ordered
	 */
	protected String zipUnion = ZIP_UNION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getZipUnions() <em>Zip Unions</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZipUnions()
	 * @generated
	 * @ordered
	 */
	protected EList<String> zipUnions = null;

	/**
	 * The default value of the '{@link #getSimpleUnion() <em>Simple Union</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimpleUnion()
	 * @generated
	 * @ordered
	 */
	protected static final Object SIMPLE_UNION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSimpleUnion() <em>Simple Union</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimpleUnion()
	 * @generated
	 * @ordered
	 */
	protected Object simpleUnion = SIMPLE_UNION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSimpleUnions() <em>Simple Unions</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimpleUnions()
	 * @generated
	 * @ordered
	 */
	protected EList<Object> simpleUnions = null;

	/**
	 * The default value of the '{@link #getSimpleStringUnion() <em>Simple String Union</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimpleStringUnion()
	 * @generated
	 * @ordered
	 */
	protected static final String SIMPLE_STRING_UNION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSimpleStringUnion() <em>Simple String Union</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimpleStringUnion()
	 * @generated
	 * @ordered
	 */
	protected String simpleStringUnion = SIMPLE_STRING_UNION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSimpleStringUnions() <em>Simple String Unions</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimpleStringUnions()
	 * @generated
	 * @ordered
	 */
	protected EList<String> simpleStringUnions = null;

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
	@Override
	protected EClass eStaticClass() {
		return ListunionPackage.Literals.STATES_BY_COUNTRY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ListunionPackage.STATES_BY_COUNTRY__COUNTRY, oldCountry, country));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<String> getAllStates() {
		return allStates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllStates(List<String> newAllStates) {
		List<String> oldAllStates = allStates;
		allStates = newAllStates;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ListunionPackage.STATES_BY_COUNTRY__ALL_STATES, oldAllStates, allStates));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<String> getSixImportantStates() {
		return sixImportantStates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSixImportantStates(List<String> newSixImportantStates) {
		List<String> oldSixImportantStates = sixImportantStates;
		sixImportantStates = newSixImportantStates;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ListunionPackage.STATES_BY_COUNTRY__SIX_IMPORTANT_STATES, oldSixImportantStates, sixImportantStates));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getZipUnion() {
		return zipUnion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setZipUnion(String newZipUnion) {
		String oldZipUnion = zipUnion;
		zipUnion = newZipUnion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ListunionPackage.STATES_BY_COUNTRY__ZIP_UNION, oldZipUnion, zipUnion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getZipUnions() {
		if (zipUnions == null) {
			zipUnions = new EDataTypeEList<String>(String.class, this, ListunionPackage.STATES_BY_COUNTRY__ZIP_UNIONS);
		}
		return zipUnions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getSimpleUnion() {
		return simpleUnion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSimpleUnion(Object newSimpleUnion) {
		Object oldSimpleUnion = simpleUnion;
		simpleUnion = newSimpleUnion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ListunionPackage.STATES_BY_COUNTRY__SIMPLE_UNION, oldSimpleUnion, simpleUnion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Object> getSimpleUnions() {
		if (simpleUnions == null) {
			simpleUnions = new EDataTypeEList<Object>(Object.class, this, ListunionPackage.STATES_BY_COUNTRY__SIMPLE_UNIONS);
		}
		return simpleUnions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSimpleStringUnion() {
		return simpleStringUnion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSimpleStringUnion(String newSimpleStringUnion) {
		String oldSimpleStringUnion = simpleStringUnion;
		simpleStringUnion = newSimpleStringUnion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ListunionPackage.STATES_BY_COUNTRY__SIMPLE_STRING_UNION, oldSimpleStringUnion, simpleStringUnion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getSimpleStringUnions() {
		if (simpleStringUnions == null) {
			simpleStringUnions = new EDataTypeEList<String>(String.class, this, ListunionPackage.STATES_BY_COUNTRY__SIMPLE_STRING_UNIONS);
		}
		return simpleStringUnions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ListunionPackage.STATES_BY_COUNTRY__COUNTRY:
				return getCountry();
			case ListunionPackage.STATES_BY_COUNTRY__ALL_STATES:
				return getAllStates();
			case ListunionPackage.STATES_BY_COUNTRY__SIX_IMPORTANT_STATES:
				return getSixImportantStates();
			case ListunionPackage.STATES_BY_COUNTRY__ZIP_UNION:
				return getZipUnion();
			case ListunionPackage.STATES_BY_COUNTRY__ZIP_UNIONS:
				return getZipUnions();
			case ListunionPackage.STATES_BY_COUNTRY__SIMPLE_UNION:
				return getSimpleUnion();
			case ListunionPackage.STATES_BY_COUNTRY__SIMPLE_UNIONS:
				return getSimpleUnions();
			case ListunionPackage.STATES_BY_COUNTRY__SIMPLE_STRING_UNION:
				return getSimpleStringUnion();
			case ListunionPackage.STATES_BY_COUNTRY__SIMPLE_STRING_UNIONS:
				return getSimpleStringUnions();
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
			case ListunionPackage.STATES_BY_COUNTRY__COUNTRY:
				setCountry((String)newValue);
				return;
			case ListunionPackage.STATES_BY_COUNTRY__ALL_STATES:
				setAllStates((List<String>)newValue);
				return;
			case ListunionPackage.STATES_BY_COUNTRY__SIX_IMPORTANT_STATES:
				setSixImportantStates((List<String>)newValue);
				return;
			case ListunionPackage.STATES_BY_COUNTRY__ZIP_UNION:
				setZipUnion((String)newValue);
				return;
			case ListunionPackage.STATES_BY_COUNTRY__ZIP_UNIONS:
				getZipUnions().clear();
				getZipUnions().addAll((Collection<? extends String>)newValue);
				return;
			case ListunionPackage.STATES_BY_COUNTRY__SIMPLE_UNION:
				setSimpleUnion(newValue);
				return;
			case ListunionPackage.STATES_BY_COUNTRY__SIMPLE_UNIONS:
				getSimpleUnions().clear();
				getSimpleUnions().addAll((Collection<? extends Object>)newValue);
				return;
			case ListunionPackage.STATES_BY_COUNTRY__SIMPLE_STRING_UNION:
				setSimpleStringUnion((String)newValue);
				return;
			case ListunionPackage.STATES_BY_COUNTRY__SIMPLE_STRING_UNIONS:
				getSimpleStringUnions().clear();
				getSimpleStringUnions().addAll((Collection<? extends String>)newValue);
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
			case ListunionPackage.STATES_BY_COUNTRY__COUNTRY:
				setCountry(COUNTRY_EDEFAULT);
				return;
			case ListunionPackage.STATES_BY_COUNTRY__ALL_STATES:
				setAllStates(ALL_STATES_EDEFAULT);
				return;
			case ListunionPackage.STATES_BY_COUNTRY__SIX_IMPORTANT_STATES:
				setSixImportantStates(SIX_IMPORTANT_STATES_EDEFAULT);
				return;
			case ListunionPackage.STATES_BY_COUNTRY__ZIP_UNION:
				setZipUnion(ZIP_UNION_EDEFAULT);
				return;
			case ListunionPackage.STATES_BY_COUNTRY__ZIP_UNIONS:
				getZipUnions().clear();
				return;
			case ListunionPackage.STATES_BY_COUNTRY__SIMPLE_UNION:
				setSimpleUnion(SIMPLE_UNION_EDEFAULT);
				return;
			case ListunionPackage.STATES_BY_COUNTRY__SIMPLE_UNIONS:
				getSimpleUnions().clear();
				return;
			case ListunionPackage.STATES_BY_COUNTRY__SIMPLE_STRING_UNION:
				setSimpleStringUnion(SIMPLE_STRING_UNION_EDEFAULT);
				return;
			case ListunionPackage.STATES_BY_COUNTRY__SIMPLE_STRING_UNIONS:
				getSimpleStringUnions().clear();
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
			case ListunionPackage.STATES_BY_COUNTRY__COUNTRY:
				return COUNTRY_EDEFAULT == null ? country != null : !COUNTRY_EDEFAULT.equals(country);
			case ListunionPackage.STATES_BY_COUNTRY__ALL_STATES:
				return ALL_STATES_EDEFAULT == null ? allStates != null : !ALL_STATES_EDEFAULT.equals(allStates);
			case ListunionPackage.STATES_BY_COUNTRY__SIX_IMPORTANT_STATES:
				return SIX_IMPORTANT_STATES_EDEFAULT == null ? sixImportantStates != null : !SIX_IMPORTANT_STATES_EDEFAULT.equals(sixImportantStates);
			case ListunionPackage.STATES_BY_COUNTRY__ZIP_UNION:
				return ZIP_UNION_EDEFAULT == null ? zipUnion != null : !ZIP_UNION_EDEFAULT.equals(zipUnion);
			case ListunionPackage.STATES_BY_COUNTRY__ZIP_UNIONS:
				return zipUnions != null && !zipUnions.isEmpty();
			case ListunionPackage.STATES_BY_COUNTRY__SIMPLE_UNION:
				return SIMPLE_UNION_EDEFAULT == null ? simpleUnion != null : !SIMPLE_UNION_EDEFAULT.equals(simpleUnion);
			case ListunionPackage.STATES_BY_COUNTRY__SIMPLE_UNIONS:
				return simpleUnions != null && !simpleUnions.isEmpty();
			case ListunionPackage.STATES_BY_COUNTRY__SIMPLE_STRING_UNION:
				return SIMPLE_STRING_UNION_EDEFAULT == null ? simpleStringUnion != null : !SIMPLE_STRING_UNION_EDEFAULT.equals(simpleStringUnion);
			case ListunionPackage.STATES_BY_COUNTRY__SIMPLE_STRING_UNIONS:
				return simpleStringUnions != null && !simpleStringUnions.isEmpty();
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
		result.append(" (country: ");
		result.append(country);
		result.append(", allStates: ");
		result.append(allStates);
		result.append(", sixImportantStates: ");
		result.append(sixImportantStates);
		result.append(", zipUnion: ");
		result.append(zipUnion);
		result.append(", zipUnions: ");
		result.append(zipUnions);
		result.append(", simpleUnion: ");
		result.append(simpleUnion);
		result.append(", simpleUnions: ");
		result.append(simpleUnions);
		result.append(", simpleStringUnion: ");
		result.append(simpleStringUnion);
		result.append(", simpleStringUnions: ");
		result.append(simpleStringUnions);
		result.append(')');
		return result.toString();
	}

} //statesByCountryImpl

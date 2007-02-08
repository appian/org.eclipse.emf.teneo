/**
 * <copyright>
 * </copyright>
 *
 * $Id: PersonImpl.java,v 1.2 2007/02/08 23:09:19 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.annotations.attributeoverrides.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.teneo.samples.emf.annotations.attributeoverrides.AttributeoverridesPackage;
import org.eclipse.emf.teneo.samples.emf.annotations.attributeoverrides.City;
import org.eclipse.emf.teneo.samples.emf.annotations.attributeoverrides.Person;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.attributeoverrides.impl.PersonImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.attributeoverrides.impl.PersonImpl#getBornIn <em>Born In</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.attributeoverrides.impl.PersonImpl#getLivesIn <em>Lives In</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PersonImpl extends EObjectImpl implements Person {
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
	 * The cached value of the '{@link #getBornIn() <em>Born In</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBornIn()
	 * @generated
	 * @ordered
	 */
	protected City bornIn = null;

	/**
	 * The cached value of the '{@link #getLivesIn() <em>Lives In</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLivesIn()
	 * @generated
	 * @ordered
	 */
	protected City livesIn = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AttributeoverridesPackage.Literals.PERSON;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AttributeoverridesPackage.PERSON__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public City getBornIn() {
		if (bornIn != null && bornIn.eIsProxy()) {
			InternalEObject oldBornIn = (InternalEObject)bornIn;
			bornIn = (City)eResolveProxy(oldBornIn);
			if (bornIn != oldBornIn) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AttributeoverridesPackage.PERSON__BORN_IN, oldBornIn, bornIn));
			}
		}
		return bornIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public City basicGetBornIn() {
		return bornIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBornIn(City newBornIn) {
		City oldBornIn = bornIn;
		bornIn = newBornIn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AttributeoverridesPackage.PERSON__BORN_IN, oldBornIn, bornIn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public City getLivesIn() {
		if (livesIn != null && livesIn.eIsProxy()) {
			InternalEObject oldLivesIn = (InternalEObject)livesIn;
			livesIn = (City)eResolveProxy(oldLivesIn);
			if (livesIn != oldLivesIn) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AttributeoverridesPackage.PERSON__LIVES_IN, oldLivesIn, livesIn));
			}
		}
		return livesIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public City basicGetLivesIn() {
		return livesIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLivesIn(City newLivesIn) {
		City oldLivesIn = livesIn;
		livesIn = newLivesIn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AttributeoverridesPackage.PERSON__LIVES_IN, oldLivesIn, livesIn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AttributeoverridesPackage.PERSON__NAME:
				return getName();
			case AttributeoverridesPackage.PERSON__BORN_IN:
				if (resolve) return getBornIn();
				return basicGetBornIn();
			case AttributeoverridesPackage.PERSON__LIVES_IN:
				if (resolve) return getLivesIn();
				return basicGetLivesIn();
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
			case AttributeoverridesPackage.PERSON__NAME:
				setName((String)newValue);
				return;
			case AttributeoverridesPackage.PERSON__BORN_IN:
				setBornIn((City)newValue);
				return;
			case AttributeoverridesPackage.PERSON__LIVES_IN:
				setLivesIn((City)newValue);
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
			case AttributeoverridesPackage.PERSON__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AttributeoverridesPackage.PERSON__BORN_IN:
				setBornIn((City)null);
				return;
			case AttributeoverridesPackage.PERSON__LIVES_IN:
				setLivesIn((City)null);
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
			case AttributeoverridesPackage.PERSON__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AttributeoverridesPackage.PERSON__BORN_IN:
				return bornIn != null;
			case AttributeoverridesPackage.PERSON__LIVES_IN:
				return livesIn != null;
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

} //PersonImpl

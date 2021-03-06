/**
 * <copyright>
 * </copyright>
 *
 * $Id: AnotherEmbeddableImpl.java,v 1.3 2010/04/23 08:52:50 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.annotations.embedded.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectEList;
import org.eclipse.emf.teneo.samples.emf.annotations.embedded.AOneToMany;
import org.eclipse.emf.teneo.samples.emf.annotations.embedded.AlsoEmbeddable;
import org.eclipse.emf.teneo.samples.emf.annotations.embedded.AnotherEmbeddable;
import org.eclipse.emf.teneo.samples.emf.annotations.embedded.EmbeddedPackage;
import org.eclipse.emf.teneo.samples.emf.annotations.embedded.NestedEmbeddable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Another Embeddable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.embedded.impl.AnotherEmbeddableImpl#getAnotherName <em>Another Name</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.embedded.impl.AnotherEmbeddableImpl#getAOneToMany <em>AOne To Many</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.embedded.impl.AnotherEmbeddableImpl#getNestedEmbedded <em>Nested Embedded</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AnotherEmbeddableImpl extends AlsoEmbeddableImpl implements AnotherEmbeddable {
	/**
	 * The default value of the '{@link #getAnotherName() <em>Another Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnotherName()
	 * @generated
	 * @ordered
	 */
	protected static final String ANOTHER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAnotherName() <em>Another Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnotherName()
	 * @generated
	 * @ordered
	 */
	protected String anotherName = ANOTHER_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAOneToMany() <em>AOne To Many</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAOneToMany()
	 * @generated
	 * @ordered
	 */
	protected EList<AOneToMany> aOneToMany;

	/**
	 * The cached value of the '{@link #getNestedEmbedded() <em>Nested Embedded</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNestedEmbedded()
	 * @generated
	 * @ordered
	 */
	protected NestedEmbeddable nestedEmbedded;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnotherEmbeddableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmbeddedPackage.Literals.ANOTHER_EMBEDDABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAnotherName() {
		return anotherName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnotherName(String newAnotherName) {
		String oldAnotherName = anotherName;
		anotherName = newAnotherName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmbeddedPackage.ANOTHER_EMBEDDABLE__ANOTHER_NAME, oldAnotherName, anotherName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AOneToMany> getAOneToMany() {
		if (aOneToMany == null) {
			aOneToMany = new EObjectEList<AOneToMany>(AOneToMany.class, this, EmbeddedPackage.ANOTHER_EMBEDDABLE__AONE_TO_MANY);
		}
		return aOneToMany;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NestedEmbeddable getNestedEmbedded() {
		return nestedEmbedded;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNestedEmbedded(NestedEmbeddable newNestedEmbedded, NotificationChain msgs) {
		NestedEmbeddable oldNestedEmbedded = nestedEmbedded;
		nestedEmbedded = newNestedEmbedded;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EmbeddedPackage.ANOTHER_EMBEDDABLE__NESTED_EMBEDDED, oldNestedEmbedded, newNestedEmbedded);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNestedEmbedded(NestedEmbeddable newNestedEmbedded) {
		if (newNestedEmbedded != nestedEmbedded) {
			NotificationChain msgs = null;
			if (nestedEmbedded != null)
				msgs = ((InternalEObject)nestedEmbedded).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EmbeddedPackage.ANOTHER_EMBEDDABLE__NESTED_EMBEDDED, null, msgs);
			if (newNestedEmbedded != null)
				msgs = ((InternalEObject)newNestedEmbedded).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EmbeddedPackage.ANOTHER_EMBEDDABLE__NESTED_EMBEDDED, null, msgs);
			msgs = basicSetNestedEmbedded(newNestedEmbedded, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmbeddedPackage.ANOTHER_EMBEDDABLE__NESTED_EMBEDDED, newNestedEmbedded, newNestedEmbedded));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EmbeddedPackage.ANOTHER_EMBEDDABLE__NESTED_EMBEDDED:
				return basicSetNestedEmbedded(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EmbeddedPackage.ANOTHER_EMBEDDABLE__ANOTHER_NAME:
				return getAnotherName();
			case EmbeddedPackage.ANOTHER_EMBEDDABLE__AONE_TO_MANY:
				return getAOneToMany();
			case EmbeddedPackage.ANOTHER_EMBEDDABLE__NESTED_EMBEDDED:
				return getNestedEmbedded();
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
			case EmbeddedPackage.ANOTHER_EMBEDDABLE__ANOTHER_NAME:
				setAnotherName((String)newValue);
				return;
			case EmbeddedPackage.ANOTHER_EMBEDDABLE__AONE_TO_MANY:
				getAOneToMany().clear();
				getAOneToMany().addAll((Collection<? extends AOneToMany>)newValue);
				return;
			case EmbeddedPackage.ANOTHER_EMBEDDABLE__NESTED_EMBEDDED:
				setNestedEmbedded((NestedEmbeddable)newValue);
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
			case EmbeddedPackage.ANOTHER_EMBEDDABLE__ANOTHER_NAME:
				setAnotherName(ANOTHER_NAME_EDEFAULT);
				return;
			case EmbeddedPackage.ANOTHER_EMBEDDABLE__AONE_TO_MANY:
				getAOneToMany().clear();
				return;
			case EmbeddedPackage.ANOTHER_EMBEDDABLE__NESTED_EMBEDDED:
				setNestedEmbedded((NestedEmbeddable)null);
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
			case EmbeddedPackage.ANOTHER_EMBEDDABLE__ANOTHER_NAME:
				return ANOTHER_NAME_EDEFAULT == null ? anotherName != null : !ANOTHER_NAME_EDEFAULT.equals(anotherName);
			case EmbeddedPackage.ANOTHER_EMBEDDABLE__AONE_TO_MANY:
				return aOneToMany != null && !aOneToMany.isEmpty();
			case EmbeddedPackage.ANOTHER_EMBEDDABLE__NESTED_EMBEDDED:
				return nestedEmbedded != null;
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
		result.append(" (anotherName: ");
		result.append(anotherName);
		result.append(')');
		return result.toString();
	}

} //AnotherEmbeddableImpl

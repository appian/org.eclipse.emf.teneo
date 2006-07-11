/**
 * <copyright>
 * </copyright>
 *
 * $Id: EmbedderImpl.java,v 1.1 2006/07/11 16:56:58 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.annotations.embedded.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.emf.teneo.samples.emf.annotations.embedded.Embeddable;
import org.eclipse.emf.teneo.samples.emf.annotations.embedded.EmbeddedPackage;
import org.eclipse.emf.teneo.samples.emf.annotations.embedded.Embedder;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Embedder</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.embedded.impl.EmbedderImpl#getFirstEmbedded <em>First Embedded</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.embedded.impl.EmbedderImpl#getSecondEmbedded <em>Second Embedded</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.embedded.impl.EmbedderImpl#getThirdEmbedded <em>Third Embedded</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.embedded.impl.EmbedderImpl#getFourthEmbedded <em>Fourth Embedded</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.embedded.impl.EmbedderImpl#getFifthEmbedded <em>Fifth Embedded</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EmbedderImpl extends EObjectImpl implements Embedder {
	/**
	 * The cached value of the '{@link #getFirstEmbedded() <em>First Embedded</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstEmbedded()
	 * @generated
	 * @ordered
	 */
	protected Embeddable firstEmbedded = null;

	/**
	 * The cached value of the '{@link #getSecondEmbedded() <em>Second Embedded</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecondEmbedded()
	 * @generated
	 * @ordered
	 */
	protected Embeddable secondEmbedded = null;

	/**
	 * The cached value of the '{@link #getThirdEmbedded() <em>Third Embedded</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThirdEmbedded()
	 * @generated
	 * @ordered
	 */
	protected Embeddable thirdEmbedded = null;

	/**
	 * The cached value of the '{@link #getFourthEmbedded() <em>Fourth Embedded</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFourthEmbedded()
	 * @generated
	 * @ordered
	 */
	protected EList fourthEmbedded = null;

	/**
	 * The cached value of the '{@link #getFifthEmbedded() <em>Fifth Embedded</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFifthEmbedded()
	 * @generated
	 * @ordered
	 */
	protected Embeddable fifthEmbedded = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EmbedderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return EmbeddedPackage.Literals.EMBEDDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Embeddable getFirstEmbedded() {
		return firstEmbedded;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFirstEmbedded(Embeddable newFirstEmbedded, NotificationChain msgs) {
		Embeddable oldFirstEmbedded = firstEmbedded;
		firstEmbedded = newFirstEmbedded;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EmbeddedPackage.EMBEDDER__FIRST_EMBEDDED, oldFirstEmbedded, newFirstEmbedded);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstEmbedded(Embeddable newFirstEmbedded) {
		if (newFirstEmbedded != firstEmbedded) {
			NotificationChain msgs = null;
			if (firstEmbedded != null)
				msgs = ((InternalEObject)firstEmbedded).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EmbeddedPackage.EMBEDDER__FIRST_EMBEDDED, null, msgs);
			if (newFirstEmbedded != null)
				msgs = ((InternalEObject)newFirstEmbedded).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EmbeddedPackage.EMBEDDER__FIRST_EMBEDDED, null, msgs);
			msgs = basicSetFirstEmbedded(newFirstEmbedded, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmbeddedPackage.EMBEDDER__FIRST_EMBEDDED, newFirstEmbedded, newFirstEmbedded));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Embeddable getSecondEmbedded() {
		return secondEmbedded;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSecondEmbedded(Embeddable newSecondEmbedded, NotificationChain msgs) {
		Embeddable oldSecondEmbedded = secondEmbedded;
		secondEmbedded = newSecondEmbedded;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EmbeddedPackage.EMBEDDER__SECOND_EMBEDDED, oldSecondEmbedded, newSecondEmbedded);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecondEmbedded(Embeddable newSecondEmbedded) {
		if (newSecondEmbedded != secondEmbedded) {
			NotificationChain msgs = null;
			if (secondEmbedded != null)
				msgs = ((InternalEObject)secondEmbedded).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EmbeddedPackage.EMBEDDER__SECOND_EMBEDDED, null, msgs);
			if (newSecondEmbedded != null)
				msgs = ((InternalEObject)newSecondEmbedded).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EmbeddedPackage.EMBEDDER__SECOND_EMBEDDED, null, msgs);
			msgs = basicSetSecondEmbedded(newSecondEmbedded, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmbeddedPackage.EMBEDDER__SECOND_EMBEDDED, newSecondEmbedded, newSecondEmbedded));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Embeddable getThirdEmbedded() {
		return thirdEmbedded;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThirdEmbedded(Embeddable newThirdEmbedded, NotificationChain msgs) {
		Embeddable oldThirdEmbedded = thirdEmbedded;
		thirdEmbedded = newThirdEmbedded;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EmbeddedPackage.EMBEDDER__THIRD_EMBEDDED, oldThirdEmbedded, newThirdEmbedded);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThirdEmbedded(Embeddable newThirdEmbedded) {
		if (newThirdEmbedded != thirdEmbedded) {
			NotificationChain msgs = null;
			if (thirdEmbedded != null)
				msgs = ((InternalEObject)thirdEmbedded).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EmbeddedPackage.EMBEDDER__THIRD_EMBEDDED, null, msgs);
			if (newThirdEmbedded != null)
				msgs = ((InternalEObject)newThirdEmbedded).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EmbeddedPackage.EMBEDDER__THIRD_EMBEDDED, null, msgs);
			msgs = basicSetThirdEmbedded(newThirdEmbedded, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmbeddedPackage.EMBEDDER__THIRD_EMBEDDED, newThirdEmbedded, newThirdEmbedded));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getFourthEmbedded() {
		if (fourthEmbedded == null) {
			fourthEmbedded = new EObjectContainmentEList(Embeddable.class, this, EmbeddedPackage.EMBEDDER__FOURTH_EMBEDDED);
		}
		return fourthEmbedded;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Embeddable getFifthEmbedded() {
		return fifthEmbedded;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFifthEmbedded(Embeddable newFifthEmbedded, NotificationChain msgs) {
		Embeddable oldFifthEmbedded = fifthEmbedded;
		fifthEmbedded = newFifthEmbedded;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EmbeddedPackage.EMBEDDER__FIFTH_EMBEDDED, oldFifthEmbedded, newFifthEmbedded);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFifthEmbedded(Embeddable newFifthEmbedded) {
		if (newFifthEmbedded != fifthEmbedded) {
			NotificationChain msgs = null;
			if (fifthEmbedded != null)
				msgs = ((InternalEObject)fifthEmbedded).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EmbeddedPackage.EMBEDDER__FIFTH_EMBEDDED, null, msgs);
			if (newFifthEmbedded != null)
				msgs = ((InternalEObject)newFifthEmbedded).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EmbeddedPackage.EMBEDDER__FIFTH_EMBEDDED, null, msgs);
			msgs = basicSetFifthEmbedded(newFifthEmbedded, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmbeddedPackage.EMBEDDER__FIFTH_EMBEDDED, newFifthEmbedded, newFifthEmbedded));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EmbeddedPackage.EMBEDDER__FIRST_EMBEDDED:
				return basicSetFirstEmbedded(null, msgs);
			case EmbeddedPackage.EMBEDDER__SECOND_EMBEDDED:
				return basicSetSecondEmbedded(null, msgs);
			case EmbeddedPackage.EMBEDDER__THIRD_EMBEDDED:
				return basicSetThirdEmbedded(null, msgs);
			case EmbeddedPackage.EMBEDDER__FOURTH_EMBEDDED:
				return ((InternalEList)getFourthEmbedded()).basicRemove(otherEnd, msgs);
			case EmbeddedPackage.EMBEDDER__FIFTH_EMBEDDED:
				return basicSetFifthEmbedded(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EmbeddedPackage.EMBEDDER__FIRST_EMBEDDED:
				return getFirstEmbedded();
			case EmbeddedPackage.EMBEDDER__SECOND_EMBEDDED:
				return getSecondEmbedded();
			case EmbeddedPackage.EMBEDDER__THIRD_EMBEDDED:
				return getThirdEmbedded();
			case EmbeddedPackage.EMBEDDER__FOURTH_EMBEDDED:
				return getFourthEmbedded();
			case EmbeddedPackage.EMBEDDER__FIFTH_EMBEDDED:
				return getFifthEmbedded();
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
			case EmbeddedPackage.EMBEDDER__FIRST_EMBEDDED:
				setFirstEmbedded((Embeddable)newValue);
				return;
			case EmbeddedPackage.EMBEDDER__SECOND_EMBEDDED:
				setSecondEmbedded((Embeddable)newValue);
				return;
			case EmbeddedPackage.EMBEDDER__THIRD_EMBEDDED:
				setThirdEmbedded((Embeddable)newValue);
				return;
			case EmbeddedPackage.EMBEDDER__FOURTH_EMBEDDED:
				getFourthEmbedded().clear();
				getFourthEmbedded().addAll((Collection)newValue);
				return;
			case EmbeddedPackage.EMBEDDER__FIFTH_EMBEDDED:
				setFifthEmbedded((Embeddable)newValue);
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
			case EmbeddedPackage.EMBEDDER__FIRST_EMBEDDED:
				setFirstEmbedded((Embeddable)null);
				return;
			case EmbeddedPackage.EMBEDDER__SECOND_EMBEDDED:
				setSecondEmbedded((Embeddable)null);
				return;
			case EmbeddedPackage.EMBEDDER__THIRD_EMBEDDED:
				setThirdEmbedded((Embeddable)null);
				return;
			case EmbeddedPackage.EMBEDDER__FOURTH_EMBEDDED:
				getFourthEmbedded().clear();
				return;
			case EmbeddedPackage.EMBEDDER__FIFTH_EMBEDDED:
				setFifthEmbedded((Embeddable)null);
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
			case EmbeddedPackage.EMBEDDER__FIRST_EMBEDDED:
				return firstEmbedded != null;
			case EmbeddedPackage.EMBEDDER__SECOND_EMBEDDED:
				return secondEmbedded != null;
			case EmbeddedPackage.EMBEDDER__THIRD_EMBEDDED:
				return thirdEmbedded != null;
			case EmbeddedPackage.EMBEDDER__FOURTH_EMBEDDED:
				return fourthEmbedded != null && !fourthEmbedded.isEmpty();
			case EmbeddedPackage.EMBEDDER__FIFTH_EMBEDDED:
				return fifthEmbedded != null;
		}
		return super.eIsSet(featureID);
	}

} //EmbedderImpl

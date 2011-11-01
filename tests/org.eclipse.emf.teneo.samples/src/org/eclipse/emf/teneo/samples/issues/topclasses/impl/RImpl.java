/**
 * <copyright>
 * </copyright>
 *
 * $Id: RImpl.java,v 1.1 2006/07/11 16:57:03 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.topclasses.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.teneo.samples.issues.topclasses.MList;
import org.eclipse.emf.teneo.samples.issues.topclasses.PList;
import org.eclipse.emf.teneo.samples.issues.topclasses.R;
import org.eclipse.emf.teneo.samples.issues.topclasses.TopclassesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>R</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.topclasses.impl.RImpl#getPlist <em>Plist</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.topclasses.impl.RImpl#getMlist <em>Mlist</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RImpl extends AbstractSuperImpl implements R {
	/**
	 * The cached value of the '{@link #getPlist() <em>Plist</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlist()
	 * @generated
	 * @ordered
	 */
	protected PList plist = null;

	/**
	 * The cached value of the '{@link #getMlist() <em>Mlist</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMlist()
	 * @generated
	 * @ordered
	 */
	protected MList mlist = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return TopclassesPackage.eINSTANCE.getR();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PList getPlist() {
		return plist;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlist(PList newPlist, NotificationChain msgs) {
		PList oldPlist = plist;
		plist = newPlist;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TopclassesPackage.R__PLIST, oldPlist, newPlist);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlist(PList newPlist) {
		if (newPlist != plist) {
			NotificationChain msgs = null;
			if (plist != null)
				msgs = ((InternalEObject)plist).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TopclassesPackage.R__PLIST, null, msgs);
			if (newPlist != null)
				msgs = ((InternalEObject)newPlist).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TopclassesPackage.R__PLIST, null, msgs);
			msgs = basicSetPlist(newPlist, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TopclassesPackage.R__PLIST, newPlist, newPlist));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MList getMlist() {
		return mlist;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMlist(MList newMlist, NotificationChain msgs) {
		MList oldMlist = mlist;
		mlist = newMlist;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TopclassesPackage.R__MLIST, oldMlist, newMlist);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMlist(MList newMlist) {
		if (newMlist != mlist) {
			NotificationChain msgs = null;
			if (mlist != null)
				msgs = ((InternalEObject)mlist).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TopclassesPackage.R__MLIST, null, msgs);
			if (newMlist != null)
				msgs = ((InternalEObject)newMlist).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TopclassesPackage.R__MLIST, null, msgs);
			msgs = basicSetMlist(newMlist, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TopclassesPackage.R__MLIST, newMlist, newMlist));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case TopclassesPackage.R__PLIST:
					return basicSetPlist(null, msgs);
				case TopclassesPackage.R__MLIST:
					return basicSetMlist(null, msgs);
				default:
					return eDynamicInverseRemove(otherEnd, featureID, baseClass, msgs);
			}
		}
		return eBasicSetContainer(null, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case TopclassesPackage.R__NAME:
				return getName();
			case TopclassesPackage.R__PLIST:
				return getPlist();
			case TopclassesPackage.R__MLIST:
				return getMlist();
		}
		return eDynamicGet(eFeature, resolve);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(EStructuralFeature eFeature, Object newValue) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case TopclassesPackage.R__NAME:
				setName((String)newValue);
				return;
			case TopclassesPackage.R__PLIST:
				setPlist((PList)newValue);
				return;
			case TopclassesPackage.R__MLIST:
				setMlist((MList)newValue);
				return;
		}
		eDynamicSet(eFeature, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case TopclassesPackage.R__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TopclassesPackage.R__PLIST:
				setPlist((PList)null);
				return;
			case TopclassesPackage.R__MLIST:
				setMlist((MList)null);
				return;
		}
		eDynamicUnset(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case TopclassesPackage.R__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TopclassesPackage.R__PLIST:
				return plist != null;
			case TopclassesPackage.R__MLIST:
				return mlist != null;
		}
		return eDynamicIsSet(eFeature);
	}

} //RImpl

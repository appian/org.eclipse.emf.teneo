/**
 * <copyright>
 * </copyright>
 *
 * $Id: MainImpl.java,v 1.1 2006/07/11 16:57:11 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.relation.relationntom.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.emf.teneo.samples.emf.relation.relationntom.Main;
import org.eclipse.emf.teneo.samples.emf.relation.relationntom.MultiNN;
import org.eclipse.emf.teneo.samples.emf.relation.relationntom.MultiNR;
import org.eclipse.emf.teneo.samples.emf.relation.relationntom.MultiRN;
import org.eclipse.emf.teneo.samples.emf.relation.relationntom.RelationntomPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Main</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.relation.relationntom.impl.MainImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.relation.relationntom.impl.MainImpl#getMultinr <em>Multinr</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.relation.relationntom.impl.MainImpl#getMultirn <em>Multirn</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.relation.relationntom.impl.MainImpl#getMultinn <em>Multinn</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MainImpl extends EObjectImpl implements Main {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "c1";

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
	 * This is true if the Name attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nameESet = false;

	/**
	 * The cached value of the '{@link #getMultinr() <em>Multinr</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultinr()
	 * @generated
	 * @ordered
	 */
	protected EList multinr = null;

	/**
	 * The cached value of the '{@link #getMultirn() <em>Multirn</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultirn()
	 * @generated
	 * @ordered
	 */
	protected EList multirn = null;

	/**
	 * The cached value of the '{@link #getMultinn() <em>Multinn</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultinn()
	 * @generated
	 * @ordered
	 */
	protected EList multinn = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MainImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return RelationntomPackage.eINSTANCE.getMain();
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
		boolean oldNameESet = nameESet;
		nameESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelationntomPackage.MAIN__NAME, oldName, name, !oldNameESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetName() {
		String oldName = name;
		boolean oldNameESet = nameESet;
		name = NAME_EDEFAULT;
		nameESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, RelationntomPackage.MAIN__NAME, oldName, NAME_EDEFAULT, oldNameESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetName() {
		return nameESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getMultinr() {
		if (multinr == null) {
			multinr = new EObjectWithInverseEList.ManyInverse(MultiNR.class, this, RelationntomPackage.MAIN__MULTINR, RelationntomPackage.MULTI_NR__MAIN);
		}
		return multinr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getMultirn() {
		if (multirn == null) {
			multirn = new EObjectWithInverseEList.ManyInverse(MultiRN.class, this, RelationntomPackage.MAIN__MULTIRN, RelationntomPackage.MULTI_RN__MAIN);
		}
		return multirn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getMultinn() {
		if (multinn == null) {
			multinn = new EObjectWithInverseEList.ManyInverse(MultiNN.class, this, RelationntomPackage.MAIN__MULTINN, RelationntomPackage.MULTI_NN__MAIN);
		}
		return multinn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case RelationntomPackage.MAIN__MULTINR:
					return ((InternalEList)getMultinr()).basicAdd(otherEnd, msgs);
				case RelationntomPackage.MAIN__MULTIRN:
					return ((InternalEList)getMultirn()).basicAdd(otherEnd, msgs);
				case RelationntomPackage.MAIN__MULTINN:
					return ((InternalEList)getMultinn()).basicAdd(otherEnd, msgs);
				default:
					return eDynamicInverseAdd(otherEnd, featureID, baseClass, msgs);
			}
		}
		if (eContainer != null)
			msgs = eBasicRemoveFromContainer(msgs);
		return eBasicSetContainer(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case RelationntomPackage.MAIN__MULTINR:
					return ((InternalEList)getMultinr()).basicRemove(otherEnd, msgs);
				case RelationntomPackage.MAIN__MULTIRN:
					return ((InternalEList)getMultirn()).basicRemove(otherEnd, msgs);
				case RelationntomPackage.MAIN__MULTINN:
					return ((InternalEList)getMultinn()).basicRemove(otherEnd, msgs);
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
			case RelationntomPackage.MAIN__NAME:
				return getName();
			case RelationntomPackage.MAIN__MULTINR:
				return getMultinr();
			case RelationntomPackage.MAIN__MULTIRN:
				return getMultirn();
			case RelationntomPackage.MAIN__MULTINN:
				return getMultinn();
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
			case RelationntomPackage.MAIN__NAME:
				setName((String)newValue);
				return;
			case RelationntomPackage.MAIN__MULTINR:
				getMultinr().clear();
				getMultinr().addAll((Collection)newValue);
				return;
			case RelationntomPackage.MAIN__MULTIRN:
				getMultirn().clear();
				getMultirn().addAll((Collection)newValue);
				return;
			case RelationntomPackage.MAIN__MULTINN:
				getMultinn().clear();
				getMultinn().addAll((Collection)newValue);
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
			case RelationntomPackage.MAIN__NAME:
				unsetName();
				return;
			case RelationntomPackage.MAIN__MULTINR:
				getMultinr().clear();
				return;
			case RelationntomPackage.MAIN__MULTIRN:
				getMultirn().clear();
				return;
			case RelationntomPackage.MAIN__MULTINN:
				getMultinn().clear();
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
			case RelationntomPackage.MAIN__NAME:
				return isSetName();
			case RelationntomPackage.MAIN__MULTINR:
				return multinr != null && !multinr.isEmpty();
			case RelationntomPackage.MAIN__MULTIRN:
				return multirn != null && !multirn.isEmpty();
			case RelationntomPackage.MAIN__MULTINN:
				return multinn != null && !multinn.isEmpty();
		}
		return eDynamicIsSet(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		if (nameESet) result.append(name); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //MainImpl

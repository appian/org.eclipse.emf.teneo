/**
 * <copyright>
 * </copyright>
 *
 * $Id: PTypeImpl.java,v 1.1 2006/07/11 16:57:08 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.sample.inv.impl;


import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.teneo.samples.emf.sample.inv.InventoryPackage;
import org.eclipse.emf.teneo.samples.emf.sample.inv.PDeclaration;
import org.eclipse.emf.teneo.samples.emf.sample.inv.PType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PType</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.inv.impl.PTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.inv.impl.PTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.inv.impl.PTypeImpl#getBase <em>Base</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.inv.impl.PTypeImpl#getSubTypes <em>Sub Types</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.inv.impl.PTypeImpl#getSubNOTypes <em>Sub NO Types</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.inv.impl.PTypeImpl#getInfoReferences <em>Info References</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PTypeImpl extends EObjectImpl implements PType {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final long ID_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected long id = ID_EDEFAULT;

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
	 * The cached value of the '{@link #getBase() <em>Base</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase()
	 * @generated
	 * @ordered
	 */
	protected PType base = null;

	/**
	 * The cached value of the '{@link #getSubTypes() <em>Sub Types</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubTypes()
	 * @generated
	 * @ordered
	 */
	protected EList subTypes = null;

	/**
	 * The cached value of the '{@link #getSubNOTypes() <em>Sub NO Types</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubNOTypes()
	 * @generated
	 * @ordered
	 */
	protected EList subNOTypes = null;

	/**
	 * The cached value of the '{@link #getInfoReferences() <em>Info References</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInfoReferences()
	 * @generated
	 * @ordered
	 */
	protected EList infoReferences = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return InventoryPackage.Literals.PTYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(long newId) {
		long oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InventoryPackage.PTYPE__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, InventoryPackage.PTYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PType getBase() {
		if (base != null && base.eIsProxy()) {
			InternalEObject oldBase = (InternalEObject)base;
			base = (PType)eResolveProxy(oldBase);
			if (base != oldBase) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InventoryPackage.PTYPE__BASE, oldBase, base));
			}
		}
		return base;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PType basicGetBase() {
		return base;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBase(PType newBase, NotificationChain msgs) {
		PType oldBase = base;
		base = newBase;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InventoryPackage.PTYPE__BASE, oldBase, newBase);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase(PType newBase) {
		if (newBase != base) {
			NotificationChain msgs = null;
			if (base != null)
				msgs = ((InternalEObject)base).eInverseRemove(this, InventoryPackage.PTYPE__SUB_TYPES, PType.class, msgs);
			if (newBase != null)
				msgs = ((InternalEObject)newBase).eInverseAdd(this, InventoryPackage.PTYPE__SUB_TYPES, PType.class, msgs);
			msgs = basicSetBase(newBase, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InventoryPackage.PTYPE__BASE, newBase, newBase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getSubTypes() {
		if (subTypes == null) {
			subTypes = new EObjectWithInverseResolvingEList(PType.class, this, InventoryPackage.PTYPE__SUB_TYPES, InventoryPackage.PTYPE__BASE);
		}
		return subTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getSubNOTypes() {
		if (subNOTypes == null) {
			subNOTypes = new EObjectResolvingEList(PType.class, this, InventoryPackage.PTYPE__SUB_NO_TYPES);
		}
		return subNOTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getInfoReferences() {
		if (infoReferences == null) {
			infoReferences = new EObjectResolvingEList(PDeclaration.class, this, InventoryPackage.PTYPE__INFO_REFERENCES);
		}
		return infoReferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InventoryPackage.PTYPE__BASE:
				if (base != null)
					msgs = ((InternalEObject)base).eInverseRemove(this, InventoryPackage.PTYPE__SUB_TYPES, PType.class, msgs);
				return basicSetBase((PType)otherEnd, msgs);
			case InventoryPackage.PTYPE__SUB_TYPES:
				return ((InternalEList)getSubTypes()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InventoryPackage.PTYPE__BASE:
				return basicSetBase(null, msgs);
			case InventoryPackage.PTYPE__SUB_TYPES:
				return ((InternalEList)getSubTypes()).basicRemove(otherEnd, msgs);
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
			case InventoryPackage.PTYPE__ID:
				return new Long(getId());
			case InventoryPackage.PTYPE__NAME:
				return getName();
			case InventoryPackage.PTYPE__BASE:
				if (resolve) return getBase();
				return basicGetBase();
			case InventoryPackage.PTYPE__SUB_TYPES:
				return getSubTypes();
			case InventoryPackage.PTYPE__SUB_NO_TYPES:
				return getSubNOTypes();
			case InventoryPackage.PTYPE__INFO_REFERENCES:
				return getInfoReferences();
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
			case InventoryPackage.PTYPE__ID:
				setId(((Long)newValue).longValue());
				return;
			case InventoryPackage.PTYPE__NAME:
				setName((String)newValue);
				return;
			case InventoryPackage.PTYPE__BASE:
				setBase((PType)newValue);
				return;
			case InventoryPackage.PTYPE__SUB_TYPES:
				getSubTypes().clear();
				getSubTypes().addAll((Collection)newValue);
				return;
			case InventoryPackage.PTYPE__SUB_NO_TYPES:
				getSubNOTypes().clear();
				getSubNOTypes().addAll((Collection)newValue);
				return;
			case InventoryPackage.PTYPE__INFO_REFERENCES:
				getInfoReferences().clear();
				getInfoReferences().addAll((Collection)newValue);
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
			case InventoryPackage.PTYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case InventoryPackage.PTYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case InventoryPackage.PTYPE__BASE:
				setBase((PType)null);
				return;
			case InventoryPackage.PTYPE__SUB_TYPES:
				getSubTypes().clear();
				return;
			case InventoryPackage.PTYPE__SUB_NO_TYPES:
				getSubNOTypes().clear();
				return;
			case InventoryPackage.PTYPE__INFO_REFERENCES:
				getInfoReferences().clear();
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
			case InventoryPackage.PTYPE__ID:
				return id != ID_EDEFAULT;
			case InventoryPackage.PTYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case InventoryPackage.PTYPE__BASE:
				return base != null;
			case InventoryPackage.PTYPE__SUB_TYPES:
				return subTypes != null && !subTypes.isEmpty();
			case InventoryPackage.PTYPE__SUB_NO_TYPES:
				return subNOTypes != null && !subNOTypes.isEmpty();
			case InventoryPackage.PTYPE__INFO_REFERENCES:
				return infoReferences != null && !infoReferences.isEmpty();
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
		result.append(" (id: ");
		result.append(id);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //PTypeImpl

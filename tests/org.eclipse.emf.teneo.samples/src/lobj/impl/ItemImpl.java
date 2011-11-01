/**
 * <copyright>
 * </copyright>
 *
 * $Id: ItemImpl.java,v 1.3 2007/03/28 13:56:53 mtaal Exp $
 */
package lobj.impl;

import java.util.Collection;

import lobj.CorrBlock;
import lobj.Item;
import lobj.LobjPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link lobj.impl.ItemImpl#getCorrBlock <em>Corr Block</em>}</li>
 *   <li>{@link lobj.impl.ItemImpl#getChilditems <em>Childitems</em>}</li>
 *   <li>{@link lobj.impl.ItemImpl#getLuRef <em>Lu Ref</em>}</li>
 *   <li>{@link lobj.impl.ItemImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ItemImpl extends EObjectImpl implements Item {
	/**
	 * The cached value of the '{@link #getCorrBlock() <em>Corr Block</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorrBlock()
	 * @generated
	 * @ordered
	 */
	protected EList corrBlock = null;

	/**
	 * The cached value of the '{@link #getChilditems() <em>Childitems</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChilditems()
	 * @generated
	 * @ordered
	 */
	protected EList childitems = null;

	/**
	 * The default value of the '{@link #getLuRef() <em>Lu Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLuRef()
	 * @generated
	 * @ordered
	 */
	protected static final String LU_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLuRef() <em>Lu Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLuRef()
	 * @generated
	 * @ordered
	 */
	protected String luRef = LU_REF_EDEFAULT;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return LobjPackage.Literals.ITEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getCorrBlock() {
		if (corrBlock == null) {
			corrBlock = new EObjectContainmentEList(CorrBlock.class, this, LobjPackage.ITEM__CORR_BLOCK);
		}
		return corrBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getChilditems() {
		if (childitems == null) {
			childitems = new EObjectContainmentEList(Item.class, this, LobjPackage.ITEM__CHILDITEMS);
		}
		return childitems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLuRef() {
		return luRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLuRef(String newLuRef) {
		String oldLuRef = luRef;
		luRef = newLuRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LobjPackage.ITEM__LU_REF, oldLuRef, luRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LobjPackage.ITEM__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LobjPackage.ITEM__CORR_BLOCK:
				return ((InternalEList)getCorrBlock()).basicRemove(otherEnd, msgs);
			case LobjPackage.ITEM__CHILDITEMS:
				return ((InternalEList)getChilditems()).basicRemove(otherEnd, msgs);
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
			case LobjPackage.ITEM__CORR_BLOCK:
				return getCorrBlock();
			case LobjPackage.ITEM__CHILDITEMS:
				return getChilditems();
			case LobjPackage.ITEM__LU_REF:
				return getLuRef();
			case LobjPackage.ITEM__ID:
				return getId();
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
			case LobjPackage.ITEM__CORR_BLOCK:
				getCorrBlock().clear();
				getCorrBlock().addAll((Collection)newValue);
				return;
			case LobjPackage.ITEM__CHILDITEMS:
				getChilditems().clear();
				getChilditems().addAll((Collection)newValue);
				return;
			case LobjPackage.ITEM__LU_REF:
				setLuRef((String)newValue);
				return;
			case LobjPackage.ITEM__ID:
				setId((String)newValue);
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
			case LobjPackage.ITEM__CORR_BLOCK:
				getCorrBlock().clear();
				return;
			case LobjPackage.ITEM__CHILDITEMS:
				getChilditems().clear();
				return;
			case LobjPackage.ITEM__LU_REF:
				setLuRef(LU_REF_EDEFAULT);
				return;
			case LobjPackage.ITEM__ID:
				setId(ID_EDEFAULT);
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
			case LobjPackage.ITEM__CORR_BLOCK:
				return corrBlock != null && !corrBlock.isEmpty();
			case LobjPackage.ITEM__CHILDITEMS:
				return childitems != null && !childitems.isEmpty();
			case LobjPackage.ITEM__LU_REF:
				return LU_REF_EDEFAULT == null ? luRef != null : !LU_REF_EDEFAULT.equals(luRef);
			case LobjPackage.ITEM__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
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
		result.append(" (luRef: ");
		result.append(luRef);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //ItemImpl

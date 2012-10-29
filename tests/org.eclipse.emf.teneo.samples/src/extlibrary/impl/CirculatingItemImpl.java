/**
 * <copyright>
 * </copyright>
 *
 * $Id: CirculatingItemImpl.java,v 1.1 2006/08/14 05:08:59 mtaal Exp $
 */
package extlibrary.impl;

import extlibrary.Borrower;
import extlibrary.CirculatingItem;
import extlibrary.ExtlibraryPackage;
import extlibrary.Lendable;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Circulating Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link extlibrary.impl.CirculatingItemImpl#getCopies <em>Copies</em>}</li>
 * <li>{@link extlibrary.impl.CirculatingItemImpl#getBorrowers <em>Borrowers</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public abstract class CirculatingItemImpl extends ItemImpl implements CirculatingItem {
	/**
	 * The default value of the '{@link #getCopies() <em>Copies</em>}' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @see #getCopies()
	 * @generated
	 * @ordered
	 */
	protected static final int COPIES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCopies() <em>Copies</em>}' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @see #getCopies()
	 * @generated
	 * @ordered
	 */
	protected int copies = COPIES_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBorrowers() <em>Borrowers</em>}' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getBorrowers()
	 * @generated
	 * @ordered
	 */
	protected EList borrowers = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected CirculatingItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ExtlibraryPackage.Literals.CIRCULATING_ITEM;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public int getCopies() {
		return copies;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setCopies(int newCopies) {
		int oldCopies = copies;
		copies = newCopies;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ExtlibraryPackage.CIRCULATING_ITEM__COPIES, oldCopies, copies));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList getBorrowers() {
		if (borrowers == null) {
			borrowers = new EObjectWithInverseResolvingEList.ManyInverse(Borrower.class, this,
					ExtlibraryPackage.CIRCULATING_ITEM__BORROWERS, ExtlibraryPackage.BORROWER__BORROWED);
		}
		return borrowers;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID,
			NotificationChain msgs) {
		switch (featureID) {
		case ExtlibraryPackage.CIRCULATING_ITEM__BORROWERS:
			return ((InternalEList) getBorrowers()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID,
			NotificationChain msgs) {
		switch (featureID) {
		case ExtlibraryPackage.CIRCULATING_ITEM__BORROWERS:
			return ((InternalEList) getBorrowers()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ExtlibraryPackage.CIRCULATING_ITEM__COPIES:
			return new Integer(getCopies());
		case ExtlibraryPackage.CIRCULATING_ITEM__BORROWERS:
			return getBorrowers();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ExtlibraryPackage.CIRCULATING_ITEM__COPIES:
			setCopies(((Integer) newValue).intValue());
			return;
		case ExtlibraryPackage.CIRCULATING_ITEM__BORROWERS:
			getBorrowers().clear();
			getBorrowers().addAll((Collection) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
		case ExtlibraryPackage.CIRCULATING_ITEM__COPIES:
			setCopies(COPIES_EDEFAULT);
			return;
		case ExtlibraryPackage.CIRCULATING_ITEM__BORROWERS:
			getBorrowers().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case ExtlibraryPackage.CIRCULATING_ITEM__COPIES:
			return copies != COPIES_EDEFAULT;
		case ExtlibraryPackage.CIRCULATING_ITEM__BORROWERS:
			return borrowers != null && !borrowers.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class baseClass) {
		if (baseClass == Lendable.class) {
			switch (derivedFeatureID) {
			case ExtlibraryPackage.CIRCULATING_ITEM__COPIES:
				return ExtlibraryPackage.LENDABLE__COPIES;
			case ExtlibraryPackage.CIRCULATING_ITEM__BORROWERS:
				return ExtlibraryPackage.LENDABLE__BORROWERS;
			default:
				return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class baseClass) {
		if (baseClass == Lendable.class) {
			switch (baseFeatureID) {
			case ExtlibraryPackage.LENDABLE__COPIES:
				return ExtlibraryPackage.CIRCULATING_ITEM__COPIES;
			case ExtlibraryPackage.LENDABLE__BORROWERS:
				return ExtlibraryPackage.CIRCULATING_ITEM__BORROWERS;
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (copies: ");
		result.append(copies);
		result.append(')');
		return result.toString();
	}

} // CirculatingItemImpl
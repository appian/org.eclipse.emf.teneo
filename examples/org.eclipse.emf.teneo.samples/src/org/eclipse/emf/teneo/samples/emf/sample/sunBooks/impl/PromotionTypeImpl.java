/**
 * <copyright>
 * </copyright>
 *
 * $Id: PromotionTypeImpl.java,v 1.2 2007/02/08 23:09:19 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.sample.sunBooks.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.teneo.samples.emf.sample.sunBooks.PromotionType;
import org.eclipse.emf.teneo.samples.emf.sample.sunBooks.SunBooksPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Promotion Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.sunBooks.impl.PromotionTypeImpl#getDiscount <em>Discount</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.sunBooks.impl.PromotionTypeImpl#getNone <em>None</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PromotionTypeImpl extends EObjectImpl implements PromotionType {
	/**
	 * The default value of the '{@link #getDiscount() <em>Discount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscount()
	 * @generated
	 * @ordered
	 */
	protected static final String DISCOUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDiscount() <em>Discount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscount()
	 * @generated
	 * @ordered
	 */
	protected String discount = DISCOUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getNone() <em>None</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNone()
	 * @generated
	 * @ordered
	 */
	protected static final String NONE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNone() <em>None</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNone()
	 * @generated
	 * @ordered
	 */
	protected String none = NONE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PromotionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SunBooksPackage.Literals.PROMOTION_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDiscount() {
		return discount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiscount(String newDiscount) {
		String oldDiscount = discount;
		discount = newDiscount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SunBooksPackage.PROMOTION_TYPE__DISCOUNT, oldDiscount, discount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNone() {
		return none;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNone(String newNone) {
		String oldNone = none;
		none = newNone;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SunBooksPackage.PROMOTION_TYPE__NONE, oldNone, none));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SunBooksPackage.PROMOTION_TYPE__DISCOUNT:
				return getDiscount();
			case SunBooksPackage.PROMOTION_TYPE__NONE:
				return getNone();
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
			case SunBooksPackage.PROMOTION_TYPE__DISCOUNT:
				setDiscount((String)newValue);
				return;
			case SunBooksPackage.PROMOTION_TYPE__NONE:
				setNone((String)newValue);
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
			case SunBooksPackage.PROMOTION_TYPE__DISCOUNT:
				setDiscount(DISCOUNT_EDEFAULT);
				return;
			case SunBooksPackage.PROMOTION_TYPE__NONE:
				setNone(NONE_EDEFAULT);
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
			case SunBooksPackage.PROMOTION_TYPE__DISCOUNT:
				return DISCOUNT_EDEFAULT == null ? discount != null : !DISCOUNT_EDEFAULT.equals(discount);
			case SunBooksPackage.PROMOTION_TYPE__NONE:
				return NONE_EDEFAULT == null ? none != null : !NONE_EDEFAULT.equals(none);
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
		result.append(" (discount: ");
		result.append(discount);
		result.append(", none: ");
		result.append(none);
		result.append(')');
		return result.toString();
	}

} //PromotionTypeImpl

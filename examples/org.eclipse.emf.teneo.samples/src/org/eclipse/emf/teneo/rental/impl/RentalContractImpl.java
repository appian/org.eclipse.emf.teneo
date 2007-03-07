/**
 * <copyright>
 * </copyright>
 *
 * $Id: RentalContractImpl.java,v 1.1 2007/03/07 23:34:09 mtaal Exp $
 */
package org.eclipse.emf.teneo.rental.impl;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectEList;

import org.eclipse.emf.teneo.rental.RentalContract;
import org.eclipse.emf.teneo.rental.RentalPackage;
import org.eclipse.emf.teneo.rental.RentalUnit;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contract</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.rental.impl.RentalContractImpl#getRentToBusinessPartner <em>Rent To Business Partner</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.rental.impl.RentalContractImpl#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.rental.impl.RentalContractImpl#getEndDate <em>End Date</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.rental.impl.RentalContractImpl#getCost <em>Cost</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.rental.impl.RentalContractImpl#getRentalUnits <em>Rental Units</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RentalContractImpl extends EObjectImpl implements RentalContract {
	/**
	 * The default value of the '{@link #getRentToBusinessPartner() <em>Rent To Business Partner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRentToBusinessPartner()
	 * @generated
	 * @ordered
	 */
	protected static final String RENT_TO_BUSINESS_PARTNER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRentToBusinessPartner() <em>Rent To Business Partner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRentToBusinessPartner()
	 * @generated
	 * @ordered
	 */
	protected String rentToBusinessPartner = RENT_TO_BUSINESS_PARTNER_EDEFAULT;

	/**
	 * The default value of the '{@link #getStartDate() <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date START_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartDate() <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartDate()
	 * @generated
	 * @ordered
	 */
	protected Date startDate = START_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndDate() <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date END_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndDate() <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndDate()
	 * @generated
	 * @ordered
	 */
	protected Date endDate = END_DATE_EDEFAULT;

	/**
	 * This is true if the End Date attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean endDateESet = false;

	/**
	 * The default value of the '{@link #getCost() <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCost()
	 * @generated
	 * @ordered
	 */
	protected static final float COST_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getCost() <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCost()
	 * @generated
	 * @ordered
	 */
	protected float cost = COST_EDEFAULT;

	/**
	 * This is true if the Cost attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean costESet = false;

	/**
	 * The cached value of the '{@link #getRentalUnits() <em>Rental Units</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRentalUnits()
	 * @generated
	 * @ordered
	 */
	protected EList<RentalUnit> rentalUnits = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RentalContractImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RentalPackage.Literals.RENTAL_CONTRACT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRentToBusinessPartner() {
		return rentToBusinessPartner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRentToBusinessPartner(String newRentToBusinessPartner) {
		String oldRentToBusinessPartner = rentToBusinessPartner;
		rentToBusinessPartner = newRentToBusinessPartner;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RentalPackage.RENTAL_CONTRACT__RENT_TO_BUSINESS_PARTNER, oldRentToBusinessPartner, rentToBusinessPartner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getStartDate() {
		return startDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartDate(Date newStartDate) {
		Date oldStartDate = startDate;
		startDate = newStartDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RentalPackage.RENTAL_CONTRACT__START_DATE, oldStartDate, startDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getEndDate() {
		return endDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndDate(Date newEndDate) {
		Date oldEndDate = endDate;
		endDate = newEndDate;
		boolean oldEndDateESet = endDateESet;
		endDateESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RentalPackage.RENTAL_CONTRACT__END_DATE, oldEndDate, endDate, !oldEndDateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEndDate() {
		Date oldEndDate = endDate;
		boolean oldEndDateESet = endDateESet;
		endDate = END_DATE_EDEFAULT;
		endDateESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, RentalPackage.RENTAL_CONTRACT__END_DATE, oldEndDate, END_DATE_EDEFAULT, oldEndDateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEndDate() {
		return endDateESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getCost() {
		return cost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCost(float newCost) {
		float oldCost = cost;
		cost = newCost;
		boolean oldCostESet = costESet;
		costESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RentalPackage.RENTAL_CONTRACT__COST, oldCost, cost, !oldCostESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCost() {
		float oldCost = cost;
		boolean oldCostESet = costESet;
		cost = COST_EDEFAULT;
		costESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, RentalPackage.RENTAL_CONTRACT__COST, oldCost, COST_EDEFAULT, oldCostESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCost() {
		return costESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RentalUnit> getRentalUnits() {
		if (rentalUnits == null) {
			rentalUnits = new EObjectEList<RentalUnit>(RentalUnit.class, this, RentalPackage.RENTAL_CONTRACT__RENTAL_UNITS);
		}
		return rentalUnits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RentalPackage.RENTAL_CONTRACT__RENT_TO_BUSINESS_PARTNER:
				return getRentToBusinessPartner();
			case RentalPackage.RENTAL_CONTRACT__START_DATE:
				return getStartDate();
			case RentalPackage.RENTAL_CONTRACT__END_DATE:
				return getEndDate();
			case RentalPackage.RENTAL_CONTRACT__COST:
				return new Float(getCost());
			case RentalPackage.RENTAL_CONTRACT__RENTAL_UNITS:
				return getRentalUnits();
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
			case RentalPackage.RENTAL_CONTRACT__RENT_TO_BUSINESS_PARTNER:
				setRentToBusinessPartner((String)newValue);
				return;
			case RentalPackage.RENTAL_CONTRACT__START_DATE:
				setStartDate((Date)newValue);
				return;
			case RentalPackage.RENTAL_CONTRACT__END_DATE:
				setEndDate((Date)newValue);
				return;
			case RentalPackage.RENTAL_CONTRACT__COST:
				setCost(((Float)newValue).floatValue());
				return;
			case RentalPackage.RENTAL_CONTRACT__RENTAL_UNITS:
				getRentalUnits().clear();
				getRentalUnits().addAll((Collection<? extends RentalUnit>)newValue);
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
			case RentalPackage.RENTAL_CONTRACT__RENT_TO_BUSINESS_PARTNER:
				setRentToBusinessPartner(RENT_TO_BUSINESS_PARTNER_EDEFAULT);
				return;
			case RentalPackage.RENTAL_CONTRACT__START_DATE:
				setStartDate(START_DATE_EDEFAULT);
				return;
			case RentalPackage.RENTAL_CONTRACT__END_DATE:
				unsetEndDate();
				return;
			case RentalPackage.RENTAL_CONTRACT__COST:
				unsetCost();
				return;
			case RentalPackage.RENTAL_CONTRACT__RENTAL_UNITS:
				getRentalUnits().clear();
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
			case RentalPackage.RENTAL_CONTRACT__RENT_TO_BUSINESS_PARTNER:
				return RENT_TO_BUSINESS_PARTNER_EDEFAULT == null ? rentToBusinessPartner != null : !RENT_TO_BUSINESS_PARTNER_EDEFAULT.equals(rentToBusinessPartner);
			case RentalPackage.RENTAL_CONTRACT__START_DATE:
				return START_DATE_EDEFAULT == null ? startDate != null : !START_DATE_EDEFAULT.equals(startDate);
			case RentalPackage.RENTAL_CONTRACT__END_DATE:
				return isSetEndDate();
			case RentalPackage.RENTAL_CONTRACT__COST:
				return isSetCost();
			case RentalPackage.RENTAL_CONTRACT__RENTAL_UNITS:
				return rentalUnits != null && !rentalUnits.isEmpty();
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
		result.append(" (rentToBusinessPartner: ");
		result.append(rentToBusinessPartner);
		result.append(", startDate: ");
		result.append(startDate);
		result.append(", endDate: ");
		if (endDateESet) result.append(endDate); else result.append("<unset>");
		result.append(", cost: ");
		if (costESet) result.append(cost); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //RentalContractImpl

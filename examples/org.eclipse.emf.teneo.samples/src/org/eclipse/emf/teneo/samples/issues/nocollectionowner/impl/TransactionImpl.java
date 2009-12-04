/**
 * <copyright>
 * </copyright>
 *
 * $Id: TransactionImpl.java,v 1.1 2009/12/04 15:06:55 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.nocollectionowner.impl;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import org.eclipse.emf.teneo.samples.issues.nocollectionowner.NoCollectionOwnerPackage;
import org.eclipse.emf.teneo.samples.issues.nocollectionowner.Order;
import org.eclipse.emf.teneo.samples.issues.nocollectionowner.Product;
import org.eclipse.emf.teneo.samples.issues.nocollectionowner.Transaction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transaction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.nocollectionowner.impl.TransactionImpl#getNumber <em>Number</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.nocollectionowner.impl.TransactionImpl#getOrder <em>Order</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.nocollectionowner.impl.TransactionImpl#getProduct <em>Product</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.nocollectionowner.impl.TransactionImpl#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.nocollectionowner.impl.TransactionImpl#getEndDate <em>End Date</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.nocollectionowner.impl.TransactionImpl#getPrice <em>Price</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.nocollectionowner.impl.TransactionImpl#getPaidDate <em>Paid Date</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TransactionImpl extends EObjectImpl implements Transaction {
	/**
	 * The default value of the '{@link #getNumber() <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumber() <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected String number = NUMBER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProduct() <em>Product</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProduct()
	 * @generated
	 * @ordered
	 */
	protected Product product;

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
	 * The default value of the '{@link #getPrice() <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrice()
	 * @generated
	 * @ordered
	 */
	protected static final double PRICE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPrice() <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrice()
	 * @generated
	 * @ordered
	 */
	protected double price = PRICE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPaidDate() <em>Paid Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaidDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date PAID_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPaidDate() <em>Paid Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaidDate()
	 * @generated
	 * @ordered
	 */
	protected Date paidDate = PAID_DATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransactionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NoCollectionOwnerPackage.Literals.TRANSACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNumber() {
		return number;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumber(String newNumber) {
		String oldNumber = number;
		number = newNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NoCollectionOwnerPackage.TRANSACTION__NUMBER, oldNumber, number));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Order getOrder() {
		if (eContainerFeatureID() != NoCollectionOwnerPackage.TRANSACTION__ORDER) return null;
		return (Order)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrder(Order newOrder, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOrder, NoCollectionOwnerPackage.TRANSACTION__ORDER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrder(Order newOrder) {
		if (newOrder != eInternalContainer() || (eContainerFeatureID() != NoCollectionOwnerPackage.TRANSACTION__ORDER && newOrder != null)) {
			if (EcoreUtil.isAncestor(this, newOrder))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOrder != null)
				msgs = ((InternalEObject)newOrder).eInverseAdd(this, NoCollectionOwnerPackage.ORDER__TRANSACTIONS, Order.class, msgs);
			msgs = basicSetOrder(newOrder, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NoCollectionOwnerPackage.TRANSACTION__ORDER, newOrder, newOrder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Product getProduct() {
		if (product != null && product.eIsProxy()) {
			InternalEObject oldProduct = (InternalEObject)product;
			product = (Product)eResolveProxy(oldProduct);
			if (product != oldProduct) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, NoCollectionOwnerPackage.TRANSACTION__PRODUCT, oldProduct, product));
			}
		}
		return product;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Product basicGetProduct() {
		return product;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProduct(Product newProduct) {
		Product oldProduct = product;
		product = newProduct;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NoCollectionOwnerPackage.TRANSACTION__PRODUCT, oldProduct, product));
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
			eNotify(new ENotificationImpl(this, Notification.SET, NoCollectionOwnerPackage.TRANSACTION__START_DATE, oldStartDate, startDate));
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
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NoCollectionOwnerPackage.TRANSACTION__END_DATE, oldEndDate, endDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrice(double newPrice) {
		double oldPrice = price;
		price = newPrice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NoCollectionOwnerPackage.TRANSACTION__PRICE, oldPrice, price));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getPaidDate() {
		return paidDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPaidDate(Date newPaidDate) {
		Date oldPaidDate = paidDate;
		paidDate = newPaidDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NoCollectionOwnerPackage.TRANSACTION__PAID_DATE, oldPaidDate, paidDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NoCollectionOwnerPackage.TRANSACTION__ORDER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOrder((Order)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NoCollectionOwnerPackage.TRANSACTION__ORDER:
				return basicSetOrder(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case NoCollectionOwnerPackage.TRANSACTION__ORDER:
				return eInternalContainer().eInverseRemove(this, NoCollectionOwnerPackage.ORDER__TRANSACTIONS, Order.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NoCollectionOwnerPackage.TRANSACTION__NUMBER:
				return getNumber();
			case NoCollectionOwnerPackage.TRANSACTION__ORDER:
				return getOrder();
			case NoCollectionOwnerPackage.TRANSACTION__PRODUCT:
				if (resolve) return getProduct();
				return basicGetProduct();
			case NoCollectionOwnerPackage.TRANSACTION__START_DATE:
				return getStartDate();
			case NoCollectionOwnerPackage.TRANSACTION__END_DATE:
				return getEndDate();
			case NoCollectionOwnerPackage.TRANSACTION__PRICE:
				return getPrice();
			case NoCollectionOwnerPackage.TRANSACTION__PAID_DATE:
				return getPaidDate();
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
			case NoCollectionOwnerPackage.TRANSACTION__NUMBER:
				setNumber((String)newValue);
				return;
			case NoCollectionOwnerPackage.TRANSACTION__ORDER:
				setOrder((Order)newValue);
				return;
			case NoCollectionOwnerPackage.TRANSACTION__PRODUCT:
				setProduct((Product)newValue);
				return;
			case NoCollectionOwnerPackage.TRANSACTION__START_DATE:
				setStartDate((Date)newValue);
				return;
			case NoCollectionOwnerPackage.TRANSACTION__END_DATE:
				setEndDate((Date)newValue);
				return;
			case NoCollectionOwnerPackage.TRANSACTION__PRICE:
				setPrice((Double)newValue);
				return;
			case NoCollectionOwnerPackage.TRANSACTION__PAID_DATE:
				setPaidDate((Date)newValue);
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
			case NoCollectionOwnerPackage.TRANSACTION__NUMBER:
				setNumber(NUMBER_EDEFAULT);
				return;
			case NoCollectionOwnerPackage.TRANSACTION__ORDER:
				setOrder((Order)null);
				return;
			case NoCollectionOwnerPackage.TRANSACTION__PRODUCT:
				setProduct((Product)null);
				return;
			case NoCollectionOwnerPackage.TRANSACTION__START_DATE:
				setStartDate(START_DATE_EDEFAULT);
				return;
			case NoCollectionOwnerPackage.TRANSACTION__END_DATE:
				setEndDate(END_DATE_EDEFAULT);
				return;
			case NoCollectionOwnerPackage.TRANSACTION__PRICE:
				setPrice(PRICE_EDEFAULT);
				return;
			case NoCollectionOwnerPackage.TRANSACTION__PAID_DATE:
				setPaidDate(PAID_DATE_EDEFAULT);
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
			case NoCollectionOwnerPackage.TRANSACTION__NUMBER:
				return NUMBER_EDEFAULT == null ? number != null : !NUMBER_EDEFAULT.equals(number);
			case NoCollectionOwnerPackage.TRANSACTION__ORDER:
				return getOrder() != null;
			case NoCollectionOwnerPackage.TRANSACTION__PRODUCT:
				return product != null;
			case NoCollectionOwnerPackage.TRANSACTION__START_DATE:
				return START_DATE_EDEFAULT == null ? startDate != null : !START_DATE_EDEFAULT.equals(startDate);
			case NoCollectionOwnerPackage.TRANSACTION__END_DATE:
				return END_DATE_EDEFAULT == null ? endDate != null : !END_DATE_EDEFAULT.equals(endDate);
			case NoCollectionOwnerPackage.TRANSACTION__PRICE:
				return price != PRICE_EDEFAULT;
			case NoCollectionOwnerPackage.TRANSACTION__PAID_DATE:
				return PAID_DATE_EDEFAULT == null ? paidDate != null : !PAID_DATE_EDEFAULT.equals(paidDate);
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
		result.append(" (number: ");
		result.append(number);
		result.append(", startDate: ");
		result.append(startDate);
		result.append(", endDate: ");
		result.append(endDate);
		result.append(", price: ");
		result.append(price);
		result.append(", paidDate: ");
		result.append(paidDate);
		result.append(')');
		return result.toString();
	}

} //TransactionImpl

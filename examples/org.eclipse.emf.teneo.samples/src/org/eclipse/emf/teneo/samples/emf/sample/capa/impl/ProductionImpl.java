/**
 * <copyright>
 * </copyright>
 *
 * $Id: ProductionImpl.java,v 1.1 2006/08/14 05:08:58 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.sample.capa.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.teneo.samples.emf.sample.capa.CapaPackage;
import org.eclipse.emf.teneo.samples.emf.sample.capa.Production;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Production</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.capa.impl.ProductionImpl#getArticle <em>Article</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.capa.impl.ProductionImpl#getDueTime <em>Due Time</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.capa.impl.ProductionImpl#getMissingAmount <em>Missing Amount</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.capa.impl.ProductionImpl#getProductionId <em>Production Id</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.capa.impl.ProductionImpl#getStartTime <em>Start Time</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.capa.impl.ProductionImpl#getTotalAmount <em>Total Amount</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProductionImpl extends EObjectImpl implements Production {
	/**
	 * The default value of the '{@link #getArticle() <em>Article</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArticle()
	 * @generated
	 * @ordered
	 */
	protected static final String ARTICLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getArticle() <em>Article</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArticle()
	 * @generated
	 * @ordered
	 */
	protected String article = ARTICLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDueTime() <em>Due Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDueTime()
	 * @generated
	 * @ordered
	 */
	protected static final Object DUE_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDueTime() <em>Due Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDueTime()
	 * @generated
	 * @ordered
	 */
	protected Object dueTime = DUE_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getMissingAmount() <em>Missing Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMissingAmount()
	 * @generated
	 * @ordered
	 */
	protected static final float MISSING_AMOUNT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMissingAmount() <em>Missing Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMissingAmount()
	 * @generated
	 * @ordered
	 */
	protected float missingAmount = MISSING_AMOUNT_EDEFAULT;

	/**
	 * This is true if the Missing Amount attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean missingAmountESet = false;

	/**
	 * The default value of the '{@link #getProductionId() <em>Production Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductionId()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUCTION_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProductionId() <em>Production Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductionId()
	 * @generated
	 * @ordered
	 */
	protected String productionId = PRODUCTION_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getStartTime() <em>Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartTime()
	 * @generated
	 * @ordered
	 */
	protected static final Object START_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartTime() <em>Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartTime()
	 * @generated
	 * @ordered
	 */
	protected Object startTime = START_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getTotalAmount() <em>Total Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalAmount()
	 * @generated
	 * @ordered
	 */
	protected static final float TOTAL_AMOUNT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getTotalAmount() <em>Total Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalAmount()
	 * @generated
	 * @ordered
	 */
	protected float totalAmount = TOTAL_AMOUNT_EDEFAULT;

	/**
	 * This is true if the Total Amount attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean totalAmountESet = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return CapaPackage.Literals.PRODUCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getArticle() {
		return article;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArticle(String newArticle) {
		String oldArticle = article;
		article = newArticle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CapaPackage.PRODUCTION__ARTICLE, oldArticle, article));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getDueTime() {
		return dueTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDueTime(Object newDueTime) {
		Object oldDueTime = dueTime;
		dueTime = newDueTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CapaPackage.PRODUCTION__DUE_TIME, oldDueTime, dueTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getMissingAmount() {
		return missingAmount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMissingAmount(float newMissingAmount) {
		float oldMissingAmount = missingAmount;
		missingAmount = newMissingAmount;
		boolean oldMissingAmountESet = missingAmountESet;
		missingAmountESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CapaPackage.PRODUCTION__MISSING_AMOUNT, oldMissingAmount, missingAmount, !oldMissingAmountESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMissingAmount() {
		float oldMissingAmount = missingAmount;
		boolean oldMissingAmountESet = missingAmountESet;
		missingAmount = MISSING_AMOUNT_EDEFAULT;
		missingAmountESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CapaPackage.PRODUCTION__MISSING_AMOUNT, oldMissingAmount, MISSING_AMOUNT_EDEFAULT, oldMissingAmountESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMissingAmount() {
		return missingAmountESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProductionId() {
		return productionId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProductionId(String newProductionId) {
		String oldProductionId = productionId;
		productionId = newProductionId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CapaPackage.PRODUCTION__PRODUCTION_ID, oldProductionId, productionId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getStartTime() {
		return startTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartTime(Object newStartTime) {
		Object oldStartTime = startTime;
		startTime = newStartTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CapaPackage.PRODUCTION__START_TIME, oldStartTime, startTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getTotalAmount() {
		return totalAmount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotalAmount(float newTotalAmount) {
		float oldTotalAmount = totalAmount;
		totalAmount = newTotalAmount;
		boolean oldTotalAmountESet = totalAmountESet;
		totalAmountESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CapaPackage.PRODUCTION__TOTAL_AMOUNT, oldTotalAmount, totalAmount, !oldTotalAmountESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTotalAmount() {
		float oldTotalAmount = totalAmount;
		boolean oldTotalAmountESet = totalAmountESet;
		totalAmount = TOTAL_AMOUNT_EDEFAULT;
		totalAmountESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CapaPackage.PRODUCTION__TOTAL_AMOUNT, oldTotalAmount, TOTAL_AMOUNT_EDEFAULT, oldTotalAmountESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTotalAmount() {
		return totalAmountESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CapaPackage.PRODUCTION__ARTICLE:
				return getArticle();
			case CapaPackage.PRODUCTION__DUE_TIME:
				return getDueTime();
			case CapaPackage.PRODUCTION__MISSING_AMOUNT:
				return new Float(getMissingAmount());
			case CapaPackage.PRODUCTION__PRODUCTION_ID:
				return getProductionId();
			case CapaPackage.PRODUCTION__START_TIME:
				return getStartTime();
			case CapaPackage.PRODUCTION__TOTAL_AMOUNT:
				return new Float(getTotalAmount());
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
			case CapaPackage.PRODUCTION__ARTICLE:
				setArticle((String)newValue);
				return;
			case CapaPackage.PRODUCTION__DUE_TIME:
				setDueTime((Object)newValue);
				return;
			case CapaPackage.PRODUCTION__MISSING_AMOUNT:
				setMissingAmount(((Float)newValue).floatValue());
				return;
			case CapaPackage.PRODUCTION__PRODUCTION_ID:
				setProductionId((String)newValue);
				return;
			case CapaPackage.PRODUCTION__START_TIME:
				setStartTime((Object)newValue);
				return;
			case CapaPackage.PRODUCTION__TOTAL_AMOUNT:
				setTotalAmount(((Float)newValue).floatValue());
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
			case CapaPackage.PRODUCTION__ARTICLE:
				setArticle(ARTICLE_EDEFAULT);
				return;
			case CapaPackage.PRODUCTION__DUE_TIME:
				setDueTime(DUE_TIME_EDEFAULT);
				return;
			case CapaPackage.PRODUCTION__MISSING_AMOUNT:
				unsetMissingAmount();
				return;
			case CapaPackage.PRODUCTION__PRODUCTION_ID:
				setProductionId(PRODUCTION_ID_EDEFAULT);
				return;
			case CapaPackage.PRODUCTION__START_TIME:
				setStartTime(START_TIME_EDEFAULT);
				return;
			case CapaPackage.PRODUCTION__TOTAL_AMOUNT:
				unsetTotalAmount();
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
			case CapaPackage.PRODUCTION__ARTICLE:
				return ARTICLE_EDEFAULT == null ? article != null : !ARTICLE_EDEFAULT.equals(article);
			case CapaPackage.PRODUCTION__DUE_TIME:
				return DUE_TIME_EDEFAULT == null ? dueTime != null : !DUE_TIME_EDEFAULT.equals(dueTime);
			case CapaPackage.PRODUCTION__MISSING_AMOUNT:
				return isSetMissingAmount();
			case CapaPackage.PRODUCTION__PRODUCTION_ID:
				return PRODUCTION_ID_EDEFAULT == null ? productionId != null : !PRODUCTION_ID_EDEFAULT.equals(productionId);
			case CapaPackage.PRODUCTION__START_TIME:
				return START_TIME_EDEFAULT == null ? startTime != null : !START_TIME_EDEFAULT.equals(startTime);
			case CapaPackage.PRODUCTION__TOTAL_AMOUNT:
				return isSetTotalAmount();
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
		result.append(" (article: ");
		result.append(article);
		result.append(", dueTime: ");
		result.append(dueTime);
		result.append(", missingAmount: ");
		if (missingAmountESet) result.append(missingAmount); else result.append("<unset>");
		result.append(", productionId: ");
		result.append(productionId);
		result.append(", startTime: ");
		result.append(startTime);
		result.append(", totalAmount: ");
		if (totalAmountESet) result.append(totalAmount); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ProductionImpl
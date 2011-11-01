/**
 * <copyright>
 * </copyright>
 *
 * $Id: JournalStatementImpl.java,v 1.2 2007/02/08 23:09:19 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.sample.accounting.impl;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.teneo.samples.emf.sample.accounting.Account;
import org.eclipse.emf.teneo.samples.emf.sample.accounting.AccountingPackage;
import org.eclipse.emf.teneo.samples.emf.sample.accounting.JournalStatement;
import org.eclipse.emf.teneo.samples.emf.sample.accounting.Vat;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Journal Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.accounting.impl.JournalStatementImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.accounting.impl.JournalStatementImpl#getDate <em>Date</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.accounting.impl.JournalStatementImpl#getAmount <em>Amount</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.accounting.impl.JournalStatementImpl#getDebitAccount <em>Debit Account</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.accounting.impl.JournalStatementImpl#getCreditAccount <em>Credit Account</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.accounting.impl.JournalStatementImpl#getVat <em>Vat</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JournalStatementImpl extends EObjectImpl implements JournalStatement {
	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected Date date = DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAmount() <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmount()
	 * @generated
	 * @ordered
	 */
	protected static final float AMOUNT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getAmount() <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmount()
	 * @generated
	 * @ordered
	 */
	protected float amount = AMOUNT_EDEFAULT;

	/**
	 * This is true if the Amount attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean amountESet = false;

	/**
	 * The cached value of the '{@link #getDebitAccount() <em>Debit Account</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDebitAccount()
	 * @generated
	 * @ordered
	 */
	protected Account debitAccount = null;

	/**
	 * The cached value of the '{@link #getCreditAccount() <em>Credit Account</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreditAccount()
	 * @generated
	 * @ordered
	 */
	protected Account creditAccount = null;

	/**
	 * The cached value of the '{@link #getVat() <em>Vat</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVat()
	 * @generated
	 * @ordered
	 */
	protected Vat vat = null;

	/**
	 * This is true if the Vat reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean vatESet = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JournalStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AccountingPackage.Literals.JOURNAL_STATEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AccountingPackage.JOURNAL_STATEMENT__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate(Date newDate) {
		Date oldDate = date;
		date = newDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AccountingPackage.JOURNAL_STATEMENT__DATE, oldDate, date));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getAmount() {
		return amount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAmount(float newAmount) {
		float oldAmount = amount;
		amount = newAmount;
		boolean oldAmountESet = amountESet;
		amountESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AccountingPackage.JOURNAL_STATEMENT__AMOUNT, oldAmount, amount, !oldAmountESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAmount() {
		float oldAmount = amount;
		boolean oldAmountESet = amountESet;
		amount = AMOUNT_EDEFAULT;
		amountESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AccountingPackage.JOURNAL_STATEMENT__AMOUNT, oldAmount, AMOUNT_EDEFAULT, oldAmountESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAmount() {
		return amountESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Account getDebitAccount() {
		return debitAccount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDebitAccount(Account newDebitAccount) {
		Account oldDebitAccount = debitAccount;
		debitAccount = newDebitAccount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AccountingPackage.JOURNAL_STATEMENT__DEBIT_ACCOUNT, oldDebitAccount, debitAccount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Account getCreditAccount() {
		return creditAccount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreditAccount(Account newCreditAccount) {
		Account oldCreditAccount = creditAccount;
		creditAccount = newCreditAccount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AccountingPackage.JOURNAL_STATEMENT__CREDIT_ACCOUNT, oldCreditAccount, creditAccount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vat getVat() {
		return vat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVat(Vat newVat) {
		Vat oldVat = vat;
		vat = newVat;
		boolean oldVatESet = vatESet;
		vatESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AccountingPackage.JOURNAL_STATEMENT__VAT, oldVat, vat, !oldVatESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetVat() {
		Vat oldVat = vat;
		boolean oldVatESet = vatESet;
		vat = null;
		vatESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AccountingPackage.JOURNAL_STATEMENT__VAT, oldVat, null, oldVatESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetVat() {
		return vatESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AccountingPackage.JOURNAL_STATEMENT__DESCRIPTION:
				return getDescription();
			case AccountingPackage.JOURNAL_STATEMENT__DATE:
				return getDate();
			case AccountingPackage.JOURNAL_STATEMENT__AMOUNT:
				return new Float(getAmount());
			case AccountingPackage.JOURNAL_STATEMENT__DEBIT_ACCOUNT:
				return getDebitAccount();
			case AccountingPackage.JOURNAL_STATEMENT__CREDIT_ACCOUNT:
				return getCreditAccount();
			case AccountingPackage.JOURNAL_STATEMENT__VAT:
				return getVat();
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
			case AccountingPackage.JOURNAL_STATEMENT__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case AccountingPackage.JOURNAL_STATEMENT__DATE:
				setDate((Date)newValue);
				return;
			case AccountingPackage.JOURNAL_STATEMENT__AMOUNT:
				setAmount(((Float)newValue).floatValue());
				return;
			case AccountingPackage.JOURNAL_STATEMENT__DEBIT_ACCOUNT:
				setDebitAccount((Account)newValue);
				return;
			case AccountingPackage.JOURNAL_STATEMENT__CREDIT_ACCOUNT:
				setCreditAccount((Account)newValue);
				return;
			case AccountingPackage.JOURNAL_STATEMENT__VAT:
				setVat((Vat)newValue);
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
			case AccountingPackage.JOURNAL_STATEMENT__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case AccountingPackage.JOURNAL_STATEMENT__DATE:
				setDate(DATE_EDEFAULT);
				return;
			case AccountingPackage.JOURNAL_STATEMENT__AMOUNT:
				unsetAmount();
				return;
			case AccountingPackage.JOURNAL_STATEMENT__DEBIT_ACCOUNT:
				setDebitAccount((Account)null);
				return;
			case AccountingPackage.JOURNAL_STATEMENT__CREDIT_ACCOUNT:
				setCreditAccount((Account)null);
				return;
			case AccountingPackage.JOURNAL_STATEMENT__VAT:
				unsetVat();
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
			case AccountingPackage.JOURNAL_STATEMENT__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case AccountingPackage.JOURNAL_STATEMENT__DATE:
				return DATE_EDEFAULT == null ? date != null : !DATE_EDEFAULT.equals(date);
			case AccountingPackage.JOURNAL_STATEMENT__AMOUNT:
				return isSetAmount();
			case AccountingPackage.JOURNAL_STATEMENT__DEBIT_ACCOUNT:
				return debitAccount != null;
			case AccountingPackage.JOURNAL_STATEMENT__CREDIT_ACCOUNT:
				return creditAccount != null;
			case AccountingPackage.JOURNAL_STATEMENT__VAT:
				return isSetVat();
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
		result.append(" (description: ");
		result.append(description);
		result.append(", date: ");
		result.append(date);
		result.append(", amount: ");
		if (amountESet) result.append(amount); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //JournalStatementImpl

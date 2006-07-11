/**
 * <copyright>
 * </copyright>
 *
 * $Id: AccountingImpl.java,v 1.1 2006/07/11 16:56:57 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.sample.accounting.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.emf.teneo.samples.emf.sample.accounting.AccountGroup;
import org.eclipse.emf.teneo.samples.emf.sample.accounting.Accounting;
import org.eclipse.emf.teneo.samples.emf.sample.accounting.AccountingPackage;
import org.eclipse.emf.teneo.samples.emf.sample.accounting.BalanceAccount;
import org.eclipse.emf.teneo.samples.emf.sample.accounting.JournalGroup;
import org.eclipse.emf.teneo.samples.emf.sample.accounting.Report;
import org.eclipse.emf.teneo.samples.emf.sample.accounting.Vat;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Accounting</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.accounting.impl.AccountingImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.accounting.impl.AccountingImpl#getAccountGroup <em>Account Group</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.accounting.impl.AccountingImpl#getVat <em>Vat</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.accounting.impl.AccountingImpl#getVatAccount <em>Vat Account</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.accounting.impl.AccountingImpl#getReport <em>Report</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.accounting.impl.AccountingImpl#getJournalGroup <em>Journal Group</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AccountingImpl extends EObjectImpl implements Accounting {
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
	 * This is true if the Name attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nameESet = false;

	/**
	 * The cached value of the '{@link #getAccountGroup() <em>Account Group</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccountGroup()
	 * @generated
	 * @ordered
	 */
	protected EList accountGroup = null;

	/**
	 * The cached value of the '{@link #getVat() <em>Vat</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVat()
	 * @generated
	 * @ordered
	 */
	protected EList vat = null;

	/**
	 * The cached value of the '{@link #getVatAccount() <em>Vat Account</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVatAccount()
	 * @generated
	 * @ordered
	 */
	protected BalanceAccount vatAccount = null;

	/**
	 * The cached value of the '{@link #getReport() <em>Report</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReport()
	 * @generated
	 * @ordered
	 */
	protected Report report = null;

	/**
	 * The cached value of the '{@link #getJournalGroup() <em>Journal Group</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJournalGroup()
	 * @generated
	 * @ordered
	 */
	protected EList journalGroup = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AccountingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return AccountingPackage.eINSTANCE.getAccounting();
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
			eNotify(new ENotificationImpl(this, Notification.SET, AccountingPackage.ACCOUNTING__NAME, oldName, name, !oldNameESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, AccountingPackage.ACCOUNTING__NAME, oldName, NAME_EDEFAULT, oldNameESet));
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
	public EList getAccountGroup() {
		if (accountGroup == null) {
			accountGroup = new EObjectContainmentEList(AccountGroup.class, this, AccountingPackage.ACCOUNTING__ACCOUNT_GROUP);
		}
		return accountGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getVat() {
		if (vat == null) {
			vat = new EObjectContainmentEList(Vat.class, this, AccountingPackage.ACCOUNTING__VAT);
		}
		return vat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BalanceAccount getVatAccount() {
		return vatAccount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVatAccount(BalanceAccount newVatAccount) {
		BalanceAccount oldVatAccount = vatAccount;
		vatAccount = newVatAccount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AccountingPackage.ACCOUNTING__VAT_ACCOUNT, oldVatAccount, vatAccount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Report getReport() {
		return report;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReport(Report newReport, NotificationChain msgs) {
		Report oldReport = report;
		report = newReport;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AccountingPackage.ACCOUNTING__REPORT, oldReport, newReport);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReport(Report newReport) {
		if (newReport != report) {
			NotificationChain msgs = null;
			if (report != null)
				msgs = ((InternalEObject)report).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AccountingPackage.ACCOUNTING__REPORT, null, msgs);
			if (newReport != null)
				msgs = ((InternalEObject)newReport).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AccountingPackage.ACCOUNTING__REPORT, null, msgs);
			msgs = basicSetReport(newReport, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AccountingPackage.ACCOUNTING__REPORT, newReport, newReport));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getJournalGroup() {
		if (journalGroup == null) {
			journalGroup = new EObjectContainmentEList(JournalGroup.class, this, AccountingPackage.ACCOUNTING__JOURNAL_GROUP);
		}
		return journalGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case AccountingPackage.ACCOUNTING__ACCOUNT_GROUP:
					return ((InternalEList)getAccountGroup()).basicRemove(otherEnd, msgs);
				case AccountingPackage.ACCOUNTING__VAT:
					return ((InternalEList)getVat()).basicRemove(otherEnd, msgs);
				case AccountingPackage.ACCOUNTING__REPORT:
					return basicSetReport(null, msgs);
				case AccountingPackage.ACCOUNTING__JOURNAL_GROUP:
					return ((InternalEList)getJournalGroup()).basicRemove(otherEnd, msgs);
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
			case AccountingPackage.ACCOUNTING__NAME:
				return getName();
			case AccountingPackage.ACCOUNTING__ACCOUNT_GROUP:
				return getAccountGroup();
			case AccountingPackage.ACCOUNTING__VAT:
				return getVat();
			case AccountingPackage.ACCOUNTING__VAT_ACCOUNT:
				return getVatAccount();
			case AccountingPackage.ACCOUNTING__REPORT:
				return getReport();
			case AccountingPackage.ACCOUNTING__JOURNAL_GROUP:
				return getJournalGroup();
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
			case AccountingPackage.ACCOUNTING__NAME:
				setName((String)newValue);
				return;
			case AccountingPackage.ACCOUNTING__ACCOUNT_GROUP:
				getAccountGroup().clear();
				getAccountGroup().addAll((Collection)newValue);
				return;
			case AccountingPackage.ACCOUNTING__VAT:
				getVat().clear();
				getVat().addAll((Collection)newValue);
				return;
			case AccountingPackage.ACCOUNTING__VAT_ACCOUNT:
				setVatAccount((BalanceAccount)newValue);
				return;
			case AccountingPackage.ACCOUNTING__REPORT:
				setReport((Report)newValue);
				return;
			case AccountingPackage.ACCOUNTING__JOURNAL_GROUP:
				getJournalGroup().clear();
				getJournalGroup().addAll((Collection)newValue);
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
			case AccountingPackage.ACCOUNTING__NAME:
				unsetName();
				return;
			case AccountingPackage.ACCOUNTING__ACCOUNT_GROUP:
				getAccountGroup().clear();
				return;
			case AccountingPackage.ACCOUNTING__VAT:
				getVat().clear();
				return;
			case AccountingPackage.ACCOUNTING__VAT_ACCOUNT:
				setVatAccount((BalanceAccount)null);
				return;
			case AccountingPackage.ACCOUNTING__REPORT:
				setReport((Report)null);
				return;
			case AccountingPackage.ACCOUNTING__JOURNAL_GROUP:
				getJournalGroup().clear();
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
			case AccountingPackage.ACCOUNTING__NAME:
				return isSetName();
			case AccountingPackage.ACCOUNTING__ACCOUNT_GROUP:
				return accountGroup != null && !accountGroup.isEmpty();
			case AccountingPackage.ACCOUNTING__VAT:
				return vat != null && !vat.isEmpty();
			case AccountingPackage.ACCOUNTING__VAT_ACCOUNT:
				return vatAccount != null;
			case AccountingPackage.ACCOUNTING__REPORT:
				return report != null;
			case AccountingPackage.ACCOUNTING__JOURNAL_GROUP:
				return journalGroup != null && !journalGroup.isEmpty();
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

} //AccountingImpl

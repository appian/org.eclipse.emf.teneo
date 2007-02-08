/**
 * <copyright>
 * </copyright>
 *
 * $Id: ReportGroupImpl.java,v 1.2 2007/02/08 23:09:19 mtaal Exp $
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
import org.eclipse.emf.ecore.util.EObjectWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.emf.teneo.samples.emf.sample.accounting.AccountingPackage;
import org.eclipse.emf.teneo.samples.emf.sample.accounting.BalanceAccount;
import org.eclipse.emf.teneo.samples.emf.sample.accounting.ReportGroup;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Report Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.accounting.impl.ReportGroupImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.accounting.impl.ReportGroupImpl#getReportGroup <em>Report Group</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.accounting.impl.ReportGroupImpl#getAccount <em>Account</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReportGroupImpl extends EObjectImpl implements ReportGroup {
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
	 * The cached value of the '{@link #getReportGroup() <em>Report Group</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReportGroup()
	 * @generated
	 * @ordered
	 */
	protected EList<ReportGroup> reportGroup = null;

	/**
	 * The cached value of the '{@link #getAccount() <em>Account</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccount()
	 * @generated
	 * @ordered
	 */
	protected EList<BalanceAccount> account = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReportGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AccountingPackage.Literals.REPORT_GROUP;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AccountingPackage.REPORT_GROUP__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReportGroup> getReportGroup() {
		if (reportGroup == null) {
			reportGroup = new EObjectContainmentEList<ReportGroup>(ReportGroup.class, this, AccountingPackage.REPORT_GROUP__REPORT_GROUP);
		}
		return reportGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BalanceAccount> getAccount() {
		if (account == null) {
			account = new EObjectWithInverseEList.ManyInverse<BalanceAccount>(BalanceAccount.class, this, AccountingPackage.REPORT_GROUP__ACCOUNT, AccountingPackage.BALANCE_ACCOUNT__REPORT);
		}
		return account;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AccountingPackage.REPORT_GROUP__ACCOUNT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAccount()).basicAdd(otherEnd, msgs);
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
			case AccountingPackage.REPORT_GROUP__REPORT_GROUP:
				return ((InternalEList<?>)getReportGroup()).basicRemove(otherEnd, msgs);
			case AccountingPackage.REPORT_GROUP__ACCOUNT:
				return ((InternalEList<?>)getAccount()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AccountingPackage.REPORT_GROUP__NAME:
				return getName();
			case AccountingPackage.REPORT_GROUP__REPORT_GROUP:
				return getReportGroup();
			case AccountingPackage.REPORT_GROUP__ACCOUNT:
				return getAccount();
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
			case AccountingPackage.REPORT_GROUP__NAME:
				setName((String)newValue);
				return;
			case AccountingPackage.REPORT_GROUP__REPORT_GROUP:
				getReportGroup().clear();
				getReportGroup().addAll((Collection<? extends ReportGroup>)newValue);
				return;
			case AccountingPackage.REPORT_GROUP__ACCOUNT:
				getAccount().clear();
				getAccount().addAll((Collection<? extends BalanceAccount>)newValue);
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
			case AccountingPackage.REPORT_GROUP__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AccountingPackage.REPORT_GROUP__REPORT_GROUP:
				getReportGroup().clear();
				return;
			case AccountingPackage.REPORT_GROUP__ACCOUNT:
				getAccount().clear();
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
			case AccountingPackage.REPORT_GROUP__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AccountingPackage.REPORT_GROUP__REPORT_GROUP:
				return reportGroup != null && !reportGroup.isEmpty();
			case AccountingPackage.REPORT_GROUP__ACCOUNT:
				return account != null && !account.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ReportGroupImpl

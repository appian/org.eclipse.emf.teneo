/**
 * <copyright>
 * </copyright>
 *
 * $Id: ReportImpl.java,v 1.2 2007/02/08 23:09:19 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.sample.accounting.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.teneo.samples.emf.sample.accounting.AccountingPackage;
import org.eclipse.emf.teneo.samples.emf.sample.accounting.Report;
import org.eclipse.emf.teneo.samples.emf.sample.accounting.ReportGroup;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Report</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.accounting.impl.ReportImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.accounting.impl.ReportImpl#getDebitReportGroup <em>Debit Report Group</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.accounting.impl.ReportImpl#getCreditReportGroup <em>Credit Report Group</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReportImpl extends EObjectImpl implements Report {
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
	 * The cached value of the '{@link #getDebitReportGroup() <em>Debit Report Group</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDebitReportGroup()
	 * @generated
	 * @ordered
	 */
	protected ReportGroup debitReportGroup = null;

	/**
	 * The cached value of the '{@link #getCreditReportGroup() <em>Credit Report Group</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreditReportGroup()
	 * @generated
	 * @ordered
	 */
	protected ReportGroup creditReportGroup = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReportImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AccountingPackage.Literals.REPORT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AccountingPackage.REPORT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReportGroup getDebitReportGroup() {
		return debitReportGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDebitReportGroup(ReportGroup newDebitReportGroup, NotificationChain msgs) {
		ReportGroup oldDebitReportGroup = debitReportGroup;
		debitReportGroup = newDebitReportGroup;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AccountingPackage.REPORT__DEBIT_REPORT_GROUP, oldDebitReportGroup, newDebitReportGroup);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDebitReportGroup(ReportGroup newDebitReportGroup) {
		if (newDebitReportGroup != debitReportGroup) {
			NotificationChain msgs = null;
			if (debitReportGroup != null)
				msgs = ((InternalEObject)debitReportGroup).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AccountingPackage.REPORT__DEBIT_REPORT_GROUP, null, msgs);
			if (newDebitReportGroup != null)
				msgs = ((InternalEObject)newDebitReportGroup).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AccountingPackage.REPORT__DEBIT_REPORT_GROUP, null, msgs);
			msgs = basicSetDebitReportGroup(newDebitReportGroup, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AccountingPackage.REPORT__DEBIT_REPORT_GROUP, newDebitReportGroup, newDebitReportGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReportGroup getCreditReportGroup() {
		return creditReportGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCreditReportGroup(ReportGroup newCreditReportGroup, NotificationChain msgs) {
		ReportGroup oldCreditReportGroup = creditReportGroup;
		creditReportGroup = newCreditReportGroup;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AccountingPackage.REPORT__CREDIT_REPORT_GROUP, oldCreditReportGroup, newCreditReportGroup);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreditReportGroup(ReportGroup newCreditReportGroup) {
		if (newCreditReportGroup != creditReportGroup) {
			NotificationChain msgs = null;
			if (creditReportGroup != null)
				msgs = ((InternalEObject)creditReportGroup).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AccountingPackage.REPORT__CREDIT_REPORT_GROUP, null, msgs);
			if (newCreditReportGroup != null)
				msgs = ((InternalEObject)newCreditReportGroup).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AccountingPackage.REPORT__CREDIT_REPORT_GROUP, null, msgs);
			msgs = basicSetCreditReportGroup(newCreditReportGroup, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AccountingPackage.REPORT__CREDIT_REPORT_GROUP, newCreditReportGroup, newCreditReportGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AccountingPackage.REPORT__DEBIT_REPORT_GROUP:
				return basicSetDebitReportGroup(null, msgs);
			case AccountingPackage.REPORT__CREDIT_REPORT_GROUP:
				return basicSetCreditReportGroup(null, msgs);
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
			case AccountingPackage.REPORT__NAME:
				return getName();
			case AccountingPackage.REPORT__DEBIT_REPORT_GROUP:
				return getDebitReportGroup();
			case AccountingPackage.REPORT__CREDIT_REPORT_GROUP:
				return getCreditReportGroup();
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
			case AccountingPackage.REPORT__NAME:
				setName((String)newValue);
				return;
			case AccountingPackage.REPORT__DEBIT_REPORT_GROUP:
				setDebitReportGroup((ReportGroup)newValue);
				return;
			case AccountingPackage.REPORT__CREDIT_REPORT_GROUP:
				setCreditReportGroup((ReportGroup)newValue);
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
			case AccountingPackage.REPORT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AccountingPackage.REPORT__DEBIT_REPORT_GROUP:
				setDebitReportGroup((ReportGroup)null);
				return;
			case AccountingPackage.REPORT__CREDIT_REPORT_GROUP:
				setCreditReportGroup((ReportGroup)null);
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
			case AccountingPackage.REPORT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AccountingPackage.REPORT__DEBIT_REPORT_GROUP:
				return debitReportGroup != null;
			case AccountingPackage.REPORT__CREDIT_REPORT_GROUP:
				return creditReportGroup != null;
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

} //ReportImpl

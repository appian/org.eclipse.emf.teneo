/**
 * <copyright>
 * </copyright>
 *
 * $Id: BalanceAccount.java,v 1.2 2007/02/08 23:09:21 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.sample.accounting;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Balance Account</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.accounting.BalanceAccount#getReport <em>Report</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.emf.sample.accounting.AccountingPackage#getBalanceAccount()
 * @model extendedMetaData="name='BalanceAccount' kind='elementOnly'"
 * @generated
 */
public interface BalanceAccount extends Account {
	/**
	 * Returns the value of the '<em><b>Report</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.samples.emf.sample.accounting.ReportGroup}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.emf.teneo.samples.emf.sample.accounting.ReportGroup#getAccount <em>Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Report</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Report</em>' reference list.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.accounting.AccountingPackage#getBalanceAccount_Report()
	 * @see org.eclipse.emf.teneo.samples.emf.sample.accounting.ReportGroup#getAccount
	 * @model type="org.eclipse.emf.teneo.samples.emf.sample.accounting.ReportGroup" opposite="account" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='report'"
	 * @generated
	 */
	EList<ReportGroup> getReport();

} // BalanceAccount

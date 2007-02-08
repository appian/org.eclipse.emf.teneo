/**
 * <copyright>
 * </copyright>
 *
 * $Id: AccountingFactory.java,v 1.2 2007/02/08 23:09:21 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.sample.accounting;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.teneo.samples.emf.sample.accounting.AccountingPackage
 * @generated
 */
public interface AccountingFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AccountingFactory eINSTANCE = org.eclipse.emf.teneo.samples.emf.sample.accounting.impl.AccountingFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Account Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Account Group</em>'.
	 * @generated
	 */
	AccountGroup createAccountGroup();

	/**
	 * Returns a new object of class '<em>Accounting</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Accounting</em>'.
	 * @generated
	 */
	Accounting createAccounting();

	/**
	 * Returns a new object of class '<em>Balance Account</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Balance Account</em>'.
	 * @generated
	 */
	BalanceAccount createBalanceAccount();

	/**
	 * Returns a new object of class '<em>Journal Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Journal Group</em>'.
	 * @generated
	 */
	JournalGroup createJournalGroup();

	/**
	 * Returns a new object of class '<em>Journal Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Journal Statement</em>'.
	 * @generated
	 */
	JournalStatement createJournalStatement();

	/**
	 * Returns a new object of class '<em>PL Account</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PL Account</em>'.
	 * @generated
	 */
	PLAccount createPLAccount();

	/**
	 * Returns a new object of class '<em>Report</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Report</em>'.
	 * @generated
	 */
	Report createReport();

	/**
	 * Returns a new object of class '<em>Report Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Report Group</em>'.
	 * @generated
	 */
	ReportGroup createReportGroup();

	/**
	 * Returns a new object of class '<em>Vat</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vat</em>'.
	 * @generated
	 */
	Vat createVat();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AccountingPackage getAccountingPackage();

} //AccountingFactory

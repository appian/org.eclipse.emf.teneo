/**
 * <copyright>
 * </copyright>
 *
 * $Id: AccountingPackage.java,v 1.1 2006/07/11 16:57:04 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.sample.accounting;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.teneo.samples.emf.sample.accounting.AccountingFactory
 * @model kind="package"
 * @generated
 */
public interface AccountingPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "accounting";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/emf/teneo/store/test/emf/sample/accounting";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "accounting";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AccountingPackage eINSTANCE = org.eclipse.emf.teneo.samples.emf.sample.accounting.impl.AccountingPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.sample.accounting.impl.AccountImpl <em>Account</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.sample.accounting.impl.AccountImpl
	 * @see org.eclipse.emf.teneo.samples.emf.sample.accounting.impl.AccountingPackageImpl#getAccount()
	 * @generated
	 */
	int ACCOUNT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT__NAME = 0;

	/**
	 * The number of structural features of the the '<em>Account</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.sample.accounting.impl.AccountGroupImpl <em>Account Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.sample.accounting.impl.AccountGroupImpl
	 * @see org.eclipse.emf.teneo.samples.emf.sample.accounting.impl.AccountingPackageImpl#getAccountGroup()
	 * @generated
	 */
	int ACCOUNT_GROUP = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT_GROUP__NAME = 0;

	/**
	 * The feature id for the '<em><b>Account</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT_GROUP__ACCOUNT = 1;

	/**
	 * The number of structural features of the the '<em>Account Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT_GROUP_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.sample.accounting.impl.AccountingImpl <em>Accounting</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.sample.accounting.impl.AccountingImpl
	 * @see org.eclipse.emf.teneo.samples.emf.sample.accounting.impl.AccountingPackageImpl#getAccounting()
	 * @generated
	 */
	int ACCOUNTING = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNTING__NAME = 0;

	/**
	 * The feature id for the '<em><b>Account Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNTING__ACCOUNT_GROUP = 1;

	/**
	 * The feature id for the '<em><b>Vat</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNTING__VAT = 2;

	/**
	 * The feature id for the '<em><b>Vat Account</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNTING__VAT_ACCOUNT = 3;

	/**
	 * The feature id for the '<em><b>Report</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNTING__REPORT = 4;

	/**
	 * The feature id for the '<em><b>Journal Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNTING__JOURNAL_GROUP = 5;

	/**
	 * The number of structural features of the the '<em>Accounting</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNTING_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.sample.accounting.impl.BalanceAccountImpl <em>Balance Account</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.sample.accounting.impl.BalanceAccountImpl
	 * @see org.eclipse.emf.teneo.samples.emf.sample.accounting.impl.AccountingPackageImpl#getBalanceAccount()
	 * @generated
	 */
	int BALANCE_ACCOUNT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BALANCE_ACCOUNT__NAME = ACCOUNT__NAME;

	/**
	 * The feature id for the '<em><b>Report</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BALANCE_ACCOUNT__REPORT = ACCOUNT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the the '<em>Balance Account</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BALANCE_ACCOUNT_FEATURE_COUNT = ACCOUNT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.sample.accounting.impl.JournalGroupImpl <em>Journal Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.sample.accounting.impl.JournalGroupImpl
	 * @see org.eclipse.emf.teneo.samples.emf.sample.accounting.impl.AccountingPackageImpl#getJournalGroup()
	 * @generated
	 */
	int JOURNAL_GROUP = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNAL_GROUP__NAME = 0;

	/**
	 * The feature id for the '<em><b>Journal Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNAL_GROUP__JOURNAL_GROUPS = 1;

	/**
	 * The feature id for the '<em><b>Journal Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNAL_GROUP__JOURNAL_STATEMENTS = 2;

	/**
	 * The number of structural features of the the '<em>Journal Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNAL_GROUP_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.sample.accounting.impl.JournalStatementImpl <em>Journal Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.sample.accounting.impl.JournalStatementImpl
	 * @see org.eclipse.emf.teneo.samples.emf.sample.accounting.impl.AccountingPackageImpl#getJournalStatement()
	 * @generated
	 */
	int JOURNAL_STATEMENT = 5;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNAL_STATEMENT__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNAL_STATEMENT__DATE = 1;

	/**
	 * The feature id for the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNAL_STATEMENT__AMOUNT = 2;

	/**
	 * The feature id for the '<em><b>Debit Account</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNAL_STATEMENT__DEBIT_ACCOUNT = 3;

	/**
	 * The feature id for the '<em><b>Credit Account</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNAL_STATEMENT__CREDIT_ACCOUNT = 4;

	/**
	 * The feature id for the '<em><b>Vat</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNAL_STATEMENT__VAT = 5;

	/**
	 * The number of structural features of the the '<em>Journal Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNAL_STATEMENT_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.sample.accounting.impl.PLAccountImpl <em>PL Account</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.sample.accounting.impl.PLAccountImpl
	 * @see org.eclipse.emf.teneo.samples.emf.sample.accounting.impl.AccountingPackageImpl#getPLAccount()
	 * @generated
	 */
	int PL_ACCOUNT = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PL_ACCOUNT__NAME = ACCOUNT__NAME;

	/**
	 * The number of structural features of the the '<em>PL Account</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PL_ACCOUNT_FEATURE_COUNT = ACCOUNT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.sample.accounting.impl.ReportImpl <em>Report</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.sample.accounting.impl.ReportImpl
	 * @see org.eclipse.emf.teneo.samples.emf.sample.accounting.impl.AccountingPackageImpl#getReport()
	 * @generated
	 */
	int REPORT = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Debit Report Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT__DEBIT_REPORT_GROUP = 1;

	/**
	 * The feature id for the '<em><b>Credit Report Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT__CREDIT_REPORT_GROUP = 2;

	/**
	 * The number of structural features of the the '<em>Report</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.sample.accounting.impl.ReportGroupImpl <em>Report Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.sample.accounting.impl.ReportGroupImpl
	 * @see org.eclipse.emf.teneo.samples.emf.sample.accounting.impl.AccountingPackageImpl#getReportGroup()
	 * @generated
	 */
	int REPORT_GROUP = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_GROUP__NAME = 0;

	/**
	 * The feature id for the '<em><b>Report Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_GROUP__REPORT_GROUP = 1;

	/**
	 * The feature id for the '<em><b>Account</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_GROUP__ACCOUNT = 2;

	/**
	 * The number of structural features of the the '<em>Report Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_GROUP_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.sample.accounting.impl.VatImpl <em>Vat</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.sample.accounting.impl.VatImpl
	 * @see org.eclipse.emf.teneo.samples.emf.sample.accounting.impl.AccountingPackageImpl#getVat()
	 * @generated
	 */
	int VAT = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAT__RATE = 1;

	/**
	 * The number of structural features of the the '<em>Vat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '<em>Date</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Date
	 * @see org.eclipse.emf.teneo.samples.emf.sample.accounting.impl.AccountingPackageImpl#getDate()
	 * @generated
	 */
	int DATE = 10;


	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.sample.accounting.Account <em>Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Account</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.accounting.Account
	 * @generated
	 */
	EClass getAccount();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.sample.accounting.Account#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.accounting.Account#getName()
	 * @see #getAccount()
	 * @generated
	 */
	EAttribute getAccount_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.sample.accounting.AccountGroup <em>Account Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Account Group</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.accounting.AccountGroup
	 * @generated
	 */
	EClass getAccountGroup();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.sample.accounting.AccountGroup#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.accounting.AccountGroup#getName()
	 * @see #getAccountGroup()
	 * @generated
	 */
	EAttribute getAccountGroup_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.samples.emf.sample.accounting.AccountGroup#getAccount <em>Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Account</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.accounting.AccountGroup#getAccount()
	 * @see #getAccountGroup()
	 * @generated
	 */
	EReference getAccountGroup_Account();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.sample.accounting.Accounting <em>Accounting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Accounting</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.accounting.Accounting
	 * @generated
	 */
	EClass getAccounting();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.sample.accounting.Accounting#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.accounting.Accounting#getName()
	 * @see #getAccounting()
	 * @generated
	 */
	EAttribute getAccounting_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.samples.emf.sample.accounting.Accounting#getAccountGroup <em>Account Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Account Group</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.accounting.Accounting#getAccountGroup()
	 * @see #getAccounting()
	 * @generated
	 */
	EReference getAccounting_AccountGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.samples.emf.sample.accounting.Accounting#getVat <em>Vat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Vat</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.accounting.Accounting#getVat()
	 * @see #getAccounting()
	 * @generated
	 */
	EReference getAccounting_Vat();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.teneo.samples.emf.sample.accounting.Accounting#getVatAccount <em>Vat Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Vat Account</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.accounting.Accounting#getVatAccount()
	 * @see #getAccounting()
	 * @generated
	 */
	EReference getAccounting_VatAccount();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.samples.emf.sample.accounting.Accounting#getReport <em>Report</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Report</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.accounting.Accounting#getReport()
	 * @see #getAccounting()
	 * @generated
	 */
	EReference getAccounting_Report();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.samples.emf.sample.accounting.Accounting#getJournalGroup <em>Journal Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Journal Group</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.accounting.Accounting#getJournalGroup()
	 * @see #getAccounting()
	 * @generated
	 */
	EReference getAccounting_JournalGroup();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.sample.accounting.BalanceAccount <em>Balance Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Balance Account</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.accounting.BalanceAccount
	 * @generated
	 */
	EClass getBalanceAccount();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.emf.teneo.samples.emf.sample.accounting.BalanceAccount#getReport <em>Report</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Report</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.accounting.BalanceAccount#getReport()
	 * @see #getBalanceAccount()
	 * @generated
	 */
	EReference getBalanceAccount_Report();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.sample.accounting.JournalGroup <em>Journal Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Journal Group</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.accounting.JournalGroup
	 * @generated
	 */
	EClass getJournalGroup();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.sample.accounting.JournalGroup#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.accounting.JournalGroup#getName()
	 * @see #getJournalGroup()
	 * @generated
	 */
	EAttribute getJournalGroup_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.samples.emf.sample.accounting.JournalGroup#getJournalGroups <em>Journal Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Journal Groups</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.accounting.JournalGroup#getJournalGroups()
	 * @see #getJournalGroup()
	 * @generated
	 */
	EReference getJournalGroup_JournalGroups();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.samples.emf.sample.accounting.JournalGroup#getJournalStatements <em>Journal Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Journal Statements</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.accounting.JournalGroup#getJournalStatements()
	 * @see #getJournalGroup()
	 * @generated
	 */
	EReference getJournalGroup_JournalStatements();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.sample.accounting.JournalStatement <em>Journal Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Journal Statement</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.accounting.JournalStatement
	 * @generated
	 */
	EClass getJournalStatement();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.sample.accounting.JournalStatement#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.accounting.JournalStatement#getDescription()
	 * @see #getJournalStatement()
	 * @generated
	 */
	EAttribute getJournalStatement_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.sample.accounting.JournalStatement#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.accounting.JournalStatement#getDate()
	 * @see #getJournalStatement()
	 * @generated
	 */
	EAttribute getJournalStatement_Date();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.sample.accounting.JournalStatement#getAmount <em>Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.accounting.JournalStatement#getAmount()
	 * @see #getJournalStatement()
	 * @generated
	 */
	EAttribute getJournalStatement_Amount();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.teneo.samples.emf.sample.accounting.JournalStatement#getDebitAccount <em>Debit Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Debit Account</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.accounting.JournalStatement#getDebitAccount()
	 * @see #getJournalStatement()
	 * @generated
	 */
	EReference getJournalStatement_DebitAccount();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.teneo.samples.emf.sample.accounting.JournalStatement#getCreditAccount <em>Credit Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Credit Account</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.accounting.JournalStatement#getCreditAccount()
	 * @see #getJournalStatement()
	 * @generated
	 */
	EReference getJournalStatement_CreditAccount();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.teneo.samples.emf.sample.accounting.JournalStatement#getVat <em>Vat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Vat</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.accounting.JournalStatement#getVat()
	 * @see #getJournalStatement()
	 * @generated
	 */
	EReference getJournalStatement_Vat();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.sample.accounting.PLAccount <em>PL Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PL Account</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.accounting.PLAccount
	 * @generated
	 */
	EClass getPLAccount();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.sample.accounting.Report <em>Report</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Report</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.accounting.Report
	 * @generated
	 */
	EClass getReport();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.sample.accounting.Report#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.accounting.Report#getName()
	 * @see #getReport()
	 * @generated
	 */
	EAttribute getReport_Name();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.samples.emf.sample.accounting.Report#getDebitReportGroup <em>Debit Report Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Debit Report Group</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.accounting.Report#getDebitReportGroup()
	 * @see #getReport()
	 * @generated
	 */
	EReference getReport_DebitReportGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.samples.emf.sample.accounting.Report#getCreditReportGroup <em>Credit Report Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Credit Report Group</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.accounting.Report#getCreditReportGroup()
	 * @see #getReport()
	 * @generated
	 */
	EReference getReport_CreditReportGroup();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.sample.accounting.ReportGroup <em>Report Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Report Group</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.accounting.ReportGroup
	 * @generated
	 */
	EClass getReportGroup();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.sample.accounting.ReportGroup#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.accounting.ReportGroup#getName()
	 * @see #getReportGroup()
	 * @generated
	 */
	EAttribute getReportGroup_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.samples.emf.sample.accounting.ReportGroup#getReportGroup <em>Report Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Report Group</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.accounting.ReportGroup#getReportGroup()
	 * @see #getReportGroup()
	 * @generated
	 */
	EReference getReportGroup_ReportGroup();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.emf.teneo.samples.emf.sample.accounting.ReportGroup#getAccount <em>Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Account</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.accounting.ReportGroup#getAccount()
	 * @see #getReportGroup()
	 * @generated
	 */
	EReference getReportGroup_Account();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.sample.accounting.Vat <em>Vat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vat</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.accounting.Vat
	 * @generated
	 */
	EClass getVat();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.sample.accounting.Vat#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.accounting.Vat#getName()
	 * @see #getVat()
	 * @generated
	 */
	EAttribute getVat_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.sample.accounting.Vat#getRate <em>Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rate</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.accounting.Vat#getRate()
	 * @see #getVat()
	 * @generated
	 */
	EAttribute getVat_Rate();

	/**
	 * Returns the meta object for data type '{@link java.util.Date <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Date</em>'.
	 * @see java.util.Date
	 * @model instanceClass="java.util.Date"
	 *        extendedMetaData="name='Date'" 
	 * @generated
	 */
	EDataType getDate();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AccountingFactory getAccountingFactory();

} //AccountingPackage

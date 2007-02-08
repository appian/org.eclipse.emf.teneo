/**
 * <copyright>
 * </copyright>
 *
 * $Id: AccountingPackageImpl.java,v 1.2 2007/02/08 23:09:19 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.sample.accounting.impl;

import java.util.Date;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.eclipse.emf.ecore.xml.type.impl.XMLTypePackageImpl;

import org.eclipse.emf.teneo.samples.emf.sample.accounting.Account;
import org.eclipse.emf.teneo.samples.emf.sample.accounting.AccountGroup;
import org.eclipse.emf.teneo.samples.emf.sample.accounting.Accounting;
import org.eclipse.emf.teneo.samples.emf.sample.accounting.AccountingFactory;
import org.eclipse.emf.teneo.samples.emf.sample.accounting.AccountingPackage;
import org.eclipse.emf.teneo.samples.emf.sample.accounting.BalanceAccount;
import org.eclipse.emf.teneo.samples.emf.sample.accounting.JournalGroup;
import org.eclipse.emf.teneo.samples.emf.sample.accounting.JournalStatement;
import org.eclipse.emf.teneo.samples.emf.sample.accounting.PLAccount;
import org.eclipse.emf.teneo.samples.emf.sample.accounting.Report;
import org.eclipse.emf.teneo.samples.emf.sample.accounting.ReportGroup;
import org.eclipse.emf.teneo.samples.emf.sample.accounting.Vat;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AccountingPackageImpl extends EPackageImpl implements AccountingPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accountEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accountGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accountingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass balanceAccountEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass journalGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass journalStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass plAccountEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reportGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vatEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType dateEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.emf.teneo.samples.emf.sample.accounting.AccountingPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AccountingPackageImpl() {
		super(eNS_URI, AccountingFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this
	 * model, and for any others upon which it depends.  Simple
	 * dependencies are satisfied by calling this method on all
	 * dependent packages before doing anything else.  This method drives
	 * initialization for interdependent packages directly, in parallel
	 * with this package, itself.
	 * <p>Of this package and its interdependencies, all packages which
	 * have not yet been registered by their URI values are first created
	 * and registered.  The packages are then initialized in two steps:
	 * meta-model objects for all of the packages are created before any
	 * are initialized, since one package's meta-model objects may refer to
	 * those of another.
	 * <p>Invocation of this method will not affect any packages that have
	 * already been initialized.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AccountingPackage init() {
		if (isInited) return (AccountingPackage)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI);

		// Obtain or create and register package
		AccountingPackageImpl theAccountingPackage = (AccountingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof AccountingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new AccountingPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theAccountingPackage.createPackageContents();

		// Initialize created meta-data
		theAccountingPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAccountingPackage.freeze();

		return theAccountingPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAccount() {
		return accountEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAccount_Name() {
		return (EAttribute)accountEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAccountGroup() {
		return accountGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAccountGroup_Name() {
		return (EAttribute)accountGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAccountGroup_Account() {
		return (EReference)accountGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAccounting() {
		return accountingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAccounting_Name() {
		return (EAttribute)accountingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAccounting_AccountGroup() {
		return (EReference)accountingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAccounting_Vat() {
		return (EReference)accountingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAccounting_VatAccount() {
		return (EReference)accountingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAccounting_Report() {
		return (EReference)accountingEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAccounting_JournalGroup() {
		return (EReference)accountingEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBalanceAccount() {
		return balanceAccountEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBalanceAccount_Report() {
		return (EReference)balanceAccountEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJournalGroup() {
		return journalGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJournalGroup_Name() {
		return (EAttribute)journalGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJournalGroup_JournalGroups() {
		return (EReference)journalGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJournalGroup_JournalStatements() {
		return (EReference)journalGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJournalStatement() {
		return journalStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJournalStatement_Description() {
		return (EAttribute)journalStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJournalStatement_Date() {
		return (EAttribute)journalStatementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJournalStatement_Amount() {
		return (EAttribute)journalStatementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJournalStatement_DebitAccount() {
		return (EReference)journalStatementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJournalStatement_CreditAccount() {
		return (EReference)journalStatementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJournalStatement_Vat() {
		return (EReference)journalStatementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPLAccount() {
		return plAccountEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReport() {
		return reportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReport_Name() {
		return (EAttribute)reportEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReport_DebitReportGroup() {
		return (EReference)reportEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReport_CreditReportGroup() {
		return (EReference)reportEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReportGroup() {
		return reportGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReportGroup_Name() {
		return (EAttribute)reportGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReportGroup_ReportGroup() {
		return (EReference)reportGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReportGroup_Account() {
		return (EReference)reportGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVat() {
		return vatEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVat_Name() {
		return (EAttribute)vatEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVat_Rate() {
		return (EAttribute)vatEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDate() {
		return dateEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccountingFactory getAccountingFactory() {
		return (AccountingFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		accountEClass = createEClass(ACCOUNT);
		createEAttribute(accountEClass, ACCOUNT__NAME);

		accountGroupEClass = createEClass(ACCOUNT_GROUP);
		createEAttribute(accountGroupEClass, ACCOUNT_GROUP__NAME);
		createEReference(accountGroupEClass, ACCOUNT_GROUP__ACCOUNT);

		accountingEClass = createEClass(ACCOUNTING);
		createEAttribute(accountingEClass, ACCOUNTING__NAME);
		createEReference(accountingEClass, ACCOUNTING__ACCOUNT_GROUP);
		createEReference(accountingEClass, ACCOUNTING__VAT);
		createEReference(accountingEClass, ACCOUNTING__VAT_ACCOUNT);
		createEReference(accountingEClass, ACCOUNTING__REPORT);
		createEReference(accountingEClass, ACCOUNTING__JOURNAL_GROUP);

		balanceAccountEClass = createEClass(BALANCE_ACCOUNT);
		createEReference(balanceAccountEClass, BALANCE_ACCOUNT__REPORT);

		journalGroupEClass = createEClass(JOURNAL_GROUP);
		createEAttribute(journalGroupEClass, JOURNAL_GROUP__NAME);
		createEReference(journalGroupEClass, JOURNAL_GROUP__JOURNAL_GROUPS);
		createEReference(journalGroupEClass, JOURNAL_GROUP__JOURNAL_STATEMENTS);

		journalStatementEClass = createEClass(JOURNAL_STATEMENT);
		createEAttribute(journalStatementEClass, JOURNAL_STATEMENT__DESCRIPTION);
		createEAttribute(journalStatementEClass, JOURNAL_STATEMENT__DATE);
		createEAttribute(journalStatementEClass, JOURNAL_STATEMENT__AMOUNT);
		createEReference(journalStatementEClass, JOURNAL_STATEMENT__DEBIT_ACCOUNT);
		createEReference(journalStatementEClass, JOURNAL_STATEMENT__CREDIT_ACCOUNT);
		createEReference(journalStatementEClass, JOURNAL_STATEMENT__VAT);

		plAccountEClass = createEClass(PL_ACCOUNT);

		reportEClass = createEClass(REPORT);
		createEAttribute(reportEClass, REPORT__NAME);
		createEReference(reportEClass, REPORT__DEBIT_REPORT_GROUP);
		createEReference(reportEClass, REPORT__CREDIT_REPORT_GROUP);

		reportGroupEClass = createEClass(REPORT_GROUP);
		createEAttribute(reportGroupEClass, REPORT_GROUP__NAME);
		createEReference(reportGroupEClass, REPORT_GROUP__REPORT_GROUP);
		createEReference(reportGroupEClass, REPORT_GROUP__ACCOUNT);

		vatEClass = createEClass(VAT);
		createEAttribute(vatEClass, VAT__NAME);
		createEAttribute(vatEClass, VAT__RATE);

		// Create data types
		dateEDataType = createEDataType(DATE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		balanceAccountEClass.getESuperTypes().add(this.getAccount());
		plAccountEClass.getESuperTypes().add(this.getAccount());

		// Initialize classes and features; add operations and parameters
		initEClass(accountEClass, Account.class, "Account", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAccount_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, Account.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(accountGroupEClass, AccountGroup.class, "AccountGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAccountGroup_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, AccountGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAccountGroup_Account(), this.getAccount(), null, "account", null, 0, -1, AccountGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(accountingEClass, Accounting.class, "Accounting", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAccounting_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, Accounting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAccounting_AccountGroup(), this.getAccountGroup(), null, "accountGroup", null, 0, -1, Accounting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAccounting_Vat(), this.getVat(), null, "vat", null, 0, -1, Accounting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAccounting_VatAccount(), this.getBalanceAccount(), null, "vatAccount", null, 0, 1, Accounting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAccounting_Report(), this.getReport(), null, "report", null, 0, 1, Accounting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAccounting_JournalGroup(), this.getJournalGroup(), null, "journalGroup", null, 0, -1, Accounting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(balanceAccountEClass, BalanceAccount.class, "BalanceAccount", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBalanceAccount_Report(), this.getReportGroup(), this.getReportGroup_Account(), "report", null, 0, -1, BalanceAccount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(journalGroupEClass, JournalGroup.class, "JournalGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJournalGroup_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, JournalGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJournalGroup_JournalGroups(), this.getJournalGroup(), null, "journalGroups", null, 0, -1, JournalGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJournalGroup_JournalStatements(), this.getJournalStatement(), null, "journalStatements", null, 0, -1, JournalGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(journalStatementEClass, JournalStatement.class, "JournalStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJournalStatement_Description(), theXMLTypePackage.getString(), "description", null, 1, 1, JournalStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJournalStatement_Date(), this.getDate(), "date", null, 1, 1, JournalStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJournalStatement_Amount(), theXMLTypePackage.getFloat(), "amount", null, 1, 1, JournalStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJournalStatement_DebitAccount(), this.getAccount(), null, "debitAccount", null, 1, 1, JournalStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJournalStatement_CreditAccount(), this.getAccount(), null, "creditAccount", null, 1, 1, JournalStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJournalStatement_Vat(), this.getVat(), null, "vat", null, 0, 1, JournalStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(plAccountEClass, PLAccount.class, "PLAccount", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(reportEClass, Report.class, "Report", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReport_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, Report.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReport_DebitReportGroup(), this.getReportGroup(), null, "debitReportGroup", null, 1, 1, Report.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReport_CreditReportGroup(), this.getReportGroup(), null, "creditReportGroup", null, 1, 1, Report.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(reportGroupEClass, ReportGroup.class, "ReportGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReportGroup_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, ReportGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReportGroup_ReportGroup(), this.getReportGroup(), null, "reportGroup", null, 0, -1, ReportGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReportGroup_Account(), this.getBalanceAccount(), this.getBalanceAccount_Report(), "account", null, 0, -1, ReportGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vatEClass, Vat.class, "Vat", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVat_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, Vat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVat_Rate(), theXMLTypePackage.getFloat(), "rate", null, 1, 1, Vat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize data types
		initEDataType(dateEDataType, Date.class, "Date", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";		
		addAnnotation
		  (accountEClass, 
		   source, 
		   new String[] {
			 "name", "Account",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getAccount_Name(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "name"
		   });		
		addAnnotation
		  (accountGroupEClass, 
		   source, 
		   new String[] {
			 "name", "AccountGroup",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getAccountGroup_Name(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "name"
		   });		
		addAnnotation
		  (getAccountGroup_Account(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "account"
		   });		
		addAnnotation
		  (accountingEClass, 
		   source, 
		   new String[] {
			 "name", "Accounting",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getAccounting_Name(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "name"
		   });		
		addAnnotation
		  (getAccounting_AccountGroup(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "accountGroup"
		   });		
		addAnnotation
		  (getAccounting_Vat(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "vat"
		   });		
		addAnnotation
		  (getAccounting_VatAccount(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "vatAccount"
		   });		
		addAnnotation
		  (getAccounting_Report(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "report"
		   });		
		addAnnotation
		  (getAccounting_JournalGroup(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "JournalGroup"
		   });		
		addAnnotation
		  (balanceAccountEClass, 
		   source, 
		   new String[] {
			 "name", "BalanceAccount",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getBalanceAccount_Report(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "report"
		   });		
		addAnnotation
		  (dateEDataType, 
		   source, 
		   new String[] {
			 "name", "Date"
		   });		
		addAnnotation
		  (journalGroupEClass, 
		   source, 
		   new String[] {
			 "name", "JournalGroup",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getJournalGroup_Name(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "name"
		   });		
		addAnnotation
		  (getJournalGroup_JournalGroups(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "journalGroups"
		   });		
		addAnnotation
		  (getJournalGroup_JournalStatements(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "journalStatements"
		   });		
		addAnnotation
		  (journalStatementEClass, 
		   source, 
		   new String[] {
			 "name", "JournalStatement",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getJournalStatement_Description(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "description"
		   });		
		addAnnotation
		  (getJournalStatement_Date(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "date"
		   });		
		addAnnotation
		  (getJournalStatement_Amount(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "amount"
		   });		
		addAnnotation
		  (getJournalStatement_DebitAccount(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "debitAccount"
		   });		
		addAnnotation
		  (getJournalStatement_CreditAccount(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "creditAccount"
		   });		
		addAnnotation
		  (getJournalStatement_Vat(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "vat"
		   });		
		addAnnotation
		  (plAccountEClass, 
		   source, 
		   new String[] {
			 "name", "PLAccount",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (reportEClass, 
		   source, 
		   new String[] {
			 "name", "Report",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getReport_Name(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "name"
		   });		
		addAnnotation
		  (getReport_DebitReportGroup(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "debitReportGroup"
		   });		
		addAnnotation
		  (getReport_CreditReportGroup(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "creditReportGroup"
		   });		
		addAnnotation
		  (reportGroupEClass, 
		   source, 
		   new String[] {
			 "name", "ReportGroup",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getReportGroup_Name(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "name"
		   });		
		addAnnotation
		  (getReportGroup_ReportGroup(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "reportGroup"
		   });		
		addAnnotation
		  (getReportGroup_Account(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "account"
		   });		
		addAnnotation
		  (vatEClass, 
		   source, 
		   new String[] {
			 "name", "Vat",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getVat_Name(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "name"
		   });		
		addAnnotation
		  (getVat_Rate(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "rate"
		   });
	}

} //AccountingPackageImpl

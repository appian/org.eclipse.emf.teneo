/**
 * <copyright>
 * </copyright>
 *
 * $Id: AccountingFactoryImpl.java,v 1.2 2007/02/08 23:09:19 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.sample.accounting.impl;

import java.util.Date;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.xml.type.internal.XMLCalendar;
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
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AccountingFactoryImpl extends EFactoryImpl implements AccountingFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AccountingFactory init() {
		try {
			AccountingFactory theAccountingFactory = (AccountingFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/emf/teneo/samples/emf/sample/accounting"); 
			if (theAccountingFactory != null) {
				return theAccountingFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AccountingFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccountingFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case AccountingPackage.ACCOUNT_GROUP: return createAccountGroup();
			case AccountingPackage.ACCOUNTING: return createAccounting();
			case AccountingPackage.BALANCE_ACCOUNT: return createBalanceAccount();
			case AccountingPackage.JOURNAL_GROUP: return createJournalGroup();
			case AccountingPackage.JOURNAL_STATEMENT: return createJournalStatement();
			case AccountingPackage.PL_ACCOUNT: return createPLAccount();
			case AccountingPackage.REPORT: return createReport();
			case AccountingPackage.REPORT_GROUP: return createReportGroup();
			case AccountingPackage.VAT: return createVat();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case AccountingPackage.DATE:
				return createDateFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case AccountingPackage.DATE:
				return convertDateToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccountGroup createAccountGroup() {
		AccountGroupImpl accountGroup = new AccountGroupImpl();
		return accountGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Accounting createAccounting() {
		AccountingImpl accounting = new AccountingImpl();
		return accounting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BalanceAccount createBalanceAccount() {
		BalanceAccountImpl balanceAccount = new BalanceAccountImpl();
		return balanceAccount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JournalGroup createJournalGroup() {
		JournalGroupImpl journalGroup = new JournalGroupImpl();
		return journalGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JournalStatement createJournalStatement() {
		JournalStatementImpl journalStatement = new JournalStatementImpl();
		return journalStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PLAccount createPLAccount() {
		PLAccountImpl plAccount = new PLAccountImpl();
		return plAccount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Report createReport() {
		ReportImpl report = new ReportImpl();
		return report;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReportGroup createReportGroup() {
		ReportGroupImpl reportGroup = new ReportGroupImpl();
		return reportGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vat createVat() {
		VatImpl vat = new VatImpl();
		return vat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Changed implementation because generated method did not work correctly
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Date createDateFromString(EDataType eDataType, String initialValue) {
	    return initialValue == null ?  null : new XMLCalendar(collapseWhiteSpace(initialValue), XMLCalendar.DATETIME).getDate();
	}

	/**
	 * <!-- begin-user-doc -->
	 * Changed implementation because generated method did not work correctly
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String convertDateToString(EDataType eDataType, Object instanceValue) {
	   if (instanceValue == null)
	    {
	      return null;
	    }
	    if (instanceValue instanceof Date)
	    {
	      // Bug 124306: we should rely on XMLCalendar to normalize Dave value, to ensure that all Date value
	      // fields are taken into account.
	      return new XMLCalendar((Date)instanceValue, XMLCalendar.DATETIME).toString();
	    }
	    return instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccountingPackage getAccountingPackage() {
		return (AccountingPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AccountingPackage getPackage() {
		return AccountingPackage.eINSTANCE;
	}

} //AccountingFactoryImpl

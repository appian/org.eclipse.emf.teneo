/**
 * <copyright>
 * </copyright>
 *
 * $Id: AccountingSwitch.java,v 1.1 2006/07/11 16:56:55 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.sample.accounting.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.teneo.samples.emf.sample.accounting.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.teneo.samples.emf.sample.accounting.AccountingPackage
 * @generated
 */
public class AccountingSwitch {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AccountingPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccountingSwitch() {
		if (modelPackage == null) {
			modelPackage = AccountingPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public Object doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected Object doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch((EClass)eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected Object doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case AccountingPackage.ACCOUNT: {
				Account account = (Account)theEObject;
				Object result = caseAccount(account);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AccountingPackage.ACCOUNT_GROUP: {
				AccountGroup accountGroup = (AccountGroup)theEObject;
				Object result = caseAccountGroup(accountGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AccountingPackage.ACCOUNTING: {
				Accounting accounting = (Accounting)theEObject;
				Object result = caseAccounting(accounting);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AccountingPackage.BALANCE_ACCOUNT: {
				BalanceAccount balanceAccount = (BalanceAccount)theEObject;
				Object result = caseBalanceAccount(balanceAccount);
				if (result == null) result = caseAccount(balanceAccount);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AccountingPackage.JOURNAL_GROUP: {
				JournalGroup journalGroup = (JournalGroup)theEObject;
				Object result = caseJournalGroup(journalGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AccountingPackage.JOURNAL_STATEMENT: {
				JournalStatement journalStatement = (JournalStatement)theEObject;
				Object result = caseJournalStatement(journalStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AccountingPackage.PL_ACCOUNT: {
				PLAccount plAccount = (PLAccount)theEObject;
				Object result = casePLAccount(plAccount);
				if (result == null) result = caseAccount(plAccount);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AccountingPackage.REPORT: {
				Report report = (Report)theEObject;
				Object result = caseReport(report);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AccountingPackage.REPORT_GROUP: {
				ReportGroup reportGroup = (ReportGroup)theEObject;
				Object result = caseReportGroup(reportGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AccountingPackage.VAT: {
				Vat vat = (Vat)theEObject;
				Object result = caseVat(vat);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Account</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Account</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAccount(Account object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Account Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Account Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAccountGroup(AccountGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Accounting</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Accounting</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAccounting(Accounting object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Balance Account</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Balance Account</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBalanceAccount(BalanceAccount object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Journal Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Journal Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseJournalGroup(JournalGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Journal Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Journal Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseJournalStatement(JournalStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>PL Account</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>PL Account</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePLAccount(PLAccount object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Report</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Report</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseReport(Report object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Report Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Report Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseReportGroup(ReportGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Vat</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Vat</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseVat(Vat object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public Object defaultCase(EObject object) {
		return null;
	}

} //AccountingSwitch

/**
 * <copyright>
 * </copyright>
 *
 * $Id: JournalStatement.java,v 1.1 2006/07/11 16:57:04 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.sample.accounting;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Journal Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.accounting.JournalStatement#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.accounting.JournalStatement#getDate <em>Date</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.accounting.JournalStatement#getAmount <em>Amount</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.accounting.JournalStatement#getDebitAccount <em>Debit Account</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.accounting.JournalStatement#getCreditAccount <em>Credit Account</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.accounting.JournalStatement#getVat <em>Vat</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.emf.sample.accounting.AccountingPackage#getJournalStatement()
 * @model extendedMetaData="name='JournalStatement' kind='elementOnly'"
 * @generated
 */
public interface JournalStatement extends EObject {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.eclipse.emf.teneo.samples.emf.sample.accounting.AccountingPackage#getJournalStatement_Description()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='description'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.accounting.JournalStatement#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(Date)
	 * @see org.eclipse.emf.teneo.samples.emf.sample.accounting.AccountingPackage#getJournalStatement_Date()
	 * @model unique="false" dataType="org.eclipse.emf.teneo.samples.emf.sample.accounting.Date" required="true"
	 *        extendedMetaData="kind='element' name='date'"
	 * @generated
	 */
	Date getDate();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.accounting.JournalStatement#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(Date value);

	/**
	 * Returns the value of the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Amount</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amount</em>' attribute.
	 * @see #isSetAmount()
	 * @see #unsetAmount()
	 * @see #setAmount(float)
	 * @see org.eclipse.emf.teneo.samples.emf.sample.accounting.AccountingPackage#getJournalStatement_Amount()
	 * @model unique="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Float" required="true"
	 *        extendedMetaData="kind='element' name='amount'"
	 * @generated
	 */
	float getAmount();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.accounting.JournalStatement#getAmount <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount</em>' attribute.
	 * @see #isSetAmount()
	 * @see #unsetAmount()
	 * @see #getAmount()
	 * @generated
	 */
	void setAmount(float value);

	/**
	 * Unsets the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.accounting.JournalStatement#getAmount <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAmount()
	 * @see #getAmount()
	 * @see #setAmount(float)
	 * @generated
	 */
	void unsetAmount();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.accounting.JournalStatement#getAmount <em>Amount</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Amount</em>' attribute is set.
	 * @see #unsetAmount()
	 * @see #getAmount()
	 * @see #setAmount(float)
	 * @generated
	 */
	boolean isSetAmount();

	/**
	 * Returns the value of the '<em><b>Debit Account</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Debit Account</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Debit Account</em>' reference.
	 * @see #setDebitAccount(Account)
	 * @see org.eclipse.emf.teneo.samples.emf.sample.accounting.AccountingPackage#getJournalStatement_DebitAccount()
	 * @model resolveProxies="false" required="true"
	 *        extendedMetaData="kind='element' name='debitAccount'"
	 * @generated
	 */
	Account getDebitAccount();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.accounting.JournalStatement#getDebitAccount <em>Debit Account</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Debit Account</em>' reference.
	 * @see #getDebitAccount()
	 * @generated
	 */
	void setDebitAccount(Account value);

	/**
	 * Returns the value of the '<em><b>Credit Account</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Credit Account</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Credit Account</em>' reference.
	 * @see #setCreditAccount(Account)
	 * @see org.eclipse.emf.teneo.samples.emf.sample.accounting.AccountingPackage#getJournalStatement_CreditAccount()
	 * @model resolveProxies="false" required="true"
	 *        extendedMetaData="kind='element' name='creditAccount'"
	 * @generated
	 */
	Account getCreditAccount();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.accounting.JournalStatement#getCreditAccount <em>Credit Account</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Credit Account</em>' reference.
	 * @see #getCreditAccount()
	 * @generated
	 */
	void setCreditAccount(Account value);

	/**
	 * Returns the value of the '<em><b>Vat</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vat</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vat</em>' reference.
	 * @see #isSetVat()
	 * @see #unsetVat()
	 * @see #setVat(Vat)
	 * @see org.eclipse.emf.teneo.samples.emf.sample.accounting.AccountingPackage#getJournalStatement_Vat()
	 * @model resolveProxies="false" unsettable="true"
	 *        extendedMetaData="kind='element' name='vat'"
	 * @generated
	 */
	Vat getVat();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.accounting.JournalStatement#getVat <em>Vat</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vat</em>' reference.
	 * @see #isSetVat()
	 * @see #unsetVat()
	 * @see #getVat()
	 * @generated
	 */
	void setVat(Vat value);

	/**
	 * Unsets the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.accounting.JournalStatement#getVat <em>Vat</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVat()
	 * @see #getVat()
	 * @see #setVat(Vat)
	 * @generated
	 */
	void unsetVat();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.accounting.JournalStatement#getVat <em>Vat</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Vat</em>' reference is set.
	 * @see #unsetVat()
	 * @see #getVat()
	 * @see #setVat(Vat)
	 * @generated
	 */
	boolean isSetVat();

} // JournalStatement

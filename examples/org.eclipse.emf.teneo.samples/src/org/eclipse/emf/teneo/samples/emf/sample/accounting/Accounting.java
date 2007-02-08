/**
 * <copyright>
 * </copyright>
 *
 * $Id: Accounting.java,v 1.2 2007/02/08 23:09:21 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.sample.accounting;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Accounting</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.accounting.Accounting#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.accounting.Accounting#getAccountGroup <em>Account Group</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.accounting.Accounting#getVat <em>Vat</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.accounting.Accounting#getVatAccount <em>Vat Account</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.accounting.Accounting#getReport <em>Report</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.accounting.Accounting#getJournalGroup <em>Journal Group</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.emf.sample.accounting.AccountingPackage#getAccounting()
 * @model extendedMetaData="name='Accounting' kind='elementOnly'"
 * @generated
 */
public interface Accounting extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #isSetName()
	 * @see #unsetName()
	 * @see #setName(String)
	 * @see org.eclipse.emf.teneo.samples.emf.sample.accounting.AccountingPackage#getAccounting_Name()
	 * @model unique="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.accounting.Accounting#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #isSetName()
	 * @see #unsetName()
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Unsets the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.accounting.Accounting#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetName()
	 * @see #getName()
	 * @see #setName(String)
	 * @generated
	 */
	void unsetName();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.accounting.Accounting#getName <em>Name</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Name</em>' attribute is set.
	 * @see #unsetName()
	 * @see #getName()
	 * @see #setName(String)
	 * @generated
	 */
	boolean isSetName();

	/**
	 * Returns the value of the '<em><b>Account Group</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.samples.emf.sample.accounting.AccountGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Account Group</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Account Group</em>' containment reference list.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.accounting.AccountingPackage#getAccounting_AccountGroup()
	 * @model type="org.eclipse.emf.teneo.samples.emf.sample.accounting.AccountGroup" containment="true"
	 *        extendedMetaData="kind='element' name='accountGroup'"
	 * @generated
	 */
	EList<AccountGroup> getAccountGroup();

	/**
	 * Returns the value of the '<em><b>Vat</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.samples.emf.sample.accounting.Vat}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vat</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vat</em>' containment reference list.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.accounting.AccountingPackage#getAccounting_Vat()
	 * @model type="org.eclipse.emf.teneo.samples.emf.sample.accounting.Vat" containment="true"
	 *        extendedMetaData="kind='element' name='vat'"
	 * @generated
	 */
	EList<Vat> getVat();

	/**
	 * Returns the value of the '<em><b>Vat Account</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vat Account</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vat Account</em>' reference.
	 * @see #setVatAccount(BalanceAccount)
	 * @see org.eclipse.emf.teneo.samples.emf.sample.accounting.AccountingPackage#getAccounting_VatAccount()
	 * @model resolveProxies="false"
	 *        extendedMetaData="kind='element' name='vatAccount'"
	 * @generated
	 */
	BalanceAccount getVatAccount();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.accounting.Accounting#getVatAccount <em>Vat Account</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vat Account</em>' reference.
	 * @see #getVatAccount()
	 * @generated
	 */
	void setVatAccount(BalanceAccount value);

	/**
	 * Returns the value of the '<em><b>Report</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Report</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Report</em>' containment reference.
	 * @see #setReport(Report)
	 * @see org.eclipse.emf.teneo.samples.emf.sample.accounting.AccountingPackage#getAccounting_Report()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='report'"
	 * @generated
	 */
	Report getReport();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.accounting.Accounting#getReport <em>Report</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Report</em>' containment reference.
	 * @see #getReport()
	 * @generated
	 */
	void setReport(Report value);

	/**
	 * Returns the value of the '<em><b>Journal Group</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.samples.emf.sample.accounting.JournalGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Journal Group</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Journal Group</em>' containment reference list.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.accounting.AccountingPackage#getAccounting_JournalGroup()
	 * @model type="org.eclipse.emf.teneo.samples.emf.sample.accounting.JournalGroup" containment="true"
	 *        extendedMetaData="kind='element' name='JournalGroup'"
	 * @generated
	 */
	EList<JournalGroup> getJournalGroup();

} // Accounting

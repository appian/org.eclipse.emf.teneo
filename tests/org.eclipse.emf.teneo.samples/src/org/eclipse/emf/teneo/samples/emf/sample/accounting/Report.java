/**
 * <copyright>
 * </copyright>
 *
 * $Id: Report.java,v 1.2 2007/02/08 23:09:21 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.sample.accounting;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Report</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.accounting.Report#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.accounting.Report#getDebitReportGroup <em>Debit Report Group</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.accounting.Report#getCreditReportGroup <em>Credit Report Group</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.emf.sample.accounting.AccountingPackage#getReport()
 * @model extendedMetaData="name='Report' kind='elementOnly'"
 * @generated
 */
public interface Report extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.emf.teneo.samples.emf.sample.accounting.AccountingPackage#getReport_Name()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.accounting.Report#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Debit Report Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Debit Report Group</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Debit Report Group</em>' containment reference.
	 * @see #setDebitReportGroup(ReportGroup)
	 * @see org.eclipse.emf.teneo.samples.emf.sample.accounting.AccountingPackage#getReport_DebitReportGroup()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='debitReportGroup'"
	 * @generated
	 */
	ReportGroup getDebitReportGroup();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.accounting.Report#getDebitReportGroup <em>Debit Report Group</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Debit Report Group</em>' containment reference.
	 * @see #getDebitReportGroup()
	 * @generated
	 */
	void setDebitReportGroup(ReportGroup value);

	/**
	 * Returns the value of the '<em><b>Credit Report Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Credit Report Group</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Credit Report Group</em>' containment reference.
	 * @see #setCreditReportGroup(ReportGroup)
	 * @see org.eclipse.emf.teneo.samples.emf.sample.accounting.AccountingPackage#getReport_CreditReportGroup()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='creditReportGroup'"
	 * @generated
	 */
	ReportGroup getCreditReportGroup();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.accounting.Report#getCreditReportGroup <em>Credit Report Group</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Credit Report Group</em>' containment reference.
	 * @see #getCreditReportGroup()
	 * @generated
	 */
	void setCreditReportGroup(ReportGroup value);

} // Report

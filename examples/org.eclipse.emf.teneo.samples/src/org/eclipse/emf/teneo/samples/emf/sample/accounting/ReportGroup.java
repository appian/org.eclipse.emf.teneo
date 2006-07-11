/**
 * <copyright>
 * </copyright>
 *
 * $Id: ReportGroup.java,v 1.1 2006/07/11 16:57:04 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.sample.accounting;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Report Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.accounting.ReportGroup#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.accounting.ReportGroup#getReportGroup <em>Report Group</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.accounting.ReportGroup#getAccount <em>Account</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.emf.sample.accounting.AccountingPackage#getReportGroup()
 * @model extendedMetaData="name='ReportGroup' kind='elementOnly'"
 * @generated
 */
public interface ReportGroup extends EObject {
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
	 * @see org.eclipse.emf.teneo.samples.emf.sample.accounting.AccountingPackage#getReportGroup_Name()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.accounting.ReportGroup#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Report Group</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.samples.emf.sample.accounting.ReportGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Report Group</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Report Group</em>' containment reference list.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.accounting.AccountingPackage#getReportGroup_ReportGroup()
	 * @model type="org.eclipse.emf.teneo.samples.emf.sample.accounting.ReportGroup" containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='reportGroup'"
	 * @generated
	 */
	EList getReportGroup();

	/**
	 * Returns the value of the '<em><b>Account</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.samples.emf.sample.accounting.BalanceAccount}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.emf.teneo.samples.emf.sample.accounting.BalanceAccount#getReport <em>Report</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Account</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Account</em>' reference list.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.accounting.AccountingPackage#getReportGroup_Account()
	 * @see org.eclipse.emf.teneo.samples.emf.sample.accounting.BalanceAccount#getReport
	 * @model type="org.eclipse.emf.teneo.samples.emf.sample.accounting.BalanceAccount" opposite="report" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='account'"
	 * @generated
	 */
	EList getAccount();

} // ReportGroup

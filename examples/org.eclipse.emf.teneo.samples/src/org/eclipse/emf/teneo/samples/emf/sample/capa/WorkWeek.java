/**
 * <copyright>
 * </copyright>
 *
 * $Id: WorkWeek.java,v 1.2 2006/11/07 10:22:28 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.sample.capa;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Work Week</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.capa.WorkWeek#getDays <em>Days</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.capa.WorkWeek#getWorkWeekId <em>Work Week Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.emf.sample.capa.CapaPackage#getWorkWeek()
 * @model extendedMetaData="name='WorkWeek' kind='elementOnly'"
 * @generated
 */
public interface WorkWeek extends EObject {
	/**
	 * Returns the value of the '<em><b>Days</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.samples.emf.sample.capa.WorkDay}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Days</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Days</em>' containment reference list.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.capa.CapaPackage#getWorkWeek_Days()
	 * @model type="org.eclipse.emf.teneo.samples.emf.sample.capa.WorkDay" containment="true" upper="7"
	 *        extendedMetaData="kind='element' name='Days'"
	 * @generated
	 */
	EList getDays();

	/** Set the days */
	public void setDays(EList list);

	/**
	 * Returns the value of the '<em><b>Work Week Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Work Week Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Week Id</em>' attribute.
	 * @see #setWorkWeekId(String)
	 * @see org.eclipse.emf.teneo.samples.emf.sample.capa.CapaPackage#getWorkWeek_WorkWeekId()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='WorkWeekId'"
	 * @generated
	 */
	String getWorkWeekId();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.capa.WorkWeek#getWorkWeekId <em>Work Week Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Work Week Id</em>' attribute.
	 * @see #getWorkWeekId()
	 * @generated
	 */
	void setWorkWeekId(String value);

} // WorkWeek
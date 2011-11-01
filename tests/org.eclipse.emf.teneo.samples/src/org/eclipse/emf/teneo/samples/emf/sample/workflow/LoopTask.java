/**
 * <copyright>
 * </copyright>
 *
 * $Id: LoopTask.java,v 1.1 2006/07/11 16:57:00 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.sample.workflow;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Loop Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.workflow.LoopTask#getWhileCondition <em>While Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.emf.sample.workflow.WorkflowPackage#getLoopTask()
 * @model
 * @generated
 */
public interface LoopTask extends CompoundTask {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2003 IBM Corporation";

	/**
	 * Returns the value of the '<em><b>While Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>While Condition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>While Condition</em>' attribute.
	 * @see #setWhileCondition(String)
	 * @see org.eclipse.emf.teneo.samples.emf.sample.workflow.WorkflowPackage#getLoopTask_WhileCondition()
	 * @model required="true"
	 * @generated
	 */
	String getWhileCondition();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.workflow.LoopTask#getWhileCondition <em>While Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>While Condition</em>' attribute.
	 * @see #getWhileCondition()
	 * @generated
	 */
	void setWhileCondition(String value);

} // LoopTask

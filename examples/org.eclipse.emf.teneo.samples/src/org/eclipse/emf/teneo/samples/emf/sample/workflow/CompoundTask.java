/**
 * <copyright>
 * </copyright>
 *
 * $Id: CompoundTask.java,v 1.1 2006/07/11 16:57:00 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.sample.workflow;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compound Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.workflow.CompoundTask#getSubworkflow <em>Subworkflow</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.emf.sample.workflow.WorkflowPackage#getCompoundTask()
 * @model
 * @generated
 */
public interface CompoundTask extends WorkflowNode {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2003 IBM Corporation";

	/**
	 * Returns the value of the '<em><b>Subworkflow</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subworkflow</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subworkflow</em>' reference.
	 * @see #setSubworkflow(Workflow)
	 * @see org.eclipse.emf.teneo.samples.emf.sample.workflow.WorkflowPackage#getCompoundTask_Subworkflow()
	 * @model required="true"
	 * @generated
	 */
	Workflow getSubworkflow();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.workflow.CompoundTask#getSubworkflow <em>Subworkflow</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subworkflow</em>' reference.
	 * @see #getSubworkflow()
	 * @generated
	 */
	void setSubworkflow(Workflow value);

} // CompoundTask

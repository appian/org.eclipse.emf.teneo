/**
 * <copyright>
 * </copyright>
 *
 * $Id: Workflow.java,v 1.1 2006/07/11 16:57:00 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.sample.workflow;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Workflow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.workflow.Workflow#getNodes <em>Nodes</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.workflow.Workflow#getEdges <em>Edges</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.workflow.Workflow#getComments <em>Comments</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.emf.sample.workflow.WorkflowPackage#getWorkflow()
 * @model
 * @generated
 */
public interface Workflow extends WorkflowElement{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2003 IBM Corporation";

	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.samples.emf.sample.workflow.WorkflowNode}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.emf.teneo.samples.emf.sample.workflow.WorkflowNode#getWorkflow <em>Workflow</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nodes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes</em>' containment reference list.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.workflow.WorkflowPackage#getWorkflow_Nodes()
	 * @see org.eclipse.emf.teneo.samples.emf.sample.workflow.WorkflowNode#getWorkflow
	 * @model type="org.eclipse.emf.teneo.samples.emf.sample.workflow.WorkflowNode" opposite="workflow" containment="true"
	 * @generated
	 */
	EList getNodes();

	/**
	 * Returns the value of the '<em><b>Edges</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.samples.emf.sample.workflow.Edge}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.emf.teneo.samples.emf.sample.workflow.Edge#getWorkflow <em>Workflow</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edges</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edges</em>' containment reference list.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.workflow.WorkflowPackage#getWorkflow_Edges()
	 * @see org.eclipse.emf.teneo.samples.emf.sample.workflow.Edge#getWorkflow
	 * @model type="org.eclipse.emf.teneo.samples.emf.sample.workflow.Edge" opposite="workflow" containment="true"
	 * @generated
	 */
	EList getEdges();

	/**
	 * Returns the value of the '<em><b>Comments</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.samples.emf.sample.workflow.Comment}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.emf.teneo.samples.emf.sample.workflow.Comment#getWorkflow <em>Workflow</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comments</em>' containment reference list.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.workflow.WorkflowPackage#getWorkflow_Comments()
	 * @see org.eclipse.emf.teneo.samples.emf.sample.workflow.Comment#getWorkflow
	 * @model type="org.eclipse.emf.teneo.samples.emf.sample.workflow.Comment" opposite="workflow" containment="true"
	 * @generated
	 */
	EList getComments();

} // Workflow

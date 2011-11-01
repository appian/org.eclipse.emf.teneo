/**
 * <copyright>
 * </copyright>
 *
 * $Id: WorkflowNode.java,v 1.1 2006/07/11 16:57:00 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.sample.workflow;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.workflow.WorkflowNode#getWorkflow <em>Workflow</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.workflow.WorkflowNode#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.workflow.WorkflowNode#getInputs <em>Inputs</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.workflow.WorkflowNode#isIsStart <em>Is Start</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.workflow.WorkflowNode#isIsFinish <em>Is Finish</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.emf.sample.workflow.WorkflowPackage#getWorkflowNode()
 * @model abstract="true"
 * @generated
 */
public interface WorkflowNode extends WorkflowElement{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2003 IBM Corporation";

	/**
	 * Returns the value of the '<em><b>Workflow</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.emf.teneo.samples.emf.sample.workflow.Workflow#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Workflow</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Workflow</em>' container reference.
	 * @see #setWorkflow(Workflow)
	 * @see org.eclipse.emf.teneo.samples.emf.sample.workflow.WorkflowPackage#getWorkflowNode_Workflow()
	 * @see org.eclipse.emf.teneo.samples.emf.sample.workflow.Workflow#getNodes
	 * @model opposite="nodes" required="true"
	 * @generated
	 */
	Workflow getWorkflow();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.workflow.WorkflowNode#getWorkflow <em>Workflow</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Workflow</em>' container reference.
	 * @see #getWorkflow()
	 * @generated
	 */
	void setWorkflow(Workflow value);

	/**
	 * Returns the value of the '<em><b>Outputs</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.samples.emf.sample.workflow.OutputPort}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.emf.teneo.samples.emf.sample.workflow.OutputPort#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outputs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outputs</em>' containment reference list.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.workflow.WorkflowPackage#getWorkflowNode_Outputs()
	 * @see org.eclipse.emf.teneo.samples.emf.sample.workflow.OutputPort#getNode
	 * @model type="org.eclipse.emf.teneo.samples.emf.sample.workflow.OutputPort" opposite="node" containment="true" required="true"
	 * @generated
	 */
	EList getOutputs();

	/**
	 * Returns the value of the '<em><b>Inputs</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.samples.emf.sample.workflow.InputPort}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.emf.teneo.samples.emf.sample.workflow.InputPort#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inputs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inputs</em>' containment reference list.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.workflow.WorkflowPackage#getWorkflowNode_Inputs()
	 * @see org.eclipse.emf.teneo.samples.emf.sample.workflow.InputPort#getNode
	 * @model type="org.eclipse.emf.teneo.samples.emf.sample.workflow.InputPort" opposite="node" containment="true" required="true"
	 * @generated
	 */
	EList getInputs();

	/**
	 * Returns the value of the '<em><b>Is Start</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Start</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Start</em>' attribute.
	 * @see #setIsStart(boolean)
	 * @see org.eclipse.emf.teneo.samples.emf.sample.workflow.WorkflowPackage#getWorkflowNode_IsStart()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isIsStart();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.workflow.WorkflowNode#isIsStart <em>Is Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Start</em>' attribute.
	 * @see #isIsStart()
	 * @generated
	 */
	void setIsStart(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Finish</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Finish</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Finish</em>' attribute.
	 * @see #setIsFinish(boolean)
	 * @see org.eclipse.emf.teneo.samples.emf.sample.workflow.WorkflowPackage#getWorkflowNode_IsFinish()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isIsFinish();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.workflow.WorkflowNode#isIsFinish <em>Is Finish</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Finish</em>' attribute.
	 * @see #isIsFinish()
	 * @generated
	 */
	void setIsFinish(boolean value);

} // WorkflowNode

/**
 * <copyright>
 * </copyright>
 *
 * $Id: InputPort.java,v 1.1 2006/07/11 16:57:00 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.sample.workflow;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.workflow.InputPort#getNode <em>Node</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.workflow.InputPort#getEdges <em>Edges</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.emf.sample.workflow.WorkflowPackage#getInputPort()
 * @model
 * @generated
 */
public interface InputPort extends Port{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2003 IBM Corporation";

	/**
	 * Returns the value of the '<em><b>Node</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.emf.teneo.samples.emf.sample.workflow.WorkflowNode#getInputs <em>Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node</em>' container reference.
	 * @see #setNode(WorkflowNode)
	 * @see org.eclipse.emf.teneo.samples.emf.sample.workflow.WorkflowPackage#getInputPort_Node()
	 * @see org.eclipse.emf.teneo.samples.emf.sample.workflow.WorkflowNode#getInputs
	 * @model opposite="inputs" required="true"
	 * @generated
	 */
	WorkflowNode getNode();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.workflow.InputPort#getNode <em>Node</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node</em>' container reference.
	 * @see #getNode()
	 * @generated
	 */
	void setNode(WorkflowNode value);

	/**
	 * Returns the value of the '<em><b>Edges</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.samples.emf.sample.workflow.Edge}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.emf.teneo.samples.emf.sample.workflow.Edge#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edges</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edges</em>' reference list.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.workflow.WorkflowPackage#getInputPort_Edges()
	 * @see org.eclipse.emf.teneo.samples.emf.sample.workflow.Edge#getTarget
	 * @model type="org.eclipse.emf.teneo.samples.emf.sample.workflow.Edge" opposite="target"
	 * @generated
	 */
	EList getEdges();

} // InputPort

/**
 * <copyright>
 * </copyright>
 *
 * $Id: Edge.java,v 1.1 2006/07/11 16:57:00 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.sample.workflow;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.workflow.Edge#getWorkflow <em>Workflow</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.workflow.Edge#getTarget <em>Target</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.workflow.Edge#getSource <em>Source</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.emf.sample.workflow.WorkflowPackage#getEdge()
 * @model
 * @generated
 */
public interface Edge extends WorkflowElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2003 IBM Corporation";

	/**
	 * Returns the value of the '<em><b>Workflow</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.emf.teneo.samples.emf.sample.workflow.Workflow#getEdges <em>Edges</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Workflow</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Workflow</em>' container reference.
	 * @see #setWorkflow(Workflow)
	 * @see org.eclipse.emf.teneo.samples.emf.sample.workflow.WorkflowPackage#getEdge_Workflow()
	 * @see org.eclipse.emf.teneo.samples.emf.sample.workflow.Workflow#getEdges
	 * @model opposite="edges" required="true"
	 * @generated
	 */
	Workflow getWorkflow();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.workflow.Edge#getWorkflow <em>Workflow</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Workflow</em>' container reference.
	 * @see #getWorkflow()
	 * @generated
	 */
	void setWorkflow(Workflow value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.emf.teneo.samples.emf.sample.workflow.InputPort#getEdges <em>Edges</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(InputPort)
	 * @see org.eclipse.emf.teneo.samples.emf.sample.workflow.WorkflowPackage#getEdge_Target()
	 * @see org.eclipse.emf.teneo.samples.emf.sample.workflow.InputPort#getEdges
	 * @model opposite="edges" required="true"
	 * @generated
	 */
	InputPort getTarget();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.workflow.Edge#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(InputPort value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.emf.teneo.samples.emf.sample.workflow.OutputPort#getEdges <em>Edges</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(OutputPort)
	 * @see org.eclipse.emf.teneo.samples.emf.sample.workflow.WorkflowPackage#getEdge_Source()
	 * @see org.eclipse.emf.teneo.samples.emf.sample.workflow.OutputPort#getEdges
	 * @model opposite="edges" required="true"
	 * @generated
	 */
	OutputPort getSource();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.workflow.Edge#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(OutputPort value);

} // Edge

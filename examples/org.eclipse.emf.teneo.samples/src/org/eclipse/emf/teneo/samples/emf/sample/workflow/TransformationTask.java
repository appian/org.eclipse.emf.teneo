/**
 * <copyright>
 * </copyright>
 *
 * $Id: TransformationTask.java,v 1.1 2006/07/11 16:57:00 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.sample.workflow;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transformation Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.workflow.TransformationTask#getTransformExpression <em>Transform Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.emf.sample.workflow.WorkflowPackage#getTransformationTask()
 * @model
 * @generated
 */
public interface TransformationTask extends WorkflowNode {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2003 IBM Corporation";

	/**
	 * Returns the value of the '<em><b>Transform Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transform Expression</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transform Expression</em>' attribute.
	 * @see #setTransformExpression(String)
	 * @see org.eclipse.emf.teneo.samples.emf.sample.workflow.WorkflowPackage#getTransformationTask_TransformExpression()
	 * @model
	 * @generated
	 */
	String getTransformExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.workflow.TransformationTask#getTransformExpression <em>Transform Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transform Expression</em>' attribute.
	 * @see #getTransformExpression()
	 * @generated
	 */
	void setTransformExpression(String value);

} // TransformationTask

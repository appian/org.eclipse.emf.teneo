/**
 * <copyright>
 * </copyright>
 *
 * $Id: WorkflowSwitch.java,v 1.1 2006/07/11 16:57:18 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.sample.workflow.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.teneo.samples.emf.sample.workflow.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.teneo.samples.emf.sample.workflow.WorkflowPackage
 * @generated
 */
public class WorkflowSwitch {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2003 IBM Corporation";

	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static WorkflowPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkflowSwitch() {
		if (modelPackage == null) {
			modelPackage = WorkflowPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public Object doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected Object doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch((EClass)eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected Object doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case WorkflowPackage.WORKFLOW: {
				Workflow workflow = (Workflow)theEObject;
				Object result = caseWorkflow(workflow);
				if (result == null) result = caseWorkflowElement(workflow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WorkflowPackage.WORKFLOW_NODE: {
				WorkflowNode workflowNode = (WorkflowNode)theEObject;
				Object result = caseWorkflowNode(workflowNode);
				if (result == null) result = caseWorkflowElement(workflowNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WorkflowPackage.EDGE: {
				Edge edge = (Edge)theEObject;
				Object result = caseEdge(edge);
				if (result == null) result = caseWorkflowElement(edge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WorkflowPackage.INPUT_PORT: {
				InputPort inputPort = (InputPort)theEObject;
				Object result = caseInputPort(inputPort);
				if (result == null) result = casePort(inputPort);
				if (result == null) result = caseWorkflowElement(inputPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WorkflowPackage.OUTPUT_PORT: {
				OutputPort outputPort = (OutputPort)theEObject;
				Object result = caseOutputPort(outputPort);
				if (result == null) result = casePort(outputPort);
				if (result == null) result = caseWorkflowElement(outputPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WorkflowPackage.FAULT: {
				Fault fault = (Fault)theEObject;
				Object result = caseFault(fault);
				if (result == null) result = caseOutputPort(fault);
				if (result == null) result = casePort(fault);
				if (result == null) result = caseWorkflowElement(fault);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WorkflowPackage.COMPOUND_TASK: {
				CompoundTask compoundTask = (CompoundTask)theEObject;
				Object result = caseCompoundTask(compoundTask);
				if (result == null) result = caseWorkflowNode(compoundTask);
				if (result == null) result = caseWorkflowElement(compoundTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WorkflowPackage.PORT: {
				Port port = (Port)theEObject;
				Object result = casePort(port);
				if (result == null) result = caseWorkflowElement(port);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WorkflowPackage.TRANSFORMATION_TASK: {
				TransformationTask transformationTask = (TransformationTask)theEObject;
				Object result = caseTransformationTask(transformationTask);
				if (result == null) result = caseWorkflowNode(transformationTask);
				if (result == null) result = caseWorkflowElement(transformationTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WorkflowPackage.CONDITIONAL_TASK: {
				ConditionalTask conditionalTask = (ConditionalTask)theEObject;
				Object result = caseConditionalTask(conditionalTask);
				if (result == null) result = caseWorkflowNode(conditionalTask);
				if (result == null) result = caseWorkflowElement(conditionalTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WorkflowPackage.LOOP_TASK: {
				LoopTask loopTask = (LoopTask)theEObject;
				Object result = caseLoopTask(loopTask);
				if (result == null) result = caseCompoundTask(loopTask);
				if (result == null) result = caseWorkflowNode(loopTask);
				if (result == null) result = caseWorkflowElement(loopTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WorkflowPackage.WORKFLOW_ELEMENT: {
				WorkflowElement workflowElement = (WorkflowElement)theEObject;
				Object result = caseWorkflowElement(workflowElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WorkflowPackage.CONDITIONAL_OUTPUT_PORT: {
				ConditionalOutputPort conditionalOutputPort = (ConditionalOutputPort)theEObject;
				Object result = caseConditionalOutputPort(conditionalOutputPort);
				if (result == null) result = caseOutputPort(conditionalOutputPort);
				if (result == null) result = casePort(conditionalOutputPort);
				if (result == null) result = caseWorkflowElement(conditionalOutputPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WorkflowPackage.COMMENT: {
				Comment comment = (Comment)theEObject;
				Object result = caseComment(comment);
				if (result == null) result = caseWorkflowElement(comment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WorkflowPackage.TASK: {
				Task task = (Task)theEObject;
				Object result = caseTask(task);
				if (result == null) result = caseWorkflowNode(task);
				if (result == null) result = caseWorkflowElement(task);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Workflow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Workflow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseWorkflow(Workflow object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseWorkflowNode(WorkflowNode object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Edge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Edge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEdge(Edge object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Input Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Input Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseInputPort(InputPort object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Output Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Output Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseOutputPort(OutputPort object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Fault</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Fault</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseFault(Fault object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Compound Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Compound Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCompoundTask(CompoundTask object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePort(Port object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Transformation Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Transformation Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTransformationTask(TransformationTask object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Conditional Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Conditional Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseConditionalTask(ConditionalTask object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Loop Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Loop Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseLoopTask(LoopTask object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseWorkflowElement(WorkflowElement object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Conditional Output Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Conditional Output Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseConditionalOutputPort(ConditionalOutputPort object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Comment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Comment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseComment(Comment object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTask(Task object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public Object defaultCase(EObject object) {
		return null;
	}

} //WorkflowSwitch

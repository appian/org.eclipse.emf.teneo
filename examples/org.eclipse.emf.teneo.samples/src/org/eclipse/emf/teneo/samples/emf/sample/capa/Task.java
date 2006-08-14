/**
 * <copyright>
 * </copyright>
 *
 * $Id: Task.java,v 1.1 2006/08/14 05:08:59 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.sample.capa;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.capa.Task#getCapacityEntry <em>Capacity Entry</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.capa.Task#getProduction <em>Production</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.capa.Task#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.capa.Task#getTaskId <em>Task Id</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.capa.Task#getTimePerPice <em>Time Per Pice</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.capa.Task#getTimePerPreperation <em>Time Per Preperation</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.emf.sample.capa.CapaPackage#getTask()
 * @model extendedMetaData="name='Task' kind='elementOnly'"
 * @generated
 */
public interface Task extends EObject {
	/**
	 * Returns the value of the '<em><b>Capacity Entry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capacity Entry</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capacity Entry</em>' containment reference.
	 * @see #setCapacityEntry(CapacityEntry)
	 * @see org.eclipse.emf.teneo.samples.emf.sample.capa.CapaPackage#getTask_CapacityEntry()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='CapacityEntry'"
	 * @generated
	 */
	CapacityEntry getCapacityEntry();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.capa.Task#getCapacityEntry <em>Capacity Entry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capacity Entry</em>' containment reference.
	 * @see #getCapacityEntry()
	 * @generated
	 */
	void setCapacityEntry(CapacityEntry value);

	/**
	 * Returns the value of the '<em><b>Production</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Production</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Production</em>' containment reference.
	 * @see #setProduction(Production)
	 * @see org.eclipse.emf.teneo.samples.emf.sample.capa.CapaPackage#getTask_Production()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Production'"
	 * @generated
	 */
	Production getProduction();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.capa.Task#getProduction <em>Production</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Production</em>' containment reference.
	 * @see #getProduction()
	 * @generated
	 */
	void setProduction(Production value);

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
	 * @see org.eclipse.emf.teneo.samples.emf.sample.capa.CapaPackage#getTask_Name()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='Name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.capa.Task#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Task Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Task Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task Id</em>' attribute.
	 * @see #setTaskId(String)
	 * @see org.eclipse.emf.teneo.samples.emf.sample.capa.CapaPackage#getTask_TaskId()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='TaskId'"
	 * @generated
	 */
	String getTaskId();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.capa.Task#getTaskId <em>Task Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Task Id</em>' attribute.
	 * @see #getTaskId()
	 * @generated
	 */
	void setTaskId(String value);

	/**
	 * Returns the value of the '<em><b>Time Per Pice</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Per Pice</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Per Pice</em>' attribute.
	 * @see #isSetTimePerPice()
	 * @see #unsetTimePerPice()
	 * @see #setTimePerPice(float)
	 * @see org.eclipse.emf.teneo.samples.emf.sample.capa.CapaPackage#getTask_TimePerPice()
	 * @model unique="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Float"
	 *        extendedMetaData="kind='attribute' name='TimePerPice'"
	 * @generated
	 */
	float getTimePerPice();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.capa.Task#getTimePerPice <em>Time Per Pice</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Per Pice</em>' attribute.
	 * @see #isSetTimePerPice()
	 * @see #unsetTimePerPice()
	 * @see #getTimePerPice()
	 * @generated
	 */
	void setTimePerPice(float value);

	/**
	 * Unsets the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.capa.Task#getTimePerPice <em>Time Per Pice</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTimePerPice()
	 * @see #getTimePerPice()
	 * @see #setTimePerPice(float)
	 * @generated
	 */
	void unsetTimePerPice();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.capa.Task#getTimePerPice <em>Time Per Pice</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Time Per Pice</em>' attribute is set.
	 * @see #unsetTimePerPice()
	 * @see #getTimePerPice()
	 * @see #setTimePerPice(float)
	 * @generated
	 */
	boolean isSetTimePerPice();

	/**
	 * Returns the value of the '<em><b>Time Per Preperation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Per Preperation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Per Preperation</em>' attribute.
	 * @see #isSetTimePerPreperation()
	 * @see #unsetTimePerPreperation()
	 * @see #setTimePerPreperation(float)
	 * @see org.eclipse.emf.teneo.samples.emf.sample.capa.CapaPackage#getTask_TimePerPreperation()
	 * @model unique="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Float"
	 *        extendedMetaData="kind='attribute' name='TimePerPreperation'"
	 * @generated
	 */
	float getTimePerPreperation();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.capa.Task#getTimePerPreperation <em>Time Per Preperation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Per Preperation</em>' attribute.
	 * @see #isSetTimePerPreperation()
	 * @see #unsetTimePerPreperation()
	 * @see #getTimePerPreperation()
	 * @generated
	 */
	void setTimePerPreperation(float value);

	/**
	 * Unsets the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.capa.Task#getTimePerPreperation <em>Time Per Preperation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTimePerPreperation()
	 * @see #getTimePerPreperation()
	 * @see #setTimePerPreperation(float)
	 * @generated
	 */
	void unsetTimePerPreperation();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.capa.Task#getTimePerPreperation <em>Time Per Preperation</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Time Per Preperation</em>' attribute is set.
	 * @see #unsetTimePerPreperation()
	 * @see #getTimePerPreperation()
	 * @see #setTimePerPreperation(float)
	 * @generated
	 */
	boolean isSetTimePerPreperation();

} // Task
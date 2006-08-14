/**
 * <copyright>
 * </copyright>
 *
 * $Id: Machine.java,v 1.1 2006/08/14 05:08:59 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.sample.capa;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Machine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.capa.Machine#getWorkWeek <em>Work Week</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.capa.Machine#getTasks <em>Tasks</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.capa.Machine#getMachineId <em>Machine Id</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.capa.Machine#getMachineSearchString <em>Machine Search String</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.capa.Machine#getMultiplicity <em>Multiplicity</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.capa.Machine#getTaskSearchString <em>Task Search String</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.emf.sample.capa.CapaPackage#getMachine()
 * @model extendedMetaData="name='Machine' kind='elementOnly'"
 * @generated
 */
public interface Machine extends EObject {
	/**
	 * Returns the value of the '<em><b>Work Week</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Work Week</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Week</em>' containment reference.
	 * @see #setWorkWeek(WorkWeek)
	 * @see org.eclipse.emf.teneo.samples.emf.sample.capa.CapaPackage#getMachine_WorkWeek()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='WorkWeek'"
	 * @generated
	 */
	WorkWeek getWorkWeek();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.capa.Machine#getWorkWeek <em>Work Week</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Work Week</em>' containment reference.
	 * @see #getWorkWeek()
	 * @generated
	 */
	void setWorkWeek(WorkWeek value);

	/**
	 * Returns the value of the '<em><b>Tasks</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.samples.emf.sample.capa.Task}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tasks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tasks</em>' containment reference list.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.capa.CapaPackage#getMachine_Tasks()
	 * @model type="org.eclipse.emf.teneo.samples.emf.sample.capa.Task" containment="true"
	 *        annotation="http://ejb.elver.org/Transient appinfo='true'"
	 *        extendedMetaData="kind='element' name='Tasks'"
	 * @generated
	 */
	EList getTasks();

	/**
	 * Returns the value of the '<em><b>Machine Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Machine Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Machine Id</em>' attribute.
	 * @see #setMachineId(String)
	 * @see org.eclipse.emf.teneo.samples.emf.sample.capa.CapaPackage#getMachine_MachineId()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='MachineId'"
	 * @generated
	 */
	String getMachineId();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.capa.Machine#getMachineId <em>Machine Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Machine Id</em>' attribute.
	 * @see #getMachineId()
	 * @generated
	 */
	void setMachineId(String value);

	/**
	 * Returns the value of the '<em><b>Machine Search String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Machine Search String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Machine Search String</em>' attribute.
	 * @see #setMachineSearchString(String)
	 * @see org.eclipse.emf.teneo.samples.emf.sample.capa.CapaPackage#getMachine_MachineSearchString()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='MachineSearchString'"
	 * @generated
	 */
	String getMachineSearchString();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.capa.Machine#getMachineSearchString <em>Machine Search String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Machine Search String</em>' attribute.
	 * @see #getMachineSearchString()
	 * @generated
	 */
	void setMachineSearchString(String value);

	/**
	 * Returns the value of the '<em><b>Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multiplicity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiplicity</em>' attribute.
	 * @see #isSetMultiplicity()
	 * @see #unsetMultiplicity()
	 * @see #setMultiplicity(int)
	 * @see org.eclipse.emf.teneo.samples.emf.sample.capa.CapaPackage#getMachine_Multiplicity()
	 * @model unique="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='attribute' name='Multiplicity'"
	 * @generated
	 */
	int getMultiplicity();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.capa.Machine#getMultiplicity <em>Multiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiplicity</em>' attribute.
	 * @see #isSetMultiplicity()
	 * @see #unsetMultiplicity()
	 * @see #getMultiplicity()
	 * @generated
	 */
	void setMultiplicity(int value);

	/**
	 * Unsets the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.capa.Machine#getMultiplicity <em>Multiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMultiplicity()
	 * @see #getMultiplicity()
	 * @see #setMultiplicity(int)
	 * @generated
	 */
	void unsetMultiplicity();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.capa.Machine#getMultiplicity <em>Multiplicity</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Multiplicity</em>' attribute is set.
	 * @see #unsetMultiplicity()
	 * @see #getMultiplicity()
	 * @see #setMultiplicity(int)
	 * @generated
	 */
	boolean isSetMultiplicity();

	/**
	 * Returns the value of the '<em><b>Task Search String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Task Search String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task Search String</em>' attribute.
	 * @see #setTaskSearchString(String)
	 * @see org.eclipse.emf.teneo.samples.emf.sample.capa.CapaPackage#getMachine_TaskSearchString()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='TaskSearchString'"
	 * @generated
	 */
	String getTaskSearchString();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.capa.Machine#getTaskSearchString <em>Task Search String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Task Search String</em>' attribute.
	 * @see #getTaskSearchString()
	 * @generated
	 */
	void setTaskSearchString(String value);

} // Machine
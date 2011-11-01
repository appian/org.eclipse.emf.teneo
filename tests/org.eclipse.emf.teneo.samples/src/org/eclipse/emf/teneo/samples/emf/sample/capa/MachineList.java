/**
 * <copyright>
 * </copyright>
 *
 * $Id: MachineList.java,v 1.1 2006/08/14 05:08:59 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.sample.capa;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Machine List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.capa.MachineList#getMachines <em>Machines</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.emf.sample.capa.CapaPackage#getMachineList()
 * @model extendedMetaData="name='MachineList' kind='elementOnly'"
 * @generated
 */
public interface MachineList extends EObject {
	/**
	 * Returns the value of the '<em><b>Machines</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.samples.emf.sample.capa.Machine}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Machines</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Machines</em>' containment reference list.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.capa.CapaPackage#getMachineList_Machines()
	 * @model type="org.eclipse.emf.teneo.samples.emf.sample.capa.Machine" containment="true"
	 *        extendedMetaData="kind='element' name='Machines'"
	 * @generated
	 */
	EList getMachines();

} // MachineList
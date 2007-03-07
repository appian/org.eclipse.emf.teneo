/**
 * <copyright>
 * </copyright>
 *
 * $Id: CSMInstance.java,v 1.1 2007/03/07 23:34:08 mtaal Exp $
 */
package datacore;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CSM Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link datacore.CSMInstance#getCsmValueContainer <em>Csm Value Container</em>}</li>
 *   <li>{@link datacore.CSMInstance#getCsmReprasentation <em>Csm Reprasentation</em>}</li>
 *   <li>{@link datacore.CSMInstance#getContainingCSMClass <em>Containing CSM Class</em>}</li>
 * </ul>
 * </p>
 *
 * @see datacore.DatacorePackage#getCSMInstance()
 * @model
 * @generated
 */
public interface CSMInstance extends CSMObject {
	/**
	 * Returns the value of the '<em><b>Csm Value Container</b></em>' containment reference list.
	 * The list contents are of type {@link datacore.CSMCharacteristicValueContainer}.
	 * It is bidirectional and its opposite is '{@link datacore.CSMCharacteristicValueContainer#getCsmInstance <em>Csm Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Csm Value Container</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Csm Value Container</em>' containment reference list.
	 * @see datacore.DatacorePackage#getCSMInstance_CsmValueContainer()
	 * @see datacore.CSMCharacteristicValueContainer#getCsmInstance
	 * @model type="datacore.CSMCharacteristicValueContainer" opposite="csmInstance" containment="true"
	 * @generated
	 */
	EList<CSMCharacteristicValueContainer> getCsmValueContainer();

	/**
	 * Returns the value of the '<em><b>Csm Reprasentation</b></em>' containment reference list.
	 * The list contents are of type {@link datacore.CSMRepresentationRoot}.
	 * It is bidirectional and its opposite is '{@link datacore.CSMRepresentationRoot#getCsmInstance <em>Csm Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Csm Reprasentation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Csm Reprasentation</em>' containment reference list.
	 * @see datacore.DatacorePackage#getCSMInstance_CsmReprasentation()
	 * @see datacore.CSMRepresentationRoot#getCsmInstance
	 * @model type="datacore.CSMRepresentationRoot" opposite="csmInstance" containment="true"
	 * @generated
	 */
	EList<CSMRepresentationRoot> getCsmReprasentation();

	/**
	 * Returns the value of the '<em><b>Containing CSM Class</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link datacore.CSMClass#getInstances <em>Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containing CSM Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containing CSM Class</em>' reference.
	 * @see #setContainingCSMClass(CSMClass)
	 * @see datacore.DatacorePackage#getCSMInstance_ContainingCSMClass()
	 * @see datacore.CSMClass#getInstances
	 * @model opposite="instances"
	 * @generated
	 */
	CSMClass getContainingCSMClass();

	/**
	 * Sets the value of the '{@link datacore.CSMInstance#getContainingCSMClass <em>Containing CSM Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Containing CSM Class</em>' reference.
	 * @see #getContainingCSMClass()
	 * @generated
	 */
	void setContainingCSMClass(CSMClass value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	CSMCharacteristicValueContainer getCSMCharacteristicValueContainer(CSMCharacteristicDefinition characteristicDefinition);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	CSMCharacteristicValueContainer createCSMCharacteristicValueContainer(CSMCharacteristicDefinition characteristcDefinition);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void deleteCSMCharactersitcValueContainer(CSMCharacteristicValueContainer valueContainer);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void deleteAllCSMCharacteristicValueContainer();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isValid();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean allNotUserDefinedContainerSet();

} // CSMInstance

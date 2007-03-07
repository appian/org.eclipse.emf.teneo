/**
 * <copyright>
 * </copyright>
 *
 * $Id: CSMCharacteristicValueContainer.java,v 1.1 2007/03/07 23:34:08 mtaal Exp $
 */
package datacore;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CSM Characteristic Value Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link datacore.CSMCharacteristicValueContainer#isValid <em>Valid</em>}</li>
 *   <li>{@link datacore.CSMCharacteristicValueContainer#getCsmInstance <em>Csm Instance</em>}</li>
 *   <li>{@link datacore.CSMCharacteristicValueContainer#getConcreteValue <em>Concrete Value</em>}</li>
 *   <li>{@link datacore.CSMCharacteristicValueContainer#getValueSet <em>Value Set</em>}</li>
 *   <li>{@link datacore.CSMCharacteristicValueContainer#getDataType <em>Data Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see datacore.DatacorePackage#getCSMCharacteristicValueContainer()
 * @model
 * @generated
 */
public interface CSMCharacteristicValueContainer extends CSMObject {
	/**
	 * Returns the value of the '<em><b>Valid</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Valid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valid</em>' attribute.
	 * @see #setValid(boolean)
	 * @see datacore.DatacorePackage#getCSMCharacteristicValueContainer_Valid()
	 * @model default="false"
	 * @generated
	 */
	boolean isValid();

	/**
	 * Sets the value of the '{@link datacore.CSMCharacteristicValueContainer#isValid <em>Valid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valid</em>' attribute.
	 * @see #isValid()
	 * @generated
	 */
	void setValid(boolean value);

	/**
	 * Returns the value of the '<em><b>Csm Instance</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link datacore.CSMInstance#getCsmValueContainer <em>Csm Value Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Csm Instance</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Csm Instance</em>' container reference.
	 * @see #setCsmInstance(CSMInstance)
	 * @see datacore.DatacorePackage#getCSMCharacteristicValueContainer_CsmInstance()
	 * @see datacore.CSMInstance#getCsmValueContainer
	 * @model opposite="csmValueContainer"
	 * @generated
	 */
	CSMInstance getCsmInstance();

	/**
	 * Sets the value of the '{@link datacore.CSMCharacteristicValueContainer#getCsmInstance <em>Csm Instance</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Csm Instance</em>' container reference.
	 * @see #getCsmInstance()
	 * @generated
	 */
	void setCsmInstance(CSMInstance value);

	/**
	 * Returns the value of the '<em><b>Concrete Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concrete Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concrete Value</em>' containment reference.
	 * @see #setConcreteValue(CSMValue)
	 * @see datacore.DatacorePackage#getCSMCharacteristicValueContainer_ConcreteValue()
	 * @model containment="true"
	 * @generated
	 */
	CSMValue getConcreteValue();

	/**
	 * Sets the value of the '{@link datacore.CSMCharacteristicValueContainer#getConcreteValue <em>Concrete Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concrete Value</em>' containment reference.
	 * @see #getConcreteValue()
	 * @generated
	 */
	void setConcreteValue(CSMValue value);

	/**
	 * Returns the value of the '<em><b>Value Set</b></em>' containment reference list.
	 * The list contents are of type {@link datacore.CSMValueSet}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Set</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Set</em>' containment reference list.
	 * @see datacore.DatacorePackage#getCSMCharacteristicValueContainer_ValueSet()
	 * @model type="datacore.CSMValueSet" containment="true"
	 * @generated
	 */
	EList<CSMValueSet> getValueSet();

	/**
	 * Returns the value of the '<em><b>Data Type</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link datacore.CSMCharacteristicDefinition#getValueContainer <em>Value Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Type</em>' reference.
	 * @see #setDataType(CSMCharacteristicDefinition)
	 * @see datacore.DatacorePackage#getCSMCharacteristicValueContainer_DataType()
	 * @see datacore.CSMCharacteristicDefinition#getValueContainer
	 * @model opposite="valueContainer"
	 * @generated
	 */
	CSMCharacteristicDefinition getDataType();

	/**
	 * Sets the value of the '{@link datacore.CSMCharacteristicValueContainer#getDataType <em>Data Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Type</em>' reference.
	 * @see #getDataType()
	 * @generated
	 */
	void setDataType(CSMCharacteristicDefinition value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isConcreteValueSet();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	CSMValue setCSMConcreteValue(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void addCSMValueToValueSet(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void addIntervalToValueSet(String min, String max, boolean includeMax, boolean includeMin, String increment);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void clearValueSet();

} // CSMCharacteristicValueContainer

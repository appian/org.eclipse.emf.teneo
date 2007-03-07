/**
 * <copyright>
 * </copyright>
 *
 * $Id: CSMValueSet.java,v 1.1 2007/03/07 23:34:09 mtaal Exp $
 */
package datacore;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CSM Value Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link datacore.CSMValueSet#getDataType <em>Data Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see datacore.DatacorePackage#getCSMValueSet()
 * @model abstract="true"
 * @generated
 */
public interface CSMValueSet extends EObject {
	/**
	 * Returns the value of the '<em><b>Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Type</em>' reference.
	 * @see #setDataType(CSMType)
	 * @see datacore.DatacorePackage#getCSMValueSet_DataType()
	 * @model
	 * @generated
	 */
	CSMType getDataType();

	/**
	 * Sets the value of the '{@link datacore.CSMValueSet#getDataType <em>Data Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Type</em>' reference.
	 * @see #getDataType()
	 * @generated
	 */
	void setDataType(CSMType value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getStringReprasentation();

} // CSMValueSet

/**
 * <copyright>
 * </copyright>
 *
 * $Id: CSMRepresentationRootDescriptor.java,v 1.1 2007/03/07 23:34:08 mtaal Exp $
 */
package datacore;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CSM Representation Root Descriptor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link datacore.CSMRepresentationRootDescriptor#getRepresentationRoot <em>Representation Root</em>}</li>
 *   <li>{@link datacore.CSMRepresentationRootDescriptor#getCharacteristicID <em>Characteristic ID</em>}</li>
 *   <li>{@link datacore.CSMRepresentationRootDescriptor#getCharacteriticValue <em>Characteritic Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see datacore.DatacorePackage#getCSMRepresentationRootDescriptor()
 * @model
 * @generated
 */
public interface CSMRepresentationRootDescriptor extends EObject {
	/**
	 * Returns the value of the '<em><b>Representation Root</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link datacore.CSMRepresentationRoot#getValueDescriptors <em>Value Descriptors</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Representation Root</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Representation Root</em>' container reference.
	 * @see #setRepresentationRoot(CSMRepresentationRoot)
	 * @see datacore.DatacorePackage#getCSMRepresentationRootDescriptor_RepresentationRoot()
	 * @see datacore.CSMRepresentationRoot#getValueDescriptors
	 * @model opposite="valueDescriptors"
	 * @generated
	 */
	CSMRepresentationRoot getRepresentationRoot();

	/**
	 * Sets the value of the '{@link datacore.CSMRepresentationRootDescriptor#getRepresentationRoot <em>Representation Root</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Representation Root</em>' container reference.
	 * @see #getRepresentationRoot()
	 * @generated
	 */
	void setRepresentationRoot(CSMRepresentationRoot value);

	/**
	 * Returns the value of the '<em><b>Characteristic ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Characteristic ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Characteristic ID</em>' attribute.
	 * @see #setCharacteristicID(String)
	 * @see datacore.DatacorePackage#getCSMRepresentationRootDescriptor_CharacteristicID()
	 * @model
	 * @generated
	 */
	String getCharacteristicID();

	/**
	 * Sets the value of the '{@link datacore.CSMRepresentationRootDescriptor#getCharacteristicID <em>Characteristic ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Characteristic ID</em>' attribute.
	 * @see #getCharacteristicID()
	 * @generated
	 */
	void setCharacteristicID(String value);

	/**
	 * Returns the value of the '<em><b>Characteritic Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Characteritic Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Characteritic Value</em>' attribute.
	 * @see #setCharacteriticValue(String)
	 * @see datacore.DatacorePackage#getCSMRepresentationRootDescriptor_CharacteriticValue()
	 * @model
	 * @generated
	 */
	String getCharacteriticValue();

	/**
	 * Sets the value of the '{@link datacore.CSMRepresentationRootDescriptor#getCharacteriticValue <em>Characteritic Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Characteritic Value</em>' attribute.
	 * @see #getCharacteriticValue()
	 * @generated
	 */
	void setCharacteriticValue(String value);

} // CSMRepresentationRootDescriptor

/**
 * <copyright>
 * </copyright>
 *
 * $Id: CSMClass.java,v 1.1 2007/03/07 23:34:08 mtaal Exp $
 */
package datacore;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CSM Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link datacore.CSMClass#getCsmCharacteristicDefinitions <em>Csm Characteristic Definitions</em>}</li>
 *   <li>{@link datacore.CSMClass#getInstances <em>Instances</em>}</li>
 *   <li>{@link datacore.CSMClass#getValidCSMTypes <em>Valid CSM Types</em>}</li>
 *   <li>{@link datacore.CSMClass#getDescription <em>Description</em>}</li>
 *   <li>{@link datacore.CSMClass#getDatasourceDefinition <em>Datasource Definition</em>}</li>
 *   <li>{@link datacore.CSMClass#getKeyCharachteristicDefinition <em>Key Charachteristic Definition</em>}</li>
 *   <li>{@link datacore.CSMClass#getClassRepresentations <em>Class Representations</em>}</li>
 * </ul>
 * </p>
 *
 * @see datacore.DatacorePackage#getCSMClass()
 * @model abstract="true"
 * @generated
 */
public interface CSMClass extends CSMMetaElement {
	/**
	 * Returns the value of the '<em><b>Csm Characteristic Definitions</b></em>' containment reference list.
	 * The list contents are of type {@link datacore.CSMCharacteristicDefinition}.
	 * It is bidirectional and its opposite is '{@link datacore.CSMCharacteristicDefinition#getCsmClass <em>Csm Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Csm Characteristic Definitions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Csm Characteristic Definitions</em>' containment reference list.
	 * @see datacore.DatacorePackage#getCSMClass_CsmCharacteristicDefinitions()
	 * @see datacore.CSMCharacteristicDefinition#getCsmClass
	 * @model type="datacore.CSMCharacteristicDefinition" opposite="csmClass" containment="true"
	 * @generated
	 */
	EList<CSMCharacteristicDefinition> getCsmCharacteristicDefinitions();

	/**
	 * Returns the value of the '<em><b>Instances</b></em>' reference list.
	 * The list contents are of type {@link datacore.CSMInstance}.
	 * It is bidirectional and its opposite is '{@link datacore.CSMInstance#getContainingCSMClass <em>Containing CSM Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instances</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instances</em>' reference list.
	 * @see datacore.DatacorePackage#getCSMClass_Instances()
	 * @see datacore.CSMInstance#getContainingCSMClass
	 * @model type="datacore.CSMInstance" opposite="containingCSMClass"
	 * @generated
	 */
	EList<CSMInstance> getInstances();

	/**
	 * Returns the value of the '<em><b>Valid CSM Types</b></em>' reference list.
	 * The list contents are of type {@link datacore.CSMType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Valid CSM Types</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valid CSM Types</em>' reference list.
	 * @see datacore.DatacorePackage#getCSMClass_ValidCSMTypes()
	 * @model type="datacore.CSMType"
	 * @generated
	 */
	EList<CSMType> getValidCSMTypes();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see datacore.DatacorePackage#getCSMClass_Description()
	 * @model annotation="teneo.jpa appinfo='@Type(type=\"text\")'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link datacore.CSMClass#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Datasource Definition</b></em>' containment reference.
	 * The default value is <code>""</code>.
	 * It is bidirectional and its opposite is '{@link datacore.DataSourceDefinitions#getOwnerClass <em>Owner Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Datasource Definition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datasource Definition</em>' containment reference.
	 * @see #setDatasourceDefinition(DataSourceDefinitions)
	 * @see datacore.DatacorePackage#getCSMClass_DatasourceDefinition()
	 * @see datacore.DataSourceDefinitions#getOwnerClass
	 * @model opposite="ownerClass" containment="true"
	 * @generated
	 */
	DataSourceDefinitions getDatasourceDefinition();

	/**
	 * Sets the value of the '{@link datacore.CSMClass#getDatasourceDefinition <em>Datasource Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datasource Definition</em>' containment reference.
	 * @see #getDatasourceDefinition()
	 * @generated
	 */
	void setDatasourceDefinition(DataSourceDefinitions value);

	/**
	 * Returns the value of the '<em><b>Key Charachteristic Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key Charachteristic Definition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key Charachteristic Definition</em>' reference.
	 * @see #setKeyCharachteristicDefinition(CSMCharacteristicDefinition)
	 * @see datacore.DatacorePackage#getCSMClass_KeyCharachteristicDefinition()
	 * @model
	 * @generated
	 */
	CSMCharacteristicDefinition getKeyCharachteristicDefinition();

	/**
	 * Sets the value of the '{@link datacore.CSMClass#getKeyCharachteristicDefinition <em>Key Charachteristic Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key Charachteristic Definition</em>' reference.
	 * @see #getKeyCharachteristicDefinition()
	 * @generated
	 */
	void setKeyCharachteristicDefinition(CSMCharacteristicDefinition value);

	/**
	 * Returns the value of the '<em><b>Class Representations</b></em>' containment reference list.
	 * The list contents are of type {@link datacore.CSMRepresentation}.
	 * It is bidirectional and its opposite is '{@link datacore.CSMRepresentation#getOwnerCSMClass <em>Owner CSM Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class Representations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Representations</em>' containment reference list.
	 * @see datacore.DatacorePackage#getCSMClass_ClassRepresentations()
	 * @see datacore.CSMRepresentation#getOwnerCSMClass
	 * @model type="datacore.CSMRepresentation" opposite="ownerCSMClass" containment="true"
	 * @generated
	 */
	EList<CSMRepresentation> getClassRepresentations();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	CSMCharacteristicDefinition addCharacteristicsDefinition(CSMType type);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	CSMInstance createCSMInstance();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void removeCharacteristicsDefinition(CSMCharacteristicDefinition characteristicDefinition);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	CSMInstance createCSMInstance(CSMXML owner);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void deleteCharacteristicDefinition(CSMCharacteristicDefinition characteristicDefinition);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void deleteCSMInstance(CSMInstance csmInstance);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void removeCSMInstance(CSMInstance csmIntsance);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	CSMCharacteristicDefinition getCSMCharacteristicDefinition(String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	CSMCharacteristicDefinition getCSMCharacteristicDefinition(int index);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void deleteAllCSMInstances();

} // CSMClass

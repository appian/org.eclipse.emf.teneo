/**
 * <copyright>
 * </copyright>
 *
 * $Id: CSMCharacteristicDefinition.java,v 1.1 2007/03/07 23:34:09 mtaal Exp $
 */
package datacore;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CSM Characteristic Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link datacore.CSMCharacteristicDefinition#getCsmClass <em>Csm Class</em>}</li>
 *   <li>{@link datacore.CSMCharacteristicDefinition#getCsmCharacteristicType <em>Csm Characteristic Type</em>}</li>
 *   <li>{@link datacore.CSMCharacteristicDefinition#isUserDefined <em>User Defined</em>}</li>
 *   <li>{@link datacore.CSMCharacteristicDefinition#getName <em>Name</em>}</li>
 *   <li>{@link datacore.CSMCharacteristicDefinition#getValueContainer <em>Value Container</em>}</li>
 *   <li>{@link datacore.CSMCharacteristicDefinition#getAliasName <em>Alias Name</em>}</li>
 *   <li>{@link datacore.CSMCharacteristicDefinition#getIndex <em>Index</em>}</li>
 *   <li>{@link datacore.CSMCharacteristicDefinition#getDataSource <em>Data Source</em>}</li>
 *   <li>{@link datacore.CSMCharacteristicDefinition#isFreeParameter <em>Free Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @see datacore.DatacorePackage#getCSMCharacteristicDefinition()
 * @model abstract="true"
 * @generated
 */
public interface CSMCharacteristicDefinition extends CSMMetaElement {
	/**
	 * Returns the value of the '<em><b>Csm Class</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link datacore.CSMClass#getCsmCharacteristicDefinitions <em>Csm Characteristic Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Csm Class</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Csm Class</em>' container reference.
	 * @see #setCsmClass(CSMClass)
	 * @see datacore.DatacorePackage#getCSMCharacteristicDefinition_CsmClass()
	 * @see datacore.CSMClass#getCsmCharacteristicDefinitions
	 * @model opposite="csmCharacteristicDefinitions"
	 * @generated
	 */
	CSMClass getCsmClass();

	/**
	 * Sets the value of the '{@link datacore.CSMCharacteristicDefinition#getCsmClass <em>Csm Class</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Csm Class</em>' container reference.
	 * @see #getCsmClass()
	 * @generated
	 */
	void setCsmClass(CSMClass value);

	/**
	 * Returns the value of the '<em><b>Csm Characteristic Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Csm Characteristic Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Csm Characteristic Type</em>' reference.
	 * @see #setCsmCharacteristicType(CSMType)
	 * @see datacore.DatacorePackage#getCSMCharacteristicDefinition_CsmCharacteristicType()
	 * @model
	 * @generated
	 */
	CSMType getCsmCharacteristicType();

	/**
	 * Sets the value of the '{@link datacore.CSMCharacteristicDefinition#getCsmCharacteristicType <em>Csm Characteristic Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Csm Characteristic Type</em>' reference.
	 * @see #getCsmCharacteristicType()
	 * @generated
	 */
	void setCsmCharacteristicType(CSMType value);

	/**
	 * Returns the value of the '<em><b>User Defined</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Defined</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Defined</em>' attribute.
	 * @see #setUserDefined(boolean)
	 * @see datacore.DatacorePackage#getCSMCharacteristicDefinition_UserDefined()
	 * @model
	 * @generated
	 */
	boolean isUserDefined();

	/**
	 * Sets the value of the '{@link datacore.CSMCharacteristicDefinition#isUserDefined <em>User Defined</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Defined</em>' attribute.
	 * @see #isUserDefined()
	 * @generated
	 */
	void setUserDefined(boolean value);

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
	 * @see datacore.DatacorePackage#getCSMCharacteristicDefinition_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link datacore.CSMCharacteristicDefinition#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Value Container</b></em>' reference list.
	 * The list contents are of type {@link datacore.CSMCharacteristicValueContainer}.
	 * It is bidirectional and its opposite is '{@link datacore.CSMCharacteristicValueContainer#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Container</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Container</em>' reference list.
	 * @see datacore.DatacorePackage#getCSMCharacteristicDefinition_ValueContainer()
	 * @see datacore.CSMCharacteristicValueContainer#getDataType
	 * @model type="datacore.CSMCharacteristicValueContainer" opposite="dataType"
	 * @generated
	 */
	EList<CSMCharacteristicValueContainer> getValueContainer();

	/**
	 * Returns the value of the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alias Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alias Name</em>' attribute.
	 * @see #setAliasName(String)
	 * @see datacore.DatacorePackage#getCSMCharacteristicDefinition_AliasName()
	 * @model
	 * @generated
	 */
	String getAliasName();

	/**
	 * Sets the value of the '{@link datacore.CSMCharacteristicDefinition#getAliasName <em>Alias Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alias Name</em>' attribute.
	 * @see #getAliasName()
	 * @generated
	 */
	void setAliasName(String value);

	/**
	 * Returns the value of the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Index</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index</em>' attribute.
	 * @see #setIndex(int)
	 * @see datacore.DatacorePackage#getCSMCharacteristicDefinition_Index()
	 * @model
	 * @generated
	 */
	int getIndex();

	/**
	 * Sets the value of the '{@link datacore.CSMCharacteristicDefinition#getIndex <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Index</em>' attribute.
	 * @see #getIndex()
	 * @generated
	 */
	void setIndex(int value);

	/**
	 * Returns the value of the '<em><b>Data Source</b></em>' containment reference.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Source</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Source</em>' containment reference.
	 * @see #setDataSource(ColumnDefinition)
	 * @see datacore.DatacorePackage#getCSMCharacteristicDefinition_DataSource()
	 * @model containment="true"
	 * @generated
	 */
	ColumnDefinition getDataSource();

	/**
	 * Sets the value of the '{@link datacore.CSMCharacteristicDefinition#getDataSource <em>Data Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Source</em>' containment reference.
	 * @see #getDataSource()
	 * @generated
	 */
	void setDataSource(ColumnDefinition value);

	/**
	 * Returns the value of the '<em><b>Free Parameter</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Free Parameter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Free Parameter</em>' attribute.
	 * @see #setFreeParameter(boolean)
	 * @see datacore.DatacorePackage#getCSMCharacteristicDefinition_FreeParameter()
	 * @model default="false"
	 * @generated
	 */
	boolean isFreeParameter();

	/**
	 * Sets the value of the '{@link datacore.CSMCharacteristicDefinition#isFreeParameter <em>Free Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Free Parameter</em>' attribute.
	 * @see #isFreeParameter()
	 * @generated
	 */
	void setFreeParameter(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	CSMCharacteristicValueContainer createCSMCharacteristicValueContainer(CSMInstance csmInstance);

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
	void deleteAllCSMCahracteristicValueContainer();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	CSMCharacteristicValueContainer getCSMCahracteristicValueContainer(CSMInstance csmInstance);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean containsOnlyUniqueValues();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isKey();

} // CSMCharacteristicDefinition

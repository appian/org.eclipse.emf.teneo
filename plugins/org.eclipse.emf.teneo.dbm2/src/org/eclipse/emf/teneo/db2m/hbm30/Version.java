/**
 * <copyright>
 * </copyright>
 *
 * $Id: Version.java,v 1.1 2010/08/18 09:25:25 cbouhier Exp $
 */
package org.eclipse.emf.teneo.db2m.hbm30;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Version</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.Version#getMeta <em>Meta</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.Version#getColumn <em>Column</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.Version#getAccess <em>Access</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.Version#getColumn1 <em>Column1</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.Version#getGenerated <em>Generated</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.Version#isInsert <em>Insert</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.Version#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.Version#getNode <em>Node</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.Version#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.Version#getUnsavedValue <em>Unsaved Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getVersion()
 * @model extendedMetaData="name='version' kind='elementOnly'"
 * @generated
 */
public interface Version extends EObject {
	/**
	 * Returns the value of the '<em><b>Meta</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.db2m.hbm30.Meta}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Meta</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meta</em>' containment reference list.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getVersion_Meta()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='meta'"
	 * @generated
	 */
	EList<Meta> getMeta();

	/**
	 * Returns the value of the '<em><b>Column</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.db2m.hbm30.Column}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Column</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column</em>' containment reference list.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getVersion_Column()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='column'"
	 * @generated
	 */
	EList<Column> getColumn();

	/**
	 * Returns the value of the '<em><b>Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Access</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access</em>' attribute.
	 * @see #setAccess(String)
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getVersion_Access()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='access'"
	 * @generated
	 */
	String getAccess();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.Version#getAccess <em>Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access</em>' attribute.
	 * @see #getAccess()
	 * @generated
	 */
	void setAccess(String value);

	/**
	 * Returns the value of the '<em><b>Column1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Column1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column1</em>' attribute.
	 * @see #setColumn1(String)
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getVersion_Column1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='column'"
	 * @generated
	 */
	String getColumn1();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.Version#getColumn1 <em>Column1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Column1</em>' attribute.
	 * @see #getColumn1()
	 * @generated
	 */
	void setColumn1(String value);

	/**
	 * Returns the value of the '<em><b>Generated</b></em>' attribute.
	 * The default value is <code>"never"</code>.
	 * The literals are from the enumeration {@link org.eclipse.emf.teneo.db2m.hbm30.GeneratedNeverAlways}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generated</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated</em>' attribute.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.GeneratedNeverAlways
	 * @see #isSetGenerated()
	 * @see #unsetGenerated()
	 * @see #setGenerated(GeneratedNeverAlways)
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getVersion_Generated()
	 * @model default="never" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='generated'"
	 * @generated
	 */
	GeneratedNeverAlways getGenerated();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.Version#getGenerated <em>Generated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generated</em>' attribute.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.GeneratedNeverAlways
	 * @see #isSetGenerated()
	 * @see #unsetGenerated()
	 * @see #getGenerated()
	 * @generated
	 */
	void setGenerated(GeneratedNeverAlways value);

	/**
	 * Unsets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.Version#getGenerated <em>Generated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetGenerated()
	 * @see #getGenerated()
	 * @see #setGenerated(GeneratedNeverAlways)
	 * @generated
	 */
	void unsetGenerated();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.Version#getGenerated <em>Generated</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Generated</em>' attribute is set.
	 * @see #unsetGenerated()
	 * @see #getGenerated()
	 * @see #setGenerated(GeneratedNeverAlways)
	 * @generated
	 */
	boolean isSetGenerated();

	/**
	 * Returns the value of the '<em><b>Insert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Insert</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Insert</em>' attribute.
	 * @see #isSetInsert()
	 * @see #unsetInsert()
	 * @see #setInsert(boolean)
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getVersion_Insert()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='insert'"
	 * @generated
	 */
	boolean isInsert();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.Version#isInsert <em>Insert</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Insert</em>' attribute.
	 * @see #isSetInsert()
	 * @see #unsetInsert()
	 * @see #isInsert()
	 * @generated
	 */
	void setInsert(boolean value);

	/**
	 * Unsets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.Version#isInsert <em>Insert</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetInsert()
	 * @see #isInsert()
	 * @see #setInsert(boolean)
	 * @generated
	 */
	void unsetInsert();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.Version#isInsert <em>Insert</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Insert</em>' attribute is set.
	 * @see #unsetInsert()
	 * @see #isInsert()
	 * @see #setInsert(boolean)
	 * @generated
	 */
	boolean isSetInsert();

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
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getVersion_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.Version#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Node</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node</em>' attribute.
	 * @see #setNode(String)
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getVersion_Node()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='node'"
	 * @generated
	 */
	String getNode();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.Version#getNode <em>Node</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node</em>' attribute.
	 * @see #getNode()
	 * @generated
	 */
	void setNode(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"integer"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #setType(String)
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getVersion_Type()
	 * @model default="integer" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='type'"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.Version#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Unsets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.Version#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(String)
	 * @generated
	 */
	void unsetType();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.Version#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(String)
	 * @generated
	 */
	boolean isSetType();

	/**
	 * Returns the value of the '<em><b>Unsaved Value</b></em>' attribute.
	 * The default value is <code>"undefined"</code>.
	 * The literals are from the enumeration {@link org.eclipse.emf.teneo.db2m.hbm30.UnsavedValueType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unsaved Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unsaved Value</em>' attribute.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.UnsavedValueType
	 * @see #isSetUnsavedValue()
	 * @see #unsetUnsavedValue()
	 * @see #setUnsavedValue(UnsavedValueType)
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getVersion_UnsavedValue()
	 * @model default="undefined" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='unsaved-value'"
	 * @generated
	 */
	UnsavedValueType getUnsavedValue();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.Version#getUnsavedValue <em>Unsaved Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unsaved Value</em>' attribute.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.UnsavedValueType
	 * @see #isSetUnsavedValue()
	 * @see #unsetUnsavedValue()
	 * @see #getUnsavedValue()
	 * @generated
	 */
	void setUnsavedValue(UnsavedValueType value);

	/**
	 * Unsets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.Version#getUnsavedValue <em>Unsaved Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUnsavedValue()
	 * @see #getUnsavedValue()
	 * @see #setUnsavedValue(UnsavedValueType)
	 * @generated
	 */
	void unsetUnsavedValue();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.Version#getUnsavedValue <em>Unsaved Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Unsaved Value</em>' attribute is set.
	 * @see #unsetUnsavedValue()
	 * @see #getUnsavedValue()
	 * @see #setUnsavedValue(UnsavedValueType)
	 * @generated
	 */
	boolean isSetUnsavedValue();

} // Version

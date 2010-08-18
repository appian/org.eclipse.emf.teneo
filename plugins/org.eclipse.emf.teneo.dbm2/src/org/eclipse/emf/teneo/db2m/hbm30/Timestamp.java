/**
 * <copyright>
 * </copyright>
 *
 * $Id: Timestamp.java,v 1.1 2010/08/18 09:21:39 cbouhier Exp $
 */
package org.eclipse.emf.teneo.db2m.hbm30;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Timestamp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.Timestamp#getMeta <em>Meta</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.Timestamp#getAccess <em>Access</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.Timestamp#getColumn <em>Column</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.Timestamp#getGenerated <em>Generated</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.Timestamp#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.Timestamp#getNode <em>Node</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.Timestamp#getSource <em>Source</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.Timestamp#getUnsavedValue <em>Unsaved Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getTimestamp()
 * @model extendedMetaData="name='timestamp' kind='elementOnly'"
 * @generated
 */
public interface Timestamp extends EObject {
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
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getTimestamp_Meta()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='meta'"
	 * @generated
	 */
	EList<Meta> getMeta();

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
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getTimestamp_Access()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='access'"
	 * @generated
	 */
	String getAccess();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.Timestamp#getAccess <em>Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access</em>' attribute.
	 * @see #getAccess()
	 * @generated
	 */
	void setAccess(String value);

	/**
	 * Returns the value of the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Column</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column</em>' attribute.
	 * @see #setColumn(String)
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getTimestamp_Column()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='column'"
	 * @generated
	 */
	String getColumn();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.Timestamp#getColumn <em>Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Column</em>' attribute.
	 * @see #getColumn()
	 * @generated
	 */
	void setColumn(String value);

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
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getTimestamp_Generated()
	 * @model default="never" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='generated'"
	 * @generated
	 */
	GeneratedNeverAlways getGenerated();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.Timestamp#getGenerated <em>Generated</em>}' attribute.
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
	 * Unsets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.Timestamp#getGenerated <em>Generated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetGenerated()
	 * @see #getGenerated()
	 * @see #setGenerated(GeneratedNeverAlways)
	 * @generated
	 */
	void unsetGenerated();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.Timestamp#getGenerated <em>Generated</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getTimestamp_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.Timestamp#getName <em>Name</em>}' attribute.
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
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getTimestamp_Node()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='node'"
	 * @generated
	 */
	String getNode();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.Timestamp#getNode <em>Node</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node</em>' attribute.
	 * @see #getNode()
	 * @generated
	 */
	void setNode(String value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' attribute.
	 * The default value is <code>"vm"</code>.
	 * The literals are from the enumeration {@link org.eclipse.emf.teneo.db2m.hbm30.SourceType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' attribute.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.SourceType
	 * @see #isSetSource()
	 * @see #unsetSource()
	 * @see #setSource(SourceType)
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getTimestamp_Source()
	 * @model default="vm" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='source'"
	 * @generated
	 */
	SourceType getSource();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.Timestamp#getSource <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' attribute.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.SourceType
	 * @see #isSetSource()
	 * @see #unsetSource()
	 * @see #getSource()
	 * @generated
	 */
	void setSource(SourceType value);

	/**
	 * Unsets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.Timestamp#getSource <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSource()
	 * @see #getSource()
	 * @see #setSource(SourceType)
	 * @generated
	 */
	void unsetSource();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.Timestamp#getSource <em>Source</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Source</em>' attribute is set.
	 * @see #unsetSource()
	 * @see #getSource()
	 * @see #setSource(SourceType)
	 * @generated
	 */
	boolean isSetSource();

	/**
	 * Returns the value of the '<em><b>Unsaved Value</b></em>' attribute.
	 * The default value is <code>"null"</code>.
	 * The literals are from the enumeration {@link org.eclipse.emf.teneo.db2m.hbm30.UnsavedValueType1}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unsaved Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unsaved Value</em>' attribute.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.UnsavedValueType1
	 * @see #isSetUnsavedValue()
	 * @see #unsetUnsavedValue()
	 * @see #setUnsavedValue(UnsavedValueType1)
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getTimestamp_UnsavedValue()
	 * @model default="null" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='unsaved-value'"
	 * @generated
	 */
	UnsavedValueType1 getUnsavedValue();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.Timestamp#getUnsavedValue <em>Unsaved Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unsaved Value</em>' attribute.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.UnsavedValueType1
	 * @see #isSetUnsavedValue()
	 * @see #unsetUnsavedValue()
	 * @see #getUnsavedValue()
	 * @generated
	 */
	void setUnsavedValue(UnsavedValueType1 value);

	/**
	 * Unsets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.Timestamp#getUnsavedValue <em>Unsaved Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUnsavedValue()
	 * @see #getUnsavedValue()
	 * @see #setUnsavedValue(UnsavedValueType1)
	 * @generated
	 */
	void unsetUnsavedValue();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.Timestamp#getUnsavedValue <em>Unsaved Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Unsaved Value</em>' attribute is set.
	 * @see #unsetUnsavedValue()
	 * @see #getUnsavedValue()
	 * @see #setUnsavedValue(UnsavedValueType1)
	 * @generated
	 */
	boolean isSetUnsavedValue();

} // Timestamp

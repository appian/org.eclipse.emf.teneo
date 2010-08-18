/**
 * <copyright>
 * </copyright>
 *
 * $Id: Key.java,v 1.1 2010/08/18 09:25:25 cbouhier Exp $
 */
package org.eclipse.emf.teneo.db2m.hbm30;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Key</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.Key#getColumn <em>Column</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.Key#getColumn1 <em>Column1</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.Key#getForeignKey <em>Foreign Key</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.Key#isNotNull <em>Not Null</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.Key#getOnDelete <em>On Delete</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.Key#getPropertyRef <em>Property Ref</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.Key#isUnique <em>Unique</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.Key#isUpdate <em>Update</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getKey()
 * @model extendedMetaData="name='key' kind='elementOnly'"
 * @generated
 */
public interface Key extends EObject {
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
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getKey_Column()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='column'"
	 * @generated
	 */
	EList<Column> getColumn();

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
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getKey_Column1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='column'"
	 * @generated
	 */
	String getColumn1();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.Key#getColumn1 <em>Column1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Column1</em>' attribute.
	 * @see #getColumn1()
	 * @generated
	 */
	void setColumn1(String value);

	/**
	 * Returns the value of the '<em><b>Foreign Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Foreign Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Foreign Key</em>' attribute.
	 * @see #setForeignKey(String)
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getKey_ForeignKey()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='foreign-key'"
	 * @generated
	 */
	String getForeignKey();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.Key#getForeignKey <em>Foreign Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Foreign Key</em>' attribute.
	 * @see #getForeignKey()
	 * @generated
	 */
	void setForeignKey(String value);

	/**
	 * Returns the value of the '<em><b>Not Null</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Not Null</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Not Null</em>' attribute.
	 * @see #isSetNotNull()
	 * @see #unsetNotNull()
	 * @see #setNotNull(boolean)
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getKey_NotNull()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='not-null'"
	 * @generated
	 */
	boolean isNotNull();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.Key#isNotNull <em>Not Null</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Not Null</em>' attribute.
	 * @see #isSetNotNull()
	 * @see #unsetNotNull()
	 * @see #isNotNull()
	 * @generated
	 */
	void setNotNull(boolean value);

	/**
	 * Unsets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.Key#isNotNull <em>Not Null</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNotNull()
	 * @see #isNotNull()
	 * @see #setNotNull(boolean)
	 * @generated
	 */
	void unsetNotNull();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.Key#isNotNull <em>Not Null</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Not Null</em>' attribute is set.
	 * @see #unsetNotNull()
	 * @see #isNotNull()
	 * @see #setNotNull(boolean)
	 * @generated
	 */
	boolean isSetNotNull();

	/**
	 * Returns the value of the '<em><b>On Delete</b></em>' attribute.
	 * The default value is <code>"noaction"</code>.
	 * The literals are from the enumeration {@link org.eclipse.emf.teneo.db2m.hbm30.OnDeleteType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>On Delete</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Delete</em>' attribute.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.OnDeleteType
	 * @see #isSetOnDelete()
	 * @see #unsetOnDelete()
	 * @see #setOnDelete(OnDeleteType)
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getKey_OnDelete()
	 * @model default="noaction" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='on-delete'"
	 * @generated
	 */
	OnDeleteType getOnDelete();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.Key#getOnDelete <em>On Delete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Delete</em>' attribute.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.OnDeleteType
	 * @see #isSetOnDelete()
	 * @see #unsetOnDelete()
	 * @see #getOnDelete()
	 * @generated
	 */
	void setOnDelete(OnDeleteType value);

	/**
	 * Unsets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.Key#getOnDelete <em>On Delete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOnDelete()
	 * @see #getOnDelete()
	 * @see #setOnDelete(OnDeleteType)
	 * @generated
	 */
	void unsetOnDelete();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.Key#getOnDelete <em>On Delete</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>On Delete</em>' attribute is set.
	 * @see #unsetOnDelete()
	 * @see #getOnDelete()
	 * @see #setOnDelete(OnDeleteType)
	 * @generated
	 */
	boolean isSetOnDelete();

	/**
	 * Returns the value of the '<em><b>Property Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Ref</em>' attribute.
	 * @see #setPropertyRef(String)
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getKey_PropertyRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='property-ref'"
	 * @generated
	 */
	String getPropertyRef();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.Key#getPropertyRef <em>Property Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Ref</em>' attribute.
	 * @see #getPropertyRef()
	 * @generated
	 */
	void setPropertyRef(String value);

	/**
	 * Returns the value of the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unique</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unique</em>' attribute.
	 * @see #isSetUnique()
	 * @see #unsetUnique()
	 * @see #setUnique(boolean)
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getKey_Unique()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='unique'"
	 * @generated
	 */
	boolean isUnique();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.Key#isUnique <em>Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unique</em>' attribute.
	 * @see #isSetUnique()
	 * @see #unsetUnique()
	 * @see #isUnique()
	 * @generated
	 */
	void setUnique(boolean value);

	/**
	 * Unsets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.Key#isUnique <em>Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUnique()
	 * @see #isUnique()
	 * @see #setUnique(boolean)
	 * @generated
	 */
	void unsetUnique();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.Key#isUnique <em>Unique</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Unique</em>' attribute is set.
	 * @see #unsetUnique()
	 * @see #isUnique()
	 * @see #setUnique(boolean)
	 * @generated
	 */
	boolean isSetUnique();

	/**
	 * Returns the value of the '<em><b>Update</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Update</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Update</em>' attribute.
	 * @see #isSetUpdate()
	 * @see #unsetUpdate()
	 * @see #setUpdate(boolean)
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getKey_Update()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='update'"
	 * @generated
	 */
	boolean isUpdate();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.Key#isUpdate <em>Update</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Update</em>' attribute.
	 * @see #isSetUpdate()
	 * @see #unsetUpdate()
	 * @see #isUpdate()
	 * @generated
	 */
	void setUpdate(boolean value);

	/**
	 * Unsets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.Key#isUpdate <em>Update</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUpdate()
	 * @see #isUpdate()
	 * @see #setUpdate(boolean)
	 * @generated
	 */
	void unsetUpdate();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.Key#isUpdate <em>Update</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Update</em>' attribute is set.
	 * @see #unsetUpdate()
	 * @see #isUpdate()
	 * @see #setUpdate(boolean)
	 * @generated
	 */
	boolean isSetUpdate();

} // Key

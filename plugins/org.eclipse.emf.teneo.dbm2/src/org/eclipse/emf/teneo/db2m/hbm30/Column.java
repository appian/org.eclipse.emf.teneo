/**
 * <copyright>
 * </copyright>
 *
 * $Id: Column.java,v 1.1 2010/08/18 09:21:39 cbouhier Exp $
 */
package org.eclipse.emf.teneo.db2m.hbm30;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Column</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.Column#getComment <em>Comment</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.Column#getCheck <em>Check</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.Column#getDefault <em>Default</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.Column#getIndex <em>Index</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.Column#getLength <em>Length</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.Column#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.Column#isNotNull <em>Not Null</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.Column#getPrecision <em>Precision</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.Column#getScale <em>Scale</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.Column#getSqlType <em>Sql Type</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.Column#isUnique <em>Unique</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.Column#getUniqueKey <em>Unique Key</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getColumn()
 * @model extendedMetaData="name='column' kind='elementOnly'"
 * @generated
 */
public interface Column extends EObject {
	/**
	 * Returns the value of the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment</em>' attribute.
	 * @see #setComment(String)
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getColumn_Comment()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='comment'"
	 * @generated
	 */
	String getComment();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.Column#getComment <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' attribute.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(String value);

	/**
	 * Returns the value of the '<em><b>Check</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Check</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Check</em>' attribute.
	 * @see #setCheck(String)
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getColumn_Check()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='check'"
	 * @generated
	 */
	String getCheck();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.Column#getCheck <em>Check</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Check</em>' attribute.
	 * @see #getCheck()
	 * @generated
	 */
	void setCheck(String value);

	/**
	 * Returns the value of the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default</em>' attribute.
	 * @see #setDefault(String)
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getColumn_Default()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='default'"
	 * @generated
	 */
	String getDefault();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.Column#getDefault <em>Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default</em>' attribute.
	 * @see #getDefault()
	 * @generated
	 */
	void setDefault(String value);

	/**
	 * Returns the value of the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Index</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index</em>' attribute.
	 * @see #setIndex(String)
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getColumn_Index()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='index'"
	 * @generated
	 */
	String getIndex();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.Column#getIndex <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Index</em>' attribute.
	 * @see #getIndex()
	 * @generated
	 */
	void setIndex(String value);

	/**
	 * Returns the value of the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Length</em>' attribute.
	 * @see #setLength(String)
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getColumn_Length()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='length'"
	 * @generated
	 */
	String getLength();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.Column#getLength <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length</em>' attribute.
	 * @see #getLength()
	 * @generated
	 */
	void setLength(String value);

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
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getColumn_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.Column#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

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
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getColumn_NotNull()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='not-null'"
	 * @generated
	 */
	boolean isNotNull();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.Column#isNotNull <em>Not Null</em>}' attribute.
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
	 * Unsets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.Column#isNotNull <em>Not Null</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNotNull()
	 * @see #isNotNull()
	 * @see #setNotNull(boolean)
	 * @generated
	 */
	void unsetNotNull();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.Column#isNotNull <em>Not Null</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Precision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Precision</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Precision</em>' attribute.
	 * @see #setPrecision(String)
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getColumn_Precision()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='precision'"
	 * @generated
	 */
	String getPrecision();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.Column#getPrecision <em>Precision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Precision</em>' attribute.
	 * @see #getPrecision()
	 * @generated
	 */
	void setPrecision(String value);

	/**
	 * Returns the value of the '<em><b>Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scale</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scale</em>' attribute.
	 * @see #setScale(String)
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getColumn_Scale()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='scale'"
	 * @generated
	 */
	String getScale();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.Column#getScale <em>Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scale</em>' attribute.
	 * @see #getScale()
	 * @generated
	 */
	void setScale(String value);

	/**
	 * Returns the value of the '<em><b>Sql Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sql Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sql Type</em>' attribute.
	 * @see #setSqlType(String)
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getColumn_SqlType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='sql-type'"
	 * @generated
	 */
	String getSqlType();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.Column#getSqlType <em>Sql Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sql Type</em>' attribute.
	 * @see #getSqlType()
	 * @generated
	 */
	void setSqlType(String value);

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
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getColumn_Unique()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='unique'"
	 * @generated
	 */
	boolean isUnique();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.Column#isUnique <em>Unique</em>}' attribute.
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
	 * Unsets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.Column#isUnique <em>Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUnique()
	 * @see #isUnique()
	 * @see #setUnique(boolean)
	 * @generated
	 */
	void unsetUnique();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.Column#isUnique <em>Unique</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Unique Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unique Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unique Key</em>' attribute.
	 * @see #setUniqueKey(String)
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getColumn_UniqueKey()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='unique-key'"
	 * @generated
	 */
	String getUniqueKey();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.Column#getUniqueKey <em>Unique Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unique Key</em>' attribute.
	 * @see #getUniqueKey()
	 * @generated
	 */
	void setUniqueKey(String value);

} // Column

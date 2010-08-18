/**
 * <copyright>
 * </copyright>
 *
 * $Id: IndexManyToMany.java,v 1.1 2010/08/18 09:21:40 cbouhier Exp $
 */
package org.eclipse.emf.teneo.db2m.hbm30;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Index Many To Many</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.IndexManyToMany#getColumn <em>Column</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.IndexManyToMany#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.IndexManyToMany#getColumn1 <em>Column1</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.IndexManyToMany#getEntityName <em>Entity Name</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.IndexManyToMany#getForeignKey <em>Foreign Key</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getIndexManyToMany()
 * @model extendedMetaData="name='index-many-to-many' kind='elementOnly'"
 * @generated
 */
public interface IndexManyToMany extends EObject {
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
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getIndexManyToMany_Column()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='column'"
	 * @generated
	 */
	EList<Column> getColumn();

	/**
	 * Returns the value of the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class</em>' attribute.
	 * @see #setClass(String)
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getIndexManyToMany_Class()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='class'"
	 * @generated
	 */
	String getClass_();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.IndexManyToMany#getClass_ <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class</em>' attribute.
	 * @see #getClass_()
	 * @generated
	 */
	void setClass(String value);

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
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getIndexManyToMany_Column1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='column'"
	 * @generated
	 */
	String getColumn1();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.IndexManyToMany#getColumn1 <em>Column1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Column1</em>' attribute.
	 * @see #getColumn1()
	 * @generated
	 */
	void setColumn1(String value);

	/**
	 * Returns the value of the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entity Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity Name</em>' attribute.
	 * @see #setEntityName(String)
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getIndexManyToMany_EntityName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='entity-name'"
	 * @generated
	 */
	String getEntityName();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.IndexManyToMany#getEntityName <em>Entity Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity Name</em>' attribute.
	 * @see #getEntityName()
	 * @generated
	 */
	void setEntityName(String value);

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
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getIndexManyToMany_ForeignKey()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='foreign-key'"
	 * @generated
	 */
	String getForeignKey();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.IndexManyToMany#getForeignKey <em>Foreign Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Foreign Key</em>' attribute.
	 * @see #getForeignKey()
	 * @generated
	 */
	void setForeignKey(String value);

} // IndexManyToMany

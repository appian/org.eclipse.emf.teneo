/**
 * <copyright>
 * </copyright>
 *
 * $Id: PrimaryKeyJoinColumn.java,v 1.1 2009/03/15 23:45:01 mtaal Exp $
 */
package org.eclipse.emf.teneo.jpa.orm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Primary Key Join Column</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 
 *         @Target({TYPE, METHOD, FIELD}) @Retention(RUNTIME)
 *         public @interface PrimaryKeyJoinColumn {
 *           String name() default "";
 *           String referencedColumnName() default "";
 *           String columnDefinition() default "";
 *         }
 * 
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.jpa.orm.PrimaryKeyJoinColumn#getColumnDefinition <em>Column Definition</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.jpa.orm.PrimaryKeyJoinColumn#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.jpa.orm.PrimaryKeyJoinColumn#getReferencedColumnName <em>Referenced Column Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.jpa.orm.OrmPackage#getPrimaryKeyJoinColumn()
 * @model extendedMetaData="name='primary-key-join-column' kind='empty'"
 * @generated
 */
public interface PrimaryKeyJoinColumn extends EObject {
	/**
	 * Returns the value of the '<em><b>Column Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Column Definition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column Definition</em>' attribute.
	 * @see #setColumnDefinition(String)
	 * @see org.eclipse.emf.teneo.jpa.orm.OrmPackage#getPrimaryKeyJoinColumn_ColumnDefinition()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='column-definition'"
	 * @generated
	 */
	String getColumnDefinition();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.jpa.orm.PrimaryKeyJoinColumn#getColumnDefinition <em>Column Definition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Column Definition</em>' attribute.
	 * @see #getColumnDefinition()
	 * @generated
	 */
	void setColumnDefinition(String value);

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
	 * @see org.eclipse.emf.teneo.jpa.orm.OrmPackage#getPrimaryKeyJoinColumn_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.jpa.orm.PrimaryKeyJoinColumn#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Referenced Column Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referenced Column Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Column Name</em>' attribute.
	 * @see #setReferencedColumnName(String)
	 * @see org.eclipse.emf.teneo.jpa.orm.OrmPackage#getPrimaryKeyJoinColumn_ReferencedColumnName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='referenced-column-name'"
	 * @generated
	 */
	String getReferencedColumnName();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.jpa.orm.PrimaryKeyJoinColumn#getReferencedColumnName <em>Referenced Column Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referenced Column Name</em>' attribute.
	 * @see #getReferencedColumnName()
	 * @generated
	 */
	void setReferencedColumnName(String value);

} // PrimaryKeyJoinColumn

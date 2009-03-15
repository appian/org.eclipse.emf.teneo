/**
 * <copyright>
 * </copyright>
 *
 * $Id: DiscriminatorColumn.java,v 1.1 2009/03/15 23:45:01 mtaal Exp $
 */
package org.eclipse.emf.teneo.jpa.orm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Discriminator Column</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 
 *         @Target({TYPE}) @Retention(RUNTIME)
 *         public @interface DiscriminatorColumn {
 *           String name() default "DTYPE";
 *           DiscriminatorType discriminatorType() default STRING;
 *           String columnDefinition() default "";
 *           int length() default 31;
 *         }
 * 
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.jpa.orm.DiscriminatorColumn#getColumnDefinition <em>Column Definition</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.jpa.orm.DiscriminatorColumn#getDiscriminatorType <em>Discriminator Type</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.jpa.orm.DiscriminatorColumn#getLength <em>Length</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.jpa.orm.DiscriminatorColumn#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.jpa.orm.OrmPackage#getDiscriminatorColumn()
 * @model extendedMetaData="name='discriminator-column' kind='empty'"
 * @generated
 */
public interface DiscriminatorColumn extends EObject {
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
	 * @see org.eclipse.emf.teneo.jpa.orm.OrmPackage#getDiscriminatorColumn_ColumnDefinition()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='column-definition'"
	 * @generated
	 */
	String getColumnDefinition();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.jpa.orm.DiscriminatorColumn#getColumnDefinition <em>Column Definition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Column Definition</em>' attribute.
	 * @see #getColumnDefinition()
	 * @generated
	 */
	void setColumnDefinition(String value);

	/**
	 * Returns the value of the '<em><b>Discriminator Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.emf.teneo.jpa.orm.DiscriminatorType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Discriminator Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Discriminator Type</em>' attribute.
	 * @see org.eclipse.emf.teneo.jpa.orm.DiscriminatorType
	 * @see #isSetDiscriminatorType()
	 * @see #unsetDiscriminatorType()
	 * @see #setDiscriminatorType(DiscriminatorType)
	 * @see org.eclipse.emf.teneo.jpa.orm.OrmPackage#getDiscriminatorColumn_DiscriminatorType()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='discriminator-type'"
	 * @generated
	 */
	DiscriminatorType getDiscriminatorType();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.jpa.orm.DiscriminatorColumn#getDiscriminatorType <em>Discriminator Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Discriminator Type</em>' attribute.
	 * @see org.eclipse.emf.teneo.jpa.orm.DiscriminatorType
	 * @see #isSetDiscriminatorType()
	 * @see #unsetDiscriminatorType()
	 * @see #getDiscriminatorType()
	 * @generated
	 */
	void setDiscriminatorType(DiscriminatorType value);

	/**
	 * Unsets the value of the '{@link org.eclipse.emf.teneo.jpa.orm.DiscriminatorColumn#getDiscriminatorType <em>Discriminator Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDiscriminatorType()
	 * @see #getDiscriminatorType()
	 * @see #setDiscriminatorType(DiscriminatorType)
	 * @generated
	 */
	void unsetDiscriminatorType();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.teneo.jpa.orm.DiscriminatorColumn#getDiscriminatorType <em>Discriminator Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Discriminator Type</em>' attribute is set.
	 * @see #unsetDiscriminatorType()
	 * @see #getDiscriminatorType()
	 * @see #setDiscriminatorType(DiscriminatorType)
	 * @generated
	 */
	boolean isSetDiscriminatorType();

	/**
	 * Returns the value of the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Length</em>' attribute.
	 * @see #isSetLength()
	 * @see #unsetLength()
	 * @see #setLength(int)
	 * @see org.eclipse.emf.teneo.jpa.orm.OrmPackage#getDiscriminatorColumn_Length()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='attribute' name='length'"
	 * @generated
	 */
	int getLength();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.jpa.orm.DiscriminatorColumn#getLength <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length</em>' attribute.
	 * @see #isSetLength()
	 * @see #unsetLength()
	 * @see #getLength()
	 * @generated
	 */
	void setLength(int value);

	/**
	 * Unsets the value of the '{@link org.eclipse.emf.teneo.jpa.orm.DiscriminatorColumn#getLength <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLength()
	 * @see #getLength()
	 * @see #setLength(int)
	 * @generated
	 */
	void unsetLength();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.teneo.jpa.orm.DiscriminatorColumn#getLength <em>Length</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Length</em>' attribute is set.
	 * @see #unsetLength()
	 * @see #getLength()
	 * @see #setLength(int)
	 * @generated
	 */
	boolean isSetLength();

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
	 * @see org.eclipse.emf.teneo.jpa.orm.OrmPackage#getDiscriminatorColumn_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.jpa.orm.DiscriminatorColumn#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // DiscriminatorColumn

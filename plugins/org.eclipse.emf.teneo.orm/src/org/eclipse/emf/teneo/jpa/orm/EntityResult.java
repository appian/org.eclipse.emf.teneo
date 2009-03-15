/**
 * <copyright>
 * </copyright>
 *
 * $Id: EntityResult.java,v 1.1 2009/03/15 23:45:01 mtaal Exp $
 */
package org.eclipse.emf.teneo.jpa.orm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 
 *         @Target({}) @Retention(RUNTIME)
 *         public @interface EntityResult {
 *           Class entityClass();
 *           FieldResult[] fields() default {};
 *           String discriminatorColumn() default "";
 *         }
 * 
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.jpa.orm.EntityResult#getFieldResult <em>Field Result</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.jpa.orm.EntityResult#getDiscriminatorColumn <em>Discriminator Column</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.jpa.orm.EntityResult#getEntityClass <em>Entity Class</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.jpa.orm.OrmPackage#getEntityResult()
 * @model extendedMetaData="name='entity-result' kind='elementOnly'"
 * @generated
 */
public interface EntityResult extends EObject {
	/**
	 * Returns the value of the '<em><b>Field Result</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.jpa.orm.FieldResult}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Field Result</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field Result</em>' containment reference list.
	 * @see org.eclipse.emf.teneo.jpa.orm.OrmPackage#getEntityResult_FieldResult()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='field-result' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<FieldResult> getFieldResult();

	/**
	 * Returns the value of the '<em><b>Discriminator Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Discriminator Column</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Discriminator Column</em>' attribute.
	 * @see #setDiscriminatorColumn(String)
	 * @see org.eclipse.emf.teneo.jpa.orm.OrmPackage#getEntityResult_DiscriminatorColumn()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='discriminator-column'"
	 * @generated
	 */
	String getDiscriminatorColumn();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.jpa.orm.EntityResult#getDiscriminatorColumn <em>Discriminator Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Discriminator Column</em>' attribute.
	 * @see #getDiscriminatorColumn()
	 * @generated
	 */
	void setDiscriminatorColumn(String value);

	/**
	 * Returns the value of the '<em><b>Entity Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entity Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity Class</em>' attribute.
	 * @see #setEntityClass(String)
	 * @see org.eclipse.emf.teneo.jpa.orm.OrmPackage#getEntityResult_EntityClass()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='entity-class'"
	 * @generated
	 */
	String getEntityClass();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.jpa.orm.EntityResult#getEntityClass <em>Entity Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity Class</em>' attribute.
	 * @see #getEntityClass()
	 * @generated
	 */
	void setEntityClass(String value);

} // EntityResult

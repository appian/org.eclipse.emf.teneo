/**
 * <copyright>
 * </copyright>
 *
 * $Id: SqlResultSetMapping.java,v 1.1 2009/03/15 23:45:01 mtaal Exp $
 */
package org.eclipse.emf.teneo.jpa.orm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sql Result Set Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 
 *         @Target({TYPE}) @Retention(RUNTIME)
 *         public @interface SqlResultSetMapping {
 *           String name();
 *           EntityResult[] entities() default {};
 *           ColumnResult[] columns() default {};
 *         }
 * 
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.jpa.orm.SqlResultSetMapping#getEntityResult <em>Entity Result</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.jpa.orm.SqlResultSetMapping#getColumnResult <em>Column Result</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.jpa.orm.SqlResultSetMapping#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.jpa.orm.OrmPackage#getSqlResultSetMapping()
 * @model extendedMetaData="name='sql-result-set-mapping' kind='elementOnly'"
 * @generated
 */
public interface SqlResultSetMapping extends EObject {
	/**
	 * Returns the value of the '<em><b>Entity Result</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.jpa.orm.EntityResult}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entity Result</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity Result</em>' containment reference list.
	 * @see org.eclipse.emf.teneo.jpa.orm.OrmPackage#getSqlResultSetMapping_EntityResult()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='entity-result' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<EntityResult> getEntityResult();

	/**
	 * Returns the value of the '<em><b>Column Result</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.jpa.orm.ColumnResult}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Column Result</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column Result</em>' containment reference list.
	 * @see org.eclipse.emf.teneo.jpa.orm.OrmPackage#getSqlResultSetMapping_ColumnResult()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='column-result' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ColumnResult> getColumnResult();

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
	 * @see org.eclipse.emf.teneo.jpa.orm.OrmPackage#getSqlResultSetMapping_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.jpa.orm.SqlResultSetMapping#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // SqlResultSetMapping

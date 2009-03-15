/**
 * <copyright>
 * </copyright>
 *
 * $Id: UniqueConstraint.java,v 1.1 2009/03/15 23:45:00 mtaal Exp $
 */
package org.eclipse.emf.teneo.jpa.orm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unique Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 
 *         @Target({}) @Retention(RUNTIME)
 *         public @interface UniqueConstraint {
 *           String[] columnNames();
 *         }
 * 
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.jpa.orm.UniqueConstraint#getColumnName <em>Column Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.jpa.orm.OrmPackage#getUniqueConstraint()
 * @model extendedMetaData="name='unique-constraint' kind='elementOnly'"
 * @generated
 */
public interface UniqueConstraint extends EObject {
	/**
	 * Returns the value of the '<em><b>Column Name</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Column Name</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column Name</em>' attribute list.
	 * @see org.eclipse.emf.teneo.jpa.orm.OrmPackage#getUniqueConstraint_ColumnName()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='column-name' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getColumnName();

} // UniqueConstraint

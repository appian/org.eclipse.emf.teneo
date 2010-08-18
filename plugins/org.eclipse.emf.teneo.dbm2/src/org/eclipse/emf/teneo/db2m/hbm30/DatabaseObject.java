/**
 * <copyright>
 * </copyright>
 *
 * $Id: DatabaseObject.java,v 1.1 2010/08/18 09:25:25 cbouhier Exp $
 */
package org.eclipse.emf.teneo.db2m.hbm30;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Database Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.DatabaseObject#getDefinition <em>Definition</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.DatabaseObject#getCreate <em>Create</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.DatabaseObject#getDrop <em>Drop</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.DatabaseObject#getDialectScope <em>Dialect Scope</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getDatabaseObject()
 * @model extendedMetaData="name='database-object' kind='elementOnly'"
 * @generated
 */
public interface DatabaseObject extends EObject {
	/**
	 * Returns the value of the '<em><b>Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Definition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definition</em>' containment reference.
	 * @see #setDefinition(Definition)
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getDatabaseObject_Definition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='definition'"
	 * @generated
	 */
	Definition getDefinition();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.DatabaseObject#getDefinition <em>Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definition</em>' containment reference.
	 * @see #getDefinition()
	 * @generated
	 */
	void setDefinition(Definition value);

	/**
	 * Returns the value of the '<em><b>Create</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Create</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Create</em>' attribute.
	 * @see #setCreate(String)
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getDatabaseObject_Create()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='create'"
	 * @generated
	 */
	String getCreate();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.DatabaseObject#getCreate <em>Create</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Create</em>' attribute.
	 * @see #getCreate()
	 * @generated
	 */
	void setCreate(String value);

	/**
	 * Returns the value of the '<em><b>Drop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Drop</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Drop</em>' attribute.
	 * @see #setDrop(String)
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getDatabaseObject_Drop()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='drop'"
	 * @generated
	 */
	String getDrop();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.DatabaseObject#getDrop <em>Drop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Drop</em>' attribute.
	 * @see #getDrop()
	 * @generated
	 */
	void setDrop(String value);

	/**
	 * Returns the value of the '<em><b>Dialect Scope</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.db2m.hbm30.DialectScope}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dialect Scope</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dialect Scope</em>' containment reference list.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getDatabaseObject_DialectScope()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dialect-scope'"
	 * @generated
	 */
	EList<DialectScope> getDialectScope();

} // DatabaseObject

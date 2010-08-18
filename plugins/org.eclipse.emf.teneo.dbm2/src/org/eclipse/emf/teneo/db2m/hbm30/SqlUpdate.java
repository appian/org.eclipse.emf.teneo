/**
 * <copyright>
 * </copyright>
 *
 * $Id: SqlUpdate.java,v 1.1 2010/08/18 09:25:25 cbouhier Exp $
 */
package org.eclipse.emf.teneo.db2m.hbm30;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sql Update</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.SqlUpdate#getValue <em>Value</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.SqlUpdate#isCallable <em>Callable</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getSqlUpdate()
 * @model extendedMetaData="name='sql-update' kind='simple'"
 * @generated
 */
public interface SqlUpdate extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getSqlUpdate_Value()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="name=':0' kind='simple'"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.SqlUpdate#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Callable</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Callable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Callable</em>' attribute.
	 * @see #isSetCallable()
	 * @see #unsetCallable()
	 * @see #setCallable(boolean)
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getSqlUpdate_Callable()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='callable'"
	 * @generated
	 */
	boolean isCallable();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.SqlUpdate#isCallable <em>Callable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Callable</em>' attribute.
	 * @see #isSetCallable()
	 * @see #unsetCallable()
	 * @see #isCallable()
	 * @generated
	 */
	void setCallable(boolean value);

	/**
	 * Unsets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.SqlUpdate#isCallable <em>Callable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCallable()
	 * @see #isCallable()
	 * @see #setCallable(boolean)
	 * @generated
	 */
	void unsetCallable();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.SqlUpdate#isCallable <em>Callable</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Callable</em>' attribute is set.
	 * @see #unsetCallable()
	 * @see #isCallable()
	 * @see #setCallable(boolean)
	 * @generated
	 */
	boolean isSetCallable();

} // SqlUpdate

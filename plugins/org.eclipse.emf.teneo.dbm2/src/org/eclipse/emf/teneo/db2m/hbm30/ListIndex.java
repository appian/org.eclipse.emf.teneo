/**
 * <copyright>
 * </copyright>
 *
 * $Id: ListIndex.java,v 1.1 2010/08/18 09:21:39 cbouhier Exp $
 */
package org.eclipse.emf.teneo.db2m.hbm30;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Index</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.ListIndex#getColumn <em>Column</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.ListIndex#getBase <em>Base</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.ListIndex#getColumn1 <em>Column1</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getListIndex()
 * @model extendedMetaData="name='list-index' kind='elementOnly'"
 * @generated
 */
public interface ListIndex extends EObject {
	/**
	 * Returns the value of the '<em><b>Column</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Column</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column</em>' containment reference.
	 * @see #setColumn(Column)
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getListIndex_Column()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='column'"
	 * @generated
	 */
	Column getColumn();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.ListIndex#getColumn <em>Column</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Column</em>' containment reference.
	 * @see #getColumn()
	 * @generated
	 */
	void setColumn(Column value);

	/**
	 * Returns the value of the '<em><b>Base</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base</em>' attribute.
	 * @see #isSetBase()
	 * @see #unsetBase()
	 * @see #setBase(String)
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getListIndex_Base()
	 * @model default="0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='base'"
	 * @generated
	 */
	String getBase();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.ListIndex#getBase <em>Base</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base</em>' attribute.
	 * @see #isSetBase()
	 * @see #unsetBase()
	 * @see #getBase()
	 * @generated
	 */
	void setBase(String value);

	/**
	 * Unsets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.ListIndex#getBase <em>Base</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBase()
	 * @see #getBase()
	 * @see #setBase(String)
	 * @generated
	 */
	void unsetBase();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.ListIndex#getBase <em>Base</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Base</em>' attribute is set.
	 * @see #unsetBase()
	 * @see #getBase()
	 * @see #setBase(String)
	 * @generated
	 */
	boolean isSetBase();

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
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getListIndex_Column1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='column'"
	 * @generated
	 */
	String getColumn1();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.ListIndex#getColumn1 <em>Column1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Column1</em>' attribute.
	 * @see #getColumn1()
	 * @generated
	 */
	void setColumn1(String value);

} // ListIndex

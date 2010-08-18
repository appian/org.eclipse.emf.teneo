/**
 * <copyright>
 * </copyright>
 *
 * $Id: Meta.java,v 1.1 2010/08/18 09:25:25 cbouhier Exp $
 */
package org.eclipse.emf.teneo.db2m.hbm30;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Meta</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.Meta#getValue <em>Value</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.Meta#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.Meta#isInherit <em>Inherit</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getMeta()
 * @model extendedMetaData="name='meta' kind='simple'"
 * @generated
 */
public interface Meta extends EObject {
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
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getMeta_Value()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="name=':0' kind='simple'"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.Meta#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' attribute.
	 * @see #setAttribute(String)
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getMeta_Attribute()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='attribute'"
	 * @generated
	 */
	String getAttribute();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.Meta#getAttribute <em>Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute</em>' attribute.
	 * @see #getAttribute()
	 * @generated
	 */
	void setAttribute(String value);

	/**
	 * Returns the value of the '<em><b>Inherit</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inherit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inherit</em>' attribute.
	 * @see #isSetInherit()
	 * @see #unsetInherit()
	 * @see #setInherit(boolean)
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getMeta_Inherit()
	 * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='inherit'"
	 * @generated
	 */
	boolean isInherit();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.Meta#isInherit <em>Inherit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inherit</em>' attribute.
	 * @see #isSetInherit()
	 * @see #unsetInherit()
	 * @see #isInherit()
	 * @generated
	 */
	void setInherit(boolean value);

	/**
	 * Unsets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.Meta#isInherit <em>Inherit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetInherit()
	 * @see #isInherit()
	 * @see #setInherit(boolean)
	 * @generated
	 */
	void unsetInherit();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.Meta#isInherit <em>Inherit</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Inherit</em>' attribute is set.
	 * @see #unsetInherit()
	 * @see #isInherit()
	 * @see #setInherit(boolean)
	 * @generated
	 */
	boolean isSetInherit();

} // Meta

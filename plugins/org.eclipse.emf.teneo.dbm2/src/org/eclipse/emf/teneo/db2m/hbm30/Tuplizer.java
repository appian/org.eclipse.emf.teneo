/**
 * <copyright>
 * </copyright>
 *
 * $Id: Tuplizer.java,v 1.1 2010/08/18 09:25:25 cbouhier Exp $
 */
package org.eclipse.emf.teneo.db2m.hbm30;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tuplizer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.Tuplizer#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.Tuplizer#getEntityMode <em>Entity Mode</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getTuplizer()
 * @model extendedMetaData="name='tuplizer' kind='empty'"
 * @generated
 */
public interface Tuplizer extends EObject {
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
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getTuplizer_Class()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='class'"
	 * @generated
	 */
	String getClass_();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.Tuplizer#getClass_ <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class</em>' attribute.
	 * @see #getClass_()
	 * @generated
	 */
	void setClass(String value);

	/**
	 * Returns the value of the '<em><b>Entity Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.emf.teneo.db2m.hbm30.EntityModeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entity Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity Mode</em>' attribute.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.EntityModeType
	 * @see #isSetEntityMode()
	 * @see #unsetEntityMode()
	 * @see #setEntityMode(EntityModeType)
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getTuplizer_EntityMode()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='entity-mode'"
	 * @generated
	 */
	EntityModeType getEntityMode();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.Tuplizer#getEntityMode <em>Entity Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity Mode</em>' attribute.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.EntityModeType
	 * @see #isSetEntityMode()
	 * @see #unsetEntityMode()
	 * @see #getEntityMode()
	 * @generated
	 */
	void setEntityMode(EntityModeType value);

	/**
	 * Unsets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.Tuplizer#getEntityMode <em>Entity Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEntityMode()
	 * @see #getEntityMode()
	 * @see #setEntityMode(EntityModeType)
	 * @generated
	 */
	void unsetEntityMode();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.Tuplizer#getEntityMode <em>Entity Mode</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Entity Mode</em>' attribute is set.
	 * @see #unsetEntityMode()
	 * @see #getEntityMode()
	 * @see #setEntityMode(EntityModeType)
	 * @generated
	 */
	boolean isSetEntityMode();

} // Tuplizer

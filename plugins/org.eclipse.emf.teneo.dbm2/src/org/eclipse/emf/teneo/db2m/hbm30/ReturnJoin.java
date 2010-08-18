/**
 * <copyright>
 * </copyright>
 *
 * $Id: ReturnJoin.java,v 1.1 2010/08/18 09:25:25 cbouhier Exp $
 */
package org.eclipse.emf.teneo.db2m.hbm30;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Return Join</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.ReturnJoin#getGroup <em>Group</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.ReturnJoin#getReturnProperty <em>Return Property</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.ReturnJoin#getAlias <em>Alias</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.ReturnJoin#getLockMode <em>Lock Mode</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.ReturnJoin#getProperty <em>Property</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getReturnJoin()
 * @model extendedMetaData="name='return-join' kind='elementOnly'"
 * @generated
 */
public interface ReturnJoin extends EObject {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getReturnJoin_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Return Property</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.db2m.hbm30.ReturnProperty}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Property</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Property</em>' containment reference list.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getReturnJoin_ReturnProperty()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='return-property' group='#group:0'"
	 * @generated
	 */
	EList<ReturnProperty> getReturnProperty();

	/**
	 * Returns the value of the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alias</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alias</em>' attribute.
	 * @see #setAlias(String)
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getReturnJoin_Alias()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='alias'"
	 * @generated
	 */
	String getAlias();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.ReturnJoin#getAlias <em>Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alias</em>' attribute.
	 * @see #getAlias()
	 * @generated
	 */
	void setAlias(String value);

	/**
	 * Returns the value of the '<em><b>Lock Mode</b></em>' attribute.
	 * The default value is <code>"read"</code>.
	 * The literals are from the enumeration {@link org.eclipse.emf.teneo.db2m.hbm30.Lockmode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lock Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lock Mode</em>' attribute.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Lockmode
	 * @see #isSetLockMode()
	 * @see #unsetLockMode()
	 * @see #setLockMode(Lockmode)
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getReturnJoin_LockMode()
	 * @model default="read" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='lock-mode'"
	 * @generated
	 */
	Lockmode getLockMode();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.ReturnJoin#getLockMode <em>Lock Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lock Mode</em>' attribute.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Lockmode
	 * @see #isSetLockMode()
	 * @see #unsetLockMode()
	 * @see #getLockMode()
	 * @generated
	 */
	void setLockMode(Lockmode value);

	/**
	 * Unsets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.ReturnJoin#getLockMode <em>Lock Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLockMode()
	 * @see #getLockMode()
	 * @see #setLockMode(Lockmode)
	 * @generated
	 */
	void unsetLockMode();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.ReturnJoin#getLockMode <em>Lock Mode</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Lock Mode</em>' attribute is set.
	 * @see #unsetLockMode()
	 * @see #getLockMode()
	 * @see #setLockMode(Lockmode)
	 * @generated
	 */
	boolean isSetLockMode();

	/**
	 * Returns the value of the '<em><b>Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property</em>' attribute.
	 * @see #setProperty(String)
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getReturnJoin_Property()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='property'"
	 * @generated
	 */
	String getProperty();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.ReturnJoin#getProperty <em>Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property</em>' attribute.
	 * @see #getProperty()
	 * @generated
	 */
	void setProperty(String value);

} // ReturnJoin

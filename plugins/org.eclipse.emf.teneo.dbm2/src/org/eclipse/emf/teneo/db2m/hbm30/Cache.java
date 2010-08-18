/**
 * <copyright>
 * </copyright>
 *
 * $Id: Cache.java,v 1.1 2010/08/18 09:25:25 cbouhier Exp $
 */
package org.eclipse.emf.teneo.db2m.hbm30;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cache</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.Cache#getInclude <em>Include</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.Cache#getRegion <em>Region</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.Cache#getUsage <em>Usage</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getCache()
 * @model extendedMetaData="name='cache' kind='empty'"
 * @generated
 */
public interface Cache extends EObject {
	/**
	 * Returns the value of the '<em><b>Include</b></em>' attribute.
	 * The default value is <code>"all"</code>.
	 * The literals are from the enumeration {@link org.eclipse.emf.teneo.db2m.hbm30.IncludeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Include</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Include</em>' attribute.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.IncludeType
	 * @see #isSetInclude()
	 * @see #unsetInclude()
	 * @see #setInclude(IncludeType)
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getCache_Include()
	 * @model default="all" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='include'"
	 * @generated
	 */
	IncludeType getInclude();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.Cache#getInclude <em>Include</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include</em>' attribute.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.IncludeType
	 * @see #isSetInclude()
	 * @see #unsetInclude()
	 * @see #getInclude()
	 * @generated
	 */
	void setInclude(IncludeType value);

	/**
	 * Unsets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.Cache#getInclude <em>Include</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetInclude()
	 * @see #getInclude()
	 * @see #setInclude(IncludeType)
	 * @generated
	 */
	void unsetInclude();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.Cache#getInclude <em>Include</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Include</em>' attribute is set.
	 * @see #unsetInclude()
	 * @see #getInclude()
	 * @see #setInclude(IncludeType)
	 * @generated
	 */
	boolean isSetInclude();

	/**
	 * Returns the value of the '<em><b>Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Region</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Region</em>' attribute.
	 * @see #setRegion(String)
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getCache_Region()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='region'"
	 * @generated
	 */
	String getRegion();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.Cache#getRegion <em>Region</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Region</em>' attribute.
	 * @see #getRegion()
	 * @generated
	 */
	void setRegion(String value);

	/**
	 * Returns the value of the '<em><b>Usage</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.emf.teneo.db2m.hbm30.UsageType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Usage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usage</em>' attribute.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.UsageType
	 * @see #isSetUsage()
	 * @see #unsetUsage()
	 * @see #setUsage(UsageType)
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getCache_Usage()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='usage'"
	 * @generated
	 */
	UsageType getUsage();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.Cache#getUsage <em>Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usage</em>' attribute.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.UsageType
	 * @see #isSetUsage()
	 * @see #unsetUsage()
	 * @see #getUsage()
	 * @generated
	 */
	void setUsage(UsageType value);

	/**
	 * Unsets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.Cache#getUsage <em>Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUsage()
	 * @see #getUsage()
	 * @see #setUsage(UsageType)
	 * @generated
	 */
	void unsetUsage();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.Cache#getUsage <em>Usage</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Usage</em>' attribute is set.
	 * @see #unsetUsage()
	 * @see #getUsage()
	 * @see #setUsage(UsageType)
	 * @generated
	 */
	boolean isSetUsage();

} // Cache

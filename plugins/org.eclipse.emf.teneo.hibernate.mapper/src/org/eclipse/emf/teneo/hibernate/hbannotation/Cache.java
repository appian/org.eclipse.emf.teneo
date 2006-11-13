/**
 * <copyright>
 * </copyright>
 *
 * $Id: Cache.java,v 1.2 2006/11/13 14:53:00 mtaal Exp $
 */
package org.eclipse.emf.teneo.hibernate.hbannotation;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Cache</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.emf.teneo.hibernate.hbannotation.Cache#getUsage <em>Usage</em>}</li>
 * <li>{@link org.eclipse.emf.teneo.hibernate.hbannotation.Cache#getRegion <em>Region</em>}</li>
 * <li>{@link org.eclipse.emf.teneo.hibernate.hbannotation.Cache#getInclude <em>Include</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.emf.teneo.hibernate.hbannotation.HbAnnotationPackage#getCache()
 * @model annotation="http://annotation.elver.org/internal/Target 0='EReference' 1='EClass'"
 * @generated
 */
public interface Cache extends HbAnnotation {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String copyright = "Copyright (c) 2005, 2006 Springsite BV (The Netherlands) and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public\nLicense v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n   Martin Taal\n   Douglas Bitting\n";

	/**
	 * Returns the value of the '<em><b>Usage</b></em>' attribute. The literals are from the enumeration
	 * {@link org.eclipse.emf.teneo.hibernate.hbannotation.CacheConcurrencyStrategy}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Usage</em>' attribute isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Usage</em>' attribute.
	 * @see org.eclipse.emf.teneo.hibernate.hbannotation.CacheConcurrencyStrategy
	 * @see #setUsage(CacheConcurrencyStrategy)
	 * @see org.eclipse.emf.teneo.hibernate.hbannotation.HbAnnotationPackage#getCache_Usage()
	 * @model
	 * @generated
	 */
	CacheConcurrencyStrategy getUsage();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.hibernate.hbannotation.Cache#getUsage <em>Usage</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Usage</em>' attribute.
	 * @see org.eclipse.emf.teneo.hibernate.hbannotation.CacheConcurrencyStrategy
	 * @see #getUsage()
	 * @generated
	 */
	void setUsage(CacheConcurrencyStrategy value);

	/**
	 * Returns the value of the '<em><b>Region</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Region</em>' attribute isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Region</em>' attribute.
	 * @see #setRegion(String)
	 * @see org.eclipse.emf.teneo.hibernate.hbannotation.HbAnnotationPackage#getCache_Region()
	 * @model
	 * @generated
	 */
	String getRegion();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.hibernate.hbannotation.Cache#getRegion <em>Region</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Region</em>' attribute.
	 * @see #getRegion()
	 * @generated
	 */
	void setRegion(String value);

	/**
	 * Returns the value of the '<em><b>Include</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Include</em>' attribute isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Include</em>' attribute.
	 * @see #setInclude(String)
	 * @see org.eclipse.emf.teneo.hibernate.hbannotation.HbAnnotationPackage#getCache_Include()
	 * @model
	 * @generated
	 */
	String getInclude();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.hibernate.hbannotation.Cache#getInclude <em>Include</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Include</em>' attribute.
	 * @see #getInclude()
	 * @generated
	 */
	void setInclude(String value);

} // Cache

/**
 * <copyright>
 * </copyright>
 *
 * $Id: Proxy.java,v 1.1 2007/03/29 15:00:46 mtaal Exp $
 */
package org.eclipse.emf.teneo.hibernate.hbannotation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Proxy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.hibernate.hbannotation.Proxy#getProxyClass <em>Proxy Class</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.hibernate.hbannotation.Proxy#getLazy <em>Lazy</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.hibernate.hbannotation.HbAnnotationPackage#getProxy()
 * @model annotation="http://annotation.elver.org/internal/Target 0='EClass'"
 * @generated
 */
public interface Proxy extends HbAnnotation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2005, 2006, 2007 Springsite BV (The Netherlands) and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public\nLicense v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n   Martin Taal\n   Douglas Bitting\n";

	/**
	 * Returns the value of the '<em><b>Proxy Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Proxy Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Proxy Class</em>' attribute.
	 * @see #setProxyClass(String)
	 * @see org.eclipse.emf.teneo.hibernate.hbannotation.HbAnnotationPackage#getProxy_ProxyClass()
	 * @model
	 * @generated
	 */
	String getProxyClass();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.hibernate.hbannotation.Proxy#getProxyClass <em>Proxy Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Proxy Class</em>' attribute.
	 * @see #getProxyClass()
	 * @generated
	 */
	void setProxyClass(String value);

	/**
	 * Returns the value of the '<em><b>Lazy</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lazy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lazy</em>' attribute.
	 * @see #setLazy(Boolean)
	 * @see org.eclipse.emf.teneo.hibernate.hbannotation.HbAnnotationPackage#getProxy_Lazy()
	 * @model default="true"
	 * @generated
	 */
	Boolean getLazy();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.hibernate.hbannotation.Proxy#getLazy <em>Lazy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lazy</em>' attribute.
	 * @see #getLazy()
	 * @generated
	 */
	void setLazy(Boolean value);

} // Proxy

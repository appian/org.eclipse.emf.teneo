/**
 * <copyright>
 * </copyright>
 *
 * $Id: HbAnnotatedEReference.java,v 1.4 2007/01/30 10:51:48 mtaal Exp $
 */
package org.eclipse.emf.teneo.hibernate.hbmodel;

import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEReference;
import org.eclipse.emf.teneo.hibernate.hbannotation.Cache;
import org.eclipse.emf.teneo.hibernate.hbannotation.Fetch;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Hb Annotated EReference</b></em>'. <!--
 * end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.hibernate.hbmodel.HbAnnotatedEReference#getHbCache <em>Hb Cache</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.hibernate.hbmodel.HbAnnotatedEReference#getHbFetch <em>Hb Fetch</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.hibernate.hbmodel.HbModelPackage#getHbAnnotatedEReference()
 * @model
 * @generated
 */
public interface HbAnnotatedEReference extends PAnnotatedEReference, HbAnnotatedETypeElement {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2005, 2006 Springsite BV (The Netherlands) and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public\nLicense v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n   Martin Taal\n   Douglas Bitting\n";

	/**
	 * Returns the value of the '<em><b>Hb Cache</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hb Cache</em>' containment reference isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hb Cache</em>' containment reference.
	 * @see #setHbCache(Cache)
	 * @see org.eclipse.emf.teneo.hibernate.hbmodel.HbModelPackage#getHbAnnotatedEReference_HbCache()
	 * @model containment="true"
	 * @generated
	 */
	Cache getHbCache();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.hibernate.hbmodel.HbAnnotatedEReference#getHbCache <em>Hb Cache</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hb Cache</em>' containment reference.
	 * @see #getHbCache()
	 * @generated
	 */
	void setHbCache(Cache value);

	/**
	 * Returns the value of the '<em><b>Hb Fetch</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hb Fetch</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hb Fetch</em>' reference.
	 * @see #setHbFetch(Fetch)
	 * @see org.eclipse.emf.teneo.hibernate.hbmodel.HbModelPackage#getHbAnnotatedEReference_HbFetch()
	 * @model
	 * @generated
	 */
	Fetch getHbFetch();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.hibernate.hbmodel.HbAnnotatedEReference#getHbFetch <em>Hb Fetch</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hb Fetch</em>' reference.
	 * @see #getHbFetch()
	 * @generated
	 */
	void setHbFetch(Fetch value);

} // HbAnnotatedEReference

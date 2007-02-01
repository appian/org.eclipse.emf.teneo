/**
 * <copyright>
 * </copyright>
 *
 * $Id: Where.java,v 1.4 2007/02/01 12:35:55 mtaal Exp $
 */
package org.eclipse.emf.teneo.hibernate.hbannotation;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Where</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.hibernate.hbannotation.Where#getClause <em>Clause</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.hibernate.hbannotation.HbAnnotationPackage#getWhere()
 * @model annotation="http://annotation.elver.org/internal/Target 0='EStructuralFeature'"
 * @generated
 */
public interface Where extends HbAnnotation {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2005, 2006, 2007 Springsite BV (The Netherlands) and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public\nLicense v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n   Martin Taal\n   Douglas Bitting\n";

	/**
	 * Returns the value of the '<em><b>Clause</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clause</em>' attribute isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clause</em>' attribute.
	 * @see #setClause(String)
	 * @see org.eclipse.emf.teneo.hibernate.hbannotation.HbAnnotationPackage#getWhere_Clause()
	 * @model
	 * @generated
	 */
	String getClause();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.hibernate.hbannotation.Where#getClause <em>Clause</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clause</em>' attribute.
	 * @see #getClause()
	 * @generated
	 */
	void setClause(String value);

} // Where

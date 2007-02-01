/**
 * <copyright>
 * </copyright>
 *
 * $Id: TypeDef.java,v 1.3 2007/02/01 12:35:55 mtaal Exp $
 */
package org.eclipse.emf.teneo.hibernate.hbannotation;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Type Def</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.hibernate.hbannotation.TypeDef#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.hibernate.hbannotation.TypeDef#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.hibernate.hbannotation.TypeDef#getTypeClass <em>Type Class</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.hibernate.hbannotation.HbAnnotationPackage#getTypeDef()
 * @model annotation="http://annotation.elver.org/internal/Target 0='EStructuralFeature' 1='EClass' 2='EPackage'"
 * @generated
 */
public interface TypeDef extends HbAnnotation {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2005, 2006, 2007 Springsite BV (The Netherlands) and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public\nLicense v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n   Martin Taal\n   Douglas Bitting\n";

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.emf.teneo.hibernate.hbannotation.HbAnnotationPackage#getTypeDef_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.hibernate.hbannotation.TypeDef#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.hibernate.hbannotation.Parameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' reference list isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' reference list.
	 * @see org.eclipse.emf.teneo.hibernate.hbannotation.HbAnnotationPackage#getTypeDef_Parameters()
	 * @model type="org.eclipse.emf.teneo.hibernate.hbannotation.Parameter"
	 * @generated
	 */
	EList getParameters();

	/**
	 * Returns the value of the '<em><b>Type Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Class</em>' attribute isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Class</em>' attribute.
	 * @see #setTypeClass(String)
	 * @see org.eclipse.emf.teneo.hibernate.hbannotation.HbAnnotationPackage#getTypeDef_TypeClass()
	 * @model required="true"
	 * @generated
	 */
	String getTypeClass();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.hibernate.hbannotation.TypeDef#getTypeClass <em>Type Class</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Class</em>' attribute.
	 * @see #getTypeClass()
	 * @generated
	 */
	void setTypeClass(String value);

} // TypeDef

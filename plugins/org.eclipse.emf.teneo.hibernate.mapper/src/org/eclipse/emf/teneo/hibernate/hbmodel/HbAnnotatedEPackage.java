/**
 * <copyright>
 * </copyright>
 *
 * $Id: HbAnnotatedEPackage.java,v 1.4 2007/02/01 12:35:55 mtaal Exp $
 */
package org.eclipse.emf.teneo.hibernate.hbmodel;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEPackage;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Hb Annotated EPackage</b></em>'. <!--
 * end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.hibernate.hbmodel.HbAnnotatedEPackage#getHbGenericGenerators <em>Hb Generic Generators</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.hibernate.hbmodel.HbAnnotatedEPackage#getHbTypeDef <em>Hb Type Def</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.hibernate.hbmodel.HbModelPackage#getHbAnnotatedEPackage()
 * @model
 * @generated
 */
public interface HbAnnotatedEPackage extends PAnnotatedEPackage {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2005, 2006, 2007 Springsite BV (The Netherlands) and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public\nLicense v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n   Martin Taal\n   Douglas Bitting\n";

	/**
	 * Returns the value of the '<em><b>Hb Generic Generators</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.hibernate.hbannotation.GenericGenerator}.
	 * <!-- begin-user-doc
	 * -->
	 * <p>
	 * If the meaning of the '<em>Hb Generic Generators</em>' containment reference isn't clear, there really should
	 * be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hb Generic Generators</em>' containment reference list.
	 * @see org.eclipse.emf.teneo.hibernate.hbmodel.HbModelPackage#getHbAnnotatedEPackage_HbGenericGenerators()
	 * @model type="org.eclipse.emf.teneo.hibernate.hbannotation.GenericGenerator" containment="true"
	 * @generated
	 */
	EList getHbGenericGenerators();

	/**
	 * Returns the value of the '<em><b>Hb Type Def</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.hibernate.hbannotation.TypeDef}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hb Type Def</em>' containment reference list isn't clear, there really should be
	 * more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hb Type Def</em>' containment reference list.
	 * @see org.eclipse.emf.teneo.hibernate.hbmodel.HbModelPackage#getHbAnnotatedEPackage_HbTypeDef()
	 * @model type="org.eclipse.emf.teneo.hibernate.hbannotation.TypeDef" containment="true"
	 * @generated
	 */
	EList getHbTypeDef();

} // HbAnnotatedEPackage

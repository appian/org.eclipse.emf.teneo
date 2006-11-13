/**
 * <copyright>
 * </copyright>
 *
 * $Id: HbAnnotatedEDataType.java,v 1.2 2006/11/13 14:53:00 mtaal Exp $
 */
package org.eclipse.emf.teneo.hibernate.hbmodel;

import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEDataType;
import org.eclipse.emf.teneo.hibernate.hbannotation.TypeDef;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Hb Annotated EData Type</b></em>'. <!--
 * end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.emf.teneo.hibernate.hbmodel.HbAnnotatedEDataType#getHbTypeDef <em>Hb Type Def</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.emf.teneo.hibernate.hbmodel.HbModelPackage#getHbAnnotatedEDataType()
 * @model
 * @generated
 */
public interface HbAnnotatedEDataType extends PAnnotatedEDataType, HbAnnotatedETypeElement {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String copyright = "Copyright (c) 2005, 2006 Springsite BV (The Netherlands) and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public\nLicense v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n   Martin Taal\n   Douglas Bitting\n";

	/**
	 * Returns the value of the '<em><b>Hb Type Def</b></em>' containment reference. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hb Type Def</em>' containment reference list isn't clear, there really should be
	 * more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Hb Type Def</em>' containment reference.
	 * @see #setHbTypeDef(TypeDef)
	 * @see org.eclipse.emf.teneo.hibernate.hbmodel.HbModelPackage#getHbAnnotatedEDataType_HbTypeDef()
	 * @model containment="true"
	 * @generated
	 */
	TypeDef getHbTypeDef();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.hibernate.hbmodel.HbAnnotatedEDataType#getHbTypeDef <em>Hb Type Def</em>}'
	 * containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Hb Type Def</em>' containment reference.
	 * @see #getHbTypeDef()
	 * @generated
	 */
	void setHbTypeDef(TypeDef value);

} // HbAnnotatedEDataType

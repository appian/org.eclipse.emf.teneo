/**
 * <copyright>
 * </copyright>
 *
 * $Id: Enumerated.java,v 1.4 2007/02/01 12:35:01 mtaal Exp $
 */
package org.eclipse.emf.teneo.annotations.pannotation;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Enumerated</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.annotations.pannotation.Enumerated#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.annotations.pannotation.PannotationPackage#getEnumerated()
 * @model annotation="teneo/internal/Target 0='EStructuralFeature'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='AllowedElementType'"
 * @generated
 */
public interface Enumerated extends PAnnotation {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2005, 2006, 2007 Springsite BV (The Netherlands) and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public\nLicense v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n   Martin Taal\n   Davide Marchignoli\n";

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute. The default value is <code>"ORDINAL"</code>.
	 * The literals are from the enumeration {@link org.eclipse.emf.teneo.annotations.pannotation.EnumType}. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.EnumType
	 * @see #setValue(EnumType)
	 * @see org.eclipse.emf.teneo.annotations.pannotation.PannotationPackage#getEnumerated_Value()
	 * @model default="ORDINAL"
	 * @generated
	 */
	EnumType getValue();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.annotations.pannotation.Enumerated#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.EnumType
	 * @see #getValue()
	 * @generated
	 */
	void setValue(EnumType value);

} // Enumerated

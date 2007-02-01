/**
 * <copyright>
 * </copyright>
 *
 * $Id: Temporal.java,v 1.4 2007/02/01 12:35:00 mtaal Exp $
 */
package org.eclipse.emf.teneo.annotations.pannotation;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Temporal</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.annotations.pannotation.Temporal#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.annotations.pannotation.PannotationPackage#getTemporal()
 * @model annotation="teneo/internal/Target 0='EAttribute'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='AllowedElementType'"
 * @generated
 */
public interface Temporal extends PAnnotation {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2005, 2006, 2007 Springsite BV (The Netherlands) and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public\nLicense v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n   Martin Taal\n   Davide Marchignoli\n";

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute. The default value is <code>"TIMESTAMP"</code>.
	 * The literals are from the enumeration {@link org.eclipse.emf.teneo.annotations.pannotation.TemporalType}. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.TemporalType
	 * @see #setValue(TemporalType)
	 * @see org.eclipse.emf.teneo.annotations.pannotation.PannotationPackage#getTemporal_Value()
	 * @model default="TIMESTAMP"
	 * @generated
	 */
	TemporalType getValue();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.annotations.pannotation.Temporal#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.TemporalType
	 * @see #getValue()
	 * @generated
	 */
	void setValue(TemporalType value);

} // Temporal

/**
 * <copyright>
 * </copyright>
 *
 * $Id: Inheritance.java,v 1.3 2007/02/01 12:35:01 mtaal Exp $
 */
package org.eclipse.emf.teneo.annotations.pannotation;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Inheritance</b></em>'. <!-- end-user-doc
 * -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.emf.teneo.annotations.pannotation.Inheritance#getStrategy <em>Strategy</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.emf.teneo.annotations.pannotation.PannotationPackage#getInheritance()
 * @model annotation="http://annotation.elver.org/internal/Target 0='EClass'"
 * @generated
 */
public interface Inheritance extends PAnnotation{
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2005, 2006, 2007 Springsite BV (The Netherlands) and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public\nLicense v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n   Martin Taal\n   Davide Marchignoli\n";

	/**
	 * Returns the value of the '<em><b>Strategy</b></em>' attribute.
	 * The default value is <code>"SINGLE_TABLE"</code>.
	 * The literals are from the enumeration {@link org.eclipse.emf.teneo.annotations.pannotation.InheritanceType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Strategy</em>' attribute isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Strategy</em>' attribute.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.InheritanceType
	 * @see #setStrategy(InheritanceType)
	 * @see org.eclipse.emf.teneo.annotations.pannotation.PannotationPackage#getInheritance_Strategy()
	 * @model default="SINGLE_TABLE"
	 * @generated
	 */
	InheritanceType getStrategy();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.annotations.pannotation.Inheritance#getStrategy <em>Strategy</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strategy</em>' attribute.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.InheritanceType
	 * @see #getStrategy()
	 * @generated
	 */
	void setStrategy(InheritanceType value);

} // Inheritance

/**
 * <copyright>
 * </copyright>
 *
 * $Id: GeneratedValue.java,v 1.4 2007/02/01 12:35:00 mtaal Exp $
 */
package org.eclipse.emf.teneo.annotations.pannotation;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Generated Value</b></em>'. <!--
 * end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.annotations.pannotation.GeneratedValue#getStrategy <em>Strategy</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.annotations.pannotation.GeneratedValue#getGenerator <em>Generator</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.annotations.pannotation.PannotationPackage#getGeneratedValue()
 * @model annotation="teneo/internal/Target 0='EAttribute'"
 * @generated
 */
public interface GeneratedValue extends PAnnotation {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2005, 2006, 2007 Springsite BV (The Netherlands) and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public\nLicense v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n   Martin Taal\n   Davide Marchignoli\n";

	/**
	 * Returns the value of the '<em><b>Strategy</b></em>' attribute. The default value is <code>"AUTO"</code>.
	 * The literals are from the enumeration {@link org.eclipse.emf.teneo.annotations.pannotation.GenerationType}. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Strategy</em>' attribute isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Strategy</em>' attribute.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.GenerationType
	 * @see #setStrategy(GenerationType)
	 * @see org.eclipse.emf.teneo.annotations.pannotation.PannotationPackage#getGeneratedValue_Strategy()
	 * @model default="AUTO"
	 * @generated
	 */
	GenerationType getStrategy();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.annotations.pannotation.GeneratedValue#getStrategy <em>Strategy</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strategy</em>' attribute.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.GenerationType
	 * @see #getStrategy()
	 * @generated
	 */
	void setStrategy(GenerationType value);

	/**
	 * Returns the value of the '<em><b>Generator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generator</em>' attribute isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generator</em>' attribute.
	 * @see #setGenerator(String)
	 * @see org.eclipse.emf.teneo.annotations.pannotation.PannotationPackage#getGeneratedValue_Generator()
	 * @model
	 * @generated
	 */
	String getGenerator();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.annotations.pannotation.GeneratedValue#getGenerator <em>Generator</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generator</em>' attribute.
	 * @see #getGenerator()
	 * @generated
	 */
	void setGenerator(String value);

} // GeneratedValue

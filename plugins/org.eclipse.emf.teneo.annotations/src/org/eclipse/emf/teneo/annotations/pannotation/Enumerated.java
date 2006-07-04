/**
 * <copyright>
 * </copyright>
 *
 * $Id: Enumerated.java,v 1.1 2006/07/04 21:37:01 mtaal Exp $
 */
package org.eclipse.emf.teneo.annotations.pannotation;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Enumerated</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.emf.teneo.annotations.pannotation.Enumerated#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.emf.teneo.annotations.pannotation.PannotationPackage#getEnumerated()
 * @model annotation="http://annotation.elver.org/internal/Target 0='EStructuralFeature'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='AllowedElementType'"
 * @generated
 */
public interface Enumerated extends PAnnotation {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String copyright = "Copyright 2004-2006, Elver.org (http://www.eclipse.org/emf/teneo).\nLicensed under the Apache License, Version 2.0 (the \"License\");\n\nyou may not use this file except in compliance with the License.\nYou may obtain a copy of the License at\nhttp://www.apache.org/licenses/LICENSE-2.0\nUnless required by applicable law or agreed to in writing, software\ndistributed under the License is distributed on an \"AS IS\" BASIS,\nWITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.\nSee the License for the specific language governing permissions and\nlimitations under the License.";

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
	 * Sets the value of the '{@link org.eclipse.emf.teneo.annotations.pannotation.Enumerated#getValue <em>Value</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Value</em>' attribute.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.EnumType
	 * @see #getValue()
	 * @generated
	 */
	void setValue(EnumType value);

} // Enumerated

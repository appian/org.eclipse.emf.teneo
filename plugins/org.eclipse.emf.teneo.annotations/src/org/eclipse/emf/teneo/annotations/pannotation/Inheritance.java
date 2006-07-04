/**
 * <copyright>
 * </copyright>
 *
 * $Id: Inheritance.java,v 1.1 2006/07/04 21:37:01 mtaal Exp $
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
public interface Inheritance extends PAnnotation {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String copyright = "Copyright 2004-2006, Elver.org (http://www.eclipse.org/emf/teneo).\nLicensed under the Apache License, Version 2.0 (the \"License\");\n\nyou may not use this file except in compliance with the License.\nYou may obtain a copy of the License at\nhttp://www.apache.org/licenses/LICENSE-2.0\nUnless required by applicable law or agreed to in writing, software\ndistributed under the License is distributed on an \"AS IS\" BASIS,\nWITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.\nSee the License for the specific language governing permissions and\nlimitations under the License.";

	/**
	 * Returns the value of the '<em><b>Strategy</b></em>' attribute. The default value is
	 * <code>"SINGLE_TABLE"</code>. The literals are from the enumeration
	 * {@link org.eclipse.emf.teneo.annotations.pannotation.InheritanceType}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Strategy</em>' attribute isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Strategy</em>' attribute.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.InheritanceType
	 * @see #setStrategy(InheritanceType)
	 * @see org.eclipse.emf.teneo.annotations.pannotation.PannotationPackage#getInheritance_Strategy()
	 * @model default="SINGLE_TABLE"
	 * @generated
	 */
	InheritanceType getStrategy();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.annotations.pannotation.Inheritance#getStrategy <em>Strategy</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Strategy</em>' attribute.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.InheritanceType
	 * @see #getStrategy()
	 * @generated
	 */
	void setStrategy(InheritanceType value);

} // Inheritance

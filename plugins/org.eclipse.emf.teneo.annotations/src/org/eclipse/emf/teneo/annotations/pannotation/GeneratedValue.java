/**
 * <copyright>
 * </copyright>
 *
 * $Id: GeneratedValue.java,v 1.1 2006/07/04 21:37:01 mtaal Exp $
 */
package org.eclipse.emf.teneo.annotations.pannotation;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Generated Value</b></em>'. <!--
 * end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.emf.teneo.annotations.pannotation.GeneratedValue#getStrategy <em>Strategy</em>}</li>
 * <li>{@link org.eclipse.emf.teneo.annotations.pannotation.GeneratedValue#getGenerator <em>Generator</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.emf.teneo.annotations.pannotation.PannotationPackage#getGeneratedValue()
 * @model annotation="http://annotation.elver.org/internal/Target 0='EAttribute'"
 * @generated
 */
public interface GeneratedValue extends PAnnotation {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String copyright = "Copyright 2004-2006, Elver.org (http://www.eclipse.org/emf/teneo).\nLicensed under the Apache License, Version 2.0 (the \"License\");\n\nyou may not use this file except in compliance with the License.\nYou may obtain a copy of the License at\nhttp://www.apache.org/licenses/LICENSE-2.0\nUnless required by applicable law or agreed to in writing, software\ndistributed under the License is distributed on an \"AS IS\" BASIS,\nWITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.\nSee the License for the specific language governing permissions and\nlimitations under the License.";

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
	 * Sets the value of the '{@link org.eclipse.emf.teneo.annotations.pannotation.GeneratedValue#getStrategy <em>Strategy</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Strategy</em>' attribute.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.GenerationType
	 * @see #getStrategy()
	 * @generated
	 */
	void setStrategy(GenerationType value);

	/**
	 * Returns the value of the '<em><b>Generator</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generator</em>' attribute isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Generator</em>' attribute.
	 * @see #setGenerator(String)
	 * @see org.eclipse.emf.teneo.annotations.pannotation.PannotationPackage#getGeneratedValue_Generator()
	 * @model
	 * @generated
	 */
	String getGenerator();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.annotations.pannotation.GeneratedValue#getGenerator <em>Generator</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Generator</em>' attribute.
	 * @see #getGenerator()
	 * @generated
	 */
	void setGenerator(String value);

} // GeneratedValue

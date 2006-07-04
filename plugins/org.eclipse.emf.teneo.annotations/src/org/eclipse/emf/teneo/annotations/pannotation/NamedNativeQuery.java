/**
 * <copyright>
 * </copyright>
 *
 * $Id: NamedNativeQuery.java,v 1.1 2006/07/04 21:37:00 mtaal Exp $
 */
package org.eclipse.emf.teneo.annotations.pannotation;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Named Native Query</b></em>'. <!--
 * end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.emf.teneo.annotations.pannotation.NamedNativeQuery#getName <em>Name</em>}</li>
 * <li>{@link org.eclipse.emf.teneo.annotations.pannotation.NamedNativeQuery#getQuery <em>Query</em>}</li>
 * <li>{@link org.eclipse.emf.teneo.annotations.pannotation.NamedNativeQuery#getHints <em>Hints</em>}</li>
 * <li>{@link org.eclipse.emf.teneo.annotations.pannotation.NamedNativeQuery#getResultClass <em>Result Class</em>}</li>
 * <li>{@link org.eclipse.emf.teneo.annotations.pannotation.NamedNativeQuery#getResultSetMapping <em>Result Set Mapping</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.emf.teneo.annotations.pannotation.PannotationPackage#getNamedNativeQuery()
 * @model annotation="http://annotation.elver.org/internal/Target 0='EClass' 1='EPackage'"
 * @generated
 */
public interface NamedNativeQuery extends PAnnotation {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String copyright = "Copyright 2004-2006, Elver.org (http://www.eclipse.org/emf/teneo).\nLicensed under the Apache License, Version 2.0 (the \"License\");\n\nyou may not use this file except in compliance with the License.\nYou may obtain a copy of the License at\nhttp://www.apache.org/licenses/LICENSE-2.0\nUnless required by applicable law or agreed to in writing, software\ndistributed under the License is distributed on an \"AS IS\" BASIS,\nWITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.\nSee the License for the specific language governing permissions and\nlimitations under the License.";

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.emf.teneo.annotations.pannotation.PannotationPackage#getNamedNativeQuery_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.annotations.pannotation.NamedNativeQuery#getName <em>Name</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Query</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Query</em>' attribute isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Query</em>' attribute.
	 * @see #setQuery(String)
	 * @see org.eclipse.emf.teneo.annotations.pannotation.PannotationPackage#getNamedNativeQuery_Query()
	 * @model required="true"
	 * @generated
	 */
	String getQuery();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.annotations.pannotation.NamedNativeQuery#getQuery <em>Query</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Query</em>' attribute.
	 * @see #getQuery()
	 * @generated
	 */
	void setQuery(String value);

	/**
	 * Returns the value of the '<em><b>Hints</b></em>' containment reference list. The list contents are of type
	 * {@link org.eclipse.emf.teneo.annotations.pannotation.QueryHint}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hints</em>' containment reference list isn't clear, there really should be more of
	 * a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Hints</em>' containment reference list.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.PannotationPackage#getNamedNativeQuery_Hints()
	 * @model type="org.eclipse.emf.teneo.annotations.pannotation.QueryHint" containment="true"
	 * @generated
	 */
	EList getHints();

	/**
	 * Returns the value of the '<em><b>Result Class</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Result Class</em>' attribute isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Result Class</em>' attribute.
	 * @see #setResultClass(String)
	 * @see org.eclipse.emf.teneo.annotations.pannotation.PannotationPackage#getNamedNativeQuery_ResultClass()
	 * @model
	 * @generated
	 */
	String getResultClass();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.annotations.pannotation.NamedNativeQuery#getResultClass <em>Result Class</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Result Class</em>' attribute.
	 * @see #getResultClass()
	 * @generated
	 */
	void setResultClass(String value);

	/**
	 * Returns the value of the '<em><b>Result Set Mapping</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Result Set Mapping</em>' attribute isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Result Set Mapping</em>' attribute.
	 * @see #setResultSetMapping(String)
	 * @see org.eclipse.emf.teneo.annotations.pannotation.PannotationPackage#getNamedNativeQuery_ResultSetMapping()
	 * @model
	 * @generated
	 */
	String getResultSetMapping();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.annotations.pannotation.NamedNativeQuery#getResultSetMapping <em>Result Set Mapping</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Result Set Mapping</em>' attribute.
	 * @see #getResultSetMapping()
	 * @generated
	 */
	void setResultSetMapping(String value);

} // NamedNativeQuery

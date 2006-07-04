/**
 * <copyright>
 * </copyright>
 *
 * $Id: JoinTable.java,v 1.1 2006/07/04 21:37:01 mtaal Exp $
 */
package org.eclipse.emf.teneo.annotations.pannotation;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Join Table</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.emf.teneo.annotations.pannotation.JoinTable#getName <em>Name</em>}</li>
 * <li>{@link org.eclipse.emf.teneo.annotations.pannotation.JoinTable#getCatalog <em>Catalog</em>}</li>
 * <li>{@link org.eclipse.emf.teneo.annotations.pannotation.JoinTable#getSchema <em>Schema</em>}</li>
 * <li>{@link org.eclipse.emf.teneo.annotations.pannotation.JoinTable#getJoinColumns <em>Join Columns</em>}</li>
 * <li>{@link org.eclipse.emf.teneo.annotations.pannotation.JoinTable#getInverseJoinColumns <em>Inverse Join Columns</em>}</li>
 * <li>{@link org.eclipse.emf.teneo.annotations.pannotation.JoinTable#getUniqueConstraints <em>Unique Constraints</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.emf.teneo.annotations.pannotation.PannotationPackage#getJoinTable()
 * @model annotation="http://annotation.elver.org/internal/Target 0='EStructuralFeature'"
 * @generated
 */
public interface JoinTable extends PAnnotation {
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
	 * @see org.eclipse.emf.teneo.annotations.pannotation.PannotationPackage#getJoinTable_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.annotations.pannotation.JoinTable#getName <em>Name</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Catalog</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Catalog</em>' attribute isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Catalog</em>' attribute.
	 * @see #setCatalog(String)
	 * @see org.eclipse.emf.teneo.annotations.pannotation.PannotationPackage#getJoinTable_Catalog()
	 * @model
	 * @generated
	 */
	String getCatalog();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.annotations.pannotation.JoinTable#getCatalog <em>Catalog</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Catalog</em>' attribute.
	 * @see #getCatalog()
	 * @generated
	 */
	void setCatalog(String value);

	/**
	 * Returns the value of the '<em><b>Schema</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schema</em>' attribute isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Schema</em>' attribute.
	 * @see #setSchema(String)
	 * @see org.eclipse.emf.teneo.annotations.pannotation.PannotationPackage#getJoinTable_Schema()
	 * @model
	 * @generated
	 */
	String getSchema();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.annotations.pannotation.JoinTable#getSchema <em>Schema</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Schema</em>' attribute.
	 * @see #getSchema()
	 * @generated
	 */
	void setSchema(String value);

	/**
	 * Returns the value of the '<em><b>Join Columns</b></em>' containment reference list. The list contents are of
	 * type {@link org.eclipse.emf.teneo.annotations.pannotation.JoinColumn}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Join Columns</em>' containment reference list isn't clear, there really should be
	 * more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Join Columns</em>' containment reference list.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.PannotationPackage#getJoinTable_JoinColumns()
	 * @model type="org.eclipse.emf.teneo.annotations.pannotation.JoinColumn" containment="true"
	 * @generated
	 */
	EList getJoinColumns();

	/**
	 * Returns the value of the '<em><b>Inverse Join Columns</b></em>' containment reference list. The list
	 * contents are of type {@link org.eclipse.emf.teneo.annotations.pannotation.JoinColumn}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inverse Join Columns</em>' containment reference list isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Inverse Join Columns</em>' containment reference list.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.PannotationPackage#getJoinTable_InverseJoinColumns()
	 * @model type="org.eclipse.emf.teneo.annotations.pannotation.JoinColumn" containment="true"
	 * @generated
	 */
	EList getInverseJoinColumns();

	/**
	 * Returns the value of the '<em><b>Unique Constraints</b></em>' containment reference list. The list contents
	 * are of type {@link org.eclipse.emf.teneo.annotations.pannotation.UniqueConstraint}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unique Constraints</em>' containment reference list isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Unique Constraints</em>' containment reference list.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.PannotationPackage#getJoinTable_UniqueConstraints()
	 * @model type="org.eclipse.emf.teneo.annotations.pannotation.UniqueConstraint" containment="true"
	 * @generated
	 */
	EList getUniqueConstraints();

} // JoinTable

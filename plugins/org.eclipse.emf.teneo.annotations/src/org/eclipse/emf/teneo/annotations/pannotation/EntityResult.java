/**
 * <copyright>
 * </copyright>
 *
 * $Id: EntityResult.java,v 1.1 2006/07/04 21:37:00 mtaal Exp $
 */
package org.eclipse.emf.teneo.annotations.pannotation;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Entity Result</b></em>'. <!-- end-user-doc
 * -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.emf.teneo.annotations.pannotation.EntityResult#getEntityClass <em>Entity Class</em>}</li>
 * <li>{@link org.eclipse.emf.teneo.annotations.pannotation.EntityResult#getFields <em>Fields</em>}</li>
 * <li>{@link org.eclipse.emf.teneo.annotations.pannotation.EntityResult#getDiscriminatorColumn <em>Discriminator Column</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.emf.teneo.annotations.pannotation.PannotationPackage#getEntityResult()
 * @model
 * @generated
 */
public interface EntityResult extends PAnnotation {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String copyright = "Copyright 2004-2006, Elver.org (http://www.eclipse.org/emf/teneo).\nLicensed under the Apache License, Version 2.0 (the \"License\");\n\nyou may not use this file except in compliance with the License.\nYou may obtain a copy of the License at\nhttp://www.apache.org/licenses/LICENSE-2.0\nUnless required by applicable law or agreed to in writing, software\ndistributed under the License is distributed on an \"AS IS\" BASIS,\nWITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.\nSee the License for the specific language governing permissions and\nlimitations under the License.";

	/**
	 * Returns the value of the '<em><b>Entity Class</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entity Class</em>' attribute isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Entity Class</em>' attribute.
	 * @see #setEntityClass(String)
	 * @see org.eclipse.emf.teneo.annotations.pannotation.PannotationPackage#getEntityResult_EntityClass()
	 * @model required="true"
	 * @generated
	 */
	String getEntityClass();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.annotations.pannotation.EntityResult#getEntityClass <em>Entity Class</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Entity Class</em>' attribute.
	 * @see #getEntityClass()
	 * @generated
	 */
	void setEntityClass(String value);

	/**
	 * Returns the value of the '<em><b>Fields</b></em>' containment reference list. The list contents are of type
	 * {@link org.eclipse.emf.teneo.annotations.pannotation.FieldResult}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fields</em>' containment reference list isn't clear, there really should be more
	 * of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Fields</em>' containment reference list.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.PannotationPackage#getEntityResult_Fields()
	 * @model type="org.eclipse.emf.teneo.annotations.pannotation.FieldResult" containment="true"
	 * @generated
	 */
	EList getFields();

	/**
	 * Returns the value of the '<em><b>Discriminator Column</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Discriminator Column</em>' attribute isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Discriminator Column</em>' attribute.
	 * @see #setDiscriminatorColumn(String)
	 * @see org.eclipse.emf.teneo.annotations.pannotation.PannotationPackage#getEntityResult_DiscriminatorColumn()
	 * @model
	 * @generated
	 */
	String getDiscriminatorColumn();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.annotations.pannotation.EntityResult#getDiscriminatorColumn <em>Discriminator Column</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Discriminator Column</em>' attribute.
	 * @see #getDiscriminatorColumn()
	 * @generated
	 */
	void setDiscriminatorColumn(String value);

} // EntityResult

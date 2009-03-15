/**
 * <copyright>
 * </copyright>
 *
 * $Id: EmbeddableAttributes.java,v 1.1 2009/03/15 23:45:00 mtaal Exp $
 */
package org.eclipse.emf.teneo.jpa.orm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Embeddable Attributes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.jpa.orm.EmbeddableAttributes#getBasic <em>Basic</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.jpa.orm.EmbeddableAttributes#getTransient <em>Transient</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.jpa.orm.OrmPackage#getEmbeddableAttributes()
 * @model extendedMetaData="name='embeddable-attributes' kind='elementOnly'"
 * @generated
 */
public interface EmbeddableAttributes extends EObject {
	/**
	 * Returns the value of the '<em><b>Basic</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.jpa.orm.Basic}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Basic</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Basic</em>' containment reference list.
	 * @see org.eclipse.emf.teneo.jpa.orm.OrmPackage#getEmbeddableAttributes_Basic()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='basic' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Basic> getBasic();

	/**
	 * Returns the value of the '<em><b>Transient</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.jpa.orm.Transient}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transient</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transient</em>' containment reference list.
	 * @see org.eclipse.emf.teneo.jpa.orm.OrmPackage#getEmbeddableAttributes_Transient()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='transient' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Transient> getTransient();

} // EmbeddableAttributes

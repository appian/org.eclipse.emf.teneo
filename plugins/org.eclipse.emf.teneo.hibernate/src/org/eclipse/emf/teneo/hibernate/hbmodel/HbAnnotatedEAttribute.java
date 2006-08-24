/**
 * <copyright>
 * </copyright>
 *
 * $Id: HbAnnotatedEAttribute.java,v 1.1 2006/08/24 22:12:52 mtaal Exp $
 */
package org.eclipse.emf.teneo.hibernate.hbmodel;

import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEAttribute;

import org.eclipse.emf.teneo.hibernate.hbannotation.Type;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hb Annotated EAttribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.hibernate.hbmodel.HbAnnotatedEAttribute#getHbType <em>Hb Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.hibernate.hbmodel.HbModelPackage#getHbAnnotatedEAttribute()
 * @model
 * @generated
 */
public interface HbAnnotatedEAttribute extends PAnnotatedEAttribute, HbAnnotatedEStructuralFeature {
	/**
	 * Returns the value of the '<em><b>Hb Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hb Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hb Type</em>' containment reference.
	 * @see #setHbType(Type)
	 * @see org.eclipse.emf.teneo.hibernate.hbmodel.HbModelPackage#getHbAnnotatedEAttribute_HbType()
	 * @model containment="true"
	 * @generated
	 */
	Type getHbType();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.hibernate.hbmodel.HbAnnotatedEAttribute#getHbType <em>Hb Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hb Type</em>' containment reference.
	 * @see #getHbType()
	 * @generated
	 */
	void setHbType(Type value);

} // HbAnnotatedEAttribute
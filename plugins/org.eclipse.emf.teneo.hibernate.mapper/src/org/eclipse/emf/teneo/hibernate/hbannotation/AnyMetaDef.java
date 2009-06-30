/**
 * <copyright>
 * </copyright>
 *
 * $Id: AnyMetaDef.java,v 1.2.2.2 2009/06/30 07:29:15 mtaal Exp $
 */
package org.eclipse.emf.teneo.hibernate.hbannotation;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Any Meta Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.hibernate.hbannotation.AnyMetaDef#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.hibernate.hbannotation.AnyMetaDef#getMetaType <em>Meta Type</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.hibernate.hbannotation.AnyMetaDef#getIdType <em>Id Type</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.hibernate.hbannotation.AnyMetaDef#getMetaValues <em>Meta Values</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.hibernate.hbannotation.HbannotationPackage#getAnyMetaDef()
 * @model annotation="http://annotation.elver.org/internal/Target 0='EStructuralFeature' 1='EClass' 2='EPackage'"
 * @generated
 */
public interface AnyMetaDef extends HbAnnotation {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.emf.teneo.hibernate.hbannotation.HbannotationPackage#getAnyMetaDef_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.hibernate.hbannotation.AnyMetaDef#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Meta Type</b></em>' attribute.
	 * The default value is <code>"string"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Meta Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meta Type</em>' attribute.
	 * @see #setMetaType(String)
	 * @see org.eclipse.emf.teneo.hibernate.hbannotation.HbannotationPackage#getAnyMetaDef_MetaType()
	 * @model default="string"
	 * @generated
	 */
	String getMetaType();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.hibernate.hbannotation.AnyMetaDef#getMetaType <em>Meta Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meta Type</em>' attribute.
	 * @see #getMetaType()
	 * @generated
	 */
	void setMetaType(String value);

	/**
	 * Returns the value of the '<em><b>Id Type</b></em>' attribute.
	 * The default value is <code>"string"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Type</em>' attribute.
	 * @see #setIdType(String)
	 * @see org.eclipse.emf.teneo.hibernate.hbannotation.HbannotationPackage#getAnyMetaDef_IdType()
	 * @model default="string" required="true"
	 * @generated
	 */
	String getIdType();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.hibernate.hbannotation.AnyMetaDef#getIdType <em>Id Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Type</em>' attribute.
	 * @see #getIdType()
	 * @generated
	 */
	void setIdType(String value);

	/**
	 * Returns the value of the '<em><b>Meta Values</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.hibernate.hbannotation.MetaValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Meta Values</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meta Values</em>' containment reference list.
	 * @see org.eclipse.emf.teneo.hibernate.hbannotation.HbannotationPackage#getAnyMetaDef_MetaValues()
	 * @model containment="true"
	 * @generated
	 */
	EList<MetaValue> getMetaValues();

} // AnyMetaDef

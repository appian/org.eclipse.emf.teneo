/**
 * <copyright>
 * </copyright>
 *
 * $Id: Any.java,v 1.1 2009/06/27 09:19:10 mtaal Exp $
 */
package org.eclipse.emf.teneo.hibernate.hbannotation;

import org.eclipse.emf.teneo.annotations.pannotation.Column;
import org.eclipse.emf.teneo.annotations.pannotation.FetchType;

/**
 * <!-- begin-user-doc --> A representation of the model object ' <em><b>Any</b></em>'. <!--
 * end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.hibernate.hbannotation.Any#getMetaDef <em>Meta Def</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.hibernate.hbannotation.Any#getMetaColumn <em>Meta Column</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.hibernate.hbannotation.Any#getFetch <em>Fetch</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.hibernate.hbannotation.Any#isOptional <em>Optional</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.hibernate.hbannotation.HbannotationPackage#getAny()
 * @model annotation="http://annotation.elver.org/internal/Target 0='EStructuralFeature'"
 * @generated
 */
public interface Any extends HbAnnotation {
	/**
	 * Returns the value of the '<em><b>Meta Def</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Meta Def</em>' attribute isn't clear, there really should be more of
	 * a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meta Def</em>' attribute.
	 * @see #setMetaDef(String)
	 * @see org.eclipse.emf.teneo.hibernate.hbannotation.HbannotationPackage#getAny_MetaDef()
	 * @model
	 * @generated
	 */
	String getMetaDef();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.hibernate.hbannotation.Any#getMetaDef <em>Meta Def</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meta Def</em>' attribute.
	 * @see #getMetaDef()
	 * @generated
	 */
	void setMetaDef(String value);

	/**
	 * Returns the value of the '<em><b>Meta Column</b></em>' containment reference. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Meta Column</em>' containment reference isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Meta Column</em>' containment reference.
	 * @see #setMetaColumn(Column)
	 * @see org.eclipse.emf.teneo.hibernate.hbannotation.HbannotationPackage#getAny_MetaColumn()
	 * @model containment="true"
	 * @generated
	 */
	Column getMetaColumn();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.hibernate.hbannotation.Any#getMetaColumn <em>Meta Column</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meta Column</em>' containment reference.
	 * @see #getMetaColumn()
	 * @generated
	 */
	void setMetaColumn(Column value);

	/**
	 * Returns the value of the '<em><b>Fetch</b></em>' attribute.
	 * The default value is <code>"EAGER"</code>.
	 * The literals are from the enumeration {@link org.eclipse.emf.teneo.annotations.pannotation.FetchType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fetch</em>' attribute isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fetch</em>' attribute.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.FetchType
	 * @see #setFetch(FetchType)
	 * @see org.eclipse.emf.teneo.hibernate.hbannotation.HbannotationPackage#getAny_Fetch()
	 * @model default="EAGER"
	 * @generated
	 */
	FetchType getFetch();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.hibernate.hbannotation.Any#getFetch <em>Fetch</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fetch</em>' attribute.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.FetchType
	 * @see #getFetch()
	 * @generated
	 */
	void setFetch(FetchType value);

	/**
	 * Returns the value of the '<em><b>Optional</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Optional</em>' attribute isn't clear, there really should be more of
	 * a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Optional</em>' attribute.
	 * @see #setOptional(boolean)
	 * @see org.eclipse.emf.teneo.hibernate.hbannotation.HbannotationPackage#getAny_Optional()
	 * @model default="true"
	 * @generated
	 */
	boolean isOptional();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.hibernate.hbannotation.Any#isOptional <em>Optional</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Optional</em>' attribute.
	 * @see #isOptional()
	 * @generated
	 */
	void setOptional(boolean value);

} // Any

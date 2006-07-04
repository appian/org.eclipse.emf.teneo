/**
 * <copyright>
 * </copyright>
 *
 * $Id: PAnnotatedEReference.java,v 1.1 2006/07/04 21:37:00 mtaal Exp $
 */
package org.eclipse.emf.teneo.annotations.pamodel;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.teneo.annotations.pannotation.Embedded;
import org.eclipse.emf.teneo.annotations.pannotation.EmbeddedId;
import org.eclipse.emf.teneo.annotations.pannotation.ManyToMany;
import org.eclipse.emf.teneo.annotations.pannotation.ManyToOne;
import org.eclipse.emf.teneo.annotations.pannotation.MapKey;
import org.eclipse.emf.teneo.annotations.pannotation.OneToOne;
import org.eclipse.emf.teneo.annotations.pannotation.OrderBy;
import org.eclipse.emf.teneo.annotations.pannotation.PrimaryKeyJoinColumn;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>PAnnotated EReference</b></em>'. <!--
 * end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEReference#getAnnotatedEReference <em>Annotated EReference</em>}</li>
 * <li>{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEReference#getEmbedded <em>Embedded</em>}</li>
 * <li>{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEReference#getEmbeddedId <em>Embedded Id</em>}</li>
 * <li>{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEReference#getManyToMany <em>Many To Many</em>}</li>
 * <li>{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEReference#getManyToOne <em>Many To One</em>}</li>
 * <li>{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEReference#getMapKey <em>Map Key</em>}</li>
 * <li>{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEReference#getOneToOne <em>One To One</em>}</li>
 * <li>{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEReference#getOrderBy <em>Order By</em>}</li>
 * <li>{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEReference#getPrimaryKeyJoinColumn <em>Primary Key Join Column</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.emf.teneo.annotations.pamodel.PamodelPackage#getPAnnotatedEReference()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='NotAnnotatedAsEmbed
 *        AssociationAgreeWithReference AssociationWellFormed'"
 * @generated
 */
public interface PAnnotatedEReference extends PAnnotatedEStructuralFeature {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String copyright = "Copyright 2004-2006, Elver.org (http://www.eclipse.org/emf/teneo).\nLicensed under the Apache License, Version 2.0 (the \"License\");\n\nyou may not use this file except in compliance with the License.\nYou may obtain a copy of the License at\nhttp://www.apache.org/licenses/LICENSE-2.0\nUnless required by applicable law or agreed to in writing, software\ndistributed under the License is distributed on an \"AS IS\" BASIS,\nWITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.\nSee the License for the specific language governing permissions and\nlimitations under the License.";

	/**
	 * Returns the value of the '<em><b>Annotated EReference</b></em>' reference. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Annotated EReference</em>' reference isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Annotated EReference</em>' reference.
	 * @see #setAnnotatedEReference(EReference)
	 * @see org.eclipse.emf.teneo.annotations.pamodel.PamodelPackage#getPAnnotatedEReference_AnnotatedEReference()
	 * @model required="true"
	 * @generated
	 */
	EReference getAnnotatedEReference();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEReference#getAnnotatedEReference <em>Annotated EReference</em>}'
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Annotated EReference</em>' reference.
	 * @see #getAnnotatedEReference()
	 * @generated
	 */
	void setAnnotatedEReference(EReference value);

	/**
	 * Returns the value of the '<em><b>Embedded</b></em>' containment reference. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Embedded</em>' containment reference isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Embedded</em>' containment reference.
	 * @see #setEmbedded(Embedded)
	 * @see org.eclipse.emf.teneo.annotations.pamodel.PamodelPackage#getPAnnotatedEReference_Embedded()
	 * @model containment="true"
	 * @generated
	 */
	Embedded getEmbedded();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEReference#getEmbedded <em>Embedded</em>}'
	 * containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Embedded</em>' containment reference.
	 * @see #getEmbedded()
	 * @generated
	 */
	void setEmbedded(Embedded value);

	/**
	 * Returns the value of the '<em><b>Embedded Id</b></em>' containment reference. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Embedded Id</em>' containment reference isn't clear, there really should be more
	 * of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Embedded Id</em>' containment reference.
	 * @see #setEmbeddedId(EmbeddedId)
	 * @see org.eclipse.emf.teneo.annotations.pamodel.PamodelPackage#getPAnnotatedEReference_EmbeddedId()
	 * @model containment="true"
	 * @generated
	 */
	EmbeddedId getEmbeddedId();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEReference#getEmbeddedId <em>Embedded Id</em>}'
	 * containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Embedded Id</em>' containment reference.
	 * @see #getEmbeddedId()
	 * @generated
	 */
	void setEmbeddedId(EmbeddedId value);

	/**
	 * Returns the value of the '<em><b>Many To Many</b></em>' containment reference. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Many To Many</em>' containment reference isn't clear, there really should be more
	 * of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Many To Many</em>' containment reference.
	 * @see #setManyToMany(ManyToMany)
	 * @see org.eclipse.emf.teneo.annotations.pamodel.PamodelPackage#getPAnnotatedEReference_ManyToMany()
	 * @model containment="true"
	 * @generated
	 */
	ManyToMany getManyToMany();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEReference#getManyToMany <em>Many To Many</em>}'
	 * containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Many To Many</em>' containment reference.
	 * @see #getManyToMany()
	 * @generated
	 */
	void setManyToMany(ManyToMany value);

	/**
	 * Returns the value of the '<em><b>Many To One</b></em>' containment reference. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Many To One</em>' containment reference isn't clear, there really should be more
	 * of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Many To One</em>' containment reference.
	 * @see #setManyToOne(ManyToOne)
	 * @see org.eclipse.emf.teneo.annotations.pamodel.PamodelPackage#getPAnnotatedEReference_ManyToOne()
	 * @model containment="true"
	 * @generated
	 */
	ManyToOne getManyToOne();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEReference#getManyToOne <em>Many To One</em>}'
	 * containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Many To One</em>' containment reference.
	 * @see #getManyToOne()
	 * @generated
	 */
	void setManyToOne(ManyToOne value);

	/**
	 * Returns the value of the '<em><b>Map Key</b></em>' containment reference. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Map Key</em>' containment reference isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Map Key</em>' containment reference.
	 * @see #setMapKey(MapKey)
	 * @see org.eclipse.emf.teneo.annotations.pamodel.PamodelPackage#getPAnnotatedEReference_MapKey()
	 * @model containment="true"
	 * @generated
	 */
	MapKey getMapKey();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEReference#getMapKey <em>Map Key</em>}'
	 * containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Map Key</em>' containment reference.
	 * @see #getMapKey()
	 * @generated
	 */
	void setMapKey(MapKey value);

	/**
	 * Returns the value of the '<em><b>One To One</b></em>' containment reference. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>One To One</em>' containment reference isn't clear, there really should be more of
	 * a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>One To One</em>' containment reference.
	 * @see #setOneToOne(OneToOne)
	 * @see org.eclipse.emf.teneo.annotations.pamodel.PamodelPackage#getPAnnotatedEReference_OneToOne()
	 * @model containment="true"
	 * @generated
	 */
	OneToOne getOneToOne();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEReference#getOneToOne <em>One To One</em>}'
	 * containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>One To One</em>' containment reference.
	 * @see #getOneToOne()
	 * @generated
	 */
	void setOneToOne(OneToOne value);

	/**
	 * Returns the value of the '<em><b>Order By</b></em>' containment reference. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order By</em>' containment reference isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Order By</em>' containment reference.
	 * @see #setOrderBy(OrderBy)
	 * @see org.eclipse.emf.teneo.annotations.pamodel.PamodelPackage#getPAnnotatedEReference_OrderBy()
	 * @model containment="true"
	 * @generated
	 */
	OrderBy getOrderBy();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEReference#getOrderBy <em>Order By</em>}'
	 * containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Order By</em>' containment reference.
	 * @see #getOrderBy()
	 * @generated
	 */
	void setOrderBy(OrderBy value);

	/**
	 * Returns the value of the '<em><b>Primary Key Join Column</b></em>' containment reference. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Primary Key Join Column</em>' containment reference isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Primary Key Join Column</em>' containment reference.
	 * @see #setPrimaryKeyJoinColumn(PrimaryKeyJoinColumn)
	 * @see org.eclipse.emf.teneo.annotations.pamodel.PamodelPackage#getPAnnotatedEReference_PrimaryKeyJoinColumn()
	 * @model containment="true"
	 * @generated
	 */
	PrimaryKeyJoinColumn getPrimaryKeyJoinColumn();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEReference#getPrimaryKeyJoinColumn <em>Primary Key Join Column</em>}'
	 * containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Primary Key Join Column</em>' containment reference.
	 * @see #getPrimaryKeyJoinColumn()
	 * @generated
	 */
	void setPrimaryKeyJoinColumn(PrimaryKeyJoinColumn value);

} // PAnnotatedEReference

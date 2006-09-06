/**
 * <copyright>
 * </copyright>
 *
 * $Id: HbAnnotatedETypeElement.java,v 1.1 2006/09/06 21:59:33 mtaal Exp $
 */
package org.eclipse.emf.teneo.hibernate.hbmodel;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEStructuralFeature;
import org.eclipse.emf.teneo.hibernate.hbannotation.Cascade;
import org.eclipse.emf.teneo.hibernate.hbannotation.CollectionOfElements;
import org.eclipse.emf.teneo.hibernate.hbannotation.IdBag;
import org.eclipse.emf.teneo.hibernate.hbannotation.MapKey;
import org.eclipse.emf.teneo.hibernate.hbannotation.Where;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hb Annotated EType Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.hibernate.hbmodel.HbAnnotatedETypeElement#getHbWhere <em>Hb Where</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.hibernate.hbmodel.HbAnnotatedETypeElement#getHbCollectionOfElements <em>Hb Collection Of Elements</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.hibernate.hbmodel.HbAnnotatedETypeElement#getHbMapKey <em>Hb Map Key</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.hibernate.hbmodel.HbAnnotatedETypeElement#getHbColumns <em>Hb Columns</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.hibernate.hbmodel.HbAnnotatedETypeElement#getHbCascade <em>Hb Cascade</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.hibernate.hbmodel.HbAnnotatedETypeElement#getHbIdBag <em>Hb Id Bag</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.hibernate.hbmodel.HbModelPackage#getHbAnnotatedETypeElement()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface HbAnnotatedETypeElement extends PAnnotatedEStructuralFeature, HbAnnotatedEModelElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2005, 2006 Springsite BV (The Netherlands) and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public\nLicense v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n   Martin Taal\n   Douglas Bitting\n";

	/**
	 * Returns the value of the '<em><b>Hb Where</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hb Where</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hb Where</em>' containment reference.
	 * @see #setHbWhere(Where)
	 * @see org.eclipse.emf.teneo.hibernate.hbmodel.HbModelPackage#getHbAnnotatedETypeElement_HbWhere()
	 * @model containment="true"
	 * @generated
	 */
	Where getHbWhere();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.hibernate.hbmodel.HbAnnotatedETypeElement#getHbWhere <em>Hb Where</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hb Where</em>' containment reference.
	 * @see #getHbWhere()
	 * @generated
	 */
	void setHbWhere(Where value);

	/**
	 * Returns the value of the '<em><b>Hb Collection Of Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hb Collection Of Elements</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hb Collection Of Elements</em>' containment reference.
	 * @see #setHbCollectionOfElements(CollectionOfElements)
	 * @see org.eclipse.emf.teneo.hibernate.hbmodel.HbModelPackage#getHbAnnotatedETypeElement_HbCollectionOfElements()
	 * @model containment="true"
	 * @generated
	 */
	CollectionOfElements getHbCollectionOfElements();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.hibernate.hbmodel.HbAnnotatedETypeElement#getHbCollectionOfElements <em>Hb Collection Of Elements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hb Collection Of Elements</em>' containment reference.
	 * @see #getHbCollectionOfElements()
	 * @generated
	 */
	void setHbCollectionOfElements(CollectionOfElements value);

	/**
	 * Returns the value of the '<em><b>Hb Map Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hb Map Key</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hb Map Key</em>' containment reference.
	 * @see #setHbMapKey(MapKey)
	 * @see org.eclipse.emf.teneo.hibernate.hbmodel.HbModelPackage#getHbAnnotatedETypeElement_HbMapKey()
	 * @model containment="true"
	 * @generated
	 */
	MapKey getHbMapKey();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.hibernate.hbmodel.HbAnnotatedETypeElement#getHbMapKey <em>Hb Map Key</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hb Map Key</em>' containment reference.
	 * @see #getHbMapKey()
	 * @generated
	 */
	void setHbMapKey(MapKey value);

	/**
	 * Returns the value of the '<em><b>Hb Columns</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.annotations.pannotation.Column}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hb Columns</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hb Columns</em>' containment reference list.
	 * @see org.eclipse.emf.teneo.hibernate.hbmodel.HbModelPackage#getHbAnnotatedETypeElement_HbColumns()
	 * @model type="org.eclipse.emf.teneo.annotations.pannotation.Column" containment="true"
	 * @generated
	 */
	EList getHbColumns();

	/**
	 * Returns the value of the '<em><b>Hb Cascade</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hb Cascade</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hb Cascade</em>' containment reference.
	 * @see #setHbCascade(Cascade)
	 * @see org.eclipse.emf.teneo.hibernate.hbmodel.HbModelPackage#getHbAnnotatedETypeElement_HbCascade()
	 * @model containment="true"
	 * @generated
	 */
	Cascade getHbCascade();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.hibernate.hbmodel.HbAnnotatedETypeElement#getHbCascade <em>Hb Cascade</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hb Cascade</em>' containment reference.
	 * @see #getHbCascade()
	 * @generated
	 */
	void setHbCascade(Cascade value);

	/**
	 * Returns the value of the '<em><b>Hb Id Bag</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hb Id Bag</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hb Id Bag</em>' containment reference.
	 * @see #setHbIdBag(IdBag)
	 * @see org.eclipse.emf.teneo.hibernate.hbmodel.HbModelPackage#getHbAnnotatedETypeElement_HbIdBag()
	 * @model containment="true"
	 * @generated
	 */
	IdBag getHbIdBag();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.hibernate.hbmodel.HbAnnotatedETypeElement#getHbIdBag <em>Hb Id Bag</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hb Id Bag</em>' containment reference.
	 * @see #getHbIdBag()
	 * @generated
	 */
	void setHbIdBag(IdBag value);

} // HbAnnotatedETypeElement
/**
 * <copyright>
 * </copyright>
 *
 * $Id: CollectionOfElements.java,v 1.4 2007/02/01 12:35:55 mtaal Exp $
 */
package org.eclipse.emf.teneo.hibernate.hbannotation;

import org.eclipse.emf.teneo.annotations.pannotation.FetchType;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Collection Of Elements</b></em>'. <!--
 * end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.hibernate.hbannotation.CollectionOfElements#getTargetElement <em>Target Element</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.hibernate.hbannotation.CollectionOfElements#getFetch <em>Fetch</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.hibernate.hbannotation.HbAnnotationPackage#getCollectionOfElements()
 * @model annotation="http://annotation.elver.org/internal/Target 0='EStructuralFeature'"
 * @generated
 */
public interface CollectionOfElements extends HbAnnotation {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2005, 2006, 2007 Springsite BV (The Netherlands) and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public\nLicense v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n   Martin Taal\n   Douglas Bitting\n";

	/**
	 * Returns the value of the '<em><b>Target Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Element</em>' attribute isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Element</em>' attribute.
	 * @see #setTargetElement(String)
	 * @see org.eclipse.emf.teneo.hibernate.hbannotation.HbAnnotationPackage#getCollectionOfElements_TargetElement()
	 * @model
	 * @generated
	 */
	String getTargetElement();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.hibernate.hbannotation.CollectionOfElements#getTargetElement <em>Target Element</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Element</em>' attribute.
	 * @see #getTargetElement()
	 * @generated
	 */
	void setTargetElement(String value);

	/**
	 * Returns the value of the '<em><b>Fetch</b></em>' attribute. The default value is <code>"LAZY"</code>. The
	 * literals are from the enumeration {@link org.eclipse.emf.teneo.annotations.pannotation.FetchType}. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fetch</em>' attribute isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Fetch</em>' attribute.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.FetchType
	 * @see #setFetch(FetchType)
	 * @see org.eclipse.emf.teneo.hibernate.hbannotation.HbAnnotationPackage#getCollectionOfElements_Fetch()
	 * @model default="LAZY"
	 * @generated
	 */
	FetchType getFetch();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.hibernate.hbannotation.CollectionOfElements#getFetch <em>Fetch</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fetch</em>' attribute.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.FetchType
	 * @see #getFetch()
	 * @generated
	 */
	void setFetch(FetchType value);

} // CollectionOfElements

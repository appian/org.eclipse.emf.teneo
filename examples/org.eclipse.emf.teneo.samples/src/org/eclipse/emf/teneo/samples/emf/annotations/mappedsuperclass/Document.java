/**
 * <copyright>
 * </copyright>
 *
 * $Id: Document.java,v 1.3 2006/11/12 00:08:30 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.annotations.mappedsuperclass;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.mappedsuperclass.Document#getMyGenericInfo <em>My Generic Info</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.emf.annotations.mappedsuperclass.MappedsuperclassPackage#getDocument()
 * @model annotation="teneo.jpa appinfo='@MappedSuperclass'"
 *        extendedMetaData="name='Document' kind='elementOnly'"
 * @generated
 */
public interface Document extends EObject {
	/**
	 * Returns the value of the '<em><b>My Generic Info</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>My Generic Info</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>My Generic Info</em>' attribute.
	 * @see #setMyGenericInfo(String)
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.mappedsuperclass.MappedsuperclassPackage#getDocument_MyGenericInfo()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='myGenericInfo'"
	 * @generated
	 */
	String getMyGenericInfo();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.annotations.mappedsuperclass.Document#getMyGenericInfo <em>My Generic Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>My Generic Info</em>' attribute.
	 * @see #getMyGenericInfo()
	 * @generated
	 */
	void setMyGenericInfo(String value);

} // Document

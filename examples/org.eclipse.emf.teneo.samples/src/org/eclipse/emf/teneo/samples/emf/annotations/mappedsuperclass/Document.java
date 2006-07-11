/**
 * <copyright>
 * </copyright>
 *
 * $Id: Document.java,v 1.1 2006/07/11 16:57:16 mtaal Exp $
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
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.mappedsuperclass.Document#getMyId <em>My Id</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.mappedsuperclass.Document#getMyGenericInfo <em>My Generic Info</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.emf.annotations.mappedsuperclass.MappedsuperclassPackage#getDocument()
 * @model annotation="http://annotation.elver.org/MappedSuperclass appinfo='true'"
 *        extendedMetaData="name='Document' kind='elementOnly'"
 * @generated
 */
public interface Document extends EObject {
	/**
	 * Returns the value of the '<em><b>My Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>My Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>My Id</em>' attribute.
	 * @see #isSetMyId()
	 * @see #unsetMyId()
	 * @see #setMyId(long)
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.mappedsuperclass.MappedsuperclassPackage#getDocument_MyId()
	 * @model unique="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Long" required="true"
	 *        annotation="http://annotation.elver.org/Id appinfo='true'"
	 *        extendedMetaData="kind='element' name='myId'"
	 * @generated
	 */
	long getMyId();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.annotations.mappedsuperclass.Document#getMyId <em>My Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>My Id</em>' attribute.
	 * @see #isSetMyId()
	 * @see #unsetMyId()
	 * @see #getMyId()
	 * @generated
	 */
	void setMyId(long value);

	/**
	 * Unsets the value of the '{@link org.eclipse.emf.teneo.samples.emf.annotations.mappedsuperclass.Document#getMyId <em>My Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMyId()
	 * @see #getMyId()
	 * @see #setMyId(long)
	 * @generated
	 */
	void unsetMyId();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.teneo.samples.emf.annotations.mappedsuperclass.Document#getMyId <em>My Id</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>My Id</em>' attribute is set.
	 * @see #unsetMyId()
	 * @see #getMyId()
	 * @see #setMyId(long)
	 * @generated
	 */
	boolean isSetMyId();

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

/**
 * <copyright>
 * </copyright>
 *
 * $Id: SpecificDocument.java,v 1.3 2007/08/10 20:30:43 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.annotations.mappedsuperclass;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specific Document</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.mappedsuperclass.SpecificDocument#getMySpecificInfo <em>My Specific Info</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.emf.annotations.mappedsuperclass.MappedsuperclassPackage#getSpecificDocument()
 * @model annotation="teneo.jpa appinfo='@Entity'"
 *        extendedMetaData="name='SpecificDocument' kind='elementOnly'"
 * @generated
 */
public interface SpecificDocument extends ParentDocument {
	/**
	 * Returns the value of the '<em><b>My Specific Info</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>My Specific Info</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>My Specific Info</em>' attribute.
	 * @see #setMySpecificInfo(String)
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.mappedsuperclass.MappedsuperclassPackage#getSpecificDocument_MySpecificInfo()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='mySpecificInfo'"
	 * @generated
	 */
	String getMySpecificInfo();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.annotations.mappedsuperclass.SpecificDocument#getMySpecificInfo <em>My Specific Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>My Specific Info</em>' attribute.
	 * @see #getMySpecificInfo()
	 * @generated
	 */
	void setMySpecificInfo(String value);

} // SpecificDocument

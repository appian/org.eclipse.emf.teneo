/**
 * <copyright>
 * </copyright>
 *
 * $Id: ParentDocument.java,v 1.5 2008/04/06 13:45:43 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.annotations.mappedsuperclass;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parent Document</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.mappedsuperclass.ParentDocument#getMyName <em>My Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.emf.annotations.mappedsuperclass.MappedsuperclassPackage#getParentDocument()
 * @model annotation="teneo.jpa appinfo='@Entity @MappedSuperclass'"
 *        extendedMetaData="name='ParentDocument' kind='elementOnly'"
 * @generated
 */
public interface ParentDocument extends Document {
	/**
	 * Returns the value of the '<em><b>My Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>My Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>My Name</em>' attribute.
	 * @see #setMyName(String)
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.mappedsuperclass.MappedsuperclassPackage#getParentDocument_MyName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        annotation="teneo.jpa appinfo='\n\t\t\t\t\t     @Column(name=XXX,nullable=\"false\")\n\t\t\t\t\t    '"
	 *        extendedMetaData="kind='element' name='myName'"
	 * @generated
	 */
	String getMyName();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.annotations.mappedsuperclass.ParentDocument#getMyName <em>My Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>My Name</em>' attribute.
	 * @see #getMyName()
	 * @generated
	 */
	void setMyName(String value);

} // ParentDocument

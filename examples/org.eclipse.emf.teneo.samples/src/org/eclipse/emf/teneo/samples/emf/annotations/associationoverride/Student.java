/**
 * <copyright>
 * </copyright>
 *
 * $Id: Student.java,v 1.1 2006/07/11 16:57:16 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.annotations.associationoverride;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Student</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.associationoverride.Student#getFaculty <em>Faculty</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.emf.annotations.associationoverride.AssociationoverridePackage#getStudent()
 * @model extendedMetaData="name='Student' kind='elementOnly'"
 * @generated
 */
public interface Student extends Person {
	/**
	 * Returns the value of the '<em><b>Faculty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Faculty</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Faculty</em>' attribute.
	 * @see #setFaculty(String)
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.associationoverride.AssociationoverridePackage#getStudent_Faculty()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='faculty'"
	 * @generated
	 */
	String getFaculty();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.annotations.associationoverride.Student#getFaculty <em>Faculty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Faculty</em>' attribute.
	 * @see #getFaculty()
	 * @generated
	 */
	void setFaculty(String value);

} // Student
/**
 * <copyright>
 * </copyright>
 *
 * $Id: Periodical.java,v 1.2 2010/03/02 06:08:38 mtaal Exp $
 */
package org.eclipse.emf.teneo.hibernate.examples.extlibrary;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Periodical</b></em>'. <!--
 * end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.emf.teneo.hibernate.examples.extlibrary.Periodical#getTitle <em>Title
 * </em>}</li>
 * <li>{@link org.eclipse.emf.teneo.hibernate.examples.extlibrary.Periodical#getIssuesPerYear <em>
 * Issues Per Year</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.emf.teneo.hibernate.examples.extlibrary.ExtlibraryPackage#getPeriodical()
 * @model abstract="true"
 * @generated
 */
public interface Periodical extends Item {
	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' attribute isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see org.eclipse.emf.teneo.hibernate.examples.extlibrary.ExtlibraryPackage#getPeriodical_Title()
	 * @model
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '
	 * {@link org.eclipse.emf.teneo.hibernate.examples.extlibrary.Periodical#getTitle <em>Title</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Issues Per Year</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Issues Per Year</em>' attribute isn't clear, there really should be
	 * more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Issues Per Year</em>' attribute.
	 * @see #setIssuesPerYear(int)
	 * @see org.eclipse.emf.teneo.hibernate.examples.extlibrary.ExtlibraryPackage#getPeriodical_IssuesPerYear()
	 * @model required="true"
	 * @generated
	 */
	int getIssuesPerYear();

	/**
	 * Sets the value of the '
	 * {@link org.eclipse.emf.teneo.hibernate.examples.extlibrary.Periodical#getIssuesPerYear
	 * <em>Issues Per Year</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Issues Per Year</em>' attribute.
	 * @see #getIssuesPerYear()
	 * @generated
	 */
	void setIssuesPerYear(int value);

} // Periodical

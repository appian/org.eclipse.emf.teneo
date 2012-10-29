/**
 * <copyright>
 * </copyright>
 *
 * $Id: TBook.java,v 1.1 2007/07/09 14:02:30 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.hibernate.transientotm;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.teneo.hibernate.SessionWrapper;

/**
 * <!-- begin-user-doc --> A representation of the model object ' <em><b>TBook</b></em>'. <!--
 * end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>
 * {@link org.eclipse.emf.teneo.samples.emf.hibernate.transientotm.TBook#getTitle <em>Title</em>}</li>
 * <li>
 * {@link org.eclipse.emf.teneo.samples.emf.hibernate.transientotm.TBook#getAuthors <em>Authors
 * </em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.emf.teneo.samples.emf.hibernate.transientotm.TransientotmPackage#getTBook()
 * @model extendedMetaData="name='TBook' kind='elementOnly'"
 * @generated
 */
public interface TBook extends EObject {
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
	 * @see org.eclipse.emf.teneo.samples.emf.hibernate.transientotm.TransientotmPackage#getTBook_Title()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='title'"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '
	 * {@link org.eclipse.emf.teneo.samples.emf.hibernate.transientotm.TBook#getTitle <em>Title</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Authors</b></em>' reference list. The list contents are of
	 * type {@link org.eclipse.emf.teneo.samples.emf.hibernate.transientotm.TWriter}. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Authors</em>' reference list isn't clear, there really should be
	 * more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Authors</em>' reference list.
	 * @see org.eclipse.emf.teneo.samples.emf.hibernate.transientotm.TransientotmPackage#getTBook_Authors()
	 * @model required="true" transient="true" extendedMetaData="kind='element' name='authors'"
	 * @generated
	 */
	EList<TWriter> getAuthors();

	public void setAuthors(SessionWrapper sessionWrapper);

} // TBook

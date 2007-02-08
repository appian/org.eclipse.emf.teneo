/**
 * <copyright>
 * </copyright>
 *
 * $Id: AuthorsType.java,v 1.2 2007/02/08 23:09:26 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.sample.sunBooks;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Authors Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.sunBooks.AuthorsType#getAuthorName <em>Author Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.emf.sample.sunBooks.SunBooksPackage#getAuthorsType()
 * @model extendedMetaData="name='authors_._type' kind='elementOnly'"
 * @generated
 */
public interface AuthorsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Author Name</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Author Name</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Author Name</em>' attribute list.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.sunBooks.SunBooksPackage#getAuthorsType_AuthorName()
	 * @model type="java.lang.String" unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='authorName'"
	 * @generated
	 */
	EList<String> getAuthorName();

} // AuthorsType

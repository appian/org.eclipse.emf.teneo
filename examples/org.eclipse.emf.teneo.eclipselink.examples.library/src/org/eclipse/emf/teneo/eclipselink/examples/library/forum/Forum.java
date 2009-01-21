/**
 * <copyright>
 * </copyright>
 *
 * $Id: Forum.java,v 1.2 2009/01/21 21:34:20 seberle Exp $
 */
package org.eclipse.emf.teneo.eclipselink.examples.library.forum;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.teneo.eclipselink.examples.library.Book;
import org.eclipse.emf.teneo.eclipselink.examples.library.Writer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Forum</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.eclipselink.examples.library.forum.Forum#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.eclipselink.examples.library.forum.Forum#getRatedAuthors <em>Rated Authors</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.eclipselink.examples.library.forum.Forum#getFeaturedBooks <em>Featured Books</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.eclipselink.examples.library.forum.ForumPackage#getForum()
 * @model
 * @generated
 */
public interface Forum extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.emf.teneo.eclipselink.examples.library.forum.ForumPackage#getForum_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.eclipselink.examples.library.forum.Forum#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Rated Authors</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.eclipselink.examples.library.Writer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rated Authors</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rated Authors</em>' reference list.
	 * @see org.eclipse.emf.teneo.eclipselink.examples.library.forum.ForumPackage#getForum_RatedAuthors()
	 * @model
	 * @generated
	 */
	EList<Writer> getRatedAuthors();

	/**
	 * Returns the value of the '<em><b>Featured Books</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.eclipselink.examples.library.Book}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Featured Books</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Featured Books</em>' reference list.
	 * @see org.eclipse.emf.teneo.eclipselink.examples.library.forum.ForumPackage#getForum_FeaturedBooks()
	 * @model
	 * @generated
	 */
	EList<Book> getFeaturedBooks();

} // Forum

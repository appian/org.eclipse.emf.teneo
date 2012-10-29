/**
 * <copyright>
 * </copyright>
 *
 * $Id: VideoCassette.java,v 1.2 2010/03/02 06:08:40 mtaal Exp $
 */
package org.eclipse.emf.teneo.hibernate.examples.extlibrary;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Video Cassette</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.emf.teneo.hibernate.examples.extlibrary.VideoCassette#getCast <em>Cast
 * </em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.emf.teneo.hibernate.examples.extlibrary.ExtlibraryPackage#getVideoCassette()
 * @model
 * @generated
 */
public interface VideoCassette extends AudioVisualItem {
	/**
	 * Returns the value of the '<em><b>Cast</b></em>' reference list. The list contents are of type
	 * {@link org.eclipse.emf.teneo.hibernate.examples.extlibrary.Person}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cast</em>' reference list isn't clear, there really should be more
	 * of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Cast</em>' reference list.
	 * @see org.eclipse.emf.teneo.hibernate.examples.extlibrary.ExtlibraryPackage#getVideoCassette_Cast()
	 * @model
	 * @generated
	 */
	EList<Person> getCast();

} // VideoCassette

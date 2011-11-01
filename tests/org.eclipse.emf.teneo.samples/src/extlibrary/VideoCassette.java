/**
 * <copyright>
 * </copyright>
 *
 * $Id: VideoCassette.java,v 1.1 2006/08/14 05:08:58 mtaal Exp $
 */
package extlibrary;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Video Cassette</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link extlibrary.VideoCassette#getCast <em>Cast</em>}</li>
 * </ul>
 * </p>
 *
 * @see extlibrary.ExtlibraryPackage#getVideoCassette()
 * @model
 * @generated
 */
public interface VideoCassette extends AudioVisualItem {
	/**
	 * Returns the value of the '<em><b>Cast</b></em>' reference list.
	 * The list contents are of type {@link extlibrary.Person}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cast</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cast</em>' reference list.
	 * @see extlibrary.ExtlibraryPackage#getVideoCassette_Cast()
	 * @model type="extlibrary.Person"
	 * @generated
	 */
	EList getCast();

} // VideoCassette
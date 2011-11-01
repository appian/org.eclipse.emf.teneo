/**
 * <copyright>
 * </copyright>
 *
 * $Id: Cover.java,v 1.2 2009/01/21 21:34:20 seberle Exp $
 */
package org.eclipse.emf.teneo.eclipselink.examples.library;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cover</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.eclipselink.examples.library.Cover#isColored <em>Colored</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.eclipselink.examples.library.LibraryPackage#getCover()
 * @model
 * @generated
 */
public interface Cover extends Identifiable {
	/**
	 * Returns the value of the '<em><b>Colored</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Colored</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Colored</em>' attribute.
	 * @see #setColored(boolean)
	 * @see org.eclipse.emf.teneo.eclipselink.examples.library.LibraryPackage#getCover_Colored()
	 * @model
	 * @generated
	 */
	boolean isColored();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.eclipselink.examples.library.Cover#isColored <em>Colored</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Colored</em>' attribute.
	 * @see #isColored()
	 * @generated
	 */
	void setColored(boolean value);

} // Cover

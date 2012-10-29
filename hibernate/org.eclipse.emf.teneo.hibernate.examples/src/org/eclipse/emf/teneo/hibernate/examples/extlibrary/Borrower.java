/**
 * <copyright>
 * </copyright>
 *
 * $Id: Borrower.java,v 1.2 2010/03/02 06:08:40 mtaal Exp $
 */
package org.eclipse.emf.teneo.hibernate.examples.extlibrary;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Borrower</b></em>'. <!--
 * end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.emf.teneo.hibernate.examples.extlibrary.Borrower#getBorrowed <em>Borrowed
 * </em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.emf.teneo.hibernate.examples.extlibrary.ExtlibraryPackage#getBorrower()
 * @model
 * @generated
 */
public interface Borrower extends Person {
	/**
	 * Returns the value of the '<em><b>Borrowed</b></em>' reference list. The list contents are of
	 * type {@link org.eclipse.emf.teneo.hibernate.examples.extlibrary.Lendable}. It is bidirectional
	 * and its opposite is '
	 * {@link org.eclipse.emf.teneo.hibernate.examples.extlibrary.Lendable#getBorrowers
	 * <em>Borrowers</em>}'. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Borrowed</em>' reference list isn't clear, there really should be
	 * more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Borrowed</em>' reference list.
	 * @see org.eclipse.emf.teneo.hibernate.examples.extlibrary.ExtlibraryPackage#getBorrower_Borrowed()
	 * @see org.eclipse.emf.teneo.hibernate.examples.extlibrary.Lendable#getBorrowers
	 * @model opposite="borrowers"
	 * @generated
	 */
	EList<Lendable> getBorrowed();

} // Borrower

/**
 * <copyright>
 * </copyright>
 *
 * $Id: Borrower.java,v 1.1 2006/08/14 05:08:58 mtaal Exp $
 */
package extlibrary;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Borrower</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link extlibrary.Borrower#getBorrowed <em>Borrowed</em>}</li>
 * </ul>
 * </p>
 *
 * @see extlibrary.ExtlibraryPackage#getBorrower()
 * @model
 * @generated
 */
public interface Borrower extends Person {
	/**
	 * Returns the value of the '<em><b>Borrowed</b></em>' reference list.
	 * The list contents are of type {@link extlibrary.Lendable}.
	 * It is bidirectional and its opposite is '{@link extlibrary.Lendable#getBorrowers <em>Borrowers</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Borrowed</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Borrowed</em>' reference list.
	 * @see extlibrary.ExtlibraryPackage#getBorrower_Borrowed()
	 * @see extlibrary.Lendable#getBorrowers
	 * @model type="extlibrary.Lendable" opposite="borrowers"
	 * @generated
	 */
	EList getBorrowed();

} // Borrower
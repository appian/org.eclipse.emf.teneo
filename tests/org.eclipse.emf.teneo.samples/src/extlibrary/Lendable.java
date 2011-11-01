/**
 * <copyright>
 * </copyright>
 *
 * $Id: Lendable.java,v 1.1 2006/08/14 05:08:58 mtaal Exp $
 */
package extlibrary;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lendable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link extlibrary.Lendable#getCopies <em>Copies</em>}</li>
 *   <li>{@link extlibrary.Lendable#getBorrowers <em>Borrowers</em>}</li>
 * </ul>
 * </p>
 *
 * @see extlibrary.ExtlibraryPackage#getLendable()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Lendable extends EObject {
	/**
	 * Returns the value of the '<em><b>Copies</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Copies</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Copies</em>' attribute.
	 * @see #setCopies(int)
	 * @see extlibrary.ExtlibraryPackage#getLendable_Copies()
	 * @model required="true"
	 * @generated
	 */
	int getCopies();

	/**
	 * Sets the value of the '{@link extlibrary.Lendable#getCopies <em>Copies</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Copies</em>' attribute.
	 * @see #getCopies()
	 * @generated
	 */
	void setCopies(int value);

	/**
	 * Returns the value of the '<em><b>Borrowers</b></em>' reference list.
	 * The list contents are of type {@link extlibrary.Borrower}.
	 * It is bidirectional and its opposite is '{@link extlibrary.Borrower#getBorrowed <em>Borrowed</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Borrowers</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Borrowers</em>' reference list.
	 * @see extlibrary.ExtlibraryPackage#getLendable_Borrowers()
	 * @see extlibrary.Borrower#getBorrowed
	 * @model type="extlibrary.Borrower" opposite="borrowed" ordered="false"
	 * @generated
	 */
	EList getBorrowers();

} // Lendable
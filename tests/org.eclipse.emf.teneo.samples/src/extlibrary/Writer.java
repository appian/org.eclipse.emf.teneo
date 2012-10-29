/**
 * <copyright>
 * </copyright>
 *
 * $Id: Writer.java,v 1.1 2006/08/14 05:08:58 mtaal Exp $
 */
package extlibrary;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Writer</b></em>'. <!--
 * end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link extlibrary.Writer#getName <em>Name</em>}</li>
 * <li>{@link extlibrary.Writer#getBooks <em>Books</em>}</li>
 * </ul>
 * </p>
 * 
 * @see extlibrary.ExtlibraryPackage#getWriter()
 * @model
 * @generated
 */
public interface Writer extends Person {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see extlibrary.ExtlibraryPackage#getWriter_Name()
	 * @model transient="true" volatile="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link extlibrary.Writer#getName <em>Name</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Books</b></em>' reference list. The list contents are of type
	 * {@link extlibrary.Book}. It is bidirectional and its opposite is '
	 * {@link extlibrary.Book#getAuthor <em>Author</em>}'. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Books</em>' reference list isn't clear, there really should be more
	 * of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Books</em>' reference list.
	 * @see extlibrary.ExtlibraryPackage#getWriter_Books()
	 * @see extlibrary.Book#getAuthor
	 * @model type="extlibrary.Book" opposite="author"
	 * @generated
	 */
	EList getBooks();

} // Writer
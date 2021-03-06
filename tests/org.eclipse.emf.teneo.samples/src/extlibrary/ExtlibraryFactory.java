/**
 * <copyright>
 * </copyright>
 *
 * $Id: ExtlibraryFactory.java,v 1.1 2006/08/14 05:08:58 mtaal Exp $
 */
package extlibrary;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc --> The <b>Factory</b> for the model. It provides a create method for each
 * non-abstract class of the model. <!-- end-user-doc -->
 * 
 * @see extlibrary.ExtlibraryPackage
 * @generated
 */
public interface ExtlibraryFactory extends EFactory {
	/**
	 * The singleton instance of the factory. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	ExtlibraryFactory eINSTANCE = extlibrary.impl.ExtlibraryFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Book</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Book</em>'.
	 * @generated
	 */
	Book createBook();

	/**
	 * Returns a new object of class '<em>Library</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Library</em>'.
	 * @generated
	 */
	Library createLibrary();

	/**
	 * Returns a new object of class '<em>Writer</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Writer</em>'.
	 * @generated
	 */
	Writer createWriter();

	/**
	 * Returns a new object of class '<em>Book On Tape</em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return a new object of class '<em>Book On Tape</em>'.
	 * @generated
	 */
	BookOnTape createBookOnTape();

	/**
	 * Returns a new object of class '<em>Video Cassette</em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return a new object of class '<em>Video Cassette</em>'.
	 * @generated
	 */
	VideoCassette createVideoCassette();

	/**
	 * Returns a new object of class '<em>Borrower</em>'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return a new object of class '<em>Borrower</em>'.
	 * @generated
	 */
	Borrower createBorrower();

	/**
	 * Returns a new object of class '<em>Person</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Person</em>'.
	 * @generated
	 */
	Person createPerson();

	/**
	 * Returns a new object of class '<em>Employee</em>'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return a new object of class '<em>Employee</em>'.
	 * @generated
	 */
	Employee createEmployee();

	/**
	 * Returns the package supported by this factory. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the package supported by this factory.
	 * @generated
	 */
	ExtlibraryPackage getExtlibraryPackage();

} // ExtlibraryFactory

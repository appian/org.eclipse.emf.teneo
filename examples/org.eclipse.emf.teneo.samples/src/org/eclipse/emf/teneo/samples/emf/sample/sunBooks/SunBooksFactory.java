/**
 * <copyright>
 * </copyright>
 *
 * $Id: SunBooksFactory.java,v 1.2 2007/02/08 23:09:25 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.sample.sunBooks;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.teneo.samples.emf.sample.sunBooks.SunBooksPackage
 * @generated
 */
public interface SunBooksFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SunBooksFactory eINSTANCE = org.eclipse.emf.teneo.samples.emf.sample.sunBooks.impl.SunBooksFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Authors Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Authors Type</em>'.
	 * @generated
	 */
	AuthorsType createAuthorsType();

	/**
	 * Returns a new object of class '<em>Books Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Books Type</em>'.
	 * @generated
	 */
	BooksType createBooksType();

	/**
	 * Returns a new object of class '<em>Book Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Book Type</em>'.
	 * @generated
	 */
	BookType createBookType();

	/**
	 * Returns a new object of class '<em>Collection Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Collection Type</em>'.
	 * @generated
	 */
	CollectionType createCollectionType();

	/**
	 * Returns a new object of class '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Root</em>'.
	 * @generated
	 */
	DocumentRoot createDocumentRoot();

	/**
	 * Returns a new object of class '<em>Promotion Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Promotion Type</em>'.
	 * @generated
	 */
	PromotionType createPromotionType();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SunBooksPackage getSunBooksPackage();

} //SunBooksFactory

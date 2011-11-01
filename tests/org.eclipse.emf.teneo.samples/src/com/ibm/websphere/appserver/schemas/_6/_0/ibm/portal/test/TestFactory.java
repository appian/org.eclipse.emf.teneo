/**
 * <copyright>
 * </copyright>
 *
 * $Id: TestFactory.java,v 1.1 2007/12/13 06:52:44 mtaal Exp $
 */
package com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.TestPackage
 * @generated
 */
public interface TestFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TestFactory eINSTANCE = com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.impl.TestFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Adult Books</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Adult Books</em>'.
	 * @generated
	 */
	AdultBooks createAdultBooks();

	/**
	 * Returns a new object of class '<em>Book Definition Resource Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Book Definition Resource Link</em>'.
	 * @generated
	 */
	BookDefinitionResourceLink createBookDefinitionResourceLink();

	/**
	 * Returns a new object of class '<em>Books In Lib</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Books In Lib</em>'.
	 * @generated
	 */
	BooksInLib createBooksInLib();

	/**
	 * Returns a new object of class '<em>Children Books</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Children Books</em>'.
	 * @generated
	 */
	ChildrenBooks createChildrenBooks();

	/**
	 * Returns a new object of class '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Root</em>'.
	 * @generated
	 */
	DocumentRoot createDocumentRoot();

	/**
	 * Returns a new object of class '<em>Library</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Library</em>'.
	 * @generated
	 */
	Library createLibrary();

	/**
	 * Returns a new object of class '<em>Publisher Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Publisher Definition</em>'.
	 * @generated
	 */
	PublisherDefinition createPublisherDefinition();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TestPackage getTestPackage();

} //TestFactory

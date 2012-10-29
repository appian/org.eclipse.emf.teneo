/**
 * <copyright>
 * </copyright>
 *
 * $Id: TestSwitch.java,v 1.1 2007/12/13 06:52:44 mtaal Exp $
 */
package com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.util;

import com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.*;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> The <b>Switch</b> for the model's inheritance hierarchy. It supports the
 * call {@link #doSwitch(EObject) doSwitch(object)} to invoke the <code>caseXXX</code> method for
 * each class of the model, starting with the actual class of the object and proceeding up the
 * inheritance hierarchy until a non-null result is returned, which is the result of the switch.
 * <!-- end-user-doc -->
 * 
 * @see com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.TestPackage
 * @generated
 */
public class TestSwitch<T> {
	/**
	 * The cached model package <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected static TestPackage modelPackage;

	/**
	 * Creates an instance of the switch. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public TestSwitch() {
		if (modelPackage == null) {
			modelPackage = TestPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it
	 * yields that result. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it
	 * yields that result. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		} else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return eSuperTypes.isEmpty() ? defaultCase(theEObject) : doSwitch(eSuperTypes.get(0),
					theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it
	 * yields that result. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case TestPackage.ADULT_BOOKS: {
			AdultBooks adultBooks = (AdultBooks) theEObject;
			T result = caseAdultBooks(adultBooks);
			if (result == null)
				result = caseBookDefinition(adultBooks);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TestPackage.BOOK_DEFINITION: {
			BookDefinition bookDefinition = (BookDefinition) theEObject;
			T result = caseBookDefinition(bookDefinition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TestPackage.BOOK_DEFINITION_RESOURCE_LINK: {
			BookDefinitionResourceLink bookDefinitionResourceLink = (BookDefinitionResourceLink) theEObject;
			T result = caseBookDefinitionResourceLink(bookDefinitionResourceLink);
			if (result == null)
				result = caseResourceLink(bookDefinitionResourceLink);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TestPackage.BOOKS_IN_LIB: {
			BooksInLib booksInLib = (BooksInLib) theEObject;
			T result = caseBooksInLib(booksInLib);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TestPackage.CHILDREN_BOOKS: {
			ChildrenBooks childrenBooks = (ChildrenBooks) theEObject;
			T result = caseChildrenBooks(childrenBooks);
			if (result == null)
				result = caseBookDefinition(childrenBooks);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TestPackage.DOCUMENT_ROOT: {
			DocumentRoot documentRoot = (DocumentRoot) theEObject;
			T result = caseDocumentRoot(documentRoot);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TestPackage.LIBRARY: {
			Library library = (Library) theEObject;
			T result = caseLibrary(library);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TestPackage.PUBLISHER_DEFINITION: {
			PublisherDefinition publisherDefinition = (PublisherDefinition) theEObject;
			T result = casePublisherDefinition(publisherDefinition);
			if (result == null)
				result = caseBookDefinition(publisherDefinition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TestPackage.RESOURCE_LINK: {
			ResourceLink resourceLink = (ResourceLink) theEObject;
			T result = caseResourceLink(resourceLink);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Adult Books</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *          the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Adult Books</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdultBooks(AdultBooks object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Book Definition</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
	 * terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *          the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Book Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBookDefinition(BookDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Book Definition Resource Link</em>'. <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *          the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Book Definition Resource Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBookDefinitionResourceLink(BookDefinitionResourceLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Books In Lib</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *          the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Books In Lib</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooksInLib(BooksInLib object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Children Books</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *          the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Children Books</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChildrenBooks(ChildrenBooks object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Root</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *          the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentRoot(DocumentRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Library</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *          the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Library</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLibrary(Library object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Publisher Definition</em>
	 * '. <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
	 * terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *          the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Publisher Definition</em>
	 *         '.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePublisherDefinition(PublisherDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Link</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *          the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceLink(ResourceLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will terminate
	 * the switch, but this is the last case anyway. <!-- end-user-doc -->
	 * 
	 * @param object
	 *          the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public T defaultCase(EObject object) {
		return null;
	}

} // TestSwitch

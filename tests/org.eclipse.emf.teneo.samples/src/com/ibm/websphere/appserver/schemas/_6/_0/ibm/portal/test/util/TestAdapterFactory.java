/**
 * <copyright>
 * </copyright>
 *
 * $Id: TestAdapterFactory.java,v 1.1 2007/12/13 06:52:44 mtaal Exp $
 */
package com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.util;

import com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> The <b>Adapter Factory</b> for the model. It provides an adapter
 * <code>createXXX</code> method for each class of the model. <!-- end-user-doc -->
 * 
 * @see com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.TestPackage
 * @generated
 */
public class TestAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected static TestPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public TestAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = TestPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object. <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is
	 * an instance object of the model. <!-- end-user-doc -->
	 * 
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch the delegates to the <code>createXXX</code> methods. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	protected TestSwitch<Adapter> modelSwitch = new TestSwitch<Adapter>() {
		@Override
		public Adapter caseAdultBooks(AdultBooks object) {
			return createAdultBooksAdapter();
		}

		@Override
		public Adapter caseBookDefinition(BookDefinition object) {
			return createBookDefinitionAdapter();
		}

		@Override
		public Adapter caseBookDefinitionResourceLink(BookDefinitionResourceLink object) {
			return createBookDefinitionResourceLinkAdapter();
		}

		@Override
		public Adapter caseBooksInLib(BooksInLib object) {
			return createBooksInLibAdapter();
		}

		@Override
		public Adapter caseChildrenBooks(ChildrenBooks object) {
			return createChildrenBooksAdapter();
		}

		@Override
		public Adapter caseDocumentRoot(DocumentRoot object) {
			return createDocumentRootAdapter();
		}

		@Override
		public Adapter caseLibrary(Library object) {
			return createLibraryAdapter();
		}

		@Override
		public Adapter casePublisherDefinition(PublisherDefinition object) {
			return createPublisherDefinitionAdapter();
		}

		@Override
		public Adapter caseResourceLink(ResourceLink object) {
			return createResourceLinkAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param target
	 *          the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.AdultBooks
	 * <em>Adult Books</em>}'. <!-- begin-user-doc --> This default implementation returns null so
	 * that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all
	 * the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.AdultBooks
	 * @generated
	 */
	public Adapter createAdultBooksAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.BookDefinition
	 * <em>Book Definition</em>}'. <!-- begin-user-doc --> This default implementation returns null so
	 * that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all
	 * the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.BookDefinition
	 * @generated
	 */
	public Adapter createBookDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.BookDefinitionResourceLink
	 * <em>Book Definition Resource Link</em>}'. <!-- begin-user-doc --> This default implementation
	 * returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.BookDefinitionResourceLink
	 * @generated
	 */
	public Adapter createBookDefinitionResourceLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.BooksInLib
	 * <em>Books In Lib</em>}'. <!-- begin-user-doc --> This default implementation returns null so
	 * that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all
	 * the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.BooksInLib
	 * @generated
	 */
	public Adapter createBooksInLibAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.ChildrenBooks
	 * <em>Children Books</em>}'. <!-- begin-user-doc --> This default implementation returns null so
	 * that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all
	 * the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.ChildrenBooks
	 * @generated
	 */
	public Adapter createChildrenBooksAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.DocumentRoot
	 * <em>Document Root</em>}'. <!-- begin-user-doc --> This default implementation returns null so
	 * that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all
	 * the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.Library <em>Library</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore
	 * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
	 * end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.Library
	 * @generated
	 */
	public Adapter createLibraryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.PublisherDefinition
	 * <em>Publisher Definition</em>}'. <!-- begin-user-doc --> This default implementation returns
	 * null so that we can easily ignore cases; it's useful to ignore a case when inheritance will
	 * catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.PublisherDefinition
	 * @generated
	 */
	public Adapter createPublisherDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.ResourceLink
	 * <em>Resource Link</em>}'. <!-- begin-user-doc --> This default implementation returns null so
	 * that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all
	 * the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.ResourceLink
	 * @generated
	 */
	public Adapter createResourceLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case. <!-- begin-user-doc --> This default implementation
	 * returns null. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} // TestAdapterFactory

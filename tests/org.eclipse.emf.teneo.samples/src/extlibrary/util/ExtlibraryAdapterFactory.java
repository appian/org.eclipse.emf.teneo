/**
 * <copyright>
 * </copyright>
 *
 * $Id: ExtlibraryAdapterFactory.java,v 1.1 2006/08/14 05:08:58 mtaal Exp $
 */
package extlibrary.util;

import extlibrary.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see extlibrary.ExtlibraryPackage
 * @generated
 */
public class ExtlibraryAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ExtlibraryPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtlibraryAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ExtlibraryPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch the delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExtlibrarySwitch modelSwitch =
		new ExtlibrarySwitch() {
			public Object caseBook(Book object) {
				return createBookAdapter();
			}
			public Object caseLibrary(Library object) {
				return createLibraryAdapter();
			}
			public Object caseWriter(Writer object) {
				return createWriterAdapter();
			}
			public Object caseItem(Item object) {
				return createItemAdapter();
			}
			public Object caseLendable(Lendable object) {
				return createLendableAdapter();
			}
			public Object caseCirculatingItem(CirculatingItem object) {
				return createCirculatingItemAdapter();
			}
			public Object casePeriodical(Periodical object) {
				return createPeriodicalAdapter();
			}
			public Object caseAudioVisualItem(AudioVisualItem object) {
				return createAudioVisualItemAdapter();
			}
			public Object caseBookOnTape(BookOnTape object) {
				return createBookOnTapeAdapter();
			}
			public Object caseVideoCassette(VideoCassette object) {
				return createVideoCassetteAdapter();
			}
			public Object caseBorrower(Borrower object) {
				return createBorrowerAdapter();
			}
			public Object casePerson(Person object) {
				return createPersonAdapter();
			}
			public Object caseEmployee(Employee object) {
				return createEmployeeAdapter();
			}
			public Object caseAddressable(Addressable object) {
				return createAddressableAdapter();
			}
			public Object defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	public Adapter createAdapter(Notifier target) {
		return (Adapter)modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link extlibrary.Book <em>Book</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see extlibrary.Book
	 * @generated
	 */
	public Adapter createBookAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link extlibrary.Library <em>Library</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see extlibrary.Library
	 * @generated
	 */
	public Adapter createLibraryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link extlibrary.Writer <em>Writer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see extlibrary.Writer
	 * @generated
	 */
	public Adapter createWriterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link extlibrary.Item <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see extlibrary.Item
	 * @generated
	 */
	public Adapter createItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link extlibrary.Lendable <em>Lendable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see extlibrary.Lendable
	 * @generated
	 */
	public Adapter createLendableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link extlibrary.CirculatingItem <em>Circulating Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see extlibrary.CirculatingItem
	 * @generated
	 */
	public Adapter createCirculatingItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link extlibrary.Periodical <em>Periodical</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see extlibrary.Periodical
	 * @generated
	 */
	public Adapter createPeriodicalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link extlibrary.AudioVisualItem <em>Audio Visual Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see extlibrary.AudioVisualItem
	 * @generated
	 */
	public Adapter createAudioVisualItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link extlibrary.BookOnTape <em>Book On Tape</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see extlibrary.BookOnTape
	 * @generated
	 */
	public Adapter createBookOnTapeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link extlibrary.VideoCassette <em>Video Cassette</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see extlibrary.VideoCassette
	 * @generated
	 */
	public Adapter createVideoCassetteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link extlibrary.Borrower <em>Borrower</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see extlibrary.Borrower
	 * @generated
	 */
	public Adapter createBorrowerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link extlibrary.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see extlibrary.Person
	 * @generated
	 */
	public Adapter createPersonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link extlibrary.Employee <em>Employee</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see extlibrary.Employee
	 * @generated
	 */
	public Adapter createEmployeeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link extlibrary.Addressable <em>Addressable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see extlibrary.Addressable
	 * @generated
	 */
	public Adapter createAddressableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ExtlibraryAdapterFactory

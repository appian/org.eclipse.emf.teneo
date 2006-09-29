/**
 * <copyright>
 * </copyright>
 *
 * $Id: LazyFactoryImpl.java,v 1.4 2006/09/29 12:30:05 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.annotations.lazy.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.teneo.samples.emf.annotations.lazy.Book;
import org.eclipse.emf.teneo.samples.emf.annotations.lazy.BookCategory;
import org.eclipse.emf.teneo.samples.emf.annotations.lazy.LazyFactory;
import org.eclipse.emf.teneo.samples.emf.annotations.lazy.LazyPackage;
import org.eclipse.emf.teneo.samples.emf.annotations.lazy.Library;
import org.eclipse.emf.teneo.samples.emf.annotations.lazy.Writer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LazyFactoryImpl extends EFactoryImpl implements LazyFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LazyFactory init() {
		try {
			LazyFactory theLazyFactory = (LazyFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/emf/teneo/samples/emf/annotations/lazy"); 
			if (theLazyFactory != null) {
				return theLazyFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new LazyFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LazyFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case LazyPackage.BOOK: return createBook();
			case LazyPackage.LIBRARY: return createLibrary();
			case LazyPackage.WRITER: return createWriter();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case LazyPackage.BOOK_CATEGORY:
				return createBookCategoryFromString(eDataType, initialValue);
			case LazyPackage.BOOK_CATEGORY_OBJECT:
				return createBookCategoryObjectFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case LazyPackage.BOOK_CATEGORY:
				return convertBookCategoryToString(eDataType, instanceValue);
			case LazyPackage.BOOK_CATEGORY_OBJECT:
				return convertBookCategoryObjectToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Book createBook() {
		BookImpl book = new BookImpl();
		return book;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Library createLibrary() {
		LibraryImpl library = new LibraryImpl();
		return library;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Writer createWriter() {
		WriterImpl writer = new WriterImpl();
		return writer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BookCategory createBookCategoryFromString(EDataType eDataType, String initialValue) {
		BookCategory result = BookCategory.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBookCategoryToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BookCategory createBookCategoryObjectFromString(EDataType eDataType, String initialValue) {
		return (BookCategory)createBookCategoryFromString(LazyPackage.Literals.BOOK_CATEGORY, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBookCategoryObjectToString(EDataType eDataType, Object instanceValue) {
		return convertBookCategoryToString(LazyPackage.Literals.BOOK_CATEGORY, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LazyPackage getLazyPackage() {
		return (LazyPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	public static LazyPackage getPackage() {
		return LazyPackage.eINSTANCE;
	}

} //LazyFactoryImpl

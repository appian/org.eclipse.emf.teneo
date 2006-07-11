/**
 * <copyright>
 * </copyright>
 *
 * $Id: SunBooksFactoryImpl.java,v 1.1 2006/07/11 16:56:58 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.sample.sunBooks.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.teneo.samples.emf.sample.sunBooks.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SunBooksFactoryImpl extends EFactoryImpl implements SunBooksFactory {
	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SunBooksFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case SunBooksPackage.AUTHORS_TYPE: return createAuthorsType();
			case SunBooksPackage.BOOKS_TYPE: return createBooksType();
			case SunBooksPackage.BOOK_TYPE: return createBookType();
			case SunBooksPackage.COLLECTION_TYPE: return createCollectionType();
			case SunBooksPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case SunBooksPackage.PROMOTION_TYPE: return createPromotionType();
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
			case SunBooksPackage.BOOK_CATEGORY_TYPE: {
				BookCategoryType result = BookCategoryType.get(initialValue);
				if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
				return result;
			}
			case SunBooksPackage.BOOK_CATEGORY_TYPE1: {
				BookCategoryType1 result = BookCategoryType1.get(initialValue);
				if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
				return result;
			}
			case SunBooksPackage.BOOK_CATEGORY_TYPE_OBJECT:
				return createBookCategoryTypeObjectFromString(eDataType, initialValue);
			case SunBooksPackage.BOOK_CATEGORY_TYPE_OBJECT1:
				return createBookCategoryTypeObject1FromString(eDataType, initialValue);
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
			case SunBooksPackage.BOOK_CATEGORY_TYPE:
				return instanceValue == null ? null : instanceValue.toString();
			case SunBooksPackage.BOOK_CATEGORY_TYPE1:
				return instanceValue == null ? null : instanceValue.toString();
			case SunBooksPackage.BOOK_CATEGORY_TYPE_OBJECT:
				return convertBookCategoryTypeObjectToString(eDataType, instanceValue);
			case SunBooksPackage.BOOK_CATEGORY_TYPE_OBJECT1:
				return convertBookCategoryTypeObject1ToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuthorsType createAuthorsType() {
		AuthorsTypeImpl authorsType = new AuthorsTypeImpl();
		return authorsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooksType createBooksType() {
		BooksTypeImpl booksType = new BooksTypeImpl();
		return booksType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BookType createBookType() {
		BookTypeImpl bookType = new BookTypeImpl();
		return bookType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectionType createCollectionType() {
		CollectionTypeImpl collectionType = new CollectionTypeImpl();
		return collectionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PromotionType createPromotionType() {
		PromotionTypeImpl promotionType = new PromotionTypeImpl();
		return promotionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BookCategoryType createBookCategoryTypeObjectFromString(EDataType eDataType, String initialValue) {
		return (BookCategoryType)SunBooksFactory.eINSTANCE.createFromString(SunBooksPackage.eINSTANCE.getBookCategoryType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBookCategoryTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return SunBooksFactory.eINSTANCE.convertToString(SunBooksPackage.eINSTANCE.getBookCategoryType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BookCategoryType1 createBookCategoryTypeObject1FromString(EDataType eDataType, String initialValue) {
		return (BookCategoryType1)SunBooksFactory.eINSTANCE.createFromString(SunBooksPackage.eINSTANCE.getBookCategoryType1(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBookCategoryTypeObject1ToString(EDataType eDataType, Object instanceValue) {
		return SunBooksFactory.eINSTANCE.convertToString(SunBooksPackage.eINSTANCE.getBookCategoryType1(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SunBooksPackage getSunBooksPackage() {
		return (SunBooksPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	public static SunBooksPackage getPackage() {
		return SunBooksPackage.eINSTANCE;
	}

} //SunBooksFactoryImpl

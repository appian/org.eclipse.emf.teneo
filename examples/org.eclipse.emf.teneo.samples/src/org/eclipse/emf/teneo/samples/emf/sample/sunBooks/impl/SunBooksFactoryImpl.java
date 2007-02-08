/**
 * <copyright>
 * </copyright>
 *
 * $Id: SunBooksFactoryImpl.java,v 1.2 2007/02/08 23:09:19 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.sample.sunBooks.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.teneo.samples.emf.sample.sunBooks.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SunBooksFactoryImpl extends EFactoryImpl implements SunBooksFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SunBooksFactory init() {
		try {
			SunBooksFactory theSunBooksFactory = (SunBooksFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/emf/teneo/samples/emf/sample/sun_books"); 
			if (theSunBooksFactory != null) {
				return theSunBooksFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SunBooksFactoryImpl();
	}

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
	@Override
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
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case SunBooksPackage.BOOK_CATEGORY_TYPE:
				return createBookCategoryTypeFromString(eDataType, initialValue);
			case SunBooksPackage.BOOK_CATEGORY_TYPE1:
				return createBookCategoryType1FromString(eDataType, initialValue);
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
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case SunBooksPackage.BOOK_CATEGORY_TYPE:
				return convertBookCategoryTypeToString(eDataType, instanceValue);
			case SunBooksPackage.BOOK_CATEGORY_TYPE1:
				return convertBookCategoryType1ToString(eDataType, instanceValue);
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
	public BookCategoryType createBookCategoryTypeFromString(EDataType eDataType, String initialValue) {
		BookCategoryType result = BookCategoryType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBookCategoryTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BookCategoryType1 createBookCategoryType1FromString(EDataType eDataType, String initialValue) {
		BookCategoryType1 result = BookCategoryType1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBookCategoryType1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BookCategoryType createBookCategoryTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createBookCategoryTypeFromString(SunBooksPackage.Literals.BOOK_CATEGORY_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBookCategoryTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertBookCategoryTypeToString(SunBooksPackage.Literals.BOOK_CATEGORY_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BookCategoryType1 createBookCategoryTypeObject1FromString(EDataType eDataType, String initialValue) {
		return createBookCategoryType1FromString(SunBooksPackage.Literals.BOOK_CATEGORY_TYPE1, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBookCategoryTypeObject1ToString(EDataType eDataType, Object instanceValue) {
		return convertBookCategoryType1ToString(SunBooksPackage.Literals.BOOK_CATEGORY_TYPE1, instanceValue);
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
	@Deprecated
	public static SunBooksPackage getPackage() {
		return SunBooksPackage.eINSTANCE;
	}

} //SunBooksFactoryImpl

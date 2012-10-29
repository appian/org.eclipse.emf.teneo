/**
 * <copyright>
 * </copyright>
 *
 * $Id: ExtlibraryFactoryImpl.java,v 1.1 2006/08/14 05:08:59 mtaal Exp $
 */
package extlibrary.impl;

import extlibrary.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!-- end-user-doc -->
 * 
 * @generated
 */
public class ExtlibraryFactoryImpl extends EFactoryImpl implements ExtlibraryFactory {
	/**
	 * Creates the default factory implementation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static ExtlibraryFactory init() {
		try {
			ExtlibraryFactory theExtlibraryFactory = (ExtlibraryFactory) EPackage.Registry.INSTANCE
					.getEFactory("http:///org/eclipse/emf/examples/library/extlibrary.ecore/1.0.0");
			if (theExtlibraryFactory != null) {
				return theExtlibraryFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ExtlibraryFactoryImpl();
	}

	/**
	 * Creates an instance of the factory. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ExtlibraryFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case ExtlibraryPackage.BOOK:
			return createBook();
		case ExtlibraryPackage.LIBRARY:
			return createLibrary();
		case ExtlibraryPackage.WRITER:
			return createWriter();
		case ExtlibraryPackage.BOOK_ON_TAPE:
			return createBookOnTape();
		case ExtlibraryPackage.VIDEO_CASSETTE:
			return createVideoCassette();
		case ExtlibraryPackage.BORROWER:
			return createBorrower();
		case ExtlibraryPackage.PERSON:
			return createPerson();
		case ExtlibraryPackage.EMPLOYEE:
			return createEmployee();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName()
					+ "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case ExtlibraryPackage.BOOK_CATEGORY:
			return createBookCategoryFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName()
					+ "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case ExtlibraryPackage.BOOK_CATEGORY:
			return convertBookCategoryToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName()
					+ "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Book createBook() {
		BookImpl book = new BookImpl();
		return book;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Library createLibrary() {
		LibraryImpl library = new LibraryImpl();
		return library;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Writer createWriter() {
		WriterImpl writer = new WriterImpl();
		return writer;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public BookOnTape createBookOnTape() {
		BookOnTapeImpl bookOnTape = new BookOnTapeImpl();
		return bookOnTape;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public VideoCassette createVideoCassette() {
		VideoCassetteImpl videoCassette = new VideoCassetteImpl();
		return videoCassette;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Borrower createBorrower() {
		BorrowerImpl borrower = new BorrowerImpl();
		return borrower;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Person createPerson() {
		PersonImpl person = new PersonImpl();
		return person;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Employee createEmployee() {
		EmployeeImpl employee = new EmployeeImpl();
		return employee;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public BookCategory createBookCategoryFromString(EDataType eDataType, String initialValue) {
		BookCategory result = BookCategory.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException("The value '" + initialValue
					+ "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertBookCategoryToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ExtlibraryPackage getExtlibraryPackage() {
		return (ExtlibraryPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @deprecated
	 * @generated
	 */
	public static ExtlibraryPackage getPackage() {
		return ExtlibraryPackage.eINSTANCE;
	}

} // ExtlibraryFactoryImpl

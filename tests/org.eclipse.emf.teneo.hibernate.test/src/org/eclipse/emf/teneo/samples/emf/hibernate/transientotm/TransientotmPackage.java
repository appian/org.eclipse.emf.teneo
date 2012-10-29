/**
 * <copyright>
 * </copyright>
 *
 * $Id: TransientotmPackage.java,v 1.1 2007/07/09 14:02:30 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.hibernate.transientotm;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc --> The <b>Package</b> for the model. It contains accessors for the meta
 * objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * 
 * @see org.eclipse.emf.teneo.samples.emf.hibernate.transientotm.TransientotmFactory
 * @model kind="package"
 * @generated
 */
public interface TransientotmPackage extends EPackage {
	/**
	 * The package name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNAME = "transientotm";

	/**
	 * The package namespace URI. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/emf/teneo/samples/emf/hibernate/transientotm";

	/**
	 * The package namespace name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_PREFIX = "transientotm";

	/**
	 * The singleton instance of the package. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	TransientotmPackage eINSTANCE = org.eclipse.emf.teneo.samples.emf.hibernate.transientotm.impl.TransientotmPackageImpl
			.init();

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.emf.teneo.samples.emf.hibernate.transientotm.impl.TBookImpl <em>TBook</em>}'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.teneo.samples.emf.hibernate.transientotm.impl.TBookImpl
	 * @see org.eclipse.emf.teneo.samples.emf.hibernate.transientotm.impl.TransientotmPackageImpl#getTBook()
	 * @generated
	 */
	int TBOOK = 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TBOOK__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Authors</b></em>' reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TBOOK__AUTHORS = 1;

	/**
	 * The number of structural features of the '<em>TBook</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TBOOK_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.emf.teneo.samples.emf.hibernate.transientotm.impl.TWriterImpl
	 * <em>TWriter</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.teneo.samples.emf.hibernate.transientotm.impl.TWriterImpl
	 * @see org.eclipse.emf.teneo.samples.emf.hibernate.transientotm.impl.TransientotmPackageImpl#getTWriter()
	 * @generated
	 */
	int TWRITER = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TWRITER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Book</b></em>' reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TWRITER__BOOK = 1;

	/**
	 * The number of structural features of the '<em>TWriter</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TWRITER_FEATURE_COUNT = 2;

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.emf.teneo.samples.emf.hibernate.transientotm.TBook <em>TBook</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>TBook</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.hibernate.transientotm.TBook
	 * @generated
	 */
	EClass getTBook();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.emf.teneo.samples.emf.hibernate.transientotm.TBook#getTitle <em>Title</em>}
	 * '. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.hibernate.transientotm.TBook#getTitle()
	 * @see #getTBook()
	 * @generated
	 */
	EAttribute getTBook_Title();

	/**
	 * Returns the meta object for the reference list '
	 * {@link org.eclipse.emf.teneo.samples.emf.hibernate.transientotm.TBook#getAuthors
	 * <em>Authors</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Authors</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.hibernate.transientotm.TBook#getAuthors()
	 * @see #getTBook()
	 * @generated
	 */
	EReference getTBook_Authors();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.emf.teneo.samples.emf.hibernate.transientotm.TWriter <em>TWriter</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>TWriter</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.hibernate.transientotm.TWriter
	 * @generated
	 */
	EClass getTWriter();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.emf.teneo.samples.emf.hibernate.transientotm.TWriter#getName <em>Name</em>}
	 * '. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.hibernate.transientotm.TWriter#getName()
	 * @see #getTWriter()
	 * @generated
	 */
	EAttribute getTWriter_Name();

	/**
	 * Returns the meta object for the reference '
	 * {@link org.eclipse.emf.teneo.samples.emf.hibernate.transientotm.TWriter#getBook <em>Book</em>}
	 * '. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Book</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.hibernate.transientotm.TWriter#getBook()
	 * @see #getTWriter()
	 * @generated
	 */
	EReference getTWriter_Book();

	/**
	 * Returns the factory that creates the instances of the model. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TransientotmFactory getTransientotmFactory();

	/**
	 * <!-- begin-user-doc --> Defines literals for the meta objects that represent
	 * <ul>
	 * <li>each class,</li>
	 * <li>each feature of each class,</li>
	 * <li>each enum,</li>
	 * <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.emf.teneo.samples.emf.hibernate.transientotm.impl.TBookImpl
		 * <em>TBook</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.emf.teneo.samples.emf.hibernate.transientotm.impl.TBookImpl
		 * @see org.eclipse.emf.teneo.samples.emf.hibernate.transientotm.impl.TransientotmPackageImpl#getTBook()
		 * @generated
		 */
		EClass TBOOK = eINSTANCE.getTBook();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute TBOOK__TITLE = eINSTANCE.getTBook_Title();

		/**
		 * The meta object literal for the '<em><b>Authors</b></em>' reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference TBOOK__AUTHORS = eINSTANCE.getTBook_Authors();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.emf.teneo.samples.emf.hibernate.transientotm.impl.TWriterImpl
		 * <em>TWriter</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.emf.teneo.samples.emf.hibernate.transientotm.impl.TWriterImpl
		 * @see org.eclipse.emf.teneo.samples.emf.hibernate.transientotm.impl.TransientotmPackageImpl#getTWriter()
		 * @generated
		 */
		EClass TWRITER = eINSTANCE.getTWriter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature. <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute TWRITER__NAME = eINSTANCE.getTWriter_Name();

		/**
		 * The meta object literal for the '<em><b>Book</b></em>' reference feature. <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference TWRITER__BOOK = eINSTANCE.getTWriter_Book();

	}

} // TransientotmPackage

/**
 * <copyright>
 * </copyright>
 *
 * $Id: EdatatypeColumnPackage.java,v 1.1 2006/09/06 21:58:59 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.annotations.edatatypeColumn;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.teneo.samples.emf.annotations.edatatypeColumn.EdatatypeColumnFactory
 * @model kind="package"
 * @generated
 */
public interface EdatatypeColumnPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "edatatypeColumn";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/emf/teneo/samples/emf/annotations/edatatype_column";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "edatatypeColumn";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EdatatypeColumnPackage eINSTANCE = org.eclipse.emf.teneo.samples.emf.annotations.edatatypeColumn.impl.EdatatypeColumnPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.annotations.edatatypeColumn.impl.BookImpl <em>Book</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.edatatypeColumn.impl.BookImpl
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.edatatypeColumn.impl.EdatatypeColumnPackageImpl#getBook()
	 * @generated
	 */
	int BOOK = 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Pages</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK__PAGES = 1;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK__WEIGHT = 2;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK__AUTHOR = 3;

	/**
	 * The number of structural features of the '<em>Book</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '<em>Pages Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.edatatypeColumn.impl.EdatatypeColumnPackageImpl#getPagesType()
	 * @generated
	 */
	int PAGES_TYPE = 1;

	/**
	 * The meta object id for the '<em>Pages Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Integer
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.edatatypeColumn.impl.EdatatypeColumnPackageImpl#getPagesTypeObject()
	 * @generated
	 */
	int PAGES_TYPE_OBJECT = 2;

	/**
	 * The meta object id for the '<em>Title Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.edatatypeColumn.impl.EdatatypeColumnPackageImpl#getTitleType()
	 * @generated
	 */
	int TITLE_TYPE = 3;

	/**
	 * The meta object id for the '<em>Weight Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.edatatypeColumn.impl.EdatatypeColumnPackageImpl#getWeightType()
	 * @generated
	 */
	int WEIGHT_TYPE = 4;


	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.annotations.edatatypeColumn.Book <em>Book</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Book</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.edatatypeColumn.Book
	 * @generated
	 */
	EClass getBook();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.annotations.edatatypeColumn.Book#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.edatatypeColumn.Book#getTitle()
	 * @see #getBook()
	 * @generated
	 */
	EAttribute getBook_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.annotations.edatatypeColumn.Book#getPages <em>Pages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pages</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.edatatypeColumn.Book#getPages()
	 * @see #getBook()
	 * @generated
	 */
	EAttribute getBook_Pages();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.annotations.edatatypeColumn.Book#getWeight <em>Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weight</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.edatatypeColumn.Book#getWeight()
	 * @see #getBook()
	 * @generated
	 */
	EAttribute getBook_Weight();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.annotations.edatatypeColumn.Book#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Author</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.edatatypeColumn.Book#getAuthor()
	 * @see #getBook()
	 * @generated
	 */
	EAttribute getBook_Author();

	/**
	 * Returns the meta object for data type '<em>Pages Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Pages Type</em>'.
	 * @model instanceClass="int"
	 *        annotation="teneo.jpa appinfo='@Column(updatable=\"false\" insertable=\"false\")'"
	 *        extendedMetaData="name='PagesType' baseType='http://www.eclipse.org/emf/2003/XMLType#int'" 
	 * @generated
	 */
	EDataType getPagesType();

	/**
	 * Returns the meta object for data type '{@link java.lang.Integer <em>Pages Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Pages Type Object</em>'.
	 * @see java.lang.Integer
	 * @model instanceClass="java.lang.Integer"
	 *        extendedMetaData="name='PagesType:Object' baseType='PagesType'" 
	 * @generated
	 */
	EDataType getPagesTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Title Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Title Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        annotation="teneo.jpa appinfo='@Column(name=\"mytitle\" unique=\"false\" length=\"50\")'"
	 *        extendedMetaData="name='TitleType' baseType='http://www.eclipse.org/emf/2003/XMLType#string'" 
	 * @generated
	 */
	EDataType getTitleType();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>Weight Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Weight Type</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        annotation="teneo.jpa appinfo='@Column(name=\"gewicht\" nullable=\"true\" precision=\"5\" scale=\"2\")'"
	 *        extendedMetaData="name='WeightType' baseType='http://www.eclipse.org/emf/2003/XMLType#decimal'" 
	 * @generated
	 */
	EDataType getWeightType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EdatatypeColumnFactory getEdatatypeColumnFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.emf.annotations.edatatypeColumn.impl.BookImpl <em>Book</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.emf.annotations.edatatypeColumn.impl.BookImpl
		 * @see org.eclipse.emf.teneo.samples.emf.annotations.edatatypeColumn.impl.EdatatypeColumnPackageImpl#getBook()
		 * @generated
		 */
		EClass BOOK = eINSTANCE.getBook();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOK__TITLE = eINSTANCE.getBook_Title();

		/**
		 * The meta object literal for the '<em><b>Pages</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOK__PAGES = eINSTANCE.getBook_Pages();

		/**
		 * The meta object literal for the '<em><b>Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOK__WEIGHT = eINSTANCE.getBook_Weight();

		/**
		 * The meta object literal for the '<em><b>Author</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOK__AUTHOR = eINSTANCE.getBook_Author();

		/**
		 * The meta object literal for the '<em>Pages Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.emf.annotations.edatatypeColumn.impl.EdatatypeColumnPackageImpl#getPagesType()
		 * @generated
		 */
		EDataType PAGES_TYPE = eINSTANCE.getPagesType();

		/**
		 * The meta object literal for the '<em>Pages Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Integer
		 * @see org.eclipse.emf.teneo.samples.emf.annotations.edatatypeColumn.impl.EdatatypeColumnPackageImpl#getPagesTypeObject()
		 * @generated
		 */
		EDataType PAGES_TYPE_OBJECT = eINSTANCE.getPagesTypeObject();

		/**
		 * The meta object literal for the '<em>Title Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.emf.teneo.samples.emf.annotations.edatatypeColumn.impl.EdatatypeColumnPackageImpl#getTitleType()
		 * @generated
		 */
		EDataType TITLE_TYPE = eINSTANCE.getTitleType();

		/**
		 * The meta object literal for the '<em>Weight Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see org.eclipse.emf.teneo.samples.emf.annotations.edatatypeColumn.impl.EdatatypeColumnPackageImpl#getWeightType()
		 * @generated
		 */
		EDataType WEIGHT_TYPE = eINSTANCE.getWeightType();

	}

} //EdatatypeColumnPackage

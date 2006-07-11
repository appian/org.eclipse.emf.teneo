/**
 * <copyright>
 * </copyright>
 *
 * $Id: BookCategoryType1.java,v 1.1 2006/07/11 16:57:16 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.sample.sunBooks;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Book Category Type1</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.teneo.samples.emf.sample.sunBooks.SunBooksPackage#getBookCategoryType1()
 * @model
 * @generated
 */
public final class BookCategoryType1 extends AbstractEnumerator {
	/**
	 * The '<em><b>Magazine</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Magazine</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MAGAZINE_LITERAL
	 * @model name="magazine"
	 * @generated
	 * @ordered
	 */
	public static final int MAGAZINE = 0;

	/**
	 * The '<em><b>Novel</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Novel</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NOVEL_LITERAL
	 * @model name="novel"
	 * @generated
	 * @ordered
	 */
	public static final int NOVEL = 1;

	/**
	 * The '<em><b>Fiction</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Fiction</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FICTION_LITERAL
	 * @model name="fiction"
	 * @generated
	 * @ordered
	 */
	public static final int FICTION = 2;

	/**
	 * The '<em><b>Other</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Other</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OTHER_LITERAL
	 * @model name="other"
	 * @generated
	 * @ordered
	 */
	public static final int OTHER = 3;

	/**
	 * The '<em><b>Magazine</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAGAZINE
	 * @generated
	 * @ordered
	 */
	public static final BookCategoryType1 MAGAZINE_LITERAL = new BookCategoryType1(MAGAZINE, "magazine");

	/**
	 * The '<em><b>Novel</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOVEL
	 * @generated
	 * @ordered
	 */
	public static final BookCategoryType1 NOVEL_LITERAL = new BookCategoryType1(NOVEL, "novel");

	/**
	 * The '<em><b>Fiction</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FICTION
	 * @generated
	 * @ordered
	 */
	public static final BookCategoryType1 FICTION_LITERAL = new BookCategoryType1(FICTION, "fiction");

	/**
	 * The '<em><b>Other</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER
	 * @generated
	 * @ordered
	 */
	public static final BookCategoryType1 OTHER_LITERAL = new BookCategoryType1(OTHER, "other");

	/**
	 * An array of all the '<em><b>Book Category Type1</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final BookCategoryType1[] VALUES_ARRAY =
		new BookCategoryType1[] {
			MAGAZINE_LITERAL,
			NOVEL_LITERAL,
			FICTION_LITERAL,
			OTHER_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Book Category Type1</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Book Category Type1</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BookCategoryType1 get(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BookCategoryType1 result = VALUES_ARRAY[i];
			if (result.toString().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Book Category Type1</b></em>' literal with the specified value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BookCategoryType1 get(int value) {
		switch (value) {
			case MAGAZINE: return MAGAZINE_LITERAL;
			case NOVEL: return NOVEL_LITERAL;
			case FICTION: return FICTION_LITERAL;
			case OTHER: return OTHER_LITERAL;
		}
		return null;	
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private BookCategoryType1(int value, String name) {
		super(value, name);
	}

} //BookCategoryType1

/**
 * <copyright>
 * </copyright>
 *
 * $Id: BookCategoryType1.java,v 1.2 2007/02/08 23:09:26 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.sample.sunBooks;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Book Category Type1</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.teneo.samples.emf.sample.sunBooks.SunBooksPackage#getBookCategoryType1()
 * @model
 * @generated
 */
public enum BookCategoryType1 implements Enumerator
{
	/**
	 * The '<em><b>Magazine</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAGAZINE
	 * @generated
	 * @ordered
	 */
	MAGAZINE_LITERAL(0, "magazine", "magazine"),
	/**
	 * The '<em><b>Novel</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOVEL
	 * @generated
	 * @ordered
	 */
	NOVEL_LITERAL(1, "novel", "novel"),
	/**
	 * The '<em><b>Fiction</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FICTION
	 * @generated
	 * @ordered
	 */
	FICTION_LITERAL(2, "fiction", "fiction"),
	/**
	 * The '<em><b>Other</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER
	 * @generated
	 * @ordered
	 */
	OTHER_LITERAL(3, "other", "other");
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
	public static final List<BookCategoryType1> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Book Category Type1</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BookCategoryType1 get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BookCategoryType1 result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Book Category Type1</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BookCategoryType1 getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BookCategoryType1 result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Book Category Type1</b></em>' literal with the specified integer value.
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private BookCategoryType1(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
}

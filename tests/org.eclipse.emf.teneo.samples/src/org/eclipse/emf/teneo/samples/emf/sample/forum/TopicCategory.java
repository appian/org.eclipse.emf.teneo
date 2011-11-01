/**
 * <copyright>
 * </copyright>
 *
 * $Id: TopicCategory.java,v 1.2 2007/02/08 23:09:25 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.sample.forum;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Topic Category</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.teneo.samples.emf.sample.forum.ForumPackage#getTopicCategory()
 * @model
 * @generated
 */
public enum TopicCategory implements Enumerator
{
	/**
	 * The '<em><b>Announcement</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANNOUNCEMENT
	 * @generated
	 * @ordered
	 */
	ANNOUNCEMENT_LITERAL(0, "Announcement", "Announcement"),
	/**
	 * The '<em><b>Guest Book</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GUEST_BOOK
	 * @generated
	 * @ordered
	 */
	GUEST_BOOK_LITERAL(1, "GuestBook", "GuestBook"),
	/**
	 * The '<em><b>Discussion</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISCUSSION
	 * @generated
	 * @ordered
	 */
	DISCUSSION_LITERAL(2, "Discussion", "Discussion");
	/**
	 * The '<em><b>Announcement</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Announcement</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ANNOUNCEMENT_LITERAL
	 * @model name="Announcement"
	 * @generated
	 * @ordered
	 */
	public static final int ANNOUNCEMENT = 0;

	/**
	 * The '<em><b>Guest Book</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Guest Book</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GUEST_BOOK_LITERAL
	 * @model name="GuestBook"
	 * @generated
	 * @ordered
	 */
	public static final int GUEST_BOOK = 1;

	/**
	 * The '<em><b>Discussion</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Discussion</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DISCUSSION_LITERAL
	 * @model name="Discussion"
	 * @generated
	 * @ordered
	 */
	public static final int DISCUSSION = 2;

	/**
	 * An array of all the '<em><b>Topic Category</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TopicCategory[] VALUES_ARRAY =
		new TopicCategory[] {
			ANNOUNCEMENT_LITERAL,
			GUEST_BOOK_LITERAL,
			DISCUSSION_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Topic Category</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TopicCategory> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Topic Category</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TopicCategory get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TopicCategory result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Topic Category</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TopicCategory getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TopicCategory result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Topic Category</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TopicCategory get(int value) {
		switch (value) {
			case ANNOUNCEMENT: return ANNOUNCEMENT_LITERAL;
			case GUEST_BOOK: return GUEST_BOOK_LITERAL;
			case DISCUSSION: return DISCUSSION_LITERAL;
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
	private TopicCategory(int value, String name, String literal) {
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

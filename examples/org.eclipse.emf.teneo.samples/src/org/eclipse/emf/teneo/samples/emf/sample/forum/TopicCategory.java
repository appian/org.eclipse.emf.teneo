/**
 * <copyright>
 * </copyright>
 *
 * $Id: TopicCategory.java,v 1.1 2006/07/11 16:57:15 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.sample.forum;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Topic Category</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.teneo.samples.emf.sample.forum.ForumPackage#getTopicCategory()
 * @model
 * @generated
 */
public final class TopicCategory extends AbstractEnumerator {
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
	 * The '<em><b>Announcement</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANNOUNCEMENT
	 * @generated
	 * @ordered
	 */
	public static final TopicCategory ANNOUNCEMENT_LITERAL = new TopicCategory(ANNOUNCEMENT, "Announcement");

	/**
	 * The '<em><b>Guest Book</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GUEST_BOOK
	 * @generated
	 * @ordered
	 */
	public static final TopicCategory GUEST_BOOK_LITERAL = new TopicCategory(GUEST_BOOK, "GuestBook");

	/**
	 * The '<em><b>Discussion</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISCUSSION
	 * @generated
	 * @ordered
	 */
	public static final TopicCategory DISCUSSION_LITERAL = new TopicCategory(DISCUSSION, "Discussion");

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
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Topic Category</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TopicCategory get(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TopicCategory result = VALUES_ARRAY[i];
			if (result.toString().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Topic Category</b></em>' literal with the specified value.
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
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private TopicCategory(int value, String name) {
		super(value, name);
	}

} //TopicCategory

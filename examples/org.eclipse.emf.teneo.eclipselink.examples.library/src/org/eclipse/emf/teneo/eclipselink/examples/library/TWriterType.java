/**
 * <copyright>
 * </copyright>
 *
 * $Id: TWriterType.java,v 1.3 2009/06/14 21:00:29 seberle Exp $
 */
package org.eclipse.emf.teneo.eclipselink.examples.library;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>TWriter Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.teneo.eclipselink.examples.library.LibraryPackage#getTWriterType()
 * @model
 * @generated
 */
public enum TWriterType implements Enumerator {
	/**
	 * The '<em><b>Typewriter</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TYPEWRITER_VALUE
	 * @generated
	 * @ordered
	 */
	TYPEWRITER(0, "Typewriter", "Typewriter"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Computer</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPUTER_VALUE
	 * @generated
	 * @ordered
	 */
	COMPUTER(1, "Computer", "Computer"); //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Typewriter</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Typewriter</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TYPEWRITER
	 * @model name="Typewriter"
	 * @generated
	 * @ordered
	 */
	public static final int TYPEWRITER_VALUE = 0;

	/**
	 * The '<em><b>Computer</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Computer</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COMPUTER
	 * @model name="Computer"
	 * @generated
	 * @ordered
	 */
	public static final int COMPUTER_VALUE = 1;

	/**
	 * An array of all the '<em><b>TWriter Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TWriterType[] VALUES_ARRAY =
		new TWriterType[] {
			TYPEWRITER,
			COMPUTER,
		};

	/**
	 * A public read-only list of all the '<em><b>TWriter Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TWriterType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>TWriter Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TWriterType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TWriterType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>TWriter Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TWriterType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TWriterType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>TWriter Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TWriterType get(int value) {
		switch (value) {
			case TYPEWRITER_VALUE: return TYPEWRITER;
			case COMPUTER_VALUE: return COMPUTER;
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
	private TWriterType(int value, String name, String literal) {
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
	
} //TWriterType

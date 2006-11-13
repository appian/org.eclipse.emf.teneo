/**
 * <copyright>
 * </copyright>
 *
 * $Id: CacheConcurrencyStrategy.java,v 1.2 2006/11/13 14:53:00 mtaal Exp $
 */
package org.eclipse.emf.teneo.hibernate.hbannotation;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc --> A representation of the literals of the enumeration '<em><b>Cache Concurrency Strategy</b></em>',
 * and utility methods for working with them. <!-- end-user-doc -->
 * 
 * @see org.eclipse.emf.teneo.hibernate.hbannotation.HbAnnotationPackage#getCacheConcurrencyStrategy()
 * @model
 * @generated
 */
public final class CacheConcurrencyStrategy extends AbstractEnumerator {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2005, 2006 Springsite BV (The Netherlands) and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public\nLicense v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n   Martin Taal\n   Douglas Bitting\n";

	/**
	 * The '<em><b>NONE</b></em>' literal value. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NONE</b></em>' literal object isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #NONE_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NONE = 0;

	/**
	 * The '<em><b>READ ONLY</b></em>' literal value. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>READ ONLY</b></em>' literal object isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #READ_ONLY_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int READ_ONLY = 1;

	/**
	 * The '<em><b>NONSTRICT READ WRITE</b></em>' literal value. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NONSTRICT READ WRITE</b></em>' literal object isn't clear, there really should be
	 * more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #NONSTRICT_READ_WRITE_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NONSTRICT_READ_WRITE = 2;

	/**
	 * The '<em><b>READ WRITE</b></em>' literal value. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>READ WRITE</b></em>' literal object isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #READ_WRITE_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int READ_WRITE = 3;

	/**
	 * The '<em><b>TRANSACTIONAL</b></em>' literal value. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TRANSACTIONAL</b></em>' literal object isn't clear, there really should be more of
	 * a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #TRANSACTIONAL_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TRANSACTIONAL = 4;

	/**
	 * The '<em><b>NONE</b></em>' literal object. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #NONE
	 * @generated
	 * @ordered
	 */
	public static final CacheConcurrencyStrategy NONE_LITERAL = new CacheConcurrencyStrategy(NONE, "NONE", "NONE");

	/**
	 * The '<em><b>READ ONLY</b></em>' literal object. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #READ_ONLY
	 * @generated
	 * @ordered
	 */
	public static final CacheConcurrencyStrategy READ_ONLY_LITERAL = new CacheConcurrencyStrategy(READ_ONLY,
			"READ_ONLY", "READ_ONLY");

	/**
	 * The '<em><b>NONSTRICT READ WRITE</b></em>' literal object. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #NONSTRICT_READ_WRITE
	 * @generated
	 * @ordered
	 */
	public static final CacheConcurrencyStrategy NONSTRICT_READ_WRITE_LITERAL = new CacheConcurrencyStrategy(
			NONSTRICT_READ_WRITE, "NONSTRICT_READ_WRITE", "NONSTRICT_READ_WRITE");

	/**
	 * The '<em><b>READ WRITE</b></em>' literal object. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #READ_WRITE
	 * @generated
	 * @ordered
	 */
	public static final CacheConcurrencyStrategy READ_WRITE_LITERAL = new CacheConcurrencyStrategy(READ_WRITE,
			"READ_WRITE", "READ_WRITE");

	/**
	 * The '<em><b>TRANSACTIONAL</b></em>' literal object. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #TRANSACTIONAL
	 * @generated
	 * @ordered
	 */
	public static final CacheConcurrencyStrategy TRANSACTIONAL_LITERAL = new CacheConcurrencyStrategy(TRANSACTIONAL,
			"TRANSACTIONAL", "TRANSACTIONAL");

	/**
	 * An array of all the '<em><b>Cache Concurrency Strategy</b></em>' enumerators. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	private static final CacheConcurrencyStrategy[] VALUES_ARRAY = new CacheConcurrencyStrategy[] { NONE_LITERAL,
			READ_ONLY_LITERAL, NONSTRICT_READ_WRITE_LITERAL, READ_WRITE_LITERAL, TRANSACTIONAL_LITERAL, };

	/**
	 * A public read-only list of all the '<em><b>Cache Concurrency Strategy</b></em>' enumerators. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Cache Concurrency Strategy</b></em>' literal with the specified literal value. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static CacheConcurrencyStrategy get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CacheConcurrencyStrategy result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Cache Concurrency Strategy</b></em>' literal with the specified name. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static CacheConcurrencyStrategy getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CacheConcurrencyStrategy result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Cache Concurrency Strategy</b></em>' literal with the specified integer value. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static CacheConcurrencyStrategy get(int value) {
		switch (value) {
		case NONE:
			return NONE_LITERAL;
		case READ_ONLY:
			return READ_ONLY_LITERAL;
		case NONSTRICT_READ_WRITE:
			return NONSTRICT_READ_WRITE_LITERAL;
		case READ_WRITE:
			return READ_WRITE_LITERAL;
		case TRANSACTIONAL:
			return TRANSACTIONAL_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private CacheConcurrencyStrategy(int value, String name, String literal) {
		super(value, name, literal);
	}

} // CacheConcurrencyStrategy

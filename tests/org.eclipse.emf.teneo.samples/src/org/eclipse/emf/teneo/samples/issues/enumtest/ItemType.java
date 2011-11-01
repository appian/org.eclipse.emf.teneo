/**
 * <copyright>
 * </copyright>
 *
 * $Id: ItemType.java,v 1.1 2006/07/11 16:57:03 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.enumtest;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Item Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.teneo.samples.issues.enumtest.EnumtestPackage#getItemType()
 * @model
 * @generated
 */
public final class ItemType extends AbstractEnumerator implements Serializable {
	/**
	 * The '<em><b>Product</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Product</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PRODUCT_LITERAL
	 * @model name="Product"
	 * @generated
	 * @ordered
	 */
	public static final int PRODUCT = 0;

	/**
	 * The '<em><b>Product Family</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Product Family</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PRODUCT_FAMILY_LITERAL
	 * @model name="ProductFamily"
	 * @generated
	 * @ordered
	 */
	public static final int PRODUCT_FAMILY = 1;

	/**
	 * The '<em><b>Product</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRODUCT
	 * @generated
	 * @ordered
	 */
	public static final ItemType PRODUCT_LITERAL = new ItemType(PRODUCT, "Product", "Product");

	/**
	 * The '<em><b>Product Family</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRODUCT_FAMILY
	 * @generated
	 * @ordered
	 */
	public static final ItemType PRODUCT_FAMILY_LITERAL = new ItemType(PRODUCT_FAMILY, "ProductFamily", "ProductFamily");

	/**
	 * An array of all the '<em><b>Item Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ItemType[] VALUES_ARRAY =
		new ItemType[] {
			PRODUCT_LITERAL,
			PRODUCT_FAMILY_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Item Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Item Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ItemType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ItemType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Item Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ItemType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ItemType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Item Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ItemType get(int value) {
		switch (value) {
			case PRODUCT: return PRODUCT_LITERAL;
			case PRODUCT_FAMILY: return PRODUCT_FAMILY_LITERAL;
		}
		return null;	
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ItemType(int value, String name, String literal) {
		super(value, name, literal);
	}

} //ItemType

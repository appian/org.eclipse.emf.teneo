/**
 * <copyright>
 * </copyright>
 *
 * $Id: ProductClassification.java,v 1.1 2006/07/11 16:56:59 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.elist.featuremap;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Product Classification</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.teneo.samples.emf.elist.featuremap.FeaturemapPackage#getProductClassification()
 * @model
 * @generated
 */
public final class ProductClassification extends AbstractEnumerator {
	/**
	 * The '<em><b>Normal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Normal</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NORMAL_LITERAL
	 * @model name="Normal"
	 * @generated
	 * @ordered
	 */
	public static final int NORMAL = 0;

	/**
	 * The '<em><b>Special</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Special</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SPECIAL_LITERAL
	 * @model name="Special"
	 * @generated
	 * @ordered
	 */
	public static final int SPECIAL = 1;

	/**
	 * The '<em><b>Normal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NORMAL
	 * @generated
	 * @ordered
	 */
	public static final ProductClassification NORMAL_LITERAL = new ProductClassification(NORMAL, "Normal");

	/**
	 * The '<em><b>Special</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPECIAL
	 * @generated
	 * @ordered
	 */
	public static final ProductClassification SPECIAL_LITERAL = new ProductClassification(SPECIAL, "Special");

	/**
	 * An array of all the '<em><b>Product Classification</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ProductClassification[] VALUES_ARRAY =
		new ProductClassification[] {
			NORMAL_LITERAL,
			SPECIAL_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Product Classification</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Product Classification</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ProductClassification get(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ProductClassification result = VALUES_ARRAY[i];
			if (result.toString().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Product Classification</b></em>' literal with the specified value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ProductClassification get(int value) {
		switch (value) {
			case NORMAL: return NORMAL_LITERAL;
			case SPECIAL: return SPECIAL_LITERAL;
		}
		return null;	
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ProductClassification(int value, String name) {
		super(value, name);
	}

} //ProductClassification

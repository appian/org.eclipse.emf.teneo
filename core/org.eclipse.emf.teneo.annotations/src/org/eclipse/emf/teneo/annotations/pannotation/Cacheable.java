/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.emf.teneo.annotations.pannotation;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Cacheable</b></em>'. <!--
 * end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.emf.teneo.annotations.pannotation.Cacheable#isValue <em>Value</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.emf.teneo.annotations.pannotation.PannotationPackage#getCacheable()
 * @model annotation="teneo/internal/Target 0='EClass'"
 * @generated
 */
public interface Cacheable extends PAnnotation {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute. The default value is
	 * <code>"false"</code>. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(boolean)
	 * @see org.eclipse.emf.teneo.annotations.pannotation.PannotationPackage#getCacheable_Value()
	 * @model default="false"
	 * @generated
	 */
	boolean isValue();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.annotations.pannotation.Cacheable#isValue
	 * <em>Value</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Value</em>' attribute.
	 * @see #isValue()
	 * @generated
	 */
	void setValue(boolean value);

} // Cacheable

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.emf.teneo.annotations.pannotation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Map Key Temporal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.annotations.pannotation.MapKeyTemporal#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.annotations.pannotation.PannotationPackage#getMapKeyTemporal()
 * @model annotation="teneo/internal/Target 0='EAttribute'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='AllowedElementType'"
 * @generated
 */
public interface MapKeyTemporal extends PAnnotation {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * The literals are from the enumeration {@link org.eclipse.emf.teneo.annotations.pannotation.TemporalType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.TemporalType
	 * @see #setValue(TemporalType)
	 * @see org.eclipse.emf.teneo.annotations.pannotation.PannotationPackage#getMapKeyTemporal_Value()
	 * @model default=""
	 * @generated
	 */
	TemporalType getValue();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.annotations.pannotation.MapKeyTemporal#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.TemporalType
	 * @see #getValue()
	 * @generated
	 */
	void setValue(TemporalType value);

} // MapKeyTemporal

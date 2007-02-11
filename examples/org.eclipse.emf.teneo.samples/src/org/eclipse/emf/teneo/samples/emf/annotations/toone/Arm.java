/**
 * <copyright>
 * </copyright>
 *
 * $Id: Arm.java,v 1.2 2007/02/11 21:54:11 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.annotations.toone;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arm</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.toone.Arm#getLength <em>Length</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.emf.annotations.toone.ToonePackage#getArm()
 * @model extendedMetaData="name='Arm' kind='elementOnly'"
 * @generated
 */
public interface Arm extends EObject {
	/**
	 * Returns the value of the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Length</em>' attribute.
	 * @see #isSetLength()
	 * @see #unsetLength()
	 * @see #setLength(int)
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.toone.ToonePackage#getArm_Length()
	 * @model unique="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int" required="true"
	 *        extendedMetaData="kind='element' name='length'"
	 * @generated
	 */
	int getLength();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.annotations.toone.Arm#getLength <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length</em>' attribute.
	 * @see #isSetLength()
	 * @see #unsetLength()
	 * @see #getLength()
	 * @generated
	 */
	void setLength(int value);

	/**
	 * Unsets the value of the '{@link org.eclipse.emf.teneo.samples.emf.annotations.toone.Arm#getLength <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLength()
	 * @see #getLength()
	 * @see #setLength(int)
	 * @generated
	 */
	void unsetLength();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.teneo.samples.emf.annotations.toone.Arm#getLength <em>Length</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Length</em>' attribute is set.
	 * @see #unsetLength()
	 * @see #getLength()
	 * @see #setLength(int)
	 * @generated
	 */
	boolean isSetLength();

} // Arm

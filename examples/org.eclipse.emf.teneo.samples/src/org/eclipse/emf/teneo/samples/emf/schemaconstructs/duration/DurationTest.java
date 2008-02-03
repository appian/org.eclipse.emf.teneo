/**
 * <copyright>
 * </copyright>
 *
 * $Id: DurationTest.java,v 1.1 2008/02/03 22:37:05 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.schemaconstructs.duration;

import javax.xml.datatype.Duration;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.duration.DurationTest#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.duration.DurationTest#getDuration <em>Duration</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.duration.DurationTest#getDurations <em>Durations</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.duration.DurationPackage#getDurationTest()
 * @model
 * @generated
 */
public interface DurationTest extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.duration.DurationPackage#getDurationTest_Name()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        annotation="teneo.jpa value='@Id'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.duration.DurationTest#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration</em>' attribute.
	 * @see #isSetDuration()
	 * @see #unsetDuration()
	 * @see #setDuration(Duration)
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.duration.DurationPackage#getDurationTest_Duration()
	 * @model unique="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Duration" required="true"
	 *        extendedMetaData="kind='element' name='doub'"
	 * @generated
	 */
	Duration getDuration();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.duration.DurationTest#getDuration <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' attribute.
	 * @see #isSetDuration()
	 * @see #unsetDuration()
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(Duration value);

	/**
	 * Unsets the value of the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.duration.DurationTest#getDuration <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDuration()
	 * @see #getDuration()
	 * @see #setDuration(Duration)
	 * @generated
	 */
	void unsetDuration();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.duration.DurationTest#getDuration <em>Duration</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Duration</em>' attribute is set.
	 * @see #unsetDuration()
	 * @see #getDuration()
	 * @see #setDuration(Duration)
	 * @generated
	 */
	boolean isSetDuration();

	/**
	 * Returns the value of the '<em><b>Durations</b></em>' attribute list.
	 * The list contents are of type {@link javax.xml.datatype.Duration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Durations</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Durations</em>' attribute list.
	 * @see #isSetDurations()
	 * @see #unsetDurations()
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.duration.DurationPackage#getDurationTest_Durations()
	 * @model unique="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Duration" required="true"
	 *        extendedMetaData="kind='element' name='doub'"
	 * @generated
	 */
	EList<Duration> getDurations();

	/**
	 * Unsets the value of the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.duration.DurationTest#getDurations <em>Durations</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDurations()
	 * @see #getDurations()
	 * @generated
	 */
	void unsetDurations();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.duration.DurationTest#getDurations <em>Durations</em>}' attribute list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Durations</em>' attribute list is set.
	 * @see #unsetDurations()
	 * @see #getDurations()
	 * @generated
	 */
	boolean isSetDurations();

} // DurationTest

/**
 * <copyright>
 * </copyright>
 *
 * $Id: Temporal.java,v 1.1 2008/04/17 11:33:39 mtaal Exp $
 */
package temporal;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Temporal</b></em>'. <!--
 * end-user-doc -->
 * 
 * <!-- begin-model-doc --> Documentation test Jean-Claude <!-- end-model-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link temporal.Temporal#getDate <em>Date</em>}</li>
 * <li>{@link temporal.Temporal#isContinuity <em>Continuity</em>}</li>
 * </ul>
 * </p>
 * 
 * @see temporal.TemporalPackage#getTemporal()
 * @model features="touchedAttributes versionHolder versionHolderContainment"
 *        touchedAttributesDataType="org.eclipse.emf.ecore.EByteArray"
 *        touchedAttributesSuppressedGetVisibility="true"
 *        touchedAttributesSuppressedSetVisibility="true" versionHolderType="temporal.VersionHolder"
 *        versionHolderOpposite="versions" versionHolderSuppressedGetVisibility="true"
 *        versionHolderSuppressedSetVisibility="true"
 *        versionHolderContainmentType="temporal.VersionHolder"
 *        versionHolderContainmentContainment="true"
 *        versionHolderContainmentSuppressedGetVisibility="true"
 *        versionHolderContainmentSuppressedSetVisibility="true"
 * @generated
 */
public interface Temporal extends EObject {
	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date</em>' attribute isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see temporal.TemporalPackage#getTemporal_Date()
	 * @model suppressedSetVisibility="true"
	 * @generated
	 */
	Date getDate();

	/**
	 * Returns the value of the '<em><b>Continuity</b></em>' attribute. The default value is
	 * <code>"true"</code>. <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * This flag indicates whether this Temporal represents a continuity or a version object. A
	 * continuity is an evolving object; it represents the current state of the temporal. The
	 * continuity moves through time. A version object is a snapshot of the state at the certain date.
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Continuity</em>' attribute.
	 * @see temporal.TemporalPackage#getTemporal_Continuity()
	 * @model default="true" derived="true" suppressedSetVisibility="true"
	 * @generated
	 */
	boolean isContinuity();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model annotation=
	 *        "http://www.eclipse.org/emf/2002/GenModel body='return <%temporal.mod.TemporalUtil%>.versionAt(this, date);'"
	 * @generated
	 */
	Temporal versionAt(Date date);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> This method creates a
	 * new version object (Temporal) and adds it to the list of versions. <!-- end-model-doc -->
	 * 
	 * @model annotation=
	 *        "http://www.eclipse.org/emf/2002/GenModel body='return <%temporal.mod.TemporalUtil%>.createVersion(this);'"
	 * @generated
	 */
	Temporal createVersion();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> This method tests
	 * whether the given date falls within the date range that this version represents. The range is
	 * based on the granularity of the version. For example say we have a temporal with a date of Jan
	 * 1, 2007 and a granularity of Year. This method will return true for any date within the year
	 * 2007.
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * 
	 * @model annotation=
	 *        "http://www.eclipse.org/emf/2002/GenModel body='return <%temporal.mod.TemporalUtil%>.isDateWithinVersion(this, date);'"
	 * @generated
	 */
	boolean isDateWithinVersion(Date date);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> jcc
	 * 
	 * <!-- end-model-doc -->
	 * 
	 * @model annotation=
	 *        "http://www.eclipse.org/emf/2002/GenModel body='return <%temporal.mod.TemporalUtil%>.continuity(this);'"
	 * @generated
	 */
	Temporal continuity();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> jcc
	 * 
	 * <!-- end-model-doc -->
	 * 
	 * @model annotation=
	 *        "http://www.eclipse.org/emf/2002/GenModel body='return <%temporal.mod.TemporalUtil%>.currentVersion(this);'"
	 * @generated
	 */
	Temporal currentVersion();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> jcc
	 * 
	 * <!-- end-model-doc -->
	 * 
	 * @model many="false" annotation=
	 *        "http://www.eclipse.org/emf/2002/GenModel body='return <%temporal.mod.TemporalUtil%>.versions(this);'"
	 * @generated
	 */
	EList versions();

} // Temporal

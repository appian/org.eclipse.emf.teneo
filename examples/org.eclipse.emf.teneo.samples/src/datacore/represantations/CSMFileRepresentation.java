/**
 * <copyright>
 * </copyright>
 *
 * $Id: CSMFileRepresentation.java,v 1.1 2007/03/07 23:34:08 mtaal Exp $
 */
package datacore.represantations;

import datacore.CSMRepresentation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CSM File Representation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link datacore.represantations.CSMFileRepresentation#getLocation <em>Location</em>}</li>
 * </ul>
 * </p>
 *
 * @see datacore.represantations.RepresantationsPackage#getCSMFileRepresentation()
 * @model
 * @generated
 */
public interface CSMFileRepresentation extends CSMRepresentation {
	/**
	 * Returns the value of the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' attribute.
	 * @see #setLocation(String)
	 * @see datacore.represantations.RepresantationsPackage#getCSMFileRepresentation_Location()
	 * @model
	 * @generated
	 */
	String getLocation();

	/**
	 * Sets the value of the '{@link datacore.represantations.CSMFileRepresentation#getLocation <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' attribute.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(String value);

} // CSMFileRepresentation

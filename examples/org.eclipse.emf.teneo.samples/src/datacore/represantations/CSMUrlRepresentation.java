/**
 * <copyright>
 * </copyright>
 *
 * $Id: CSMUrlRepresentation.java,v 1.1 2007/03/07 23:34:08 mtaal Exp $
 */
package datacore.represantations;

import datacore.CSMRepresentation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CSM Url Representation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link datacore.represantations.CSMUrlRepresentation#getUrl <em>Url</em>}</li>
 * </ul>
 * </p>
 *
 * @see datacore.represantations.RepresantationsPackage#getCSMUrlRepresentation()
 * @model
 * @generated
 */
public interface CSMUrlRepresentation extends CSMRepresentation {
	/**
	 * Returns the value of the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Url</em>' attribute.
	 * @see #setUrl(String)
	 * @see datacore.represantations.RepresantationsPackage#getCSMUrlRepresentation_Url()
	 * @model
	 * @generated
	 */
	String getUrl();

	/**
	 * Sets the value of the '{@link datacore.represantations.CSMUrlRepresentation#getUrl <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' attribute.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(String value);

} // CSMUrlRepresentation

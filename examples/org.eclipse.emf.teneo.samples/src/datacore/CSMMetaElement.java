/**
 * <copyright>
 * </copyright>
 *
 * $Id: CSMMetaElement.java,v 1.1 2007/03/07 23:34:08 mtaal Exp $
 */
package datacore;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CSM Meta Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link datacore.CSMMetaElement#getID <em>ID</em>}</li>
 *   <li>{@link datacore.CSMMetaElement#getUserProperties <em>User Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @see datacore.DatacorePackage#getCSMMetaElement()
 * @model abstract="true"
 * @generated
 */
public interface CSMMetaElement extends CSMElement {
	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(String)
	 * @see datacore.DatacorePackage#getCSMMetaElement_ID()
	 * @model
	 * @generated
	 */
	String getID();

	/**
	 * Sets the value of the '{@link datacore.CSMMetaElement#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(String value);

	/**
	 * Returns the value of the '<em><b>User Properties</b></em>' containment reference list.
	 * The list contents are of type {@link datacore.UserProperty}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Properties</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Properties</em>' containment reference list.
	 * @see datacore.DatacorePackage#getCSMMetaElement_UserProperties()
	 * @model type="datacore.UserProperty" containment="true"
	 * @generated
	 */
	EList<UserProperty> getUserProperties();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void putUserProperty(String key, String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	UserProperty getUserProperty(String key);

} // CSMMetaElement

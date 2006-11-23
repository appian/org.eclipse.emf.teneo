/**
 * <copyright>
 * </copyright>
 *
 * $Id: Publisher.java,v 1.1 2006/11/23 06:12:07 mtaal Exp $
 */
package lobj;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Publisher</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link lobj.Publisher#getPublishername <em>Publishername</em>}</li>
 *   <li>{@link lobj.Publisher#getAddress <em>Address</em>}</li>
 * </ul>
 * </p>
 *
 * @see lobj.LobjPackage#getPublisher()
 * @model extendedMetaData="name='publisher' kind='elementOnly'"
 * @generated
 */
public interface Publisher extends EObject {
	/**
	 * Returns the value of the '<em><b>Publishername</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Publishername</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Publishername</em>' attribute.
	 * @see #setPublishername(String)
	 * @see lobj.LobjPackage#getPublisher_Publishername()
	 * @model unique="false" required="true"
	 *        extendedMetaData="kind='element' name='publishername' namespace='##targetNamespace'"
	 * @generated
	 */
	String getPublishername();

	/**
	 * Sets the value of the '{@link lobj.Publisher#getPublishername <em>Publishername</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Publishername</em>' attribute.
	 * @see #getPublishername()
	 * @generated
	 */
	void setPublishername(String value);

	/**
	 * Returns the value of the '<em><b>Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Address</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address</em>' containment reference.
	 * @see #setAddress(Address)
	 * @see lobj.LobjPackage#getPublisher_Address()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='address' namespace='##targetNamespace'"
	 * @generated
	 */
	Address getAddress();

	/**
	 * Sets the value of the '{@link lobj.Publisher#getAddress <em>Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' containment reference.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(Address value);

} // Publisher
/**
 * <copyright>
 * </copyright>
 *
 * $Id: Author.java,v 1.3 2007/03/28 13:56:49 mtaal Exp $
 */
package lobj;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Author</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link lobj.Author#getCredittype <em>Credittype</em>}</li>
 *   <li>{@link lobj.Author#getPerson <em>Person</em>}</li>
 *   <li>{@link lobj.Author#getAddress <em>Address</em>}</li>
 *   <li>{@link lobj.Author#getEmail <em>Email</em>}</li>
 *   <li>{@link lobj.Author#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see lobj.LobjPackage#getAuthor()
 * @model extendedMetaData="kind='elementOnly'"
 * @generated
 */
public interface Author extends EObject {
	/**
	 * Returns the value of the '<em><b>Credittype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Credittype</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Credittype</em>' attribute.
	 * @see #setCredittype(String)
	 * @see lobj.LobjPackage#getAuthor_Credittype()
	 * @model unique="false"
	 *        extendedMetaData="kind='element'"
	 * @generated
	 */
	String getCredittype();

	/**
	 * Sets the value of the '{@link lobj.Author#getCredittype <em>Credittype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Credittype</em>' attribute.
	 * @see #getCredittype()
	 * @generated
	 */
	void setCredittype(String value);

	/**
	 * Returns the value of the '<em><b>Person</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Person</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Person</em>' containment reference.
	 * @see #setPerson(Person)
	 * @see lobj.LobjPackage#getAuthor_Person()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' namespace='##targetNamespace'"
	 * @generated
	 */
	Person getPerson();

	/**
	 * Sets the value of the '{@link lobj.Author#getPerson <em>Person</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Person</em>' containment reference.
	 * @see #getPerson()
	 * @generated
	 */
	void setPerson(Person value);

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
	 * @see lobj.LobjPackage#getAuthor_Address()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' namespace='##targetNamespace'"
	 * @generated
	 */
	Address getAddress();

	/**
	 * Sets the value of the '{@link lobj.Author#getAddress <em>Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' containment reference.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(Address value);

	/**
	 * Returns the value of the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Email</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email</em>' attribute.
	 * @see #setEmail(String)
	 * @see lobj.LobjPackage#getAuthor_Email()
	 * @model unique="false"
	 *        extendedMetaData="kind='element'"
	 * @generated
	 */
	String getEmail();

	/**
	 * Sets the value of the '{@link lobj.Author#getEmail <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email</em>' attribute.
	 * @see #getEmail()
	 * @generated
	 */
	void setEmail(String value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see lobj.LobjPackage#getAuthor_Id()
	 * @model unique="false" id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link lobj.Author#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // Author

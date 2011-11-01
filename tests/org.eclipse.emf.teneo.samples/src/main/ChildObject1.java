/**
 * <copyright>
 * </copyright>
 *
 * $Id: ChildObject1.java,v 1.1 2006/09/21 00:56:52 mtaal Exp $
 */
package main;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Child Object1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link main.ChildObject1#getLinkedObject <em>Linked Object</em>}</li>
 * </ul>
 * </p>
 *
 * @see main.MainPackage#getChildObject1()
 * @model
 * @generated
 */
public interface ChildObject1 extends BaseObject {
	/**
	 * Returns the value of the '<em><b>Linked Object</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link main.BaseObject#getObject1 <em>Object1</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Linked Object</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Linked Object</em>' reference.
	 * @see #setLinkedObject(BaseObject)
	 * @see main.MainPackage#getChildObject1_LinkedObject()
	 * @see main.BaseObject#getObject1
	 * @model opposite="object1"
	 * @generated
	 */
	BaseObject getLinkedObject();

	/**
	 * Sets the value of the '{@link main.ChildObject1#getLinkedObject <em>Linked Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Linked Object</em>' reference.
	 * @see #getLinkedObject()
	 * @generated
	 */
	void setLinkedObject(BaseObject value);

} // ChildObject1
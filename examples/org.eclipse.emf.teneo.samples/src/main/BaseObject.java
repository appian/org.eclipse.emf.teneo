/**
 * <copyright>
 * </copyright>
 *
 * $Id: BaseObject.java,v 1.1 2006/09/21 00:56:52 mtaal Exp $
 */
package main;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Base Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link main.BaseObject#getObject1 <em>Object1</em>}</li>
 * </ul>
 * </p>
 *
 * @see main.MainPackage#getBaseObject()
 * @model
 * @generated
 */
public interface BaseObject extends BaseComponent {
	/**
	 * Returns the value of the '<em><b>Object1</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link main.ChildObject1#getLinkedObject <em>Linked Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object1</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object1</em>' reference.
	 * @see #setObject1(ChildObject1)
	 * @see main.MainPackage#getBaseObject_Object1()
	 * @see main.ChildObject1#getLinkedObject
	 * @model opposite="linkedObject"
	 * @generated
	 */
	ChildObject1 getObject1();

	/**
	 * Sets the value of the '{@link main.BaseObject#getObject1 <em>Object1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object1</em>' reference.
	 * @see #getObject1()
	 * @generated
	 */
	void setObject1(ChildObject1 value);

} // BaseObject
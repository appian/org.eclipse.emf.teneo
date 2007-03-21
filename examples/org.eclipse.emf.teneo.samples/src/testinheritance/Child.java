/**
 * <copyright>
 * </copyright>
 *
 * $Id: Child.java,v 1.1.2.2 2007/03/21 16:09:28 mtaal Exp $
 */
package testinheritance;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Child</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link testinheritance.Child#getAge <em>Age</em>}</li>
 * </ul>
 * </p>
 *
 * @see testinheritance.TestinheritancePackage#getChild()
 * @model
 * @generated
 */
public interface Child extends ParentZero, ParentTwo {
	/**
	 * Returns the value of the '<em><b>Age</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Age</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Age</em>' attribute.
	 * @see #setAge(long)
	 * @see testinheritance.TestinheritancePackage#getChild_Age()
	 * @model
	 * @generated
	 */
	long getAge();

	/**
	 * Sets the value of the '{@link testinheritance.Child#getAge <em>Age</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Age</em>' attribute.
	 * @see #getAge()
	 * @generated
	 */
	void setAge(long value);

} // Child
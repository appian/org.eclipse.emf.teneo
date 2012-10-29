/**
 * <copyright>
 * </copyright>
 *
 * $Id: Child2.java,v 1.1 2007/03/21 15:45:36 mtaal Exp $
 */
package testinheritance;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Child2</b></em>'. <!--
 * end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link testinheritance.Child2#getAge <em>Age</em>}</li>
 * </ul>
 * </p>
 * 
 * @see testinheritance.TestinheritancePackage#getChild2()
 * @model
 * @generated
 */
public interface Child2 extends ParentZero, ParentOne, ParentTwo {
	/**
	 * Returns the value of the '<em><b>Age</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Age</em>' attribute isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Age</em>' attribute.
	 * @see #setAge(long)
	 * @see testinheritance.TestinheritancePackage#getChild2_Age()
	 * @model
	 * @generated
	 */
	long getAge();

	/**
	 * Sets the value of the '{@link testinheritance.Child2#getAge <em>Age</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Age</em>' attribute.
	 * @see #getAge()
	 * @generated
	 */
	void setAge(long value);

} // Child2

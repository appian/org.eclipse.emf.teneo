/**
 * <copyright>
 * </copyright>
 *
 * $Id: SomeReference.java,v 1.1 2007/03/29 22:13:50 mtaal Exp $
 */
package testinheritance;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Some Reference</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link testinheritance.SomeReference#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 * 
 * @see testinheritance.TestinheritancePackage#getSomeReference()
 * @model
 * @generated
 */
public interface SomeReference extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see testinheritance.TestinheritancePackage#getSomeReference_Name()
	 * @model annotation="teneo.jpa appinfo='@Id'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link testinheritance.SomeReference#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // SomeReference

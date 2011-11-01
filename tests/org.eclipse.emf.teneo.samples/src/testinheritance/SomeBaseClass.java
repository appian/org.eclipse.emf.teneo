/**
 * <copyright>
 * </copyright>
 *
 * $Id: SomeBaseClass.java,v 1.1 2007/03/18 22:28:33 mtaal Exp $
 */
package testinheritance;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Some Base Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link testinheritance.SomeBaseClass#getAnotherProperty <em>Another Property</em>}</li>
 * </ul>
 * </p>
 *
 * @see testinheritance.TestinheritancePackage#getSomeBaseClass()
 * @model
 * @generated
 */
public interface SomeBaseClass extends EObject {
	/**
	 * Returns the value of the '<em><b>Another Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Another Property</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Another Property</em>' attribute.
	 * @see #setAnotherProperty(long)
	 * @see testinheritance.TestinheritancePackage#getSomeBaseClass_AnotherProperty()
	 * @model
	 * @generated
	 */
	long getAnotherProperty();

	/**
	 * Sets the value of the '{@link testinheritance.SomeBaseClass#getAnotherProperty <em>Another Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Another Property</em>' attribute.
	 * @see #getAnotherProperty()
	 * @generated
	 */
	void setAnotherProperty(long value);

} // SomeBaseClass

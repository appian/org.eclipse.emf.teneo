/**
 * <copyright>
 * </copyright>
 *
 * $Id: ParentOne.java,v 1.1 2007/03/21 15:45:36 mtaal Exp $
 */
package testinheritance;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Parent One</b></em>'. <!--
 * end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link testinheritance.ParentOne#getAnotherProperty <em>Another Property</em>}</li>
 * </ul>
 * </p>
 * 
 * @see testinheritance.TestinheritancePackage#getParentOne()
 * @model
 * @generated
 */
public interface ParentOne extends EObject {
	/**
	 * Returns the value of the '<em><b>Another Property</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Another Property</em>' attribute isn't clear, there really should be
	 * more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Another Property</em>' attribute.
	 * @see #setAnotherProperty(long)
	 * @see testinheritance.TestinheritancePackage#getParentOne_AnotherProperty()
	 * @model
	 * @generated
	 */
	long getAnotherProperty();

	/**
	 * Sets the value of the '{@link testinheritance.ParentOne#getAnotherProperty
	 * <em>Another Property</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Another Property</em>' attribute.
	 * @see #getAnotherProperty()
	 * @generated
	 */
	void setAnotherProperty(long value);

} // ParentOne

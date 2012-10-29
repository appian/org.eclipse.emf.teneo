/**
 * <copyright>
 * </copyright>
 *
 * $Id: ParentTwo.java,v 1.2 2007/03/29 22:13:50 mtaal Exp $
 */
package testinheritance;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Parent Two</b></em>'. <!--
 * end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link testinheritance.ParentTwo#getTestId <em>Test Id</em>}</li>
 * <li>{@link testinheritance.ParentTwo#getSomeReference <em>Some Reference</em>}</li>
 * </ul>
 * </p>
 * 
 * @see testinheritance.TestinheritancePackage#getParentTwo()
 * @model annotation="teneo.jpa appinfo='@MappedSuperclass'"
 * @generated
 */
public interface ParentTwo extends EObject {
	/**
	 * Returns the value of the '<em><b>Test Id</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Test Id</em>' attribute isn't clear, there really should be more of
	 * a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Test Id</em>' attribute.
	 * @see #setTestId(long)
	 * @see testinheritance.TestinheritancePackage#getParentTwo_TestId()
	 * @model annotation="teneo.jpa appinfo='@Id'"
	 * @generated
	 */
	long getTestId();

	/**
	 * Sets the value of the '{@link testinheritance.ParentTwo#getTestId <em>Test Id</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Test Id</em>' attribute.
	 * @see #getTestId()
	 * @generated
	 */
	void setTestId(long value);

	/**
	 * Returns the value of the '<em><b>Some Reference</b></em>' reference. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Some Reference</em>' reference isn't clear, there really should be
	 * more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Some Reference</em>' reference.
	 * @see #setSomeReference(SomeReference)
	 * @see testinheritance.TestinheritancePackage#getParentTwo_SomeReference()
	 * @model required="true"
	 * @generated
	 */
	SomeReference getSomeReference();

	/**
	 * Sets the value of the '{@link testinheritance.ParentTwo#getSomeReference
	 * <em>Some Reference</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Some Reference</em>' reference.
	 * @see #getSomeReference()
	 * @generated
	 */
	void setSomeReference(SomeReference value);

} // ParentTwo

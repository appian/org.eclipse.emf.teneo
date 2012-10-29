/**
 * <copyright>
 * </copyright>
 *
 * $Id: SomeOtherBaseClass.java,v 1.3 2007/07/09 12:55:21 mtaal Exp $
 */
package testinheritance;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Some Other Base Class</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link testinheritance.SomeOtherBaseClass#getProperty <em>Property</em>}</li>
 * <li>{@link testinheritance.SomeOtherBaseClass#getNameValuePairs <em>Name Value Pairs</em>}</li>
 * </ul>
 * </p>
 * 
 * @see testinheritance.TestinheritancePackage#getSomeOtherBaseClass()
 * @model annotation="teneo.jpa value='@MappedSuperclass'"
 * @generated
 */
public interface SomeOtherBaseClass extends EObject {
	/**
	 * Returns the value of the '<em><b>Property</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property</em>' attribute isn't clear, there really should be more of
	 * a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Property</em>' attribute.
	 * @see #setProperty(String)
	 * @see testinheritance.TestinheritancePackage#getSomeOtherBaseClass_Property()
	 * @model
	 * @generated
	 */
	String getProperty();

	/**
	 * Sets the value of the '{@link testinheritance.SomeOtherBaseClass#getProperty <em>Property</em>}
	 * ' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Property</em>' attribute.
	 * @see #getProperty()
	 * @generated
	 */
	void setProperty(String value);

	/**
	 * Returns the value of the '<em><b>Name Value Pairs</b></em>' reference list. The list contents
	 * are of type {@link testinheritance.NameValuePair}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name Value Pairs</em>' reference list isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Name Value Pairs</em>' reference list.
	 * @see testinheritance.TestinheritancePackage#getSomeOtherBaseClass_NameValuePairs()
	 * @model
	 * @generated
	 */
	EList<NameValuePair> getNameValuePairs();

} // SomeOtherBaseClass

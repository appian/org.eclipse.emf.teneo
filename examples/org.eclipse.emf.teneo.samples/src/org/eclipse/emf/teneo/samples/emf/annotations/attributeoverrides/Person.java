/**
 * <copyright>
 * </copyright>
 *
 * $Id: Person.java,v 1.2 2006/09/04 15:42:25 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.annotations.attributeoverrides;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Test MappedSuperclass annotation
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.attributeoverrides.Person#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.attributeoverrides.Person#getBornIn <em>Born In</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.attributeoverrides.Person#getLivesIn <em>Lives In</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.emf.annotations.attributeoverrides.AttributeoverridesPackage#getPerson()
 * @model
 * @generated
 */
public interface Person extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.attributeoverrides.AttributeoverridesPackage#getPerson_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.annotations.attributeoverrides.Person#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Born In</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Born In</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Born In</em>' reference.
	 * @see #setBornIn(City)
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.attributeoverrides.AttributeoverridesPackage#getPerson_BornIn()
	 * @model required="true"
	 *        annotation="http://annotation.elver.org/AttributeOverride name='name' column='c1'"
	 *        annotation="http://annotation.elver.org/Column/c1 name='bornNameColumn'"
	 * @generated
	 */
	City getBornIn();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.annotations.attributeoverrides.Person#getBornIn <em>Born In</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Born In</em>' reference.
	 * @see #getBornIn()
	 * @generated
	 */
	void setBornIn(City value);

	/**
	 * Returns the value of the '<em><b>Lives In</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lives In</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lives In</em>' reference.
	 * @see #setLivesIn(City)
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.attributeoverrides.AttributeoverridesPackage#getPerson_LivesIn()
	 * @model required="true"
	 *        annotation="http://annotation.elver.org/AttributeOverride/a1 name='name' column='c1'"
	 *        annotation="http://annotation.elver.org/Column/c1 name='nameColumn'"
	 *        annotation="http://annotation.elver.org/AttributeOverride/a2 name='country' column='c2'"
	 *        annotation="http://annotation.elver.org/Column/c2 name='countryColumn'"
	 * @generated
	 */
	City getLivesIn();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.annotations.attributeoverrides.Person#getLivesIn <em>Lives In</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lives In</em>' reference.
	 * @see #getLivesIn()
	 * @generated
	 */
	void setLivesIn(City value);

} // Person

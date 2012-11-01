/**
 * <copyright>
 * </copyright>
 *
 * $Id: Person.java,v 1.3 2006/11/07 10:22:28 mtaal Exp $
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
	 *        annotation="teneo.jpa appinfo='@Embedded\n@AttributeOverride(name=\"name\" column=@Column(name=\"bornNameColumn\"))'"
	 *        annotation="teneo.jpa.auditing appinfo='@Embedded\n@AttributeOverride(name=\"name\" column=@Column(name=\"bornNameColumn\"))'"
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
	 *        annotation="teneo.jpa appinfo='@Embedded\n@AttributeOverrides({\n\t@AttributeOverride(name=\"name\" column=@Column(name=\"nameColumn\")),\n\t@AttributeOverride(name=\"country\" column=@Column(name=\"countryColumn\"))\n})'"
	 *        annotation="teneo.jpa.auditing appinfo='@Embedded\n@AttributeOverrides({\n\t@AttributeOverride(name=\"name\" column=@Column(name=\"nameColumn\")),\n\t@AttributeOverride(name=\"country\" column=@Column(name=\"countryColumn\"))\n})'"
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

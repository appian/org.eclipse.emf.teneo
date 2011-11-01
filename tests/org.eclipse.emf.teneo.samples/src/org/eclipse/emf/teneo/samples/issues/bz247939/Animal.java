/**
 * <copyright>
 * </copyright>
 *
 * $Id: Animal.java,v 1.1 2008/09/20 21:20:21 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.bz247939;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Animal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz247939.Animal#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.issues.bz247939.Bz247939Package#getAnimal()
 * @model annotation="teneo.jpa appinfo='@Entity\r\n@Table(name = \"ANIMAL\")\r\n@Inheritance(strategy = InheritanceType.SINGLE_TABLE)\r\n@DiscriminatorValue(\"Animal\")\r\n@DiscriminatorColumn(name = \"ANIMAL_TYPE\", discriminatorType = DiscriminatorType.STRING)\r\n'"
 * @generated
 */
public interface Animal extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(Long)
	 * @see org.eclipse.emf.teneo.samples.issues.bz247939.Bz247939Package#getAnimal_Id()
	 * @model id="true"
	 *        annotation="teneo.jpa appinfo='@Id\r\n@Column(name = \"ANIMAL_ID\")\r\n@GeneratedValue\r\n'"
	 * @generated
	 */
	Long getId();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.issues.bz247939.Animal#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(Long value);

} // Animal

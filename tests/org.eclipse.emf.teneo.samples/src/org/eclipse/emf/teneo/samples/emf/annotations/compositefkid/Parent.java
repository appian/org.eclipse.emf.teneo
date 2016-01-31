/**
 */
package org.eclipse.emf.teneo.samples.emf.annotations.compositefkid;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.compositefkid.Parent#getRelations <em>Relations</em>}</li>
 * </ul>
 *
 * @see org.eclipse.emf.teneo.samples.emf.annotations.compositefkid.CompositefkidPackage#getParent()
 * @model annotation="teneo.jpa appinfo='@PrimaryKeyJoinColumns({\n\t@PrimaryKeyJoinColumn(name=\"mySuperFirstName\"),\n\t@PrimaryKeyJoinColumn(name=\"mySuperLastName\")\n})'"
 * @generated
 */
public interface Parent extends Person {
	/**
	 * Returns the value of the '<em><b>Relations</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.samples.emf.annotations.compositefkid.Person}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relations</em>' reference list.
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.compositefkid.CompositefkidPackage#getParent_Relations()
	 * @model annotation="teneo.jpa appinfo='@JoinColumns({\n\t@JoinColumn(name=\"myParentFirstName\", referencedColumnName=\"firstName\"),\n\t@JoinColumn(name=\"myParentLastName\", referencedColumnName=\"lastName\")\n})'"
	 * @generated
	 */
	EList<Person> getRelations();

} // Parent

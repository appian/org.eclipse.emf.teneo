/**
 * <copyright>
 * </copyright>
 *
 * $Id: Cat.java,v 1.1 2008/09/20 21:20:21 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.bz247939;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cat</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz247939.Cat#getOwner <em>Owner</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.issues.bz247939.Bz247939Package#getCat()
 * @model annotation="teneo.jpa appinfo='@Entity\r\n@SecondaryTable(name = \"CAT\", pkJoinColumns={@PrimaryKeyJoinColumn(name=\"ANIMAL_ID\")})\r\n@DiscriminatorValue(\"Cat\")'"
 * @generated
 */
public interface Cat extends Animal {
	/**
	 * Returns the value of the '<em><b>Owner</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.emf.teneo.samples.issues.bz247939.Owner#getOwnedCats <em>Owned Cats</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' reference.
	 * @see #setOwner(Owner)
	 * @see org.eclipse.emf.teneo.samples.issues.bz247939.Bz247939Package#getCat_Owner()
	 * @see org.eclipse.emf.teneo.samples.issues.bz247939.Owner#getOwnedCats
	 * @model opposite="ownedCats"
	 *        annotation="teneo.jpa appinfo='@ManyToOne(cascade = {CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})\r\n@JoinColumn(table = \"CAT\", name = \"CAT_OWNER_ID\")'"
	 * @generated
	 */
	Owner getOwner();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.issues.bz247939.Cat#getOwner <em>Owner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' reference.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(Owner value);

} // Cat

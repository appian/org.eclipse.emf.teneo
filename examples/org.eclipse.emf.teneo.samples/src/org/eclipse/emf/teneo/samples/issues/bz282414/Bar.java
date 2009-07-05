/**
 * <copyright>
 * </copyright>
 *
 * $Id: Bar.java,v 1.1 2009/07/05 00:09:05 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.bz282414;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bar</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz282414.Bar#getBarKey <em>Bar Key</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.issues.bz282414.Bz282414Package#getBar()
 * @model annotation="teneo.jpa appinfo='@Entity\n\t\t\t\t@Table(name=\"BAR_TABLE\")'"
 *        extendedMetaData="name='Bar' kind='elementOnly'"
 * @generated
 */
public interface Bar extends EObject {
	/**
	 * Returns the value of the '<em><b>Bar Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bar Key</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bar Key</em>' containment reference.
	 * @see #setBarKey(BarKey)
	 * @see org.eclipse.emf.teneo.samples.issues.bz282414.Bz282414Package#getBar_BarKey()
	 * @model containment="true" required="true"
	 *        annotation="teneo.jpa appinfo='\n\t\t\t\t\t\t@Embedded @AttributeOverrides({@AttributeOverride(name=\"groupId\",\n\t\t\t\t\t\tcolumn=@Column(name=\"GRP_ID\")),@AttributeOverride(name=\"classId\",\n\t\t\t\t\t\tcolumn=@Column(name=\"CLAS_ID\"))})\n'"
	 *        extendedMetaData="kind='element' name='barKey'"
	 * @generated
	 */
	BarKey getBarKey();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.issues.bz282414.Bar#getBarKey <em>Bar Key</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bar Key</em>' containment reference.
	 * @see #getBarKey()
	 * @generated
	 */
	void setBarKey(BarKey value);

} // Bar

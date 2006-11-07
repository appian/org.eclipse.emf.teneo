/**
 * <copyright>
 * </copyright>
 *
 * $Id: Head.java,v 1.2 2006/11/07 10:22:28 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.annotations.toone;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Head</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.toone.Head#getHairColor <em>Hair Color</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.toone.Head#getPerson <em>Person</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.emf.annotations.toone.ToonePackage#getHead()
 * @model extendedMetaData="name='Head' kind='elementOnly'"
 * @generated
 */
public interface Head extends EObject {
	/**
	 * Returns the value of the '<em><b>Hair Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hair Color</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hair Color</em>' attribute.
	 * @see #setHairColor(String)
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.toone.ToonePackage#getHead_HairColor()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='hairColor'"
	 * @generated
	 */
	String getHairColor();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.annotations.toone.Head#getHairColor <em>Hair Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hair Color</em>' attribute.
	 * @see #getHairColor()
	 * @generated
	 */
	void setHairColor(String value);

	/**
	 * Returns the value of the '<em><b>Person</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.emf.teneo.samples.emf.annotations.toone.Person#getHead <em>Head</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Person</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Person</em>' reference.
	 * @see #setPerson(Person)
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.toone.ToonePackage#getHead_Person()
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.toone.Person#getHead
	 * @model opposite="head" resolveProxies="false" required="true"
	 *        annotation="teneo.jpa appinfo='\n\t\t\t\t\t\t@OneToOne(fetch=EAGER cascade={MERGE,PERSIST,REFRESH} targetEntity=\"Person\" optional=false mappedBy=\"head\")\n\t\t\t\t\t'"
	 *        extendedMetaData="kind='element' name='person'"
	 * @generated
	 */
	Person getPerson();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.annotations.toone.Head#getPerson <em>Person</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Person</em>' reference.
	 * @see #getPerson()
	 * @generated
	 */
	void setPerson(Person value);

} // Head

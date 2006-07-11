/**
 * <copyright>
 * </copyright>
 *
 * $Id: NotContainedChildNRT.java,v 1.1 2006/07/11 16:57:09 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.relation.relation1to1;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Not Contained Child NRT</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.relation.relation1to1.NotContainedChildNRT#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.relation.relation1to1.NotContainedChildNRT#getMain <em>Main</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.emf.relation.relation1to1.Relation1to1Package#getNotContainedChildNRT()
 * @model extendedMetaData="name='NotContainedChildNRT' kind='elementOnly'"
 * @generated
 */
public interface NotContainedChildNRT extends EObject{
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
	 * @see org.eclipse.emf.teneo.samples.emf.relation.relation1to1.Relation1to1Package#getNotContainedChildNRT_Name()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='Name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.relation.relation1to1.NotContainedChildNRT#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Main</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.emf.teneo.samples.emf.relation.relation1to1.Main#getNotcontainedtwowaynotrequired <em>Notcontainedtwowaynotrequired</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Main</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Main</em>' reference.
	 * @see #setMain(Main)
	 * @see org.eclipse.emf.teneo.samples.emf.relation.relation1to1.Relation1to1Package#getNotContainedChildNRT_Main()
	 * @see org.eclipse.emf.teneo.samples.emf.relation.relation1to1.Main#getNotcontainedtwowaynotrequired
	 * @model opposite="notcontainedtwowaynotrequired" required="true"
	 *        extendedMetaData="kind='element' name='main'"
	 * @generated
	 */
	Main getMain();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.relation.relation1to1.NotContainedChildNRT#getMain <em>Main</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Main</em>' reference.
	 * @see #getMain()
	 * @generated
	 */
	void setMain(Main value);

} // NotContainedChildNRT

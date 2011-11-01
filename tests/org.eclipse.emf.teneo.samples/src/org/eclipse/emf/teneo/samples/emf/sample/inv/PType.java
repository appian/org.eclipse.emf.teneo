/**
 * <copyright>
 * </copyright>
 *
 * $Id: PType.java,v 1.2 2006/11/07 10:22:27 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.sample.inv;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PType</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.inv.PType#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.inv.PType#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.inv.PType#getBase <em>Base</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.inv.PType#getSubTypes <em>Sub Types</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.inv.PType#getSubNOTypes <em>Sub NO Types</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.inv.PType#getInfoReferences <em>Info References</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.emf.sample.inv.InventoryPackage#getPType()
 * @model
 * @generated
 */
public interface PType extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(long)
	 * @see org.eclipse.emf.teneo.samples.emf.sample.inv.InventoryPackage#getPType_Id()
	 * @model id="true" ordered="false"
	 *        annotation="teneo.jpa appinfo='@Id\n@GeneratedValue'"
	 * @generated
	 */
	long getId();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.inv.PType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(long value);

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
	 * @see org.eclipse.emf.teneo.samples.emf.sample.inv.InventoryPackage#getPType_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.inv.PType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Base</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.emf.teneo.samples.emf.sample.inv.PType#getSubTypes <em>Sub Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base</em>' reference.
	 * @see #setBase(PType)
	 * @see org.eclipse.emf.teneo.samples.emf.sample.inv.InventoryPackage#getPType_Base()
	 * @see org.eclipse.emf.teneo.samples.emf.sample.inv.PType#getSubTypes
	 * @model opposite="subTypes"
	 * @generated
	 */
	PType getBase();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.inv.PType#getBase <em>Base</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base</em>' reference.
	 * @see #getBase()
	 * @generated
	 */
	void setBase(PType value);

	/**
	 * Returns the value of the '<em><b>Sub Types</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.samples.emf.sample.inv.PType}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.emf.teneo.samples.emf.sample.inv.PType#getBase <em>Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Types</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Types</em>' reference list.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.inv.InventoryPackage#getPType_SubTypes()
	 * @see org.eclipse.emf.teneo.samples.emf.sample.inv.PType#getBase
	 * @model type="org.eclipse.emf.teneo.samples.emf.sample.inv.PType" opposite="base" ordered="false"
	 *        annotation="teneo.jpa appinfo='@OneToMany(indexed=false)'"
	 * @generated
	 */
	EList getSubTypes();

	/**
	 * Returns the value of the '<em><b>Sub NO Types</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.samples.emf.sample.inv.PType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub NO Types</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub NO Types</em>' reference list.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.inv.InventoryPackage#getPType_SubNOTypes()
	 * @model type="org.eclipse.emf.teneo.samples.emf.sample.inv.PType" ordered="false"
	 *        annotation="teneo.jpa appinfo='@OneToMany(indexed=false)'"
	 * @generated
	 */
	EList getSubNOTypes();

	/**
	 * Returns the value of the '<em><b>Info References</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.samples.emf.sample.inv.PDeclaration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Info References</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Info References</em>' reference list.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.inv.InventoryPackage#getPType_InfoReferences()
	 * @model type="org.eclipse.emf.teneo.samples.emf.sample.inv.PDeclaration"
	 *        annotation="teneo.jpa appinfo='@OneToMany(indexed=false)'"
	 * @generated
	 */
	EList getInfoReferences();

} // PType

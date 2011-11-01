/**
 * <copyright>
 * </copyright>
 *
 * $Id: DataCenter.java,v 1.1 2008/04/06 13:45:43 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.bz225296_2.ops;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Center</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.DataCenter#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.DataCenter#getHost <em>Host</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.DataCenter#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.DataCenter#getModified <em>Modified</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.DataCenter#getRevision <em>Revision</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.DataCenter#getDescription <em>Description</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.OpsPackage#getDataCenter()
 * @model annotation="teneo.jpa appinfo='@Table(name=\"ops_datacenter\")'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='Default'"
 *        annotation="webamg.emf user.key='name'"
 * @generated
 */
public interface DataCenter extends EObject {
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
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.OpsPackage#getDataCenter_Name()
	 * @model annotation="teneo.jpa appinfo='@Column(unique=\"true\")'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.DataCenter#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Host</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.Host}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.Host#getDataCenter <em>Data Center</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Host</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host</em>' containment reference list.
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.OpsPackage#getDataCenter_Host()
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.Host#getDataCenter
	 * @model opposite="dataCenter" containment="true"
	 *        annotation="teneo.jpa appinfo='@JoinColumn(name=\"datacenter_id\")'"
	 *        annotation="teneo.jpa appinfo='@OneToMany(indexed=\"false\" )'"
	 *        annotation="teneo.hibernate appinfo='@Fetch(SUBSELECT)'"
	 * @generated
	 */
	EList<Host> getHost();

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
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.OpsPackage#getDataCenter_Id()
	 * @model annotation="teneo.jpa appinfo='@GeneratedValue'"
	 *        annotation="teneo.jpa appinfo='@Id'"
	 * @generated
	 */
	long getId();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.DataCenter#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(long value);

	/**
	 * Returns the value of the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modified</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modified</em>' attribute.
	 * @see #setModified(Date)
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.OpsPackage#getDataCenter_Modified()
	 * @model unique="false"
	 *        annotation="teneo.jpa appinfo='@Temporal(TIMESTAMP)'"
	 *        annotation="teneo.jpa appinfo='@Column(columnDefinition=\"timestamp\" insertable=\"false\" updatable=\"false\")'"
	 *        annotation="teneo.hibernate appinfo='@Generated(ALWAYS)'"
	 * @generated
	 */
	Date getModified();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.DataCenter#getModified <em>Modified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modified</em>' attribute.
	 * @see #getModified()
	 * @generated
	 */
	void setModified(Date value);

	/**
	 * Returns the value of the '<em><b>Revision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Revision</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Revision</em>' attribute.
	 * @see #setRevision(int)
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.OpsPackage#getDataCenter_Revision()
	 * @model unique="false"
	 *        annotation="teneo.jpa appinfo='@Version'"
	 *        annotation="teneo.jpa appinfo='@Column(name=\"e_version\")'"
	 * @generated
	 */
	int getRevision();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.DataCenter#getRevision <em>Revision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Revision</em>' attribute.
	 * @see #getRevision()
	 * @generated
	 */
	void setRevision(int value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.OpsPackage#getDataCenter_Description()
	 * @model annotation="teneo.jpa appinfo='@Lob'"
	 *        annotation="teneo.jpa appinfo='@Column(length=64000)'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.DataCenter#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // DataCenter

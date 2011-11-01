/**
 * <copyright>
 * </copyright>
 *
 * $Id: HostBlock.java,v 1.1 2008/04/06 13:45:43 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.bz225296_2.ops;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Host Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.HostBlock#getHost <em>Host</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.HostBlock#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.HostBlock#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.HostBlock#getModified <em>Modified</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.HostBlock#getRevision <em>Revision</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.HostBlock#getAgent <em>Agent</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.HostBlock#getService <em>Service</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.OpsPackage#getHostBlock()
 * @model annotation="teneo.jpa appinfo='@Table(name=\"ops_hostblock\")'"
 *        annotation="webamg.emf user.key='id'"
 * @generated
 */
public interface HostBlock extends EObject {
	/**
	 * Returns the value of the '<em><b>Host</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.Host#getBlock <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Host</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host</em>' container reference.
	 * @see #setHost(Host)
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.OpsPackage#getHostBlock_Host()
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.Host#getBlock
	 * @model opposite="block" transient="false"
	 *        annotation="teneo.jpa appinfo='@JoinColumn(name=\"host_id\")'"
	 * @generated
	 */
	Host getHost();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.HostBlock#getHost <em>Host</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host</em>' container reference.
	 * @see #getHost()
	 * @generated
	 */
	void setHost(Host value);

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
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.OpsPackage#getHostBlock_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.HostBlock#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

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
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.OpsPackage#getHostBlock_Id()
	 * @model annotation="teneo.jpa appinfo='@GeneratedValue'"
	 *        annotation="teneo.jpa appinfo='@Id'"
	 * @generated
	 */
	long getId();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.HostBlock#getId <em>Id</em>}' attribute.
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
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.OpsPackage#getHostBlock_Modified()
	 * @model unique="false"
	 *        annotation="teneo.jpa appinfo='@Temporal(TIMESTAMP)'"
	 *        annotation="teneo.jpa appinfo='@Column(columnDefinition=\"timestamp\" insertable=\"false\" updatable=\"false\")'"
	 *        annotation="teneo.hibernate appinfo='@Generated(ALWAYS)'"
	 * @generated
	 */
	Date getModified();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.HostBlock#getModified <em>Modified</em>}' attribute.
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
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.OpsPackage#getHostBlock_Revision()
	 * @model unique="false"
	 *        annotation="teneo.jpa appinfo='@Version'"
	 *        annotation="teneo.jpa appinfo='@Column(name=\"e_version\")'"
	 * @generated
	 */
	int getRevision();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.HostBlock#getRevision <em>Revision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Revision</em>' attribute.
	 * @see #getRevision()
	 * @generated
	 */
	void setRevision(int value);

	/**
	 * Returns the value of the '<em><b>Agent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Agent</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Agent</em>' attribute.
	 * @see #setAgent(String)
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.OpsPackage#getHostBlock_Agent()
	 * @model
	 * @generated
	 */
	String getAgent();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.HostBlock#getAgent <em>Agent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Agent</em>' attribute.
	 * @see #getAgent()
	 * @generated
	 */
	void setAgent(String value);

	/**
	 * Returns the value of the '<em><b>Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service</em>' attribute.
	 * @see #setService(String)
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.OpsPackage#getHostBlock_Service()
	 * @model
	 * @generated
	 */
	String getService();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.HostBlock#getService <em>Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service</em>' attribute.
	 * @see #getService()
	 * @generated
	 */
	void setService(String value);

} // HostBlock

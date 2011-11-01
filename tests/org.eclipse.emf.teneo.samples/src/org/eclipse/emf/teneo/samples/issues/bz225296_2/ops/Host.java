/**
 * <copyright>
 * </copyright>
 *
 * $Id: Host.java,v 1.1 2008/04/06 13:45:43 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.bz225296_2.ops;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Host</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.Host#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.Host#getDataCenter <em>Data Center</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.Host#getVserver <em>Vserver</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.Host#getIp <em>Ip</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.Host#getOwnIp <em>Own Ip</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.Host#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.Host#getModified <em>Modified</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.Host#getRevision <em>Revision</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.Host#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.Host#getNetwork <em>Network</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.Host#getProviderId <em>Provider Id</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.Host#getGateway <em>Gateway</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.Host#getBlock <em>Block</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.OpsPackage#getHost()
 * @model annotation="teneo.jpa appinfo='@Table(name=\"ops_host\")'"
 *        annotation="webamg.emf user.key='name'"
 * @generated
 */
public interface Host extends EObject {
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
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.OpsPackage#getHost_Name()
	 * @model annotation="teneo.jpa appinfo='@Column(unique=\"true\")'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.Host#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Data Center</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.DataCenter#getHost <em>Host</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Center</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Center</em>' container reference.
	 * @see #setDataCenter(DataCenter)
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.OpsPackage#getHost_DataCenter()
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.DataCenter#getHost
	 * @model opposite="host" transient="false"
	 *        annotation="teneo.jpa appinfo='@JoinColumn(name=\"datacenter_id\")'"
	 * @generated
	 */
	DataCenter getDataCenter();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.Host#getDataCenter <em>Data Center</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Center</em>' container reference.
	 * @see #getDataCenter()
	 * @generated
	 */
	void setDataCenter(DataCenter value);

	/**
	 * Returns the value of the '<em><b>Vserver</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.VServer}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.VServer#getHost <em>Host</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vserver</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vserver</em>' containment reference list.
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.OpsPackage#getHost_Vserver()
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.VServer#getHost
	 * @model opposite="host" containment="true"
	 *        annotation="teneo.jpa appinfo='@JoinColumn(name=\"host_id\")'"
	 *        annotation="teneo.jpa appinfo='@OneToMany(indexed=\"false\" )'"
	 *        annotation="teneo.hibernate appinfo='@Fetch(SUBSELECT)'"
	 * @generated
	 */
	EList<VServer> getVserver();

	/**
	 * Returns the value of the '<em><b>Ip</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.IP}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.IP#getHost <em>Host</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ip</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ip</em>' containment reference list.
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.OpsPackage#getHost_Ip()
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.IP#getHost
	 * @model opposite="host" containment="true"
	 *        annotation="teneo.jpa appinfo='@JoinColumn(name=\"host_id\")'"
	 *        annotation="teneo.jpa appinfo='@OneToMany(indexed=\"false\" )'"
	 *        annotation="teneo.hibernate appinfo='@Fetch(SUBSELECT)'"
	 * @generated
	 */
	EList<IP> getIp();

	/**
	 * Returns the value of the '<em><b>Own Ip</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Own Ip</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Own Ip</em>' reference.
	 * @see #setOwnIp(IP)
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.OpsPackage#getHost_OwnIp()
	 * @model annotation="teneo.jpa appinfo='@JoinColumn(name=\"ownip_id\")'"
	 * @generated
	 */
	IP getOwnIp();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.Host#getOwnIp <em>Own Ip</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Own Ip</em>' reference.
	 * @see #getOwnIp()
	 * @generated
	 */
	void setOwnIp(IP value);

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
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.OpsPackage#getHost_Id()
	 * @model annotation="teneo.jpa appinfo='@GeneratedValue'"
	 *        annotation="teneo.jpa appinfo='@Id'"
	 * @generated
	 */
	long getId();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.Host#getId <em>Id</em>}' attribute.
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
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.OpsPackage#getHost_Modified()
	 * @model unique="false"
	 *        annotation="teneo.jpa appinfo='@Temporal(TIMESTAMP)'"
	 *        annotation="teneo.jpa appinfo='@Column(columnDefinition=\"timestamp\" insertable=\"false\" updatable=\"false\")'"
	 *        annotation="teneo.hibernate appinfo='@Generated(ALWAYS)'"
	 * @generated
	 */
	Date getModified();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.Host#getModified <em>Modified</em>}' attribute.
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
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.OpsPackage#getHost_Revision()
	 * @model unique="false"
	 *        annotation="teneo.jpa appinfo='@Version'"
	 *        annotation="teneo.jpa appinfo='@Column(name=\"e_version\")'"
	 * @generated
	 */
	int getRevision();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.Host#getRevision <em>Revision</em>}' attribute.
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
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.OpsPackage#getHost_Description()
	 * @model annotation="teneo.jpa appinfo='@Lob'"
	 *        annotation="teneo.jpa appinfo='@Column(length=64000)'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.Host#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Network</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Network</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Network</em>' attribute.
	 * @see #setNetwork(String)
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.OpsPackage#getHost_Network()
	 * @model annotation="teneo.jpa appinfo='@Lob'"
	 *        annotation="teneo.jpa appinfo='@Column(length=64000)'"
	 * @generated
	 */
	String getNetwork();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.Host#getNetwork <em>Network</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Network</em>' attribute.
	 * @see #getNetwork()
	 * @generated
	 */
	void setNetwork(String value);

	/**
	 * Returns the value of the '<em><b>Provider Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provider Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provider Id</em>' attribute.
	 * @see #setProviderId(String)
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.OpsPackage#getHost_ProviderId()
	 * @model annotation="teneo.jpa appinfo='@Lob'"
	 *        annotation="teneo.jpa appinfo='@Column(length=64000)'"
	 * @generated
	 */
	String getProviderId();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.Host#getProviderId <em>Provider Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provider Id</em>' attribute.
	 * @see #getProviderId()
	 * @generated
	 */
	void setProviderId(String value);

	/**
	 * Returns the value of the '<em><b>Gateway</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gateway</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gateway</em>' reference.
	 * @see #setGateway(IP)
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.OpsPackage#getHost_Gateway()
	 * @model
	 * @generated
	 */
	IP getGateway();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.Host#getGateway <em>Gateway</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gateway</em>' reference.
	 * @see #getGateway()
	 * @generated
	 */
	void setGateway(IP value);

	/**
	 * Returns the value of the '<em><b>Block</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.HostBlock}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.HostBlock#getHost <em>Host</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Block</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Block</em>' containment reference list.
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.OpsPackage#getHost_Block()
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.HostBlock#getHost
	 * @model opposite="host" containment="true"
	 *        annotation="teneo.jpa appinfo='@JoinColumn(name=\"host_id\")'"
	 *        annotation="teneo.jpa appinfo='@OneToMany(indexed=\"false\" )'"
	 *        annotation="teneo.hibernate appinfo='@Fetch(SUBSELECT)'"
	 * @generated
	 */
	EList<HostBlock> getBlock();

} // Host

/**
 * <copyright>
 * </copyright>
 *
 * $Id: IP.java,v 1.1 2008/04/06 13:45:43 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.bz225296_2.ops;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IP</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.IP#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.IP#getIp <em>Ip</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.IP#getHost <em>Host</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.IP#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.IP#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.IP#getModified <em>Modified</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.IP#getRevision <em>Revision</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.IP#isShared <em>Shared</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.IP#getIpName <em>Ip Name</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.IP#getVserver <em>Vserver</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.OpsPackage#getIP()
 * @model annotation="teneo.jpa appinfo='@Table(name=\"ops_ip\")'"
 *        annotation="webamg.emf user.key='ip'"
 * @generated
 */
public interface IP extends EObject {
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
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.OpsPackage#getIP_Name()
	 * @model annotation="teneo.jpa appinfo='@Column(unique=\"true\")'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.IP#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Ip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ip</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ip</em>' attribute.
	 * @see #setIp(String)
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.OpsPackage#getIP_Ip()
	 * @model annotation="teneo.jpa appinfo='@Column(unique=\"true\")'"
	 * @generated
	 */
	String getIp();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.IP#getIp <em>Ip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ip</em>' attribute.
	 * @see #getIp()
	 * @generated
	 */
	void setIp(String value);

	/**
	 * Returns the value of the '<em><b>Host</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.Host#getIp <em>Ip</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Host</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host</em>' container reference.
	 * @see #setHost(Host)
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.OpsPackage#getIP_Host()
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.Host#getIp
	 * @model opposite="ip" transient="false"
	 *        annotation="teneo.jpa appinfo='@JoinColumn(name=\"host_id\")'"
	 * @generated
	 */
	Host getHost();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.IP#getHost <em>Host</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host</em>' container reference.
	 * @see #getHost()
	 * @generated
	 */
	void setHost(Host value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.IpType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.IpType
	 * @see #setType(IpType)
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.OpsPackage#getIP_Type()
	 * @model
	 * @generated
	 */
	IpType getType();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.IP#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.IpType
	 * @see #getType()
	 * @generated
	 */
	void setType(IpType value);

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
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.OpsPackage#getIP_Id()
	 * @model annotation="teneo.jpa appinfo='@GeneratedValue'"
	 *        annotation="teneo.jpa appinfo='@Id'"
	 * @generated
	 */
	long getId();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.IP#getId <em>Id</em>}' attribute.
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
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.OpsPackage#getIP_Modified()
	 * @model unique="false"
	 *        annotation="teneo.jpa appinfo='@Temporal(TIMESTAMP)'"
	 *        annotation="teneo.jpa appinfo='@Column(columnDefinition=\"timestamp\" insertable=\"false\" updatable=\"false\")'"
	 *        annotation="teneo.hibernate appinfo='@Generated(ALWAYS)'"
	 * @generated
	 */
	Date getModified();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.IP#getModified <em>Modified</em>}' attribute.
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
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.OpsPackage#getIP_Revision()
	 * @model unique="false"
	 *        annotation="teneo.jpa appinfo='@Version'"
	 *        annotation="teneo.jpa appinfo='@Column(name=\"e_version\")'"
	 * @generated
	 */
	int getRevision();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.IP#getRevision <em>Revision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Revision</em>' attribute.
	 * @see #getRevision()
	 * @generated
	 */
	void setRevision(int value);

	/**
	 * Returns the value of the '<em><b>Shared</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shared</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shared</em>' attribute.
	 * @see #setShared(boolean)
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.OpsPackage#getIP_Shared()
	 * @model
	 * @generated
	 */
	boolean isShared();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.IP#isShared <em>Shared</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shared</em>' attribute.
	 * @see #isShared()
	 * @generated
	 */
	void setShared(boolean value);

	/**
	 * Returns the value of the '<em><b>Ip Name</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.IPName}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.IPName#getIp <em>Ip</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ip Name</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ip Name</em>' reference list.
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.OpsPackage#getIP_IpName()
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.IPName#getIp
	 * @model opposite="ip"
	 *        annotation="teneo.jpa appinfo='@ManyToMany(indexed=\"false\" mappedBy=\"ip\" )'"
	 *        annotation="teneo.jpa appinfo='@JoinTable(name=\"ops_ip_ipname\" joinColumns=@JoinColumn(name=\"ip_id\" nullable=\"false\") inverseJoinColumns=@JoinColumn(name=\"ipname_id\" nullable=\"false\"))'"
	 *        annotation="teneo.hibernate appinfo='@Fetch(SUBSELECT)'"
	 * @generated
	 */
	EList<IPName> getIpName();

	/**
	 * Returns the value of the '<em><b>Vserver</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.VServer}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.VServer#getIp <em>Ip</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vserver</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vserver</em>' reference list.
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.OpsPackage#getIP_Vserver()
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.VServer#getIp
	 * @model opposite="ip"
	 *        annotation="teneo.jpa appinfo='@ManyToMany(indexed=\"false\" mappedBy=\"ip\" )'"
	 *        annotation="teneo.jpa appinfo='@JoinTable(name=\"ops_vserver_ip\" joinColumns=@JoinColumn(name=\"ip_id\" nullable=\"false\") inverseJoinColumns=@JoinColumn(name=\"vserver_id\" nullable=\"false\"))'"
	 *        annotation="teneo.hibernate appinfo='@Fetch(SUBSELECT)'"
	 * @generated
	 */
	EList<VServer> getVserver();

} // IP

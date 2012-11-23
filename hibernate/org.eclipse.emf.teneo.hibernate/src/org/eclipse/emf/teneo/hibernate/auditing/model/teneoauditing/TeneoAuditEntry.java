/**
 */
package org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Teneo Audit Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing.TeneoAuditEntry#getTeneo_audit_id <em>Teneo audit id</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing.TeneoAuditEntry#getTeneo_version <em>Teneo version</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing.TeneoAuditEntry#getTeneo_object_id <em>Teneo object id</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing.TeneoAuditEntry#getTeneo_owner_object_id <em>Teneo owner object id</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing.TeneoAuditEntry#getTeneo_start <em>Teneo start</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing.TeneoAuditEntry#getTeneo_end <em>Teneo end</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing.TeneoAuditEntry#getTeneo_commit_info <em>Teneo commit info</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing.TeneoAuditEntry#getTeneo_audit_kind <em>Teneo audit kind</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing.TeneoAuditEntry#getTeneo_container_id <em>Teneo container id</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing.TeneoAuditEntry#getTeneo_container_feature_id <em>Teneo container feature id</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing.TeneoAuditEntry#getTeneo_previous_start <em>Teneo previous start</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing.TeneoAuditEntry#getTeneo_object_version <em>Teneo object version</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing.TeneoauditingPackage#getTeneoAuditEntry()
 * @model annotation="teneo.jpa value='@MappedSuperclass\n@Table(uniqueConstraints={@UniqueConstraint(columnNames={\"teneo_object_id\", \"teneo_start\"}), @UniqueConstraint(columnNames={\"teneo_object_id\", \"teneo_end\"}), @UniqueConstraint(columnNames={\"teneo_object_id\", \"teneo_previous_start\"})})'"
 * @generated
 */
public interface TeneoAuditEntry extends EObject {
	/**
	 * Returns the value of the '<em><b>Teneo audit id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Teneo audit id</em>' attribute isn't clear, there really should be
	 * more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Teneo audit id</em>' attribute.
	 * @see #setTeneo_audit_id(long)
	 * @see org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing.TeneoauditingPackage#getTeneoAuditEntry_Teneo_audit_id()
	 * @model annotation="teneo.jpa value='@Id\n@GeneratedValue'"
	 * @generated
	 */
	long getTeneo_audit_id();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing.TeneoAuditEntry#getTeneo_audit_id <em>Teneo audit id</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Teneo audit id</em>' attribute.
	 * @see #getTeneo_audit_id()
	 * @generated
	 */
	void setTeneo_audit_id(long value);

	/**
	 * Returns the value of the '<em><b>Teneo version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Teneo version</em>' attribute isn't clear, there really should be
	 * more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Teneo version</em>' attribute.
	 * @see #setTeneo_version(long)
	 * @see org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing.TeneoauditingPackage#getTeneoAuditEntry_Teneo_version()
	 * @model annotation="teneo.jpa value='@Version'"
	 * @generated
	 */
	long getTeneo_version();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing.TeneoAuditEntry#getTeneo_version <em>Teneo version</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Teneo version</em>' attribute.
	 * @see #getTeneo_version()
	 * @generated
	 */
	void setTeneo_version(long value);

	/**
	 * Returns the value of the '<em><b>Teneo object id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Teneo object id</em>' attribute isn't clear, there really should be
	 * more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Teneo object id</em>' attribute.
	 * @see #setTeneo_object_id(String)
	 * @see org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing.TeneoauditingPackage#getTeneoAuditEntry_Teneo_object_id()
	 * @model
	 * @generated
	 */
	String getTeneo_object_id();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing.TeneoAuditEntry#getTeneo_object_id <em>Teneo object id</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Teneo object id</em>' attribute.
	 * @see #getTeneo_object_id()
	 * @generated
	 */
	void setTeneo_object_id(String value);

	/**
	 * Returns the value of the '<em><b>Teneo owner object id</b></em>' attribute.
	 * <!-- begin-user-doc
	 * -->
	 * <p>
	 * If the meaning of the '<em>Teneo owner object id</em>' attribute isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Teneo owner object id</em>' attribute.
	 * @see #setTeneo_owner_object_id(String)
	 * @see org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing.TeneoauditingPackage#getTeneoAuditEntry_Teneo_owner_object_id()
	 * @model annotation="teneo.jpa value='@Column(index=\"teneo_derived_object\")'"
	 * @generated
	 */
	String getTeneo_owner_object_id();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing.TeneoAuditEntry#getTeneo_owner_object_id <em>Teneo owner object id</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Teneo owner object id</em>' attribute.
	 * @see #getTeneo_owner_object_id()
	 * @generated
	 */
	void setTeneo_owner_object_id(String value);

	/**
	 * Returns the value of the '<em><b>Teneo start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Teneo start</em>' attribute isn't clear, there really should be more
	 * of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Teneo start</em>' attribute.
	 * @see #setTeneo_start(long)
	 * @see org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing.TeneoauditingPackage#getTeneoAuditEntry_Teneo_start()
	 * @model
	 * @generated
	 */
	long getTeneo_start();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing.TeneoAuditEntry#getTeneo_start <em>Teneo start</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Teneo start</em>' attribute.
	 * @see #getTeneo_start()
	 * @generated
	 */
	void setTeneo_start(long value);

	/**
	 * Returns the value of the '<em><b>Teneo end</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Teneo end</em>' attribute isn't clear, there really should be more
	 * of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Teneo end</em>' attribute.
	 * @see #setTeneo_end(long)
	 * @see org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing.TeneoauditingPackage#getTeneoAuditEntry_Teneo_end()
	 * @model default="-1"
	 * @generated
	 */
	long getTeneo_end();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing.TeneoAuditEntry#getTeneo_end <em>Teneo end</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Teneo end</em>' attribute.
	 * @see #getTeneo_end()
	 * @generated
	 */
	void setTeneo_end(long value);

	/**
	 * Returns the value of the '<em><b>Teneo commit info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Teneo commit info</em>' reference isn't clear, there really should
	 * be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Teneo commit info</em>' reference.
	 * @see #setTeneo_commit_info(TeneoAuditCommitInfo)
	 * @see org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing.TeneoauditingPackage#getTeneoAuditEntry_Teneo_commit_info()
	 * @model required="true"
	 * @generated
	 */
	TeneoAuditCommitInfo getTeneo_commit_info();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing.TeneoAuditEntry#getTeneo_commit_info <em>Teneo commit info</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Teneo commit info</em>' reference.
	 * @see #getTeneo_commit_info()
	 * @generated
	 */
	void setTeneo_commit_info(TeneoAuditCommitInfo value);

	/**
	 * Returns the value of the '<em><b>Teneo audit kind</b></em>' attribute. The literals are from
	 * the enumeration
	 * {@link org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing.TeneoAuditKind}. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Teneo audit kind</em>' attribute isn't clear, there really should be
	 * more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Teneo audit kind</em>' attribute.
	 * @see org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing.TeneoAuditKind
	 * @see #setTeneo_audit_kind(TeneoAuditKind)
	 * @see org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing.TeneoauditingPackage#getTeneoAuditEntry_Teneo_audit_kind()
	 * @model required="true"
	 * @generated
	 */
	TeneoAuditKind getTeneo_audit_kind();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing.TeneoAuditEntry#getTeneo_audit_kind <em>Teneo audit kind</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Teneo audit kind</em>' attribute.
	 * @see org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing.TeneoAuditKind
	 * @see #getTeneo_audit_kind()
	 * @generated
	 */
	void setTeneo_audit_kind(TeneoAuditKind value);

	/**
	 * Returns the value of the '<em><b>Teneo container id</b></em>' attribute.
	 * <!-- begin-user-doc
	 * -->
	 * <p>
	 * If the meaning of the '<em>Teneo container id</em>' attribute isn't clear, there really should
	 * be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Teneo container id</em>' attribute.
	 * @see #setTeneo_container_id(String)
	 * @see org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing.TeneoauditingPackage#getTeneoAuditEntry_Teneo_container_id()
	 * @model
	 * @generated
	 */
	String getTeneo_container_id();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing.TeneoAuditEntry#getTeneo_container_id <em>Teneo container id</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Teneo container id</em>' attribute.
	 * @see #getTeneo_container_id()
	 * @generated
	 */
	void setTeneo_container_id(String value);

	/**
	 * Returns the value of the '<em><b>Teneo container feature id</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Teneo container feature id</em>' attribute isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Teneo container feature id</em>' attribute.
	 * @see #setTeneo_container_feature_id(int)
	 * @see org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing.TeneoauditingPackage#getTeneoAuditEntry_Teneo_container_feature_id()
	 * @model
	 * @generated
	 */
	int getTeneo_container_feature_id();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing.TeneoAuditEntry#getTeneo_container_feature_id <em>Teneo container feature id</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Teneo container feature id</em>' attribute.
	 * @see #getTeneo_container_feature_id()
	 * @generated
	 */
	void setTeneo_container_feature_id(int value);

	/**
	 * Returns the value of the '<em><b>Teneo previous start</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Teneo previous start</em>' attribute isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Teneo previous start</em>' attribute.
	 * @see #setTeneo_previous_start(long)
	 * @see org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing.TeneoauditingPackage#getTeneoAuditEntry_Teneo_previous_start()
	 * @model default="-1"
	 * @generated
	 */
	long getTeneo_previous_start();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing.TeneoAuditEntry#getTeneo_previous_start <em>Teneo previous start</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Teneo previous start</em>' attribute.
	 * @see #getTeneo_previous_start()
	 * @generated
	 */
	void setTeneo_previous_start(long value);

	/**
	 * Returns the value of the '<em><b>Teneo object version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Teneo object version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Teneo object version</em>' attribute.
	 * @see #setTeneo_object_version(long)
	 * @see org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing.TeneoauditingPackage#getTeneoAuditEntry_Teneo_object_version()
	 * @model
	 * @generated
	 */
	long getTeneo_object_version();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing.TeneoAuditEntry#getTeneo_object_version <em>Teneo object version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Teneo object version</em>' attribute.
	 * @see #getTeneo_object_version()
	 * @generated
	 */
	void setTeneo_object_version(long value);

} // TeneoAuditEntry

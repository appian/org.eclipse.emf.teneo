/**
 */
package org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Teneo Audit Commit Info</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing.TeneoAuditCommitInfo#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing.TeneoAuditCommitInfo#getVersion <em>Version</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing.TeneoAuditCommitInfo#getUser <em>User</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing.TeneoAuditCommitInfo#getComment <em>Comment</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing.TeneoAuditCommitInfo#getCommitTime <em>Commit Time</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing.TeneoauditingPackage#getTeneoAuditCommitInfo()
 * @model annotation="teneo.jpa value='@Entity'"
 * @generated
 */
public interface TeneoAuditCommitInfo extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(long)
	 * @see org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing.TeneoauditingPackage#getTeneoAuditCommitInfo_Id()
	 * @model annotation="teneo.jpa value='@Id\n@GeneratedValue'"
	 * @generated
	 */
	long getId();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing.TeneoAuditCommitInfo#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(long value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear, there really should be more of
	 * a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(long)
	 * @see org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing.TeneoauditingPackage#getTeneoAuditCommitInfo_Version()
	 * @model annotation="teneo.jpa value='@Version'"
	 * @generated
	 */
	long getVersion();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing.TeneoAuditCommitInfo#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(long value);

	/**
	 * Returns the value of the '<em><b>User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User</em>' attribute isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User</em>' attribute.
	 * @see #setUser(String)
	 * @see org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing.TeneoauditingPackage#getTeneoAuditCommitInfo_User()
	 * @model
	 * @generated
	 */
	String getUser();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing.TeneoAuditCommitInfo#getUser <em>User</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>User</em>' attribute.
	 * @see #getUser()
	 * @generated
	 */
	void setUser(String value);

	/**
	 * Returns the value of the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comment</em>' attribute isn't clear, there really should be more of
	 * a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment</em>' attribute.
	 * @see #setComment(String)
	 * @see org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing.TeneoauditingPackage#getTeneoAuditCommitInfo_Comment()
	 * @model annotation="teneo.jpa value='@Column(length=2000)'"
	 * @generated
	 */
	String getComment();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing.TeneoAuditCommitInfo#getComment <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' attribute.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(String value);

	/**
	 * Returns the value of the '<em><b>Commit Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Commit Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Commit Time</em>' attribute.
	 * @see #setCommitTime(long)
	 * @see org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing.TeneoauditingPackage#getTeneoAuditCommitInfo_CommitTime()
	 * @model
	 * @generated
	 */
	long getCommitTime();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing.TeneoAuditCommitInfo#getCommitTime <em>Commit Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Commit Time</em>' attribute.
	 * @see #getCommitTime()
	 * @generated
	 */
	void setCommitTime(long value);

} // TeneoAuditCommitInfo

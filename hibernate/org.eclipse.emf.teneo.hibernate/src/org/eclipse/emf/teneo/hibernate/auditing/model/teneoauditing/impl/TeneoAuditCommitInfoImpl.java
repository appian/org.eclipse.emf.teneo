/**
 */
package org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing.TeneoAuditCommitInfo;
import org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing.TeneoauditingPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Teneo Audit Commit Info</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing.impl.TeneoAuditCommitInfoImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing.impl.TeneoAuditCommitInfoImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing.impl.TeneoAuditCommitInfoImpl#getUser <em>User</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing.impl.TeneoAuditCommitInfoImpl#getComment <em>Comment</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TeneoAuditCommitInfoImpl extends EObjectImpl implements TeneoAuditCommitInfo {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final long ID_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected long id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final long VERSION_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected long version = VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getUser() <em>User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUser()
	 * @generated
	 * @ordered
	 */
	protected static final String USER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUser() <em>User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUser()
	 * @generated
	 * @ordered
	 */
	protected String user = USER_EDEFAULT;

	/**
	 * The default value of the '{@link #getComment() <em>Comment</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected String comment = COMMENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected TeneoAuditCommitInfoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TeneoauditingPackage.Literals.TENEO_AUDIT_COMMIT_INFO;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public long getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(long newId) {
		long oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TeneoauditingPackage.TENEO_AUDIT_COMMIT_INFO__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public long getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(long newVersion) {
		long oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TeneoauditingPackage.TENEO_AUDIT_COMMIT_INFO__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getUser() {
		return user;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setUser(String newUser) {
		String oldUser = user;
		user = newUser;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TeneoauditingPackage.TENEO_AUDIT_COMMIT_INFO__USER, oldUser, user));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setComment(String newComment) {
		String oldComment = comment;
		comment = newComment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TeneoauditingPackage.TENEO_AUDIT_COMMIT_INFO__COMMENT, oldComment, comment));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TeneoauditingPackage.TENEO_AUDIT_COMMIT_INFO__ID:
				return getId();
			case TeneoauditingPackage.TENEO_AUDIT_COMMIT_INFO__VERSION:
				return getVersion();
			case TeneoauditingPackage.TENEO_AUDIT_COMMIT_INFO__USER:
				return getUser();
			case TeneoauditingPackage.TENEO_AUDIT_COMMIT_INFO__COMMENT:
				return getComment();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TeneoauditingPackage.TENEO_AUDIT_COMMIT_INFO__ID:
				setId((Long)newValue);
				return;
			case TeneoauditingPackage.TENEO_AUDIT_COMMIT_INFO__VERSION:
				setVersion((Long)newValue);
				return;
			case TeneoauditingPackage.TENEO_AUDIT_COMMIT_INFO__USER:
				setUser((String)newValue);
				return;
			case TeneoauditingPackage.TENEO_AUDIT_COMMIT_INFO__COMMENT:
				setComment((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TeneoauditingPackage.TENEO_AUDIT_COMMIT_INFO__ID:
				setId(ID_EDEFAULT);
				return;
			case TeneoauditingPackage.TENEO_AUDIT_COMMIT_INFO__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case TeneoauditingPackage.TENEO_AUDIT_COMMIT_INFO__USER:
				setUser(USER_EDEFAULT);
				return;
			case TeneoauditingPackage.TENEO_AUDIT_COMMIT_INFO__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TeneoauditingPackage.TENEO_AUDIT_COMMIT_INFO__ID:
				return id != ID_EDEFAULT;
			case TeneoauditingPackage.TENEO_AUDIT_COMMIT_INFO__VERSION:
				return version != VERSION_EDEFAULT;
			case TeneoauditingPackage.TENEO_AUDIT_COMMIT_INFO__USER:
				return USER_EDEFAULT == null ? user != null : !USER_EDEFAULT.equals(user);
			case TeneoauditingPackage.TENEO_AUDIT_COMMIT_INFO__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(", version: ");
		result.append(version);
		result.append(", user: ");
		result.append(user);
		result.append(", comment: ");
		result.append(comment);
		result.append(')');
		return result.toString();
	}

} // TeneoAuditCommitInfoImpl

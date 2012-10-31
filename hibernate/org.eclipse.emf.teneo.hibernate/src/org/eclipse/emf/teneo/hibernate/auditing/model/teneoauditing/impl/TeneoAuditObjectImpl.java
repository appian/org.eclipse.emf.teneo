/**
 */
package org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing.TeneoAuditCommitInfo;
import org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing.TeneoAuditKind;
import org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing.TeneoAuditObject;
import org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing.TeneoauditingPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Teneo Audit Object</b></em>
 * '. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing.impl.TeneoAuditObjectImpl#getTeneo_audit_id <em>Teneo audit id</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing.impl.TeneoAuditObjectImpl#getTeneo_version <em>Teneo version</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing.impl.TeneoAuditObjectImpl#getTeneo_object_id <em>Teneo object id</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing.impl.TeneoAuditObjectImpl#getTeneo_previous_start <em>Teneo previous start</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing.impl.TeneoAuditObjectImpl#getTeneo_start <em>Teneo start</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing.impl.TeneoAuditObjectImpl#getTeneo_end <em>Teneo end</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing.impl.TeneoAuditObjectImpl#getTeneo_commit_info <em>Teneo commit info</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing.impl.TeneoAuditObjectImpl#getTeneo_audit_kind <em>Teneo audit kind</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TeneoAuditObjectImpl extends EObjectImpl implements TeneoAuditObject {
	/**
	 * The default value of the '{@link #getTeneo_audit_id() <em>Teneo audit id</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getTeneo_audit_id()
	 * @generated
	 * @ordered
	 */
	protected static final long TENEO_AUDIT_ID_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getTeneo_audit_id() <em>Teneo audit id</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getTeneo_audit_id()
	 * @generated
	 * @ordered
	 */
	protected long teneo_audit_id = TENEO_AUDIT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getTeneo_version() <em>Teneo version</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getTeneo_version()
	 * @generated
	 * @ordered
	 */
	protected static final long TENEO_VERSION_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getTeneo_version() <em>Teneo version</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getTeneo_version()
	 * @generated
	 * @ordered
	 */
	protected long teneo_version = TENEO_VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getTeneo_object_id() <em>Teneo object id</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getTeneo_object_id()
	 * @generated
	 * @ordered
	 */
	protected static final String TENEO_OBJECT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTeneo_object_id() <em>Teneo object id</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getTeneo_object_id()
	 * @generated
	 * @ordered
	 */
	protected String teneo_object_id = TENEO_OBJECT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getTeneo_previous_start() <em>Teneo previous start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTeneo_previous_start()
	 * @generated
	 * @ordered
	 */
	protected static final long TENEO_PREVIOUS_START_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getTeneo_previous_start() <em>Teneo previous start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTeneo_previous_start()
	 * @generated
	 * @ordered
	 */
	protected long teneo_previous_start = TENEO_PREVIOUS_START_EDEFAULT;

	/**
	 * The default value of the '{@link #getTeneo_start() <em>Teneo start</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getTeneo_start()
	 * @generated
	 * @ordered
	 */
	protected static final long TENEO_START_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getTeneo_start() <em>Teneo start</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getTeneo_start()
	 * @generated
	 * @ordered
	 */
	protected long teneo_start = TENEO_START_EDEFAULT;

	/**
	 * The default value of the '{@link #getTeneo_end() <em>Teneo end</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getTeneo_end()
	 * @generated
	 * @ordered
	 */
	protected static final long TENEO_END_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getTeneo_end() <em>Teneo end</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getTeneo_end()
	 * @generated
	 * @ordered
	 */
	protected long teneo_end = TENEO_END_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTeneo_commit_info() <em>Teneo commit info</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getTeneo_commit_info()
	 * @generated
	 * @ordered
	 */
	protected TeneoAuditCommitInfo teneo_commit_info;

	/**
	 * The default value of the '{@link #getTeneo_audit_kind() <em>Teneo audit kind</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getTeneo_audit_kind()
	 * @generated
	 * @ordered
	 */
	protected static final TeneoAuditKind TENEO_AUDIT_KIND_EDEFAULT = TeneoAuditKind.ADD;

	/**
	 * The cached value of the '{@link #getTeneo_audit_kind() <em>Teneo audit kind</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getTeneo_audit_kind()
	 * @generated
	 * @ordered
	 */
	protected TeneoAuditKind teneo_audit_kind = TENEO_AUDIT_KIND_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected TeneoAuditObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TeneoauditingPackage.Literals.TENEO_AUDIT_OBJECT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public long getTeneo_audit_id() {
		return teneo_audit_id;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setTeneo_audit_id(long newTeneo_audit_id) {
		long oldTeneo_audit_id = teneo_audit_id;
		teneo_audit_id = newTeneo_audit_id;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TeneoauditingPackage.TENEO_AUDIT_OBJECT__TENEO_AUDIT_ID, oldTeneo_audit_id, teneo_audit_id));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public long getTeneo_version() {
		return teneo_version;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setTeneo_version(long newTeneo_version) {
		long oldTeneo_version = teneo_version;
		teneo_version = newTeneo_version;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TeneoauditingPackage.TENEO_AUDIT_OBJECT__TENEO_VERSION, oldTeneo_version, teneo_version));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getTeneo_object_id() {
		return teneo_object_id;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setTeneo_object_id(String newTeneo_object_id) {
		String oldTeneo_object_id = teneo_object_id;
		teneo_object_id = newTeneo_object_id;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TeneoauditingPackage.TENEO_AUDIT_OBJECT__TENEO_OBJECT_ID, oldTeneo_object_id, teneo_object_id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getTeneo_previous_start() {
		return teneo_previous_start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTeneo_previous_start(long newTeneo_previous_start) {
		long oldTeneo_previous_start = teneo_previous_start;
		teneo_previous_start = newTeneo_previous_start;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TeneoauditingPackage.TENEO_AUDIT_OBJECT__TENEO_PREVIOUS_START, oldTeneo_previous_start, teneo_previous_start));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public long getTeneo_start() {
		return teneo_start;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setTeneo_start(long newTeneo_start) {
		long oldTeneo_start = teneo_start;
		teneo_start = newTeneo_start;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TeneoauditingPackage.TENEO_AUDIT_OBJECT__TENEO_START, oldTeneo_start, teneo_start));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public long getTeneo_end() {
		return teneo_end;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setTeneo_end(long newTeneo_end) {
		long oldTeneo_end = teneo_end;
		teneo_end = newTeneo_end;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TeneoauditingPackage.TENEO_AUDIT_OBJECT__TENEO_END, oldTeneo_end, teneo_end));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public TeneoAuditCommitInfo getTeneo_commit_info() {
		if (teneo_commit_info != null && teneo_commit_info.eIsProxy()) {
			InternalEObject oldTeneo_commit_info = (InternalEObject)teneo_commit_info;
			teneo_commit_info = (TeneoAuditCommitInfo)eResolveProxy(oldTeneo_commit_info);
			if (teneo_commit_info != oldTeneo_commit_info) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TeneoauditingPackage.TENEO_AUDIT_OBJECT__TENEO_COMMIT_INFO, oldTeneo_commit_info, teneo_commit_info));
			}
		}
		return teneo_commit_info;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public TeneoAuditCommitInfo basicGetTeneo_commit_info() {
		return teneo_commit_info;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setTeneo_commit_info(TeneoAuditCommitInfo newTeneo_commit_info) {
		TeneoAuditCommitInfo oldTeneo_commit_info = teneo_commit_info;
		teneo_commit_info = newTeneo_commit_info;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TeneoauditingPackage.TENEO_AUDIT_OBJECT__TENEO_COMMIT_INFO, oldTeneo_commit_info, teneo_commit_info));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public TeneoAuditKind getTeneo_audit_kind() {
		return teneo_audit_kind;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setTeneo_audit_kind(TeneoAuditKind newTeneo_audit_kind) {
		TeneoAuditKind oldTeneo_audit_kind = teneo_audit_kind;
		teneo_audit_kind = newTeneo_audit_kind == null ? TENEO_AUDIT_KIND_EDEFAULT : newTeneo_audit_kind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TeneoauditingPackage.TENEO_AUDIT_OBJECT__TENEO_AUDIT_KIND, oldTeneo_audit_kind, teneo_audit_kind));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TeneoauditingPackage.TENEO_AUDIT_OBJECT__TENEO_AUDIT_ID:
				return getTeneo_audit_id();
			case TeneoauditingPackage.TENEO_AUDIT_OBJECT__TENEO_VERSION:
				return getTeneo_version();
			case TeneoauditingPackage.TENEO_AUDIT_OBJECT__TENEO_OBJECT_ID:
				return getTeneo_object_id();
			case TeneoauditingPackage.TENEO_AUDIT_OBJECT__TENEO_PREVIOUS_START:
				return getTeneo_previous_start();
			case TeneoauditingPackage.TENEO_AUDIT_OBJECT__TENEO_START:
				return getTeneo_start();
			case TeneoauditingPackage.TENEO_AUDIT_OBJECT__TENEO_END:
				return getTeneo_end();
			case TeneoauditingPackage.TENEO_AUDIT_OBJECT__TENEO_COMMIT_INFO:
				if (resolve) return getTeneo_commit_info();
				return basicGetTeneo_commit_info();
			case TeneoauditingPackage.TENEO_AUDIT_OBJECT__TENEO_AUDIT_KIND:
				return getTeneo_audit_kind();
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
			case TeneoauditingPackage.TENEO_AUDIT_OBJECT__TENEO_AUDIT_ID:
				setTeneo_audit_id((Long)newValue);
				return;
			case TeneoauditingPackage.TENEO_AUDIT_OBJECT__TENEO_VERSION:
				setTeneo_version((Long)newValue);
				return;
			case TeneoauditingPackage.TENEO_AUDIT_OBJECT__TENEO_OBJECT_ID:
				setTeneo_object_id((String)newValue);
				return;
			case TeneoauditingPackage.TENEO_AUDIT_OBJECT__TENEO_PREVIOUS_START:
				setTeneo_previous_start((Long)newValue);
				return;
			case TeneoauditingPackage.TENEO_AUDIT_OBJECT__TENEO_START:
				setTeneo_start((Long)newValue);
				return;
			case TeneoauditingPackage.TENEO_AUDIT_OBJECT__TENEO_END:
				setTeneo_end((Long)newValue);
				return;
			case TeneoauditingPackage.TENEO_AUDIT_OBJECT__TENEO_COMMIT_INFO:
				setTeneo_commit_info((TeneoAuditCommitInfo)newValue);
				return;
			case TeneoauditingPackage.TENEO_AUDIT_OBJECT__TENEO_AUDIT_KIND:
				setTeneo_audit_kind((TeneoAuditKind)newValue);
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
			case TeneoauditingPackage.TENEO_AUDIT_OBJECT__TENEO_AUDIT_ID:
				setTeneo_audit_id(TENEO_AUDIT_ID_EDEFAULT);
				return;
			case TeneoauditingPackage.TENEO_AUDIT_OBJECT__TENEO_VERSION:
				setTeneo_version(TENEO_VERSION_EDEFAULT);
				return;
			case TeneoauditingPackage.TENEO_AUDIT_OBJECT__TENEO_OBJECT_ID:
				setTeneo_object_id(TENEO_OBJECT_ID_EDEFAULT);
				return;
			case TeneoauditingPackage.TENEO_AUDIT_OBJECT__TENEO_PREVIOUS_START:
				setTeneo_previous_start(TENEO_PREVIOUS_START_EDEFAULT);
				return;
			case TeneoauditingPackage.TENEO_AUDIT_OBJECT__TENEO_START:
				setTeneo_start(TENEO_START_EDEFAULT);
				return;
			case TeneoauditingPackage.TENEO_AUDIT_OBJECT__TENEO_END:
				setTeneo_end(TENEO_END_EDEFAULT);
				return;
			case TeneoauditingPackage.TENEO_AUDIT_OBJECT__TENEO_COMMIT_INFO:
				setTeneo_commit_info((TeneoAuditCommitInfo)null);
				return;
			case TeneoauditingPackage.TENEO_AUDIT_OBJECT__TENEO_AUDIT_KIND:
				setTeneo_audit_kind(TENEO_AUDIT_KIND_EDEFAULT);
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
			case TeneoauditingPackage.TENEO_AUDIT_OBJECT__TENEO_AUDIT_ID:
				return teneo_audit_id != TENEO_AUDIT_ID_EDEFAULT;
			case TeneoauditingPackage.TENEO_AUDIT_OBJECT__TENEO_VERSION:
				return teneo_version != TENEO_VERSION_EDEFAULT;
			case TeneoauditingPackage.TENEO_AUDIT_OBJECT__TENEO_OBJECT_ID:
				return TENEO_OBJECT_ID_EDEFAULT == null ? teneo_object_id != null : !TENEO_OBJECT_ID_EDEFAULT.equals(teneo_object_id);
			case TeneoauditingPackage.TENEO_AUDIT_OBJECT__TENEO_PREVIOUS_START:
				return teneo_previous_start != TENEO_PREVIOUS_START_EDEFAULT;
			case TeneoauditingPackage.TENEO_AUDIT_OBJECT__TENEO_START:
				return teneo_start != TENEO_START_EDEFAULT;
			case TeneoauditingPackage.TENEO_AUDIT_OBJECT__TENEO_END:
				return teneo_end != TENEO_END_EDEFAULT;
			case TeneoauditingPackage.TENEO_AUDIT_OBJECT__TENEO_COMMIT_INFO:
				return teneo_commit_info != null;
			case TeneoauditingPackage.TENEO_AUDIT_OBJECT__TENEO_AUDIT_KIND:
				return teneo_audit_kind != TENEO_AUDIT_KIND_EDEFAULT;
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
		result.append(" (teneo_audit_id: ");
		result.append(teneo_audit_id);
		result.append(", teneo_version: ");
		result.append(teneo_version);
		result.append(", teneo_object_id: ");
		result.append(teneo_object_id);
		result.append(", teneo_previous_start: ");
		result.append(teneo_previous_start);
		result.append(", teneo_start: ");
		result.append(teneo_start);
		result.append(", teneo_end: ");
		result.append(teneo_end);
		result.append(", teneo_audit_kind: ");
		result.append(teneo_audit_kind);
		result.append(')');
		return result.toString();
	}

} // TeneoAuditObjectImpl

/**
 * <copyright>
 * </copyright>
 *
 * $Id: InterfaceImpl.java,v 1.1 2008/04/06 13:45:43 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.impl;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.DomainSystem;
import org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.FailoverType;
import org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.Interface;
import org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.OpsPackage;
import org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.Role;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.impl.InterfaceImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.impl.InterfaceImpl#getRole <em>Role</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.impl.InterfaceImpl#getDomainSystem <em>Domain System</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.impl.InterfaceImpl#getFailoverType <em>Failover Type</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.impl.InterfaceImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.impl.InterfaceImpl#getModified <em>Modified</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.impl.InterfaceImpl#getRevision <em>Revision</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.impl.InterfaceImpl#getPort <em>Port</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.impl.InterfaceImpl#isExternal <em>External</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InterfaceImpl extends EObjectImpl implements Interface {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRole() <em>Role</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected EList<Role> role;

	/**
	 * The cached value of the '{@link #getDomainSystem() <em>Domain System</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainSystem()
	 * @generated
	 * @ordered
	 */
	protected EList<DomainSystem> domainSystem;

	/**
	 * The cached value of the '{@link #getFailoverType() <em>Failover Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailoverType()
	 * @generated
	 * @ordered
	 */
	protected FailoverType failoverType;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final long ID_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected long id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getModified() <em>Modified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModified()
	 * @generated
	 * @ordered
	 */
	protected static final Date MODIFIED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModified() <em>Modified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModified()
	 * @generated
	 * @ordered
	 */
	protected Date modified = MODIFIED_EDEFAULT;

	/**
	 * The default value of the '{@link #getRevision() <em>Revision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevision()
	 * @generated
	 * @ordered
	 */
	protected static final int REVISION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRevision() <em>Revision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevision()
	 * @generated
	 * @ordered
	 */
	protected int revision = REVISION_EDEFAULT;

	/**
	 * The default value of the '{@link #getPort() <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected static final int PORT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPort() <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected int port = PORT_EDEFAULT;

	/**
	 * The default value of the '{@link #isExternal() <em>External</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExternal()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EXTERNAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isExternal() <em>External</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExternal()
	 * @generated
	 * @ordered
	 */
	protected boolean external = EXTERNAL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OpsPackage.Literals.INTERFACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpsPackage.INTERFACE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Role> getRole() {
		if (role == null) {
			role = new EObjectWithInverseResolvingEList.ManyInverse<Role>(Role.class, this, OpsPackage.INTERFACE__ROLE, OpsPackage.ROLE__INTERFACE);
		}
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DomainSystem> getDomainSystem() {
		if (domainSystem == null) {
			domainSystem = new EObjectWithInverseResolvingEList<DomainSystem>(DomainSystem.class, this, OpsPackage.INTERFACE__DOMAIN_SYSTEM, OpsPackage.DOMAIN_SYSTEM__INTERFACE);
		}
		return domainSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FailoverType getFailoverType() {
		if (failoverType != null && failoverType.eIsProxy()) {
			InternalEObject oldFailoverType = (InternalEObject)failoverType;
			failoverType = (FailoverType)eResolveProxy(oldFailoverType);
			if (failoverType != oldFailoverType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OpsPackage.INTERFACE__FAILOVER_TYPE, oldFailoverType, failoverType));
			}
		}
		return failoverType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FailoverType basicGetFailoverType() {
		return failoverType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFailoverType(FailoverType newFailoverType) {
		FailoverType oldFailoverType = failoverType;
		failoverType = newFailoverType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpsPackage.INTERFACE__FAILOVER_TYPE, oldFailoverType, failoverType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(long newId) {
		long oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpsPackage.INTERFACE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getModified() {
		return modified;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModified(Date newModified) {
		Date oldModified = modified;
		modified = newModified;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpsPackage.INTERFACE__MODIFIED, oldModified, modified));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRevision() {
		return revision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRevision(int newRevision) {
		int oldRevision = revision;
		revision = newRevision;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpsPackage.INTERFACE__REVISION, oldRevision, revision));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPort() {
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPort(int newPort) {
		int oldPort = port;
		port = newPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpsPackage.INTERFACE__PORT, oldPort, port));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isExternal() {
		return external;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExternal(boolean newExternal) {
		boolean oldExternal = external;
		external = newExternal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpsPackage.INTERFACE__EXTERNAL, oldExternal, external));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OpsPackage.INTERFACE__ROLE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRole()).basicAdd(otherEnd, msgs);
			case OpsPackage.INTERFACE__DOMAIN_SYSTEM:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDomainSystem()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OpsPackage.INTERFACE__ROLE:
				return ((InternalEList<?>)getRole()).basicRemove(otherEnd, msgs);
			case OpsPackage.INTERFACE__DOMAIN_SYSTEM:
				return ((InternalEList<?>)getDomainSystem()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OpsPackage.INTERFACE__NAME:
				return getName();
			case OpsPackage.INTERFACE__ROLE:
				return getRole();
			case OpsPackage.INTERFACE__DOMAIN_SYSTEM:
				return getDomainSystem();
			case OpsPackage.INTERFACE__FAILOVER_TYPE:
				if (resolve) return getFailoverType();
				return basicGetFailoverType();
			case OpsPackage.INTERFACE__ID:
				return new Long(getId());
			case OpsPackage.INTERFACE__MODIFIED:
				return getModified();
			case OpsPackage.INTERFACE__REVISION:
				return new Integer(getRevision());
			case OpsPackage.INTERFACE__PORT:
				return new Integer(getPort());
			case OpsPackage.INTERFACE__EXTERNAL:
				return isExternal() ? Boolean.TRUE : Boolean.FALSE;
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OpsPackage.INTERFACE__NAME:
				setName((String)newValue);
				return;
			case OpsPackage.INTERFACE__ROLE:
				getRole().clear();
				getRole().addAll((Collection<? extends Role>)newValue);
				return;
			case OpsPackage.INTERFACE__DOMAIN_SYSTEM:
				getDomainSystem().clear();
				getDomainSystem().addAll((Collection<? extends DomainSystem>)newValue);
				return;
			case OpsPackage.INTERFACE__FAILOVER_TYPE:
				setFailoverType((FailoverType)newValue);
				return;
			case OpsPackage.INTERFACE__ID:
				setId(((Long)newValue).longValue());
				return;
			case OpsPackage.INTERFACE__MODIFIED:
				setModified((Date)newValue);
				return;
			case OpsPackage.INTERFACE__REVISION:
				setRevision(((Integer)newValue).intValue());
				return;
			case OpsPackage.INTERFACE__PORT:
				setPort(((Integer)newValue).intValue());
				return;
			case OpsPackage.INTERFACE__EXTERNAL:
				setExternal(((Boolean)newValue).booleanValue());
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case OpsPackage.INTERFACE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case OpsPackage.INTERFACE__ROLE:
				getRole().clear();
				return;
			case OpsPackage.INTERFACE__DOMAIN_SYSTEM:
				getDomainSystem().clear();
				return;
			case OpsPackage.INTERFACE__FAILOVER_TYPE:
				setFailoverType((FailoverType)null);
				return;
			case OpsPackage.INTERFACE__ID:
				setId(ID_EDEFAULT);
				return;
			case OpsPackage.INTERFACE__MODIFIED:
				setModified(MODIFIED_EDEFAULT);
				return;
			case OpsPackage.INTERFACE__REVISION:
				setRevision(REVISION_EDEFAULT);
				return;
			case OpsPackage.INTERFACE__PORT:
				setPort(PORT_EDEFAULT);
				return;
			case OpsPackage.INTERFACE__EXTERNAL:
				setExternal(EXTERNAL_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case OpsPackage.INTERFACE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case OpsPackage.INTERFACE__ROLE:
				return role != null && !role.isEmpty();
			case OpsPackage.INTERFACE__DOMAIN_SYSTEM:
				return domainSystem != null && !domainSystem.isEmpty();
			case OpsPackage.INTERFACE__FAILOVER_TYPE:
				return failoverType != null;
			case OpsPackage.INTERFACE__ID:
				return id != ID_EDEFAULT;
			case OpsPackage.INTERFACE__MODIFIED:
				return MODIFIED_EDEFAULT == null ? modified != null : !MODIFIED_EDEFAULT.equals(modified);
			case OpsPackage.INTERFACE__REVISION:
				return revision != REVISION_EDEFAULT;
			case OpsPackage.INTERFACE__PORT:
				return port != PORT_EDEFAULT;
			case OpsPackage.INTERFACE__EXTERNAL:
				return external != EXTERNAL_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", id: ");
		result.append(id);
		result.append(", modified: ");
		result.append(modified);
		result.append(", revision: ");
		result.append(revision);
		result.append(", port: ");
		result.append(port);
		result.append(", external: ");
		result.append(external);
		result.append(')');
		return result.toString();
	}

} //InterfaceImpl

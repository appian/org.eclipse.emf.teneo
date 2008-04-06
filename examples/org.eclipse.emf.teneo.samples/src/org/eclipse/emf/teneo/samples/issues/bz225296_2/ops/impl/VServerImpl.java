/**
 * <copyright>
 * </copyright>
 *
 * $Id: VServerImpl.java,v 1.1 2008/04/06 13:45:43 mtaal Exp $
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

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.Block;
import org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.Host;
import org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.IP;
import org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.OpsPackage;
import org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.OpsSystem;
import org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.Role;
import org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.VServer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VServer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.impl.VServerImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.impl.VServerImpl#getBlock <em>Block</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.impl.VServerImpl#getOwnSystem <em>Own System</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.impl.VServerImpl#getServedSystem <em>Served System</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.impl.VServerImpl#getIp <em>Ip</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.impl.VServerImpl#getHost <em>Host</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.impl.VServerImpl#getRole <em>Role</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.impl.VServerImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.impl.VServerImpl#getModified <em>Modified</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.impl.VServerImpl#getRevision <em>Revision</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VServerImpl extends EObjectImpl implements VServer {
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
	 * The cached value of the '{@link #getBlock() <em>Block</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlock()
	 * @generated
	 * @ordered
	 */
	protected EList<Block> block;

	/**
	 * The cached value of the '{@link #getOwnSystem() <em>Own System</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnSystem()
	 * @generated
	 * @ordered
	 */
	protected OpsSystem ownSystem;

	/**
	 * The cached value of the '{@link #getServedSystem() <em>Served System</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServedSystem()
	 * @generated
	 * @ordered
	 */
	protected EList<OpsSystem> servedSystem;

	/**
	 * The cached value of the '{@link #getIp() <em>Ip</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIp()
	 * @generated
	 * @ordered
	 */
	protected EList<IP> ip;

	/**
	 * The cached value of the '{@link #getRole() <em>Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected Role role;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VServerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OpsPackage.Literals.VSERVER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, OpsPackage.VSERVER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Block> getBlock() {
		if (block == null) {
			block = new EObjectContainmentWithInverseEList<Block>(Block.class, this, OpsPackage.VSERVER__BLOCK, OpsPackage.BLOCK__VSERVER);
		}
		return block;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpsSystem getOwnSystem() {
		if (ownSystem != null && ownSystem.eIsProxy()) {
			InternalEObject oldOwnSystem = (InternalEObject)ownSystem;
			ownSystem = (OpsSystem)eResolveProxy(oldOwnSystem);
			if (ownSystem != oldOwnSystem) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OpsPackage.VSERVER__OWN_SYSTEM, oldOwnSystem, ownSystem));
			}
		}
		return ownSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpsSystem basicGetOwnSystem() {
		return ownSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnSystem(OpsSystem newOwnSystem, NotificationChain msgs) {
		OpsSystem oldOwnSystem = ownSystem;
		ownSystem = newOwnSystem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OpsPackage.VSERVER__OWN_SYSTEM, oldOwnSystem, newOwnSystem);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnSystem(OpsSystem newOwnSystem) {
		if (newOwnSystem != ownSystem) {
			NotificationChain msgs = null;
			if (ownSystem != null)
				msgs = ((InternalEObject)ownSystem).eInverseRemove(this, OpsPackage.OPS_SYSTEM__OWN_VSERVER, OpsSystem.class, msgs);
			if (newOwnSystem != null)
				msgs = ((InternalEObject)newOwnSystem).eInverseAdd(this, OpsPackage.OPS_SYSTEM__OWN_VSERVER, OpsSystem.class, msgs);
			msgs = basicSetOwnSystem(newOwnSystem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpsPackage.VSERVER__OWN_SYSTEM, newOwnSystem, newOwnSystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OpsSystem> getServedSystem() {
		if (servedSystem == null) {
			servedSystem = new EObjectWithInverseResolvingEList.ManyInverse<OpsSystem>(OpsSystem.class, this, OpsPackage.VSERVER__SERVED_SYSTEM, OpsPackage.OPS_SYSTEM__SERVING_VSERVER);
		}
		return servedSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IP> getIp() {
		if (ip == null) {
			ip = new EObjectWithInverseResolvingEList.ManyInverse<IP>(IP.class, this, OpsPackage.VSERVER__IP, OpsPackage.IP__VSERVER);
		}
		return ip;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Host getHost() {
		if (eContainerFeatureID != OpsPackage.VSERVER__HOST) return null;
		return (Host)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHost(Host newHost, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newHost, OpsPackage.VSERVER__HOST, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHost(Host newHost) {
		if (newHost != eInternalContainer() || (eContainerFeatureID != OpsPackage.VSERVER__HOST && newHost != null)) {
			if (EcoreUtil.isAncestor(this, newHost))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newHost != null)
				msgs = ((InternalEObject)newHost).eInverseAdd(this, OpsPackage.HOST__VSERVER, Host.class, msgs);
			msgs = basicSetHost(newHost, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpsPackage.VSERVER__HOST, newHost, newHost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role getRole() {
		if (role != null && role.eIsProxy()) {
			InternalEObject oldRole = (InternalEObject)role;
			role = (Role)eResolveProxy(oldRole);
			if (role != oldRole) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OpsPackage.VSERVER__ROLE, oldRole, role));
			}
		}
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role basicGetRole() {
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRole(Role newRole, NotificationChain msgs) {
		Role oldRole = role;
		role = newRole;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OpsPackage.VSERVER__ROLE, oldRole, newRole);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRole(Role newRole) {
		if (newRole != role) {
			NotificationChain msgs = null;
			if (role != null)
				msgs = ((InternalEObject)role).eInverseRemove(this, OpsPackage.ROLE__VSERVER, Role.class, msgs);
			if (newRole != null)
				msgs = ((InternalEObject)newRole).eInverseAdd(this, OpsPackage.ROLE__VSERVER, Role.class, msgs);
			msgs = basicSetRole(newRole, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpsPackage.VSERVER__ROLE, newRole, newRole));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OpsPackage.VSERVER__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OpsPackage.VSERVER__MODIFIED, oldModified, modified));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OpsPackage.VSERVER__REVISION, oldRevision, revision));
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
			case OpsPackage.VSERVER__BLOCK:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBlock()).basicAdd(otherEnd, msgs);
			case OpsPackage.VSERVER__OWN_SYSTEM:
				if (ownSystem != null)
					msgs = ((InternalEObject)ownSystem).eInverseRemove(this, OpsPackage.OPS_SYSTEM__OWN_VSERVER, OpsSystem.class, msgs);
				return basicSetOwnSystem((OpsSystem)otherEnd, msgs);
			case OpsPackage.VSERVER__SERVED_SYSTEM:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getServedSystem()).basicAdd(otherEnd, msgs);
			case OpsPackage.VSERVER__IP:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIp()).basicAdd(otherEnd, msgs);
			case OpsPackage.VSERVER__HOST:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetHost((Host)otherEnd, msgs);
			case OpsPackage.VSERVER__ROLE:
				if (role != null)
					msgs = ((InternalEObject)role).eInverseRemove(this, OpsPackage.ROLE__VSERVER, Role.class, msgs);
				return basicSetRole((Role)otherEnd, msgs);
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
			case OpsPackage.VSERVER__BLOCK:
				return ((InternalEList<?>)getBlock()).basicRemove(otherEnd, msgs);
			case OpsPackage.VSERVER__OWN_SYSTEM:
				return basicSetOwnSystem(null, msgs);
			case OpsPackage.VSERVER__SERVED_SYSTEM:
				return ((InternalEList<?>)getServedSystem()).basicRemove(otherEnd, msgs);
			case OpsPackage.VSERVER__IP:
				return ((InternalEList<?>)getIp()).basicRemove(otherEnd, msgs);
			case OpsPackage.VSERVER__HOST:
				return basicSetHost(null, msgs);
			case OpsPackage.VSERVER__ROLE:
				return basicSetRole(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID) {
			case OpsPackage.VSERVER__HOST:
				return eInternalContainer().eInverseRemove(this, OpsPackage.HOST__VSERVER, Host.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OpsPackage.VSERVER__NAME:
				return getName();
			case OpsPackage.VSERVER__BLOCK:
				return getBlock();
			case OpsPackage.VSERVER__OWN_SYSTEM:
				if (resolve) return getOwnSystem();
				return basicGetOwnSystem();
			case OpsPackage.VSERVER__SERVED_SYSTEM:
				return getServedSystem();
			case OpsPackage.VSERVER__IP:
				return getIp();
			case OpsPackage.VSERVER__HOST:
				return getHost();
			case OpsPackage.VSERVER__ROLE:
				if (resolve) return getRole();
				return basicGetRole();
			case OpsPackage.VSERVER__ID:
				return new Long(getId());
			case OpsPackage.VSERVER__MODIFIED:
				return getModified();
			case OpsPackage.VSERVER__REVISION:
				return new Integer(getRevision());
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
			case OpsPackage.VSERVER__NAME:
				setName((String)newValue);
				return;
			case OpsPackage.VSERVER__BLOCK:
				getBlock().clear();
				getBlock().addAll((Collection<? extends Block>)newValue);
				return;
			case OpsPackage.VSERVER__OWN_SYSTEM:
				setOwnSystem((OpsSystem)newValue);
				return;
			case OpsPackage.VSERVER__SERVED_SYSTEM:
				getServedSystem().clear();
				getServedSystem().addAll((Collection<? extends OpsSystem>)newValue);
				return;
			case OpsPackage.VSERVER__IP:
				getIp().clear();
				getIp().addAll((Collection<? extends IP>)newValue);
				return;
			case OpsPackage.VSERVER__HOST:
				setHost((Host)newValue);
				return;
			case OpsPackage.VSERVER__ROLE:
				setRole((Role)newValue);
				return;
			case OpsPackage.VSERVER__ID:
				setId(((Long)newValue).longValue());
				return;
			case OpsPackage.VSERVER__MODIFIED:
				setModified((Date)newValue);
				return;
			case OpsPackage.VSERVER__REVISION:
				setRevision(((Integer)newValue).intValue());
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
			case OpsPackage.VSERVER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case OpsPackage.VSERVER__BLOCK:
				getBlock().clear();
				return;
			case OpsPackage.VSERVER__OWN_SYSTEM:
				setOwnSystem((OpsSystem)null);
				return;
			case OpsPackage.VSERVER__SERVED_SYSTEM:
				getServedSystem().clear();
				return;
			case OpsPackage.VSERVER__IP:
				getIp().clear();
				return;
			case OpsPackage.VSERVER__HOST:
				setHost((Host)null);
				return;
			case OpsPackage.VSERVER__ROLE:
				setRole((Role)null);
				return;
			case OpsPackage.VSERVER__ID:
				setId(ID_EDEFAULT);
				return;
			case OpsPackage.VSERVER__MODIFIED:
				setModified(MODIFIED_EDEFAULT);
				return;
			case OpsPackage.VSERVER__REVISION:
				setRevision(REVISION_EDEFAULT);
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
			case OpsPackage.VSERVER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case OpsPackage.VSERVER__BLOCK:
				return block != null && !block.isEmpty();
			case OpsPackage.VSERVER__OWN_SYSTEM:
				return ownSystem != null;
			case OpsPackage.VSERVER__SERVED_SYSTEM:
				return servedSystem != null && !servedSystem.isEmpty();
			case OpsPackage.VSERVER__IP:
				return ip != null && !ip.isEmpty();
			case OpsPackage.VSERVER__HOST:
				return getHost() != null;
			case OpsPackage.VSERVER__ROLE:
				return role != null;
			case OpsPackage.VSERVER__ID:
				return id != ID_EDEFAULT;
			case OpsPackage.VSERVER__MODIFIED:
				return MODIFIED_EDEFAULT == null ? modified != null : !MODIFIED_EDEFAULT.equals(modified);
			case OpsPackage.VSERVER__REVISION:
				return revision != REVISION_EDEFAULT;
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
		result.append(')');
		return result.toString();
	}

} //VServerImpl

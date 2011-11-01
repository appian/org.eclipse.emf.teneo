/**
 * <copyright>
 * </copyright>
 *
 * $Id: RoleImpl.java,v 1.1 2008/04/06 13:45:43 mtaal Exp $
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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.Interface;
import org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.MuninInfo;
import org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.OpsPackage;
import org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.Role;
import org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.VServer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Role</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.impl.RoleImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.impl.RoleImpl#getInterface <em>Interface</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.impl.RoleImpl#getVserver <em>Vserver</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.impl.RoleImpl#getRequiredInterface <em>Required Interface</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.impl.RoleImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.impl.RoleImpl#getModified <em>Modified</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.impl.RoleImpl#getRevision <em>Revision</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.impl.RoleImpl#getMuninInfo <em>Munin Info</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RoleImpl extends EObjectImpl implements Role {
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
	 * The cached value of the '{@link #getInterface() <em>Interface</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterface()
	 * @generated
	 * @ordered
	 */
	protected EList<Interface> interface_;

	/**
	 * The cached value of the '{@link #getVserver() <em>Vserver</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVserver()
	 * @generated
	 * @ordered
	 */
	protected EList<VServer> vserver;

	/**
	 * The cached value of the '{@link #getRequiredInterface() <em>Required Interface</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredInterface()
	 * @generated
	 * @ordered
	 */
	protected EList<Interface> requiredInterface;

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
	 * The cached value of the '{@link #getMuninInfo() <em>Munin Info</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMuninInfo()
	 * @generated
	 * @ordered
	 */
	protected EList<MuninInfo> muninInfo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OpsPackage.Literals.ROLE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, OpsPackage.ROLE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Interface> getInterface() {
		if (interface_ == null) {
			interface_ = new EObjectWithInverseResolvingEList.ManyInverse<Interface>(Interface.class, this, OpsPackage.ROLE__INTERFACE, OpsPackage.INTERFACE__ROLE);
		}
		return interface_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VServer> getVserver() {
		if (vserver == null) {
			vserver = new EObjectWithInverseResolvingEList<VServer>(VServer.class, this, OpsPackage.ROLE__VSERVER, OpsPackage.VSERVER__ROLE);
		}
		return vserver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Interface> getRequiredInterface() {
		if (requiredInterface == null) {
			requiredInterface = new EObjectResolvingEList<Interface>(Interface.class, this, OpsPackage.ROLE__REQUIRED_INTERFACE);
		}
		return requiredInterface;
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
			eNotify(new ENotificationImpl(this, Notification.SET, OpsPackage.ROLE__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OpsPackage.ROLE__MODIFIED, oldModified, modified));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OpsPackage.ROLE__REVISION, oldRevision, revision));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MuninInfo> getMuninInfo() {
		if (muninInfo == null) {
			muninInfo = new EObjectContainmentWithInverseEList<MuninInfo>(MuninInfo.class, this, OpsPackage.ROLE__MUNIN_INFO, OpsPackage.MUNIN_INFO__ROLE);
		}
		return muninInfo;
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
			case OpsPackage.ROLE__INTERFACE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInterface()).basicAdd(otherEnd, msgs);
			case OpsPackage.ROLE__VSERVER:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getVserver()).basicAdd(otherEnd, msgs);
			case OpsPackage.ROLE__MUNIN_INFO:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMuninInfo()).basicAdd(otherEnd, msgs);
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
			case OpsPackage.ROLE__INTERFACE:
				return ((InternalEList<?>)getInterface()).basicRemove(otherEnd, msgs);
			case OpsPackage.ROLE__VSERVER:
				return ((InternalEList<?>)getVserver()).basicRemove(otherEnd, msgs);
			case OpsPackage.ROLE__MUNIN_INFO:
				return ((InternalEList<?>)getMuninInfo()).basicRemove(otherEnd, msgs);
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
			case OpsPackage.ROLE__NAME:
				return getName();
			case OpsPackage.ROLE__INTERFACE:
				return getInterface();
			case OpsPackage.ROLE__VSERVER:
				return getVserver();
			case OpsPackage.ROLE__REQUIRED_INTERFACE:
				return getRequiredInterface();
			case OpsPackage.ROLE__ID:
				return new Long(getId());
			case OpsPackage.ROLE__MODIFIED:
				return getModified();
			case OpsPackage.ROLE__REVISION:
				return new Integer(getRevision());
			case OpsPackage.ROLE__MUNIN_INFO:
				return getMuninInfo();
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
			case OpsPackage.ROLE__NAME:
				setName((String)newValue);
				return;
			case OpsPackage.ROLE__INTERFACE:
				getInterface().clear();
				getInterface().addAll((Collection<? extends Interface>)newValue);
				return;
			case OpsPackage.ROLE__VSERVER:
				getVserver().clear();
				getVserver().addAll((Collection<? extends VServer>)newValue);
				return;
			case OpsPackage.ROLE__REQUIRED_INTERFACE:
				getRequiredInterface().clear();
				getRequiredInterface().addAll((Collection<? extends Interface>)newValue);
				return;
			case OpsPackage.ROLE__ID:
				setId(((Long)newValue).longValue());
				return;
			case OpsPackage.ROLE__MODIFIED:
				setModified((Date)newValue);
				return;
			case OpsPackage.ROLE__REVISION:
				setRevision(((Integer)newValue).intValue());
				return;
			case OpsPackage.ROLE__MUNIN_INFO:
				getMuninInfo().clear();
				getMuninInfo().addAll((Collection<? extends MuninInfo>)newValue);
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
			case OpsPackage.ROLE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case OpsPackage.ROLE__INTERFACE:
				getInterface().clear();
				return;
			case OpsPackage.ROLE__VSERVER:
				getVserver().clear();
				return;
			case OpsPackage.ROLE__REQUIRED_INTERFACE:
				getRequiredInterface().clear();
				return;
			case OpsPackage.ROLE__ID:
				setId(ID_EDEFAULT);
				return;
			case OpsPackage.ROLE__MODIFIED:
				setModified(MODIFIED_EDEFAULT);
				return;
			case OpsPackage.ROLE__REVISION:
				setRevision(REVISION_EDEFAULT);
				return;
			case OpsPackage.ROLE__MUNIN_INFO:
				getMuninInfo().clear();
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
			case OpsPackage.ROLE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case OpsPackage.ROLE__INTERFACE:
				return interface_ != null && !interface_.isEmpty();
			case OpsPackage.ROLE__VSERVER:
				return vserver != null && !vserver.isEmpty();
			case OpsPackage.ROLE__REQUIRED_INTERFACE:
				return requiredInterface != null && !requiredInterface.isEmpty();
			case OpsPackage.ROLE__ID:
				return id != ID_EDEFAULT;
			case OpsPackage.ROLE__MODIFIED:
				return MODIFIED_EDEFAULT == null ? modified != null : !MODIFIED_EDEFAULT.equals(modified);
			case OpsPackage.ROLE__REVISION:
				return revision != REVISION_EDEFAULT;
			case OpsPackage.ROLE__MUNIN_INFO:
				return muninInfo != null && !muninInfo.isEmpty();
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

} //RoleImpl

/**
 * <copyright>
 * </copyright>
 *
 * $Id: OpsSystemImpl.java,v 1.1 2008/04/06 13:45:43 mtaal Exp $
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
import org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.OpsPackage;
import org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.OpsSystem;
import org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.VServer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.impl.OpsSystemImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.impl.OpsSystemImpl#getOwnVserver <em>Own Vserver</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.impl.OpsSystemImpl#getServingVserver <em>Serving Vserver</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.impl.OpsSystemImpl#getDomainSystem <em>Domain System</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.impl.OpsSystemImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.impl.OpsSystemImpl#getModified <em>Modified</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.impl.OpsSystemImpl#getRevision <em>Revision</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OpsSystemImpl extends EObjectImpl implements OpsSystem {
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
	 * The cached value of the '{@link #getOwnVserver() <em>Own Vserver</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnVserver()
	 * @generated
	 * @ordered
	 */
	protected EList<VServer> ownVserver;

	/**
	 * The cached value of the '{@link #getServingVserver() <em>Serving Vserver</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServingVserver()
	 * @generated
	 * @ordered
	 */
	protected EList<VServer> servingVserver;

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
	protected OpsSystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OpsPackage.Literals.OPS_SYSTEM;
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
			eNotify(new ENotificationImpl(this, Notification.SET, OpsPackage.OPS_SYSTEM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VServer> getOwnVserver() {
		if (ownVserver == null) {
			ownVserver = new EObjectWithInverseResolvingEList<VServer>(VServer.class, this, OpsPackage.OPS_SYSTEM__OWN_VSERVER, OpsPackage.VSERVER__OWN_SYSTEM);
		}
		return ownVserver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VServer> getServingVserver() {
		if (servingVserver == null) {
			servingVserver = new EObjectWithInverseResolvingEList.ManyInverse<VServer>(VServer.class, this, OpsPackage.OPS_SYSTEM__SERVING_VSERVER, OpsPackage.VSERVER__SERVED_SYSTEM);
		}
		return servingVserver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DomainSystem> getDomainSystem() {
		if (domainSystem == null) {
			domainSystem = new EObjectWithInverseResolvingEList.ManyInverse<DomainSystem>(DomainSystem.class, this, OpsPackage.OPS_SYSTEM__DOMAIN_SYSTEM, OpsPackage.DOMAIN_SYSTEM__OPS_SYSTEM);
		}
		return domainSystem;
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
			eNotify(new ENotificationImpl(this, Notification.SET, OpsPackage.OPS_SYSTEM__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OpsPackage.OPS_SYSTEM__MODIFIED, oldModified, modified));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OpsPackage.OPS_SYSTEM__REVISION, oldRevision, revision));
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
			case OpsPackage.OPS_SYSTEM__OWN_VSERVER:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnVserver()).basicAdd(otherEnd, msgs);
			case OpsPackage.OPS_SYSTEM__SERVING_VSERVER:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getServingVserver()).basicAdd(otherEnd, msgs);
			case OpsPackage.OPS_SYSTEM__DOMAIN_SYSTEM:
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
			case OpsPackage.OPS_SYSTEM__OWN_VSERVER:
				return ((InternalEList<?>)getOwnVserver()).basicRemove(otherEnd, msgs);
			case OpsPackage.OPS_SYSTEM__SERVING_VSERVER:
				return ((InternalEList<?>)getServingVserver()).basicRemove(otherEnd, msgs);
			case OpsPackage.OPS_SYSTEM__DOMAIN_SYSTEM:
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
			case OpsPackage.OPS_SYSTEM__NAME:
				return getName();
			case OpsPackage.OPS_SYSTEM__OWN_VSERVER:
				return getOwnVserver();
			case OpsPackage.OPS_SYSTEM__SERVING_VSERVER:
				return getServingVserver();
			case OpsPackage.OPS_SYSTEM__DOMAIN_SYSTEM:
				return getDomainSystem();
			case OpsPackage.OPS_SYSTEM__ID:
				return new Long(getId());
			case OpsPackage.OPS_SYSTEM__MODIFIED:
				return getModified();
			case OpsPackage.OPS_SYSTEM__REVISION:
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
			case OpsPackage.OPS_SYSTEM__NAME:
				setName((String)newValue);
				return;
			case OpsPackage.OPS_SYSTEM__OWN_VSERVER:
				getOwnVserver().clear();
				getOwnVserver().addAll((Collection<? extends VServer>)newValue);
				return;
			case OpsPackage.OPS_SYSTEM__SERVING_VSERVER:
				getServingVserver().clear();
				getServingVserver().addAll((Collection<? extends VServer>)newValue);
				return;
			case OpsPackage.OPS_SYSTEM__DOMAIN_SYSTEM:
				getDomainSystem().clear();
				getDomainSystem().addAll((Collection<? extends DomainSystem>)newValue);
				return;
			case OpsPackage.OPS_SYSTEM__ID:
				setId(((Long)newValue).longValue());
				return;
			case OpsPackage.OPS_SYSTEM__MODIFIED:
				setModified((Date)newValue);
				return;
			case OpsPackage.OPS_SYSTEM__REVISION:
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
			case OpsPackage.OPS_SYSTEM__NAME:
				setName(NAME_EDEFAULT);
				return;
			case OpsPackage.OPS_SYSTEM__OWN_VSERVER:
				getOwnVserver().clear();
				return;
			case OpsPackage.OPS_SYSTEM__SERVING_VSERVER:
				getServingVserver().clear();
				return;
			case OpsPackage.OPS_SYSTEM__DOMAIN_SYSTEM:
				getDomainSystem().clear();
				return;
			case OpsPackage.OPS_SYSTEM__ID:
				setId(ID_EDEFAULT);
				return;
			case OpsPackage.OPS_SYSTEM__MODIFIED:
				setModified(MODIFIED_EDEFAULT);
				return;
			case OpsPackage.OPS_SYSTEM__REVISION:
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
			case OpsPackage.OPS_SYSTEM__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case OpsPackage.OPS_SYSTEM__OWN_VSERVER:
				return ownVserver != null && !ownVserver.isEmpty();
			case OpsPackage.OPS_SYSTEM__SERVING_VSERVER:
				return servingVserver != null && !servingVserver.isEmpty();
			case OpsPackage.OPS_SYSTEM__DOMAIN_SYSTEM:
				return domainSystem != null && !domainSystem.isEmpty();
			case OpsPackage.OPS_SYSTEM__ID:
				return id != ID_EDEFAULT;
			case OpsPackage.OPS_SYSTEM__MODIFIED:
				return MODIFIED_EDEFAULT == null ? modified != null : !MODIFIED_EDEFAULT.equals(modified);
			case OpsPackage.OPS_SYSTEM__REVISION:
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

} //OpsSystemImpl

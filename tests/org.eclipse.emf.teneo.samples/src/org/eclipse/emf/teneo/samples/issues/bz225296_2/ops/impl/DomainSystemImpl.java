/**
 * <copyright>
 * </copyright>
 *
 * $Id: DomainSystemImpl.java,v 1.1 2008/04/06 13:45:43 mtaal Exp $
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

import org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.Domain;
import org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.DomainSystem;
import org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.Interface;
import org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.OpsPackage;
import org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.OpsSystem;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Domain System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.impl.DomainSystemImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.impl.DomainSystemImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.impl.DomainSystemImpl#getDomains <em>Domains</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.impl.DomainSystemImpl#getOpsSystem <em>Ops System</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.impl.DomainSystemImpl#getInterface <em>Interface</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.impl.DomainSystemImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.impl.DomainSystemImpl#getModified <em>Modified</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.impl.DomainSystemImpl#getRevision <em>Revision</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.impl.DomainSystemImpl#getForwardEmail <em>Forward Email</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DomainSystemImpl extends EObjectImpl implements DomainSystem {
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
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDomains() <em>Domains</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomains()
	 * @generated
	 * @ordered
	 */
	protected EList<Domain> domains;

	/**
	 * The cached value of the '{@link #getOpsSystem() <em>Ops System</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpsSystem()
	 * @generated
	 * @ordered
	 */
	protected EList<OpsSystem> opsSystem;

	/**
	 * The cached value of the '{@link #getInterface() <em>Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterface()
	 * @generated
	 * @ordered
	 */
	protected Interface interface_;

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
	 * The default value of the '{@link #getForwardEmail() <em>Forward Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForwardEmail()
	 * @generated
	 * @ordered
	 */
	protected static final String FORWARD_EMAIL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getForwardEmail() <em>Forward Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForwardEmail()
	 * @generated
	 * @ordered
	 */
	protected String forwardEmail = FORWARD_EMAIL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainSystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OpsPackage.Literals.DOMAIN_SYSTEM;
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
			eNotify(new ENotificationImpl(this, Notification.SET, OpsPackage.DOMAIN_SYSTEM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpsPackage.DOMAIN_SYSTEM__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Domain> getDomains() {
		if (domains == null) {
			domains = new EObjectWithInverseResolvingEList.ManyInverse<Domain>(Domain.class, this, OpsPackage.DOMAIN_SYSTEM__DOMAINS, OpsPackage.DOMAIN__SYSTEMS);
		}
		return domains;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OpsSystem> getOpsSystem() {
		if (opsSystem == null) {
			opsSystem = new EObjectWithInverseResolvingEList.ManyInverse<OpsSystem>(OpsSystem.class, this, OpsPackage.DOMAIN_SYSTEM__OPS_SYSTEM, OpsPackage.OPS_SYSTEM__DOMAIN_SYSTEM);
		}
		return opsSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface getInterface() {
		if (interface_ != null && interface_.eIsProxy()) {
			InternalEObject oldInterface = (InternalEObject)interface_;
			interface_ = (Interface)eResolveProxy(oldInterface);
			if (interface_ != oldInterface) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OpsPackage.DOMAIN_SYSTEM__INTERFACE, oldInterface, interface_));
			}
		}
		return interface_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface basicGetInterface() {
		return interface_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInterface(Interface newInterface, NotificationChain msgs) {
		Interface oldInterface = interface_;
		interface_ = newInterface;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OpsPackage.DOMAIN_SYSTEM__INTERFACE, oldInterface, newInterface);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterface(Interface newInterface) {
		if (newInterface != interface_) {
			NotificationChain msgs = null;
			if (interface_ != null)
				msgs = ((InternalEObject)interface_).eInverseRemove(this, OpsPackage.INTERFACE__DOMAIN_SYSTEM, Interface.class, msgs);
			if (newInterface != null)
				msgs = ((InternalEObject)newInterface).eInverseAdd(this, OpsPackage.INTERFACE__DOMAIN_SYSTEM, Interface.class, msgs);
			msgs = basicSetInterface(newInterface, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpsPackage.DOMAIN_SYSTEM__INTERFACE, newInterface, newInterface));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OpsPackage.DOMAIN_SYSTEM__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OpsPackage.DOMAIN_SYSTEM__MODIFIED, oldModified, modified));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OpsPackage.DOMAIN_SYSTEM__REVISION, oldRevision, revision));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getForwardEmail() {
		return forwardEmail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForwardEmail(String newForwardEmail) {
		String oldForwardEmail = forwardEmail;
		forwardEmail = newForwardEmail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpsPackage.DOMAIN_SYSTEM__FORWARD_EMAIL, oldForwardEmail, forwardEmail));
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
			case OpsPackage.DOMAIN_SYSTEM__DOMAINS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDomains()).basicAdd(otherEnd, msgs);
			case OpsPackage.DOMAIN_SYSTEM__OPS_SYSTEM:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOpsSystem()).basicAdd(otherEnd, msgs);
			case OpsPackage.DOMAIN_SYSTEM__INTERFACE:
				if (interface_ != null)
					msgs = ((InternalEObject)interface_).eInverseRemove(this, OpsPackage.INTERFACE__DOMAIN_SYSTEM, Interface.class, msgs);
				return basicSetInterface((Interface)otherEnd, msgs);
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
			case OpsPackage.DOMAIN_SYSTEM__DOMAINS:
				return ((InternalEList<?>)getDomains()).basicRemove(otherEnd, msgs);
			case OpsPackage.DOMAIN_SYSTEM__OPS_SYSTEM:
				return ((InternalEList<?>)getOpsSystem()).basicRemove(otherEnd, msgs);
			case OpsPackage.DOMAIN_SYSTEM__INTERFACE:
				return basicSetInterface(null, msgs);
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
			case OpsPackage.DOMAIN_SYSTEM__NAME:
				return getName();
			case OpsPackage.DOMAIN_SYSTEM__DESCRIPTION:
				return getDescription();
			case OpsPackage.DOMAIN_SYSTEM__DOMAINS:
				return getDomains();
			case OpsPackage.DOMAIN_SYSTEM__OPS_SYSTEM:
				return getOpsSystem();
			case OpsPackage.DOMAIN_SYSTEM__INTERFACE:
				if (resolve) return getInterface();
				return basicGetInterface();
			case OpsPackage.DOMAIN_SYSTEM__ID:
				return new Long(getId());
			case OpsPackage.DOMAIN_SYSTEM__MODIFIED:
				return getModified();
			case OpsPackage.DOMAIN_SYSTEM__REVISION:
				return new Integer(getRevision());
			case OpsPackage.DOMAIN_SYSTEM__FORWARD_EMAIL:
				return getForwardEmail();
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
			case OpsPackage.DOMAIN_SYSTEM__NAME:
				setName((String)newValue);
				return;
			case OpsPackage.DOMAIN_SYSTEM__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case OpsPackage.DOMAIN_SYSTEM__DOMAINS:
				getDomains().clear();
				getDomains().addAll((Collection<? extends Domain>)newValue);
				return;
			case OpsPackage.DOMAIN_SYSTEM__OPS_SYSTEM:
				getOpsSystem().clear();
				getOpsSystem().addAll((Collection<? extends OpsSystem>)newValue);
				return;
			case OpsPackage.DOMAIN_SYSTEM__INTERFACE:
				setInterface((Interface)newValue);
				return;
			case OpsPackage.DOMAIN_SYSTEM__ID:
				setId(((Long)newValue).longValue());
				return;
			case OpsPackage.DOMAIN_SYSTEM__MODIFIED:
				setModified((Date)newValue);
				return;
			case OpsPackage.DOMAIN_SYSTEM__REVISION:
				setRevision(((Integer)newValue).intValue());
				return;
			case OpsPackage.DOMAIN_SYSTEM__FORWARD_EMAIL:
				setForwardEmail((String)newValue);
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
			case OpsPackage.DOMAIN_SYSTEM__NAME:
				setName(NAME_EDEFAULT);
				return;
			case OpsPackage.DOMAIN_SYSTEM__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case OpsPackage.DOMAIN_SYSTEM__DOMAINS:
				getDomains().clear();
				return;
			case OpsPackage.DOMAIN_SYSTEM__OPS_SYSTEM:
				getOpsSystem().clear();
				return;
			case OpsPackage.DOMAIN_SYSTEM__INTERFACE:
				setInterface((Interface)null);
				return;
			case OpsPackage.DOMAIN_SYSTEM__ID:
				setId(ID_EDEFAULT);
				return;
			case OpsPackage.DOMAIN_SYSTEM__MODIFIED:
				setModified(MODIFIED_EDEFAULT);
				return;
			case OpsPackage.DOMAIN_SYSTEM__REVISION:
				setRevision(REVISION_EDEFAULT);
				return;
			case OpsPackage.DOMAIN_SYSTEM__FORWARD_EMAIL:
				setForwardEmail(FORWARD_EMAIL_EDEFAULT);
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
			case OpsPackage.DOMAIN_SYSTEM__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case OpsPackage.DOMAIN_SYSTEM__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case OpsPackage.DOMAIN_SYSTEM__DOMAINS:
				return domains != null && !domains.isEmpty();
			case OpsPackage.DOMAIN_SYSTEM__OPS_SYSTEM:
				return opsSystem != null && !opsSystem.isEmpty();
			case OpsPackage.DOMAIN_SYSTEM__INTERFACE:
				return interface_ != null;
			case OpsPackage.DOMAIN_SYSTEM__ID:
				return id != ID_EDEFAULT;
			case OpsPackage.DOMAIN_SYSTEM__MODIFIED:
				return MODIFIED_EDEFAULT == null ? modified != null : !MODIFIED_EDEFAULT.equals(modified);
			case OpsPackage.DOMAIN_SYSTEM__REVISION:
				return revision != REVISION_EDEFAULT;
			case OpsPackage.DOMAIN_SYSTEM__FORWARD_EMAIL:
				return FORWARD_EMAIL_EDEFAULT == null ? forwardEmail != null : !FORWARD_EMAIL_EDEFAULT.equals(forwardEmail);
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
		result.append(", description: ");
		result.append(description);
		result.append(", id: ");
		result.append(id);
		result.append(", modified: ");
		result.append(modified);
		result.append(", revision: ");
		result.append(revision);
		result.append(", forwardEmail: ");
		result.append(forwardEmail);
		result.append(')');
		return result.toString();
	}

} //DomainSystemImpl

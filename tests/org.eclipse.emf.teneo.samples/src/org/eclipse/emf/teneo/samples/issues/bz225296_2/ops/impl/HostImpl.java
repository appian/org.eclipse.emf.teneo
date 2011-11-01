/**
 * <copyright>
 * </copyright>
 *
 * $Id: HostImpl.java,v 1.1 2008/04/06 13:45:43 mtaal Exp $
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
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.DataCenter;
import org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.Host;
import org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.HostBlock;
import org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.IP;
import org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.OpsPackage;
import org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.VServer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Host</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.impl.HostImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.impl.HostImpl#getDataCenter <em>Data Center</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.impl.HostImpl#getVserver <em>Vserver</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.impl.HostImpl#getIp <em>Ip</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.impl.HostImpl#getOwnIp <em>Own Ip</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.impl.HostImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.impl.HostImpl#getModified <em>Modified</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.impl.HostImpl#getRevision <em>Revision</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.impl.HostImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.impl.HostImpl#getNetwork <em>Network</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.impl.HostImpl#getProviderId <em>Provider Id</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.impl.HostImpl#getGateway <em>Gateway</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.impl.HostImpl#getBlock <em>Block</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HostImpl extends EObjectImpl implements Host {
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
	 * The cached value of the '{@link #getVserver() <em>Vserver</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVserver()
	 * @generated
	 * @ordered
	 */
	protected EList<VServer> vserver;

	/**
	 * The cached value of the '{@link #getIp() <em>Ip</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIp()
	 * @generated
	 * @ordered
	 */
	protected EList<IP> ip;

	/**
	 * The cached value of the '{@link #getOwnIp() <em>Own Ip</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnIp()
	 * @generated
	 * @ordered
	 */
	protected IP ownIp;

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
	 * The default value of the '{@link #getNetwork() <em>Network</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetwork()
	 * @generated
	 * @ordered
	 */
	protected static final String NETWORK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNetwork() <em>Network</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetwork()
	 * @generated
	 * @ordered
	 */
	protected String network = NETWORK_EDEFAULT;

	/**
	 * The default value of the '{@link #getProviderId() <em>Provider Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProviderId()
	 * @generated
	 * @ordered
	 */
	protected static final String PROVIDER_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProviderId() <em>Provider Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProviderId()
	 * @generated
	 * @ordered
	 */
	protected String providerId = PROVIDER_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGateway() <em>Gateway</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGateway()
	 * @generated
	 * @ordered
	 */
	protected IP gateway;

	/**
	 * The cached value of the '{@link #getBlock() <em>Block</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlock()
	 * @generated
	 * @ordered
	 */
	protected EList<HostBlock> block;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HostImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OpsPackage.Literals.HOST;
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
			eNotify(new ENotificationImpl(this, Notification.SET, OpsPackage.HOST__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataCenter getDataCenter() {
		if (eContainerFeatureID != OpsPackage.HOST__DATA_CENTER) return null;
		return (DataCenter)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataCenter(DataCenter newDataCenter, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newDataCenter, OpsPackage.HOST__DATA_CENTER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataCenter(DataCenter newDataCenter) {
		if (newDataCenter != eInternalContainer() || (eContainerFeatureID != OpsPackage.HOST__DATA_CENTER && newDataCenter != null)) {
			if (EcoreUtil.isAncestor(this, newDataCenter))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDataCenter != null)
				msgs = ((InternalEObject)newDataCenter).eInverseAdd(this, OpsPackage.DATA_CENTER__HOST, DataCenter.class, msgs);
			msgs = basicSetDataCenter(newDataCenter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpsPackage.HOST__DATA_CENTER, newDataCenter, newDataCenter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VServer> getVserver() {
		if (vserver == null) {
			vserver = new EObjectContainmentWithInverseEList<VServer>(VServer.class, this, OpsPackage.HOST__VSERVER, OpsPackage.VSERVER__HOST);
		}
		return vserver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IP> getIp() {
		if (ip == null) {
			ip = new EObjectContainmentWithInverseEList<IP>(IP.class, this, OpsPackage.HOST__IP, OpsPackage.IP__HOST);
		}
		return ip;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IP getOwnIp() {
		if (ownIp != null && ownIp.eIsProxy()) {
			InternalEObject oldOwnIp = (InternalEObject)ownIp;
			ownIp = (IP)eResolveProxy(oldOwnIp);
			if (ownIp != oldOwnIp) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OpsPackage.HOST__OWN_IP, oldOwnIp, ownIp));
			}
		}
		return ownIp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IP basicGetOwnIp() {
		return ownIp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnIp(IP newOwnIp) {
		IP oldOwnIp = ownIp;
		ownIp = newOwnIp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpsPackage.HOST__OWN_IP, oldOwnIp, ownIp));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OpsPackage.HOST__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OpsPackage.HOST__MODIFIED, oldModified, modified));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OpsPackage.HOST__REVISION, oldRevision, revision));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OpsPackage.HOST__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNetwork() {
		return network;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNetwork(String newNetwork) {
		String oldNetwork = network;
		network = newNetwork;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpsPackage.HOST__NETWORK, oldNetwork, network));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProviderId() {
		return providerId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProviderId(String newProviderId) {
		String oldProviderId = providerId;
		providerId = newProviderId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpsPackage.HOST__PROVIDER_ID, oldProviderId, providerId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IP getGateway() {
		if (gateway != null && gateway.eIsProxy()) {
			InternalEObject oldGateway = (InternalEObject)gateway;
			gateway = (IP)eResolveProxy(oldGateway);
			if (gateway != oldGateway) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OpsPackage.HOST__GATEWAY, oldGateway, gateway));
			}
		}
		return gateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IP basicGetGateway() {
		return gateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGateway(IP newGateway) {
		IP oldGateway = gateway;
		gateway = newGateway;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpsPackage.HOST__GATEWAY, oldGateway, gateway));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HostBlock> getBlock() {
		if (block == null) {
			block = new EObjectContainmentWithInverseEList<HostBlock>(HostBlock.class, this, OpsPackage.HOST__BLOCK, OpsPackage.HOST_BLOCK__HOST);
		}
		return block;
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
			case OpsPackage.HOST__DATA_CENTER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetDataCenter((DataCenter)otherEnd, msgs);
			case OpsPackage.HOST__VSERVER:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getVserver()).basicAdd(otherEnd, msgs);
			case OpsPackage.HOST__IP:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIp()).basicAdd(otherEnd, msgs);
			case OpsPackage.HOST__BLOCK:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBlock()).basicAdd(otherEnd, msgs);
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
			case OpsPackage.HOST__DATA_CENTER:
				return basicSetDataCenter(null, msgs);
			case OpsPackage.HOST__VSERVER:
				return ((InternalEList<?>)getVserver()).basicRemove(otherEnd, msgs);
			case OpsPackage.HOST__IP:
				return ((InternalEList<?>)getIp()).basicRemove(otherEnd, msgs);
			case OpsPackage.HOST__BLOCK:
				return ((InternalEList<?>)getBlock()).basicRemove(otherEnd, msgs);
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
			case OpsPackage.HOST__DATA_CENTER:
				return eInternalContainer().eInverseRemove(this, OpsPackage.DATA_CENTER__HOST, DataCenter.class, msgs);
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
			case OpsPackage.HOST__NAME:
				return getName();
			case OpsPackage.HOST__DATA_CENTER:
				return getDataCenter();
			case OpsPackage.HOST__VSERVER:
				return getVserver();
			case OpsPackage.HOST__IP:
				return getIp();
			case OpsPackage.HOST__OWN_IP:
				if (resolve) return getOwnIp();
				return basicGetOwnIp();
			case OpsPackage.HOST__ID:
				return new Long(getId());
			case OpsPackage.HOST__MODIFIED:
				return getModified();
			case OpsPackage.HOST__REVISION:
				return new Integer(getRevision());
			case OpsPackage.HOST__DESCRIPTION:
				return getDescription();
			case OpsPackage.HOST__NETWORK:
				return getNetwork();
			case OpsPackage.HOST__PROVIDER_ID:
				return getProviderId();
			case OpsPackage.HOST__GATEWAY:
				if (resolve) return getGateway();
				return basicGetGateway();
			case OpsPackage.HOST__BLOCK:
				return getBlock();
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
			case OpsPackage.HOST__NAME:
				setName((String)newValue);
				return;
			case OpsPackage.HOST__DATA_CENTER:
				setDataCenter((DataCenter)newValue);
				return;
			case OpsPackage.HOST__VSERVER:
				getVserver().clear();
				getVserver().addAll((Collection<? extends VServer>)newValue);
				return;
			case OpsPackage.HOST__IP:
				getIp().clear();
				getIp().addAll((Collection<? extends IP>)newValue);
				return;
			case OpsPackage.HOST__OWN_IP:
				setOwnIp((IP)newValue);
				return;
			case OpsPackage.HOST__ID:
				setId(((Long)newValue).longValue());
				return;
			case OpsPackage.HOST__MODIFIED:
				setModified((Date)newValue);
				return;
			case OpsPackage.HOST__REVISION:
				setRevision(((Integer)newValue).intValue());
				return;
			case OpsPackage.HOST__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case OpsPackage.HOST__NETWORK:
				setNetwork((String)newValue);
				return;
			case OpsPackage.HOST__PROVIDER_ID:
				setProviderId((String)newValue);
				return;
			case OpsPackage.HOST__GATEWAY:
				setGateway((IP)newValue);
				return;
			case OpsPackage.HOST__BLOCK:
				getBlock().clear();
				getBlock().addAll((Collection<? extends HostBlock>)newValue);
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
			case OpsPackage.HOST__NAME:
				setName(NAME_EDEFAULT);
				return;
			case OpsPackage.HOST__DATA_CENTER:
				setDataCenter((DataCenter)null);
				return;
			case OpsPackage.HOST__VSERVER:
				getVserver().clear();
				return;
			case OpsPackage.HOST__IP:
				getIp().clear();
				return;
			case OpsPackage.HOST__OWN_IP:
				setOwnIp((IP)null);
				return;
			case OpsPackage.HOST__ID:
				setId(ID_EDEFAULT);
				return;
			case OpsPackage.HOST__MODIFIED:
				setModified(MODIFIED_EDEFAULT);
				return;
			case OpsPackage.HOST__REVISION:
				setRevision(REVISION_EDEFAULT);
				return;
			case OpsPackage.HOST__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case OpsPackage.HOST__NETWORK:
				setNetwork(NETWORK_EDEFAULT);
				return;
			case OpsPackage.HOST__PROVIDER_ID:
				setProviderId(PROVIDER_ID_EDEFAULT);
				return;
			case OpsPackage.HOST__GATEWAY:
				setGateway((IP)null);
				return;
			case OpsPackage.HOST__BLOCK:
				getBlock().clear();
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
			case OpsPackage.HOST__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case OpsPackage.HOST__DATA_CENTER:
				return getDataCenter() != null;
			case OpsPackage.HOST__VSERVER:
				return vserver != null && !vserver.isEmpty();
			case OpsPackage.HOST__IP:
				return ip != null && !ip.isEmpty();
			case OpsPackage.HOST__OWN_IP:
				return ownIp != null;
			case OpsPackage.HOST__ID:
				return id != ID_EDEFAULT;
			case OpsPackage.HOST__MODIFIED:
				return MODIFIED_EDEFAULT == null ? modified != null : !MODIFIED_EDEFAULT.equals(modified);
			case OpsPackage.HOST__REVISION:
				return revision != REVISION_EDEFAULT;
			case OpsPackage.HOST__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case OpsPackage.HOST__NETWORK:
				return NETWORK_EDEFAULT == null ? network != null : !NETWORK_EDEFAULT.equals(network);
			case OpsPackage.HOST__PROVIDER_ID:
				return PROVIDER_ID_EDEFAULT == null ? providerId != null : !PROVIDER_ID_EDEFAULT.equals(providerId);
			case OpsPackage.HOST__GATEWAY:
				return gateway != null;
			case OpsPackage.HOST__BLOCK:
				return block != null && !block.isEmpty();
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
		result.append(", description: ");
		result.append(description);
		result.append(", network: ");
		result.append(network);
		result.append(", providerId: ");
		result.append(providerId);
		result.append(')');
		return result.toString();
	}

} //HostImpl

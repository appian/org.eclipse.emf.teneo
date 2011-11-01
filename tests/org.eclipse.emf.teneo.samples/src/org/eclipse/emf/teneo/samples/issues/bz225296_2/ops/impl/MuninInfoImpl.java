/**
 * <copyright>
 * </copyright>
 *
 * $Id: MuninInfoImpl.java,v 1.1 2008/04/06 13:45:43 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.impl;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.MuninInfo;
import org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.OpsPackage;
import org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.Role;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Munin Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.impl.MuninInfoImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.impl.MuninInfoImpl#getModified <em>Modified</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.impl.MuninInfoImpl#getRevision <em>Revision</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.impl.MuninInfoImpl#getPluginName <em>Plugin Name</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.impl.MuninInfoImpl#getWarningLevel <em>Warning Level</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.impl.MuninInfoImpl#getCriticalLevel <em>Critical Level</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.impl.MuninInfoImpl#isMonitorableByNagios <em>Monitorable By Nagios</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.impl.MuninInfoImpl#isDisplaySummary <em>Display Summary</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.impl.MuninInfoImpl#getRole <em>Role</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MuninInfoImpl extends EObjectImpl implements MuninInfo {
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
	 * The default value of the '{@link #getPluginName() <em>Plugin Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPluginName()
	 * @generated
	 * @ordered
	 */
	protected static final String PLUGIN_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPluginName() <em>Plugin Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPluginName()
	 * @generated
	 * @ordered
	 */
	protected String pluginName = PLUGIN_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getWarningLevel() <em>Warning Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWarningLevel()
	 * @generated
	 * @ordered
	 */
	protected static final String WARNING_LEVEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWarningLevel() <em>Warning Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWarningLevel()
	 * @generated
	 * @ordered
	 */
	protected String warningLevel = WARNING_LEVEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getCriticalLevel() <em>Critical Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCriticalLevel()
	 * @generated
	 * @ordered
	 */
	protected static final String CRITICAL_LEVEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCriticalLevel() <em>Critical Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCriticalLevel()
	 * @generated
	 * @ordered
	 */
	protected String criticalLevel = CRITICAL_LEVEL_EDEFAULT;

	/**
	 * The default value of the '{@link #isMonitorableByNagios() <em>Monitorable By Nagios</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMonitorableByNagios()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MONITORABLE_BY_NAGIOS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMonitorableByNagios() <em>Monitorable By Nagios</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMonitorableByNagios()
	 * @generated
	 * @ordered
	 */
	protected boolean monitorableByNagios = MONITORABLE_BY_NAGIOS_EDEFAULT;

	/**
	 * The default value of the '{@link #isDisplaySummary() <em>Display Summary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDisplaySummary()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DISPLAY_SUMMARY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDisplaySummary() <em>Display Summary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDisplaySummary()
	 * @generated
	 * @ordered
	 */
	protected boolean displaySummary = DISPLAY_SUMMARY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MuninInfoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OpsPackage.Literals.MUNIN_INFO;
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
			eNotify(new ENotificationImpl(this, Notification.SET, OpsPackage.MUNIN_INFO__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OpsPackage.MUNIN_INFO__MODIFIED, oldModified, modified));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OpsPackage.MUNIN_INFO__REVISION, oldRevision, revision));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPluginName() {
		return pluginName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPluginName(String newPluginName) {
		String oldPluginName = pluginName;
		pluginName = newPluginName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpsPackage.MUNIN_INFO__PLUGIN_NAME, oldPluginName, pluginName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWarningLevel() {
		return warningLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWarningLevel(String newWarningLevel) {
		String oldWarningLevel = warningLevel;
		warningLevel = newWarningLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpsPackage.MUNIN_INFO__WARNING_LEVEL, oldWarningLevel, warningLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCriticalLevel() {
		return criticalLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCriticalLevel(String newCriticalLevel) {
		String oldCriticalLevel = criticalLevel;
		criticalLevel = newCriticalLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpsPackage.MUNIN_INFO__CRITICAL_LEVEL, oldCriticalLevel, criticalLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMonitorableByNagios() {
		return monitorableByNagios;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMonitorableByNagios(boolean newMonitorableByNagios) {
		boolean oldMonitorableByNagios = monitorableByNagios;
		monitorableByNagios = newMonitorableByNagios;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpsPackage.MUNIN_INFO__MONITORABLE_BY_NAGIOS, oldMonitorableByNagios, monitorableByNagios));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDisplaySummary() {
		return displaySummary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisplaySummary(boolean newDisplaySummary) {
		boolean oldDisplaySummary = displaySummary;
		displaySummary = newDisplaySummary;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpsPackage.MUNIN_INFO__DISPLAY_SUMMARY, oldDisplaySummary, displaySummary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role getRole() {
		if (eContainerFeatureID != OpsPackage.MUNIN_INFO__ROLE) return null;
		return (Role)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRole(Role newRole, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newRole, OpsPackage.MUNIN_INFO__ROLE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRole(Role newRole) {
		if (newRole != eInternalContainer() || (eContainerFeatureID != OpsPackage.MUNIN_INFO__ROLE && newRole != null)) {
			if (EcoreUtil.isAncestor(this, newRole))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newRole != null)
				msgs = ((InternalEObject)newRole).eInverseAdd(this, OpsPackage.ROLE__MUNIN_INFO, Role.class, msgs);
			msgs = basicSetRole(newRole, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpsPackage.MUNIN_INFO__ROLE, newRole, newRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OpsPackage.MUNIN_INFO__ROLE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
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
			case OpsPackage.MUNIN_INFO__ROLE:
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
			case OpsPackage.MUNIN_INFO__ROLE:
				return eInternalContainer().eInverseRemove(this, OpsPackage.ROLE__MUNIN_INFO, Role.class, msgs);
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
			case OpsPackage.MUNIN_INFO__ID:
				return new Long(getId());
			case OpsPackage.MUNIN_INFO__MODIFIED:
				return getModified();
			case OpsPackage.MUNIN_INFO__REVISION:
				return new Integer(getRevision());
			case OpsPackage.MUNIN_INFO__PLUGIN_NAME:
				return getPluginName();
			case OpsPackage.MUNIN_INFO__WARNING_LEVEL:
				return getWarningLevel();
			case OpsPackage.MUNIN_INFO__CRITICAL_LEVEL:
				return getCriticalLevel();
			case OpsPackage.MUNIN_INFO__MONITORABLE_BY_NAGIOS:
				return isMonitorableByNagios() ? Boolean.TRUE : Boolean.FALSE;
			case OpsPackage.MUNIN_INFO__DISPLAY_SUMMARY:
				return isDisplaySummary() ? Boolean.TRUE : Boolean.FALSE;
			case OpsPackage.MUNIN_INFO__ROLE:
				return getRole();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OpsPackage.MUNIN_INFO__ID:
				setId(((Long)newValue).longValue());
				return;
			case OpsPackage.MUNIN_INFO__MODIFIED:
				setModified((Date)newValue);
				return;
			case OpsPackage.MUNIN_INFO__REVISION:
				setRevision(((Integer)newValue).intValue());
				return;
			case OpsPackage.MUNIN_INFO__PLUGIN_NAME:
				setPluginName((String)newValue);
				return;
			case OpsPackage.MUNIN_INFO__WARNING_LEVEL:
				setWarningLevel((String)newValue);
				return;
			case OpsPackage.MUNIN_INFO__CRITICAL_LEVEL:
				setCriticalLevel((String)newValue);
				return;
			case OpsPackage.MUNIN_INFO__MONITORABLE_BY_NAGIOS:
				setMonitorableByNagios(((Boolean)newValue).booleanValue());
				return;
			case OpsPackage.MUNIN_INFO__DISPLAY_SUMMARY:
				setDisplaySummary(((Boolean)newValue).booleanValue());
				return;
			case OpsPackage.MUNIN_INFO__ROLE:
				setRole((Role)newValue);
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
			case OpsPackage.MUNIN_INFO__ID:
				setId(ID_EDEFAULT);
				return;
			case OpsPackage.MUNIN_INFO__MODIFIED:
				setModified(MODIFIED_EDEFAULT);
				return;
			case OpsPackage.MUNIN_INFO__REVISION:
				setRevision(REVISION_EDEFAULT);
				return;
			case OpsPackage.MUNIN_INFO__PLUGIN_NAME:
				setPluginName(PLUGIN_NAME_EDEFAULT);
				return;
			case OpsPackage.MUNIN_INFO__WARNING_LEVEL:
				setWarningLevel(WARNING_LEVEL_EDEFAULT);
				return;
			case OpsPackage.MUNIN_INFO__CRITICAL_LEVEL:
				setCriticalLevel(CRITICAL_LEVEL_EDEFAULT);
				return;
			case OpsPackage.MUNIN_INFO__MONITORABLE_BY_NAGIOS:
				setMonitorableByNagios(MONITORABLE_BY_NAGIOS_EDEFAULT);
				return;
			case OpsPackage.MUNIN_INFO__DISPLAY_SUMMARY:
				setDisplaySummary(DISPLAY_SUMMARY_EDEFAULT);
				return;
			case OpsPackage.MUNIN_INFO__ROLE:
				setRole((Role)null);
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
			case OpsPackage.MUNIN_INFO__ID:
				return id != ID_EDEFAULT;
			case OpsPackage.MUNIN_INFO__MODIFIED:
				return MODIFIED_EDEFAULT == null ? modified != null : !MODIFIED_EDEFAULT.equals(modified);
			case OpsPackage.MUNIN_INFO__REVISION:
				return revision != REVISION_EDEFAULT;
			case OpsPackage.MUNIN_INFO__PLUGIN_NAME:
				return PLUGIN_NAME_EDEFAULT == null ? pluginName != null : !PLUGIN_NAME_EDEFAULT.equals(pluginName);
			case OpsPackage.MUNIN_INFO__WARNING_LEVEL:
				return WARNING_LEVEL_EDEFAULT == null ? warningLevel != null : !WARNING_LEVEL_EDEFAULT.equals(warningLevel);
			case OpsPackage.MUNIN_INFO__CRITICAL_LEVEL:
				return CRITICAL_LEVEL_EDEFAULT == null ? criticalLevel != null : !CRITICAL_LEVEL_EDEFAULT.equals(criticalLevel);
			case OpsPackage.MUNIN_INFO__MONITORABLE_BY_NAGIOS:
				return monitorableByNagios != MONITORABLE_BY_NAGIOS_EDEFAULT;
			case OpsPackage.MUNIN_INFO__DISPLAY_SUMMARY:
				return displaySummary != DISPLAY_SUMMARY_EDEFAULT;
			case OpsPackage.MUNIN_INFO__ROLE:
				return getRole() != null;
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
		result.append(" (id: ");
		result.append(id);
		result.append(", modified: ");
		result.append(modified);
		result.append(", revision: ");
		result.append(revision);
		result.append(", pluginName: ");
		result.append(pluginName);
		result.append(", warningLevel: ");
		result.append(warningLevel);
		result.append(", criticalLevel: ");
		result.append(criticalLevel);
		result.append(", monitorableByNagios: ");
		result.append(monitorableByNagios);
		result.append(", displaySummary: ");
		result.append(displaySummary);
		result.append(')');
		return result.toString();
	}

} //MuninInfoImpl

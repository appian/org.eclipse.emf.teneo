/**
 * <copyright>
 * </copyright>
 *
 * $Id: AccessControlImpl.java,v 1.1 2006/11/23 06:12:09 mtaal Exp $
 */
package lobj.impl;

import java.util.Collection;
import java.util.Date;

import lobj.AccessControl;
import lobj.Edition;
import lobj.LobjPackage;
import lobj.Sharednotes;
import lobj.User;
import lobj.Userauthorization;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Access Control</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link lobj.impl.AccessControlImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link lobj.impl.AccessControlImpl#getLastModified <em>Last Modified</em>}</li>
 *   <li>{@link lobj.impl.AccessControlImpl#getLastModifiedBy <em>Last Modified By</em>}</li>
 *   <li>{@link lobj.impl.AccessControlImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link lobj.impl.AccessControlImpl#getLastStatusChange <em>Last Status Change</em>}</li>
 *   <li>{@link lobj.impl.AccessControlImpl#getLastStatusChangeBy <em>Last Status Change By</em>}</li>
 *   <li>{@link lobj.impl.AccessControlImpl#getSharednotes <em>Sharednotes</em>}</li>
 *   <li>{@link lobj.impl.AccessControlImpl#getAuthorizes <em>Authorizes</em>}</li>
 *   <li>{@link lobj.impl.AccessControlImpl#getEditionHistory <em>Edition History</em>}</li>
 *   <li>{@link lobj.impl.AccessControlImpl#isGlobalAccess <em>Global Access</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AccessControlImpl extends EObjectImpl implements AccessControl {
	/**
	 * The cached value of the '{@link #getOwner() <em>Owner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwner()
	 * @generated
	 * @ordered
	 */
	protected User owner = null;

	/**
	 * The default value of the '{@link #getLastModified() <em>Last Modified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastModified()
	 * @generated
	 * @ordered
	 */
	protected static final Date LAST_MODIFIED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastModified() <em>Last Modified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastModified()
	 * @generated
	 * @ordered
	 */
	protected Date lastModified = LAST_MODIFIED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLastModifiedBy() <em>Last Modified By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastModifiedBy()
	 * @generated
	 * @ordered
	 */
	protected User lastModifiedBy = null;

	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final String STATUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected String status = STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastStatusChange() <em>Last Status Change</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastStatusChange()
	 * @generated
	 * @ordered
	 */
	protected static final Date LAST_STATUS_CHANGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastStatusChange() <em>Last Status Change</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastStatusChange()
	 * @generated
	 * @ordered
	 */
	protected Date lastStatusChange = LAST_STATUS_CHANGE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLastStatusChangeBy() <em>Last Status Change By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastStatusChangeBy()
	 * @generated
	 * @ordered
	 */
	protected User lastStatusChangeBy = null;

	/**
	 * The cached value of the '{@link #getSharednotes() <em>Sharednotes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSharednotes()
	 * @generated
	 * @ordered
	 */
	protected Sharednotes sharednotes = null;

	/**
	 * The cached value of the '{@link #getAuthorizes() <em>Authorizes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthorizes()
	 * @generated
	 * @ordered
	 */
	protected EList authorizes = null;

	/**
	 * The cached value of the '{@link #getEditionHistory() <em>Edition History</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEditionHistory()
	 * @generated
	 * @ordered
	 */
	protected EList editionHistory = null;

	/**
	 * The default value of the '{@link #isGlobalAccess() <em>Global Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGlobalAccess()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GLOBAL_ACCESS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isGlobalAccess() <em>Global Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGlobalAccess()
	 * @generated
	 * @ordered
	 */
	protected boolean globalAccess = GLOBAL_ACCESS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AccessControlImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return LobjPackage.Literals.ACCESS_CONTROL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User getOwner() {
		if (owner != null && owner.eIsProxy()) {
			InternalEObject oldOwner = (InternalEObject)owner;
			owner = (User)eResolveProxy(oldOwner);
			if (owner != oldOwner) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LobjPackage.ACCESS_CONTROL__OWNER, oldOwner, owner));
			}
		}
		return owner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User basicGetOwner() {
		return owner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwner(User newOwner) {
		User oldOwner = owner;
		owner = newOwner;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LobjPackage.ACCESS_CONTROL__OWNER, oldOwner, owner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getLastModified() {
		return lastModified;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastModified(Date newLastModified) {
		Date oldLastModified = lastModified;
		lastModified = newLastModified;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LobjPackage.ACCESS_CONTROL__LAST_MODIFIED, oldLastModified, lastModified));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User getLastModifiedBy() {
		return lastModifiedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastModifiedBy(User newLastModifiedBy) {
		User oldLastModifiedBy = lastModifiedBy;
		lastModifiedBy = newLastModifiedBy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LobjPackage.ACCESS_CONTROL__LAST_MODIFIED_BY, oldLastModifiedBy, lastModifiedBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(String newStatus) {
		String oldStatus = status;
		status = newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LobjPackage.ACCESS_CONTROL__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getLastStatusChange() {
		return lastStatusChange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastStatusChange(Date newLastStatusChange) {
		Date oldLastStatusChange = lastStatusChange;
		lastStatusChange = newLastStatusChange;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LobjPackage.ACCESS_CONTROL__LAST_STATUS_CHANGE, oldLastStatusChange, lastStatusChange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User getLastStatusChangeBy() {
		return lastStatusChangeBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastStatusChangeBy(User newLastStatusChangeBy) {
		User oldLastStatusChangeBy = lastStatusChangeBy;
		lastStatusChangeBy = newLastStatusChangeBy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LobjPackage.ACCESS_CONTROL__LAST_STATUS_CHANGE_BY, oldLastStatusChangeBy, lastStatusChangeBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sharednotes getSharednotes() {
		return sharednotes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSharednotes(Sharednotes newSharednotes, NotificationChain msgs) {
		Sharednotes oldSharednotes = sharednotes;
		sharednotes = newSharednotes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LobjPackage.ACCESS_CONTROL__SHAREDNOTES, oldSharednotes, newSharednotes);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSharednotes(Sharednotes newSharednotes) {
		if (newSharednotes != sharednotes) {
			NotificationChain msgs = null;
			if (sharednotes != null)
				msgs = ((InternalEObject)sharednotes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LobjPackage.ACCESS_CONTROL__SHAREDNOTES, null, msgs);
			if (newSharednotes != null)
				msgs = ((InternalEObject)newSharednotes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LobjPackage.ACCESS_CONTROL__SHAREDNOTES, null, msgs);
			msgs = basicSetSharednotes(newSharednotes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LobjPackage.ACCESS_CONTROL__SHAREDNOTES, newSharednotes, newSharednotes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getAuthorizes() {
		if (authorizes == null) {
			authorizes = new EObjectContainmentEList(Userauthorization.class, this, LobjPackage.ACCESS_CONTROL__AUTHORIZES);
		}
		return authorizes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getEditionHistory() {
		if (editionHistory == null) {
			editionHistory = new EObjectContainmentEList(Edition.class, this, LobjPackage.ACCESS_CONTROL__EDITION_HISTORY);
		}
		return editionHistory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isGlobalAccess() {
		return globalAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGlobalAccess(boolean newGlobalAccess) {
		boolean oldGlobalAccess = globalAccess;
		globalAccess = newGlobalAccess;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LobjPackage.ACCESS_CONTROL__GLOBAL_ACCESS, oldGlobalAccess, globalAccess));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LobjPackage.ACCESS_CONTROL__SHAREDNOTES:
				return basicSetSharednotes(null, msgs);
			case LobjPackage.ACCESS_CONTROL__AUTHORIZES:
				return ((InternalEList)getAuthorizes()).basicRemove(otherEnd, msgs);
			case LobjPackage.ACCESS_CONTROL__EDITION_HISTORY:
				return ((InternalEList)getEditionHistory()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LobjPackage.ACCESS_CONTROL__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case LobjPackage.ACCESS_CONTROL__LAST_MODIFIED:
				return getLastModified();
			case LobjPackage.ACCESS_CONTROL__LAST_MODIFIED_BY:
				return getLastModifiedBy();
			case LobjPackage.ACCESS_CONTROL__STATUS:
				return getStatus();
			case LobjPackage.ACCESS_CONTROL__LAST_STATUS_CHANGE:
				return getLastStatusChange();
			case LobjPackage.ACCESS_CONTROL__LAST_STATUS_CHANGE_BY:
				return getLastStatusChangeBy();
			case LobjPackage.ACCESS_CONTROL__SHAREDNOTES:
				return getSharednotes();
			case LobjPackage.ACCESS_CONTROL__AUTHORIZES:
				return getAuthorizes();
			case LobjPackage.ACCESS_CONTROL__EDITION_HISTORY:
				return getEditionHistory();
			case LobjPackage.ACCESS_CONTROL__GLOBAL_ACCESS:
				return isGlobalAccess() ? Boolean.TRUE : Boolean.FALSE;
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case LobjPackage.ACCESS_CONTROL__OWNER:
				setOwner((User)newValue);
				return;
			case LobjPackage.ACCESS_CONTROL__LAST_MODIFIED:
				setLastModified((Date)newValue);
				return;
			case LobjPackage.ACCESS_CONTROL__LAST_MODIFIED_BY:
				setLastModifiedBy((User)newValue);
				return;
			case LobjPackage.ACCESS_CONTROL__STATUS:
				setStatus((String)newValue);
				return;
			case LobjPackage.ACCESS_CONTROL__LAST_STATUS_CHANGE:
				setLastStatusChange((Date)newValue);
				return;
			case LobjPackage.ACCESS_CONTROL__LAST_STATUS_CHANGE_BY:
				setLastStatusChangeBy((User)newValue);
				return;
			case LobjPackage.ACCESS_CONTROL__SHAREDNOTES:
				setSharednotes((Sharednotes)newValue);
				return;
			case LobjPackage.ACCESS_CONTROL__AUTHORIZES:
				getAuthorizes().clear();
				getAuthorizes().addAll((Collection)newValue);
				return;
			case LobjPackage.ACCESS_CONTROL__EDITION_HISTORY:
				getEditionHistory().clear();
				getEditionHistory().addAll((Collection)newValue);
				return;
			case LobjPackage.ACCESS_CONTROL__GLOBAL_ACCESS:
				setGlobalAccess(((Boolean)newValue).booleanValue());
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case LobjPackage.ACCESS_CONTROL__OWNER:
				setOwner((User)null);
				return;
			case LobjPackage.ACCESS_CONTROL__LAST_MODIFIED:
				setLastModified(LAST_MODIFIED_EDEFAULT);
				return;
			case LobjPackage.ACCESS_CONTROL__LAST_MODIFIED_BY:
				setLastModifiedBy((User)null);
				return;
			case LobjPackage.ACCESS_CONTROL__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case LobjPackage.ACCESS_CONTROL__LAST_STATUS_CHANGE:
				setLastStatusChange(LAST_STATUS_CHANGE_EDEFAULT);
				return;
			case LobjPackage.ACCESS_CONTROL__LAST_STATUS_CHANGE_BY:
				setLastStatusChangeBy((User)null);
				return;
			case LobjPackage.ACCESS_CONTROL__SHAREDNOTES:
				setSharednotes((Sharednotes)null);
				return;
			case LobjPackage.ACCESS_CONTROL__AUTHORIZES:
				getAuthorizes().clear();
				return;
			case LobjPackage.ACCESS_CONTROL__EDITION_HISTORY:
				getEditionHistory().clear();
				return;
			case LobjPackage.ACCESS_CONTROL__GLOBAL_ACCESS:
				setGlobalAccess(GLOBAL_ACCESS_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case LobjPackage.ACCESS_CONTROL__OWNER:
				return owner != null;
			case LobjPackage.ACCESS_CONTROL__LAST_MODIFIED:
				return LAST_MODIFIED_EDEFAULT == null ? lastModified != null : !LAST_MODIFIED_EDEFAULT.equals(lastModified);
			case LobjPackage.ACCESS_CONTROL__LAST_MODIFIED_BY:
				return lastModifiedBy != null;
			case LobjPackage.ACCESS_CONTROL__STATUS:
				return STATUS_EDEFAULT == null ? status != null : !STATUS_EDEFAULT.equals(status);
			case LobjPackage.ACCESS_CONTROL__LAST_STATUS_CHANGE:
				return LAST_STATUS_CHANGE_EDEFAULT == null ? lastStatusChange != null : !LAST_STATUS_CHANGE_EDEFAULT.equals(lastStatusChange);
			case LobjPackage.ACCESS_CONTROL__LAST_STATUS_CHANGE_BY:
				return lastStatusChangeBy != null;
			case LobjPackage.ACCESS_CONTROL__SHAREDNOTES:
				return sharednotes != null;
			case LobjPackage.ACCESS_CONTROL__AUTHORIZES:
				return authorizes != null && !authorizes.isEmpty();
			case LobjPackage.ACCESS_CONTROL__EDITION_HISTORY:
				return editionHistory != null && !editionHistory.isEmpty();
			case LobjPackage.ACCESS_CONTROL__GLOBAL_ACCESS:
				return globalAccess != GLOBAL_ACCESS_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (lastModified: ");
		result.append(lastModified);
		result.append(", status: ");
		result.append(status);
		result.append(", lastStatusChange: ");
		result.append(lastStatusChange);
		result.append(", globalAccess: ");
		result.append(globalAccess);
		result.append(')');
		return result.toString();
	}

} //AccessControlImpl
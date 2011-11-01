/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package lobj.impl;

import java.util.Date;

import lobj.Edition;
import lobj.LobjPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Edition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link lobj.impl.EditionImpl#getEditionNr <em>Edition Nr</em>}</li>
 *   <li>{@link lobj.impl.EditionImpl#getEditedBy <em>Edited By</em>}</li>
 *   <li>{@link lobj.impl.EditionImpl#isVersion <em>Version</em>}</li>
 *   <li>{@link lobj.impl.EditionImpl#getLastVersionNumber <em>Last Version Number</em>}</li>
 *   <li>{@link lobj.impl.EditionImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link lobj.impl.EditionImpl#getEditionCreationDate <em>Edition Creation Date</em>}</li>
 *   <li>{@link lobj.impl.EditionImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EditionImpl extends EObjectImpl implements Edition {
	/**
	 * The default value of the '{@link #getEditionNr() <em>Edition Nr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEditionNr()
	 * @generated
	 * @ordered
	 */
	protected static final String EDITION_NR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEditionNr() <em>Edition Nr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEditionNr()
	 * @generated
	 * @ordered
	 */
	protected String editionNr = EDITION_NR_EDEFAULT;

	/**
	 * The default value of the '{@link #getEditedBy() <em>Edited By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEditedBy()
	 * @generated
	 * @ordered
	 */
	protected static final String EDITED_BY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEditedBy() <em>Edited By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEditedBy()
	 * @generated
	 * @ordered
	 */
	protected String editedBy = EDITED_BY_EDEFAULT;

	/**
	 * The default value of the '{@link #isVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVersion()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VERSION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVersion()
	 * @generated
	 * @ordered
	 */
	protected boolean version = VERSION_EDEFAULT;

	/**
	 * This is true if the Version attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean versionESet;

	/**
	 * The default value of the '{@link #getLastVersionNumber() <em>Last Version Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastVersionNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String LAST_VERSION_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastVersionNumber() <em>Last Version Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastVersionNumber()
	 * @generated
	 * @ordered
	 */
	protected String lastVersionNumber = LAST_VERSION_NUMBER_EDEFAULT;

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
	 * The default value of the '{@link #getEditionCreationDate() <em>Edition Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEditionCreationDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date EDITION_CREATION_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEditionCreationDate() <em>Edition Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEditionCreationDate()
	 * @generated
	 * @ordered
	 */
	protected Date editionCreationDate = EDITION_CREATION_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return LobjPackage.Literals.EDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEditionNr() {
		return editionNr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEditionNr(String newEditionNr) {
		String oldEditionNr = editionNr;
		editionNr = newEditionNr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LobjPackage.EDITION__EDITION_NR, oldEditionNr, editionNr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEditedBy() {
		return editedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEditedBy(String newEditedBy) {
		String oldEditedBy = editedBy;
		editedBy = newEditedBy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LobjPackage.EDITION__EDITED_BY, oldEditedBy, editedBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(boolean newVersion) {
		boolean oldVersion = version;
		version = newVersion;
		boolean oldVersionESet = versionESet;
		versionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LobjPackage.EDITION__VERSION, oldVersion, version, !oldVersionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetVersion() {
		boolean oldVersion = version;
		boolean oldVersionESet = versionESet;
		version = VERSION_EDEFAULT;
		versionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, LobjPackage.EDITION__VERSION, oldVersion, VERSION_EDEFAULT, oldVersionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetVersion() {
		return versionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLastVersionNumber() {
		return lastVersionNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastVersionNumber(String newLastVersionNumber) {
		String oldLastVersionNumber = lastVersionNumber;
		lastVersionNumber = newLastVersionNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LobjPackage.EDITION__LAST_VERSION_NUMBER, oldLastVersionNumber, lastVersionNumber));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LobjPackage.EDITION__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getEditionCreationDate() {
		return editionCreationDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEditionCreationDate(Date newEditionCreationDate) {
		Date oldEditionCreationDate = editionCreationDate;
		editionCreationDate = newEditionCreationDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LobjPackage.EDITION__EDITION_CREATION_DATE, oldEditionCreationDate, editionCreationDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LobjPackage.EDITION__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LobjPackage.EDITION__EDITION_NR:
				return getEditionNr();
			case LobjPackage.EDITION__EDITED_BY:
				return getEditedBy();
			case LobjPackage.EDITION__VERSION:
				return isVersion() ? Boolean.TRUE : Boolean.FALSE;
			case LobjPackage.EDITION__LAST_VERSION_NUMBER:
				return getLastVersionNumber();
			case LobjPackage.EDITION__STATUS:
				return getStatus();
			case LobjPackage.EDITION__EDITION_CREATION_DATE:
				return getEditionCreationDate();
			case LobjPackage.EDITION__ID:
				return getId();
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
			case LobjPackage.EDITION__EDITION_NR:
				setEditionNr((String)newValue);
				return;
			case LobjPackage.EDITION__EDITED_BY:
				setEditedBy((String)newValue);
				return;
			case LobjPackage.EDITION__VERSION:
				setVersion(((Boolean)newValue).booleanValue());
				return;
			case LobjPackage.EDITION__LAST_VERSION_NUMBER:
				setLastVersionNumber((String)newValue);
				return;
			case LobjPackage.EDITION__STATUS:
				setStatus((String)newValue);
				return;
			case LobjPackage.EDITION__EDITION_CREATION_DATE:
				setEditionCreationDate((Date)newValue);
				return;
			case LobjPackage.EDITION__ID:
				setId((String)newValue);
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
			case LobjPackage.EDITION__EDITION_NR:
				setEditionNr(EDITION_NR_EDEFAULT);
				return;
			case LobjPackage.EDITION__EDITED_BY:
				setEditedBy(EDITED_BY_EDEFAULT);
				return;
			case LobjPackage.EDITION__VERSION:
				unsetVersion();
				return;
			case LobjPackage.EDITION__LAST_VERSION_NUMBER:
				setLastVersionNumber(LAST_VERSION_NUMBER_EDEFAULT);
				return;
			case LobjPackage.EDITION__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case LobjPackage.EDITION__EDITION_CREATION_DATE:
				setEditionCreationDate(EDITION_CREATION_DATE_EDEFAULT);
				return;
			case LobjPackage.EDITION__ID:
				setId(ID_EDEFAULT);
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
			case LobjPackage.EDITION__EDITION_NR:
				return EDITION_NR_EDEFAULT == null ? editionNr != null : !EDITION_NR_EDEFAULT.equals(editionNr);
			case LobjPackage.EDITION__EDITED_BY:
				return EDITED_BY_EDEFAULT == null ? editedBy != null : !EDITED_BY_EDEFAULT.equals(editedBy);
			case LobjPackage.EDITION__VERSION:
				return isSetVersion();
			case LobjPackage.EDITION__LAST_VERSION_NUMBER:
				return LAST_VERSION_NUMBER_EDEFAULT == null ? lastVersionNumber != null : !LAST_VERSION_NUMBER_EDEFAULT.equals(lastVersionNumber);
			case LobjPackage.EDITION__STATUS:
				return STATUS_EDEFAULT == null ? status != null : !STATUS_EDEFAULT.equals(status);
			case LobjPackage.EDITION__EDITION_CREATION_DATE:
				return EDITION_CREATION_DATE_EDEFAULT == null ? editionCreationDate != null : !EDITION_CREATION_DATE_EDEFAULT.equals(editionCreationDate);
			case LobjPackage.EDITION__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
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
		result.append(" (editionNr: ");
		result.append(editionNr);
		result.append(", editedBy: ");
		result.append(editedBy);
		result.append(", version: ");
		if (versionESet) result.append(version); else result.append("<unset>");
		result.append(", lastVersionNumber: ");
		result.append(lastVersionNumber);
		result.append(", status: ");
		result.append(status);
		result.append(", editionCreationDate: ");
		result.append(editionCreationDate);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //EditionImpl

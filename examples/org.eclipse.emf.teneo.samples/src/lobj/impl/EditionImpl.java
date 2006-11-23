/**
 * <copyright>
 * </copyright>
 *
 * $Id: EditionImpl.java,v 1.1 2006/11/23 06:12:10 mtaal Exp $
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
 *   <li>{@link lobj.impl.EditionImpl#getEditionNumber <em>Edition Number</em>}</li>
 *   <li>{@link lobj.impl.EditionImpl#getEditedBy <em>Edited By</em>}</li>
 *   <li>{@link lobj.impl.EditionImpl#isIsVersion <em>Is Version</em>}</li>
 *   <li>{@link lobj.impl.EditionImpl#getLastVersionNumber <em>Last Version Number</em>}</li>
 *   <li>{@link lobj.impl.EditionImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link lobj.impl.EditionImpl#getEditionCreationDate <em>Edition Creation Date</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EditionImpl extends EObjectImpl implements Edition {
	/**
	 * The default value of the '{@link #getEditionNumber() <em>Edition Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEditionNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String EDITION_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEditionNumber() <em>Edition Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEditionNumber()
	 * @generated
	 * @ordered
	 */
	protected String editionNumber = EDITION_NUMBER_EDEFAULT;

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
	 * The default value of the '{@link #isIsVersion() <em>Is Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsVersion()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_VERSION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsVersion() <em>Is Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsVersion()
	 * @generated
	 * @ordered
	 */
	protected boolean isVersion = IS_VERSION_EDEFAULT;

	/**
	 * This is true if the Is Version attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isVersionESet = false;

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
	public String getEditionNumber() {
		return editionNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEditionNumber(String newEditionNumber) {
		String oldEditionNumber = editionNumber;
		editionNumber = newEditionNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LobjPackage.EDITION__EDITION_NUMBER, oldEditionNumber, editionNumber));
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
	public boolean isIsVersion() {
		return isVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsVersion(boolean newIsVersion) {
		boolean oldIsVersion = isVersion;
		isVersion = newIsVersion;
		boolean oldIsVersionESet = isVersionESet;
		isVersionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LobjPackage.EDITION__IS_VERSION, oldIsVersion, isVersion, !oldIsVersionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsVersion() {
		boolean oldIsVersion = isVersion;
		boolean oldIsVersionESet = isVersionESet;
		isVersion = IS_VERSION_EDEFAULT;
		isVersionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, LobjPackage.EDITION__IS_VERSION, oldIsVersion, IS_VERSION_EDEFAULT, oldIsVersionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsVersion() {
		return isVersionESet;
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LobjPackage.EDITION__EDITION_NUMBER:
				return getEditionNumber();
			case LobjPackage.EDITION__EDITED_BY:
				return getEditedBy();
			case LobjPackage.EDITION__IS_VERSION:
				return isIsVersion() ? Boolean.TRUE : Boolean.FALSE;
			case LobjPackage.EDITION__LAST_VERSION_NUMBER:
				return getLastVersionNumber();
			case LobjPackage.EDITION__STATUS:
				return getStatus();
			case LobjPackage.EDITION__EDITION_CREATION_DATE:
				return getEditionCreationDate();
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
			case LobjPackage.EDITION__EDITION_NUMBER:
				setEditionNumber((String)newValue);
				return;
			case LobjPackage.EDITION__EDITED_BY:
				setEditedBy((String)newValue);
				return;
			case LobjPackage.EDITION__IS_VERSION:
				setIsVersion(((Boolean)newValue).booleanValue());
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
			case LobjPackage.EDITION__EDITION_NUMBER:
				setEditionNumber(EDITION_NUMBER_EDEFAULT);
				return;
			case LobjPackage.EDITION__EDITED_BY:
				setEditedBy(EDITED_BY_EDEFAULT);
				return;
			case LobjPackage.EDITION__IS_VERSION:
				unsetIsVersion();
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
			case LobjPackage.EDITION__EDITION_NUMBER:
				return EDITION_NUMBER_EDEFAULT == null ? editionNumber != null : !EDITION_NUMBER_EDEFAULT.equals(editionNumber);
			case LobjPackage.EDITION__EDITED_BY:
				return EDITED_BY_EDEFAULT == null ? editedBy != null : !EDITED_BY_EDEFAULT.equals(editedBy);
			case LobjPackage.EDITION__IS_VERSION:
				return isSetIsVersion();
			case LobjPackage.EDITION__LAST_VERSION_NUMBER:
				return LAST_VERSION_NUMBER_EDEFAULT == null ? lastVersionNumber != null : !LAST_VERSION_NUMBER_EDEFAULT.equals(lastVersionNumber);
			case LobjPackage.EDITION__STATUS:
				return STATUS_EDEFAULT == null ? status != null : !STATUS_EDEFAULT.equals(status);
			case LobjPackage.EDITION__EDITION_CREATION_DATE:
				return EDITION_CREATION_DATE_EDEFAULT == null ? editionCreationDate != null : !EDITION_CREATION_DATE_EDEFAULT.equals(editionCreationDate);
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
		result.append(" (editionNumber: ");
		result.append(editionNumber);
		result.append(", editedBy: ");
		result.append(editedBy);
		result.append(", isVersion: ");
		if (isVersionESet) result.append(isVersion); else result.append("<unset>");
		result.append(", lastVersionNumber: ");
		result.append(lastVersionNumber);
		result.append(", status: ");
		result.append(status);
		result.append(", editionCreationDate: ");
		result.append(editionCreationDate);
		result.append(')');
		return result.toString();
	}

} //EditionImpl
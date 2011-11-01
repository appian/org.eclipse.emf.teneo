/**
 * <copyright>
 * </copyright>
 *
 * $Id: ResrcFolderImpl.java,v 1.3 2007/03/28 13:56:54 mtaal Exp $
 */
package lobj.impl;

import java.util.Collection;

import lobj.AccessControl;
import lobj.FolderMeta;
import lobj.LobjPackage;
import lobj.ResrcFile;
import lobj.ResrcFolder;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resrc Folder</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link lobj.impl.ResrcFolderImpl#getFolderMeta <em>Folder Meta</em>}</li>
 *   <li>{@link lobj.impl.ResrcFolderImpl#getResrcFolder <em>Resrc Folder</em>}</li>
 *   <li>{@link lobj.impl.ResrcFolderImpl#getAccessControl <em>Access Control</em>}</li>
 *   <li>{@link lobj.impl.ResrcFolderImpl#isDeleteScheduled <em>Delete Scheduled</em>}</li>
 *   <li>{@link lobj.impl.ResrcFolderImpl#getResrcFile <em>Resrc File</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResrcFolderImpl extends LearningObjectImpl implements ResrcFolder {
	/**
	 * The cached value of the '{@link #getFolderMeta() <em>Folder Meta</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFolderMeta()
	 * @generated
	 * @ordered
	 */
	protected FolderMeta folderMeta = null;

	/**
	 * The cached value of the '{@link #getResrcFolder() <em>Resrc Folder</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResrcFolder()
	 * @generated
	 * @ordered
	 */
	protected EList resrcFolder = null;

	/**
	 * The cached value of the '{@link #getAccessControl() <em>Access Control</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessControl()
	 * @generated
	 * @ordered
	 */
	protected AccessControl accessControl = null;

	/**
	 * The default value of the '{@link #isDeleteScheduled() <em>Delete Scheduled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDeleteScheduled()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DELETE_SCHEDULED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDeleteScheduled() <em>Delete Scheduled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDeleteScheduled()
	 * @generated
	 * @ordered
	 */
	protected boolean deleteScheduled = DELETE_SCHEDULED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getResrcFile() <em>Resrc File</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResrcFile()
	 * @generated
	 * @ordered
	 */
	protected EList resrcFile = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResrcFolderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return LobjPackage.Literals.RESRC_FOLDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FolderMeta getFolderMeta() {
		return folderMeta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFolderMeta(FolderMeta newFolderMeta, NotificationChain msgs) {
		FolderMeta oldFolderMeta = folderMeta;
		folderMeta = newFolderMeta;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LobjPackage.RESRC_FOLDER__FOLDER_META, oldFolderMeta, newFolderMeta);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFolderMeta(FolderMeta newFolderMeta) {
		if (newFolderMeta != folderMeta) {
			NotificationChain msgs = null;
			if (folderMeta != null)
				msgs = ((InternalEObject)folderMeta).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LobjPackage.RESRC_FOLDER__FOLDER_META, null, msgs);
			if (newFolderMeta != null)
				msgs = ((InternalEObject)newFolderMeta).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LobjPackage.RESRC_FOLDER__FOLDER_META, null, msgs);
			msgs = basicSetFolderMeta(newFolderMeta, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LobjPackage.RESRC_FOLDER__FOLDER_META, newFolderMeta, newFolderMeta));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getResrcFolder() {
		if (resrcFolder == null) {
			resrcFolder = new EObjectContainmentEList(ResrcFolder.class, this, LobjPackage.RESRC_FOLDER__RESRC_FOLDER);
		}
		return resrcFolder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessControl getAccessControl() {
		return accessControl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAccessControl(AccessControl newAccessControl, NotificationChain msgs) {
		AccessControl oldAccessControl = accessControl;
		accessControl = newAccessControl;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LobjPackage.RESRC_FOLDER__ACCESS_CONTROL, oldAccessControl, newAccessControl);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccessControl(AccessControl newAccessControl) {
		if (newAccessControl != accessControl) {
			NotificationChain msgs = null;
			if (accessControl != null)
				msgs = ((InternalEObject)accessControl).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LobjPackage.RESRC_FOLDER__ACCESS_CONTROL, null, msgs);
			if (newAccessControl != null)
				msgs = ((InternalEObject)newAccessControl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LobjPackage.RESRC_FOLDER__ACCESS_CONTROL, null, msgs);
			msgs = basicSetAccessControl(newAccessControl, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LobjPackage.RESRC_FOLDER__ACCESS_CONTROL, newAccessControl, newAccessControl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDeleteScheduled() {
		return deleteScheduled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeleteScheduled(boolean newDeleteScheduled) {
		boolean oldDeleteScheduled = deleteScheduled;
		deleteScheduled = newDeleteScheduled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LobjPackage.RESRC_FOLDER__DELETE_SCHEDULED, oldDeleteScheduled, deleteScheduled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getResrcFile() {
		if (resrcFile == null) {
			resrcFile = new EObjectContainmentEList(ResrcFile.class, this, LobjPackage.RESRC_FOLDER__RESRC_FILE);
		}
		return resrcFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LobjPackage.RESRC_FOLDER__FOLDER_META:
				return basicSetFolderMeta(null, msgs);
			case LobjPackage.RESRC_FOLDER__RESRC_FOLDER:
				return ((InternalEList)getResrcFolder()).basicRemove(otherEnd, msgs);
			case LobjPackage.RESRC_FOLDER__ACCESS_CONTROL:
				return basicSetAccessControl(null, msgs);
			case LobjPackage.RESRC_FOLDER__RESRC_FILE:
				return ((InternalEList)getResrcFile()).basicRemove(otherEnd, msgs);
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
			case LobjPackage.RESRC_FOLDER__FOLDER_META:
				return getFolderMeta();
			case LobjPackage.RESRC_FOLDER__RESRC_FOLDER:
				return getResrcFolder();
			case LobjPackage.RESRC_FOLDER__ACCESS_CONTROL:
				return getAccessControl();
			case LobjPackage.RESRC_FOLDER__DELETE_SCHEDULED:
				return isDeleteScheduled() ? Boolean.TRUE : Boolean.FALSE;
			case LobjPackage.RESRC_FOLDER__RESRC_FILE:
				return getResrcFile();
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
			case LobjPackage.RESRC_FOLDER__FOLDER_META:
				setFolderMeta((FolderMeta)newValue);
				return;
			case LobjPackage.RESRC_FOLDER__RESRC_FOLDER:
				getResrcFolder().clear();
				getResrcFolder().addAll((Collection)newValue);
				return;
			case LobjPackage.RESRC_FOLDER__ACCESS_CONTROL:
				setAccessControl((AccessControl)newValue);
				return;
			case LobjPackage.RESRC_FOLDER__DELETE_SCHEDULED:
				setDeleteScheduled(((Boolean)newValue).booleanValue());
				return;
			case LobjPackage.RESRC_FOLDER__RESRC_FILE:
				getResrcFile().clear();
				getResrcFile().addAll((Collection)newValue);
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
			case LobjPackage.RESRC_FOLDER__FOLDER_META:
				setFolderMeta((FolderMeta)null);
				return;
			case LobjPackage.RESRC_FOLDER__RESRC_FOLDER:
				getResrcFolder().clear();
				return;
			case LobjPackage.RESRC_FOLDER__ACCESS_CONTROL:
				setAccessControl((AccessControl)null);
				return;
			case LobjPackage.RESRC_FOLDER__DELETE_SCHEDULED:
				setDeleteScheduled(DELETE_SCHEDULED_EDEFAULT);
				return;
			case LobjPackage.RESRC_FOLDER__RESRC_FILE:
				getResrcFile().clear();
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
			case LobjPackage.RESRC_FOLDER__FOLDER_META:
				return folderMeta != null;
			case LobjPackage.RESRC_FOLDER__RESRC_FOLDER:
				return resrcFolder != null && !resrcFolder.isEmpty();
			case LobjPackage.RESRC_FOLDER__ACCESS_CONTROL:
				return accessControl != null;
			case LobjPackage.RESRC_FOLDER__DELETE_SCHEDULED:
				return deleteScheduled != DELETE_SCHEDULED_EDEFAULT;
			case LobjPackage.RESRC_FOLDER__RESRC_FILE:
				return resrcFile != null && !resrcFile.isEmpty();
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
		result.append(" (deleteScheduled: ");
		result.append(deleteScheduled);
		result.append(')');
		return result.toString();
	}

} //ResrcFolderImpl

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package lobj.impl;

import java.util.Collection;

import lobj.AccessControl;
import lobj.FolderMeta;
import lobj.LearningUnit;
import lobj.LobjPackage;
import lobj.LuFolder;

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
 * An implementation of the model object '<em><b>Lu Folder</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link lobj.impl.LuFolderImpl#getFolderMeta <em>Folder Meta</em>}</li>
 *   <li>{@link lobj.impl.LuFolderImpl#getLuFolder <em>Lu Folder</em>}</li>
 *   <li>{@link lobj.impl.LuFolderImpl#getLearningUnit <em>Learning Unit</em>}</li>
 *   <li>{@link lobj.impl.LuFolderImpl#getAccessControl <em>Access Control</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LuFolderImpl extends LearningObjectImpl implements LuFolder {
	/**
	 * The cached value of the '{@link #getFolderMeta() <em>Folder Meta</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFolderMeta()
	 * @generated
	 * @ordered
	 */
	protected FolderMeta folderMeta;

	/**
	 * The cached value of the '{@link #getLuFolder() <em>Lu Folder</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLuFolder()
	 * @generated
	 * @ordered
	 */
	protected EList luFolder;

	/**
	 * The cached value of the '{@link #getLearningUnit() <em>Learning Unit</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLearningUnit()
	 * @generated
	 * @ordered
	 */
	protected EList learningUnit;

	/**
	 * The cached value of the '{@link #getAccessControl() <em>Access Control</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessControl()
	 * @generated
	 * @ordered
	 */
	protected AccessControl accessControl;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LuFolderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return LobjPackage.Literals.LU_FOLDER;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LobjPackage.LU_FOLDER__FOLDER_META, oldFolderMeta, newFolderMeta);
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
				msgs = ((InternalEObject)folderMeta).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LobjPackage.LU_FOLDER__FOLDER_META, null, msgs);
			if (newFolderMeta != null)
				msgs = ((InternalEObject)newFolderMeta).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LobjPackage.LU_FOLDER__FOLDER_META, null, msgs);
			msgs = basicSetFolderMeta(newFolderMeta, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LobjPackage.LU_FOLDER__FOLDER_META, newFolderMeta, newFolderMeta));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getLuFolder() {
		if (luFolder == null) {
			luFolder = new EObjectContainmentEList(LuFolder.class, this, LobjPackage.LU_FOLDER__LU_FOLDER);
		}
		return luFolder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getLearningUnit() {
		if (learningUnit == null) {
			learningUnit = new EObjectContainmentEList(LearningUnit.class, this, LobjPackage.LU_FOLDER__LEARNING_UNIT);
		}
		return learningUnit;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LobjPackage.LU_FOLDER__ACCESS_CONTROL, oldAccessControl, newAccessControl);
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
				msgs = ((InternalEObject)accessControl).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LobjPackage.LU_FOLDER__ACCESS_CONTROL, null, msgs);
			if (newAccessControl != null)
				msgs = ((InternalEObject)newAccessControl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LobjPackage.LU_FOLDER__ACCESS_CONTROL, null, msgs);
			msgs = basicSetAccessControl(newAccessControl, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LobjPackage.LU_FOLDER__ACCESS_CONTROL, newAccessControl, newAccessControl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LobjPackage.LU_FOLDER__FOLDER_META:
				return basicSetFolderMeta(null, msgs);
			case LobjPackage.LU_FOLDER__LU_FOLDER:
				return ((InternalEList)getLuFolder()).basicRemove(otherEnd, msgs);
			case LobjPackage.LU_FOLDER__LEARNING_UNIT:
				return ((InternalEList)getLearningUnit()).basicRemove(otherEnd, msgs);
			case LobjPackage.LU_FOLDER__ACCESS_CONTROL:
				return basicSetAccessControl(null, msgs);
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
			case LobjPackage.LU_FOLDER__FOLDER_META:
				return getFolderMeta();
			case LobjPackage.LU_FOLDER__LU_FOLDER:
				return getLuFolder();
			case LobjPackage.LU_FOLDER__LEARNING_UNIT:
				return getLearningUnit();
			case LobjPackage.LU_FOLDER__ACCESS_CONTROL:
				return getAccessControl();
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
			case LobjPackage.LU_FOLDER__FOLDER_META:
				setFolderMeta((FolderMeta)newValue);
				return;
			case LobjPackage.LU_FOLDER__LU_FOLDER:
				getLuFolder().clear();
				getLuFolder().addAll((Collection)newValue);
				return;
			case LobjPackage.LU_FOLDER__LEARNING_UNIT:
				getLearningUnit().clear();
				getLearningUnit().addAll((Collection)newValue);
				return;
			case LobjPackage.LU_FOLDER__ACCESS_CONTROL:
				setAccessControl((AccessControl)newValue);
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
			case LobjPackage.LU_FOLDER__FOLDER_META:
				setFolderMeta((FolderMeta)null);
				return;
			case LobjPackage.LU_FOLDER__LU_FOLDER:
				getLuFolder().clear();
				return;
			case LobjPackage.LU_FOLDER__LEARNING_UNIT:
				getLearningUnit().clear();
				return;
			case LobjPackage.LU_FOLDER__ACCESS_CONTROL:
				setAccessControl((AccessControl)null);
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
			case LobjPackage.LU_FOLDER__FOLDER_META:
				return folderMeta != null;
			case LobjPackage.LU_FOLDER__LU_FOLDER:
				return luFolder != null && !luFolder.isEmpty();
			case LobjPackage.LU_FOLDER__LEARNING_UNIT:
				return learningUnit != null && !learningUnit.isEmpty();
			case LobjPackage.LU_FOLDER__ACCESS_CONTROL:
				return accessControl != null;
		}
		return super.eIsSet(featureID);
	}

} //LuFolderImpl

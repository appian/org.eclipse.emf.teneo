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
import lobj.LobjPackage;
import lobj.Module;
import lobj.ModuleFolder;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Module Folder</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link lobj.impl.ModuleFolderImpl#getFolderMeta <em>Folder Meta</em>}</li>
 * <li>{@link lobj.impl.ModuleFolderImpl#getModuleFolder <em>Module Folder</em>}</li>
 * <li>{@link lobj.impl.ModuleFolderImpl#getModule <em>Module</em>}</li>
 * <li>{@link lobj.impl.ModuleFolderImpl#getAccessControl <em>Access Control</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class ModuleFolderImpl extends LearningObjectImpl implements ModuleFolder {
	/**
	 * The cached value of the '{@link #getFolderMeta() <em>Folder Meta</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getFolderMeta()
	 * @generated
	 * @ordered
	 */
	protected FolderMeta folderMeta;

	/**
	 * The cached value of the '{@link #getModuleFolder() <em>Module Folder</em>}' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getModuleFolder()
	 * @generated
	 * @ordered
	 */
	protected EList moduleFolder;

	/**
	 * The cached value of the '{@link #getModule() <em>Module</em>}' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getModule()
	 * @generated
	 * @ordered
	 */
	protected EList module;

	/**
	 * The cached value of the '{@link #getAccessControl() <em>Access Control</em>}' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getAccessControl()
	 * @generated
	 * @ordered
	 */
	protected AccessControl accessControl;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ModuleFolderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected EClass eStaticClass() {
		return LobjPackage.Literals.MODULE_FOLDER;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public FolderMeta getFolderMeta() {
		return folderMeta;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetFolderMeta(FolderMeta newFolderMeta, NotificationChain msgs) {
		FolderMeta oldFolderMeta = folderMeta;
		folderMeta = newFolderMeta;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					LobjPackage.MODULE_FOLDER__FOLDER_META, oldFolderMeta, newFolderMeta);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setFolderMeta(FolderMeta newFolderMeta) {
		if (newFolderMeta != folderMeta) {
			NotificationChain msgs = null;
			if (folderMeta != null)
				msgs = ((InternalEObject) folderMeta).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
						- LobjPackage.MODULE_FOLDER__FOLDER_META, null, msgs);
			if (newFolderMeta != null)
				msgs = ((InternalEObject) newFolderMeta).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
						- LobjPackage.MODULE_FOLDER__FOLDER_META, null, msgs);
			msgs = basicSetFolderMeta(newFolderMeta, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LobjPackage.MODULE_FOLDER__FOLDER_META,
					newFolderMeta, newFolderMeta));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList getModuleFolder() {
		if (moduleFolder == null) {
			moduleFolder = new EObjectContainmentEList(ModuleFolder.class, this,
					LobjPackage.MODULE_FOLDER__MODULE_FOLDER);
		}
		return moduleFolder;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList getModule() {
		if (module == null) {
			module = new EObjectContainmentEList(Module.class, this, LobjPackage.MODULE_FOLDER__MODULE);
		}
		return module;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public AccessControl getAccessControl() {
		return accessControl;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetAccessControl(AccessControl newAccessControl,
			NotificationChain msgs) {
		AccessControl oldAccessControl = accessControl;
		accessControl = newAccessControl;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					LobjPackage.MODULE_FOLDER__ACCESS_CONTROL, oldAccessControl, newAccessControl);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setAccessControl(AccessControl newAccessControl) {
		if (newAccessControl != accessControl) {
			NotificationChain msgs = null;
			if (accessControl != null)
				msgs = ((InternalEObject) accessControl).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
						- LobjPackage.MODULE_FOLDER__ACCESS_CONTROL, null, msgs);
			if (newAccessControl != null)
				msgs = ((InternalEObject) newAccessControl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
						- LobjPackage.MODULE_FOLDER__ACCESS_CONTROL, null, msgs);
			msgs = basicSetAccessControl(newAccessControl, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					LobjPackage.MODULE_FOLDER__ACCESS_CONTROL, newAccessControl, newAccessControl));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID,
			NotificationChain msgs) {
		switch (featureID) {
		case LobjPackage.MODULE_FOLDER__FOLDER_META:
			return basicSetFolderMeta(null, msgs);
		case LobjPackage.MODULE_FOLDER__MODULE_FOLDER:
			return ((InternalEList) getModuleFolder()).basicRemove(otherEnd, msgs);
		case LobjPackage.MODULE_FOLDER__MODULE:
			return ((InternalEList) getModule()).basicRemove(otherEnd, msgs);
		case LobjPackage.MODULE_FOLDER__ACCESS_CONTROL:
			return basicSetAccessControl(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case LobjPackage.MODULE_FOLDER__FOLDER_META:
			return getFolderMeta();
		case LobjPackage.MODULE_FOLDER__MODULE_FOLDER:
			return getModuleFolder();
		case LobjPackage.MODULE_FOLDER__MODULE:
			return getModule();
		case LobjPackage.MODULE_FOLDER__ACCESS_CONTROL:
			return getAccessControl();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case LobjPackage.MODULE_FOLDER__FOLDER_META:
			setFolderMeta((FolderMeta) newValue);
			return;
		case LobjPackage.MODULE_FOLDER__MODULE_FOLDER:
			getModuleFolder().clear();
			getModuleFolder().addAll((Collection) newValue);
			return;
		case LobjPackage.MODULE_FOLDER__MODULE:
			getModule().clear();
			getModule().addAll((Collection) newValue);
			return;
		case LobjPackage.MODULE_FOLDER__ACCESS_CONTROL:
			setAccessControl((AccessControl) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
		case LobjPackage.MODULE_FOLDER__FOLDER_META:
			setFolderMeta((FolderMeta) null);
			return;
		case LobjPackage.MODULE_FOLDER__MODULE_FOLDER:
			getModuleFolder().clear();
			return;
		case LobjPackage.MODULE_FOLDER__MODULE:
			getModule().clear();
			return;
		case LobjPackage.MODULE_FOLDER__ACCESS_CONTROL:
			setAccessControl((AccessControl) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case LobjPackage.MODULE_FOLDER__FOLDER_META:
			return folderMeta != null;
		case LobjPackage.MODULE_FOLDER__MODULE_FOLDER:
			return moduleFolder != null && !moduleFolder.isEmpty();
		case LobjPackage.MODULE_FOLDER__MODULE:
			return module != null && !module.isEmpty();
		case LobjPackage.MODULE_FOLDER__ACCESS_CONTROL:
			return accessControl != null;
		}
		return super.eIsSet(featureID);
	}

} // ModuleFolderImpl

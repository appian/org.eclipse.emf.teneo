/**
 * <copyright>
 * </copyright>
 *
 * $Id: BlockFolderImpl.java,v 1.3 2007/03/28 13:57:08 mtaal Exp $
 */
package lobj.impl;

import java.util.Collection;

import lobj.AccessControl;
import lobj.Block;
import lobj.BlockFolder;
import lobj.FolderMeta;
import lobj.LobjPackage;

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
 * An implementation of the model object '<em><b>Block Folder</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link lobj.impl.BlockFolderImpl#getFolderMeta <em>Folder Meta</em>}</li>
 *   <li>{@link lobj.impl.BlockFolderImpl#getBlockFolder <em>Block Folder</em>}</li>
 *   <li>{@link lobj.impl.BlockFolderImpl#getBlock <em>Block</em>}</li>
 *   <li>{@link lobj.impl.BlockFolderImpl#getAccessControl <em>Access Control</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BlockFolderImpl extends LearningObjectImpl implements BlockFolder {
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
	 * The cached value of the '{@link #getBlockFolder() <em>Block Folder</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlockFolder()
	 * @generated
	 * @ordered
	 */
	protected EList blockFolder = null;

	/**
	 * The cached value of the '{@link #getBlock() <em>Block</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlock()
	 * @generated
	 * @ordered
	 */
	protected EList block = null;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BlockFolderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return LobjPackage.Literals.BLOCK_FOLDER;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LobjPackage.BLOCK_FOLDER__FOLDER_META, oldFolderMeta, newFolderMeta);
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
				msgs = ((InternalEObject)folderMeta).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LobjPackage.BLOCK_FOLDER__FOLDER_META, null, msgs);
			if (newFolderMeta != null)
				msgs = ((InternalEObject)newFolderMeta).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LobjPackage.BLOCK_FOLDER__FOLDER_META, null, msgs);
			msgs = basicSetFolderMeta(newFolderMeta, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LobjPackage.BLOCK_FOLDER__FOLDER_META, newFolderMeta, newFolderMeta));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getBlockFolder() {
		if (blockFolder == null) {
			blockFolder = new EObjectContainmentEList(BlockFolder.class, this, LobjPackage.BLOCK_FOLDER__BLOCK_FOLDER);
		}
		return blockFolder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getBlock() {
		if (block == null) {
			block = new EObjectContainmentEList(Block.class, this, LobjPackage.BLOCK_FOLDER__BLOCK);
		}
		return block;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LobjPackage.BLOCK_FOLDER__ACCESS_CONTROL, oldAccessControl, newAccessControl);
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
				msgs = ((InternalEObject)accessControl).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LobjPackage.BLOCK_FOLDER__ACCESS_CONTROL, null, msgs);
			if (newAccessControl != null)
				msgs = ((InternalEObject)newAccessControl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LobjPackage.BLOCK_FOLDER__ACCESS_CONTROL, null, msgs);
			msgs = basicSetAccessControl(newAccessControl, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LobjPackage.BLOCK_FOLDER__ACCESS_CONTROL, newAccessControl, newAccessControl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LobjPackage.BLOCK_FOLDER__FOLDER_META:
				return basicSetFolderMeta(null, msgs);
			case LobjPackage.BLOCK_FOLDER__BLOCK_FOLDER:
				return ((InternalEList)getBlockFolder()).basicRemove(otherEnd, msgs);
			case LobjPackage.BLOCK_FOLDER__BLOCK:
				return ((InternalEList)getBlock()).basicRemove(otherEnd, msgs);
			case LobjPackage.BLOCK_FOLDER__ACCESS_CONTROL:
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
			case LobjPackage.BLOCK_FOLDER__FOLDER_META:
				return getFolderMeta();
			case LobjPackage.BLOCK_FOLDER__BLOCK_FOLDER:
				return getBlockFolder();
			case LobjPackage.BLOCK_FOLDER__BLOCK:
				return getBlock();
			case LobjPackage.BLOCK_FOLDER__ACCESS_CONTROL:
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
			case LobjPackage.BLOCK_FOLDER__FOLDER_META:
				setFolderMeta((FolderMeta)newValue);
				return;
			case LobjPackage.BLOCK_FOLDER__BLOCK_FOLDER:
				getBlockFolder().clear();
				getBlockFolder().addAll((Collection)newValue);
				return;
			case LobjPackage.BLOCK_FOLDER__BLOCK:
				getBlock().clear();
				getBlock().addAll((Collection)newValue);
				return;
			case LobjPackage.BLOCK_FOLDER__ACCESS_CONTROL:
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
			case LobjPackage.BLOCK_FOLDER__FOLDER_META:
				setFolderMeta((FolderMeta)null);
				return;
			case LobjPackage.BLOCK_FOLDER__BLOCK_FOLDER:
				getBlockFolder().clear();
				return;
			case LobjPackage.BLOCK_FOLDER__BLOCK:
				getBlock().clear();
				return;
			case LobjPackage.BLOCK_FOLDER__ACCESS_CONTROL:
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
			case LobjPackage.BLOCK_FOLDER__FOLDER_META:
				return folderMeta != null;
			case LobjPackage.BLOCK_FOLDER__BLOCK_FOLDER:
				return blockFolder != null && !blockFolder.isEmpty();
			case LobjPackage.BLOCK_FOLDER__BLOCK:
				return block != null && !block.isEmpty();
			case LobjPackage.BLOCK_FOLDER__ACCESS_CONTROL:
				return accessControl != null;
		}
		return super.eIsSet(featureID);
	}

} //BlockFolderImpl

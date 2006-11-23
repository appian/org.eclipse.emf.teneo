/**
 * <copyright>
 * </copyright>
 *
 * $Id: BlockImpl.java,v 1.1 2006/11/23 06:12:09 mtaal Exp $
 */
package lobj.impl;

import java.util.Collection;

import lobj.AccessControl;
import lobj.Block;
import lobj.BlockMeta;
import lobj.ExternalMetadata;
import lobj.LobjPackage;
import lobj.Source;

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
 * An implementation of the model object '<em><b>Block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link lobj.impl.BlockImpl#getBlockMeta <em>Block Meta</em>}</li>
 *   <li>{@link lobj.impl.BlockImpl#getExternalMetadata <em>External Metadata</em>}</li>
 *   <li>{@link lobj.impl.BlockImpl#getSource <em>Source</em>}</li>
 *   <li>{@link lobj.impl.BlockImpl#getAccessControl <em>Access Control</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class BlockImpl extends LearningObjectImpl implements Block {
	/**
	 * The cached value of the '{@link #getBlockMeta() <em>Block Meta</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlockMeta()
	 * @generated
	 * @ordered
	 */
	protected BlockMeta blockMeta = null;

	/**
	 * The cached value of the '{@link #getExternalMetadata() <em>External Metadata</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalMetadata()
	 * @generated
	 * @ordered
	 */
	protected EList externalMetadata = null;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected Source source = null;

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
	protected BlockImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return LobjPackage.Literals.BLOCK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BlockMeta getBlockMeta() {
		return blockMeta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBlockMeta(BlockMeta newBlockMeta, NotificationChain msgs) {
		BlockMeta oldBlockMeta = blockMeta;
		blockMeta = newBlockMeta;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LobjPackage.BLOCK__BLOCK_META, oldBlockMeta, newBlockMeta);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBlockMeta(BlockMeta newBlockMeta) {
		if (newBlockMeta != blockMeta) {
			NotificationChain msgs = null;
			if (blockMeta != null)
				msgs = ((InternalEObject)blockMeta).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LobjPackage.BLOCK__BLOCK_META, null, msgs);
			if (newBlockMeta != null)
				msgs = ((InternalEObject)newBlockMeta).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LobjPackage.BLOCK__BLOCK_META, null, msgs);
			msgs = basicSetBlockMeta(newBlockMeta, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LobjPackage.BLOCK__BLOCK_META, newBlockMeta, newBlockMeta));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getExternalMetadata() {
		if (externalMetadata == null) {
			externalMetadata = new EObjectContainmentEList(ExternalMetadata.class, this, LobjPackage.BLOCK__EXTERNAL_METADATA);
		}
		return externalMetadata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Source getSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(Source newSource, NotificationChain msgs) {
		Source oldSource = source;
		source = newSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LobjPackage.BLOCK__SOURCE, oldSource, newSource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(Source newSource) {
		if (newSource != source) {
			NotificationChain msgs = null;
			if (source != null)
				msgs = ((InternalEObject)source).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LobjPackage.BLOCK__SOURCE, null, msgs);
			if (newSource != null)
				msgs = ((InternalEObject)newSource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LobjPackage.BLOCK__SOURCE, null, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LobjPackage.BLOCK__SOURCE, newSource, newSource));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LobjPackage.BLOCK__ACCESS_CONTROL, oldAccessControl, newAccessControl);
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
				msgs = ((InternalEObject)accessControl).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LobjPackage.BLOCK__ACCESS_CONTROL, null, msgs);
			if (newAccessControl != null)
				msgs = ((InternalEObject)newAccessControl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LobjPackage.BLOCK__ACCESS_CONTROL, null, msgs);
			msgs = basicSetAccessControl(newAccessControl, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LobjPackage.BLOCK__ACCESS_CONTROL, newAccessControl, newAccessControl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LobjPackage.BLOCK__BLOCK_META:
				return basicSetBlockMeta(null, msgs);
			case LobjPackage.BLOCK__EXTERNAL_METADATA:
				return ((InternalEList)getExternalMetadata()).basicRemove(otherEnd, msgs);
			case LobjPackage.BLOCK__SOURCE:
				return basicSetSource(null, msgs);
			case LobjPackage.BLOCK__ACCESS_CONTROL:
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
			case LobjPackage.BLOCK__BLOCK_META:
				return getBlockMeta();
			case LobjPackage.BLOCK__EXTERNAL_METADATA:
				return getExternalMetadata();
			case LobjPackage.BLOCK__SOURCE:
				return getSource();
			case LobjPackage.BLOCK__ACCESS_CONTROL:
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
			case LobjPackage.BLOCK__BLOCK_META:
				setBlockMeta((BlockMeta)newValue);
				return;
			case LobjPackage.BLOCK__EXTERNAL_METADATA:
				getExternalMetadata().clear();
				getExternalMetadata().addAll((Collection)newValue);
				return;
			case LobjPackage.BLOCK__SOURCE:
				setSource((Source)newValue);
				return;
			case LobjPackage.BLOCK__ACCESS_CONTROL:
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
			case LobjPackage.BLOCK__BLOCK_META:
				setBlockMeta((BlockMeta)null);
				return;
			case LobjPackage.BLOCK__EXTERNAL_METADATA:
				getExternalMetadata().clear();
				return;
			case LobjPackage.BLOCK__SOURCE:
				setSource((Source)null);
				return;
			case LobjPackage.BLOCK__ACCESS_CONTROL:
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
			case LobjPackage.BLOCK__BLOCK_META:
				return blockMeta != null;
			case LobjPackage.BLOCK__EXTERNAL_METADATA:
				return externalMetadata != null && !externalMetadata.isEmpty();
			case LobjPackage.BLOCK__SOURCE:
				return source != null;
			case LobjPackage.BLOCK__ACCESS_CONTROL:
				return accessControl != null;
		}
		return super.eIsSet(featureID);
	}

} //BlockImpl
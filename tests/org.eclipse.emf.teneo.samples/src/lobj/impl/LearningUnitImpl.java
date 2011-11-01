/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package lobj.impl;

import java.util.Collection;

import lobj.AccessControl;
import lobj.ExternalMetadata;
import lobj.Item;
import lobj.LearningUnit;
import lobj.LobjPackage;
import lobj.LuMeta;

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
 * An implementation of the model object '<em><b>Learning Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link lobj.impl.LearningUnitImpl#getLuMeta <em>Lu Meta</em>}</li>
 *   <li>{@link lobj.impl.LearningUnitImpl#getExternalMetadata <em>External Metadata</em>}</li>
 *   <li>{@link lobj.impl.LearningUnitImpl#getTreeAsXml <em>Tree As Xml</em>}</li>
 *   <li>{@link lobj.impl.LearningUnitImpl#getLuFile <em>Lu File</em>}</li>
 *   <li>{@link lobj.impl.LearningUnitImpl#getAccessControl <em>Access Control</em>}</li>
 *   <li>{@link lobj.impl.LearningUnitImpl#getItem <em>Item</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LearningUnitImpl extends LearningObjectImpl implements LearningUnit {
	/**
	 * The cached value of the '{@link #getLuMeta() <em>Lu Meta</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLuMeta()
	 * @generated
	 * @ordered
	 */
	protected LuMeta luMeta;

	/**
	 * The cached value of the '{@link #getExternalMetadata() <em>External Metadata</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalMetadata()
	 * @generated
	 * @ordered
	 */
	protected EList externalMetadata;

	/**
	 * The default value of the '{@link #getTreeAsXml() <em>Tree As Xml</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTreeAsXml()
	 * @generated
	 * @ordered
	 */
	protected static final String TREE_AS_XML_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTreeAsXml() <em>Tree As Xml</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTreeAsXml()
	 * @generated
	 * @ordered
	 */
	protected String treeAsXml = TREE_AS_XML_EDEFAULT;

	/**
	 * The default value of the '{@link #getLuFile() <em>Lu File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLuFile()
	 * @generated
	 * @ordered
	 */
	protected static final String LU_FILE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLuFile() <em>Lu File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLuFile()
	 * @generated
	 * @ordered
	 */
	protected String luFile = LU_FILE_EDEFAULT;

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
	 * The cached value of the '{@link #getItem() <em>Item</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItem()
	 * @generated
	 * @ordered
	 */
	protected EList item;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LearningUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return LobjPackage.Literals.LEARNING_UNIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LuMeta getLuMeta() {
		return luMeta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLuMeta(LuMeta newLuMeta, NotificationChain msgs) {
		LuMeta oldLuMeta = luMeta;
		luMeta = newLuMeta;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LobjPackage.LEARNING_UNIT__LU_META, oldLuMeta, newLuMeta);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLuMeta(LuMeta newLuMeta) {
		if (newLuMeta != luMeta) {
			NotificationChain msgs = null;
			if (luMeta != null)
				msgs = ((InternalEObject)luMeta).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LobjPackage.LEARNING_UNIT__LU_META, null, msgs);
			if (newLuMeta != null)
				msgs = ((InternalEObject)newLuMeta).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LobjPackage.LEARNING_UNIT__LU_META, null, msgs);
			msgs = basicSetLuMeta(newLuMeta, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LobjPackage.LEARNING_UNIT__LU_META, newLuMeta, newLuMeta));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getExternalMetadata() {
		if (externalMetadata == null) {
			externalMetadata = new EObjectContainmentEList(ExternalMetadata.class, this, LobjPackage.LEARNING_UNIT__EXTERNAL_METADATA);
		}
		return externalMetadata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTreeAsXml() {
		return treeAsXml;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTreeAsXml(String newTreeAsXml) {
		String oldTreeAsXml = treeAsXml;
		treeAsXml = newTreeAsXml;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LobjPackage.LEARNING_UNIT__TREE_AS_XML, oldTreeAsXml, treeAsXml));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLuFile() {
		return luFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLuFile(String newLuFile) {
		String oldLuFile = luFile;
		luFile = newLuFile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LobjPackage.LEARNING_UNIT__LU_FILE, oldLuFile, luFile));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LobjPackage.LEARNING_UNIT__ACCESS_CONTROL, oldAccessControl, newAccessControl);
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
				msgs = ((InternalEObject)accessControl).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LobjPackage.LEARNING_UNIT__ACCESS_CONTROL, null, msgs);
			if (newAccessControl != null)
				msgs = ((InternalEObject)newAccessControl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LobjPackage.LEARNING_UNIT__ACCESS_CONTROL, null, msgs);
			msgs = basicSetAccessControl(newAccessControl, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LobjPackage.LEARNING_UNIT__ACCESS_CONTROL, newAccessControl, newAccessControl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getItem() {
		if (item == null) {
			item = new EObjectContainmentEList(Item.class, this, LobjPackage.LEARNING_UNIT__ITEM);
		}
		return item;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LobjPackage.LEARNING_UNIT__LU_META:
				return basicSetLuMeta(null, msgs);
			case LobjPackage.LEARNING_UNIT__EXTERNAL_METADATA:
				return ((InternalEList)getExternalMetadata()).basicRemove(otherEnd, msgs);
			case LobjPackage.LEARNING_UNIT__ACCESS_CONTROL:
				return basicSetAccessControl(null, msgs);
			case LobjPackage.LEARNING_UNIT__ITEM:
				return ((InternalEList)getItem()).basicRemove(otherEnd, msgs);
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
			case LobjPackage.LEARNING_UNIT__LU_META:
				return getLuMeta();
			case LobjPackage.LEARNING_UNIT__EXTERNAL_METADATA:
				return getExternalMetadata();
			case LobjPackage.LEARNING_UNIT__TREE_AS_XML:
				return getTreeAsXml();
			case LobjPackage.LEARNING_UNIT__LU_FILE:
				return getLuFile();
			case LobjPackage.LEARNING_UNIT__ACCESS_CONTROL:
				return getAccessControl();
			case LobjPackage.LEARNING_UNIT__ITEM:
				return getItem();
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
			case LobjPackage.LEARNING_UNIT__LU_META:
				setLuMeta((LuMeta)newValue);
				return;
			case LobjPackage.LEARNING_UNIT__EXTERNAL_METADATA:
				getExternalMetadata().clear();
				getExternalMetadata().addAll((Collection)newValue);
				return;
			case LobjPackage.LEARNING_UNIT__TREE_AS_XML:
				setTreeAsXml((String)newValue);
				return;
			case LobjPackage.LEARNING_UNIT__LU_FILE:
				setLuFile((String)newValue);
				return;
			case LobjPackage.LEARNING_UNIT__ACCESS_CONTROL:
				setAccessControl((AccessControl)newValue);
				return;
			case LobjPackage.LEARNING_UNIT__ITEM:
				getItem().clear();
				getItem().addAll((Collection)newValue);
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
			case LobjPackage.LEARNING_UNIT__LU_META:
				setLuMeta((LuMeta)null);
				return;
			case LobjPackage.LEARNING_UNIT__EXTERNAL_METADATA:
				getExternalMetadata().clear();
				return;
			case LobjPackage.LEARNING_UNIT__TREE_AS_XML:
				setTreeAsXml(TREE_AS_XML_EDEFAULT);
				return;
			case LobjPackage.LEARNING_UNIT__LU_FILE:
				setLuFile(LU_FILE_EDEFAULT);
				return;
			case LobjPackage.LEARNING_UNIT__ACCESS_CONTROL:
				setAccessControl((AccessControl)null);
				return;
			case LobjPackage.LEARNING_UNIT__ITEM:
				getItem().clear();
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
			case LobjPackage.LEARNING_UNIT__LU_META:
				return luMeta != null;
			case LobjPackage.LEARNING_UNIT__EXTERNAL_METADATA:
				return externalMetadata != null && !externalMetadata.isEmpty();
			case LobjPackage.LEARNING_UNIT__TREE_AS_XML:
				return TREE_AS_XML_EDEFAULT == null ? treeAsXml != null : !TREE_AS_XML_EDEFAULT.equals(treeAsXml);
			case LobjPackage.LEARNING_UNIT__LU_FILE:
				return LU_FILE_EDEFAULT == null ? luFile != null : !LU_FILE_EDEFAULT.equals(luFile);
			case LobjPackage.LEARNING_UNIT__ACCESS_CONTROL:
				return accessControl != null;
			case LobjPackage.LEARNING_UNIT__ITEM:
				return item != null && !item.isEmpty();
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
		result.append(" (treeAsXml: ");
		result.append(treeAsXml);
		result.append(", luFile: ");
		result.append(luFile);
		result.append(')');
		return result.toString();
	}

} //LearningUnitImpl

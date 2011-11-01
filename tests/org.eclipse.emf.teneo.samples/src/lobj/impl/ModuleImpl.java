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
import lobj.LobjPackage;
import lobj.Module;
import lobj.ModuleMeta;
import lobj.Node;

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
 * An implementation of the model object '<em><b>Module</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link lobj.impl.ModuleImpl#getModuleMeta <em>Module Meta</em>}</li>
 *   <li>{@link lobj.impl.ModuleImpl#getExternalMetadata <em>External Metadata</em>}</li>
 *   <li>{@link lobj.impl.ModuleImpl#getRootNode <em>Root Node</em>}</li>
 *   <li>{@link lobj.impl.ModuleImpl#getModuleFile <em>Module File</em>}</li>
 *   <li>{@link lobj.impl.ModuleImpl#getTreeAsXml <em>Tree As Xml</em>}</li>
 *   <li>{@link lobj.impl.ModuleImpl#getAccessControl <em>Access Control</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModuleImpl extends LearningObjectImpl implements Module {
	/**
	 * The cached value of the '{@link #getModuleMeta() <em>Module Meta</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModuleMeta()
	 * @generated
	 * @ordered
	 */
	protected ModuleMeta moduleMeta;

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
	 * The cached value of the '{@link #getRootNode() <em>Root Node</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRootNode()
	 * @generated
	 * @ordered
	 */
	protected Node rootNode;

	/**
	 * The default value of the '{@link #getModuleFile() <em>Module File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModuleFile()
	 * @generated
	 * @ordered
	 */
	protected static final String MODULE_FILE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModuleFile() <em>Module File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModuleFile()
	 * @generated
	 * @ordered
	 */
	protected String moduleFile = MODULE_FILE_EDEFAULT;

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
	protected ModuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return LobjPackage.Literals.MODULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModuleMeta getModuleMeta() {
		return moduleMeta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModuleMeta(ModuleMeta newModuleMeta, NotificationChain msgs) {
		ModuleMeta oldModuleMeta = moduleMeta;
		moduleMeta = newModuleMeta;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LobjPackage.MODULE__MODULE_META, oldModuleMeta, newModuleMeta);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModuleMeta(ModuleMeta newModuleMeta) {
		if (newModuleMeta != moduleMeta) {
			NotificationChain msgs = null;
			if (moduleMeta != null)
				msgs = ((InternalEObject)moduleMeta).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LobjPackage.MODULE__MODULE_META, null, msgs);
			if (newModuleMeta != null)
				msgs = ((InternalEObject)newModuleMeta).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LobjPackage.MODULE__MODULE_META, null, msgs);
			msgs = basicSetModuleMeta(newModuleMeta, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LobjPackage.MODULE__MODULE_META, newModuleMeta, newModuleMeta));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getExternalMetadata() {
		if (externalMetadata == null) {
			externalMetadata = new EObjectContainmentEList(ExternalMetadata.class, this, LobjPackage.MODULE__EXTERNAL_METADATA);
		}
		return externalMetadata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node getRootNode() {
		return rootNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRootNode(Node newRootNode, NotificationChain msgs) {
		Node oldRootNode = rootNode;
		rootNode = newRootNode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LobjPackage.MODULE__ROOT_NODE, oldRootNode, newRootNode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRootNode(Node newRootNode) {
		if (newRootNode != rootNode) {
			NotificationChain msgs = null;
			if (rootNode != null)
				msgs = ((InternalEObject)rootNode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LobjPackage.MODULE__ROOT_NODE, null, msgs);
			if (newRootNode != null)
				msgs = ((InternalEObject)newRootNode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LobjPackage.MODULE__ROOT_NODE, null, msgs);
			msgs = basicSetRootNode(newRootNode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LobjPackage.MODULE__ROOT_NODE, newRootNode, newRootNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getModuleFile() {
		return moduleFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModuleFile(String newModuleFile) {
		String oldModuleFile = moduleFile;
		moduleFile = newModuleFile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LobjPackage.MODULE__MODULE_FILE, oldModuleFile, moduleFile));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LobjPackage.MODULE__TREE_AS_XML, oldTreeAsXml, treeAsXml));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LobjPackage.MODULE__ACCESS_CONTROL, oldAccessControl, newAccessControl);
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
				msgs = ((InternalEObject)accessControl).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LobjPackage.MODULE__ACCESS_CONTROL, null, msgs);
			if (newAccessControl != null)
				msgs = ((InternalEObject)newAccessControl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LobjPackage.MODULE__ACCESS_CONTROL, null, msgs);
			msgs = basicSetAccessControl(newAccessControl, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LobjPackage.MODULE__ACCESS_CONTROL, newAccessControl, newAccessControl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LobjPackage.MODULE__MODULE_META:
				return basicSetModuleMeta(null, msgs);
			case LobjPackage.MODULE__EXTERNAL_METADATA:
				return ((InternalEList)getExternalMetadata()).basicRemove(otherEnd, msgs);
			case LobjPackage.MODULE__ROOT_NODE:
				return basicSetRootNode(null, msgs);
			case LobjPackage.MODULE__ACCESS_CONTROL:
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
			case LobjPackage.MODULE__MODULE_META:
				return getModuleMeta();
			case LobjPackage.MODULE__EXTERNAL_METADATA:
				return getExternalMetadata();
			case LobjPackage.MODULE__ROOT_NODE:
				return getRootNode();
			case LobjPackage.MODULE__MODULE_FILE:
				return getModuleFile();
			case LobjPackage.MODULE__TREE_AS_XML:
				return getTreeAsXml();
			case LobjPackage.MODULE__ACCESS_CONTROL:
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
			case LobjPackage.MODULE__MODULE_META:
				setModuleMeta((ModuleMeta)newValue);
				return;
			case LobjPackage.MODULE__EXTERNAL_METADATA:
				getExternalMetadata().clear();
				getExternalMetadata().addAll((Collection)newValue);
				return;
			case LobjPackage.MODULE__ROOT_NODE:
				setRootNode((Node)newValue);
				return;
			case LobjPackage.MODULE__MODULE_FILE:
				setModuleFile((String)newValue);
				return;
			case LobjPackage.MODULE__TREE_AS_XML:
				setTreeAsXml((String)newValue);
				return;
			case LobjPackage.MODULE__ACCESS_CONTROL:
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
			case LobjPackage.MODULE__MODULE_META:
				setModuleMeta((ModuleMeta)null);
				return;
			case LobjPackage.MODULE__EXTERNAL_METADATA:
				getExternalMetadata().clear();
				return;
			case LobjPackage.MODULE__ROOT_NODE:
				setRootNode((Node)null);
				return;
			case LobjPackage.MODULE__MODULE_FILE:
				setModuleFile(MODULE_FILE_EDEFAULT);
				return;
			case LobjPackage.MODULE__TREE_AS_XML:
				setTreeAsXml(TREE_AS_XML_EDEFAULT);
				return;
			case LobjPackage.MODULE__ACCESS_CONTROL:
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
			case LobjPackage.MODULE__MODULE_META:
				return moduleMeta != null;
			case LobjPackage.MODULE__EXTERNAL_METADATA:
				return externalMetadata != null && !externalMetadata.isEmpty();
			case LobjPackage.MODULE__ROOT_NODE:
				return rootNode != null;
			case LobjPackage.MODULE__MODULE_FILE:
				return MODULE_FILE_EDEFAULT == null ? moduleFile != null : !MODULE_FILE_EDEFAULT.equals(moduleFile);
			case LobjPackage.MODULE__TREE_AS_XML:
				return TREE_AS_XML_EDEFAULT == null ? treeAsXml != null : !TREE_AS_XML_EDEFAULT.equals(treeAsXml);
			case LobjPackage.MODULE__ACCESS_CONTROL:
				return accessControl != null;
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
		result.append(" (moduleFile: ");
		result.append(moduleFile);
		result.append(", treeAsXml: ");
		result.append(treeAsXml);
		result.append(')');
		return result.toString();
	}

} //ModuleImpl

/**
 * <copyright>
 * </copyright>
 *
 * $Id: ObjectTypeImpl.java,v 1.1 2009/06/28 02:03:49 mtaal Exp $
 */
package org.w3._2000._09.xmldsig.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.w3._2000._09.xmldsig.ObjectType;
import org.w3._2000._09.xmldsig.XmldsigPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Object Type</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.w3._2000._09.xmldsig.impl.ObjectTypeImpl#getMixed <em>Mixed</em>}</li>
 * <li>{@link org.w3._2000._09.xmldsig.impl.ObjectTypeImpl#getGroup <em>Group</em>}</li>
 * <li>{@link org.w3._2000._09.xmldsig.impl.ObjectTypeImpl#getAny <em>Any</em>}</li>
 * <li>{@link org.w3._2000._09.xmldsig.impl.ObjectTypeImpl#getEncoding <em>Encoding</em>}</li>
 * <li>{@link org.w3._2000._09.xmldsig.impl.ObjectTypeImpl#getId <em>Id</em>}</li>
 * <li>{@link org.w3._2000._09.xmldsig.impl.ObjectTypeImpl#getMimeType <em>Mime Type</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class ObjectTypeImpl extends EObjectImpl implements ObjectType {
	/**
	 * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getMixed()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mixed;

	/**
	 * The default value of the '{@link #getEncoding() <em>Encoding</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getEncoding()
	 * @generated
	 * @ordered
	 */
	protected static final String ENCODING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEncoding() <em>Encoding</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getEncoding()
	 * @generated
	 * @ordered
	 */
	protected String encoding = ENCODING_EDEFAULT;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getMimeType() <em>Mime Type</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getMimeType()
	 * @generated
	 * @ordered
	 */
	protected static final String MIME_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMimeType() <em>Mime Type</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getMimeType()
	 * @generated
	 * @ordered
	 */
	protected String mimeType = MIME_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ObjectTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmldsigPackage.Literals.OBJECT_TYPE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, XmldsigPackage.OBJECT_TYPE__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public FeatureMap getGroup() {
		return (FeatureMap) getMixed().<FeatureMap.Entry> list(
				XmldsigPackage.Literals.OBJECT_TYPE__GROUP);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public FeatureMap getAny() {
		return (FeatureMap) getGroup()
				.<FeatureMap.Entry> list(XmldsigPackage.Literals.OBJECT_TYPE__ANY);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getEncoding() {
		return encoding;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setEncoding(String newEncoding) {
		String oldEncoding = encoding;
		encoding = newEncoding;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmldsigPackage.OBJECT_TYPE__ENCODING,
					oldEncoding, encoding));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmldsigPackage.OBJECT_TYPE__ID, oldId,
					id));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getMimeType() {
		return mimeType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setMimeType(String newMimeType) {
		String oldMimeType = mimeType;
		mimeType = newMimeType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmldsigPackage.OBJECT_TYPE__MIME_TYPE,
					oldMimeType, mimeType));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID,
			NotificationChain msgs) {
		switch (featureID) {
		case XmldsigPackage.OBJECT_TYPE__MIXED:
			return ((InternalEList<?>) getMixed()).basicRemove(otherEnd, msgs);
		case XmldsigPackage.OBJECT_TYPE__GROUP:
			return ((InternalEList<?>) getGroup()).basicRemove(otherEnd, msgs);
		case XmldsigPackage.OBJECT_TYPE__ANY:
			return ((InternalEList<?>) getAny()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case XmldsigPackage.OBJECT_TYPE__MIXED:
			if (coreType)
				return getMixed();
			return ((FeatureMap.Internal) getMixed()).getWrapper();
		case XmldsigPackage.OBJECT_TYPE__GROUP:
			if (coreType)
				return getGroup();
			return ((FeatureMap.Internal) getGroup()).getWrapper();
		case XmldsigPackage.OBJECT_TYPE__ANY:
			if (coreType)
				return getAny();
			return ((FeatureMap.Internal) getAny()).getWrapper();
		case XmldsigPackage.OBJECT_TYPE__ENCODING:
			return getEncoding();
		case XmldsigPackage.OBJECT_TYPE__ID:
			return getId();
		case XmldsigPackage.OBJECT_TYPE__MIME_TYPE:
			return getMimeType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case XmldsigPackage.OBJECT_TYPE__MIXED:
			((FeatureMap.Internal) getMixed()).set(newValue);
			return;
		case XmldsigPackage.OBJECT_TYPE__GROUP:
			((FeatureMap.Internal) getGroup()).set(newValue);
			return;
		case XmldsigPackage.OBJECT_TYPE__ANY:
			((FeatureMap.Internal) getAny()).set(newValue);
			return;
		case XmldsigPackage.OBJECT_TYPE__ENCODING:
			setEncoding((String) newValue);
			return;
		case XmldsigPackage.OBJECT_TYPE__ID:
			setId((String) newValue);
			return;
		case XmldsigPackage.OBJECT_TYPE__MIME_TYPE:
			setMimeType((String) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case XmldsigPackage.OBJECT_TYPE__MIXED:
			getMixed().clear();
			return;
		case XmldsigPackage.OBJECT_TYPE__GROUP:
			getGroup().clear();
			return;
		case XmldsigPackage.OBJECT_TYPE__ANY:
			getAny().clear();
			return;
		case XmldsigPackage.OBJECT_TYPE__ENCODING:
			setEncoding(ENCODING_EDEFAULT);
			return;
		case XmldsigPackage.OBJECT_TYPE__ID:
			setId(ID_EDEFAULT);
			return;
		case XmldsigPackage.OBJECT_TYPE__MIME_TYPE:
			setMimeType(MIME_TYPE_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case XmldsigPackage.OBJECT_TYPE__MIXED:
			return mixed != null && !mixed.isEmpty();
		case XmldsigPackage.OBJECT_TYPE__GROUP:
			return !getGroup().isEmpty();
		case XmldsigPackage.OBJECT_TYPE__ANY:
			return !getAny().isEmpty();
		case XmldsigPackage.OBJECT_TYPE__ENCODING:
			return ENCODING_EDEFAULT == null ? encoding != null : !ENCODING_EDEFAULT.equals(encoding);
		case XmldsigPackage.OBJECT_TYPE__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case XmldsigPackage.OBJECT_TYPE__MIME_TYPE:
			return MIME_TYPE_EDEFAULT == null ? mimeType != null : !MIME_TYPE_EDEFAULT.equals(mimeType);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(", encoding: ");
		result.append(encoding);
		result.append(", id: ");
		result.append(id);
		result.append(", mimeType: ");
		result.append(mimeType);
		result.append(')');
		return result.toString();
	}

} // ObjectTypeImpl

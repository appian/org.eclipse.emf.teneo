/**
 * <copyright>
 * </copyright>
 *
 * $Id: ReferenceTypeImpl.java,v 1.1 2009/06/28 02:03:49 mtaal Exp $
 */
package org.w3._2000._09.xmldsig.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.w3._2000._09.xmldsig.DigestMethodType;
import org.w3._2000._09.xmldsig.ReferenceType;
import org.w3._2000._09.xmldsig.TransformsType;
import org.w3._2000._09.xmldsig.XmldsigPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Reference Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.w3._2000._09.xmldsig.impl.ReferenceTypeImpl#getTransforms <em>Transforms</em>}</li>
 * <li>{@link org.w3._2000._09.xmldsig.impl.ReferenceTypeImpl#getDigestMethod <em>Digest Method
 * </em>}</li>
 * <li>{@link org.w3._2000._09.xmldsig.impl.ReferenceTypeImpl#getDigestValue <em>Digest Value</em>}</li>
 * <li>{@link org.w3._2000._09.xmldsig.impl.ReferenceTypeImpl#getId <em>Id</em>}</li>
 * <li>{@link org.w3._2000._09.xmldsig.impl.ReferenceTypeImpl#getType <em>Type</em>}</li>
 * <li>{@link org.w3._2000._09.xmldsig.impl.ReferenceTypeImpl#getURI <em>URI</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class ReferenceTypeImpl extends EObjectImpl implements ReferenceType {
	/**
	 * The cached value of the '{@link #getTransforms() <em>Transforms</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getTransforms()
	 * @generated
	 * @ordered
	 */
	protected TransformsType transforms;

	/**
	 * The cached value of the '{@link #getDigestMethod() <em>Digest Method</em>}' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getDigestMethod()
	 * @generated
	 * @ordered
	 */
	protected DigestMethodType digestMethod;

	/**
	 * The default value of the '{@link #getDigestValue() <em>Digest Value</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getDigestValue()
	 * @generated
	 * @ordered
	 */
	protected static final byte[] DIGEST_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDigestValue() <em>Digest Value</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getDigestValue()
	 * @generated
	 * @ordered
	 */
	protected byte[] digestValue = DIGEST_VALUE_EDEFAULT;

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
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getURI() <em>URI</em>}' attribute. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getURI()
	 * @generated
	 * @ordered
	 */
	protected static final String URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getURI() <em>URI</em>}' attribute. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getURI()
	 * @generated
	 * @ordered
	 */
	protected String uRI = URI_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ReferenceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmldsigPackage.Literals.REFERENCE_TYPE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public TransformsType getTransforms() {
		return transforms;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetTransforms(TransformsType newTransforms, NotificationChain msgs) {
		TransformsType oldTransforms = transforms;
		transforms = newTransforms;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					XmldsigPackage.REFERENCE_TYPE__TRANSFORMS, oldTransforms, newTransforms);
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
	public void setTransforms(TransformsType newTransforms) {
		if (newTransforms != transforms) {
			NotificationChain msgs = null;
			if (transforms != null)
				msgs = ((InternalEObject) transforms).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
						- XmldsigPackage.REFERENCE_TYPE__TRANSFORMS, null, msgs);
			if (newTransforms != null)
				msgs = ((InternalEObject) newTransforms).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
						- XmldsigPackage.REFERENCE_TYPE__TRANSFORMS, null, msgs);
			msgs = basicSetTransforms(newTransforms, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					XmldsigPackage.REFERENCE_TYPE__TRANSFORMS, newTransforms, newTransforms));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public DigestMethodType getDigestMethod() {
		return digestMethod;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetDigestMethod(DigestMethodType newDigestMethod,
			NotificationChain msgs) {
		DigestMethodType oldDigestMethod = digestMethod;
		digestMethod = newDigestMethod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					XmldsigPackage.REFERENCE_TYPE__DIGEST_METHOD, oldDigestMethod, newDigestMethod);
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
	public void setDigestMethod(DigestMethodType newDigestMethod) {
		if (newDigestMethod != digestMethod) {
			NotificationChain msgs = null;
			if (digestMethod != null)
				msgs = ((InternalEObject) digestMethod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
						- XmldsigPackage.REFERENCE_TYPE__DIGEST_METHOD, null, msgs);
			if (newDigestMethod != null)
				msgs = ((InternalEObject) newDigestMethod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
						- XmldsigPackage.REFERENCE_TYPE__DIGEST_METHOD, null, msgs);
			msgs = basicSetDigestMethod(newDigestMethod, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					XmldsigPackage.REFERENCE_TYPE__DIGEST_METHOD, newDigestMethod, newDigestMethod));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public byte[] getDigestValue() {
		return digestValue;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setDigestValue(byte[] newDigestValue) {
		byte[] oldDigestValue = digestValue;
		digestValue = newDigestValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					XmldsigPackage.REFERENCE_TYPE__DIGEST_VALUE, oldDigestValue, digestValue));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XmldsigPackage.REFERENCE_TYPE__ID,
					oldId, id));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmldsigPackage.REFERENCE_TYPE__TYPE,
					oldType, type));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getURI() {
		return uRI;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setURI(String newURI) {
		String oldURI = uRI;
		uRI = newURI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmldsigPackage.REFERENCE_TYPE__URI,
					oldURI, uRI));
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
		case XmldsigPackage.REFERENCE_TYPE__TRANSFORMS:
			return basicSetTransforms(null, msgs);
		case XmldsigPackage.REFERENCE_TYPE__DIGEST_METHOD:
			return basicSetDigestMethod(null, msgs);
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
		case XmldsigPackage.REFERENCE_TYPE__TRANSFORMS:
			return getTransforms();
		case XmldsigPackage.REFERENCE_TYPE__DIGEST_METHOD:
			return getDigestMethod();
		case XmldsigPackage.REFERENCE_TYPE__DIGEST_VALUE:
			return getDigestValue();
		case XmldsigPackage.REFERENCE_TYPE__ID:
			return getId();
		case XmldsigPackage.REFERENCE_TYPE__TYPE:
			return getType();
		case XmldsigPackage.REFERENCE_TYPE__URI:
			return getURI();
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
		case XmldsigPackage.REFERENCE_TYPE__TRANSFORMS:
			setTransforms((TransformsType) newValue);
			return;
		case XmldsigPackage.REFERENCE_TYPE__DIGEST_METHOD:
			setDigestMethod((DigestMethodType) newValue);
			return;
		case XmldsigPackage.REFERENCE_TYPE__DIGEST_VALUE:
			setDigestValue((byte[]) newValue);
			return;
		case XmldsigPackage.REFERENCE_TYPE__ID:
			setId((String) newValue);
			return;
		case XmldsigPackage.REFERENCE_TYPE__TYPE:
			setType((String) newValue);
			return;
		case XmldsigPackage.REFERENCE_TYPE__URI:
			setURI((String) newValue);
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
		case XmldsigPackage.REFERENCE_TYPE__TRANSFORMS:
			setTransforms((TransformsType) null);
			return;
		case XmldsigPackage.REFERENCE_TYPE__DIGEST_METHOD:
			setDigestMethod((DigestMethodType) null);
			return;
		case XmldsigPackage.REFERENCE_TYPE__DIGEST_VALUE:
			setDigestValue(DIGEST_VALUE_EDEFAULT);
			return;
		case XmldsigPackage.REFERENCE_TYPE__ID:
			setId(ID_EDEFAULT);
			return;
		case XmldsigPackage.REFERENCE_TYPE__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		case XmldsigPackage.REFERENCE_TYPE__URI:
			setURI(URI_EDEFAULT);
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
		case XmldsigPackage.REFERENCE_TYPE__TRANSFORMS:
			return transforms != null;
		case XmldsigPackage.REFERENCE_TYPE__DIGEST_METHOD:
			return digestMethod != null;
		case XmldsigPackage.REFERENCE_TYPE__DIGEST_VALUE:
			return DIGEST_VALUE_EDEFAULT == null ? digestValue != null : !DIGEST_VALUE_EDEFAULT
					.equals(digestValue);
		case XmldsigPackage.REFERENCE_TYPE__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case XmldsigPackage.REFERENCE_TYPE__TYPE:
			return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
		case XmldsigPackage.REFERENCE_TYPE__URI:
			return URI_EDEFAULT == null ? uRI != null : !URI_EDEFAULT.equals(uRI);
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
		result.append(" (digestValue: ");
		result.append(digestValue);
		result.append(", id: ");
		result.append(id);
		result.append(", type: ");
		result.append(type);
		result.append(", uRI: ");
		result.append(uRI);
		result.append(')');
		return result.toString();
	}

} // ReferenceTypeImpl

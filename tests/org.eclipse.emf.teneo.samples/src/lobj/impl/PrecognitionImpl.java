/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package lobj.impl;

import java.util.Collection;

import lobj.InternalRef;
import lobj.LobjPackage;
import lobj.Precognition;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Precognition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link lobj.impl.PrecognitionImpl#getPrecog <em>Precog</em>}</li>
 * <li>{@link lobj.impl.PrecognitionImpl#getInternalRefs <em>Internal Refs</em>}</li>
 * <li>{@link lobj.impl.PrecognitionImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class PrecognitionImpl extends EObjectImpl implements Precognition {
	/**
	 * The default value of the '{@link #getPrecog() <em>Precog</em>}' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @see #getPrecog()
	 * @generated
	 * @ordered
	 */
	protected static final String PRECOG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrecog() <em>Precog</em>}' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @see #getPrecog()
	 * @generated
	 * @ordered
	 */
	protected String precog = PRECOG_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInternalRefs() <em>Internal Refs</em>}' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getInternalRefs()
	 * @generated
	 * @ordered
	 */
	protected EList internalRefs;

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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected PrecognitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected EClass eStaticClass() {
		return LobjPackage.Literals.PRECOGNITION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getPrecog() {
		return precog;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setPrecog(String newPrecog) {
		String oldPrecog = precog;
		precog = newPrecog;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LobjPackage.PRECOGNITION__PRECOG,
					oldPrecog, precog));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList getInternalRefs() {
		if (internalRefs == null) {
			internalRefs = new EObjectContainmentEList(InternalRef.class, this,
					LobjPackage.PRECOGNITION__INTERNAL_REFS);
		}
		return internalRefs;
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
			eNotify(new ENotificationImpl(this, Notification.SET, LobjPackage.PRECOGNITION__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID,
			NotificationChain msgs) {
		switch (featureID) {
		case LobjPackage.PRECOGNITION__INTERNAL_REFS:
			return ((InternalEList) getInternalRefs()).basicRemove(otherEnd, msgs);
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
		case LobjPackage.PRECOGNITION__PRECOG:
			return getPrecog();
		case LobjPackage.PRECOGNITION__INTERNAL_REFS:
			return getInternalRefs();
		case LobjPackage.PRECOGNITION__ID:
			return getId();
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
		case LobjPackage.PRECOGNITION__PRECOG:
			setPrecog((String) newValue);
			return;
		case LobjPackage.PRECOGNITION__INTERNAL_REFS:
			getInternalRefs().clear();
			getInternalRefs().addAll((Collection) newValue);
			return;
		case LobjPackage.PRECOGNITION__ID:
			setId((String) newValue);
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
		case LobjPackage.PRECOGNITION__PRECOG:
			setPrecog(PRECOG_EDEFAULT);
			return;
		case LobjPackage.PRECOGNITION__INTERNAL_REFS:
			getInternalRefs().clear();
			return;
		case LobjPackage.PRECOGNITION__ID:
			setId(ID_EDEFAULT);
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
		case LobjPackage.PRECOGNITION__PRECOG:
			return PRECOG_EDEFAULT == null ? precog != null : !PRECOG_EDEFAULT.equals(precog);
		case LobjPackage.PRECOGNITION__INTERNAL_REFS:
			return internalRefs != null && !internalRefs.isEmpty();
		case LobjPackage.PRECOGNITION__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (precog: ");
		result.append(precog);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} // PrecognitionImpl

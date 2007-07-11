/**
 * <copyright>
 * </copyright>
 *
 * $Id: SimpleIDImpl.java,v 1.3 2007/07/11 17:34:54 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.annotations.hb.generator.id.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.teneo.samples.emf.annotations.hb.generator.id.IdPackage;
import org.eclipse.emf.teneo.samples.emf.annotations.hb.generator.id.SimpleID;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple ID</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.hb.generator.id.impl.SimpleIDImpl#getAutoID <em>Auto ID</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.hb.generator.id.impl.SimpleIDImpl#getGenerated <em>Generated</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SimpleIDImpl extends EObjectImpl implements SimpleID {
	/**
	 * The default value of the '{@link #getAutoID() <em>Auto ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutoID()
	 * @generated
	 * @ordered
	 */
	protected static final long AUTO_ID_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getAutoID() <em>Auto ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutoID()
	 * @generated
	 * @ordered
	 */
	protected long autoID = AUTO_ID_EDEFAULT;

	/**
	 * This is true if the Auto ID attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean autoIDESet;

	/**
	 * The default value of the '{@link #getGenerated() <em>Generated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenerated()
	 * @generated
	 * @ordered
	 */
	protected static final long GENERATED_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getGenerated() <em>Generated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenerated()
	 * @generated
	 * @ordered
	 */
	protected long generated = GENERATED_EDEFAULT;

	/**
	 * This is true if the Generated attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean generatedESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimpleIDImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IdPackage.Literals.SIMPLE_ID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getAutoID() {
		return autoID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutoID(long newAutoID) {
		long oldAutoID = autoID;
		autoID = newAutoID;
		boolean oldAutoIDESet = autoIDESet;
		autoIDESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IdPackage.SIMPLE_ID__AUTO_ID, oldAutoID, autoID, !oldAutoIDESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAutoID() {
		long oldAutoID = autoID;
		boolean oldAutoIDESet = autoIDESet;
		autoID = AUTO_ID_EDEFAULT;
		autoIDESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, IdPackage.SIMPLE_ID__AUTO_ID, oldAutoID, AUTO_ID_EDEFAULT, oldAutoIDESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAutoID() {
		return autoIDESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getGenerated() {
		return generated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenerated(long newGenerated) {
		long oldGenerated = generated;
		generated = newGenerated;
		boolean oldGeneratedESet = generatedESet;
		generatedESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IdPackage.SIMPLE_ID__GENERATED, oldGenerated, generated, !oldGeneratedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetGenerated() {
		long oldGenerated = generated;
		boolean oldGeneratedESet = generatedESet;
		generated = GENERATED_EDEFAULT;
		generatedESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, IdPackage.SIMPLE_ID__GENERATED, oldGenerated, GENERATED_EDEFAULT, oldGeneratedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetGenerated() {
		return generatedESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IdPackage.SIMPLE_ID__AUTO_ID:
				return new Long(getAutoID());
			case IdPackage.SIMPLE_ID__GENERATED:
				return new Long(getGenerated());
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case IdPackage.SIMPLE_ID__AUTO_ID:
				setAutoID(((Long)newValue).longValue());
				return;
			case IdPackage.SIMPLE_ID__GENERATED:
				setGenerated(((Long)newValue).longValue());
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case IdPackage.SIMPLE_ID__AUTO_ID:
				unsetAutoID();
				return;
			case IdPackage.SIMPLE_ID__GENERATED:
				unsetGenerated();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case IdPackage.SIMPLE_ID__AUTO_ID:
				return isSetAutoID();
			case IdPackage.SIMPLE_ID__GENERATED:
				return isSetGenerated();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (autoID: ");
		if (autoIDESet) result.append(autoID); else result.append("<unset>");
		result.append(", generated: ");
		if (generatedESet) result.append(generated); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //SimpleIDImpl
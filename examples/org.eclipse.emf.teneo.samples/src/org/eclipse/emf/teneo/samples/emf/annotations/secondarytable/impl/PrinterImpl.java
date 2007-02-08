/**
 * <copyright>
 * </copyright>
 *
 * $Id: PrinterImpl.java,v 1.2 2007/02/08 23:09:20 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.annotations.secondarytable.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.teneo.samples.emf.annotations.secondarytable.Printer;
import org.eclipse.emf.teneo.samples.emf.annotations.secondarytable.SecondarytablePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Printer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.secondarytable.impl.PrinterImpl#getMake <em>Make</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.secondarytable.impl.PrinterImpl#getModel <em>Model</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.secondarytable.impl.PrinterImpl#getTonerMake <em>Toner Make</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.secondarytable.impl.PrinterImpl#getTonerModel <em>Toner Model</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PrinterImpl extends EObjectImpl implements Printer {
	/**
	 * The default value of the '{@link #getMake() <em>Make</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMake()
	 * @generated
	 * @ordered
	 */
	protected static final String MAKE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMake() <em>Make</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMake()
	 * @generated
	 * @ordered
	 */
	protected String make = MAKE_EDEFAULT;

	/**
	 * The default value of the '{@link #getModel() <em>Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModel()
	 * @generated
	 * @ordered
	 */
	protected static final String MODEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModel() <em>Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModel()
	 * @generated
	 * @ordered
	 */
	protected String model = MODEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getTonerMake() <em>Toner Make</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTonerMake()
	 * @generated
	 * @ordered
	 */
	protected static final String TONER_MAKE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTonerMake() <em>Toner Make</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTonerMake()
	 * @generated
	 * @ordered
	 */
	protected String tonerMake = TONER_MAKE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTonerModel() <em>Toner Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTonerModel()
	 * @generated
	 * @ordered
	 */
	protected static final String TONER_MODEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTonerModel() <em>Toner Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTonerModel()
	 * @generated
	 * @ordered
	 */
	protected String tonerModel = TONER_MODEL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrinterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SecondarytablePackage.Literals.PRINTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMake() {
		return make;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMake(String newMake) {
		String oldMake = make;
		make = newMake;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecondarytablePackage.PRINTER__MAKE, oldMake, make));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getModel() {
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModel(String newModel) {
		String oldModel = model;
		model = newModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecondarytablePackage.PRINTER__MODEL, oldModel, model));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTonerMake() {
		return tonerMake;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTonerMake(String newTonerMake) {
		String oldTonerMake = tonerMake;
		tonerMake = newTonerMake;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecondarytablePackage.PRINTER__TONER_MAKE, oldTonerMake, tonerMake));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTonerModel() {
		return tonerModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTonerModel(String newTonerModel) {
		String oldTonerModel = tonerModel;
		tonerModel = newTonerModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecondarytablePackage.PRINTER__TONER_MODEL, oldTonerModel, tonerModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SecondarytablePackage.PRINTER__MAKE:
				return getMake();
			case SecondarytablePackage.PRINTER__MODEL:
				return getModel();
			case SecondarytablePackage.PRINTER__TONER_MAKE:
				return getTonerMake();
			case SecondarytablePackage.PRINTER__TONER_MODEL:
				return getTonerModel();
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
			case SecondarytablePackage.PRINTER__MAKE:
				setMake((String)newValue);
				return;
			case SecondarytablePackage.PRINTER__MODEL:
				setModel((String)newValue);
				return;
			case SecondarytablePackage.PRINTER__TONER_MAKE:
				setTonerMake((String)newValue);
				return;
			case SecondarytablePackage.PRINTER__TONER_MODEL:
				setTonerModel((String)newValue);
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
			case SecondarytablePackage.PRINTER__MAKE:
				setMake(MAKE_EDEFAULT);
				return;
			case SecondarytablePackage.PRINTER__MODEL:
				setModel(MODEL_EDEFAULT);
				return;
			case SecondarytablePackage.PRINTER__TONER_MAKE:
				setTonerMake(TONER_MAKE_EDEFAULT);
				return;
			case SecondarytablePackage.PRINTER__TONER_MODEL:
				setTonerModel(TONER_MODEL_EDEFAULT);
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
			case SecondarytablePackage.PRINTER__MAKE:
				return MAKE_EDEFAULT == null ? make != null : !MAKE_EDEFAULT.equals(make);
			case SecondarytablePackage.PRINTER__MODEL:
				return MODEL_EDEFAULT == null ? model != null : !MODEL_EDEFAULT.equals(model);
			case SecondarytablePackage.PRINTER__TONER_MAKE:
				return TONER_MAKE_EDEFAULT == null ? tonerMake != null : !TONER_MAKE_EDEFAULT.equals(tonerMake);
			case SecondarytablePackage.PRINTER__TONER_MODEL:
				return TONER_MODEL_EDEFAULT == null ? tonerModel != null : !TONER_MODEL_EDEFAULT.equals(tonerModel);
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
		result.append(" (make: ");
		result.append(make);
		result.append(", model: ");
		result.append(model);
		result.append(", tonerMake: ");
		result.append(tonerMake);
		result.append(", tonerModel: ");
		result.append(tonerModel);
		result.append(')');
		return result.toString();
	}

} //PrinterImpl

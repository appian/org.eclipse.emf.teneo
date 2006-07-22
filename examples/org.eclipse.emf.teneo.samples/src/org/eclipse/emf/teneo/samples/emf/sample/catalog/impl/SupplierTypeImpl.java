/**
 * <copyright>
 * </copyright>
 *
 * $Id: SupplierTypeImpl.java,v 1.2 2006/07/22 13:01:17 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.sample.catalog.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.teneo.samples.emf.sample.catalog.CatalogPackage;
import org.eclipse.emf.teneo.samples.emf.sample.catalog.SupplierType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Supplier Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.catalog.impl.SupplierTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.catalog.impl.SupplierTypeImpl#getNoOfEmployees <em>No Of Employees</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SupplierTypeImpl extends EObjectImpl implements SupplierType {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getNoOfEmployees() <em>No Of Employees</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoOfEmployees()
	 * @generated
	 * @ordered
	 */
	protected static final int NO_OF_EMPLOYEES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNoOfEmployees() <em>No Of Employees</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoOfEmployees()
	 * @generated
	 * @ordered
	 */
	protected int noOfEmployees = NO_OF_EMPLOYEES_EDEFAULT;

	/**
	 * This is true if the No Of Employees attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean noOfEmployeesESet = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SupplierTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return CatalogPackage.Literals.SUPPLIER_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CatalogPackage.SUPPLIER_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNoOfEmployees() {
		return noOfEmployees;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNoOfEmployees(int newNoOfEmployees) {
		int oldNoOfEmployees = noOfEmployees;
		noOfEmployees = newNoOfEmployees;
		boolean oldNoOfEmployeesESet = noOfEmployeesESet;
		noOfEmployeesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CatalogPackage.SUPPLIER_TYPE__NO_OF_EMPLOYEES, oldNoOfEmployees, noOfEmployees, !oldNoOfEmployeesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNoOfEmployees() {
		int oldNoOfEmployees = noOfEmployees;
		boolean oldNoOfEmployeesESet = noOfEmployeesESet;
		noOfEmployees = NO_OF_EMPLOYEES_EDEFAULT;
		noOfEmployeesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CatalogPackage.SUPPLIER_TYPE__NO_OF_EMPLOYEES, oldNoOfEmployees, NO_OF_EMPLOYEES_EDEFAULT, oldNoOfEmployeesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNoOfEmployees() {
		return noOfEmployeesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CatalogPackage.SUPPLIER_TYPE__NAME:
				return getName();
			case CatalogPackage.SUPPLIER_TYPE__NO_OF_EMPLOYEES:
				return new Integer(getNoOfEmployees());
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
			case CatalogPackage.SUPPLIER_TYPE__NAME:
				setName((String)newValue);
				return;
			case CatalogPackage.SUPPLIER_TYPE__NO_OF_EMPLOYEES:
				setNoOfEmployees(((Integer)newValue).intValue());
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
			case CatalogPackage.SUPPLIER_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CatalogPackage.SUPPLIER_TYPE__NO_OF_EMPLOYEES:
				unsetNoOfEmployees();
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
			case CatalogPackage.SUPPLIER_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CatalogPackage.SUPPLIER_TYPE__NO_OF_EMPLOYEES:
				return isSetNoOfEmployees();
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
		result.append(" (name: ");
		result.append(name);
		result.append(", noOfEmployees: ");
		if (noOfEmployeesESet) result.append(noOfEmployees); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //SupplierTypeImpl

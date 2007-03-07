/**
 * <copyright>
 * </copyright>
 *
 * $Id: DataSourceDefinitionsImpl.java,v 1.1 2007/03/07 23:34:08 mtaal Exp $
 */
package datacore.impl;

import datacore.CSMClass;
import datacore.DataSourceDefinitions;
import datacore.DatacorePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Source Definitions</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link datacore.impl.DataSourceDefinitionsImpl#getOwnerClass <em>Owner Class</em>}</li>
 *   <li>{@link datacore.impl.DataSourceDefinitionsImpl#getReport <em>Report</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataSourceDefinitionsImpl extends EObjectImpl implements DataSourceDefinitions {
	/**
	 * The default value of the '{@link #getReport() <em>Report</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReport()
	 * @generated
	 * @ordered
	 */
	protected static final String REPORT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReport() <em>Report</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReport()
	 * @generated
	 * @ordered
	 */
	protected String report = REPORT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataSourceDefinitionsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatacorePackage.Literals.DATA_SOURCE_DEFINITIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSMClass getOwnerClass() {
		if (eContainerFeatureID != DatacorePackage.DATA_SOURCE_DEFINITIONS__OWNER_CLASS) return null;
		return (CSMClass)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnerClass(CSMClass newOwnerClass, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwnerClass, DatacorePackage.DATA_SOURCE_DEFINITIONS__OWNER_CLASS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnerClass(CSMClass newOwnerClass) {
		if (newOwnerClass != eInternalContainer() || (eContainerFeatureID != DatacorePackage.DATA_SOURCE_DEFINITIONS__OWNER_CLASS && newOwnerClass != null)) {
			if (EcoreUtil.isAncestor(this, newOwnerClass))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwnerClass != null)
				msgs = ((InternalEObject)newOwnerClass).eInverseAdd(this, DatacorePackage.CSM_CLASS__DATASOURCE_DEFINITION, CSMClass.class, msgs);
			msgs = basicSetOwnerClass(newOwnerClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatacorePackage.DATA_SOURCE_DEFINITIONS__OWNER_CLASS, newOwnerClass, newOwnerClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReport() {
		return report;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReport(String newReport) {
		String oldReport = report;
		report = newReport;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatacorePackage.DATA_SOURCE_DEFINITIONS__REPORT, oldReport, report));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DatacorePackage.DATA_SOURCE_DEFINITIONS__OWNER_CLASS:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwnerClass((CSMClass)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DatacorePackage.DATA_SOURCE_DEFINITIONS__OWNER_CLASS:
				return basicSetOwnerClass(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID) {
			case DatacorePackage.DATA_SOURCE_DEFINITIONS__OWNER_CLASS:
				return eInternalContainer().eInverseRemove(this, DatacorePackage.CSM_CLASS__DATASOURCE_DEFINITION, CSMClass.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DatacorePackage.DATA_SOURCE_DEFINITIONS__OWNER_CLASS:
				return getOwnerClass();
			case DatacorePackage.DATA_SOURCE_DEFINITIONS__REPORT:
				return getReport();
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
			case DatacorePackage.DATA_SOURCE_DEFINITIONS__OWNER_CLASS:
				setOwnerClass((CSMClass)newValue);
				return;
			case DatacorePackage.DATA_SOURCE_DEFINITIONS__REPORT:
				setReport((String)newValue);
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
			case DatacorePackage.DATA_SOURCE_DEFINITIONS__OWNER_CLASS:
				setOwnerClass((CSMClass)null);
				return;
			case DatacorePackage.DATA_SOURCE_DEFINITIONS__REPORT:
				setReport(REPORT_EDEFAULT);
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
			case DatacorePackage.DATA_SOURCE_DEFINITIONS__OWNER_CLASS:
				return getOwnerClass() != null;
			case DatacorePackage.DATA_SOURCE_DEFINITIONS__REPORT:
				return REPORT_EDEFAULT == null ? report != null : !REPORT_EDEFAULT.equals(report);
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
		result.append(" (report: ");
		result.append(report);
		result.append(')');
		return result.toString();
	}

} //DataSourceDefinitionsImpl

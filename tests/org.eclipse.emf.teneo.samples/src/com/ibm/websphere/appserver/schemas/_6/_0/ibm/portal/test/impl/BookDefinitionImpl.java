/**
 * <copyright>
 * </copyright>
 *
 * $Id: BookDefinitionImpl.java,v 1.1 2007/12/13 06:52:44 mtaal Exp $
 */
package com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.impl;

import com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.BookDefinition;
import com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.TestPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Book Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.impl.BookDefinitionImpl#getDescription
 * <em>Description</em>}</li>
 * <li>
 * {@link com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.impl.BookDefinitionImpl#getLocation
 * <em>Location</em>}</li>
 * <li>
 * {@link com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.impl.BookDefinitionImpl#getUniqueName
 * <em>Unique Name</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public abstract class BookDefinitionImpl extends EObjectImpl implements BookDefinition {
	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocation() <em>Location</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected String location = LOCATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getUniqueName() <em>Unique Name</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getUniqueName()
	 * @generated
	 * @ordered
	 */
	protected static final String UNIQUE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUniqueName() <em>Unique Name</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getUniqueName()
	 * @generated
	 * @ordered
	 */
	protected String uniqueName = UNIQUE_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected BookDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TestPackage.Literals.BOOK_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TestPackage.BOOK_DEFINITION__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setLocation(String newLocation) {
		String oldLocation = location;
		location = newLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.BOOK_DEFINITION__LOCATION,
					oldLocation, location));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getUniqueName() {
		return uniqueName;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setUniqueName(String newUniqueName) {
		String oldUniqueName = uniqueName;
		uniqueName = newUniqueName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TestPackage.BOOK_DEFINITION__UNIQUE_NAME, oldUniqueName, uniqueName));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TestPackage.BOOK_DEFINITION__DESCRIPTION:
			return getDescription();
		case TestPackage.BOOK_DEFINITION__LOCATION:
			return getLocation();
		case TestPackage.BOOK_DEFINITION__UNIQUE_NAME:
			return getUniqueName();
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
		case TestPackage.BOOK_DEFINITION__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case TestPackage.BOOK_DEFINITION__LOCATION:
			setLocation((String) newValue);
			return;
		case TestPackage.BOOK_DEFINITION__UNIQUE_NAME:
			setUniqueName((String) newValue);
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
		case TestPackage.BOOK_DEFINITION__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		case TestPackage.BOOK_DEFINITION__LOCATION:
			setLocation(LOCATION_EDEFAULT);
			return;
		case TestPackage.BOOK_DEFINITION__UNIQUE_NAME:
			setUniqueName(UNIQUE_NAME_EDEFAULT);
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
		case TestPackage.BOOK_DEFINITION__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT
					.equals(description);
		case TestPackage.BOOK_DEFINITION__LOCATION:
			return LOCATION_EDEFAULT == null ? location != null : !LOCATION_EDEFAULT.equals(location);
		case TestPackage.BOOK_DEFINITION__UNIQUE_NAME:
			return UNIQUE_NAME_EDEFAULT == null ? uniqueName != null : !UNIQUE_NAME_EDEFAULT
					.equals(uniqueName);
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
		result.append(" (description: ");
		result.append(description);
		result.append(", location: ");
		result.append(location);
		result.append(", uniqueName: ");
		result.append(uniqueName);
		result.append(')');
		return result.toString();
	}

} // BookDefinitionImpl

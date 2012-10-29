/**
 * <copyright>
 * </copyright>
 *
 * $Id: LibraryImpl.java,v 1.1 2007/12/13 06:52:44 mtaal Exp $
 */
package com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.impl;

import com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.BookDefinition;
import com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.Library;
import com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.TestPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Library</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.impl.LibraryImpl#getLibrary
 * <em>Library</em>}</li>
 * <li>
 * {@link com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.impl.LibraryImpl#getAbstractBookDefinitionGroup
 * <em>Abstract Book Definition Group</em>}</li>
 * <li>
 * {@link com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.impl.LibraryImpl#getAbstractBookDefinition
 * <em>Abstract Book Definition</em>}</li>
 * <li>
 * {@link com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.impl.LibraryImpl#getUniqueName
 * <em>Unique Name</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class LibraryImpl extends EObjectImpl implements Library {
	/**
	 * The cached value of the '{@link #getLibrary() <em>Library</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getLibrary()
	 * @generated
	 * @ordered
	 */
	protected EList<Library> library;

	/**
	 * The cached value of the '{@link #getAbstractBookDefinitionGroup()
	 * <em>Abstract Book Definition Group</em>}' attribute list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getAbstractBookDefinitionGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap abstractBookDefinitionGroup;

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
	protected LibraryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TestPackage.Literals.LIBRARY;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<Library> getLibrary() {
		if (library == null) {
			library = new EObjectContainmentEList<Library>(Library.class, this,
					TestPackage.LIBRARY__LIBRARY);
		}
		return library;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public FeatureMap getAbstractBookDefinitionGroup() {
		if (abstractBookDefinitionGroup == null) {
			abstractBookDefinitionGroup = new BasicFeatureMap(this,
					TestPackage.LIBRARY__ABSTRACT_BOOK_DEFINITION_GROUP);
		}
		return abstractBookDefinitionGroup;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<BookDefinition> getAbstractBookDefinition() {
		return getAbstractBookDefinitionGroup().list(
				TestPackage.Literals.LIBRARY__ABSTRACT_BOOK_DEFINITION);
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
			eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.LIBRARY__UNIQUE_NAME,
					oldUniqueName, uniqueName));
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
		case TestPackage.LIBRARY__LIBRARY:
			return ((InternalEList<?>) getLibrary()).basicRemove(otherEnd, msgs);
		case TestPackage.LIBRARY__ABSTRACT_BOOK_DEFINITION_GROUP:
			return ((InternalEList<?>) getAbstractBookDefinitionGroup()).basicRemove(otherEnd, msgs);
		case TestPackage.LIBRARY__ABSTRACT_BOOK_DEFINITION:
			return ((InternalEList<?>) getAbstractBookDefinition()).basicRemove(otherEnd, msgs);
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
		case TestPackage.LIBRARY__LIBRARY:
			return getLibrary();
		case TestPackage.LIBRARY__ABSTRACT_BOOK_DEFINITION_GROUP:
			if (coreType)
				return getAbstractBookDefinitionGroup();
			return ((FeatureMap.Internal) getAbstractBookDefinitionGroup()).getWrapper();
		case TestPackage.LIBRARY__ABSTRACT_BOOK_DEFINITION:
			return getAbstractBookDefinition();
		case TestPackage.LIBRARY__UNIQUE_NAME:
			return getUniqueName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case TestPackage.LIBRARY__LIBRARY:
			getLibrary().clear();
			getLibrary().addAll((Collection<? extends Library>) newValue);
			return;
		case TestPackage.LIBRARY__ABSTRACT_BOOK_DEFINITION_GROUP:
			((FeatureMap.Internal) getAbstractBookDefinitionGroup()).set(newValue);
			return;
		case TestPackage.LIBRARY__UNIQUE_NAME:
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
		case TestPackage.LIBRARY__LIBRARY:
			getLibrary().clear();
			return;
		case TestPackage.LIBRARY__ABSTRACT_BOOK_DEFINITION_GROUP:
			getAbstractBookDefinitionGroup().clear();
			return;
		case TestPackage.LIBRARY__UNIQUE_NAME:
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
		case TestPackage.LIBRARY__LIBRARY:
			return library != null && !library.isEmpty();
		case TestPackage.LIBRARY__ABSTRACT_BOOK_DEFINITION_GROUP:
			return abstractBookDefinitionGroup != null && !abstractBookDefinitionGroup.isEmpty();
		case TestPackage.LIBRARY__ABSTRACT_BOOK_DEFINITION:
			return !getAbstractBookDefinition().isEmpty();
		case TestPackage.LIBRARY__UNIQUE_NAME:
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
		result.append(" (abstractBookDefinitionGroup: ");
		result.append(abstractBookDefinitionGroup);
		result.append(", uniqueName: ");
		result.append(uniqueName);
		result.append(')');
		return result.toString();
	}

} // LibraryImpl

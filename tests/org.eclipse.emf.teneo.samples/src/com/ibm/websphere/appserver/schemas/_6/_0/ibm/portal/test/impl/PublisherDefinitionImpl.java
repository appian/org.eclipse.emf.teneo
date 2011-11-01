/**
 * <copyright>
 * </copyright>
 *
 * $Id: PublisherDefinitionImpl.java,v 1.1 2007/12/13 06:52:44 mtaal Exp $
 */
package com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.impl;

import com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.BookDefinitionResourceLink;
import com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.PublisherDefinition;
import com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.TestPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Publisher Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.impl.PublisherDefinitionImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.impl.PublisherDefinitionImpl#getResourceLink <em>Resource Link</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PublisherDefinitionImpl extends BookDefinitionImpl implements PublisherDefinition {
	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getResourceLink() <em>Resource Link</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceLink()
	 * @generated
	 * @ordered
	 */
	protected BookDefinitionResourceLink resourceLink;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PublisherDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TestPackage.Literals.PUBLISHER_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.PUBLISHER_DEFINITION__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BookDefinitionResourceLink getResourceLink() {
		return resourceLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResourceLink(BookDefinitionResourceLink newResourceLink, NotificationChain msgs) {
		BookDefinitionResourceLink oldResourceLink = resourceLink;
		resourceLink = newResourceLink;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TestPackage.PUBLISHER_DEFINITION__RESOURCE_LINK, oldResourceLink, newResourceLink);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResourceLink(BookDefinitionResourceLink newResourceLink) {
		if (newResourceLink != resourceLink) {
			NotificationChain msgs = null;
			if (resourceLink != null)
				msgs = ((InternalEObject)resourceLink).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TestPackage.PUBLISHER_DEFINITION__RESOURCE_LINK, null, msgs);
			if (newResourceLink != null)
				msgs = ((InternalEObject)newResourceLink).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TestPackage.PUBLISHER_DEFINITION__RESOURCE_LINK, null, msgs);
			msgs = basicSetResourceLink(newResourceLink, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.PUBLISHER_DEFINITION__RESOURCE_LINK, newResourceLink, newResourceLink));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TestPackage.PUBLISHER_DEFINITION__RESOURCE_LINK:
				return basicSetResourceLink(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TestPackage.PUBLISHER_DEFINITION__TITLE:
				return getTitle();
			case TestPackage.PUBLISHER_DEFINITION__RESOURCE_LINK:
				return getResourceLink();
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
			case TestPackage.PUBLISHER_DEFINITION__TITLE:
				setTitle((String)newValue);
				return;
			case TestPackage.PUBLISHER_DEFINITION__RESOURCE_LINK:
				setResourceLink((BookDefinitionResourceLink)newValue);
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
			case TestPackage.PUBLISHER_DEFINITION__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case TestPackage.PUBLISHER_DEFINITION__RESOURCE_LINK:
				setResourceLink((BookDefinitionResourceLink)null);
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
			case TestPackage.PUBLISHER_DEFINITION__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case TestPackage.PUBLISHER_DEFINITION__RESOURCE_LINK:
				return resourceLink != null;
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
		result.append(" (title: ");
		result.append(title);
		result.append(')');
		return result.toString();
	}

} //PublisherDefinitionImpl

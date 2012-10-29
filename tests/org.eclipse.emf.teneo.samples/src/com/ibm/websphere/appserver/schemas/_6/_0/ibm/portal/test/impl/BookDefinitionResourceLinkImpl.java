/**
 * <copyright>
 * </copyright>
 *
 * $Id: BookDefinitionResourceLinkImpl.java,v 1.1 2007/12/13 06:52:44 mtaal Exp $
 */
package com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.impl;

import com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.BookDefinitionResourceLink;
import com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.TestPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Book Definition Resource Link</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.impl.BookDefinitionResourceLinkImpl#getBookSubject
 * <em>Book Subject</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class BookDefinitionResourceLinkImpl extends ResourceLinkImpl implements
		BookDefinitionResourceLink {
	/**
	 * The default value of the '{@link #getBookSubject() <em>Book Subject</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getBookSubject()
	 * @generated
	 * @ordered
	 */
	protected static final String BOOK_SUBJECT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBookSubject() <em>Book Subject</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getBookSubject()
	 * @generated
	 * @ordered
	 */
	protected String bookSubject = BOOK_SUBJECT_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected BookDefinitionResourceLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TestPackage.Literals.BOOK_DEFINITION_RESOURCE_LINK;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getBookSubject() {
		return bookSubject;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setBookSubject(String newBookSubject) {
		String oldBookSubject = bookSubject;
		bookSubject = newBookSubject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TestPackage.BOOK_DEFINITION_RESOURCE_LINK__BOOK_SUBJECT, oldBookSubject, bookSubject));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TestPackage.BOOK_DEFINITION_RESOURCE_LINK__BOOK_SUBJECT:
			return getBookSubject();
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
		case TestPackage.BOOK_DEFINITION_RESOURCE_LINK__BOOK_SUBJECT:
			setBookSubject((String) newValue);
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
		case TestPackage.BOOK_DEFINITION_RESOURCE_LINK__BOOK_SUBJECT:
			setBookSubject(BOOK_SUBJECT_EDEFAULT);
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
		case TestPackage.BOOK_DEFINITION_RESOURCE_LINK__BOOK_SUBJECT:
			return BOOK_SUBJECT_EDEFAULT == null ? bookSubject != null : !BOOK_SUBJECT_EDEFAULT
					.equals(bookSubject);
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
		result.append(" (bookSubject: ");
		result.append(bookSubject);
		result.append(')');
		return result.toString();
	}

} // BookDefinitionResourceLinkImpl

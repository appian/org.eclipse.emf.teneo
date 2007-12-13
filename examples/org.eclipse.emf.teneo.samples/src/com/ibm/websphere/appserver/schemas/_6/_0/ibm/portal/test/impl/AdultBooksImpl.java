/**
 * <copyright>
 * </copyright>
 *
 * $Id: AdultBooksImpl.java,v 1.1 2007/12/13 06:52:44 mtaal Exp $
 */
package com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.impl;

import com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.AdultBooks;
import com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.TestPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Adult Books</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.impl.AdultBooksImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.impl.AdultBooksImpl#getCheckedout <em>Checkedout</em>}</li>
 *   <li>{@link com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.impl.AdultBooksImpl#getUserid <em>Userid</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AdultBooksImpl extends BookDefinitionImpl implements AdultBooks {
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
	 * The default value of the '{@link #getCheckedout() <em>Checkedout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCheckedout()
	 * @generated
	 * @ordered
	 */
	protected static final String CHECKEDOUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCheckedout() <em>Checkedout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCheckedout()
	 * @generated
	 * @ordered
	 */
	protected String checkedout = CHECKEDOUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getUserid() <em>Userid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserid()
	 * @generated
	 * @ordered
	 */
	protected static final String USERID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUserid() <em>Userid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserid()
	 * @generated
	 * @ordered
	 */
	protected String userid = USERID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdultBooksImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TestPackage.Literals.ADULT_BOOKS;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.ADULT_BOOKS__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCheckedout() {
		return checkedout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCheckedout(String newCheckedout) {
		String oldCheckedout = checkedout;
		checkedout = newCheckedout;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.ADULT_BOOKS__CHECKEDOUT, oldCheckedout, checkedout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUserid() {
		return userid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserid(String newUserid) {
		String oldUserid = userid;
		userid = newUserid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.ADULT_BOOKS__USERID, oldUserid, userid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TestPackage.ADULT_BOOKS__TITLE:
				return getTitle();
			case TestPackage.ADULT_BOOKS__CHECKEDOUT:
				return getCheckedout();
			case TestPackage.ADULT_BOOKS__USERID:
				return getUserid();
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
			case TestPackage.ADULT_BOOKS__TITLE:
				setTitle((String)newValue);
				return;
			case TestPackage.ADULT_BOOKS__CHECKEDOUT:
				setCheckedout((String)newValue);
				return;
			case TestPackage.ADULT_BOOKS__USERID:
				setUserid((String)newValue);
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
			case TestPackage.ADULT_BOOKS__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case TestPackage.ADULT_BOOKS__CHECKEDOUT:
				setCheckedout(CHECKEDOUT_EDEFAULT);
				return;
			case TestPackage.ADULT_BOOKS__USERID:
				setUserid(USERID_EDEFAULT);
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
			case TestPackage.ADULT_BOOKS__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case TestPackage.ADULT_BOOKS__CHECKEDOUT:
				return CHECKEDOUT_EDEFAULT == null ? checkedout != null : !CHECKEDOUT_EDEFAULT.equals(checkedout);
			case TestPackage.ADULT_BOOKS__USERID:
				return USERID_EDEFAULT == null ? userid != null : !USERID_EDEFAULT.equals(userid);
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
		result.append(", checkedout: ");
		result.append(checkedout);
		result.append(", userid: ");
		result.append(userid);
		result.append(')');
		return result.toString();
	}

} //AdultBooksImpl

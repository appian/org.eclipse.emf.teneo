/**
 * <copyright>
 * </copyright>
 *
 * $Id: PVersionObjectImpl.java,v 1.1 2006/07/11 16:57:16 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.transientsuper.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.teneo.samples.issues.transientsuper.PVersionObject;
import org.eclipse.emf.teneo.samples.issues.transientsuper.TransientsuperPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PVersion Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.transientsuper.impl.PVersionObjectImpl#getVersionNumber <em>Version Number</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.transientsuper.impl.PVersionObjectImpl#getComment <em>Comment</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PVersionObjectImpl extends PBaseObjectImpl implements PVersionObject {
	/**
	 * The default value of the '{@link #getVersionNumber() <em>Version Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersionNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int VERSION_NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getVersionNumber() <em>Version Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersionNumber()
	 * @generated
	 * @ordered
	 */
	protected int versionNumber = VERSION_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected String comment = COMMENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PVersionObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return TransientsuperPackage.Literals.PVERSION_OBJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getVersionNumber() {
		return versionNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersionNumber(int newVersionNumber) {
		int oldVersionNumber = versionNumber;
		versionNumber = newVersionNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TransientsuperPackage.PVERSION_OBJECT__VERSION_NUMBER, oldVersionNumber, versionNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComment(String newComment) {
		String oldComment = comment;
		comment = newComment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TransientsuperPackage.PVERSION_OBJECT__COMMENT, oldComment, comment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TransientsuperPackage.PVERSION_OBJECT__VERSION_NUMBER:
				return new Integer(getVersionNumber());
			case TransientsuperPackage.PVERSION_OBJECT__COMMENT:
				return getComment();
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
			case TransientsuperPackage.PVERSION_OBJECT__VERSION_NUMBER:
				setVersionNumber(((Integer)newValue).intValue());
				return;
			case TransientsuperPackage.PVERSION_OBJECT__COMMENT:
				setComment((String)newValue);
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
			case TransientsuperPackage.PVERSION_OBJECT__VERSION_NUMBER:
				setVersionNumber(VERSION_NUMBER_EDEFAULT);
				return;
			case TransientsuperPackage.PVERSION_OBJECT__COMMENT:
				setComment(COMMENT_EDEFAULT);
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
			case TransientsuperPackage.PVERSION_OBJECT__VERSION_NUMBER:
				return versionNumber != VERSION_NUMBER_EDEFAULT;
			case TransientsuperPackage.PVERSION_OBJECT__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
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
		result.append(" (versionNumber: ");
		result.append(versionNumber);
		result.append(", comment: ");
		result.append(comment);
		result.append(')');
		return result.toString();
	}

} //PVersionObjectImpl

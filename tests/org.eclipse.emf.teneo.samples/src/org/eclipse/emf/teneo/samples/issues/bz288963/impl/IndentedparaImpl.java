/**
 * <copyright>
 * </copyright>
 *
 * $Id: IndentedparaImpl.java,v 1.1 2009/09/12 04:47:31 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.bz288963.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.teneo.samples.issues.bz288963.Bz288963Package;
import org.eclipse.emf.teneo.samples.issues.bz288963.Indentedpara;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Indentedpara</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz288963.impl.IndentedparaImpl#getIndentSpace <em>Indent Space</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IndentedparaImpl extends ParagraphImpl implements Indentedpara {
	/**
	 * The default value of the '{@link #getIndentSpace() <em>Indent Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndentSpace()
	 * @generated
	 * @ordered
	 */
	protected static final long INDENT_SPACE_EDEFAULT = 1L;

	/**
	 * The cached value of the '{@link #getIndentSpace() <em>Indent Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndentSpace()
	 * @generated
	 * @ordered
	 */
	protected long indentSpace = INDENT_SPACE_EDEFAULT;

	/**
	 * This is true if the Indent Space attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean indentSpaceESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IndentedparaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Bz288963Package.Literals.INDENTEDPARA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getIndentSpace() {
		return indentSpace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndentSpace(long newIndentSpace) {
		long oldIndentSpace = indentSpace;
		indentSpace = newIndentSpace;
		boolean oldIndentSpaceESet = indentSpaceESet;
		indentSpaceESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Bz288963Package.INDENTEDPARA__INDENT_SPACE, oldIndentSpace, indentSpace, !oldIndentSpaceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIndentSpace() {
		long oldIndentSpace = indentSpace;
		boolean oldIndentSpaceESet = indentSpaceESet;
		indentSpace = INDENT_SPACE_EDEFAULT;
		indentSpaceESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Bz288963Package.INDENTEDPARA__INDENT_SPACE, oldIndentSpace, INDENT_SPACE_EDEFAULT, oldIndentSpaceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIndentSpace() {
		return indentSpaceESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Bz288963Package.INDENTEDPARA__INDENT_SPACE:
				return getIndentSpace();
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
			case Bz288963Package.INDENTEDPARA__INDENT_SPACE:
				setIndentSpace((Long)newValue);
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
			case Bz288963Package.INDENTEDPARA__INDENT_SPACE:
				unsetIndentSpace();
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
			case Bz288963Package.INDENTEDPARA__INDENT_SPACE:
				return isSetIndentSpace();
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
		result.append(" (indentSpace: ");
		if (indentSpaceESet) result.append(indentSpace); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //IndentedparaImpl

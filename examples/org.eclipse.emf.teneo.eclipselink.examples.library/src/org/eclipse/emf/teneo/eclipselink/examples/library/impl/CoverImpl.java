/**
 * <copyright>
 * </copyright>
 *
 * $Id: CoverImpl.java,v 1.4 2010/04/22 17:57:42 mtaal Exp $
 */
package org.eclipse.emf.teneo.eclipselink.examples.library.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.teneo.eclipselink.examples.library.Cover;
import org.eclipse.emf.teneo.eclipselink.examples.library.LibraryPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cover</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.eclipselink.examples.library.impl.CoverImpl#isColored <em>Colored</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CoverImpl extends IdentifiableImpl implements Cover {
	/**
	 * The default value of the '{@link #isColored() <em>Colored</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isColored()
	 * @generated
	 * @ordered
	 */
	protected static final boolean COLORED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isColored() <em>Colored</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isColored()
	 * @generated
	 * @ordered
	 */
	protected boolean colored = COLORED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CoverImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LibraryPackage.Literals.COVER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isColored() {
		return colored;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColored(boolean newColored) {
		boolean oldColored = colored;
		colored = newColored;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LibraryPackage.COVER__COLORED, oldColored, colored));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LibraryPackage.COVER__COLORED:
				return isColored();
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
			case LibraryPackage.COVER__COLORED:
				setColored((Boolean)newValue);
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
			case LibraryPackage.COVER__COLORED:
				setColored(COLORED_EDEFAULT);
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
			case LibraryPackage.COVER__COLORED:
				return colored != COLORED_EDEFAULT;
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
		result.append(" (colored: "); //$NON-NLS-1$
		result.append(colored);
		result.append(')');
		return result.toString();
	}

} //CoverImpl

/**
 * <copyright>
 * </copyright>
 *
 * $Id: SimpleAllTypeImpl.java,v 1.2 2007/02/08 23:09:21 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.schemaconstructs.groupall.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.teneo.samples.emf.schemaconstructs.groupall.GroupallPackage;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.groupall.SimpleAllType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple All Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.groupall.impl.SimpleAllTypeImpl#getAaa <em>Aaa</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.groupall.impl.SimpleAllTypeImpl#getBbb <em>Bbb</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.groupall.impl.SimpleAllTypeImpl#getCcc <em>Ccc</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SimpleAllTypeImpl extends EObjectImpl implements SimpleAllType {
	/**
	 * The default value of the '{@link #getAaa() <em>Aaa</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAaa()
	 * @generated
	 * @ordered
	 */
	protected static final String AAA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAaa() <em>Aaa</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAaa()
	 * @generated
	 * @ordered
	 */
	protected String aaa = AAA_EDEFAULT;

	/**
	 * The default value of the '{@link #getBbb() <em>Bbb</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBbb()
	 * @generated
	 * @ordered
	 */
	protected static final String BBB_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBbb() <em>Bbb</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBbb()
	 * @generated
	 * @ordered
	 */
	protected String bbb = BBB_EDEFAULT;

	/**
	 * The default value of the '{@link #getCcc() <em>Ccc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCcc()
	 * @generated
	 * @ordered
	 */
	protected static final String CCC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCcc() <em>Ccc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCcc()
	 * @generated
	 * @ordered
	 */
	protected String ccc = CCC_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimpleAllTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GroupallPackage.Literals.SIMPLE_ALL_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAaa() {
		return aaa;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAaa(String newAaa) {
		String oldAaa = aaa;
		aaa = newAaa;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GroupallPackage.SIMPLE_ALL_TYPE__AAA, oldAaa, aaa));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBbb() {
		return bbb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBbb(String newBbb) {
		String oldBbb = bbb;
		bbb = newBbb;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GroupallPackage.SIMPLE_ALL_TYPE__BBB, oldBbb, bbb));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCcc() {
		return ccc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCcc(String newCcc) {
		String oldCcc = ccc;
		ccc = newCcc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GroupallPackage.SIMPLE_ALL_TYPE__CCC, oldCcc, ccc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GroupallPackage.SIMPLE_ALL_TYPE__AAA:
				return getAaa();
			case GroupallPackage.SIMPLE_ALL_TYPE__BBB:
				return getBbb();
			case GroupallPackage.SIMPLE_ALL_TYPE__CCC:
				return getCcc();
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
			case GroupallPackage.SIMPLE_ALL_TYPE__AAA:
				setAaa((String)newValue);
				return;
			case GroupallPackage.SIMPLE_ALL_TYPE__BBB:
				setBbb((String)newValue);
				return;
			case GroupallPackage.SIMPLE_ALL_TYPE__CCC:
				setCcc((String)newValue);
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
			case GroupallPackage.SIMPLE_ALL_TYPE__AAA:
				setAaa(AAA_EDEFAULT);
				return;
			case GroupallPackage.SIMPLE_ALL_TYPE__BBB:
				setBbb(BBB_EDEFAULT);
				return;
			case GroupallPackage.SIMPLE_ALL_TYPE__CCC:
				setCcc(CCC_EDEFAULT);
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
			case GroupallPackage.SIMPLE_ALL_TYPE__AAA:
				return AAA_EDEFAULT == null ? aaa != null : !AAA_EDEFAULT.equals(aaa);
			case GroupallPackage.SIMPLE_ALL_TYPE__BBB:
				return BBB_EDEFAULT == null ? bbb != null : !BBB_EDEFAULT.equals(bbb);
			case GroupallPackage.SIMPLE_ALL_TYPE__CCC:
				return CCC_EDEFAULT == null ? ccc != null : !CCC_EDEFAULT.equals(ccc);
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
		result.append(" (aaa: ");
		result.append(aaa);
		result.append(", bbb: ");
		result.append(bbb);
		result.append(", ccc: ");
		result.append(ccc);
		result.append(')');
		return result.toString();
	}

} //SimpleAllTypeImpl

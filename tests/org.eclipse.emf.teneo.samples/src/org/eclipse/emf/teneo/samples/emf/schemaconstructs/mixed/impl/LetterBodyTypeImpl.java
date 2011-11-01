/**
 * <copyright>
 * </copyright>
 *
 * $Id: LetterBodyTypeImpl.java,v 1.2 2007/02/08 23:09:25 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.schemaconstructs.mixed.impl;

import java.math.BigInteger;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.emf.teneo.samples.emf.schemaconstructs.mixed.LetterBodyType;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.mixed.MixedPackage;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.mixed.SalutationType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Letter Body Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.mixed.impl.LetterBodyTypeImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.mixed.impl.LetterBodyTypeImpl#getSalutation <em>Salutation</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.mixed.impl.LetterBodyTypeImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.mixed.impl.LetterBodyTypeImpl#getProductName <em>Product Name</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.mixed.impl.LetterBodyTypeImpl#getShipDate <em>Ship Date</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LetterBodyTypeImpl extends EObjectImpl implements LetterBodyType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "";

	/**
	 * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixed()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mixed = null;

	/**
	 * The default value of the '{@link #getQuantity() <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger QUANTITY_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getProductName() <em>Product Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductName()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUCT_NAME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getShipDate() <em>Ship Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShipDate()
	 * @generated
	 * @ordered
	 */
	protected static final Object SHIP_DATE_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LetterBodyTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MixedPackage.Literals.LETTER_BODY_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, MixedPackage.LETTER_BODY_TYPE__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SalutationType getSalutation() {
		return (SalutationType)getMixed().get(MixedPackage.Literals.LETTER_BODY_TYPE__SALUTATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSalutation(SalutationType newSalutation, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MixedPackage.Literals.LETTER_BODY_TYPE__SALUTATION, newSalutation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSalutation(SalutationType newSalutation) {
		((FeatureMap.Internal)getMixed()).set(MixedPackage.Literals.LETTER_BODY_TYPE__SALUTATION, newSalutation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getQuantity() {
		return (BigInteger)getMixed().get(MixedPackage.Literals.LETTER_BODY_TYPE__QUANTITY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuantity(BigInteger newQuantity) {
		((FeatureMap.Internal)getMixed()).set(MixedPackage.Literals.LETTER_BODY_TYPE__QUANTITY, newQuantity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProductName() {
		return (String)getMixed().get(MixedPackage.Literals.LETTER_BODY_TYPE__PRODUCT_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProductName(String newProductName) {
		((FeatureMap.Internal)getMixed()).set(MixedPackage.Literals.LETTER_BODY_TYPE__PRODUCT_NAME, newProductName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getShipDate() {
		return getMixed().get(MixedPackage.Literals.LETTER_BODY_TYPE__SHIP_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShipDate(Object newShipDate) {
		((FeatureMap.Internal)getMixed()).set(MixedPackage.Literals.LETTER_BODY_TYPE__SHIP_DATE, newShipDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MixedPackage.LETTER_BODY_TYPE__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case MixedPackage.LETTER_BODY_TYPE__SALUTATION:
				return basicSetSalutation(null, msgs);
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
			case MixedPackage.LETTER_BODY_TYPE__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case MixedPackage.LETTER_BODY_TYPE__SALUTATION:
				return getSalutation();
			case MixedPackage.LETTER_BODY_TYPE__QUANTITY:
				return getQuantity();
			case MixedPackage.LETTER_BODY_TYPE__PRODUCT_NAME:
				return getProductName();
			case MixedPackage.LETTER_BODY_TYPE__SHIP_DATE:
				return getShipDate();
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
			case MixedPackage.LETTER_BODY_TYPE__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case MixedPackage.LETTER_BODY_TYPE__SALUTATION:
				setSalutation((SalutationType)newValue);
				return;
			case MixedPackage.LETTER_BODY_TYPE__QUANTITY:
				setQuantity((BigInteger)newValue);
				return;
			case MixedPackage.LETTER_BODY_TYPE__PRODUCT_NAME:
				setProductName((String)newValue);
				return;
			case MixedPackage.LETTER_BODY_TYPE__SHIP_DATE:
				setShipDate(newValue);
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
			case MixedPackage.LETTER_BODY_TYPE__MIXED:
				getMixed().clear();
				return;
			case MixedPackage.LETTER_BODY_TYPE__SALUTATION:
				setSalutation((SalutationType)null);
				return;
			case MixedPackage.LETTER_BODY_TYPE__QUANTITY:
				setQuantity(QUANTITY_EDEFAULT);
				return;
			case MixedPackage.LETTER_BODY_TYPE__PRODUCT_NAME:
				setProductName(PRODUCT_NAME_EDEFAULT);
				return;
			case MixedPackage.LETTER_BODY_TYPE__SHIP_DATE:
				setShipDate(SHIP_DATE_EDEFAULT);
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
			case MixedPackage.LETTER_BODY_TYPE__MIXED:
				return mixed != null && !mixed.isEmpty();
			case MixedPackage.LETTER_BODY_TYPE__SALUTATION:
				return getSalutation() != null;
			case MixedPackage.LETTER_BODY_TYPE__QUANTITY:
				return QUANTITY_EDEFAULT == null ? getQuantity() != null : !QUANTITY_EDEFAULT.equals(getQuantity());
			case MixedPackage.LETTER_BODY_TYPE__PRODUCT_NAME:
				return PRODUCT_NAME_EDEFAULT == null ? getProductName() != null : !PRODUCT_NAME_EDEFAULT.equals(getProductName());
			case MixedPackage.LETTER_BODY_TYPE__SHIP_DATE:
				return SHIP_DATE_EDEFAULT == null ? getShipDate() != null : !SHIP_DATE_EDEFAULT.equals(getShipDate());
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
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(')');
		return result.toString();
	}

} //LetterBodyTypeImpl

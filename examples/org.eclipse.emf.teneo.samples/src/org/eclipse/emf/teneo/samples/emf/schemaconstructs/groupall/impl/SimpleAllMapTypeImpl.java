/**
 * <copyright>
 * </copyright>
 *
 * $Id: SimpleAllMapTypeImpl.java,v 1.1 2006/07/11 16:57:04 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.schemaconstructs.groupall.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.emf.teneo.samples.emf.schemaconstructs.groupall.GroupallPackage;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.groupall.SimpleAllMapType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple All Map Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.groupall.impl.SimpleAllMapTypeImpl#getAllMap <em>All Map</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.groupall.impl.SimpleAllMapTypeImpl#getAaa <em>Aaa</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.groupall.impl.SimpleAllMapTypeImpl#getBbb <em>Bbb</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.groupall.impl.SimpleAllMapTypeImpl#getCcc <em>Ccc</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SimpleAllMapTypeImpl extends EObjectImpl implements SimpleAllMapType {
	/**
	 * The cached value of the '{@link #getAllMap() <em>All Map</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllMap()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap allMap = null;

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
	 * The default value of the '{@link #getBbb() <em>Bbb</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBbb()
	 * @generated
	 * @ordered
	 */
	protected static final String BBB_EDEFAULT = null;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimpleAllMapTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return GroupallPackage.eINSTANCE.getSimpleAllMapType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAllMap() {
		if (allMap == null) {
			allMap = new BasicFeatureMap(this, GroupallPackage.SIMPLE_ALL_MAP_TYPE__ALL_MAP);
		}
		return allMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAaa() {
		return (String)getAllMap().get(GroupallPackage.eINSTANCE.getSimpleAllMapType_Aaa(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAaa(String newAaa) {
		((FeatureMap.Internal)getAllMap()).set(GroupallPackage.eINSTANCE.getSimpleAllMapType_Aaa(), newAaa);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBbb() {
		return (String)getAllMap().get(GroupallPackage.eINSTANCE.getSimpleAllMapType_Bbb(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBbb(String newBbb) {
		((FeatureMap.Internal)getAllMap()).set(GroupallPackage.eINSTANCE.getSimpleAllMapType_Bbb(), newBbb);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCcc() {
		return (String)getAllMap().get(GroupallPackage.eINSTANCE.getSimpleAllMapType_Ccc(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCcc(String newCcc) {
		((FeatureMap.Internal)getAllMap()).set(GroupallPackage.eINSTANCE.getSimpleAllMapType_Ccc(), newCcc);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case GroupallPackage.SIMPLE_ALL_MAP_TYPE__ALL_MAP:
					return ((InternalEList)getAllMap()).basicRemove(otherEnd, msgs);
				default:
					return eDynamicInverseRemove(otherEnd, featureID, baseClass, msgs);
			}
		}
		return eBasicSetContainer(null, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case GroupallPackage.SIMPLE_ALL_MAP_TYPE__ALL_MAP:
				return getAllMap();
			case GroupallPackage.SIMPLE_ALL_MAP_TYPE__AAA:
				return getAaa();
			case GroupallPackage.SIMPLE_ALL_MAP_TYPE__BBB:
				return getBbb();
			case GroupallPackage.SIMPLE_ALL_MAP_TYPE__CCC:
				return getCcc();
		}
		return eDynamicGet(eFeature, resolve);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(EStructuralFeature eFeature, Object newValue) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case GroupallPackage.SIMPLE_ALL_MAP_TYPE__ALL_MAP:
				getAllMap().clear();
				getAllMap().addAll((Collection)newValue);
				return;
			case GroupallPackage.SIMPLE_ALL_MAP_TYPE__AAA:
				setAaa((String)newValue);
				return;
			case GroupallPackage.SIMPLE_ALL_MAP_TYPE__BBB:
				setBbb((String)newValue);
				return;
			case GroupallPackage.SIMPLE_ALL_MAP_TYPE__CCC:
				setCcc((String)newValue);
				return;
		}
		eDynamicSet(eFeature, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case GroupallPackage.SIMPLE_ALL_MAP_TYPE__ALL_MAP:
				getAllMap().clear();
				return;
			case GroupallPackage.SIMPLE_ALL_MAP_TYPE__AAA:
				setAaa(AAA_EDEFAULT);
				return;
			case GroupallPackage.SIMPLE_ALL_MAP_TYPE__BBB:
				setBbb(BBB_EDEFAULT);
				return;
			case GroupallPackage.SIMPLE_ALL_MAP_TYPE__CCC:
				setCcc(CCC_EDEFAULT);
				return;
		}
		eDynamicUnset(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case GroupallPackage.SIMPLE_ALL_MAP_TYPE__ALL_MAP:
				return allMap != null && !allMap.isEmpty();
			case GroupallPackage.SIMPLE_ALL_MAP_TYPE__AAA:
				return AAA_EDEFAULT == null ? getAaa() != null : !AAA_EDEFAULT.equals(getAaa());
			case GroupallPackage.SIMPLE_ALL_MAP_TYPE__BBB:
				return BBB_EDEFAULT == null ? getBbb() != null : !BBB_EDEFAULT.equals(getBbb());
			case GroupallPackage.SIMPLE_ALL_MAP_TYPE__CCC:
				return CCC_EDEFAULT == null ? getCcc() != null : !CCC_EDEFAULT.equals(getCcc());
		}
		return eDynamicIsSet(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (allMap: ");
		result.append(allMap);
		result.append(')');
		return result.toString();
	}

} //SimpleAllMapTypeImpl

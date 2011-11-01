/**
 * <copyright>
 * </copyright>
 *
 * $Id: DocumentRootImpl.java,v 1.1 2006/07/11 16:56:58 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitutionzvon.impl;

import java.math.BigInteger;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitutionzvon.ComplexAAA;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitutionzvon.ComplexEvenType;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitutionzvon.ComplexOddType;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitutionzvon.DocumentRoot;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitutionzvon.RootType;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitutionzvon.SubstitutionzvonPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitutionzvon.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitutionzvon.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitutionzvon.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitutionzvon.impl.DocumentRootImpl#getComplexEven <em>Complex Even</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitutionzvon.impl.DocumentRootImpl#getMyComplexAbstract <em>My Complex Abstract</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitutionzvon.impl.DocumentRootImpl#getComplexOdd <em>Complex Odd</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitutionzvon.impl.DocumentRootImpl#getEven <em>Even</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitutionzvon.impl.DocumentRootImpl#getMyAbstract <em>My Abstract</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitutionzvon.impl.DocumentRootImpl#getOdd <em>Odd</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitutionzvon.impl.DocumentRootImpl#getRoot <em>Root</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DocumentRootImpl extends EObjectImpl implements DocumentRoot {
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
	 * The cached value of the '{@link #getXMLNSPrefixMap() <em>XMLNS Prefix Map</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXMLNSPrefixMap()
	 * @generated
	 * @ordered
	 */
	protected EMap xMLNSPrefixMap = null;

	/**
	 * The cached value of the '{@link #getXSISchemaLocation() <em>XSI Schema Location</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXSISchemaLocation()
	 * @generated
	 * @ordered
	 */
	protected EMap xSISchemaLocation = null;

	/**
	 * The default value of the '{@link #getEven() <em>Even</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEven()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger EVEN_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getMyAbstract() <em>My Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMyAbstract()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger MY_ABSTRACT_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getOdd() <em>Odd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOdd()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger ODD_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return SubstitutionzvonPackage.eINSTANCE.getDocumentRoot();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, SubstitutionzvonPackage.DOCUMENT_ROOT__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap getXMLNSPrefixMap() {
		if (xMLNSPrefixMap == null) {
			xMLNSPrefixMap = new EcoreEMap(EcorePackage.eINSTANCE.getEStringToStringMapEntry(), EStringToStringMapEntryImpl.class, this, SubstitutionzvonPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		}
		return xMLNSPrefixMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap getXSISchemaLocation() {
		if (xSISchemaLocation == null) {
			xSISchemaLocation = new EcoreEMap(EcorePackage.eINSTANCE.getEStringToStringMapEntry(), EStringToStringMapEntryImpl.class, this, SubstitutionzvonPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComplexEvenType getComplexEven() {
		return (ComplexEvenType)getMixed().get(SubstitutionzvonPackage.eINSTANCE.getDocumentRoot_ComplexEven(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComplexEven(ComplexEvenType newComplexEven, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SubstitutionzvonPackage.eINSTANCE.getDocumentRoot_ComplexEven(), newComplexEven, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComplexEven(ComplexEvenType newComplexEven) {
		((FeatureMap.Internal)getMixed()).set(SubstitutionzvonPackage.eINSTANCE.getDocumentRoot_ComplexEven(), newComplexEven);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComplexAAA getMyComplexAbstract() {
		return (ComplexAAA)getMixed().get(SubstitutionzvonPackage.eINSTANCE.getDocumentRoot_MyComplexAbstract(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMyComplexAbstract(ComplexAAA newMyComplexAbstract, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SubstitutionzvonPackage.eINSTANCE.getDocumentRoot_MyComplexAbstract(), newMyComplexAbstract, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComplexOddType getComplexOdd() {
		return (ComplexOddType)getMixed().get(SubstitutionzvonPackage.eINSTANCE.getDocumentRoot_ComplexOdd(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComplexOdd(ComplexOddType newComplexOdd, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SubstitutionzvonPackage.eINSTANCE.getDocumentRoot_ComplexOdd(), newComplexOdd, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComplexOdd(ComplexOddType newComplexOdd) {
		((FeatureMap.Internal)getMixed()).set(SubstitutionzvonPackage.eINSTANCE.getDocumentRoot_ComplexOdd(), newComplexOdd);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getEven() {
		return (BigInteger)getMixed().get(SubstitutionzvonPackage.eINSTANCE.getDocumentRoot_Even(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEven(BigInteger newEven) {
		((FeatureMap.Internal)getMixed()).set(SubstitutionzvonPackage.eINSTANCE.getDocumentRoot_Even(), newEven);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getMyAbstract() {
		return (BigInteger)getMixed().get(SubstitutionzvonPackage.eINSTANCE.getDocumentRoot_MyAbstract(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getOdd() {
		return (BigInteger)getMixed().get(SubstitutionzvonPackage.eINSTANCE.getDocumentRoot_Odd(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOdd(BigInteger newOdd) {
		((FeatureMap.Internal)getMixed()).set(SubstitutionzvonPackage.eINSTANCE.getDocumentRoot_Odd(), newOdd);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RootType getRoot() {
		return (RootType)getMixed().get(SubstitutionzvonPackage.eINSTANCE.getDocumentRoot_Root(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRoot(RootType newRoot, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SubstitutionzvonPackage.eINSTANCE.getDocumentRoot_Root(), newRoot, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoot(RootType newRoot) {
		((FeatureMap.Internal)getMixed()).set(SubstitutionzvonPackage.eINSTANCE.getDocumentRoot_Root(), newRoot);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case SubstitutionzvonPackage.DOCUMENT_ROOT__MIXED:
					return ((InternalEList)getMixed()).basicRemove(otherEnd, msgs);
				case SubstitutionzvonPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
					return ((InternalEList)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
				case SubstitutionzvonPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
					return ((InternalEList)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
				case SubstitutionzvonPackage.DOCUMENT_ROOT__COMPLEX_EVEN:
					return basicSetComplexEven(null, msgs);
				case SubstitutionzvonPackage.DOCUMENT_ROOT__MY_COMPLEX_ABSTRACT:
					return basicSetMyComplexAbstract(null, msgs);
				case SubstitutionzvonPackage.DOCUMENT_ROOT__COMPLEX_ODD:
					return basicSetComplexOdd(null, msgs);
				case SubstitutionzvonPackage.DOCUMENT_ROOT__ROOT:
					return basicSetRoot(null, msgs);
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
			case SubstitutionzvonPackage.DOCUMENT_ROOT__MIXED:
				return getMixed();
			case SubstitutionzvonPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return getXMLNSPrefixMap();
			case SubstitutionzvonPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return getXSISchemaLocation();
			case SubstitutionzvonPackage.DOCUMENT_ROOT__COMPLEX_EVEN:
				return getComplexEven();
			case SubstitutionzvonPackage.DOCUMENT_ROOT__MY_COMPLEX_ABSTRACT:
				return getMyComplexAbstract();
			case SubstitutionzvonPackage.DOCUMENT_ROOT__COMPLEX_ODD:
				return getComplexOdd();
			case SubstitutionzvonPackage.DOCUMENT_ROOT__EVEN:
				return getEven();
			case SubstitutionzvonPackage.DOCUMENT_ROOT__MY_ABSTRACT:
				return getMyAbstract();
			case SubstitutionzvonPackage.DOCUMENT_ROOT__ODD:
				return getOdd();
			case SubstitutionzvonPackage.DOCUMENT_ROOT__ROOT:
				return getRoot();
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
			case SubstitutionzvonPackage.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				getMixed().addAll((Collection)newValue);
				return;
			case SubstitutionzvonPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				getXMLNSPrefixMap().addAll((Collection)newValue);
				return;
			case SubstitutionzvonPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				getXSISchemaLocation().addAll((Collection)newValue);
				return;
			case SubstitutionzvonPackage.DOCUMENT_ROOT__COMPLEX_EVEN:
				setComplexEven((ComplexEvenType)newValue);
				return;
			case SubstitutionzvonPackage.DOCUMENT_ROOT__COMPLEX_ODD:
				setComplexOdd((ComplexOddType)newValue);
				return;
			case SubstitutionzvonPackage.DOCUMENT_ROOT__EVEN:
				setEven((BigInteger)newValue);
				return;
			case SubstitutionzvonPackage.DOCUMENT_ROOT__ODD:
				setOdd((BigInteger)newValue);
				return;
			case SubstitutionzvonPackage.DOCUMENT_ROOT__ROOT:
				setRoot((RootType)newValue);
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
			case SubstitutionzvonPackage.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case SubstitutionzvonPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case SubstitutionzvonPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case SubstitutionzvonPackage.DOCUMENT_ROOT__COMPLEX_EVEN:
				setComplexEven((ComplexEvenType)null);
				return;
			case SubstitutionzvonPackage.DOCUMENT_ROOT__COMPLEX_ODD:
				setComplexOdd((ComplexOddType)null);
				return;
			case SubstitutionzvonPackage.DOCUMENT_ROOT__EVEN:
				setEven(EVEN_EDEFAULT);
				return;
			case SubstitutionzvonPackage.DOCUMENT_ROOT__ODD:
				setOdd(ODD_EDEFAULT);
				return;
			case SubstitutionzvonPackage.DOCUMENT_ROOT__ROOT:
				setRoot((RootType)null);
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
			case SubstitutionzvonPackage.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case SubstitutionzvonPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case SubstitutionzvonPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case SubstitutionzvonPackage.DOCUMENT_ROOT__COMPLEX_EVEN:
				return getComplexEven() != null;
			case SubstitutionzvonPackage.DOCUMENT_ROOT__MY_COMPLEX_ABSTRACT:
				return getMyComplexAbstract() != null;
			case SubstitutionzvonPackage.DOCUMENT_ROOT__COMPLEX_ODD:
				return getComplexOdd() != null;
			case SubstitutionzvonPackage.DOCUMENT_ROOT__EVEN:
				return EVEN_EDEFAULT == null ? getEven() != null : !EVEN_EDEFAULT.equals(getEven());
			case SubstitutionzvonPackage.DOCUMENT_ROOT__MY_ABSTRACT:
				return MY_ABSTRACT_EDEFAULT == null ? getMyAbstract() != null : !MY_ABSTRACT_EDEFAULT.equals(getMyAbstract());
			case SubstitutionzvonPackage.DOCUMENT_ROOT__ODD:
				return ODD_EDEFAULT == null ? getOdd() != null : !ODD_EDEFAULT.equals(getOdd());
			case SubstitutionzvonPackage.DOCUMENT_ROOT__ROOT:
				return getRoot() != null;
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
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(')');
		return result.toString();
	}

} //DocumentRootImpl

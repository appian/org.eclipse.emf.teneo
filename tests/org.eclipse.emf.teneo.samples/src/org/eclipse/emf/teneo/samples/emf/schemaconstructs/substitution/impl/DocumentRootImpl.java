/**
 * <copyright>
 * </copyright>
 *
 * $Id: DocumentRootImpl.java,v 1.1 2006/07/11 16:57:11 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution.impl;

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

import org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution.ComplexNumber;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution.DocumentRoot;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution.EvenComplexNumberType;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution.MultiNumberType;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution.NumberType;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution.OddComplexNumberType;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution.SubstitutionPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution.impl.DocumentRootImpl#getEven <em>Even</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution.impl.DocumentRootImpl#getMySimpleAbstract <em>My Simple Abstract</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution.impl.DocumentRootImpl#getEvenComplexNumber <em>Even Complex Number</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution.impl.DocumentRootImpl#getMyComplexAbstract <em>My Complex Abstract</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution.impl.DocumentRootImpl#getMultiNumber <em>Multi Number</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution.impl.DocumentRootImpl#getNumber <em>Number</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution.impl.DocumentRootImpl#getOdd <em>Odd</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution.impl.DocumentRootImpl#getOddComplexNumber <em>Odd Complex Number</em>}</li>
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
	 * The default value of the '{@link #getMySimpleAbstract() <em>My Simple Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMySimpleAbstract()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger MY_SIMPLE_ABSTRACT_EDEFAULT = null;

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
		return SubstitutionPackage.eINSTANCE.getDocumentRoot();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, SubstitutionPackage.DOCUMENT_ROOT__MIXED);
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
			xMLNSPrefixMap = new EcoreEMap(EcorePackage.eINSTANCE.getEStringToStringMapEntry(), EStringToStringMapEntryImpl.class, this, SubstitutionPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
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
			xSISchemaLocation = new EcoreEMap(EcorePackage.eINSTANCE.getEStringToStringMapEntry(), EStringToStringMapEntryImpl.class, this, SubstitutionPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getEven() {
		return (BigInteger)getMixed().get(SubstitutionPackage.eINSTANCE.getDocumentRoot_Even(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEven(BigInteger newEven) {
		((FeatureMap.Internal)getMixed()).set(SubstitutionPackage.eINSTANCE.getDocumentRoot_Even(), newEven);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getMySimpleAbstract() {
		return (BigInteger)getMixed().get(SubstitutionPackage.eINSTANCE.getDocumentRoot_MySimpleAbstract(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvenComplexNumberType getEvenComplexNumber() {
		return (EvenComplexNumberType)getMixed().get(SubstitutionPackage.eINSTANCE.getDocumentRoot_EvenComplexNumber(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEvenComplexNumber(EvenComplexNumberType newEvenComplexNumber, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SubstitutionPackage.eINSTANCE.getDocumentRoot_EvenComplexNumber(), newEvenComplexNumber, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEvenComplexNumber(EvenComplexNumberType newEvenComplexNumber) {
		((FeatureMap.Internal)getMixed()).set(SubstitutionPackage.eINSTANCE.getDocumentRoot_EvenComplexNumber(), newEvenComplexNumber);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComplexNumber getMyComplexAbstract() {
		return (ComplexNumber)getMixed().get(SubstitutionPackage.eINSTANCE.getDocumentRoot_MyComplexAbstract(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMyComplexAbstract(ComplexNumber newMyComplexAbstract, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SubstitutionPackage.eINSTANCE.getDocumentRoot_MyComplexAbstract(), newMyComplexAbstract, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiNumberType getMultiNumber() {
		return (MultiNumberType)getMixed().get(SubstitutionPackage.eINSTANCE.getDocumentRoot_MultiNumber(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMultiNumber(MultiNumberType newMultiNumber, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SubstitutionPackage.eINSTANCE.getDocumentRoot_MultiNumber(), newMultiNumber, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiNumber(MultiNumberType newMultiNumber) {
		((FeatureMap.Internal)getMixed()).set(SubstitutionPackage.eINSTANCE.getDocumentRoot_MultiNumber(), newMultiNumber);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumberType getNumber() {
		return (NumberType)getMixed().get(SubstitutionPackage.eINSTANCE.getDocumentRoot_Number(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNumber(NumberType newNumber, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SubstitutionPackage.eINSTANCE.getDocumentRoot_Number(), newNumber, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumber(NumberType newNumber) {
		((FeatureMap.Internal)getMixed()).set(SubstitutionPackage.eINSTANCE.getDocumentRoot_Number(), newNumber);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getOdd() {
		return (BigInteger)getMixed().get(SubstitutionPackage.eINSTANCE.getDocumentRoot_Odd(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOdd(BigInteger newOdd) {
		((FeatureMap.Internal)getMixed()).set(SubstitutionPackage.eINSTANCE.getDocumentRoot_Odd(), newOdd);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OddComplexNumberType getOddComplexNumber() {
		return (OddComplexNumberType)getMixed().get(SubstitutionPackage.eINSTANCE.getDocumentRoot_OddComplexNumber(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOddComplexNumber(OddComplexNumberType newOddComplexNumber, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SubstitutionPackage.eINSTANCE.getDocumentRoot_OddComplexNumber(), newOddComplexNumber, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOddComplexNumber(OddComplexNumberType newOddComplexNumber) {
		((FeatureMap.Internal)getMixed()).set(SubstitutionPackage.eINSTANCE.getDocumentRoot_OddComplexNumber(), newOddComplexNumber);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case SubstitutionPackage.DOCUMENT_ROOT__MIXED:
					return ((InternalEList)getMixed()).basicRemove(otherEnd, msgs);
				case SubstitutionPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
					return ((InternalEList)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
				case SubstitutionPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
					return ((InternalEList)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
				case SubstitutionPackage.DOCUMENT_ROOT__EVEN_COMPLEX_NUMBER:
					return basicSetEvenComplexNumber(null, msgs);
				case SubstitutionPackage.DOCUMENT_ROOT__MY_COMPLEX_ABSTRACT:
					return basicSetMyComplexAbstract(null, msgs);
				case SubstitutionPackage.DOCUMENT_ROOT__MULTI_NUMBER:
					return basicSetMultiNumber(null, msgs);
				case SubstitutionPackage.DOCUMENT_ROOT__NUMBER:
					return basicSetNumber(null, msgs);
				case SubstitutionPackage.DOCUMENT_ROOT__ODD_COMPLEX_NUMBER:
					return basicSetOddComplexNumber(null, msgs);
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
			case SubstitutionPackage.DOCUMENT_ROOT__MIXED:
				return getMixed();
			case SubstitutionPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return getXMLNSPrefixMap();
			case SubstitutionPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return getXSISchemaLocation();
			case SubstitutionPackage.DOCUMENT_ROOT__EVEN:
				return getEven();
			case SubstitutionPackage.DOCUMENT_ROOT__MY_SIMPLE_ABSTRACT:
				return getMySimpleAbstract();
			case SubstitutionPackage.DOCUMENT_ROOT__EVEN_COMPLEX_NUMBER:
				return getEvenComplexNumber();
			case SubstitutionPackage.DOCUMENT_ROOT__MY_COMPLEX_ABSTRACT:
				return getMyComplexAbstract();
			case SubstitutionPackage.DOCUMENT_ROOT__MULTI_NUMBER:
				return getMultiNumber();
			case SubstitutionPackage.DOCUMENT_ROOT__NUMBER:
				return getNumber();
			case SubstitutionPackage.DOCUMENT_ROOT__ODD:
				return getOdd();
			case SubstitutionPackage.DOCUMENT_ROOT__ODD_COMPLEX_NUMBER:
				return getOddComplexNumber();
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
			case SubstitutionPackage.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				getMixed().addAll((Collection)newValue);
				return;
			case SubstitutionPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				getXMLNSPrefixMap().addAll((Collection)newValue);
				return;
			case SubstitutionPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				getXSISchemaLocation().addAll((Collection)newValue);
				return;
			case SubstitutionPackage.DOCUMENT_ROOT__EVEN:
				setEven((BigInteger)newValue);
				return;
			case SubstitutionPackage.DOCUMENT_ROOT__EVEN_COMPLEX_NUMBER:
				setEvenComplexNumber((EvenComplexNumberType)newValue);
				return;
			case SubstitutionPackage.DOCUMENT_ROOT__MULTI_NUMBER:
				setMultiNumber((MultiNumberType)newValue);
				return;
			case SubstitutionPackage.DOCUMENT_ROOT__NUMBER:
				setNumber((NumberType)newValue);
				return;
			case SubstitutionPackage.DOCUMENT_ROOT__ODD:
				setOdd((BigInteger)newValue);
				return;
			case SubstitutionPackage.DOCUMENT_ROOT__ODD_COMPLEX_NUMBER:
				setOddComplexNumber((OddComplexNumberType)newValue);
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
			case SubstitutionPackage.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case SubstitutionPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case SubstitutionPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case SubstitutionPackage.DOCUMENT_ROOT__EVEN:
				setEven(EVEN_EDEFAULT);
				return;
			case SubstitutionPackage.DOCUMENT_ROOT__EVEN_COMPLEX_NUMBER:
				setEvenComplexNumber((EvenComplexNumberType)null);
				return;
			case SubstitutionPackage.DOCUMENT_ROOT__MULTI_NUMBER:
				setMultiNumber((MultiNumberType)null);
				return;
			case SubstitutionPackage.DOCUMENT_ROOT__NUMBER:
				setNumber((NumberType)null);
				return;
			case SubstitutionPackage.DOCUMENT_ROOT__ODD:
				setOdd(ODD_EDEFAULT);
				return;
			case SubstitutionPackage.DOCUMENT_ROOT__ODD_COMPLEX_NUMBER:
				setOddComplexNumber((OddComplexNumberType)null);
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
			case SubstitutionPackage.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case SubstitutionPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case SubstitutionPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case SubstitutionPackage.DOCUMENT_ROOT__EVEN:
				return EVEN_EDEFAULT == null ? getEven() != null : !EVEN_EDEFAULT.equals(getEven());
			case SubstitutionPackage.DOCUMENT_ROOT__MY_SIMPLE_ABSTRACT:
				return MY_SIMPLE_ABSTRACT_EDEFAULT == null ? getMySimpleAbstract() != null : !MY_SIMPLE_ABSTRACT_EDEFAULT.equals(getMySimpleAbstract());
			case SubstitutionPackage.DOCUMENT_ROOT__EVEN_COMPLEX_NUMBER:
				return getEvenComplexNumber() != null;
			case SubstitutionPackage.DOCUMENT_ROOT__MY_COMPLEX_ABSTRACT:
				return getMyComplexAbstract() != null;
			case SubstitutionPackage.DOCUMENT_ROOT__MULTI_NUMBER:
				return getMultiNumber() != null;
			case SubstitutionPackage.DOCUMENT_ROOT__NUMBER:
				return getNumber() != null;
			case SubstitutionPackage.DOCUMENT_ROOT__ODD:
				return ODD_EDEFAULT == null ? getOdd() != null : !ODD_EDEFAULT.equals(getOdd());
			case SubstitutionPackage.DOCUMENT_ROOT__ODD_COMPLEX_NUMBER:
				return getOddComplexNumber() != null;
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

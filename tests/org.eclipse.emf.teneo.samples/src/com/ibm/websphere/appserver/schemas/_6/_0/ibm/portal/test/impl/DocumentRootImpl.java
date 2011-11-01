/**
 * <copyright>
 * </copyright>
 *
 * $Id: DocumentRootImpl.java,v 1.1 2007/12/13 06:52:44 mtaal Exp $
 */
package com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.impl;

import com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.AdultBooks;
import com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.BookDefinition;
import com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.BooksInLib;
import com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.ChildrenBooks;
import com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.DocumentRoot;
import com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.PublisherDefinition;
import com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.TestPackage;

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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.impl.DocumentRootImpl#getAbstractBookDefinition <em>Abstract Book Definition</em>}</li>
 *   <li>{@link com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.impl.DocumentRootImpl#getAdultBooks <em>Adult Books</em>}</li>
 *   <li>{@link com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.impl.DocumentRootImpl#getBooksinlib <em>Booksinlib</em>}</li>
 *   <li>{@link com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.impl.DocumentRootImpl#getChildrenBooks <em>Children Books</em>}</li>
 *   <li>{@link com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.impl.DocumentRootImpl#getPublisherDefinition <em>Publisher Definition</em>}</li>
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
	protected FeatureMap mixed;

	/**
	 * The cached value of the '{@link #getXMLNSPrefixMap() <em>XMLNS Prefix Map</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXMLNSPrefixMap()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xMLNSPrefixMap;

	/**
	 * The cached value of the '{@link #getXSISchemaLocation() <em>XSI Schema Location</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXSISchemaLocation()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xSISchemaLocation;

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
	@Override
	protected EClass eStaticClass() {
		return TestPackage.Literals.DOCUMENT_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, TestPackage.DOCUMENT_ROOT__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXMLNSPrefixMap() {
		if (xMLNSPrefixMap == null) {
			xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, TestPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		}
		return xMLNSPrefixMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXSISchemaLocation() {
		if (xSISchemaLocation == null) {
			xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, TestPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BookDefinition getAbstractBookDefinition() {
		return (BookDefinition)getMixed().get(TestPackage.Literals.DOCUMENT_ROOT__ABSTRACT_BOOK_DEFINITION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractBookDefinition(BookDefinition newAbstractBookDefinition, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TestPackage.Literals.DOCUMENT_ROOT__ABSTRACT_BOOK_DEFINITION, newAbstractBookDefinition, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdultBooks getAdultBooks() {
		return (AdultBooks)getMixed().get(TestPackage.Literals.DOCUMENT_ROOT__ADULT_BOOKS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAdultBooks(AdultBooks newAdultBooks, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TestPackage.Literals.DOCUMENT_ROOT__ADULT_BOOKS, newAdultBooks, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdultBooks(AdultBooks newAdultBooks) {
		((FeatureMap.Internal)getMixed()).set(TestPackage.Literals.DOCUMENT_ROOT__ADULT_BOOKS, newAdultBooks);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooksInLib getBooksinlib() {
		return (BooksInLib)getMixed().get(TestPackage.Literals.DOCUMENT_ROOT__BOOKSINLIB, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBooksinlib(BooksInLib newBooksinlib, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TestPackage.Literals.DOCUMENT_ROOT__BOOKSINLIB, newBooksinlib, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBooksinlib(BooksInLib newBooksinlib) {
		((FeatureMap.Internal)getMixed()).set(TestPackage.Literals.DOCUMENT_ROOT__BOOKSINLIB, newBooksinlib);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChildrenBooks getChildrenBooks() {
		return (ChildrenBooks)getMixed().get(TestPackage.Literals.DOCUMENT_ROOT__CHILDREN_BOOKS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChildrenBooks(ChildrenBooks newChildrenBooks, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TestPackage.Literals.DOCUMENT_ROOT__CHILDREN_BOOKS, newChildrenBooks, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChildrenBooks(ChildrenBooks newChildrenBooks) {
		((FeatureMap.Internal)getMixed()).set(TestPackage.Literals.DOCUMENT_ROOT__CHILDREN_BOOKS, newChildrenBooks);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PublisherDefinition getPublisherDefinition() {
		return (PublisherDefinition)getMixed().get(TestPackage.Literals.DOCUMENT_ROOT__PUBLISHER_DEFINITION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPublisherDefinition(PublisherDefinition newPublisherDefinition, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TestPackage.Literals.DOCUMENT_ROOT__PUBLISHER_DEFINITION, newPublisherDefinition, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPublisherDefinition(PublisherDefinition newPublisherDefinition) {
		((FeatureMap.Internal)getMixed()).set(TestPackage.Literals.DOCUMENT_ROOT__PUBLISHER_DEFINITION, newPublisherDefinition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TestPackage.DOCUMENT_ROOT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case TestPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case TestPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case TestPackage.DOCUMENT_ROOT__ABSTRACT_BOOK_DEFINITION:
				return basicSetAbstractBookDefinition(null, msgs);
			case TestPackage.DOCUMENT_ROOT__ADULT_BOOKS:
				return basicSetAdultBooks(null, msgs);
			case TestPackage.DOCUMENT_ROOT__BOOKSINLIB:
				return basicSetBooksinlib(null, msgs);
			case TestPackage.DOCUMENT_ROOT__CHILDREN_BOOKS:
				return basicSetChildrenBooks(null, msgs);
			case TestPackage.DOCUMENT_ROOT__PUBLISHER_DEFINITION:
				return basicSetPublisherDefinition(null, msgs);
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
			case TestPackage.DOCUMENT_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case TestPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return getXMLNSPrefixMap();
				else return getXMLNSPrefixMap().map();
			case TestPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return getXSISchemaLocation();
				else return getXSISchemaLocation().map();
			case TestPackage.DOCUMENT_ROOT__ABSTRACT_BOOK_DEFINITION:
				return getAbstractBookDefinition();
			case TestPackage.DOCUMENT_ROOT__ADULT_BOOKS:
				return getAdultBooks();
			case TestPackage.DOCUMENT_ROOT__BOOKSINLIB:
				return getBooksinlib();
			case TestPackage.DOCUMENT_ROOT__CHILDREN_BOOKS:
				return getChildrenBooks();
			case TestPackage.DOCUMENT_ROOT__PUBLISHER_DEFINITION:
				return getPublisherDefinition();
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
			case TestPackage.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case TestPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
				return;
			case TestPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
				return;
			case TestPackage.DOCUMENT_ROOT__ADULT_BOOKS:
				setAdultBooks((AdultBooks)newValue);
				return;
			case TestPackage.DOCUMENT_ROOT__BOOKSINLIB:
				setBooksinlib((BooksInLib)newValue);
				return;
			case TestPackage.DOCUMENT_ROOT__CHILDREN_BOOKS:
				setChildrenBooks((ChildrenBooks)newValue);
				return;
			case TestPackage.DOCUMENT_ROOT__PUBLISHER_DEFINITION:
				setPublisherDefinition((PublisherDefinition)newValue);
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
			case TestPackage.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case TestPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case TestPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case TestPackage.DOCUMENT_ROOT__ADULT_BOOKS:
				setAdultBooks((AdultBooks)null);
				return;
			case TestPackage.DOCUMENT_ROOT__BOOKSINLIB:
				setBooksinlib((BooksInLib)null);
				return;
			case TestPackage.DOCUMENT_ROOT__CHILDREN_BOOKS:
				setChildrenBooks((ChildrenBooks)null);
				return;
			case TestPackage.DOCUMENT_ROOT__PUBLISHER_DEFINITION:
				setPublisherDefinition((PublisherDefinition)null);
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
			case TestPackage.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case TestPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case TestPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case TestPackage.DOCUMENT_ROOT__ABSTRACT_BOOK_DEFINITION:
				return getAbstractBookDefinition() != null;
			case TestPackage.DOCUMENT_ROOT__ADULT_BOOKS:
				return getAdultBooks() != null;
			case TestPackage.DOCUMENT_ROOT__BOOKSINLIB:
				return getBooksinlib() != null;
			case TestPackage.DOCUMENT_ROOT__CHILDREN_BOOKS:
				return getChildrenBooks() != null;
			case TestPackage.DOCUMENT_ROOT__PUBLISHER_DEFINITION:
				return getPublisherDefinition() != null;
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

} //DocumentRootImpl

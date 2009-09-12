/**
 * <copyright>
 * </copyright>
 *
 * $Id: DocumentRootImpl.java,v 1.1 2009/09/12 04:47:31 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.bz288963.impl;

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

import org.eclipse.emf.teneo.samples.issues.bz288963.Book;
import org.eclipse.emf.teneo.samples.issues.bz288963.Bz288963Package;
import org.eclipse.emf.teneo.samples.issues.bz288963.DocumentRoot;
import org.eclipse.emf.teneo.samples.issues.bz288963.Footnote;
import org.eclipse.emf.teneo.samples.issues.bz288963.Indentedpara;
import org.eclipse.emf.teneo.samples.issues.bz288963.Paragraph;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz288963.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz288963.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz288963.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz288963.impl.DocumentRootImpl#getBook <em>Book</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz288963.impl.DocumentRootImpl#getFootnote <em>Footnote</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz288963.impl.DocumentRootImpl#getIndentedpara <em>Indentedpara</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz288963.impl.DocumentRootImpl#getParagraph <em>Paragraph</em>}</li>
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
		return Bz288963Package.Literals.DOCUMENT_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, Bz288963Package.DOCUMENT_ROOT__MIXED);
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
			xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, Bz288963Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
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
			xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, Bz288963Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Book getBook() {
		return (Book)getMixed().get(Bz288963Package.Literals.DOCUMENT_ROOT__BOOK, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBook(Book newBook, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Bz288963Package.Literals.DOCUMENT_ROOT__BOOK, newBook, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBook(Book newBook) {
		((FeatureMap.Internal)getMixed()).set(Bz288963Package.Literals.DOCUMENT_ROOT__BOOK, newBook);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Footnote getFootnote() {
		return (Footnote)getMixed().get(Bz288963Package.Literals.DOCUMENT_ROOT__FOOTNOTE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFootnote(Footnote newFootnote, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Bz288963Package.Literals.DOCUMENT_ROOT__FOOTNOTE, newFootnote, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFootnote(Footnote newFootnote) {
		((FeatureMap.Internal)getMixed()).set(Bz288963Package.Literals.DOCUMENT_ROOT__FOOTNOTE, newFootnote);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Indentedpara getIndentedpara() {
		return (Indentedpara)getMixed().get(Bz288963Package.Literals.DOCUMENT_ROOT__INDENTEDPARA, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIndentedpara(Indentedpara newIndentedpara, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Bz288963Package.Literals.DOCUMENT_ROOT__INDENTEDPARA, newIndentedpara, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndentedpara(Indentedpara newIndentedpara) {
		((FeatureMap.Internal)getMixed()).set(Bz288963Package.Literals.DOCUMENT_ROOT__INDENTEDPARA, newIndentedpara);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Paragraph getParagraph() {
		return (Paragraph)getMixed().get(Bz288963Package.Literals.DOCUMENT_ROOT__PARAGRAPH, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParagraph(Paragraph newParagraph, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Bz288963Package.Literals.DOCUMENT_ROOT__PARAGRAPH, newParagraph, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParagraph(Paragraph newParagraph) {
		((FeatureMap.Internal)getMixed()).set(Bz288963Package.Literals.DOCUMENT_ROOT__PARAGRAPH, newParagraph);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Bz288963Package.DOCUMENT_ROOT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case Bz288963Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case Bz288963Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case Bz288963Package.DOCUMENT_ROOT__BOOK:
				return basicSetBook(null, msgs);
			case Bz288963Package.DOCUMENT_ROOT__FOOTNOTE:
				return basicSetFootnote(null, msgs);
			case Bz288963Package.DOCUMENT_ROOT__INDENTEDPARA:
				return basicSetIndentedpara(null, msgs);
			case Bz288963Package.DOCUMENT_ROOT__PARAGRAPH:
				return basicSetParagraph(null, msgs);
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
			case Bz288963Package.DOCUMENT_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case Bz288963Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return getXMLNSPrefixMap();
				else return getXMLNSPrefixMap().map();
			case Bz288963Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return getXSISchemaLocation();
				else return getXSISchemaLocation().map();
			case Bz288963Package.DOCUMENT_ROOT__BOOK:
				return getBook();
			case Bz288963Package.DOCUMENT_ROOT__FOOTNOTE:
				return getFootnote();
			case Bz288963Package.DOCUMENT_ROOT__INDENTEDPARA:
				return getIndentedpara();
			case Bz288963Package.DOCUMENT_ROOT__PARAGRAPH:
				return getParagraph();
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
			case Bz288963Package.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case Bz288963Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
				return;
			case Bz288963Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
				return;
			case Bz288963Package.DOCUMENT_ROOT__BOOK:
				setBook((Book)newValue);
				return;
			case Bz288963Package.DOCUMENT_ROOT__FOOTNOTE:
				setFootnote((Footnote)newValue);
				return;
			case Bz288963Package.DOCUMENT_ROOT__INDENTEDPARA:
				setIndentedpara((Indentedpara)newValue);
				return;
			case Bz288963Package.DOCUMENT_ROOT__PARAGRAPH:
				setParagraph((Paragraph)newValue);
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
			case Bz288963Package.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case Bz288963Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case Bz288963Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case Bz288963Package.DOCUMENT_ROOT__BOOK:
				setBook((Book)null);
				return;
			case Bz288963Package.DOCUMENT_ROOT__FOOTNOTE:
				setFootnote((Footnote)null);
				return;
			case Bz288963Package.DOCUMENT_ROOT__INDENTEDPARA:
				setIndentedpara((Indentedpara)null);
				return;
			case Bz288963Package.DOCUMENT_ROOT__PARAGRAPH:
				setParagraph((Paragraph)null);
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
			case Bz288963Package.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case Bz288963Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case Bz288963Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case Bz288963Package.DOCUMENT_ROOT__BOOK:
				return getBook() != null;
			case Bz288963Package.DOCUMENT_ROOT__FOOTNOTE:
				return getFootnote() != null;
			case Bz288963Package.DOCUMENT_ROOT__INDENTEDPARA:
				return getIndentedpara() != null;
			case Bz288963Package.DOCUMENT_ROOT__PARAGRAPH:
				return getParagraph() != null;
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

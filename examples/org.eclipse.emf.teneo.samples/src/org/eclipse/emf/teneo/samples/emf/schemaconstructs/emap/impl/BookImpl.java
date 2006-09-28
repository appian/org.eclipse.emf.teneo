/**
 * <copyright>
 * </copyright>
 *
 * $Id: BookImpl.java,v 1.1 2006/09/28 20:06:04 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.schemaconstructs.emap.impl;

import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.emf.teneo.samples.emf.schemaconstructs.emap.Book;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.emap.EmapPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Book</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.emap.impl.BookImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.emap.impl.BookImpl#getWriters <em>Writers</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.emap.impl.BookImpl#getKeyWords <em>Key Words</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.emap.impl.BookImpl#getCityByWriter <em>City By Writer</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BookImpl extends EObjectImpl implements Book {
	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getWriters() <em>Writers</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWriters()
	 * @generated
	 * @ordered
	 */
	protected EMap writers = null;

	/**
	 * The cached value of the '{@link #getKeyWords() <em>Key Words</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyWords()
	 * @generated
	 * @ordered
	 */
	protected EMap keyWords = null;

	/**
	 * The cached value of the '{@link #getCityByWriter() <em>City By Writer</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCityByWriter()
	 * @generated
	 * @ordered
	 */
	protected EMap cityByWriter = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BookImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return EmapPackage.Literals.BOOK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmapPackage.BOOK__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map getWriters() {
		if (writers == null) {
			writers = new EcoreEMap(EmapPackage.Literals.STRING_TO_WRITER_MAP_ENTRY, StringToWriterMapEntryImpl.class, this, EmapPackage.BOOK__WRITERS);
		}
		return writers.map();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map getKeyWords() {
		if (keyWords == null) {
			keyWords = new EcoreEMap(EmapPackage.Literals.STRING_TO_STRING_MAP_ENTRY, StringToStringMapEntryImpl.class, this, EmapPackage.BOOK__KEY_WORDS);
		}
		return keyWords.map();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map getCityByWriter() {
		if (cityByWriter == null) {
			cityByWriter = new EcoreEMap(EmapPackage.Literals.WRITER_TO_STRING_MAP_ENTRY, WriterToStringMapEntryImpl.class, this, EmapPackage.BOOK__CITY_BY_WRITER);
		}
		return cityByWriter.map();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EmapPackage.BOOK__WRITERS:
				return ((InternalEList)((EMap.InternalMapView)getWriters()).eMap()).basicRemove(otherEnd, msgs);
			case EmapPackage.BOOK__KEY_WORDS:
				return ((InternalEList)((EMap.InternalMapView)getKeyWords()).eMap()).basicRemove(otherEnd, msgs);
			case EmapPackage.BOOK__CITY_BY_WRITER:
				return ((InternalEList)((EMap.InternalMapView)getCityByWriter()).eMap()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EmapPackage.BOOK__TITLE:
				return getTitle();
			case EmapPackage.BOOK__WRITERS:
				if (coreType) return ((EMap.InternalMapView)getWriters()).eMap();
				else return getWriters();
			case EmapPackage.BOOK__KEY_WORDS:
				if (coreType) return ((EMap.InternalMapView)getKeyWords()).eMap();
				else return getKeyWords();
			case EmapPackage.BOOK__CITY_BY_WRITER:
				if (coreType) return ((EMap.InternalMapView)getCityByWriter()).eMap();
				else return getCityByWriter();
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
			case EmapPackage.BOOK__TITLE:
				setTitle((String)newValue);
				return;
			case EmapPackage.BOOK__WRITERS:
				((EStructuralFeature.Setting)((EMap.InternalMapView)getWriters()).eMap()).set(newValue);
				return;
			case EmapPackage.BOOK__KEY_WORDS:
				((EStructuralFeature.Setting)((EMap.InternalMapView)getKeyWords()).eMap()).set(newValue);
				return;
			case EmapPackage.BOOK__CITY_BY_WRITER:
				((EStructuralFeature.Setting)((EMap.InternalMapView)getCityByWriter()).eMap()).set(newValue);
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
			case EmapPackage.BOOK__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case EmapPackage.BOOK__WRITERS:
				getWriters().clear();
				return;
			case EmapPackage.BOOK__KEY_WORDS:
				getKeyWords().clear();
				return;
			case EmapPackage.BOOK__CITY_BY_WRITER:
				getCityByWriter().clear();
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
			case EmapPackage.BOOK__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case EmapPackage.BOOK__WRITERS:
				return writers != null && !writers.isEmpty();
			case EmapPackage.BOOK__KEY_WORDS:
				return keyWords != null && !keyWords.isEmpty();
			case EmapPackage.BOOK__CITY_BY_WRITER:
				return cityByWriter != null && !cityByWriter.isEmpty();
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
		result.append(" (title: ");
		result.append(title);
		result.append(')');
		return result.toString();
	}

} //BookImpl
/**
 * <copyright>
 * </copyright>
 *
 * $Id: BookImpl.java,v 1.1 2008/07/06 16:25:35 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.annotations.hbmapkeys.impl;

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

import org.eclipse.emf.teneo.samples.emf.annotations.hbmapkeys.Book;
import org.eclipse.emf.teneo.samples.emf.annotations.hbmapkeys.City;
import org.eclipse.emf.teneo.samples.emf.annotations.hbmapkeys.HbmapkeysPackage;
import org.eclipse.emf.teneo.samples.emf.annotations.hbmapkeys.Writer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Book</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.hbmapkeys.impl.BookImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.hbmapkeys.impl.BookImpl#getWritersByName <em>Writers By Name</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.hbmapkeys.impl.BookImpl#getCityByWriter <em>City By Writer</em>}</li>
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
	 * The cached value of the '{@link #getWritersByName() <em>Writers By Name</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWritersByName()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, Writer> writersByName;

	/**
	 * The cached value of the '{@link #getCityByWriter() <em>City By Writer</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCityByWriter()
	 * @generated
	 * @ordered
	 */
	protected EMap<Writer, City> cityByWriter;

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
	@Override
	protected EClass eStaticClass() {
		return HbmapkeysPackage.Literals.BOOK;
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
			eNotify(new ENotificationImpl(this, Notification.SET, HbmapkeysPackage.BOOK__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, Writer> getWritersByName() {
		if (writersByName == null) {
			writersByName = new EcoreEMap<String,Writer>(HbmapkeysPackage.Literals.STRING_TO_WRITER_MAP_ENTRY, StringToWriterMapEntryImpl.class, this, HbmapkeysPackage.BOOK__WRITERS_BY_NAME);
		}
		return writersByName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<Writer, City> getCityByWriter() {
		if (cityByWriter == null) {
			cityByWriter = new EcoreEMap<Writer,City>(HbmapkeysPackage.Literals.WRITER_TO_CITY_MAP_ENTRY, WriterToCityMapEntryImpl.class, this, HbmapkeysPackage.BOOK__CITY_BY_WRITER);
		}
		return cityByWriter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HbmapkeysPackage.BOOK__WRITERS_BY_NAME:
				return ((InternalEList<?>)getWritersByName()).basicRemove(otherEnd, msgs);
			case HbmapkeysPackage.BOOK__CITY_BY_WRITER:
				return ((InternalEList<?>)getCityByWriter()).basicRemove(otherEnd, msgs);
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
			case HbmapkeysPackage.BOOK__TITLE:
				return getTitle();
			case HbmapkeysPackage.BOOK__WRITERS_BY_NAME:
				if (coreType) return getWritersByName();
				else return getWritersByName().map();
			case HbmapkeysPackage.BOOK__CITY_BY_WRITER:
				if (coreType) return getCityByWriter();
				else return getCityByWriter().map();
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
			case HbmapkeysPackage.BOOK__TITLE:
				setTitle((String)newValue);
				return;
			case HbmapkeysPackage.BOOK__WRITERS_BY_NAME:
				((EStructuralFeature.Setting)getWritersByName()).set(newValue);
				return;
			case HbmapkeysPackage.BOOK__CITY_BY_WRITER:
				((EStructuralFeature.Setting)getCityByWriter()).set(newValue);
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
			case HbmapkeysPackage.BOOK__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case HbmapkeysPackage.BOOK__WRITERS_BY_NAME:
				getWritersByName().clear();
				return;
			case HbmapkeysPackage.BOOK__CITY_BY_WRITER:
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
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case HbmapkeysPackage.BOOK__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case HbmapkeysPackage.BOOK__WRITERS_BY_NAME:
				return writersByName != null && !writersByName.isEmpty();
			case HbmapkeysPackage.BOOK__CITY_BY_WRITER:
				return cityByWriter != null && !cityByWriter.isEmpty();
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
		result.append(" (title: ");
		result.append(title);
		result.append(')');
		return result.toString();
	}

} //BookImpl

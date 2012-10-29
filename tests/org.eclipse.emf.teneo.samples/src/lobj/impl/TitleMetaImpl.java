/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package lobj.impl;

import lobj.Language;
import lobj.LobjPackage;
import lobj.TitleMeta;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Title Meta</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link lobj.impl.TitleMetaImpl#getLanguage <em>Language</em>}</li>
 * <li>{@link lobj.impl.TitleMetaImpl#getTitle <em>Title</em>}</li>
 * <li>{@link lobj.impl.TitleMetaImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class TitleMetaImpl extends EObjectImpl implements TitleMeta {
	/**
	 * The cached value of the '{@link #getLanguage() <em>Language</em>}' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected Language language;

	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected TitleMetaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected EClass eStaticClass() {
		return LobjPackage.Literals.TITLE_META;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Language getLanguage() {
		if (language != null && language.eIsProxy()) {
			InternalEObject oldLanguage = (InternalEObject) language;
			language = (Language) eResolveProxy(oldLanguage);
			if (language != oldLanguage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							LobjPackage.TITLE_META__LANGUAGE, oldLanguage, language));
			}
		}
		return language;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Language basicGetLanguage() {
		return language;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setLanguage(Language newLanguage) {
		Language oldLanguage = language;
		language = newLanguage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LobjPackage.TITLE_META__LANGUAGE,
					oldLanguage, language));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LobjPackage.TITLE_META__TITLE,
					oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LobjPackage.TITLE_META__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case LobjPackage.TITLE_META__LANGUAGE:
			if (resolve)
				return getLanguage();
			return basicGetLanguage();
		case LobjPackage.TITLE_META__TITLE:
			return getTitle();
		case LobjPackage.TITLE_META__ID:
			return getId();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case LobjPackage.TITLE_META__LANGUAGE:
			setLanguage((Language) newValue);
			return;
		case LobjPackage.TITLE_META__TITLE:
			setTitle((String) newValue);
			return;
		case LobjPackage.TITLE_META__ID:
			setId((String) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
		case LobjPackage.TITLE_META__LANGUAGE:
			setLanguage((Language) null);
			return;
		case LobjPackage.TITLE_META__TITLE:
			setTitle(TITLE_EDEFAULT);
			return;
		case LobjPackage.TITLE_META__ID:
			setId(ID_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case LobjPackage.TITLE_META__LANGUAGE:
			return language != null;
		case LobjPackage.TITLE_META__TITLE:
			return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
		case LobjPackage.TITLE_META__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (title: ");
		result.append(title);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} // TitleMetaImpl

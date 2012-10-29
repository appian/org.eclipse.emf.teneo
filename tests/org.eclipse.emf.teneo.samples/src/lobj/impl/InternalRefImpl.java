/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package lobj.impl;

import lobj.InternalRef;
import lobj.Language;
import lobj.LobjPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Internal Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link lobj.impl.InternalRefImpl#getLanguage <em>Language</em>}</li>
 * <li>{@link lobj.impl.InternalRefImpl#getRef <em>Ref</em>}</li>
 * <li>{@link lobj.impl.InternalRefImpl#getFile <em>File</em>}</li>
 * <li>{@link lobj.impl.InternalRefImpl#getReftype <em>Reftype</em>}</li>
 * <li>{@link lobj.impl.InternalRefImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class InternalRefImpl extends EObjectImpl implements InternalRef {
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
	 * The default value of the '{@link #getRef() <em>Ref</em>}' attribute. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getRef()
	 * @generated
	 * @ordered
	 */
	protected static final String REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRef() <em>Ref</em>}' attribute. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getRef()
	 * @generated
	 * @ordered
	 */
	protected String ref = REF_EDEFAULT;

	/**
	 * The default value of the '{@link #getFile() <em>File</em>}' attribute. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getFile()
	 * @generated
	 * @ordered
	 */
	protected static final String FILE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFile() <em>File</em>}' attribute. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getFile()
	 * @generated
	 * @ordered
	 */
	protected String file = FILE_EDEFAULT;

	/**
	 * The default value of the '{@link #getReftype() <em>Reftype</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getReftype()
	 * @generated
	 * @ordered
	 */
	protected static final String REFTYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReftype() <em>Reftype</em>}' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @see #getReftype()
	 * @generated
	 * @ordered
	 */
	protected String reftype = REFTYPE_EDEFAULT;

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
	protected InternalRefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected EClass eStaticClass() {
		return LobjPackage.Literals.INTERNAL_REF;
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
							LobjPackage.INTERNAL_REF__LANGUAGE, oldLanguage, language));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LobjPackage.INTERNAL_REF__LANGUAGE,
					oldLanguage, language));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getRef() {
		return ref;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setRef(String newRef) {
		String oldRef = ref;
		ref = newRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LobjPackage.INTERNAL_REF__REF, oldRef,
					ref));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getFile() {
		return file;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setFile(String newFile) {
		String oldFile = file;
		file = newFile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LobjPackage.INTERNAL_REF__FILE,
					oldFile, file));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getReftype() {
		return reftype;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setReftype(String newReftype) {
		String oldReftype = reftype;
		reftype = newReftype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LobjPackage.INTERNAL_REF__REFTYPE,
					oldReftype, reftype));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LobjPackage.INTERNAL_REF__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case LobjPackage.INTERNAL_REF__LANGUAGE:
			if (resolve)
				return getLanguage();
			return basicGetLanguage();
		case LobjPackage.INTERNAL_REF__REF:
			return getRef();
		case LobjPackage.INTERNAL_REF__FILE:
			return getFile();
		case LobjPackage.INTERNAL_REF__REFTYPE:
			return getReftype();
		case LobjPackage.INTERNAL_REF__ID:
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
		case LobjPackage.INTERNAL_REF__LANGUAGE:
			setLanguage((Language) newValue);
			return;
		case LobjPackage.INTERNAL_REF__REF:
			setRef((String) newValue);
			return;
		case LobjPackage.INTERNAL_REF__FILE:
			setFile((String) newValue);
			return;
		case LobjPackage.INTERNAL_REF__REFTYPE:
			setReftype((String) newValue);
			return;
		case LobjPackage.INTERNAL_REF__ID:
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
		case LobjPackage.INTERNAL_REF__LANGUAGE:
			setLanguage((Language) null);
			return;
		case LobjPackage.INTERNAL_REF__REF:
			setRef(REF_EDEFAULT);
			return;
		case LobjPackage.INTERNAL_REF__FILE:
			setFile(FILE_EDEFAULT);
			return;
		case LobjPackage.INTERNAL_REF__REFTYPE:
			setReftype(REFTYPE_EDEFAULT);
			return;
		case LobjPackage.INTERNAL_REF__ID:
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
		case LobjPackage.INTERNAL_REF__LANGUAGE:
			return language != null;
		case LobjPackage.INTERNAL_REF__REF:
			return REF_EDEFAULT == null ? ref != null : !REF_EDEFAULT.equals(ref);
		case LobjPackage.INTERNAL_REF__FILE:
			return FILE_EDEFAULT == null ? file != null : !FILE_EDEFAULT.equals(file);
		case LobjPackage.INTERNAL_REF__REFTYPE:
			return REFTYPE_EDEFAULT == null ? reftype != null : !REFTYPE_EDEFAULT.equals(reftype);
		case LobjPackage.INTERNAL_REF__ID:
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
		result.append(" (ref: ");
		result.append(ref);
		result.append(", file: ");
		result.append(file);
		result.append(", reftype: ");
		result.append(reftype);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} // InternalRefImpl

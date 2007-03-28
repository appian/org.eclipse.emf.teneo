/**
 * <copyright>
 * </copyright>
 *
 * $Id: AffiliationImpl.java,v 1.3 2007/03/28 13:57:10 mtaal Exp $
 */
package lobj.impl;

import lobj.Address;
import lobj.Affiliation;
import lobj.LobjPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Affiliation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link lobj.impl.AffiliationImpl#getShortaffil <em>Shortaffil</em>}</li>
 *   <li>{@link lobj.impl.AffiliationImpl#getJobtitle <em>Jobtitle</em>}</li>
 *   <li>{@link lobj.impl.AffiliationImpl#getOrgname <em>Orgname</em>}</li>
 *   <li>{@link lobj.impl.AffiliationImpl#getOrgdiv <em>Orgdiv</em>}</li>
 *   <li>{@link lobj.impl.AffiliationImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link lobj.impl.AffiliationImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AffiliationImpl extends EObjectImpl implements Affiliation {
	/**
	 * The default value of the '{@link #getShortaffil() <em>Shortaffil</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShortaffil()
	 * @generated
	 * @ordered
	 */
	protected static final String SHORTAFFIL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShortaffil() <em>Shortaffil</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShortaffil()
	 * @generated
	 * @ordered
	 */
	protected String shortaffil = SHORTAFFIL_EDEFAULT;

	/**
	 * The default value of the '{@link #getJobtitle() <em>Jobtitle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobtitle()
	 * @generated
	 * @ordered
	 */
	protected static final String JOBTITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJobtitle() <em>Jobtitle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobtitle()
	 * @generated
	 * @ordered
	 */
	protected String jobtitle = JOBTITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOrgname() <em>Orgname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrgname()
	 * @generated
	 * @ordered
	 */
	protected static final String ORGNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOrgname() <em>Orgname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrgname()
	 * @generated
	 * @ordered
	 */
	protected String orgname = ORGNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getOrgdiv() <em>Orgdiv</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrgdiv()
	 * @generated
	 * @ordered
	 */
	protected static final String ORGDIV_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOrgdiv() <em>Orgdiv</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrgdiv()
	 * @generated
	 * @ordered
	 */
	protected String orgdiv = ORGDIV_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAddress() <em>Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected Address address = null;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AffiliationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return LobjPackage.Literals.AFFILIATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getShortaffil() {
		return shortaffil;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShortaffil(String newShortaffil) {
		String oldShortaffil = shortaffil;
		shortaffil = newShortaffil;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LobjPackage.AFFILIATION__SHORTAFFIL, oldShortaffil, shortaffil));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getJobtitle() {
		return jobtitle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJobtitle(String newJobtitle) {
		String oldJobtitle = jobtitle;
		jobtitle = newJobtitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LobjPackage.AFFILIATION__JOBTITLE, oldJobtitle, jobtitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOrgname() {
		return orgname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrgname(String newOrgname) {
		String oldOrgname = orgname;
		orgname = newOrgname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LobjPackage.AFFILIATION__ORGNAME, oldOrgname, orgname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOrgdiv() {
		return orgdiv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrgdiv(String newOrgdiv) {
		String oldOrgdiv = orgdiv;
		orgdiv = newOrgdiv;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LobjPackage.AFFILIATION__ORGDIV, oldOrgdiv, orgdiv));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Address getAddress() {
		return address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAddress(Address newAddress, NotificationChain msgs) {
		Address oldAddress = address;
		address = newAddress;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LobjPackage.AFFILIATION__ADDRESS, oldAddress, newAddress);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddress(Address newAddress) {
		if (newAddress != address) {
			NotificationChain msgs = null;
			if (address != null)
				msgs = ((InternalEObject)address).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LobjPackage.AFFILIATION__ADDRESS, null, msgs);
			if (newAddress != null)
				msgs = ((InternalEObject)newAddress).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LobjPackage.AFFILIATION__ADDRESS, null, msgs);
			msgs = basicSetAddress(newAddress, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LobjPackage.AFFILIATION__ADDRESS, newAddress, newAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LobjPackage.AFFILIATION__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LobjPackage.AFFILIATION__ADDRESS:
				return basicSetAddress(null, msgs);
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
			case LobjPackage.AFFILIATION__SHORTAFFIL:
				return getShortaffil();
			case LobjPackage.AFFILIATION__JOBTITLE:
				return getJobtitle();
			case LobjPackage.AFFILIATION__ORGNAME:
				return getOrgname();
			case LobjPackage.AFFILIATION__ORGDIV:
				return getOrgdiv();
			case LobjPackage.AFFILIATION__ADDRESS:
				return getAddress();
			case LobjPackage.AFFILIATION__ID:
				return getId();
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
			case LobjPackage.AFFILIATION__SHORTAFFIL:
				setShortaffil((String)newValue);
				return;
			case LobjPackage.AFFILIATION__JOBTITLE:
				setJobtitle((String)newValue);
				return;
			case LobjPackage.AFFILIATION__ORGNAME:
				setOrgname((String)newValue);
				return;
			case LobjPackage.AFFILIATION__ORGDIV:
				setOrgdiv((String)newValue);
				return;
			case LobjPackage.AFFILIATION__ADDRESS:
				setAddress((Address)newValue);
				return;
			case LobjPackage.AFFILIATION__ID:
				setId((String)newValue);
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
			case LobjPackage.AFFILIATION__SHORTAFFIL:
				setShortaffil(SHORTAFFIL_EDEFAULT);
				return;
			case LobjPackage.AFFILIATION__JOBTITLE:
				setJobtitle(JOBTITLE_EDEFAULT);
				return;
			case LobjPackage.AFFILIATION__ORGNAME:
				setOrgname(ORGNAME_EDEFAULT);
				return;
			case LobjPackage.AFFILIATION__ORGDIV:
				setOrgdiv(ORGDIV_EDEFAULT);
				return;
			case LobjPackage.AFFILIATION__ADDRESS:
				setAddress((Address)null);
				return;
			case LobjPackage.AFFILIATION__ID:
				setId(ID_EDEFAULT);
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
			case LobjPackage.AFFILIATION__SHORTAFFIL:
				return SHORTAFFIL_EDEFAULT == null ? shortaffil != null : !SHORTAFFIL_EDEFAULT.equals(shortaffil);
			case LobjPackage.AFFILIATION__JOBTITLE:
				return JOBTITLE_EDEFAULT == null ? jobtitle != null : !JOBTITLE_EDEFAULT.equals(jobtitle);
			case LobjPackage.AFFILIATION__ORGNAME:
				return ORGNAME_EDEFAULT == null ? orgname != null : !ORGNAME_EDEFAULT.equals(orgname);
			case LobjPackage.AFFILIATION__ORGDIV:
				return ORGDIV_EDEFAULT == null ? orgdiv != null : !ORGDIV_EDEFAULT.equals(orgdiv);
			case LobjPackage.AFFILIATION__ADDRESS:
				return address != null;
			case LobjPackage.AFFILIATION__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
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
		result.append(" (shortaffil: ");
		result.append(shortaffil);
		result.append(", jobtitle: ");
		result.append(jobtitle);
		result.append(", orgname: ");
		result.append(orgname);
		result.append(", orgdiv: ");
		result.append(orgdiv);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //AffiliationImpl

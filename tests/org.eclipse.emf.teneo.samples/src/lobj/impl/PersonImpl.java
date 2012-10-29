/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package lobj.impl;

import java.util.Collection;

import lobj.Affiliation;
import lobj.LobjPackage;
import lobj.Person;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Person</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link lobj.impl.PersonImpl#getHonorific <em>Honorific</em>}</li>
 * <li>{@link lobj.impl.PersonImpl#getFirstname <em>Firstname</em>}</li>
 * <li>{@link lobj.impl.PersonImpl#getSurname <em>Surname</em>}</li>
 * <li>{@link lobj.impl.PersonImpl#getContrib <em>Contrib</em>}</li>
 * <li>{@link lobj.impl.PersonImpl#getAffiliations <em>Affiliations</em>}</li>
 * <li>{@link lobj.impl.PersonImpl#getPersonblurb <em>Personblurb</em>}</li>
 * <li>{@link lobj.impl.PersonImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class PersonImpl extends EObjectImpl implements Person {
	/**
	 * The default value of the '{@link #getHonorific() <em>Honorific</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getHonorific()
	 * @generated
	 * @ordered
	 */
	protected static final String HONORIFIC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHonorific() <em>Honorific</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getHonorific()
	 * @generated
	 * @ordered
	 */
	protected String honorific = HONORIFIC_EDEFAULT;

	/**
	 * The default value of the '{@link #getFirstname() <em>Firstname</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getFirstname()
	 * @generated
	 * @ordered
	 */
	protected static final String FIRSTNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFirstname() <em>Firstname</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getFirstname()
	 * @generated
	 * @ordered
	 */
	protected String firstname = FIRSTNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSurname() <em>Surname</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getSurname()
	 * @generated
	 * @ordered
	 */
	protected static final String SURNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSurname() <em>Surname</em>}' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @see #getSurname()
	 * @generated
	 * @ordered
	 */
	protected String surname = SURNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getContrib() <em>Contrib</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getContrib()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTRIB_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContrib() <em>Contrib</em>}' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @see #getContrib()
	 * @generated
	 * @ordered
	 */
	protected String contrib = CONTRIB_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAffiliations() <em>Affiliations</em>}' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getAffiliations()
	 * @generated
	 * @ordered
	 */
	protected EList affiliations;

	/**
	 * The default value of the '{@link #getPersonblurb() <em>Personblurb</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getPersonblurb()
	 * @generated
	 * @ordered
	 */
	protected static final String PERSONBLURB_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPersonblurb() <em>Personblurb</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getPersonblurb()
	 * @generated
	 * @ordered
	 */
	protected String personblurb = PERSONBLURB_EDEFAULT;

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
	protected PersonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected EClass eStaticClass() {
		return LobjPackage.Literals.PERSON;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getHonorific() {
		return honorific;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setHonorific(String newHonorific) {
		String oldHonorific = honorific;
		honorific = newHonorific;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LobjPackage.PERSON__HONORIFIC,
					oldHonorific, honorific));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getFirstname() {
		return firstname;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setFirstname(String newFirstname) {
		String oldFirstname = firstname;
		firstname = newFirstname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LobjPackage.PERSON__FIRSTNAME,
					oldFirstname, firstname));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getSurname() {
		return surname;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setSurname(String newSurname) {
		String oldSurname = surname;
		surname = newSurname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LobjPackage.PERSON__SURNAME,
					oldSurname, surname));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getContrib() {
		return contrib;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setContrib(String newContrib) {
		String oldContrib = contrib;
		contrib = newContrib;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LobjPackage.PERSON__CONTRIB,
					oldContrib, contrib));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList getAffiliations() {
		if (affiliations == null) {
			affiliations = new EObjectContainmentEList(Affiliation.class, this,
					LobjPackage.PERSON__AFFILIATIONS);
		}
		return affiliations;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getPersonblurb() {
		return personblurb;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setPersonblurb(String newPersonblurb) {
		String oldPersonblurb = personblurb;
		personblurb = newPersonblurb;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LobjPackage.PERSON__PERSONBLURB,
					oldPersonblurb, personblurb));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LobjPackage.PERSON__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID,
			NotificationChain msgs) {
		switch (featureID) {
		case LobjPackage.PERSON__AFFILIATIONS:
			return ((InternalEList) getAffiliations()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case LobjPackage.PERSON__HONORIFIC:
			return getHonorific();
		case LobjPackage.PERSON__FIRSTNAME:
			return getFirstname();
		case LobjPackage.PERSON__SURNAME:
			return getSurname();
		case LobjPackage.PERSON__CONTRIB:
			return getContrib();
		case LobjPackage.PERSON__AFFILIATIONS:
			return getAffiliations();
		case LobjPackage.PERSON__PERSONBLURB:
			return getPersonblurb();
		case LobjPackage.PERSON__ID:
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
		case LobjPackage.PERSON__HONORIFIC:
			setHonorific((String) newValue);
			return;
		case LobjPackage.PERSON__FIRSTNAME:
			setFirstname((String) newValue);
			return;
		case LobjPackage.PERSON__SURNAME:
			setSurname((String) newValue);
			return;
		case LobjPackage.PERSON__CONTRIB:
			setContrib((String) newValue);
			return;
		case LobjPackage.PERSON__AFFILIATIONS:
			getAffiliations().clear();
			getAffiliations().addAll((Collection) newValue);
			return;
		case LobjPackage.PERSON__PERSONBLURB:
			setPersonblurb((String) newValue);
			return;
		case LobjPackage.PERSON__ID:
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
		case LobjPackage.PERSON__HONORIFIC:
			setHonorific(HONORIFIC_EDEFAULT);
			return;
		case LobjPackage.PERSON__FIRSTNAME:
			setFirstname(FIRSTNAME_EDEFAULT);
			return;
		case LobjPackage.PERSON__SURNAME:
			setSurname(SURNAME_EDEFAULT);
			return;
		case LobjPackage.PERSON__CONTRIB:
			setContrib(CONTRIB_EDEFAULT);
			return;
		case LobjPackage.PERSON__AFFILIATIONS:
			getAffiliations().clear();
			return;
		case LobjPackage.PERSON__PERSONBLURB:
			setPersonblurb(PERSONBLURB_EDEFAULT);
			return;
		case LobjPackage.PERSON__ID:
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
		case LobjPackage.PERSON__HONORIFIC:
			return HONORIFIC_EDEFAULT == null ? honorific != null : !HONORIFIC_EDEFAULT.equals(honorific);
		case LobjPackage.PERSON__FIRSTNAME:
			return FIRSTNAME_EDEFAULT == null ? firstname != null : !FIRSTNAME_EDEFAULT.equals(firstname);
		case LobjPackage.PERSON__SURNAME:
			return SURNAME_EDEFAULT == null ? surname != null : !SURNAME_EDEFAULT.equals(surname);
		case LobjPackage.PERSON__CONTRIB:
			return CONTRIB_EDEFAULT == null ? contrib != null : !CONTRIB_EDEFAULT.equals(contrib);
		case LobjPackage.PERSON__AFFILIATIONS:
			return affiliations != null && !affiliations.isEmpty();
		case LobjPackage.PERSON__PERSONBLURB:
			return PERSONBLURB_EDEFAULT == null ? personblurb != null : !PERSONBLURB_EDEFAULT
					.equals(personblurb);
		case LobjPackage.PERSON__ID:
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
		result.append(" (honorific: ");
		result.append(honorific);
		result.append(", firstname: ");
		result.append(firstname);
		result.append(", surname: ");
		result.append(surname);
		result.append(", contrib: ");
		result.append(contrib);
		result.append(", personblurb: ");
		result.append(personblurb);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} // PersonImpl

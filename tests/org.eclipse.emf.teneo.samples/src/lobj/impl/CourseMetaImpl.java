/**
 * <copyright>
 * </copyright>
 *
 * $Id: CourseMetaImpl.java,v 1.3 2007/03/28 13:56:58 mtaal Exp $
 */
package lobj.impl;

import java.math.BigInteger;

import java.util.Collection;
import java.util.Date;

import lobj.CourseMeta;
import lobj.DidacMeta;
import lobj.Language;
import lobj.LobjPackage;
import lobj.User;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Course Meta</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link lobj.impl.CourseMetaImpl#getDidacMeta <em>Didac Meta</em>}</li>
 *   <li>{@link lobj.impl.CourseMetaImpl#getHours <em>Hours</em>}</li>
 *   <li>{@link lobj.impl.CourseMetaImpl#getLvanr <em>Lvanr</em>}</li>
 *   <li>{@link lobj.impl.CourseMetaImpl#getColumnfilterasxml <em>Columnfilterasxml</em>}</li>
 *   <li>{@link lobj.impl.CourseMetaImpl#getFromext <em>Fromext</em>}</li>
 *   <li>{@link lobj.impl.CourseMetaImpl#getCreationDate <em>Creation Date</em>}</li>
 *   <li>{@link lobj.impl.CourseMetaImpl#getLecturer <em>Lecturer</em>}</li>
 *   <li>{@link lobj.impl.CourseMetaImpl#getDefLang <em>Def Lang</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CourseMetaImpl extends LearningObjectImpl implements CourseMeta {
	/**
	 * The cached value of the '{@link #getDidacMeta() <em>Didac Meta</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDidacMeta()
	 * @generated
	 * @ordered
	 */
	protected EList didacMeta = null;

	/**
	 * The default value of the '{@link #getHours() <em>Hours</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHours()
	 * @generated
	 * @ordered
	 */
	protected static final int HOURS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getHours() <em>Hours</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHours()
	 * @generated
	 * @ordered
	 */
	protected int hours = HOURS_EDEFAULT;

	/**
	 * This is true if the Hours attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean hoursESet = false;

	/**
	 * The default value of the '{@link #getLvanr() <em>Lvanr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLvanr()
	 * @generated
	 * @ordered
	 */
	protected static final String LVANR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLvanr() <em>Lvanr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLvanr()
	 * @generated
	 * @ordered
	 */
	protected String lvanr = LVANR_EDEFAULT;

	/**
	 * The default value of the '{@link #getColumnfilterasxml() <em>Columnfilterasxml</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnfilterasxml()
	 * @generated
	 * @ordered
	 */
	protected static final String COLUMNFILTERASXML_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getColumnfilterasxml() <em>Columnfilterasxml</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnfilterasxml()
	 * @generated
	 * @ordered
	 */
	protected String columnfilterasxml = COLUMNFILTERASXML_EDEFAULT;

	/**
	 * The default value of the '{@link #getFromext() <em>Fromext</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromext()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger FROMEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFromext() <em>Fromext</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromext()
	 * @generated
	 * @ordered
	 */
	protected BigInteger fromext = FROMEXT_EDEFAULT;

	/**
	 * The default value of the '{@link #getCreationDate() <em>Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date CREATION_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreationDate() <em>Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationDate()
	 * @generated
	 * @ordered
	 */
	protected Date creationDate = CREATION_DATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLecturer() <em>Lecturer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLecturer()
	 * @generated
	 * @ordered
	 */
	protected User lecturer = null;

	/**
	 * The cached value of the '{@link #getDefLang() <em>Def Lang</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefLang()
	 * @generated
	 * @ordered
	 */
	protected Language defLang = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CourseMetaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return LobjPackage.Literals.COURSE_META;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getDidacMeta() {
		if (didacMeta == null) {
			didacMeta = new EObjectContainmentEList(DidacMeta.class, this, LobjPackage.COURSE_META__DIDAC_META);
		}
		return didacMeta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getHours() {
		return hours;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHours(int newHours) {
		int oldHours = hours;
		hours = newHours;
		boolean oldHoursESet = hoursESet;
		hoursESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LobjPackage.COURSE_META__HOURS, oldHours, hours, !oldHoursESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetHours() {
		int oldHours = hours;
		boolean oldHoursESet = hoursESet;
		hours = HOURS_EDEFAULT;
		hoursESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, LobjPackage.COURSE_META__HOURS, oldHours, HOURS_EDEFAULT, oldHoursESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetHours() {
		return hoursESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLvanr() {
		return lvanr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLvanr(String newLvanr) {
		String oldLvanr = lvanr;
		lvanr = newLvanr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LobjPackage.COURSE_META__LVANR, oldLvanr, lvanr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getColumnfilterasxml() {
		return columnfilterasxml;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColumnfilterasxml(String newColumnfilterasxml) {
		String oldColumnfilterasxml = columnfilterasxml;
		columnfilterasxml = newColumnfilterasxml;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LobjPackage.COURSE_META__COLUMNFILTERASXML, oldColumnfilterasxml, columnfilterasxml));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getFromext() {
		return fromext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromext(BigInteger newFromext) {
		BigInteger oldFromext = fromext;
		fromext = newFromext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LobjPackage.COURSE_META__FROMEXT, oldFromext, fromext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getCreationDate() {
		return creationDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreationDate(Date newCreationDate) {
		Date oldCreationDate = creationDate;
		creationDate = newCreationDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LobjPackage.COURSE_META__CREATION_DATE, oldCreationDate, creationDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User getLecturer() {
		if (lecturer != null && lecturer.eIsProxy()) {
			InternalEObject oldLecturer = (InternalEObject)lecturer;
			lecturer = (User)eResolveProxy(oldLecturer);
			if (lecturer != oldLecturer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LobjPackage.COURSE_META__LECTURER, oldLecturer, lecturer));
			}
		}
		return lecturer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User basicGetLecturer() {
		return lecturer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLecturer(User newLecturer) {
		User oldLecturer = lecturer;
		lecturer = newLecturer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LobjPackage.COURSE_META__LECTURER, oldLecturer, lecturer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Language getDefLang() {
		if (defLang != null && defLang.eIsProxy()) {
			InternalEObject oldDefLang = (InternalEObject)defLang;
			defLang = (Language)eResolveProxy(oldDefLang);
			if (defLang != oldDefLang) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LobjPackage.COURSE_META__DEF_LANG, oldDefLang, defLang));
			}
		}
		return defLang;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Language basicGetDefLang() {
		return defLang;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefLang(Language newDefLang) {
		Language oldDefLang = defLang;
		defLang = newDefLang;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LobjPackage.COURSE_META__DEF_LANG, oldDefLang, defLang));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LobjPackage.COURSE_META__DIDAC_META:
				return ((InternalEList)getDidacMeta()).basicRemove(otherEnd, msgs);
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
			case LobjPackage.COURSE_META__DIDAC_META:
				return getDidacMeta();
			case LobjPackage.COURSE_META__HOURS:
				return new Integer(getHours());
			case LobjPackage.COURSE_META__LVANR:
				return getLvanr();
			case LobjPackage.COURSE_META__COLUMNFILTERASXML:
				return getColumnfilterasxml();
			case LobjPackage.COURSE_META__FROMEXT:
				return getFromext();
			case LobjPackage.COURSE_META__CREATION_DATE:
				return getCreationDate();
			case LobjPackage.COURSE_META__LECTURER:
				if (resolve) return getLecturer();
				return basicGetLecturer();
			case LobjPackage.COURSE_META__DEF_LANG:
				if (resolve) return getDefLang();
				return basicGetDefLang();
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
			case LobjPackage.COURSE_META__DIDAC_META:
				getDidacMeta().clear();
				getDidacMeta().addAll((Collection)newValue);
				return;
			case LobjPackage.COURSE_META__HOURS:
				setHours(((Integer)newValue).intValue());
				return;
			case LobjPackage.COURSE_META__LVANR:
				setLvanr((String)newValue);
				return;
			case LobjPackage.COURSE_META__COLUMNFILTERASXML:
				setColumnfilterasxml((String)newValue);
				return;
			case LobjPackage.COURSE_META__FROMEXT:
				setFromext((BigInteger)newValue);
				return;
			case LobjPackage.COURSE_META__CREATION_DATE:
				setCreationDate((Date)newValue);
				return;
			case LobjPackage.COURSE_META__LECTURER:
				setLecturer((User)newValue);
				return;
			case LobjPackage.COURSE_META__DEF_LANG:
				setDefLang((Language)newValue);
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
			case LobjPackage.COURSE_META__DIDAC_META:
				getDidacMeta().clear();
				return;
			case LobjPackage.COURSE_META__HOURS:
				unsetHours();
				return;
			case LobjPackage.COURSE_META__LVANR:
				setLvanr(LVANR_EDEFAULT);
				return;
			case LobjPackage.COURSE_META__COLUMNFILTERASXML:
				setColumnfilterasxml(COLUMNFILTERASXML_EDEFAULT);
				return;
			case LobjPackage.COURSE_META__FROMEXT:
				setFromext(FROMEXT_EDEFAULT);
				return;
			case LobjPackage.COURSE_META__CREATION_DATE:
				setCreationDate(CREATION_DATE_EDEFAULT);
				return;
			case LobjPackage.COURSE_META__LECTURER:
				setLecturer((User)null);
				return;
			case LobjPackage.COURSE_META__DEF_LANG:
				setDefLang((Language)null);
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
			case LobjPackage.COURSE_META__DIDAC_META:
				return didacMeta != null && !didacMeta.isEmpty();
			case LobjPackage.COURSE_META__HOURS:
				return isSetHours();
			case LobjPackage.COURSE_META__LVANR:
				return LVANR_EDEFAULT == null ? lvanr != null : !LVANR_EDEFAULT.equals(lvanr);
			case LobjPackage.COURSE_META__COLUMNFILTERASXML:
				return COLUMNFILTERASXML_EDEFAULT == null ? columnfilterasxml != null : !COLUMNFILTERASXML_EDEFAULT.equals(columnfilterasxml);
			case LobjPackage.COURSE_META__FROMEXT:
				return FROMEXT_EDEFAULT == null ? fromext != null : !FROMEXT_EDEFAULT.equals(fromext);
			case LobjPackage.COURSE_META__CREATION_DATE:
				return CREATION_DATE_EDEFAULT == null ? creationDate != null : !CREATION_DATE_EDEFAULT.equals(creationDate);
			case LobjPackage.COURSE_META__LECTURER:
				return lecturer != null;
			case LobjPackage.COURSE_META__DEF_LANG:
				return defLang != null;
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
		result.append(" (hours: ");
		if (hoursESet) result.append(hours); else result.append("<unset>");
		result.append(", lvanr: ");
		result.append(lvanr);
		result.append(", columnfilterasxml: ");
		result.append(columnfilterasxml);
		result.append(", fromext: ");
		result.append(fromext);
		result.append(", creationDate: ");
		result.append(creationDate);
		result.append(')');
		return result.toString();
	}

} //CourseMetaImpl

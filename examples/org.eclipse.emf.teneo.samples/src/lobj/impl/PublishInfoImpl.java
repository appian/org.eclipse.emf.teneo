/**
 * <copyright>
 * </copyright>
 *
 * $Id: PublishInfoImpl.java,v 1.1 2006/11/23 06:12:09 mtaal Exp $
 */
package lobj.impl;

import java.util.Date;

import lobj.LobjPackage;
import lobj.PublishInfo;
import lobj.Publisher;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Publish Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link lobj.impl.PublishInfoImpl#getEdition <em>Edition</em>}</li>
 *   <li>{@link lobj.impl.PublishInfoImpl#getPubdate <em>Pubdate</em>}</li>
 *   <li>{@link lobj.impl.PublishInfoImpl#getPublisher <em>Publisher</em>}</li>
 *   <li>{@link lobj.impl.PublishInfoImpl#getPubsnumber <em>Pubsnumber</em>}</li>
 *   <li>{@link lobj.impl.PublishInfoImpl#getReleaseinfo <em>Releaseinfo</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PublishInfoImpl extends EObjectImpl implements PublishInfo {
	/**
	 * The default value of the '{@link #getEdition() <em>Edition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdition()
	 * @generated
	 * @ordered
	 */
	protected static final String EDITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEdition() <em>Edition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdition()
	 * @generated
	 * @ordered
	 */
	protected String edition = EDITION_EDEFAULT;

	/**
	 * The default value of the '{@link #getPubdate() <em>Pubdate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPubdate()
	 * @generated
	 * @ordered
	 */
	protected static final Date PUBDATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPubdate() <em>Pubdate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPubdate()
	 * @generated
	 * @ordered
	 */
	protected Date pubdate = PUBDATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPublisher() <em>Publisher</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublisher()
	 * @generated
	 * @ordered
	 */
	protected Publisher publisher = null;

	/**
	 * The default value of the '{@link #getPubsnumber() <em>Pubsnumber</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPubsnumber()
	 * @generated
	 * @ordered
	 */
	protected static final String PUBSNUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPubsnumber() <em>Pubsnumber</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPubsnumber()
	 * @generated
	 * @ordered
	 */
	protected String pubsnumber = PUBSNUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getReleaseinfo() <em>Releaseinfo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReleaseinfo()
	 * @generated
	 * @ordered
	 */
	protected static final String RELEASEINFO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReleaseinfo() <em>Releaseinfo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReleaseinfo()
	 * @generated
	 * @ordered
	 */
	protected String releaseinfo = RELEASEINFO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PublishInfoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return LobjPackage.Literals.PUBLISH_INFO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEdition() {
		return edition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEdition(String newEdition) {
		String oldEdition = edition;
		edition = newEdition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LobjPackage.PUBLISH_INFO__EDITION, oldEdition, edition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getPubdate() {
		return pubdate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPubdate(Date newPubdate) {
		Date oldPubdate = pubdate;
		pubdate = newPubdate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LobjPackage.PUBLISH_INFO__PUBDATE, oldPubdate, pubdate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Publisher getPublisher() {
		return publisher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPublisher(Publisher newPublisher, NotificationChain msgs) {
		Publisher oldPublisher = publisher;
		publisher = newPublisher;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LobjPackage.PUBLISH_INFO__PUBLISHER, oldPublisher, newPublisher);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPublisher(Publisher newPublisher) {
		if (newPublisher != publisher) {
			NotificationChain msgs = null;
			if (publisher != null)
				msgs = ((InternalEObject)publisher).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LobjPackage.PUBLISH_INFO__PUBLISHER, null, msgs);
			if (newPublisher != null)
				msgs = ((InternalEObject)newPublisher).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LobjPackage.PUBLISH_INFO__PUBLISHER, null, msgs);
			msgs = basicSetPublisher(newPublisher, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LobjPackage.PUBLISH_INFO__PUBLISHER, newPublisher, newPublisher));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPubsnumber() {
		return pubsnumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPubsnumber(String newPubsnumber) {
		String oldPubsnumber = pubsnumber;
		pubsnumber = newPubsnumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LobjPackage.PUBLISH_INFO__PUBSNUMBER, oldPubsnumber, pubsnumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReleaseinfo() {
		return releaseinfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReleaseinfo(String newReleaseinfo) {
		String oldReleaseinfo = releaseinfo;
		releaseinfo = newReleaseinfo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LobjPackage.PUBLISH_INFO__RELEASEINFO, oldReleaseinfo, releaseinfo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LobjPackage.PUBLISH_INFO__PUBLISHER:
				return basicSetPublisher(null, msgs);
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
			case LobjPackage.PUBLISH_INFO__EDITION:
				return getEdition();
			case LobjPackage.PUBLISH_INFO__PUBDATE:
				return getPubdate();
			case LobjPackage.PUBLISH_INFO__PUBLISHER:
				return getPublisher();
			case LobjPackage.PUBLISH_INFO__PUBSNUMBER:
				return getPubsnumber();
			case LobjPackage.PUBLISH_INFO__RELEASEINFO:
				return getReleaseinfo();
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
			case LobjPackage.PUBLISH_INFO__EDITION:
				setEdition((String)newValue);
				return;
			case LobjPackage.PUBLISH_INFO__PUBDATE:
				setPubdate((Date)newValue);
				return;
			case LobjPackage.PUBLISH_INFO__PUBLISHER:
				setPublisher((Publisher)newValue);
				return;
			case LobjPackage.PUBLISH_INFO__PUBSNUMBER:
				setPubsnumber((String)newValue);
				return;
			case LobjPackage.PUBLISH_INFO__RELEASEINFO:
				setReleaseinfo((String)newValue);
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
			case LobjPackage.PUBLISH_INFO__EDITION:
				setEdition(EDITION_EDEFAULT);
				return;
			case LobjPackage.PUBLISH_INFO__PUBDATE:
				setPubdate(PUBDATE_EDEFAULT);
				return;
			case LobjPackage.PUBLISH_INFO__PUBLISHER:
				setPublisher((Publisher)null);
				return;
			case LobjPackage.PUBLISH_INFO__PUBSNUMBER:
				setPubsnumber(PUBSNUMBER_EDEFAULT);
				return;
			case LobjPackage.PUBLISH_INFO__RELEASEINFO:
				setReleaseinfo(RELEASEINFO_EDEFAULT);
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
			case LobjPackage.PUBLISH_INFO__EDITION:
				return EDITION_EDEFAULT == null ? edition != null : !EDITION_EDEFAULT.equals(edition);
			case LobjPackage.PUBLISH_INFO__PUBDATE:
				return PUBDATE_EDEFAULT == null ? pubdate != null : !PUBDATE_EDEFAULT.equals(pubdate);
			case LobjPackage.PUBLISH_INFO__PUBLISHER:
				return publisher != null;
			case LobjPackage.PUBLISH_INFO__PUBSNUMBER:
				return PUBSNUMBER_EDEFAULT == null ? pubsnumber != null : !PUBSNUMBER_EDEFAULT.equals(pubsnumber);
			case LobjPackage.PUBLISH_INFO__RELEASEINFO:
				return RELEASEINFO_EDEFAULT == null ? releaseinfo != null : !RELEASEINFO_EDEFAULT.equals(releaseinfo);
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
		result.append(" (edition: ");
		result.append(edition);
		result.append(", pubdate: ");
		result.append(pubdate);
		result.append(", pubsnumber: ");
		result.append(pubsnumber);
		result.append(", releaseinfo: ");
		result.append(releaseinfo);
		result.append(')');
		return result.toString();
	}

} //PublishInfoImpl
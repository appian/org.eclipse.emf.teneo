/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package lobj.impl;

import lobj.Author;
import lobj.LobjPackage;
import lobj.Source;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Source</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link lobj.impl.SourceImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link lobj.impl.SourceImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link lobj.impl.SourceImpl#getSubtitle <em>Subtitle</em>}</li>
 *   <li>{@link lobj.impl.SourceImpl#getPublishedIn <em>Published In</em>}</li>
 *   <li>{@link lobj.impl.SourceImpl#getPublishedBy <em>Published By</em>}</li>
 *   <li>{@link lobj.impl.SourceImpl#getPublishDate <em>Publish Date</em>}</li>
 *   <li>{@link lobj.impl.SourceImpl#getPp <em>Pp</em>}</li>
 *   <li>{@link lobj.impl.SourceImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SourceImpl extends EObjectImpl implements Source {
	/**
	 * The cached value of the '{@link #getAuthor() <em>Author</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected Author author;

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
	 * The default value of the '{@link #getSubtitle() <em>Subtitle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubtitle()
	 * @generated
	 * @ordered
	 */
	protected static final String SUBTITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubtitle() <em>Subtitle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubtitle()
	 * @generated
	 * @ordered
	 */
	protected String subtitle = SUBTITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPublishedIn() <em>Published In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublishedIn()
	 * @generated
	 * @ordered
	 */
	protected static final String PUBLISHED_IN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPublishedIn() <em>Published In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublishedIn()
	 * @generated
	 * @ordered
	 */
	protected String publishedIn = PUBLISHED_IN_EDEFAULT;

	/**
	 * The default value of the '{@link #getPublishedBy() <em>Published By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublishedBy()
	 * @generated
	 * @ordered
	 */
	protected static final String PUBLISHED_BY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPublishedBy() <em>Published By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublishedBy()
	 * @generated
	 * @ordered
	 */
	protected String publishedBy = PUBLISHED_BY_EDEFAULT;

	/**
	 * The default value of the '{@link #getPublishDate() <em>Publish Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublishDate()
	 * @generated
	 * @ordered
	 */
	protected static final Object PUBLISH_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPublishDate() <em>Publish Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublishDate()
	 * @generated
	 * @ordered
	 */
	protected Object publishDate = PUBLISH_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPp() <em>Pp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPp()
	 * @generated
	 * @ordered
	 */
	protected static final String PP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPp() <em>Pp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPp()
	 * @generated
	 * @ordered
	 */
	protected String pp = PP_EDEFAULT;

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
	protected SourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return LobjPackage.Literals.SOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Author getAuthor() {
		return author;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAuthor(Author newAuthor, NotificationChain msgs) {
		Author oldAuthor = author;
		author = newAuthor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LobjPackage.SOURCE__AUTHOR, oldAuthor, newAuthor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthor(Author newAuthor) {
		if (newAuthor != author) {
			NotificationChain msgs = null;
			if (author != null)
				msgs = ((InternalEObject)author).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LobjPackage.SOURCE__AUTHOR, null, msgs);
			if (newAuthor != null)
				msgs = ((InternalEObject)newAuthor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LobjPackage.SOURCE__AUTHOR, null, msgs);
			msgs = basicSetAuthor(newAuthor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LobjPackage.SOURCE__AUTHOR, newAuthor, newAuthor));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LobjPackage.SOURCE__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSubtitle() {
		return subtitle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubtitle(String newSubtitle) {
		String oldSubtitle = subtitle;
		subtitle = newSubtitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LobjPackage.SOURCE__SUBTITLE, oldSubtitle, subtitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPublishedIn() {
		return publishedIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPublishedIn(String newPublishedIn) {
		String oldPublishedIn = publishedIn;
		publishedIn = newPublishedIn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LobjPackage.SOURCE__PUBLISHED_IN, oldPublishedIn, publishedIn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPublishedBy() {
		return publishedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPublishedBy(String newPublishedBy) {
		String oldPublishedBy = publishedBy;
		publishedBy = newPublishedBy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LobjPackage.SOURCE__PUBLISHED_BY, oldPublishedBy, publishedBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getPublishDate() {
		return publishDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPublishDate(Object newPublishDate) {
		Object oldPublishDate = publishDate;
		publishDate = newPublishDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LobjPackage.SOURCE__PUBLISH_DATE, oldPublishDate, publishDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPp() {
		return pp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPp(String newPp) {
		String oldPp = pp;
		pp = newPp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LobjPackage.SOURCE__PP, oldPp, pp));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LobjPackage.SOURCE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LobjPackage.SOURCE__AUTHOR:
				return basicSetAuthor(null, msgs);
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
			case LobjPackage.SOURCE__AUTHOR:
				return getAuthor();
			case LobjPackage.SOURCE__TITLE:
				return getTitle();
			case LobjPackage.SOURCE__SUBTITLE:
				return getSubtitle();
			case LobjPackage.SOURCE__PUBLISHED_IN:
				return getPublishedIn();
			case LobjPackage.SOURCE__PUBLISHED_BY:
				return getPublishedBy();
			case LobjPackage.SOURCE__PUBLISH_DATE:
				return getPublishDate();
			case LobjPackage.SOURCE__PP:
				return getPp();
			case LobjPackage.SOURCE__ID:
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
			case LobjPackage.SOURCE__AUTHOR:
				setAuthor((Author)newValue);
				return;
			case LobjPackage.SOURCE__TITLE:
				setTitle((String)newValue);
				return;
			case LobjPackage.SOURCE__SUBTITLE:
				setSubtitle((String)newValue);
				return;
			case LobjPackage.SOURCE__PUBLISHED_IN:
				setPublishedIn((String)newValue);
				return;
			case LobjPackage.SOURCE__PUBLISHED_BY:
				setPublishedBy((String)newValue);
				return;
			case LobjPackage.SOURCE__PUBLISH_DATE:
				setPublishDate(newValue);
				return;
			case LobjPackage.SOURCE__PP:
				setPp((String)newValue);
				return;
			case LobjPackage.SOURCE__ID:
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
			case LobjPackage.SOURCE__AUTHOR:
				setAuthor((Author)null);
				return;
			case LobjPackage.SOURCE__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case LobjPackage.SOURCE__SUBTITLE:
				setSubtitle(SUBTITLE_EDEFAULT);
				return;
			case LobjPackage.SOURCE__PUBLISHED_IN:
				setPublishedIn(PUBLISHED_IN_EDEFAULT);
				return;
			case LobjPackage.SOURCE__PUBLISHED_BY:
				setPublishedBy(PUBLISHED_BY_EDEFAULT);
				return;
			case LobjPackage.SOURCE__PUBLISH_DATE:
				setPublishDate(PUBLISH_DATE_EDEFAULT);
				return;
			case LobjPackage.SOURCE__PP:
				setPp(PP_EDEFAULT);
				return;
			case LobjPackage.SOURCE__ID:
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
			case LobjPackage.SOURCE__AUTHOR:
				return author != null;
			case LobjPackage.SOURCE__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case LobjPackage.SOURCE__SUBTITLE:
				return SUBTITLE_EDEFAULT == null ? subtitle != null : !SUBTITLE_EDEFAULT.equals(subtitle);
			case LobjPackage.SOURCE__PUBLISHED_IN:
				return PUBLISHED_IN_EDEFAULT == null ? publishedIn != null : !PUBLISHED_IN_EDEFAULT.equals(publishedIn);
			case LobjPackage.SOURCE__PUBLISHED_BY:
				return PUBLISHED_BY_EDEFAULT == null ? publishedBy != null : !PUBLISHED_BY_EDEFAULT.equals(publishedBy);
			case LobjPackage.SOURCE__PUBLISH_DATE:
				return PUBLISH_DATE_EDEFAULT == null ? publishDate != null : !PUBLISH_DATE_EDEFAULT.equals(publishDate);
			case LobjPackage.SOURCE__PP:
				return PP_EDEFAULT == null ? pp != null : !PP_EDEFAULT.equals(pp);
			case LobjPackage.SOURCE__ID:
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
		result.append(" (title: ");
		result.append(title);
		result.append(", subtitle: ");
		result.append(subtitle);
		result.append(", publishedIn: ");
		result.append(publishedIn);
		result.append(", publishedBy: ");
		result.append(publishedBy);
		result.append(", publishDate: ");
		result.append(publishDate);
		result.append(", pp: ");
		result.append(pp);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //SourceImpl

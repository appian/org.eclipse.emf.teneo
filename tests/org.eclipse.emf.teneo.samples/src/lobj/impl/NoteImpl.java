/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package lobj.impl;

import java.util.Date;

import lobj.LobjPackage;
import lobj.Note;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Note</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link lobj.impl.NoteImpl#getDate <em>Date</em>}</li>
 * <li>{@link lobj.impl.NoteImpl#getNoteAuthor <em>Note Author</em>}</li>
 * <li>{@link lobj.impl.NoteImpl#getContent <em>Content</em>}</li>
 * <li>{@link lobj.impl.NoteImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class NoteImpl extends EObjectImpl implements Note {
	/**
	 * The default value of the '{@link #getDate() <em>Date</em>}' attribute. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' attribute. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected Date date = DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNoteAuthor() <em>Note Author</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getNoteAuthor()
	 * @generated
	 * @ordered
	 */
	protected static final String NOTE_AUTHOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNoteAuthor() <em>Note Author</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getNoteAuthor()
	 * @generated
	 * @ordered
	 */
	protected String noteAuthor = NOTE_AUTHOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getContent() <em>Content</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContent() <em>Content</em>}' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected String content = CONTENT_EDEFAULT;

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
	protected NoteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected EClass eStaticClass() {
		return LobjPackage.Literals.NOTE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setDate(Date newDate) {
		Date oldDate = date;
		date = newDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LobjPackage.NOTE__DATE, oldDate, date));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getNoteAuthor() {
		return noteAuthor;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setNoteAuthor(String newNoteAuthor) {
		String oldNoteAuthor = noteAuthor;
		noteAuthor = newNoteAuthor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LobjPackage.NOTE__NOTE_AUTHOR,
					oldNoteAuthor, noteAuthor));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getContent() {
		return content;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setContent(String newContent) {
		String oldContent = content;
		content = newContent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LobjPackage.NOTE__CONTENT, oldContent,
					content));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LobjPackage.NOTE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case LobjPackage.NOTE__DATE:
			return getDate();
		case LobjPackage.NOTE__NOTE_AUTHOR:
			return getNoteAuthor();
		case LobjPackage.NOTE__CONTENT:
			return getContent();
		case LobjPackage.NOTE__ID:
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
		case LobjPackage.NOTE__DATE:
			setDate((Date) newValue);
			return;
		case LobjPackage.NOTE__NOTE_AUTHOR:
			setNoteAuthor((String) newValue);
			return;
		case LobjPackage.NOTE__CONTENT:
			setContent((String) newValue);
			return;
		case LobjPackage.NOTE__ID:
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
		case LobjPackage.NOTE__DATE:
			setDate(DATE_EDEFAULT);
			return;
		case LobjPackage.NOTE__NOTE_AUTHOR:
			setNoteAuthor(NOTE_AUTHOR_EDEFAULT);
			return;
		case LobjPackage.NOTE__CONTENT:
			setContent(CONTENT_EDEFAULT);
			return;
		case LobjPackage.NOTE__ID:
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
		case LobjPackage.NOTE__DATE:
			return DATE_EDEFAULT == null ? date != null : !DATE_EDEFAULT.equals(date);
		case LobjPackage.NOTE__NOTE_AUTHOR:
			return NOTE_AUTHOR_EDEFAULT == null ? noteAuthor != null : !NOTE_AUTHOR_EDEFAULT
					.equals(noteAuthor);
		case LobjPackage.NOTE__CONTENT:
			return CONTENT_EDEFAULT == null ? content != null : !CONTENT_EDEFAULT.equals(content);
		case LobjPackage.NOTE__ID:
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
		result.append(" (date: ");
		result.append(date);
		result.append(", noteAuthor: ");
		result.append(noteAuthor);
		result.append(", content: ");
		result.append(content);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} // NoteImpl

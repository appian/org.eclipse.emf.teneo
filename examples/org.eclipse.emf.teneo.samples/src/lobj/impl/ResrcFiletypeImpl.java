/**
 * <copyright>
 * </copyright>
 *
 * $Id: ResrcFiletypeImpl.java,v 1.3 2007/03/28 13:57:04 mtaal Exp $
 */
package lobj.impl;

import lobj.LobjPackage;
import lobj.ResrcFiletype;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resrc Filetype</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link lobj.impl.ResrcFiletypeImpl#getFiletypeExtension <em>Filetype Extension</em>}</li>
 *   <li>{@link lobj.impl.ResrcFiletypeImpl#getFiletypeDesc <em>Filetype Desc</em>}</li>
 *   <li>{@link lobj.impl.ResrcFiletypeImpl#isImage <em>Image</em>}</li>
 *   <li>{@link lobj.impl.ResrcFiletypeImpl#isApplet <em>Applet</em>}</li>
 *   <li>{@link lobj.impl.ResrcFiletypeImpl#getFiletypeImageSmall <em>Filetype Image Small</em>}</li>
 *   <li>{@link lobj.impl.ResrcFiletypeImpl#getFiletypeImageBif <em>Filetype Image Bif</em>}</li>
 *   <li>{@link lobj.impl.ResrcFiletypeImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResrcFiletypeImpl extends EObjectImpl implements ResrcFiletype {
	/**
	 * The default value of the '{@link #getFiletypeExtension() <em>Filetype Extension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFiletypeExtension()
	 * @generated
	 * @ordered
	 */
	protected static final String FILETYPE_EXTENSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFiletypeExtension() <em>Filetype Extension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFiletypeExtension()
	 * @generated
	 * @ordered
	 */
	protected String filetypeExtension = FILETYPE_EXTENSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getFiletypeDesc() <em>Filetype Desc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFiletypeDesc()
	 * @generated
	 * @ordered
	 */
	protected static final String FILETYPE_DESC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFiletypeDesc() <em>Filetype Desc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFiletypeDesc()
	 * @generated
	 * @ordered
	 */
	protected String filetypeDesc = FILETYPE_DESC_EDEFAULT;

	/**
	 * The default value of the '{@link #isImage() <em>Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isImage()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IMAGE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isImage() <em>Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isImage()
	 * @generated
	 * @ordered
	 */
	protected boolean image = IMAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #isApplet() <em>Applet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isApplet()
	 * @generated
	 * @ordered
	 */
	protected static final boolean APPLET_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isApplet() <em>Applet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isApplet()
	 * @generated
	 * @ordered
	 */
	protected boolean applet = APPLET_EDEFAULT;

	/**
	 * The default value of the '{@link #getFiletypeImageSmall() <em>Filetype Image Small</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFiletypeImageSmall()
	 * @generated
	 * @ordered
	 */
	protected static final String FILETYPE_IMAGE_SMALL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFiletypeImageSmall() <em>Filetype Image Small</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFiletypeImageSmall()
	 * @generated
	 * @ordered
	 */
	protected String filetypeImageSmall = FILETYPE_IMAGE_SMALL_EDEFAULT;

	/**
	 * The default value of the '{@link #getFiletypeImageBif() <em>Filetype Image Bif</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFiletypeImageBif()
	 * @generated
	 * @ordered
	 */
	protected static final String FILETYPE_IMAGE_BIF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFiletypeImageBif() <em>Filetype Image Bif</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFiletypeImageBif()
	 * @generated
	 * @ordered
	 */
	protected String filetypeImageBif = FILETYPE_IMAGE_BIF_EDEFAULT;

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
	protected ResrcFiletypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return LobjPackage.Literals.RESRC_FILETYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFiletypeExtension() {
		return filetypeExtension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFiletypeExtension(String newFiletypeExtension) {
		String oldFiletypeExtension = filetypeExtension;
		filetypeExtension = newFiletypeExtension;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LobjPackage.RESRC_FILETYPE__FILETYPE_EXTENSION, oldFiletypeExtension, filetypeExtension));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFiletypeDesc() {
		return filetypeDesc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFiletypeDesc(String newFiletypeDesc) {
		String oldFiletypeDesc = filetypeDesc;
		filetypeDesc = newFiletypeDesc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LobjPackage.RESRC_FILETYPE__FILETYPE_DESC, oldFiletypeDesc, filetypeDesc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isImage() {
		return image;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImage(boolean newImage) {
		boolean oldImage = image;
		image = newImage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LobjPackage.RESRC_FILETYPE__IMAGE, oldImage, image));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isApplet() {
		return applet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplet(boolean newApplet) {
		boolean oldApplet = applet;
		applet = newApplet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LobjPackage.RESRC_FILETYPE__APPLET, oldApplet, applet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFiletypeImageSmall() {
		return filetypeImageSmall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFiletypeImageSmall(String newFiletypeImageSmall) {
		String oldFiletypeImageSmall = filetypeImageSmall;
		filetypeImageSmall = newFiletypeImageSmall;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LobjPackage.RESRC_FILETYPE__FILETYPE_IMAGE_SMALL, oldFiletypeImageSmall, filetypeImageSmall));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFiletypeImageBif() {
		return filetypeImageBif;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFiletypeImageBif(String newFiletypeImageBif) {
		String oldFiletypeImageBif = filetypeImageBif;
		filetypeImageBif = newFiletypeImageBif;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LobjPackage.RESRC_FILETYPE__FILETYPE_IMAGE_BIF, oldFiletypeImageBif, filetypeImageBif));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LobjPackage.RESRC_FILETYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LobjPackage.RESRC_FILETYPE__FILETYPE_EXTENSION:
				return getFiletypeExtension();
			case LobjPackage.RESRC_FILETYPE__FILETYPE_DESC:
				return getFiletypeDesc();
			case LobjPackage.RESRC_FILETYPE__IMAGE:
				return isImage() ? Boolean.TRUE : Boolean.FALSE;
			case LobjPackage.RESRC_FILETYPE__APPLET:
				return isApplet() ? Boolean.TRUE : Boolean.FALSE;
			case LobjPackage.RESRC_FILETYPE__FILETYPE_IMAGE_SMALL:
				return getFiletypeImageSmall();
			case LobjPackage.RESRC_FILETYPE__FILETYPE_IMAGE_BIF:
				return getFiletypeImageBif();
			case LobjPackage.RESRC_FILETYPE__ID:
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
			case LobjPackage.RESRC_FILETYPE__FILETYPE_EXTENSION:
				setFiletypeExtension((String)newValue);
				return;
			case LobjPackage.RESRC_FILETYPE__FILETYPE_DESC:
				setFiletypeDesc((String)newValue);
				return;
			case LobjPackage.RESRC_FILETYPE__IMAGE:
				setImage(((Boolean)newValue).booleanValue());
				return;
			case LobjPackage.RESRC_FILETYPE__APPLET:
				setApplet(((Boolean)newValue).booleanValue());
				return;
			case LobjPackage.RESRC_FILETYPE__FILETYPE_IMAGE_SMALL:
				setFiletypeImageSmall((String)newValue);
				return;
			case LobjPackage.RESRC_FILETYPE__FILETYPE_IMAGE_BIF:
				setFiletypeImageBif((String)newValue);
				return;
			case LobjPackage.RESRC_FILETYPE__ID:
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
			case LobjPackage.RESRC_FILETYPE__FILETYPE_EXTENSION:
				setFiletypeExtension(FILETYPE_EXTENSION_EDEFAULT);
				return;
			case LobjPackage.RESRC_FILETYPE__FILETYPE_DESC:
				setFiletypeDesc(FILETYPE_DESC_EDEFAULT);
				return;
			case LobjPackage.RESRC_FILETYPE__IMAGE:
				setImage(IMAGE_EDEFAULT);
				return;
			case LobjPackage.RESRC_FILETYPE__APPLET:
				setApplet(APPLET_EDEFAULT);
				return;
			case LobjPackage.RESRC_FILETYPE__FILETYPE_IMAGE_SMALL:
				setFiletypeImageSmall(FILETYPE_IMAGE_SMALL_EDEFAULT);
				return;
			case LobjPackage.RESRC_FILETYPE__FILETYPE_IMAGE_BIF:
				setFiletypeImageBif(FILETYPE_IMAGE_BIF_EDEFAULT);
				return;
			case LobjPackage.RESRC_FILETYPE__ID:
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
			case LobjPackage.RESRC_FILETYPE__FILETYPE_EXTENSION:
				return FILETYPE_EXTENSION_EDEFAULT == null ? filetypeExtension != null : !FILETYPE_EXTENSION_EDEFAULT.equals(filetypeExtension);
			case LobjPackage.RESRC_FILETYPE__FILETYPE_DESC:
				return FILETYPE_DESC_EDEFAULT == null ? filetypeDesc != null : !FILETYPE_DESC_EDEFAULT.equals(filetypeDesc);
			case LobjPackage.RESRC_FILETYPE__IMAGE:
				return image != IMAGE_EDEFAULT;
			case LobjPackage.RESRC_FILETYPE__APPLET:
				return applet != APPLET_EDEFAULT;
			case LobjPackage.RESRC_FILETYPE__FILETYPE_IMAGE_SMALL:
				return FILETYPE_IMAGE_SMALL_EDEFAULT == null ? filetypeImageSmall != null : !FILETYPE_IMAGE_SMALL_EDEFAULT.equals(filetypeImageSmall);
			case LobjPackage.RESRC_FILETYPE__FILETYPE_IMAGE_BIF:
				return FILETYPE_IMAGE_BIF_EDEFAULT == null ? filetypeImageBif != null : !FILETYPE_IMAGE_BIF_EDEFAULT.equals(filetypeImageBif);
			case LobjPackage.RESRC_FILETYPE__ID:
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
		result.append(" (filetypeExtension: ");
		result.append(filetypeExtension);
		result.append(", filetypeDesc: ");
		result.append(filetypeDesc);
		result.append(", image: ");
		result.append(image);
		result.append(", applet: ");
		result.append(applet);
		result.append(", filetypeImageSmall: ");
		result.append(filetypeImageSmall);
		result.append(", filetypeImageBif: ");
		result.append(filetypeImageBif);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //ResrcFiletypeImpl

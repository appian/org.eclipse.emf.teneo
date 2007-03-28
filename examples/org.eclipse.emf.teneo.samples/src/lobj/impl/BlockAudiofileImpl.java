/**
 * <copyright>
 * </copyright>
 *
 * $Id: BlockAudiofileImpl.java,v 1.1 2007/03/28 13:57:00 mtaal Exp $
 */
package lobj.impl;

import lobj.BlockAudiofile;
import lobj.LobjPackage;
import lobj.ResrcFiletype;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Block Audiofile</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link lobj.impl.BlockAudiofileImpl#getFile <em>File</em>}</li>
 *   <li>{@link lobj.impl.BlockAudiofileImpl#getOriginalextension <em>Originalextension</em>}</li>
 *   <li>{@link lobj.impl.BlockAudiofileImpl#getFilesize <em>Filesize</em>}</li>
 *   <li>{@link lobj.impl.BlockAudiofileImpl#getResrcHref <em>Resrc Href</em>}</li>
 *   <li>{@link lobj.impl.BlockAudiofileImpl#getResrcFiletype <em>Resrc Filetype</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BlockAudiofileImpl extends LearningObjectImpl implements BlockAudiofile {
	/**
	 * The default value of the '{@link #getFile() <em>File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFile()
	 * @generated
	 * @ordered
	 */
	protected static final byte[] FILE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFile() <em>File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFile()
	 * @generated
	 * @ordered
	 */
	protected byte[] file = FILE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOriginalextension() <em>Originalextension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginalextension()
	 * @generated
	 * @ordered
	 */
	protected static final String ORIGINALEXTENSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOriginalextension() <em>Originalextension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginalextension()
	 * @generated
	 * @ordered
	 */
	protected String originalextension = ORIGINALEXTENSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getFilesize() <em>Filesize</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilesize()
	 * @generated
	 * @ordered
	 */
	protected static final int FILESIZE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getFilesize() <em>Filesize</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilesize()
	 * @generated
	 * @ordered
	 */
	protected int filesize = FILESIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getResrcHref() <em>Resrc Href</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResrcHref()
	 * @generated
	 * @ordered
	 */
	protected static final String RESRC_HREF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResrcHref() <em>Resrc Href</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResrcHref()
	 * @generated
	 * @ordered
	 */
	protected String resrcHref = RESRC_HREF_EDEFAULT;

	/**
	 * The cached value of the '{@link #getResrcFiletype() <em>Resrc Filetype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResrcFiletype()
	 * @generated
	 * @ordered
	 */
	protected ResrcFiletype resrcFiletype = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BlockAudiofileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return LobjPackage.Literals.BLOCK_AUDIOFILE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] getFile() {
		return file;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFile(byte[] newFile) {
		byte[] oldFile = file;
		file = newFile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LobjPackage.BLOCK_AUDIOFILE__FILE, oldFile, file));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOriginalextension() {
		return originalextension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOriginalextension(String newOriginalextension) {
		String oldOriginalextension = originalextension;
		originalextension = newOriginalextension;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LobjPackage.BLOCK_AUDIOFILE__ORIGINALEXTENSION, oldOriginalextension, originalextension));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getFilesize() {
		return filesize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFilesize(int newFilesize) {
		int oldFilesize = filesize;
		filesize = newFilesize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LobjPackage.BLOCK_AUDIOFILE__FILESIZE, oldFilesize, filesize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getResrcHref() {
		return resrcHref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResrcHref(String newResrcHref) {
		String oldResrcHref = resrcHref;
		resrcHref = newResrcHref;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LobjPackage.BLOCK_AUDIOFILE__RESRC_HREF, oldResrcHref, resrcHref));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResrcFiletype getResrcFiletype() {
		if (resrcFiletype != null && resrcFiletype.eIsProxy()) {
			InternalEObject oldResrcFiletype = (InternalEObject)resrcFiletype;
			resrcFiletype = (ResrcFiletype)eResolveProxy(oldResrcFiletype);
			if (resrcFiletype != oldResrcFiletype) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LobjPackage.BLOCK_AUDIOFILE__RESRC_FILETYPE, oldResrcFiletype, resrcFiletype));
			}
		}
		return resrcFiletype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResrcFiletype basicGetResrcFiletype() {
		return resrcFiletype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResrcFiletype(ResrcFiletype newResrcFiletype) {
		ResrcFiletype oldResrcFiletype = resrcFiletype;
		resrcFiletype = newResrcFiletype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LobjPackage.BLOCK_AUDIOFILE__RESRC_FILETYPE, oldResrcFiletype, resrcFiletype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LobjPackage.BLOCK_AUDIOFILE__FILE:
				return getFile();
			case LobjPackage.BLOCK_AUDIOFILE__ORIGINALEXTENSION:
				return getOriginalextension();
			case LobjPackage.BLOCK_AUDIOFILE__FILESIZE:
				return new Integer(getFilesize());
			case LobjPackage.BLOCK_AUDIOFILE__RESRC_HREF:
				return getResrcHref();
			case LobjPackage.BLOCK_AUDIOFILE__RESRC_FILETYPE:
				if (resolve) return getResrcFiletype();
				return basicGetResrcFiletype();
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
			case LobjPackage.BLOCK_AUDIOFILE__FILE:
				setFile((byte[])newValue);
				return;
			case LobjPackage.BLOCK_AUDIOFILE__ORIGINALEXTENSION:
				setOriginalextension((String)newValue);
				return;
			case LobjPackage.BLOCK_AUDIOFILE__FILESIZE:
				setFilesize(((Integer)newValue).intValue());
				return;
			case LobjPackage.BLOCK_AUDIOFILE__RESRC_HREF:
				setResrcHref((String)newValue);
				return;
			case LobjPackage.BLOCK_AUDIOFILE__RESRC_FILETYPE:
				setResrcFiletype((ResrcFiletype)newValue);
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
			case LobjPackage.BLOCK_AUDIOFILE__FILE:
				setFile(FILE_EDEFAULT);
				return;
			case LobjPackage.BLOCK_AUDIOFILE__ORIGINALEXTENSION:
				setOriginalextension(ORIGINALEXTENSION_EDEFAULT);
				return;
			case LobjPackage.BLOCK_AUDIOFILE__FILESIZE:
				setFilesize(FILESIZE_EDEFAULT);
				return;
			case LobjPackage.BLOCK_AUDIOFILE__RESRC_HREF:
				setResrcHref(RESRC_HREF_EDEFAULT);
				return;
			case LobjPackage.BLOCK_AUDIOFILE__RESRC_FILETYPE:
				setResrcFiletype((ResrcFiletype)null);
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
			case LobjPackage.BLOCK_AUDIOFILE__FILE:
				return FILE_EDEFAULT == null ? file != null : !FILE_EDEFAULT.equals(file);
			case LobjPackage.BLOCK_AUDIOFILE__ORIGINALEXTENSION:
				return ORIGINALEXTENSION_EDEFAULT == null ? originalextension != null : !ORIGINALEXTENSION_EDEFAULT.equals(originalextension);
			case LobjPackage.BLOCK_AUDIOFILE__FILESIZE:
				return filesize != FILESIZE_EDEFAULT;
			case LobjPackage.BLOCK_AUDIOFILE__RESRC_HREF:
				return RESRC_HREF_EDEFAULT == null ? resrcHref != null : !RESRC_HREF_EDEFAULT.equals(resrcHref);
			case LobjPackage.BLOCK_AUDIOFILE__RESRC_FILETYPE:
				return resrcFiletype != null;
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
		result.append(" (file: ");
		result.append(file);
		result.append(", originalextension: ");
		result.append(originalextension);
		result.append(", filesize: ");
		result.append(filesize);
		result.append(", resrcHref: ");
		result.append(resrcHref);
		result.append(')');
		return result.toString();
	}

} //BlockAudiofileImpl

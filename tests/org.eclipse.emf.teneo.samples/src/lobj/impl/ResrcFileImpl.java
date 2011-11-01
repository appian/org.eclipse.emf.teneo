/**
 * <copyright>
 * </copyright>
 *
 * $Id: ResrcFileImpl.java,v 1.3 2007/03/28 13:56:54 mtaal Exp $
 */
package lobj.impl;

import java.util.Collection;

import lobj.AccessControl;
import lobj.HypertextContent;
import lobj.LobjPackage;
import lobj.ResrcFile;
import lobj.ResrcFiletype;
import lobj.ResrcMeta;
import lobj.Source;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resrc File</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link lobj.impl.ResrcFileImpl#getFile <em>File</em>}</li>
 *   <li>{@link lobj.impl.ResrcFileImpl#getFile_tn <em>File tn</em>}</li>
 *   <li>{@link lobj.impl.ResrcFileImpl#getOriginalextension <em>Originalextension</em>}</li>
 *   <li>{@link lobj.impl.ResrcFileImpl#getFilesize <em>Filesize</em>}</li>
 *   <li>{@link lobj.impl.ResrcFileImpl#getResrcHref <em>Resrc Href</em>}</li>
 *   <li>{@link lobj.impl.ResrcFileImpl#getAccesscontrol <em>Accesscontrol</em>}</li>
 *   <li>{@link lobj.impl.ResrcFileImpl#getResrcFiletype <em>Resrc Filetype</em>}</li>
 *   <li>{@link lobj.impl.ResrcFileImpl#getSource <em>Source</em>}</li>
 *   <li>{@link lobj.impl.ResrcFileImpl#getHypertextContent <em>Hypertext Content</em>}</li>
 *   <li>{@link lobj.impl.ResrcFileImpl#getResrcMeta <em>Resrc Meta</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResrcFileImpl extends LearningObjectImpl implements ResrcFile {
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
	 * The default value of the '{@link #getFile_tn() <em>File tn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFile_tn()
	 * @generated
	 * @ordered
	 */
	protected static final byte[] FILE_TN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFile_tn() <em>File tn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFile_tn()
	 * @generated
	 * @ordered
	 */
	protected byte[] file_tn = FILE_TN_EDEFAULT;

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
	 * The cached value of the '{@link #getAccesscontrol() <em>Accesscontrol</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccesscontrol()
	 * @generated
	 * @ordered
	 */
	protected AccessControl accesscontrol = null;

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
	 * The cached value of the '{@link #getSource() <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected Source source = null;

	/**
	 * The cached value of the '{@link #getHypertextContent() <em>Hypertext Content</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHypertextContent()
	 * @generated
	 * @ordered
	 */
	protected EList hypertextContent = null;

	/**
	 * The cached value of the '{@link #getResrcMeta() <em>Resrc Meta</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResrcMeta()
	 * @generated
	 * @ordered
	 */
	protected ResrcMeta resrcMeta = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResrcFileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return LobjPackage.Literals.RESRC_FILE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, LobjPackage.RESRC_FILE__FILE, oldFile, file));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] getFile_tn() {
		return file_tn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFile_tn(byte[] newFile_tn) {
		byte[] oldFile_tn = file_tn;
		file_tn = newFile_tn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LobjPackage.RESRC_FILE__FILE_TN, oldFile_tn, file_tn));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LobjPackage.RESRC_FILE__ORIGINALEXTENSION, oldOriginalextension, originalextension));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LobjPackage.RESRC_FILE__FILESIZE, oldFilesize, filesize));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LobjPackage.RESRC_FILE__RESRC_HREF, oldResrcHref, resrcHref));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessControl getAccesscontrol() {
		return accesscontrol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAccesscontrol(AccessControl newAccesscontrol, NotificationChain msgs) {
		AccessControl oldAccesscontrol = accesscontrol;
		accesscontrol = newAccesscontrol;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LobjPackage.RESRC_FILE__ACCESSCONTROL, oldAccesscontrol, newAccesscontrol);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccesscontrol(AccessControl newAccesscontrol) {
		if (newAccesscontrol != accesscontrol) {
			NotificationChain msgs = null;
			if (accesscontrol != null)
				msgs = ((InternalEObject)accesscontrol).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LobjPackage.RESRC_FILE__ACCESSCONTROL, null, msgs);
			if (newAccesscontrol != null)
				msgs = ((InternalEObject)newAccesscontrol).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LobjPackage.RESRC_FILE__ACCESSCONTROL, null, msgs);
			msgs = basicSetAccesscontrol(newAccesscontrol, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LobjPackage.RESRC_FILE__ACCESSCONTROL, newAccesscontrol, newAccesscontrol));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LobjPackage.RESRC_FILE__RESRC_FILETYPE, oldResrcFiletype, resrcFiletype));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LobjPackage.RESRC_FILE__RESRC_FILETYPE, oldResrcFiletype, resrcFiletype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Source getSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(Source newSource, NotificationChain msgs) {
		Source oldSource = source;
		source = newSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LobjPackage.RESRC_FILE__SOURCE, oldSource, newSource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(Source newSource) {
		if (newSource != source) {
			NotificationChain msgs = null;
			if (source != null)
				msgs = ((InternalEObject)source).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LobjPackage.RESRC_FILE__SOURCE, null, msgs);
			if (newSource != null)
				msgs = ((InternalEObject)newSource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LobjPackage.RESRC_FILE__SOURCE, null, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LobjPackage.RESRC_FILE__SOURCE, newSource, newSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getHypertextContent() {
		if (hypertextContent == null) {
			hypertextContent = new EObjectWithInverseResolvingEList.ManyInverse(HypertextContent.class, this, LobjPackage.RESRC_FILE__HYPERTEXT_CONTENT, LobjPackage.HYPERTEXT_CONTENT__RESRC_FILE);
		}
		return hypertextContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResrcMeta getResrcMeta() {
		return resrcMeta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResrcMeta(ResrcMeta newResrcMeta, NotificationChain msgs) {
		ResrcMeta oldResrcMeta = resrcMeta;
		resrcMeta = newResrcMeta;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LobjPackage.RESRC_FILE__RESRC_META, oldResrcMeta, newResrcMeta);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResrcMeta(ResrcMeta newResrcMeta) {
		if (newResrcMeta != resrcMeta) {
			NotificationChain msgs = null;
			if (resrcMeta != null)
				msgs = ((InternalEObject)resrcMeta).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LobjPackage.RESRC_FILE__RESRC_META, null, msgs);
			if (newResrcMeta != null)
				msgs = ((InternalEObject)newResrcMeta).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LobjPackage.RESRC_FILE__RESRC_META, null, msgs);
			msgs = basicSetResrcMeta(newResrcMeta, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LobjPackage.RESRC_FILE__RESRC_META, newResrcMeta, newResrcMeta));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LobjPackage.RESRC_FILE__HYPERTEXT_CONTENT:
				return ((InternalEList)getHypertextContent()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LobjPackage.RESRC_FILE__ACCESSCONTROL:
				return basicSetAccesscontrol(null, msgs);
			case LobjPackage.RESRC_FILE__SOURCE:
				return basicSetSource(null, msgs);
			case LobjPackage.RESRC_FILE__HYPERTEXT_CONTENT:
				return ((InternalEList)getHypertextContent()).basicRemove(otherEnd, msgs);
			case LobjPackage.RESRC_FILE__RESRC_META:
				return basicSetResrcMeta(null, msgs);
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
			case LobjPackage.RESRC_FILE__FILE:
				return getFile();
			case LobjPackage.RESRC_FILE__FILE_TN:
				return getFile_tn();
			case LobjPackage.RESRC_FILE__ORIGINALEXTENSION:
				return getOriginalextension();
			case LobjPackage.RESRC_FILE__FILESIZE:
				return new Integer(getFilesize());
			case LobjPackage.RESRC_FILE__RESRC_HREF:
				return getResrcHref();
			case LobjPackage.RESRC_FILE__ACCESSCONTROL:
				return getAccesscontrol();
			case LobjPackage.RESRC_FILE__RESRC_FILETYPE:
				if (resolve) return getResrcFiletype();
				return basicGetResrcFiletype();
			case LobjPackage.RESRC_FILE__SOURCE:
				return getSource();
			case LobjPackage.RESRC_FILE__HYPERTEXT_CONTENT:
				return getHypertextContent();
			case LobjPackage.RESRC_FILE__RESRC_META:
				return getResrcMeta();
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
			case LobjPackage.RESRC_FILE__FILE:
				setFile((byte[])newValue);
				return;
			case LobjPackage.RESRC_FILE__FILE_TN:
				setFile_tn((byte[])newValue);
				return;
			case LobjPackage.RESRC_FILE__ORIGINALEXTENSION:
				setOriginalextension((String)newValue);
				return;
			case LobjPackage.RESRC_FILE__FILESIZE:
				setFilesize(((Integer)newValue).intValue());
				return;
			case LobjPackage.RESRC_FILE__RESRC_HREF:
				setResrcHref((String)newValue);
				return;
			case LobjPackage.RESRC_FILE__ACCESSCONTROL:
				setAccesscontrol((AccessControl)newValue);
				return;
			case LobjPackage.RESRC_FILE__RESRC_FILETYPE:
				setResrcFiletype((ResrcFiletype)newValue);
				return;
			case LobjPackage.RESRC_FILE__SOURCE:
				setSource((Source)newValue);
				return;
			case LobjPackage.RESRC_FILE__HYPERTEXT_CONTENT:
				getHypertextContent().clear();
				getHypertextContent().addAll((Collection)newValue);
				return;
			case LobjPackage.RESRC_FILE__RESRC_META:
				setResrcMeta((ResrcMeta)newValue);
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
			case LobjPackage.RESRC_FILE__FILE:
				setFile(FILE_EDEFAULT);
				return;
			case LobjPackage.RESRC_FILE__FILE_TN:
				setFile_tn(FILE_TN_EDEFAULT);
				return;
			case LobjPackage.RESRC_FILE__ORIGINALEXTENSION:
				setOriginalextension(ORIGINALEXTENSION_EDEFAULT);
				return;
			case LobjPackage.RESRC_FILE__FILESIZE:
				setFilesize(FILESIZE_EDEFAULT);
				return;
			case LobjPackage.RESRC_FILE__RESRC_HREF:
				setResrcHref(RESRC_HREF_EDEFAULT);
				return;
			case LobjPackage.RESRC_FILE__ACCESSCONTROL:
				setAccesscontrol((AccessControl)null);
				return;
			case LobjPackage.RESRC_FILE__RESRC_FILETYPE:
				setResrcFiletype((ResrcFiletype)null);
				return;
			case LobjPackage.RESRC_FILE__SOURCE:
				setSource((Source)null);
				return;
			case LobjPackage.RESRC_FILE__HYPERTEXT_CONTENT:
				getHypertextContent().clear();
				return;
			case LobjPackage.RESRC_FILE__RESRC_META:
				setResrcMeta((ResrcMeta)null);
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
			case LobjPackage.RESRC_FILE__FILE:
				return FILE_EDEFAULT == null ? file != null : !FILE_EDEFAULT.equals(file);
			case LobjPackage.RESRC_FILE__FILE_TN:
				return FILE_TN_EDEFAULT == null ? file_tn != null : !FILE_TN_EDEFAULT.equals(file_tn);
			case LobjPackage.RESRC_FILE__ORIGINALEXTENSION:
				return ORIGINALEXTENSION_EDEFAULT == null ? originalextension != null : !ORIGINALEXTENSION_EDEFAULT.equals(originalextension);
			case LobjPackage.RESRC_FILE__FILESIZE:
				return filesize != FILESIZE_EDEFAULT;
			case LobjPackage.RESRC_FILE__RESRC_HREF:
				return RESRC_HREF_EDEFAULT == null ? resrcHref != null : !RESRC_HREF_EDEFAULT.equals(resrcHref);
			case LobjPackage.RESRC_FILE__ACCESSCONTROL:
				return accesscontrol != null;
			case LobjPackage.RESRC_FILE__RESRC_FILETYPE:
				return resrcFiletype != null;
			case LobjPackage.RESRC_FILE__SOURCE:
				return source != null;
			case LobjPackage.RESRC_FILE__HYPERTEXT_CONTENT:
				return hypertextContent != null && !hypertextContent.isEmpty();
			case LobjPackage.RESRC_FILE__RESRC_META:
				return resrcMeta != null;
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
		result.append(", file_tn: ");
		result.append(file_tn);
		result.append(", originalextension: ");
		result.append(originalextension);
		result.append(", filesize: ");
		result.append(filesize);
		result.append(", resrcHref: ");
		result.append(resrcHref);
		result.append(')');
		return result.toString();
	}

} //ResrcFileImpl

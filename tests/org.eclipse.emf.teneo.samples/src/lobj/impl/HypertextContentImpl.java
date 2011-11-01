/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package lobj.impl;

import java.util.Collection;

import lobj.BlockAudiofile;
import lobj.HypertextContent;
import lobj.LobjPackage;
import lobj.ResrcFile;

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
 * An implementation of the model object '<em><b>Hypertext Content</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link lobj.impl.HypertextContentImpl#getContent <em>Content</em>}</li>
 *   <li>{@link lobj.impl.HypertextContentImpl#getBlockAudiofile <em>Block Audiofile</em>}</li>
 *   <li>{@link lobj.impl.HypertextContentImpl#getResrcFile <em>Resrc File</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HypertextContentImpl extends AbstractContentImpl implements HypertextContent {
	/**
	 * The default value of the '{@link #getContent() <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContent() <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected String content = CONTENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBlockAudiofile() <em>Block Audiofile</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlockAudiofile()
	 * @generated
	 * @ordered
	 */
	protected BlockAudiofile blockAudiofile;

	/**
	 * The cached value of the '{@link #getResrcFile() <em>Resrc File</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResrcFile()
	 * @generated
	 * @ordered
	 */
	protected EList resrcFile;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HypertextContentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return LobjPackage.Literals.HYPERTEXT_CONTENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContent() {
		return content;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContent(String newContent) {
		String oldContent = content;
		content = newContent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LobjPackage.HYPERTEXT_CONTENT__CONTENT, oldContent, content));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BlockAudiofile getBlockAudiofile() {
		return blockAudiofile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBlockAudiofile(BlockAudiofile newBlockAudiofile, NotificationChain msgs) {
		BlockAudiofile oldBlockAudiofile = blockAudiofile;
		blockAudiofile = newBlockAudiofile;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LobjPackage.HYPERTEXT_CONTENT__BLOCK_AUDIOFILE, oldBlockAudiofile, newBlockAudiofile);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBlockAudiofile(BlockAudiofile newBlockAudiofile) {
		if (newBlockAudiofile != blockAudiofile) {
			NotificationChain msgs = null;
			if (blockAudiofile != null)
				msgs = ((InternalEObject)blockAudiofile).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LobjPackage.HYPERTEXT_CONTENT__BLOCK_AUDIOFILE, null, msgs);
			if (newBlockAudiofile != null)
				msgs = ((InternalEObject)newBlockAudiofile).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LobjPackage.HYPERTEXT_CONTENT__BLOCK_AUDIOFILE, null, msgs);
			msgs = basicSetBlockAudiofile(newBlockAudiofile, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LobjPackage.HYPERTEXT_CONTENT__BLOCK_AUDIOFILE, newBlockAudiofile, newBlockAudiofile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getResrcFile() {
		if (resrcFile == null) {
			resrcFile = new EObjectWithInverseResolvingEList.ManyInverse(ResrcFile.class, this, LobjPackage.HYPERTEXT_CONTENT__RESRC_FILE, LobjPackage.RESRC_FILE__HYPERTEXT_CONTENT);
		}
		return resrcFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LobjPackage.HYPERTEXT_CONTENT__RESRC_FILE:
				return ((InternalEList)getResrcFile()).basicAdd(otherEnd, msgs);
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
			case LobjPackage.HYPERTEXT_CONTENT__BLOCK_AUDIOFILE:
				return basicSetBlockAudiofile(null, msgs);
			case LobjPackage.HYPERTEXT_CONTENT__RESRC_FILE:
				return ((InternalEList)getResrcFile()).basicRemove(otherEnd, msgs);
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
			case LobjPackage.HYPERTEXT_CONTENT__CONTENT:
				return getContent();
			case LobjPackage.HYPERTEXT_CONTENT__BLOCK_AUDIOFILE:
				return getBlockAudiofile();
			case LobjPackage.HYPERTEXT_CONTENT__RESRC_FILE:
				return getResrcFile();
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
			case LobjPackage.HYPERTEXT_CONTENT__CONTENT:
				setContent((String)newValue);
				return;
			case LobjPackage.HYPERTEXT_CONTENT__BLOCK_AUDIOFILE:
				setBlockAudiofile((BlockAudiofile)newValue);
				return;
			case LobjPackage.HYPERTEXT_CONTENT__RESRC_FILE:
				getResrcFile().clear();
				getResrcFile().addAll((Collection)newValue);
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
			case LobjPackage.HYPERTEXT_CONTENT__CONTENT:
				setContent(CONTENT_EDEFAULT);
				return;
			case LobjPackage.HYPERTEXT_CONTENT__BLOCK_AUDIOFILE:
				setBlockAudiofile((BlockAudiofile)null);
				return;
			case LobjPackage.HYPERTEXT_CONTENT__RESRC_FILE:
				getResrcFile().clear();
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
			case LobjPackage.HYPERTEXT_CONTENT__CONTENT:
				return CONTENT_EDEFAULT == null ? content != null : !CONTENT_EDEFAULT.equals(content);
			case LobjPackage.HYPERTEXT_CONTENT__BLOCK_AUDIOFILE:
				return blockAudiofile != null;
			case LobjPackage.HYPERTEXT_CONTENT__RESRC_FILE:
				return resrcFile != null && !resrcFile.isEmpty();
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
		result.append(" (content: ");
		result.append(content);
		result.append(')');
		return result.toString();
	}

} //HypertextContentImpl

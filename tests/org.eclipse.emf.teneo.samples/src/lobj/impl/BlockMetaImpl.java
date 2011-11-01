/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package lobj.impl;

import java.util.Collection;
import java.util.Date;

import lobj.BlockMeta;
import lobj.Blocktype;
import lobj.Language;
import lobj.LobjPackage;
import lobj.SimpleDidacMeta;

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
 * An implementation of the model object '<em><b>Block Meta</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link lobj.impl.BlockMetaImpl#getLod <em>Lod</em>}</li>
 *   <li>{@link lobj.impl.BlockMetaImpl#getRendering <em>Rendering</em>}</li>
 *   <li>{@link lobj.impl.BlockMetaImpl#getBlocktype <em>Blocktype</em>}</li>
 *   <li>{@link lobj.impl.BlockMetaImpl#getCreationDate <em>Creation Date</em>}</li>
 *   <li>{@link lobj.impl.BlockMetaImpl#getLastModified <em>Last Modified</em>}</li>
 *   <li>{@link lobj.impl.BlockMetaImpl#getSimpleDidacMeta <em>Simple Didac Meta</em>}</li>
 *   <li>{@link lobj.impl.BlockMetaImpl#getDefLang <em>Def Lang</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BlockMetaImpl extends LearningObjectImpl implements BlockMeta {
	/**
	 * The default value of the '{@link #getLod() <em>Lod</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLod()
	 * @generated
	 * @ordered
	 */
	protected static final int LOD_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLod() <em>Lod</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLod()
	 * @generated
	 * @ordered
	 */
	protected int lod = LOD_EDEFAULT;

	/**
	 * This is true if the Lod attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean lodESet;

	/**
	 * The default value of the '{@link #getRendering() <em>Rendering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRendering()
	 * @generated
	 * @ordered
	 */
	protected static final String RENDERING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRendering() <em>Rendering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRendering()
	 * @generated
	 * @ordered
	 */
	protected String rendering = RENDERING_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBlocktype() <em>Blocktype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlocktype()
	 * @generated
	 * @ordered
	 */
	protected Blocktype blocktype;

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
	 * The default value of the '{@link #getLastModified() <em>Last Modified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastModified()
	 * @generated
	 * @ordered
	 */
	protected static final Date LAST_MODIFIED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastModified() <em>Last Modified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastModified()
	 * @generated
	 * @ordered
	 */
	protected Date lastModified = LAST_MODIFIED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSimpleDidacMeta() <em>Simple Didac Meta</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimpleDidacMeta()
	 * @generated
	 * @ordered
	 */
	protected EList simpleDidacMeta;

	/**
	 * The cached value of the '{@link #getDefLang() <em>Def Lang</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefLang()
	 * @generated
	 * @ordered
	 */
	protected Language defLang;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BlockMetaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return LobjPackage.Literals.BLOCK_META;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLod() {
		return lod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLod(int newLod) {
		int oldLod = lod;
		lod = newLod;
		boolean oldLodESet = lodESet;
		lodESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LobjPackage.BLOCK_META__LOD, oldLod, lod, !oldLodESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLod() {
		int oldLod = lod;
		boolean oldLodESet = lodESet;
		lod = LOD_EDEFAULT;
		lodESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, LobjPackage.BLOCK_META__LOD, oldLod, LOD_EDEFAULT, oldLodESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLod() {
		return lodESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRendering() {
		return rendering;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRendering(String newRendering) {
		String oldRendering = rendering;
		rendering = newRendering;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LobjPackage.BLOCK_META__RENDERING, oldRendering, rendering));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Blocktype getBlocktype() {
		return blocktype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBlocktype(Blocktype newBlocktype) {
		Blocktype oldBlocktype = blocktype;
		blocktype = newBlocktype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LobjPackage.BLOCK_META__BLOCKTYPE, oldBlocktype, blocktype));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LobjPackage.BLOCK_META__CREATION_DATE, oldCreationDate, creationDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getLastModified() {
		return lastModified;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastModified(Date newLastModified) {
		Date oldLastModified = lastModified;
		lastModified = newLastModified;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LobjPackage.BLOCK_META__LAST_MODIFIED, oldLastModified, lastModified));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getSimpleDidacMeta() {
		if (simpleDidacMeta == null) {
			simpleDidacMeta = new EObjectContainmentEList(SimpleDidacMeta.class, this, LobjPackage.BLOCK_META__SIMPLE_DIDAC_META);
		}
		return simpleDidacMeta;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LobjPackage.BLOCK_META__DEF_LANG, oldDefLang, defLang));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LobjPackage.BLOCK_META__DEF_LANG, oldDefLang, defLang));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LobjPackage.BLOCK_META__SIMPLE_DIDAC_META:
				return ((InternalEList)getSimpleDidacMeta()).basicRemove(otherEnd, msgs);
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
			case LobjPackage.BLOCK_META__LOD:
				return new Integer(getLod());
			case LobjPackage.BLOCK_META__RENDERING:
				return getRendering();
			case LobjPackage.BLOCK_META__BLOCKTYPE:
				return getBlocktype();
			case LobjPackage.BLOCK_META__CREATION_DATE:
				return getCreationDate();
			case LobjPackage.BLOCK_META__LAST_MODIFIED:
				return getLastModified();
			case LobjPackage.BLOCK_META__SIMPLE_DIDAC_META:
				return getSimpleDidacMeta();
			case LobjPackage.BLOCK_META__DEF_LANG:
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
			case LobjPackage.BLOCK_META__LOD:
				setLod(((Integer)newValue).intValue());
				return;
			case LobjPackage.BLOCK_META__RENDERING:
				setRendering((String)newValue);
				return;
			case LobjPackage.BLOCK_META__BLOCKTYPE:
				setBlocktype((Blocktype)newValue);
				return;
			case LobjPackage.BLOCK_META__CREATION_DATE:
				setCreationDate((Date)newValue);
				return;
			case LobjPackage.BLOCK_META__LAST_MODIFIED:
				setLastModified((Date)newValue);
				return;
			case LobjPackage.BLOCK_META__SIMPLE_DIDAC_META:
				getSimpleDidacMeta().clear();
				getSimpleDidacMeta().addAll((Collection)newValue);
				return;
			case LobjPackage.BLOCK_META__DEF_LANG:
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
			case LobjPackage.BLOCK_META__LOD:
				unsetLod();
				return;
			case LobjPackage.BLOCK_META__RENDERING:
				setRendering(RENDERING_EDEFAULT);
				return;
			case LobjPackage.BLOCK_META__BLOCKTYPE:
				setBlocktype((Blocktype)null);
				return;
			case LobjPackage.BLOCK_META__CREATION_DATE:
				setCreationDate(CREATION_DATE_EDEFAULT);
				return;
			case LobjPackage.BLOCK_META__LAST_MODIFIED:
				setLastModified(LAST_MODIFIED_EDEFAULT);
				return;
			case LobjPackage.BLOCK_META__SIMPLE_DIDAC_META:
				getSimpleDidacMeta().clear();
				return;
			case LobjPackage.BLOCK_META__DEF_LANG:
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
			case LobjPackage.BLOCK_META__LOD:
				return isSetLod();
			case LobjPackage.BLOCK_META__RENDERING:
				return RENDERING_EDEFAULT == null ? rendering != null : !RENDERING_EDEFAULT.equals(rendering);
			case LobjPackage.BLOCK_META__BLOCKTYPE:
				return blocktype != null;
			case LobjPackage.BLOCK_META__CREATION_DATE:
				return CREATION_DATE_EDEFAULT == null ? creationDate != null : !CREATION_DATE_EDEFAULT.equals(creationDate);
			case LobjPackage.BLOCK_META__LAST_MODIFIED:
				return LAST_MODIFIED_EDEFAULT == null ? lastModified != null : !LAST_MODIFIED_EDEFAULT.equals(lastModified);
			case LobjPackage.BLOCK_META__SIMPLE_DIDAC_META:
				return simpleDidacMeta != null && !simpleDidacMeta.isEmpty();
			case LobjPackage.BLOCK_META__DEF_LANG:
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
		result.append(" (lod: ");
		if (lodESet) result.append(lod); else result.append("<unset>");
		result.append(", rendering: ");
		result.append(rendering);
		result.append(", creationDate: ");
		result.append(creationDate);
		result.append(", lastModified: ");
		result.append(lastModified);
		result.append(')');
		return result.toString();
	}

} //BlockMetaImpl

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package lobj.impl;

import lobj.Block;
import lobj.LobjPackage;
import lobj.PresentationBlock;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Presentation Block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link lobj.impl.PresentationBlockImpl#getLod <em>Lod</em>}</li>
 *   <li>{@link lobj.impl.PresentationBlockImpl#getRendering <em>Rendering</em>}</li>
 *   <li>{@link lobj.impl.PresentationBlockImpl#getBlock <em>Block</em>}</li>
 *   <li>{@link lobj.impl.PresentationBlockImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PresentationBlockImpl extends EObjectImpl implements PresentationBlock {
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
	 * The cached value of the '{@link #getBlock() <em>Block</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlock()
	 * @generated
	 * @ordered
	 */
	protected Block block;

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
	protected PresentationBlockImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return LobjPackage.Literals.PRESENTATION_BLOCK;
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
			eNotify(new ENotificationImpl(this, Notification.SET, LobjPackage.PRESENTATION_BLOCK__LOD, oldLod, lod, !oldLodESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, LobjPackage.PRESENTATION_BLOCK__LOD, oldLod, LOD_EDEFAULT, oldLodESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LobjPackage.PRESENTATION_BLOCK__RENDERING, oldRendering, rendering));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Block getBlock() {
		if (block != null && block.eIsProxy()) {
			InternalEObject oldBlock = (InternalEObject)block;
			block = (Block)eResolveProxy(oldBlock);
			if (block != oldBlock) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LobjPackage.PRESENTATION_BLOCK__BLOCK, oldBlock, block));
			}
		}
		return block;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Block basicGetBlock() {
		return block;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBlock(Block newBlock) {
		Block oldBlock = block;
		block = newBlock;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LobjPackage.PRESENTATION_BLOCK__BLOCK, oldBlock, block));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LobjPackage.PRESENTATION_BLOCK__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LobjPackage.PRESENTATION_BLOCK__LOD:
				return new Integer(getLod());
			case LobjPackage.PRESENTATION_BLOCK__RENDERING:
				return getRendering();
			case LobjPackage.PRESENTATION_BLOCK__BLOCK:
				if (resolve) return getBlock();
				return basicGetBlock();
			case LobjPackage.PRESENTATION_BLOCK__ID:
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
			case LobjPackage.PRESENTATION_BLOCK__LOD:
				setLod(((Integer)newValue).intValue());
				return;
			case LobjPackage.PRESENTATION_BLOCK__RENDERING:
				setRendering((String)newValue);
				return;
			case LobjPackage.PRESENTATION_BLOCK__BLOCK:
				setBlock((Block)newValue);
				return;
			case LobjPackage.PRESENTATION_BLOCK__ID:
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
			case LobjPackage.PRESENTATION_BLOCK__LOD:
				unsetLod();
				return;
			case LobjPackage.PRESENTATION_BLOCK__RENDERING:
				setRendering(RENDERING_EDEFAULT);
				return;
			case LobjPackage.PRESENTATION_BLOCK__BLOCK:
				setBlock((Block)null);
				return;
			case LobjPackage.PRESENTATION_BLOCK__ID:
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
			case LobjPackage.PRESENTATION_BLOCK__LOD:
				return isSetLod();
			case LobjPackage.PRESENTATION_BLOCK__RENDERING:
				return RENDERING_EDEFAULT == null ? rendering != null : !RENDERING_EDEFAULT.equals(rendering);
			case LobjPackage.PRESENTATION_BLOCK__BLOCK:
				return block != null;
			case LobjPackage.PRESENTATION_BLOCK__ID:
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
		result.append(" (lod: ");
		if (lodESet) result.append(lod); else result.append("<unset>");
		result.append(", rendering: ");
		result.append(rendering);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //PresentationBlockImpl

/**
 * <copyright>
 * </copyright>
 *
 * $Id: ActTypeImpl.java,v 1.2 2007/02/08 23:09:23 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.sample.play.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.emf.teneo.samples.emf.sample.play.ActType;
import org.eclipse.emf.teneo.samples.emf.sample.play.PlayPackage;
import org.eclipse.emf.teneo.samples.emf.sample.play.SceneType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Act Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.play.impl.ActTypeImpl#getScene <em>Scene</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.play.impl.ActTypeImpl#getPindex <em>Pindex</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.play.impl.ActTypeImpl#getTitle <em>Title</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActTypeImpl extends EObjectImpl implements ActType {
	/**
	 * The cached value of the '{@link #getScene() <em>Scene</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScene()
	 * @generated
	 * @ordered
	 */
	protected EList<SceneType> scene = null;

	/**
	 * The default value of the '{@link #getPindex() <em>Pindex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPindex()
	 * @generated
	 * @ordered
	 */
	protected static final byte PINDEX_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPindex() <em>Pindex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPindex()
	 * @generated
	 * @ordered
	 */
	protected byte pindex = PINDEX_EDEFAULT;

	/**
	 * This is true if the Pindex attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean pindexESet = false;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlayPackage.Literals.ACT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SceneType> getScene() {
		if (scene == null) {
			scene = new EObjectContainmentEList<SceneType>(SceneType.class, this, PlayPackage.ACT_TYPE__SCENE);
		}
		return scene;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte getPindex() {
		return pindex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPindex(byte newPindex) {
		byte oldPindex = pindex;
		pindex = newPindex;
		boolean oldPindexESet = pindexESet;
		pindexESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlayPackage.ACT_TYPE__PINDEX, oldPindex, pindex, !oldPindexESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPindex() {
		byte oldPindex = pindex;
		boolean oldPindexESet = pindexESet;
		pindex = PINDEX_EDEFAULT;
		pindexESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, PlayPackage.ACT_TYPE__PINDEX, oldPindex, PINDEX_EDEFAULT, oldPindexESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPindex() {
		return pindexESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PlayPackage.ACT_TYPE__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PlayPackage.ACT_TYPE__SCENE:
				return ((InternalEList<?>)getScene()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PlayPackage.ACT_TYPE__SCENE:
				return getScene();
			case PlayPackage.ACT_TYPE__PINDEX:
				return new Byte(getPindex());
			case PlayPackage.ACT_TYPE__TITLE:
				return getTitle();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PlayPackage.ACT_TYPE__SCENE:
				getScene().clear();
				getScene().addAll((Collection<? extends SceneType>)newValue);
				return;
			case PlayPackage.ACT_TYPE__PINDEX:
				setPindex(((Byte)newValue).byteValue());
				return;
			case PlayPackage.ACT_TYPE__TITLE:
				setTitle((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case PlayPackage.ACT_TYPE__SCENE:
				getScene().clear();
				return;
			case PlayPackage.ACT_TYPE__PINDEX:
				unsetPindex();
				return;
			case PlayPackage.ACT_TYPE__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PlayPackage.ACT_TYPE__SCENE:
				return scene != null && !scene.isEmpty();
			case PlayPackage.ACT_TYPE__PINDEX:
				return isSetPindex();
			case PlayPackage.ACT_TYPE__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (pindex: ");
		if (pindexESet) result.append(pindex); else result.append("<unset>");
		result.append(", title: ");
		result.append(title);
		result.append(')');
		return result.toString();
	}

} //ActTypeImpl

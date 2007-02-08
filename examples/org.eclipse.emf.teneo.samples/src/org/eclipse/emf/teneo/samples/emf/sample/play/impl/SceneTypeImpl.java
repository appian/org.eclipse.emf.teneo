/**
 * <copyright>
 * </copyright>
 *
 * $Id: SceneTypeImpl.java,v 1.2 2007/02/08 23:09:22 mtaal Exp $
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

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.emf.teneo.samples.emf.sample.play.PlayPackage;
import org.eclipse.emf.teneo.samples.emf.sample.play.SceneType;
import org.eclipse.emf.teneo.samples.emf.sample.play.SpeechType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scene Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.play.impl.SceneTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.play.impl.SceneTypeImpl#getStageDirections <em>Stage Directions</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.play.impl.SceneTypeImpl#getSpeech <em>Speech</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.play.impl.SceneTypeImpl#getPindex <em>Pindex</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.play.impl.SceneTypeImpl#getTitle <em>Title</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SceneTypeImpl extends EObjectImpl implements SceneType {
	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group = null;

	/**
	 * The default value of the '{@link #getPindex() <em>Pindex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPindex()
	 * @generated
	 * @ordered
	 */
	protected static final String PINDEX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPindex() <em>Pindex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPindex()
	 * @generated
	 * @ordered
	 */
	protected String pindex = PINDEX_EDEFAULT;

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
	protected SceneTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlayPackage.Literals.SCENE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, PlayPackage.SCENE_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getStageDirections() {
		return getGroup().list(PlayPackage.Literals.SCENE_TYPE__STAGE_DIRECTIONS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SpeechType> getSpeech() {
		return getGroup().list(PlayPackage.Literals.SCENE_TYPE__SPEECH);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPindex() {
		return pindex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPindex(String newPindex) {
		String oldPindex = pindex;
		pindex = newPindex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlayPackage.SCENE_TYPE__PINDEX, oldPindex, pindex));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PlayPackage.SCENE_TYPE__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PlayPackage.SCENE_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case PlayPackage.SCENE_TYPE__SPEECH:
				return ((InternalEList<?>)getSpeech()).basicRemove(otherEnd, msgs);
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
			case PlayPackage.SCENE_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case PlayPackage.SCENE_TYPE__STAGE_DIRECTIONS:
				return getStageDirections();
			case PlayPackage.SCENE_TYPE__SPEECH:
				return getSpeech();
			case PlayPackage.SCENE_TYPE__PINDEX:
				return getPindex();
			case PlayPackage.SCENE_TYPE__TITLE:
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
			case PlayPackage.SCENE_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case PlayPackage.SCENE_TYPE__STAGE_DIRECTIONS:
				getStageDirections().clear();
				getStageDirections().addAll((Collection<? extends String>)newValue);
				return;
			case PlayPackage.SCENE_TYPE__SPEECH:
				getSpeech().clear();
				getSpeech().addAll((Collection<? extends SpeechType>)newValue);
				return;
			case PlayPackage.SCENE_TYPE__PINDEX:
				setPindex((String)newValue);
				return;
			case PlayPackage.SCENE_TYPE__TITLE:
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
			case PlayPackage.SCENE_TYPE__GROUP:
				getGroup().clear();
				return;
			case PlayPackage.SCENE_TYPE__STAGE_DIRECTIONS:
				getStageDirections().clear();
				return;
			case PlayPackage.SCENE_TYPE__SPEECH:
				getSpeech().clear();
				return;
			case PlayPackage.SCENE_TYPE__PINDEX:
				setPindex(PINDEX_EDEFAULT);
				return;
			case PlayPackage.SCENE_TYPE__TITLE:
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
			case PlayPackage.SCENE_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case PlayPackage.SCENE_TYPE__STAGE_DIRECTIONS:
				return !getStageDirections().isEmpty();
			case PlayPackage.SCENE_TYPE__SPEECH:
				return !getSpeech().isEmpty();
			case PlayPackage.SCENE_TYPE__PINDEX:
				return PINDEX_EDEFAULT == null ? pindex != null : !PINDEX_EDEFAULT.equals(pindex);
			case PlayPackage.SCENE_TYPE__TITLE:
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
		result.append(" (group: ");
		result.append(group);
		result.append(", pindex: ");
		result.append(pindex);
		result.append(", title: ");
		result.append(title);
		result.append(')');
		return result.toString();
	}

} //SceneTypeImpl

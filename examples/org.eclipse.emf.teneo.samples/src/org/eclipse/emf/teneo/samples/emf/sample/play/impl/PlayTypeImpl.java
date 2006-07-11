/**
 * <copyright>
 * </copyright>
 *
 * $Id: PlayTypeImpl.java,v 1.1 2006/07/11 16:57:07 mtaal Exp $
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
import org.eclipse.emf.teneo.samples.emf.sample.play.FmType;
import org.eclipse.emf.teneo.samples.emf.sample.play.PersonaeType;
import org.eclipse.emf.teneo.samples.emf.sample.play.PlayPackage;
import org.eclipse.emf.teneo.samples.emf.sample.play.PlayType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.play.impl.PlayTypeImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.play.impl.PlayTypeImpl#getFm <em>Fm</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.play.impl.PlayTypeImpl#getPersonae <em>Personae</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.play.impl.PlayTypeImpl#getSceneDescription <em>Scene Description</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.play.impl.PlayTypeImpl#getPlaySubTitle <em>Play Sub Title</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.play.impl.PlayTypeImpl#getAct <em>Act</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PlayTypeImpl extends EObjectImpl implements PlayType {
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
	 * The cached value of the '{@link #getFm() <em>Fm</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFm()
	 * @generated
	 * @ordered
	 */
	protected FmType fm = null;

	/**
	 * The cached value of the '{@link #getPersonae() <em>Personae</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonae()
	 * @generated
	 * @ordered
	 */
	protected PersonaeType personae = null;

	/**
	 * The default value of the '{@link #getSceneDescription() <em>Scene Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSceneDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String SCENE_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSceneDescription() <em>Scene Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSceneDescription()
	 * @generated
	 * @ordered
	 */
	protected String sceneDescription = SCENE_DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getPlaySubTitle() <em>Play Sub Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlaySubTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String PLAY_SUB_TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPlaySubTitle() <em>Play Sub Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlaySubTitle()
	 * @generated
	 * @ordered
	 */
	protected String playSubTitle = PLAY_SUB_TITLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAct() <em>Act</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAct()
	 * @generated
	 * @ordered
	 */
	protected EList act = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlayTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return PlayPackage.eINSTANCE.getPlayType();
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
			eNotify(new ENotificationImpl(this, Notification.SET, PlayPackage.PLAY_TYPE__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FmType getFm() {
		return fm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFm(FmType newFm, NotificationChain msgs) {
		FmType oldFm = fm;
		fm = newFm;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PlayPackage.PLAY_TYPE__FM, oldFm, newFm);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFm(FmType newFm) {
		if (newFm != fm) {
			NotificationChain msgs = null;
			if (fm != null)
				msgs = ((InternalEObject)fm).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PlayPackage.PLAY_TYPE__FM, null, msgs);
			if (newFm != null)
				msgs = ((InternalEObject)newFm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PlayPackage.PLAY_TYPE__FM, null, msgs);
			msgs = basicSetFm(newFm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlayPackage.PLAY_TYPE__FM, newFm, newFm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersonaeType getPersonae() {
		return personae;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPersonae(PersonaeType newPersonae, NotificationChain msgs) {
		PersonaeType oldPersonae = personae;
		personae = newPersonae;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PlayPackage.PLAY_TYPE__PERSONAE, oldPersonae, newPersonae);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPersonae(PersonaeType newPersonae) {
		if (newPersonae != personae) {
			NotificationChain msgs = null;
			if (personae != null)
				msgs = ((InternalEObject)personae).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PlayPackage.PLAY_TYPE__PERSONAE, null, msgs);
			if (newPersonae != null)
				msgs = ((InternalEObject)newPersonae).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PlayPackage.PLAY_TYPE__PERSONAE, null, msgs);
			msgs = basicSetPersonae(newPersonae, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlayPackage.PLAY_TYPE__PERSONAE, newPersonae, newPersonae));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSceneDescription() {
		return sceneDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSceneDescription(String newSceneDescription) {
		String oldSceneDescription = sceneDescription;
		sceneDescription = newSceneDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlayPackage.PLAY_TYPE__SCENE_DESCRIPTION, oldSceneDescription, sceneDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPlaySubTitle() {
		return playSubTitle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlaySubTitle(String newPlaySubTitle) {
		String oldPlaySubTitle = playSubTitle;
		playSubTitle = newPlaySubTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlayPackage.PLAY_TYPE__PLAY_SUB_TITLE, oldPlaySubTitle, playSubTitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getAct() {
		if (act == null) {
			act = new EObjectContainmentEList(ActType.class, this, PlayPackage.PLAY_TYPE__ACT);
		}
		return act;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case PlayPackage.PLAY_TYPE__FM:
					return basicSetFm(null, msgs);
				case PlayPackage.PLAY_TYPE__PERSONAE:
					return basicSetPersonae(null, msgs);
				case PlayPackage.PLAY_TYPE__ACT:
					return ((InternalEList)getAct()).basicRemove(otherEnd, msgs);
				default:
					return eDynamicInverseRemove(otherEnd, featureID, baseClass, msgs);
			}
		}
		return eBasicSetContainer(null, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case PlayPackage.PLAY_TYPE__TITLE:
				return getTitle();
			case PlayPackage.PLAY_TYPE__FM:
				return getFm();
			case PlayPackage.PLAY_TYPE__PERSONAE:
				return getPersonae();
			case PlayPackage.PLAY_TYPE__SCENE_DESCRIPTION:
				return getSceneDescription();
			case PlayPackage.PLAY_TYPE__PLAY_SUB_TITLE:
				return getPlaySubTitle();
			case PlayPackage.PLAY_TYPE__ACT:
				return getAct();
		}
		return eDynamicGet(eFeature, resolve);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(EStructuralFeature eFeature, Object newValue) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case PlayPackage.PLAY_TYPE__TITLE:
				setTitle((String)newValue);
				return;
			case PlayPackage.PLAY_TYPE__FM:
				setFm((FmType)newValue);
				return;
			case PlayPackage.PLAY_TYPE__PERSONAE:
				setPersonae((PersonaeType)newValue);
				return;
			case PlayPackage.PLAY_TYPE__SCENE_DESCRIPTION:
				setSceneDescription((String)newValue);
				return;
			case PlayPackage.PLAY_TYPE__PLAY_SUB_TITLE:
				setPlaySubTitle((String)newValue);
				return;
			case PlayPackage.PLAY_TYPE__ACT:
				getAct().clear();
				getAct().addAll((Collection)newValue);
				return;
		}
		eDynamicSet(eFeature, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case PlayPackage.PLAY_TYPE__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case PlayPackage.PLAY_TYPE__FM:
				setFm((FmType)null);
				return;
			case PlayPackage.PLAY_TYPE__PERSONAE:
				setPersonae((PersonaeType)null);
				return;
			case PlayPackage.PLAY_TYPE__SCENE_DESCRIPTION:
				setSceneDescription(SCENE_DESCRIPTION_EDEFAULT);
				return;
			case PlayPackage.PLAY_TYPE__PLAY_SUB_TITLE:
				setPlaySubTitle(PLAY_SUB_TITLE_EDEFAULT);
				return;
			case PlayPackage.PLAY_TYPE__ACT:
				getAct().clear();
				return;
		}
		eDynamicUnset(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case PlayPackage.PLAY_TYPE__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case PlayPackage.PLAY_TYPE__FM:
				return fm != null;
			case PlayPackage.PLAY_TYPE__PERSONAE:
				return personae != null;
			case PlayPackage.PLAY_TYPE__SCENE_DESCRIPTION:
				return SCENE_DESCRIPTION_EDEFAULT == null ? sceneDescription != null : !SCENE_DESCRIPTION_EDEFAULT.equals(sceneDescription);
			case PlayPackage.PLAY_TYPE__PLAY_SUB_TITLE:
				return PLAY_SUB_TITLE_EDEFAULT == null ? playSubTitle != null : !PLAY_SUB_TITLE_EDEFAULT.equals(playSubTitle);
			case PlayPackage.PLAY_TYPE__ACT:
				return act != null && !act.isEmpty();
		}
		return eDynamicIsSet(eFeature);
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
		result.append(", sceneDescription: ");
		result.append(sceneDescription);
		result.append(", playSubTitle: ");
		result.append(playSubTitle);
		result.append(')');
		return result.toString();
	}

} //PlayTypeImpl

/**
 * <copyright>
 * </copyright>
 *
 * $Id: SpeechTypeImpl.java,v 1.1 2006/07/11 16:57:07 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.sample.play.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.emf.teneo.samples.emf.sample.play.PlayPackage;
import org.eclipse.emf.teneo.samples.emf.sample.play.SpeechType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Speech Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.play.impl.SpeechTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.play.impl.SpeechTypeImpl#getSpeaker <em>Speaker</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.play.impl.SpeechTypeImpl#getLine <em>Line</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.play.impl.SpeechTypeImpl#getStageDirections <em>Stage Directions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SpeechTypeImpl extends EObjectImpl implements SpeechType {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpeechTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return PlayPackage.eINSTANCE.getSpeechType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, PlayPackage.SPEECH_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getSpeaker() {
		return ((FeatureMap)getGroup()).list(PlayPackage.eINSTANCE.getSpeechType_Speaker());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getLine() {
		return ((FeatureMap)getGroup()).list(PlayPackage.eINSTANCE.getSpeechType_Line());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getStageDirections() {
		return ((FeatureMap)getGroup()).list(PlayPackage.eINSTANCE.getSpeechType_StageDirections());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case PlayPackage.SPEECH_TYPE__GROUP:
					return ((InternalEList)getGroup()).basicRemove(otherEnd, msgs);
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
			case PlayPackage.SPEECH_TYPE__GROUP:
				return getGroup();
			case PlayPackage.SPEECH_TYPE__SPEAKER:
				return getSpeaker();
			case PlayPackage.SPEECH_TYPE__LINE:
				return getLine();
			case PlayPackage.SPEECH_TYPE__STAGE_DIRECTIONS:
				return getStageDirections();
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
			case PlayPackage.SPEECH_TYPE__GROUP:
				getGroup().clear();
				getGroup().addAll((Collection)newValue);
				return;
			case PlayPackage.SPEECH_TYPE__SPEAKER:
				getSpeaker().clear();
				getSpeaker().addAll((Collection)newValue);
				return;
			case PlayPackage.SPEECH_TYPE__LINE:
				getLine().clear();
				getLine().addAll((Collection)newValue);
				return;
			case PlayPackage.SPEECH_TYPE__STAGE_DIRECTIONS:
				getStageDirections().clear();
				getStageDirections().addAll((Collection)newValue);
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
			case PlayPackage.SPEECH_TYPE__GROUP:
				getGroup().clear();
				return;
			case PlayPackage.SPEECH_TYPE__SPEAKER:
				getSpeaker().clear();
				return;
			case PlayPackage.SPEECH_TYPE__LINE:
				getLine().clear();
				return;
			case PlayPackage.SPEECH_TYPE__STAGE_DIRECTIONS:
				getStageDirections().clear();
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
			case PlayPackage.SPEECH_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case PlayPackage.SPEECH_TYPE__SPEAKER:
				return !getSpeaker().isEmpty();
			case PlayPackage.SPEECH_TYPE__LINE:
				return !getLine().isEmpty();
			case PlayPackage.SPEECH_TYPE__STAGE_DIRECTIONS:
				return !getStageDirections().isEmpty();
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
		result.append(" (group: ");
		result.append(group);
		result.append(')');
		return result.toString();
	}

} //SpeechTypeImpl

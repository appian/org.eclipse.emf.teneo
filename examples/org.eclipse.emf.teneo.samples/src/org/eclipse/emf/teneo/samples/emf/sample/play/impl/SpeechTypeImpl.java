/**
 * <copyright>
 * </copyright>
 *
 * $Id: SpeechTypeImpl.java,v 1.2 2007/02/08 23:09:23 mtaal Exp $
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
	@Override
	protected EClass eStaticClass() {
		return PlayPackage.Literals.SPEECH_TYPE;
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
	public EList<String> getSpeaker() {
		return getGroup().list(PlayPackage.Literals.SPEECH_TYPE__SPEAKER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getLine() {
		return getGroup().list(PlayPackage.Literals.SPEECH_TYPE__LINE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getStageDirections() {
		return getGroup().list(PlayPackage.Literals.SPEECH_TYPE__STAGE_DIRECTIONS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PlayPackage.SPEECH_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
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
			case PlayPackage.SPEECH_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case PlayPackage.SPEECH_TYPE__SPEAKER:
				return getSpeaker();
			case PlayPackage.SPEECH_TYPE__LINE:
				return getLine();
			case PlayPackage.SPEECH_TYPE__STAGE_DIRECTIONS:
				return getStageDirections();
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
			case PlayPackage.SPEECH_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case PlayPackage.SPEECH_TYPE__SPEAKER:
				getSpeaker().clear();
				getSpeaker().addAll((Collection<? extends String>)newValue);
				return;
			case PlayPackage.SPEECH_TYPE__LINE:
				getLine().clear();
				getLine().addAll((Collection<? extends String>)newValue);
				return;
			case PlayPackage.SPEECH_TYPE__STAGE_DIRECTIONS:
				getStageDirections().clear();
				getStageDirections().addAll((Collection<? extends String>)newValue);
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
			case PlayPackage.SPEECH_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case PlayPackage.SPEECH_TYPE__SPEAKER:
				return !getSpeaker().isEmpty();
			case PlayPackage.SPEECH_TYPE__LINE:
				return !getLine().isEmpty();
			case PlayPackage.SPEECH_TYPE__STAGE_DIRECTIONS:
				return !getStageDirections().isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //SpeechTypeImpl

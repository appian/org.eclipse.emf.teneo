/**
 * <copyright>
 * </copyright>
 *
 * $Id: PersonaGroupTypeImpl.java,v 1.1 2006/07/11 16:57:07 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.sample.play.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.eclipse.emf.teneo.samples.emf.sample.play.PersonaGroupType;
import org.eclipse.emf.teneo.samples.emf.sample.play.PlayPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Persona Group Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.play.impl.PersonaGroupTypeImpl#getPersona <em>Persona</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.play.impl.PersonaGroupTypeImpl#getGroupDescription <em>Group Description</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PersonaGroupTypeImpl extends EObjectImpl implements PersonaGroupType {
	/**
	 * The cached value of the '{@link #getPersona() <em>Persona</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersona()
	 * @generated
	 * @ordered
	 */
	protected EList persona = null;

	/**
	 * The default value of the '{@link #getGroupDescription() <em>Group Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String GROUP_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGroupDescription() <em>Group Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupDescription()
	 * @generated
	 * @ordered
	 */
	protected String groupDescription = GROUP_DESCRIPTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersonaGroupTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return PlayPackage.eINSTANCE.getPersonaGroupType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getPersona() {
		if (persona == null) {
			persona = new EDataTypeEList(String.class, this, PlayPackage.PERSONA_GROUP_TYPE__PERSONA);
		}
		return persona;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGroupDescription() {
		return groupDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroupDescription(String newGroupDescription) {
		String oldGroupDescription = groupDescription;
		groupDescription = newGroupDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlayPackage.PERSONA_GROUP_TYPE__GROUP_DESCRIPTION, oldGroupDescription, groupDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case PlayPackage.PERSONA_GROUP_TYPE__PERSONA:
				return getPersona();
			case PlayPackage.PERSONA_GROUP_TYPE__GROUP_DESCRIPTION:
				return getGroupDescription();
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
			case PlayPackage.PERSONA_GROUP_TYPE__PERSONA:
				getPersona().clear();
				getPersona().addAll((Collection)newValue);
				return;
			case PlayPackage.PERSONA_GROUP_TYPE__GROUP_DESCRIPTION:
				setGroupDescription((String)newValue);
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
			case PlayPackage.PERSONA_GROUP_TYPE__PERSONA:
				getPersona().clear();
				return;
			case PlayPackage.PERSONA_GROUP_TYPE__GROUP_DESCRIPTION:
				setGroupDescription(GROUP_DESCRIPTION_EDEFAULT);
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
			case PlayPackage.PERSONA_GROUP_TYPE__PERSONA:
				return persona != null && !persona.isEmpty();
			case PlayPackage.PERSONA_GROUP_TYPE__GROUP_DESCRIPTION:
				return GROUP_DESCRIPTION_EDEFAULT == null ? groupDescription != null : !GROUP_DESCRIPTION_EDEFAULT.equals(groupDescription);
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
		result.append(" (persona: ");
		result.append(persona);
		result.append(", groupDescription: ");
		result.append(groupDescription);
		result.append(')');
		return result.toString();
	}

} //PersonaGroupTypeImpl

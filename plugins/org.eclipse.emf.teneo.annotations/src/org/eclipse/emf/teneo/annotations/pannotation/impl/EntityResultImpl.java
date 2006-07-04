/**
 * <copyright>
 * </copyright>
 *
 * $Id: EntityResultImpl.java,v 1.1 2006/07/04 21:37:03 mtaal Exp $
 */
package org.eclipse.emf.teneo.annotations.pannotation.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.teneo.annotations.pannotation.EntityResult;
import org.eclipse.emf.teneo.annotations.pannotation.FieldResult;
import org.eclipse.emf.teneo.annotations.pannotation.PannotationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity Result</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.annotations.pannotation.impl.EntityResultImpl#getEModelElement <em>EModel Element</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.annotations.pannotation.impl.EntityResultImpl#getEntityClass <em>Entity Class</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.annotations.pannotation.impl.EntityResultImpl#getFields <em>Fields</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.annotations.pannotation.impl.EntityResultImpl#getDiscriminatorColumn <em>Discriminator Column</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EntityResultImpl extends EObjectImpl implements EntityResult {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright 2004-2006, Elver.org (http://www.eclipse.org/emf/teneo).\nLicensed under the Apache License, Version 2.0 (the \"License\");\n\nyou may not use this file except in compliance with the License.\nYou may obtain a copy of the License at\nhttp://www.apache.org/licenses/LICENSE-2.0\nUnless required by applicable law or agreed to in writing, software\ndistributed under the License is distributed on an \"AS IS\" BASIS,\nWITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.\nSee the License for the specific language governing permissions and\nlimitations under the License.";

	/**
	 * The cached value of the '{@link #getEModelElement() <em>EModel Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEModelElement()
	 * @generated
	 * @ordered
	 */
	protected EModelElement eModelElement = null;

	/**
	 * The default value of the '{@link #getEntityClass() <em>Entity Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntityClass()
	 * @generated
	 * @ordered
	 */
	protected static final String ENTITY_CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEntityClass() <em>Entity Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntityClass()
	 * @generated
	 * @ordered
	 */
	protected String entityClass = ENTITY_CLASS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFields() <em>Fields</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFields()
	 * @generated
	 * @ordered
	 */
	protected EList fields = null;

	/**
	 * The default value of the '{@link #getDiscriminatorColumn() <em>Discriminator Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscriminatorColumn()
	 * @generated
	 * @ordered
	 */
	protected static final String DISCRIMINATOR_COLUMN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDiscriminatorColumn() <em>Discriminator Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscriminatorColumn()
	 * @generated
	 * @ordered
	 */
	protected String discriminatorColumn = DISCRIMINATOR_COLUMN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntityResultImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return PannotationPackage.eINSTANCE.getEntityResult();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EModelElement getEModelElement() {
		if (eModelElement != null && eModelElement.eIsProxy()) {
			EModelElement oldEModelElement = eModelElement;
			eModelElement = (EModelElement)eResolveProxy((InternalEObject)eModelElement);
			if (eModelElement != oldEModelElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PannotationPackage.ENTITY_RESULT__EMODEL_ELEMENT, oldEModelElement, eModelElement));
			}
		}
		return eModelElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EModelElement basicGetEModelElement() {
		return eModelElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEModelElement(EModelElement newEModelElement) {
		EModelElement oldEModelElement = eModelElement;
		eModelElement = newEModelElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PannotationPackage.ENTITY_RESULT__EMODEL_ELEMENT, oldEModelElement, eModelElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEntityClass() {
		return entityClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntityClass(String newEntityClass) {
		String oldEntityClass = entityClass;
		entityClass = newEntityClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PannotationPackage.ENTITY_RESULT__ENTITY_CLASS, oldEntityClass, entityClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getFields() {
		if (fields == null) {
			fields = new EObjectContainmentEList(FieldResult.class, this, PannotationPackage.ENTITY_RESULT__FIELDS);
		}
		return fields;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDiscriminatorColumn() {
		return discriminatorColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiscriminatorColumn(String newDiscriminatorColumn) {
		String oldDiscriminatorColumn = discriminatorColumn;
		discriminatorColumn = newDiscriminatorColumn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PannotationPackage.ENTITY_RESULT__DISCRIMINATOR_COLUMN, oldDiscriminatorColumn, discriminatorColumn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case PannotationPackage.ENTITY_RESULT__FIELDS:
					return ((InternalEList)getFields()).basicRemove(otherEnd, msgs);
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
			case PannotationPackage.ENTITY_RESULT__EMODEL_ELEMENT:
				if (resolve) return getEModelElement();
				return basicGetEModelElement();
			case PannotationPackage.ENTITY_RESULT__ENTITY_CLASS:
				return getEntityClass();
			case PannotationPackage.ENTITY_RESULT__FIELDS:
				return getFields();
			case PannotationPackage.ENTITY_RESULT__DISCRIMINATOR_COLUMN:
				return getDiscriminatorColumn();
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
			case PannotationPackage.ENTITY_RESULT__EMODEL_ELEMENT:
				setEModelElement((EModelElement)newValue);
				return;
			case PannotationPackage.ENTITY_RESULT__ENTITY_CLASS:
				setEntityClass((String)newValue);
				return;
			case PannotationPackage.ENTITY_RESULT__FIELDS:
				getFields().clear();
				getFields().addAll((Collection)newValue);
				return;
			case PannotationPackage.ENTITY_RESULT__DISCRIMINATOR_COLUMN:
				setDiscriminatorColumn((String)newValue);
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
			case PannotationPackage.ENTITY_RESULT__EMODEL_ELEMENT:
				setEModelElement((EModelElement)null);
				return;
			case PannotationPackage.ENTITY_RESULT__ENTITY_CLASS:
				setEntityClass(ENTITY_CLASS_EDEFAULT);
				return;
			case PannotationPackage.ENTITY_RESULT__FIELDS:
				getFields().clear();
				return;
			case PannotationPackage.ENTITY_RESULT__DISCRIMINATOR_COLUMN:
				setDiscriminatorColumn(DISCRIMINATOR_COLUMN_EDEFAULT);
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
			case PannotationPackage.ENTITY_RESULT__EMODEL_ELEMENT:
				return eModelElement != null;
			case PannotationPackage.ENTITY_RESULT__ENTITY_CLASS:
				return ENTITY_CLASS_EDEFAULT == null ? entityClass != null : !ENTITY_CLASS_EDEFAULT.equals(entityClass);
			case PannotationPackage.ENTITY_RESULT__FIELDS:
				return fields != null && !fields.isEmpty();
			case PannotationPackage.ENTITY_RESULT__DISCRIMINATOR_COLUMN:
				return DISCRIMINATOR_COLUMN_EDEFAULT == null ? discriminatorColumn != null : !DISCRIMINATOR_COLUMN_EDEFAULT.equals(discriminatorColumn);
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
		result.append(" (entityClass: ");
		result.append(entityClass);
		result.append(", discriminatorColumn: ");
		result.append(discriminatorColumn);
		result.append(')');
		return result.toString();
	}

} //EntityResultImpl

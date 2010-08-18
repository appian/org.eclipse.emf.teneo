/**
 * <copyright>
 * </copyright>
 *
 * $Id: CompositeMapKeyImpl.java,v 1.1 2010/08/18 09:21:38 cbouhier Exp $
 */
package org.eclipse.emf.teneo.db2m.hbm30.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.emf.teneo.db2m.hbm30.CompositeMapKey;
import org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package;
import org.eclipse.emf.teneo.db2m.hbm30.KeyManyToOne;
import org.eclipse.emf.teneo.db2m.hbm30.KeyProperty;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composite Map Key</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.CompositeMapKeyImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.CompositeMapKeyImpl#getKeyProperty <em>Key Property</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.CompositeMapKeyImpl#getKeyManyToOne <em>Key Many To One</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.CompositeMapKeyImpl#getClass_ <em>Class</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CompositeMapKeyImpl extends EObjectImpl implements CompositeMapKey {
	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group;

	/**
	 * The default value of the '{@link #getClass_() <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected static final String CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClass_() <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected String class_ = CLASS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositeMapKeyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Hbm30Package.eINSTANCE.getCompositeMapKey();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, Hbm30Package.COMPOSITE_MAP_KEY__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<KeyProperty> getKeyProperty() {
		return getGroup().list(Hbm30Package.eINSTANCE.getCompositeMapKey_KeyProperty());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<KeyManyToOne> getKeyManyToOne() {
		return getGroup().list(Hbm30Package.eINSTANCE.getCompositeMapKey_KeyManyToOne());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClass_() {
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClass(String newClass) {
		String oldClass = class_;
		class_ = newClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.COMPOSITE_MAP_KEY__CLASS, oldClass, class_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Hbm30Package.COMPOSITE_MAP_KEY__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case Hbm30Package.COMPOSITE_MAP_KEY__KEY_PROPERTY:
				return ((InternalEList<?>)getKeyProperty()).basicRemove(otherEnd, msgs);
			case Hbm30Package.COMPOSITE_MAP_KEY__KEY_MANY_TO_ONE:
				return ((InternalEList<?>)getKeyManyToOne()).basicRemove(otherEnd, msgs);
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
			case Hbm30Package.COMPOSITE_MAP_KEY__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case Hbm30Package.COMPOSITE_MAP_KEY__KEY_PROPERTY:
				return getKeyProperty();
			case Hbm30Package.COMPOSITE_MAP_KEY__KEY_MANY_TO_ONE:
				return getKeyManyToOne();
			case Hbm30Package.COMPOSITE_MAP_KEY__CLASS:
				return getClass_();
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
			case Hbm30Package.COMPOSITE_MAP_KEY__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case Hbm30Package.COMPOSITE_MAP_KEY__KEY_PROPERTY:
				getKeyProperty().clear();
				getKeyProperty().addAll((Collection<? extends KeyProperty>)newValue);
				return;
			case Hbm30Package.COMPOSITE_MAP_KEY__KEY_MANY_TO_ONE:
				getKeyManyToOne().clear();
				getKeyManyToOne().addAll((Collection<? extends KeyManyToOne>)newValue);
				return;
			case Hbm30Package.COMPOSITE_MAP_KEY__CLASS:
				setClass((String)newValue);
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
			case Hbm30Package.COMPOSITE_MAP_KEY__GROUP:
				getGroup().clear();
				return;
			case Hbm30Package.COMPOSITE_MAP_KEY__KEY_PROPERTY:
				getKeyProperty().clear();
				return;
			case Hbm30Package.COMPOSITE_MAP_KEY__KEY_MANY_TO_ONE:
				getKeyManyToOne().clear();
				return;
			case Hbm30Package.COMPOSITE_MAP_KEY__CLASS:
				setClass(CLASS_EDEFAULT);
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
			case Hbm30Package.COMPOSITE_MAP_KEY__GROUP:
				return group != null && !group.isEmpty();
			case Hbm30Package.COMPOSITE_MAP_KEY__KEY_PROPERTY:
				return !getKeyProperty().isEmpty();
			case Hbm30Package.COMPOSITE_MAP_KEY__KEY_MANY_TO_ONE:
				return !getKeyManyToOne().isEmpty();
			case Hbm30Package.COMPOSITE_MAP_KEY__CLASS:
				return CLASS_EDEFAULT == null ? class_ != null : !CLASS_EDEFAULT.equals(class_);
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
		result.append(", class: ");
		result.append(class_);
		result.append(')');
		return result.toString();
	}

} //CompositeMapKeyImpl

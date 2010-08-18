/**
 * <copyright>
 * </copyright>
 *
 * $Id: NaturalIdImpl.java,v 1.1 2010/08/18 09:21:39 cbouhier Exp $
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

import org.eclipse.emf.teneo.db2m.hbm30.Any;
import org.eclipse.emf.teneo.db2m.hbm30.Component;
import org.eclipse.emf.teneo.db2m.hbm30.DynamicComponent;
import org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package;
import org.eclipse.emf.teneo.db2m.hbm30.ManyToOne;
import org.eclipse.emf.teneo.db2m.hbm30.NaturalId;
import org.eclipse.emf.teneo.db2m.hbm30.Property;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Natural Id</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.NaturalIdImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.NaturalIdImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.NaturalIdImpl#getManyToOne <em>Many To One</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.NaturalIdImpl#getComponent <em>Component</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.NaturalIdImpl#getDynamicComponent <em>Dynamic Component</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.NaturalIdImpl#getAny <em>Any</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.NaturalIdImpl#isMutable <em>Mutable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NaturalIdImpl extends EObjectImpl implements NaturalId {
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
	 * The default value of the '{@link #isMutable() <em>Mutable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMutable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MUTABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMutable() <em>Mutable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMutable()
	 * @generated
	 * @ordered
	 */
	protected boolean mutable = MUTABLE_EDEFAULT;

	/**
	 * This is true if the Mutable attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean mutableESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NaturalIdImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Hbm30Package.eINSTANCE.getNaturalId();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, Hbm30Package.NATURAL_ID__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getProperty() {
		return getGroup().list(Hbm30Package.eINSTANCE.getNaturalId_Property());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ManyToOne> getManyToOne() {
		return getGroup().list(Hbm30Package.eINSTANCE.getNaturalId_ManyToOne());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Component> getComponent() {
		return getGroup().list(Hbm30Package.eINSTANCE.getNaturalId_Component());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DynamicComponent> getDynamicComponent() {
		return getGroup().list(Hbm30Package.eINSTANCE.getNaturalId_DynamicComponent());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Any> getAny() {
		return getGroup().list(Hbm30Package.eINSTANCE.getNaturalId_Any());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMutable() {
		return mutable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMutable(boolean newMutable) {
		boolean oldMutable = mutable;
		mutable = newMutable;
		boolean oldMutableESet = mutableESet;
		mutableESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.NATURAL_ID__MUTABLE, oldMutable, mutable, !oldMutableESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMutable() {
		boolean oldMutable = mutable;
		boolean oldMutableESet = mutableESet;
		mutable = MUTABLE_EDEFAULT;
		mutableESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Hbm30Package.NATURAL_ID__MUTABLE, oldMutable, MUTABLE_EDEFAULT, oldMutableESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMutable() {
		return mutableESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Hbm30Package.NATURAL_ID__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case Hbm30Package.NATURAL_ID__PROPERTY:
				return ((InternalEList<?>)getProperty()).basicRemove(otherEnd, msgs);
			case Hbm30Package.NATURAL_ID__MANY_TO_ONE:
				return ((InternalEList<?>)getManyToOne()).basicRemove(otherEnd, msgs);
			case Hbm30Package.NATURAL_ID__COMPONENT:
				return ((InternalEList<?>)getComponent()).basicRemove(otherEnd, msgs);
			case Hbm30Package.NATURAL_ID__DYNAMIC_COMPONENT:
				return ((InternalEList<?>)getDynamicComponent()).basicRemove(otherEnd, msgs);
			case Hbm30Package.NATURAL_ID__ANY:
				return ((InternalEList<?>)getAny()).basicRemove(otherEnd, msgs);
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
			case Hbm30Package.NATURAL_ID__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case Hbm30Package.NATURAL_ID__PROPERTY:
				return getProperty();
			case Hbm30Package.NATURAL_ID__MANY_TO_ONE:
				return getManyToOne();
			case Hbm30Package.NATURAL_ID__COMPONENT:
				return getComponent();
			case Hbm30Package.NATURAL_ID__DYNAMIC_COMPONENT:
				return getDynamicComponent();
			case Hbm30Package.NATURAL_ID__ANY:
				return getAny();
			case Hbm30Package.NATURAL_ID__MUTABLE:
				return isMutable();
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
			case Hbm30Package.NATURAL_ID__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case Hbm30Package.NATURAL_ID__PROPERTY:
				getProperty().clear();
				getProperty().addAll((Collection<? extends Property>)newValue);
				return;
			case Hbm30Package.NATURAL_ID__MANY_TO_ONE:
				getManyToOne().clear();
				getManyToOne().addAll((Collection<? extends ManyToOne>)newValue);
				return;
			case Hbm30Package.NATURAL_ID__COMPONENT:
				getComponent().clear();
				getComponent().addAll((Collection<? extends Component>)newValue);
				return;
			case Hbm30Package.NATURAL_ID__DYNAMIC_COMPONENT:
				getDynamicComponent().clear();
				getDynamicComponent().addAll((Collection<? extends DynamicComponent>)newValue);
				return;
			case Hbm30Package.NATURAL_ID__ANY:
				getAny().clear();
				getAny().addAll((Collection<? extends Any>)newValue);
				return;
			case Hbm30Package.NATURAL_ID__MUTABLE:
				setMutable((Boolean)newValue);
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
			case Hbm30Package.NATURAL_ID__GROUP:
				getGroup().clear();
				return;
			case Hbm30Package.NATURAL_ID__PROPERTY:
				getProperty().clear();
				return;
			case Hbm30Package.NATURAL_ID__MANY_TO_ONE:
				getManyToOne().clear();
				return;
			case Hbm30Package.NATURAL_ID__COMPONENT:
				getComponent().clear();
				return;
			case Hbm30Package.NATURAL_ID__DYNAMIC_COMPONENT:
				getDynamicComponent().clear();
				return;
			case Hbm30Package.NATURAL_ID__ANY:
				getAny().clear();
				return;
			case Hbm30Package.NATURAL_ID__MUTABLE:
				unsetMutable();
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
			case Hbm30Package.NATURAL_ID__GROUP:
				return group != null && !group.isEmpty();
			case Hbm30Package.NATURAL_ID__PROPERTY:
				return !getProperty().isEmpty();
			case Hbm30Package.NATURAL_ID__MANY_TO_ONE:
				return !getManyToOne().isEmpty();
			case Hbm30Package.NATURAL_ID__COMPONENT:
				return !getComponent().isEmpty();
			case Hbm30Package.NATURAL_ID__DYNAMIC_COMPONENT:
				return !getDynamicComponent().isEmpty();
			case Hbm30Package.NATURAL_ID__ANY:
				return !getAny().isEmpty();
			case Hbm30Package.NATURAL_ID__MUTABLE:
				return isSetMutable();
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
		result.append(", mutable: ");
		if (mutableESet) result.append(mutable); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //NaturalIdImpl

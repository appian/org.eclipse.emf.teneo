/**
 * <copyright>
 * </copyright>
 *
 * $Id: NestedCompositeElementImpl.java,v 1.1 2010/08/18 09:21:38 cbouhier Exp $
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
import org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package;
import org.eclipse.emf.teneo.db2m.hbm30.ManyToOne;
import org.eclipse.emf.teneo.db2m.hbm30.NestedCompositeElement;
import org.eclipse.emf.teneo.db2m.hbm30.Parent;
import org.eclipse.emf.teneo.db2m.hbm30.Property;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Nested Composite Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.NestedCompositeElementImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.NestedCompositeElementImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.NestedCompositeElementImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.NestedCompositeElementImpl#getManyToOne <em>Many To One</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.NestedCompositeElementImpl#getAny <em>Any</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.NestedCompositeElementImpl#getNestedCompositeElement <em>Nested Composite Element</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.NestedCompositeElementImpl#getAccess <em>Access</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.NestedCompositeElementImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.NestedCompositeElementImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.NestedCompositeElementImpl#getNode <em>Node</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NestedCompositeElementImpl extends EObjectImpl implements NestedCompositeElement {
	/**
	 * The cached value of the '{@link #getParent() <em>Parent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParent()
	 * @generated
	 * @ordered
	 */
	protected Parent parent;

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
	 * The default value of the '{@link #getAccess() <em>Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccess()
	 * @generated
	 * @ordered
	 */
	protected static final String ACCESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAccess() <em>Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccess()
	 * @generated
	 * @ordered
	 */
	protected String access = ACCESS_EDEFAULT;

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
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getNode() <em>Node</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNode()
	 * @generated
	 * @ordered
	 */
	protected static final String NODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNode() <em>Node</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNode()
	 * @generated
	 * @ordered
	 */
	protected String node = NODE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NestedCompositeElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Hbm30Package.eINSTANCE.getNestedCompositeElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parent getParent() {
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(Parent newParent, NotificationChain msgs) {
		Parent oldParent = parent;
		parent = newParent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Hbm30Package.NESTED_COMPOSITE_ELEMENT__PARENT, oldParent, newParent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(Parent newParent) {
		if (newParent != parent) {
			NotificationChain msgs = null;
			if (parent != null)
				msgs = ((InternalEObject)parent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Hbm30Package.NESTED_COMPOSITE_ELEMENT__PARENT, null, msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Hbm30Package.NESTED_COMPOSITE_ELEMENT__PARENT, null, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.NESTED_COMPOSITE_ELEMENT__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, Hbm30Package.NESTED_COMPOSITE_ELEMENT__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getProperty() {
		return getGroup().list(Hbm30Package.eINSTANCE.getNestedCompositeElement_Property());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ManyToOne> getManyToOne() {
		return getGroup().list(Hbm30Package.eINSTANCE.getNestedCompositeElement_ManyToOne());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Any> getAny() {
		return getGroup().list(Hbm30Package.eINSTANCE.getNestedCompositeElement_Any());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NestedCompositeElement> getNestedCompositeElement() {
		return getGroup().list(Hbm30Package.eINSTANCE.getNestedCompositeElement_NestedCompositeElement());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAccess() {
		return access;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccess(String newAccess) {
		String oldAccess = access;
		access = newAccess;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.NESTED_COMPOSITE_ELEMENT__ACCESS, oldAccess, access));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.NESTED_COMPOSITE_ELEMENT__CLASS, oldClass, class_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.NESTED_COMPOSITE_ELEMENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNode() {
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNode(String newNode) {
		String oldNode = node;
		node = newNode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.NESTED_COMPOSITE_ELEMENT__NODE, oldNode, node));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Hbm30Package.NESTED_COMPOSITE_ELEMENT__PARENT:
				return basicSetParent(null, msgs);
			case Hbm30Package.NESTED_COMPOSITE_ELEMENT__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case Hbm30Package.NESTED_COMPOSITE_ELEMENT__PROPERTY:
				return ((InternalEList<?>)getProperty()).basicRemove(otherEnd, msgs);
			case Hbm30Package.NESTED_COMPOSITE_ELEMENT__MANY_TO_ONE:
				return ((InternalEList<?>)getManyToOne()).basicRemove(otherEnd, msgs);
			case Hbm30Package.NESTED_COMPOSITE_ELEMENT__ANY:
				return ((InternalEList<?>)getAny()).basicRemove(otherEnd, msgs);
			case Hbm30Package.NESTED_COMPOSITE_ELEMENT__NESTED_COMPOSITE_ELEMENT:
				return ((InternalEList<?>)getNestedCompositeElement()).basicRemove(otherEnd, msgs);
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
			case Hbm30Package.NESTED_COMPOSITE_ELEMENT__PARENT:
				return getParent();
			case Hbm30Package.NESTED_COMPOSITE_ELEMENT__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case Hbm30Package.NESTED_COMPOSITE_ELEMENT__PROPERTY:
				return getProperty();
			case Hbm30Package.NESTED_COMPOSITE_ELEMENT__MANY_TO_ONE:
				return getManyToOne();
			case Hbm30Package.NESTED_COMPOSITE_ELEMENT__ANY:
				return getAny();
			case Hbm30Package.NESTED_COMPOSITE_ELEMENT__NESTED_COMPOSITE_ELEMENT:
				return getNestedCompositeElement();
			case Hbm30Package.NESTED_COMPOSITE_ELEMENT__ACCESS:
				return getAccess();
			case Hbm30Package.NESTED_COMPOSITE_ELEMENT__CLASS:
				return getClass_();
			case Hbm30Package.NESTED_COMPOSITE_ELEMENT__NAME:
				return getName();
			case Hbm30Package.NESTED_COMPOSITE_ELEMENT__NODE:
				return getNode();
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
			case Hbm30Package.NESTED_COMPOSITE_ELEMENT__PARENT:
				setParent((Parent)newValue);
				return;
			case Hbm30Package.NESTED_COMPOSITE_ELEMENT__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case Hbm30Package.NESTED_COMPOSITE_ELEMENT__PROPERTY:
				getProperty().clear();
				getProperty().addAll((Collection<? extends Property>)newValue);
				return;
			case Hbm30Package.NESTED_COMPOSITE_ELEMENT__MANY_TO_ONE:
				getManyToOne().clear();
				getManyToOne().addAll((Collection<? extends ManyToOne>)newValue);
				return;
			case Hbm30Package.NESTED_COMPOSITE_ELEMENT__ANY:
				getAny().clear();
				getAny().addAll((Collection<? extends Any>)newValue);
				return;
			case Hbm30Package.NESTED_COMPOSITE_ELEMENT__NESTED_COMPOSITE_ELEMENT:
				getNestedCompositeElement().clear();
				getNestedCompositeElement().addAll((Collection<? extends NestedCompositeElement>)newValue);
				return;
			case Hbm30Package.NESTED_COMPOSITE_ELEMENT__ACCESS:
				setAccess((String)newValue);
				return;
			case Hbm30Package.NESTED_COMPOSITE_ELEMENT__CLASS:
				setClass((String)newValue);
				return;
			case Hbm30Package.NESTED_COMPOSITE_ELEMENT__NAME:
				setName((String)newValue);
				return;
			case Hbm30Package.NESTED_COMPOSITE_ELEMENT__NODE:
				setNode((String)newValue);
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
			case Hbm30Package.NESTED_COMPOSITE_ELEMENT__PARENT:
				setParent((Parent)null);
				return;
			case Hbm30Package.NESTED_COMPOSITE_ELEMENT__GROUP:
				getGroup().clear();
				return;
			case Hbm30Package.NESTED_COMPOSITE_ELEMENT__PROPERTY:
				getProperty().clear();
				return;
			case Hbm30Package.NESTED_COMPOSITE_ELEMENT__MANY_TO_ONE:
				getManyToOne().clear();
				return;
			case Hbm30Package.NESTED_COMPOSITE_ELEMENT__ANY:
				getAny().clear();
				return;
			case Hbm30Package.NESTED_COMPOSITE_ELEMENT__NESTED_COMPOSITE_ELEMENT:
				getNestedCompositeElement().clear();
				return;
			case Hbm30Package.NESTED_COMPOSITE_ELEMENT__ACCESS:
				setAccess(ACCESS_EDEFAULT);
				return;
			case Hbm30Package.NESTED_COMPOSITE_ELEMENT__CLASS:
				setClass(CLASS_EDEFAULT);
				return;
			case Hbm30Package.NESTED_COMPOSITE_ELEMENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Hbm30Package.NESTED_COMPOSITE_ELEMENT__NODE:
				setNode(NODE_EDEFAULT);
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
			case Hbm30Package.NESTED_COMPOSITE_ELEMENT__PARENT:
				return parent != null;
			case Hbm30Package.NESTED_COMPOSITE_ELEMENT__GROUP:
				return group != null && !group.isEmpty();
			case Hbm30Package.NESTED_COMPOSITE_ELEMENT__PROPERTY:
				return !getProperty().isEmpty();
			case Hbm30Package.NESTED_COMPOSITE_ELEMENT__MANY_TO_ONE:
				return !getManyToOne().isEmpty();
			case Hbm30Package.NESTED_COMPOSITE_ELEMENT__ANY:
				return !getAny().isEmpty();
			case Hbm30Package.NESTED_COMPOSITE_ELEMENT__NESTED_COMPOSITE_ELEMENT:
				return !getNestedCompositeElement().isEmpty();
			case Hbm30Package.NESTED_COMPOSITE_ELEMENT__ACCESS:
				return ACCESS_EDEFAULT == null ? access != null : !ACCESS_EDEFAULT.equals(access);
			case Hbm30Package.NESTED_COMPOSITE_ELEMENT__CLASS:
				return CLASS_EDEFAULT == null ? class_ != null : !CLASS_EDEFAULT.equals(class_);
			case Hbm30Package.NESTED_COMPOSITE_ELEMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Hbm30Package.NESTED_COMPOSITE_ELEMENT__NODE:
				return NODE_EDEFAULT == null ? node != null : !NODE_EDEFAULT.equals(node);
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
		result.append(", access: ");
		result.append(access);
		result.append(", class: ");
		result.append(class_);
		result.append(", name: ");
		result.append(name);
		result.append(", node: ");
		result.append(node);
		result.append(')');
		return result.toString();
	}

} //NestedCompositeElementImpl

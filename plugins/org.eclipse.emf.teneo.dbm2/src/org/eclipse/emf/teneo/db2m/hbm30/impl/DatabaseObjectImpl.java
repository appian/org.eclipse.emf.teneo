/**
 * <copyright>
 * </copyright>
 *
 * $Id: DatabaseObjectImpl.java,v 1.1 2010/08/18 09:21:38 cbouhier Exp $
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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.emf.teneo.db2m.hbm30.DatabaseObject;
import org.eclipse.emf.teneo.db2m.hbm30.Definition;
import org.eclipse.emf.teneo.db2m.hbm30.DialectScope;
import org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Database Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.DatabaseObjectImpl#getDefinition <em>Definition</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.DatabaseObjectImpl#getCreate <em>Create</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.DatabaseObjectImpl#getDrop <em>Drop</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.DatabaseObjectImpl#getDialectScope <em>Dialect Scope</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DatabaseObjectImpl extends EObjectImpl implements DatabaseObject {
	/**
	 * The cached value of the '{@link #getDefinition() <em>Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinition()
	 * @generated
	 * @ordered
	 */
	protected Definition definition;

	/**
	 * The default value of the '{@link #getCreate() <em>Create</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreate()
	 * @generated
	 * @ordered
	 */
	protected static final String CREATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreate() <em>Create</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreate()
	 * @generated
	 * @ordered
	 */
	protected String create = CREATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDrop() <em>Drop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDrop()
	 * @generated
	 * @ordered
	 */
	protected static final String DROP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDrop() <em>Drop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDrop()
	 * @generated
	 * @ordered
	 */
	protected String drop = DROP_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDialectScope() <em>Dialect Scope</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDialectScope()
	 * @generated
	 * @ordered
	 */
	protected EList<DialectScope> dialectScope;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DatabaseObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Hbm30Package.eINSTANCE.getDatabaseObject();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Definition getDefinition() {
		return definition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefinition(Definition newDefinition, NotificationChain msgs) {
		Definition oldDefinition = definition;
		definition = newDefinition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Hbm30Package.DATABASE_OBJECT__DEFINITION, oldDefinition, newDefinition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefinition(Definition newDefinition) {
		if (newDefinition != definition) {
			NotificationChain msgs = null;
			if (definition != null)
				msgs = ((InternalEObject)definition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Hbm30Package.DATABASE_OBJECT__DEFINITION, null, msgs);
			if (newDefinition != null)
				msgs = ((InternalEObject)newDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Hbm30Package.DATABASE_OBJECT__DEFINITION, null, msgs);
			msgs = basicSetDefinition(newDefinition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.DATABASE_OBJECT__DEFINITION, newDefinition, newDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCreate() {
		return create;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreate(String newCreate) {
		String oldCreate = create;
		create = newCreate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.DATABASE_OBJECT__CREATE, oldCreate, create));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDrop() {
		return drop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDrop(String newDrop) {
		String oldDrop = drop;
		drop = newDrop;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.DATABASE_OBJECT__DROP, oldDrop, drop));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DialectScope> getDialectScope() {
		if (dialectScope == null) {
			dialectScope = new EObjectContainmentEList<DialectScope>(DialectScope.class, this, Hbm30Package.DATABASE_OBJECT__DIALECT_SCOPE);
		}
		return dialectScope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Hbm30Package.DATABASE_OBJECT__DEFINITION:
				return basicSetDefinition(null, msgs);
			case Hbm30Package.DATABASE_OBJECT__DIALECT_SCOPE:
				return ((InternalEList<?>)getDialectScope()).basicRemove(otherEnd, msgs);
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
			case Hbm30Package.DATABASE_OBJECT__DEFINITION:
				return getDefinition();
			case Hbm30Package.DATABASE_OBJECT__CREATE:
				return getCreate();
			case Hbm30Package.DATABASE_OBJECT__DROP:
				return getDrop();
			case Hbm30Package.DATABASE_OBJECT__DIALECT_SCOPE:
				return getDialectScope();
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
			case Hbm30Package.DATABASE_OBJECT__DEFINITION:
				setDefinition((Definition)newValue);
				return;
			case Hbm30Package.DATABASE_OBJECT__CREATE:
				setCreate((String)newValue);
				return;
			case Hbm30Package.DATABASE_OBJECT__DROP:
				setDrop((String)newValue);
				return;
			case Hbm30Package.DATABASE_OBJECT__DIALECT_SCOPE:
				getDialectScope().clear();
				getDialectScope().addAll((Collection<? extends DialectScope>)newValue);
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
			case Hbm30Package.DATABASE_OBJECT__DEFINITION:
				setDefinition((Definition)null);
				return;
			case Hbm30Package.DATABASE_OBJECT__CREATE:
				setCreate(CREATE_EDEFAULT);
				return;
			case Hbm30Package.DATABASE_OBJECT__DROP:
				setDrop(DROP_EDEFAULT);
				return;
			case Hbm30Package.DATABASE_OBJECT__DIALECT_SCOPE:
				getDialectScope().clear();
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
			case Hbm30Package.DATABASE_OBJECT__DEFINITION:
				return definition != null;
			case Hbm30Package.DATABASE_OBJECT__CREATE:
				return CREATE_EDEFAULT == null ? create != null : !CREATE_EDEFAULT.equals(create);
			case Hbm30Package.DATABASE_OBJECT__DROP:
				return DROP_EDEFAULT == null ? drop != null : !DROP_EDEFAULT.equals(drop);
			case Hbm30Package.DATABASE_OBJECT__DIALECT_SCOPE:
				return dialectScope != null && !dialectScope.isEmpty();
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
		result.append(" (create: ");
		result.append(create);
		result.append(", drop: ");
		result.append(drop);
		result.append(')');
		return result.toString();
	}

} //DatabaseObjectImpl

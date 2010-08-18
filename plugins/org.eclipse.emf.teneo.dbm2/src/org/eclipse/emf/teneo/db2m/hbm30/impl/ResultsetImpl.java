/**
 * <copyright>
 * </copyright>
 *
 * $Id: ResultsetImpl.java,v 1.1 2010/08/18 09:21:39 cbouhier Exp $
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

import org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package;
import org.eclipse.emf.teneo.db2m.hbm30.LoadCollection;
import org.eclipse.emf.teneo.db2m.hbm30.Resultset;
import org.eclipse.emf.teneo.db2m.hbm30.Return;
import org.eclipse.emf.teneo.db2m.hbm30.ReturnJoin;
import org.eclipse.emf.teneo.db2m.hbm30.ReturnScalar;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resultset</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ResultsetImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ResultsetImpl#getReturnScalar <em>Return Scalar</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ResultsetImpl#getReturn <em>Return</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ResultsetImpl#getReturnJoin <em>Return Join</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ResultsetImpl#getLoadCollection <em>Load Collection</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ResultsetImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResultsetImpl extends EObjectImpl implements Resultset {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResultsetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Hbm30Package.eINSTANCE.getResultset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, Hbm30Package.RESULTSET__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReturnScalar> getReturnScalar() {
		return getGroup().list(Hbm30Package.eINSTANCE.getResultset_ReturnScalar());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Return> getReturn() {
		return getGroup().list(Hbm30Package.eINSTANCE.getResultset_Return());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReturnJoin> getReturnJoin() {
		return getGroup().list(Hbm30Package.eINSTANCE.getResultset_ReturnJoin());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LoadCollection> getLoadCollection() {
		return getGroup().list(Hbm30Package.eINSTANCE.getResultset_LoadCollection());
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
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.RESULTSET__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Hbm30Package.RESULTSET__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case Hbm30Package.RESULTSET__RETURN_SCALAR:
				return ((InternalEList<?>)getReturnScalar()).basicRemove(otherEnd, msgs);
			case Hbm30Package.RESULTSET__RETURN:
				return ((InternalEList<?>)getReturn()).basicRemove(otherEnd, msgs);
			case Hbm30Package.RESULTSET__RETURN_JOIN:
				return ((InternalEList<?>)getReturnJoin()).basicRemove(otherEnd, msgs);
			case Hbm30Package.RESULTSET__LOAD_COLLECTION:
				return ((InternalEList<?>)getLoadCollection()).basicRemove(otherEnd, msgs);
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
			case Hbm30Package.RESULTSET__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case Hbm30Package.RESULTSET__RETURN_SCALAR:
				return getReturnScalar();
			case Hbm30Package.RESULTSET__RETURN:
				return getReturn();
			case Hbm30Package.RESULTSET__RETURN_JOIN:
				return getReturnJoin();
			case Hbm30Package.RESULTSET__LOAD_COLLECTION:
				return getLoadCollection();
			case Hbm30Package.RESULTSET__NAME:
				return getName();
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
			case Hbm30Package.RESULTSET__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case Hbm30Package.RESULTSET__RETURN_SCALAR:
				getReturnScalar().clear();
				getReturnScalar().addAll((Collection<? extends ReturnScalar>)newValue);
				return;
			case Hbm30Package.RESULTSET__RETURN:
				getReturn().clear();
				getReturn().addAll((Collection<? extends Return>)newValue);
				return;
			case Hbm30Package.RESULTSET__RETURN_JOIN:
				getReturnJoin().clear();
				getReturnJoin().addAll((Collection<? extends ReturnJoin>)newValue);
				return;
			case Hbm30Package.RESULTSET__LOAD_COLLECTION:
				getLoadCollection().clear();
				getLoadCollection().addAll((Collection<? extends LoadCollection>)newValue);
				return;
			case Hbm30Package.RESULTSET__NAME:
				setName((String)newValue);
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
			case Hbm30Package.RESULTSET__GROUP:
				getGroup().clear();
				return;
			case Hbm30Package.RESULTSET__RETURN_SCALAR:
				getReturnScalar().clear();
				return;
			case Hbm30Package.RESULTSET__RETURN:
				getReturn().clear();
				return;
			case Hbm30Package.RESULTSET__RETURN_JOIN:
				getReturnJoin().clear();
				return;
			case Hbm30Package.RESULTSET__LOAD_COLLECTION:
				getLoadCollection().clear();
				return;
			case Hbm30Package.RESULTSET__NAME:
				setName(NAME_EDEFAULT);
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
			case Hbm30Package.RESULTSET__GROUP:
				return group != null && !group.isEmpty();
			case Hbm30Package.RESULTSET__RETURN_SCALAR:
				return !getReturnScalar().isEmpty();
			case Hbm30Package.RESULTSET__RETURN:
				return !getReturn().isEmpty();
			case Hbm30Package.RESULTSET__RETURN_JOIN:
				return !getReturnJoin().isEmpty();
			case Hbm30Package.RESULTSET__LOAD_COLLECTION:
				return !getLoadCollection().isEmpty();
			case Hbm30Package.RESULTSET__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ResultsetImpl

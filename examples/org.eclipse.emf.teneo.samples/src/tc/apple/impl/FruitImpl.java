/**
 * <copyright>
 * </copyright>
 *
 * $Id: FruitImpl.java,v 1.1 2007/07/09 12:55:20 mtaal Exp $
 */
package tc.apple.impl;

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

import tc.apple.ApplePackage;
import tc.apple.Fruit;

import tc.tree.BigTree;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fruit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link tc.apple.impl.FruitImpl#getBigtree <em>Bigtree</em>}</li>
 *   <li>{@link tc.apple.impl.FruitImpl#getUniqueName <em>Unique Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FruitImpl extends EObjectImpl implements Fruit {
	/**
	 * The cached value of the '{@link #getBigtree() <em>Bigtree</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBigtree()
	 * @generated
	 * @ordered
	 */
	protected EList<BigTree> bigtree;

	/**
	 * The default value of the '{@link #getUniqueName() <em>Unique Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUniqueName()
	 * @generated
	 * @ordered
	 */
	protected static final String UNIQUE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUniqueName() <em>Unique Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUniqueName()
	 * @generated
	 * @ordered
	 */
	protected String uniqueName = UNIQUE_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FruitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApplePackage.Literals.FRUIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BigTree> getBigtree() {
		if (bigtree == null) {
			bigtree = new EObjectContainmentEList<BigTree>(BigTree.class, this, ApplePackage.FRUIT__BIGTREE);
		}
		return bigtree;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUniqueName() {
		return uniqueName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUniqueName(String newUniqueName) {
		String oldUniqueName = uniqueName;
		uniqueName = newUniqueName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplePackage.FRUIT__UNIQUE_NAME, oldUniqueName, uniqueName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ApplePackage.FRUIT__BIGTREE:
				return ((InternalEList<?>)getBigtree()).basicRemove(otherEnd, msgs);
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
			case ApplePackage.FRUIT__BIGTREE:
				return getBigtree();
			case ApplePackage.FRUIT__UNIQUE_NAME:
				return getUniqueName();
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
			case ApplePackage.FRUIT__BIGTREE:
				getBigtree().clear();
				getBigtree().addAll((Collection<? extends BigTree>)newValue);
				return;
			case ApplePackage.FRUIT__UNIQUE_NAME:
				setUniqueName((String)newValue);
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
			case ApplePackage.FRUIT__BIGTREE:
				getBigtree().clear();
				return;
			case ApplePackage.FRUIT__UNIQUE_NAME:
				setUniqueName(UNIQUE_NAME_EDEFAULT);
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
			case ApplePackage.FRUIT__BIGTREE:
				return bigtree != null && !bigtree.isEmpty();
			case ApplePackage.FRUIT__UNIQUE_NAME:
				return UNIQUE_NAME_EDEFAULT == null ? uniqueName != null : !UNIQUE_NAME_EDEFAULT.equals(uniqueName);
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
		result.append(" (uniqueName: ");
		result.append(uniqueName);
		result.append(')');
		return result.toString();
	}

} //FruitImpl

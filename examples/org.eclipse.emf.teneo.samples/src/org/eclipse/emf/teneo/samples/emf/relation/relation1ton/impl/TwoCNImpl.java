/**
 * <copyright>
 * </copyright>
 *
 * $Id: TwoCNImpl.java,v 1.2 2006/07/22 13:01:18 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.relation.relation1ton.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.teneo.samples.emf.relation.relation1ton.Main;
import org.eclipse.emf.teneo.samples.emf.relation.relation1ton.Relation1tonPackage;
import org.eclipse.emf.teneo.samples.emf.relation.relation1ton.TwoCN;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Two CN</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.relation.relation1ton.impl.TwoCNImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.relation.relation1ton.impl.TwoCNImpl#getMain <em>Main</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TwoCNImpl extends EObjectImpl implements TwoCN {
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
	protected TwoCNImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return Relation1tonPackage.Literals.TWO_CN;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Relation1tonPackage.TWO_CN__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Main getMain() {
		if (eContainerFeatureID != Relation1tonPackage.TWO_CN__MAIN) return null;
		return (Main)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMain(Main newMain) {
		if (newMain != eInternalContainer() || (eContainerFeatureID != Relation1tonPackage.TWO_CN__MAIN && newMain != null)) {
			if (EcoreUtil.isAncestor(this, newMain))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newMain != null)
				msgs = ((InternalEObject)newMain).eInverseAdd(this, Relation1tonPackage.MAIN__TWOCN, Main.class, msgs);
			msgs = eBasicSetContainer((InternalEObject)newMain, Relation1tonPackage.TWO_CN__MAIN, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Relation1tonPackage.TWO_CN__MAIN, newMain, newMain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Relation1tonPackage.TWO_CN__MAIN:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd, Relation1tonPackage.TWO_CN__MAIN, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Relation1tonPackage.TWO_CN__MAIN:
				return eBasicSetContainer(null, Relation1tonPackage.TWO_CN__MAIN, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID) {
			case Relation1tonPackage.TWO_CN__MAIN:
				return eInternalContainer().eInverseRemove(this, Relation1tonPackage.MAIN__TWOCN, Main.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Relation1tonPackage.TWO_CN__NAME:
				return getName();
			case Relation1tonPackage.TWO_CN__MAIN:
				return getMain();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Relation1tonPackage.TWO_CN__NAME:
				setName((String)newValue);
				return;
			case Relation1tonPackage.TWO_CN__MAIN:
				setMain((Main)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case Relation1tonPackage.TWO_CN__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Relation1tonPackage.TWO_CN__MAIN:
				setMain((Main)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Relation1tonPackage.TWO_CN__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Relation1tonPackage.TWO_CN__MAIN:
				return getMain() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //TwoCNImpl

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package lobj.impl;

import lobj.LearningUnit;
import lobj.LobjPackage;
import lobj.LuNode;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lu Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link lobj.impl.LuNodeImpl#isVisible <em>Visible</em>}</li>
 *   <li>{@link lobj.impl.LuNodeImpl#getId <em>Id</em>}</li>
 *   <li>{@link lobj.impl.LuNodeImpl#getLearningUnit <em>Learning Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LuNodeImpl extends EObjectImpl implements LuNode {
	/**
	 * The default value of the '{@link #isVisible() <em>Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVisible()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VISIBLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isVisible() <em>Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVisible()
	 * @generated
	 * @ordered
	 */
	protected boolean visible = VISIBLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLearningUnit() <em>Learning Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLearningUnit()
	 * @generated
	 * @ordered
	 */
	protected LearningUnit learningUnit;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LuNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return LobjPackage.Literals.LU_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isVisible() {
		return visible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisible(boolean newVisible) {
		boolean oldVisible = visible;
		visible = newVisible;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LobjPackage.LU_NODE__VISIBLE, oldVisible, visible));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LobjPackage.LU_NODE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LearningUnit getLearningUnit() {
		if (learningUnit != null && learningUnit.eIsProxy()) {
			InternalEObject oldLearningUnit = (InternalEObject)learningUnit;
			learningUnit = (LearningUnit)eResolveProxy(oldLearningUnit);
			if (learningUnit != oldLearningUnit) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LobjPackage.LU_NODE__LEARNING_UNIT, oldLearningUnit, learningUnit));
			}
		}
		return learningUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LearningUnit basicGetLearningUnit() {
		return learningUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLearningUnit(LearningUnit newLearningUnit) {
		LearningUnit oldLearningUnit = learningUnit;
		learningUnit = newLearningUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LobjPackage.LU_NODE__LEARNING_UNIT, oldLearningUnit, learningUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LobjPackage.LU_NODE__VISIBLE:
				return isVisible() ? Boolean.TRUE : Boolean.FALSE;
			case LobjPackage.LU_NODE__ID:
				return getId();
			case LobjPackage.LU_NODE__LEARNING_UNIT:
				if (resolve) return getLearningUnit();
				return basicGetLearningUnit();
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
			case LobjPackage.LU_NODE__VISIBLE:
				setVisible(((Boolean)newValue).booleanValue());
				return;
			case LobjPackage.LU_NODE__ID:
				setId((String)newValue);
				return;
			case LobjPackage.LU_NODE__LEARNING_UNIT:
				setLearningUnit((LearningUnit)newValue);
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
			case LobjPackage.LU_NODE__VISIBLE:
				setVisible(VISIBLE_EDEFAULT);
				return;
			case LobjPackage.LU_NODE__ID:
				setId(ID_EDEFAULT);
				return;
			case LobjPackage.LU_NODE__LEARNING_UNIT:
				setLearningUnit((LearningUnit)null);
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
			case LobjPackage.LU_NODE__VISIBLE:
				return visible != VISIBLE_EDEFAULT;
			case LobjPackage.LU_NODE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case LobjPackage.LU_NODE__LEARNING_UNIT:
				return learningUnit != null;
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
		result.append(" (visible: ");
		result.append(visible);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //LuNodeImpl

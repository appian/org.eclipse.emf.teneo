/**
 * <copyright>
 * </copyright>
 *
 * $Id: DidacMetaImpl.java,v 1.1 2006/11/23 06:12:09 mtaal Exp $
 */
package lobj.impl;

import lobj.DidacMeta;
import lobj.LobjPackage;
import lobj.Precognition;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Didac Meta</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link lobj.impl.DidacMetaImpl#getGoal <em>Goal</em>}</li>
 *   <li>{@link lobj.impl.DidacMetaImpl#getPrecognition <em>Precognition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DidacMetaImpl extends SimpleDidacMetaImpl implements DidacMeta {
	/**
	 * The default value of the '{@link #getGoal() <em>Goal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoal()
	 * @generated
	 * @ordered
	 */
	protected static final String GOAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGoal() <em>Goal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoal()
	 * @generated
	 * @ordered
	 */
	protected String goal = GOAL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPrecognition() <em>Precognition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecognition()
	 * @generated
	 * @ordered
	 */
	protected Precognition precognition = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DidacMetaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return LobjPackage.Literals.DIDAC_META;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGoal() {
		return goal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGoal(String newGoal) {
		String oldGoal = goal;
		goal = newGoal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LobjPackage.DIDAC_META__GOAL, oldGoal, goal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Precognition getPrecognition() {
		return precognition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrecognition(Precognition newPrecognition, NotificationChain msgs) {
		Precognition oldPrecognition = precognition;
		precognition = newPrecognition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LobjPackage.DIDAC_META__PRECOGNITION, oldPrecognition, newPrecognition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrecognition(Precognition newPrecognition) {
		if (newPrecognition != precognition) {
			NotificationChain msgs = null;
			if (precognition != null)
				msgs = ((InternalEObject)precognition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LobjPackage.DIDAC_META__PRECOGNITION, null, msgs);
			if (newPrecognition != null)
				msgs = ((InternalEObject)newPrecognition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LobjPackage.DIDAC_META__PRECOGNITION, null, msgs);
			msgs = basicSetPrecognition(newPrecognition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LobjPackage.DIDAC_META__PRECOGNITION, newPrecognition, newPrecognition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LobjPackage.DIDAC_META__PRECOGNITION:
				return basicSetPrecognition(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LobjPackage.DIDAC_META__GOAL:
				return getGoal();
			case LobjPackage.DIDAC_META__PRECOGNITION:
				return getPrecognition();
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
			case LobjPackage.DIDAC_META__GOAL:
				setGoal((String)newValue);
				return;
			case LobjPackage.DIDAC_META__PRECOGNITION:
				setPrecognition((Precognition)newValue);
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
			case LobjPackage.DIDAC_META__GOAL:
				setGoal(GOAL_EDEFAULT);
				return;
			case LobjPackage.DIDAC_META__PRECOGNITION:
				setPrecognition((Precognition)null);
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
			case LobjPackage.DIDAC_META__GOAL:
				return GOAL_EDEFAULT == null ? goal != null : !GOAL_EDEFAULT.equals(goal);
			case LobjPackage.DIDAC_META__PRECOGNITION:
				return precognition != null;
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
		result.append(" (goal: ");
		result.append(goal);
		result.append(')');
		return result.toString();
	}

} //DidacMetaImpl
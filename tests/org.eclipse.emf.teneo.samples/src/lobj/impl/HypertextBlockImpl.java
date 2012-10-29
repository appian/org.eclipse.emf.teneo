/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package lobj.impl;

import java.util.Collection;

import lobj.HypertextBlock;
import lobj.HypertextContent;
import lobj.LobjPackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Hypertext Block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link lobj.impl.HypertextBlockImpl#getHypertextContent <em>Hypertext Content</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class HypertextBlockImpl extends BlockImpl implements HypertextBlock {
	/**
	 * The cached value of the '{@link #getHypertextContent() <em>Hypertext Content</em>}' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getHypertextContent()
	 * @generated
	 * @ordered
	 */
	protected EList hypertextContent;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected HypertextBlockImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected EClass eStaticClass() {
		return LobjPackage.Literals.HYPERTEXT_BLOCK;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList getHypertextContent() {
		if (hypertextContent == null) {
			hypertextContent = new EObjectContainmentEList(HypertextContent.class, this,
					LobjPackage.HYPERTEXT_BLOCK__HYPERTEXT_CONTENT);
		}
		return hypertextContent;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID,
			NotificationChain msgs) {
		switch (featureID) {
		case LobjPackage.HYPERTEXT_BLOCK__HYPERTEXT_CONTENT:
			return ((InternalEList) getHypertextContent()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case LobjPackage.HYPERTEXT_BLOCK__HYPERTEXT_CONTENT:
			return getHypertextContent();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case LobjPackage.HYPERTEXT_BLOCK__HYPERTEXT_CONTENT:
			getHypertextContent().clear();
			getHypertextContent().addAll((Collection) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
		case LobjPackage.HYPERTEXT_BLOCK__HYPERTEXT_CONTENT:
			getHypertextContent().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case LobjPackage.HYPERTEXT_BLOCK__HYPERTEXT_CONTENT:
			return hypertextContent != null && !hypertextContent.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // HypertextBlockImpl

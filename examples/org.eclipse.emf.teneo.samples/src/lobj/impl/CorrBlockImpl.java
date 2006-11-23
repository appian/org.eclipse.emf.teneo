/**
 * <copyright>
 * </copyright>
 *
 * $Id: CorrBlockImpl.java,v 1.1 2006/11/23 06:12:09 mtaal Exp $
 */
package lobj.impl;

import java.util.Collection;

import lobj.CorrBlock;
import lobj.LobjPackage;
import lobj.PresentationBlock;
import lobj.TitleMeta;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Corr Block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link lobj.impl.CorrBlockImpl#getPresentationBlock <em>Presentation Block</em>}</li>
 *   <li>{@link lobj.impl.CorrBlockImpl#getTitleMeta <em>Title Meta</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CorrBlockImpl extends EObjectImpl implements CorrBlock {
	/**
	 * The cached value of the '{@link #getPresentationBlock() <em>Presentation Block</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPresentationBlock()
	 * @generated
	 * @ordered
	 */
	protected EList presentationBlock = null;

	/**
	 * The cached value of the '{@link #getTitleMeta() <em>Title Meta</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitleMeta()
	 * @generated
	 * @ordered
	 */
	protected EList titleMeta = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CorrBlockImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return LobjPackage.Literals.CORR_BLOCK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getPresentationBlock() {
		if (presentationBlock == null) {
			presentationBlock = new EObjectContainmentEList(PresentationBlock.class, this, LobjPackage.CORR_BLOCK__PRESENTATION_BLOCK);
		}
		return presentationBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getTitleMeta() {
		if (titleMeta == null) {
			titleMeta = new EObjectContainmentEList(TitleMeta.class, this, LobjPackage.CORR_BLOCK__TITLE_META);
		}
		return titleMeta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LobjPackage.CORR_BLOCK__PRESENTATION_BLOCK:
				return ((InternalEList)getPresentationBlock()).basicRemove(otherEnd, msgs);
			case LobjPackage.CORR_BLOCK__TITLE_META:
				return ((InternalEList)getTitleMeta()).basicRemove(otherEnd, msgs);
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
			case LobjPackage.CORR_BLOCK__PRESENTATION_BLOCK:
				return getPresentationBlock();
			case LobjPackage.CORR_BLOCK__TITLE_META:
				return getTitleMeta();
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
			case LobjPackage.CORR_BLOCK__PRESENTATION_BLOCK:
				getPresentationBlock().clear();
				getPresentationBlock().addAll((Collection)newValue);
				return;
			case LobjPackage.CORR_BLOCK__TITLE_META:
				getTitleMeta().clear();
				getTitleMeta().addAll((Collection)newValue);
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
			case LobjPackage.CORR_BLOCK__PRESENTATION_BLOCK:
				getPresentationBlock().clear();
				return;
			case LobjPackage.CORR_BLOCK__TITLE_META:
				getTitleMeta().clear();
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
			case LobjPackage.CORR_BLOCK__PRESENTATION_BLOCK:
				return presentationBlock != null && !presentationBlock.isEmpty();
			case LobjPackage.CORR_BLOCK__TITLE_META:
				return titleMeta != null && !titleMeta.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CorrBlockImpl
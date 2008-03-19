/**
 * <copyright>
 * </copyright>
 *
 * $Id: PageParamsImpl.java,v 1.1 2008/03/19 22:25:40 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.top.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.emf.teneo.samples.issues.top.PageParams;
import org.eclipse.emf.teneo.samples.issues.top.RenderParam;
import org.eclipse.emf.teneo.samples.issues.top.TopPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Page Params</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.top.impl.PageParamsImpl#getRenderParam <em>Render Param</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.top.impl.PageParamsImpl#getPageHeader <em>Page Header</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PageParamsImpl extends EObjectImpl implements PageParams {
	/**
	 * The cached value of the '{@link #getRenderParam() <em>Render Param</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRenderParam()
	 * @generated
	 * @ordered
	 */
	protected EList<RenderParam> renderParam;

	/**
	 * The cached value of the '{@link #getPageHeader() <em>Page Header</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPageHeader()
	 * @generated
	 * @ordered
	 */
	protected EList<String> pageHeader;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PageParamsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TopPackage.Literals.PAGE_PARAMS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RenderParam> getRenderParam() {
		if (renderParam == null) {
			renderParam = new EObjectContainmentEList<RenderParam>(RenderParam.class, this, TopPackage.PAGE_PARAMS__RENDER_PARAM);
		}
		return renderParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getPageHeader() {
		if (pageHeader == null) {
			pageHeader = new EDataTypeEList<String>(String.class, this, TopPackage.PAGE_PARAMS__PAGE_HEADER);
		}
		return pageHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TopPackage.PAGE_PARAMS__RENDER_PARAM:
				return ((InternalEList<?>)getRenderParam()).basicRemove(otherEnd, msgs);
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
			case TopPackage.PAGE_PARAMS__RENDER_PARAM:
				return getRenderParam();
			case TopPackage.PAGE_PARAMS__PAGE_HEADER:
				return getPageHeader();
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
			case TopPackage.PAGE_PARAMS__RENDER_PARAM:
				getRenderParam().clear();
				getRenderParam().addAll((Collection<? extends RenderParam>)newValue);
				return;
			case TopPackage.PAGE_PARAMS__PAGE_HEADER:
				getPageHeader().clear();
				getPageHeader().addAll((Collection<? extends String>)newValue);
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
			case TopPackage.PAGE_PARAMS__RENDER_PARAM:
				getRenderParam().clear();
				return;
			case TopPackage.PAGE_PARAMS__PAGE_HEADER:
				getPageHeader().clear();
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
			case TopPackage.PAGE_PARAMS__RENDER_PARAM:
				return renderParam != null && !renderParam.isEmpty();
			case TopPackage.PAGE_PARAMS__PAGE_HEADER:
				return pageHeader != null && !pageHeader.isEmpty();
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
		result.append(" (pageHeader: ");
		result.append(pageHeader);
		result.append(')');
		return result.toString();
	}

} //PageParamsImpl

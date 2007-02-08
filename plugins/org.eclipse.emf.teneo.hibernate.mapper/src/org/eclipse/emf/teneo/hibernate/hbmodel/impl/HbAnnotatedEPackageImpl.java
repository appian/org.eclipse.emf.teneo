/**
 * <copyright>
 * </copyright>
 *
 * $Id: HbAnnotatedEPackageImpl.java,v 1.5 2007/02/08 23:13:13 mtaal Exp $
 */
package org.eclipse.emf.teneo.hibernate.hbmodel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.teneo.annotations.pamodel.impl.PAnnotatedEPackageImpl;
import org.eclipse.emf.teneo.hibernate.hbannotation.GenericGenerator;
import org.eclipse.emf.teneo.hibernate.hbannotation.TypeDef;
import org.eclipse.emf.teneo.hibernate.hbmodel.HbAnnotatedEPackage;
import org.eclipse.emf.teneo.hibernate.hbmodel.HbModelPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Hb Annotated EPackage</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.hibernate.hbmodel.impl.HbAnnotatedEPackageImpl#getHbGenericGenerators <em>Hb Generic Generators</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.hibernate.hbmodel.impl.HbAnnotatedEPackageImpl#getHbTypeDef <em>Hb Type Def</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HbAnnotatedEPackageImpl extends PAnnotatedEPackageImpl implements HbAnnotatedEPackage {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2005, 2006, 2007 Springsite BV (The Netherlands) and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public\nLicense v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n   Martin Taal\n   Douglas Bitting\n";

	/**
	 * The cached value of the '{@link #getHbGenericGenerators() <em>Hb Generic Generators</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getHbGenericGenerators()
	 * @generated
	 * @ordered
	 */
	protected EList<GenericGenerator> hbGenericGenerators = null;

	/**
	 * The cached value of the '{@link #getHbTypeDef() <em>Hb Type Def</em>}' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getHbTypeDef()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeDef> hbTypeDef = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected HbAnnotatedEPackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HbModelPackage.Literals.HB_ANNOTATED_EPACKAGE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GenericGenerator> getHbGenericGenerators() {
		if (hbGenericGenerators == null) {
			hbGenericGenerators = new EObjectContainmentEList<GenericGenerator>(GenericGenerator.class, this, HbModelPackage.HB_ANNOTATED_EPACKAGE__HB_GENERIC_GENERATORS);
		}
		return hbGenericGenerators;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeDef> getHbTypeDef() {
		if (hbTypeDef == null) {
			hbTypeDef = new EObjectContainmentEList<TypeDef>(TypeDef.class, this, HbModelPackage.HB_ANNOTATED_EPACKAGE__HB_TYPE_DEF);
		}
		return hbTypeDef;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HbModelPackage.HB_ANNOTATED_EPACKAGE__HB_GENERIC_GENERATORS:
				return ((InternalEList<?>)getHbGenericGenerators()).basicRemove(otherEnd, msgs);
			case HbModelPackage.HB_ANNOTATED_EPACKAGE__HB_TYPE_DEF:
				return ((InternalEList<?>)getHbTypeDef()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HbModelPackage.HB_ANNOTATED_EPACKAGE__HB_GENERIC_GENERATORS:
				return getHbGenericGenerators();
			case HbModelPackage.HB_ANNOTATED_EPACKAGE__HB_TYPE_DEF:
				return getHbTypeDef();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
		@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case HbModelPackage.HB_ANNOTATED_EPACKAGE__HB_GENERIC_GENERATORS:
				getHbGenericGenerators().clear();
				getHbGenericGenerators().addAll((Collection<? extends GenericGenerator>)newValue);
				return;
			case HbModelPackage.HB_ANNOTATED_EPACKAGE__HB_TYPE_DEF:
				getHbTypeDef().clear();
				getHbTypeDef().addAll((Collection<? extends TypeDef>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case HbModelPackage.HB_ANNOTATED_EPACKAGE__HB_GENERIC_GENERATORS:
				getHbGenericGenerators().clear();
				return;
			case HbModelPackage.HB_ANNOTATED_EPACKAGE__HB_TYPE_DEF:
				getHbTypeDef().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case HbModelPackage.HB_ANNOTATED_EPACKAGE__HB_GENERIC_GENERATORS:
				return hbGenericGenerators != null && !hbGenericGenerators.isEmpty();
			case HbModelPackage.HB_ANNOTATED_EPACKAGE__HB_TYPE_DEF:
				return hbTypeDef != null && !hbTypeDef.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // HbAnnotatedEPackageImpl

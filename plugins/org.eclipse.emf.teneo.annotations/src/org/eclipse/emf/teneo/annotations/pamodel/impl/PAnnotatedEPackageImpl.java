/**
 * <copyright>
 * </copyright>
 *
 * $Id: PAnnotatedEPackageImpl.java,v 1.4 2006/08/31 22:46:54 mtaal Exp $
 */
package org.eclipse.emf.teneo.annotations.pamodel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEClass;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEPackage;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedModel;
import org.eclipse.emf.teneo.annotations.pamodel.PamodelPackage;
import org.eclipse.emf.teneo.annotations.pannotation.SequenceGenerator;
import org.eclipse.emf.teneo.annotations.pannotation.TableGenerator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PAnnotated EPackage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.annotations.pamodel.impl.PAnnotatedEPackageImpl#getPaModel <em>Pa Model</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.annotations.pamodel.impl.PAnnotatedEPackageImpl#getAnnotatedEPackage <em>Annotated EPackage</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.annotations.pamodel.impl.PAnnotatedEPackageImpl#getPaEClasses <em>Pa EClasses</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.annotations.pamodel.impl.PAnnotatedEPackageImpl#getSequenceGenerator <em>Sequence Generator</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.annotations.pamodel.impl.PAnnotatedEPackageImpl#getTableGenerator <em>Table Generator</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PAnnotatedEPackageImpl extends PAnnotatedEModelElementImpl implements PAnnotatedEPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2005, 2006 Springsite BV (The Netherlands) and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public\nLicense v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n   Martin Taal\n   Davide Marchignoli\n";

	/**
	 * The cached value of the '{@link #getAnnotatedEPackage() <em>Annotated EPackage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotatedEPackage()
	 * @generated
	 * @ordered
	 */
	protected EPackage annotatedEPackage = null;

	/**
	 * The cached value of the '{@link #getPaEClasses() <em>Pa EClasses</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaEClasses()
	 * @generated
	 * @ordered
	 */
	protected EList paEClasses = null;

	/**
	 * The cached value of the '{@link #getSequenceGenerator() <em>Sequence Generator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceGenerator()
	 * @generated
	 * @ordered
	 */
	protected SequenceGenerator sequenceGenerator = null;

	/**
	 * The cached value of the '{@link #getTableGenerator() <em>Table Generator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTableGenerator()
	 * @generated
	 * @ordered
	 */
	protected TableGenerator tableGenerator = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PAnnotatedEPackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return PamodelPackage.Literals.PANNOTATED_EPACKAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PAnnotatedModel getPaModel() {
		if (eContainerFeatureID != PamodelPackage.PANNOTATED_EPACKAGE__PA_MODEL) return null;
		return (PAnnotatedModel)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPaModel(PAnnotatedModel newPaModel, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newPaModel, PamodelPackage.PANNOTATED_EPACKAGE__PA_MODEL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPaModel(PAnnotatedModel newPaModel) {
		if (newPaModel != eInternalContainer() || (eContainerFeatureID != PamodelPackage.PANNOTATED_EPACKAGE__PA_MODEL && newPaModel != null)) {
			if (EcoreUtil.isAncestor(this, newPaModel))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPaModel != null)
				msgs = ((InternalEObject)newPaModel).eInverseAdd(this, PamodelPackage.PANNOTATED_MODEL__PA_EPACKAGES, PAnnotatedModel.class, msgs);
			msgs = basicSetPaModel(newPaModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PamodelPackage.PANNOTATED_EPACKAGE__PA_MODEL, newPaModel, newPaModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EPackage getAnnotatedEPackage() {
		if (annotatedEPackage != null && annotatedEPackage.eIsProxy()) {
			InternalEObject oldAnnotatedEPackage = (InternalEObject)annotatedEPackage;
			annotatedEPackage = (EPackage)eResolveProxy(oldAnnotatedEPackage);
			if (annotatedEPackage != oldAnnotatedEPackage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PamodelPackage.PANNOTATED_EPACKAGE__ANNOTATED_EPACKAGE, oldAnnotatedEPackage, annotatedEPackage));
			}
		}
		return annotatedEPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EPackage basicGetAnnotatedEPackage() {
		return annotatedEPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setAnnotatedEPackage(EPackage newAnnotatedEPackage) {
		EPackage oldAnnotatedEPackage = annotatedEPackage;
		annotatedEPackage = newAnnotatedEPackage;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, PamodelPackage.PANNOTATED_EPACKAGE__ANNOTATED_EPACKAGE, oldAnnotatedEPackage, annotatedEPackage));
			eNotify(new ENotificationImpl(this, Notification.SET, PamodelPackage.PANNOTATED_EPACKAGE__ANNOTATED_ELEMENT, oldAnnotatedEPackage, annotatedEPackage));
		}
	}

	public ENamedElement basicGetAnnotatedElement() {
		return basicGetAnnotatedEPackage();
	}

	public void setAnnotatedElement(ENamedElement newAnnotatedElement) {
		setAnnotatedEPackage((EPackage) newAnnotatedElement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getPaEClasses() {
		if (paEClasses == null) {
			paEClasses = new EObjectContainmentWithInverseEList(PAnnotatedEClass.class, this, PamodelPackage.PANNOTATED_EPACKAGE__PA_ECLASSES, PamodelPackage.PANNOTATED_ECLASS__PA_EPACKAGE);
		}
		return paEClasses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequenceGenerator getSequenceGenerator() {
		return sequenceGenerator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSequenceGenerator(SequenceGenerator newSequenceGenerator, NotificationChain msgs) {
		SequenceGenerator oldSequenceGenerator = sequenceGenerator;
		sequenceGenerator = newSequenceGenerator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PamodelPackage.PANNOTATED_EPACKAGE__SEQUENCE_GENERATOR, oldSequenceGenerator, newSequenceGenerator);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSequenceGenerator(SequenceGenerator newSequenceGenerator) {
		if (newSequenceGenerator != sequenceGenerator) {
			NotificationChain msgs = null;
			if (sequenceGenerator != null)
				msgs = ((InternalEObject)sequenceGenerator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PamodelPackage.PANNOTATED_EPACKAGE__SEQUENCE_GENERATOR, null, msgs);
			if (newSequenceGenerator != null)
				msgs = ((InternalEObject)newSequenceGenerator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PamodelPackage.PANNOTATED_EPACKAGE__SEQUENCE_GENERATOR, null, msgs);
			msgs = basicSetSequenceGenerator(newSequenceGenerator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PamodelPackage.PANNOTATED_EPACKAGE__SEQUENCE_GENERATOR, newSequenceGenerator, newSequenceGenerator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableGenerator getTableGenerator() {
		return tableGenerator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTableGenerator(TableGenerator newTableGenerator, NotificationChain msgs) {
		TableGenerator oldTableGenerator = tableGenerator;
		tableGenerator = newTableGenerator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PamodelPackage.PANNOTATED_EPACKAGE__TABLE_GENERATOR, oldTableGenerator, newTableGenerator);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTableGenerator(TableGenerator newTableGenerator) {
		if (newTableGenerator != tableGenerator) {
			NotificationChain msgs = null;
			if (tableGenerator != null)
				msgs = ((InternalEObject)tableGenerator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PamodelPackage.PANNOTATED_EPACKAGE__TABLE_GENERATOR, null, msgs);
			if (newTableGenerator != null)
				msgs = ((InternalEObject)newTableGenerator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PamodelPackage.PANNOTATED_EPACKAGE__TABLE_GENERATOR, null, msgs);
			msgs = basicSetTableGenerator(newTableGenerator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PamodelPackage.PANNOTATED_EPACKAGE__TABLE_GENERATOR, newTableGenerator, newTableGenerator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PamodelPackage.PANNOTATED_EPACKAGE__PA_MODEL:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetPaModel((PAnnotatedModel)otherEnd, msgs);
			case PamodelPackage.PANNOTATED_EPACKAGE__PA_ECLASSES:
				return ((InternalEList)getPaEClasses()).basicAdd(otherEnd, msgs);
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
			case PamodelPackage.PANNOTATED_EPACKAGE__PA_MODEL:
				return basicSetPaModel(null, msgs);
			case PamodelPackage.PANNOTATED_EPACKAGE__PA_ECLASSES:
				return ((InternalEList)getPaEClasses()).basicRemove(otherEnd, msgs);
			case PamodelPackage.PANNOTATED_EPACKAGE__SEQUENCE_GENERATOR:
				return basicSetSequenceGenerator(null, msgs);
			case PamodelPackage.PANNOTATED_EPACKAGE__TABLE_GENERATOR:
				return basicSetTableGenerator(null, msgs);
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
			case PamodelPackage.PANNOTATED_EPACKAGE__PA_MODEL:
				return eInternalContainer().eInverseRemove(this, PamodelPackage.PANNOTATED_MODEL__PA_EPACKAGES, PAnnotatedModel.class, msgs);
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
			case PamodelPackage.PANNOTATED_EPACKAGE__PA_MODEL:
				return getPaModel();
			case PamodelPackage.PANNOTATED_EPACKAGE__ANNOTATED_EPACKAGE:
				if (resolve) return getAnnotatedEPackage();
				return basicGetAnnotatedEPackage();
			case PamodelPackage.PANNOTATED_EPACKAGE__PA_ECLASSES:
				return getPaEClasses();
			case PamodelPackage.PANNOTATED_EPACKAGE__SEQUENCE_GENERATOR:
				return getSequenceGenerator();
			case PamodelPackage.PANNOTATED_EPACKAGE__TABLE_GENERATOR:
				return getTableGenerator();
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
			case PamodelPackage.PANNOTATED_EPACKAGE__PA_MODEL:
				setPaModel((PAnnotatedModel)newValue);
				return;
			case PamodelPackage.PANNOTATED_EPACKAGE__ANNOTATED_EPACKAGE:
				setAnnotatedEPackage((EPackage)newValue);
				return;
			case PamodelPackage.PANNOTATED_EPACKAGE__PA_ECLASSES:
				getPaEClasses().clear();
				getPaEClasses().addAll((Collection)newValue);
				return;
			case PamodelPackage.PANNOTATED_EPACKAGE__SEQUENCE_GENERATOR:
				setSequenceGenerator((SequenceGenerator)newValue);
				return;
			case PamodelPackage.PANNOTATED_EPACKAGE__TABLE_GENERATOR:
				setTableGenerator((TableGenerator)newValue);
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
			case PamodelPackage.PANNOTATED_EPACKAGE__PA_MODEL:
				setPaModel((PAnnotatedModel)null);
				return;
			case PamodelPackage.PANNOTATED_EPACKAGE__ANNOTATED_EPACKAGE:
				setAnnotatedEPackage((EPackage)null);
				return;
			case PamodelPackage.PANNOTATED_EPACKAGE__PA_ECLASSES:
				getPaEClasses().clear();
				return;
			case PamodelPackage.PANNOTATED_EPACKAGE__SEQUENCE_GENERATOR:
				setSequenceGenerator((SequenceGenerator)null);
				return;
			case PamodelPackage.PANNOTATED_EPACKAGE__TABLE_GENERATOR:
				setTableGenerator((TableGenerator)null);
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
			case PamodelPackage.PANNOTATED_EPACKAGE__PA_MODEL:
				return getPaModel() != null;
			case PamodelPackage.PANNOTATED_EPACKAGE__ANNOTATED_EPACKAGE:
				return annotatedEPackage != null;
			case PamodelPackage.PANNOTATED_EPACKAGE__PA_ECLASSES:
				return paEClasses != null && !paEClasses.isEmpty();
			case PamodelPackage.PANNOTATED_EPACKAGE__SEQUENCE_GENERATOR:
				return sequenceGenerator != null;
			case PamodelPackage.PANNOTATED_EPACKAGE__TABLE_GENERATOR:
				return tableGenerator != null;
		}
		return super.eIsSet(featureID);
	}

} //PAnnotatedEPackageImpl

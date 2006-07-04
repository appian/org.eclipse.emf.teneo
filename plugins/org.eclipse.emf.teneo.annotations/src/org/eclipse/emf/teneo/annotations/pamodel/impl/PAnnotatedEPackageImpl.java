/**
 * <copyright>
 * </copyright>
 *
 * $Id: PAnnotatedEPackageImpl.java,v 1.1 2006/07/04 21:37:03 mtaal Exp $
 */
package org.eclipse.emf.teneo.annotations.pamodel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEClass;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEPackage;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedModel;
import org.eclipse.emf.teneo.annotations.pamodel.PamodelPackage;
import org.eclipse.emf.teneo.annotations.pannotation.SequenceGenerator;
import org.eclipse.emf.teneo.annotations.pannotation.TableGenerator;
import org.eclipse.emf.teneo.annotations.pannotation.Transient;

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
	public static final String copyright = "Copyright 2004-2006, Elver.org (http://www.eclipse.org/emf/teneo).\nLicensed under the Apache License, Version 2.0 (the \"License\");\n\nyou may not use this file except in compliance with the License.\nYou may obtain a copy of the License at\nhttp://www.apache.org/licenses/LICENSE-2.0\nUnless required by applicable law or agreed to in writing, software\ndistributed under the License is distributed on an \"AS IS\" BASIS,\nWITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.\nSee the License for the specific language governing permissions and\nlimitations under the License.";

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
		return PamodelPackage.eINSTANCE.getPAnnotatedEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PAnnotatedModel getPaModel() {
		if (eContainerFeatureID != PamodelPackage.PANNOTATED_EPACKAGE__PA_MODEL) return null;
		return (PAnnotatedModel)eContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPaModel(PAnnotatedModel newPaModel) {
		if (newPaModel != eContainer || (eContainerFeatureID != PamodelPackage.PANNOTATED_EPACKAGE__PA_MODEL && newPaModel != null)) {
			if (EcoreUtil.isAncestor(this, newPaModel))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eContainer != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPaModel != null)
				msgs = ((InternalEObject)newPaModel).eInverseAdd(this, PamodelPackage.PANNOTATED_MODEL__PA_EPACKAGES, PAnnotatedModel.class, msgs);
			msgs = eBasicSetContainer((InternalEObject)newPaModel, PamodelPackage.PANNOTATED_EPACKAGE__PA_MODEL, msgs);
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
			EPackage oldAnnotatedEPackage = annotatedEPackage;
			annotatedEPackage = (EPackage)eResolveProxy((InternalEObject)annotatedEPackage);
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
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case PamodelPackage.PANNOTATED_EPACKAGE__PA_MODEL:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, PamodelPackage.PANNOTATED_EPACKAGE__PA_MODEL, msgs);
				case PamodelPackage.PANNOTATED_EPACKAGE__PA_ECLASSES:
					return ((InternalEList)getPaEClasses()).basicAdd(otherEnd, msgs);
				default:
					return eDynamicInverseAdd(otherEnd, featureID, baseClass, msgs);
			}
		}
		if (eContainer != null)
			msgs = eBasicRemoveFromContainer(msgs);
		return eBasicSetContainer(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case PamodelPackage.PANNOTATED_EPACKAGE__TRANSIENT:
					return basicSetTransient(null, msgs);
				case PamodelPackage.PANNOTATED_EPACKAGE__PA_MODEL:
					return eBasicSetContainer(null, PamodelPackage.PANNOTATED_EPACKAGE__PA_MODEL, msgs);
				case PamodelPackage.PANNOTATED_EPACKAGE__PA_ECLASSES:
					return ((InternalEList)getPaEClasses()).basicRemove(otherEnd, msgs);
				case PamodelPackage.PANNOTATED_EPACKAGE__SEQUENCE_GENERATOR:
					return basicSetSequenceGenerator(null, msgs);
				case PamodelPackage.PANNOTATED_EPACKAGE__TABLE_GENERATOR:
					return basicSetTableGenerator(null, msgs);
				default:
					return eDynamicInverseRemove(otherEnd, featureID, baseClass, msgs);
			}
		}
		return eBasicSetContainer(null, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eBasicRemoveFromContainer(NotificationChain msgs) {
		if (eContainerFeatureID >= 0) {
			switch (eContainerFeatureID) {
				case PamodelPackage.PANNOTATED_EPACKAGE__PA_MODEL:
					return eContainer.eInverseRemove(this, PamodelPackage.PANNOTATED_MODEL__PA_EPACKAGES, PAnnotatedModel.class, msgs);
				default:
					return eDynamicBasicRemoveFromContainer(msgs);
			}
		}
		return eContainer.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - eContainerFeatureID, null, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case PamodelPackage.PANNOTATED_EPACKAGE__ANNOTATED_ELEMENT:
				if (resolve) return getAnnotatedElement();
				return basicGetAnnotatedElement();
			case PamodelPackage.PANNOTATED_EPACKAGE__TRANSIENT:
				return getTransient();
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
		return eDynamicGet(eFeature, resolve);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(EStructuralFeature eFeature, Object newValue) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case PamodelPackage.PANNOTATED_EPACKAGE__ANNOTATED_ELEMENT:
				setAnnotatedElement((ENamedElement)newValue);
				return;
			case PamodelPackage.PANNOTATED_EPACKAGE__TRANSIENT:
				setTransient((Transient)newValue);
				return;
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
		eDynamicSet(eFeature, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case PamodelPackage.PANNOTATED_EPACKAGE__ANNOTATED_ELEMENT:
				setAnnotatedElement((ENamedElement)null);
				return;
			case PamodelPackage.PANNOTATED_EPACKAGE__TRANSIENT:
				setTransient((Transient)null);
				return;
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
		eDynamicUnset(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case PamodelPackage.PANNOTATED_EPACKAGE__ANNOTATED_ELEMENT:
				return basicGetAnnotatedElement() != null;
			case PamodelPackage.PANNOTATED_EPACKAGE__TRANSIENT:
				return transient_ != null;
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
		return eDynamicIsSet(eFeature);
	}

} //PAnnotatedEPackageImpl

/**
 * <copyright>
 * </copyright>
 *
 * $Id: PAnnotatedEModelElementImpl.java,v 1.6 2007/07/04 19:28:01 mtaal Exp $
 */
package org.eclipse.emf.teneo.annotations.pamodel.impl;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEModelElement;
import org.eclipse.emf.teneo.annotations.pamodel.PamodelPackage;
import org.eclipse.emf.teneo.annotations.pannotation.PAnnotation;
import org.eclipse.emf.teneo.annotations.pannotation.Transient;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PAnnotated EModel Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.annotations.pamodel.impl.PAnnotatedEModelElementImpl#getAnnotatedElement <em>Annotated Element</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.annotations.pamodel.impl.PAnnotatedEModelElementImpl#getTransient <em>Transient</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class PAnnotatedEModelElementImpl extends EObjectImpl implements PAnnotatedEModelElement {
	/**
	 * The cached value of the '{@link #getTransient() <em>Transient</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransient()
	 * @generated
	 * @ordered
	 */
	protected Transient transient_;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PAnnotatedEModelElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PamodelPackage.Literals.PANNOTATED_EMODEL_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENamedElement getAnnotatedElement() {
		ENamedElement annotatedElement = basicGetAnnotatedElement();
		return annotatedElement != null && annotatedElement.eIsProxy() ? (ENamedElement)eResolveProxy((InternalEObject)annotatedElement) : annotatedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public abstract ENamedElement basicGetAnnotatedElement();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public abstract void setAnnotatedElement(ENamedElement newAnnotatedElement);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transient getTransient() {
		return transient_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransient(Transient newTransient, NotificationChain msgs) {
		Transient oldTransient = transient_;
		transient_ = newTransient;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PamodelPackage.PANNOTATED_EMODEL_ELEMENT__TRANSIENT, oldTransient, newTransient);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransient(Transient newTransient) {
		if (newTransient != transient_) {
			NotificationChain msgs = null;
			if (transient_ != null)
				msgs = ((InternalEObject)transient_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PamodelPackage.PANNOTATED_EMODEL_ELEMENT__TRANSIENT, null, msgs);
			if (newTransient != null)
				msgs = ((InternalEObject)newTransient).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PamodelPackage.PANNOTATED_EMODEL_ELEMENT__TRANSIENT, null, msgs);
			msgs = basicSetTransient(newTransient, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PamodelPackage.PANNOTATED_EMODEL_ELEMENT__TRANSIENT, newTransient, newTransient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PamodelPackage.PANNOTATED_EMODEL_ELEMENT__TRANSIENT:
				return basicSetTransient(null, msgs);
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
			case PamodelPackage.PANNOTATED_EMODEL_ELEMENT__ANNOTATED_ELEMENT:
				if (resolve) return getAnnotatedElement();
				return basicGetAnnotatedElement();
			case PamodelPackage.PANNOTATED_EMODEL_ELEMENT__TRANSIENT:
				return getTransient();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PamodelPackage.PANNOTATED_EMODEL_ELEMENT__ANNOTATED_ELEMENT:
				setAnnotatedElement((ENamedElement)newValue);
				return;
			case PamodelPackage.PANNOTATED_EMODEL_ELEMENT__TRANSIENT:
				setTransient((Transient)newValue);
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
			case PamodelPackage.PANNOTATED_EMODEL_ELEMENT__ANNOTATED_ELEMENT:
				setAnnotatedElement((ENamedElement)null);
				return;
			case PamodelPackage.PANNOTATED_EMODEL_ELEMENT__TRANSIENT:
				setTransient((Transient)null);
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
			case PamodelPackage.PANNOTATED_EMODEL_ELEMENT__ANNOTATED_ELEMENT:
				return basicGetAnnotatedElement() != null;
			case PamodelPackage.PANNOTATED_EMODEL_ELEMENT__TRANSIENT:
				return transient_ != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * {@inheritDoc }
	 */
	public List<PAnnotation> getAnnotations() {
		// TODO implement as wrapper on eContents?
		List<PAnnotation> annotations = new ArrayList<PAnnotation>();
		for (Object x : eContents()) {
			if (x instanceof PAnnotation)
				annotations.add((PAnnotation)x);
		}
		return annotations;
	}

	/** 
	 * Overridden to provide type info
	 * @see org.eclipse.emf.ecore.impl.BasicEObjectImpl#toString()
	 */
	public String toString() {
		ENamedElement em = getAnnotatedElement();
		return em.eClass().getName() + "/" + em.getName(); 
	}
} //PAnnotatedEModelElementImpl

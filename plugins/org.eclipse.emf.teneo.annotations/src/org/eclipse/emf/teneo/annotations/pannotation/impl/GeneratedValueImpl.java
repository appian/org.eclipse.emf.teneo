/**
 * <copyright>
 * </copyright>
 *
 * $Id: GeneratedValueImpl.java,v 1.6 2007/07/04 19:28:01 mtaal Exp $
 */
package org.eclipse.emf.teneo.annotations.pannotation.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.teneo.annotations.pannotation.GeneratedValue;
import org.eclipse.emf.teneo.annotations.pannotation.GenerationType;
import org.eclipse.emf.teneo.annotations.pannotation.PannotationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generated Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.annotations.pannotation.impl.GeneratedValueImpl#getEModelElement <em>EModel Element</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.annotations.pannotation.impl.GeneratedValueImpl#getStrategy <em>Strategy</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.annotations.pannotation.impl.GeneratedValueImpl#getGenerator <em>Generator</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GeneratedValueImpl extends EObjectImpl implements GeneratedValue {
	/**
	 * The cached value of the '{@link #getEModelElement() <em>EModel Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEModelElement()
	 * @generated
	 * @ordered
	 */
	protected EModelElement eModelElement;

	/**
	 * The default value of the '{@link #getStrategy() <em>Strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrategy()
	 * @generated
	 * @ordered
	 */
	protected static final GenerationType STRATEGY_EDEFAULT = GenerationType.AUTO;

	/**
	 * The cached value of the '{@link #getStrategy() <em>Strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrategy()
	 * @generated
	 * @ordered
	 */
	protected GenerationType strategy = STRATEGY_EDEFAULT;

	/**
	 * The default value of the '{@link #getGenerator() <em>Generator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenerator()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGenerator() <em>Generator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenerator()
	 * @generated
	 * @ordered
	 */
	protected String generator = GENERATOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeneratedValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PannotationPackage.Literals.GENERATED_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EModelElement getEModelElement() {
		if (eModelElement != null && eModelElement.eIsProxy()) {
			InternalEObject oldEModelElement = (InternalEObject)eModelElement;
			eModelElement = (EModelElement)eResolveProxy(oldEModelElement);
			if (eModelElement != oldEModelElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PannotationPackage.GENERATED_VALUE__EMODEL_ELEMENT, oldEModelElement, eModelElement));
			}
		}
		return eModelElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EModelElement basicGetEModelElement() {
		return eModelElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEModelElement(EModelElement newEModelElement) {
		EModelElement oldEModelElement = eModelElement;
		eModelElement = newEModelElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PannotationPackage.GENERATED_VALUE__EMODEL_ELEMENT, oldEModelElement, eModelElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenerationType getStrategy() {
		return strategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStrategy(GenerationType newStrategy) {
		GenerationType oldStrategy = strategy;
		strategy = newStrategy == null ? STRATEGY_EDEFAULT : newStrategy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PannotationPackage.GENERATED_VALUE__STRATEGY, oldStrategy, strategy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGenerator() {
		return generator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenerator(String newGenerator) {
		String oldGenerator = generator;
		generator = newGenerator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PannotationPackage.GENERATED_VALUE__GENERATOR, oldGenerator, generator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PannotationPackage.GENERATED_VALUE__EMODEL_ELEMENT:
				if (resolve) return getEModelElement();
				return basicGetEModelElement();
			case PannotationPackage.GENERATED_VALUE__STRATEGY:
				return getStrategy();
			case PannotationPackage.GENERATED_VALUE__GENERATOR:
				return getGenerator();
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
			case PannotationPackage.GENERATED_VALUE__EMODEL_ELEMENT:
				setEModelElement((EModelElement)newValue);
				return;
			case PannotationPackage.GENERATED_VALUE__STRATEGY:
				setStrategy((GenerationType)newValue);
				return;
			case PannotationPackage.GENERATED_VALUE__GENERATOR:
				setGenerator((String)newValue);
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
			case PannotationPackage.GENERATED_VALUE__EMODEL_ELEMENT:
				setEModelElement((EModelElement)null);
				return;
			case PannotationPackage.GENERATED_VALUE__STRATEGY:
				setStrategy(STRATEGY_EDEFAULT);
				return;
			case PannotationPackage.GENERATED_VALUE__GENERATOR:
				setGenerator(GENERATOR_EDEFAULT);
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
			case PannotationPackage.GENERATED_VALUE__EMODEL_ELEMENT:
				return eModelElement != null;
			case PannotationPackage.GENERATED_VALUE__STRATEGY:
				return strategy != STRATEGY_EDEFAULT;
			case PannotationPackage.GENERATED_VALUE__GENERATOR:
				return GENERATOR_EDEFAULT == null ? generator != null : !GENERATOR_EDEFAULT.equals(generator);
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
		result.append(" (strategy: ");
		result.append(strategy);
		result.append(", generator: ");
		result.append(generator);
		result.append(')');
		return result.toString();
	}

} //GeneratedValueImpl

/**
 * <copyright>
 * </copyright>
 *
 * $Id: HbModelAdapterFactory.java,v 1.1 2006/08/24 22:12:52 mtaal Exp $
 */
package org.eclipse.emf.teneo.hibernate.hbmodel.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEAttribute;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEClass;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEModelElement;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEPackage;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEReference;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEStructuralFeature;

import org.eclipse.emf.teneo.hibernate.hbmodel.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.teneo.hibernate.hbmodel.HbModelPackage
 * @generated
 */
public class HbModelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static HbModelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HbModelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = HbModelPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch the delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HbModelSwitch modelSwitch =
		new HbModelSwitch() {
			public Object caseHbAnnotatedEStructuralFeature(HbAnnotatedEStructuralFeature object) {
				return createHbAnnotatedEStructuralFeatureAdapter();
			}
			public Object caseHbAnnotatedEAttribute(HbAnnotatedEAttribute object) {
				return createHbAnnotatedEAttributeAdapter();
			}
			public Object caseHbAnnotatedEClass(HbAnnotatedEClass object) {
				return createHbAnnotatedEClassAdapter();
			}
			public Object caseHbAnnotatedEModelElement(HbAnnotatedEModelElement object) {
				return createHbAnnotatedEModelElementAdapter();
			}
			public Object caseHbAnnotatedEPackage(HbAnnotatedEPackage object) {
				return createHbAnnotatedEPackageAdapter();
			}
			public Object caseHbAnnotatedEReference(HbAnnotatedEReference object) {
				return createHbAnnotatedEReferenceAdapter();
			}
			public Object casePAnnotatedEModelElement(PAnnotatedEModelElement object) {
				return createPAnnotatedEModelElementAdapter();
			}
			public Object casePAnnotatedEStructuralFeature(PAnnotatedEStructuralFeature object) {
				return createPAnnotatedEStructuralFeatureAdapter();
			}
			public Object casePAnnotatedEAttribute(PAnnotatedEAttribute object) {
				return createPAnnotatedEAttributeAdapter();
			}
			public Object casePAnnotatedEClass(PAnnotatedEClass object) {
				return createPAnnotatedEClassAdapter();
			}
			public Object casePAnnotatedEPackage(PAnnotatedEPackage object) {
				return createPAnnotatedEPackageAdapter();
			}
			public Object casePAnnotatedEReference(PAnnotatedEReference object) {
				return createPAnnotatedEReferenceAdapter();
			}
			public Object defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	public Adapter createAdapter(Notifier target) {
		return (Adapter)modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.teneo.hibernate.hbmodel.HbAnnotatedEStructuralFeature <em>Hb Annotated EStructural Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.teneo.hibernate.hbmodel.HbAnnotatedEStructuralFeature
	 * @generated
	 */
	public Adapter createHbAnnotatedEStructuralFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.teneo.hibernate.hbmodel.HbAnnotatedEAttribute <em>Hb Annotated EAttribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.teneo.hibernate.hbmodel.HbAnnotatedEAttribute
	 * @generated
	 */
	public Adapter createHbAnnotatedEAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.teneo.hibernate.hbmodel.HbAnnotatedEClass <em>Hb Annotated EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.teneo.hibernate.hbmodel.HbAnnotatedEClass
	 * @generated
	 */
	public Adapter createHbAnnotatedEClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.teneo.hibernate.hbmodel.HbAnnotatedEModelElement <em>Hb Annotated EModel Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.teneo.hibernate.hbmodel.HbAnnotatedEModelElement
	 * @generated
	 */
	public Adapter createHbAnnotatedEModelElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.teneo.hibernate.hbmodel.HbAnnotatedEPackage <em>Hb Annotated EPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.teneo.hibernate.hbmodel.HbAnnotatedEPackage
	 * @generated
	 */
	public Adapter createHbAnnotatedEPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.teneo.hibernate.hbmodel.HbAnnotatedEReference <em>Hb Annotated EReference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.teneo.hibernate.hbmodel.HbAnnotatedEReference
	 * @generated
	 */
	public Adapter createHbAnnotatedEReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEModelElement <em>PAnnotated EModel Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEModelElement
	 * @generated
	 */
	public Adapter createPAnnotatedEModelElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEStructuralFeature <em>PAnnotated EStructural Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEStructuralFeature
	 * @generated
	 */
	public Adapter createPAnnotatedEStructuralFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEAttribute <em>PAnnotated EAttribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEAttribute
	 * @generated
	 */
	public Adapter createPAnnotatedEAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEClass <em>PAnnotated EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEClass
	 * @generated
	 */
	public Adapter createPAnnotatedEClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEPackage <em>PAnnotated EPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEPackage
	 * @generated
	 */
	public Adapter createPAnnotatedEPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEReference <em>PAnnotated EReference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEReference
	 * @generated
	 */
	public Adapter createPAnnotatedEReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //HbModelAdapterFactory

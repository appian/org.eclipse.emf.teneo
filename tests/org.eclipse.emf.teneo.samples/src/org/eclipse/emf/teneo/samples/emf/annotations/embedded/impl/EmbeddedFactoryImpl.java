/**
 * <copyright>
 * </copyright>
 *
 * $Id: EmbeddedFactoryImpl.java,v 1.6 2010/04/23 08:52:50 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.annotations.embedded.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.teneo.samples.emf.annotations.embedded.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EmbeddedFactoryImpl extends EFactoryImpl implements EmbeddedFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EmbeddedFactory init() {
		try {
			EmbeddedFactory theEmbeddedFactory = (EmbeddedFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/emf/teneo/samples/emf/annotations/embedded"); 
			if (theEmbeddedFactory != null) {
				return theEmbeddedFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EmbeddedFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmbeddedFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case EmbeddedPackage.ALSO_EMBEDDABLE: return createAlsoEmbeddable();
			case EmbeddedPackage.ANOTHER_EMBEDDABLE: return createAnotherEmbeddable();
			case EmbeddedPackage.AONE_TO_MANY: return createAOneToMany();
			case EmbeddedPackage.EMBEDDABLE: return createEmbeddable();
			case EmbeddedPackage.EMBEDDER: return createEmbedder();
			case EmbeddedPackage.NESTED_EMBEDDABLE: return createNestedEmbeddable();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlsoEmbeddable createAlsoEmbeddable() {
		AlsoEmbeddableImpl alsoEmbeddable = new AlsoEmbeddableImpl();
		return alsoEmbeddable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnotherEmbeddable createAnotherEmbeddable() {
		AnotherEmbeddableImpl anotherEmbeddable = new AnotherEmbeddableImpl();
		return anotherEmbeddable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AOneToMany createAOneToMany() {
		AOneToManyImpl aOneToMany = new AOneToManyImpl();
		return aOneToMany;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Embeddable createEmbeddable() {
		EmbeddableImpl embeddable = new EmbeddableImpl();
		return embeddable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Embedder createEmbedder() {
		EmbedderImpl embedder = new EmbedderImpl();
		return embedder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NestedEmbeddable createNestedEmbeddable() {
		NestedEmbeddableImpl nestedEmbeddable = new NestedEmbeddableImpl();
		return nestedEmbeddable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmbeddedPackage getEmbeddedPackage() {
		return (EmbeddedPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EmbeddedPackage getPackage() {
		return EmbeddedPackage.eINSTANCE;
	}

} //EmbeddedFactoryImpl

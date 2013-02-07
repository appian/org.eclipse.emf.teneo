/**
 */
package org.eclipse.emf.teneo.samples.issues.bz400088.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.teneo.samples.issues.bz400088.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Bz400088FactoryImpl extends EFactoryImpl implements Bz400088Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Bz400088Factory init() {
		try {
			Bz400088Factory theBz400088Factory = (Bz400088Factory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/emf/teneo/samples/issues/bz400088"); 
			if (theBz400088Factory != null) {
				return theBz400088Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Bz400088FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bz400088FactoryImpl() {
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
			case Bz400088Package.CASE1: return createCase1();
			case Bz400088Package.CASE2: return createCase2();
			case Bz400088Package.REF400088: return createRef400088();
			case Bz400088Package.REF_OTHER400088: return createRefOther400088();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Case1 createCase1() {
		Case1Impl case1 = new Case1Impl();
		return case1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Case2 createCase2() {
		Case2Impl case2 = new Case2Impl();
		return case2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ref400088 createRef400088() {
		Ref400088Impl ref400088 = new Ref400088Impl();
		return ref400088;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefOther400088 createRefOther400088() {
		RefOther400088Impl refOther400088 = new RefOther400088Impl();
		return refOther400088;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bz400088Package getBz400088Package() {
		return (Bz400088Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Bz400088Package getPackage() {
		return Bz400088Package.eINSTANCE;
	}

} //Bz400088FactoryImpl

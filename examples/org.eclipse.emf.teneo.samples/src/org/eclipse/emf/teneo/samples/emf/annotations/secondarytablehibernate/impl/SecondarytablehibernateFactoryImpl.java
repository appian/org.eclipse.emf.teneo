/**
 * <copyright>
 * </copyright>
 *
 * $Id: SecondarytablehibernateFactoryImpl.java,v 1.3 2007/02/08 23:09:23 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.annotations.secondarytablehibernate.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.teneo.samples.emf.annotations.secondarytablehibernate.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SecondarytablehibernateFactoryImpl extends EFactoryImpl implements SecondarytablehibernateFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SecondarytablehibernateFactory init() {
		try {
			SecondarytablehibernateFactory theSecondarytablehibernateFactory = (SecondarytablehibernateFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/emf/teneo/samples/emf/annotations/secondarytablehibernate"); 
			if (theSecondarytablehibernateFactory != null) {
				return theSecondarytablehibernateFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SecondarytablehibernateFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecondarytablehibernateFactoryImpl() {
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
			case SecondarytablehibernatePackage.PERSON: return createPerson();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person createPerson() {
		PersonImpl person = new PersonImpl();
		return person;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecondarytablehibernatePackage getSecondarytablehibernatePackage() {
		return (SecondarytablehibernatePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SecondarytablehibernatePackage getPackage() {
		return SecondarytablehibernatePackage.eINSTANCE;
	}

} //SecondarytablehibernateFactoryImpl

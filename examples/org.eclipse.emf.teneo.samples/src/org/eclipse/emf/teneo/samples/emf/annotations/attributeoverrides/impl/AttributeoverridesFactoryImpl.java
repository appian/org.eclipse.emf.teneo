/**
 * <copyright>
 * </copyright>
 *
 * $Id: AttributeoverridesFactoryImpl.java,v 1.2 2006/09/04 15:42:25 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.annotations.attributeoverrides.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.teneo.samples.emf.annotations.attributeoverrides.*;

import org.eclipse.emf.teneo.samples.emf.annotations.attributeoverrides.AttributeoverridesFactory;
import org.eclipse.emf.teneo.samples.emf.annotations.attributeoverrides.AttributeoverridesPackage;
import org.eclipse.emf.teneo.samples.emf.annotations.attributeoverrides.City;
import org.eclipse.emf.teneo.samples.emf.annotations.attributeoverrides.Person;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AttributeoverridesFactoryImpl extends EFactoryImpl implements AttributeoverridesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AttributeoverridesFactory init() {
		try {
			AttributeoverridesFactory theAttributeoverridesFactory = (AttributeoverridesFactory)EPackage.Registry.INSTANCE.getEFactory("http:///org/eclipse/emf/teneo/samples/emf/annotations/attributeoverrides.ecore"); 
			if (theAttributeoverridesFactory != null) {
				return theAttributeoverridesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AttributeoverridesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeoverridesFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case AttributeoverridesPackage.PERSON: return createPerson();
			case AttributeoverridesPackage.CITY: return createCity();
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
	public City createCity() {
		CityImpl city = new CityImpl();
		return city;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeoverridesPackage getAttributeoverridesPackage() {
		return (AttributeoverridesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	public static AttributeoverridesPackage getPackage() {
		return AttributeoverridesPackage.eINSTANCE;
	}

} //AttributeoverridesFactoryImpl

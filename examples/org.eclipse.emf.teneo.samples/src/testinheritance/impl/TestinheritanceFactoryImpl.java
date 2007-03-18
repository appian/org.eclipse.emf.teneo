/**
 * <copyright>
 * </copyright>
 *
 * $Id: TestinheritanceFactoryImpl.java,v 1.1 2007/03/18 22:28:33 mtaal Exp $
 */
package testinheritance.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import testinheritance.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TestinheritanceFactoryImpl extends EFactoryImpl implements TestinheritanceFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TestinheritanceFactory init() {
		try {
			TestinheritanceFactory theTestinheritanceFactory = (TestinheritanceFactory)EPackage.Registry.INSTANCE.getEFactory("http://xsd.tns.example.com/testinheritance/model"); 
			if (theTestinheritanceFactory != null) {
				return theTestinheritanceFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TestinheritanceFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestinheritanceFactoryImpl() {
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
			case TestinheritancePackage.SOME_RESOURCE: return createSomeResource();
			case TestinheritancePackage.SOME_BASE_CLASS: return createSomeBaseClass();
			case TestinheritancePackage.SOME_OTHER_BASE_CLASS: return createSomeOtherBaseClass();
			case TestinheritancePackage.NAME_VALUE_PAIR: return createNameValuePair();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SomeResource createSomeResource() {
		SomeResourceImpl someResource = new SomeResourceImpl();
		return someResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SomeBaseClass createSomeBaseClass() {
		SomeBaseClassImpl someBaseClass = new SomeBaseClassImpl();
		return someBaseClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SomeOtherBaseClass createSomeOtherBaseClass() {
		SomeOtherBaseClassImpl someOtherBaseClass = new SomeOtherBaseClassImpl();
		return someOtherBaseClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NameValuePair createNameValuePair() {
		NameValuePairImpl nameValuePair = new NameValuePairImpl();
		return nameValuePair;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestinheritancePackage getTestinheritancePackage() {
		return (TestinheritancePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TestinheritancePackage getPackage() {
		return TestinheritancePackage.eINSTANCE;
	}

} //TestinheritanceFactoryImpl

/**
 */
package org.eclipse.emf.teneo.samples.issues.nonmandatoryjoincolumn.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.teneo.samples.issues.nonmandatoryjoincolumn.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class NonmandatoryjoincolumnFactoryImpl extends EFactoryImpl implements NonmandatoryjoincolumnFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static NonmandatoryjoincolumnFactory init() {
		try {
			NonmandatoryjoincolumnFactory theNonmandatoryjoincolumnFactory = (NonmandatoryjoincolumnFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/emf/teneo/samples/issues/nonmandatoryjoincolumn"); 
			if (theNonmandatoryjoincolumnFactory != null) {
				return theNonmandatoryjoincolumnFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new NonmandatoryjoincolumnFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NonmandatoryjoincolumnFactoryImpl() {
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
			case NonmandatoryjoincolumnPackage.FOO: return createFoo();
			case NonmandatoryjoincolumnPackage.BAR: return createBar();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Foo createFoo() {
		FooImpl foo = new FooImpl();
		return foo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bar createBar() {
		BarImpl bar = new BarImpl();
		return bar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NonmandatoryjoincolumnPackage getNonmandatoryjoincolumnPackage() {
		return (NonmandatoryjoincolumnPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static NonmandatoryjoincolumnPackage getPackage() {
		return NonmandatoryjoincolumnPackage.eINSTANCE;
	}

} //NonmandatoryjoincolumnFactoryImpl

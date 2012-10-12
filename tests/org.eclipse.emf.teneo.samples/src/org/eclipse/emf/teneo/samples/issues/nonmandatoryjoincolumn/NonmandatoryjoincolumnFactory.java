/**
 */
package org.eclipse.emf.teneo.samples.issues.nonmandatoryjoincolumn;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.teneo.samples.issues.nonmandatoryjoincolumn.NonmandatoryjoincolumnPackage
 * @generated
 */
public interface NonmandatoryjoincolumnFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	NonmandatoryjoincolumnFactory eINSTANCE = org.eclipse.emf.teneo.samples.issues.nonmandatoryjoincolumn.impl.NonmandatoryjoincolumnFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Foo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Foo</em>'.
	 * @generated
	 */
	Foo createFoo();

	/**
	 * Returns a new object of class '<em>Bar</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bar</em>'.
	 * @generated
	 */
	Bar createBar();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	NonmandatoryjoincolumnPackage getNonmandatoryjoincolumnPackage();

} //NonmandatoryjoincolumnFactory

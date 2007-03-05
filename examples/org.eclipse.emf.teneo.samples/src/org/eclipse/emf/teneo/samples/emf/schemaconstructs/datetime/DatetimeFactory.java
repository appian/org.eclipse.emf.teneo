/**
 * <copyright>
 * </copyright>
 *
 * $Id: DatetimeFactory.java,v 1.1.2.2 2007/03/05 18:07:52 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.schemaconstructs.datetime;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.datetime.DatetimePackage
 * @generated
 */
public interface DatetimeFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DatetimeFactory eINSTANCE = org.eclipse.emf.teneo.samples.emf.schemaconstructs.datetime.impl.DatetimeFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Root</em>'.
	 * @generated
	 */
	DocumentRoot createDocumentRoot();

	/**
	 * Returns a new object of class '<em>Test Date</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Test Date</em>'.
	 * @generated
	 */
	TestDate createTestDate();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DatetimePackage getDatetimePackage();

} //DatetimeFactory

/**
 * <copyright>
 * </copyright>
 *
 * $Id: TemporalFactory.java,v 1.1 2008/04/17 11:33:39 mtaal Exp $
 */
package temporal;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc --> The <b>Factory</b> for the model. It provides a create method for each
 * non-abstract class of the model. <!-- end-user-doc -->
 * 
 * @see temporal.TemporalPackage
 * @generated
 */
public interface TemporalFactory extends EFactory {
	/**
	 * The singleton instance of the factory. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	TemporalFactory eINSTANCE = temporal.impl.TemporalFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Temporal</em>'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return a new object of class '<em>Temporal</em>'.
	 * @generated
	 */
	Temporal createTemporal();

	/**
	 * Returns a new object of class '<em>Version Holder</em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return a new object of class '<em>Version Holder</em>'.
	 * @generated
	 */
	VersionHolder createVersionHolder();

	/**
	 * Returns the package supported by this factory. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the package supported by this factory.
	 * @generated
	 */
	TemporalPackage getTemporalPackage();

} // TemporalFactory

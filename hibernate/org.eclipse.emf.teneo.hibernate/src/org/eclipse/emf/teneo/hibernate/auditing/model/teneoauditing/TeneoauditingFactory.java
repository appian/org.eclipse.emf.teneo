/**
 */
package org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc --> The <b>Factory</b> for the model. It provides a create method for each
 * non-abstract class of the model. <!-- end-user-doc -->
 * @see org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing.TeneoauditingPackage
 * @generated
 */
public interface TeneoauditingFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	TeneoauditingFactory eINSTANCE = org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing.impl.TeneoauditingFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Teneo Audit Object</em>'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return a new object of class '<em>Teneo Audit Object</em>'.
	 * @generated
	 */
	TeneoAuditObject createTeneoAuditObject();

	/**
	 * Returns a new object of class '<em>Teneo Audit Commit Info</em>'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return a new object of class '<em>Teneo Audit Commit Info</em>'.
	 * @generated
	 */
	TeneoAuditCommitInfo createTeneoAuditCommitInfo();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TeneoauditingPackage getTeneoauditingPackage();

} // TeneoauditingFactory

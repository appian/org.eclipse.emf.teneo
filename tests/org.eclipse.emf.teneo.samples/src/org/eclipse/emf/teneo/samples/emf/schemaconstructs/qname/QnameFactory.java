/**
 * <copyright>
 * </copyright>
 *
 * $Id: QnameFactory.java,v 1.1 2007/11/15 19:56:40 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.schemaconstructs.qname;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.qname.QnamePackage
 * @generated
 */
public interface QnameFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QnameFactory eINSTANCE = org.eclipse.emf.teneo.samples.emf.schemaconstructs.qname.impl.QnameFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Root</em>'.
	 * @generated
	 */
	DocumentRoot createDocumentRoot();

	/**
	 * Returns a new object of class '<em>Mytest</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mytest</em>'.
	 * @generated
	 */
	Mytest createMytest();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	QnamePackage getQnamePackage();

} //QnameFactory

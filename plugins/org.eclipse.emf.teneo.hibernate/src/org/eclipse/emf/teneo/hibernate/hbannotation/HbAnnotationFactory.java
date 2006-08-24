/**
 * <copyright>
 * </copyright>
 *
 * $Id: HbAnnotationFactory.java,v 1.1 2006/08/24 22:12:52 mtaal Exp $
 */
package org.eclipse.emf.teneo.hibernate.hbannotation;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.teneo.hibernate.hbannotation.HbAnnotationPackage
 * @generated
 */
public interface HbAnnotationFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HbAnnotationFactory eINSTANCE = org.eclipse.emf.teneo.hibernate.hbannotation.impl.HbAnnotationFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Collection Of Elements</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Collection Of Elements</em>'.
	 * @generated
	 */
	CollectionOfElements createCollectionOfElements();

	/**
	 * Returns a new object of class '<em>Where</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Where</em>'.
	 * @generated
	 */
	Where createWhere();

	/**
	 * Returns a new object of class '<em>Cascade</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cascade</em>'.
	 * @generated
	 */
	Cascade createCascade();

	/**
	 * Returns a new object of class '<em>Columns</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Columns</em>'.
	 * @generated
	 */
	Columns createColumns();

	/**
	 * Returns a new object of class '<em>Map Key</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Map Key</em>'.
	 * @generated
	 */
	MapKey createMapKey();

	/**
	 * Returns a new object of class '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter</em>'.
	 * @generated
	 */
	Parameter createParameter();

	/**
	 * Returns a new object of class '<em>Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type</em>'.
	 * @generated
	 */
	Type createType();

	/**
	 * Returns a new object of class '<em>Id Bag</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Id Bag</em>'.
	 * @generated
	 */
	IdBag createIdBag();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	HbAnnotationPackage getHbAnnotationPackage();

} //HbAnnotationFactory

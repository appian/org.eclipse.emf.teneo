/**
 * <copyright>
 * </copyright>
 *
 * $Id: IntegerTypeImpl.java,v 1.1 2007/03/07 23:34:07 mtaal Exp $
 */
package datacore.types.impl;

import datacore.types.IntegerType;
import datacore.types.TypesPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Integer Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class IntegerTypeImpl extends CSMNumberTypeImpl implements IntegerType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntegerTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.Literals.INTEGER_TYPE;
	}

} //IntegerTypeImpl

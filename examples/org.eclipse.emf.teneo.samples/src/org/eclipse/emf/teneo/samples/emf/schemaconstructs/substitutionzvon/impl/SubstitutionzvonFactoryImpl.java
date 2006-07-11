/**
 * <copyright>
 * </copyright>
 *
 * $Id: SubstitutionzvonFactoryImpl.java,v 1.1 2006/07/11 16:56:58 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitutionzvon.impl;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitutionzvon.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SubstitutionzvonFactoryImpl extends EFactoryImpl implements SubstitutionzvonFactory {
	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubstitutionzvonFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case SubstitutionzvonPackage.COMPLEX_AAA: return createComplexAAA();
			case SubstitutionzvonPackage.COMPLEX_EVEN_TYPE: return createComplexEvenType();
			case SubstitutionzvonPackage.COMPLEX_ODD_TYPE: return createComplexOddType();
			case SubstitutionzvonPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case SubstitutionzvonPackage.ROOT_TYPE: return createRootType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case SubstitutionzvonPackage.AAA:
				return createAAAFromString(eDataType, initialValue);
			case SubstitutionzvonPackage.EVEN_TYPE:
				return createEvenTypeFromString(eDataType, initialValue);
			case SubstitutionzvonPackage.ODD_TYPE:
				return createOddTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case SubstitutionzvonPackage.AAA:
				return convertAAAToString(eDataType, instanceValue);
			case SubstitutionzvonPackage.EVEN_TYPE:
				return convertEvenTypeToString(eDataType, instanceValue);
			case SubstitutionzvonPackage.ODD_TYPE:
				return convertOddTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComplexAAA createComplexAAA() {
		ComplexAAAImpl complexAAA = new ComplexAAAImpl();
		return complexAAA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComplexEvenType createComplexEvenType() {
		ComplexEvenTypeImpl complexEvenType = new ComplexEvenTypeImpl();
		return complexEvenType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComplexOddType createComplexOddType() {
		ComplexOddTypeImpl complexOddType = new ComplexOddTypeImpl();
		return complexOddType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RootType createRootType() {
		RootTypeImpl rootType = new RootTypeImpl();
		return rootType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createAAAFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.eINSTANCE.getInteger(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAAAToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.eINSTANCE.getInteger(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createEvenTypeFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)SubstitutionzvonFactory.eINSTANCE.createFromString(SubstitutionzvonPackage.eINSTANCE.getAAA(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEvenTypeToString(EDataType eDataType, Object instanceValue) {
		return SubstitutionzvonFactory.eINSTANCE.convertToString(SubstitutionzvonPackage.eINSTANCE.getAAA(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createOddTypeFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)SubstitutionzvonFactory.eINSTANCE.createFromString(SubstitutionzvonPackage.eINSTANCE.getAAA(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOddTypeToString(EDataType eDataType, Object instanceValue) {
		return SubstitutionzvonFactory.eINSTANCE.convertToString(SubstitutionzvonPackage.eINSTANCE.getAAA(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubstitutionzvonPackage getSubstitutionzvonPackage() {
		return (SubstitutionzvonPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	public static SubstitutionzvonPackage getPackage() {
		return SubstitutionzvonPackage.eINSTANCE;
	}

} //SubstitutionzvonFactoryImpl

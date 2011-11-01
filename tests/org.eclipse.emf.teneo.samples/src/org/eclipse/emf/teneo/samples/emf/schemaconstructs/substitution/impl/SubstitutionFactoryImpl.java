/**
 * <copyright>
 * </copyright>
 *
 * $Id: SubstitutionFactoryImpl.java,v 1.1 2006/07/11 16:57:11 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution.impl;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SubstitutionFactoryImpl extends EFactoryImpl implements SubstitutionFactory {
	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubstitutionFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case SubstitutionPackage.COMPLEX_NUMBER: return createComplexNumber();
			case SubstitutionPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case SubstitutionPackage.EVEN_COMPLEX_NUMBER_TYPE: return createEvenComplexNumberType();
			case SubstitutionPackage.MULTI_NUMBER_TYPE: return createMultiNumberType();
			case SubstitutionPackage.NUMBER_TYPE: return createNumberType();
			case SubstitutionPackage.ODD_COMPLEX_NUMBER_TYPE: return createOddComplexNumberType();
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
			case SubstitutionPackage.EVEN_TYPE:
				return createEvenTypeFromString(eDataType, initialValue);
			case SubstitutionPackage.ODD_TYPE:
				return createOddTypeFromString(eDataType, initialValue);
			case SubstitutionPackage.SIMPLE_NUMBER:
				return createSimpleNumberFromString(eDataType, initialValue);
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
			case SubstitutionPackage.EVEN_TYPE:
				return convertEvenTypeToString(eDataType, instanceValue);
			case SubstitutionPackage.ODD_TYPE:
				return convertOddTypeToString(eDataType, instanceValue);
			case SubstitutionPackage.SIMPLE_NUMBER:
				return convertSimpleNumberToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComplexNumber createComplexNumber() {
		ComplexNumberImpl complexNumber = new ComplexNumberImpl();
		return complexNumber;
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
	public EvenComplexNumberType createEvenComplexNumberType() {
		EvenComplexNumberTypeImpl evenComplexNumberType = new EvenComplexNumberTypeImpl();
		return evenComplexNumberType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiNumberType createMultiNumberType() {
		MultiNumberTypeImpl multiNumberType = new MultiNumberTypeImpl();
		return multiNumberType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumberType createNumberType() {
		NumberTypeImpl numberType = new NumberTypeImpl();
		return numberType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OddComplexNumberType createOddComplexNumberType() {
		OddComplexNumberTypeImpl oddComplexNumberType = new OddComplexNumberTypeImpl();
		return oddComplexNumberType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createEvenTypeFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)SubstitutionFactory.eINSTANCE.createFromString(SubstitutionPackage.eINSTANCE.getSimpleNumber(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEvenTypeToString(EDataType eDataType, Object instanceValue) {
		return SubstitutionFactory.eINSTANCE.convertToString(SubstitutionPackage.eINSTANCE.getSimpleNumber(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createOddTypeFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)SubstitutionFactory.eINSTANCE.createFromString(SubstitutionPackage.eINSTANCE.getSimpleNumber(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOddTypeToString(EDataType eDataType, Object instanceValue) {
		return SubstitutionFactory.eINSTANCE.convertToString(SubstitutionPackage.eINSTANCE.getSimpleNumber(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createSimpleNumberFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.eINSTANCE.getInteger(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSimpleNumberToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.eINSTANCE.getInteger(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubstitutionPackage getSubstitutionPackage() {
		return (SubstitutionPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	public static SubstitutionPackage getPackage() {
		return SubstitutionPackage.eINSTANCE;
	}

} //SubstitutionFactoryImpl

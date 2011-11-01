/**
 * <copyright>
 * </copyright>
 *
 * $Id: ListunionFactoryImpl.java,v 1.2 2007/02/08 23:09:25 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.schemaconstructs.listunion.impl;

import java.math.BigInteger;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.eclipse.emf.teneo.samples.emf.schemaconstructs.listunion.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ListunionFactoryImpl extends EFactoryImpl implements ListunionFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ListunionFactory init() {
		try {
			ListunionFactory theListunionFactory = (ListunionFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/emf/teneo/samples/emf/schemaconstructs/listunion"); 
			if (theListunionFactory != null) {
				return theListunionFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ListunionFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListunionFactoryImpl() {
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
			case ListunionPackage.STATES_BY_COUNTRY: return createstatesByCountry();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ListunionPackage.SIMPLE_STRING_UNION_TYPE:
				return createSimpleStringUnionTypeFromString(eDataType, initialValue);
			case ListunionPackage.SIMPLE_STRING_UNION_TYPE_MEMBER0:
				return createSimpleStringUnionTypeMember0FromString(eDataType, initialValue);
			case ListunionPackage.SIMPLE_STRING_UNION_TYPE_MEMBER1:
				return createSimpleStringUnionTypeMember1FromString(eDataType, initialValue);
			case ListunionPackage.SIMPLE_UNION_TYPE:
				return createSimpleUnionTypeFromString(eDataType, initialValue);
			case ListunionPackage.SIMPLE_UNION_TYPE_MEMBER0:
				return createSimpleUnionTypeMember0FromString(eDataType, initialValue);
			case ListunionPackage.SIMPLE_UNION_TYPE_MEMBER1:
				return createSimpleUnionTypeMember1FromString(eDataType, initialValue);
			case ListunionPackage.SIX_STATES_LIST:
				return createSixStatesListFromString(eDataType, initialValue);
			case ListunionPackage.STATE:
				return createStateFromString(eDataType, initialValue);
			case ListunionPackage.STATE_LIST:
				return createStateListFromString(eDataType, initialValue);
			case ListunionPackage.STRING_LIST:
				return createStringListFromString(eDataType, initialValue);
			case ListunionPackage.ZIP_CODE:
				return createZipCodeFromString(eDataType, initialValue);
			case ListunionPackage.ZIP_UNIONS_TYPE:
				return createZipUnionsTypeFromString(eDataType, initialValue);
			case ListunionPackage.ZIP_UNION_TYPE:
				return createZipUnionTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ListunionPackage.SIMPLE_STRING_UNION_TYPE:
				return convertSimpleStringUnionTypeToString(eDataType, instanceValue);
			case ListunionPackage.SIMPLE_STRING_UNION_TYPE_MEMBER0:
				return convertSimpleStringUnionTypeMember0ToString(eDataType, instanceValue);
			case ListunionPackage.SIMPLE_STRING_UNION_TYPE_MEMBER1:
				return convertSimpleStringUnionTypeMember1ToString(eDataType, instanceValue);
			case ListunionPackage.SIMPLE_UNION_TYPE:
				return convertSimpleUnionTypeToString(eDataType, instanceValue);
			case ListunionPackage.SIMPLE_UNION_TYPE_MEMBER0:
				return convertSimpleUnionTypeMember0ToString(eDataType, instanceValue);
			case ListunionPackage.SIMPLE_UNION_TYPE_MEMBER1:
				return convertSimpleUnionTypeMember1ToString(eDataType, instanceValue);
			case ListunionPackage.SIX_STATES_LIST:
				return convertSixStatesListToString(eDataType, instanceValue);
			case ListunionPackage.STATE:
				return convertStateToString(eDataType, instanceValue);
			case ListunionPackage.STATE_LIST:
				return convertStateListToString(eDataType, instanceValue);
			case ListunionPackage.STRING_LIST:
				return convertStringListToString(eDataType, instanceValue);
			case ListunionPackage.ZIP_CODE:
				return convertZipCodeToString(eDataType, instanceValue);
			case ListunionPackage.ZIP_UNIONS_TYPE:
				return convertZipUnionsTypeToString(eDataType, instanceValue);
			case ListunionPackage.ZIP_UNION_TYPE:
				return convertZipUnionTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public statesByCountry createstatesByCountry() {
		statesByCountryImpl statesByCountry = new statesByCountryImpl();
		return statesByCountry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createSimpleStringUnionTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		String result = null;
		RuntimeException exception = null;
		try {
			result = createSimpleStringUnionTypeMember0FromString(ListunionPackage.Literals.SIMPLE_STRING_UNION_TYPE_MEMBER0, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createSimpleStringUnionTypeMember1FromString(ListunionPackage.Literals.SIMPLE_STRING_UNION_TYPE_MEMBER1, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSimpleStringUnionTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (ListunionPackage.Literals.SIMPLE_STRING_UNION_TYPE_MEMBER0.isInstance(instanceValue)) {
			try {
				String value = convertSimpleStringUnionTypeMember0ToString(ListunionPackage.Literals.SIMPLE_STRING_UNION_TYPE_MEMBER0, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (ListunionPackage.Literals.SIMPLE_STRING_UNION_TYPE_MEMBER1.isInstance(instanceValue)) {
			try {
				String value = convertSimpleStringUnionTypeMember1ToString(ListunionPackage.Literals.SIMPLE_STRING_UNION_TYPE_MEMBER1, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createSimpleStringUnionTypeMember0FromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSimpleStringUnionTypeMember0ToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createSimpleStringUnionTypeMember1FromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSimpleStringUnionTypeMember1ToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createSimpleUnionTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = createSimpleUnionTypeMember0FromString(ListunionPackage.Literals.SIMPLE_UNION_TYPE_MEMBER0, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createSimpleUnionTypeMember1FromString(ListunionPackage.Literals.SIMPLE_UNION_TYPE_MEMBER1, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSimpleUnionTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (ListunionPackage.Literals.SIMPLE_UNION_TYPE_MEMBER0.isInstance(instanceValue)) {
			try {
				String value = convertSimpleUnionTypeMember0ToString(ListunionPackage.Literals.SIMPLE_UNION_TYPE_MEMBER0, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (ListunionPackage.Literals.SIMPLE_UNION_TYPE_MEMBER1.isInstance(instanceValue)) {
			try {
				String value = convertSimpleUnionTypeMember1ToString(ListunionPackage.Literals.SIMPLE_UNION_TYPE_MEMBER1, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createSimpleUnionTypeMember0FromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSimpleUnionTypeMember0ToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createSimpleUnionTypeMember1FromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSimpleUnionTypeMember1ToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<String> createSixStatesListFromString(EDataType eDataType, String initialValue) {
		return createStateListFromString(ListunionPackage.Literals.STATE_LIST, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSixStatesListToString(EDataType eDataType, Object instanceValue) {
		return convertStateListToString(ListunionPackage.Literals.STATE_LIST, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createStateFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStateToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<String> createStateListFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		List<String> result = new ArrayList<String>();
		for (StringTokenizer stringTokenizer = new StringTokenizer(initialValue); stringTokenizer.hasMoreTokens(); ) {
			String item = stringTokenizer.nextToken();
			result.add(createStateFromString(ListunionPackage.Literals.STATE, item));
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStateListToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		List<?> list = (List<?>)instanceValue;
		if (list.isEmpty()) return "";
		StringBuffer result = new StringBuffer();
		for (Object item : list) {
			result.append(convertStateToString(ListunionPackage.Literals.STATE, item));
			result.append(' ');
		}
		return result.substring(0, result.length() - 1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<String> createStringListFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		List<String> result = new ArrayList<String>();
		for (StringTokenizer stringTokenizer = new StringTokenizer(initialValue); stringTokenizer.hasMoreTokens(); ) {
			String item = stringTokenizer.nextToken();
			result.add((String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, item));
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStringListToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		List<?> list = (List<?>)instanceValue;
		if (list.isEmpty()) return "";
		StringBuffer result = new StringBuffer();
		for (Object item : list) {
			result.append(XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, item));
			result.append(' ');
		}
		return result.substring(0, result.length() - 1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createZipCodeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertZipCodeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createZipUnionsTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		String result = null;
		RuntimeException exception = null;
		try {
			result = createZipCodeFromString(ListunionPackage.Literals.ZIP_CODE, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createStateFromString(ListunionPackage.Literals.STATE, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertZipUnionsTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (ListunionPackage.Literals.ZIP_CODE.isInstance(instanceValue)) {
			try {
				String value = convertZipCodeToString(ListunionPackage.Literals.ZIP_CODE, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (ListunionPackage.Literals.STATE.isInstance(instanceValue)) {
			try {
				String value = convertStateToString(ListunionPackage.Literals.STATE, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createZipUnionTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		String result = null;
		RuntimeException exception = null;
		try {
			result = createZipCodeFromString(ListunionPackage.Literals.ZIP_CODE, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createStateFromString(ListunionPackage.Literals.STATE, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertZipUnionTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (ListunionPackage.Literals.ZIP_CODE.isInstance(instanceValue)) {
			try {
				String value = convertZipCodeToString(ListunionPackage.Literals.ZIP_CODE, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (ListunionPackage.Literals.STATE.isInstance(instanceValue)) {
			try {
				String value = convertStateToString(ListunionPackage.Literals.STATE, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListunionPackage getListunionPackage() {
		return (ListunionPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ListunionPackage getPackage() {
		return ListunionPackage.eINSTANCE;
	}

} //ListunionFactoryImpl

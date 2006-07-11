/**
 * <copyright>
 * </copyright>
 *
 * $Id: ListunionFactoryImpl.java,v 1.1 2006/07/11 16:57:15 mtaal Exp $
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

import org.eclipse.emf.ecore.impl.EFactoryImpl;

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
		try {
			String result = (String)ListunionFactory.eINSTANCE.createFromString(ListunionPackage.eINSTANCE.getSimpleStringUnionTypeMember0(), initialValue);
			if (result != null) {
				return result;
			}
		}
		catch (RuntimeException exception) {
		}
		return (String)ListunionFactory.eINSTANCE.createFromString(ListunionPackage.eINSTANCE.getSimpleStringUnionTypeMember1(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSimpleStringUnionTypeToString(EDataType eDataType, Object instanceValue) {
		if (ListunionPackage.eINSTANCE.getSimpleStringUnionTypeMember0().isInstance(instanceValue)) {
			try {
				String value = ListunionFactory.eINSTANCE.convertToString(ListunionPackage.eINSTANCE.getSimpleStringUnionTypeMember0(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
			}
		}
		if (ListunionPackage.eINSTANCE.getSimpleStringUnionTypeMember1().isInstance(instanceValue)) {
			try {
				String value = ListunionFactory.eINSTANCE.convertToString(ListunionPackage.eINSTANCE.getSimpleStringUnionTypeMember1(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
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
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.eINSTANCE.getString(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSimpleStringUnionTypeMember0ToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.eINSTANCE.getString(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createSimpleStringUnionTypeMember1FromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.eINSTANCE.getString(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSimpleStringUnionTypeMember1ToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.eINSTANCE.getString(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createSimpleUnionTypeFromString(EDataType eDataType, String initialValue) {
		try {
			Object result = (Object)ListunionFactory.eINSTANCE.createFromString(ListunionPackage.eINSTANCE.getSimpleUnionTypeMember0(), initialValue);
			if (result != null) {
				return result;
			}
		}
		catch (RuntimeException exception) {
		}
		return (Object)ListunionFactory.eINSTANCE.createFromString(ListunionPackage.eINSTANCE.getSimpleUnionTypeMember1(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSimpleUnionTypeToString(EDataType eDataType, Object instanceValue) {
		if (ListunionPackage.eINSTANCE.getSimpleUnionTypeMember0().isInstance(instanceValue)) {
			try {
				String value = ListunionFactory.eINSTANCE.convertToString(ListunionPackage.eINSTANCE.getSimpleUnionTypeMember0(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
			}
		}
		if (ListunionPackage.eINSTANCE.getSimpleUnionTypeMember1().isInstance(instanceValue)) {
			try {
				String value = ListunionFactory.eINSTANCE.convertToString(ListunionPackage.eINSTANCE.getSimpleUnionTypeMember1(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
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
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.eINSTANCE.getInteger(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSimpleUnionTypeMember0ToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.eINSTANCE.getInteger(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createSimpleUnionTypeMember1FromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.eINSTANCE.getString(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSimpleUnionTypeMember1ToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.eINSTANCE.getString(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List createSixStatesListFromString(EDataType eDataType, String initialValue) {
		return (List)ListunionFactory.eINSTANCE.createFromString(ListunionPackage.eINSTANCE.getStateList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSixStatesListToString(EDataType eDataType, Object instanceValue) {
		return ListunionFactory.eINSTANCE.convertToString(ListunionPackage.eINSTANCE.getStateList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createStateFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.eINSTANCE.getString(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStateToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.eINSTANCE.getString(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List createStateListFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		List result = new ArrayList();
		for (StringTokenizer stringTokenizer = new StringTokenizer(initialValue); stringTokenizer.hasMoreTokens(); ) {
			String item = stringTokenizer.nextToken();
			result.add(ListunionFactory.eINSTANCE.createFromString(ListunionPackage.eINSTANCE.getState(), item));
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
		List list = (List)instanceValue;
		if (list.isEmpty()) return "";
		StringBuffer result = new StringBuffer();
		for (Iterator i = list.iterator(); i.hasNext(); ) {
			result.append(ListunionFactory.eINSTANCE.convertToString(ListunionPackage.eINSTANCE.getState(), i.next()));
			result.append(' ');
		}
		return result.substring(0, result.length() - 1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List createStringListFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		List result = new ArrayList();
		for (StringTokenizer stringTokenizer = new StringTokenizer(initialValue); stringTokenizer.hasMoreTokens(); ) {
			String item = stringTokenizer.nextToken();
			result.add(XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.eINSTANCE.getString(), item));
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
		List list = (List)instanceValue;
		if (list.isEmpty()) return "";
		StringBuffer result = new StringBuffer();
		for (Iterator i = list.iterator(); i.hasNext(); ) {
			result.append(XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.eINSTANCE.getString(), i.next()));
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
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.eINSTANCE.getString(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertZipCodeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.eINSTANCE.getString(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createZipUnionsTypeFromString(EDataType eDataType, String initialValue) {
		try {
			String result = (String)ListunionFactory.eINSTANCE.createFromString(ListunionPackage.eINSTANCE.getZipCode(), initialValue);
			if (result != null) {
				return result;
			}
		}
		catch (RuntimeException exception) {
		}
		return (String)ListunionFactory.eINSTANCE.createFromString(ListunionPackage.eINSTANCE.getState(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertZipUnionsTypeToString(EDataType eDataType, Object instanceValue) {
		if (ListunionPackage.eINSTANCE.getZipCode().isInstance(instanceValue)) {
			try {
				String value = ListunionFactory.eINSTANCE.convertToString(ListunionPackage.eINSTANCE.getZipCode(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
			}
		}
		if (ListunionPackage.eINSTANCE.getState().isInstance(instanceValue)) {
			try {
				String value = ListunionFactory.eINSTANCE.convertToString(ListunionPackage.eINSTANCE.getState(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
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
		try {
			String result = (String)ListunionFactory.eINSTANCE.createFromString(ListunionPackage.eINSTANCE.getZipCode(), initialValue);
			if (result != null) {
				return result;
			}
		}
		catch (RuntimeException exception) {
		}
		return (String)ListunionFactory.eINSTANCE.createFromString(ListunionPackage.eINSTANCE.getState(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertZipUnionTypeToString(EDataType eDataType, Object instanceValue) {
		if (ListunionPackage.eINSTANCE.getZipCode().isInstance(instanceValue)) {
			try {
				String value = ListunionFactory.eINSTANCE.convertToString(ListunionPackage.eINSTANCE.getZipCode(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
			}
		}
		if (ListunionPackage.eINSTANCE.getState().isInstance(instanceValue)) {
			try {
				String value = ListunionFactory.eINSTANCE.convertToString(ListunionPackage.eINSTANCE.getState(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
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
	public static ListunionPackage getPackage() {
		return ListunionPackage.eINSTANCE;
	}

} //ListunionFactoryImpl

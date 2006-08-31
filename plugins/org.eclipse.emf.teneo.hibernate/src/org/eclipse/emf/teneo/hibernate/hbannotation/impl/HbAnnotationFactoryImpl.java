/**
 * <copyright>
 * </copyright>
 *
 * $Id: HbAnnotationFactoryImpl.java,v 1.2 2006/08/31 22:47:19 mtaal Exp $
 */
package org.eclipse.emf.teneo.hibernate.hbannotation.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.teneo.hibernate.hbannotation.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class HbAnnotationFactoryImpl extends EFactoryImpl implements HbAnnotationFactory {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2005, 2006 Springsite BV (The Netherlands) and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public\nLicense v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n   Martin Taal\n   Douglas Bitting\n";

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static HbAnnotationFactory init() {
		try {
			HbAnnotationFactory theHbAnnotationFactory = (HbAnnotationFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/emf/teneo/2006/HbAnnotation"); 
			if (theHbAnnotationFactory != null) {
				return theHbAnnotationFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new HbAnnotationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HbAnnotationFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case HbAnnotationPackage.CASCADE: return createCascade();
			case HbAnnotationPackage.COLLECTION_OF_ELEMENTS: return createCollectionOfElements();
			case HbAnnotationPackage.COLUMNS: return createColumns();
			case HbAnnotationPackage.MAP_KEY: return createMapKey();
			case HbAnnotationPackage.PARAMETER: return createParameter();
			case HbAnnotationPackage.TYPE: return createType();
			case HbAnnotationPackage.WHERE: return createWhere();
			case HbAnnotationPackage.ID_BAG: return createIdBag();
			case HbAnnotationPackage.GENERIC_GENERATOR: return createGenericGenerator();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectionOfElements createCollectionOfElements() {
		CollectionOfElementsImpl collectionOfElements = new CollectionOfElementsImpl();
		return collectionOfElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Where createWhere() {
		WhereImpl where = new WhereImpl();
		return where;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cascade createCascade() {
		CascadeImpl cascade = new CascadeImpl();
		return cascade;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Columns createColumns() {
		ColumnsImpl columns = new ColumnsImpl();
		return columns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MapKey createMapKey() {
		MapKeyImpl mapKey = new MapKeyImpl();
		return mapKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter createParameter() {
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type createType() {
		TypeImpl type = new TypeImpl();
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdBag createIdBag() {
		IdBagImpl idBag = new IdBagImpl();
		return idBag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenericGenerator createGenericGenerator() {
		GenericGeneratorImpl genericGenerator = new GenericGeneratorImpl();
		return genericGenerator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HbAnnotationPackage getHbAnnotationPackage() {
		return (HbAnnotationPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	public static HbAnnotationPackage getPackage() {
		return HbAnnotationPackage.eINSTANCE;
	}

} //HbAnnotationFactoryImpl

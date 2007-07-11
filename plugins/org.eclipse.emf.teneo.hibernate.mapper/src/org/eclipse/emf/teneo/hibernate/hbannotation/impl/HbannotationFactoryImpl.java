/**
 * <copyright>
 * </copyright>
 *
 * $Id: HbannotationFactoryImpl.java,v 1.3 2007/07/11 17:35:11 mtaal Exp $
 */
package org.eclipse.emf.teneo.hibernate.hbannotation.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.teneo.hibernate.hbannotation.*;
import org.eclipse.emf.teneo.hibernate.hbannotation.Cache;
import org.eclipse.emf.teneo.hibernate.hbannotation.CacheConcurrencyStrategy;
import org.eclipse.emf.teneo.hibernate.hbannotation.Cascade;
import org.eclipse.emf.teneo.hibernate.hbannotation.CollectionOfElements;
import org.eclipse.emf.teneo.hibernate.hbannotation.Fetch;
import org.eclipse.emf.teneo.hibernate.hbannotation.GenericGenerator;
import org.eclipse.emf.teneo.hibernate.hbannotation.HbFetchType;
import org.eclipse.emf.teneo.hibernate.hbannotation.HbannotationFactory;
import org.eclipse.emf.teneo.hibernate.hbannotation.HbannotationPackage;
import org.eclipse.emf.teneo.hibernate.hbannotation.IdBag;
import org.eclipse.emf.teneo.hibernate.hbannotation.Index;
import org.eclipse.emf.teneo.hibernate.hbannotation.MapKey;
import org.eclipse.emf.teneo.hibernate.hbannotation.OnDelete;
import org.eclipse.emf.teneo.hibernate.hbannotation.OnDeleteAction;
import org.eclipse.emf.teneo.hibernate.hbannotation.Parameter;
import org.eclipse.emf.teneo.hibernate.hbannotation.Proxy;
import org.eclipse.emf.teneo.hibernate.hbannotation.Type;
import org.eclipse.emf.teneo.hibernate.hbannotation.TypeDef;
import org.eclipse.emf.teneo.hibernate.hbannotation.Where;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!-- end-user-doc -->
 * @generated
 */
public class HbannotationFactoryImpl extends EFactoryImpl implements HbannotationFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static HbannotationFactory init() {
		try {
			HbannotationFactory theHbannotationFactory = (HbannotationFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/emf/teneo/2006/HbAnnotation"); 
			if (theHbannotationFactory != null) {
				return theHbannotationFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new HbannotationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public HbannotationFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case HbannotationPackage.CASCADE: return createCascade();
			case HbannotationPackage.COLLECTION_OF_ELEMENTS: return createCollectionOfElements();
			case HbannotationPackage.MAP_KEY: return createMapKey();
			case HbannotationPackage.PARAMETER: return createParameter();
			case HbannotationPackage.TYPE: return createType();
			case HbannotationPackage.WHERE: return createWhere();
			case HbannotationPackage.ID_BAG: return createIdBag();
			case HbannotationPackage.GENERIC_GENERATOR: return createGenericGenerator();
			case HbannotationPackage.CACHE: return createCache();
			case HbannotationPackage.TYPE_DEF: return createTypeDef();
			case HbannotationPackage.FETCH: return createFetch();
			case HbannotationPackage.ON_DELETE: return createOnDelete();
			case HbannotationPackage.PROXY: return createProxy();
			case HbannotationPackage.INDEX: return createIndex();
			case HbannotationPackage.GENERATED: return createGenerated();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case HbannotationPackage.CACHE_CONCURRENCY_STRATEGY:
				return createCacheConcurrencyStrategyFromString(eDataType, initialValue);
			case HbannotationPackage.HB_FETCH_TYPE:
				return createHbFetchTypeFromString(eDataType, initialValue);
			case HbannotationPackage.ON_DELETE_ACTION:
				return createOnDeleteActionFromString(eDataType, initialValue);
			case HbannotationPackage.GENERATION_TIME:
				return createGenerationTimeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case HbannotationPackage.CACHE_CONCURRENCY_STRATEGY:
				return convertCacheConcurrencyStrategyToString(eDataType, instanceValue);
			case HbannotationPackage.HB_FETCH_TYPE:
				return convertHbFetchTypeToString(eDataType, instanceValue);
			case HbannotationPackage.ON_DELETE_ACTION:
				return convertOnDeleteActionToString(eDataType, instanceValue);
			case HbannotationPackage.GENERATION_TIME:
				return convertGenerationTimeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Cascade createCascade() {
		CascadeImpl cascade = new CascadeImpl();
		return cascade;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public CollectionOfElements createCollectionOfElements() {
		CollectionOfElementsImpl collectionOfElements = new CollectionOfElementsImpl();
		return collectionOfElements;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public MapKey createMapKey() {
		MapKeyImpl mapKey = new MapKeyImpl();
		return mapKey;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter createParameter() {
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Type createType() {
		TypeImpl type = new TypeImpl();
		return type;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Where createWhere() {
		WhereImpl where = new WhereImpl();
		return where;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public IdBag createIdBag() {
		IdBagImpl idBag = new IdBagImpl();
		return idBag;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public GenericGenerator createGenericGenerator() {
		GenericGeneratorImpl genericGenerator = new GenericGeneratorImpl();
		return genericGenerator;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Cache createCache() {
		CacheImpl cache = new CacheImpl();
		return cache;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDef createTypeDef() {
		TypeDefImpl typeDef = new TypeDefImpl();
		return typeDef;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Fetch createFetch() {
		FetchImpl fetch = new FetchImpl();
		return fetch;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public OnDelete createOnDelete() {
		OnDeleteImpl onDelete = new OnDeleteImpl();
		return onDelete;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Proxy createProxy() {
		ProxyImpl proxy = new ProxyImpl();
		return proxy;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Index createIndex() {
		IndexImpl index = new IndexImpl();
		return index;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Generated createGenerated() {
		GeneratedImpl generated = new GeneratedImpl();
		return generated;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public CacheConcurrencyStrategy createCacheConcurrencyStrategyFromString(EDataType eDataType, String initialValue) {
		CacheConcurrencyStrategy result = CacheConcurrencyStrategy.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCacheConcurrencyStrategyToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public HbFetchType createHbFetchTypeFromString(EDataType eDataType, String initialValue) {
		HbFetchType result = HbFetchType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHbFetchTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public OnDeleteAction createOnDeleteActionFromString(EDataType eDataType, String initialValue) {
		OnDeleteAction result = OnDeleteAction.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOnDeleteActionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenerationTime createGenerationTimeFromString(EDataType eDataType, String initialValue) {
		GenerationTime result = GenerationTime.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGenerationTimeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public HbannotationPackage getHbannotationPackage() {
		return (HbannotationPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static HbannotationPackage getPackage() {
		return HbannotationPackage.eINSTANCE;
	}

} // HbannotationFactoryImpl

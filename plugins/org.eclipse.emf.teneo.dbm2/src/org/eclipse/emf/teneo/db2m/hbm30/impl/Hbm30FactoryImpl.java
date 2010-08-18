/**
 * <copyright>
 * </copyright>
 *
 * $Id: Hbm30FactoryImpl.java,v 1.1 2010/08/18 09:21:39 cbouhier Exp $
 */
package org.eclipse.emf.teneo.db2m.hbm30.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.teneo.db2m.hbm30.Any;
import org.eclipse.emf.teneo.db2m.hbm30.Array;
import org.eclipse.emf.teneo.db2m.hbm30.Bag;
import org.eclipse.emf.teneo.db2m.hbm30.Cache;
import org.eclipse.emf.teneo.db2m.hbm30.Cachemode;
import org.eclipse.emf.teneo.db2m.hbm30.Collection;
import org.eclipse.emf.teneo.db2m.hbm30.CollectionId;
import org.eclipse.emf.teneo.db2m.hbm30.Column;
import org.eclipse.emf.teneo.db2m.hbm30.Component;
import org.eclipse.emf.teneo.db2m.hbm30.CompositeElement;
import org.eclipse.emf.teneo.db2m.hbm30.CompositeId;
import org.eclipse.emf.teneo.db2m.hbm30.CompositeIndex;
import org.eclipse.emf.teneo.db2m.hbm30.CompositeMapKey;
import org.eclipse.emf.teneo.db2m.hbm30.DatabaseObject;
import org.eclipse.emf.teneo.db2m.hbm30.Definition;
import org.eclipse.emf.teneo.db2m.hbm30.DialectScope;
import org.eclipse.emf.teneo.db2m.hbm30.Discriminator;
import org.eclipse.emf.teneo.db2m.hbm30.DynamicComponent;
import org.eclipse.emf.teneo.db2m.hbm30.Element;
import org.eclipse.emf.teneo.db2m.hbm30.EntityModeType;
import org.eclipse.emf.teneo.db2m.hbm30.Fetch;
import org.eclipse.emf.teneo.db2m.hbm30.FetchJoinSelect;
import org.eclipse.emf.teneo.db2m.hbm30.Filter;
import org.eclipse.emf.teneo.db2m.hbm30.FilterDef;
import org.eclipse.emf.teneo.db2m.hbm30.FilterParam;
import org.eclipse.emf.teneo.db2m.hbm30.Flushmode;
import org.eclipse.emf.teneo.db2m.hbm30.Generated;
import org.eclipse.emf.teneo.db2m.hbm30.GeneratedNeverAlways;
import org.eclipse.emf.teneo.db2m.hbm30.Generator;
import org.eclipse.emf.teneo.db2m.hbm30.Hbm30Factory;
import org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package;
import org.eclipse.emf.teneo.db2m.hbm30.HibernateMapping;
import org.eclipse.emf.teneo.db2m.hbm30.Id;
import org.eclipse.emf.teneo.db2m.hbm30.Idbag;
import org.eclipse.emf.teneo.db2m.hbm30.Import;
import org.eclipse.emf.teneo.db2m.hbm30.IncludeType;
import org.eclipse.emf.teneo.db2m.hbm30.Index;
import org.eclipse.emf.teneo.db2m.hbm30.IndexManyToAny;
import org.eclipse.emf.teneo.db2m.hbm30.IndexManyToMany;
import org.eclipse.emf.teneo.db2m.hbm30.Join;
import org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass;
import org.eclipse.emf.teneo.db2m.hbm30.Key;
import org.eclipse.emf.teneo.db2m.hbm30.KeyManyToOne;
import org.eclipse.emf.teneo.db2m.hbm30.KeyProperty;
import org.eclipse.emf.teneo.db2m.hbm30.Lazy;
import org.eclipse.emf.teneo.db2m.hbm30.LazyFalseProxy;
import org.eclipse.emf.teneo.db2m.hbm30.LazyTrueFalseExtra;
import org.eclipse.emf.teneo.db2m.hbm30.List;
import org.eclipse.emf.teneo.db2m.hbm30.ListIndex;
import org.eclipse.emf.teneo.db2m.hbm30.LoadCollection;
import org.eclipse.emf.teneo.db2m.hbm30.Loader;
import org.eclipse.emf.teneo.db2m.hbm30.Lockmode;
import org.eclipse.emf.teneo.db2m.hbm30.ManyToAny;
import org.eclipse.emf.teneo.db2m.hbm30.ManyToMany;
import org.eclipse.emf.teneo.db2m.hbm30.ManyToOne;
import org.eclipse.emf.teneo.db2m.hbm30.Map;
import org.eclipse.emf.teneo.db2m.hbm30.MapKey;
import org.eclipse.emf.teneo.db2m.hbm30.MapKeyManyToMany;
import org.eclipse.emf.teneo.db2m.hbm30.Meta;
import org.eclipse.emf.teneo.db2m.hbm30.MetaValue;
import org.eclipse.emf.teneo.db2m.hbm30.NaturalId;
import org.eclipse.emf.teneo.db2m.hbm30.NestedCompositeElement;
import org.eclipse.emf.teneo.db2m.hbm30.Notfound;
import org.eclipse.emf.teneo.db2m.hbm30.OnDeleteType;
import org.eclipse.emf.teneo.db2m.hbm30.OneToMany;
import org.eclipse.emf.teneo.db2m.hbm30.OneToOne;
import org.eclipse.emf.teneo.db2m.hbm30.OptimisticLockType;
import org.eclipse.emf.teneo.db2m.hbm30.Outerjoin;
import org.eclipse.emf.teneo.db2m.hbm30.Param;
import org.eclipse.emf.teneo.db2m.hbm30.Parent;
import org.eclipse.emf.teneo.db2m.hbm30.PolymorphismType;
import org.eclipse.emf.teneo.db2m.hbm30.PrimitiveArray;
import org.eclipse.emf.teneo.db2m.hbm30.Properties;
import org.eclipse.emf.teneo.db2m.hbm30.Property;
import org.eclipse.emf.teneo.db2m.hbm30.Query;
import org.eclipse.emf.teneo.db2m.hbm30.QueryParam;
import org.eclipse.emf.teneo.db2m.hbm30.Resultset;
import org.eclipse.emf.teneo.db2m.hbm30.Return;
import org.eclipse.emf.teneo.db2m.hbm30.ReturnColumn;
import org.eclipse.emf.teneo.db2m.hbm30.ReturnDiscriminator;
import org.eclipse.emf.teneo.db2m.hbm30.ReturnJoin;
import org.eclipse.emf.teneo.db2m.hbm30.ReturnProperty;
import org.eclipse.emf.teneo.db2m.hbm30.ReturnScalar;
import org.eclipse.emf.teneo.db2m.hbm30.Set;
import org.eclipse.emf.teneo.db2m.hbm30.SourceType;
import org.eclipse.emf.teneo.db2m.hbm30.SqlDelete;
import org.eclipse.emf.teneo.db2m.hbm30.SqlDeleteAll;
import org.eclipse.emf.teneo.db2m.hbm30.SqlInsert;
import org.eclipse.emf.teneo.db2m.hbm30.SqlQuery;
import org.eclipse.emf.teneo.db2m.hbm30.SqlUpdate;
import org.eclipse.emf.teneo.db2m.hbm30.Subclass;
import org.eclipse.emf.teneo.db2m.hbm30.Synchronize;
import org.eclipse.emf.teneo.db2m.hbm30.Timestamp;
import org.eclipse.emf.teneo.db2m.hbm30.Tuplizer;
import org.eclipse.emf.teneo.db2m.hbm30.Type;
import org.eclipse.emf.teneo.db2m.hbm30.Typedef;
import org.eclipse.emf.teneo.db2m.hbm30.UnionSubclass;
import org.eclipse.emf.teneo.db2m.hbm30.UnsavedValueType;
import org.eclipse.emf.teneo.db2m.hbm30.UnsavedValueType1;
import org.eclipse.emf.teneo.db2m.hbm30.UnsavedValueType2;
import org.eclipse.emf.teneo.db2m.hbm30.UsageType;
import org.eclipse.emf.teneo.db2m.hbm30.Version;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Hbm30FactoryImpl extends EFactoryImpl implements Hbm30Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Hbm30Factory init() {
		try {
			Hbm30Factory theHbm30Factory = (Hbm30Factory)EPackage.Registry.INSTANCE.getEFactory("http://hibernate.sourceforge.net/hbm30"); 
			if (theHbm30Factory != null) {
				return theHbm30Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Hbm30FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hbm30FactoryImpl() {
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
			case Hbm30Package.ANY: return createAny();
			case Hbm30Package.ARRAY: return createArray();
			case Hbm30Package.BAG: return createBag();
			case Hbm30Package.CACHE: return createCache();
			case Hbm30Package.CLASS: return createClass();
			case Hbm30Package.COLLECTION: return createCollection();
			case Hbm30Package.COLLECTION_ID: return createCollectionId();
			case Hbm30Package.COLUMN: return createColumn();
			case Hbm30Package.COMPONENT: return createComponent();
			case Hbm30Package.COMPOSITE_ELEMENT: return createCompositeElement();
			case Hbm30Package.COMPOSITE_ID: return createCompositeId();
			case Hbm30Package.COMPOSITE_INDEX: return createCompositeIndex();
			case Hbm30Package.COMPOSITE_MAP_KEY: return createCompositeMapKey();
			case Hbm30Package.DATABASE_OBJECT: return createDatabaseObject();
			case Hbm30Package.DEFINITION: return createDefinition();
			case Hbm30Package.DIALECT_SCOPE: return createDialectScope();
			case Hbm30Package.DISCRIMINATOR: return createDiscriminator();
			case Hbm30Package.DYNAMIC_COMPONENT: return createDynamicComponent();
			case Hbm30Package.ELEMENT: return createElement();
			case Hbm30Package.FILTER: return createFilter();
			case Hbm30Package.FILTER_DEF: return createFilterDef();
			case Hbm30Package.FILTER_PARAM: return createFilterParam();
			case Hbm30Package.GENERATOR: return createGenerator();
			case Hbm30Package.HIBERNATE_MAPPING: return createHibernateMapping();
			case Hbm30Package.ID: return createId();
			case Hbm30Package.IDBAG: return createIdbag();
			case Hbm30Package.IMPORT: return createImport();
			case Hbm30Package.INDEX: return createIndex();
			case Hbm30Package.INDEX_MANY_TO_ANY: return createIndexManyToAny();
			case Hbm30Package.INDEX_MANY_TO_MANY: return createIndexManyToMany();
			case Hbm30Package.JOIN: return createJoin();
			case Hbm30Package.JOINED_SUBCLASS: return createJoinedSubclass();
			case Hbm30Package.KEY: return createKey();
			case Hbm30Package.KEY_MANY_TO_ONE: return createKeyManyToOne();
			case Hbm30Package.KEY_PROPERTY: return createKeyProperty();
			case Hbm30Package.LIST: return createList();
			case Hbm30Package.LIST_INDEX: return createListIndex();
			case Hbm30Package.LOAD_COLLECTION: return createLoadCollection();
			case Hbm30Package.LOADER: return createLoader();
			case Hbm30Package.MANY_TO_ANY: return createManyToAny();
			case Hbm30Package.MANY_TO_MANY: return createManyToMany();
			case Hbm30Package.MANY_TO_ONE: return createManyToOne();
			case Hbm30Package.MAP: return createMap();
			case Hbm30Package.MAP_KEY: return createMapKey();
			case Hbm30Package.MAP_KEY_MANY_TO_MANY: return createMapKeyManyToMany();
			case Hbm30Package.META: return createMeta();
			case Hbm30Package.META_VALUE: return createMetaValue();
			case Hbm30Package.NATURAL_ID: return createNaturalId();
			case Hbm30Package.NESTED_COMPOSITE_ELEMENT: return createNestedCompositeElement();
			case Hbm30Package.ONE_TO_MANY: return createOneToMany();
			case Hbm30Package.ONE_TO_ONE: return createOneToOne();
			case Hbm30Package.PARAM: return createParam();
			case Hbm30Package.PARENT: return createParent();
			case Hbm30Package.PRIMITIVE_ARRAY: return createPrimitiveArray();
			case Hbm30Package.PROPERTIES: return createProperties();
			case Hbm30Package.PROPERTY: return createProperty();
			case Hbm30Package.QUERY: return createQuery();
			case Hbm30Package.QUERY_PARAM: return createQueryParam();
			case Hbm30Package.RESULTSET: return createResultset();
			case Hbm30Package.RETURN: return createReturn();
			case Hbm30Package.RETURN_COLUMN: return createReturnColumn();
			case Hbm30Package.RETURN_DISCRIMINATOR: return createReturnDiscriminator();
			case Hbm30Package.RETURN_JOIN: return createReturnJoin();
			case Hbm30Package.RETURN_PROPERTY: return createReturnProperty();
			case Hbm30Package.RETURN_SCALAR: return createReturnScalar();
			case Hbm30Package.SET: return createSet();
			case Hbm30Package.SQL_DELETE: return createSqlDelete();
			case Hbm30Package.SQL_DELETE_ALL: return createSqlDeleteAll();
			case Hbm30Package.SQL_INSERT: return createSqlInsert();
			case Hbm30Package.SQL_QUERY: return createSqlQuery();
			case Hbm30Package.SQL_UPDATE: return createSqlUpdate();
			case Hbm30Package.SUBCLASS: return createSubclass();
			case Hbm30Package.SYNCHRONIZE: return createSynchronize();
			case Hbm30Package.TIMESTAMP: return createTimestamp();
			case Hbm30Package.TUPLIZER: return createTuplizer();
			case Hbm30Package.TYPE: return createType();
			case Hbm30Package.TYPEDEF: return createTypedef();
			case Hbm30Package.UNION_SUBCLASS: return createUnionSubclass();
			case Hbm30Package.VERSION: return createVersion();
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
			case Hbm30Package.CACHEMODE:
				return createCachemodeFromString(eDataType, initialValue);
			case Hbm30Package.ENTITY_MODE_TYPE:
				return createEntityModeTypeFromString(eDataType, initialValue);
			case Hbm30Package.FETCH:
				return createFetchFromString(eDataType, initialValue);
			case Hbm30Package.FETCH_JOIN_SELECT:
				return createFetchJoinSelectFromString(eDataType, initialValue);
			case Hbm30Package.FLUSHMODE:
				return createFlushmodeFromString(eDataType, initialValue);
			case Hbm30Package.GENERATED:
				return createGeneratedFromString(eDataType, initialValue);
			case Hbm30Package.GENERATED_NEVER_ALWAYS:
				return createGeneratedNeverAlwaysFromString(eDataType, initialValue);
			case Hbm30Package.INCLUDE_TYPE:
				return createIncludeTypeFromString(eDataType, initialValue);
			case Hbm30Package.LAZY:
				return createLazyFromString(eDataType, initialValue);
			case Hbm30Package.LAZY_FALSE_PROXY:
				return createLazyFalseProxyFromString(eDataType, initialValue);
			case Hbm30Package.LAZY_TRUE_FALSE_EXTRA:
				return createLazyTrueFalseExtraFromString(eDataType, initialValue);
			case Hbm30Package.LOCKMODE:
				return createLockmodeFromString(eDataType, initialValue);
			case Hbm30Package.NOTFOUND:
				return createNotfoundFromString(eDataType, initialValue);
			case Hbm30Package.ON_DELETE_TYPE:
				return createOnDeleteTypeFromString(eDataType, initialValue);
			case Hbm30Package.OPTIMISTIC_LOCK_TYPE:
				return createOptimisticLockTypeFromString(eDataType, initialValue);
			case Hbm30Package.OUTERJOIN:
				return createOuterjoinFromString(eDataType, initialValue);
			case Hbm30Package.POLYMORPHISM_TYPE:
				return createPolymorphismTypeFromString(eDataType, initialValue);
			case Hbm30Package.SOURCE_TYPE:
				return createSourceTypeFromString(eDataType, initialValue);
			case Hbm30Package.UNSAVED_VALUE_TYPE:
				return createUnsavedValueTypeFromString(eDataType, initialValue);
			case Hbm30Package.UNSAVED_VALUE_TYPE1:
				return createUnsavedValueType1FromString(eDataType, initialValue);
			case Hbm30Package.UNSAVED_VALUE_TYPE2:
				return createUnsavedValueType2FromString(eDataType, initialValue);
			case Hbm30Package.USAGE_TYPE:
				return createUsageTypeFromString(eDataType, initialValue);
			case Hbm30Package.CACHEMODE_OBJECT:
				return createCachemodeObjectFromString(eDataType, initialValue);
			case Hbm30Package.ENTITY_MODE_TYPE_OBJECT:
				return createEntityModeTypeObjectFromString(eDataType, initialValue);
			case Hbm30Package.FETCH_JOIN_SELECT_OBJECT:
				return createFetchJoinSelectObjectFromString(eDataType, initialValue);
			case Hbm30Package.FETCH_OBJECT:
				return createFetchObjectFromString(eDataType, initialValue);
			case Hbm30Package.FLUSHMODE_OBJECT:
				return createFlushmodeObjectFromString(eDataType, initialValue);
			case Hbm30Package.GENERATED_NEVER_ALWAYS_OBJECT:
				return createGeneratedNeverAlwaysObjectFromString(eDataType, initialValue);
			case Hbm30Package.GENERATED_OBJECT:
				return createGeneratedObjectFromString(eDataType, initialValue);
			case Hbm30Package.INCLUDE_TYPE_OBJECT:
				return createIncludeTypeObjectFromString(eDataType, initialValue);
			case Hbm30Package.LAZY_FALSE_PROXY_OBJECT:
				return createLazyFalseProxyObjectFromString(eDataType, initialValue);
			case Hbm30Package.LAZY_OBJECT:
				return createLazyObjectFromString(eDataType, initialValue);
			case Hbm30Package.LAZY_TRUE_FALSE_EXTRA_OBJECT:
				return createLazyTrueFalseExtraObjectFromString(eDataType, initialValue);
			case Hbm30Package.LOCKMODE_OBJECT:
				return createLockmodeObjectFromString(eDataType, initialValue);
			case Hbm30Package.NOTFOUND_OBJECT:
				return createNotfoundObjectFromString(eDataType, initialValue);
			case Hbm30Package.ON_DELETE_TYPE_OBJECT:
				return createOnDeleteTypeObjectFromString(eDataType, initialValue);
			case Hbm30Package.OPTIMISTIC_LOCK_TYPE_OBJECT:
				return createOptimisticLockTypeObjectFromString(eDataType, initialValue);
			case Hbm30Package.OUTERJOIN_OBJECT:
				return createOuterjoinObjectFromString(eDataType, initialValue);
			case Hbm30Package.POLYMORPHISM_TYPE_OBJECT:
				return createPolymorphismTypeObjectFromString(eDataType, initialValue);
			case Hbm30Package.SOURCE_TYPE_OBJECT:
				return createSourceTypeObjectFromString(eDataType, initialValue);
			case Hbm30Package.UNSAVED_VALUE_TYPE_OBJECT:
				return createUnsavedValueTypeObjectFromString(eDataType, initialValue);
			case Hbm30Package.UNSAVED_VALUE_TYPE_OBJECT1:
				return createUnsavedValueTypeObject1FromString(eDataType, initialValue);
			case Hbm30Package.UNSAVED_VALUE_TYPE_OBJECT2:
				return createUnsavedValueTypeObject2FromString(eDataType, initialValue);
			case Hbm30Package.USAGE_TYPE_OBJECT:
				return createUsageTypeObjectFromString(eDataType, initialValue);
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
			case Hbm30Package.CACHEMODE:
				return convertCachemodeToString(eDataType, instanceValue);
			case Hbm30Package.ENTITY_MODE_TYPE:
				return convertEntityModeTypeToString(eDataType, instanceValue);
			case Hbm30Package.FETCH:
				return convertFetchToString(eDataType, instanceValue);
			case Hbm30Package.FETCH_JOIN_SELECT:
				return convertFetchJoinSelectToString(eDataType, instanceValue);
			case Hbm30Package.FLUSHMODE:
				return convertFlushmodeToString(eDataType, instanceValue);
			case Hbm30Package.GENERATED:
				return convertGeneratedToString(eDataType, instanceValue);
			case Hbm30Package.GENERATED_NEVER_ALWAYS:
				return convertGeneratedNeverAlwaysToString(eDataType, instanceValue);
			case Hbm30Package.INCLUDE_TYPE:
				return convertIncludeTypeToString(eDataType, instanceValue);
			case Hbm30Package.LAZY:
				return convertLazyToString(eDataType, instanceValue);
			case Hbm30Package.LAZY_FALSE_PROXY:
				return convertLazyFalseProxyToString(eDataType, instanceValue);
			case Hbm30Package.LAZY_TRUE_FALSE_EXTRA:
				return convertLazyTrueFalseExtraToString(eDataType, instanceValue);
			case Hbm30Package.LOCKMODE:
				return convertLockmodeToString(eDataType, instanceValue);
			case Hbm30Package.NOTFOUND:
				return convertNotfoundToString(eDataType, instanceValue);
			case Hbm30Package.ON_DELETE_TYPE:
				return convertOnDeleteTypeToString(eDataType, instanceValue);
			case Hbm30Package.OPTIMISTIC_LOCK_TYPE:
				return convertOptimisticLockTypeToString(eDataType, instanceValue);
			case Hbm30Package.OUTERJOIN:
				return convertOuterjoinToString(eDataType, instanceValue);
			case Hbm30Package.POLYMORPHISM_TYPE:
				return convertPolymorphismTypeToString(eDataType, instanceValue);
			case Hbm30Package.SOURCE_TYPE:
				return convertSourceTypeToString(eDataType, instanceValue);
			case Hbm30Package.UNSAVED_VALUE_TYPE:
				return convertUnsavedValueTypeToString(eDataType, instanceValue);
			case Hbm30Package.UNSAVED_VALUE_TYPE1:
				return convertUnsavedValueType1ToString(eDataType, instanceValue);
			case Hbm30Package.UNSAVED_VALUE_TYPE2:
				return convertUnsavedValueType2ToString(eDataType, instanceValue);
			case Hbm30Package.USAGE_TYPE:
				return convertUsageTypeToString(eDataType, instanceValue);
			case Hbm30Package.CACHEMODE_OBJECT:
				return convertCachemodeObjectToString(eDataType, instanceValue);
			case Hbm30Package.ENTITY_MODE_TYPE_OBJECT:
				return convertEntityModeTypeObjectToString(eDataType, instanceValue);
			case Hbm30Package.FETCH_JOIN_SELECT_OBJECT:
				return convertFetchJoinSelectObjectToString(eDataType, instanceValue);
			case Hbm30Package.FETCH_OBJECT:
				return convertFetchObjectToString(eDataType, instanceValue);
			case Hbm30Package.FLUSHMODE_OBJECT:
				return convertFlushmodeObjectToString(eDataType, instanceValue);
			case Hbm30Package.GENERATED_NEVER_ALWAYS_OBJECT:
				return convertGeneratedNeverAlwaysObjectToString(eDataType, instanceValue);
			case Hbm30Package.GENERATED_OBJECT:
				return convertGeneratedObjectToString(eDataType, instanceValue);
			case Hbm30Package.INCLUDE_TYPE_OBJECT:
				return convertIncludeTypeObjectToString(eDataType, instanceValue);
			case Hbm30Package.LAZY_FALSE_PROXY_OBJECT:
				return convertLazyFalseProxyObjectToString(eDataType, instanceValue);
			case Hbm30Package.LAZY_OBJECT:
				return convertLazyObjectToString(eDataType, instanceValue);
			case Hbm30Package.LAZY_TRUE_FALSE_EXTRA_OBJECT:
				return convertLazyTrueFalseExtraObjectToString(eDataType, instanceValue);
			case Hbm30Package.LOCKMODE_OBJECT:
				return convertLockmodeObjectToString(eDataType, instanceValue);
			case Hbm30Package.NOTFOUND_OBJECT:
				return convertNotfoundObjectToString(eDataType, instanceValue);
			case Hbm30Package.ON_DELETE_TYPE_OBJECT:
				return convertOnDeleteTypeObjectToString(eDataType, instanceValue);
			case Hbm30Package.OPTIMISTIC_LOCK_TYPE_OBJECT:
				return convertOptimisticLockTypeObjectToString(eDataType, instanceValue);
			case Hbm30Package.OUTERJOIN_OBJECT:
				return convertOuterjoinObjectToString(eDataType, instanceValue);
			case Hbm30Package.POLYMORPHISM_TYPE_OBJECT:
				return convertPolymorphismTypeObjectToString(eDataType, instanceValue);
			case Hbm30Package.SOURCE_TYPE_OBJECT:
				return convertSourceTypeObjectToString(eDataType, instanceValue);
			case Hbm30Package.UNSAVED_VALUE_TYPE_OBJECT:
				return convertUnsavedValueTypeObjectToString(eDataType, instanceValue);
			case Hbm30Package.UNSAVED_VALUE_TYPE_OBJECT1:
				return convertUnsavedValueTypeObject1ToString(eDataType, instanceValue);
			case Hbm30Package.UNSAVED_VALUE_TYPE_OBJECT2:
				return convertUnsavedValueTypeObject2ToString(eDataType, instanceValue);
			case Hbm30Package.USAGE_TYPE_OBJECT:
				return convertUsageTypeObjectToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Any createAny() {
		AnyImpl any = new AnyImpl();
		return any;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Array createArray() {
		ArrayImpl array = new ArrayImpl();
		return array;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bag createBag() {
		BagImpl bag = new BagImpl();
		return bag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cache createCache() {
		CacheImpl cache = new CacheImpl();
		return cache;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.emf.teneo.db2m.hbm30.Class createClass() {
		ClassImpl class_ = new ClassImpl();
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Collection createCollection() {
		CollectionImpl collection = new CollectionImpl();
		return collection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectionId createCollectionId() {
		CollectionIdImpl collectionId = new CollectionIdImpl();
		return collectionId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Column createColumn() {
		ColumnImpl column = new ColumnImpl();
		return column;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component createComponent() {
		ComponentImpl component = new ComponentImpl();
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeElement createCompositeElement() {
		CompositeElementImpl compositeElement = new CompositeElementImpl();
		return compositeElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeId createCompositeId() {
		CompositeIdImpl compositeId = new CompositeIdImpl();
		return compositeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeIndex createCompositeIndex() {
		CompositeIndexImpl compositeIndex = new CompositeIndexImpl();
		return compositeIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeMapKey createCompositeMapKey() {
		CompositeMapKeyImpl compositeMapKey = new CompositeMapKeyImpl();
		return compositeMapKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatabaseObject createDatabaseObject() {
		DatabaseObjectImpl databaseObject = new DatabaseObjectImpl();
		return databaseObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Definition createDefinition() {
		DefinitionImpl definition = new DefinitionImpl();
		return definition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DialectScope createDialectScope() {
		DialectScopeImpl dialectScope = new DialectScopeImpl();
		return dialectScope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Discriminator createDiscriminator() {
		DiscriminatorImpl discriminator = new DiscriminatorImpl();
		return discriminator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DynamicComponent createDynamicComponent() {
		DynamicComponentImpl dynamicComponent = new DynamicComponentImpl();
		return dynamicComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element createElement() {
		ElementImpl element = new ElementImpl();
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Filter createFilter() {
		FilterImpl filter = new FilterImpl();
		return filter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilterDef createFilterDef() {
		FilterDefImpl filterDef = new FilterDefImpl();
		return filterDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilterParam createFilterParam() {
		FilterParamImpl filterParam = new FilterParamImpl();
		return filterParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Generator createGenerator() {
		GeneratorImpl generator = new GeneratorImpl();
		return generator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HibernateMapping createHibernateMapping() {
		HibernateMappingImpl hibernateMapping = new HibernateMappingImpl();
		return hibernateMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Id createId() {
		IdImpl id = new IdImpl();
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Idbag createIdbag() {
		IdbagImpl idbag = new IdbagImpl();
		return idbag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Import createImport() {
		ImportImpl import_ = new ImportImpl();
		return import_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
	public IndexManyToAny createIndexManyToAny() {
		IndexManyToAnyImpl indexManyToAny = new IndexManyToAnyImpl();
		return indexManyToAny;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndexManyToMany createIndexManyToMany() {
		IndexManyToManyImpl indexManyToMany = new IndexManyToManyImpl();
		return indexManyToMany;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Join createJoin() {
		JoinImpl join = new JoinImpl();
		return join;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JoinedSubclass createJoinedSubclass() {
		JoinedSubclassImpl joinedSubclass = new JoinedSubclassImpl();
		return joinedSubclass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Key createKey() {
		KeyImpl key = new KeyImpl();
		return key;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeyManyToOne createKeyManyToOne() {
		KeyManyToOneImpl keyManyToOne = new KeyManyToOneImpl();
		return keyManyToOne;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeyProperty createKeyProperty() {
		KeyPropertyImpl keyProperty = new KeyPropertyImpl();
		return keyProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List createList() {
		ListImpl list = new ListImpl();
		return list;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListIndex createListIndex() {
		ListIndexImpl listIndex = new ListIndexImpl();
		return listIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoadCollection createLoadCollection() {
		LoadCollectionImpl loadCollection = new LoadCollectionImpl();
		return loadCollection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Loader createLoader() {
		LoaderImpl loader = new LoaderImpl();
		return loader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ManyToAny createManyToAny() {
		ManyToAnyImpl manyToAny = new ManyToAnyImpl();
		return manyToAny;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ManyToMany createManyToMany() {
		ManyToManyImpl manyToMany = new ManyToManyImpl();
		return manyToMany;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ManyToOne createManyToOne() {
		ManyToOneImpl manyToOne = new ManyToOneImpl();
		return manyToOne;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map createMap() {
		MapImpl map = new MapImpl();
		return map;
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
	public MapKeyManyToMany createMapKeyManyToMany() {
		MapKeyManyToManyImpl mapKeyManyToMany = new MapKeyManyToManyImpl();
		return mapKeyManyToMany;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Meta createMeta() {
		MetaImpl meta = new MetaImpl();
		return meta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetaValue createMetaValue() {
		MetaValueImpl metaValue = new MetaValueImpl();
		return metaValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NaturalId createNaturalId() {
		NaturalIdImpl naturalId = new NaturalIdImpl();
		return naturalId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NestedCompositeElement createNestedCompositeElement() {
		NestedCompositeElementImpl nestedCompositeElement = new NestedCompositeElementImpl();
		return nestedCompositeElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OneToMany createOneToMany() {
		OneToManyImpl oneToMany = new OneToManyImpl();
		return oneToMany;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OneToOne createOneToOne() {
		OneToOneImpl oneToOne = new OneToOneImpl();
		return oneToOne;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Param createParam() {
		ParamImpl param = new ParamImpl();
		return param;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parent createParent() {
		ParentImpl parent = new ParentImpl();
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveArray createPrimitiveArray() {
		PrimitiveArrayImpl primitiveArray = new PrimitiveArrayImpl();
		return primitiveArray;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Properties createProperties() {
		PropertiesImpl properties = new PropertiesImpl();
		return properties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property createProperty() {
		PropertyImpl property = new PropertyImpl();
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Query createQuery() {
		QueryImpl query = new QueryImpl();
		return query;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryParam createQueryParam() {
		QueryParamImpl queryParam = new QueryParamImpl();
		return queryParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resultset createResultset() {
		ResultsetImpl resultset = new ResultsetImpl();
		return resultset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Return createReturn() {
		ReturnImpl return_ = new ReturnImpl();
		return return_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReturnColumn createReturnColumn() {
		ReturnColumnImpl returnColumn = new ReturnColumnImpl();
		return returnColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReturnDiscriminator createReturnDiscriminator() {
		ReturnDiscriminatorImpl returnDiscriminator = new ReturnDiscriminatorImpl();
		return returnDiscriminator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReturnJoin createReturnJoin() {
		ReturnJoinImpl returnJoin = new ReturnJoinImpl();
		return returnJoin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReturnProperty createReturnProperty() {
		ReturnPropertyImpl returnProperty = new ReturnPropertyImpl();
		return returnProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReturnScalar createReturnScalar() {
		ReturnScalarImpl returnScalar = new ReturnScalarImpl();
		return returnScalar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Set createSet() {
		SetImpl set = new SetImpl();
		return set;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SqlDelete createSqlDelete() {
		SqlDeleteImpl sqlDelete = new SqlDeleteImpl();
		return sqlDelete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SqlDeleteAll createSqlDeleteAll() {
		SqlDeleteAllImpl sqlDeleteAll = new SqlDeleteAllImpl();
		return sqlDeleteAll;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SqlInsert createSqlInsert() {
		SqlInsertImpl sqlInsert = new SqlInsertImpl();
		return sqlInsert;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SqlQuery createSqlQuery() {
		SqlQueryImpl sqlQuery = new SqlQueryImpl();
		return sqlQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SqlUpdate createSqlUpdate() {
		SqlUpdateImpl sqlUpdate = new SqlUpdateImpl();
		return sqlUpdate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Subclass createSubclass() {
		SubclassImpl subclass = new SubclassImpl();
		return subclass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Synchronize createSynchronize() {
		SynchronizeImpl synchronize = new SynchronizeImpl();
		return synchronize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Timestamp createTimestamp() {
		TimestampImpl timestamp = new TimestampImpl();
		return timestamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tuplizer createTuplizer() {
		TuplizerImpl tuplizer = new TuplizerImpl();
		return tuplizer;
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
	public Typedef createTypedef() {
		TypedefImpl typedef = new TypedefImpl();
		return typedef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnionSubclass createUnionSubclass() {
		UnionSubclassImpl unionSubclass = new UnionSubclassImpl();
		return unionSubclass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Version createVersion() {
		VersionImpl version = new VersionImpl();
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cachemode createCachemodeFromString(EDataType eDataType, String initialValue) {
		Cachemode result = Cachemode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCachemodeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityModeType createEntityModeTypeFromString(EDataType eDataType, String initialValue) {
		EntityModeType result = EntityModeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEntityModeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fetch createFetchFromString(EDataType eDataType, String initialValue) {
		Fetch result = Fetch.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFetchToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FetchJoinSelect createFetchJoinSelectFromString(EDataType eDataType, String initialValue) {
		FetchJoinSelect result = FetchJoinSelect.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFetchJoinSelectToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Flushmode createFlushmodeFromString(EDataType eDataType, String initialValue) {
		Flushmode result = Flushmode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFlushmodeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Generated createGeneratedFromString(EDataType eDataType, String initialValue) {
		Generated result = Generated.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGeneratedToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratedNeverAlways createGeneratedNeverAlwaysFromString(EDataType eDataType, String initialValue) {
		GeneratedNeverAlways result = GeneratedNeverAlways.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGeneratedNeverAlwaysToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IncludeType createIncludeTypeFromString(EDataType eDataType, String initialValue) {
		IncludeType result = IncludeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIncludeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lazy createLazyFromString(EDataType eDataType, String initialValue) {
		Lazy result = Lazy.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLazyToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LazyFalseProxy createLazyFalseProxyFromString(EDataType eDataType, String initialValue) {
		LazyFalseProxy result = LazyFalseProxy.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLazyFalseProxyToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LazyTrueFalseExtra createLazyTrueFalseExtraFromString(EDataType eDataType, String initialValue) {
		LazyTrueFalseExtra result = LazyTrueFalseExtra.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLazyTrueFalseExtraToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lockmode createLockmodeFromString(EDataType eDataType, String initialValue) {
		Lockmode result = Lockmode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLockmodeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Notfound createNotfoundFromString(EDataType eDataType, String initialValue) {
		Notfound result = Notfound.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNotfoundToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OnDeleteType createOnDeleteTypeFromString(EDataType eDataType, String initialValue) {
		OnDeleteType result = OnDeleteType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOnDeleteTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OptimisticLockType createOptimisticLockTypeFromString(EDataType eDataType, String initialValue) {
		OptimisticLockType result = OptimisticLockType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOptimisticLockTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Outerjoin createOuterjoinFromString(EDataType eDataType, String initialValue) {
		Outerjoin result = Outerjoin.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOuterjoinToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolymorphismType createPolymorphismTypeFromString(EDataType eDataType, String initialValue) {
		PolymorphismType result = PolymorphismType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPolymorphismTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceType createSourceTypeFromString(EDataType eDataType, String initialValue) {
		SourceType result = SourceType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSourceTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnsavedValueType createUnsavedValueTypeFromString(EDataType eDataType, String initialValue) {
		UnsavedValueType result = UnsavedValueType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUnsavedValueTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnsavedValueType1 createUnsavedValueType1FromString(EDataType eDataType, String initialValue) {
		UnsavedValueType1 result = UnsavedValueType1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUnsavedValueType1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnsavedValueType2 createUnsavedValueType2FromString(EDataType eDataType, String initialValue) {
		UnsavedValueType2 result = UnsavedValueType2.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUnsavedValueType2ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsageType createUsageTypeFromString(EDataType eDataType, String initialValue) {
		UsageType result = UsageType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUsageTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cachemode createCachemodeObjectFromString(EDataType eDataType, String initialValue) {
		return createCachemodeFromString(Hbm30Package.eINSTANCE.getCachemode(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCachemodeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCachemodeToString(Hbm30Package.eINSTANCE.getCachemode(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityModeType createEntityModeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createEntityModeTypeFromString(Hbm30Package.eINSTANCE.getEntityModeType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEntityModeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertEntityModeTypeToString(Hbm30Package.eINSTANCE.getEntityModeType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FetchJoinSelect createFetchJoinSelectObjectFromString(EDataType eDataType, String initialValue) {
		return createFetchJoinSelectFromString(Hbm30Package.eINSTANCE.getFetchJoinSelect(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFetchJoinSelectObjectToString(EDataType eDataType, Object instanceValue) {
		return convertFetchJoinSelectToString(Hbm30Package.eINSTANCE.getFetchJoinSelect(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fetch createFetchObjectFromString(EDataType eDataType, String initialValue) {
		return createFetchFromString(Hbm30Package.eINSTANCE.getFetch(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFetchObjectToString(EDataType eDataType, Object instanceValue) {
		return convertFetchToString(Hbm30Package.eINSTANCE.getFetch(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Flushmode createFlushmodeObjectFromString(EDataType eDataType, String initialValue) {
		return createFlushmodeFromString(Hbm30Package.eINSTANCE.getFlushmode(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFlushmodeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertFlushmodeToString(Hbm30Package.eINSTANCE.getFlushmode(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratedNeverAlways createGeneratedNeverAlwaysObjectFromString(EDataType eDataType, String initialValue) {
		return createGeneratedNeverAlwaysFromString(Hbm30Package.eINSTANCE.getGeneratedNeverAlways(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGeneratedNeverAlwaysObjectToString(EDataType eDataType, Object instanceValue) {
		return convertGeneratedNeverAlwaysToString(Hbm30Package.eINSTANCE.getGeneratedNeverAlways(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Generated createGeneratedObjectFromString(EDataType eDataType, String initialValue) {
		return createGeneratedFromString(Hbm30Package.eINSTANCE.getGenerated(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGeneratedObjectToString(EDataType eDataType, Object instanceValue) {
		return convertGeneratedToString(Hbm30Package.eINSTANCE.getGenerated(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IncludeType createIncludeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createIncludeTypeFromString(Hbm30Package.eINSTANCE.getIncludeType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIncludeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIncludeTypeToString(Hbm30Package.eINSTANCE.getIncludeType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LazyFalseProxy createLazyFalseProxyObjectFromString(EDataType eDataType, String initialValue) {
		return createLazyFalseProxyFromString(Hbm30Package.eINSTANCE.getLazyFalseProxy(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLazyFalseProxyObjectToString(EDataType eDataType, Object instanceValue) {
		return convertLazyFalseProxyToString(Hbm30Package.eINSTANCE.getLazyFalseProxy(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lazy createLazyObjectFromString(EDataType eDataType, String initialValue) {
		return createLazyFromString(Hbm30Package.eINSTANCE.getLazy(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLazyObjectToString(EDataType eDataType, Object instanceValue) {
		return convertLazyToString(Hbm30Package.eINSTANCE.getLazy(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LazyTrueFalseExtra createLazyTrueFalseExtraObjectFromString(EDataType eDataType, String initialValue) {
		return createLazyTrueFalseExtraFromString(Hbm30Package.eINSTANCE.getLazyTrueFalseExtra(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLazyTrueFalseExtraObjectToString(EDataType eDataType, Object instanceValue) {
		return convertLazyTrueFalseExtraToString(Hbm30Package.eINSTANCE.getLazyTrueFalseExtra(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lockmode createLockmodeObjectFromString(EDataType eDataType, String initialValue) {
		return createLockmodeFromString(Hbm30Package.eINSTANCE.getLockmode(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLockmodeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertLockmodeToString(Hbm30Package.eINSTANCE.getLockmode(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Notfound createNotfoundObjectFromString(EDataType eDataType, String initialValue) {
		return createNotfoundFromString(Hbm30Package.eINSTANCE.getNotfound(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNotfoundObjectToString(EDataType eDataType, Object instanceValue) {
		return convertNotfoundToString(Hbm30Package.eINSTANCE.getNotfound(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OnDeleteType createOnDeleteTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createOnDeleteTypeFromString(Hbm30Package.eINSTANCE.getOnDeleteType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOnDeleteTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertOnDeleteTypeToString(Hbm30Package.eINSTANCE.getOnDeleteType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OptimisticLockType createOptimisticLockTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createOptimisticLockTypeFromString(Hbm30Package.eINSTANCE.getOptimisticLockType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOptimisticLockTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertOptimisticLockTypeToString(Hbm30Package.eINSTANCE.getOptimisticLockType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Outerjoin createOuterjoinObjectFromString(EDataType eDataType, String initialValue) {
		return createOuterjoinFromString(Hbm30Package.eINSTANCE.getOuterjoin(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOuterjoinObjectToString(EDataType eDataType, Object instanceValue) {
		return convertOuterjoinToString(Hbm30Package.eINSTANCE.getOuterjoin(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolymorphismType createPolymorphismTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createPolymorphismTypeFromString(Hbm30Package.eINSTANCE.getPolymorphismType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPolymorphismTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertPolymorphismTypeToString(Hbm30Package.eINSTANCE.getPolymorphismType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceType createSourceTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createSourceTypeFromString(Hbm30Package.eINSTANCE.getSourceType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSourceTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSourceTypeToString(Hbm30Package.eINSTANCE.getSourceType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnsavedValueType1 createUnsavedValueTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createUnsavedValueType1FromString(Hbm30Package.eINSTANCE.getUnsavedValueType1(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUnsavedValueTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertUnsavedValueType1ToString(Hbm30Package.eINSTANCE.getUnsavedValueType1(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnsavedValueType createUnsavedValueTypeObject1FromString(EDataType eDataType, String initialValue) {
		return createUnsavedValueTypeFromString(Hbm30Package.eINSTANCE.getUnsavedValueType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUnsavedValueTypeObject1ToString(EDataType eDataType, Object instanceValue) {
		return convertUnsavedValueTypeToString(Hbm30Package.eINSTANCE.getUnsavedValueType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnsavedValueType2 createUnsavedValueTypeObject2FromString(EDataType eDataType, String initialValue) {
		return createUnsavedValueType2FromString(Hbm30Package.eINSTANCE.getUnsavedValueType2(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUnsavedValueTypeObject2ToString(EDataType eDataType, Object instanceValue) {
		return convertUnsavedValueType2ToString(Hbm30Package.eINSTANCE.getUnsavedValueType2(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsageType createUsageTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createUsageTypeFromString(Hbm30Package.eINSTANCE.getUsageType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUsageTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertUsageTypeToString(Hbm30Package.eINSTANCE.getUsageType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hbm30Package getHbm30Package() {
		return (Hbm30Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Hbm30Package getPackage() {
		return Hbm30Package.eINSTANCE;
	}

} //Hbm30FactoryImpl

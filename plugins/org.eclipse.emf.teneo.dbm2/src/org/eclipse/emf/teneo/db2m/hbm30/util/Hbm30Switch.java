/**
 * <copyright>
 * </copyright>
 *
 * $Id: Hbm30Switch.java,v 1.1 2010/08/18 09:25:26 cbouhier Exp $
 */
package org.eclipse.emf.teneo.db2m.hbm30.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.teneo.db2m.hbm30.Any;
import org.eclipse.emf.teneo.db2m.hbm30.Array;
import org.eclipse.emf.teneo.db2m.hbm30.Bag;
import org.eclipse.emf.teneo.db2m.hbm30.Cache;
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
import org.eclipse.emf.teneo.db2m.hbm30.Filter;
import org.eclipse.emf.teneo.db2m.hbm30.FilterDef;
import org.eclipse.emf.teneo.db2m.hbm30.FilterParam;
import org.eclipse.emf.teneo.db2m.hbm30.Generator;
import org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package;
import org.eclipse.emf.teneo.db2m.hbm30.HibernateMapping;
import org.eclipse.emf.teneo.db2m.hbm30.Id;
import org.eclipse.emf.teneo.db2m.hbm30.Idbag;
import org.eclipse.emf.teneo.db2m.hbm30.Import;
import org.eclipse.emf.teneo.db2m.hbm30.Index;
import org.eclipse.emf.teneo.db2m.hbm30.IndexManyToAny;
import org.eclipse.emf.teneo.db2m.hbm30.IndexManyToMany;
import org.eclipse.emf.teneo.db2m.hbm30.Join;
import org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass;
import org.eclipse.emf.teneo.db2m.hbm30.Key;
import org.eclipse.emf.teneo.db2m.hbm30.KeyManyToOne;
import org.eclipse.emf.teneo.db2m.hbm30.KeyProperty;
import org.eclipse.emf.teneo.db2m.hbm30.ListIndex;
import org.eclipse.emf.teneo.db2m.hbm30.LoadCollection;
import org.eclipse.emf.teneo.db2m.hbm30.Loader;
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
import org.eclipse.emf.teneo.db2m.hbm30.OneToMany;
import org.eclipse.emf.teneo.db2m.hbm30.OneToOne;
import org.eclipse.emf.teneo.db2m.hbm30.Param;
import org.eclipse.emf.teneo.db2m.hbm30.Parent;
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
import org.eclipse.emf.teneo.db2m.hbm30.Version;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package
 * @generated
 */
public class Hbm30Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Hbm30Package modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hbm30Switch() {
		if (modelPackage == null) {
			modelPackage = Hbm30Package.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case Hbm30Package.ANY: {
				Any any = (Any)theEObject;
				T result = caseAny(any);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Hbm30Package.ARRAY: {
				Array array = (Array)theEObject;
				T result = caseArray(array);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Hbm30Package.BAG: {
				Bag bag = (Bag)theEObject;
				T result = caseBag(bag);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Hbm30Package.CACHE: {
				Cache cache = (Cache)theEObject;
				T result = caseCache(cache);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Hbm30Package.CLASS: {
				org.eclipse.emf.teneo.db2m.hbm30.Class class_ = (org.eclipse.emf.teneo.db2m.hbm30.Class)theEObject;
				T result = caseClass(class_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Hbm30Package.COLLECTION: {
				Collection collection = (Collection)theEObject;
				T result = caseCollection(collection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Hbm30Package.COLLECTION_ID: {
				CollectionId collectionId = (CollectionId)theEObject;
				T result = caseCollectionId(collectionId);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Hbm30Package.COLUMN: {
				Column column = (Column)theEObject;
				T result = caseColumn(column);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Hbm30Package.COMPONENT: {
				Component component = (Component)theEObject;
				T result = caseComponent(component);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Hbm30Package.COMPOSITE_ELEMENT: {
				CompositeElement compositeElement = (CompositeElement)theEObject;
				T result = caseCompositeElement(compositeElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Hbm30Package.COMPOSITE_ID: {
				CompositeId compositeId = (CompositeId)theEObject;
				T result = caseCompositeId(compositeId);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Hbm30Package.COMPOSITE_INDEX: {
				CompositeIndex compositeIndex = (CompositeIndex)theEObject;
				T result = caseCompositeIndex(compositeIndex);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Hbm30Package.COMPOSITE_MAP_KEY: {
				CompositeMapKey compositeMapKey = (CompositeMapKey)theEObject;
				T result = caseCompositeMapKey(compositeMapKey);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Hbm30Package.DATABASE_OBJECT: {
				DatabaseObject databaseObject = (DatabaseObject)theEObject;
				T result = caseDatabaseObject(databaseObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Hbm30Package.DEFINITION: {
				Definition definition = (Definition)theEObject;
				T result = caseDefinition(definition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Hbm30Package.DIALECT_SCOPE: {
				DialectScope dialectScope = (DialectScope)theEObject;
				T result = caseDialectScope(dialectScope);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Hbm30Package.DISCRIMINATOR: {
				Discriminator discriminator = (Discriminator)theEObject;
				T result = caseDiscriminator(discriminator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Hbm30Package.DYNAMIC_COMPONENT: {
				DynamicComponent dynamicComponent = (DynamicComponent)theEObject;
				T result = caseDynamicComponent(dynamicComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Hbm30Package.ELEMENT: {
				Element element = (Element)theEObject;
				T result = caseElement(element);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Hbm30Package.FILTER: {
				Filter filter = (Filter)theEObject;
				T result = caseFilter(filter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Hbm30Package.FILTER_DEF: {
				FilterDef filterDef = (FilterDef)theEObject;
				T result = caseFilterDef(filterDef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Hbm30Package.FILTER_PARAM: {
				FilterParam filterParam = (FilterParam)theEObject;
				T result = caseFilterParam(filterParam);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Hbm30Package.GENERATOR: {
				Generator generator = (Generator)theEObject;
				T result = caseGenerator(generator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Hbm30Package.HIBERNATE_MAPPING: {
				HibernateMapping hibernateMapping = (HibernateMapping)theEObject;
				T result = caseHibernateMapping(hibernateMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Hbm30Package.ID: {
				Id id = (Id)theEObject;
				T result = caseId(id);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Hbm30Package.IDBAG: {
				Idbag idbag = (Idbag)theEObject;
				T result = caseIdbag(idbag);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Hbm30Package.IMPORT: {
				Import import_ = (Import)theEObject;
				T result = caseImport(import_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Hbm30Package.INDEX: {
				Index index = (Index)theEObject;
				T result = caseIndex(index);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Hbm30Package.INDEX_MANY_TO_ANY: {
				IndexManyToAny indexManyToAny = (IndexManyToAny)theEObject;
				T result = caseIndexManyToAny(indexManyToAny);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Hbm30Package.INDEX_MANY_TO_MANY: {
				IndexManyToMany indexManyToMany = (IndexManyToMany)theEObject;
				T result = caseIndexManyToMany(indexManyToMany);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Hbm30Package.JOIN: {
				Join join = (Join)theEObject;
				T result = caseJoin(join);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Hbm30Package.JOINED_SUBCLASS: {
				JoinedSubclass joinedSubclass = (JoinedSubclass)theEObject;
				T result = caseJoinedSubclass(joinedSubclass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Hbm30Package.KEY: {
				Key key = (Key)theEObject;
				T result = caseKey(key);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Hbm30Package.KEY_MANY_TO_ONE: {
				KeyManyToOne keyManyToOne = (KeyManyToOne)theEObject;
				T result = caseKeyManyToOne(keyManyToOne);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Hbm30Package.KEY_PROPERTY: {
				KeyProperty keyProperty = (KeyProperty)theEObject;
				T result = caseKeyProperty(keyProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Hbm30Package.LIST: {
				org.eclipse.emf.teneo.db2m.hbm30.List list = (org.eclipse.emf.teneo.db2m.hbm30.List)theEObject;
				T result = caseList(list);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Hbm30Package.LIST_INDEX: {
				ListIndex listIndex = (ListIndex)theEObject;
				T result = caseListIndex(listIndex);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Hbm30Package.LOAD_COLLECTION: {
				LoadCollection loadCollection = (LoadCollection)theEObject;
				T result = caseLoadCollection(loadCollection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Hbm30Package.LOADER: {
				Loader loader = (Loader)theEObject;
				T result = caseLoader(loader);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Hbm30Package.MANY_TO_ANY: {
				ManyToAny manyToAny = (ManyToAny)theEObject;
				T result = caseManyToAny(manyToAny);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Hbm30Package.MANY_TO_MANY: {
				ManyToMany manyToMany = (ManyToMany)theEObject;
				T result = caseManyToMany(manyToMany);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Hbm30Package.MANY_TO_ONE: {
				ManyToOne manyToOne = (ManyToOne)theEObject;
				T result = caseManyToOne(manyToOne);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Hbm30Package.MAP: {
				Map map = (Map)theEObject;
				T result = caseMap(map);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Hbm30Package.MAP_KEY: {
				MapKey mapKey = (MapKey)theEObject;
				T result = caseMapKey(mapKey);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Hbm30Package.MAP_KEY_MANY_TO_MANY: {
				MapKeyManyToMany mapKeyManyToMany = (MapKeyManyToMany)theEObject;
				T result = caseMapKeyManyToMany(mapKeyManyToMany);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Hbm30Package.META: {
				Meta meta = (Meta)theEObject;
				T result = caseMeta(meta);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Hbm30Package.META_VALUE: {
				MetaValue metaValue = (MetaValue)theEObject;
				T result = caseMetaValue(metaValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Hbm30Package.NATURAL_ID: {
				NaturalId naturalId = (NaturalId)theEObject;
				T result = caseNaturalId(naturalId);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Hbm30Package.NESTED_COMPOSITE_ELEMENT: {
				NestedCompositeElement nestedCompositeElement = (NestedCompositeElement)theEObject;
				T result = caseNestedCompositeElement(nestedCompositeElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Hbm30Package.ONE_TO_MANY: {
				OneToMany oneToMany = (OneToMany)theEObject;
				T result = caseOneToMany(oneToMany);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Hbm30Package.ONE_TO_ONE: {
				OneToOne oneToOne = (OneToOne)theEObject;
				T result = caseOneToOne(oneToOne);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Hbm30Package.PARAM: {
				Param param = (Param)theEObject;
				T result = caseParam(param);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Hbm30Package.PARENT: {
				Parent parent = (Parent)theEObject;
				T result = caseParent(parent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Hbm30Package.PRIMITIVE_ARRAY: {
				PrimitiveArray primitiveArray = (PrimitiveArray)theEObject;
				T result = casePrimitiveArray(primitiveArray);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Hbm30Package.PROPERTIES: {
				Properties properties = (Properties)theEObject;
				T result = caseProperties(properties);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Hbm30Package.PROPERTY: {
				Property property = (Property)theEObject;
				T result = caseProperty(property);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Hbm30Package.QUERY: {
				Query query = (Query)theEObject;
				T result = caseQuery(query);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Hbm30Package.QUERY_PARAM: {
				QueryParam queryParam = (QueryParam)theEObject;
				T result = caseQueryParam(queryParam);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Hbm30Package.RESULTSET: {
				Resultset resultset = (Resultset)theEObject;
				T result = caseResultset(resultset);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Hbm30Package.RETURN: {
				Return return_ = (Return)theEObject;
				T result = caseReturn(return_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Hbm30Package.RETURN_COLUMN: {
				ReturnColumn returnColumn = (ReturnColumn)theEObject;
				T result = caseReturnColumn(returnColumn);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Hbm30Package.RETURN_DISCRIMINATOR: {
				ReturnDiscriminator returnDiscriminator = (ReturnDiscriminator)theEObject;
				T result = caseReturnDiscriminator(returnDiscriminator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Hbm30Package.RETURN_JOIN: {
				ReturnJoin returnJoin = (ReturnJoin)theEObject;
				T result = caseReturnJoin(returnJoin);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Hbm30Package.RETURN_PROPERTY: {
				ReturnProperty returnProperty = (ReturnProperty)theEObject;
				T result = caseReturnProperty(returnProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Hbm30Package.RETURN_SCALAR: {
				ReturnScalar returnScalar = (ReturnScalar)theEObject;
				T result = caseReturnScalar(returnScalar);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Hbm30Package.SET: {
				Set set = (Set)theEObject;
				T result = caseSet(set);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Hbm30Package.SQL_DELETE: {
				SqlDelete sqlDelete = (SqlDelete)theEObject;
				T result = caseSqlDelete(sqlDelete);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Hbm30Package.SQL_DELETE_ALL: {
				SqlDeleteAll sqlDeleteAll = (SqlDeleteAll)theEObject;
				T result = caseSqlDeleteAll(sqlDeleteAll);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Hbm30Package.SQL_INSERT: {
				SqlInsert sqlInsert = (SqlInsert)theEObject;
				T result = caseSqlInsert(sqlInsert);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Hbm30Package.SQL_QUERY: {
				SqlQuery sqlQuery = (SqlQuery)theEObject;
				T result = caseSqlQuery(sqlQuery);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Hbm30Package.SQL_UPDATE: {
				SqlUpdate sqlUpdate = (SqlUpdate)theEObject;
				T result = caseSqlUpdate(sqlUpdate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Hbm30Package.SUBCLASS: {
				Subclass subclass = (Subclass)theEObject;
				T result = caseSubclass(subclass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Hbm30Package.SYNCHRONIZE: {
				Synchronize synchronize = (Synchronize)theEObject;
				T result = caseSynchronize(synchronize);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Hbm30Package.TIMESTAMP: {
				Timestamp timestamp = (Timestamp)theEObject;
				T result = caseTimestamp(timestamp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Hbm30Package.TUPLIZER: {
				Tuplizer tuplizer = (Tuplizer)theEObject;
				T result = caseTuplizer(tuplizer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Hbm30Package.TYPE: {
				Type type = (Type)theEObject;
				T result = caseType(type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Hbm30Package.TYPEDEF: {
				Typedef typedef = (Typedef)theEObject;
				T result = caseTypedef(typedef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Hbm30Package.UNION_SUBCLASS: {
				UnionSubclass unionSubclass = (UnionSubclass)theEObject;
				T result = caseUnionSubclass(unionSubclass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Hbm30Package.VERSION: {
				Version version = (Version)theEObject;
				T result = caseVersion(version);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Any</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Any</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAny(Any object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Array</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Array</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArray(Array object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bag</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bag</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBag(Bag object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cache</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cache</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCache(Cache object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClass(org.eclipse.emf.teneo.db2m.hbm30.Class object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Collection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Collection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCollection(Collection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Collection Id</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Collection Id</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCollectionId(CollectionId object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Column</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Column</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseColumn(Column object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponent(Component object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composite Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composite Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompositeElement(CompositeElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composite Id</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composite Id</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompositeId(CompositeId object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composite Index</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composite Index</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompositeIndex(CompositeIndex object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composite Map Key</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composite Map Key</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompositeMapKey(CompositeMapKey object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Database Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Database Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatabaseObject(DatabaseObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDefinition(Definition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dialect Scope</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dialect Scope</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDialectScope(DialectScope object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Discriminator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Discriminator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiscriminator(Discriminator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dynamic Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dynamic Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDynamicComponent(DynamicComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElement(Element object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Filter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Filter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFilter(Filter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Filter Def</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Filter Def</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFilterDef(FilterDef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Filter Param</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Filter Param</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFilterParam(FilterParam object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenerator(Generator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hibernate Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hibernate Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHibernateMapping(HibernateMapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Id</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Id</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseId(Id object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Idbag</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Idbag</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdbag(Idbag object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Import</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Import</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImport(Import object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Index</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Index</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIndex(Index object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Index Many To Any</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Index Many To Any</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIndexManyToAny(IndexManyToAny object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Index Many To Many</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Index Many To Many</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIndexManyToMany(IndexManyToMany object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Join</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Join</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJoin(Join object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Joined Subclass</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Joined Subclass</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJoinedSubclass(JoinedSubclass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Key</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Key</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKey(Key object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Key Many To One</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Key Many To One</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKeyManyToOne(KeyManyToOne object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Key Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Key Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKeyProperty(KeyProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseList(org.eclipse.emf.teneo.db2m.hbm30.List object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Index</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Index</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListIndex(ListIndex object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Load Collection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Load Collection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLoadCollection(LoadCollection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Loader</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Loader</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLoader(Loader object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Many To Any</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Many To Any</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseManyToAny(ManyToAny object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Many To Many</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Many To Many</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseManyToMany(ManyToMany object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Many To One</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Many To One</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseManyToOne(ManyToOne object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Map</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Map</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMap(Map object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Map Key</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Map Key</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMapKey(MapKey object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Map Key Many To Many</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Map Key Many To Many</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMapKeyManyToMany(MapKeyManyToMany object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Meta</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Meta</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeta(Meta object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Meta Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Meta Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMetaValue(MetaValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Natural Id</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Natural Id</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNaturalId(NaturalId object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nested Composite Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nested Composite Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNestedCompositeElement(NestedCompositeElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>One To Many</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>One To Many</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOneToMany(OneToMany object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>One To One</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>One To One</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOneToOne(OneToOne object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Param</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Param</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParam(Param object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParent(Parent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primitive Array</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primitive Array</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimitiveArray(PrimitiveArray object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Properties</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Properties</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProperties(Properties object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProperty(Property object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Query</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Query</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuery(Query object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Query Param</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Query Param</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQueryParam(QueryParam object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resultset</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resultset</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResultset(Resultset object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Return</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Return</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReturn(Return object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Return Column</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Return Column</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReturnColumn(ReturnColumn object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Return Discriminator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Return Discriminator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReturnDiscriminator(ReturnDiscriminator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Return Join</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Return Join</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReturnJoin(ReturnJoin object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Return Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Return Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReturnProperty(ReturnProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Return Scalar</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Return Scalar</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReturnScalar(ReturnScalar object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSet(Set object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sql Delete</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sql Delete</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSqlDelete(SqlDelete object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sql Delete All</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sql Delete All</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSqlDeleteAll(SqlDeleteAll object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sql Insert</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sql Insert</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSqlInsert(SqlInsert object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sql Query</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sql Query</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSqlQuery(SqlQuery object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sql Update</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sql Update</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSqlUpdate(SqlUpdate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subclass</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subclass</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubclass(Subclass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Synchronize</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Synchronize</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSynchronize(Synchronize object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Timestamp</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Timestamp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimestamp(Timestamp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tuplizer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tuplizer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTuplizer(Tuplizer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseType(Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Typedef</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Typedef</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypedef(Typedef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Union Subclass</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Union Subclass</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnionSubclass(UnionSubclass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Version</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Version</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVersion(Version object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public T defaultCase(EObject object) {
		return null;
	}

} //Hbm30Switch

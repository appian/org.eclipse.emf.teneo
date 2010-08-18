/**
 * <copyright>
 * </copyright>
 *
 * $Id: Hbm30Package.java,v 1.1 2010/08/18 09:25:25 cbouhier Exp $
 */
package org.eclipse.emf.teneo.db2m.hbm30;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Factory
 * @model kind="package"
 * @generated
 */
public interface Hbm30Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "hbm30";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://hibernate.sourceforge.net/hbm30";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "hbm30";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Hbm30Package eINSTANCE = org.eclipse.emf.teneo.db2m.hbm30.impl.Hbm30PackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.db2m.hbm30.impl.AnyImpl <em>Any</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.AnyImpl
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.Hbm30PackageImpl#getAny()
	 * @generated
	 */
	int ANY = 0;

	/**
	 * The feature id for the '<em><b>Meta</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY__META = 0;

	/**
	 * The feature id for the '<em><b>Meta Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY__META_VALUE = 1;

	/**
	 * The feature id for the '<em><b>Column</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY__COLUMN = 2;

	/**
	 * The feature id for the '<em><b>Column1</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY__COLUMN1 = 3;

	/**
	 * The feature id for the '<em><b>Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY__ACCESS = 4;

	/**
	 * The feature id for the '<em><b>Cascade</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY__CASCADE = 5;

	/**
	 * The feature id for the '<em><b>Id Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY__ID_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY__INDEX = 7;

	/**
	 * The feature id for the '<em><b>Insert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY__INSERT = 8;

	/**
	 * The feature id for the '<em><b>Lazy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY__LAZY = 9;

	/**
	 * The feature id for the '<em><b>Meta Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY__META_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY__NAME = 11;

	/**
	 * The feature id for the '<em><b>Node</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY__NODE = 12;

	/**
	 * The feature id for the '<em><b>Optimistic Lock</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY__OPTIMISTIC_LOCK = 13;

	/**
	 * The feature id for the '<em><b>Update</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY__UPDATE = 14;

	/**
	 * The number of structural features of the '<em>Any</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_FEATURE_COUNT = 15;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ArrayImpl <em>Array</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.ArrayImpl
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.Hbm30PackageImpl#getArray()
	 * @generated
	 */
	int ARRAY = 1;

	/**
	 * The feature id for the '<em><b>Meta</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY__META = 0;

	/**
	 * The feature id for the '<em><b>Subselect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY__SUBSELECT = 1;

	/**
	 * The feature id for the '<em><b>Cache</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY__CACHE = 2;

	/**
	 * The feature id for the '<em><b>Synchronize</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY__SYNCHRONIZE = 3;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY__COMMENT = 4;

	/**
	 * The feature id for the '<em><b>Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY__KEY = 5;

	/**
	 * The feature id for the '<em><b>Index</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY__INDEX = 6;

	/**
	 * The feature id for the '<em><b>List Index</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY__LIST_INDEX = 7;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY__ELEMENT = 8;

	/**
	 * The feature id for the '<em><b>One To Many</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY__ONE_TO_MANY = 9;

	/**
	 * The feature id for the '<em><b>Many To Many</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY__MANY_TO_MANY = 10;

	/**
	 * The feature id for the '<em><b>Composite Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY__COMPOSITE_ELEMENT = 11;

	/**
	 * The feature id for the '<em><b>Many To Any</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY__MANY_TO_ANY = 12;

	/**
	 * The feature id for the '<em><b>Loader</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY__LOADER = 13;

	/**
	 * The feature id for the '<em><b>Sql Insert</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY__SQL_INSERT = 14;

	/**
	 * The feature id for the '<em><b>Sql Update</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY__SQL_UPDATE = 15;

	/**
	 * The feature id for the '<em><b>Sql Delete</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY__SQL_DELETE = 16;

	/**
	 * The feature id for the '<em><b>Sql Delete All</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY__SQL_DELETE_ALL = 17;

	/**
	 * The feature id for the '<em><b>Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY__ACCESS = 18;

	/**
	 * The feature id for the '<em><b>Batch Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY__BATCH_SIZE = 19;

	/**
	 * The feature id for the '<em><b>Cascade</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY__CASCADE = 20;

	/**
	 * The feature id for the '<em><b>Catalog</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY__CATALOG = 21;

	/**
	 * The feature id for the '<em><b>Check</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY__CHECK = 22;

	/**
	 * The feature id for the '<em><b>Collection Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY__COLLECTION_TYPE = 23;

	/**
	 * The feature id for the '<em><b>Element Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY__ELEMENT_CLASS = 24;

	/**
	 * The feature id for the '<em><b>Embed Xml</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY__EMBED_XML = 25;

	/**
	 * The feature id for the '<em><b>Fetch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY__FETCH = 26;

	/**
	 * The feature id for the '<em><b>Inverse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY__INVERSE = 27;

	/**
	 * The feature id for the '<em><b>Mutable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY__MUTABLE = 28;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY__NAME = 29;

	/**
	 * The feature id for the '<em><b>Node</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY__NODE = 30;

	/**
	 * The feature id for the '<em><b>Optimistic Lock</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY__OPTIMISTIC_LOCK = 31;

	/**
	 * The feature id for the '<em><b>Outer Join</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY__OUTER_JOIN = 32;

	/**
	 * The feature id for the '<em><b>Persister</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY__PERSISTER = 33;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY__SCHEMA = 34;

	/**
	 * The feature id for the '<em><b>Subselect1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY__SUBSELECT1 = 35;

	/**
	 * The feature id for the '<em><b>Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY__TABLE = 36;

	/**
	 * The feature id for the '<em><b>Where</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY__WHERE = 37;

	/**
	 * The number of structural features of the '<em>Array</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_FEATURE_COUNT = 38;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.db2m.hbm30.impl.BagImpl <em>Bag</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.BagImpl
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.Hbm30PackageImpl#getBag()
	 * @generated
	 */
	int BAG = 2;

	/**
	 * The feature id for the '<em><b>Meta</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG__META = 0;

	/**
	 * The feature id for the '<em><b>Subselect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG__SUBSELECT = 1;

	/**
	 * The feature id for the '<em><b>Cache</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG__CACHE = 2;

	/**
	 * The feature id for the '<em><b>Synchronize</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG__SYNCHRONIZE = 3;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG__COMMENT = 4;

	/**
	 * The feature id for the '<em><b>Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG__KEY = 5;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG__ELEMENT = 6;

	/**
	 * The feature id for the '<em><b>One To Many</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG__ONE_TO_MANY = 7;

	/**
	 * The feature id for the '<em><b>Many To Many</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG__MANY_TO_MANY = 8;

	/**
	 * The feature id for the '<em><b>Composite Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG__COMPOSITE_ELEMENT = 9;

	/**
	 * The feature id for the '<em><b>Many To Any</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG__MANY_TO_ANY = 10;

	/**
	 * The feature id for the '<em><b>Loader</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG__LOADER = 11;

	/**
	 * The feature id for the '<em><b>Sql Insert</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG__SQL_INSERT = 12;

	/**
	 * The feature id for the '<em><b>Sql Update</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG__SQL_UPDATE = 13;

	/**
	 * The feature id for the '<em><b>Sql Delete</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG__SQL_DELETE = 14;

	/**
	 * The feature id for the '<em><b>Sql Delete All</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG__SQL_DELETE_ALL = 15;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG__FILTER = 16;

	/**
	 * The feature id for the '<em><b>Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG__ACCESS = 17;

	/**
	 * The feature id for the '<em><b>Batch Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG__BATCH_SIZE = 18;

	/**
	 * The feature id for the '<em><b>Cascade</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG__CASCADE = 19;

	/**
	 * The feature id for the '<em><b>Catalog</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG__CATALOG = 20;

	/**
	 * The feature id for the '<em><b>Check</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG__CHECK = 21;

	/**
	 * The feature id for the '<em><b>Collection Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG__COLLECTION_TYPE = 22;

	/**
	 * The feature id for the '<em><b>Embed Xml</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG__EMBED_XML = 23;

	/**
	 * The feature id for the '<em><b>Fetch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG__FETCH = 24;

	/**
	 * The feature id for the '<em><b>Inverse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG__INVERSE = 25;

	/**
	 * The feature id for the '<em><b>Lazy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG__LAZY = 26;

	/**
	 * The feature id for the '<em><b>Mutable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG__MUTABLE = 27;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG__NAME = 28;

	/**
	 * The feature id for the '<em><b>Node</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG__NODE = 29;

	/**
	 * The feature id for the '<em><b>Optimistic Lock</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG__OPTIMISTIC_LOCK = 30;

	/**
	 * The feature id for the '<em><b>Order By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG__ORDER_BY = 31;

	/**
	 * The feature id for the '<em><b>Outer Join</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG__OUTER_JOIN = 32;

	/**
	 * The feature id for the '<em><b>Persister</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG__PERSISTER = 33;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG__SCHEMA = 34;

	/**
	 * The feature id for the '<em><b>Subselect1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG__SUBSELECT1 = 35;

	/**
	 * The feature id for the '<em><b>Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG__TABLE = 36;

	/**
	 * The feature id for the '<em><b>Where</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG__WHERE = 37;

	/**
	 * The number of structural features of the '<em>Bag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_FEATURE_COUNT = 38;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.db2m.hbm30.impl.CacheImpl <em>Cache</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.CacheImpl
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.Hbm30PackageImpl#getCache()
	 * @generated
	 */
	int CACHE = 3;

	/**
	 * The feature id for the '<em><b>Include</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE__INCLUDE = 0;

	/**
	 * The feature id for the '<em><b>Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE__REGION = 1;

	/**
	 * The feature id for the '<em><b>Usage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE__USAGE = 2;

	/**
	 * The number of structural features of the '<em>Cache</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ClassImpl <em>Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.ClassImpl
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.Hbm30PackageImpl#getClass_()
	 * @generated
	 */
	int CLASS = 4;

	/**
	 * The feature id for the '<em><b>Meta</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__META = 0;

	/**
	 * The feature id for the '<em><b>Subselect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__SUBSELECT = 1;

	/**
	 * The feature id for the '<em><b>Cache</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__CACHE = 2;

	/**
	 * The feature id for the '<em><b>Synchronize</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__SYNCHRONIZE = 3;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__COMMENT = 4;

	/**
	 * The feature id for the '<em><b>Tuplizer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__TUPLIZER = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__ID = 6;

	/**
	 * The feature id for the '<em><b>Composite Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__COMPOSITE_ID = 7;

	/**
	 * The feature id for the '<em><b>Discriminator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__DISCRIMINATOR = 8;

	/**
	 * The feature id for the '<em><b>Natural Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__NATURAL_ID = 9;

	/**
	 * The feature id for the '<em><b>Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__VERSION = 10;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__TIMESTAMP = 11;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__GROUP = 12;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__PROPERTY = 13;

	/**
	 * The feature id for the '<em><b>Many To One</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__MANY_TO_ONE = 14;

	/**
	 * The feature id for the '<em><b>One To One</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__ONE_TO_ONE = 15;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__COMPONENT = 16;

	/**
	 * The feature id for the '<em><b>Dynamic Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__DYNAMIC_COMPONENT = 17;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__PROPERTIES = 18;

	/**
	 * The feature id for the '<em><b>Any</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__ANY = 19;

	/**
	 * The feature id for the '<em><b>Map</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__MAP = 20;

	/**
	 * The feature id for the '<em><b>Set</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__SET = 21;

	/**
	 * The feature id for the '<em><b>List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__LIST = 22;

	/**
	 * The feature id for the '<em><b>Bag</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__BAG = 23;

	/**
	 * The feature id for the '<em><b>Idbag</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__IDBAG = 24;

	/**
	 * The feature id for the '<em><b>Array</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__ARRAY = 25;

	/**
	 * The feature id for the '<em><b>Primitive Array</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__PRIMITIVE_ARRAY = 26;

	/**
	 * The feature id for the '<em><b>Join</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__JOIN = 27;

	/**
	 * The feature id for the '<em><b>Subclass</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__SUBCLASS = 28;

	/**
	 * The feature id for the '<em><b>Joined Subclass</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__JOINED_SUBCLASS = 29;

	/**
	 * The feature id for the '<em><b>Union Subclass</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__UNION_SUBCLASS = 30;

	/**
	 * The feature id for the '<em><b>Loader</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__LOADER = 31;

	/**
	 * The feature id for the '<em><b>Sql Insert</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__SQL_INSERT = 32;

	/**
	 * The feature id for the '<em><b>Sql Update</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__SQL_UPDATE = 33;

	/**
	 * The feature id for the '<em><b>Sql Delete</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__SQL_DELETE = 34;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__FILTER = 35;

	/**
	 * The feature id for the '<em><b>Resultset</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__RESULTSET = 36;

	/**
	 * The feature id for the '<em><b>Group1</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__GROUP1 = 37;

	/**
	 * The feature id for the '<em><b>Query</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__QUERY = 38;

	/**
	 * The feature id for the '<em><b>Sql Query</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__SQL_QUERY = 39;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__ABSTRACT = 40;

	/**
	 * The feature id for the '<em><b>Batch Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__BATCH_SIZE = 41;

	/**
	 * The feature id for the '<em><b>Catalog</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__CATALOG = 42;

	/**
	 * The feature id for the '<em><b>Check</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__CHECK = 43;

	/**
	 * The feature id for the '<em><b>Discriminator Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__DISCRIMINATOR_VALUE = 44;

	/**
	 * The feature id for the '<em><b>Dynamic Insert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__DYNAMIC_INSERT = 45;

	/**
	 * The feature id for the '<em><b>Dynamic Update</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__DYNAMIC_UPDATE = 46;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__ENTITY_NAME = 47;

	/**
	 * The feature id for the '<em><b>Lazy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__LAZY = 48;

	/**
	 * The feature id for the '<em><b>Mutable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__MUTABLE = 49;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__NAME = 50;

	/**
	 * The feature id for the '<em><b>Node</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__NODE = 51;

	/**
	 * The feature id for the '<em><b>Optimistic Lock</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__OPTIMISTIC_LOCK = 52;

	/**
	 * The feature id for the '<em><b>Persister</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__PERSISTER = 53;

	/**
	 * The feature id for the '<em><b>Polymorphism</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__POLYMORPHISM = 54;

	/**
	 * The feature id for the '<em><b>Proxy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__PROXY = 55;

	/**
	 * The feature id for the '<em><b>Rowid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__ROWID = 56;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__SCHEMA = 57;

	/**
	 * The feature id for the '<em><b>Select Before Update</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__SELECT_BEFORE_UPDATE = 58;

	/**
	 * The feature id for the '<em><b>Subselect1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__SUBSELECT1 = 59;

	/**
	 * The feature id for the '<em><b>Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__TABLE = 60;

	/**
	 * The feature id for the '<em><b>Where</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__WHERE = 61;

	/**
	 * The number of structural features of the '<em>Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_FEATURE_COUNT = 62;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.db2m.hbm30.impl.CollectionImpl <em>Collection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.CollectionImpl
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.Hbm30PackageImpl#getCollection()
	 * @generated
	 */
	int COLLECTION = 5;

	/**
	 * The feature id for the '<em><b>Meta</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION__META = 0;

	/**
	 * The feature id for the '<em><b>Subselect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION__SUBSELECT = 1;

	/**
	 * The feature id for the '<em><b>Cache</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION__CACHE = 2;

	/**
	 * The feature id for the '<em><b>Synchronize</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION__SYNCHRONIZE = 3;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION__COMMENT = 4;

	/**
	 * The feature id for the '<em><b>Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION__KEY = 5;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION__ELEMENT = 6;

	/**
	 * The feature id for the '<em><b>One To Many</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION__ONE_TO_MANY = 7;

	/**
	 * The feature id for the '<em><b>Many To Many</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION__MANY_TO_MANY = 8;

	/**
	 * The feature id for the '<em><b>Composite Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION__COMPOSITE_ELEMENT = 9;

	/**
	 * The feature id for the '<em><b>Many To Any</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION__MANY_TO_ANY = 10;

	/**
	 * The feature id for the '<em><b>Loader</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION__LOADER = 11;

	/**
	 * The feature id for the '<em><b>Sql Insert</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION__SQL_INSERT = 12;

	/**
	 * The feature id for the '<em><b>Sql Update</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION__SQL_UPDATE = 13;

	/**
	 * The feature id for the '<em><b>Sql Delete</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION__SQL_DELETE = 14;

	/**
	 * The feature id for the '<em><b>Sql Delete All</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION__SQL_DELETE_ALL = 15;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION__FILTER = 16;

	/**
	 * The feature id for the '<em><b>Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION__ACCESS = 17;

	/**
	 * The feature id for the '<em><b>Batch Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION__BATCH_SIZE = 18;

	/**
	 * The feature id for the '<em><b>Cascade</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION__CASCADE = 19;

	/**
	 * The feature id for the '<em><b>Catalog</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION__CATALOG = 20;

	/**
	 * The feature id for the '<em><b>Check</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION__CHECK = 21;

	/**
	 * The feature id for the '<em><b>Collection Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION__COLLECTION_TYPE = 22;

	/**
	 * The feature id for the '<em><b>Embed Xml</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION__EMBED_XML = 23;

	/**
	 * The feature id for the '<em><b>Fetch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION__FETCH = 24;

	/**
	 * The feature id for the '<em><b>Inverse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION__INVERSE = 25;

	/**
	 * The feature id for the '<em><b>Lazy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION__LAZY = 26;

	/**
	 * The feature id for the '<em><b>Mutable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION__MUTABLE = 27;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION__NAME = 28;

	/**
	 * The feature id for the '<em><b>Node</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION__NODE = 29;

	/**
	 * The feature id for the '<em><b>Optimistic Lock</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION__OPTIMISTIC_LOCK = 30;

	/**
	 * The feature id for the '<em><b>Order By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION__ORDER_BY = 31;

	/**
	 * The feature id for the '<em><b>Outer Join</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION__OUTER_JOIN = 32;

	/**
	 * The feature id for the '<em><b>Persister</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION__PERSISTER = 33;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION__SCHEMA = 34;

	/**
	 * The feature id for the '<em><b>Subselect1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION__SUBSELECT1 = 35;

	/**
	 * The feature id for the '<em><b>Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION__TABLE = 36;

	/**
	 * The feature id for the '<em><b>Where</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION__WHERE = 37;

	/**
	 * The number of structural features of the '<em>Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_FEATURE_COUNT = 38;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.db2m.hbm30.impl.CollectionIdImpl <em>Collection Id</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.CollectionIdImpl
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.Hbm30PackageImpl#getCollectionId()
	 * @generated
	 */
	int COLLECTION_ID = 6;

	/**
	 * The feature id for the '<em><b>Meta</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_ID__META = 0;

	/**
	 * The feature id for the '<em><b>Column</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_ID__COLUMN = 1;

	/**
	 * The feature id for the '<em><b>Generator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_ID__GENERATOR = 2;

	/**
	 * The feature id for the '<em><b>Column1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_ID__COLUMN1 = 3;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_ID__LENGTH = 4;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_ID__TYPE = 5;

	/**
	 * The number of structural features of the '<em>Collection Id</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_ID_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ColumnImpl <em>Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.ColumnImpl
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.Hbm30PackageImpl#getColumn()
	 * @generated
	 */
	int COLUMN = 7;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__COMMENT = 0;

	/**
	 * The feature id for the '<em><b>Check</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__CHECK = 1;

	/**
	 * The feature id for the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__DEFAULT = 2;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__INDEX = 3;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__LENGTH = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__NAME = 5;

	/**
	 * The feature id for the '<em><b>Not Null</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__NOT_NULL = 6;

	/**
	 * The feature id for the '<em><b>Precision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__PRECISION = 7;

	/**
	 * The feature id for the '<em><b>Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__SCALE = 8;

	/**
	 * The feature id for the '<em><b>Sql Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__SQL_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__UNIQUE = 10;

	/**
	 * The feature id for the '<em><b>Unique Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__UNIQUE_KEY = 11;

	/**
	 * The number of structural features of the '<em>Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_FEATURE_COUNT = 12;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.ComponentImpl
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.Hbm30PackageImpl#getComponent()
	 * @generated
	 */
	int COMPONENT = 8;

	/**
	 * The feature id for the '<em><b>Meta</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__META = 0;

	/**
	 * The feature id for the '<em><b>Tuplizer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__TUPLIZER = 1;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__PARENT = 2;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__GROUP = 3;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__PROPERTY = 4;

	/**
	 * The feature id for the '<em><b>Many To One</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__MANY_TO_ONE = 5;

	/**
	 * The feature id for the '<em><b>One To One</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__ONE_TO_ONE = 6;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__COMPONENT = 7;

	/**
	 * The feature id for the '<em><b>Dynamic Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__DYNAMIC_COMPONENT = 8;

	/**
	 * The feature id for the '<em><b>Any</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__ANY = 9;

	/**
	 * The feature id for the '<em><b>Map</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__MAP = 10;

	/**
	 * The feature id for the '<em><b>Set</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__SET = 11;

	/**
	 * The feature id for the '<em><b>List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__LIST = 12;

	/**
	 * The feature id for the '<em><b>Bag</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__BAG = 13;

	/**
	 * The feature id for the '<em><b>Array</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__ARRAY = 14;

	/**
	 * The feature id for the '<em><b>Primitive Array</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__PRIMITIVE_ARRAY = 15;

	/**
	 * The feature id for the '<em><b>Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__ACCESS = 16;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__CLASS = 17;

	/**
	 * The feature id for the '<em><b>Insert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__INSERT = 18;

	/**
	 * The feature id for the '<em><b>Lazy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__LAZY = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__NAME = 20;

	/**
	 * The feature id for the '<em><b>Node</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__NODE = 21;

	/**
	 * The feature id for the '<em><b>Optimistic Lock</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__OPTIMISTIC_LOCK = 22;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__UNIQUE = 23;

	/**
	 * The feature id for the '<em><b>Update</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__UPDATE = 24;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURE_COUNT = 25;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.db2m.hbm30.impl.CompositeElementImpl <em>Composite Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.CompositeElementImpl
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.Hbm30PackageImpl#getCompositeElement()
	 * @generated
	 */
	int COMPOSITE_ELEMENT = 9;

	/**
	 * The feature id for the '<em><b>Meta</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_ELEMENT__META = 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_ELEMENT__PARENT = 1;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_ELEMENT__GROUP = 2;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_ELEMENT__PROPERTY = 3;

	/**
	 * The feature id for the '<em><b>Many To One</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_ELEMENT__MANY_TO_ONE = 4;

	/**
	 * The feature id for the '<em><b>Any</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_ELEMENT__ANY = 5;

	/**
	 * The feature id for the '<em><b>Nested Composite Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_ELEMENT__NESTED_COMPOSITE_ELEMENT = 6;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_ELEMENT__CLASS = 7;

	/**
	 * The feature id for the '<em><b>Node</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_ELEMENT__NODE = 8;

	/**
	 * The number of structural features of the '<em>Composite Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_ELEMENT_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.db2m.hbm30.impl.CompositeIdImpl <em>Composite Id</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.CompositeIdImpl
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.Hbm30PackageImpl#getCompositeId()
	 * @generated
	 */
	int COMPOSITE_ID = 10;

	/**
	 * The feature id for the '<em><b>Meta</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_ID__META = 0;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_ID__GROUP = 1;

	/**
	 * The feature id for the '<em><b>Key Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_ID__KEY_PROPERTY = 2;

	/**
	 * The feature id for the '<em><b>Key Many To One</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_ID__KEY_MANY_TO_ONE = 3;

	/**
	 * The feature id for the '<em><b>Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_ID__ACCESS = 4;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_ID__CLASS = 5;

	/**
	 * The feature id for the '<em><b>Mapped</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_ID__MAPPED = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_ID__NAME = 7;

	/**
	 * The feature id for the '<em><b>Node</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_ID__NODE = 8;

	/**
	 * The feature id for the '<em><b>Unsaved Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_ID__UNSAVED_VALUE = 9;

	/**
	 * The number of structural features of the '<em>Composite Id</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_ID_FEATURE_COUNT = 10;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.db2m.hbm30.impl.CompositeIndexImpl <em>Composite Index</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.CompositeIndexImpl
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.Hbm30PackageImpl#getCompositeIndex()
	 * @generated
	 */
	int COMPOSITE_INDEX = 11;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_INDEX__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Key Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_INDEX__KEY_PROPERTY = 1;

	/**
	 * The feature id for the '<em><b>Key Many To One</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_INDEX__KEY_MANY_TO_ONE = 2;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_INDEX__CLASS = 3;

	/**
	 * The number of structural features of the '<em>Composite Index</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_INDEX_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.db2m.hbm30.impl.CompositeMapKeyImpl <em>Composite Map Key</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.CompositeMapKeyImpl
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.Hbm30PackageImpl#getCompositeMapKey()
	 * @generated
	 */
	int COMPOSITE_MAP_KEY = 12;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_MAP_KEY__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Key Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_MAP_KEY__KEY_PROPERTY = 1;

	/**
	 * The feature id for the '<em><b>Key Many To One</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_MAP_KEY__KEY_MANY_TO_ONE = 2;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_MAP_KEY__CLASS = 3;

	/**
	 * The number of structural features of the '<em>Composite Map Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_MAP_KEY_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.db2m.hbm30.impl.DatabaseObjectImpl <em>Database Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.DatabaseObjectImpl
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.Hbm30PackageImpl#getDatabaseObject()
	 * @generated
	 */
	int DATABASE_OBJECT = 13;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_OBJECT__DEFINITION = 0;

	/**
	 * The feature id for the '<em><b>Create</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_OBJECT__CREATE = 1;

	/**
	 * The feature id for the '<em><b>Drop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_OBJECT__DROP = 2;

	/**
	 * The feature id for the '<em><b>Dialect Scope</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_OBJECT__DIALECT_SCOPE = 3;

	/**
	 * The number of structural features of the '<em>Database Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_OBJECT_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.db2m.hbm30.impl.DefinitionImpl <em>Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.DefinitionImpl
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.Hbm30PackageImpl#getDefinition()
	 * @generated
	 */
	int DEFINITION = 14;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION__CLASS = 0;

	/**
	 * The number of structural features of the '<em>Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.db2m.hbm30.impl.DialectScopeImpl <em>Dialect Scope</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.DialectScopeImpl
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.Hbm30PackageImpl#getDialectScope()
	 * @generated
	 */
	int DIALECT_SCOPE = 15;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALECT_SCOPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALECT_SCOPE__NAME = 1;

	/**
	 * The number of structural features of the '<em>Dialect Scope</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALECT_SCOPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.db2m.hbm30.impl.DiscriminatorImpl <em>Discriminator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.DiscriminatorImpl
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.Hbm30PackageImpl#getDiscriminator()
	 * @generated
	 */
	int DISCRIMINATOR = 16;

	/**
	 * The feature id for the '<em><b>Column</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRIMINATOR__COLUMN = 0;

	/**
	 * The feature id for the '<em><b>Formula</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRIMINATOR__FORMULA = 1;

	/**
	 * The feature id for the '<em><b>Column1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRIMINATOR__COLUMN1 = 2;

	/**
	 * The feature id for the '<em><b>Force</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRIMINATOR__FORCE = 3;

	/**
	 * The feature id for the '<em><b>Formula1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRIMINATOR__FORMULA1 = 4;

	/**
	 * The feature id for the '<em><b>Insert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRIMINATOR__INSERT = 5;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRIMINATOR__LENGTH = 6;

	/**
	 * The feature id for the '<em><b>Not Null</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRIMINATOR__NOT_NULL = 7;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRIMINATOR__TYPE = 8;

	/**
	 * The number of structural features of the '<em>Discriminator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRIMINATOR_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.db2m.hbm30.impl.DynamicComponentImpl <em>Dynamic Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.DynamicComponentImpl
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.Hbm30PackageImpl#getDynamicComponent()
	 * @generated
	 */
	int DYNAMIC_COMPONENT = 17;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_COMPONENT__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_COMPONENT__PROPERTY = 1;

	/**
	 * The feature id for the '<em><b>Many To One</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_COMPONENT__MANY_TO_ONE = 2;

	/**
	 * The feature id for the '<em><b>One To One</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_COMPONENT__ONE_TO_ONE = 3;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_COMPONENT__COMPONENT = 4;

	/**
	 * The feature id for the '<em><b>Dynamic Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_COMPONENT__DYNAMIC_COMPONENT = 5;

	/**
	 * The feature id for the '<em><b>Any</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_COMPONENT__ANY = 6;

	/**
	 * The feature id for the '<em><b>Map</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_COMPONENT__MAP = 7;

	/**
	 * The feature id for the '<em><b>Set</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_COMPONENT__SET = 8;

	/**
	 * The feature id for the '<em><b>List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_COMPONENT__LIST = 9;

	/**
	 * The feature id for the '<em><b>Bag</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_COMPONENT__BAG = 10;

	/**
	 * The feature id for the '<em><b>Array</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_COMPONENT__ARRAY = 11;

	/**
	 * The feature id for the '<em><b>Primitive Array</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_COMPONENT__PRIMITIVE_ARRAY = 12;

	/**
	 * The feature id for the '<em><b>Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_COMPONENT__ACCESS = 13;

	/**
	 * The feature id for the '<em><b>Insert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_COMPONENT__INSERT = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_COMPONENT__NAME = 15;

	/**
	 * The feature id for the '<em><b>Node</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_COMPONENT__NODE = 16;

	/**
	 * The feature id for the '<em><b>Optimistic Lock</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_COMPONENT__OPTIMISTIC_LOCK = 17;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_COMPONENT__UNIQUE = 18;

	/**
	 * The feature id for the '<em><b>Update</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_COMPONENT__UPDATE = 19;

	/**
	 * The number of structural features of the '<em>Dynamic Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_COMPONENT_FEATURE_COUNT = 20;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.ElementImpl
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.Hbm30PackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 18;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Column</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__COLUMN = 1;

	/**
	 * The feature id for the '<em><b>Formula</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__FORMULA = 2;

	/**
	 * The feature id for the '<em><b>Column1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__COLUMN1 = 3;

	/**
	 * The feature id for the '<em><b>Formula1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__FORMULA1 = 4;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__LENGTH = 5;

	/**
	 * The feature id for the '<em><b>Node</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__NODE = 6;

	/**
	 * The feature id for the '<em><b>Not Null</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__NOT_NULL = 7;

	/**
	 * The feature id for the '<em><b>Precision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__PRECISION = 8;

	/**
	 * The feature id for the '<em><b>Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__SCALE = 9;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__TYPE = 10;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__UNIQUE = 11;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = 12;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.db2m.hbm30.impl.FilterImpl <em>Filter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.FilterImpl
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.Hbm30PackageImpl#getFilter()
	 * @generated
	 */
	int FILTER = 19;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER__CONDITION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER__NAME = 2;

	/**
	 * The number of structural features of the '<em>Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.db2m.hbm30.impl.FilterDefImpl <em>Filter Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.FilterDefImpl
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.Hbm30PackageImpl#getFilterDef()
	 * @generated
	 */
	int FILTER_DEF = 20;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_DEF__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_DEF__GROUP = 1;

	/**
	 * The feature id for the '<em><b>Filter Param</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_DEF__FILTER_PARAM = 2;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_DEF__CONDITION = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_DEF__NAME = 4;

	/**
	 * The number of structural features of the '<em>Filter Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_DEF_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.db2m.hbm30.impl.FilterParamImpl <em>Filter Param</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.FilterParamImpl
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.Hbm30PackageImpl#getFilterParam()
	 * @generated
	 */
	int FILTER_PARAM = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_PARAM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_PARAM__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Filter Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_PARAM_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.db2m.hbm30.impl.GeneratorImpl <em>Generator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.GeneratorImpl
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.Hbm30PackageImpl#getGenerator()
	 * @generated
	 */
	int GENERATOR = 22;

	/**
	 * The feature id for the '<em><b>Param</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR__PARAM = 0;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR__CLASS = 1;

	/**
	 * The number of structural features of the '<em>Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.db2m.hbm30.impl.HibernateMappingImpl <em>Hibernate Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.HibernateMappingImpl
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.Hbm30PackageImpl#getHibernateMapping()
	 * @generated
	 */
	int HIBERNATE_MAPPING = 23;

	/**
	 * The feature id for the '<em><b>Meta</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIBERNATE_MAPPING__META = 0;

	/**
	 * The feature id for the '<em><b>Typedef</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIBERNATE_MAPPING__TYPEDEF = 1;

	/**
	 * The feature id for the '<em><b>Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIBERNATE_MAPPING__IMPORT = 2;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIBERNATE_MAPPING__GROUP = 3;

	/**
	 * The feature id for the '<em><b>Class</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIBERNATE_MAPPING__CLASS = 4;

	/**
	 * The feature id for the '<em><b>Subclass</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIBERNATE_MAPPING__SUBCLASS = 5;

	/**
	 * The feature id for the '<em><b>Joined Subclass</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIBERNATE_MAPPING__JOINED_SUBCLASS = 6;

	/**
	 * The feature id for the '<em><b>Union Subclass</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIBERNATE_MAPPING__UNION_SUBCLASS = 7;

	/**
	 * The feature id for the '<em><b>Resultset</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIBERNATE_MAPPING__RESULTSET = 8;

	/**
	 * The feature id for the '<em><b>Group1</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIBERNATE_MAPPING__GROUP1 = 9;

	/**
	 * The feature id for the '<em><b>Query</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIBERNATE_MAPPING__QUERY = 10;

	/**
	 * The feature id for the '<em><b>Sql Query</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIBERNATE_MAPPING__SQL_QUERY = 11;

	/**
	 * The feature id for the '<em><b>Filter Def</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIBERNATE_MAPPING__FILTER_DEF = 12;

	/**
	 * The feature id for the '<em><b>Database Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIBERNATE_MAPPING__DATABASE_OBJECT = 13;

	/**
	 * The feature id for the '<em><b>Auto Import</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIBERNATE_MAPPING__AUTO_IMPORT = 14;

	/**
	 * The feature id for the '<em><b>Catalog</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIBERNATE_MAPPING__CATALOG = 15;

	/**
	 * The feature id for the '<em><b>Default Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIBERNATE_MAPPING__DEFAULT_ACCESS = 16;

	/**
	 * The feature id for the '<em><b>Default Cascade</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIBERNATE_MAPPING__DEFAULT_CASCADE = 17;

	/**
	 * The feature id for the '<em><b>Default Lazy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIBERNATE_MAPPING__DEFAULT_LAZY = 18;

	/**
	 * The feature id for the '<em><b>Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIBERNATE_MAPPING__PACKAGE = 19;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIBERNATE_MAPPING__SCHEMA = 20;

	/**
	 * The number of structural features of the '<em>Hibernate Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIBERNATE_MAPPING_FEATURE_COUNT = 21;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.db2m.hbm30.impl.IdImpl <em>Id</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.IdImpl
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.Hbm30PackageImpl#getId()
	 * @generated
	 */
	int ID = 24;

	/**
	 * The feature id for the '<em><b>Meta</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID__META = 0;

	/**
	 * The feature id for the '<em><b>Column</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID__COLUMN = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Generator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID__GENERATOR = 3;

	/**
	 * The feature id for the '<em><b>Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID__ACCESS = 4;

	/**
	 * The feature id for the '<em><b>Column1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID__COLUMN1 = 5;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID__LENGTH = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID__NAME = 7;

	/**
	 * The feature id for the '<em><b>Node</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID__NODE = 8;

	/**
	 * The feature id for the '<em><b>Type1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID__TYPE1 = 9;

	/**
	 * The feature id for the '<em><b>Unsaved Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID__UNSAVED_VALUE = 10;

	/**
	 * The number of structural features of the '<em>Id</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_FEATURE_COUNT = 11;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.db2m.hbm30.impl.IdbagImpl <em>Idbag</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.IdbagImpl
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.Hbm30PackageImpl#getIdbag()
	 * @generated
	 */
	int IDBAG = 25;

	/**
	 * The feature id for the '<em><b>Meta</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDBAG__META = 0;

	/**
	 * The feature id for the '<em><b>Subselect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDBAG__SUBSELECT = 1;

	/**
	 * The feature id for the '<em><b>Cache</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDBAG__CACHE = 2;

	/**
	 * The feature id for the '<em><b>Synchronize</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDBAG__SYNCHRONIZE = 3;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDBAG__COMMENT = 4;

	/**
	 * The feature id for the '<em><b>Collection Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDBAG__COLLECTION_ID = 5;

	/**
	 * The feature id for the '<em><b>Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDBAG__KEY = 6;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDBAG__ELEMENT = 7;

	/**
	 * The feature id for the '<em><b>Many To Many</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDBAG__MANY_TO_MANY = 8;

	/**
	 * The feature id for the '<em><b>Composite Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDBAG__COMPOSITE_ELEMENT = 9;

	/**
	 * The feature id for the '<em><b>Many To Any</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDBAG__MANY_TO_ANY = 10;

	/**
	 * The feature id for the '<em><b>Loader</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDBAG__LOADER = 11;

	/**
	 * The feature id for the '<em><b>Sql Insert</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDBAG__SQL_INSERT = 12;

	/**
	 * The feature id for the '<em><b>Sql Update</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDBAG__SQL_UPDATE = 13;

	/**
	 * The feature id for the '<em><b>Sql Delete</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDBAG__SQL_DELETE = 14;

	/**
	 * The feature id for the '<em><b>Sql Delete All</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDBAG__SQL_DELETE_ALL = 15;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDBAG__FILTER = 16;

	/**
	 * The feature id for the '<em><b>Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDBAG__ACCESS = 17;

	/**
	 * The feature id for the '<em><b>Batch Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDBAG__BATCH_SIZE = 18;

	/**
	 * The feature id for the '<em><b>Cascade</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDBAG__CASCADE = 19;

	/**
	 * The feature id for the '<em><b>Catalog</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDBAG__CATALOG = 20;

	/**
	 * The feature id for the '<em><b>Check</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDBAG__CHECK = 21;

	/**
	 * The feature id for the '<em><b>Collection Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDBAG__COLLECTION_TYPE = 22;

	/**
	 * The feature id for the '<em><b>Embed Xml</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDBAG__EMBED_XML = 23;

	/**
	 * The feature id for the '<em><b>Fetch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDBAG__FETCH = 24;

	/**
	 * The feature id for the '<em><b>Lazy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDBAG__LAZY = 25;

	/**
	 * The feature id for the '<em><b>Mutable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDBAG__MUTABLE = 26;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDBAG__NAME = 27;

	/**
	 * The feature id for the '<em><b>Node</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDBAG__NODE = 28;

	/**
	 * The feature id for the '<em><b>Optimistic Lock</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDBAG__OPTIMISTIC_LOCK = 29;

	/**
	 * The feature id for the '<em><b>Order By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDBAG__ORDER_BY = 30;

	/**
	 * The feature id for the '<em><b>Outer Join</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDBAG__OUTER_JOIN = 31;

	/**
	 * The feature id for the '<em><b>Persister</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDBAG__PERSISTER = 32;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDBAG__SCHEMA = 33;

	/**
	 * The feature id for the '<em><b>Subselect1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDBAG__SUBSELECT1 = 34;

	/**
	 * The feature id for the '<em><b>Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDBAG__TABLE = 35;

	/**
	 * The feature id for the '<em><b>Where</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDBAG__WHERE = 36;

	/**
	 * The number of structural features of the '<em>Idbag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDBAG_FEATURE_COUNT = 37;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ImportImpl <em>Import</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.ImportImpl
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.Hbm30PackageImpl#getImport()
	 * @generated
	 */
	int IMPORT = 26;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT__CLASS = 0;

	/**
	 * The feature id for the '<em><b>Rename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT__RENAME = 1;

	/**
	 * The number of structural features of the '<em>Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.db2m.hbm30.impl.IndexImpl <em>Index</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.IndexImpl
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.Hbm30PackageImpl#getIndex()
	 * @generated
	 */
	int INDEX = 27;

	/**
	 * The feature id for the '<em><b>Column</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX__COLUMN = 0;

	/**
	 * The feature id for the '<em><b>Column1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX__COLUMN1 = 1;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX__LENGTH = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX__TYPE = 3;

	/**
	 * The number of structural features of the '<em>Index</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.db2m.hbm30.impl.IndexManyToAnyImpl <em>Index Many To Any</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.IndexManyToAnyImpl
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.Hbm30PackageImpl#getIndexManyToAny()
	 * @generated
	 */
	int INDEX_MANY_TO_ANY = 28;

	/**
	 * The feature id for the '<em><b>Column</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_MANY_TO_ANY__COLUMN = 0;

	/**
	 * The feature id for the '<em><b>Column1</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_MANY_TO_ANY__COLUMN1 = 1;

	/**
	 * The feature id for the '<em><b>Id Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_MANY_TO_ANY__ID_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Meta Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_MANY_TO_ANY__META_TYPE = 3;

	/**
	 * The number of structural features of the '<em>Index Many To Any</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_MANY_TO_ANY_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.db2m.hbm30.impl.IndexManyToManyImpl <em>Index Many To Many</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.IndexManyToManyImpl
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.Hbm30PackageImpl#getIndexManyToMany()
	 * @generated
	 */
	int INDEX_MANY_TO_MANY = 29;

	/**
	 * The feature id for the '<em><b>Column</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_MANY_TO_MANY__COLUMN = 0;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_MANY_TO_MANY__CLASS = 1;

	/**
	 * The feature id for the '<em><b>Column1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_MANY_TO_MANY__COLUMN1 = 2;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_MANY_TO_MANY__ENTITY_NAME = 3;

	/**
	 * The feature id for the '<em><b>Foreign Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_MANY_TO_MANY__FOREIGN_KEY = 4;

	/**
	 * The number of structural features of the '<em>Index Many To Many</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_MANY_TO_MANY_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.db2m.hbm30.impl.JoinImpl <em>Join</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.JoinImpl
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.Hbm30PackageImpl#getJoin()
	 * @generated
	 */
	int JOIN = 30;

	/**
	 * The feature id for the '<em><b>Subselect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN__SUBSELECT = 0;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN__COMMENT = 1;

	/**
	 * The feature id for the '<em><b>Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN__KEY = 2;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN__GROUP = 3;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN__PROPERTY = 4;

	/**
	 * The feature id for the '<em><b>Many To One</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN__MANY_TO_ONE = 5;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN__COMPONENT = 6;

	/**
	 * The feature id for the '<em><b>Dynamic Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN__DYNAMIC_COMPONENT = 7;

	/**
	 * The feature id for the '<em><b>Any</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN__ANY = 8;

	/**
	 * The feature id for the '<em><b>Sql Insert</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN__SQL_INSERT = 9;

	/**
	 * The feature id for the '<em><b>Sql Update</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN__SQL_UPDATE = 10;

	/**
	 * The feature id for the '<em><b>Sql Delete</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN__SQL_DELETE = 11;

	/**
	 * The feature id for the '<em><b>Catalog</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN__CATALOG = 12;

	/**
	 * The feature id for the '<em><b>Fetch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN__FETCH = 13;

	/**
	 * The feature id for the '<em><b>Inverse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN__INVERSE = 14;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN__OPTIONAL = 15;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN__SCHEMA = 16;

	/**
	 * The feature id for the '<em><b>Subselect1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN__SUBSELECT1 = 17;

	/**
	 * The feature id for the '<em><b>Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN__TABLE = 18;

	/**
	 * The number of structural features of the '<em>Join</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_FEATURE_COUNT = 19;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.db2m.hbm30.impl.JoinedSubclassImpl <em>Joined Subclass</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.JoinedSubclassImpl
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.Hbm30PackageImpl#getJoinedSubclass()
	 * @generated
	 */
	int JOINED_SUBCLASS = 31;

	/**
	 * The feature id for the '<em><b>Meta</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINED_SUBCLASS__META = 0;

	/**
	 * The feature id for the '<em><b>Subselect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINED_SUBCLASS__SUBSELECT = 1;

	/**
	 * The feature id for the '<em><b>Synchronize</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINED_SUBCLASS__SYNCHRONIZE = 2;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINED_SUBCLASS__COMMENT = 3;

	/**
	 * The feature id for the '<em><b>Tuplizer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINED_SUBCLASS__TUPLIZER = 4;

	/**
	 * The feature id for the '<em><b>Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINED_SUBCLASS__KEY = 5;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINED_SUBCLASS__GROUP = 6;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINED_SUBCLASS__PROPERTY = 7;

	/**
	 * The feature id for the '<em><b>Many To One</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINED_SUBCLASS__MANY_TO_ONE = 8;

	/**
	 * The feature id for the '<em><b>One To One</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINED_SUBCLASS__ONE_TO_ONE = 9;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINED_SUBCLASS__COMPONENT = 10;

	/**
	 * The feature id for the '<em><b>Dynamic Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINED_SUBCLASS__DYNAMIC_COMPONENT = 11;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINED_SUBCLASS__PROPERTIES = 12;

	/**
	 * The feature id for the '<em><b>Any</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINED_SUBCLASS__ANY = 13;

	/**
	 * The feature id for the '<em><b>Map</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINED_SUBCLASS__MAP = 14;

	/**
	 * The feature id for the '<em><b>Set</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINED_SUBCLASS__SET = 15;

	/**
	 * The feature id for the '<em><b>List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINED_SUBCLASS__LIST = 16;

	/**
	 * The feature id for the '<em><b>Bag</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINED_SUBCLASS__BAG = 17;

	/**
	 * The feature id for the '<em><b>Idbag</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINED_SUBCLASS__IDBAG = 18;

	/**
	 * The feature id for the '<em><b>Array</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINED_SUBCLASS__ARRAY = 19;

	/**
	 * The feature id for the '<em><b>Primitive Array</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINED_SUBCLASS__PRIMITIVE_ARRAY = 20;

	/**
	 * The feature id for the '<em><b>Joined Subclass</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINED_SUBCLASS__JOINED_SUBCLASS = 21;

	/**
	 * The feature id for the '<em><b>Loader</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINED_SUBCLASS__LOADER = 22;

	/**
	 * The feature id for the '<em><b>Sql Insert</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINED_SUBCLASS__SQL_INSERT = 23;

	/**
	 * The feature id for the '<em><b>Sql Update</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINED_SUBCLASS__SQL_UPDATE = 24;

	/**
	 * The feature id for the '<em><b>Sql Delete</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINED_SUBCLASS__SQL_DELETE = 25;

	/**
	 * The feature id for the '<em><b>Resultset</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINED_SUBCLASS__RESULTSET = 26;

	/**
	 * The feature id for the '<em><b>Group1</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINED_SUBCLASS__GROUP1 = 27;

	/**
	 * The feature id for the '<em><b>Query</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINED_SUBCLASS__QUERY = 28;

	/**
	 * The feature id for the '<em><b>Sql Query</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINED_SUBCLASS__SQL_QUERY = 29;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINED_SUBCLASS__ABSTRACT = 30;

	/**
	 * The feature id for the '<em><b>Batch Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINED_SUBCLASS__BATCH_SIZE = 31;

	/**
	 * The feature id for the '<em><b>Catalog</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINED_SUBCLASS__CATALOG = 32;

	/**
	 * The feature id for the '<em><b>Check</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINED_SUBCLASS__CHECK = 33;

	/**
	 * The feature id for the '<em><b>Dynamic Insert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINED_SUBCLASS__DYNAMIC_INSERT = 34;

	/**
	 * The feature id for the '<em><b>Dynamic Update</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINED_SUBCLASS__DYNAMIC_UPDATE = 35;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINED_SUBCLASS__ENTITY_NAME = 36;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINED_SUBCLASS__EXTENDS = 37;

	/**
	 * The feature id for the '<em><b>Lazy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINED_SUBCLASS__LAZY = 38;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINED_SUBCLASS__NAME = 39;

	/**
	 * The feature id for the '<em><b>Node</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINED_SUBCLASS__NODE = 40;

	/**
	 * The feature id for the '<em><b>Persister</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINED_SUBCLASS__PERSISTER = 41;

	/**
	 * The feature id for the '<em><b>Proxy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINED_SUBCLASS__PROXY = 42;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINED_SUBCLASS__SCHEMA = 43;

	/**
	 * The feature id for the '<em><b>Select Before Update</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINED_SUBCLASS__SELECT_BEFORE_UPDATE = 44;

	/**
	 * The feature id for the '<em><b>Subselect1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINED_SUBCLASS__SUBSELECT1 = 45;

	/**
	 * The feature id for the '<em><b>Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINED_SUBCLASS__TABLE = 46;

	/**
	 * The number of structural features of the '<em>Joined Subclass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINED_SUBCLASS_FEATURE_COUNT = 47;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.db2m.hbm30.impl.KeyImpl <em>Key</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.KeyImpl
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.Hbm30PackageImpl#getKey()
	 * @generated
	 */
	int KEY = 32;

	/**
	 * The feature id for the '<em><b>Column</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY__COLUMN = 0;

	/**
	 * The feature id for the '<em><b>Column1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY__COLUMN1 = 1;

	/**
	 * The feature id for the '<em><b>Foreign Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY__FOREIGN_KEY = 2;

	/**
	 * The feature id for the '<em><b>Not Null</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY__NOT_NULL = 3;

	/**
	 * The feature id for the '<em><b>On Delete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY__ON_DELETE = 4;

	/**
	 * The feature id for the '<em><b>Property Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY__PROPERTY_REF = 5;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY__UNIQUE = 6;

	/**
	 * The feature id for the '<em><b>Update</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY__UPDATE = 7;

	/**
	 * The number of structural features of the '<em>Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.db2m.hbm30.impl.KeyManyToOneImpl <em>Key Many To One</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.KeyManyToOneImpl
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.Hbm30PackageImpl#getKeyManyToOne()
	 * @generated
	 */
	int KEY_MANY_TO_ONE = 33;

	/**
	 * The feature id for the '<em><b>Meta</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_MANY_TO_ONE__META = 0;

	/**
	 * The feature id for the '<em><b>Column</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_MANY_TO_ONE__COLUMN = 1;

	/**
	 * The feature id for the '<em><b>Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_MANY_TO_ONE__ACCESS = 2;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_MANY_TO_ONE__CLASS = 3;

	/**
	 * The feature id for the '<em><b>Column1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_MANY_TO_ONE__COLUMN1 = 4;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_MANY_TO_ONE__ENTITY_NAME = 5;

	/**
	 * The feature id for the '<em><b>Foreign Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_MANY_TO_ONE__FOREIGN_KEY = 6;

	/**
	 * The feature id for the '<em><b>Lazy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_MANY_TO_ONE__LAZY = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_MANY_TO_ONE__NAME = 8;

	/**
	 * The number of structural features of the '<em>Key Many To One</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_MANY_TO_ONE_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.db2m.hbm30.impl.KeyPropertyImpl <em>Key Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.KeyPropertyImpl
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.Hbm30PackageImpl#getKeyProperty()
	 * @generated
	 */
	int KEY_PROPERTY = 34;

	/**
	 * The feature id for the '<em><b>Meta</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_PROPERTY__META = 0;

	/**
	 * The feature id for the '<em><b>Column</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_PROPERTY__COLUMN = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_PROPERTY__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_PROPERTY__ACCESS = 3;

	/**
	 * The feature id for the '<em><b>Column1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_PROPERTY__COLUMN1 = 4;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_PROPERTY__LENGTH = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_PROPERTY__NAME = 6;

	/**
	 * The feature id for the '<em><b>Node</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_PROPERTY__NODE = 7;

	/**
	 * The feature id for the '<em><b>Type1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_PROPERTY__TYPE1 = 8;

	/**
	 * The number of structural features of the '<em>Key Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_PROPERTY_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ListImpl <em>List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.ListImpl
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.Hbm30PackageImpl#getList()
	 * @generated
	 */
	int LIST = 35;

	/**
	 * The feature id for the '<em><b>Meta</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__META = 0;

	/**
	 * The feature id for the '<em><b>Subselect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__SUBSELECT = 1;

	/**
	 * The feature id for the '<em><b>Cache</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__CACHE = 2;

	/**
	 * The feature id for the '<em><b>Synchronize</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__SYNCHRONIZE = 3;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__COMMENT = 4;

	/**
	 * The feature id for the '<em><b>Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__KEY = 5;

	/**
	 * The feature id for the '<em><b>Index</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__INDEX = 6;

	/**
	 * The feature id for the '<em><b>List Index</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__LIST_INDEX = 7;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__ELEMENT = 8;

	/**
	 * The feature id for the '<em><b>One To Many</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__ONE_TO_MANY = 9;

	/**
	 * The feature id for the '<em><b>Many To Many</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__MANY_TO_MANY = 10;

	/**
	 * The feature id for the '<em><b>Composite Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__COMPOSITE_ELEMENT = 11;

	/**
	 * The feature id for the '<em><b>Many To Any</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__MANY_TO_ANY = 12;

	/**
	 * The feature id for the '<em><b>Loader</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__LOADER = 13;

	/**
	 * The feature id for the '<em><b>Sql Insert</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__SQL_INSERT = 14;

	/**
	 * The feature id for the '<em><b>Sql Update</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__SQL_UPDATE = 15;

	/**
	 * The feature id for the '<em><b>Sql Delete</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__SQL_DELETE = 16;

	/**
	 * The feature id for the '<em><b>Sql Delete All</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__SQL_DELETE_ALL = 17;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__FILTER = 18;

	/**
	 * The feature id for the '<em><b>Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__ACCESS = 19;

	/**
	 * The feature id for the '<em><b>Batch Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__BATCH_SIZE = 20;

	/**
	 * The feature id for the '<em><b>Cascade</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__CASCADE = 21;

	/**
	 * The feature id for the '<em><b>Catalog</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__CATALOG = 22;

	/**
	 * The feature id for the '<em><b>Check</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__CHECK = 23;

	/**
	 * The feature id for the '<em><b>Collection Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__COLLECTION_TYPE = 24;

	/**
	 * The feature id for the '<em><b>Embed Xml</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__EMBED_XML = 25;

	/**
	 * The feature id for the '<em><b>Fetch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__FETCH = 26;

	/**
	 * The feature id for the '<em><b>Inverse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__INVERSE = 27;

	/**
	 * The feature id for the '<em><b>Lazy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__LAZY = 28;

	/**
	 * The feature id for the '<em><b>Mutable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__MUTABLE = 29;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__NAME = 30;

	/**
	 * The feature id for the '<em><b>Node</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__NODE = 31;

	/**
	 * The feature id for the '<em><b>Optimistic Lock</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__OPTIMISTIC_LOCK = 32;

	/**
	 * The feature id for the '<em><b>Outer Join</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__OUTER_JOIN = 33;

	/**
	 * The feature id for the '<em><b>Persister</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__PERSISTER = 34;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__SCHEMA = 35;

	/**
	 * The feature id for the '<em><b>Subselect1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__SUBSELECT1 = 36;

	/**
	 * The feature id for the '<em><b>Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__TABLE = 37;

	/**
	 * The feature id for the '<em><b>Where</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__WHERE = 38;

	/**
	 * The number of structural features of the '<em>List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_FEATURE_COUNT = 39;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ListIndexImpl <em>List Index</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.ListIndexImpl
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.Hbm30PackageImpl#getListIndex()
	 * @generated
	 */
	int LIST_INDEX = 36;

	/**
	 * The feature id for the '<em><b>Column</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_INDEX__COLUMN = 0;

	/**
	 * The feature id for the '<em><b>Base</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_INDEX__BASE = 1;

	/**
	 * The feature id for the '<em><b>Column1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_INDEX__COLUMN1 = 2;

	/**
	 * The number of structural features of the '<em>List Index</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_INDEX_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.db2m.hbm30.impl.LoadCollectionImpl <em>Load Collection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.LoadCollectionImpl
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.Hbm30PackageImpl#getLoadCollection()
	 * @generated
	 */
	int LOAD_COLLECTION = 37;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_COLLECTION__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Return Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_COLLECTION__RETURN_PROPERTY = 1;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_COLLECTION__ALIAS = 2;

	/**
	 * The feature id for the '<em><b>Lock Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_COLLECTION__LOCK_MODE = 3;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_COLLECTION__ROLE = 4;

	/**
	 * The number of structural features of the '<em>Load Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_COLLECTION_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.db2m.hbm30.impl.LoaderImpl <em>Loader</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.LoaderImpl
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.Hbm30PackageImpl#getLoader()
	 * @generated
	 */
	int LOADER = 38;

	/**
	 * The feature id for the '<em><b>Query Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOADER__QUERY_REF = 0;

	/**
	 * The number of structural features of the '<em>Loader</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOADER_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ManyToAnyImpl <em>Many To Any</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.ManyToAnyImpl
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.Hbm30PackageImpl#getManyToAny()
	 * @generated
	 */
	int MANY_TO_ANY = 39;

	/**
	 * The feature id for the '<em><b>Meta Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_ANY__META_VALUE = 0;

	/**
	 * The feature id for the '<em><b>Column</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_ANY__COLUMN = 1;

	/**
	 * The feature id for the '<em><b>Column1</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_ANY__COLUMN1 = 2;

	/**
	 * The feature id for the '<em><b>Id Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_ANY__ID_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Meta Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_ANY__META_TYPE = 4;

	/**
	 * The number of structural features of the '<em>Many To Any</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_ANY_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ManyToManyImpl <em>Many To Many</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.ManyToManyImpl
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.Hbm30PackageImpl#getManyToMany()
	 * @generated
	 */
	int MANY_TO_MANY = 40;

	/**
	 * The feature id for the '<em><b>Meta</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_MANY__META = 0;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_MANY__GROUP = 1;

	/**
	 * The feature id for the '<em><b>Column</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_MANY__COLUMN = 2;

	/**
	 * The feature id for the '<em><b>Formula</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_MANY__FORMULA = 3;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_MANY__FILTER = 4;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_MANY__CLASS = 5;

	/**
	 * The feature id for the '<em><b>Column1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_MANY__COLUMN1 = 6;

	/**
	 * The feature id for the '<em><b>Embed Xml</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_MANY__EMBED_XML = 7;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_MANY__ENTITY_NAME = 8;

	/**
	 * The feature id for the '<em><b>Fetch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_MANY__FETCH = 9;

	/**
	 * The feature id for the '<em><b>Foreign Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_MANY__FOREIGN_KEY = 10;

	/**
	 * The feature id for the '<em><b>Formula1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_MANY__FORMULA1 = 11;

	/**
	 * The feature id for the '<em><b>Lazy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_MANY__LAZY = 12;

	/**
	 * The feature id for the '<em><b>Node</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_MANY__NODE = 13;

	/**
	 * The feature id for the '<em><b>Not Found</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_MANY__NOT_FOUND = 14;

	/**
	 * The feature id for the '<em><b>Outer Join</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_MANY__OUTER_JOIN = 15;

	/**
	 * The feature id for the '<em><b>Property Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_MANY__PROPERTY_REF = 16;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_MANY__UNIQUE = 17;

	/**
	 * The feature id for the '<em><b>Where</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_MANY__WHERE = 18;

	/**
	 * The number of structural features of the '<em>Many To Many</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_MANY_FEATURE_COUNT = 19;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ManyToOneImpl <em>Many To One</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.ManyToOneImpl
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.Hbm30PackageImpl#getManyToOne()
	 * @generated
	 */
	int MANY_TO_ONE = 41;

	/**
	 * The feature id for the '<em><b>Meta</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_ONE__META = 0;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_ONE__GROUP = 1;

	/**
	 * The feature id for the '<em><b>Column</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_ONE__COLUMN = 2;

	/**
	 * The feature id for the '<em><b>Formula</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_ONE__FORMULA = 3;

	/**
	 * The feature id for the '<em><b>Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_ONE__ACCESS = 4;

	/**
	 * The feature id for the '<em><b>Cascade</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_ONE__CASCADE = 5;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_ONE__CLASS = 6;

	/**
	 * The feature id for the '<em><b>Column1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_ONE__COLUMN1 = 7;

	/**
	 * The feature id for the '<em><b>Embed Xml</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_ONE__EMBED_XML = 8;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_ONE__ENTITY_NAME = 9;

	/**
	 * The feature id for the '<em><b>Fetch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_ONE__FETCH = 10;

	/**
	 * The feature id for the '<em><b>Foreign Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_ONE__FOREIGN_KEY = 11;

	/**
	 * The feature id for the '<em><b>Formula1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_ONE__FORMULA1 = 12;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_ONE__INDEX = 13;

	/**
	 * The feature id for the '<em><b>Insert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_ONE__INSERT = 14;

	/**
	 * The feature id for the '<em><b>Lazy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_ONE__LAZY = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_ONE__NAME = 16;

	/**
	 * The feature id for the '<em><b>Node</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_ONE__NODE = 17;

	/**
	 * The feature id for the '<em><b>Not Found</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_ONE__NOT_FOUND = 18;

	/**
	 * The feature id for the '<em><b>Not Null</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_ONE__NOT_NULL = 19;

	/**
	 * The feature id for the '<em><b>Optimistic Lock</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_ONE__OPTIMISTIC_LOCK = 20;

	/**
	 * The feature id for the '<em><b>Outer Join</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_ONE__OUTER_JOIN = 21;

	/**
	 * The feature id for the '<em><b>Property Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_ONE__PROPERTY_REF = 22;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_ONE__UNIQUE = 23;

	/**
	 * The feature id for the '<em><b>Unique Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_ONE__UNIQUE_KEY = 24;

	/**
	 * The feature id for the '<em><b>Update</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_ONE__UPDATE = 25;

	/**
	 * The number of structural features of the '<em>Many To One</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_ONE_FEATURE_COUNT = 26;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.db2m.hbm30.impl.MapImpl <em>Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.MapImpl
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.Hbm30PackageImpl#getMap()
	 * @generated
	 */
	int MAP = 42;

	/**
	 * The feature id for the '<em><b>Meta</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__META = 0;

	/**
	 * The feature id for the '<em><b>Subselect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__SUBSELECT = 1;

	/**
	 * The feature id for the '<em><b>Cache</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__CACHE = 2;

	/**
	 * The feature id for the '<em><b>Synchronize</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__SYNCHRONIZE = 3;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__COMMENT = 4;

	/**
	 * The feature id for the '<em><b>Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__KEY = 5;

	/**
	 * The feature id for the '<em><b>Map Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__MAP_KEY = 6;

	/**
	 * The feature id for the '<em><b>Composite Map Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__COMPOSITE_MAP_KEY = 7;

	/**
	 * The feature id for the '<em><b>Map Key Many To Many</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__MAP_KEY_MANY_TO_MANY = 8;

	/**
	 * The feature id for the '<em><b>Index</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__INDEX = 9;

	/**
	 * The feature id for the '<em><b>Composite Index</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__COMPOSITE_INDEX = 10;

	/**
	 * The feature id for the '<em><b>Index Many To Many</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__INDEX_MANY_TO_MANY = 11;

	/**
	 * The feature id for the '<em><b>Index Many To Any</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__INDEX_MANY_TO_ANY = 12;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__ELEMENT = 13;

	/**
	 * The feature id for the '<em><b>One To Many</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__ONE_TO_MANY = 14;

	/**
	 * The feature id for the '<em><b>Many To Many</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__MANY_TO_MANY = 15;

	/**
	 * The feature id for the '<em><b>Composite Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__COMPOSITE_ELEMENT = 16;

	/**
	 * The feature id for the '<em><b>Many To Any</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__MANY_TO_ANY = 17;

	/**
	 * The feature id for the '<em><b>Loader</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__LOADER = 18;

	/**
	 * The feature id for the '<em><b>Sql Insert</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__SQL_INSERT = 19;

	/**
	 * The feature id for the '<em><b>Sql Update</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__SQL_UPDATE = 20;

	/**
	 * The feature id for the '<em><b>Sql Delete</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__SQL_DELETE = 21;

	/**
	 * The feature id for the '<em><b>Sql Delete All</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__SQL_DELETE_ALL = 22;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__FILTER = 23;

	/**
	 * The feature id for the '<em><b>Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__ACCESS = 24;

	/**
	 * The feature id for the '<em><b>Batch Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__BATCH_SIZE = 25;

	/**
	 * The feature id for the '<em><b>Cascade</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__CASCADE = 26;

	/**
	 * The feature id for the '<em><b>Catalog</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__CATALOG = 27;

	/**
	 * The feature id for the '<em><b>Check</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__CHECK = 28;

	/**
	 * The feature id for the '<em><b>Collection Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__COLLECTION_TYPE = 29;

	/**
	 * The feature id for the '<em><b>Embed Xml</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__EMBED_XML = 30;

	/**
	 * The feature id for the '<em><b>Fetch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__FETCH = 31;

	/**
	 * The feature id for the '<em><b>Inverse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__INVERSE = 32;

	/**
	 * The feature id for the '<em><b>Lazy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__LAZY = 33;

	/**
	 * The feature id for the '<em><b>Mutable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__MUTABLE = 34;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__NAME = 35;

	/**
	 * The feature id for the '<em><b>Node</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__NODE = 36;

	/**
	 * The feature id for the '<em><b>Optimistic Lock</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__OPTIMISTIC_LOCK = 37;

	/**
	 * The feature id for the '<em><b>Order By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__ORDER_BY = 38;

	/**
	 * The feature id for the '<em><b>Outer Join</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__OUTER_JOIN = 39;

	/**
	 * The feature id for the '<em><b>Persister</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__PERSISTER = 40;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__SCHEMA = 41;

	/**
	 * The feature id for the '<em><b>Sort</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__SORT = 42;

	/**
	 * The feature id for the '<em><b>Subselect1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__SUBSELECT1 = 43;

	/**
	 * The feature id for the '<em><b>Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__TABLE = 44;

	/**
	 * The feature id for the '<em><b>Where</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__WHERE = 45;

	/**
	 * The number of structural features of the '<em>Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_FEATURE_COUNT = 46;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.db2m.hbm30.impl.MapKeyImpl <em>Map Key</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.MapKeyImpl
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.Hbm30PackageImpl#getMapKey()
	 * @generated
	 */
	int MAP_KEY = 43;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_KEY__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Column</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_KEY__COLUMN = 1;

	/**
	 * The feature id for the '<em><b>Formula</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_KEY__FORMULA = 2;

	/**
	 * The feature id for the '<em><b>Column1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_KEY__COLUMN1 = 3;

	/**
	 * The feature id for the '<em><b>Formula1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_KEY__FORMULA1 = 4;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_KEY__LENGTH = 5;

	/**
	 * The feature id for the '<em><b>Node</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_KEY__NODE = 6;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_KEY__TYPE = 7;

	/**
	 * The number of structural features of the '<em>Map Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_KEY_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.db2m.hbm30.impl.MapKeyManyToManyImpl <em>Map Key Many To Many</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.MapKeyManyToManyImpl
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.Hbm30PackageImpl#getMapKeyManyToMany()
	 * @generated
	 */
	int MAP_KEY_MANY_TO_MANY = 44;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_KEY_MANY_TO_MANY__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Column</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_KEY_MANY_TO_MANY__COLUMN = 1;

	/**
	 * The feature id for the '<em><b>Formula</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_KEY_MANY_TO_MANY__FORMULA = 2;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_KEY_MANY_TO_MANY__CLASS = 3;

	/**
	 * The feature id for the '<em><b>Column1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_KEY_MANY_TO_MANY__COLUMN1 = 4;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_KEY_MANY_TO_MANY__ENTITY_NAME = 5;

	/**
	 * The feature id for the '<em><b>Foreign Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_KEY_MANY_TO_MANY__FOREIGN_KEY = 6;

	/**
	 * The feature id for the '<em><b>Formula1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_KEY_MANY_TO_MANY__FORMULA1 = 7;

	/**
	 * The number of structural features of the '<em>Map Key Many To Many</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_KEY_MANY_TO_MANY_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.db2m.hbm30.impl.MetaImpl <em>Meta</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.MetaImpl
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.Hbm30PackageImpl#getMeta()
	 * @generated
	 */
	int META = 45;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META__ATTRIBUTE = 1;

	/**
	 * The feature id for the '<em><b>Inherit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META__INHERIT = 2;

	/**
	 * The number of structural features of the '<em>Meta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.db2m.hbm30.impl.MetaValueImpl <em>Meta Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.MetaValueImpl
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.Hbm30PackageImpl#getMetaValue()
	 * @generated
	 */
	int META_VALUE = 46;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_VALUE__CLASS = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_VALUE__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Meta Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_VALUE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.db2m.hbm30.impl.NaturalIdImpl <em>Natural Id</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.NaturalIdImpl
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.Hbm30PackageImpl#getNaturalId()
	 * @generated
	 */
	int NATURAL_ID = 47;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATURAL_ID__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATURAL_ID__PROPERTY = 1;

	/**
	 * The feature id for the '<em><b>Many To One</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATURAL_ID__MANY_TO_ONE = 2;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATURAL_ID__COMPONENT = 3;

	/**
	 * The feature id for the '<em><b>Dynamic Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATURAL_ID__DYNAMIC_COMPONENT = 4;

	/**
	 * The feature id for the '<em><b>Any</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATURAL_ID__ANY = 5;

	/**
	 * The feature id for the '<em><b>Mutable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATURAL_ID__MUTABLE = 6;

	/**
	 * The number of structural features of the '<em>Natural Id</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATURAL_ID_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.db2m.hbm30.impl.NestedCompositeElementImpl <em>Nested Composite Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.NestedCompositeElementImpl
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.Hbm30PackageImpl#getNestedCompositeElement()
	 * @generated
	 */
	int NESTED_COMPOSITE_ELEMENT = 48;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_COMPOSITE_ELEMENT__PARENT = 0;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_COMPOSITE_ELEMENT__GROUP = 1;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_COMPOSITE_ELEMENT__PROPERTY = 2;

	/**
	 * The feature id for the '<em><b>Many To One</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_COMPOSITE_ELEMENT__MANY_TO_ONE = 3;

	/**
	 * The feature id for the '<em><b>Any</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_COMPOSITE_ELEMENT__ANY = 4;

	/**
	 * The feature id for the '<em><b>Nested Composite Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_COMPOSITE_ELEMENT__NESTED_COMPOSITE_ELEMENT = 5;

	/**
	 * The feature id for the '<em><b>Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_COMPOSITE_ELEMENT__ACCESS = 6;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_COMPOSITE_ELEMENT__CLASS = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_COMPOSITE_ELEMENT__NAME = 8;

	/**
	 * The feature id for the '<em><b>Node</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_COMPOSITE_ELEMENT__NODE = 9;

	/**
	 * The number of structural features of the '<em>Nested Composite Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_COMPOSITE_ELEMENT_FEATURE_COUNT = 10;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.db2m.hbm30.impl.OneToManyImpl <em>One To Many</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.OneToManyImpl
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.Hbm30PackageImpl#getOneToMany()
	 * @generated
	 */
	int ONE_TO_MANY = 49;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_MANY__CLASS = 0;

	/**
	 * The feature id for the '<em><b>Embed Xml</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_MANY__EMBED_XML = 1;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_MANY__ENTITY_NAME = 2;

	/**
	 * The feature id for the '<em><b>Node</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_MANY__NODE = 3;

	/**
	 * The feature id for the '<em><b>Not Found</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_MANY__NOT_FOUND = 4;

	/**
	 * The number of structural features of the '<em>One To Many</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_MANY_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.db2m.hbm30.impl.OneToOneImpl <em>One To One</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.OneToOneImpl
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.Hbm30PackageImpl#getOneToOne()
	 * @generated
	 */
	int ONE_TO_ONE = 50;

	/**
	 * The feature id for the '<em><b>Meta</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_ONE__META = 0;

	/**
	 * The feature id for the '<em><b>Formula</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_ONE__FORMULA = 1;

	/**
	 * The feature id for the '<em><b>Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_ONE__ACCESS = 2;

	/**
	 * The feature id for the '<em><b>Cascade</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_ONE__CASCADE = 3;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_ONE__CLASS = 4;

	/**
	 * The feature id for the '<em><b>Constrained</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_ONE__CONSTRAINED = 5;

	/**
	 * The feature id for the '<em><b>Embed Xml</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_ONE__EMBED_XML = 6;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_ONE__ENTITY_NAME = 7;

	/**
	 * The feature id for the '<em><b>Fetch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_ONE__FETCH = 8;

	/**
	 * The feature id for the '<em><b>Foreign Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_ONE__FOREIGN_KEY = 9;

	/**
	 * The feature id for the '<em><b>Formula1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_ONE__FORMULA1 = 10;

	/**
	 * The feature id for the '<em><b>Lazy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_ONE__LAZY = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_ONE__NAME = 12;

	/**
	 * The feature id for the '<em><b>Node</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_ONE__NODE = 13;

	/**
	 * The feature id for the '<em><b>Outer Join</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_ONE__OUTER_JOIN = 14;

	/**
	 * The feature id for the '<em><b>Property Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_ONE__PROPERTY_REF = 15;

	/**
	 * The number of structural features of the '<em>One To One</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_ONE_FEATURE_COUNT = 16;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ParamImpl <em>Param</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.ParamImpl
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.Hbm30PackageImpl#getParam()
	 * @generated
	 */
	int PARAM = 51;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM__NAME = 1;

	/**
	 * The number of structural features of the '<em>Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ParentImpl <em>Parent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.ParentImpl
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.Hbm30PackageImpl#getParent()
	 * @generated
	 */
	int PARENT = 52;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Parent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.db2m.hbm30.impl.PrimitiveArrayImpl <em>Primitive Array</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.PrimitiveArrayImpl
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.Hbm30PackageImpl#getPrimitiveArray()
	 * @generated
	 */
	int PRIMITIVE_ARRAY = 53;

	/**
	 * The feature id for the '<em><b>Meta</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_ARRAY__META = 0;

	/**
	 * The feature id for the '<em><b>Subselect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_ARRAY__SUBSELECT = 1;

	/**
	 * The feature id for the '<em><b>Cache</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_ARRAY__CACHE = 2;

	/**
	 * The feature id for the '<em><b>Synchronize</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_ARRAY__SYNCHRONIZE = 3;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_ARRAY__COMMENT = 4;

	/**
	 * The feature id for the '<em><b>Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_ARRAY__KEY = 5;

	/**
	 * The feature id for the '<em><b>Index</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_ARRAY__INDEX = 6;

	/**
	 * The feature id for the '<em><b>List Index</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_ARRAY__LIST_INDEX = 7;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_ARRAY__ELEMENT = 8;

	/**
	 * The feature id for the '<em><b>Loader</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_ARRAY__LOADER = 9;

	/**
	 * The feature id for the '<em><b>Sql Insert</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_ARRAY__SQL_INSERT = 10;

	/**
	 * The feature id for the '<em><b>Sql Update</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_ARRAY__SQL_UPDATE = 11;

	/**
	 * The feature id for the '<em><b>Sql Delete</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_ARRAY__SQL_DELETE = 12;

	/**
	 * The feature id for the '<em><b>Sql Delete All</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_ARRAY__SQL_DELETE_ALL = 13;

	/**
	 * The feature id for the '<em><b>Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_ARRAY__ACCESS = 14;

	/**
	 * The feature id for the '<em><b>Batch Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_ARRAY__BATCH_SIZE = 15;

	/**
	 * The feature id for the '<em><b>Catalog</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_ARRAY__CATALOG = 16;

	/**
	 * The feature id for the '<em><b>Check</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_ARRAY__CHECK = 17;

	/**
	 * The feature id for the '<em><b>Collection Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_ARRAY__COLLECTION_TYPE = 18;

	/**
	 * The feature id for the '<em><b>Embed Xml</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_ARRAY__EMBED_XML = 19;

	/**
	 * The feature id for the '<em><b>Fetch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_ARRAY__FETCH = 20;

	/**
	 * The feature id for the '<em><b>Mutable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_ARRAY__MUTABLE = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_ARRAY__NAME = 22;

	/**
	 * The feature id for the '<em><b>Node</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_ARRAY__NODE = 23;

	/**
	 * The feature id for the '<em><b>Optimistic Lock</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_ARRAY__OPTIMISTIC_LOCK = 24;

	/**
	 * The feature id for the '<em><b>Outer Join</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_ARRAY__OUTER_JOIN = 25;

	/**
	 * The feature id for the '<em><b>Persister</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_ARRAY__PERSISTER = 26;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_ARRAY__SCHEMA = 27;

	/**
	 * The feature id for the '<em><b>Subselect1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_ARRAY__SUBSELECT1 = 28;

	/**
	 * The feature id for the '<em><b>Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_ARRAY__TABLE = 29;

	/**
	 * The feature id for the '<em><b>Where</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_ARRAY__WHERE = 30;

	/**
	 * The number of structural features of the '<em>Primitive Array</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_ARRAY_FEATURE_COUNT = 31;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.db2m.hbm30.impl.PropertiesImpl <em>Properties</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.PropertiesImpl
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.Hbm30PackageImpl#getProperties()
	 * @generated
	 */
	int PROPERTIES = 54;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES__PROPERTY = 1;

	/**
	 * The feature id for the '<em><b>Many To One</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES__MANY_TO_ONE = 2;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES__COMPONENT = 3;

	/**
	 * The feature id for the '<em><b>Dynamic Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES__DYNAMIC_COMPONENT = 4;

	/**
	 * The feature id for the '<em><b>Insert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES__INSERT = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES__NAME = 6;

	/**
	 * The feature id for the '<em><b>Node</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES__NODE = 7;

	/**
	 * The feature id for the '<em><b>Optimistic Lock</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES__OPTIMISTIC_LOCK = 8;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES__UNIQUE = 9;

	/**
	 * The feature id for the '<em><b>Update</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES__UPDATE = 10;

	/**
	 * The number of structural features of the '<em>Properties</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES_FEATURE_COUNT = 11;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.db2m.hbm30.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.PropertyImpl
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.Hbm30PackageImpl#getProperty()
	 * @generated
	 */
	int PROPERTY = 55;

	/**
	 * The feature id for the '<em><b>Meta</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__META = 0;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__GROUP = 1;

	/**
	 * The feature id for the '<em><b>Column</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__COLUMN = 2;

	/**
	 * The feature id for the '<em><b>Formula</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__FORMULA = 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__TYPE = 4;

	/**
	 * The feature id for the '<em><b>Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__ACCESS = 5;

	/**
	 * The feature id for the '<em><b>Column1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__COLUMN1 = 6;

	/**
	 * The feature id for the '<em><b>Formula1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__FORMULA1 = 7;

	/**
	 * The feature id for the '<em><b>Generated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__GENERATED = 8;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__INDEX = 9;

	/**
	 * The feature id for the '<em><b>Insert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__INSERT = 10;

	/**
	 * The feature id for the '<em><b>Lazy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__LAZY = 11;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__LENGTH = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__NAME = 13;

	/**
	 * The feature id for the '<em><b>Node</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__NODE = 14;

	/**
	 * The feature id for the '<em><b>Not Null</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__NOT_NULL = 15;

	/**
	 * The feature id for the '<em><b>Optimistic Lock</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__OPTIMISTIC_LOCK = 16;

	/**
	 * The feature id for the '<em><b>Precision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__PRECISION = 17;

	/**
	 * The feature id for the '<em><b>Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__SCALE = 18;

	/**
	 * The feature id for the '<em><b>Type1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__TYPE1 = 19;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__UNIQUE = 20;

	/**
	 * The feature id for the '<em><b>Unique Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__UNIQUE_KEY = 21;

	/**
	 * The feature id for the '<em><b>Update</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__UPDATE = 22;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = 23;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.db2m.hbm30.impl.QueryImpl <em>Query</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.QueryImpl
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.Hbm30PackageImpl#getQuery()
	 * @generated
	 */
	int QUERY = 56;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY__GROUP = 1;

	/**
	 * The feature id for the '<em><b>Query Param</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY__QUERY_PARAM = 2;

	/**
	 * The feature id for the '<em><b>Cacheable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY__CACHEABLE = 3;

	/**
	 * The feature id for the '<em><b>Cache Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY__CACHE_MODE = 4;

	/**
	 * The feature id for the '<em><b>Cache Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY__CACHE_REGION = 5;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY__COMMENT = 6;

	/**
	 * The feature id for the '<em><b>Fetch Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY__FETCH_SIZE = 7;

	/**
	 * The feature id for the '<em><b>Flush Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY__FLUSH_MODE = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY__NAME = 9;

	/**
	 * The feature id for the '<em><b>Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY__READ_ONLY = 10;

	/**
	 * The feature id for the '<em><b>Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY__TIMEOUT = 11;

	/**
	 * The number of structural features of the '<em>Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_FEATURE_COUNT = 12;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.db2m.hbm30.impl.QueryParamImpl <em>Query Param</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.QueryParamImpl
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.Hbm30PackageImpl#getQueryParam()
	 * @generated
	 */
	int QUERY_PARAM = 57;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAM__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Query Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAM_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ResultsetImpl <em>Resultset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.ResultsetImpl
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.Hbm30PackageImpl#getResultset()
	 * @generated
	 */
	int RESULTSET = 58;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTSET__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Return Scalar</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTSET__RETURN_SCALAR = 1;

	/**
	 * The feature id for the '<em><b>Return</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTSET__RETURN = 2;

	/**
	 * The feature id for the '<em><b>Return Join</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTSET__RETURN_JOIN = 3;

	/**
	 * The feature id for the '<em><b>Load Collection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTSET__LOAD_COLLECTION = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTSET__NAME = 5;

	/**
	 * The number of structural features of the '<em>Resultset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTSET_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ReturnImpl <em>Return</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.ReturnImpl
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.Hbm30PackageImpl#getReturn()
	 * @generated
	 */
	int RETURN = 59;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Return Discriminator</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN__RETURN_DISCRIMINATOR = 1;

	/**
	 * The feature id for the '<em><b>Return Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN__RETURN_PROPERTY = 2;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN__ALIAS = 3;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN__CLASS = 4;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN__ENTITY_NAME = 5;

	/**
	 * The feature id for the '<em><b>Lock Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN__LOCK_MODE = 6;

	/**
	 * The number of structural features of the '<em>Return</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ReturnColumnImpl <em>Return Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.ReturnColumnImpl
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.Hbm30PackageImpl#getReturnColumn()
	 * @generated
	 */
	int RETURN_COLUMN = 60;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_COLUMN__NAME = 0;

	/**
	 * The number of structural features of the '<em>Return Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_COLUMN_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ReturnDiscriminatorImpl <em>Return Discriminator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.ReturnDiscriminatorImpl
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.Hbm30PackageImpl#getReturnDiscriminator()
	 * @generated
	 */
	int RETURN_DISCRIMINATOR = 61;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_DISCRIMINATOR__COLUMN = 0;

	/**
	 * The number of structural features of the '<em>Return Discriminator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_DISCRIMINATOR_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ReturnJoinImpl <em>Return Join</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.ReturnJoinImpl
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.Hbm30PackageImpl#getReturnJoin()
	 * @generated
	 */
	int RETURN_JOIN = 62;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_JOIN__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Return Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_JOIN__RETURN_PROPERTY = 1;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_JOIN__ALIAS = 2;

	/**
	 * The feature id for the '<em><b>Lock Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_JOIN__LOCK_MODE = 3;

	/**
	 * The feature id for the '<em><b>Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_JOIN__PROPERTY = 4;

	/**
	 * The number of structural features of the '<em>Return Join</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_JOIN_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ReturnPropertyImpl <em>Return Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.ReturnPropertyImpl
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.Hbm30PackageImpl#getReturnProperty()
	 * @generated
	 */
	int RETURN_PROPERTY = 63;

	/**
	 * The feature id for the '<em><b>Return Column</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_PROPERTY__RETURN_COLUMN = 0;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_PROPERTY__COLUMN = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_PROPERTY__NAME = 2;

	/**
	 * The number of structural features of the '<em>Return Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_PROPERTY_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ReturnScalarImpl <em>Return Scalar</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.ReturnScalarImpl
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.Hbm30PackageImpl#getReturnScalar()
	 * @generated
	 */
	int RETURN_SCALAR = 64;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_SCALAR__COLUMN = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_SCALAR__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Return Scalar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_SCALAR_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.db2m.hbm30.impl.SetImpl <em>Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.SetImpl
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.Hbm30PackageImpl#getSet()
	 * @generated
	 */
	int SET = 65;

	/**
	 * The feature id for the '<em><b>Meta</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET__META = 0;

	/**
	 * The feature id for the '<em><b>Subselect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET__SUBSELECT = 1;

	/**
	 * The feature id for the '<em><b>Cache</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET__CACHE = 2;

	/**
	 * The feature id for the '<em><b>Synchronize</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET__SYNCHRONIZE = 3;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET__COMMENT = 4;

	/**
	 * The feature id for the '<em><b>Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET__KEY = 5;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET__ELEMENT = 6;

	/**
	 * The feature id for the '<em><b>One To Many</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET__ONE_TO_MANY = 7;

	/**
	 * The feature id for the '<em><b>Many To Many</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET__MANY_TO_MANY = 8;

	/**
	 * The feature id for the '<em><b>Composite Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET__COMPOSITE_ELEMENT = 9;

	/**
	 * The feature id for the '<em><b>Many To Any</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET__MANY_TO_ANY = 10;

	/**
	 * The feature id for the '<em><b>Loader</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET__LOADER = 11;

	/**
	 * The feature id for the '<em><b>Sql Insert</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET__SQL_INSERT = 12;

	/**
	 * The feature id for the '<em><b>Sql Update</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET__SQL_UPDATE = 13;

	/**
	 * The feature id for the '<em><b>Sql Delete</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET__SQL_DELETE = 14;

	/**
	 * The feature id for the '<em><b>Sql Delete All</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET__SQL_DELETE_ALL = 15;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET__FILTER = 16;

	/**
	 * The feature id for the '<em><b>Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET__ACCESS = 17;

	/**
	 * The feature id for the '<em><b>Batch Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET__BATCH_SIZE = 18;

	/**
	 * The feature id for the '<em><b>Cascade</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET__CASCADE = 19;

	/**
	 * The feature id for the '<em><b>Catalog</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET__CATALOG = 20;

	/**
	 * The feature id for the '<em><b>Check</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET__CHECK = 21;

	/**
	 * The feature id for the '<em><b>Collection Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET__COLLECTION_TYPE = 22;

	/**
	 * The feature id for the '<em><b>Embed Xml</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET__EMBED_XML = 23;

	/**
	 * The feature id for the '<em><b>Fetch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET__FETCH = 24;

	/**
	 * The feature id for the '<em><b>Inverse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET__INVERSE = 25;

	/**
	 * The feature id for the '<em><b>Lazy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET__LAZY = 26;

	/**
	 * The feature id for the '<em><b>Mutable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET__MUTABLE = 27;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET__NAME = 28;

	/**
	 * The feature id for the '<em><b>Node</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET__NODE = 29;

	/**
	 * The feature id for the '<em><b>Optimistic Lock</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET__OPTIMISTIC_LOCK = 30;

	/**
	 * The feature id for the '<em><b>Order By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET__ORDER_BY = 31;

	/**
	 * The feature id for the '<em><b>Outer Join</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET__OUTER_JOIN = 32;

	/**
	 * The feature id for the '<em><b>Persister</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET__PERSISTER = 33;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET__SCHEMA = 34;

	/**
	 * The feature id for the '<em><b>Sort</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET__SORT = 35;

	/**
	 * The feature id for the '<em><b>Subselect1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET__SUBSELECT1 = 36;

	/**
	 * The feature id for the '<em><b>Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET__TABLE = 37;

	/**
	 * The feature id for the '<em><b>Where</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET__WHERE = 38;

	/**
	 * The number of structural features of the '<em>Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_FEATURE_COUNT = 39;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.db2m.hbm30.impl.SqlDeleteImpl <em>Sql Delete</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.SqlDeleteImpl
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.Hbm30PackageImpl#getSqlDelete()
	 * @generated
	 */
	int SQL_DELETE = 66;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_DELETE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Callable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_DELETE__CALLABLE = 1;

	/**
	 * The number of structural features of the '<em>Sql Delete</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_DELETE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.db2m.hbm30.impl.SqlDeleteAllImpl <em>Sql Delete All</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.SqlDeleteAllImpl
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.Hbm30PackageImpl#getSqlDeleteAll()
	 * @generated
	 */
	int SQL_DELETE_ALL = 67;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_DELETE_ALL__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Callable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_DELETE_ALL__CALLABLE = 1;

	/**
	 * The number of structural features of the '<em>Sql Delete All</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_DELETE_ALL_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.db2m.hbm30.impl.SqlInsertImpl <em>Sql Insert</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.SqlInsertImpl
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.Hbm30PackageImpl#getSqlInsert()
	 * @generated
	 */
	int SQL_INSERT = 68;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_INSERT__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Callable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_INSERT__CALLABLE = 1;

	/**
	 * The number of structural features of the '<em>Sql Insert</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_INSERT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.db2m.hbm30.impl.SqlQueryImpl <em>Sql Query</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.SqlQueryImpl
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.Hbm30PackageImpl#getSqlQuery()
	 * @generated
	 */
	int SQL_QUERY = 69;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_QUERY__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_QUERY__GROUP = 1;

	/**
	 * The feature id for the '<em><b>Return Scalar</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_QUERY__RETURN_SCALAR = 2;

	/**
	 * The feature id for the '<em><b>Return</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_QUERY__RETURN = 3;

	/**
	 * The feature id for the '<em><b>Return Join</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_QUERY__RETURN_JOIN = 4;

	/**
	 * The feature id for the '<em><b>Load Collection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_QUERY__LOAD_COLLECTION = 5;

	/**
	 * The feature id for the '<em><b>Synchronize</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_QUERY__SYNCHRONIZE = 6;

	/**
	 * The feature id for the '<em><b>Query Param</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_QUERY__QUERY_PARAM = 7;

	/**
	 * The feature id for the '<em><b>Cacheable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_QUERY__CACHEABLE = 8;

	/**
	 * The feature id for the '<em><b>Cache Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_QUERY__CACHE_MODE = 9;

	/**
	 * The feature id for the '<em><b>Cache Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_QUERY__CACHE_REGION = 10;

	/**
	 * The feature id for the '<em><b>Callable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_QUERY__CALLABLE = 11;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_QUERY__COMMENT = 12;

	/**
	 * The feature id for the '<em><b>Fetch Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_QUERY__FETCH_SIZE = 13;

	/**
	 * The feature id for the '<em><b>Flush Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_QUERY__FLUSH_MODE = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_QUERY__NAME = 15;

	/**
	 * The feature id for the '<em><b>Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_QUERY__READ_ONLY = 16;

	/**
	 * The feature id for the '<em><b>Resultset Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_QUERY__RESULTSET_REF = 17;

	/**
	 * The feature id for the '<em><b>Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_QUERY__TIMEOUT = 18;

	/**
	 * The number of structural features of the '<em>Sql Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_QUERY_FEATURE_COUNT = 19;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.db2m.hbm30.impl.SqlUpdateImpl <em>Sql Update</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.SqlUpdateImpl
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.Hbm30PackageImpl#getSqlUpdate()
	 * @generated
	 */
	int SQL_UPDATE = 70;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_UPDATE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Callable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_UPDATE__CALLABLE = 1;

	/**
	 * The number of structural features of the '<em>Sql Update</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_UPDATE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.db2m.hbm30.impl.SubclassImpl <em>Subclass</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.SubclassImpl
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.Hbm30PackageImpl#getSubclass()
	 * @generated
	 */
	int SUBCLASS = 71;

	/**
	 * The feature id for the '<em><b>Meta</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCLASS__META = 0;

	/**
	 * The feature id for the '<em><b>Tuplizer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCLASS__TUPLIZER = 1;

	/**
	 * The feature id for the '<em><b>Synchronize</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCLASS__SYNCHRONIZE = 2;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCLASS__GROUP = 3;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCLASS__PROPERTY = 4;

	/**
	 * The feature id for the '<em><b>Many To One</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCLASS__MANY_TO_ONE = 5;

	/**
	 * The feature id for the '<em><b>One To One</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCLASS__ONE_TO_ONE = 6;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCLASS__COMPONENT = 7;

	/**
	 * The feature id for the '<em><b>Dynamic Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCLASS__DYNAMIC_COMPONENT = 8;

	/**
	 * The feature id for the '<em><b>Any</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCLASS__ANY = 9;

	/**
	 * The feature id for the '<em><b>Map</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCLASS__MAP = 10;

	/**
	 * The feature id for the '<em><b>Set</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCLASS__SET = 11;

	/**
	 * The feature id for the '<em><b>List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCLASS__LIST = 12;

	/**
	 * The feature id for the '<em><b>Bag</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCLASS__BAG = 13;

	/**
	 * The feature id for the '<em><b>Idbag</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCLASS__IDBAG = 14;

	/**
	 * The feature id for the '<em><b>Array</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCLASS__ARRAY = 15;

	/**
	 * The feature id for the '<em><b>Primitive Array</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCLASS__PRIMITIVE_ARRAY = 16;

	/**
	 * The feature id for the '<em><b>Join</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCLASS__JOIN = 17;

	/**
	 * The feature id for the '<em><b>Subclass</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCLASS__SUBCLASS = 18;

	/**
	 * The feature id for the '<em><b>Loader</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCLASS__LOADER = 19;

	/**
	 * The feature id for the '<em><b>Sql Insert</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCLASS__SQL_INSERT = 20;

	/**
	 * The feature id for the '<em><b>Sql Update</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCLASS__SQL_UPDATE = 21;

	/**
	 * The feature id for the '<em><b>Sql Delete</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCLASS__SQL_DELETE = 22;

	/**
	 * The feature id for the '<em><b>Resultset</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCLASS__RESULTSET = 23;

	/**
	 * The feature id for the '<em><b>Group1</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCLASS__GROUP1 = 24;

	/**
	 * The feature id for the '<em><b>Query</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCLASS__QUERY = 25;

	/**
	 * The feature id for the '<em><b>Sql Query</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCLASS__SQL_QUERY = 26;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCLASS__ABSTRACT = 27;

	/**
	 * The feature id for the '<em><b>Batch Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCLASS__BATCH_SIZE = 28;

	/**
	 * The feature id for the '<em><b>Discriminator Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCLASS__DISCRIMINATOR_VALUE = 29;

	/**
	 * The feature id for the '<em><b>Dynamic Insert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCLASS__DYNAMIC_INSERT = 30;

	/**
	 * The feature id for the '<em><b>Dynamic Update</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCLASS__DYNAMIC_UPDATE = 31;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCLASS__ENTITY_NAME = 32;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCLASS__EXTENDS = 33;

	/**
	 * The feature id for the '<em><b>Lazy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCLASS__LAZY = 34;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCLASS__NAME = 35;

	/**
	 * The feature id for the '<em><b>Node</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCLASS__NODE = 36;

	/**
	 * The feature id for the '<em><b>Persister</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCLASS__PERSISTER = 37;

	/**
	 * The feature id for the '<em><b>Proxy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCLASS__PROXY = 38;

	/**
	 * The feature id for the '<em><b>Select Before Update</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCLASS__SELECT_BEFORE_UPDATE = 39;

	/**
	 * The number of structural features of the '<em>Subclass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCLASS_FEATURE_COUNT = 40;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.db2m.hbm30.impl.SynchronizeImpl <em>Synchronize</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.SynchronizeImpl
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.Hbm30PackageImpl#getSynchronize()
	 * @generated
	 */
	int SYNCHRONIZE = 72;

	/**
	 * The feature id for the '<em><b>Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZE__TABLE = 0;

	/**
	 * The number of structural features of the '<em>Synchronize</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.db2m.hbm30.impl.TimestampImpl <em>Timestamp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.TimestampImpl
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.Hbm30PackageImpl#getTimestamp()
	 * @generated
	 */
	int TIMESTAMP = 73;

	/**
	 * The feature id for the '<em><b>Meta</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMESTAMP__META = 0;

	/**
	 * The feature id for the '<em><b>Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMESTAMP__ACCESS = 1;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMESTAMP__COLUMN = 2;

	/**
	 * The feature id for the '<em><b>Generated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMESTAMP__GENERATED = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMESTAMP__NAME = 4;

	/**
	 * The feature id for the '<em><b>Node</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMESTAMP__NODE = 5;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMESTAMP__SOURCE = 6;

	/**
	 * The feature id for the '<em><b>Unsaved Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMESTAMP__UNSAVED_VALUE = 7;

	/**
	 * The number of structural features of the '<em>Timestamp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMESTAMP_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.db2m.hbm30.impl.TuplizerImpl <em>Tuplizer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.TuplizerImpl
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.Hbm30PackageImpl#getTuplizer()
	 * @generated
	 */
	int TUPLIZER = 74;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLIZER__CLASS = 0;

	/**
	 * The feature id for the '<em><b>Entity Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLIZER__ENTITY_MODE = 1;

	/**
	 * The number of structural features of the '<em>Tuplizer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLIZER_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.db2m.hbm30.impl.TypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.TypeImpl
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.Hbm30PackageImpl#getType()
	 * @generated
	 */
	int TYPE = 75;

	/**
	 * The feature id for the '<em><b>Param</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__PARAM = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__NAME = 1;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.db2m.hbm30.impl.TypedefImpl <em>Typedef</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.TypedefImpl
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.Hbm30PackageImpl#getTypedef()
	 * @generated
	 */
	int TYPEDEF = 76;

	/**
	 * The feature id for the '<em><b>Param</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPEDEF__PARAM = 0;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPEDEF__CLASS = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPEDEF__NAME = 2;

	/**
	 * The number of structural features of the '<em>Typedef</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPEDEF_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.db2m.hbm30.impl.UnionSubclassImpl <em>Union Subclass</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.UnionSubclassImpl
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.Hbm30PackageImpl#getUnionSubclass()
	 * @generated
	 */
	int UNION_SUBCLASS = 77;

	/**
	 * The feature id for the '<em><b>Meta</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_SUBCLASS__META = 0;

	/**
	 * The feature id for the '<em><b>Subselect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_SUBCLASS__SUBSELECT = 1;

	/**
	 * The feature id for the '<em><b>Synchronize</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_SUBCLASS__SYNCHRONIZE = 2;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_SUBCLASS__COMMENT = 3;

	/**
	 * The feature id for the '<em><b>Tuplizer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_SUBCLASS__TUPLIZER = 4;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_SUBCLASS__GROUP = 5;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_SUBCLASS__PROPERTY = 6;

	/**
	 * The feature id for the '<em><b>Many To One</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_SUBCLASS__MANY_TO_ONE = 7;

	/**
	 * The feature id for the '<em><b>One To One</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_SUBCLASS__ONE_TO_ONE = 8;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_SUBCLASS__COMPONENT = 9;

	/**
	 * The feature id for the '<em><b>Dynamic Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_SUBCLASS__DYNAMIC_COMPONENT = 10;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_SUBCLASS__PROPERTIES = 11;

	/**
	 * The feature id for the '<em><b>Any</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_SUBCLASS__ANY = 12;

	/**
	 * The feature id for the '<em><b>Map</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_SUBCLASS__MAP = 13;

	/**
	 * The feature id for the '<em><b>Set</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_SUBCLASS__SET = 14;

	/**
	 * The feature id for the '<em><b>List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_SUBCLASS__LIST = 15;

	/**
	 * The feature id for the '<em><b>Bag</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_SUBCLASS__BAG = 16;

	/**
	 * The feature id for the '<em><b>Idbag</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_SUBCLASS__IDBAG = 17;

	/**
	 * The feature id for the '<em><b>Array</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_SUBCLASS__ARRAY = 18;

	/**
	 * The feature id for the '<em><b>Primitive Array</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_SUBCLASS__PRIMITIVE_ARRAY = 19;

	/**
	 * The feature id for the '<em><b>Union Subclass</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_SUBCLASS__UNION_SUBCLASS = 20;

	/**
	 * The feature id for the '<em><b>Loader</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_SUBCLASS__LOADER = 21;

	/**
	 * The feature id for the '<em><b>Sql Insert</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_SUBCLASS__SQL_INSERT = 22;

	/**
	 * The feature id for the '<em><b>Sql Update</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_SUBCLASS__SQL_UPDATE = 23;

	/**
	 * The feature id for the '<em><b>Sql Delete</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_SUBCLASS__SQL_DELETE = 24;

	/**
	 * The feature id for the '<em><b>Resultset</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_SUBCLASS__RESULTSET = 25;

	/**
	 * The feature id for the '<em><b>Group1</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_SUBCLASS__GROUP1 = 26;

	/**
	 * The feature id for the '<em><b>Query</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_SUBCLASS__QUERY = 27;

	/**
	 * The feature id for the '<em><b>Sql Query</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_SUBCLASS__SQL_QUERY = 28;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_SUBCLASS__ABSTRACT = 29;

	/**
	 * The feature id for the '<em><b>Batch Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_SUBCLASS__BATCH_SIZE = 30;

	/**
	 * The feature id for the '<em><b>Catalog</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_SUBCLASS__CATALOG = 31;

	/**
	 * The feature id for the '<em><b>Check</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_SUBCLASS__CHECK = 32;

	/**
	 * The feature id for the '<em><b>Dynamic Insert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_SUBCLASS__DYNAMIC_INSERT = 33;

	/**
	 * The feature id for the '<em><b>Dynamic Update</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_SUBCLASS__DYNAMIC_UPDATE = 34;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_SUBCLASS__ENTITY_NAME = 35;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_SUBCLASS__EXTENDS = 36;

	/**
	 * The feature id for the '<em><b>Lazy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_SUBCLASS__LAZY = 37;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_SUBCLASS__NAME = 38;

	/**
	 * The feature id for the '<em><b>Node</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_SUBCLASS__NODE = 39;

	/**
	 * The feature id for the '<em><b>Persister</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_SUBCLASS__PERSISTER = 40;

	/**
	 * The feature id for the '<em><b>Proxy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_SUBCLASS__PROXY = 41;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_SUBCLASS__SCHEMA = 42;

	/**
	 * The feature id for the '<em><b>Select Before Update</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_SUBCLASS__SELECT_BEFORE_UPDATE = 43;

	/**
	 * The feature id for the '<em><b>Subselect1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_SUBCLASS__SUBSELECT1 = 44;

	/**
	 * The feature id for the '<em><b>Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_SUBCLASS__TABLE = 45;

	/**
	 * The number of structural features of the '<em>Union Subclass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_SUBCLASS_FEATURE_COUNT = 46;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.db2m.hbm30.impl.VersionImpl <em>Version</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.VersionImpl
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.Hbm30PackageImpl#getVersion()
	 * @generated
	 */
	int VERSION = 78;

	/**
	 * The feature id for the '<em><b>Meta</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION__META = 0;

	/**
	 * The feature id for the '<em><b>Column</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION__COLUMN = 1;

	/**
	 * The feature id for the '<em><b>Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION__ACCESS = 2;

	/**
	 * The feature id for the '<em><b>Column1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION__COLUMN1 = 3;

	/**
	 * The feature id for the '<em><b>Generated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION__GENERATED = 4;

	/**
	 * The feature id for the '<em><b>Insert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION__INSERT = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION__NAME = 6;

	/**
	 * The feature id for the '<em><b>Node</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION__NODE = 7;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION__TYPE = 8;

	/**
	 * The feature id for the '<em><b>Unsaved Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION__UNSAVED_VALUE = 9;

	/**
	 * The number of structural features of the '<em>Version</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_FEATURE_COUNT = 10;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.db2m.hbm30.Cachemode <em>Cachemode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Cachemode
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.Hbm30PackageImpl#getCachemode()
	 * @generated
	 */
	int CACHEMODE = 79;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.db2m.hbm30.EntityModeType <em>Entity Mode Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.db2m.hbm30.EntityModeType
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.Hbm30PackageImpl#getEntityModeType()
	 * @generated
	 */
	int ENTITY_MODE_TYPE = 80;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.db2m.hbm30.Fetch <em>Fetch</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Fetch
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.Hbm30PackageImpl#getFetch()
	 * @generated
	 */
	int FETCH = 81;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.db2m.hbm30.FetchJoinSelect <em>Fetch Join Select</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.db2m.hbm30.FetchJoinSelect
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.Hbm30PackageImpl#getFetchJoinSelect()
	 * @generated
	 */
	int FETCH_JOIN_SELECT = 82;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.db2m.hbm30.Flushmode <em>Flushmode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Flushmode
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.Hbm30PackageImpl#getFlushmode()
	 * @generated
	 */
	int FLUSHMODE = 83;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.db2m.hbm30.Generated <em>Generated</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Generated
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.Hbm30PackageImpl#getGenerated()
	 * @generated
	 */
	int GENERATED = 84;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.db2m.hbm30.GeneratedNeverAlways <em>Generated Never Always</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.db2m.hbm30.GeneratedNeverAlways
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.Hbm30PackageImpl#getGeneratedNeverAlways()
	 * @generated
	 */
	int GENERATED_NEVER_ALWAYS = 85;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.db2m.hbm30.IncludeType <em>Include Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.db2m.hbm30.IncludeType
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.Hbm30PackageImpl#getIncludeType()
	 * @generated
	 */
	int INCLUDE_TYPE = 86;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.db2m.hbm30.Lazy <em>Lazy</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Lazy
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.Hbm30PackageImpl#getLazy()
	 * @generated
	 */
	int LAZY = 87;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.db2m.hbm30.LazyFalseProxy <em>Lazy False Proxy</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.db2m.hbm30.LazyFalseProxy
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.Hbm30PackageImpl#getLazyFalseProxy()
	 * @generated
	 */
	int LAZY_FALSE_PROXY = 88;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.db2m.hbm30.LazyTrueFalseExtra <em>Lazy True False Extra</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.db2m.hbm30.LazyTrueFalseExtra
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.Hbm30PackageImpl#getLazyTrueFalseExtra()
	 * @generated
	 */
	int LAZY_TRUE_FALSE_EXTRA = 89;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.db2m.hbm30.Lockmode <em>Lockmode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Lockmode
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.Hbm30PackageImpl#getLockmode()
	 * @generated
	 */
	int LOCKMODE = 90;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.db2m.hbm30.Notfound <em>Notfound</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Notfound
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.Hbm30PackageImpl#getNotfound()
	 * @generated
	 */
	int NOTFOUND = 91;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.db2m.hbm30.OnDeleteType <em>On Delete Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.db2m.hbm30.OnDeleteType
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.Hbm30PackageImpl#getOnDeleteType()
	 * @generated
	 */
	int ON_DELETE_TYPE = 92;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.db2m.hbm30.OptimisticLockType <em>Optimistic Lock Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.db2m.hbm30.OptimisticLockType
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.Hbm30PackageImpl#getOptimisticLockType()
	 * @generated
	 */
	int OPTIMISTIC_LOCK_TYPE = 93;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.db2m.hbm30.Outerjoin <em>Outerjoin</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Outerjoin
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.Hbm30PackageImpl#getOuterjoin()
	 * @generated
	 */
	int OUTERJOIN = 94;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.db2m.hbm30.PolymorphismType <em>Polymorphism Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.db2m.hbm30.PolymorphismType
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.Hbm30PackageImpl#getPolymorphismType()
	 * @generated
	 */
	int POLYMORPHISM_TYPE = 95;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.db2m.hbm30.SourceType <em>Source Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.db2m.hbm30.SourceType
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.Hbm30PackageImpl#getSourceType()
	 * @generated
	 */
	int SOURCE_TYPE = 96;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.db2m.hbm30.UnsavedValueType <em>Unsaved Value Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.db2m.hbm30.UnsavedValueType
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.Hbm30PackageImpl#getUnsavedValueType()
	 * @generated
	 */
	int UNSAVED_VALUE_TYPE = 97;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.db2m.hbm30.UnsavedValueType1 <em>Unsaved Value Type1</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.db2m.hbm30.UnsavedValueType1
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.Hbm30PackageImpl#getUnsavedValueType1()
	 * @generated
	 */
	int UNSAVED_VALUE_TYPE1 = 98;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.db2m.hbm30.UnsavedValueType2 <em>Unsaved Value Type2</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.db2m.hbm30.UnsavedValueType2
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.Hbm30PackageImpl#getUnsavedValueType2()
	 * @generated
	 */
	int UNSAVED_VALUE_TYPE2 = 99;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.db2m.hbm30.UsageType <em>Usage Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.db2m.hbm30.UsageType
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.Hbm30PackageImpl#getUsageType()
	 * @generated
	 */
	int USAGE_TYPE = 100;

	/**
	 * The meta object id for the '<em>Cachemode Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Cachemode
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.Hbm30PackageImpl#getCachemodeObject()
	 * @generated
	 */
	int CACHEMODE_OBJECT = 101;

	/**
	 * The meta object id for the '<em>Entity Mode Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.db2m.hbm30.EntityModeType
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.Hbm30PackageImpl#getEntityModeTypeObject()
	 * @generated
	 */
	int ENTITY_MODE_TYPE_OBJECT = 102;

	/**
	 * The meta object id for the '<em>Fetch Join Select Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.db2m.hbm30.FetchJoinSelect
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.Hbm30PackageImpl#getFetchJoinSelectObject()
	 * @generated
	 */
	int FETCH_JOIN_SELECT_OBJECT = 103;

	/**
	 * The meta object id for the '<em>Fetch Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Fetch
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.Hbm30PackageImpl#getFetchObject()
	 * @generated
	 */
	int FETCH_OBJECT = 104;

	/**
	 * The meta object id for the '<em>Flushmode Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Flushmode
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.Hbm30PackageImpl#getFlushmodeObject()
	 * @generated
	 */
	int FLUSHMODE_OBJECT = 105;

	/**
	 * The meta object id for the '<em>Generated Never Always Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.db2m.hbm30.GeneratedNeverAlways
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.Hbm30PackageImpl#getGeneratedNeverAlwaysObject()
	 * @generated
	 */
	int GENERATED_NEVER_ALWAYS_OBJECT = 106;

	/**
	 * The meta object id for the '<em>Generated Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Generated
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.Hbm30PackageImpl#getGeneratedObject()
	 * @generated
	 */
	int GENERATED_OBJECT = 107;

	/**
	 * The meta object id for the '<em>Include Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.db2m.hbm30.IncludeType
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.Hbm30PackageImpl#getIncludeTypeObject()
	 * @generated
	 */
	int INCLUDE_TYPE_OBJECT = 108;

	/**
	 * The meta object id for the '<em>Lazy False Proxy Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.db2m.hbm30.LazyFalseProxy
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.Hbm30PackageImpl#getLazyFalseProxyObject()
	 * @generated
	 */
	int LAZY_FALSE_PROXY_OBJECT = 109;

	/**
	 * The meta object id for the '<em>Lazy Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Lazy
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.Hbm30PackageImpl#getLazyObject()
	 * @generated
	 */
	int LAZY_OBJECT = 110;

	/**
	 * The meta object id for the '<em>Lazy True False Extra Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.db2m.hbm30.LazyTrueFalseExtra
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.Hbm30PackageImpl#getLazyTrueFalseExtraObject()
	 * @generated
	 */
	int LAZY_TRUE_FALSE_EXTRA_OBJECT = 111;

	/**
	 * The meta object id for the '<em>Lockmode Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Lockmode
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.Hbm30PackageImpl#getLockmodeObject()
	 * @generated
	 */
	int LOCKMODE_OBJECT = 112;

	/**
	 * The meta object id for the '<em>Notfound Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Notfound
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.Hbm30PackageImpl#getNotfoundObject()
	 * @generated
	 */
	int NOTFOUND_OBJECT = 113;

	/**
	 * The meta object id for the '<em>On Delete Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.db2m.hbm30.OnDeleteType
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.Hbm30PackageImpl#getOnDeleteTypeObject()
	 * @generated
	 */
	int ON_DELETE_TYPE_OBJECT = 114;

	/**
	 * The meta object id for the '<em>Optimistic Lock Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.db2m.hbm30.OptimisticLockType
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.Hbm30PackageImpl#getOptimisticLockTypeObject()
	 * @generated
	 */
	int OPTIMISTIC_LOCK_TYPE_OBJECT = 115;

	/**
	 * The meta object id for the '<em>Outerjoin Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Outerjoin
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.Hbm30PackageImpl#getOuterjoinObject()
	 * @generated
	 */
	int OUTERJOIN_OBJECT = 116;

	/**
	 * The meta object id for the '<em>Polymorphism Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.db2m.hbm30.PolymorphismType
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.Hbm30PackageImpl#getPolymorphismTypeObject()
	 * @generated
	 */
	int POLYMORPHISM_TYPE_OBJECT = 117;

	/**
	 * The meta object id for the '<em>Source Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.db2m.hbm30.SourceType
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.Hbm30PackageImpl#getSourceTypeObject()
	 * @generated
	 */
	int SOURCE_TYPE_OBJECT = 118;

	/**
	 * The meta object id for the '<em>Unsaved Value Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.db2m.hbm30.UnsavedValueType1
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.Hbm30PackageImpl#getUnsavedValueTypeObject()
	 * @generated
	 */
	int UNSAVED_VALUE_TYPE_OBJECT = 119;

	/**
	 * The meta object id for the '<em>Unsaved Value Type Object1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.db2m.hbm30.UnsavedValueType
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.Hbm30PackageImpl#getUnsavedValueTypeObject1()
	 * @generated
	 */
	int UNSAVED_VALUE_TYPE_OBJECT1 = 120;

	/**
	 * The meta object id for the '<em>Unsaved Value Type Object2</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.db2m.hbm30.UnsavedValueType2
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.Hbm30PackageImpl#getUnsavedValueTypeObject2()
	 * @generated
	 */
	int UNSAVED_VALUE_TYPE_OBJECT2 = 121;

	/**
	 * The meta object id for the '<em>Usage Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.db2m.hbm30.UsageType
	 * @see org.eclipse.emf.teneo.db2m.hbm30.impl.Hbm30PackageImpl#getUsageTypeObject()
	 * @generated
	 */
	int USAGE_TYPE_OBJECT = 122;


	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.db2m.hbm30.Any <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Any</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Any
	 * @generated
	 */
	EClass getAny();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.Any#getMeta <em>Meta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Meta</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Any#getMeta()
	 * @see #getAny()
	 * @generated
	 */
	EReference getAny_Meta();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.Any#getMetaValue <em>Meta Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Meta Value</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Any#getMetaValue()
	 * @see #getAny()
	 * @generated
	 */
	EReference getAny_MetaValue();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.db2m.hbm30.Any#getColumn <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Column</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Any#getColumn()
	 * @see #getAny()
	 * @generated
	 */
	EReference getAny_Column();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.Any#getColumn1 <em>Column1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Column1</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Any#getColumn1()
	 * @see #getAny()
	 * @generated
	 */
	EReference getAny_Column1();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Any#getAccess <em>Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Any#getAccess()
	 * @see #getAny()
	 * @generated
	 */
	EAttribute getAny_Access();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Any#getCascade <em>Cascade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cascade</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Any#getCascade()
	 * @see #getAny()
	 * @generated
	 */
	EAttribute getAny_Cascade();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Any#getIdType <em>Id Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Type</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Any#getIdType()
	 * @see #getAny()
	 * @generated
	 */
	EAttribute getAny_IdType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Any#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Any#getIndex()
	 * @see #getAny()
	 * @generated
	 */
	EAttribute getAny_Index();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Any#isInsert <em>Insert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Insert</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Any#isInsert()
	 * @see #getAny()
	 * @generated
	 */
	EAttribute getAny_Insert();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Any#isLazy <em>Lazy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lazy</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Any#isLazy()
	 * @see #getAny()
	 * @generated
	 */
	EAttribute getAny_Lazy();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Any#getMetaType <em>Meta Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Meta Type</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Any#getMetaType()
	 * @see #getAny()
	 * @generated
	 */
	EAttribute getAny_MetaType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Any#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Any#getName()
	 * @see #getAny()
	 * @generated
	 */
	EAttribute getAny_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Any#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Node</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Any#getNode()
	 * @see #getAny()
	 * @generated
	 */
	EAttribute getAny_Node();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Any#isOptimisticLock <em>Optimistic Lock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Optimistic Lock</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Any#isOptimisticLock()
	 * @see #getAny()
	 * @generated
	 */
	EAttribute getAny_OptimisticLock();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Any#isUpdate <em>Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Update</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Any#isUpdate()
	 * @see #getAny()
	 * @generated
	 */
	EAttribute getAny_Update();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.db2m.hbm30.Array <em>Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Array</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Array
	 * @generated
	 */
	EClass getArray();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.Array#getMeta <em>Meta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Meta</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Array#getMeta()
	 * @see #getArray()
	 * @generated
	 */
	EReference getArray_Meta();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Array#getSubselect <em>Subselect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subselect</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Array#getSubselect()
	 * @see #getArray()
	 * @generated
	 */
	EAttribute getArray_Subselect();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.db2m.hbm30.Array#getCache <em>Cache</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cache</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Array#getCache()
	 * @see #getArray()
	 * @generated
	 */
	EReference getArray_Cache();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.Array#getSynchronize <em>Synchronize</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Synchronize</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Array#getSynchronize()
	 * @see #getArray()
	 * @generated
	 */
	EReference getArray_Synchronize();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Array#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Array#getComment()
	 * @see #getArray()
	 * @generated
	 */
	EAttribute getArray_Comment();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.db2m.hbm30.Array#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Key</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Array#getKey()
	 * @see #getArray()
	 * @generated
	 */
	EReference getArray_Key();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.db2m.hbm30.Array#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Index</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Array#getIndex()
	 * @see #getArray()
	 * @generated
	 */
	EReference getArray_Index();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.db2m.hbm30.Array#getListIndex <em>List Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>List Index</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Array#getListIndex()
	 * @see #getArray()
	 * @generated
	 */
	EReference getArray_ListIndex();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.db2m.hbm30.Array#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Element</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Array#getElement()
	 * @see #getArray()
	 * @generated
	 */
	EReference getArray_Element();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.db2m.hbm30.Array#getOneToMany <em>One To Many</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>One To Many</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Array#getOneToMany()
	 * @see #getArray()
	 * @generated
	 */
	EReference getArray_OneToMany();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.db2m.hbm30.Array#getManyToMany <em>Many To Many</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Many To Many</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Array#getManyToMany()
	 * @see #getArray()
	 * @generated
	 */
	EReference getArray_ManyToMany();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.db2m.hbm30.Array#getCompositeElement <em>Composite Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Composite Element</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Array#getCompositeElement()
	 * @see #getArray()
	 * @generated
	 */
	EReference getArray_CompositeElement();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.db2m.hbm30.Array#getManyToAny <em>Many To Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Many To Any</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Array#getManyToAny()
	 * @see #getArray()
	 * @generated
	 */
	EReference getArray_ManyToAny();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.db2m.hbm30.Array#getLoader <em>Loader</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Loader</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Array#getLoader()
	 * @see #getArray()
	 * @generated
	 */
	EReference getArray_Loader();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.db2m.hbm30.Array#getSqlInsert <em>Sql Insert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sql Insert</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Array#getSqlInsert()
	 * @see #getArray()
	 * @generated
	 */
	EReference getArray_SqlInsert();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.db2m.hbm30.Array#getSqlUpdate <em>Sql Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sql Update</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Array#getSqlUpdate()
	 * @see #getArray()
	 * @generated
	 */
	EReference getArray_SqlUpdate();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.db2m.hbm30.Array#getSqlDelete <em>Sql Delete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sql Delete</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Array#getSqlDelete()
	 * @see #getArray()
	 * @generated
	 */
	EReference getArray_SqlDelete();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.db2m.hbm30.Array#getSqlDeleteAll <em>Sql Delete All</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sql Delete All</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Array#getSqlDeleteAll()
	 * @see #getArray()
	 * @generated
	 */
	EReference getArray_SqlDeleteAll();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Array#getAccess <em>Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Array#getAccess()
	 * @see #getArray()
	 * @generated
	 */
	EAttribute getArray_Access();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Array#getBatchSize <em>Batch Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Batch Size</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Array#getBatchSize()
	 * @see #getArray()
	 * @generated
	 */
	EAttribute getArray_BatchSize();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Array#getCascade <em>Cascade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cascade</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Array#getCascade()
	 * @see #getArray()
	 * @generated
	 */
	EAttribute getArray_Cascade();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Array#getCatalog <em>Catalog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Catalog</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Array#getCatalog()
	 * @see #getArray()
	 * @generated
	 */
	EAttribute getArray_Catalog();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Array#getCheck <em>Check</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Check</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Array#getCheck()
	 * @see #getArray()
	 * @generated
	 */
	EAttribute getArray_Check();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Array#getCollectionType <em>Collection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Collection Type</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Array#getCollectionType()
	 * @see #getArray()
	 * @generated
	 */
	EAttribute getArray_CollectionType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Array#getElementClass <em>Element Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Element Class</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Array#getElementClass()
	 * @see #getArray()
	 * @generated
	 */
	EAttribute getArray_ElementClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Array#isEmbedXml <em>Embed Xml</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Embed Xml</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Array#isEmbedXml()
	 * @see #getArray()
	 * @generated
	 */
	EAttribute getArray_EmbedXml();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Array#getFetch <em>Fetch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fetch</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Array#getFetch()
	 * @see #getArray()
	 * @generated
	 */
	EAttribute getArray_Fetch();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Array#isInverse <em>Inverse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inverse</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Array#isInverse()
	 * @see #getArray()
	 * @generated
	 */
	EAttribute getArray_Inverse();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Array#isMutable <em>Mutable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mutable</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Array#isMutable()
	 * @see #getArray()
	 * @generated
	 */
	EAttribute getArray_Mutable();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Array#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Array#getName()
	 * @see #getArray()
	 * @generated
	 */
	EAttribute getArray_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Array#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Node</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Array#getNode()
	 * @see #getArray()
	 * @generated
	 */
	EAttribute getArray_Node();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Array#isOptimisticLock <em>Optimistic Lock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Optimistic Lock</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Array#isOptimisticLock()
	 * @see #getArray()
	 * @generated
	 */
	EAttribute getArray_OptimisticLock();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Array#getOuterJoin <em>Outer Join</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Outer Join</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Array#getOuterJoin()
	 * @see #getArray()
	 * @generated
	 */
	EAttribute getArray_OuterJoin();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Array#getPersister <em>Persister</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Persister</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Array#getPersister()
	 * @see #getArray()
	 * @generated
	 */
	EAttribute getArray_Persister();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Array#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schema</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Array#getSchema()
	 * @see #getArray()
	 * @generated
	 */
	EAttribute getArray_Schema();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Array#getSubselect1 <em>Subselect1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subselect1</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Array#getSubselect1()
	 * @see #getArray()
	 * @generated
	 */
	EAttribute getArray_Subselect1();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Array#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Table</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Array#getTable()
	 * @see #getArray()
	 * @generated
	 */
	EAttribute getArray_Table();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Array#getWhere <em>Where</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Where</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Array#getWhere()
	 * @see #getArray()
	 * @generated
	 */
	EAttribute getArray_Where();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.db2m.hbm30.Bag <em>Bag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bag</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Bag
	 * @generated
	 */
	EClass getBag();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.Bag#getMeta <em>Meta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Meta</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Bag#getMeta()
	 * @see #getBag()
	 * @generated
	 */
	EReference getBag_Meta();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Bag#getSubselect <em>Subselect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subselect</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Bag#getSubselect()
	 * @see #getBag()
	 * @generated
	 */
	EAttribute getBag_Subselect();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.db2m.hbm30.Bag#getCache <em>Cache</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cache</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Bag#getCache()
	 * @see #getBag()
	 * @generated
	 */
	EReference getBag_Cache();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.Bag#getSynchronize <em>Synchronize</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Synchronize</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Bag#getSynchronize()
	 * @see #getBag()
	 * @generated
	 */
	EReference getBag_Synchronize();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Bag#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Bag#getComment()
	 * @see #getBag()
	 * @generated
	 */
	EAttribute getBag_Comment();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.db2m.hbm30.Bag#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Key</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Bag#getKey()
	 * @see #getBag()
	 * @generated
	 */
	EReference getBag_Key();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.db2m.hbm30.Bag#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Element</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Bag#getElement()
	 * @see #getBag()
	 * @generated
	 */
	EReference getBag_Element();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.db2m.hbm30.Bag#getOneToMany <em>One To Many</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>One To Many</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Bag#getOneToMany()
	 * @see #getBag()
	 * @generated
	 */
	EReference getBag_OneToMany();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.db2m.hbm30.Bag#getManyToMany <em>Many To Many</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Many To Many</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Bag#getManyToMany()
	 * @see #getBag()
	 * @generated
	 */
	EReference getBag_ManyToMany();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.db2m.hbm30.Bag#getCompositeElement <em>Composite Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Composite Element</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Bag#getCompositeElement()
	 * @see #getBag()
	 * @generated
	 */
	EReference getBag_CompositeElement();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.db2m.hbm30.Bag#getManyToAny <em>Many To Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Many To Any</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Bag#getManyToAny()
	 * @see #getBag()
	 * @generated
	 */
	EReference getBag_ManyToAny();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.db2m.hbm30.Bag#getLoader <em>Loader</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Loader</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Bag#getLoader()
	 * @see #getBag()
	 * @generated
	 */
	EReference getBag_Loader();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.db2m.hbm30.Bag#getSqlInsert <em>Sql Insert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sql Insert</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Bag#getSqlInsert()
	 * @see #getBag()
	 * @generated
	 */
	EReference getBag_SqlInsert();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.db2m.hbm30.Bag#getSqlUpdate <em>Sql Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sql Update</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Bag#getSqlUpdate()
	 * @see #getBag()
	 * @generated
	 */
	EReference getBag_SqlUpdate();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.db2m.hbm30.Bag#getSqlDelete <em>Sql Delete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sql Delete</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Bag#getSqlDelete()
	 * @see #getBag()
	 * @generated
	 */
	EReference getBag_SqlDelete();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.db2m.hbm30.Bag#getSqlDeleteAll <em>Sql Delete All</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sql Delete All</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Bag#getSqlDeleteAll()
	 * @see #getBag()
	 * @generated
	 */
	EReference getBag_SqlDeleteAll();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.Bag#getFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Filter</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Bag#getFilter()
	 * @see #getBag()
	 * @generated
	 */
	EReference getBag_Filter();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Bag#getAccess <em>Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Bag#getAccess()
	 * @see #getBag()
	 * @generated
	 */
	EAttribute getBag_Access();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Bag#getBatchSize <em>Batch Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Batch Size</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Bag#getBatchSize()
	 * @see #getBag()
	 * @generated
	 */
	EAttribute getBag_BatchSize();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Bag#getCascade <em>Cascade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cascade</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Bag#getCascade()
	 * @see #getBag()
	 * @generated
	 */
	EAttribute getBag_Cascade();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Bag#getCatalog <em>Catalog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Catalog</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Bag#getCatalog()
	 * @see #getBag()
	 * @generated
	 */
	EAttribute getBag_Catalog();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Bag#getCheck <em>Check</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Check</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Bag#getCheck()
	 * @see #getBag()
	 * @generated
	 */
	EAttribute getBag_Check();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Bag#getCollectionType <em>Collection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Collection Type</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Bag#getCollectionType()
	 * @see #getBag()
	 * @generated
	 */
	EAttribute getBag_CollectionType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Bag#isEmbedXml <em>Embed Xml</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Embed Xml</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Bag#isEmbedXml()
	 * @see #getBag()
	 * @generated
	 */
	EAttribute getBag_EmbedXml();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Bag#getFetch <em>Fetch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fetch</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Bag#getFetch()
	 * @see #getBag()
	 * @generated
	 */
	EAttribute getBag_Fetch();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Bag#isInverse <em>Inverse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inverse</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Bag#isInverse()
	 * @see #getBag()
	 * @generated
	 */
	EAttribute getBag_Inverse();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Bag#getLazy <em>Lazy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lazy</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Bag#getLazy()
	 * @see #getBag()
	 * @generated
	 */
	EAttribute getBag_Lazy();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Bag#isMutable <em>Mutable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mutable</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Bag#isMutable()
	 * @see #getBag()
	 * @generated
	 */
	EAttribute getBag_Mutable();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Bag#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Bag#getName()
	 * @see #getBag()
	 * @generated
	 */
	EAttribute getBag_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Bag#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Node</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Bag#getNode()
	 * @see #getBag()
	 * @generated
	 */
	EAttribute getBag_Node();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Bag#isOptimisticLock <em>Optimistic Lock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Optimistic Lock</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Bag#isOptimisticLock()
	 * @see #getBag()
	 * @generated
	 */
	EAttribute getBag_OptimisticLock();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Bag#getOrderBy <em>Order By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order By</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Bag#getOrderBy()
	 * @see #getBag()
	 * @generated
	 */
	EAttribute getBag_OrderBy();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Bag#getOuterJoin <em>Outer Join</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Outer Join</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Bag#getOuterJoin()
	 * @see #getBag()
	 * @generated
	 */
	EAttribute getBag_OuterJoin();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Bag#getPersister <em>Persister</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Persister</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Bag#getPersister()
	 * @see #getBag()
	 * @generated
	 */
	EAttribute getBag_Persister();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Bag#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schema</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Bag#getSchema()
	 * @see #getBag()
	 * @generated
	 */
	EAttribute getBag_Schema();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Bag#getSubselect1 <em>Subselect1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subselect1</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Bag#getSubselect1()
	 * @see #getBag()
	 * @generated
	 */
	EAttribute getBag_Subselect1();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Bag#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Table</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Bag#getTable()
	 * @see #getBag()
	 * @generated
	 */
	EAttribute getBag_Table();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Bag#getWhere <em>Where</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Where</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Bag#getWhere()
	 * @see #getBag()
	 * @generated
	 */
	EAttribute getBag_Where();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.db2m.hbm30.Cache <em>Cache</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cache</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Cache
	 * @generated
	 */
	EClass getCache();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Cache#getInclude <em>Include</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Include</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Cache#getInclude()
	 * @see #getCache()
	 * @generated
	 */
	EAttribute getCache_Include();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Cache#getRegion <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Region</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Cache#getRegion()
	 * @see #getCache()
	 * @generated
	 */
	EAttribute getCache_Region();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Cache#getUsage <em>Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Usage</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Cache#getUsage()
	 * @see #getCache()
	 * @generated
	 */
	EAttribute getCache_Usage();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.db2m.hbm30.Class <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Class
	 * @generated
	 */
	EClass getClass_();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.Class#getMeta <em>Meta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Meta</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Class#getMeta()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_Meta();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Class#getSubselect <em>Subselect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subselect</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Class#getSubselect()
	 * @see #getClass_()
	 * @generated
	 */
	EAttribute getClass_Subselect();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.db2m.hbm30.Class#getCache <em>Cache</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cache</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Class#getCache()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_Cache();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.Class#getSynchronize <em>Synchronize</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Synchronize</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Class#getSynchronize()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_Synchronize();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Class#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Class#getComment()
	 * @see #getClass_()
	 * @generated
	 */
	EAttribute getClass_Comment();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.Class#getTuplizer <em>Tuplizer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tuplizer</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Class#getTuplizer()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_Tuplizer();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.db2m.hbm30.Class#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Id</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Class#getId()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_Id();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.db2m.hbm30.Class#getCompositeId <em>Composite Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Composite Id</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Class#getCompositeId()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_CompositeId();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.db2m.hbm30.Class#getDiscriminator <em>Discriminator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Discriminator</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Class#getDiscriminator()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_Discriminator();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.db2m.hbm30.Class#getNaturalId <em>Natural Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Natural Id</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Class#getNaturalId()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_NaturalId();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.db2m.hbm30.Class#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Version</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Class#getVersion()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_Version();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.db2m.hbm30.Class#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Timestamp</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Class#getTimestamp()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_Timestamp();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.emf.teneo.db2m.hbm30.Class#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Class#getGroup()
	 * @see #getClass_()
	 * @generated
	 */
	EAttribute getClass_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.Class#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Class#getProperty()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_Property();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.Class#getManyToOne <em>Many To One</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Many To One</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Class#getManyToOne()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_ManyToOne();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.Class#getOneToOne <em>One To One</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>One To One</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Class#getOneToOne()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_OneToOne();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.Class#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Component</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Class#getComponent()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_Component();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.Class#getDynamicComponent <em>Dynamic Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dynamic Component</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Class#getDynamicComponent()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_DynamicComponent();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.Class#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Class#getProperties()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_Properties();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.Class#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Any</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Class#getAny()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_Any();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.Class#getMap <em>Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Map</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Class#getMap()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_Map();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.Class#getSet <em>Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Set</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Class#getSet()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_Set();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.Class#getList <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>List</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Class#getList()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_List();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.Class#getBag <em>Bag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bag</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Class#getBag()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_Bag();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.Class#getIdbag <em>Idbag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Idbag</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Class#getIdbag()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_Idbag();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.Class#getArray <em>Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Array</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Class#getArray()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_Array();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.Class#getPrimitiveArray <em>Primitive Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Primitive Array</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Class#getPrimitiveArray()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_PrimitiveArray();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.Class#getJoin <em>Join</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Join</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Class#getJoin()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_Join();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.Class#getSubclass <em>Subclass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subclass</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Class#getSubclass()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_Subclass();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.Class#getJoinedSubclass <em>Joined Subclass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Joined Subclass</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Class#getJoinedSubclass()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_JoinedSubclass();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.Class#getUnionSubclass <em>Union Subclass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Union Subclass</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Class#getUnionSubclass()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_UnionSubclass();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.db2m.hbm30.Class#getLoader <em>Loader</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Loader</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Class#getLoader()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_Loader();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.db2m.hbm30.Class#getSqlInsert <em>Sql Insert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sql Insert</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Class#getSqlInsert()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_SqlInsert();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.db2m.hbm30.Class#getSqlUpdate <em>Sql Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sql Update</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Class#getSqlUpdate()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_SqlUpdate();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.db2m.hbm30.Class#getSqlDelete <em>Sql Delete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sql Delete</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Class#getSqlDelete()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_SqlDelete();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.Class#getFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Filter</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Class#getFilter()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_Filter();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.Class#getResultset <em>Resultset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resultset</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Class#getResultset()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_Resultset();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.emf.teneo.db2m.hbm30.Class#getGroup1 <em>Group1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group1</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Class#getGroup1()
	 * @see #getClass_()
	 * @generated
	 */
	EAttribute getClass_Group1();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.Class#getQuery <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Query</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Class#getQuery()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_Query();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.Class#getSqlQuery <em>Sql Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sql Query</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Class#getSqlQuery()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_SqlQuery();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Class#isAbstract <em>Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abstract</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Class#isAbstract()
	 * @see #getClass_()
	 * @generated
	 */
	EAttribute getClass_Abstract();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Class#getBatchSize <em>Batch Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Batch Size</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Class#getBatchSize()
	 * @see #getClass_()
	 * @generated
	 */
	EAttribute getClass_BatchSize();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Class#getCatalog <em>Catalog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Catalog</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Class#getCatalog()
	 * @see #getClass_()
	 * @generated
	 */
	EAttribute getClass_Catalog();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Class#getCheck <em>Check</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Check</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Class#getCheck()
	 * @see #getClass_()
	 * @generated
	 */
	EAttribute getClass_Check();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Class#getDiscriminatorValue <em>Discriminator Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Discriminator Value</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Class#getDiscriminatorValue()
	 * @see #getClass_()
	 * @generated
	 */
	EAttribute getClass_DiscriminatorValue();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Class#isDynamicInsert <em>Dynamic Insert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dynamic Insert</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Class#isDynamicInsert()
	 * @see #getClass_()
	 * @generated
	 */
	EAttribute getClass_DynamicInsert();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Class#isDynamicUpdate <em>Dynamic Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dynamic Update</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Class#isDynamicUpdate()
	 * @see #getClass_()
	 * @generated
	 */
	EAttribute getClass_DynamicUpdate();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Class#getEntityName <em>Entity Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Entity Name</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Class#getEntityName()
	 * @see #getClass_()
	 * @generated
	 */
	EAttribute getClass_EntityName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Class#isLazy <em>Lazy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lazy</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Class#isLazy()
	 * @see #getClass_()
	 * @generated
	 */
	EAttribute getClass_Lazy();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Class#isMutable <em>Mutable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mutable</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Class#isMutable()
	 * @see #getClass_()
	 * @generated
	 */
	EAttribute getClass_Mutable();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Class#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Class#getName()
	 * @see #getClass_()
	 * @generated
	 */
	EAttribute getClass_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Class#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Node</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Class#getNode()
	 * @see #getClass_()
	 * @generated
	 */
	EAttribute getClass_Node();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Class#getOptimisticLock <em>Optimistic Lock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Optimistic Lock</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Class#getOptimisticLock()
	 * @see #getClass_()
	 * @generated
	 */
	EAttribute getClass_OptimisticLock();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Class#getPersister <em>Persister</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Persister</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Class#getPersister()
	 * @see #getClass_()
	 * @generated
	 */
	EAttribute getClass_Persister();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Class#getPolymorphism <em>Polymorphism</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Polymorphism</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Class#getPolymorphism()
	 * @see #getClass_()
	 * @generated
	 */
	EAttribute getClass_Polymorphism();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Class#getProxy <em>Proxy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Proxy</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Class#getProxy()
	 * @see #getClass_()
	 * @generated
	 */
	EAttribute getClass_Proxy();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Class#getRowid <em>Rowid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rowid</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Class#getRowid()
	 * @see #getClass_()
	 * @generated
	 */
	EAttribute getClass_Rowid();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Class#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schema</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Class#getSchema()
	 * @see #getClass_()
	 * @generated
	 */
	EAttribute getClass_Schema();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Class#isSelectBeforeUpdate <em>Select Before Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Select Before Update</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Class#isSelectBeforeUpdate()
	 * @see #getClass_()
	 * @generated
	 */
	EAttribute getClass_SelectBeforeUpdate();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Class#getSubselect1 <em>Subselect1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subselect1</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Class#getSubselect1()
	 * @see #getClass_()
	 * @generated
	 */
	EAttribute getClass_Subselect1();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Class#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Table</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Class#getTable()
	 * @see #getClass_()
	 * @generated
	 */
	EAttribute getClass_Table();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Class#getWhere <em>Where</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Where</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Class#getWhere()
	 * @see #getClass_()
	 * @generated
	 */
	EAttribute getClass_Where();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.db2m.hbm30.Collection <em>Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collection</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Collection
	 * @generated
	 */
	EClass getCollection();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.Collection#getMeta <em>Meta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Meta</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Collection#getMeta()
	 * @see #getCollection()
	 * @generated
	 */
	EReference getCollection_Meta();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Collection#getSubselect <em>Subselect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subselect</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Collection#getSubselect()
	 * @see #getCollection()
	 * @generated
	 */
	EAttribute getCollection_Subselect();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.db2m.hbm30.Collection#getCache <em>Cache</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cache</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Collection#getCache()
	 * @see #getCollection()
	 * @generated
	 */
	EReference getCollection_Cache();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.Collection#getSynchronize <em>Synchronize</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Synchronize</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Collection#getSynchronize()
	 * @see #getCollection()
	 * @generated
	 */
	EReference getCollection_Synchronize();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Collection#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Collection#getComment()
	 * @see #getCollection()
	 * @generated
	 */
	EAttribute getCollection_Comment();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.db2m.hbm30.Collection#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Key</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Collection#getKey()
	 * @see #getCollection()
	 * @generated
	 */
	EReference getCollection_Key();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.db2m.hbm30.Collection#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Element</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Collection#getElement()
	 * @see #getCollection()
	 * @generated
	 */
	EReference getCollection_Element();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.db2m.hbm30.Collection#getOneToMany <em>One To Many</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>One To Many</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Collection#getOneToMany()
	 * @see #getCollection()
	 * @generated
	 */
	EReference getCollection_OneToMany();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.db2m.hbm30.Collection#getManyToMany <em>Many To Many</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Many To Many</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Collection#getManyToMany()
	 * @see #getCollection()
	 * @generated
	 */
	EReference getCollection_ManyToMany();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.db2m.hbm30.Collection#getCompositeElement <em>Composite Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Composite Element</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Collection#getCompositeElement()
	 * @see #getCollection()
	 * @generated
	 */
	EReference getCollection_CompositeElement();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.db2m.hbm30.Collection#getManyToAny <em>Many To Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Many To Any</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Collection#getManyToAny()
	 * @see #getCollection()
	 * @generated
	 */
	EReference getCollection_ManyToAny();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.db2m.hbm30.Collection#getLoader <em>Loader</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Loader</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Collection#getLoader()
	 * @see #getCollection()
	 * @generated
	 */
	EReference getCollection_Loader();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.db2m.hbm30.Collection#getSqlInsert <em>Sql Insert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sql Insert</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Collection#getSqlInsert()
	 * @see #getCollection()
	 * @generated
	 */
	EReference getCollection_SqlInsert();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.db2m.hbm30.Collection#getSqlUpdate <em>Sql Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sql Update</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Collection#getSqlUpdate()
	 * @see #getCollection()
	 * @generated
	 */
	EReference getCollection_SqlUpdate();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.db2m.hbm30.Collection#getSqlDelete <em>Sql Delete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sql Delete</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Collection#getSqlDelete()
	 * @see #getCollection()
	 * @generated
	 */
	EReference getCollection_SqlDelete();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.db2m.hbm30.Collection#getSqlDeleteAll <em>Sql Delete All</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sql Delete All</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Collection#getSqlDeleteAll()
	 * @see #getCollection()
	 * @generated
	 */
	EReference getCollection_SqlDeleteAll();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.Collection#getFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Filter</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Collection#getFilter()
	 * @see #getCollection()
	 * @generated
	 */
	EReference getCollection_Filter();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Collection#getAccess <em>Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Collection#getAccess()
	 * @see #getCollection()
	 * @generated
	 */
	EAttribute getCollection_Access();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Collection#getBatchSize <em>Batch Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Batch Size</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Collection#getBatchSize()
	 * @see #getCollection()
	 * @generated
	 */
	EAttribute getCollection_BatchSize();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Collection#getCascade <em>Cascade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cascade</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Collection#getCascade()
	 * @see #getCollection()
	 * @generated
	 */
	EAttribute getCollection_Cascade();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Collection#getCatalog <em>Catalog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Catalog</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Collection#getCatalog()
	 * @see #getCollection()
	 * @generated
	 */
	EAttribute getCollection_Catalog();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Collection#getCheck <em>Check</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Check</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Collection#getCheck()
	 * @see #getCollection()
	 * @generated
	 */
	EAttribute getCollection_Check();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Collection#getCollectionType <em>Collection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Collection Type</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Collection#getCollectionType()
	 * @see #getCollection()
	 * @generated
	 */
	EAttribute getCollection_CollectionType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Collection#isEmbedXml <em>Embed Xml</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Embed Xml</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Collection#isEmbedXml()
	 * @see #getCollection()
	 * @generated
	 */
	EAttribute getCollection_EmbedXml();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Collection#getFetch <em>Fetch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fetch</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Collection#getFetch()
	 * @see #getCollection()
	 * @generated
	 */
	EAttribute getCollection_Fetch();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Collection#isInverse <em>Inverse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inverse</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Collection#isInverse()
	 * @see #getCollection()
	 * @generated
	 */
	EAttribute getCollection_Inverse();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Collection#getLazy <em>Lazy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lazy</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Collection#getLazy()
	 * @see #getCollection()
	 * @generated
	 */
	EAttribute getCollection_Lazy();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Collection#isMutable <em>Mutable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mutable</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Collection#isMutable()
	 * @see #getCollection()
	 * @generated
	 */
	EAttribute getCollection_Mutable();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Collection#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Collection#getName()
	 * @see #getCollection()
	 * @generated
	 */
	EAttribute getCollection_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Collection#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Node</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Collection#getNode()
	 * @see #getCollection()
	 * @generated
	 */
	EAttribute getCollection_Node();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Collection#isOptimisticLock <em>Optimistic Lock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Optimistic Lock</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Collection#isOptimisticLock()
	 * @see #getCollection()
	 * @generated
	 */
	EAttribute getCollection_OptimisticLock();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Collection#getOrderBy <em>Order By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order By</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Collection#getOrderBy()
	 * @see #getCollection()
	 * @generated
	 */
	EAttribute getCollection_OrderBy();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Collection#getOuterJoin <em>Outer Join</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Outer Join</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Collection#getOuterJoin()
	 * @see #getCollection()
	 * @generated
	 */
	EAttribute getCollection_OuterJoin();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Collection#getPersister <em>Persister</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Persister</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Collection#getPersister()
	 * @see #getCollection()
	 * @generated
	 */
	EAttribute getCollection_Persister();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Collection#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schema</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Collection#getSchema()
	 * @see #getCollection()
	 * @generated
	 */
	EAttribute getCollection_Schema();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Collection#getSubselect1 <em>Subselect1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subselect1</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Collection#getSubselect1()
	 * @see #getCollection()
	 * @generated
	 */
	EAttribute getCollection_Subselect1();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Collection#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Table</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Collection#getTable()
	 * @see #getCollection()
	 * @generated
	 */
	EAttribute getCollection_Table();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Collection#getWhere <em>Where</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Where</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Collection#getWhere()
	 * @see #getCollection()
	 * @generated
	 */
	EAttribute getCollection_Where();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.db2m.hbm30.CollectionId <em>Collection Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collection Id</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.CollectionId
	 * @generated
	 */
	EClass getCollectionId();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.CollectionId#getMeta <em>Meta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Meta</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.CollectionId#getMeta()
	 * @see #getCollectionId()
	 * @generated
	 */
	EReference getCollectionId_Meta();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.CollectionId#getColumn <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Column</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.CollectionId#getColumn()
	 * @see #getCollectionId()
	 * @generated
	 */
	EReference getCollectionId_Column();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.db2m.hbm30.CollectionId#getGenerator <em>Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Generator</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.CollectionId#getGenerator()
	 * @see #getCollectionId()
	 * @generated
	 */
	EReference getCollectionId_Generator();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.CollectionId#getColumn1 <em>Column1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column1</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.CollectionId#getColumn1()
	 * @see #getCollectionId()
	 * @generated
	 */
	EAttribute getCollectionId_Column1();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.CollectionId#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.CollectionId#getLength()
	 * @see #getCollectionId()
	 * @generated
	 */
	EAttribute getCollectionId_Length();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.CollectionId#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.CollectionId#getType()
	 * @see #getCollectionId()
	 * @generated
	 */
	EAttribute getCollectionId_Type();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.db2m.hbm30.Column <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Column</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Column
	 * @generated
	 */
	EClass getColumn();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Column#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Column#getComment()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_Comment();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Column#getCheck <em>Check</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Check</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Column#getCheck()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_Check();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Column#getDefault <em>Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Column#getDefault()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_Default();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Column#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Column#getIndex()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_Index();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Column#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Column#getLength()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_Length();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Column#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Column#getName()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Column#isNotNull <em>Not Null</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Not Null</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Column#isNotNull()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_NotNull();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Column#getPrecision <em>Precision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Precision</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Column#getPrecision()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_Precision();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Column#getScale <em>Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scale</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Column#getScale()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_Scale();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Column#getSqlType <em>Sql Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sql Type</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Column#getSqlType()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_SqlType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Column#isUnique <em>Unique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unique</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Column#isUnique()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_Unique();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Column#getUniqueKey <em>Unique Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unique Key</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Column#getUniqueKey()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_UniqueKey();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.db2m.hbm30.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Component
	 * @generated
	 */
	EClass getComponent();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.Component#getMeta <em>Meta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Meta</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Component#getMeta()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Meta();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.Component#getTuplizer <em>Tuplizer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tuplizer</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Component#getTuplizer()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Tuplizer();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.db2m.hbm30.Component#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Parent</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Component#getParent()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Parent();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.emf.teneo.db2m.hbm30.Component#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Component#getGroup()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.Component#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Component#getProperty()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Property();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.Component#getManyToOne <em>Many To One</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Many To One</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Component#getManyToOne()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_ManyToOne();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.Component#getOneToOne <em>One To One</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>One To One</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Component#getOneToOne()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_OneToOne();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.Component#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Component</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Component#getComponent()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Component();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.Component#getDynamicComponent <em>Dynamic Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dynamic Component</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Component#getDynamicComponent()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_DynamicComponent();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.Component#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Any</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Component#getAny()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Any();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.Component#getMap <em>Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Map</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Component#getMap()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Map();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.Component#getSet <em>Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Set</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Component#getSet()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Set();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.Component#getList <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>List</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Component#getList()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_List();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.Component#getBag <em>Bag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bag</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Component#getBag()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Bag();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.Component#getArray <em>Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Array</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Component#getArray()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Array();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.Component#getPrimitiveArray <em>Primitive Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Primitive Array</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Component#getPrimitiveArray()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_PrimitiveArray();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Component#getAccess <em>Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Component#getAccess()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_Access();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Component#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Component#getClass_()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Component#isInsert <em>Insert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Insert</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Component#isInsert()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_Insert();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Component#isLazy <em>Lazy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lazy</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Component#isLazy()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_Lazy();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Component#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Component#getName()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Component#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Node</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Component#getNode()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_Node();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Component#isOptimisticLock <em>Optimistic Lock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Optimistic Lock</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Component#isOptimisticLock()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_OptimisticLock();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Component#isUnique <em>Unique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unique</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Component#isUnique()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_Unique();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Component#isUpdate <em>Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Update</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Component#isUpdate()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_Update();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.db2m.hbm30.CompositeElement <em>Composite Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Element</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.CompositeElement
	 * @generated
	 */
	EClass getCompositeElement();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.CompositeElement#getMeta <em>Meta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Meta</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.CompositeElement#getMeta()
	 * @see #getCompositeElement()
	 * @generated
	 */
	EReference getCompositeElement_Meta();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.db2m.hbm30.CompositeElement#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Parent</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.CompositeElement#getParent()
	 * @see #getCompositeElement()
	 * @generated
	 */
	EReference getCompositeElement_Parent();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.emf.teneo.db2m.hbm30.CompositeElement#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.CompositeElement#getGroup()
	 * @see #getCompositeElement()
	 * @generated
	 */
	EAttribute getCompositeElement_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.CompositeElement#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.CompositeElement#getProperty()
	 * @see #getCompositeElement()
	 * @generated
	 */
	EReference getCompositeElement_Property();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.CompositeElement#getManyToOne <em>Many To One</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Many To One</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.CompositeElement#getManyToOne()
	 * @see #getCompositeElement()
	 * @generated
	 */
	EReference getCompositeElement_ManyToOne();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.CompositeElement#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Any</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.CompositeElement#getAny()
	 * @see #getCompositeElement()
	 * @generated
	 */
	EReference getCompositeElement_Any();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.CompositeElement#getNestedCompositeElement <em>Nested Composite Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nested Composite Element</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.CompositeElement#getNestedCompositeElement()
	 * @see #getCompositeElement()
	 * @generated
	 */
	EReference getCompositeElement_NestedCompositeElement();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.CompositeElement#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.CompositeElement#getClass_()
	 * @see #getCompositeElement()
	 * @generated
	 */
	EAttribute getCompositeElement_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.CompositeElement#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Node</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.CompositeElement#getNode()
	 * @see #getCompositeElement()
	 * @generated
	 */
	EAttribute getCompositeElement_Node();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.db2m.hbm30.CompositeId <em>Composite Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Id</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.CompositeId
	 * @generated
	 */
	EClass getCompositeId();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.CompositeId#getMeta <em>Meta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Meta</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.CompositeId#getMeta()
	 * @see #getCompositeId()
	 * @generated
	 */
	EReference getCompositeId_Meta();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.emf.teneo.db2m.hbm30.CompositeId#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.CompositeId#getGroup()
	 * @see #getCompositeId()
	 * @generated
	 */
	EAttribute getCompositeId_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.CompositeId#getKeyProperty <em>Key Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Key Property</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.CompositeId#getKeyProperty()
	 * @see #getCompositeId()
	 * @generated
	 */
	EReference getCompositeId_KeyProperty();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.CompositeId#getKeyManyToOne <em>Key Many To One</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Key Many To One</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.CompositeId#getKeyManyToOne()
	 * @see #getCompositeId()
	 * @generated
	 */
	EReference getCompositeId_KeyManyToOne();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.CompositeId#getAccess <em>Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.CompositeId#getAccess()
	 * @see #getCompositeId()
	 * @generated
	 */
	EAttribute getCompositeId_Access();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.CompositeId#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.CompositeId#getClass_()
	 * @see #getCompositeId()
	 * @generated
	 */
	EAttribute getCompositeId_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.CompositeId#isMapped <em>Mapped</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mapped</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.CompositeId#isMapped()
	 * @see #getCompositeId()
	 * @generated
	 */
	EAttribute getCompositeId_Mapped();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.CompositeId#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.CompositeId#getName()
	 * @see #getCompositeId()
	 * @generated
	 */
	EAttribute getCompositeId_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.CompositeId#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Node</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.CompositeId#getNode()
	 * @see #getCompositeId()
	 * @generated
	 */
	EAttribute getCompositeId_Node();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.CompositeId#getUnsavedValue <em>Unsaved Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unsaved Value</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.CompositeId#getUnsavedValue()
	 * @see #getCompositeId()
	 * @generated
	 */
	EAttribute getCompositeId_UnsavedValue();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.db2m.hbm30.CompositeIndex <em>Composite Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Index</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.CompositeIndex
	 * @generated
	 */
	EClass getCompositeIndex();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.emf.teneo.db2m.hbm30.CompositeIndex#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.CompositeIndex#getGroup()
	 * @see #getCompositeIndex()
	 * @generated
	 */
	EAttribute getCompositeIndex_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.CompositeIndex#getKeyProperty <em>Key Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Key Property</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.CompositeIndex#getKeyProperty()
	 * @see #getCompositeIndex()
	 * @generated
	 */
	EReference getCompositeIndex_KeyProperty();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.CompositeIndex#getKeyManyToOne <em>Key Many To One</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Key Many To One</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.CompositeIndex#getKeyManyToOne()
	 * @see #getCompositeIndex()
	 * @generated
	 */
	EReference getCompositeIndex_KeyManyToOne();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.CompositeIndex#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.CompositeIndex#getClass_()
	 * @see #getCompositeIndex()
	 * @generated
	 */
	EAttribute getCompositeIndex_Class();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.db2m.hbm30.CompositeMapKey <em>Composite Map Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Map Key</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.CompositeMapKey
	 * @generated
	 */
	EClass getCompositeMapKey();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.emf.teneo.db2m.hbm30.CompositeMapKey#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.CompositeMapKey#getGroup()
	 * @see #getCompositeMapKey()
	 * @generated
	 */
	EAttribute getCompositeMapKey_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.CompositeMapKey#getKeyProperty <em>Key Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Key Property</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.CompositeMapKey#getKeyProperty()
	 * @see #getCompositeMapKey()
	 * @generated
	 */
	EReference getCompositeMapKey_KeyProperty();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.CompositeMapKey#getKeyManyToOne <em>Key Many To One</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Key Many To One</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.CompositeMapKey#getKeyManyToOne()
	 * @see #getCompositeMapKey()
	 * @generated
	 */
	EReference getCompositeMapKey_KeyManyToOne();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.CompositeMapKey#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.CompositeMapKey#getClass_()
	 * @see #getCompositeMapKey()
	 * @generated
	 */
	EAttribute getCompositeMapKey_Class();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.db2m.hbm30.DatabaseObject <em>Database Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Database Object</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.DatabaseObject
	 * @generated
	 */
	EClass getDatabaseObject();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.db2m.hbm30.DatabaseObject#getDefinition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Definition</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.DatabaseObject#getDefinition()
	 * @see #getDatabaseObject()
	 * @generated
	 */
	EReference getDatabaseObject_Definition();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.DatabaseObject#getCreate <em>Create</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Create</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.DatabaseObject#getCreate()
	 * @see #getDatabaseObject()
	 * @generated
	 */
	EAttribute getDatabaseObject_Create();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.DatabaseObject#getDrop <em>Drop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Drop</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.DatabaseObject#getDrop()
	 * @see #getDatabaseObject()
	 * @generated
	 */
	EAttribute getDatabaseObject_Drop();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.DatabaseObject#getDialectScope <em>Dialect Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dialect Scope</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.DatabaseObject#getDialectScope()
	 * @see #getDatabaseObject()
	 * @generated
	 */
	EReference getDatabaseObject_DialectScope();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.db2m.hbm30.Definition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Definition</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Definition
	 * @generated
	 */
	EClass getDefinition();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Definition#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Definition#getClass_()
	 * @see #getDefinition()
	 * @generated
	 */
	EAttribute getDefinition_Class();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.db2m.hbm30.DialectScope <em>Dialect Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dialect Scope</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.DialectScope
	 * @generated
	 */
	EClass getDialectScope();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.DialectScope#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.DialectScope#getValue()
	 * @see #getDialectScope()
	 * @generated
	 */
	EAttribute getDialectScope_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.DialectScope#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.DialectScope#getName()
	 * @see #getDialectScope()
	 * @generated
	 */
	EAttribute getDialectScope_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.db2m.hbm30.Discriminator <em>Discriminator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Discriminator</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Discriminator
	 * @generated
	 */
	EClass getDiscriminator();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.db2m.hbm30.Discriminator#getColumn <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Column</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Discriminator#getColumn()
	 * @see #getDiscriminator()
	 * @generated
	 */
	EReference getDiscriminator_Column();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Discriminator#getFormula <em>Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Formula</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Discriminator#getFormula()
	 * @see #getDiscriminator()
	 * @generated
	 */
	EAttribute getDiscriminator_Formula();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Discriminator#getColumn1 <em>Column1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column1</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Discriminator#getColumn1()
	 * @see #getDiscriminator()
	 * @generated
	 */
	EAttribute getDiscriminator_Column1();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Discriminator#isForce <em>Force</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Force</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Discriminator#isForce()
	 * @see #getDiscriminator()
	 * @generated
	 */
	EAttribute getDiscriminator_Force();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Discriminator#getFormula1 <em>Formula1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Formula1</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Discriminator#getFormula1()
	 * @see #getDiscriminator()
	 * @generated
	 */
	EAttribute getDiscriminator_Formula1();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Discriminator#isInsert <em>Insert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Insert</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Discriminator#isInsert()
	 * @see #getDiscriminator()
	 * @generated
	 */
	EAttribute getDiscriminator_Insert();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Discriminator#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Discriminator#getLength()
	 * @see #getDiscriminator()
	 * @generated
	 */
	EAttribute getDiscriminator_Length();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Discriminator#isNotNull <em>Not Null</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Not Null</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Discriminator#isNotNull()
	 * @see #getDiscriminator()
	 * @generated
	 */
	EAttribute getDiscriminator_NotNull();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Discriminator#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Discriminator#getType()
	 * @see #getDiscriminator()
	 * @generated
	 */
	EAttribute getDiscriminator_Type();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.db2m.hbm30.DynamicComponent <em>Dynamic Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dynamic Component</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.DynamicComponent
	 * @generated
	 */
	EClass getDynamicComponent();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.emf.teneo.db2m.hbm30.DynamicComponent#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.DynamicComponent#getGroup()
	 * @see #getDynamicComponent()
	 * @generated
	 */
	EAttribute getDynamicComponent_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.DynamicComponent#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.DynamicComponent#getProperty()
	 * @see #getDynamicComponent()
	 * @generated
	 */
	EReference getDynamicComponent_Property();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.DynamicComponent#getManyToOne <em>Many To One</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Many To One</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.DynamicComponent#getManyToOne()
	 * @see #getDynamicComponent()
	 * @generated
	 */
	EReference getDynamicComponent_ManyToOne();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.DynamicComponent#getOneToOne <em>One To One</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>One To One</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.DynamicComponent#getOneToOne()
	 * @see #getDynamicComponent()
	 * @generated
	 */
	EReference getDynamicComponent_OneToOne();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.DynamicComponent#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Component</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.DynamicComponent#getComponent()
	 * @see #getDynamicComponent()
	 * @generated
	 */
	EReference getDynamicComponent_Component();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.DynamicComponent#getDynamicComponent <em>Dynamic Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dynamic Component</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.DynamicComponent#getDynamicComponent()
	 * @see #getDynamicComponent()
	 * @generated
	 */
	EReference getDynamicComponent_DynamicComponent();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.DynamicComponent#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Any</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.DynamicComponent#getAny()
	 * @see #getDynamicComponent()
	 * @generated
	 */
	EReference getDynamicComponent_Any();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.DynamicComponent#getMap <em>Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Map</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.DynamicComponent#getMap()
	 * @see #getDynamicComponent()
	 * @generated
	 */
	EReference getDynamicComponent_Map();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.DynamicComponent#getSet <em>Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Set</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.DynamicComponent#getSet()
	 * @see #getDynamicComponent()
	 * @generated
	 */
	EReference getDynamicComponent_Set();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.DynamicComponent#getList <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>List</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.DynamicComponent#getList()
	 * @see #getDynamicComponent()
	 * @generated
	 */
	EReference getDynamicComponent_List();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.DynamicComponent#getBag <em>Bag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bag</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.DynamicComponent#getBag()
	 * @see #getDynamicComponent()
	 * @generated
	 */
	EReference getDynamicComponent_Bag();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.DynamicComponent#getArray <em>Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Array</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.DynamicComponent#getArray()
	 * @see #getDynamicComponent()
	 * @generated
	 */
	EReference getDynamicComponent_Array();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.DynamicComponent#getPrimitiveArray <em>Primitive Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Primitive Array</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.DynamicComponent#getPrimitiveArray()
	 * @see #getDynamicComponent()
	 * @generated
	 */
	EReference getDynamicComponent_PrimitiveArray();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.DynamicComponent#getAccess <em>Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.DynamicComponent#getAccess()
	 * @see #getDynamicComponent()
	 * @generated
	 */
	EAttribute getDynamicComponent_Access();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.DynamicComponent#isInsert <em>Insert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Insert</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.DynamicComponent#isInsert()
	 * @see #getDynamicComponent()
	 * @generated
	 */
	EAttribute getDynamicComponent_Insert();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.DynamicComponent#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.DynamicComponent#getName()
	 * @see #getDynamicComponent()
	 * @generated
	 */
	EAttribute getDynamicComponent_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.DynamicComponent#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Node</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.DynamicComponent#getNode()
	 * @see #getDynamicComponent()
	 * @generated
	 */
	EAttribute getDynamicComponent_Node();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.DynamicComponent#isOptimisticLock <em>Optimistic Lock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Optimistic Lock</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.DynamicComponent#isOptimisticLock()
	 * @see #getDynamicComponent()
	 * @generated
	 */
	EAttribute getDynamicComponent_OptimisticLock();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.DynamicComponent#isUnique <em>Unique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unique</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.DynamicComponent#isUnique()
	 * @see #getDynamicComponent()
	 * @generated
	 */
	EAttribute getDynamicComponent_Unique();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.DynamicComponent#isUpdate <em>Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Update</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.DynamicComponent#isUpdate()
	 * @see #getDynamicComponent()
	 * @generated
	 */
	EAttribute getDynamicComponent_Update();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.db2m.hbm30.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.emf.teneo.db2m.hbm30.Element#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Element#getGroup()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.Element#getColumn <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Column</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Element#getColumn()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_Column();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.emf.teneo.db2m.hbm30.Element#getFormula <em>Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Formula</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Element#getFormula()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Formula();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Element#getColumn1 <em>Column1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column1</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Element#getColumn1()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Column1();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Element#getFormula1 <em>Formula1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Formula1</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Element#getFormula1()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Formula1();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Element#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Element#getLength()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Length();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Element#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Node</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Element#getNode()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Node();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Element#isNotNull <em>Not Null</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Not Null</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Element#isNotNull()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_NotNull();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Element#getPrecision <em>Precision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Precision</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Element#getPrecision()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Precision();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Element#getScale <em>Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scale</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Element#getScale()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Scale();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Element#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Element#getType()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Element#isUnique <em>Unique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unique</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Element#isUnique()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Unique();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.db2m.hbm30.Filter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Filter</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Filter
	 * @generated
	 */
	EClass getFilter();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Filter#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Filter#getValue()
	 * @see #getFilter()
	 * @generated
	 */
	EAttribute getFilter_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Filter#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Filter#getCondition()
	 * @see #getFilter()
	 * @generated
	 */
	EAttribute getFilter_Condition();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Filter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Filter#getName()
	 * @see #getFilter()
	 * @generated
	 */
	EAttribute getFilter_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.db2m.hbm30.FilterDef <em>Filter Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Filter Def</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.FilterDef
	 * @generated
	 */
	EClass getFilterDef();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.emf.teneo.db2m.hbm30.FilterDef#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.FilterDef#getMixed()
	 * @see #getFilterDef()
	 * @generated
	 */
	EAttribute getFilterDef_Mixed();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.emf.teneo.db2m.hbm30.FilterDef#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.FilterDef#getGroup()
	 * @see #getFilterDef()
	 * @generated
	 */
	EAttribute getFilterDef_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.FilterDef#getFilterParam <em>Filter Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Filter Param</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.FilterDef#getFilterParam()
	 * @see #getFilterDef()
	 * @generated
	 */
	EReference getFilterDef_FilterParam();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.FilterDef#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.FilterDef#getCondition()
	 * @see #getFilterDef()
	 * @generated
	 */
	EAttribute getFilterDef_Condition();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.FilterDef#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.FilterDef#getName()
	 * @see #getFilterDef()
	 * @generated
	 */
	EAttribute getFilterDef_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.db2m.hbm30.FilterParam <em>Filter Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Filter Param</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.FilterParam
	 * @generated
	 */
	EClass getFilterParam();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.FilterParam#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.FilterParam#getName()
	 * @see #getFilterParam()
	 * @generated
	 */
	EAttribute getFilterParam_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.FilterParam#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.FilterParam#getType()
	 * @see #getFilterParam()
	 * @generated
	 */
	EAttribute getFilterParam_Type();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.db2m.hbm30.Generator <em>Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generator</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Generator
	 * @generated
	 */
	EClass getGenerator();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.Generator#getParam <em>Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Param</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Generator#getParam()
	 * @see #getGenerator()
	 * @generated
	 */
	EReference getGenerator_Param();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Generator#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Generator#getClass_()
	 * @see #getGenerator()
	 * @generated
	 */
	EAttribute getGenerator_Class();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.db2m.hbm30.HibernateMapping <em>Hibernate Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hibernate Mapping</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.HibernateMapping
	 * @generated
	 */
	EClass getHibernateMapping();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.HibernateMapping#getMeta <em>Meta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Meta</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.HibernateMapping#getMeta()
	 * @see #getHibernateMapping()
	 * @generated
	 */
	EReference getHibernateMapping_Meta();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.HibernateMapping#getTypedef <em>Typedef</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Typedef</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.HibernateMapping#getTypedef()
	 * @see #getHibernateMapping()
	 * @generated
	 */
	EReference getHibernateMapping_Typedef();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.HibernateMapping#getImport <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Import</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.HibernateMapping#getImport()
	 * @see #getHibernateMapping()
	 * @generated
	 */
	EReference getHibernateMapping_Import();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.emf.teneo.db2m.hbm30.HibernateMapping#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.HibernateMapping#getGroup()
	 * @see #getHibernateMapping()
	 * @generated
	 */
	EAttribute getHibernateMapping_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.HibernateMapping#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Class</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.HibernateMapping#getClass_()
	 * @see #getHibernateMapping()
	 * @generated
	 */
	EReference getHibernateMapping_Class();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.HibernateMapping#getSubclass <em>Subclass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subclass</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.HibernateMapping#getSubclass()
	 * @see #getHibernateMapping()
	 * @generated
	 */
	EReference getHibernateMapping_Subclass();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.HibernateMapping#getJoinedSubclass <em>Joined Subclass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Joined Subclass</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.HibernateMapping#getJoinedSubclass()
	 * @see #getHibernateMapping()
	 * @generated
	 */
	EReference getHibernateMapping_JoinedSubclass();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.HibernateMapping#getUnionSubclass <em>Union Subclass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Union Subclass</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.HibernateMapping#getUnionSubclass()
	 * @see #getHibernateMapping()
	 * @generated
	 */
	EReference getHibernateMapping_UnionSubclass();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.HibernateMapping#getResultset <em>Resultset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resultset</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.HibernateMapping#getResultset()
	 * @see #getHibernateMapping()
	 * @generated
	 */
	EReference getHibernateMapping_Resultset();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.emf.teneo.db2m.hbm30.HibernateMapping#getGroup1 <em>Group1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group1</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.HibernateMapping#getGroup1()
	 * @see #getHibernateMapping()
	 * @generated
	 */
	EAttribute getHibernateMapping_Group1();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.HibernateMapping#getQuery <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Query</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.HibernateMapping#getQuery()
	 * @see #getHibernateMapping()
	 * @generated
	 */
	EReference getHibernateMapping_Query();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.HibernateMapping#getSqlQuery <em>Sql Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sql Query</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.HibernateMapping#getSqlQuery()
	 * @see #getHibernateMapping()
	 * @generated
	 */
	EReference getHibernateMapping_SqlQuery();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.HibernateMapping#getFilterDef <em>Filter Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Filter Def</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.HibernateMapping#getFilterDef()
	 * @see #getHibernateMapping()
	 * @generated
	 */
	EReference getHibernateMapping_FilterDef();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.HibernateMapping#getDatabaseObject <em>Database Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Database Object</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.HibernateMapping#getDatabaseObject()
	 * @see #getHibernateMapping()
	 * @generated
	 */
	EReference getHibernateMapping_DatabaseObject();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.HibernateMapping#isAutoImport <em>Auto Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Auto Import</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.HibernateMapping#isAutoImport()
	 * @see #getHibernateMapping()
	 * @generated
	 */
	EAttribute getHibernateMapping_AutoImport();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.HibernateMapping#getCatalog <em>Catalog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Catalog</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.HibernateMapping#getCatalog()
	 * @see #getHibernateMapping()
	 * @generated
	 */
	EAttribute getHibernateMapping_Catalog();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.HibernateMapping#getDefaultAccess <em>Default Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Access</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.HibernateMapping#getDefaultAccess()
	 * @see #getHibernateMapping()
	 * @generated
	 */
	EAttribute getHibernateMapping_DefaultAccess();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.HibernateMapping#getDefaultCascade <em>Default Cascade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Cascade</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.HibernateMapping#getDefaultCascade()
	 * @see #getHibernateMapping()
	 * @generated
	 */
	EAttribute getHibernateMapping_DefaultCascade();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.HibernateMapping#isDefaultLazy <em>Default Lazy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Lazy</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.HibernateMapping#isDefaultLazy()
	 * @see #getHibernateMapping()
	 * @generated
	 */
	EAttribute getHibernateMapping_DefaultLazy();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.HibernateMapping#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Package</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.HibernateMapping#getPackage()
	 * @see #getHibernateMapping()
	 * @generated
	 */
	EAttribute getHibernateMapping_Package();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.HibernateMapping#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schema</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.HibernateMapping#getSchema()
	 * @see #getHibernateMapping()
	 * @generated
	 */
	EAttribute getHibernateMapping_Schema();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.db2m.hbm30.Id <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Id</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Id
	 * @generated
	 */
	EClass getId();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.Id#getMeta <em>Meta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Meta</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Id#getMeta()
	 * @see #getId()
	 * @generated
	 */
	EReference getId_Meta();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.Id#getColumn <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Column</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Id#getColumn()
	 * @see #getId()
	 * @generated
	 */
	EReference getId_Column();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.db2m.hbm30.Id#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Id#getType()
	 * @see #getId()
	 * @generated
	 */
	EReference getId_Type();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.db2m.hbm30.Id#getGenerator <em>Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Generator</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Id#getGenerator()
	 * @see #getId()
	 * @generated
	 */
	EReference getId_Generator();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Id#getAccess <em>Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Id#getAccess()
	 * @see #getId()
	 * @generated
	 */
	EAttribute getId_Access();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Id#getColumn1 <em>Column1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column1</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Id#getColumn1()
	 * @see #getId()
	 * @generated
	 */
	EAttribute getId_Column1();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Id#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Id#getLength()
	 * @see #getId()
	 * @generated
	 */
	EAttribute getId_Length();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Id#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Id#getName()
	 * @see #getId()
	 * @generated
	 */
	EAttribute getId_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Id#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Node</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Id#getNode()
	 * @see #getId()
	 * @generated
	 */
	EAttribute getId_Node();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Id#getType1 <em>Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type1</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Id#getType1()
	 * @see #getId()
	 * @generated
	 */
	EAttribute getId_Type1();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Id#getUnsavedValue <em>Unsaved Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unsaved Value</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Id#getUnsavedValue()
	 * @see #getId()
	 * @generated
	 */
	EAttribute getId_UnsavedValue();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.db2m.hbm30.Idbag <em>Idbag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Idbag</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Idbag
	 * @generated
	 */
	EClass getIdbag();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.Idbag#getMeta <em>Meta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Meta</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Idbag#getMeta()
	 * @see #getIdbag()
	 * @generated
	 */
	EReference getIdbag_Meta();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Idbag#getSubselect <em>Subselect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subselect</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Idbag#getSubselect()
	 * @see #getIdbag()
	 * @generated
	 */
	EAttribute getIdbag_Subselect();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.db2m.hbm30.Idbag#getCache <em>Cache</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cache</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Idbag#getCache()
	 * @see #getIdbag()
	 * @generated
	 */
	EReference getIdbag_Cache();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.Idbag#getSynchronize <em>Synchronize</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Synchronize</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Idbag#getSynchronize()
	 * @see #getIdbag()
	 * @generated
	 */
	EReference getIdbag_Synchronize();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Idbag#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Idbag#getComment()
	 * @see #getIdbag()
	 * @generated
	 */
	EAttribute getIdbag_Comment();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.db2m.hbm30.Idbag#getCollectionId <em>Collection Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Collection Id</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Idbag#getCollectionId()
	 * @see #getIdbag()
	 * @generated
	 */
	EReference getIdbag_CollectionId();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.db2m.hbm30.Idbag#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Key</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Idbag#getKey()
	 * @see #getIdbag()
	 * @generated
	 */
	EReference getIdbag_Key();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.db2m.hbm30.Idbag#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Element</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Idbag#getElement()
	 * @see #getIdbag()
	 * @generated
	 */
	EReference getIdbag_Element();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.db2m.hbm30.Idbag#getManyToMany <em>Many To Many</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Many To Many</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Idbag#getManyToMany()
	 * @see #getIdbag()
	 * @generated
	 */
	EReference getIdbag_ManyToMany();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.db2m.hbm30.Idbag#getCompositeElement <em>Composite Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Composite Element</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Idbag#getCompositeElement()
	 * @see #getIdbag()
	 * @generated
	 */
	EReference getIdbag_CompositeElement();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.db2m.hbm30.Idbag#getManyToAny <em>Many To Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Many To Any</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Idbag#getManyToAny()
	 * @see #getIdbag()
	 * @generated
	 */
	EReference getIdbag_ManyToAny();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.db2m.hbm30.Idbag#getLoader <em>Loader</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Loader</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Idbag#getLoader()
	 * @see #getIdbag()
	 * @generated
	 */
	EReference getIdbag_Loader();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.db2m.hbm30.Idbag#getSqlInsert <em>Sql Insert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sql Insert</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Idbag#getSqlInsert()
	 * @see #getIdbag()
	 * @generated
	 */
	EReference getIdbag_SqlInsert();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.db2m.hbm30.Idbag#getSqlUpdate <em>Sql Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sql Update</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Idbag#getSqlUpdate()
	 * @see #getIdbag()
	 * @generated
	 */
	EReference getIdbag_SqlUpdate();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.db2m.hbm30.Idbag#getSqlDelete <em>Sql Delete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sql Delete</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Idbag#getSqlDelete()
	 * @see #getIdbag()
	 * @generated
	 */
	EReference getIdbag_SqlDelete();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.db2m.hbm30.Idbag#getSqlDeleteAll <em>Sql Delete All</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sql Delete All</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Idbag#getSqlDeleteAll()
	 * @see #getIdbag()
	 * @generated
	 */
	EReference getIdbag_SqlDeleteAll();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.Idbag#getFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Filter</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Idbag#getFilter()
	 * @see #getIdbag()
	 * @generated
	 */
	EReference getIdbag_Filter();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Idbag#getAccess <em>Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Idbag#getAccess()
	 * @see #getIdbag()
	 * @generated
	 */
	EAttribute getIdbag_Access();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Idbag#getBatchSize <em>Batch Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Batch Size</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Idbag#getBatchSize()
	 * @see #getIdbag()
	 * @generated
	 */
	EAttribute getIdbag_BatchSize();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Idbag#getCascade <em>Cascade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cascade</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Idbag#getCascade()
	 * @see #getIdbag()
	 * @generated
	 */
	EAttribute getIdbag_Cascade();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Idbag#getCatalog <em>Catalog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Catalog</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Idbag#getCatalog()
	 * @see #getIdbag()
	 * @generated
	 */
	EAttribute getIdbag_Catalog();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Idbag#getCheck <em>Check</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Check</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Idbag#getCheck()
	 * @see #getIdbag()
	 * @generated
	 */
	EAttribute getIdbag_Check();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Idbag#getCollectionType <em>Collection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Collection Type</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Idbag#getCollectionType()
	 * @see #getIdbag()
	 * @generated
	 */
	EAttribute getIdbag_CollectionType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Idbag#isEmbedXml <em>Embed Xml</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Embed Xml</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Idbag#isEmbedXml()
	 * @see #getIdbag()
	 * @generated
	 */
	EAttribute getIdbag_EmbedXml();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Idbag#getFetch <em>Fetch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fetch</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Idbag#getFetch()
	 * @see #getIdbag()
	 * @generated
	 */
	EAttribute getIdbag_Fetch();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Idbag#getLazy <em>Lazy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lazy</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Idbag#getLazy()
	 * @see #getIdbag()
	 * @generated
	 */
	EAttribute getIdbag_Lazy();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Idbag#isMutable <em>Mutable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mutable</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Idbag#isMutable()
	 * @see #getIdbag()
	 * @generated
	 */
	EAttribute getIdbag_Mutable();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Idbag#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Idbag#getName()
	 * @see #getIdbag()
	 * @generated
	 */
	EAttribute getIdbag_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Idbag#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Node</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Idbag#getNode()
	 * @see #getIdbag()
	 * @generated
	 */
	EAttribute getIdbag_Node();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Idbag#isOptimisticLock <em>Optimistic Lock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Optimistic Lock</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Idbag#isOptimisticLock()
	 * @see #getIdbag()
	 * @generated
	 */
	EAttribute getIdbag_OptimisticLock();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Idbag#getOrderBy <em>Order By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order By</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Idbag#getOrderBy()
	 * @see #getIdbag()
	 * @generated
	 */
	EAttribute getIdbag_OrderBy();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Idbag#getOuterJoin <em>Outer Join</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Outer Join</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Idbag#getOuterJoin()
	 * @see #getIdbag()
	 * @generated
	 */
	EAttribute getIdbag_OuterJoin();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Idbag#getPersister <em>Persister</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Persister</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Idbag#getPersister()
	 * @see #getIdbag()
	 * @generated
	 */
	EAttribute getIdbag_Persister();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Idbag#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schema</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Idbag#getSchema()
	 * @see #getIdbag()
	 * @generated
	 */
	EAttribute getIdbag_Schema();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Idbag#getSubselect1 <em>Subselect1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subselect1</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Idbag#getSubselect1()
	 * @see #getIdbag()
	 * @generated
	 */
	EAttribute getIdbag_Subselect1();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Idbag#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Table</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Idbag#getTable()
	 * @see #getIdbag()
	 * @generated
	 */
	EAttribute getIdbag_Table();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Idbag#getWhere <em>Where</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Where</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Idbag#getWhere()
	 * @see #getIdbag()
	 * @generated
	 */
	EAttribute getIdbag_Where();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.db2m.hbm30.Import <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Import</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Import
	 * @generated
	 */
	EClass getImport();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Import#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Import#getClass_()
	 * @see #getImport()
	 * @generated
	 */
	EAttribute getImport_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Import#getRename <em>Rename</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rename</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Import#getRename()
	 * @see #getImport()
	 * @generated
	 */
	EAttribute getImport_Rename();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.db2m.hbm30.Index <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Index</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Index
	 * @generated
	 */
	EClass getIndex();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.Index#getColumn <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Column</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Index#getColumn()
	 * @see #getIndex()
	 * @generated
	 */
	EReference getIndex_Column();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Index#getColumn1 <em>Column1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column1</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Index#getColumn1()
	 * @see #getIndex()
	 * @generated
	 */
	EAttribute getIndex_Column1();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Index#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Index#getLength()
	 * @see #getIndex()
	 * @generated
	 */
	EAttribute getIndex_Length();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Index#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Index#getType()
	 * @see #getIndex()
	 * @generated
	 */
	EAttribute getIndex_Type();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.db2m.hbm30.IndexManyToAny <em>Index Many To Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Index Many To Any</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.IndexManyToAny
	 * @generated
	 */
	EClass getIndexManyToAny();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.db2m.hbm30.IndexManyToAny#getColumn <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Column</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.IndexManyToAny#getColumn()
	 * @see #getIndexManyToAny()
	 * @generated
	 */
	EReference getIndexManyToAny_Column();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.IndexManyToAny#getColumn1 <em>Column1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Column1</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.IndexManyToAny#getColumn1()
	 * @see #getIndexManyToAny()
	 * @generated
	 */
	EReference getIndexManyToAny_Column1();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.IndexManyToAny#getIdType <em>Id Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Type</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.IndexManyToAny#getIdType()
	 * @see #getIndexManyToAny()
	 * @generated
	 */
	EAttribute getIndexManyToAny_IdType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.IndexManyToAny#getMetaType <em>Meta Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Meta Type</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.IndexManyToAny#getMetaType()
	 * @see #getIndexManyToAny()
	 * @generated
	 */
	EAttribute getIndexManyToAny_MetaType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.db2m.hbm30.IndexManyToMany <em>Index Many To Many</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Index Many To Many</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.IndexManyToMany
	 * @generated
	 */
	EClass getIndexManyToMany();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.IndexManyToMany#getColumn <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Column</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.IndexManyToMany#getColumn()
	 * @see #getIndexManyToMany()
	 * @generated
	 */
	EReference getIndexManyToMany_Column();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.IndexManyToMany#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.IndexManyToMany#getClass_()
	 * @see #getIndexManyToMany()
	 * @generated
	 */
	EAttribute getIndexManyToMany_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.IndexManyToMany#getColumn1 <em>Column1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column1</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.IndexManyToMany#getColumn1()
	 * @see #getIndexManyToMany()
	 * @generated
	 */
	EAttribute getIndexManyToMany_Column1();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.IndexManyToMany#getEntityName <em>Entity Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Entity Name</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.IndexManyToMany#getEntityName()
	 * @see #getIndexManyToMany()
	 * @generated
	 */
	EAttribute getIndexManyToMany_EntityName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.IndexManyToMany#getForeignKey <em>Foreign Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Foreign Key</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.IndexManyToMany#getForeignKey()
	 * @see #getIndexManyToMany()
	 * @generated
	 */
	EAttribute getIndexManyToMany_ForeignKey();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.db2m.hbm30.Join <em>Join</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Join</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Join
	 * @generated
	 */
	EClass getJoin();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Join#getSubselect <em>Subselect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subselect</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Join#getSubselect()
	 * @see #getJoin()
	 * @generated
	 */
	EAttribute getJoin_Subselect();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Join#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Join#getComment()
	 * @see #getJoin()
	 * @generated
	 */
	EAttribute getJoin_Comment();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.db2m.hbm30.Join#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Key</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Join#getKey()
	 * @see #getJoin()
	 * @generated
	 */
	EReference getJoin_Key();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.emf.teneo.db2m.hbm30.Join#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Join#getGroup()
	 * @see #getJoin()
	 * @generated
	 */
	EAttribute getJoin_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.Join#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Join#getProperty()
	 * @see #getJoin()
	 * @generated
	 */
	EReference getJoin_Property();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.Join#getManyToOne <em>Many To One</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Many To One</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Join#getManyToOne()
	 * @see #getJoin()
	 * @generated
	 */
	EReference getJoin_ManyToOne();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.Join#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Component</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Join#getComponent()
	 * @see #getJoin()
	 * @generated
	 */
	EReference getJoin_Component();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.Join#getDynamicComponent <em>Dynamic Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dynamic Component</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Join#getDynamicComponent()
	 * @see #getJoin()
	 * @generated
	 */
	EReference getJoin_DynamicComponent();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.Join#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Any</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Join#getAny()
	 * @see #getJoin()
	 * @generated
	 */
	EReference getJoin_Any();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.db2m.hbm30.Join#getSqlInsert <em>Sql Insert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sql Insert</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Join#getSqlInsert()
	 * @see #getJoin()
	 * @generated
	 */
	EReference getJoin_SqlInsert();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.db2m.hbm30.Join#getSqlUpdate <em>Sql Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sql Update</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Join#getSqlUpdate()
	 * @see #getJoin()
	 * @generated
	 */
	EReference getJoin_SqlUpdate();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.db2m.hbm30.Join#getSqlDelete <em>Sql Delete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sql Delete</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Join#getSqlDelete()
	 * @see #getJoin()
	 * @generated
	 */
	EReference getJoin_SqlDelete();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Join#getCatalog <em>Catalog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Catalog</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Join#getCatalog()
	 * @see #getJoin()
	 * @generated
	 */
	EAttribute getJoin_Catalog();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Join#getFetch <em>Fetch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fetch</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Join#getFetch()
	 * @see #getJoin()
	 * @generated
	 */
	EAttribute getJoin_Fetch();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Join#isInverse <em>Inverse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inverse</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Join#isInverse()
	 * @see #getJoin()
	 * @generated
	 */
	EAttribute getJoin_Inverse();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Join#isOptional <em>Optional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Optional</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Join#isOptional()
	 * @see #getJoin()
	 * @generated
	 */
	EAttribute getJoin_Optional();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Join#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schema</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Join#getSchema()
	 * @see #getJoin()
	 * @generated
	 */
	EAttribute getJoin_Schema();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Join#getSubselect1 <em>Subselect1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subselect1</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Join#getSubselect1()
	 * @see #getJoin()
	 * @generated
	 */
	EAttribute getJoin_Subselect1();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Join#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Table</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Join#getTable()
	 * @see #getJoin()
	 * @generated
	 */
	EAttribute getJoin_Table();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass <em>Joined Subclass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Joined Subclass</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass
	 * @generated
	 */
	EClass getJoinedSubclass();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass#getMeta <em>Meta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Meta</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass#getMeta()
	 * @see #getJoinedSubclass()
	 * @generated
	 */
	EReference getJoinedSubclass_Meta();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass#getSubselect <em>Subselect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subselect</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass#getSubselect()
	 * @see #getJoinedSubclass()
	 * @generated
	 */
	EAttribute getJoinedSubclass_Subselect();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass#getSynchronize <em>Synchronize</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Synchronize</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass#getSynchronize()
	 * @see #getJoinedSubclass()
	 * @generated
	 */
	EReference getJoinedSubclass_Synchronize();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass#getComment()
	 * @see #getJoinedSubclass()
	 * @generated
	 */
	EAttribute getJoinedSubclass_Comment();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass#getTuplizer <em>Tuplizer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tuplizer</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass#getTuplizer()
	 * @see #getJoinedSubclass()
	 * @generated
	 */
	EReference getJoinedSubclass_Tuplizer();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Key</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass#getKey()
	 * @see #getJoinedSubclass()
	 * @generated
	 */
	EReference getJoinedSubclass_Key();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass#getGroup()
	 * @see #getJoinedSubclass()
	 * @generated
	 */
	EAttribute getJoinedSubclass_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass#getProperty()
	 * @see #getJoinedSubclass()
	 * @generated
	 */
	EReference getJoinedSubclass_Property();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass#getManyToOne <em>Many To One</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Many To One</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass#getManyToOne()
	 * @see #getJoinedSubclass()
	 * @generated
	 */
	EReference getJoinedSubclass_ManyToOne();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass#getOneToOne <em>One To One</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>One To One</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass#getOneToOne()
	 * @see #getJoinedSubclass()
	 * @generated
	 */
	EReference getJoinedSubclass_OneToOne();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Component</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass#getComponent()
	 * @see #getJoinedSubclass()
	 * @generated
	 */
	EReference getJoinedSubclass_Component();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass#getDynamicComponent <em>Dynamic Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dynamic Component</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass#getDynamicComponent()
	 * @see #getJoinedSubclass()
	 * @generated
	 */
	EReference getJoinedSubclass_DynamicComponent();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass#getProperties()
	 * @see #getJoinedSubclass()
	 * @generated
	 */
	EReference getJoinedSubclass_Properties();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Any</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass#getAny()
	 * @see #getJoinedSubclass()
	 * @generated
	 */
	EReference getJoinedSubclass_Any();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass#getMap <em>Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Map</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass#getMap()
	 * @see #getJoinedSubclass()
	 * @generated
	 */
	EReference getJoinedSubclass_Map();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass#getSet <em>Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Set</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass#getSet()
	 * @see #getJoinedSubclass()
	 * @generated
	 */
	EReference getJoinedSubclass_Set();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass#getList <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>List</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass#getList()
	 * @see #getJoinedSubclass()
	 * @generated
	 */
	EReference getJoinedSubclass_List();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass#getBag <em>Bag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bag</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass#getBag()
	 * @see #getJoinedSubclass()
	 * @generated
	 */
	EReference getJoinedSubclass_Bag();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass#getIdbag <em>Idbag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Idbag</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass#getIdbag()
	 * @see #getJoinedSubclass()
	 * @generated
	 */
	EReference getJoinedSubclass_Idbag();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass#getArray <em>Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Array</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass#getArray()
	 * @see #getJoinedSubclass()
	 * @generated
	 */
	EReference getJoinedSubclass_Array();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass#getPrimitiveArray <em>Primitive Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Primitive Array</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass#getPrimitiveArray()
	 * @see #getJoinedSubclass()
	 * @generated
	 */
	EReference getJoinedSubclass_PrimitiveArray();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass#getJoinedSubclass <em>Joined Subclass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Joined Subclass</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass#getJoinedSubclass()
	 * @see #getJoinedSubclass()
	 * @generated
	 */
	EReference getJoinedSubclass_JoinedSubclass();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass#getLoader <em>Loader</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Loader</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass#getLoader()
	 * @see #getJoinedSubclass()
	 * @generated
	 */
	EReference getJoinedSubclass_Loader();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass#getSqlInsert <em>Sql Insert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sql Insert</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass#getSqlInsert()
	 * @see #getJoinedSubclass()
	 * @generated
	 */
	EReference getJoinedSubclass_SqlInsert();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass#getSqlUpdate <em>Sql Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sql Update</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass#getSqlUpdate()
	 * @see #getJoinedSubclass()
	 * @generated
	 */
	EReference getJoinedSubclass_SqlUpdate();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass#getSqlDelete <em>Sql Delete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sql Delete</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass#getSqlDelete()
	 * @see #getJoinedSubclass()
	 * @generated
	 */
	EReference getJoinedSubclass_SqlDelete();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass#getResultset <em>Resultset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resultset</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass#getResultset()
	 * @see #getJoinedSubclass()
	 * @generated
	 */
	EReference getJoinedSubclass_Resultset();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass#getGroup1 <em>Group1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group1</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass#getGroup1()
	 * @see #getJoinedSubclass()
	 * @generated
	 */
	EAttribute getJoinedSubclass_Group1();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass#getQuery <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Query</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass#getQuery()
	 * @see #getJoinedSubclass()
	 * @generated
	 */
	EReference getJoinedSubclass_Query();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass#getSqlQuery <em>Sql Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sql Query</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass#getSqlQuery()
	 * @see #getJoinedSubclass()
	 * @generated
	 */
	EReference getJoinedSubclass_SqlQuery();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass#isAbstract <em>Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abstract</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass#isAbstract()
	 * @see #getJoinedSubclass()
	 * @generated
	 */
	EAttribute getJoinedSubclass_Abstract();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass#getBatchSize <em>Batch Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Batch Size</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass#getBatchSize()
	 * @see #getJoinedSubclass()
	 * @generated
	 */
	EAttribute getJoinedSubclass_BatchSize();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass#getCatalog <em>Catalog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Catalog</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass#getCatalog()
	 * @see #getJoinedSubclass()
	 * @generated
	 */
	EAttribute getJoinedSubclass_Catalog();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass#getCheck <em>Check</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Check</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass#getCheck()
	 * @see #getJoinedSubclass()
	 * @generated
	 */
	EAttribute getJoinedSubclass_Check();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass#isDynamicInsert <em>Dynamic Insert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dynamic Insert</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass#isDynamicInsert()
	 * @see #getJoinedSubclass()
	 * @generated
	 */
	EAttribute getJoinedSubclass_DynamicInsert();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass#isDynamicUpdate <em>Dynamic Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dynamic Update</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass#isDynamicUpdate()
	 * @see #getJoinedSubclass()
	 * @generated
	 */
	EAttribute getJoinedSubclass_DynamicUpdate();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass#getEntityName <em>Entity Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Entity Name</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass#getEntityName()
	 * @see #getJoinedSubclass()
	 * @generated
	 */
	EAttribute getJoinedSubclass_EntityName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass#getExtends <em>Extends</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extends</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass#getExtends()
	 * @see #getJoinedSubclass()
	 * @generated
	 */
	EAttribute getJoinedSubclass_Extends();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass#isLazy <em>Lazy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lazy</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass#isLazy()
	 * @see #getJoinedSubclass()
	 * @generated
	 */
	EAttribute getJoinedSubclass_Lazy();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass#getName()
	 * @see #getJoinedSubclass()
	 * @generated
	 */
	EAttribute getJoinedSubclass_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Node</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass#getNode()
	 * @see #getJoinedSubclass()
	 * @generated
	 */
	EAttribute getJoinedSubclass_Node();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass#getPersister <em>Persister</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Persister</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass#getPersister()
	 * @see #getJoinedSubclass()
	 * @generated
	 */
	EAttribute getJoinedSubclass_Persister();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass#getProxy <em>Proxy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Proxy</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass#getProxy()
	 * @see #getJoinedSubclass()
	 * @generated
	 */
	EAttribute getJoinedSubclass_Proxy();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schema</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass#getSchema()
	 * @see #getJoinedSubclass()
	 * @generated
	 */
	EAttribute getJoinedSubclass_Schema();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass#isSelectBeforeUpdate <em>Select Before Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Select Before Update</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass#isSelectBeforeUpdate()
	 * @see #getJoinedSubclass()
	 * @generated
	 */
	EAttribute getJoinedSubclass_SelectBeforeUpdate();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass#getSubselect1 <em>Subselect1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subselect1</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass#getSubselect1()
	 * @see #getJoinedSubclass()
	 * @generated
	 */
	EAttribute getJoinedSubclass_Subselect1();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Table</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass#getTable()
	 * @see #getJoinedSubclass()
	 * @generated
	 */
	EAttribute getJoinedSubclass_Table();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.db2m.hbm30.Key <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Key</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Key
	 * @generated
	 */
	EClass getKey();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.Key#getColumn <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Column</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Key#getColumn()
	 * @see #getKey()
	 * @generated
	 */
	EReference getKey_Column();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Key#getColumn1 <em>Column1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column1</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Key#getColumn1()
	 * @see #getKey()
	 * @generated
	 */
	EAttribute getKey_Column1();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Key#getForeignKey <em>Foreign Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Foreign Key</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Key#getForeignKey()
	 * @see #getKey()
	 * @generated
	 */
	EAttribute getKey_ForeignKey();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Key#isNotNull <em>Not Null</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Not Null</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Key#isNotNull()
	 * @see #getKey()
	 * @generated
	 */
	EAttribute getKey_NotNull();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Key#getOnDelete <em>On Delete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On Delete</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Key#getOnDelete()
	 * @see #getKey()
	 * @generated
	 */
	EAttribute getKey_OnDelete();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Key#getPropertyRef <em>Property Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property Ref</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Key#getPropertyRef()
	 * @see #getKey()
	 * @generated
	 */
	EAttribute getKey_PropertyRef();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Key#isUnique <em>Unique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unique</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Key#isUnique()
	 * @see #getKey()
	 * @generated
	 */
	EAttribute getKey_Unique();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Key#isUpdate <em>Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Update</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Key#isUpdate()
	 * @see #getKey()
	 * @generated
	 */
	EAttribute getKey_Update();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.db2m.hbm30.KeyManyToOne <em>Key Many To One</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Key Many To One</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.KeyManyToOne
	 * @generated
	 */
	EClass getKeyManyToOne();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.KeyManyToOne#getMeta <em>Meta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Meta</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.KeyManyToOne#getMeta()
	 * @see #getKeyManyToOne()
	 * @generated
	 */
	EReference getKeyManyToOne_Meta();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.KeyManyToOne#getColumn <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Column</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.KeyManyToOne#getColumn()
	 * @see #getKeyManyToOne()
	 * @generated
	 */
	EReference getKeyManyToOne_Column();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.KeyManyToOne#getAccess <em>Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.KeyManyToOne#getAccess()
	 * @see #getKeyManyToOne()
	 * @generated
	 */
	EAttribute getKeyManyToOne_Access();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.KeyManyToOne#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.KeyManyToOne#getClass_()
	 * @see #getKeyManyToOne()
	 * @generated
	 */
	EAttribute getKeyManyToOne_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.KeyManyToOne#getColumn1 <em>Column1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column1</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.KeyManyToOne#getColumn1()
	 * @see #getKeyManyToOne()
	 * @generated
	 */
	EAttribute getKeyManyToOne_Column1();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.KeyManyToOne#getEntityName <em>Entity Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Entity Name</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.KeyManyToOne#getEntityName()
	 * @see #getKeyManyToOne()
	 * @generated
	 */
	EAttribute getKeyManyToOne_EntityName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.KeyManyToOne#getForeignKey <em>Foreign Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Foreign Key</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.KeyManyToOne#getForeignKey()
	 * @see #getKeyManyToOne()
	 * @generated
	 */
	EAttribute getKeyManyToOne_ForeignKey();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.KeyManyToOne#getLazy <em>Lazy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lazy</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.KeyManyToOne#getLazy()
	 * @see #getKeyManyToOne()
	 * @generated
	 */
	EAttribute getKeyManyToOne_Lazy();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.KeyManyToOne#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.KeyManyToOne#getName()
	 * @see #getKeyManyToOne()
	 * @generated
	 */
	EAttribute getKeyManyToOne_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.db2m.hbm30.KeyProperty <em>Key Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Key Property</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.KeyProperty
	 * @generated
	 */
	EClass getKeyProperty();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.KeyProperty#getMeta <em>Meta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Meta</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.KeyProperty#getMeta()
	 * @see #getKeyProperty()
	 * @generated
	 */
	EReference getKeyProperty_Meta();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.KeyProperty#getColumn <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Column</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.KeyProperty#getColumn()
	 * @see #getKeyProperty()
	 * @generated
	 */
	EReference getKeyProperty_Column();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.db2m.hbm30.KeyProperty#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.KeyProperty#getType()
	 * @see #getKeyProperty()
	 * @generated
	 */
	EReference getKeyProperty_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.KeyProperty#getAccess <em>Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.KeyProperty#getAccess()
	 * @see #getKeyProperty()
	 * @generated
	 */
	EAttribute getKeyProperty_Access();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.KeyProperty#getColumn1 <em>Column1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column1</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.KeyProperty#getColumn1()
	 * @see #getKeyProperty()
	 * @generated
	 */
	EAttribute getKeyProperty_Column1();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.KeyProperty#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.KeyProperty#getLength()
	 * @see #getKeyProperty()
	 * @generated
	 */
	EAttribute getKeyProperty_Length();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.KeyProperty#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.KeyProperty#getName()
	 * @see #getKeyProperty()
	 * @generated
	 */
	EAttribute getKeyProperty_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.KeyProperty#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Node</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.KeyProperty#getNode()
	 * @see #getKeyProperty()
	 * @generated
	 */
	EAttribute getKeyProperty_Node();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.KeyProperty#getType1 <em>Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type1</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.KeyProperty#getType1()
	 * @see #getKeyProperty()
	 * @generated
	 */
	EAttribute getKeyProperty_Type1();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.db2m.hbm30.List <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.List
	 * @generated
	 */
	EClass getList();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.List#getMeta <em>Meta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Meta</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.List#getMeta()
	 * @see #getList()
	 * @generated
	 */
	EReference getList_Meta();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.List#getSubselect <em>Subselect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subselect</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.List#getSubselect()
	 * @see #getList()
	 * @generated
	 */
	EAttribute getList_Subselect();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.db2m.hbm30.List#getCache <em>Cache</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cache</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.List#getCache()
	 * @see #getList()
	 * @generated
	 */
	EReference getList_Cache();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.List#getSynchronize <em>Synchronize</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Synchronize</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.List#getSynchronize()
	 * @see #getList()
	 * @generated
	 */
	EReference getList_Synchronize();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.List#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.List#getComment()
	 * @see #getList()
	 * @generated
	 */
	EAttribute getList_Comment();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.db2m.hbm30.List#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Key</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.List#getKey()
	 * @see #getList()
	 * @generated
	 */
	EReference getList_Key();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.db2m.hbm30.List#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Index</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.List#getIndex()
	 * @see #getList()
	 * @generated
	 */
	EReference getList_Index();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.db2m.hbm30.List#getListIndex <em>List Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>List Index</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.List#getListIndex()
	 * @see #getList()
	 * @generated
	 */
	EReference getList_ListIndex();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.db2m.hbm30.List#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Element</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.List#getElement()
	 * @see #getList()
	 * @generated
	 */
	EReference getList_Element();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.db2m.hbm30.List#getOneToMany <em>One To Many</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>One To Many</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.List#getOneToMany()
	 * @see #getList()
	 * @generated
	 */
	EReference getList_OneToMany();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.db2m.hbm30.List#getManyToMany <em>Many To Many</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Many To Many</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.List#getManyToMany()
	 * @see #getList()
	 * @generated
	 */
	EReference getList_ManyToMany();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.db2m.hbm30.List#getCompositeElement <em>Composite Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Composite Element</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.List#getCompositeElement()
	 * @see #getList()
	 * @generated
	 */
	EReference getList_CompositeElement();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.db2m.hbm30.List#getManyToAny <em>Many To Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Many To Any</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.List#getManyToAny()
	 * @see #getList()
	 * @generated
	 */
	EReference getList_ManyToAny();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.db2m.hbm30.List#getLoader <em>Loader</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Loader</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.List#getLoader()
	 * @see #getList()
	 * @generated
	 */
	EReference getList_Loader();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.db2m.hbm30.List#getSqlInsert <em>Sql Insert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sql Insert</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.List#getSqlInsert()
	 * @see #getList()
	 * @generated
	 */
	EReference getList_SqlInsert();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.db2m.hbm30.List#getSqlUpdate <em>Sql Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sql Update</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.List#getSqlUpdate()
	 * @see #getList()
	 * @generated
	 */
	EReference getList_SqlUpdate();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.db2m.hbm30.List#getSqlDelete <em>Sql Delete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sql Delete</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.List#getSqlDelete()
	 * @see #getList()
	 * @generated
	 */
	EReference getList_SqlDelete();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.db2m.hbm30.List#getSqlDeleteAll <em>Sql Delete All</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sql Delete All</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.List#getSqlDeleteAll()
	 * @see #getList()
	 * @generated
	 */
	EReference getList_SqlDeleteAll();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.List#getFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Filter</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.List#getFilter()
	 * @see #getList()
	 * @generated
	 */
	EReference getList_Filter();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.List#getAccess <em>Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.List#getAccess()
	 * @see #getList()
	 * @generated
	 */
	EAttribute getList_Access();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.List#getBatchSize <em>Batch Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Batch Size</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.List#getBatchSize()
	 * @see #getList()
	 * @generated
	 */
	EAttribute getList_BatchSize();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.List#getCascade <em>Cascade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cascade</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.List#getCascade()
	 * @see #getList()
	 * @generated
	 */
	EAttribute getList_Cascade();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.List#getCatalog <em>Catalog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Catalog</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.List#getCatalog()
	 * @see #getList()
	 * @generated
	 */
	EAttribute getList_Catalog();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.List#getCheck <em>Check</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Check</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.List#getCheck()
	 * @see #getList()
	 * @generated
	 */
	EAttribute getList_Check();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.List#getCollectionType <em>Collection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Collection Type</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.List#getCollectionType()
	 * @see #getList()
	 * @generated
	 */
	EAttribute getList_CollectionType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.List#isEmbedXml <em>Embed Xml</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Embed Xml</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.List#isEmbedXml()
	 * @see #getList()
	 * @generated
	 */
	EAttribute getList_EmbedXml();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.List#getFetch <em>Fetch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fetch</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.List#getFetch()
	 * @see #getList()
	 * @generated
	 */
	EAttribute getList_Fetch();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.List#isInverse <em>Inverse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inverse</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.List#isInverse()
	 * @see #getList()
	 * @generated
	 */
	EAttribute getList_Inverse();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.List#getLazy <em>Lazy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lazy</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.List#getLazy()
	 * @see #getList()
	 * @generated
	 */
	EAttribute getList_Lazy();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.List#isMutable <em>Mutable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mutable</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.List#isMutable()
	 * @see #getList()
	 * @generated
	 */
	EAttribute getList_Mutable();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.List#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.List#getName()
	 * @see #getList()
	 * @generated
	 */
	EAttribute getList_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.List#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Node</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.List#getNode()
	 * @see #getList()
	 * @generated
	 */
	EAttribute getList_Node();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.List#isOptimisticLock <em>Optimistic Lock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Optimistic Lock</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.List#isOptimisticLock()
	 * @see #getList()
	 * @generated
	 */
	EAttribute getList_OptimisticLock();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.List#getOuterJoin <em>Outer Join</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Outer Join</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.List#getOuterJoin()
	 * @see #getList()
	 * @generated
	 */
	EAttribute getList_OuterJoin();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.List#getPersister <em>Persister</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Persister</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.List#getPersister()
	 * @see #getList()
	 * @generated
	 */
	EAttribute getList_Persister();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.List#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schema</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.List#getSchema()
	 * @see #getList()
	 * @generated
	 */
	EAttribute getList_Schema();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.List#getSubselect1 <em>Subselect1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subselect1</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.List#getSubselect1()
	 * @see #getList()
	 * @generated
	 */
	EAttribute getList_Subselect1();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.List#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Table</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.List#getTable()
	 * @see #getList()
	 * @generated
	 */
	EAttribute getList_Table();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.List#getWhere <em>Where</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Where</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.List#getWhere()
	 * @see #getList()
	 * @generated
	 */
	EAttribute getList_Where();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.db2m.hbm30.ListIndex <em>List Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Index</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.ListIndex
	 * @generated
	 */
	EClass getListIndex();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.db2m.hbm30.ListIndex#getColumn <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Column</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.ListIndex#getColumn()
	 * @see #getListIndex()
	 * @generated
	 */
	EReference getListIndex_Column();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.ListIndex#getBase <em>Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.ListIndex#getBase()
	 * @see #getListIndex()
	 * @generated
	 */
	EAttribute getListIndex_Base();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.ListIndex#getColumn1 <em>Column1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column1</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.ListIndex#getColumn1()
	 * @see #getListIndex()
	 * @generated
	 */
	EAttribute getListIndex_Column1();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.db2m.hbm30.LoadCollection <em>Load Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Load Collection</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.LoadCollection
	 * @generated
	 */
	EClass getLoadCollection();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.emf.teneo.db2m.hbm30.LoadCollection#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.LoadCollection#getGroup()
	 * @see #getLoadCollection()
	 * @generated
	 */
	EAttribute getLoadCollection_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.LoadCollection#getReturnProperty <em>Return Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Return Property</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.LoadCollection#getReturnProperty()
	 * @see #getLoadCollection()
	 * @generated
	 */
	EReference getLoadCollection_ReturnProperty();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.LoadCollection#getAlias <em>Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alias</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.LoadCollection#getAlias()
	 * @see #getLoadCollection()
	 * @generated
	 */
	EAttribute getLoadCollection_Alias();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.LoadCollection#getLockMode <em>Lock Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lock Mode</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.LoadCollection#getLockMode()
	 * @see #getLoadCollection()
	 * @generated
	 */
	EAttribute getLoadCollection_LockMode();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.LoadCollection#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.LoadCollection#getRole()
	 * @see #getLoadCollection()
	 * @generated
	 */
	EAttribute getLoadCollection_Role();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.db2m.hbm30.Loader <em>Loader</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Loader</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Loader
	 * @generated
	 */
	EClass getLoader();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Loader#getQueryRef <em>Query Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Query Ref</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Loader#getQueryRef()
	 * @see #getLoader()
	 * @generated
	 */
	EAttribute getLoader_QueryRef();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.db2m.hbm30.ManyToAny <em>Many To Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Many To Any</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.ManyToAny
	 * @generated
	 */
	EClass getManyToAny();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.ManyToAny#getMetaValue <em>Meta Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Meta Value</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.ManyToAny#getMetaValue()
	 * @see #getManyToAny()
	 * @generated
	 */
	EReference getManyToAny_MetaValue();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.db2m.hbm30.ManyToAny#getColumn <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Column</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.ManyToAny#getColumn()
	 * @see #getManyToAny()
	 * @generated
	 */
	EReference getManyToAny_Column();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.ManyToAny#getColumn1 <em>Column1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Column1</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.ManyToAny#getColumn1()
	 * @see #getManyToAny()
	 * @generated
	 */
	EReference getManyToAny_Column1();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.ManyToAny#getIdType <em>Id Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Type</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.ManyToAny#getIdType()
	 * @see #getManyToAny()
	 * @generated
	 */
	EAttribute getManyToAny_IdType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.ManyToAny#getMetaType <em>Meta Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Meta Type</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.ManyToAny#getMetaType()
	 * @see #getManyToAny()
	 * @generated
	 */
	EAttribute getManyToAny_MetaType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.db2m.hbm30.ManyToMany <em>Many To Many</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Many To Many</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.ManyToMany
	 * @generated
	 */
	EClass getManyToMany();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.ManyToMany#getMeta <em>Meta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Meta</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.ManyToMany#getMeta()
	 * @see #getManyToMany()
	 * @generated
	 */
	EReference getManyToMany_Meta();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.emf.teneo.db2m.hbm30.ManyToMany#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.ManyToMany#getGroup()
	 * @see #getManyToMany()
	 * @generated
	 */
	EAttribute getManyToMany_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.ManyToMany#getColumn <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Column</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.ManyToMany#getColumn()
	 * @see #getManyToMany()
	 * @generated
	 */
	EReference getManyToMany_Column();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.emf.teneo.db2m.hbm30.ManyToMany#getFormula <em>Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Formula</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.ManyToMany#getFormula()
	 * @see #getManyToMany()
	 * @generated
	 */
	EAttribute getManyToMany_Formula();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.ManyToMany#getFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Filter</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.ManyToMany#getFilter()
	 * @see #getManyToMany()
	 * @generated
	 */
	EReference getManyToMany_Filter();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.ManyToMany#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.ManyToMany#getClass_()
	 * @see #getManyToMany()
	 * @generated
	 */
	EAttribute getManyToMany_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.ManyToMany#getColumn1 <em>Column1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column1</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.ManyToMany#getColumn1()
	 * @see #getManyToMany()
	 * @generated
	 */
	EAttribute getManyToMany_Column1();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.ManyToMany#isEmbedXml <em>Embed Xml</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Embed Xml</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.ManyToMany#isEmbedXml()
	 * @see #getManyToMany()
	 * @generated
	 */
	EAttribute getManyToMany_EmbedXml();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.ManyToMany#getEntityName <em>Entity Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Entity Name</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.ManyToMany#getEntityName()
	 * @see #getManyToMany()
	 * @generated
	 */
	EAttribute getManyToMany_EntityName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.ManyToMany#getFetch <em>Fetch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fetch</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.ManyToMany#getFetch()
	 * @see #getManyToMany()
	 * @generated
	 */
	EAttribute getManyToMany_Fetch();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.ManyToMany#getForeignKey <em>Foreign Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Foreign Key</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.ManyToMany#getForeignKey()
	 * @see #getManyToMany()
	 * @generated
	 */
	EAttribute getManyToMany_ForeignKey();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.ManyToMany#getFormula1 <em>Formula1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Formula1</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.ManyToMany#getFormula1()
	 * @see #getManyToMany()
	 * @generated
	 */
	EAttribute getManyToMany_Formula1();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.ManyToMany#getLazy <em>Lazy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lazy</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.ManyToMany#getLazy()
	 * @see #getManyToMany()
	 * @generated
	 */
	EAttribute getManyToMany_Lazy();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.ManyToMany#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Node</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.ManyToMany#getNode()
	 * @see #getManyToMany()
	 * @generated
	 */
	EAttribute getManyToMany_Node();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.ManyToMany#getNotFound <em>Not Found</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Not Found</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.ManyToMany#getNotFound()
	 * @see #getManyToMany()
	 * @generated
	 */
	EAttribute getManyToMany_NotFound();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.ManyToMany#getOuterJoin <em>Outer Join</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Outer Join</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.ManyToMany#getOuterJoin()
	 * @see #getManyToMany()
	 * @generated
	 */
	EAttribute getManyToMany_OuterJoin();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.ManyToMany#getPropertyRef <em>Property Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property Ref</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.ManyToMany#getPropertyRef()
	 * @see #getManyToMany()
	 * @generated
	 */
	EAttribute getManyToMany_PropertyRef();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.ManyToMany#isUnique <em>Unique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unique</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.ManyToMany#isUnique()
	 * @see #getManyToMany()
	 * @generated
	 */
	EAttribute getManyToMany_Unique();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.ManyToMany#getWhere <em>Where</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Where</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.ManyToMany#getWhere()
	 * @see #getManyToMany()
	 * @generated
	 */
	EAttribute getManyToMany_Where();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.db2m.hbm30.ManyToOne <em>Many To One</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Many To One</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.ManyToOne
	 * @generated
	 */
	EClass getManyToOne();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.ManyToOne#getMeta <em>Meta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Meta</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.ManyToOne#getMeta()
	 * @see #getManyToOne()
	 * @generated
	 */
	EReference getManyToOne_Meta();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.emf.teneo.db2m.hbm30.ManyToOne#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.ManyToOne#getGroup()
	 * @see #getManyToOne()
	 * @generated
	 */
	EAttribute getManyToOne_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.ManyToOne#getColumn <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Column</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.ManyToOne#getColumn()
	 * @see #getManyToOne()
	 * @generated
	 */
	EReference getManyToOne_Column();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.emf.teneo.db2m.hbm30.ManyToOne#getFormula <em>Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Formula</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.ManyToOne#getFormula()
	 * @see #getManyToOne()
	 * @generated
	 */
	EAttribute getManyToOne_Formula();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.ManyToOne#getAccess <em>Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.ManyToOne#getAccess()
	 * @see #getManyToOne()
	 * @generated
	 */
	EAttribute getManyToOne_Access();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.ManyToOne#getCascade <em>Cascade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cascade</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.ManyToOne#getCascade()
	 * @see #getManyToOne()
	 * @generated
	 */
	EAttribute getManyToOne_Cascade();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.ManyToOne#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.ManyToOne#getClass_()
	 * @see #getManyToOne()
	 * @generated
	 */
	EAttribute getManyToOne_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.ManyToOne#getColumn1 <em>Column1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column1</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.ManyToOne#getColumn1()
	 * @see #getManyToOne()
	 * @generated
	 */
	EAttribute getManyToOne_Column1();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.ManyToOne#isEmbedXml <em>Embed Xml</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Embed Xml</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.ManyToOne#isEmbedXml()
	 * @see #getManyToOne()
	 * @generated
	 */
	EAttribute getManyToOne_EmbedXml();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.ManyToOne#getEntityName <em>Entity Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Entity Name</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.ManyToOne#getEntityName()
	 * @see #getManyToOne()
	 * @generated
	 */
	EAttribute getManyToOne_EntityName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.ManyToOne#getFetch <em>Fetch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fetch</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.ManyToOne#getFetch()
	 * @see #getManyToOne()
	 * @generated
	 */
	EAttribute getManyToOne_Fetch();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.ManyToOne#getForeignKey <em>Foreign Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Foreign Key</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.ManyToOne#getForeignKey()
	 * @see #getManyToOne()
	 * @generated
	 */
	EAttribute getManyToOne_ForeignKey();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.ManyToOne#getFormula1 <em>Formula1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Formula1</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.ManyToOne#getFormula1()
	 * @see #getManyToOne()
	 * @generated
	 */
	EAttribute getManyToOne_Formula1();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.ManyToOne#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.ManyToOne#getIndex()
	 * @see #getManyToOne()
	 * @generated
	 */
	EAttribute getManyToOne_Index();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.ManyToOne#isInsert <em>Insert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Insert</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.ManyToOne#isInsert()
	 * @see #getManyToOne()
	 * @generated
	 */
	EAttribute getManyToOne_Insert();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.ManyToOne#getLazy <em>Lazy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lazy</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.ManyToOne#getLazy()
	 * @see #getManyToOne()
	 * @generated
	 */
	EAttribute getManyToOne_Lazy();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.ManyToOne#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.ManyToOne#getName()
	 * @see #getManyToOne()
	 * @generated
	 */
	EAttribute getManyToOne_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.ManyToOne#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Node</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.ManyToOne#getNode()
	 * @see #getManyToOne()
	 * @generated
	 */
	EAttribute getManyToOne_Node();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.ManyToOne#getNotFound <em>Not Found</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Not Found</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.ManyToOne#getNotFound()
	 * @see #getManyToOne()
	 * @generated
	 */
	EAttribute getManyToOne_NotFound();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.ManyToOne#isNotNull <em>Not Null</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Not Null</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.ManyToOne#isNotNull()
	 * @see #getManyToOne()
	 * @generated
	 */
	EAttribute getManyToOne_NotNull();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.ManyToOne#isOptimisticLock <em>Optimistic Lock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Optimistic Lock</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.ManyToOne#isOptimisticLock()
	 * @see #getManyToOne()
	 * @generated
	 */
	EAttribute getManyToOne_OptimisticLock();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.ManyToOne#getOuterJoin <em>Outer Join</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Outer Join</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.ManyToOne#getOuterJoin()
	 * @see #getManyToOne()
	 * @generated
	 */
	EAttribute getManyToOne_OuterJoin();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.ManyToOne#getPropertyRef <em>Property Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property Ref</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.ManyToOne#getPropertyRef()
	 * @see #getManyToOne()
	 * @generated
	 */
	EAttribute getManyToOne_PropertyRef();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.ManyToOne#isUnique <em>Unique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unique</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.ManyToOne#isUnique()
	 * @see #getManyToOne()
	 * @generated
	 */
	EAttribute getManyToOne_Unique();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.ManyToOne#getUniqueKey <em>Unique Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unique Key</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.ManyToOne#getUniqueKey()
	 * @see #getManyToOne()
	 * @generated
	 */
	EAttribute getManyToOne_UniqueKey();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.ManyToOne#isUpdate <em>Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Update</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.ManyToOne#isUpdate()
	 * @see #getManyToOne()
	 * @generated
	 */
	EAttribute getManyToOne_Update();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.db2m.hbm30.Map <em>Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Map</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Map
	 * @generated
	 */
	EClass getMap();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.Map#getMeta <em>Meta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Meta</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Map#getMeta()
	 * @see #getMap()
	 * @generated
	 */
	EReference getMap_Meta();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Map#getSubselect <em>Subselect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subselect</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Map#getSubselect()
	 * @see #getMap()
	 * @generated
	 */
	EAttribute getMap_Subselect();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.db2m.hbm30.Map#getCache <em>Cache</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cache</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Map#getCache()
	 * @see #getMap()
	 * @generated
	 */
	EReference getMap_Cache();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.Map#getSynchronize <em>Synchronize</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Synchronize</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Map#getSynchronize()
	 * @see #getMap()
	 * @generated
	 */
	EReference getMap_Synchronize();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Map#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Map#getComment()
	 * @see #getMap()
	 * @generated
	 */
	EAttribute getMap_Comment();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.db2m.hbm30.Map#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Key</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Map#getKey()
	 * @see #getMap()
	 * @generated
	 */
	EReference getMap_Key();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.db2m.hbm30.Map#getMapKey <em>Map Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Map Key</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Map#getMapKey()
	 * @see #getMap()
	 * @generated
	 */
	EReference getMap_MapKey();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.db2m.hbm30.Map#getCompositeMapKey <em>Composite Map Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Composite Map Key</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Map#getCompositeMapKey()
	 * @see #getMap()
	 * @generated
	 */
	EReference getMap_CompositeMapKey();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.db2m.hbm30.Map#getMapKeyManyToMany <em>Map Key Many To Many</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Map Key Many To Many</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Map#getMapKeyManyToMany()
	 * @see #getMap()
	 * @generated
	 */
	EReference getMap_MapKeyManyToMany();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.db2m.hbm30.Map#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Index</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Map#getIndex()
	 * @see #getMap()
	 * @generated
	 */
	EReference getMap_Index();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.db2m.hbm30.Map#getCompositeIndex <em>Composite Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Composite Index</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Map#getCompositeIndex()
	 * @see #getMap()
	 * @generated
	 */
	EReference getMap_CompositeIndex();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.db2m.hbm30.Map#getIndexManyToMany <em>Index Many To Many</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Index Many To Many</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Map#getIndexManyToMany()
	 * @see #getMap()
	 * @generated
	 */
	EReference getMap_IndexManyToMany();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.db2m.hbm30.Map#getIndexManyToAny <em>Index Many To Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Index Many To Any</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Map#getIndexManyToAny()
	 * @see #getMap()
	 * @generated
	 */
	EReference getMap_IndexManyToAny();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.db2m.hbm30.Map#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Element</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Map#getElement()
	 * @see #getMap()
	 * @generated
	 */
	EReference getMap_Element();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.db2m.hbm30.Map#getOneToMany <em>One To Many</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>One To Many</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Map#getOneToMany()
	 * @see #getMap()
	 * @generated
	 */
	EReference getMap_OneToMany();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.db2m.hbm30.Map#getManyToMany <em>Many To Many</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Many To Many</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Map#getManyToMany()
	 * @see #getMap()
	 * @generated
	 */
	EReference getMap_ManyToMany();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.db2m.hbm30.Map#getCompositeElement <em>Composite Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Composite Element</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Map#getCompositeElement()
	 * @see #getMap()
	 * @generated
	 */
	EReference getMap_CompositeElement();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.db2m.hbm30.Map#getManyToAny <em>Many To Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Many To Any</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Map#getManyToAny()
	 * @see #getMap()
	 * @generated
	 */
	EReference getMap_ManyToAny();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.db2m.hbm30.Map#getLoader <em>Loader</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Loader</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Map#getLoader()
	 * @see #getMap()
	 * @generated
	 */
	EReference getMap_Loader();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.db2m.hbm30.Map#getSqlInsert <em>Sql Insert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sql Insert</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Map#getSqlInsert()
	 * @see #getMap()
	 * @generated
	 */
	EReference getMap_SqlInsert();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.db2m.hbm30.Map#getSqlUpdate <em>Sql Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sql Update</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Map#getSqlUpdate()
	 * @see #getMap()
	 * @generated
	 */
	EReference getMap_SqlUpdate();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.db2m.hbm30.Map#getSqlDelete <em>Sql Delete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sql Delete</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Map#getSqlDelete()
	 * @see #getMap()
	 * @generated
	 */
	EReference getMap_SqlDelete();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.db2m.hbm30.Map#getSqlDeleteAll <em>Sql Delete All</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sql Delete All</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Map#getSqlDeleteAll()
	 * @see #getMap()
	 * @generated
	 */
	EReference getMap_SqlDeleteAll();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.Map#getFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Filter</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Map#getFilter()
	 * @see #getMap()
	 * @generated
	 */
	EReference getMap_Filter();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Map#getAccess <em>Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Map#getAccess()
	 * @see #getMap()
	 * @generated
	 */
	EAttribute getMap_Access();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Map#getBatchSize <em>Batch Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Batch Size</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Map#getBatchSize()
	 * @see #getMap()
	 * @generated
	 */
	EAttribute getMap_BatchSize();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Map#getCascade <em>Cascade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cascade</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Map#getCascade()
	 * @see #getMap()
	 * @generated
	 */
	EAttribute getMap_Cascade();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Map#getCatalog <em>Catalog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Catalog</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Map#getCatalog()
	 * @see #getMap()
	 * @generated
	 */
	EAttribute getMap_Catalog();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Map#getCheck <em>Check</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Check</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Map#getCheck()
	 * @see #getMap()
	 * @generated
	 */
	EAttribute getMap_Check();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Map#getCollectionType <em>Collection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Collection Type</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Map#getCollectionType()
	 * @see #getMap()
	 * @generated
	 */
	EAttribute getMap_CollectionType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Map#isEmbedXml <em>Embed Xml</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Embed Xml</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Map#isEmbedXml()
	 * @see #getMap()
	 * @generated
	 */
	EAttribute getMap_EmbedXml();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Map#getFetch <em>Fetch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fetch</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Map#getFetch()
	 * @see #getMap()
	 * @generated
	 */
	EAttribute getMap_Fetch();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Map#isInverse <em>Inverse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inverse</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Map#isInverse()
	 * @see #getMap()
	 * @generated
	 */
	EAttribute getMap_Inverse();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Map#getLazy <em>Lazy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lazy</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Map#getLazy()
	 * @see #getMap()
	 * @generated
	 */
	EAttribute getMap_Lazy();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Map#isMutable <em>Mutable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mutable</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Map#isMutable()
	 * @see #getMap()
	 * @generated
	 */
	EAttribute getMap_Mutable();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Map#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Map#getName()
	 * @see #getMap()
	 * @generated
	 */
	EAttribute getMap_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Map#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Node</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Map#getNode()
	 * @see #getMap()
	 * @generated
	 */
	EAttribute getMap_Node();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Map#isOptimisticLock <em>Optimistic Lock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Optimistic Lock</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Map#isOptimisticLock()
	 * @see #getMap()
	 * @generated
	 */
	EAttribute getMap_OptimisticLock();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Map#getOrderBy <em>Order By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order By</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Map#getOrderBy()
	 * @see #getMap()
	 * @generated
	 */
	EAttribute getMap_OrderBy();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Map#getOuterJoin <em>Outer Join</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Outer Join</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Map#getOuterJoin()
	 * @see #getMap()
	 * @generated
	 */
	EAttribute getMap_OuterJoin();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Map#getPersister <em>Persister</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Persister</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Map#getPersister()
	 * @see #getMap()
	 * @generated
	 */
	EAttribute getMap_Persister();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Map#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schema</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Map#getSchema()
	 * @see #getMap()
	 * @generated
	 */
	EAttribute getMap_Schema();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Map#getSort <em>Sort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sort</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Map#getSort()
	 * @see #getMap()
	 * @generated
	 */
	EAttribute getMap_Sort();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Map#getSubselect1 <em>Subselect1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subselect1</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Map#getSubselect1()
	 * @see #getMap()
	 * @generated
	 */
	EAttribute getMap_Subselect1();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Map#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Table</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Map#getTable()
	 * @see #getMap()
	 * @generated
	 */
	EAttribute getMap_Table();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Map#getWhere <em>Where</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Where</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Map#getWhere()
	 * @see #getMap()
	 * @generated
	 */
	EAttribute getMap_Where();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.db2m.hbm30.MapKey <em>Map Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Map Key</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.MapKey
	 * @generated
	 */
	EClass getMapKey();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.emf.teneo.db2m.hbm30.MapKey#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.MapKey#getGroup()
	 * @see #getMapKey()
	 * @generated
	 */
	EAttribute getMapKey_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.MapKey#getColumn <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Column</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.MapKey#getColumn()
	 * @see #getMapKey()
	 * @generated
	 */
	EReference getMapKey_Column();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.emf.teneo.db2m.hbm30.MapKey#getFormula <em>Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Formula</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.MapKey#getFormula()
	 * @see #getMapKey()
	 * @generated
	 */
	EAttribute getMapKey_Formula();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.MapKey#getColumn1 <em>Column1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column1</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.MapKey#getColumn1()
	 * @see #getMapKey()
	 * @generated
	 */
	EAttribute getMapKey_Column1();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.MapKey#getFormula1 <em>Formula1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Formula1</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.MapKey#getFormula1()
	 * @see #getMapKey()
	 * @generated
	 */
	EAttribute getMapKey_Formula1();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.MapKey#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.MapKey#getLength()
	 * @see #getMapKey()
	 * @generated
	 */
	EAttribute getMapKey_Length();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.MapKey#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Node</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.MapKey#getNode()
	 * @see #getMapKey()
	 * @generated
	 */
	EAttribute getMapKey_Node();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.MapKey#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.MapKey#getType()
	 * @see #getMapKey()
	 * @generated
	 */
	EAttribute getMapKey_Type();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.db2m.hbm30.MapKeyManyToMany <em>Map Key Many To Many</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Map Key Many To Many</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.MapKeyManyToMany
	 * @generated
	 */
	EClass getMapKeyManyToMany();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.emf.teneo.db2m.hbm30.MapKeyManyToMany#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.MapKeyManyToMany#getGroup()
	 * @see #getMapKeyManyToMany()
	 * @generated
	 */
	EAttribute getMapKeyManyToMany_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.MapKeyManyToMany#getColumn <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Column</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.MapKeyManyToMany#getColumn()
	 * @see #getMapKeyManyToMany()
	 * @generated
	 */
	EReference getMapKeyManyToMany_Column();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.emf.teneo.db2m.hbm30.MapKeyManyToMany#getFormula <em>Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Formula</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.MapKeyManyToMany#getFormula()
	 * @see #getMapKeyManyToMany()
	 * @generated
	 */
	EAttribute getMapKeyManyToMany_Formula();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.MapKeyManyToMany#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.MapKeyManyToMany#getClass_()
	 * @see #getMapKeyManyToMany()
	 * @generated
	 */
	EAttribute getMapKeyManyToMany_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.MapKeyManyToMany#getColumn1 <em>Column1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column1</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.MapKeyManyToMany#getColumn1()
	 * @see #getMapKeyManyToMany()
	 * @generated
	 */
	EAttribute getMapKeyManyToMany_Column1();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.MapKeyManyToMany#getEntityName <em>Entity Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Entity Name</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.MapKeyManyToMany#getEntityName()
	 * @see #getMapKeyManyToMany()
	 * @generated
	 */
	EAttribute getMapKeyManyToMany_EntityName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.MapKeyManyToMany#getForeignKey <em>Foreign Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Foreign Key</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.MapKeyManyToMany#getForeignKey()
	 * @see #getMapKeyManyToMany()
	 * @generated
	 */
	EAttribute getMapKeyManyToMany_ForeignKey();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.MapKeyManyToMany#getFormula1 <em>Formula1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Formula1</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.MapKeyManyToMany#getFormula1()
	 * @see #getMapKeyManyToMany()
	 * @generated
	 */
	EAttribute getMapKeyManyToMany_Formula1();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.db2m.hbm30.Meta <em>Meta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Meta</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Meta
	 * @generated
	 */
	EClass getMeta();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Meta#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Meta#getValue()
	 * @see #getMeta()
	 * @generated
	 */
	EAttribute getMeta_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Meta#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attribute</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Meta#getAttribute()
	 * @see #getMeta()
	 * @generated
	 */
	EAttribute getMeta_Attribute();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Meta#isInherit <em>Inherit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inherit</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Meta#isInherit()
	 * @see #getMeta()
	 * @generated
	 */
	EAttribute getMeta_Inherit();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.db2m.hbm30.MetaValue <em>Meta Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Meta Value</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.MetaValue
	 * @generated
	 */
	EClass getMetaValue();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.MetaValue#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.MetaValue#getClass_()
	 * @see #getMetaValue()
	 * @generated
	 */
	EAttribute getMetaValue_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.MetaValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.MetaValue#getValue()
	 * @see #getMetaValue()
	 * @generated
	 */
	EAttribute getMetaValue_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.db2m.hbm30.NaturalId <em>Natural Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Natural Id</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.NaturalId
	 * @generated
	 */
	EClass getNaturalId();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.emf.teneo.db2m.hbm30.NaturalId#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.NaturalId#getGroup()
	 * @see #getNaturalId()
	 * @generated
	 */
	EAttribute getNaturalId_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.NaturalId#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.NaturalId#getProperty()
	 * @see #getNaturalId()
	 * @generated
	 */
	EReference getNaturalId_Property();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.NaturalId#getManyToOne <em>Many To One</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Many To One</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.NaturalId#getManyToOne()
	 * @see #getNaturalId()
	 * @generated
	 */
	EReference getNaturalId_ManyToOne();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.NaturalId#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Component</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.NaturalId#getComponent()
	 * @see #getNaturalId()
	 * @generated
	 */
	EReference getNaturalId_Component();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.NaturalId#getDynamicComponent <em>Dynamic Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dynamic Component</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.NaturalId#getDynamicComponent()
	 * @see #getNaturalId()
	 * @generated
	 */
	EReference getNaturalId_DynamicComponent();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.NaturalId#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Any</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.NaturalId#getAny()
	 * @see #getNaturalId()
	 * @generated
	 */
	EReference getNaturalId_Any();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.NaturalId#isMutable <em>Mutable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mutable</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.NaturalId#isMutable()
	 * @see #getNaturalId()
	 * @generated
	 */
	EAttribute getNaturalId_Mutable();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.db2m.hbm30.NestedCompositeElement <em>Nested Composite Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nested Composite Element</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.NestedCompositeElement
	 * @generated
	 */
	EClass getNestedCompositeElement();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.db2m.hbm30.NestedCompositeElement#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Parent</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.NestedCompositeElement#getParent()
	 * @see #getNestedCompositeElement()
	 * @generated
	 */
	EReference getNestedCompositeElement_Parent();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.emf.teneo.db2m.hbm30.NestedCompositeElement#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.NestedCompositeElement#getGroup()
	 * @see #getNestedCompositeElement()
	 * @generated
	 */
	EAttribute getNestedCompositeElement_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.NestedCompositeElement#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.NestedCompositeElement#getProperty()
	 * @see #getNestedCompositeElement()
	 * @generated
	 */
	EReference getNestedCompositeElement_Property();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.NestedCompositeElement#getManyToOne <em>Many To One</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Many To One</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.NestedCompositeElement#getManyToOne()
	 * @see #getNestedCompositeElement()
	 * @generated
	 */
	EReference getNestedCompositeElement_ManyToOne();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.NestedCompositeElement#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Any</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.NestedCompositeElement#getAny()
	 * @see #getNestedCompositeElement()
	 * @generated
	 */
	EReference getNestedCompositeElement_Any();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.NestedCompositeElement#getNestedCompositeElement <em>Nested Composite Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nested Composite Element</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.NestedCompositeElement#getNestedCompositeElement()
	 * @see #getNestedCompositeElement()
	 * @generated
	 */
	EReference getNestedCompositeElement_NestedCompositeElement();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.NestedCompositeElement#getAccess <em>Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.NestedCompositeElement#getAccess()
	 * @see #getNestedCompositeElement()
	 * @generated
	 */
	EAttribute getNestedCompositeElement_Access();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.NestedCompositeElement#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.NestedCompositeElement#getClass_()
	 * @see #getNestedCompositeElement()
	 * @generated
	 */
	EAttribute getNestedCompositeElement_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.NestedCompositeElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.NestedCompositeElement#getName()
	 * @see #getNestedCompositeElement()
	 * @generated
	 */
	EAttribute getNestedCompositeElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.NestedCompositeElement#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Node</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.NestedCompositeElement#getNode()
	 * @see #getNestedCompositeElement()
	 * @generated
	 */
	EAttribute getNestedCompositeElement_Node();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.db2m.hbm30.OneToMany <em>One To Many</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>One To Many</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.OneToMany
	 * @generated
	 */
	EClass getOneToMany();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.OneToMany#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.OneToMany#getClass_()
	 * @see #getOneToMany()
	 * @generated
	 */
	EAttribute getOneToMany_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.OneToMany#isEmbedXml <em>Embed Xml</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Embed Xml</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.OneToMany#isEmbedXml()
	 * @see #getOneToMany()
	 * @generated
	 */
	EAttribute getOneToMany_EmbedXml();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.OneToMany#getEntityName <em>Entity Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Entity Name</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.OneToMany#getEntityName()
	 * @see #getOneToMany()
	 * @generated
	 */
	EAttribute getOneToMany_EntityName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.OneToMany#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Node</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.OneToMany#getNode()
	 * @see #getOneToMany()
	 * @generated
	 */
	EAttribute getOneToMany_Node();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.OneToMany#getNotFound <em>Not Found</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Not Found</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.OneToMany#getNotFound()
	 * @see #getOneToMany()
	 * @generated
	 */
	EAttribute getOneToMany_NotFound();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.db2m.hbm30.OneToOne <em>One To One</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>One To One</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.OneToOne
	 * @generated
	 */
	EClass getOneToOne();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.OneToOne#getMeta <em>Meta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Meta</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.OneToOne#getMeta()
	 * @see #getOneToOne()
	 * @generated
	 */
	EReference getOneToOne_Meta();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.emf.teneo.db2m.hbm30.OneToOne#getFormula <em>Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Formula</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.OneToOne#getFormula()
	 * @see #getOneToOne()
	 * @generated
	 */
	EAttribute getOneToOne_Formula();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.OneToOne#getAccess <em>Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.OneToOne#getAccess()
	 * @see #getOneToOne()
	 * @generated
	 */
	EAttribute getOneToOne_Access();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.OneToOne#getCascade <em>Cascade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cascade</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.OneToOne#getCascade()
	 * @see #getOneToOne()
	 * @generated
	 */
	EAttribute getOneToOne_Cascade();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.OneToOne#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.OneToOne#getClass_()
	 * @see #getOneToOne()
	 * @generated
	 */
	EAttribute getOneToOne_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.OneToOne#isConstrained <em>Constrained</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constrained</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.OneToOne#isConstrained()
	 * @see #getOneToOne()
	 * @generated
	 */
	EAttribute getOneToOne_Constrained();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.OneToOne#isEmbedXml <em>Embed Xml</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Embed Xml</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.OneToOne#isEmbedXml()
	 * @see #getOneToOne()
	 * @generated
	 */
	EAttribute getOneToOne_EmbedXml();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.OneToOne#getEntityName <em>Entity Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Entity Name</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.OneToOne#getEntityName()
	 * @see #getOneToOne()
	 * @generated
	 */
	EAttribute getOneToOne_EntityName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.OneToOne#getFetch <em>Fetch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fetch</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.OneToOne#getFetch()
	 * @see #getOneToOne()
	 * @generated
	 */
	EAttribute getOneToOne_Fetch();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.OneToOne#getForeignKey <em>Foreign Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Foreign Key</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.OneToOne#getForeignKey()
	 * @see #getOneToOne()
	 * @generated
	 */
	EAttribute getOneToOne_ForeignKey();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.OneToOne#getFormula1 <em>Formula1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Formula1</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.OneToOne#getFormula1()
	 * @see #getOneToOne()
	 * @generated
	 */
	EAttribute getOneToOne_Formula1();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.OneToOne#getLazy <em>Lazy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lazy</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.OneToOne#getLazy()
	 * @see #getOneToOne()
	 * @generated
	 */
	EAttribute getOneToOne_Lazy();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.OneToOne#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.OneToOne#getName()
	 * @see #getOneToOne()
	 * @generated
	 */
	EAttribute getOneToOne_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.OneToOne#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Node</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.OneToOne#getNode()
	 * @see #getOneToOne()
	 * @generated
	 */
	EAttribute getOneToOne_Node();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.OneToOne#getOuterJoin <em>Outer Join</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Outer Join</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.OneToOne#getOuterJoin()
	 * @see #getOneToOne()
	 * @generated
	 */
	EAttribute getOneToOne_OuterJoin();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.OneToOne#getPropertyRef <em>Property Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property Ref</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.OneToOne#getPropertyRef()
	 * @see #getOneToOne()
	 * @generated
	 */
	EAttribute getOneToOne_PropertyRef();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.db2m.hbm30.Param <em>Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Param</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Param
	 * @generated
	 */
	EClass getParam();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Param#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Param#getValue()
	 * @see #getParam()
	 * @generated
	 */
	EAttribute getParam_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Param#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Param#getName()
	 * @see #getParam()
	 * @generated
	 */
	EAttribute getParam_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.db2m.hbm30.Parent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parent</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Parent
	 * @generated
	 */
	EClass getParent();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Parent#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Parent#getName()
	 * @see #getParent()
	 * @generated
	 */
	EAttribute getParent_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.db2m.hbm30.PrimitiveArray <em>Primitive Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Array</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.PrimitiveArray
	 * @generated
	 */
	EClass getPrimitiveArray();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.PrimitiveArray#getMeta <em>Meta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Meta</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.PrimitiveArray#getMeta()
	 * @see #getPrimitiveArray()
	 * @generated
	 */
	EReference getPrimitiveArray_Meta();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.PrimitiveArray#getSubselect <em>Subselect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subselect</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.PrimitiveArray#getSubselect()
	 * @see #getPrimitiveArray()
	 * @generated
	 */
	EAttribute getPrimitiveArray_Subselect();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.db2m.hbm30.PrimitiveArray#getCache <em>Cache</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cache</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.PrimitiveArray#getCache()
	 * @see #getPrimitiveArray()
	 * @generated
	 */
	EReference getPrimitiveArray_Cache();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.PrimitiveArray#getSynchronize <em>Synchronize</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Synchronize</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.PrimitiveArray#getSynchronize()
	 * @see #getPrimitiveArray()
	 * @generated
	 */
	EReference getPrimitiveArray_Synchronize();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.PrimitiveArray#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.PrimitiveArray#getComment()
	 * @see #getPrimitiveArray()
	 * @generated
	 */
	EAttribute getPrimitiveArray_Comment();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.db2m.hbm30.PrimitiveArray#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Key</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.PrimitiveArray#getKey()
	 * @see #getPrimitiveArray()
	 * @generated
	 */
	EReference getPrimitiveArray_Key();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.db2m.hbm30.PrimitiveArray#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Index</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.PrimitiveArray#getIndex()
	 * @see #getPrimitiveArray()
	 * @generated
	 */
	EReference getPrimitiveArray_Index();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.db2m.hbm30.PrimitiveArray#getListIndex <em>List Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>List Index</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.PrimitiveArray#getListIndex()
	 * @see #getPrimitiveArray()
	 * @generated
	 */
	EReference getPrimitiveArray_ListIndex();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.db2m.hbm30.PrimitiveArray#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Element</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.PrimitiveArray#getElement()
	 * @see #getPrimitiveArray()
	 * @generated
	 */
	EReference getPrimitiveArray_Element();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.db2m.hbm30.PrimitiveArray#getLoader <em>Loader</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Loader</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.PrimitiveArray#getLoader()
	 * @see #getPrimitiveArray()
	 * @generated
	 */
	EReference getPrimitiveArray_Loader();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.db2m.hbm30.PrimitiveArray#getSqlInsert <em>Sql Insert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sql Insert</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.PrimitiveArray#getSqlInsert()
	 * @see #getPrimitiveArray()
	 * @generated
	 */
	EReference getPrimitiveArray_SqlInsert();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.db2m.hbm30.PrimitiveArray#getSqlUpdate <em>Sql Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sql Update</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.PrimitiveArray#getSqlUpdate()
	 * @see #getPrimitiveArray()
	 * @generated
	 */
	EReference getPrimitiveArray_SqlUpdate();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.db2m.hbm30.PrimitiveArray#getSqlDelete <em>Sql Delete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sql Delete</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.PrimitiveArray#getSqlDelete()
	 * @see #getPrimitiveArray()
	 * @generated
	 */
	EReference getPrimitiveArray_SqlDelete();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.db2m.hbm30.PrimitiveArray#getSqlDeleteAll <em>Sql Delete All</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sql Delete All</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.PrimitiveArray#getSqlDeleteAll()
	 * @see #getPrimitiveArray()
	 * @generated
	 */
	EReference getPrimitiveArray_SqlDeleteAll();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.PrimitiveArray#getAccess <em>Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.PrimitiveArray#getAccess()
	 * @see #getPrimitiveArray()
	 * @generated
	 */
	EAttribute getPrimitiveArray_Access();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.PrimitiveArray#getBatchSize <em>Batch Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Batch Size</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.PrimitiveArray#getBatchSize()
	 * @see #getPrimitiveArray()
	 * @generated
	 */
	EAttribute getPrimitiveArray_BatchSize();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.PrimitiveArray#getCatalog <em>Catalog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Catalog</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.PrimitiveArray#getCatalog()
	 * @see #getPrimitiveArray()
	 * @generated
	 */
	EAttribute getPrimitiveArray_Catalog();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.PrimitiveArray#getCheck <em>Check</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Check</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.PrimitiveArray#getCheck()
	 * @see #getPrimitiveArray()
	 * @generated
	 */
	EAttribute getPrimitiveArray_Check();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.PrimitiveArray#getCollectionType <em>Collection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Collection Type</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.PrimitiveArray#getCollectionType()
	 * @see #getPrimitiveArray()
	 * @generated
	 */
	EAttribute getPrimitiveArray_CollectionType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.PrimitiveArray#isEmbedXml <em>Embed Xml</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Embed Xml</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.PrimitiveArray#isEmbedXml()
	 * @see #getPrimitiveArray()
	 * @generated
	 */
	EAttribute getPrimitiveArray_EmbedXml();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.PrimitiveArray#getFetch <em>Fetch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fetch</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.PrimitiveArray#getFetch()
	 * @see #getPrimitiveArray()
	 * @generated
	 */
	EAttribute getPrimitiveArray_Fetch();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.PrimitiveArray#isMutable <em>Mutable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mutable</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.PrimitiveArray#isMutable()
	 * @see #getPrimitiveArray()
	 * @generated
	 */
	EAttribute getPrimitiveArray_Mutable();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.PrimitiveArray#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.PrimitiveArray#getName()
	 * @see #getPrimitiveArray()
	 * @generated
	 */
	EAttribute getPrimitiveArray_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.PrimitiveArray#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Node</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.PrimitiveArray#getNode()
	 * @see #getPrimitiveArray()
	 * @generated
	 */
	EAttribute getPrimitiveArray_Node();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.PrimitiveArray#isOptimisticLock <em>Optimistic Lock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Optimistic Lock</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.PrimitiveArray#isOptimisticLock()
	 * @see #getPrimitiveArray()
	 * @generated
	 */
	EAttribute getPrimitiveArray_OptimisticLock();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.PrimitiveArray#getOuterJoin <em>Outer Join</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Outer Join</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.PrimitiveArray#getOuterJoin()
	 * @see #getPrimitiveArray()
	 * @generated
	 */
	EAttribute getPrimitiveArray_OuterJoin();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.PrimitiveArray#getPersister <em>Persister</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Persister</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.PrimitiveArray#getPersister()
	 * @see #getPrimitiveArray()
	 * @generated
	 */
	EAttribute getPrimitiveArray_Persister();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.PrimitiveArray#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schema</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.PrimitiveArray#getSchema()
	 * @see #getPrimitiveArray()
	 * @generated
	 */
	EAttribute getPrimitiveArray_Schema();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.PrimitiveArray#getSubselect1 <em>Subselect1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subselect1</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.PrimitiveArray#getSubselect1()
	 * @see #getPrimitiveArray()
	 * @generated
	 */
	EAttribute getPrimitiveArray_Subselect1();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.PrimitiveArray#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Table</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.PrimitiveArray#getTable()
	 * @see #getPrimitiveArray()
	 * @generated
	 */
	EAttribute getPrimitiveArray_Table();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.PrimitiveArray#getWhere <em>Where</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Where</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.PrimitiveArray#getWhere()
	 * @see #getPrimitiveArray()
	 * @generated
	 */
	EAttribute getPrimitiveArray_Where();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.db2m.hbm30.Properties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Properties</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Properties
	 * @generated
	 */
	EClass getProperties();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.emf.teneo.db2m.hbm30.Properties#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Properties#getGroup()
	 * @see #getProperties()
	 * @generated
	 */
	EAttribute getProperties_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.Properties#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Properties#getProperty()
	 * @see #getProperties()
	 * @generated
	 */
	EReference getProperties_Property();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.Properties#getManyToOne <em>Many To One</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Many To One</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Properties#getManyToOne()
	 * @see #getProperties()
	 * @generated
	 */
	EReference getProperties_ManyToOne();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.Properties#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Component</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Properties#getComponent()
	 * @see #getProperties()
	 * @generated
	 */
	EReference getProperties_Component();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.Properties#getDynamicComponent <em>Dynamic Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dynamic Component</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Properties#getDynamicComponent()
	 * @see #getProperties()
	 * @generated
	 */
	EReference getProperties_DynamicComponent();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Properties#isInsert <em>Insert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Insert</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Properties#isInsert()
	 * @see #getProperties()
	 * @generated
	 */
	EAttribute getProperties_Insert();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Properties#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Properties#getName()
	 * @see #getProperties()
	 * @generated
	 */
	EAttribute getProperties_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Properties#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Node</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Properties#getNode()
	 * @see #getProperties()
	 * @generated
	 */
	EAttribute getProperties_Node();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Properties#isOptimisticLock <em>Optimistic Lock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Optimistic Lock</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Properties#isOptimisticLock()
	 * @see #getProperties()
	 * @generated
	 */
	EAttribute getProperties_OptimisticLock();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Properties#isUnique <em>Unique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unique</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Properties#isUnique()
	 * @see #getProperties()
	 * @generated
	 */
	EAttribute getProperties_Unique();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Properties#isUpdate <em>Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Update</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Properties#isUpdate()
	 * @see #getProperties()
	 * @generated
	 */
	EAttribute getProperties_Update();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.db2m.hbm30.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Property
	 * @generated
	 */
	EClass getProperty();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.Property#getMeta <em>Meta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Meta</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Property#getMeta()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_Meta();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.emf.teneo.db2m.hbm30.Property#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Property#getGroup()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.Property#getColumn <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Column</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Property#getColumn()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_Column();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.emf.teneo.db2m.hbm30.Property#getFormula <em>Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Formula</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Property#getFormula()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Formula();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.db2m.hbm30.Property#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Property#getType()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Property#getAccess <em>Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Property#getAccess()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Access();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Property#getColumn1 <em>Column1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column1</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Property#getColumn1()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Column1();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Property#getFormula1 <em>Formula1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Formula1</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Property#getFormula1()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Formula1();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Property#getGenerated <em>Generated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Property#getGenerated()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Generated();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Property#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Property#getIndex()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Index();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Property#isInsert <em>Insert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Insert</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Property#isInsert()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Insert();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Property#isLazy <em>Lazy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lazy</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Property#isLazy()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Lazy();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Property#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Property#getLength()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Length();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Property#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Property#getName()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Property#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Node</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Property#getNode()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Node();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Property#isNotNull <em>Not Null</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Not Null</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Property#isNotNull()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_NotNull();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Property#isOptimisticLock <em>Optimistic Lock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Optimistic Lock</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Property#isOptimisticLock()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_OptimisticLock();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Property#getPrecision <em>Precision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Precision</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Property#getPrecision()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Precision();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Property#getScale <em>Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scale</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Property#getScale()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Scale();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Property#getType1 <em>Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type1</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Property#getType1()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Type1();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Property#isUnique <em>Unique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unique</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Property#isUnique()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Unique();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Property#getUniqueKey <em>Unique Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unique Key</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Property#getUniqueKey()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_UniqueKey();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Property#isUpdate <em>Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Update</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Property#isUpdate()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Update();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.db2m.hbm30.Query <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Query</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Query
	 * @generated
	 */
	EClass getQuery();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.emf.teneo.db2m.hbm30.Query#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Query#getMixed()
	 * @see #getQuery()
	 * @generated
	 */
	EAttribute getQuery_Mixed();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.emf.teneo.db2m.hbm30.Query#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Query#getGroup()
	 * @see #getQuery()
	 * @generated
	 */
	EAttribute getQuery_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.Query#getQueryParam <em>Query Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Query Param</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Query#getQueryParam()
	 * @see #getQuery()
	 * @generated
	 */
	EReference getQuery_QueryParam();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Query#isCacheable <em>Cacheable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cacheable</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Query#isCacheable()
	 * @see #getQuery()
	 * @generated
	 */
	EAttribute getQuery_Cacheable();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Query#getCacheMode <em>Cache Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cache Mode</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Query#getCacheMode()
	 * @see #getQuery()
	 * @generated
	 */
	EAttribute getQuery_CacheMode();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Query#getCacheRegion <em>Cache Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cache Region</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Query#getCacheRegion()
	 * @see #getQuery()
	 * @generated
	 */
	EAttribute getQuery_CacheRegion();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Query#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Query#getComment()
	 * @see #getQuery()
	 * @generated
	 */
	EAttribute getQuery_Comment();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Query#getFetchSize <em>Fetch Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fetch Size</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Query#getFetchSize()
	 * @see #getQuery()
	 * @generated
	 */
	EAttribute getQuery_FetchSize();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Query#getFlushMode <em>Flush Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Flush Mode</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Query#getFlushMode()
	 * @see #getQuery()
	 * @generated
	 */
	EAttribute getQuery_FlushMode();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Query#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Query#getName()
	 * @see #getQuery()
	 * @generated
	 */
	EAttribute getQuery_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Query#isReadOnly <em>Read Only</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Read Only</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Query#isReadOnly()
	 * @see #getQuery()
	 * @generated
	 */
	EAttribute getQuery_ReadOnly();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Query#getTimeout <em>Timeout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timeout</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Query#getTimeout()
	 * @see #getQuery()
	 * @generated
	 */
	EAttribute getQuery_Timeout();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.db2m.hbm30.QueryParam <em>Query Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Query Param</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.QueryParam
	 * @generated
	 */
	EClass getQueryParam();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.QueryParam#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.QueryParam#getName()
	 * @see #getQueryParam()
	 * @generated
	 */
	EAttribute getQueryParam_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.QueryParam#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.QueryParam#getType()
	 * @see #getQueryParam()
	 * @generated
	 */
	EAttribute getQueryParam_Type();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.db2m.hbm30.Resultset <em>Resultset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resultset</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Resultset
	 * @generated
	 */
	EClass getResultset();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.emf.teneo.db2m.hbm30.Resultset#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Resultset#getGroup()
	 * @see #getResultset()
	 * @generated
	 */
	EAttribute getResultset_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.Resultset#getReturnScalar <em>Return Scalar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Return Scalar</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Resultset#getReturnScalar()
	 * @see #getResultset()
	 * @generated
	 */
	EReference getResultset_ReturnScalar();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.Resultset#getReturn <em>Return</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Return</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Resultset#getReturn()
	 * @see #getResultset()
	 * @generated
	 */
	EReference getResultset_Return();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.Resultset#getReturnJoin <em>Return Join</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Return Join</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Resultset#getReturnJoin()
	 * @see #getResultset()
	 * @generated
	 */
	EReference getResultset_ReturnJoin();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.Resultset#getLoadCollection <em>Load Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Load Collection</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Resultset#getLoadCollection()
	 * @see #getResultset()
	 * @generated
	 */
	EReference getResultset_LoadCollection();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Resultset#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Resultset#getName()
	 * @see #getResultset()
	 * @generated
	 */
	EAttribute getResultset_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.db2m.hbm30.Return <em>Return</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Return</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Return
	 * @generated
	 */
	EClass getReturn();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.emf.teneo.db2m.hbm30.Return#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Return#getGroup()
	 * @see #getReturn()
	 * @generated
	 */
	EAttribute getReturn_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.Return#getReturnDiscriminator <em>Return Discriminator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Return Discriminator</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Return#getReturnDiscriminator()
	 * @see #getReturn()
	 * @generated
	 */
	EReference getReturn_ReturnDiscriminator();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.Return#getReturnProperty <em>Return Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Return Property</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Return#getReturnProperty()
	 * @see #getReturn()
	 * @generated
	 */
	EReference getReturn_ReturnProperty();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Return#getAlias <em>Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alias</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Return#getAlias()
	 * @see #getReturn()
	 * @generated
	 */
	EAttribute getReturn_Alias();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Return#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Return#getClass_()
	 * @see #getReturn()
	 * @generated
	 */
	EAttribute getReturn_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Return#getEntityName <em>Entity Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Entity Name</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Return#getEntityName()
	 * @see #getReturn()
	 * @generated
	 */
	EAttribute getReturn_EntityName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Return#getLockMode <em>Lock Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lock Mode</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Return#getLockMode()
	 * @see #getReturn()
	 * @generated
	 */
	EAttribute getReturn_LockMode();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.db2m.hbm30.ReturnColumn <em>Return Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Return Column</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.ReturnColumn
	 * @generated
	 */
	EClass getReturnColumn();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.ReturnColumn#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.ReturnColumn#getName()
	 * @see #getReturnColumn()
	 * @generated
	 */
	EAttribute getReturnColumn_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.db2m.hbm30.ReturnDiscriminator <em>Return Discriminator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Return Discriminator</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.ReturnDiscriminator
	 * @generated
	 */
	EClass getReturnDiscriminator();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.ReturnDiscriminator#getColumn <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.ReturnDiscriminator#getColumn()
	 * @see #getReturnDiscriminator()
	 * @generated
	 */
	EAttribute getReturnDiscriminator_Column();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.db2m.hbm30.ReturnJoin <em>Return Join</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Return Join</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.ReturnJoin
	 * @generated
	 */
	EClass getReturnJoin();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.emf.teneo.db2m.hbm30.ReturnJoin#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.ReturnJoin#getGroup()
	 * @see #getReturnJoin()
	 * @generated
	 */
	EAttribute getReturnJoin_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.ReturnJoin#getReturnProperty <em>Return Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Return Property</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.ReturnJoin#getReturnProperty()
	 * @see #getReturnJoin()
	 * @generated
	 */
	EReference getReturnJoin_ReturnProperty();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.ReturnJoin#getAlias <em>Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alias</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.ReturnJoin#getAlias()
	 * @see #getReturnJoin()
	 * @generated
	 */
	EAttribute getReturnJoin_Alias();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.ReturnJoin#getLockMode <em>Lock Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lock Mode</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.ReturnJoin#getLockMode()
	 * @see #getReturnJoin()
	 * @generated
	 */
	EAttribute getReturnJoin_LockMode();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.ReturnJoin#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.ReturnJoin#getProperty()
	 * @see #getReturnJoin()
	 * @generated
	 */
	EAttribute getReturnJoin_Property();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.db2m.hbm30.ReturnProperty <em>Return Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Return Property</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.ReturnProperty
	 * @generated
	 */
	EClass getReturnProperty();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.ReturnProperty#getReturnColumn <em>Return Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Return Column</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.ReturnProperty#getReturnColumn()
	 * @see #getReturnProperty()
	 * @generated
	 */
	EReference getReturnProperty_ReturnColumn();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.ReturnProperty#getColumn <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.ReturnProperty#getColumn()
	 * @see #getReturnProperty()
	 * @generated
	 */
	EAttribute getReturnProperty_Column();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.ReturnProperty#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.ReturnProperty#getName()
	 * @see #getReturnProperty()
	 * @generated
	 */
	EAttribute getReturnProperty_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.db2m.hbm30.ReturnScalar <em>Return Scalar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Return Scalar</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.ReturnScalar
	 * @generated
	 */
	EClass getReturnScalar();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.ReturnScalar#getColumn <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.ReturnScalar#getColumn()
	 * @see #getReturnScalar()
	 * @generated
	 */
	EAttribute getReturnScalar_Column();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.ReturnScalar#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.ReturnScalar#getType()
	 * @see #getReturnScalar()
	 * @generated
	 */
	EAttribute getReturnScalar_Type();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.db2m.hbm30.Set <em>Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Set
	 * @generated
	 */
	EClass getSet();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.Set#getMeta <em>Meta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Meta</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Set#getMeta()
	 * @see #getSet()
	 * @generated
	 */
	EReference getSet_Meta();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Set#getSubselect <em>Subselect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subselect</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Set#getSubselect()
	 * @see #getSet()
	 * @generated
	 */
	EAttribute getSet_Subselect();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.db2m.hbm30.Set#getCache <em>Cache</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cache</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Set#getCache()
	 * @see #getSet()
	 * @generated
	 */
	EReference getSet_Cache();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.Set#getSynchronize <em>Synchronize</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Synchronize</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Set#getSynchronize()
	 * @see #getSet()
	 * @generated
	 */
	EReference getSet_Synchronize();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Set#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Set#getComment()
	 * @see #getSet()
	 * @generated
	 */
	EAttribute getSet_Comment();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.db2m.hbm30.Set#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Key</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Set#getKey()
	 * @see #getSet()
	 * @generated
	 */
	EReference getSet_Key();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.db2m.hbm30.Set#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Element</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Set#getElement()
	 * @see #getSet()
	 * @generated
	 */
	EReference getSet_Element();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.db2m.hbm30.Set#getOneToMany <em>One To Many</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>One To Many</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Set#getOneToMany()
	 * @see #getSet()
	 * @generated
	 */
	EReference getSet_OneToMany();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.db2m.hbm30.Set#getManyToMany <em>Many To Many</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Many To Many</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Set#getManyToMany()
	 * @see #getSet()
	 * @generated
	 */
	EReference getSet_ManyToMany();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.db2m.hbm30.Set#getCompositeElement <em>Composite Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Composite Element</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Set#getCompositeElement()
	 * @see #getSet()
	 * @generated
	 */
	EReference getSet_CompositeElement();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.db2m.hbm30.Set#getManyToAny <em>Many To Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Many To Any</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Set#getManyToAny()
	 * @see #getSet()
	 * @generated
	 */
	EReference getSet_ManyToAny();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.db2m.hbm30.Set#getLoader <em>Loader</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Loader</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Set#getLoader()
	 * @see #getSet()
	 * @generated
	 */
	EReference getSet_Loader();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.db2m.hbm30.Set#getSqlInsert <em>Sql Insert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sql Insert</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Set#getSqlInsert()
	 * @see #getSet()
	 * @generated
	 */
	EReference getSet_SqlInsert();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.db2m.hbm30.Set#getSqlUpdate <em>Sql Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sql Update</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Set#getSqlUpdate()
	 * @see #getSet()
	 * @generated
	 */
	EReference getSet_SqlUpdate();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.db2m.hbm30.Set#getSqlDelete <em>Sql Delete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sql Delete</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Set#getSqlDelete()
	 * @see #getSet()
	 * @generated
	 */
	EReference getSet_SqlDelete();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.db2m.hbm30.Set#getSqlDeleteAll <em>Sql Delete All</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sql Delete All</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Set#getSqlDeleteAll()
	 * @see #getSet()
	 * @generated
	 */
	EReference getSet_SqlDeleteAll();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.Set#getFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Filter</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Set#getFilter()
	 * @see #getSet()
	 * @generated
	 */
	EReference getSet_Filter();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Set#getAccess <em>Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Set#getAccess()
	 * @see #getSet()
	 * @generated
	 */
	EAttribute getSet_Access();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Set#getBatchSize <em>Batch Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Batch Size</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Set#getBatchSize()
	 * @see #getSet()
	 * @generated
	 */
	EAttribute getSet_BatchSize();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Set#getCascade <em>Cascade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cascade</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Set#getCascade()
	 * @see #getSet()
	 * @generated
	 */
	EAttribute getSet_Cascade();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Set#getCatalog <em>Catalog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Catalog</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Set#getCatalog()
	 * @see #getSet()
	 * @generated
	 */
	EAttribute getSet_Catalog();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Set#getCheck <em>Check</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Check</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Set#getCheck()
	 * @see #getSet()
	 * @generated
	 */
	EAttribute getSet_Check();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Set#getCollectionType <em>Collection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Collection Type</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Set#getCollectionType()
	 * @see #getSet()
	 * @generated
	 */
	EAttribute getSet_CollectionType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Set#isEmbedXml <em>Embed Xml</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Embed Xml</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Set#isEmbedXml()
	 * @see #getSet()
	 * @generated
	 */
	EAttribute getSet_EmbedXml();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Set#getFetch <em>Fetch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fetch</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Set#getFetch()
	 * @see #getSet()
	 * @generated
	 */
	EAttribute getSet_Fetch();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Set#isInverse <em>Inverse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inverse</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Set#isInverse()
	 * @see #getSet()
	 * @generated
	 */
	EAttribute getSet_Inverse();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Set#getLazy <em>Lazy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lazy</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Set#getLazy()
	 * @see #getSet()
	 * @generated
	 */
	EAttribute getSet_Lazy();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Set#isMutable <em>Mutable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mutable</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Set#isMutable()
	 * @see #getSet()
	 * @generated
	 */
	EAttribute getSet_Mutable();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Set#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Set#getName()
	 * @see #getSet()
	 * @generated
	 */
	EAttribute getSet_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Set#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Node</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Set#getNode()
	 * @see #getSet()
	 * @generated
	 */
	EAttribute getSet_Node();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Set#isOptimisticLock <em>Optimistic Lock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Optimistic Lock</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Set#isOptimisticLock()
	 * @see #getSet()
	 * @generated
	 */
	EAttribute getSet_OptimisticLock();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Set#getOrderBy <em>Order By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order By</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Set#getOrderBy()
	 * @see #getSet()
	 * @generated
	 */
	EAttribute getSet_OrderBy();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Set#getOuterJoin <em>Outer Join</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Outer Join</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Set#getOuterJoin()
	 * @see #getSet()
	 * @generated
	 */
	EAttribute getSet_OuterJoin();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Set#getPersister <em>Persister</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Persister</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Set#getPersister()
	 * @see #getSet()
	 * @generated
	 */
	EAttribute getSet_Persister();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Set#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schema</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Set#getSchema()
	 * @see #getSet()
	 * @generated
	 */
	EAttribute getSet_Schema();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Set#getSort <em>Sort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sort</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Set#getSort()
	 * @see #getSet()
	 * @generated
	 */
	EAttribute getSet_Sort();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Set#getSubselect1 <em>Subselect1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subselect1</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Set#getSubselect1()
	 * @see #getSet()
	 * @generated
	 */
	EAttribute getSet_Subselect1();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Set#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Table</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Set#getTable()
	 * @see #getSet()
	 * @generated
	 */
	EAttribute getSet_Table();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Set#getWhere <em>Where</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Where</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Set#getWhere()
	 * @see #getSet()
	 * @generated
	 */
	EAttribute getSet_Where();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.db2m.hbm30.SqlDelete <em>Sql Delete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sql Delete</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.SqlDelete
	 * @generated
	 */
	EClass getSqlDelete();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.SqlDelete#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.SqlDelete#getValue()
	 * @see #getSqlDelete()
	 * @generated
	 */
	EAttribute getSqlDelete_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.SqlDelete#isCallable <em>Callable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Callable</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.SqlDelete#isCallable()
	 * @see #getSqlDelete()
	 * @generated
	 */
	EAttribute getSqlDelete_Callable();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.db2m.hbm30.SqlDeleteAll <em>Sql Delete All</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sql Delete All</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.SqlDeleteAll
	 * @generated
	 */
	EClass getSqlDeleteAll();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.SqlDeleteAll#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.SqlDeleteAll#getValue()
	 * @see #getSqlDeleteAll()
	 * @generated
	 */
	EAttribute getSqlDeleteAll_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.SqlDeleteAll#isCallable <em>Callable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Callable</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.SqlDeleteAll#isCallable()
	 * @see #getSqlDeleteAll()
	 * @generated
	 */
	EAttribute getSqlDeleteAll_Callable();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.db2m.hbm30.SqlInsert <em>Sql Insert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sql Insert</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.SqlInsert
	 * @generated
	 */
	EClass getSqlInsert();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.SqlInsert#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.SqlInsert#getValue()
	 * @see #getSqlInsert()
	 * @generated
	 */
	EAttribute getSqlInsert_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.SqlInsert#isCallable <em>Callable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Callable</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.SqlInsert#isCallable()
	 * @see #getSqlInsert()
	 * @generated
	 */
	EAttribute getSqlInsert_Callable();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.db2m.hbm30.SqlQuery <em>Sql Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sql Query</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.SqlQuery
	 * @generated
	 */
	EClass getSqlQuery();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.emf.teneo.db2m.hbm30.SqlQuery#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.SqlQuery#getMixed()
	 * @see #getSqlQuery()
	 * @generated
	 */
	EAttribute getSqlQuery_Mixed();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.emf.teneo.db2m.hbm30.SqlQuery#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.SqlQuery#getGroup()
	 * @see #getSqlQuery()
	 * @generated
	 */
	EAttribute getSqlQuery_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.SqlQuery#getReturnScalar <em>Return Scalar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Return Scalar</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.SqlQuery#getReturnScalar()
	 * @see #getSqlQuery()
	 * @generated
	 */
	EReference getSqlQuery_ReturnScalar();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.SqlQuery#getReturn <em>Return</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Return</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.SqlQuery#getReturn()
	 * @see #getSqlQuery()
	 * @generated
	 */
	EReference getSqlQuery_Return();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.SqlQuery#getReturnJoin <em>Return Join</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Return Join</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.SqlQuery#getReturnJoin()
	 * @see #getSqlQuery()
	 * @generated
	 */
	EReference getSqlQuery_ReturnJoin();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.SqlQuery#getLoadCollection <em>Load Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Load Collection</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.SqlQuery#getLoadCollection()
	 * @see #getSqlQuery()
	 * @generated
	 */
	EReference getSqlQuery_LoadCollection();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.SqlQuery#getSynchronize <em>Synchronize</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Synchronize</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.SqlQuery#getSynchronize()
	 * @see #getSqlQuery()
	 * @generated
	 */
	EReference getSqlQuery_Synchronize();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.SqlQuery#getQueryParam <em>Query Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Query Param</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.SqlQuery#getQueryParam()
	 * @see #getSqlQuery()
	 * @generated
	 */
	EReference getSqlQuery_QueryParam();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.SqlQuery#isCacheable <em>Cacheable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cacheable</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.SqlQuery#isCacheable()
	 * @see #getSqlQuery()
	 * @generated
	 */
	EAttribute getSqlQuery_Cacheable();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.SqlQuery#getCacheMode <em>Cache Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cache Mode</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.SqlQuery#getCacheMode()
	 * @see #getSqlQuery()
	 * @generated
	 */
	EAttribute getSqlQuery_CacheMode();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.SqlQuery#getCacheRegion <em>Cache Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cache Region</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.SqlQuery#getCacheRegion()
	 * @see #getSqlQuery()
	 * @generated
	 */
	EAttribute getSqlQuery_CacheRegion();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.SqlQuery#isCallable <em>Callable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Callable</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.SqlQuery#isCallable()
	 * @see #getSqlQuery()
	 * @generated
	 */
	EAttribute getSqlQuery_Callable();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.SqlQuery#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.SqlQuery#getComment()
	 * @see #getSqlQuery()
	 * @generated
	 */
	EAttribute getSqlQuery_Comment();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.SqlQuery#getFetchSize <em>Fetch Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fetch Size</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.SqlQuery#getFetchSize()
	 * @see #getSqlQuery()
	 * @generated
	 */
	EAttribute getSqlQuery_FetchSize();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.SqlQuery#getFlushMode <em>Flush Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Flush Mode</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.SqlQuery#getFlushMode()
	 * @see #getSqlQuery()
	 * @generated
	 */
	EAttribute getSqlQuery_FlushMode();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.SqlQuery#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.SqlQuery#getName()
	 * @see #getSqlQuery()
	 * @generated
	 */
	EAttribute getSqlQuery_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.SqlQuery#isReadOnly <em>Read Only</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Read Only</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.SqlQuery#isReadOnly()
	 * @see #getSqlQuery()
	 * @generated
	 */
	EAttribute getSqlQuery_ReadOnly();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.SqlQuery#getResultsetRef <em>Resultset Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resultset Ref</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.SqlQuery#getResultsetRef()
	 * @see #getSqlQuery()
	 * @generated
	 */
	EAttribute getSqlQuery_ResultsetRef();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.SqlQuery#getTimeout <em>Timeout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timeout</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.SqlQuery#getTimeout()
	 * @see #getSqlQuery()
	 * @generated
	 */
	EAttribute getSqlQuery_Timeout();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.db2m.hbm30.SqlUpdate <em>Sql Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sql Update</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.SqlUpdate
	 * @generated
	 */
	EClass getSqlUpdate();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.SqlUpdate#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.SqlUpdate#getValue()
	 * @see #getSqlUpdate()
	 * @generated
	 */
	EAttribute getSqlUpdate_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.SqlUpdate#isCallable <em>Callable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Callable</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.SqlUpdate#isCallable()
	 * @see #getSqlUpdate()
	 * @generated
	 */
	EAttribute getSqlUpdate_Callable();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.db2m.hbm30.Subclass <em>Subclass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subclass</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Subclass
	 * @generated
	 */
	EClass getSubclass();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.Subclass#getMeta <em>Meta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Meta</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Subclass#getMeta()
	 * @see #getSubclass()
	 * @generated
	 */
	EReference getSubclass_Meta();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.Subclass#getTuplizer <em>Tuplizer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tuplizer</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Subclass#getTuplizer()
	 * @see #getSubclass()
	 * @generated
	 */
	EReference getSubclass_Tuplizer();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.Subclass#getSynchronize <em>Synchronize</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Synchronize</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Subclass#getSynchronize()
	 * @see #getSubclass()
	 * @generated
	 */
	EReference getSubclass_Synchronize();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.emf.teneo.db2m.hbm30.Subclass#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Subclass#getGroup()
	 * @see #getSubclass()
	 * @generated
	 */
	EAttribute getSubclass_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.Subclass#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Subclass#getProperty()
	 * @see #getSubclass()
	 * @generated
	 */
	EReference getSubclass_Property();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.Subclass#getManyToOne <em>Many To One</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Many To One</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Subclass#getManyToOne()
	 * @see #getSubclass()
	 * @generated
	 */
	EReference getSubclass_ManyToOne();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.Subclass#getOneToOne <em>One To One</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>One To One</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Subclass#getOneToOne()
	 * @see #getSubclass()
	 * @generated
	 */
	EReference getSubclass_OneToOne();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.Subclass#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Component</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Subclass#getComponent()
	 * @see #getSubclass()
	 * @generated
	 */
	EReference getSubclass_Component();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.Subclass#getDynamicComponent <em>Dynamic Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dynamic Component</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Subclass#getDynamicComponent()
	 * @see #getSubclass()
	 * @generated
	 */
	EReference getSubclass_DynamicComponent();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.Subclass#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Any</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Subclass#getAny()
	 * @see #getSubclass()
	 * @generated
	 */
	EReference getSubclass_Any();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.Subclass#getMap <em>Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Map</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Subclass#getMap()
	 * @see #getSubclass()
	 * @generated
	 */
	EReference getSubclass_Map();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.Subclass#getSet <em>Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Set</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Subclass#getSet()
	 * @see #getSubclass()
	 * @generated
	 */
	EReference getSubclass_Set();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.Subclass#getList <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>List</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Subclass#getList()
	 * @see #getSubclass()
	 * @generated
	 */
	EReference getSubclass_List();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.Subclass#getBag <em>Bag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bag</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Subclass#getBag()
	 * @see #getSubclass()
	 * @generated
	 */
	EReference getSubclass_Bag();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.Subclass#getIdbag <em>Idbag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Idbag</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Subclass#getIdbag()
	 * @see #getSubclass()
	 * @generated
	 */
	EReference getSubclass_Idbag();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.Subclass#getArray <em>Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Array</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Subclass#getArray()
	 * @see #getSubclass()
	 * @generated
	 */
	EReference getSubclass_Array();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.Subclass#getPrimitiveArray <em>Primitive Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Primitive Array</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Subclass#getPrimitiveArray()
	 * @see #getSubclass()
	 * @generated
	 */
	EReference getSubclass_PrimitiveArray();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.Subclass#getJoin <em>Join</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Join</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Subclass#getJoin()
	 * @see #getSubclass()
	 * @generated
	 */
	EReference getSubclass_Join();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.Subclass#getSubclass <em>Subclass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subclass</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Subclass#getSubclass()
	 * @see #getSubclass()
	 * @generated
	 */
	EReference getSubclass_Subclass();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.db2m.hbm30.Subclass#getLoader <em>Loader</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Loader</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Subclass#getLoader()
	 * @see #getSubclass()
	 * @generated
	 */
	EReference getSubclass_Loader();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.db2m.hbm30.Subclass#getSqlInsert <em>Sql Insert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sql Insert</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Subclass#getSqlInsert()
	 * @see #getSubclass()
	 * @generated
	 */
	EReference getSubclass_SqlInsert();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.db2m.hbm30.Subclass#getSqlUpdate <em>Sql Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sql Update</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Subclass#getSqlUpdate()
	 * @see #getSubclass()
	 * @generated
	 */
	EReference getSubclass_SqlUpdate();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.db2m.hbm30.Subclass#getSqlDelete <em>Sql Delete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sql Delete</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Subclass#getSqlDelete()
	 * @see #getSubclass()
	 * @generated
	 */
	EReference getSubclass_SqlDelete();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.Subclass#getResultset <em>Resultset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resultset</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Subclass#getResultset()
	 * @see #getSubclass()
	 * @generated
	 */
	EReference getSubclass_Resultset();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.emf.teneo.db2m.hbm30.Subclass#getGroup1 <em>Group1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group1</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Subclass#getGroup1()
	 * @see #getSubclass()
	 * @generated
	 */
	EAttribute getSubclass_Group1();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.Subclass#getQuery <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Query</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Subclass#getQuery()
	 * @see #getSubclass()
	 * @generated
	 */
	EReference getSubclass_Query();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.Subclass#getSqlQuery <em>Sql Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sql Query</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Subclass#getSqlQuery()
	 * @see #getSubclass()
	 * @generated
	 */
	EReference getSubclass_SqlQuery();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Subclass#isAbstract <em>Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abstract</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Subclass#isAbstract()
	 * @see #getSubclass()
	 * @generated
	 */
	EAttribute getSubclass_Abstract();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Subclass#getBatchSize <em>Batch Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Batch Size</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Subclass#getBatchSize()
	 * @see #getSubclass()
	 * @generated
	 */
	EAttribute getSubclass_BatchSize();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Subclass#getDiscriminatorValue <em>Discriminator Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Discriminator Value</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Subclass#getDiscriminatorValue()
	 * @see #getSubclass()
	 * @generated
	 */
	EAttribute getSubclass_DiscriminatorValue();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Subclass#isDynamicInsert <em>Dynamic Insert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dynamic Insert</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Subclass#isDynamicInsert()
	 * @see #getSubclass()
	 * @generated
	 */
	EAttribute getSubclass_DynamicInsert();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Subclass#isDynamicUpdate <em>Dynamic Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dynamic Update</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Subclass#isDynamicUpdate()
	 * @see #getSubclass()
	 * @generated
	 */
	EAttribute getSubclass_DynamicUpdate();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Subclass#getEntityName <em>Entity Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Entity Name</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Subclass#getEntityName()
	 * @see #getSubclass()
	 * @generated
	 */
	EAttribute getSubclass_EntityName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Subclass#getExtends <em>Extends</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extends</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Subclass#getExtends()
	 * @see #getSubclass()
	 * @generated
	 */
	EAttribute getSubclass_Extends();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Subclass#isLazy <em>Lazy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lazy</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Subclass#isLazy()
	 * @see #getSubclass()
	 * @generated
	 */
	EAttribute getSubclass_Lazy();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Subclass#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Subclass#getName()
	 * @see #getSubclass()
	 * @generated
	 */
	EAttribute getSubclass_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Subclass#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Node</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Subclass#getNode()
	 * @see #getSubclass()
	 * @generated
	 */
	EAttribute getSubclass_Node();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Subclass#getPersister <em>Persister</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Persister</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Subclass#getPersister()
	 * @see #getSubclass()
	 * @generated
	 */
	EAttribute getSubclass_Persister();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Subclass#getProxy <em>Proxy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Proxy</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Subclass#getProxy()
	 * @see #getSubclass()
	 * @generated
	 */
	EAttribute getSubclass_Proxy();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Subclass#isSelectBeforeUpdate <em>Select Before Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Select Before Update</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Subclass#isSelectBeforeUpdate()
	 * @see #getSubclass()
	 * @generated
	 */
	EAttribute getSubclass_SelectBeforeUpdate();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.db2m.hbm30.Synchronize <em>Synchronize</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Synchronize</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Synchronize
	 * @generated
	 */
	EClass getSynchronize();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Synchronize#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Table</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Synchronize#getTable()
	 * @see #getSynchronize()
	 * @generated
	 */
	EAttribute getSynchronize_Table();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.db2m.hbm30.Timestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timestamp</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Timestamp
	 * @generated
	 */
	EClass getTimestamp();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.Timestamp#getMeta <em>Meta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Meta</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Timestamp#getMeta()
	 * @see #getTimestamp()
	 * @generated
	 */
	EReference getTimestamp_Meta();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Timestamp#getAccess <em>Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Timestamp#getAccess()
	 * @see #getTimestamp()
	 * @generated
	 */
	EAttribute getTimestamp_Access();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Timestamp#getColumn <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Timestamp#getColumn()
	 * @see #getTimestamp()
	 * @generated
	 */
	EAttribute getTimestamp_Column();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Timestamp#getGenerated <em>Generated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Timestamp#getGenerated()
	 * @see #getTimestamp()
	 * @generated
	 */
	EAttribute getTimestamp_Generated();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Timestamp#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Timestamp#getName()
	 * @see #getTimestamp()
	 * @generated
	 */
	EAttribute getTimestamp_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Timestamp#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Node</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Timestamp#getNode()
	 * @see #getTimestamp()
	 * @generated
	 */
	EAttribute getTimestamp_Node();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Timestamp#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Timestamp#getSource()
	 * @see #getTimestamp()
	 * @generated
	 */
	EAttribute getTimestamp_Source();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Timestamp#getUnsavedValue <em>Unsaved Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unsaved Value</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Timestamp#getUnsavedValue()
	 * @see #getTimestamp()
	 * @generated
	 */
	EAttribute getTimestamp_UnsavedValue();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.db2m.hbm30.Tuplizer <em>Tuplizer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tuplizer</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Tuplizer
	 * @generated
	 */
	EClass getTuplizer();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Tuplizer#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Tuplizer#getClass_()
	 * @see #getTuplizer()
	 * @generated
	 */
	EAttribute getTuplizer_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Tuplizer#getEntityMode <em>Entity Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Entity Mode</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Tuplizer#getEntityMode()
	 * @see #getTuplizer()
	 * @generated
	 */
	EAttribute getTuplizer_EntityMode();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.db2m.hbm30.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Type
	 * @generated
	 */
	EClass getType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.Type#getParam <em>Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Param</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Type#getParam()
	 * @see #getType()
	 * @generated
	 */
	EReference getType_Param();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Type#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Type#getName()
	 * @see #getType()
	 * @generated
	 */
	EAttribute getType_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.db2m.hbm30.Typedef <em>Typedef</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Typedef</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Typedef
	 * @generated
	 */
	EClass getTypedef();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.Typedef#getParam <em>Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Param</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Typedef#getParam()
	 * @see #getTypedef()
	 * @generated
	 */
	EReference getTypedef_Param();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Typedef#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Typedef#getClass_()
	 * @see #getTypedef()
	 * @generated
	 */
	EAttribute getTypedef_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Typedef#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Typedef#getName()
	 * @see #getTypedef()
	 * @generated
	 */
	EAttribute getTypedef_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.db2m.hbm30.UnionSubclass <em>Union Subclass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Union Subclass</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.UnionSubclass
	 * @generated
	 */
	EClass getUnionSubclass();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.UnionSubclass#getMeta <em>Meta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Meta</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.UnionSubclass#getMeta()
	 * @see #getUnionSubclass()
	 * @generated
	 */
	EReference getUnionSubclass_Meta();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.UnionSubclass#getSubselect <em>Subselect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subselect</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.UnionSubclass#getSubselect()
	 * @see #getUnionSubclass()
	 * @generated
	 */
	EAttribute getUnionSubclass_Subselect();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.UnionSubclass#getSynchronize <em>Synchronize</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Synchronize</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.UnionSubclass#getSynchronize()
	 * @see #getUnionSubclass()
	 * @generated
	 */
	EReference getUnionSubclass_Synchronize();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.UnionSubclass#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.UnionSubclass#getComment()
	 * @see #getUnionSubclass()
	 * @generated
	 */
	EAttribute getUnionSubclass_Comment();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.UnionSubclass#getTuplizer <em>Tuplizer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tuplizer</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.UnionSubclass#getTuplizer()
	 * @see #getUnionSubclass()
	 * @generated
	 */
	EReference getUnionSubclass_Tuplizer();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.emf.teneo.db2m.hbm30.UnionSubclass#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.UnionSubclass#getGroup()
	 * @see #getUnionSubclass()
	 * @generated
	 */
	EAttribute getUnionSubclass_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.UnionSubclass#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.UnionSubclass#getProperty()
	 * @see #getUnionSubclass()
	 * @generated
	 */
	EReference getUnionSubclass_Property();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.UnionSubclass#getManyToOne <em>Many To One</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Many To One</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.UnionSubclass#getManyToOne()
	 * @see #getUnionSubclass()
	 * @generated
	 */
	EReference getUnionSubclass_ManyToOne();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.UnionSubclass#getOneToOne <em>One To One</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>One To One</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.UnionSubclass#getOneToOne()
	 * @see #getUnionSubclass()
	 * @generated
	 */
	EReference getUnionSubclass_OneToOne();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.UnionSubclass#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Component</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.UnionSubclass#getComponent()
	 * @see #getUnionSubclass()
	 * @generated
	 */
	EReference getUnionSubclass_Component();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.UnionSubclass#getDynamicComponent <em>Dynamic Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dynamic Component</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.UnionSubclass#getDynamicComponent()
	 * @see #getUnionSubclass()
	 * @generated
	 */
	EReference getUnionSubclass_DynamicComponent();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.UnionSubclass#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.UnionSubclass#getProperties()
	 * @see #getUnionSubclass()
	 * @generated
	 */
	EReference getUnionSubclass_Properties();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.UnionSubclass#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Any</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.UnionSubclass#getAny()
	 * @see #getUnionSubclass()
	 * @generated
	 */
	EReference getUnionSubclass_Any();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.UnionSubclass#getMap <em>Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Map</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.UnionSubclass#getMap()
	 * @see #getUnionSubclass()
	 * @generated
	 */
	EReference getUnionSubclass_Map();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.UnionSubclass#getSet <em>Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Set</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.UnionSubclass#getSet()
	 * @see #getUnionSubclass()
	 * @generated
	 */
	EReference getUnionSubclass_Set();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.UnionSubclass#getList <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>List</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.UnionSubclass#getList()
	 * @see #getUnionSubclass()
	 * @generated
	 */
	EReference getUnionSubclass_List();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.UnionSubclass#getBag <em>Bag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bag</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.UnionSubclass#getBag()
	 * @see #getUnionSubclass()
	 * @generated
	 */
	EReference getUnionSubclass_Bag();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.UnionSubclass#getIdbag <em>Idbag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Idbag</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.UnionSubclass#getIdbag()
	 * @see #getUnionSubclass()
	 * @generated
	 */
	EReference getUnionSubclass_Idbag();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.UnionSubclass#getArray <em>Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Array</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.UnionSubclass#getArray()
	 * @see #getUnionSubclass()
	 * @generated
	 */
	EReference getUnionSubclass_Array();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.UnionSubclass#getPrimitiveArray <em>Primitive Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Primitive Array</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.UnionSubclass#getPrimitiveArray()
	 * @see #getUnionSubclass()
	 * @generated
	 */
	EReference getUnionSubclass_PrimitiveArray();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.UnionSubclass#getUnionSubclass <em>Union Subclass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Union Subclass</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.UnionSubclass#getUnionSubclass()
	 * @see #getUnionSubclass()
	 * @generated
	 */
	EReference getUnionSubclass_UnionSubclass();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.db2m.hbm30.UnionSubclass#getLoader <em>Loader</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Loader</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.UnionSubclass#getLoader()
	 * @see #getUnionSubclass()
	 * @generated
	 */
	EReference getUnionSubclass_Loader();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.db2m.hbm30.UnionSubclass#getSqlInsert <em>Sql Insert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sql Insert</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.UnionSubclass#getSqlInsert()
	 * @see #getUnionSubclass()
	 * @generated
	 */
	EReference getUnionSubclass_SqlInsert();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.db2m.hbm30.UnionSubclass#getSqlUpdate <em>Sql Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sql Update</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.UnionSubclass#getSqlUpdate()
	 * @see #getUnionSubclass()
	 * @generated
	 */
	EReference getUnionSubclass_SqlUpdate();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.db2m.hbm30.UnionSubclass#getSqlDelete <em>Sql Delete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sql Delete</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.UnionSubclass#getSqlDelete()
	 * @see #getUnionSubclass()
	 * @generated
	 */
	EReference getUnionSubclass_SqlDelete();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.UnionSubclass#getResultset <em>Resultset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resultset</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.UnionSubclass#getResultset()
	 * @see #getUnionSubclass()
	 * @generated
	 */
	EReference getUnionSubclass_Resultset();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.emf.teneo.db2m.hbm30.UnionSubclass#getGroup1 <em>Group1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group1</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.UnionSubclass#getGroup1()
	 * @see #getUnionSubclass()
	 * @generated
	 */
	EAttribute getUnionSubclass_Group1();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.UnionSubclass#getQuery <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Query</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.UnionSubclass#getQuery()
	 * @see #getUnionSubclass()
	 * @generated
	 */
	EReference getUnionSubclass_Query();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.UnionSubclass#getSqlQuery <em>Sql Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sql Query</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.UnionSubclass#getSqlQuery()
	 * @see #getUnionSubclass()
	 * @generated
	 */
	EReference getUnionSubclass_SqlQuery();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.UnionSubclass#isAbstract <em>Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abstract</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.UnionSubclass#isAbstract()
	 * @see #getUnionSubclass()
	 * @generated
	 */
	EAttribute getUnionSubclass_Abstract();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.UnionSubclass#getBatchSize <em>Batch Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Batch Size</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.UnionSubclass#getBatchSize()
	 * @see #getUnionSubclass()
	 * @generated
	 */
	EAttribute getUnionSubclass_BatchSize();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.UnionSubclass#getCatalog <em>Catalog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Catalog</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.UnionSubclass#getCatalog()
	 * @see #getUnionSubclass()
	 * @generated
	 */
	EAttribute getUnionSubclass_Catalog();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.UnionSubclass#getCheck <em>Check</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Check</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.UnionSubclass#getCheck()
	 * @see #getUnionSubclass()
	 * @generated
	 */
	EAttribute getUnionSubclass_Check();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.UnionSubclass#isDynamicInsert <em>Dynamic Insert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dynamic Insert</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.UnionSubclass#isDynamicInsert()
	 * @see #getUnionSubclass()
	 * @generated
	 */
	EAttribute getUnionSubclass_DynamicInsert();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.UnionSubclass#isDynamicUpdate <em>Dynamic Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dynamic Update</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.UnionSubclass#isDynamicUpdate()
	 * @see #getUnionSubclass()
	 * @generated
	 */
	EAttribute getUnionSubclass_DynamicUpdate();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.UnionSubclass#getEntityName <em>Entity Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Entity Name</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.UnionSubclass#getEntityName()
	 * @see #getUnionSubclass()
	 * @generated
	 */
	EAttribute getUnionSubclass_EntityName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.UnionSubclass#getExtends <em>Extends</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extends</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.UnionSubclass#getExtends()
	 * @see #getUnionSubclass()
	 * @generated
	 */
	EAttribute getUnionSubclass_Extends();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.UnionSubclass#isLazy <em>Lazy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lazy</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.UnionSubclass#isLazy()
	 * @see #getUnionSubclass()
	 * @generated
	 */
	EAttribute getUnionSubclass_Lazy();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.UnionSubclass#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.UnionSubclass#getName()
	 * @see #getUnionSubclass()
	 * @generated
	 */
	EAttribute getUnionSubclass_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.UnionSubclass#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Node</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.UnionSubclass#getNode()
	 * @see #getUnionSubclass()
	 * @generated
	 */
	EAttribute getUnionSubclass_Node();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.UnionSubclass#getPersister <em>Persister</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Persister</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.UnionSubclass#getPersister()
	 * @see #getUnionSubclass()
	 * @generated
	 */
	EAttribute getUnionSubclass_Persister();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.UnionSubclass#getProxy <em>Proxy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Proxy</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.UnionSubclass#getProxy()
	 * @see #getUnionSubclass()
	 * @generated
	 */
	EAttribute getUnionSubclass_Proxy();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.UnionSubclass#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schema</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.UnionSubclass#getSchema()
	 * @see #getUnionSubclass()
	 * @generated
	 */
	EAttribute getUnionSubclass_Schema();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.UnionSubclass#isSelectBeforeUpdate <em>Select Before Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Select Before Update</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.UnionSubclass#isSelectBeforeUpdate()
	 * @see #getUnionSubclass()
	 * @generated
	 */
	EAttribute getUnionSubclass_SelectBeforeUpdate();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.UnionSubclass#getSubselect1 <em>Subselect1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subselect1</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.UnionSubclass#getSubselect1()
	 * @see #getUnionSubclass()
	 * @generated
	 */
	EAttribute getUnionSubclass_Subselect1();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.UnionSubclass#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Table</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.UnionSubclass#getTable()
	 * @see #getUnionSubclass()
	 * @generated
	 */
	EAttribute getUnionSubclass_Table();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.db2m.hbm30.Version <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Version</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Version
	 * @generated
	 */
	EClass getVersion();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.Version#getMeta <em>Meta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Meta</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Version#getMeta()
	 * @see #getVersion()
	 * @generated
	 */
	EReference getVersion_Meta();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.db2m.hbm30.Version#getColumn <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Column</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Version#getColumn()
	 * @see #getVersion()
	 * @generated
	 */
	EReference getVersion_Column();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Version#getAccess <em>Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Version#getAccess()
	 * @see #getVersion()
	 * @generated
	 */
	EAttribute getVersion_Access();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Version#getColumn1 <em>Column1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column1</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Version#getColumn1()
	 * @see #getVersion()
	 * @generated
	 */
	EAttribute getVersion_Column1();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Version#getGenerated <em>Generated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Version#getGenerated()
	 * @see #getVersion()
	 * @generated
	 */
	EAttribute getVersion_Generated();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Version#isInsert <em>Insert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Insert</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Version#isInsert()
	 * @see #getVersion()
	 * @generated
	 */
	EAttribute getVersion_Insert();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Version#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Version#getName()
	 * @see #getVersion()
	 * @generated
	 */
	EAttribute getVersion_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Version#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Node</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Version#getNode()
	 * @see #getVersion()
	 * @generated
	 */
	EAttribute getVersion_Node();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Version#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Version#getType()
	 * @see #getVersion()
	 * @generated
	 */
	EAttribute getVersion_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.db2m.hbm30.Version#getUnsavedValue <em>Unsaved Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unsaved Value</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Version#getUnsavedValue()
	 * @see #getVersion()
	 * @generated
	 */
	EAttribute getVersion_UnsavedValue();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.emf.teneo.db2m.hbm30.Cachemode <em>Cachemode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Cachemode</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Cachemode
	 * @generated
	 */
	EEnum getCachemode();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.emf.teneo.db2m.hbm30.EntityModeType <em>Entity Mode Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Entity Mode Type</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.EntityModeType
	 * @generated
	 */
	EEnum getEntityModeType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.emf.teneo.db2m.hbm30.Fetch <em>Fetch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Fetch</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Fetch
	 * @generated
	 */
	EEnum getFetch();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.emf.teneo.db2m.hbm30.FetchJoinSelect <em>Fetch Join Select</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Fetch Join Select</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.FetchJoinSelect
	 * @generated
	 */
	EEnum getFetchJoinSelect();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.emf.teneo.db2m.hbm30.Flushmode <em>Flushmode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Flushmode</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Flushmode
	 * @generated
	 */
	EEnum getFlushmode();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.emf.teneo.db2m.hbm30.Generated <em>Generated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Generated</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Generated
	 * @generated
	 */
	EEnum getGenerated();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.emf.teneo.db2m.hbm30.GeneratedNeverAlways <em>Generated Never Always</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Generated Never Always</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.GeneratedNeverAlways
	 * @generated
	 */
	EEnum getGeneratedNeverAlways();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.emf.teneo.db2m.hbm30.IncludeType <em>Include Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Include Type</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.IncludeType
	 * @generated
	 */
	EEnum getIncludeType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.emf.teneo.db2m.hbm30.Lazy <em>Lazy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Lazy</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Lazy
	 * @generated
	 */
	EEnum getLazy();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.emf.teneo.db2m.hbm30.LazyFalseProxy <em>Lazy False Proxy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Lazy False Proxy</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.LazyFalseProxy
	 * @generated
	 */
	EEnum getLazyFalseProxy();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.emf.teneo.db2m.hbm30.LazyTrueFalseExtra <em>Lazy True False Extra</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Lazy True False Extra</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.LazyTrueFalseExtra
	 * @generated
	 */
	EEnum getLazyTrueFalseExtra();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.emf.teneo.db2m.hbm30.Lockmode <em>Lockmode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Lockmode</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Lockmode
	 * @generated
	 */
	EEnum getLockmode();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.emf.teneo.db2m.hbm30.Notfound <em>Notfound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Notfound</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Notfound
	 * @generated
	 */
	EEnum getNotfound();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.emf.teneo.db2m.hbm30.OnDeleteType <em>On Delete Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>On Delete Type</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.OnDeleteType
	 * @generated
	 */
	EEnum getOnDeleteType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.emf.teneo.db2m.hbm30.OptimisticLockType <em>Optimistic Lock Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Optimistic Lock Type</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.OptimisticLockType
	 * @generated
	 */
	EEnum getOptimisticLockType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.emf.teneo.db2m.hbm30.Outerjoin <em>Outerjoin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Outerjoin</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Outerjoin
	 * @generated
	 */
	EEnum getOuterjoin();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.emf.teneo.db2m.hbm30.PolymorphismType <em>Polymorphism Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Polymorphism Type</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.PolymorphismType
	 * @generated
	 */
	EEnum getPolymorphismType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.emf.teneo.db2m.hbm30.SourceType <em>Source Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Source Type</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.SourceType
	 * @generated
	 */
	EEnum getSourceType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.emf.teneo.db2m.hbm30.UnsavedValueType <em>Unsaved Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Unsaved Value Type</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.UnsavedValueType
	 * @generated
	 */
	EEnum getUnsavedValueType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.emf.teneo.db2m.hbm30.UnsavedValueType1 <em>Unsaved Value Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Unsaved Value Type1</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.UnsavedValueType1
	 * @generated
	 */
	EEnum getUnsavedValueType1();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.emf.teneo.db2m.hbm30.UnsavedValueType2 <em>Unsaved Value Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Unsaved Value Type2</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.UnsavedValueType2
	 * @generated
	 */
	EEnum getUnsavedValueType2();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.emf.teneo.db2m.hbm30.UsageType <em>Usage Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Usage Type</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.UsageType
	 * @generated
	 */
	EEnum getUsageType();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.emf.teneo.db2m.hbm30.Cachemode <em>Cachemode Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Cachemode Object</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Cachemode
	 * @model instanceClass="org.eclipse.emf.teneo.db2m.hbm30.Cachemode"
	 *        extendedMetaData="name='cachemode:Object' baseType='cachemode'"
	 * @generated
	 */
	EDataType getCachemodeObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.emf.teneo.db2m.hbm30.EntityModeType <em>Entity Mode Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Entity Mode Type Object</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.EntityModeType
	 * @model instanceClass="org.eclipse.emf.teneo.db2m.hbm30.EntityModeType"
	 *        extendedMetaData="name='entity-mode_._type:Object' baseType='entity-mode_._type'"
	 * @generated
	 */
	EDataType getEntityModeTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.emf.teneo.db2m.hbm30.FetchJoinSelect <em>Fetch Join Select Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Fetch Join Select Object</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.FetchJoinSelect
	 * @model instanceClass="org.eclipse.emf.teneo.db2m.hbm30.FetchJoinSelect"
	 *        extendedMetaData="name='fetch_join_select:Object' baseType='fetch_join_select'"
	 * @generated
	 */
	EDataType getFetchJoinSelectObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.emf.teneo.db2m.hbm30.Fetch <em>Fetch Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Fetch Object</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Fetch
	 * @model instanceClass="org.eclipse.emf.teneo.db2m.hbm30.Fetch"
	 *        extendedMetaData="name='fetch:Object' baseType='fetch'"
	 * @generated
	 */
	EDataType getFetchObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.emf.teneo.db2m.hbm30.Flushmode <em>Flushmode Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Flushmode Object</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Flushmode
	 * @model instanceClass="org.eclipse.emf.teneo.db2m.hbm30.Flushmode"
	 *        extendedMetaData="name='flushmode:Object' baseType='flushmode'"
	 * @generated
	 */
	EDataType getFlushmodeObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.emf.teneo.db2m.hbm30.GeneratedNeverAlways <em>Generated Never Always Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Generated Never Always Object</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.GeneratedNeverAlways
	 * @model instanceClass="org.eclipse.emf.teneo.db2m.hbm30.GeneratedNeverAlways"
	 *        extendedMetaData="name='generated_never_always:Object' baseType='generated_never_always'"
	 * @generated
	 */
	EDataType getGeneratedNeverAlwaysObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.emf.teneo.db2m.hbm30.Generated <em>Generated Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Generated Object</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Generated
	 * @model instanceClass="org.eclipse.emf.teneo.db2m.hbm30.Generated"
	 *        extendedMetaData="name='generated:Object' baseType='generated'"
	 * @generated
	 */
	EDataType getGeneratedObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.emf.teneo.db2m.hbm30.IncludeType <em>Include Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Include Type Object</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.IncludeType
	 * @model instanceClass="org.eclipse.emf.teneo.db2m.hbm30.IncludeType"
	 *        extendedMetaData="name='include_._type:Object' baseType='include_._type'"
	 * @generated
	 */
	EDataType getIncludeTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.emf.teneo.db2m.hbm30.LazyFalseProxy <em>Lazy False Proxy Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Lazy False Proxy Object</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.LazyFalseProxy
	 * @model instanceClass="org.eclipse.emf.teneo.db2m.hbm30.LazyFalseProxy"
	 *        extendedMetaData="name='lazy_false_proxy:Object' baseType='lazy_false_proxy'"
	 * @generated
	 */
	EDataType getLazyFalseProxyObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.emf.teneo.db2m.hbm30.Lazy <em>Lazy Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Lazy Object</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Lazy
	 * @model instanceClass="org.eclipse.emf.teneo.db2m.hbm30.Lazy"
	 *        extendedMetaData="name='lazy:Object' baseType='lazy'"
	 * @generated
	 */
	EDataType getLazyObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.emf.teneo.db2m.hbm30.LazyTrueFalseExtra <em>Lazy True False Extra Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Lazy True False Extra Object</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.LazyTrueFalseExtra
	 * @model instanceClass="org.eclipse.emf.teneo.db2m.hbm30.LazyTrueFalseExtra"
	 *        extendedMetaData="name='lazy_true_false_extra:Object' baseType='lazy_true_false_extra'"
	 * @generated
	 */
	EDataType getLazyTrueFalseExtraObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.emf.teneo.db2m.hbm30.Lockmode <em>Lockmode Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Lockmode Object</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Lockmode
	 * @model instanceClass="org.eclipse.emf.teneo.db2m.hbm30.Lockmode"
	 *        extendedMetaData="name='lockmode:Object' baseType='lockmode'"
	 * @generated
	 */
	EDataType getLockmodeObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.emf.teneo.db2m.hbm30.Notfound <em>Notfound Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Notfound Object</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Notfound
	 * @model instanceClass="org.eclipse.emf.teneo.db2m.hbm30.Notfound"
	 *        extendedMetaData="name='notfound:Object' baseType='notfound'"
	 * @generated
	 */
	EDataType getNotfoundObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.emf.teneo.db2m.hbm30.OnDeleteType <em>On Delete Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>On Delete Type Object</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.OnDeleteType
	 * @model instanceClass="org.eclipse.emf.teneo.db2m.hbm30.OnDeleteType"
	 *        extendedMetaData="name='on-delete_._type:Object' baseType='on-delete_._type'"
	 * @generated
	 */
	EDataType getOnDeleteTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.emf.teneo.db2m.hbm30.OptimisticLockType <em>Optimistic Lock Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Optimistic Lock Type Object</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.OptimisticLockType
	 * @model instanceClass="org.eclipse.emf.teneo.db2m.hbm30.OptimisticLockType"
	 *        extendedMetaData="name='optimistic-lock_._type:Object' baseType='optimistic-lock_._type'"
	 * @generated
	 */
	EDataType getOptimisticLockTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.emf.teneo.db2m.hbm30.Outerjoin <em>Outerjoin Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Outerjoin Object</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Outerjoin
	 * @model instanceClass="org.eclipse.emf.teneo.db2m.hbm30.Outerjoin"
	 *        extendedMetaData="name='outerjoin:Object' baseType='outerjoin'"
	 * @generated
	 */
	EDataType getOuterjoinObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.emf.teneo.db2m.hbm30.PolymorphismType <em>Polymorphism Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Polymorphism Type Object</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.PolymorphismType
	 * @model instanceClass="org.eclipse.emf.teneo.db2m.hbm30.PolymorphismType"
	 *        extendedMetaData="name='polymorphism_._type:Object' baseType='polymorphism_._type'"
	 * @generated
	 */
	EDataType getPolymorphismTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.emf.teneo.db2m.hbm30.SourceType <em>Source Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Source Type Object</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.SourceType
	 * @model instanceClass="org.eclipse.emf.teneo.db2m.hbm30.SourceType"
	 *        extendedMetaData="name='source_._type:Object' baseType='source_._type'"
	 * @generated
	 */
	EDataType getSourceTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.emf.teneo.db2m.hbm30.UnsavedValueType1 <em>Unsaved Value Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Unsaved Value Type Object</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.UnsavedValueType1
	 * @model instanceClass="org.eclipse.emf.teneo.db2m.hbm30.UnsavedValueType1"
	 *        extendedMetaData="name='unsaved-value_._1_._type:Object' baseType='unsaved-value_._1_._type'"
	 * @generated
	 */
	EDataType getUnsavedValueTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.emf.teneo.db2m.hbm30.UnsavedValueType <em>Unsaved Value Type Object1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Unsaved Value Type Object1</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.UnsavedValueType
	 * @model instanceClass="org.eclipse.emf.teneo.db2m.hbm30.UnsavedValueType"
	 *        extendedMetaData="name='unsaved-value_._type:Object' baseType='unsaved-value_._type'"
	 * @generated
	 */
	EDataType getUnsavedValueTypeObject1();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.emf.teneo.db2m.hbm30.UnsavedValueType2 <em>Unsaved Value Type Object2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Unsaved Value Type Object2</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.UnsavedValueType2
	 * @model instanceClass="org.eclipse.emf.teneo.db2m.hbm30.UnsavedValueType2"
	 *        extendedMetaData="name='unsaved-value_._2_._type:Object' baseType='unsaved-value_._2_._type'"
	 * @generated
	 */
	EDataType getUnsavedValueTypeObject2();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.emf.teneo.db2m.hbm30.UsageType <em>Usage Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Usage Type Object</em>'.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.UsageType
	 * @model instanceClass="org.eclipse.emf.teneo.db2m.hbm30.UsageType"
	 *        extendedMetaData="name='usage_._type:Object' baseType='usage_._type'"
	 * @generated
	 */
	EDataType getUsageTypeObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Hbm30Factory getHbm30Factory();

} //Hbm30Package

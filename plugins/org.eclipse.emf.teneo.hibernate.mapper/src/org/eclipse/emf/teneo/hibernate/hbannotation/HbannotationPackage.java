/**
 * <copyright>
 * </copyright>
 *
 * $Id: HbannotationPackage.java,v 1.5 2008/03/30 20:55:12 mtaal Exp $
 */
package org.eclipse.emf.teneo.hibernate.hbannotation;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.teneo.annotations.pannotation.PannotationPackage;

/**
 * <!-- begin-user-doc --> The <b>Package</b> for the model. It contains accessors for the meta
 * objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.teneo.hibernate.hbannotation.HbannotationFactory
 * @model kind="package"
 *        annotation="teneo.mapping.source 1='http://hibernate.elver.org/'"
 * @generated
 */
public interface HbannotationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "hbannotation";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/emf/teneo/2006/HbAnnotation";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.eclipse.emf.teneo.hibernate";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	HbannotationPackage eINSTANCE = org.eclipse.emf.teneo.hibernate.hbannotation.impl.HbannotationPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.hibernate.hbannotation.impl.HbAnnotationImpl <em>Hb Annotation</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.hibernate.hbannotation.impl.HbAnnotationImpl
	 * @see org.eclipse.emf.teneo.hibernate.hbannotation.impl.HbannotationPackageImpl#getHbAnnotation()
	 * @generated
	 */
	int HB_ANNOTATION = 0;

	/**
	 * The feature id for the '<em><b>EModel Element</b></em>' reference.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HB_ANNOTATION__EMODEL_ELEMENT = PannotationPackage.PANNOTATION__EMODEL_ELEMENT;

	/**
	 * The number of structural features of the '<em>Hb Annotation</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int HB_ANNOTATION_FEATURE_COUNT = PannotationPackage.PANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.hibernate.hbannotation.impl.CascadeImpl <em>Cascade</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.hibernate.hbannotation.impl.CascadeImpl
	 * @see org.eclipse.emf.teneo.hibernate.hbannotation.impl.HbannotationPackageImpl#getCascade()
	 * @generated
	 */
	int CASCADE = 1;

	/**
	 * The feature id for the '<em><b>EModel Element</b></em>' reference.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASCADE__EMODEL_ELEMENT = HB_ANNOTATION__EMODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASCADE__VALUE = HB_ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Cascade</em>' class.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASCADE_FEATURE_COUNT = HB_ANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.hibernate.hbannotation.impl.CollectionOfElementsImpl <em>Collection Of Elements</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.hibernate.hbannotation.impl.CollectionOfElementsImpl
	 * @see org.eclipse.emf.teneo.hibernate.hbannotation.impl.HbannotationPackageImpl#getCollectionOfElements()
	 * @generated
	 */
	int COLLECTION_OF_ELEMENTS = 2;

	/**
	 * The feature id for the '<em><b>EModel Element</b></em>' reference.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_OF_ELEMENTS__EMODEL_ELEMENT = HB_ANNOTATION__EMODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Target Element</b></em>' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_OF_ELEMENTS__TARGET_ELEMENT = HB_ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fetch</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_OF_ELEMENTS__FETCH = HB_ANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Collection Of Elements</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COLLECTION_OF_ELEMENTS_FEATURE_COUNT = HB_ANNOTATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.hibernate.hbannotation.impl.MapKeyImpl <em>Map Key</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.hibernate.hbannotation.impl.MapKeyImpl
	 * @see org.eclipse.emf.teneo.hibernate.hbannotation.impl.HbannotationPackageImpl#getMapKey()
	 * @generated
	 */
	int MAP_KEY = 3;

	/**
	 * The feature id for the '<em><b>EModel Element</b></em>' reference.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_KEY__EMODEL_ELEMENT = HB_ANNOTATION__EMODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MAP_KEY__COLUMNS = HB_ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Map Key</em>' class.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_KEY_FEATURE_COUNT = HB_ANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.hibernate.hbannotation.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.hibernate.hbannotation.impl.ParameterImpl
	 * @see org.eclipse.emf.teneo.hibernate.hbannotation.impl.HbannotationPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 4;

	/**
	 * The feature id for the '<em><b>EModel Element</b></em>' reference.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__EMODEL_ELEMENT = HB_ANNOTATION__EMODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = HB_ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__VALUE = HB_ANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = HB_ANNOTATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.hibernate.hbannotation.impl.TypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.hibernate.hbannotation.impl.TypeImpl
	 * @see org.eclipse.emf.teneo.hibernate.hbannotation.impl.HbannotationPackageImpl#getType()
	 * @generated
	 */
	int TYPE = 5;

	/**
	 * The feature id for the '<em><b>EModel Element</b></em>' reference.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__EMODEL_ELEMENT = HB_ANNOTATION__EMODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__TYPE = HB_ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' reference list.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__PARAMETERS = HB_ANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_FEATURE_COUNT = HB_ANNOTATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.hibernate.hbannotation.impl.WhereImpl <em>Where</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.hibernate.hbannotation.impl.WhereImpl
	 * @see org.eclipse.emf.teneo.hibernate.hbannotation.impl.HbannotationPackageImpl#getWhere()
	 * @generated
	 */
	int WHERE = 6;

	/**
	 * The feature id for the '<em><b>EModel Element</b></em>' reference.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHERE__EMODEL_ELEMENT = HB_ANNOTATION__EMODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Clause</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHERE__CLAUSE = HB_ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Where</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHERE_FEATURE_COUNT = HB_ANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.hibernate.hbannotation.impl.IdBagImpl <em>Id Bag</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.hibernate.hbannotation.impl.IdBagImpl
	 * @see org.eclipse.emf.teneo.hibernate.hbannotation.impl.HbannotationPackageImpl#getIdBag()
	 * @generated
	 */
	int ID_BAG = 7;

	/**
	 * The feature id for the '<em><b>EModel Element</b></em>' reference.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BAG__EMODEL_ELEMENT = HB_ANNOTATION__EMODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Generator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BAG__GENERATOR = HB_ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BAG__TYPE = HB_ANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Table</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BAG__TABLE = HB_ANNOTATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Id Bag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BAG_FEATURE_COUNT = HB_ANNOTATION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.hibernate.hbannotation.impl.GenericGeneratorImpl <em>Generic Generator</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.hibernate.hbannotation.impl.GenericGeneratorImpl
	 * @see org.eclipse.emf.teneo.hibernate.hbannotation.impl.HbannotationPackageImpl#getGenericGenerator()
	 * @generated
	 */
	int GENERIC_GENERATOR = 8;

	/**
	 * The feature id for the '<em><b>EModel Element</b></em>' reference.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_GENERATOR__EMODEL_ELEMENT = HB_ANNOTATION__EMODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_GENERATOR__NAME = HB_ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Strategy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_GENERATOR__STRATEGY = HB_ANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' reference list.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_GENERATOR__PARAMETERS = HB_ANNOTATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Generic Generator</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GENERIC_GENERATOR_FEATURE_COUNT = HB_ANNOTATION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.hibernate.hbannotation.impl.CacheImpl <em>Cache</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.hibernate.hbannotation.impl.CacheImpl
	 * @see org.eclipse.emf.teneo.hibernate.hbannotation.impl.HbannotationPackageImpl#getCache()
	 * @generated
	 */
	int CACHE = 9;

	/**
	 * The feature id for the '<em><b>EModel Element</b></em>' reference.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE__EMODEL_ELEMENT = HB_ANNOTATION__EMODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Usage</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE__USAGE = HB_ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Region</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE__REGION = HB_ANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Include</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE__INCLUDE = HB_ANNOTATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Cache</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE_FEATURE_COUNT = HB_ANNOTATION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.hibernate.hbannotation.impl.TypeDefImpl <em>Type Def</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.hibernate.hbannotation.impl.TypeDefImpl
	 * @see org.eclipse.emf.teneo.hibernate.hbannotation.impl.HbannotationPackageImpl#getTypeDef()
	 * @generated
	 */
	int TYPE_DEF = 10;

	/**
	 * The feature id for the '<em><b>EModel Element</b></em>' reference.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEF__EMODEL_ELEMENT = HB_ANNOTATION__EMODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEF__NAME = HB_ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' reference list.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEF__PARAMETERS = HB_ANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEF__TYPE_CLASS = HB_ANNOTATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Type Def</em>' class.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEF_FEATURE_COUNT = HB_ANNOTATION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.hibernate.hbannotation.impl.FetchImpl <em>Fetch</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.hibernate.hbannotation.impl.FetchImpl
	 * @see org.eclipse.emf.teneo.hibernate.hbannotation.impl.HbannotationPackageImpl#getFetch()
	 * @generated
	 */
	int FETCH = 11;

	/**
	 * The feature id for the '<em><b>EModel Element</b></em>' reference.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FETCH__EMODEL_ELEMENT = HB_ANNOTATION__EMODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FETCH__VALUE = HB_ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Fetch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FETCH_FEATURE_COUNT = HB_ANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.hibernate.hbannotation.impl.OnDeleteImpl <em>On Delete</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.hibernate.hbannotation.impl.OnDeleteImpl
	 * @see org.eclipse.emf.teneo.hibernate.hbannotation.impl.HbannotationPackageImpl#getOnDelete()
	 * @generated
	 */
	int ON_DELETE = 12;

	/**
	 * The feature id for the '<em><b>EModel Element</b></em>' reference.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_DELETE__EMODEL_ELEMENT = HB_ANNOTATION__EMODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_DELETE__ACTION = HB_ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>On Delete</em>' class.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_DELETE_FEATURE_COUNT = HB_ANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.hibernate.hbannotation.impl.ProxyImpl <em>Proxy</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.hibernate.hbannotation.impl.ProxyImpl
	 * @see org.eclipse.emf.teneo.hibernate.hbannotation.impl.HbannotationPackageImpl#getProxy()
	 * @generated
	 */
	int PROXY = 13;

	/**
	 * The feature id for the '<em><b>EModel Element</b></em>' reference.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY__EMODEL_ELEMENT = HB_ANNOTATION__EMODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Proxy Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY__PROXY_CLASS = HB_ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Lazy</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY__LAZY = HB_ANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Proxy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_FEATURE_COUNT = HB_ANNOTATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.hibernate.hbannotation.impl.IndexImpl <em>Index</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.hibernate.hbannotation.impl.IndexImpl
	 * @see org.eclipse.emf.teneo.hibernate.hbannotation.impl.HbannotationPackageImpl#getIndex()
	 * @generated
	 */
	int INDEX = 14;

	/**
	 * The feature id for the '<em><b>EModel Element</b></em>' reference.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX__EMODEL_ELEMENT = HB_ANNOTATION__EMODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX__NAME = HB_ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Index</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_FEATURE_COUNT = HB_ANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.hibernate.hbannotation.impl.GeneratedImpl <em>Generated</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.hibernate.hbannotation.impl.GeneratedImpl
	 * @see org.eclipse.emf.teneo.hibernate.hbannotation.impl.HbannotationPackageImpl#getGenerated()
	 * @generated
	 */
	int GENERATED = 15;

	/**
	 * The feature id for the '<em><b>EModel Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATED__EMODEL_ELEMENT = HB_ANNOTATION__EMODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATED__VALUE = HB_ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Generated</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATED_FEATURE_COUNT = HB_ANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.hibernate.hbannotation.impl.NamedQueryImpl <em>Named Query</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.hibernate.hbannotation.impl.NamedQueryImpl
	 * @see org.eclipse.emf.teneo.hibernate.hbannotation.impl.HbannotationPackageImpl#getNamedQuery()
	 * @generated
	 */
	int NAMED_QUERY = 16;

	/**
	 * The feature id for the '<em><b>EModel Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_QUERY__EMODEL_ELEMENT = HB_ANNOTATION__EMODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_QUERY__NAME = HB_ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Query</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_QUERY__QUERY = HB_ANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Named Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_QUERY_FEATURE_COUNT = HB_ANNOTATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.hibernate.hbannotation.CacheConcurrencyStrategy <em>Cache Concurrency Strategy</em>}' enum.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.hibernate.hbannotation.CacheConcurrencyStrategy
	 * @see org.eclipse.emf.teneo.hibernate.hbannotation.impl.HbannotationPackageImpl#getCacheConcurrencyStrategy()
	 * @generated
	 */
	int CACHE_CONCURRENCY_STRATEGY = 17;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.hibernate.hbannotation.HbFetchType <em>Hb Fetch Type</em>}' enum.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.hibernate.hbannotation.HbFetchType
	 * @see org.eclipse.emf.teneo.hibernate.hbannotation.impl.HbannotationPackageImpl#getHbFetchType()
	 * @generated
	 */
	int HB_FETCH_TYPE = 18;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.hibernate.hbannotation.OnDeleteAction <em>On Delete Action</em>}' enum.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.hibernate.hbannotation.OnDeleteAction
	 * @see org.eclipse.emf.teneo.hibernate.hbannotation.impl.HbannotationPackageImpl#getOnDeleteAction()
	 * @generated
	 */
	int ON_DELETE_ACTION = 19;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.hibernate.hbannotation.GenerationTime <em>Generation Time</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.hibernate.hbannotation.GenerationTime
	 * @see org.eclipse.emf.teneo.hibernate.hbannotation.impl.HbannotationPackageImpl#getGenerationTime()
	 * @generated
	 */
	int GENERATION_TIME = 20;

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.hibernate.hbannotation.HbAnnotation <em>Hb Annotation</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hb Annotation</em>'.
	 * @see org.eclipse.emf.teneo.hibernate.hbannotation.HbAnnotation
	 * @generated
	 */
	EClass getHbAnnotation();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.hibernate.hbannotation.Cascade <em>Cascade</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cascade</em>'.
	 * @see org.eclipse.emf.teneo.hibernate.hbannotation.Cascade
	 * @generated
	 */
	EClass getCascade();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.emf.teneo.hibernate.hbannotation.Cascade#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Value</em>'.
	 * @see org.eclipse.emf.teneo.hibernate.hbannotation.Cascade#getValue()
	 * @see #getCascade()
	 * @generated
	 */
	EAttribute getCascade_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.hibernate.hbannotation.CollectionOfElements <em>Collection Of Elements</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collection Of Elements</em>'.
	 * @see org.eclipse.emf.teneo.hibernate.hbannotation.CollectionOfElements
	 * @generated
	 */
	EClass getCollectionOfElements();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.hibernate.hbannotation.CollectionOfElements#getTargetElement <em>Target Element</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Element</em>'.
	 * @see org.eclipse.emf.teneo.hibernate.hbannotation.CollectionOfElements#getTargetElement()
	 * @see #getCollectionOfElements()
	 * @generated
	 */
	EAttribute getCollectionOfElements_TargetElement();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.hibernate.hbannotation.CollectionOfElements#getFetch <em>Fetch</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fetch</em>'.
	 * @see org.eclipse.emf.teneo.hibernate.hbannotation.CollectionOfElements#getFetch()
	 * @see #getCollectionOfElements()
	 * @generated
	 */
	EAttribute getCollectionOfElements_Fetch();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.hibernate.hbannotation.MapKey <em>Map Key</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Map Key</em>'.
	 * @see org.eclipse.emf.teneo.hibernate.hbannotation.MapKey
	 * @generated
	 */
	EClass getMapKey();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.hibernate.hbannotation.MapKey#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Columns</em>'.
	 * @see org.eclipse.emf.teneo.hibernate.hbannotation.MapKey#getColumns()
	 * @see #getMapKey()
	 * @generated
	 */
	EReference getMapKey_Columns();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.hibernate.hbannotation.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see org.eclipse.emf.teneo.hibernate.hbannotation.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.hibernate.hbannotation.Parameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.hibernate.hbannotation.Parameter#getName()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.hibernate.hbannotation.Parameter#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.emf.teneo.hibernate.hbannotation.Parameter#getValue()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.hibernate.hbannotation.Type <em>Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see org.eclipse.emf.teneo.hibernate.hbannotation.Type
	 * @generated
	 */
	EClass getType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.hibernate.hbannotation.Type#getType <em>Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.eclipse.emf.teneo.hibernate.hbannotation.Type#getType()
	 * @see #getType()
	 * @generated
	 */
	EAttribute getType_Type();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.emf.teneo.hibernate.hbannotation.Type#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Parameters</em>'.
	 * @see org.eclipse.emf.teneo.hibernate.hbannotation.Type#getParameters()
	 * @see #getType()
	 * @generated
	 */
	EReference getType_Parameters();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.hibernate.hbannotation.Where <em>Where</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Where</em>'.
	 * @see org.eclipse.emf.teneo.hibernate.hbannotation.Where
	 * @generated
	 */
	EClass getWhere();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.hibernate.hbannotation.Where#getClause <em>Clause</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Clause</em>'.
	 * @see org.eclipse.emf.teneo.hibernate.hbannotation.Where#getClause()
	 * @see #getWhere()
	 * @generated
	 */
	EAttribute getWhere_Clause();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.hibernate.hbannotation.IdBag <em>Id Bag</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Id Bag</em>'.
	 * @see org.eclipse.emf.teneo.hibernate.hbannotation.IdBag
	 * @generated
	 */
	EClass getIdBag();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.hibernate.hbannotation.IdBag#getGenerator <em>Generator</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generator</em>'.
	 * @see org.eclipse.emf.teneo.hibernate.hbannotation.IdBag#getGenerator()
	 * @see #getIdBag()
	 * @generated
	 */
	EAttribute getIdBag_Generator();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.hibernate.hbannotation.IdBag#getType <em>Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.eclipse.emf.teneo.hibernate.hbannotation.IdBag#getType()
	 * @see #getIdBag()
	 * @generated
	 */
	EAttribute getIdBag_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.hibernate.hbannotation.IdBag#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Table</em>'.
	 * @see org.eclipse.emf.teneo.hibernate.hbannotation.IdBag#getTable()
	 * @see #getIdBag()
	 * @generated
	 */
	EAttribute getIdBag_Table();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.hibernate.hbannotation.GenericGenerator <em>Generic Generator</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generic Generator</em>'.
	 * @see org.eclipse.emf.teneo.hibernate.hbannotation.GenericGenerator
	 * @generated
	 */
	EClass getGenericGenerator();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.hibernate.hbannotation.GenericGenerator#getName <em>Name</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.hibernate.hbannotation.GenericGenerator#getName()
	 * @see #getGenericGenerator()
	 * @generated
	 */
	EAttribute getGenericGenerator_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.hibernate.hbannotation.GenericGenerator#getStrategy <em>Strategy</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Strategy</em>'.
	 * @see org.eclipse.emf.teneo.hibernate.hbannotation.GenericGenerator#getStrategy()
	 * @see #getGenericGenerator()
	 * @generated
	 */
	EAttribute getGenericGenerator_Strategy();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.emf.teneo.hibernate.hbannotation.GenericGenerator#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Parameters</em>'.
	 * @see org.eclipse.emf.teneo.hibernate.hbannotation.GenericGenerator#getParameters()
	 * @see #getGenericGenerator()
	 * @generated
	 */
	EReference getGenericGenerator_Parameters();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.hibernate.hbannotation.Cache <em>Cache</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cache</em>'.
	 * @see org.eclipse.emf.teneo.hibernate.hbannotation.Cache
	 * @generated
	 */
	EClass getCache();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.hibernate.hbannotation.Cache#getUsage <em>Usage</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Usage</em>'.
	 * @see org.eclipse.emf.teneo.hibernate.hbannotation.Cache#getUsage()
	 * @see #getCache()
	 * @generated
	 */
	EAttribute getCache_Usage();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.hibernate.hbannotation.Cache#getRegion <em>Region</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Region</em>'.
	 * @see org.eclipse.emf.teneo.hibernate.hbannotation.Cache#getRegion()
	 * @see #getCache()
	 * @generated
	 */
	EAttribute getCache_Region();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.hibernate.hbannotation.Cache#getInclude <em>Include</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Include</em>'.
	 * @see org.eclipse.emf.teneo.hibernate.hbannotation.Cache#getInclude()
	 * @see #getCache()
	 * @generated
	 */
	EAttribute getCache_Include();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.hibernate.hbannotation.TypeDef <em>Type Def</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Def</em>'.
	 * @see org.eclipse.emf.teneo.hibernate.hbannotation.TypeDef
	 * @generated
	 */
	EClass getTypeDef();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.hibernate.hbannotation.TypeDef#getName <em>Name</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.hibernate.hbannotation.TypeDef#getName()
	 * @see #getTypeDef()
	 * @generated
	 */
	EAttribute getTypeDef_Name();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.emf.teneo.hibernate.hbannotation.TypeDef#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Parameters</em>'.
	 * @see org.eclipse.emf.teneo.hibernate.hbannotation.TypeDef#getParameters()
	 * @see #getTypeDef()
	 * @generated
	 */
	EReference getTypeDef_Parameters();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.hibernate.hbannotation.TypeDef#getTypeClass <em>Type Class</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Class</em>'.
	 * @see org.eclipse.emf.teneo.hibernate.hbannotation.TypeDef#getTypeClass()
	 * @see #getTypeDef()
	 * @generated
	 */
	EAttribute getTypeDef_TypeClass();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.hibernate.hbannotation.Fetch <em>Fetch</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fetch</em>'.
	 * @see org.eclipse.emf.teneo.hibernate.hbannotation.Fetch
	 * @generated
	 */
	EClass getFetch();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.hibernate.hbannotation.Fetch#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.emf.teneo.hibernate.hbannotation.Fetch#getValue()
	 * @see #getFetch()
	 * @generated
	 */
	EAttribute getFetch_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.hibernate.hbannotation.OnDelete <em>On Delete</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>On Delete</em>'.
	 * @see org.eclipse.emf.teneo.hibernate.hbannotation.OnDelete
	 * @generated
	 */
	EClass getOnDelete();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.hibernate.hbannotation.OnDelete#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action</em>'.
	 * @see org.eclipse.emf.teneo.hibernate.hbannotation.OnDelete#getAction()
	 * @see #getOnDelete()
	 * @generated
	 */
	EAttribute getOnDelete_Action();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.hibernate.hbannotation.Proxy <em>Proxy</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Proxy</em>'.
	 * @see org.eclipse.emf.teneo.hibernate.hbannotation.Proxy
	 * @generated
	 */
	EClass getProxy();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.hibernate.hbannotation.Proxy#getProxyClass <em>Proxy Class</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Proxy Class</em>'.
	 * @see org.eclipse.emf.teneo.hibernate.hbannotation.Proxy#getProxyClass()
	 * @see #getProxy()
	 * @generated
	 */
	EAttribute getProxy_ProxyClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.hibernate.hbannotation.Proxy#isLazy <em>Lazy</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lazy</em>'.
	 * @see org.eclipse.emf.teneo.hibernate.hbannotation.Proxy#isLazy()
	 * @see #getProxy()
	 * @generated
	 */
	EAttribute getProxy_Lazy();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.hibernate.hbannotation.Index <em>Index</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Index</em>'.
	 * @see org.eclipse.emf.teneo.hibernate.hbannotation.Index
	 * @generated
	 */
	EClass getIndex();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.hibernate.hbannotation.Index#getName <em>Name</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.hibernate.hbannotation.Index#getName()
	 * @see #getIndex()
	 * @generated
	 */
	EAttribute getIndex_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.hibernate.hbannotation.Generated <em>Generated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generated</em>'.
	 * @see org.eclipse.emf.teneo.hibernate.hbannotation.Generated
	 * @generated
	 */
	EClass getGenerated();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.hibernate.hbannotation.Generated#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.emf.teneo.hibernate.hbannotation.Generated#getValue()
	 * @see #getGenerated()
	 * @generated
	 */
	EAttribute getGenerated_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.hibernate.hbannotation.NamedQuery <em>Named Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Query</em>'.
	 * @see org.eclipse.emf.teneo.hibernate.hbannotation.NamedQuery
	 * @generated
	 */
	EClass getNamedQuery();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.hibernate.hbannotation.NamedQuery#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.hibernate.hbannotation.NamedQuery#getName()
	 * @see #getNamedQuery()
	 * @generated
	 */
	EAttribute getNamedQuery_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.hibernate.hbannotation.NamedQuery#getQuery <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Query</em>'.
	 * @see org.eclipse.emf.teneo.hibernate.hbannotation.NamedQuery#getQuery()
	 * @see #getNamedQuery()
	 * @generated
	 */
	EAttribute getNamedQuery_Query();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.emf.teneo.hibernate.hbannotation.CacheConcurrencyStrategy <em>Cache Concurrency Strategy</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Cache Concurrency Strategy</em>'.
	 * @see org.eclipse.emf.teneo.hibernate.hbannotation.CacheConcurrencyStrategy
	 * @generated
	 */
	EEnum getCacheConcurrencyStrategy();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.emf.teneo.hibernate.hbannotation.HbFetchType <em>Hb Fetch Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Hb Fetch Type</em>'.
	 * @see org.eclipse.emf.teneo.hibernate.hbannotation.HbFetchType
	 * @generated
	 */
	EEnum getHbFetchType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.emf.teneo.hibernate.hbannotation.OnDeleteAction <em>On Delete Action</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for enum '<em>On Delete Action</em>'.
	 * @see org.eclipse.emf.teneo.hibernate.hbannotation.OnDeleteAction
	 * @generated
	 */
	EEnum getOnDeleteAction();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.emf.teneo.hibernate.hbannotation.GenerationTime <em>Generation Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Generation Time</em>'.
	 * @see org.eclipse.emf.teneo.hibernate.hbannotation.GenerationTime
	 * @generated
	 */
	EEnum getGenerationTime();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	HbannotationFactory getHbannotationFactory();

	/**
	 * <!-- begin-user-doc --> Defines literals for the meta objects that represent
	 * <ul>
	 * <li>each class,</li>
	 * <li>each feature of each class,</li>
	 * <li>each enum,</li>
	 * <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.hibernate.hbannotation.impl.HbAnnotationImpl <em>Hb Annotation</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.hibernate.hbannotation.impl.HbAnnotationImpl
		 * @see org.eclipse.emf.teneo.hibernate.hbannotation.impl.HbannotationPackageImpl#getHbAnnotation()
		 * @generated
		 */
		EClass HB_ANNOTATION = eINSTANCE.getHbAnnotation();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.hibernate.hbannotation.impl.CascadeImpl <em>Cascade</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.hibernate.hbannotation.impl.CascadeImpl
		 * @see org.eclipse.emf.teneo.hibernate.hbannotation.impl.HbannotationPackageImpl#getCascade()
		 * @generated
		 */
		EClass CASCADE = eINSTANCE.getCascade();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute CASCADE__VALUE = eINSTANCE.getCascade_Value();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.hibernate.hbannotation.impl.CollectionOfElementsImpl <em>Collection Of Elements</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.hibernate.hbannotation.impl.CollectionOfElementsImpl
		 * @see org.eclipse.emf.teneo.hibernate.hbannotation.impl.HbannotationPackageImpl#getCollectionOfElements()
		 * @generated
		 */
		EClass COLLECTION_OF_ELEMENTS = eINSTANCE.getCollectionOfElements();

		/**
		 * The meta object literal for the '<em><b>Target Element</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTION_OF_ELEMENTS__TARGET_ELEMENT = eINSTANCE.getCollectionOfElements_TargetElement();

		/**
		 * The meta object literal for the '<em><b>Fetch</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute COLLECTION_OF_ELEMENTS__FETCH = eINSTANCE.getCollectionOfElements_Fetch();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.hibernate.hbannotation.impl.MapKeyImpl <em>Map Key</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.hibernate.hbannotation.impl.MapKeyImpl
		 * @see org.eclipse.emf.teneo.hibernate.hbannotation.impl.HbannotationPackageImpl#getMapKey()
		 * @generated
		 */
		EClass MAP_KEY = eINSTANCE.getMapKey();

		/**
		 * The meta object literal for the '<em><b>Columns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAP_KEY__COLUMNS = eINSTANCE.getMapKey_Columns();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.hibernate.hbannotation.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.hibernate.hbannotation.impl.ParameterImpl
		 * @see org.eclipse.emf.teneo.hibernate.hbannotation.impl.HbannotationPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute PARAMETER__NAME = eINSTANCE.getParameter_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute PARAMETER__VALUE = eINSTANCE.getParameter_Value();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.hibernate.hbannotation.impl.TypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.hibernate.hbannotation.impl.TypeImpl
		 * @see org.eclipse.emf.teneo.hibernate.hbannotation.impl.HbannotationPackageImpl#getType()
		 * @generated
		 */
		EClass TYPE = eINSTANCE.getType();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute TYPE__TYPE = eINSTANCE.getType_Type();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' reference list feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE__PARAMETERS = eINSTANCE.getType_Parameters();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.hibernate.hbannotation.impl.WhereImpl <em>Where</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.hibernate.hbannotation.impl.WhereImpl
		 * @see org.eclipse.emf.teneo.hibernate.hbannotation.impl.HbannotationPackageImpl#getWhere()
		 * @generated
		 */
		EClass WHERE = eINSTANCE.getWhere();

		/**
		 * The meta object literal for the '<em><b>Clause</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute WHERE__CLAUSE = eINSTANCE.getWhere_Clause();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.hibernate.hbannotation.impl.IdBagImpl <em>Id Bag</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.hibernate.hbannotation.impl.IdBagImpl
		 * @see org.eclipse.emf.teneo.hibernate.hbannotation.impl.HbannotationPackageImpl#getIdBag()
		 * @generated
		 */
		EClass ID_BAG = eINSTANCE.getIdBag();

		/**
		 * The meta object literal for the '<em><b>Generator</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute ID_BAG__GENERATOR = eINSTANCE.getIdBag_Generator();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute ID_BAG__TYPE = eINSTANCE.getIdBag_Type();

		/**
		 * The meta object literal for the '<em><b>Table</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute ID_BAG__TABLE = eINSTANCE.getIdBag_Table();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.hibernate.hbannotation.impl.GenericGeneratorImpl <em>Generic Generator</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.hibernate.hbannotation.impl.GenericGeneratorImpl
		 * @see org.eclipse.emf.teneo.hibernate.hbannotation.impl.HbannotationPackageImpl#getGenericGenerator()
		 * @generated
		 */
		EClass GENERIC_GENERATOR = eINSTANCE.getGenericGenerator();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute GENERIC_GENERATOR__NAME = eINSTANCE.getGenericGenerator_Name();

		/**
		 * The meta object literal for the '<em><b>Strategy</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute GENERIC_GENERATOR__STRATEGY = eINSTANCE.getGenericGenerator_Strategy();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' reference list feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERIC_GENERATOR__PARAMETERS = eINSTANCE.getGenericGenerator_Parameters();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.hibernate.hbannotation.impl.CacheImpl <em>Cache</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.hibernate.hbannotation.impl.CacheImpl
		 * @see org.eclipse.emf.teneo.hibernate.hbannotation.impl.HbannotationPackageImpl#getCache()
		 * @generated
		 */
		EClass CACHE = eINSTANCE.getCache();

		/**
		 * The meta object literal for the '<em><b>Usage</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute CACHE__USAGE = eINSTANCE.getCache_Usage();

		/**
		 * The meta object literal for the '<em><b>Region</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute CACHE__REGION = eINSTANCE.getCache_Region();

		/**
		 * The meta object literal for the '<em><b>Include</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute CACHE__INCLUDE = eINSTANCE.getCache_Include();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.hibernate.hbannotation.impl.TypeDefImpl <em>Type Def</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.hibernate.hbannotation.impl.TypeDefImpl
		 * @see org.eclipse.emf.teneo.hibernate.hbannotation.impl.HbannotationPackageImpl#getTypeDef()
		 * @generated
		 */
		EClass TYPE_DEF = eINSTANCE.getTypeDef();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute TYPE_DEF__NAME = eINSTANCE.getTypeDef_Name();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' reference list feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_DEF__PARAMETERS = eINSTANCE.getTypeDef_Parameters();

		/**
		 * The meta object literal for the '<em><b>Type Class</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute TYPE_DEF__TYPE_CLASS = eINSTANCE.getTypeDef_TypeClass();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.hibernate.hbannotation.impl.FetchImpl <em>Fetch</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.hibernate.hbannotation.impl.FetchImpl
		 * @see org.eclipse.emf.teneo.hibernate.hbannotation.impl.HbannotationPackageImpl#getFetch()
		 * @generated
		 */
		EClass FETCH = eINSTANCE.getFetch();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute FETCH__VALUE = eINSTANCE.getFetch_Value();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.hibernate.hbannotation.impl.OnDeleteImpl <em>On Delete</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.hibernate.hbannotation.impl.OnDeleteImpl
		 * @see org.eclipse.emf.teneo.hibernate.hbannotation.impl.HbannotationPackageImpl#getOnDelete()
		 * @generated
		 */
		EClass ON_DELETE = eINSTANCE.getOnDelete();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute ON_DELETE__ACTION = eINSTANCE.getOnDelete_Action();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.hibernate.hbannotation.impl.ProxyImpl <em>Proxy</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.hibernate.hbannotation.impl.ProxyImpl
		 * @see org.eclipse.emf.teneo.hibernate.hbannotation.impl.HbannotationPackageImpl#getProxy()
		 * @generated
		 */
		EClass PROXY = eINSTANCE.getProxy();

		/**
		 * The meta object literal for the '<em><b>Proxy Class</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROXY__PROXY_CLASS = eINSTANCE.getProxy_ProxyClass();

		/**
		 * The meta object literal for the '<em><b>Lazy</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute PROXY__LAZY = eINSTANCE.getProxy_Lazy();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.hibernate.hbannotation.impl.IndexImpl <em>Index</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.hibernate.hbannotation.impl.IndexImpl
		 * @see org.eclipse.emf.teneo.hibernate.hbannotation.impl.HbannotationPackageImpl#getIndex()
		 * @generated
		 */
		EClass INDEX = eINSTANCE.getIndex();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute INDEX__NAME = eINSTANCE.getIndex_Name();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.hibernate.hbannotation.impl.GeneratedImpl <em>Generated</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.hibernate.hbannotation.impl.GeneratedImpl
		 * @see org.eclipse.emf.teneo.hibernate.hbannotation.impl.HbannotationPackageImpl#getGenerated()
		 * @generated
		 */
		EClass GENERATED = eINSTANCE.getGenerated();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATED__VALUE = eINSTANCE.getGenerated_Value();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.hibernate.hbannotation.impl.NamedQueryImpl <em>Named Query</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.hibernate.hbannotation.impl.NamedQueryImpl
		 * @see org.eclipse.emf.teneo.hibernate.hbannotation.impl.HbannotationPackageImpl#getNamedQuery()
		 * @generated
		 */
		EClass NAMED_QUERY = eINSTANCE.getNamedQuery();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_QUERY__NAME = eINSTANCE.getNamedQuery_Name();

		/**
		 * The meta object literal for the '<em><b>Query</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_QUERY__QUERY = eINSTANCE.getNamedQuery_Query();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.hibernate.hbannotation.CacheConcurrencyStrategy <em>Cache Concurrency Strategy</em>}' enum.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.hibernate.hbannotation.CacheConcurrencyStrategy
		 * @see org.eclipse.emf.teneo.hibernate.hbannotation.impl.HbannotationPackageImpl#getCacheConcurrencyStrategy()
		 * @generated
		 */
		EEnum CACHE_CONCURRENCY_STRATEGY = eINSTANCE.getCacheConcurrencyStrategy();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.hibernate.hbannotation.HbFetchType <em>Hb Fetch Type</em>}' enum.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.hibernate.hbannotation.HbFetchType
		 * @see org.eclipse.emf.teneo.hibernate.hbannotation.impl.HbannotationPackageImpl#getHbFetchType()
		 * @generated
		 */
		EEnum HB_FETCH_TYPE = eINSTANCE.getHbFetchType();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.hibernate.hbannotation.OnDeleteAction <em>On Delete Action</em>}' enum.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.hibernate.hbannotation.OnDeleteAction
		 * @see org.eclipse.emf.teneo.hibernate.hbannotation.impl.HbannotationPackageImpl#getOnDeleteAction()
		 * @generated
		 */
		EEnum ON_DELETE_ACTION = eINSTANCE.getOnDeleteAction();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.hibernate.hbannotation.GenerationTime <em>Generation Time</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.hibernate.hbannotation.GenerationTime
		 * @see org.eclipse.emf.teneo.hibernate.hbannotation.impl.HbannotationPackageImpl#getGenerationTime()
		 * @generated
		 */
		EEnum GENERATION_TIME = eINSTANCE.getGenerationTime();

	}

} // HbannotationPackage

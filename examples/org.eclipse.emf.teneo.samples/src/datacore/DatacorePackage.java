/**
 * <copyright>
 * </copyright>
 *
 * $Id: DatacorePackage.java,v 1.1 2007/03/07 23:34:08 mtaal Exp $
 */
package datacore;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see datacore.DatacoreFactory
 * @model kind="package"
 * @generated
 */
public interface DatacorePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "datacore";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.arcsolutions.de/remarc/";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "remarc";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DatacorePackage eINSTANCE = datacore.impl.DatacorePackageImpl.init();

	/**
	 * The meta object id for the '{@link datacore.impl.CSMXMLImpl <em>CSMXML</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see datacore.impl.CSMXMLImpl
	 * @see datacore.impl.DatacorePackageImpl#getCSMXML()
	 * @generated
	 */
	int CSMXML = 0;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSMXML__ELEMENTS = 0;

	/**
	 * The feature id for the '<em><b>Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSMXML__TYPES = 1;

	/**
	 * The number of structural features of the '<em>CSMXML</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSMXML_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link datacore.impl.CSMElementImpl <em>CSM Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see datacore.impl.CSMElementImpl
	 * @see datacore.impl.DatacorePackageImpl#getCSMElement()
	 * @generated
	 */
	int CSM_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Referenced Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSM_ELEMENT__REFERENCED_ELEMENTS = 0;

	/**
	 * The feature id for the '<em><b>Csm XML</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSM_ELEMENT__CSM_XML = 1;

	/**
	 * The number of structural features of the '<em>CSM Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSM_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link datacore.impl.CSMMetaElementImpl <em>CSM Meta Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see datacore.impl.CSMMetaElementImpl
	 * @see datacore.impl.DatacorePackageImpl#getCSMMetaElement()
	 * @generated
	 */
	int CSM_META_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Referenced Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSM_META_ELEMENT__REFERENCED_ELEMENTS = CSM_ELEMENT__REFERENCED_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Csm XML</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSM_META_ELEMENT__CSM_XML = CSM_ELEMENT__CSM_XML;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSM_META_ELEMENT__ID = CSM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>User Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSM_META_ELEMENT__USER_PROPERTIES = CSM_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>CSM Meta Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSM_META_ELEMENT_FEATURE_COUNT = CSM_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link datacore.impl.CSMClassImpl <em>CSM Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see datacore.impl.CSMClassImpl
	 * @see datacore.impl.DatacorePackageImpl#getCSMClass()
	 * @generated
	 */
	int CSM_CLASS = 3;

	/**
	 * The feature id for the '<em><b>Referenced Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSM_CLASS__REFERENCED_ELEMENTS = CSM_META_ELEMENT__REFERENCED_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Csm XML</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSM_CLASS__CSM_XML = CSM_META_ELEMENT__CSM_XML;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSM_CLASS__ID = CSM_META_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>User Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSM_CLASS__USER_PROPERTIES = CSM_META_ELEMENT__USER_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Csm Characteristic Definitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSM_CLASS__CSM_CHARACTERISTIC_DEFINITIONS = CSM_META_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSM_CLASS__INSTANCES = CSM_META_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Valid CSM Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSM_CLASS__VALID_CSM_TYPES = CSM_META_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSM_CLASS__DESCRIPTION = CSM_META_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Datasource Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSM_CLASS__DATASOURCE_DEFINITION = CSM_META_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Key Charachteristic Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSM_CLASS__KEY_CHARACHTERISTIC_DEFINITION = CSM_META_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Class Representations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSM_CLASS__CLASS_REPRESENTATIONS = CSM_META_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>CSM Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSM_CLASS_FEATURE_COUNT = CSM_META_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link datacore.impl.CSMCharacteristicDefinitionImpl <em>CSM Characteristic Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see datacore.impl.CSMCharacteristicDefinitionImpl
	 * @see datacore.impl.DatacorePackageImpl#getCSMCharacteristicDefinition()
	 * @generated
	 */
	int CSM_CHARACTERISTIC_DEFINITION = 4;

	/**
	 * The feature id for the '<em><b>Referenced Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSM_CHARACTERISTIC_DEFINITION__REFERENCED_ELEMENTS = CSM_META_ELEMENT__REFERENCED_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Csm XML</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSM_CHARACTERISTIC_DEFINITION__CSM_XML = CSM_META_ELEMENT__CSM_XML;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSM_CHARACTERISTIC_DEFINITION__ID = CSM_META_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>User Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSM_CHARACTERISTIC_DEFINITION__USER_PROPERTIES = CSM_META_ELEMENT__USER_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Csm Class</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSM_CHARACTERISTIC_DEFINITION__CSM_CLASS = CSM_META_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Csm Characteristic Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSM_CHARACTERISTIC_DEFINITION__CSM_CHARACTERISTIC_TYPE = CSM_META_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>User Defined</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSM_CHARACTERISTIC_DEFINITION__USER_DEFINED = CSM_META_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSM_CHARACTERISTIC_DEFINITION__NAME = CSM_META_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Value Container</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSM_CHARACTERISTIC_DEFINITION__VALUE_CONTAINER = CSM_META_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSM_CHARACTERISTIC_DEFINITION__ALIAS_NAME = CSM_META_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSM_CHARACTERISTIC_DEFINITION__INDEX = CSM_META_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Data Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSM_CHARACTERISTIC_DEFINITION__DATA_SOURCE = CSM_META_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Free Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSM_CHARACTERISTIC_DEFINITION__FREE_PARAMETER = CSM_META_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>CSM Characteristic Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSM_CHARACTERISTIC_DEFINITION_FEATURE_COUNT = CSM_META_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link datacore.impl.CSMObjectImpl <em>CSM Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see datacore.impl.CSMObjectImpl
	 * @see datacore.impl.DatacorePackageImpl#getCSMObject()
	 * @generated
	 */
	int CSM_OBJECT = 9;

	/**
	 * The feature id for the '<em><b>Referenced Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSM_OBJECT__REFERENCED_ELEMENTS = CSM_ELEMENT__REFERENCED_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Csm XML</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSM_OBJECT__CSM_XML = CSM_ELEMENT__CSM_XML;

	/**
	 * The number of structural features of the '<em>CSM Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSM_OBJECT_FEATURE_COUNT = CSM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link datacore.impl.CSMInstanceImpl <em>CSM Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see datacore.impl.CSMInstanceImpl
	 * @see datacore.impl.DatacorePackageImpl#getCSMInstance()
	 * @generated
	 */
	int CSM_INSTANCE = 5;

	/**
	 * The feature id for the '<em><b>Referenced Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSM_INSTANCE__REFERENCED_ELEMENTS = CSM_OBJECT__REFERENCED_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Csm XML</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSM_INSTANCE__CSM_XML = CSM_OBJECT__CSM_XML;

	/**
	 * The feature id for the '<em><b>Csm Value Container</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSM_INSTANCE__CSM_VALUE_CONTAINER = CSM_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Csm Reprasentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSM_INSTANCE__CSM_REPRASENTATION = CSM_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Containing CSM Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSM_INSTANCE__CONTAINING_CSM_CLASS = CSM_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>CSM Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSM_INSTANCE_FEATURE_COUNT = CSM_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link datacore.impl.CSMCharacteristicValueContainerImpl <em>CSM Characteristic Value Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see datacore.impl.CSMCharacteristicValueContainerImpl
	 * @see datacore.impl.DatacorePackageImpl#getCSMCharacteristicValueContainer()
	 * @generated
	 */
	int CSM_CHARACTERISTIC_VALUE_CONTAINER = 6;

	/**
	 * The feature id for the '<em><b>Referenced Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSM_CHARACTERISTIC_VALUE_CONTAINER__REFERENCED_ELEMENTS = CSM_OBJECT__REFERENCED_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Csm XML</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSM_CHARACTERISTIC_VALUE_CONTAINER__CSM_XML = CSM_OBJECT__CSM_XML;

	/**
	 * The feature id for the '<em><b>Valid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSM_CHARACTERISTIC_VALUE_CONTAINER__VALID = CSM_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Csm Instance</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSM_CHARACTERISTIC_VALUE_CONTAINER__CSM_INSTANCE = CSM_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Concrete Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSM_CHARACTERISTIC_VALUE_CONTAINER__CONCRETE_VALUE = CSM_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Value Set</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSM_CHARACTERISTIC_VALUE_CONTAINER__VALUE_SET = CSM_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSM_CHARACTERISTIC_VALUE_CONTAINER__DATA_TYPE = CSM_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>CSM Characteristic Value Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSM_CHARACTERISTIC_VALUE_CONTAINER_FEATURE_COUNT = CSM_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link datacore.impl.CSMValueSetImpl <em>CSM Value Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see datacore.impl.CSMValueSetImpl
	 * @see datacore.impl.DatacorePackageImpl#getCSMValueSet()
	 * @generated
	 */
	int CSM_VALUE_SET = 7;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSM_VALUE_SET__DATA_TYPE = 0;

	/**
	 * The number of structural features of the '<em>CSM Value Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSM_VALUE_SET_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link datacore.impl.CSMTypeImpl <em>CSM Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see datacore.impl.CSMTypeImpl
	 * @see datacore.impl.DatacorePackageImpl#getCSMType()
	 * @generated
	 */
	int CSM_TYPE = 8;

	/**
	 * The number of structural features of the '<em>CSM Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSM_TYPE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link datacore.impl.CSMRepresentationRootImpl <em>CSM Representation Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see datacore.impl.CSMRepresentationRootImpl
	 * @see datacore.impl.DatacorePackageImpl#getCSMRepresentationRoot()
	 * @generated
	 */
	int CSM_REPRESENTATION_ROOT = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSM_REPRESENTATION_ROOT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Model Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSM_REPRESENTATION_ROOT__MODEL_NAME = 1;

	/**
	 * The feature id for the '<em><b>Csm Instance</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSM_REPRESENTATION_ROOT__CSM_INSTANCE = 2;

	/**
	 * The feature id for the '<em><b>Representation Tree</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSM_REPRESENTATION_ROOT__REPRESENTATION_TREE = 3;

	/**
	 * The feature id for the '<em><b>Value Descriptors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSM_REPRESENTATION_ROOT__VALUE_DESCRIPTORS = 4;

	/**
	 * The number of structural features of the '<em>CSM Representation Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSM_REPRESENTATION_ROOT_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link datacore.impl.CSMValueImpl <em>CSM Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see datacore.impl.CSMValueImpl
	 * @see datacore.impl.DatacorePackageImpl#getCSMValue()
	 * @generated
	 */
	int CSM_VALUE = 11;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSM_VALUE__DATA_TYPE = CSM_VALUE_SET__DATA_TYPE;

	/**
	 * The number of structural features of the '<em>CSM Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSM_VALUE_FEATURE_COUNT = CSM_VALUE_SET_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link datacore.impl.IntervalImpl <em>Interval</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see datacore.impl.IntervalImpl
	 * @see datacore.impl.DatacorePackageImpl#getInterval()
	 * @generated
	 */
	int INTERVAL = 12;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL__DATA_TYPE = CSM_VALUE_SET__DATA_TYPE;

	/**
	 * The feature id for the '<em><b>Min</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL__MIN = CSM_VALUE_SET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL__MAX = CSM_VALUE_SET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Include Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL__INCLUDE_MIN = CSM_VALUE_SET_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Include Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL__INCLUDE_MAX = CSM_VALUE_SET_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL__KIND = CSM_VALUE_SET_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Increment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL__INCREMENT = CSM_VALUE_SET_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Interval</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL_FEATURE_COUNT = CSM_VALUE_SET_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link datacore.impl.UserPropertyImpl <em>User Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see datacore.impl.UserPropertyImpl
	 * @see datacore.impl.DatacorePackageImpl#getUserProperty()
	 * @generated
	 */
	int USER_PROPERTY = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_PROPERTY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_PROPERTY__VALUE = 1;

	/**
	 * The number of structural features of the '<em>User Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_PROPERTY_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link datacore.impl.CSMRepresentationImpl <em>CSM Representation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see datacore.impl.CSMRepresentationImpl
	 * @see datacore.impl.DatacorePackageImpl#getCSMRepresentation()
	 * @generated
	 */
	int CSM_REPRESENTATION = 14;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSM_REPRESENTATION__PARENT = 0;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSM_REPRESENTATION__CHILDREN = 1;

	/**
	 * The feature id for the '<em><b>Valid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSM_REPRESENTATION__VALID = 2;

	/**
	 * The feature id for the '<em><b>Representation Root</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSM_REPRESENTATION__REPRESENTATION_ROOT = 3;

	/**
	 * The feature id for the '<em><b>Owner CSM Class</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSM_REPRESENTATION__OWNER_CSM_CLASS = 4;

	/**
	 * The number of structural features of the '<em>CSM Representation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSM_REPRESENTATION_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link datacore.impl.DataSourceDefinitionsImpl <em>Data Source Definitions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see datacore.impl.DataSourceDefinitionsImpl
	 * @see datacore.impl.DatacorePackageImpl#getDataSourceDefinitions()
	 * @generated
	 */
	int DATA_SOURCE_DEFINITIONS = 15;

	/**
	 * The feature id for the '<em><b>Owner Class</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_DEFINITIONS__OWNER_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Report</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_DEFINITIONS__REPORT = 1;

	/**
	 * The number of structural features of the '<em>Data Source Definitions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_DEFINITIONS_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link datacore.impl.ColumnDefinitionImpl <em>Column Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see datacore.impl.ColumnDefinitionImpl
	 * @see datacore.impl.DatacorePackageImpl#getColumnDefinition()
	 * @generated
	 */
	int COLUMN_DEFINITION = 16;

	/**
	 * The feature id for the '<em><b>Column Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_DEFINITION__COLUMN_NAME = 0;

	/**
	 * The feature id for the '<em><b>Dataset Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_DEFINITION__DATASET_NAME = 1;

	/**
	 * The number of structural features of the '<em>Column Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_DEFINITION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link datacore.impl.CSMRepresentationRootDescriptorImpl <em>CSM Representation Root Descriptor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see datacore.impl.CSMRepresentationRootDescriptorImpl
	 * @see datacore.impl.DatacorePackageImpl#getCSMRepresentationRootDescriptor()
	 * @generated
	 */
	int CSM_REPRESENTATION_ROOT_DESCRIPTOR = 17;

	/**
	 * The feature id for the '<em><b>Representation Root</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSM_REPRESENTATION_ROOT_DESCRIPTOR__REPRESENTATION_ROOT = 0;

	/**
	 * The feature id for the '<em><b>Characteristic ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSM_REPRESENTATION_ROOT_DESCRIPTOR__CHARACTERISTIC_ID = 1;

	/**
	 * The feature id for the '<em><b>Characteritic Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSM_REPRESENTATION_ROOT_DESCRIPTOR__CHARACTERITIC_VALUE = 2;

	/**
	 * The number of structural features of the '<em>CSM Representation Root Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSM_REPRESENTATION_ROOT_DESCRIPTOR_FEATURE_COUNT = 3;


	/**
	 * Returns the meta object for class '{@link datacore.CSMXML <em>CSMXML</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CSMXML</em>'.
	 * @see datacore.CSMXML
	 * @generated
	 */
	EClass getCSMXML();

	/**
	 * Returns the meta object for the containment reference list '{@link datacore.CSMXML#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see datacore.CSMXML#getElements()
	 * @see #getCSMXML()
	 * @generated
	 */
	EReference getCSMXML_Elements();

	/**
	 * Returns the meta object for the containment reference list '{@link datacore.CSMXML#getTypes <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Types</em>'.
	 * @see datacore.CSMXML#getTypes()
	 * @see #getCSMXML()
	 * @generated
	 */
	EReference getCSMXML_Types();

	/**
	 * Returns the meta object for class '{@link datacore.CSMElement <em>CSM Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CSM Element</em>'.
	 * @see datacore.CSMElement
	 * @generated
	 */
	EClass getCSMElement();

	/**
	 * Returns the meta object for the reference list '{@link datacore.CSMElement#getReferencedElements <em>Referenced Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Referenced Elements</em>'.
	 * @see datacore.CSMElement#getReferencedElements()
	 * @see #getCSMElement()
	 * @generated
	 */
	EReference getCSMElement_ReferencedElements();

	/**
	 * Returns the meta object for the container reference '{@link datacore.CSMElement#getCsmXML <em>Csm XML</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Csm XML</em>'.
	 * @see datacore.CSMElement#getCsmXML()
	 * @see #getCSMElement()
	 * @generated
	 */
	EReference getCSMElement_CsmXML();

	/**
	 * Returns the meta object for class '{@link datacore.CSMMetaElement <em>CSM Meta Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CSM Meta Element</em>'.
	 * @see datacore.CSMMetaElement
	 * @generated
	 */
	EClass getCSMMetaElement();

	/**
	 * Returns the meta object for the attribute '{@link datacore.CSMMetaElement#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see datacore.CSMMetaElement#getID()
	 * @see #getCSMMetaElement()
	 * @generated
	 */
	EAttribute getCSMMetaElement_ID();

	/**
	 * Returns the meta object for the containment reference list '{@link datacore.CSMMetaElement#getUserProperties <em>User Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>User Properties</em>'.
	 * @see datacore.CSMMetaElement#getUserProperties()
	 * @see #getCSMMetaElement()
	 * @generated
	 */
	EReference getCSMMetaElement_UserProperties();

	/**
	 * Returns the meta object for class '{@link datacore.CSMClass <em>CSM Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CSM Class</em>'.
	 * @see datacore.CSMClass
	 * @generated
	 */
	EClass getCSMClass();

	/**
	 * Returns the meta object for the containment reference list '{@link datacore.CSMClass#getCsmCharacteristicDefinitions <em>Csm Characteristic Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Csm Characteristic Definitions</em>'.
	 * @see datacore.CSMClass#getCsmCharacteristicDefinitions()
	 * @see #getCSMClass()
	 * @generated
	 */
	EReference getCSMClass_CsmCharacteristicDefinitions();

	/**
	 * Returns the meta object for the reference list '{@link datacore.CSMClass#getInstances <em>Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Instances</em>'.
	 * @see datacore.CSMClass#getInstances()
	 * @see #getCSMClass()
	 * @generated
	 */
	EReference getCSMClass_Instances();

	/**
	 * Returns the meta object for the reference list '{@link datacore.CSMClass#getValidCSMTypes <em>Valid CSM Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Valid CSM Types</em>'.
	 * @see datacore.CSMClass#getValidCSMTypes()
	 * @see #getCSMClass()
	 * @generated
	 */
	EReference getCSMClass_ValidCSMTypes();

	/**
	 * Returns the meta object for the attribute '{@link datacore.CSMClass#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see datacore.CSMClass#getDescription()
	 * @see #getCSMClass()
	 * @generated
	 */
	EAttribute getCSMClass_Description();

	/**
	 * Returns the meta object for the containment reference '{@link datacore.CSMClass#getDatasourceDefinition <em>Datasource Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Datasource Definition</em>'.
	 * @see datacore.CSMClass#getDatasourceDefinition()
	 * @see #getCSMClass()
	 * @generated
	 */
	EReference getCSMClass_DatasourceDefinition();

	/**
	 * Returns the meta object for the reference '{@link datacore.CSMClass#getKeyCharachteristicDefinition <em>Key Charachteristic Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Key Charachteristic Definition</em>'.
	 * @see datacore.CSMClass#getKeyCharachteristicDefinition()
	 * @see #getCSMClass()
	 * @generated
	 */
	EReference getCSMClass_KeyCharachteristicDefinition();

	/**
	 * Returns the meta object for the containment reference list '{@link datacore.CSMClass#getClassRepresentations <em>Class Representations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Class Representations</em>'.
	 * @see datacore.CSMClass#getClassRepresentations()
	 * @see #getCSMClass()
	 * @generated
	 */
	EReference getCSMClass_ClassRepresentations();

	/**
	 * Returns the meta object for class '{@link datacore.CSMCharacteristicDefinition <em>CSM Characteristic Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CSM Characteristic Definition</em>'.
	 * @see datacore.CSMCharacteristicDefinition
	 * @generated
	 */
	EClass getCSMCharacteristicDefinition();

	/**
	 * Returns the meta object for the container reference '{@link datacore.CSMCharacteristicDefinition#getCsmClass <em>Csm Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Csm Class</em>'.
	 * @see datacore.CSMCharacteristicDefinition#getCsmClass()
	 * @see #getCSMCharacteristicDefinition()
	 * @generated
	 */
	EReference getCSMCharacteristicDefinition_CsmClass();

	/**
	 * Returns the meta object for the reference '{@link datacore.CSMCharacteristicDefinition#getCsmCharacteristicType <em>Csm Characteristic Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Csm Characteristic Type</em>'.
	 * @see datacore.CSMCharacteristicDefinition#getCsmCharacteristicType()
	 * @see #getCSMCharacteristicDefinition()
	 * @generated
	 */
	EReference getCSMCharacteristicDefinition_CsmCharacteristicType();

	/**
	 * Returns the meta object for the attribute '{@link datacore.CSMCharacteristicDefinition#isUserDefined <em>User Defined</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Defined</em>'.
	 * @see datacore.CSMCharacteristicDefinition#isUserDefined()
	 * @see #getCSMCharacteristicDefinition()
	 * @generated
	 */
	EAttribute getCSMCharacteristicDefinition_UserDefined();

	/**
	 * Returns the meta object for the attribute '{@link datacore.CSMCharacteristicDefinition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see datacore.CSMCharacteristicDefinition#getName()
	 * @see #getCSMCharacteristicDefinition()
	 * @generated
	 */
	EAttribute getCSMCharacteristicDefinition_Name();

	/**
	 * Returns the meta object for the reference list '{@link datacore.CSMCharacteristicDefinition#getValueContainer <em>Value Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Value Container</em>'.
	 * @see datacore.CSMCharacteristicDefinition#getValueContainer()
	 * @see #getCSMCharacteristicDefinition()
	 * @generated
	 */
	EReference getCSMCharacteristicDefinition_ValueContainer();

	/**
	 * Returns the meta object for the attribute '{@link datacore.CSMCharacteristicDefinition#getAliasName <em>Alias Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alias Name</em>'.
	 * @see datacore.CSMCharacteristicDefinition#getAliasName()
	 * @see #getCSMCharacteristicDefinition()
	 * @generated
	 */
	EAttribute getCSMCharacteristicDefinition_AliasName();

	/**
	 * Returns the meta object for the attribute '{@link datacore.CSMCharacteristicDefinition#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index</em>'.
	 * @see datacore.CSMCharacteristicDefinition#getIndex()
	 * @see #getCSMCharacteristicDefinition()
	 * @generated
	 */
	EAttribute getCSMCharacteristicDefinition_Index();

	/**
	 * Returns the meta object for the containment reference '{@link datacore.CSMCharacteristicDefinition#getDataSource <em>Data Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Source</em>'.
	 * @see datacore.CSMCharacteristicDefinition#getDataSource()
	 * @see #getCSMCharacteristicDefinition()
	 * @generated
	 */
	EReference getCSMCharacteristicDefinition_DataSource();

	/**
	 * Returns the meta object for the attribute '{@link datacore.CSMCharacteristicDefinition#isFreeParameter <em>Free Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Free Parameter</em>'.
	 * @see datacore.CSMCharacteristicDefinition#isFreeParameter()
	 * @see #getCSMCharacteristicDefinition()
	 * @generated
	 */
	EAttribute getCSMCharacteristicDefinition_FreeParameter();

	/**
	 * Returns the meta object for class '{@link datacore.CSMInstance <em>CSM Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CSM Instance</em>'.
	 * @see datacore.CSMInstance
	 * @generated
	 */
	EClass getCSMInstance();

	/**
	 * Returns the meta object for the containment reference list '{@link datacore.CSMInstance#getCsmValueContainer <em>Csm Value Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Csm Value Container</em>'.
	 * @see datacore.CSMInstance#getCsmValueContainer()
	 * @see #getCSMInstance()
	 * @generated
	 */
	EReference getCSMInstance_CsmValueContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link datacore.CSMInstance#getCsmReprasentation <em>Csm Reprasentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Csm Reprasentation</em>'.
	 * @see datacore.CSMInstance#getCsmReprasentation()
	 * @see #getCSMInstance()
	 * @generated
	 */
	EReference getCSMInstance_CsmReprasentation();

	/**
	 * Returns the meta object for the reference '{@link datacore.CSMInstance#getContainingCSMClass <em>Containing CSM Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Containing CSM Class</em>'.
	 * @see datacore.CSMInstance#getContainingCSMClass()
	 * @see #getCSMInstance()
	 * @generated
	 */
	EReference getCSMInstance_ContainingCSMClass();

	/**
	 * Returns the meta object for class '{@link datacore.CSMCharacteristicValueContainer <em>CSM Characteristic Value Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CSM Characteristic Value Container</em>'.
	 * @see datacore.CSMCharacteristicValueContainer
	 * @generated
	 */
	EClass getCSMCharacteristicValueContainer();

	/**
	 * Returns the meta object for the attribute '{@link datacore.CSMCharacteristicValueContainer#isValid <em>Valid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valid</em>'.
	 * @see datacore.CSMCharacteristicValueContainer#isValid()
	 * @see #getCSMCharacteristicValueContainer()
	 * @generated
	 */
	EAttribute getCSMCharacteristicValueContainer_Valid();

	/**
	 * Returns the meta object for the container reference '{@link datacore.CSMCharacteristicValueContainer#getCsmInstance <em>Csm Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Csm Instance</em>'.
	 * @see datacore.CSMCharacteristicValueContainer#getCsmInstance()
	 * @see #getCSMCharacteristicValueContainer()
	 * @generated
	 */
	EReference getCSMCharacteristicValueContainer_CsmInstance();

	/**
	 * Returns the meta object for the containment reference '{@link datacore.CSMCharacteristicValueContainer#getConcreteValue <em>Concrete Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Concrete Value</em>'.
	 * @see datacore.CSMCharacteristicValueContainer#getConcreteValue()
	 * @see #getCSMCharacteristicValueContainer()
	 * @generated
	 */
	EReference getCSMCharacteristicValueContainer_ConcreteValue();

	/**
	 * Returns the meta object for the containment reference list '{@link datacore.CSMCharacteristicValueContainer#getValueSet <em>Value Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Value Set</em>'.
	 * @see datacore.CSMCharacteristicValueContainer#getValueSet()
	 * @see #getCSMCharacteristicValueContainer()
	 * @generated
	 */
	EReference getCSMCharacteristicValueContainer_ValueSet();

	/**
	 * Returns the meta object for the reference '{@link datacore.CSMCharacteristicValueContainer#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data Type</em>'.
	 * @see datacore.CSMCharacteristicValueContainer#getDataType()
	 * @see #getCSMCharacteristicValueContainer()
	 * @generated
	 */
	EReference getCSMCharacteristicValueContainer_DataType();

	/**
	 * Returns the meta object for class '{@link datacore.CSMValueSet <em>CSM Value Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CSM Value Set</em>'.
	 * @see datacore.CSMValueSet
	 * @generated
	 */
	EClass getCSMValueSet();

	/**
	 * Returns the meta object for the reference '{@link datacore.CSMValueSet#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data Type</em>'.
	 * @see datacore.CSMValueSet#getDataType()
	 * @see #getCSMValueSet()
	 * @generated
	 */
	EReference getCSMValueSet_DataType();

	/**
	 * Returns the meta object for class '{@link datacore.CSMType <em>CSM Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CSM Type</em>'.
	 * @see datacore.CSMType
	 * @generated
	 */
	EClass getCSMType();

	/**
	 * Returns the meta object for class '{@link datacore.CSMObject <em>CSM Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CSM Object</em>'.
	 * @see datacore.CSMObject
	 * @generated
	 */
	EClass getCSMObject();

	/**
	 * Returns the meta object for class '{@link datacore.CSMRepresentationRoot <em>CSM Representation Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CSM Representation Root</em>'.
	 * @see datacore.CSMRepresentationRoot
	 * @generated
	 */
	EClass getCSMRepresentationRoot();

	/**
	 * Returns the meta object for the attribute '{@link datacore.CSMRepresentationRoot#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see datacore.CSMRepresentationRoot#getName()
	 * @see #getCSMRepresentationRoot()
	 * @generated
	 */
	EAttribute getCSMRepresentationRoot_Name();

	/**
	 * Returns the meta object for the attribute '{@link datacore.CSMRepresentationRoot#getModelName <em>Model Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model Name</em>'.
	 * @see datacore.CSMRepresentationRoot#getModelName()
	 * @see #getCSMRepresentationRoot()
	 * @generated
	 */
	EAttribute getCSMRepresentationRoot_ModelName();

	/**
	 * Returns the meta object for the container reference '{@link datacore.CSMRepresentationRoot#getCsmInstance <em>Csm Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Csm Instance</em>'.
	 * @see datacore.CSMRepresentationRoot#getCsmInstance()
	 * @see #getCSMRepresentationRoot()
	 * @generated
	 */
	EReference getCSMRepresentationRoot_CsmInstance();

	/**
	 * Returns the meta object for the containment reference '{@link datacore.CSMRepresentationRoot#getRepresentationTree <em>Representation Tree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Representation Tree</em>'.
	 * @see datacore.CSMRepresentationRoot#getRepresentationTree()
	 * @see #getCSMRepresentationRoot()
	 * @generated
	 */
	EReference getCSMRepresentationRoot_RepresentationTree();

	/**
	 * Returns the meta object for the containment reference list '{@link datacore.CSMRepresentationRoot#getValueDescriptors <em>Value Descriptors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Value Descriptors</em>'.
	 * @see datacore.CSMRepresentationRoot#getValueDescriptors()
	 * @see #getCSMRepresentationRoot()
	 * @generated
	 */
	EReference getCSMRepresentationRoot_ValueDescriptors();

	/**
	 * Returns the meta object for class '{@link datacore.CSMValue <em>CSM Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CSM Value</em>'.
	 * @see datacore.CSMValue
	 * @generated
	 */
	EClass getCSMValue();

	/**
	 * Returns the meta object for class '{@link datacore.Interval <em>Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interval</em>'.
	 * @see datacore.Interval
	 * @generated
	 */
	EClass getInterval();

	/**
	 * Returns the meta object for the containment reference '{@link datacore.Interval#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Min</em>'.
	 * @see datacore.Interval#getMin()
	 * @see #getInterval()
	 * @generated
	 */
	EReference getInterval_Min();

	/**
	 * Returns the meta object for the containment reference '{@link datacore.Interval#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Max</em>'.
	 * @see datacore.Interval#getMax()
	 * @see #getInterval()
	 * @generated
	 */
	EReference getInterval_Max();

	/**
	 * Returns the meta object for the attribute '{@link datacore.Interval#isIncludeMin <em>Include Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Include Min</em>'.
	 * @see datacore.Interval#isIncludeMin()
	 * @see #getInterval()
	 * @generated
	 */
	EAttribute getInterval_IncludeMin();

	/**
	 * Returns the meta object for the attribute '{@link datacore.Interval#isIncludeMax <em>Include Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Include Max</em>'.
	 * @see datacore.Interval#isIncludeMax()
	 * @see #getInterval()
	 * @generated
	 */
	EAttribute getInterval_IncludeMax();

	/**
	 * Returns the meta object for the reference '{@link datacore.Interval#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Kind</em>'.
	 * @see datacore.Interval#getKind()
	 * @see #getInterval()
	 * @generated
	 */
	EReference getInterval_Kind();

	/**
	 * Returns the meta object for the containment reference '{@link datacore.Interval#getIncrement <em>Increment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Increment</em>'.
	 * @see datacore.Interval#getIncrement()
	 * @see #getInterval()
	 * @generated
	 */
	EReference getInterval_Increment();

	/**
	 * Returns the meta object for class '{@link datacore.UserProperty <em>User Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Property</em>'.
	 * @see datacore.UserProperty
	 * @generated
	 */
	EClass getUserProperty();

	/**
	 * Returns the meta object for the attribute '{@link datacore.UserProperty#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see datacore.UserProperty#getName()
	 * @see #getUserProperty()
	 * @generated
	 */
	EAttribute getUserProperty_Name();

	/**
	 * Returns the meta object for the attribute '{@link datacore.UserProperty#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see datacore.UserProperty#getValue()
	 * @see #getUserProperty()
	 * @generated
	 */
	EAttribute getUserProperty_Value();

	/**
	 * Returns the meta object for class '{@link datacore.CSMRepresentation <em>CSM Representation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CSM Representation</em>'.
	 * @see datacore.CSMRepresentation
	 * @generated
	 */
	EClass getCSMRepresentation();

	/**
	 * Returns the meta object for the container reference '{@link datacore.CSMRepresentation#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see datacore.CSMRepresentation#getParent()
	 * @see #getCSMRepresentation()
	 * @generated
	 */
	EReference getCSMRepresentation_Parent();

	/**
	 * Returns the meta object for the containment reference list '{@link datacore.CSMRepresentation#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see datacore.CSMRepresentation#getChildren()
	 * @see #getCSMRepresentation()
	 * @generated
	 */
	EReference getCSMRepresentation_Children();

	/**
	 * Returns the meta object for the attribute '{@link datacore.CSMRepresentation#isValid <em>Valid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valid</em>'.
	 * @see datacore.CSMRepresentation#isValid()
	 * @see #getCSMRepresentation()
	 * @generated
	 */
	EAttribute getCSMRepresentation_Valid();

	/**
	 * Returns the meta object for the container reference '{@link datacore.CSMRepresentation#getRepresentationRoot <em>Representation Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Representation Root</em>'.
	 * @see datacore.CSMRepresentation#getRepresentationRoot()
	 * @see #getCSMRepresentation()
	 * @generated
	 */
	EReference getCSMRepresentation_RepresentationRoot();

	/**
	 * Returns the meta object for the container reference '{@link datacore.CSMRepresentation#getOwnerCSMClass <em>Owner CSM Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owner CSM Class</em>'.
	 * @see datacore.CSMRepresentation#getOwnerCSMClass()
	 * @see #getCSMRepresentation()
	 * @generated
	 */
	EReference getCSMRepresentation_OwnerCSMClass();

	/**
	 * Returns the meta object for class '{@link datacore.DataSourceDefinitions <em>Data Source Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Source Definitions</em>'.
	 * @see datacore.DataSourceDefinitions
	 * @generated
	 */
	EClass getDataSourceDefinitions();

	/**
	 * Returns the meta object for the container reference '{@link datacore.DataSourceDefinitions#getOwnerClass <em>Owner Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owner Class</em>'.
	 * @see datacore.DataSourceDefinitions#getOwnerClass()
	 * @see #getDataSourceDefinitions()
	 * @generated
	 */
	EReference getDataSourceDefinitions_OwnerClass();

	/**
	 * Returns the meta object for the attribute '{@link datacore.DataSourceDefinitions#getReport <em>Report</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Report</em>'.
	 * @see datacore.DataSourceDefinitions#getReport()
	 * @see #getDataSourceDefinitions()
	 * @generated
	 */
	EAttribute getDataSourceDefinitions_Report();

	/**
	 * Returns the meta object for class '{@link datacore.ColumnDefinition <em>Column Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Column Definition</em>'.
	 * @see datacore.ColumnDefinition
	 * @generated
	 */
	EClass getColumnDefinition();

	/**
	 * Returns the meta object for the attribute '{@link datacore.ColumnDefinition#getColumnName <em>Column Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column Name</em>'.
	 * @see datacore.ColumnDefinition#getColumnName()
	 * @see #getColumnDefinition()
	 * @generated
	 */
	EAttribute getColumnDefinition_ColumnName();

	/**
	 * Returns the meta object for the attribute '{@link datacore.ColumnDefinition#getDatasetName <em>Dataset Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dataset Name</em>'.
	 * @see datacore.ColumnDefinition#getDatasetName()
	 * @see #getColumnDefinition()
	 * @generated
	 */
	EAttribute getColumnDefinition_DatasetName();

	/**
	 * Returns the meta object for class '{@link datacore.CSMRepresentationRootDescriptor <em>CSM Representation Root Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CSM Representation Root Descriptor</em>'.
	 * @see datacore.CSMRepresentationRootDescriptor
	 * @generated
	 */
	EClass getCSMRepresentationRootDescriptor();

	/**
	 * Returns the meta object for the container reference '{@link datacore.CSMRepresentationRootDescriptor#getRepresentationRoot <em>Representation Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Representation Root</em>'.
	 * @see datacore.CSMRepresentationRootDescriptor#getRepresentationRoot()
	 * @see #getCSMRepresentationRootDescriptor()
	 * @generated
	 */
	EReference getCSMRepresentationRootDescriptor_RepresentationRoot();

	/**
	 * Returns the meta object for the attribute '{@link datacore.CSMRepresentationRootDescriptor#getCharacteristicID <em>Characteristic ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Characteristic ID</em>'.
	 * @see datacore.CSMRepresentationRootDescriptor#getCharacteristicID()
	 * @see #getCSMRepresentationRootDescriptor()
	 * @generated
	 */
	EAttribute getCSMRepresentationRootDescriptor_CharacteristicID();

	/**
	 * Returns the meta object for the attribute '{@link datacore.CSMRepresentationRootDescriptor#getCharacteriticValue <em>Characteritic Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Characteritic Value</em>'.
	 * @see datacore.CSMRepresentationRootDescriptor#getCharacteriticValue()
	 * @see #getCSMRepresentationRootDescriptor()
	 * @generated
	 */
	EAttribute getCSMRepresentationRootDescriptor_CharacteriticValue();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DatacoreFactory getDatacoreFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link datacore.impl.CSMXMLImpl <em>CSMXML</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see datacore.impl.CSMXMLImpl
		 * @see datacore.impl.DatacorePackageImpl#getCSMXML()
		 * @generated
		 */
		EClass CSMXML = eINSTANCE.getCSMXML();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CSMXML__ELEMENTS = eINSTANCE.getCSMXML_Elements();

		/**
		 * The meta object literal for the '<em><b>Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CSMXML__TYPES = eINSTANCE.getCSMXML_Types();

		/**
		 * The meta object literal for the '{@link datacore.impl.CSMElementImpl <em>CSM Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see datacore.impl.CSMElementImpl
		 * @see datacore.impl.DatacorePackageImpl#getCSMElement()
		 * @generated
		 */
		EClass CSM_ELEMENT = eINSTANCE.getCSMElement();

		/**
		 * The meta object literal for the '<em><b>Referenced Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CSM_ELEMENT__REFERENCED_ELEMENTS = eINSTANCE.getCSMElement_ReferencedElements();

		/**
		 * The meta object literal for the '<em><b>Csm XML</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CSM_ELEMENT__CSM_XML = eINSTANCE.getCSMElement_CsmXML();

		/**
		 * The meta object literal for the '{@link datacore.impl.CSMMetaElementImpl <em>CSM Meta Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see datacore.impl.CSMMetaElementImpl
		 * @see datacore.impl.DatacorePackageImpl#getCSMMetaElement()
		 * @generated
		 */
		EClass CSM_META_ELEMENT = eINSTANCE.getCSMMetaElement();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CSM_META_ELEMENT__ID = eINSTANCE.getCSMMetaElement_ID();

		/**
		 * The meta object literal for the '<em><b>User Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CSM_META_ELEMENT__USER_PROPERTIES = eINSTANCE.getCSMMetaElement_UserProperties();

		/**
		 * The meta object literal for the '{@link datacore.impl.CSMClassImpl <em>CSM Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see datacore.impl.CSMClassImpl
		 * @see datacore.impl.DatacorePackageImpl#getCSMClass()
		 * @generated
		 */
		EClass CSM_CLASS = eINSTANCE.getCSMClass();

		/**
		 * The meta object literal for the '<em><b>Csm Characteristic Definitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CSM_CLASS__CSM_CHARACTERISTIC_DEFINITIONS = eINSTANCE.getCSMClass_CsmCharacteristicDefinitions();

		/**
		 * The meta object literal for the '<em><b>Instances</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CSM_CLASS__INSTANCES = eINSTANCE.getCSMClass_Instances();

		/**
		 * The meta object literal for the '<em><b>Valid CSM Types</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CSM_CLASS__VALID_CSM_TYPES = eINSTANCE.getCSMClass_ValidCSMTypes();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CSM_CLASS__DESCRIPTION = eINSTANCE.getCSMClass_Description();

		/**
		 * The meta object literal for the '<em><b>Datasource Definition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CSM_CLASS__DATASOURCE_DEFINITION = eINSTANCE.getCSMClass_DatasourceDefinition();

		/**
		 * The meta object literal for the '<em><b>Key Charachteristic Definition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CSM_CLASS__KEY_CHARACHTERISTIC_DEFINITION = eINSTANCE.getCSMClass_KeyCharachteristicDefinition();

		/**
		 * The meta object literal for the '<em><b>Class Representations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CSM_CLASS__CLASS_REPRESENTATIONS = eINSTANCE.getCSMClass_ClassRepresentations();

		/**
		 * The meta object literal for the '{@link datacore.impl.CSMCharacteristicDefinitionImpl <em>CSM Characteristic Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see datacore.impl.CSMCharacteristicDefinitionImpl
		 * @see datacore.impl.DatacorePackageImpl#getCSMCharacteristicDefinition()
		 * @generated
		 */
		EClass CSM_CHARACTERISTIC_DEFINITION = eINSTANCE.getCSMCharacteristicDefinition();

		/**
		 * The meta object literal for the '<em><b>Csm Class</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CSM_CHARACTERISTIC_DEFINITION__CSM_CLASS = eINSTANCE.getCSMCharacteristicDefinition_CsmClass();

		/**
		 * The meta object literal for the '<em><b>Csm Characteristic Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CSM_CHARACTERISTIC_DEFINITION__CSM_CHARACTERISTIC_TYPE = eINSTANCE.getCSMCharacteristicDefinition_CsmCharacteristicType();

		/**
		 * The meta object literal for the '<em><b>User Defined</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CSM_CHARACTERISTIC_DEFINITION__USER_DEFINED = eINSTANCE.getCSMCharacteristicDefinition_UserDefined();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CSM_CHARACTERISTIC_DEFINITION__NAME = eINSTANCE.getCSMCharacteristicDefinition_Name();

		/**
		 * The meta object literal for the '<em><b>Value Container</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CSM_CHARACTERISTIC_DEFINITION__VALUE_CONTAINER = eINSTANCE.getCSMCharacteristicDefinition_ValueContainer();

		/**
		 * The meta object literal for the '<em><b>Alias Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CSM_CHARACTERISTIC_DEFINITION__ALIAS_NAME = eINSTANCE.getCSMCharacteristicDefinition_AliasName();

		/**
		 * The meta object literal for the '<em><b>Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CSM_CHARACTERISTIC_DEFINITION__INDEX = eINSTANCE.getCSMCharacteristicDefinition_Index();

		/**
		 * The meta object literal for the '<em><b>Data Source</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CSM_CHARACTERISTIC_DEFINITION__DATA_SOURCE = eINSTANCE.getCSMCharacteristicDefinition_DataSource();

		/**
		 * The meta object literal for the '<em><b>Free Parameter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CSM_CHARACTERISTIC_DEFINITION__FREE_PARAMETER = eINSTANCE.getCSMCharacteristicDefinition_FreeParameter();

		/**
		 * The meta object literal for the '{@link datacore.impl.CSMInstanceImpl <em>CSM Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see datacore.impl.CSMInstanceImpl
		 * @see datacore.impl.DatacorePackageImpl#getCSMInstance()
		 * @generated
		 */
		EClass CSM_INSTANCE = eINSTANCE.getCSMInstance();

		/**
		 * The meta object literal for the '<em><b>Csm Value Container</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CSM_INSTANCE__CSM_VALUE_CONTAINER = eINSTANCE.getCSMInstance_CsmValueContainer();

		/**
		 * The meta object literal for the '<em><b>Csm Reprasentation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CSM_INSTANCE__CSM_REPRASENTATION = eINSTANCE.getCSMInstance_CsmReprasentation();

		/**
		 * The meta object literal for the '<em><b>Containing CSM Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CSM_INSTANCE__CONTAINING_CSM_CLASS = eINSTANCE.getCSMInstance_ContainingCSMClass();

		/**
		 * The meta object literal for the '{@link datacore.impl.CSMCharacteristicValueContainerImpl <em>CSM Characteristic Value Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see datacore.impl.CSMCharacteristicValueContainerImpl
		 * @see datacore.impl.DatacorePackageImpl#getCSMCharacteristicValueContainer()
		 * @generated
		 */
		EClass CSM_CHARACTERISTIC_VALUE_CONTAINER = eINSTANCE.getCSMCharacteristicValueContainer();

		/**
		 * The meta object literal for the '<em><b>Valid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CSM_CHARACTERISTIC_VALUE_CONTAINER__VALID = eINSTANCE.getCSMCharacteristicValueContainer_Valid();

		/**
		 * The meta object literal for the '<em><b>Csm Instance</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CSM_CHARACTERISTIC_VALUE_CONTAINER__CSM_INSTANCE = eINSTANCE.getCSMCharacteristicValueContainer_CsmInstance();

		/**
		 * The meta object literal for the '<em><b>Concrete Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CSM_CHARACTERISTIC_VALUE_CONTAINER__CONCRETE_VALUE = eINSTANCE.getCSMCharacteristicValueContainer_ConcreteValue();

		/**
		 * The meta object literal for the '<em><b>Value Set</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CSM_CHARACTERISTIC_VALUE_CONTAINER__VALUE_SET = eINSTANCE.getCSMCharacteristicValueContainer_ValueSet();

		/**
		 * The meta object literal for the '<em><b>Data Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CSM_CHARACTERISTIC_VALUE_CONTAINER__DATA_TYPE = eINSTANCE.getCSMCharacteristicValueContainer_DataType();

		/**
		 * The meta object literal for the '{@link datacore.impl.CSMValueSetImpl <em>CSM Value Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see datacore.impl.CSMValueSetImpl
		 * @see datacore.impl.DatacorePackageImpl#getCSMValueSet()
		 * @generated
		 */
		EClass CSM_VALUE_SET = eINSTANCE.getCSMValueSet();

		/**
		 * The meta object literal for the '<em><b>Data Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CSM_VALUE_SET__DATA_TYPE = eINSTANCE.getCSMValueSet_DataType();

		/**
		 * The meta object literal for the '{@link datacore.impl.CSMTypeImpl <em>CSM Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see datacore.impl.CSMTypeImpl
		 * @see datacore.impl.DatacorePackageImpl#getCSMType()
		 * @generated
		 */
		EClass CSM_TYPE = eINSTANCE.getCSMType();

		/**
		 * The meta object literal for the '{@link datacore.impl.CSMObjectImpl <em>CSM Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see datacore.impl.CSMObjectImpl
		 * @see datacore.impl.DatacorePackageImpl#getCSMObject()
		 * @generated
		 */
		EClass CSM_OBJECT = eINSTANCE.getCSMObject();

		/**
		 * The meta object literal for the '{@link datacore.impl.CSMRepresentationRootImpl <em>CSM Representation Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see datacore.impl.CSMRepresentationRootImpl
		 * @see datacore.impl.DatacorePackageImpl#getCSMRepresentationRoot()
		 * @generated
		 */
		EClass CSM_REPRESENTATION_ROOT = eINSTANCE.getCSMRepresentationRoot();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CSM_REPRESENTATION_ROOT__NAME = eINSTANCE.getCSMRepresentationRoot_Name();

		/**
		 * The meta object literal for the '<em><b>Model Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CSM_REPRESENTATION_ROOT__MODEL_NAME = eINSTANCE.getCSMRepresentationRoot_ModelName();

		/**
		 * The meta object literal for the '<em><b>Csm Instance</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CSM_REPRESENTATION_ROOT__CSM_INSTANCE = eINSTANCE.getCSMRepresentationRoot_CsmInstance();

		/**
		 * The meta object literal for the '<em><b>Representation Tree</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CSM_REPRESENTATION_ROOT__REPRESENTATION_TREE = eINSTANCE.getCSMRepresentationRoot_RepresentationTree();

		/**
		 * The meta object literal for the '<em><b>Value Descriptors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CSM_REPRESENTATION_ROOT__VALUE_DESCRIPTORS = eINSTANCE.getCSMRepresentationRoot_ValueDescriptors();

		/**
		 * The meta object literal for the '{@link datacore.impl.CSMValueImpl <em>CSM Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see datacore.impl.CSMValueImpl
		 * @see datacore.impl.DatacorePackageImpl#getCSMValue()
		 * @generated
		 */
		EClass CSM_VALUE = eINSTANCE.getCSMValue();

		/**
		 * The meta object literal for the '{@link datacore.impl.IntervalImpl <em>Interval</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see datacore.impl.IntervalImpl
		 * @see datacore.impl.DatacorePackageImpl#getInterval()
		 * @generated
		 */
		EClass INTERVAL = eINSTANCE.getInterval();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERVAL__MIN = eINSTANCE.getInterval_Min();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERVAL__MAX = eINSTANCE.getInterval_Max();

		/**
		 * The meta object literal for the '<em><b>Include Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERVAL__INCLUDE_MIN = eINSTANCE.getInterval_IncludeMin();

		/**
		 * The meta object literal for the '<em><b>Include Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERVAL__INCLUDE_MAX = eINSTANCE.getInterval_IncludeMax();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERVAL__KIND = eINSTANCE.getInterval_Kind();

		/**
		 * The meta object literal for the '<em><b>Increment</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERVAL__INCREMENT = eINSTANCE.getInterval_Increment();

		/**
		 * The meta object literal for the '{@link datacore.impl.UserPropertyImpl <em>User Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see datacore.impl.UserPropertyImpl
		 * @see datacore.impl.DatacorePackageImpl#getUserProperty()
		 * @generated
		 */
		EClass USER_PROPERTY = eINSTANCE.getUserProperty();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_PROPERTY__NAME = eINSTANCE.getUserProperty_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_PROPERTY__VALUE = eINSTANCE.getUserProperty_Value();

		/**
		 * The meta object literal for the '{@link datacore.impl.CSMRepresentationImpl <em>CSM Representation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see datacore.impl.CSMRepresentationImpl
		 * @see datacore.impl.DatacorePackageImpl#getCSMRepresentation()
		 * @generated
		 */
		EClass CSM_REPRESENTATION = eINSTANCE.getCSMRepresentation();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CSM_REPRESENTATION__PARENT = eINSTANCE.getCSMRepresentation_Parent();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CSM_REPRESENTATION__CHILDREN = eINSTANCE.getCSMRepresentation_Children();

		/**
		 * The meta object literal for the '<em><b>Valid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CSM_REPRESENTATION__VALID = eINSTANCE.getCSMRepresentation_Valid();

		/**
		 * The meta object literal for the '<em><b>Representation Root</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CSM_REPRESENTATION__REPRESENTATION_ROOT = eINSTANCE.getCSMRepresentation_RepresentationRoot();

		/**
		 * The meta object literal for the '<em><b>Owner CSM Class</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CSM_REPRESENTATION__OWNER_CSM_CLASS = eINSTANCE.getCSMRepresentation_OwnerCSMClass();

		/**
		 * The meta object literal for the '{@link datacore.impl.DataSourceDefinitionsImpl <em>Data Source Definitions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see datacore.impl.DataSourceDefinitionsImpl
		 * @see datacore.impl.DatacorePackageImpl#getDataSourceDefinitions()
		 * @generated
		 */
		EClass DATA_SOURCE_DEFINITIONS = eINSTANCE.getDataSourceDefinitions();

		/**
		 * The meta object literal for the '<em><b>Owner Class</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_SOURCE_DEFINITIONS__OWNER_CLASS = eINSTANCE.getDataSourceDefinitions_OwnerClass();

		/**
		 * The meta object literal for the '<em><b>Report</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_SOURCE_DEFINITIONS__REPORT = eINSTANCE.getDataSourceDefinitions_Report();

		/**
		 * The meta object literal for the '{@link datacore.impl.ColumnDefinitionImpl <em>Column Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see datacore.impl.ColumnDefinitionImpl
		 * @see datacore.impl.DatacorePackageImpl#getColumnDefinition()
		 * @generated
		 */
		EClass COLUMN_DEFINITION = eINSTANCE.getColumnDefinition();

		/**
		 * The meta object literal for the '<em><b>Column Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN_DEFINITION__COLUMN_NAME = eINSTANCE.getColumnDefinition_ColumnName();

		/**
		 * The meta object literal for the '<em><b>Dataset Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN_DEFINITION__DATASET_NAME = eINSTANCE.getColumnDefinition_DatasetName();

		/**
		 * The meta object literal for the '{@link datacore.impl.CSMRepresentationRootDescriptorImpl <em>CSM Representation Root Descriptor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see datacore.impl.CSMRepresentationRootDescriptorImpl
		 * @see datacore.impl.DatacorePackageImpl#getCSMRepresentationRootDescriptor()
		 * @generated
		 */
		EClass CSM_REPRESENTATION_ROOT_DESCRIPTOR = eINSTANCE.getCSMRepresentationRootDescriptor();

		/**
		 * The meta object literal for the '<em><b>Representation Root</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CSM_REPRESENTATION_ROOT_DESCRIPTOR__REPRESENTATION_ROOT = eINSTANCE.getCSMRepresentationRootDescriptor_RepresentationRoot();

		/**
		 * The meta object literal for the '<em><b>Characteristic ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CSM_REPRESENTATION_ROOT_DESCRIPTOR__CHARACTERISTIC_ID = eINSTANCE.getCSMRepresentationRootDescriptor_CharacteristicID();

		/**
		 * The meta object literal for the '<em><b>Characteritic Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CSM_REPRESENTATION_ROOT_DESCRIPTOR__CHARACTERITIC_VALUE = eINSTANCE.getCSMRepresentationRootDescriptor_CharacteriticValue();

	}

} //DatacorePackage

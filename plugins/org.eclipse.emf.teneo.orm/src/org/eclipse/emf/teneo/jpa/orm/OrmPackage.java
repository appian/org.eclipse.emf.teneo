/**
 * <copyright>
 * </copyright>
 *
 * $Id: OrmPackage.java,v 1.3 2010/03/07 05:36:57 mtaal Exp $
 */
package org.eclipse.emf.teneo.jpa.orm;

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
 * @see org.eclipse.emf.teneo.jpa.orm.OrmFactory
 * @model kind="package"
 *        extendedMetaData="qualified='false'"
 * @generated
 */
public interface OrmPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "orm";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://java.sun.com/xml/ns/persistence/orm";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "orm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OrmPackage eINSTANCE = org.eclipse.emf.teneo.jpa.orm.impl.OrmPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.jpa.orm.impl.AssociationOverrideImpl <em>Association Override</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.jpa.orm.impl.AssociationOverrideImpl
	 * @see org.eclipse.emf.teneo.jpa.orm.impl.OrmPackageImpl#getAssociationOverride()
	 * @generated
	 */
	int ASSOCIATION_OVERRIDE = 0;

	/**
	 * The feature id for the '<em><b>Join Column</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_OVERRIDE__JOIN_COLUMN = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_OVERRIDE__NAME = 1;

	/**
	 * The number of structural features of the '<em>Association Override</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_OVERRIDE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.jpa.orm.impl.AttributeOverrideImpl <em>Attribute Override</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.jpa.orm.impl.AttributeOverrideImpl
	 * @see org.eclipse.emf.teneo.jpa.orm.impl.OrmPackageImpl#getAttributeOverride()
	 * @generated
	 */
	int ATTRIBUTE_OVERRIDE = 1;

	/**
	 * The feature id for the '<em><b>Column</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_OVERRIDE__COLUMN = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_OVERRIDE__NAME = 1;

	/**
	 * The number of structural features of the '<em>Attribute Override</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_OVERRIDE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.jpa.orm.impl.AttributesImpl <em>Attributes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.jpa.orm.impl.AttributesImpl
	 * @see org.eclipse.emf.teneo.jpa.orm.impl.OrmPackageImpl#getAttributes()
	 * @generated
	 */
	int ATTRIBUTES = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTES__ID = 0;

	/**
	 * The feature id for the '<em><b>Embedded Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTES__EMBEDDED_ID = 1;

	/**
	 * The feature id for the '<em><b>Basic</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTES__BASIC = 2;

	/**
	 * The feature id for the '<em><b>Version</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTES__VERSION = 3;

	/**
	 * The feature id for the '<em><b>Many To One</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTES__MANY_TO_ONE = 4;

	/**
	 * The feature id for the '<em><b>One To Many</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTES__ONE_TO_MANY = 5;

	/**
	 * The feature id for the '<em><b>One To One</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTES__ONE_TO_ONE = 6;

	/**
	 * The feature id for the '<em><b>Many To Many</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTES__MANY_TO_MANY = 7;

	/**
	 * The feature id for the '<em><b>Embedded</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTES__EMBEDDED = 8;

	/**
	 * The feature id for the '<em><b>Transient</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTES__TRANSIENT = 9;

	/**
	 * The number of structural features of the '<em>Attributes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTES_FEATURE_COUNT = 10;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.jpa.orm.impl.BasicImpl <em>Basic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.jpa.orm.impl.BasicImpl
	 * @see org.eclipse.emf.teneo.jpa.orm.impl.OrmPackageImpl#getBasic()
	 * @generated
	 */
	int BASIC = 3;

	/**
	 * The feature id for the '<em><b>Column</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC__COLUMN = 0;

	/**
	 * The feature id for the '<em><b>Lob</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC__LOB = 1;

	/**
	 * The feature id for the '<em><b>Temporal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC__TEMPORAL = 2;

	/**
	 * The feature id for the '<em><b>Enumerated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC__ENUMERATED = 3;

	/**
	 * The feature id for the '<em><b>Fetch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC__FETCH = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC__NAME = 5;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC__OPTIONAL = 6;

	/**
	 * The number of structural features of the '<em>Basic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.jpa.orm.impl.CascadeTypeImpl <em>Cascade Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.jpa.orm.impl.CascadeTypeImpl
	 * @see org.eclipse.emf.teneo.jpa.orm.impl.OrmPackageImpl#getCascadeType()
	 * @generated
	 */
	int CASCADE_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Cascade All</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASCADE_TYPE__CASCADE_ALL = 0;

	/**
	 * The feature id for the '<em><b>Cascade Persist</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASCADE_TYPE__CASCADE_PERSIST = 1;

	/**
	 * The feature id for the '<em><b>Cascade Merge</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASCADE_TYPE__CASCADE_MERGE = 2;

	/**
	 * The feature id for the '<em><b>Cascade Remove</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASCADE_TYPE__CASCADE_REMOVE = 3;

	/**
	 * The feature id for the '<em><b>Cascade Refresh</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASCADE_TYPE__CASCADE_REFRESH = 4;

	/**
	 * The number of structural features of the '<em>Cascade Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASCADE_TYPE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.jpa.orm.impl.ColumnImpl <em>Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.jpa.orm.impl.ColumnImpl
	 * @see org.eclipse.emf.teneo.jpa.orm.impl.OrmPackageImpl#getColumn()
	 * @generated
	 */
	int COLUMN = 5;

	/**
	 * The feature id for the '<em><b>Column Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__COLUMN_DEFINITION = 0;

	/**
	 * The feature id for the '<em><b>Insertable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__INSERTABLE = 1;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__LENGTH = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__NAME = 3;

	/**
	 * The feature id for the '<em><b>Nullable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__NULLABLE = 4;

	/**
	 * The feature id for the '<em><b>Precision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__PRECISION = 5;

	/**
	 * The feature id for the '<em><b>Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__SCALE = 6;

	/**
	 * The feature id for the '<em><b>Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__TABLE = 7;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__UNIQUE = 8;

	/**
	 * The feature id for the '<em><b>Updatable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__UPDATABLE = 9;

	/**
	 * The number of structural features of the '<em>Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_FEATURE_COUNT = 10;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.jpa.orm.impl.ColumnResultImpl <em>Column Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.jpa.orm.impl.ColumnResultImpl
	 * @see org.eclipse.emf.teneo.jpa.orm.impl.OrmPackageImpl#getColumnResult()
	 * @generated
	 */
	int COLUMN_RESULT = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_RESULT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Column Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_RESULT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.jpa.orm.impl.DiscriminatorColumnImpl <em>Discriminator Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.jpa.orm.impl.DiscriminatorColumnImpl
	 * @see org.eclipse.emf.teneo.jpa.orm.impl.OrmPackageImpl#getDiscriminatorColumn()
	 * @generated
	 */
	int DISCRIMINATOR_COLUMN = 7;

	/**
	 * The feature id for the '<em><b>Column Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRIMINATOR_COLUMN__COLUMN_DEFINITION = 0;

	/**
	 * The feature id for the '<em><b>Discriminator Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRIMINATOR_COLUMN__DISCRIMINATOR_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRIMINATOR_COLUMN__LENGTH = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRIMINATOR_COLUMN__NAME = 3;

	/**
	 * The number of structural features of the '<em>Discriminator Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRIMINATOR_COLUMN_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.jpa.orm.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.jpa.orm.impl.DocumentRootImpl
	 * @see org.eclipse.emf.teneo.jpa.orm.impl.OrmPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 8;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Entity Mappings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ENTITY_MAPPINGS = 3;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.jpa.orm.impl.EmbeddableImpl <em>Embeddable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.jpa.orm.impl.EmbeddableImpl
	 * @see org.eclipse.emf.teneo.jpa.orm.impl.OrmPackageImpl#getEmbeddable()
	 * @generated
	 */
	int EMBEDDABLE = 9;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBEDDABLE__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBEDDABLE__ATTRIBUTES = 1;

	/**
	 * The feature id for the '<em><b>Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBEDDABLE__ACCESS = 2;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBEDDABLE__CLASS = 3;

	/**
	 * The feature id for the '<em><b>Metadata Complete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBEDDABLE__METADATA_COMPLETE = 4;

	/**
	 * The number of structural features of the '<em>Embeddable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBEDDABLE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.jpa.orm.impl.EmbeddableAttributesImpl <em>Embeddable Attributes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.jpa.orm.impl.EmbeddableAttributesImpl
	 * @see org.eclipse.emf.teneo.jpa.orm.impl.OrmPackageImpl#getEmbeddableAttributes()
	 * @generated
	 */
	int EMBEDDABLE_ATTRIBUTES = 10;

	/**
	 * The feature id for the '<em><b>Basic</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBEDDABLE_ATTRIBUTES__BASIC = 0;

	/**
	 * The feature id for the '<em><b>Transient</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBEDDABLE_ATTRIBUTES__TRANSIENT = 1;

	/**
	 * The number of structural features of the '<em>Embeddable Attributes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBEDDABLE_ATTRIBUTES_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.jpa.orm.impl.EmbeddedImpl <em>Embedded</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.jpa.orm.impl.EmbeddedImpl
	 * @see org.eclipse.emf.teneo.jpa.orm.impl.OrmPackageImpl#getEmbedded()
	 * @generated
	 */
	int EMBEDDED = 11;

	/**
	 * The feature id for the '<em><b>Attribute Override</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBEDDED__ATTRIBUTE_OVERRIDE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBEDDED__NAME = 1;

	/**
	 * The number of structural features of the '<em>Embedded</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBEDDED_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.jpa.orm.impl.EmbeddedIdImpl <em>Embedded Id</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.jpa.orm.impl.EmbeddedIdImpl
	 * @see org.eclipse.emf.teneo.jpa.orm.impl.OrmPackageImpl#getEmbeddedId()
	 * @generated
	 */
	int EMBEDDED_ID = 12;

	/**
	 * The feature id for the '<em><b>Attribute Override</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBEDDED_ID__ATTRIBUTE_OVERRIDE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBEDDED_ID__NAME = 1;

	/**
	 * The number of structural features of the '<em>Embedded Id</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBEDDED_ID_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.jpa.orm.impl.EmptyTypeImpl <em>Empty Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.jpa.orm.impl.EmptyTypeImpl
	 * @see org.eclipse.emf.teneo.jpa.orm.impl.OrmPackageImpl#getEmptyType()
	 * @generated
	 */
	int EMPTY_TYPE = 13;

	/**
	 * The number of structural features of the '<em>Empty Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_TYPE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.jpa.orm.impl.EntityImpl <em>Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.jpa.orm.impl.EntityImpl
	 * @see org.eclipse.emf.teneo.jpa.orm.impl.OrmPackageImpl#getEntity()
	 * @generated
	 */
	int ENTITY = 14;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Table</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__TABLE = 1;

	/**
	 * The feature id for the '<em><b>Secondary Table</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__SECONDARY_TABLE = 2;

	/**
	 * The feature id for the '<em><b>Primary Key Join Column</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__PRIMARY_KEY_JOIN_COLUMN = 3;

	/**
	 * The feature id for the '<em><b>Id Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__ID_CLASS = 4;

	/**
	 * The feature id for the '<em><b>Inheritance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__INHERITANCE = 5;

	/**
	 * The feature id for the '<em><b>Discriminator Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__DISCRIMINATOR_VALUE = 6;

	/**
	 * The feature id for the '<em><b>Discriminator Column</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__DISCRIMINATOR_COLUMN = 7;

	/**
	 * The feature id for the '<em><b>Sequence Generator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__SEQUENCE_GENERATOR = 8;

	/**
	 * The feature id for the '<em><b>Table Generator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__TABLE_GENERATOR = 9;

	/**
	 * The feature id for the '<em><b>Named Query</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__NAMED_QUERY = 10;

	/**
	 * The feature id for the '<em><b>Named Native Query</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__NAMED_NATIVE_QUERY = 11;

	/**
	 * The feature id for the '<em><b>Sql Result Set Mapping</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__SQL_RESULT_SET_MAPPING = 12;

	/**
	 * The feature id for the '<em><b>Exclude Default Listeners</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__EXCLUDE_DEFAULT_LISTENERS = 13;

	/**
	 * The feature id for the '<em><b>Exclude Superclass Listeners</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__EXCLUDE_SUPERCLASS_LISTENERS = 14;

	/**
	 * The feature id for the '<em><b>Entity Listeners</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__ENTITY_LISTENERS = 15;

	/**
	 * The feature id for the '<em><b>Pre Persist</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__PRE_PERSIST = 16;

	/**
	 * The feature id for the '<em><b>Post Persist</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__POST_PERSIST = 17;

	/**
	 * The feature id for the '<em><b>Pre Remove</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__PRE_REMOVE = 18;

	/**
	 * The feature id for the '<em><b>Post Remove</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__POST_REMOVE = 19;

	/**
	 * The feature id for the '<em><b>Pre Update</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__PRE_UPDATE = 20;

	/**
	 * The feature id for the '<em><b>Post Update</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__POST_UPDATE = 21;

	/**
	 * The feature id for the '<em><b>Post Load</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__POST_LOAD = 22;

	/**
	 * The feature id for the '<em><b>Attribute Override</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__ATTRIBUTE_OVERRIDE = 23;

	/**
	 * The feature id for the '<em><b>Association Override</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__ASSOCIATION_OVERRIDE = 24;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__ATTRIBUTES = 25;

	/**
	 * The feature id for the '<em><b>Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__ACCESS = 26;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__CLASS = 27;

	/**
	 * The feature id for the '<em><b>Metadata Complete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__METADATA_COMPLETE = 28;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__NAME = 29;

	/**
	 * The number of structural features of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_FEATURE_COUNT = 30;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.jpa.orm.impl.EntityListenerImpl <em>Entity Listener</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.jpa.orm.impl.EntityListenerImpl
	 * @see org.eclipse.emf.teneo.jpa.orm.impl.OrmPackageImpl#getEntityListener()
	 * @generated
	 */
	int ENTITY_LISTENER = 15;

	/**
	 * The feature id for the '<em><b>Pre Persist</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_LISTENER__PRE_PERSIST = 0;

	/**
	 * The feature id for the '<em><b>Post Persist</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_LISTENER__POST_PERSIST = 1;

	/**
	 * The feature id for the '<em><b>Pre Remove</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_LISTENER__PRE_REMOVE = 2;

	/**
	 * The feature id for the '<em><b>Post Remove</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_LISTENER__POST_REMOVE = 3;

	/**
	 * The feature id for the '<em><b>Pre Update</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_LISTENER__PRE_UPDATE = 4;

	/**
	 * The feature id for the '<em><b>Post Update</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_LISTENER__POST_UPDATE = 5;

	/**
	 * The feature id for the '<em><b>Post Load</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_LISTENER__POST_LOAD = 6;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_LISTENER__CLASS = 7;

	/**
	 * The number of structural features of the '<em>Entity Listener</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_LISTENER_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.jpa.orm.impl.EntityListenersImpl <em>Entity Listeners</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.jpa.orm.impl.EntityListenersImpl
	 * @see org.eclipse.emf.teneo.jpa.orm.impl.OrmPackageImpl#getEntityListeners()
	 * @generated
	 */
	int ENTITY_LISTENERS = 16;

	/**
	 * The feature id for the '<em><b>Entity Listener</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_LISTENERS__ENTITY_LISTENER = 0;

	/**
	 * The number of structural features of the '<em>Entity Listeners</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_LISTENERS_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.jpa.orm.impl.EntityMappingsTypeImpl <em>Entity Mappings Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.jpa.orm.impl.EntityMappingsTypeImpl
	 * @see org.eclipse.emf.teneo.jpa.orm.impl.OrmPackageImpl#getEntityMappingsType()
	 * @generated
	 */
	int ENTITY_MAPPINGS_TYPE = 17;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_MAPPINGS_TYPE__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Persistence Unit Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_MAPPINGS_TYPE__PERSISTENCE_UNIT_METADATA = 1;

	/**
	 * The feature id for the '<em><b>Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_MAPPINGS_TYPE__PACKAGE = 2;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_MAPPINGS_TYPE__SCHEMA = 3;

	/**
	 * The feature id for the '<em><b>Catalog</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_MAPPINGS_TYPE__CATALOG = 4;

	/**
	 * The feature id for the '<em><b>Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_MAPPINGS_TYPE__ACCESS = 5;

	/**
	 * The feature id for the '<em><b>Sequence Generator</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_MAPPINGS_TYPE__SEQUENCE_GENERATOR = 6;

	/**
	 * The feature id for the '<em><b>Table Generator</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_MAPPINGS_TYPE__TABLE_GENERATOR = 7;

	/**
	 * The feature id for the '<em><b>Named Query</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_MAPPINGS_TYPE__NAMED_QUERY = 8;

	/**
	 * The feature id for the '<em><b>Named Native Query</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_MAPPINGS_TYPE__NAMED_NATIVE_QUERY = 9;

	/**
	 * The feature id for the '<em><b>Sql Result Set Mapping</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_MAPPINGS_TYPE__SQL_RESULT_SET_MAPPING = 10;

	/**
	 * The feature id for the '<em><b>Mapped Superclass</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_MAPPINGS_TYPE__MAPPED_SUPERCLASS = 11;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_MAPPINGS_TYPE__ENTITY = 12;

	/**
	 * The feature id for the '<em><b>Embeddable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_MAPPINGS_TYPE__EMBEDDABLE = 13;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_MAPPINGS_TYPE__VERSION = 14;

	/**
	 * The number of structural features of the '<em>Entity Mappings Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_MAPPINGS_TYPE_FEATURE_COUNT = 15;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.jpa.orm.impl.EntityResultImpl <em>Entity Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.jpa.orm.impl.EntityResultImpl
	 * @see org.eclipse.emf.teneo.jpa.orm.impl.OrmPackageImpl#getEntityResult()
	 * @generated
	 */
	int ENTITY_RESULT = 18;

	/**
	 * The feature id for the '<em><b>Field Result</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_RESULT__FIELD_RESULT = 0;

	/**
	 * The feature id for the '<em><b>Discriminator Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_RESULT__DISCRIMINATOR_COLUMN = 1;

	/**
	 * The feature id for the '<em><b>Entity Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_RESULT__ENTITY_CLASS = 2;

	/**
	 * The number of structural features of the '<em>Entity Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_RESULT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.jpa.orm.impl.FieldResultImpl <em>Field Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.jpa.orm.impl.FieldResultImpl
	 * @see org.eclipse.emf.teneo.jpa.orm.impl.OrmPackageImpl#getFieldResult()
	 * @generated
	 */
	int FIELD_RESULT = 19;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_RESULT__COLUMN = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_RESULT__NAME = 1;

	/**
	 * The number of structural features of the '<em>Field Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_RESULT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.jpa.orm.impl.GeneratedValueImpl <em>Generated Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.jpa.orm.impl.GeneratedValueImpl
	 * @see org.eclipse.emf.teneo.jpa.orm.impl.OrmPackageImpl#getGeneratedValue()
	 * @generated
	 */
	int GENERATED_VALUE = 20;

	/**
	 * The feature id for the '<em><b>Generator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATED_VALUE__GENERATOR = 0;

	/**
	 * The feature id for the '<em><b>Strategy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATED_VALUE__STRATEGY = 1;

	/**
	 * The number of structural features of the '<em>Generated Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATED_VALUE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.jpa.orm.impl.IdImpl <em>Id</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.jpa.orm.impl.IdImpl
	 * @see org.eclipse.emf.teneo.jpa.orm.impl.OrmPackageImpl#getId()
	 * @generated
	 */
	int ID = 21;

	/**
	 * The feature id for the '<em><b>Column</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID__COLUMN = 0;

	/**
	 * The feature id for the '<em><b>Generated Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID__GENERATED_VALUE = 1;

	/**
	 * The feature id for the '<em><b>Temporal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID__TEMPORAL = 2;

	/**
	 * The feature id for the '<em><b>Table Generator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID__TABLE_GENERATOR = 3;

	/**
	 * The feature id for the '<em><b>Sequence Generator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID__SEQUENCE_GENERATOR = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID__NAME = 5;

	/**
	 * The number of structural features of the '<em>Id</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.jpa.orm.impl.IdClassImpl <em>Id Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.jpa.orm.impl.IdClassImpl
	 * @see org.eclipse.emf.teneo.jpa.orm.impl.OrmPackageImpl#getIdClass()
	 * @generated
	 */
	int ID_CLASS = 22;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_CLASS__CLASS = 0;

	/**
	 * The number of structural features of the '<em>Id Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_CLASS_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.jpa.orm.impl.InheritanceImpl <em>Inheritance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.jpa.orm.impl.InheritanceImpl
	 * @see org.eclipse.emf.teneo.jpa.orm.impl.OrmPackageImpl#getInheritance()
	 * @generated
	 */
	int INHERITANCE = 23;

	/**
	 * The feature id for the '<em><b>Strategy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITANCE__STRATEGY = 0;

	/**
	 * The number of structural features of the '<em>Inheritance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITANCE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.jpa.orm.impl.JoinColumnImpl <em>Join Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.jpa.orm.impl.JoinColumnImpl
	 * @see org.eclipse.emf.teneo.jpa.orm.impl.OrmPackageImpl#getJoinColumn()
	 * @generated
	 */
	int JOIN_COLUMN = 24;

	/**
	 * The feature id for the '<em><b>Column Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_COLUMN__COLUMN_DEFINITION = 0;

	/**
	 * The feature id for the '<em><b>Insertable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_COLUMN__INSERTABLE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_COLUMN__NAME = 2;

	/**
	 * The feature id for the '<em><b>Nullable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_COLUMN__NULLABLE = 3;

	/**
	 * The feature id for the '<em><b>Referenced Column Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_COLUMN__REFERENCED_COLUMN_NAME = 4;

	/**
	 * The feature id for the '<em><b>Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_COLUMN__TABLE = 5;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_COLUMN__UNIQUE = 6;

	/**
	 * The feature id for the '<em><b>Updatable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_COLUMN__UPDATABLE = 7;

	/**
	 * The number of structural features of the '<em>Join Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_COLUMN_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.jpa.orm.impl.JoinTableImpl <em>Join Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.jpa.orm.impl.JoinTableImpl
	 * @see org.eclipse.emf.teneo.jpa.orm.impl.OrmPackageImpl#getJoinTable()
	 * @generated
	 */
	int JOIN_TABLE = 25;

	/**
	 * The feature id for the '<em><b>Join Column</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_TABLE__JOIN_COLUMN = 0;

	/**
	 * The feature id for the '<em><b>Inverse Join Column</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_TABLE__INVERSE_JOIN_COLUMN = 1;

	/**
	 * The feature id for the '<em><b>Unique Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_TABLE__UNIQUE_CONSTRAINT = 2;

	/**
	 * The feature id for the '<em><b>Catalog</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_TABLE__CATALOG = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_TABLE__NAME = 4;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_TABLE__SCHEMA = 5;

	/**
	 * The number of structural features of the '<em>Join Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_TABLE_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.jpa.orm.impl.LobImpl <em>Lob</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.jpa.orm.impl.LobImpl
	 * @see org.eclipse.emf.teneo.jpa.orm.impl.OrmPackageImpl#getLob()
	 * @generated
	 */
	int LOB = 26;

	/**
	 * The number of structural features of the '<em>Lob</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOB_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.jpa.orm.impl.ManyToManyImpl <em>Many To Many</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.jpa.orm.impl.ManyToManyImpl
	 * @see org.eclipse.emf.teneo.jpa.orm.impl.OrmPackageImpl#getManyToMany()
	 * @generated
	 */
	int MANY_TO_MANY = 27;

	/**
	 * The feature id for the '<em><b>Order By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_MANY__ORDER_BY = 0;

	/**
	 * The feature id for the '<em><b>Map Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_MANY__MAP_KEY = 1;

	/**
	 * The feature id for the '<em><b>Join Table</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_MANY__JOIN_TABLE = 2;

	/**
	 * The feature id for the '<em><b>Cascade</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_MANY__CASCADE = 3;

	/**
	 * The feature id for the '<em><b>Fetch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_MANY__FETCH = 4;

	/**
	 * The feature id for the '<em><b>Mapped By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_MANY__MAPPED_BY = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_MANY__NAME = 6;

	/**
	 * The feature id for the '<em><b>Target Entity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_MANY__TARGET_ENTITY = 7;

	/**
	 * The number of structural features of the '<em>Many To Many</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_MANY_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.jpa.orm.impl.ManyToOneImpl <em>Many To One</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.jpa.orm.impl.ManyToOneImpl
	 * @see org.eclipse.emf.teneo.jpa.orm.impl.OrmPackageImpl#getManyToOne()
	 * @generated
	 */
	int MANY_TO_ONE = 28;

	/**
	 * The feature id for the '<em><b>Join Column</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_ONE__JOIN_COLUMN = 0;

	/**
	 * The feature id for the '<em><b>Join Table</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_ONE__JOIN_TABLE = 1;

	/**
	 * The feature id for the '<em><b>Cascade</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_ONE__CASCADE = 2;

	/**
	 * The feature id for the '<em><b>Fetch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_ONE__FETCH = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_ONE__NAME = 4;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_ONE__OPTIONAL = 5;

	/**
	 * The feature id for the '<em><b>Target Entity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_ONE__TARGET_ENTITY = 6;

	/**
	 * The number of structural features of the '<em>Many To One</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_ONE_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.jpa.orm.impl.MapKeyImpl <em>Map Key</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.jpa.orm.impl.MapKeyImpl
	 * @see org.eclipse.emf.teneo.jpa.orm.impl.OrmPackageImpl#getMapKey()
	 * @generated
	 */
	int MAP_KEY = 29;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_KEY__NAME = 0;

	/**
	 * The number of structural features of the '<em>Map Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_KEY_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.jpa.orm.impl.MappedSuperclassImpl <em>Mapped Superclass</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.jpa.orm.impl.MappedSuperclassImpl
	 * @see org.eclipse.emf.teneo.jpa.orm.impl.OrmPackageImpl#getMappedSuperclass()
	 * @generated
	 */
	int MAPPED_SUPERCLASS = 30;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPED_SUPERCLASS__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Id Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPED_SUPERCLASS__ID_CLASS = 1;

	/**
	 * The feature id for the '<em><b>Exclude Default Listeners</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPED_SUPERCLASS__EXCLUDE_DEFAULT_LISTENERS = 2;

	/**
	 * The feature id for the '<em><b>Exclude Superclass Listeners</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPED_SUPERCLASS__EXCLUDE_SUPERCLASS_LISTENERS = 3;

	/**
	 * The feature id for the '<em><b>Entity Listeners</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPED_SUPERCLASS__ENTITY_LISTENERS = 4;

	/**
	 * The feature id for the '<em><b>Pre Persist</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPED_SUPERCLASS__PRE_PERSIST = 5;

	/**
	 * The feature id for the '<em><b>Post Persist</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPED_SUPERCLASS__POST_PERSIST = 6;

	/**
	 * The feature id for the '<em><b>Pre Remove</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPED_SUPERCLASS__PRE_REMOVE = 7;

	/**
	 * The feature id for the '<em><b>Post Remove</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPED_SUPERCLASS__POST_REMOVE = 8;

	/**
	 * The feature id for the '<em><b>Pre Update</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPED_SUPERCLASS__PRE_UPDATE = 9;

	/**
	 * The feature id for the '<em><b>Post Update</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPED_SUPERCLASS__POST_UPDATE = 10;

	/**
	 * The feature id for the '<em><b>Post Load</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPED_SUPERCLASS__POST_LOAD = 11;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPED_SUPERCLASS__ATTRIBUTES = 12;

	/**
	 * The feature id for the '<em><b>Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPED_SUPERCLASS__ACCESS = 13;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPED_SUPERCLASS__CLASS = 14;

	/**
	 * The feature id for the '<em><b>Metadata Complete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPED_SUPERCLASS__METADATA_COMPLETE = 15;

	/**
	 * The number of structural features of the '<em>Mapped Superclass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPED_SUPERCLASS_FEATURE_COUNT = 16;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.jpa.orm.impl.NamedNativeQueryImpl <em>Named Native Query</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.jpa.orm.impl.NamedNativeQueryImpl
	 * @see org.eclipse.emf.teneo.jpa.orm.impl.OrmPackageImpl#getNamedNativeQuery()
	 * @generated
	 */
	int NAMED_NATIVE_QUERY = 31;

	/**
	 * The feature id for the '<em><b>Query</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_NATIVE_QUERY__QUERY = 0;

	/**
	 * The feature id for the '<em><b>Hint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_NATIVE_QUERY__HINT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_NATIVE_QUERY__NAME = 2;

	/**
	 * The feature id for the '<em><b>Result Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_NATIVE_QUERY__RESULT_CLASS = 3;

	/**
	 * The feature id for the '<em><b>Result Set Mapping</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_NATIVE_QUERY__RESULT_SET_MAPPING = 4;

	/**
	 * The number of structural features of the '<em>Named Native Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_NATIVE_QUERY_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.jpa.orm.impl.NamedQueryImpl <em>Named Query</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.jpa.orm.impl.NamedQueryImpl
	 * @see org.eclipse.emf.teneo.jpa.orm.impl.OrmPackageImpl#getNamedQuery()
	 * @generated
	 */
	int NAMED_QUERY = 32;

	/**
	 * The feature id for the '<em><b>Query</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_QUERY__QUERY = 0;

	/**
	 * The feature id for the '<em><b>Hint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_QUERY__HINT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_QUERY__NAME = 2;

	/**
	 * The number of structural features of the '<em>Named Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_QUERY_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.jpa.orm.impl.OneToManyImpl <em>One To Many</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.jpa.orm.impl.OneToManyImpl
	 * @see org.eclipse.emf.teneo.jpa.orm.impl.OrmPackageImpl#getOneToMany()
	 * @generated
	 */
	int ONE_TO_MANY = 33;

	/**
	 * The feature id for the '<em><b>Order By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_MANY__ORDER_BY = 0;

	/**
	 * The feature id for the '<em><b>Map Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_MANY__MAP_KEY = 1;

	/**
	 * The feature id for the '<em><b>Join Table</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_MANY__JOIN_TABLE = 2;

	/**
	 * The feature id for the '<em><b>Join Column</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_MANY__JOIN_COLUMN = 3;

	/**
	 * The feature id for the '<em><b>Cascade</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_MANY__CASCADE = 4;

	/**
	 * The feature id for the '<em><b>Fetch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_MANY__FETCH = 5;

	/**
	 * The feature id for the '<em><b>Mapped By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_MANY__MAPPED_BY = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_MANY__NAME = 7;

	/**
	 * The feature id for the '<em><b>Target Entity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_MANY__TARGET_ENTITY = 8;

	/**
	 * The number of structural features of the '<em>One To Many</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_MANY_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.jpa.orm.impl.OneToOneImpl <em>One To One</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.jpa.orm.impl.OneToOneImpl
	 * @see org.eclipse.emf.teneo.jpa.orm.impl.OrmPackageImpl#getOneToOne()
	 * @generated
	 */
	int ONE_TO_ONE = 34;

	/**
	 * The feature id for the '<em><b>Primary Key Join Column</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_ONE__PRIMARY_KEY_JOIN_COLUMN = 0;

	/**
	 * The feature id for the '<em><b>Join Column</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_ONE__JOIN_COLUMN = 1;

	/**
	 * The feature id for the '<em><b>Join Table</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_ONE__JOIN_TABLE = 2;

	/**
	 * The feature id for the '<em><b>Cascade</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_ONE__CASCADE = 3;

	/**
	 * The feature id for the '<em><b>Fetch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_ONE__FETCH = 4;

	/**
	 * The feature id for the '<em><b>Mapped By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_ONE__MAPPED_BY = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_ONE__NAME = 6;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_ONE__OPTIONAL = 7;

	/**
	 * The feature id for the '<em><b>Target Entity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_ONE__TARGET_ENTITY = 8;

	/**
	 * The number of structural features of the '<em>One To One</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_ONE_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.jpa.orm.impl.PersistenceUnitDefaultsImpl <em>Persistence Unit Defaults</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.jpa.orm.impl.PersistenceUnitDefaultsImpl
	 * @see org.eclipse.emf.teneo.jpa.orm.impl.OrmPackageImpl#getPersistenceUnitDefaults()
	 * @generated
	 */
	int PERSISTENCE_UNIT_DEFAULTS = 35;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_UNIT_DEFAULTS__SCHEMA = 0;

	/**
	 * The feature id for the '<em><b>Catalog</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_UNIT_DEFAULTS__CATALOG = 1;

	/**
	 * The feature id for the '<em><b>Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_UNIT_DEFAULTS__ACCESS = 2;

	/**
	 * The feature id for the '<em><b>Cascade Persist</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_UNIT_DEFAULTS__CASCADE_PERSIST = 3;

	/**
	 * The feature id for the '<em><b>Entity Listeners</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_UNIT_DEFAULTS__ENTITY_LISTENERS = 4;

	/**
	 * The number of structural features of the '<em>Persistence Unit Defaults</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_UNIT_DEFAULTS_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.jpa.orm.impl.PersistenceUnitMetadataImpl <em>Persistence Unit Metadata</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.jpa.orm.impl.PersistenceUnitMetadataImpl
	 * @see org.eclipse.emf.teneo.jpa.orm.impl.OrmPackageImpl#getPersistenceUnitMetadata()
	 * @generated
	 */
	int PERSISTENCE_UNIT_METADATA = 36;

	/**
	 * The feature id for the '<em><b>Xml Mapping Metadata Complete</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_UNIT_METADATA__XML_MAPPING_METADATA_COMPLETE = 0;

	/**
	 * The feature id for the '<em><b>Persistence Unit Defaults</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_UNIT_METADATA__PERSISTENCE_UNIT_DEFAULTS = 1;

	/**
	 * The number of structural features of the '<em>Persistence Unit Metadata</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_UNIT_METADATA_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.jpa.orm.impl.PostLoadImpl <em>Post Load</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.jpa.orm.impl.PostLoadImpl
	 * @see org.eclipse.emf.teneo.jpa.orm.impl.OrmPackageImpl#getPostLoad()
	 * @generated
	 */
	int POST_LOAD = 37;

	/**
	 * The feature id for the '<em><b>Method Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_LOAD__METHOD_NAME = 0;

	/**
	 * The number of structural features of the '<em>Post Load</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_LOAD_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.jpa.orm.impl.PostPersistImpl <em>Post Persist</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.jpa.orm.impl.PostPersistImpl
	 * @see org.eclipse.emf.teneo.jpa.orm.impl.OrmPackageImpl#getPostPersist()
	 * @generated
	 */
	int POST_PERSIST = 38;

	/**
	 * The feature id for the '<em><b>Method Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_PERSIST__METHOD_NAME = 0;

	/**
	 * The number of structural features of the '<em>Post Persist</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_PERSIST_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.jpa.orm.impl.PostRemoveImpl <em>Post Remove</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.jpa.orm.impl.PostRemoveImpl
	 * @see org.eclipse.emf.teneo.jpa.orm.impl.OrmPackageImpl#getPostRemove()
	 * @generated
	 */
	int POST_REMOVE = 39;

	/**
	 * The feature id for the '<em><b>Method Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_REMOVE__METHOD_NAME = 0;

	/**
	 * The number of structural features of the '<em>Post Remove</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_REMOVE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.jpa.orm.impl.PostUpdateImpl <em>Post Update</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.jpa.orm.impl.PostUpdateImpl
	 * @see org.eclipse.emf.teneo.jpa.orm.impl.OrmPackageImpl#getPostUpdate()
	 * @generated
	 */
	int POST_UPDATE = 40;

	/**
	 * The feature id for the '<em><b>Method Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_UPDATE__METHOD_NAME = 0;

	/**
	 * The number of structural features of the '<em>Post Update</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_UPDATE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.jpa.orm.impl.PrePersistImpl <em>Pre Persist</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.jpa.orm.impl.PrePersistImpl
	 * @see org.eclipse.emf.teneo.jpa.orm.impl.OrmPackageImpl#getPrePersist()
	 * @generated
	 */
	int PRE_PERSIST = 41;

	/**
	 * The feature id for the '<em><b>Method Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_PERSIST__METHOD_NAME = 0;

	/**
	 * The number of structural features of the '<em>Pre Persist</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_PERSIST_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.jpa.orm.impl.PreRemoveImpl <em>Pre Remove</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.jpa.orm.impl.PreRemoveImpl
	 * @see org.eclipse.emf.teneo.jpa.orm.impl.OrmPackageImpl#getPreRemove()
	 * @generated
	 */
	int PRE_REMOVE = 42;

	/**
	 * The feature id for the '<em><b>Method Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_REMOVE__METHOD_NAME = 0;

	/**
	 * The number of structural features of the '<em>Pre Remove</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_REMOVE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.jpa.orm.impl.PreUpdateImpl <em>Pre Update</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.jpa.orm.impl.PreUpdateImpl
	 * @see org.eclipse.emf.teneo.jpa.orm.impl.OrmPackageImpl#getPreUpdate()
	 * @generated
	 */
	int PRE_UPDATE = 43;

	/**
	 * The feature id for the '<em><b>Method Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_UPDATE__METHOD_NAME = 0;

	/**
	 * The number of structural features of the '<em>Pre Update</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_UPDATE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.jpa.orm.impl.PrimaryKeyJoinColumnImpl <em>Primary Key Join Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.jpa.orm.impl.PrimaryKeyJoinColumnImpl
	 * @see org.eclipse.emf.teneo.jpa.orm.impl.OrmPackageImpl#getPrimaryKeyJoinColumn()
	 * @generated
	 */
	int PRIMARY_KEY_JOIN_COLUMN = 44;

	/**
	 * The feature id for the '<em><b>Column Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_KEY_JOIN_COLUMN__COLUMN_DEFINITION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_KEY_JOIN_COLUMN__NAME = 1;

	/**
	 * The feature id for the '<em><b>Referenced Column Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_KEY_JOIN_COLUMN__REFERENCED_COLUMN_NAME = 2;

	/**
	 * The number of structural features of the '<em>Primary Key Join Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_KEY_JOIN_COLUMN_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.jpa.orm.impl.QueryHintImpl <em>Query Hint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.jpa.orm.impl.QueryHintImpl
	 * @see org.eclipse.emf.teneo.jpa.orm.impl.OrmPackageImpl#getQueryHint()
	 * @generated
	 */
	int QUERY_HINT = 45;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_HINT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_HINT__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Query Hint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_HINT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.jpa.orm.impl.SecondaryTableImpl <em>Secondary Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.jpa.orm.impl.SecondaryTableImpl
	 * @see org.eclipse.emf.teneo.jpa.orm.impl.OrmPackageImpl#getSecondaryTable()
	 * @generated
	 */
	int SECONDARY_TABLE = 46;

	/**
	 * The feature id for the '<em><b>Primary Key Join Column</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECONDARY_TABLE__PRIMARY_KEY_JOIN_COLUMN = 0;

	/**
	 * The feature id for the '<em><b>Unique Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECONDARY_TABLE__UNIQUE_CONSTRAINT = 1;

	/**
	 * The feature id for the '<em><b>Catalog</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECONDARY_TABLE__CATALOG = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECONDARY_TABLE__NAME = 3;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECONDARY_TABLE__SCHEMA = 4;

	/**
	 * The number of structural features of the '<em>Secondary Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECONDARY_TABLE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.jpa.orm.impl.SequenceGeneratorImpl <em>Sequence Generator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.jpa.orm.impl.SequenceGeneratorImpl
	 * @see org.eclipse.emf.teneo.jpa.orm.impl.OrmPackageImpl#getSequenceGenerator()
	 * @generated
	 */
	int SEQUENCE_GENERATOR = 47;

	/**
	 * The feature id for the '<em><b>Allocation Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_GENERATOR__ALLOCATION_SIZE = 0;

	/**
	 * The feature id for the '<em><b>Initial Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_GENERATOR__INITIAL_VALUE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_GENERATOR__NAME = 2;

	/**
	 * The feature id for the '<em><b>Sequence Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_GENERATOR__SEQUENCE_NAME = 3;

	/**
	 * The number of structural features of the '<em>Sequence Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_GENERATOR_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.jpa.orm.impl.SqlResultSetMappingImpl <em>Sql Result Set Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.jpa.orm.impl.SqlResultSetMappingImpl
	 * @see org.eclipse.emf.teneo.jpa.orm.impl.OrmPackageImpl#getSqlResultSetMapping()
	 * @generated
	 */
	int SQL_RESULT_SET_MAPPING = 48;

	/**
	 * The feature id for the '<em><b>Entity Result</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_RESULT_SET_MAPPING__ENTITY_RESULT = 0;

	/**
	 * The feature id for the '<em><b>Column Result</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_RESULT_SET_MAPPING__COLUMN_RESULT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_RESULT_SET_MAPPING__NAME = 2;

	/**
	 * The number of structural features of the '<em>Sql Result Set Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_RESULT_SET_MAPPING_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.jpa.orm.impl.TableImpl <em>Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.jpa.orm.impl.TableImpl
	 * @see org.eclipse.emf.teneo.jpa.orm.impl.OrmPackageImpl#getTable()
	 * @generated
	 */
	int TABLE = 49;

	/**
	 * The feature id for the '<em><b>Unique Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__UNIQUE_CONSTRAINT = 0;

	/**
	 * The feature id for the '<em><b>Catalog</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__CATALOG = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__NAME = 2;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__SCHEMA = 3;

	/**
	 * The number of structural features of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.jpa.orm.impl.TableGeneratorImpl <em>Table Generator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.jpa.orm.impl.TableGeneratorImpl
	 * @see org.eclipse.emf.teneo.jpa.orm.impl.OrmPackageImpl#getTableGenerator()
	 * @generated
	 */
	int TABLE_GENERATOR = 50;

	/**
	 * The feature id for the '<em><b>Unique Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_GENERATOR__UNIQUE_CONSTRAINT = 0;

	/**
	 * The feature id for the '<em><b>Allocation Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_GENERATOR__ALLOCATION_SIZE = 1;

	/**
	 * The feature id for the '<em><b>Catalog</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_GENERATOR__CATALOG = 2;

	/**
	 * The feature id for the '<em><b>Initial Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_GENERATOR__INITIAL_VALUE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_GENERATOR__NAME = 4;

	/**
	 * The feature id for the '<em><b>Pk Column Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_GENERATOR__PK_COLUMN_NAME = 5;

	/**
	 * The feature id for the '<em><b>Pk Column Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_GENERATOR__PK_COLUMN_VALUE = 6;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_GENERATOR__SCHEMA = 7;

	/**
	 * The feature id for the '<em><b>Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_GENERATOR__TABLE = 8;

	/**
	 * The feature id for the '<em><b>Value Column Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_GENERATOR__VALUE_COLUMN_NAME = 9;

	/**
	 * The number of structural features of the '<em>Table Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_GENERATOR_FEATURE_COUNT = 10;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.jpa.orm.impl.TransientImpl <em>Transient</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.jpa.orm.impl.TransientImpl
	 * @see org.eclipse.emf.teneo.jpa.orm.impl.OrmPackageImpl#getTransient()
	 * @generated
	 */
	int TRANSIENT = 51;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSIENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Transient</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSIENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.jpa.orm.impl.UniqueConstraintImpl <em>Unique Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.jpa.orm.impl.UniqueConstraintImpl
	 * @see org.eclipse.emf.teneo.jpa.orm.impl.OrmPackageImpl#getUniqueConstraint()
	 * @generated
	 */
	int UNIQUE_CONSTRAINT = 52;

	/**
	 * The feature id for the '<em><b>Column Name</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUE_CONSTRAINT__COLUMN_NAME = 0;

	/**
	 * The number of structural features of the '<em>Unique Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUE_CONSTRAINT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.jpa.orm.impl.VersionImpl <em>Version</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.jpa.orm.impl.VersionImpl
	 * @see org.eclipse.emf.teneo.jpa.orm.impl.OrmPackageImpl#getVersion()
	 * @generated
	 */
	int VERSION = 53;

	/**
	 * The feature id for the '<em><b>Column</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION__COLUMN = 0;

	/**
	 * The feature id for the '<em><b>Temporal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION__TEMPORAL = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION__NAME = 2;

	/**
	 * The number of structural features of the '<em>Version</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.jpa.orm.AccessType <em>Access Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.jpa.orm.AccessType
	 * @see org.eclipse.emf.teneo.jpa.orm.impl.OrmPackageImpl#getAccessType()
	 * @generated
	 */
	int ACCESS_TYPE = 54;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.jpa.orm.DiscriminatorType <em>Discriminator Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.jpa.orm.DiscriminatorType
	 * @see org.eclipse.emf.teneo.jpa.orm.impl.OrmPackageImpl#getDiscriminatorType()
	 * @generated
	 */
	int DISCRIMINATOR_TYPE = 55;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.jpa.orm.EnumType <em>Enum Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.jpa.orm.EnumType
	 * @see org.eclipse.emf.teneo.jpa.orm.impl.OrmPackageImpl#getEnumType()
	 * @generated
	 */
	int ENUM_TYPE = 56;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.jpa.orm.FetchType <em>Fetch Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.jpa.orm.FetchType
	 * @see org.eclipse.emf.teneo.jpa.orm.impl.OrmPackageImpl#getFetchType()
	 * @generated
	 */
	int FETCH_TYPE = 57;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.jpa.orm.GenerationType <em>Generation Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.jpa.orm.GenerationType
	 * @see org.eclipse.emf.teneo.jpa.orm.impl.OrmPackageImpl#getGenerationType()
	 * @generated
	 */
	int GENERATION_TYPE = 58;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.jpa.orm.InheritanceType <em>Inheritance Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.jpa.orm.InheritanceType
	 * @see org.eclipse.emf.teneo.jpa.orm.impl.OrmPackageImpl#getInheritanceType()
	 * @generated
	 */
	int INHERITANCE_TYPE = 59;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.jpa.orm.TemporalType <em>Temporal Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.jpa.orm.TemporalType
	 * @see org.eclipse.emf.teneo.jpa.orm.impl.OrmPackageImpl#getTemporalType()
	 * @generated
	 */
	int TEMPORAL_TYPE = 60;

	/**
	 * The meta object id for the '<em>Access Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.jpa.orm.AccessType
	 * @see org.eclipse.emf.teneo.jpa.orm.impl.OrmPackageImpl#getAccessTypeObject()
	 * @generated
	 */
	int ACCESS_TYPE_OBJECT = 61;

	/**
	 * The meta object id for the '<em>Discriminator Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.jpa.orm.DiscriminatorType
	 * @see org.eclipse.emf.teneo.jpa.orm.impl.OrmPackageImpl#getDiscriminatorTypeObject()
	 * @generated
	 */
	int DISCRIMINATOR_TYPE_OBJECT = 62;

	/**
	 * The meta object id for the '<em>Discriminator Value</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.emf.teneo.jpa.orm.impl.OrmPackageImpl#getDiscriminatorValue()
	 * @generated
	 */
	int DISCRIMINATOR_VALUE = 63;

	/**
	 * The meta object id for the '<em>Enumerated</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.jpa.orm.EnumType
	 * @see org.eclipse.emf.teneo.jpa.orm.impl.OrmPackageImpl#getEnumerated()
	 * @generated
	 */
	int ENUMERATED = 64;

	/**
	 * The meta object id for the '<em>Enum Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.jpa.orm.EnumType
	 * @see org.eclipse.emf.teneo.jpa.orm.impl.OrmPackageImpl#getEnumTypeObject()
	 * @generated
	 */
	int ENUM_TYPE_OBJECT = 65;

	/**
	 * The meta object id for the '<em>Fetch Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.jpa.orm.FetchType
	 * @see org.eclipse.emf.teneo.jpa.orm.impl.OrmPackageImpl#getFetchTypeObject()
	 * @generated
	 */
	int FETCH_TYPE_OBJECT = 66;

	/**
	 * The meta object id for the '<em>Generation Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.jpa.orm.GenerationType
	 * @see org.eclipse.emf.teneo.jpa.orm.impl.OrmPackageImpl#getGenerationTypeObject()
	 * @generated
	 */
	int GENERATION_TYPE_OBJECT = 67;

	/**
	 * The meta object id for the '<em>Inheritance Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.jpa.orm.InheritanceType
	 * @see org.eclipse.emf.teneo.jpa.orm.impl.OrmPackageImpl#getInheritanceTypeObject()
	 * @generated
	 */
	int INHERITANCE_TYPE_OBJECT = 68;

	/**
	 * The meta object id for the '<em>Order By</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.emf.teneo.jpa.orm.impl.OrmPackageImpl#getOrderBy()
	 * @generated
	 */
	int ORDER_BY = 69;

	/**
	 * The meta object id for the '<em>Temporal</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.jpa.orm.TemporalType
	 * @see org.eclipse.emf.teneo.jpa.orm.impl.OrmPackageImpl#getTemporal()
	 * @generated
	 */
	int TEMPORAL = 70;

	/**
	 * The meta object id for the '<em>Temporal Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.jpa.orm.TemporalType
	 * @see org.eclipse.emf.teneo.jpa.orm.impl.OrmPackageImpl#getTemporalTypeObject()
	 * @generated
	 */
	int TEMPORAL_TYPE_OBJECT = 71;

	/**
	 * The meta object id for the '<em>Version Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.emf.teneo.jpa.orm.impl.OrmPackageImpl#getVersionType()
	 * @generated
	 */
	int VERSION_TYPE = 72;


	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.jpa.orm.AssociationOverride <em>Association Override</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Association Override</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.AssociationOverride
	 * @generated
	 */
	EClass getAssociationOverride();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.jpa.orm.AssociationOverride#getJoinColumn <em>Join Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Join Column</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.AssociationOverride#getJoinColumn()
	 * @see #getAssociationOverride()
	 * @generated
	 */
	EReference getAssociationOverride_JoinColumn();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.jpa.orm.AssociationOverride#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.AssociationOverride#getName()
	 * @see #getAssociationOverride()
	 * @generated
	 */
	EAttribute getAssociationOverride_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.jpa.orm.AttributeOverride <em>Attribute Override</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Override</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.AttributeOverride
	 * @generated
	 */
	EClass getAttributeOverride();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.jpa.orm.AttributeOverride#getColumn <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Column</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.AttributeOverride#getColumn()
	 * @see #getAttributeOverride()
	 * @generated
	 */
	EReference getAttributeOverride_Column();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.jpa.orm.AttributeOverride#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.AttributeOverride#getName()
	 * @see #getAttributeOverride()
	 * @generated
	 */
	EAttribute getAttributeOverride_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.jpa.orm.Attributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attributes</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.Attributes
	 * @generated
	 */
	EClass getAttributes();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.jpa.orm.Attributes#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Id</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.Attributes#getId()
	 * @see #getAttributes()
	 * @generated
	 */
	EReference getAttributes_Id();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.jpa.orm.Attributes#getEmbeddedId <em>Embedded Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Embedded Id</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.Attributes#getEmbeddedId()
	 * @see #getAttributes()
	 * @generated
	 */
	EReference getAttributes_EmbeddedId();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.jpa.orm.Attributes#getBasic <em>Basic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Basic</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.Attributes#getBasic()
	 * @see #getAttributes()
	 * @generated
	 */
	EReference getAttributes_Basic();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.jpa.orm.Attributes#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Version</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.Attributes#getVersion()
	 * @see #getAttributes()
	 * @generated
	 */
	EReference getAttributes_Version();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.jpa.orm.Attributes#getManyToOne <em>Many To One</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Many To One</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.Attributes#getManyToOne()
	 * @see #getAttributes()
	 * @generated
	 */
	EReference getAttributes_ManyToOne();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.jpa.orm.Attributes#getOneToMany <em>One To Many</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>One To Many</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.Attributes#getOneToMany()
	 * @see #getAttributes()
	 * @generated
	 */
	EReference getAttributes_OneToMany();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.jpa.orm.Attributes#getOneToOne <em>One To One</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>One To One</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.Attributes#getOneToOne()
	 * @see #getAttributes()
	 * @generated
	 */
	EReference getAttributes_OneToOne();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.jpa.orm.Attributes#getManyToMany <em>Many To Many</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Many To Many</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.Attributes#getManyToMany()
	 * @see #getAttributes()
	 * @generated
	 */
	EReference getAttributes_ManyToMany();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.jpa.orm.Attributes#getEmbedded <em>Embedded</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Embedded</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.Attributes#getEmbedded()
	 * @see #getAttributes()
	 * @generated
	 */
	EReference getAttributes_Embedded();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.jpa.orm.Attributes#getTransient <em>Transient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transient</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.Attributes#getTransient()
	 * @see #getAttributes()
	 * @generated
	 */
	EReference getAttributes_Transient();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.jpa.orm.Basic <em>Basic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Basic</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.Basic
	 * @generated
	 */
	EClass getBasic();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.jpa.orm.Basic#getColumn <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Column</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.Basic#getColumn()
	 * @see #getBasic()
	 * @generated
	 */
	EReference getBasic_Column();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.jpa.orm.Basic#getLob <em>Lob</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lob</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.Basic#getLob()
	 * @see #getBasic()
	 * @generated
	 */
	EReference getBasic_Lob();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.jpa.orm.Basic#getTemporal <em>Temporal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Temporal</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.Basic#getTemporal()
	 * @see #getBasic()
	 * @generated
	 */
	EAttribute getBasic_Temporal();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.jpa.orm.Basic#getEnumerated <em>Enumerated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enumerated</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.Basic#getEnumerated()
	 * @see #getBasic()
	 * @generated
	 */
	EAttribute getBasic_Enumerated();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.jpa.orm.Basic#getFetch <em>Fetch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fetch</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.Basic#getFetch()
	 * @see #getBasic()
	 * @generated
	 */
	EAttribute getBasic_Fetch();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.jpa.orm.Basic#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.Basic#getName()
	 * @see #getBasic()
	 * @generated
	 */
	EAttribute getBasic_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.jpa.orm.Basic#isOptional <em>Optional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Optional</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.Basic#isOptional()
	 * @see #getBasic()
	 * @generated
	 */
	EAttribute getBasic_Optional();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.jpa.orm.CascadeType <em>Cascade Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cascade Type</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.CascadeType
	 * @generated
	 */
	EClass getCascadeType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.jpa.orm.CascadeType#getCascadeAll <em>Cascade All</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cascade All</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.CascadeType#getCascadeAll()
	 * @see #getCascadeType()
	 * @generated
	 */
	EReference getCascadeType_CascadeAll();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.jpa.orm.CascadeType#getCascadePersist <em>Cascade Persist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cascade Persist</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.CascadeType#getCascadePersist()
	 * @see #getCascadeType()
	 * @generated
	 */
	EReference getCascadeType_CascadePersist();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.jpa.orm.CascadeType#getCascadeMerge <em>Cascade Merge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cascade Merge</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.CascadeType#getCascadeMerge()
	 * @see #getCascadeType()
	 * @generated
	 */
	EReference getCascadeType_CascadeMerge();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.jpa.orm.CascadeType#getCascadeRemove <em>Cascade Remove</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cascade Remove</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.CascadeType#getCascadeRemove()
	 * @see #getCascadeType()
	 * @generated
	 */
	EReference getCascadeType_CascadeRemove();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.jpa.orm.CascadeType#getCascadeRefresh <em>Cascade Refresh</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cascade Refresh</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.CascadeType#getCascadeRefresh()
	 * @see #getCascadeType()
	 * @generated
	 */
	EReference getCascadeType_CascadeRefresh();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.jpa.orm.Column <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Column</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.Column
	 * @generated
	 */
	EClass getColumn();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.jpa.orm.Column#getColumnDefinition <em>Column Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column Definition</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.Column#getColumnDefinition()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_ColumnDefinition();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.jpa.orm.Column#isInsertable <em>Insertable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Insertable</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.Column#isInsertable()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_Insertable();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.jpa.orm.Column#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.Column#getLength()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_Length();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.jpa.orm.Column#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.Column#getName()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.jpa.orm.Column#isNullable <em>Nullable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nullable</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.Column#isNullable()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_Nullable();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.jpa.orm.Column#getPrecision <em>Precision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Precision</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.Column#getPrecision()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_Precision();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.jpa.orm.Column#getScale <em>Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scale</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.Column#getScale()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_Scale();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.jpa.orm.Column#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Table</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.Column#getTable()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_Table();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.jpa.orm.Column#isUnique <em>Unique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unique</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.Column#isUnique()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_Unique();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.jpa.orm.Column#isUpdatable <em>Updatable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Updatable</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.Column#isUpdatable()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_Updatable();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.jpa.orm.ColumnResult <em>Column Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Column Result</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.ColumnResult
	 * @generated
	 */
	EClass getColumnResult();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.jpa.orm.ColumnResult#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.ColumnResult#getName()
	 * @see #getColumnResult()
	 * @generated
	 */
	EAttribute getColumnResult_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.jpa.orm.DiscriminatorColumn <em>Discriminator Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Discriminator Column</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.DiscriminatorColumn
	 * @generated
	 */
	EClass getDiscriminatorColumn();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.jpa.orm.DiscriminatorColumn#getColumnDefinition <em>Column Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column Definition</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.DiscriminatorColumn#getColumnDefinition()
	 * @see #getDiscriminatorColumn()
	 * @generated
	 */
	EAttribute getDiscriminatorColumn_ColumnDefinition();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.jpa.orm.DiscriminatorColumn#getDiscriminatorType <em>Discriminator Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Discriminator Type</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.DiscriminatorColumn#getDiscriminatorType()
	 * @see #getDiscriminatorColumn()
	 * @generated
	 */
	EAttribute getDiscriminatorColumn_DiscriminatorType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.jpa.orm.DiscriminatorColumn#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.DiscriminatorColumn#getLength()
	 * @see #getDiscriminatorColumn()
	 * @generated
	 */
	EAttribute getDiscriminatorColumn_Length();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.jpa.orm.DiscriminatorColumn#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.DiscriminatorColumn#getName()
	 * @see #getDiscriminatorColumn()
	 * @generated
	 */
	EAttribute getDiscriminatorColumn_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.jpa.orm.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.emf.teneo.jpa.orm.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link org.eclipse.emf.teneo.jpa.orm.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link org.eclipse.emf.teneo.jpa.orm.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.jpa.orm.DocumentRoot#getEntityMappings <em>Entity Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Entity Mappings</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.DocumentRoot#getEntityMappings()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_EntityMappings();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.jpa.orm.Embeddable <em>Embeddable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Embeddable</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.Embeddable
	 * @generated
	 */
	EClass getEmbeddable();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.jpa.orm.Embeddable#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.Embeddable#getDescription()
	 * @see #getEmbeddable()
	 * @generated
	 */
	EAttribute getEmbeddable_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.jpa.orm.Embeddable#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Attributes</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.Embeddable#getAttributes()
	 * @see #getEmbeddable()
	 * @generated
	 */
	EReference getEmbeddable_Attributes();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.jpa.orm.Embeddable#getAccess <em>Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.Embeddable#getAccess()
	 * @see #getEmbeddable()
	 * @generated
	 */
	EAttribute getEmbeddable_Access();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.jpa.orm.Embeddable#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.Embeddable#getClass_()
	 * @see #getEmbeddable()
	 * @generated
	 */
	EAttribute getEmbeddable_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.jpa.orm.Embeddable#isMetadataComplete <em>Metadata Complete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Metadata Complete</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.Embeddable#isMetadataComplete()
	 * @see #getEmbeddable()
	 * @generated
	 */
	EAttribute getEmbeddable_MetadataComplete();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.jpa.orm.EmbeddableAttributes <em>Embeddable Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Embeddable Attributes</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.EmbeddableAttributes
	 * @generated
	 */
	EClass getEmbeddableAttributes();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.jpa.orm.EmbeddableAttributes#getBasic <em>Basic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Basic</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.EmbeddableAttributes#getBasic()
	 * @see #getEmbeddableAttributes()
	 * @generated
	 */
	EReference getEmbeddableAttributes_Basic();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.jpa.orm.EmbeddableAttributes#getTransient <em>Transient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transient</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.EmbeddableAttributes#getTransient()
	 * @see #getEmbeddableAttributes()
	 * @generated
	 */
	EReference getEmbeddableAttributes_Transient();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.jpa.orm.Embedded <em>Embedded</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Embedded</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.Embedded
	 * @generated
	 */
	EClass getEmbedded();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.jpa.orm.Embedded#getAttributeOverride <em>Attribute Override</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attribute Override</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.Embedded#getAttributeOverride()
	 * @see #getEmbedded()
	 * @generated
	 */
	EReference getEmbedded_AttributeOverride();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.jpa.orm.Embedded#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.Embedded#getName()
	 * @see #getEmbedded()
	 * @generated
	 */
	EAttribute getEmbedded_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.jpa.orm.EmbeddedId <em>Embedded Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Embedded Id</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.EmbeddedId
	 * @generated
	 */
	EClass getEmbeddedId();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.jpa.orm.EmbeddedId#getAttributeOverride <em>Attribute Override</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attribute Override</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.EmbeddedId#getAttributeOverride()
	 * @see #getEmbeddedId()
	 * @generated
	 */
	EReference getEmbeddedId_AttributeOverride();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.jpa.orm.EmbeddedId#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.EmbeddedId#getName()
	 * @see #getEmbeddedId()
	 * @generated
	 */
	EAttribute getEmbeddedId_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.jpa.orm.EmptyType <em>Empty Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Empty Type</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.EmptyType
	 * @generated
	 */
	EClass getEmptyType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.jpa.orm.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.Entity
	 * @generated
	 */
	EClass getEntity();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.jpa.orm.Entity#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.Entity#getDescription()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.jpa.orm.Entity#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Table</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.Entity#getTable()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_Table();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.jpa.orm.Entity#getSecondaryTable <em>Secondary Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Secondary Table</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.Entity#getSecondaryTable()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_SecondaryTable();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.jpa.orm.Entity#getPrimaryKeyJoinColumn <em>Primary Key Join Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Primary Key Join Column</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.Entity#getPrimaryKeyJoinColumn()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_PrimaryKeyJoinColumn();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.jpa.orm.Entity#getIdClass <em>Id Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Id Class</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.Entity#getIdClass()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_IdClass();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.jpa.orm.Entity#getInheritance <em>Inheritance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Inheritance</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.Entity#getInheritance()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_Inheritance();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.jpa.orm.Entity#getDiscriminatorValue <em>Discriminator Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Discriminator Value</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.Entity#getDiscriminatorValue()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_DiscriminatorValue();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.jpa.orm.Entity#getDiscriminatorColumn <em>Discriminator Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Discriminator Column</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.Entity#getDiscriminatorColumn()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_DiscriminatorColumn();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.jpa.orm.Entity#getSequenceGenerator <em>Sequence Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sequence Generator</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.Entity#getSequenceGenerator()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_SequenceGenerator();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.jpa.orm.Entity#getTableGenerator <em>Table Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Table Generator</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.Entity#getTableGenerator()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_TableGenerator();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.jpa.orm.Entity#getNamedQuery <em>Named Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Named Query</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.Entity#getNamedQuery()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_NamedQuery();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.jpa.orm.Entity#getNamedNativeQuery <em>Named Native Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Named Native Query</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.Entity#getNamedNativeQuery()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_NamedNativeQuery();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.jpa.orm.Entity#getSqlResultSetMapping <em>Sql Result Set Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sql Result Set Mapping</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.Entity#getSqlResultSetMapping()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_SqlResultSetMapping();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.jpa.orm.Entity#getExcludeDefaultListeners <em>Exclude Default Listeners</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exclude Default Listeners</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.Entity#getExcludeDefaultListeners()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_ExcludeDefaultListeners();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.jpa.orm.Entity#getExcludeSuperclassListeners <em>Exclude Superclass Listeners</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exclude Superclass Listeners</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.Entity#getExcludeSuperclassListeners()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_ExcludeSuperclassListeners();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.jpa.orm.Entity#getEntityListeners <em>Entity Listeners</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Entity Listeners</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.Entity#getEntityListeners()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_EntityListeners();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.jpa.orm.Entity#getPrePersist <em>Pre Persist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pre Persist</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.Entity#getPrePersist()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_PrePersist();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.jpa.orm.Entity#getPostPersist <em>Post Persist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Post Persist</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.Entity#getPostPersist()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_PostPersist();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.jpa.orm.Entity#getPreRemove <em>Pre Remove</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pre Remove</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.Entity#getPreRemove()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_PreRemove();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.jpa.orm.Entity#getPostRemove <em>Post Remove</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Post Remove</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.Entity#getPostRemove()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_PostRemove();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.jpa.orm.Entity#getPreUpdate <em>Pre Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pre Update</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.Entity#getPreUpdate()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_PreUpdate();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.jpa.orm.Entity#getPostUpdate <em>Post Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Post Update</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.Entity#getPostUpdate()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_PostUpdate();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.jpa.orm.Entity#getPostLoad <em>Post Load</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Post Load</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.Entity#getPostLoad()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_PostLoad();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.jpa.orm.Entity#getAttributeOverride <em>Attribute Override</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attribute Override</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.Entity#getAttributeOverride()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_AttributeOverride();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.jpa.orm.Entity#getAssociationOverride <em>Association Override</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Association Override</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.Entity#getAssociationOverride()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_AssociationOverride();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.jpa.orm.Entity#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Attributes</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.Entity#getAttributes()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_Attributes();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.jpa.orm.Entity#getAccess <em>Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.Entity#getAccess()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_Access();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.jpa.orm.Entity#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.Entity#getClass_()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.jpa.orm.Entity#isMetadataComplete <em>Metadata Complete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Metadata Complete</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.Entity#isMetadataComplete()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_MetadataComplete();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.jpa.orm.Entity#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.Entity#getName()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.jpa.orm.EntityListener <em>Entity Listener</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity Listener</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.EntityListener
	 * @generated
	 */
	EClass getEntityListener();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.jpa.orm.EntityListener#getPrePersist <em>Pre Persist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pre Persist</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.EntityListener#getPrePersist()
	 * @see #getEntityListener()
	 * @generated
	 */
	EReference getEntityListener_PrePersist();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.jpa.orm.EntityListener#getPostPersist <em>Post Persist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Post Persist</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.EntityListener#getPostPersist()
	 * @see #getEntityListener()
	 * @generated
	 */
	EReference getEntityListener_PostPersist();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.jpa.orm.EntityListener#getPreRemove <em>Pre Remove</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pre Remove</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.EntityListener#getPreRemove()
	 * @see #getEntityListener()
	 * @generated
	 */
	EReference getEntityListener_PreRemove();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.jpa.orm.EntityListener#getPostRemove <em>Post Remove</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Post Remove</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.EntityListener#getPostRemove()
	 * @see #getEntityListener()
	 * @generated
	 */
	EReference getEntityListener_PostRemove();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.jpa.orm.EntityListener#getPreUpdate <em>Pre Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pre Update</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.EntityListener#getPreUpdate()
	 * @see #getEntityListener()
	 * @generated
	 */
	EReference getEntityListener_PreUpdate();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.jpa.orm.EntityListener#getPostUpdate <em>Post Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Post Update</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.EntityListener#getPostUpdate()
	 * @see #getEntityListener()
	 * @generated
	 */
	EReference getEntityListener_PostUpdate();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.jpa.orm.EntityListener#getPostLoad <em>Post Load</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Post Load</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.EntityListener#getPostLoad()
	 * @see #getEntityListener()
	 * @generated
	 */
	EReference getEntityListener_PostLoad();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.jpa.orm.EntityListener#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.EntityListener#getClass_()
	 * @see #getEntityListener()
	 * @generated
	 */
	EAttribute getEntityListener_Class();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.jpa.orm.EntityListeners <em>Entity Listeners</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity Listeners</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.EntityListeners
	 * @generated
	 */
	EClass getEntityListeners();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.jpa.orm.EntityListeners#getEntityListener <em>Entity Listener</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entity Listener</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.EntityListeners#getEntityListener()
	 * @see #getEntityListeners()
	 * @generated
	 */
	EReference getEntityListeners_EntityListener();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.jpa.orm.EntityMappingsType <em>Entity Mappings Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity Mappings Type</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.EntityMappingsType
	 * @generated
	 */
	EClass getEntityMappingsType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.jpa.orm.EntityMappingsType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.EntityMappingsType#getDescription()
	 * @see #getEntityMappingsType()
	 * @generated
	 */
	EAttribute getEntityMappingsType_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.jpa.orm.EntityMappingsType#getPersistenceUnitMetadata <em>Persistence Unit Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Persistence Unit Metadata</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.EntityMappingsType#getPersistenceUnitMetadata()
	 * @see #getEntityMappingsType()
	 * @generated
	 */
	EReference getEntityMappingsType_PersistenceUnitMetadata();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.jpa.orm.EntityMappingsType#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Package</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.EntityMappingsType#getPackage()
	 * @see #getEntityMappingsType()
	 * @generated
	 */
	EAttribute getEntityMappingsType_Package();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.jpa.orm.EntityMappingsType#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schema</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.EntityMappingsType#getSchema()
	 * @see #getEntityMappingsType()
	 * @generated
	 */
	EAttribute getEntityMappingsType_Schema();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.jpa.orm.EntityMappingsType#getCatalog <em>Catalog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Catalog</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.EntityMappingsType#getCatalog()
	 * @see #getEntityMappingsType()
	 * @generated
	 */
	EAttribute getEntityMappingsType_Catalog();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.jpa.orm.EntityMappingsType#getAccess <em>Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.EntityMappingsType#getAccess()
	 * @see #getEntityMappingsType()
	 * @generated
	 */
	EAttribute getEntityMappingsType_Access();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.jpa.orm.EntityMappingsType#getSequenceGenerator <em>Sequence Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sequence Generator</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.EntityMappingsType#getSequenceGenerator()
	 * @see #getEntityMappingsType()
	 * @generated
	 */
	EReference getEntityMappingsType_SequenceGenerator();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.jpa.orm.EntityMappingsType#getTableGenerator <em>Table Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Table Generator</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.EntityMappingsType#getTableGenerator()
	 * @see #getEntityMappingsType()
	 * @generated
	 */
	EReference getEntityMappingsType_TableGenerator();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.jpa.orm.EntityMappingsType#getNamedQuery <em>Named Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Named Query</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.EntityMappingsType#getNamedQuery()
	 * @see #getEntityMappingsType()
	 * @generated
	 */
	EReference getEntityMappingsType_NamedQuery();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.jpa.orm.EntityMappingsType#getNamedNativeQuery <em>Named Native Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Named Native Query</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.EntityMappingsType#getNamedNativeQuery()
	 * @see #getEntityMappingsType()
	 * @generated
	 */
	EReference getEntityMappingsType_NamedNativeQuery();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.jpa.orm.EntityMappingsType#getSqlResultSetMapping <em>Sql Result Set Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sql Result Set Mapping</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.EntityMappingsType#getSqlResultSetMapping()
	 * @see #getEntityMappingsType()
	 * @generated
	 */
	EReference getEntityMappingsType_SqlResultSetMapping();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.jpa.orm.EntityMappingsType#getMappedSuperclass <em>Mapped Superclass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mapped Superclass</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.EntityMappingsType#getMappedSuperclass()
	 * @see #getEntityMappingsType()
	 * @generated
	 */
	EReference getEntityMappingsType_MappedSuperclass();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.jpa.orm.EntityMappingsType#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entity</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.EntityMappingsType#getEntity()
	 * @see #getEntityMappingsType()
	 * @generated
	 */
	EReference getEntityMappingsType_Entity();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.jpa.orm.EntityMappingsType#getEmbeddable <em>Embeddable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Embeddable</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.EntityMappingsType#getEmbeddable()
	 * @see #getEntityMappingsType()
	 * @generated
	 */
	EReference getEntityMappingsType_Embeddable();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.jpa.orm.EntityMappingsType#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.EntityMappingsType#getVersion()
	 * @see #getEntityMappingsType()
	 * @generated
	 */
	EAttribute getEntityMappingsType_Version();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.jpa.orm.EntityResult <em>Entity Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity Result</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.EntityResult
	 * @generated
	 */
	EClass getEntityResult();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.jpa.orm.EntityResult#getFieldResult <em>Field Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Field Result</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.EntityResult#getFieldResult()
	 * @see #getEntityResult()
	 * @generated
	 */
	EReference getEntityResult_FieldResult();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.jpa.orm.EntityResult#getDiscriminatorColumn <em>Discriminator Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Discriminator Column</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.EntityResult#getDiscriminatorColumn()
	 * @see #getEntityResult()
	 * @generated
	 */
	EAttribute getEntityResult_DiscriminatorColumn();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.jpa.orm.EntityResult#getEntityClass <em>Entity Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Entity Class</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.EntityResult#getEntityClass()
	 * @see #getEntityResult()
	 * @generated
	 */
	EAttribute getEntityResult_EntityClass();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.jpa.orm.FieldResult <em>Field Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field Result</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.FieldResult
	 * @generated
	 */
	EClass getFieldResult();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.jpa.orm.FieldResult#getColumn <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.FieldResult#getColumn()
	 * @see #getFieldResult()
	 * @generated
	 */
	EAttribute getFieldResult_Column();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.jpa.orm.FieldResult#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.FieldResult#getName()
	 * @see #getFieldResult()
	 * @generated
	 */
	EAttribute getFieldResult_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.jpa.orm.GeneratedValue <em>Generated Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generated Value</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.GeneratedValue
	 * @generated
	 */
	EClass getGeneratedValue();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.jpa.orm.GeneratedValue#getGenerator <em>Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generator</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.GeneratedValue#getGenerator()
	 * @see #getGeneratedValue()
	 * @generated
	 */
	EAttribute getGeneratedValue_Generator();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.jpa.orm.GeneratedValue#getStrategy <em>Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Strategy</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.GeneratedValue#getStrategy()
	 * @see #getGeneratedValue()
	 * @generated
	 */
	EAttribute getGeneratedValue_Strategy();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.jpa.orm.Id <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Id</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.Id
	 * @generated
	 */
	EClass getId();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.jpa.orm.Id#getColumn <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Column</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.Id#getColumn()
	 * @see #getId()
	 * @generated
	 */
	EReference getId_Column();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.jpa.orm.Id#getGeneratedValue <em>Generated Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Generated Value</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.Id#getGeneratedValue()
	 * @see #getId()
	 * @generated
	 */
	EReference getId_GeneratedValue();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.jpa.orm.Id#getTemporal <em>Temporal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Temporal</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.Id#getTemporal()
	 * @see #getId()
	 * @generated
	 */
	EAttribute getId_Temporal();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.jpa.orm.Id#getTableGenerator <em>Table Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Table Generator</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.Id#getTableGenerator()
	 * @see #getId()
	 * @generated
	 */
	EReference getId_TableGenerator();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.jpa.orm.Id#getSequenceGenerator <em>Sequence Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sequence Generator</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.Id#getSequenceGenerator()
	 * @see #getId()
	 * @generated
	 */
	EReference getId_SequenceGenerator();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.jpa.orm.Id#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.Id#getName()
	 * @see #getId()
	 * @generated
	 */
	EAttribute getId_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.jpa.orm.IdClass <em>Id Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Id Class</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.IdClass
	 * @generated
	 */
	EClass getIdClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.jpa.orm.IdClass#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.IdClass#getClass_()
	 * @see #getIdClass()
	 * @generated
	 */
	EAttribute getIdClass_Class();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.jpa.orm.Inheritance <em>Inheritance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inheritance</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.Inheritance
	 * @generated
	 */
	EClass getInheritance();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.jpa.orm.Inheritance#getStrategy <em>Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Strategy</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.Inheritance#getStrategy()
	 * @see #getInheritance()
	 * @generated
	 */
	EAttribute getInheritance_Strategy();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.jpa.orm.JoinColumn <em>Join Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Join Column</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.JoinColumn
	 * @generated
	 */
	EClass getJoinColumn();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.jpa.orm.JoinColumn#getColumnDefinition <em>Column Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column Definition</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.JoinColumn#getColumnDefinition()
	 * @see #getJoinColumn()
	 * @generated
	 */
	EAttribute getJoinColumn_ColumnDefinition();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.jpa.orm.JoinColumn#isInsertable <em>Insertable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Insertable</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.JoinColumn#isInsertable()
	 * @see #getJoinColumn()
	 * @generated
	 */
	EAttribute getJoinColumn_Insertable();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.jpa.orm.JoinColumn#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.JoinColumn#getName()
	 * @see #getJoinColumn()
	 * @generated
	 */
	EAttribute getJoinColumn_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.jpa.orm.JoinColumn#isNullable <em>Nullable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nullable</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.JoinColumn#isNullable()
	 * @see #getJoinColumn()
	 * @generated
	 */
	EAttribute getJoinColumn_Nullable();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.jpa.orm.JoinColumn#getReferencedColumnName <em>Referenced Column Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Referenced Column Name</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.JoinColumn#getReferencedColumnName()
	 * @see #getJoinColumn()
	 * @generated
	 */
	EAttribute getJoinColumn_ReferencedColumnName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.jpa.orm.JoinColumn#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Table</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.JoinColumn#getTable()
	 * @see #getJoinColumn()
	 * @generated
	 */
	EAttribute getJoinColumn_Table();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.jpa.orm.JoinColumn#isUnique <em>Unique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unique</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.JoinColumn#isUnique()
	 * @see #getJoinColumn()
	 * @generated
	 */
	EAttribute getJoinColumn_Unique();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.jpa.orm.JoinColumn#isUpdatable <em>Updatable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Updatable</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.JoinColumn#isUpdatable()
	 * @see #getJoinColumn()
	 * @generated
	 */
	EAttribute getJoinColumn_Updatable();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.jpa.orm.JoinTable <em>Join Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Join Table</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.JoinTable
	 * @generated
	 */
	EClass getJoinTable();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.jpa.orm.JoinTable#getJoinColumn <em>Join Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Join Column</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.JoinTable#getJoinColumn()
	 * @see #getJoinTable()
	 * @generated
	 */
	EReference getJoinTable_JoinColumn();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.jpa.orm.JoinTable#getInverseJoinColumn <em>Inverse Join Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inverse Join Column</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.JoinTable#getInverseJoinColumn()
	 * @see #getJoinTable()
	 * @generated
	 */
	EReference getJoinTable_InverseJoinColumn();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.jpa.orm.JoinTable#getUniqueConstraint <em>Unique Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Unique Constraint</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.JoinTable#getUniqueConstraint()
	 * @see #getJoinTable()
	 * @generated
	 */
	EReference getJoinTable_UniqueConstraint();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.jpa.orm.JoinTable#getCatalog <em>Catalog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Catalog</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.JoinTable#getCatalog()
	 * @see #getJoinTable()
	 * @generated
	 */
	EAttribute getJoinTable_Catalog();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.jpa.orm.JoinTable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.JoinTable#getName()
	 * @see #getJoinTable()
	 * @generated
	 */
	EAttribute getJoinTable_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.jpa.orm.JoinTable#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schema</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.JoinTable#getSchema()
	 * @see #getJoinTable()
	 * @generated
	 */
	EAttribute getJoinTable_Schema();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.jpa.orm.Lob <em>Lob</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lob</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.Lob
	 * @generated
	 */
	EClass getLob();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.jpa.orm.ManyToMany <em>Many To Many</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Many To Many</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.ManyToMany
	 * @generated
	 */
	EClass getManyToMany();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.jpa.orm.ManyToMany#getOrderBy <em>Order By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order By</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.ManyToMany#getOrderBy()
	 * @see #getManyToMany()
	 * @generated
	 */
	EAttribute getManyToMany_OrderBy();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.jpa.orm.ManyToMany#getMapKey <em>Map Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Map Key</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.ManyToMany#getMapKey()
	 * @see #getManyToMany()
	 * @generated
	 */
	EReference getManyToMany_MapKey();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.jpa.orm.ManyToMany#getJoinTable <em>Join Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Join Table</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.ManyToMany#getJoinTable()
	 * @see #getManyToMany()
	 * @generated
	 */
	EReference getManyToMany_JoinTable();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.jpa.orm.ManyToMany#getCascade <em>Cascade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cascade</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.ManyToMany#getCascade()
	 * @see #getManyToMany()
	 * @generated
	 */
	EReference getManyToMany_Cascade();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.jpa.orm.ManyToMany#getFetch <em>Fetch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fetch</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.ManyToMany#getFetch()
	 * @see #getManyToMany()
	 * @generated
	 */
	EAttribute getManyToMany_Fetch();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.jpa.orm.ManyToMany#getMappedBy <em>Mapped By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mapped By</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.ManyToMany#getMappedBy()
	 * @see #getManyToMany()
	 * @generated
	 */
	EAttribute getManyToMany_MappedBy();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.jpa.orm.ManyToMany#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.ManyToMany#getName()
	 * @see #getManyToMany()
	 * @generated
	 */
	EAttribute getManyToMany_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.jpa.orm.ManyToMany#getTargetEntity <em>Target Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Entity</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.ManyToMany#getTargetEntity()
	 * @see #getManyToMany()
	 * @generated
	 */
	EAttribute getManyToMany_TargetEntity();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.jpa.orm.ManyToOne <em>Many To One</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Many To One</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.ManyToOne
	 * @generated
	 */
	EClass getManyToOne();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.jpa.orm.ManyToOne#getJoinColumn <em>Join Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Join Column</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.ManyToOne#getJoinColumn()
	 * @see #getManyToOne()
	 * @generated
	 */
	EReference getManyToOne_JoinColumn();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.jpa.orm.ManyToOne#getJoinTable <em>Join Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Join Table</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.ManyToOne#getJoinTable()
	 * @see #getManyToOne()
	 * @generated
	 */
	EReference getManyToOne_JoinTable();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.jpa.orm.ManyToOne#getCascade <em>Cascade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cascade</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.ManyToOne#getCascade()
	 * @see #getManyToOne()
	 * @generated
	 */
	EReference getManyToOne_Cascade();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.jpa.orm.ManyToOne#getFetch <em>Fetch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fetch</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.ManyToOne#getFetch()
	 * @see #getManyToOne()
	 * @generated
	 */
	EAttribute getManyToOne_Fetch();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.jpa.orm.ManyToOne#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.ManyToOne#getName()
	 * @see #getManyToOne()
	 * @generated
	 */
	EAttribute getManyToOne_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.jpa.orm.ManyToOne#isOptional <em>Optional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Optional</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.ManyToOne#isOptional()
	 * @see #getManyToOne()
	 * @generated
	 */
	EAttribute getManyToOne_Optional();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.jpa.orm.ManyToOne#getTargetEntity <em>Target Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Entity</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.ManyToOne#getTargetEntity()
	 * @see #getManyToOne()
	 * @generated
	 */
	EAttribute getManyToOne_TargetEntity();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.jpa.orm.MapKey <em>Map Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Map Key</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.MapKey
	 * @generated
	 */
	EClass getMapKey();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.jpa.orm.MapKey#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.MapKey#getName()
	 * @see #getMapKey()
	 * @generated
	 */
	EAttribute getMapKey_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.jpa.orm.MappedSuperclass <em>Mapped Superclass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mapped Superclass</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.MappedSuperclass
	 * @generated
	 */
	EClass getMappedSuperclass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.jpa.orm.MappedSuperclass#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.MappedSuperclass#getDescription()
	 * @see #getMappedSuperclass()
	 * @generated
	 */
	EAttribute getMappedSuperclass_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.jpa.orm.MappedSuperclass#getIdClass <em>Id Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Id Class</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.MappedSuperclass#getIdClass()
	 * @see #getMappedSuperclass()
	 * @generated
	 */
	EReference getMappedSuperclass_IdClass();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.jpa.orm.MappedSuperclass#getExcludeDefaultListeners <em>Exclude Default Listeners</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exclude Default Listeners</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.MappedSuperclass#getExcludeDefaultListeners()
	 * @see #getMappedSuperclass()
	 * @generated
	 */
	EReference getMappedSuperclass_ExcludeDefaultListeners();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.jpa.orm.MappedSuperclass#getExcludeSuperclassListeners <em>Exclude Superclass Listeners</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exclude Superclass Listeners</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.MappedSuperclass#getExcludeSuperclassListeners()
	 * @see #getMappedSuperclass()
	 * @generated
	 */
	EReference getMappedSuperclass_ExcludeSuperclassListeners();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.jpa.orm.MappedSuperclass#getEntityListeners <em>Entity Listeners</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Entity Listeners</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.MappedSuperclass#getEntityListeners()
	 * @see #getMappedSuperclass()
	 * @generated
	 */
	EReference getMappedSuperclass_EntityListeners();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.jpa.orm.MappedSuperclass#getPrePersist <em>Pre Persist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pre Persist</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.MappedSuperclass#getPrePersist()
	 * @see #getMappedSuperclass()
	 * @generated
	 */
	EReference getMappedSuperclass_PrePersist();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.jpa.orm.MappedSuperclass#getPostPersist <em>Post Persist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Post Persist</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.MappedSuperclass#getPostPersist()
	 * @see #getMappedSuperclass()
	 * @generated
	 */
	EReference getMappedSuperclass_PostPersist();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.jpa.orm.MappedSuperclass#getPreRemove <em>Pre Remove</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pre Remove</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.MappedSuperclass#getPreRemove()
	 * @see #getMappedSuperclass()
	 * @generated
	 */
	EReference getMappedSuperclass_PreRemove();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.jpa.orm.MappedSuperclass#getPostRemove <em>Post Remove</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Post Remove</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.MappedSuperclass#getPostRemove()
	 * @see #getMappedSuperclass()
	 * @generated
	 */
	EReference getMappedSuperclass_PostRemove();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.jpa.orm.MappedSuperclass#getPreUpdate <em>Pre Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pre Update</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.MappedSuperclass#getPreUpdate()
	 * @see #getMappedSuperclass()
	 * @generated
	 */
	EReference getMappedSuperclass_PreUpdate();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.jpa.orm.MappedSuperclass#getPostUpdate <em>Post Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Post Update</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.MappedSuperclass#getPostUpdate()
	 * @see #getMappedSuperclass()
	 * @generated
	 */
	EReference getMappedSuperclass_PostUpdate();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.jpa.orm.MappedSuperclass#getPostLoad <em>Post Load</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Post Load</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.MappedSuperclass#getPostLoad()
	 * @see #getMappedSuperclass()
	 * @generated
	 */
	EReference getMappedSuperclass_PostLoad();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.jpa.orm.MappedSuperclass#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Attributes</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.MappedSuperclass#getAttributes()
	 * @see #getMappedSuperclass()
	 * @generated
	 */
	EReference getMappedSuperclass_Attributes();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.jpa.orm.MappedSuperclass#getAccess <em>Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.MappedSuperclass#getAccess()
	 * @see #getMappedSuperclass()
	 * @generated
	 */
	EAttribute getMappedSuperclass_Access();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.jpa.orm.MappedSuperclass#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.MappedSuperclass#getClass_()
	 * @see #getMappedSuperclass()
	 * @generated
	 */
	EAttribute getMappedSuperclass_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.jpa.orm.MappedSuperclass#isMetadataComplete <em>Metadata Complete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Metadata Complete</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.MappedSuperclass#isMetadataComplete()
	 * @see #getMappedSuperclass()
	 * @generated
	 */
	EAttribute getMappedSuperclass_MetadataComplete();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.jpa.orm.NamedNativeQuery <em>Named Native Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Native Query</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.NamedNativeQuery
	 * @generated
	 */
	EClass getNamedNativeQuery();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.jpa.orm.NamedNativeQuery#getQuery <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Query</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.NamedNativeQuery#getQuery()
	 * @see #getNamedNativeQuery()
	 * @generated
	 */
	EAttribute getNamedNativeQuery_Query();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.jpa.orm.NamedNativeQuery#getHint <em>Hint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hint</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.NamedNativeQuery#getHint()
	 * @see #getNamedNativeQuery()
	 * @generated
	 */
	EReference getNamedNativeQuery_Hint();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.jpa.orm.NamedNativeQuery#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.NamedNativeQuery#getName()
	 * @see #getNamedNativeQuery()
	 * @generated
	 */
	EAttribute getNamedNativeQuery_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.jpa.orm.NamedNativeQuery#getResultClass <em>Result Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Result Class</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.NamedNativeQuery#getResultClass()
	 * @see #getNamedNativeQuery()
	 * @generated
	 */
	EAttribute getNamedNativeQuery_ResultClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.jpa.orm.NamedNativeQuery#getResultSetMapping <em>Result Set Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Result Set Mapping</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.NamedNativeQuery#getResultSetMapping()
	 * @see #getNamedNativeQuery()
	 * @generated
	 */
	EAttribute getNamedNativeQuery_ResultSetMapping();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.jpa.orm.NamedQuery <em>Named Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Query</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.NamedQuery
	 * @generated
	 */
	EClass getNamedQuery();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.jpa.orm.NamedQuery#getQuery <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Query</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.NamedQuery#getQuery()
	 * @see #getNamedQuery()
	 * @generated
	 */
	EAttribute getNamedQuery_Query();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.jpa.orm.NamedQuery#getHint <em>Hint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hint</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.NamedQuery#getHint()
	 * @see #getNamedQuery()
	 * @generated
	 */
	EReference getNamedQuery_Hint();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.jpa.orm.NamedQuery#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.NamedQuery#getName()
	 * @see #getNamedQuery()
	 * @generated
	 */
	EAttribute getNamedQuery_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.jpa.orm.OneToMany <em>One To Many</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>One To Many</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.OneToMany
	 * @generated
	 */
	EClass getOneToMany();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.jpa.orm.OneToMany#getOrderBy <em>Order By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order By</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.OneToMany#getOrderBy()
	 * @see #getOneToMany()
	 * @generated
	 */
	EAttribute getOneToMany_OrderBy();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.jpa.orm.OneToMany#getMapKey <em>Map Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Map Key</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.OneToMany#getMapKey()
	 * @see #getOneToMany()
	 * @generated
	 */
	EReference getOneToMany_MapKey();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.jpa.orm.OneToMany#getJoinTable <em>Join Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Join Table</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.OneToMany#getJoinTable()
	 * @see #getOneToMany()
	 * @generated
	 */
	EReference getOneToMany_JoinTable();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.jpa.orm.OneToMany#getJoinColumn <em>Join Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Join Column</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.OneToMany#getJoinColumn()
	 * @see #getOneToMany()
	 * @generated
	 */
	EReference getOneToMany_JoinColumn();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.jpa.orm.OneToMany#getCascade <em>Cascade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cascade</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.OneToMany#getCascade()
	 * @see #getOneToMany()
	 * @generated
	 */
	EReference getOneToMany_Cascade();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.jpa.orm.OneToMany#getFetch <em>Fetch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fetch</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.OneToMany#getFetch()
	 * @see #getOneToMany()
	 * @generated
	 */
	EAttribute getOneToMany_Fetch();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.jpa.orm.OneToMany#getMappedBy <em>Mapped By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mapped By</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.OneToMany#getMappedBy()
	 * @see #getOneToMany()
	 * @generated
	 */
	EAttribute getOneToMany_MappedBy();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.jpa.orm.OneToMany#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.OneToMany#getName()
	 * @see #getOneToMany()
	 * @generated
	 */
	EAttribute getOneToMany_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.jpa.orm.OneToMany#getTargetEntity <em>Target Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Entity</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.OneToMany#getTargetEntity()
	 * @see #getOneToMany()
	 * @generated
	 */
	EAttribute getOneToMany_TargetEntity();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.jpa.orm.OneToOne <em>One To One</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>One To One</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.OneToOne
	 * @generated
	 */
	EClass getOneToOne();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.jpa.orm.OneToOne#getPrimaryKeyJoinColumn <em>Primary Key Join Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Primary Key Join Column</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.OneToOne#getPrimaryKeyJoinColumn()
	 * @see #getOneToOne()
	 * @generated
	 */
	EReference getOneToOne_PrimaryKeyJoinColumn();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.jpa.orm.OneToOne#getJoinColumn <em>Join Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Join Column</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.OneToOne#getJoinColumn()
	 * @see #getOneToOne()
	 * @generated
	 */
	EReference getOneToOne_JoinColumn();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.jpa.orm.OneToOne#getJoinTable <em>Join Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Join Table</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.OneToOne#getJoinTable()
	 * @see #getOneToOne()
	 * @generated
	 */
	EReference getOneToOne_JoinTable();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.jpa.orm.OneToOne#getCascade <em>Cascade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cascade</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.OneToOne#getCascade()
	 * @see #getOneToOne()
	 * @generated
	 */
	EReference getOneToOne_Cascade();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.jpa.orm.OneToOne#getFetch <em>Fetch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fetch</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.OneToOne#getFetch()
	 * @see #getOneToOne()
	 * @generated
	 */
	EAttribute getOneToOne_Fetch();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.jpa.orm.OneToOne#getMappedBy <em>Mapped By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mapped By</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.OneToOne#getMappedBy()
	 * @see #getOneToOne()
	 * @generated
	 */
	EAttribute getOneToOne_MappedBy();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.jpa.orm.OneToOne#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.OneToOne#getName()
	 * @see #getOneToOne()
	 * @generated
	 */
	EAttribute getOneToOne_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.jpa.orm.OneToOne#isOptional <em>Optional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Optional</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.OneToOne#isOptional()
	 * @see #getOneToOne()
	 * @generated
	 */
	EAttribute getOneToOne_Optional();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.jpa.orm.OneToOne#getTargetEntity <em>Target Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Entity</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.OneToOne#getTargetEntity()
	 * @see #getOneToOne()
	 * @generated
	 */
	EAttribute getOneToOne_TargetEntity();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.jpa.orm.PersistenceUnitDefaults <em>Persistence Unit Defaults</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Persistence Unit Defaults</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.PersistenceUnitDefaults
	 * @generated
	 */
	EClass getPersistenceUnitDefaults();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.jpa.orm.PersistenceUnitDefaults#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schema</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.PersistenceUnitDefaults#getSchema()
	 * @see #getPersistenceUnitDefaults()
	 * @generated
	 */
	EAttribute getPersistenceUnitDefaults_Schema();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.jpa.orm.PersistenceUnitDefaults#getCatalog <em>Catalog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Catalog</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.PersistenceUnitDefaults#getCatalog()
	 * @see #getPersistenceUnitDefaults()
	 * @generated
	 */
	EAttribute getPersistenceUnitDefaults_Catalog();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.jpa.orm.PersistenceUnitDefaults#getAccess <em>Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.PersistenceUnitDefaults#getAccess()
	 * @see #getPersistenceUnitDefaults()
	 * @generated
	 */
	EAttribute getPersistenceUnitDefaults_Access();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.jpa.orm.PersistenceUnitDefaults#getCascadePersist <em>Cascade Persist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cascade Persist</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.PersistenceUnitDefaults#getCascadePersist()
	 * @see #getPersistenceUnitDefaults()
	 * @generated
	 */
	EReference getPersistenceUnitDefaults_CascadePersist();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.jpa.orm.PersistenceUnitDefaults#getEntityListeners <em>Entity Listeners</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Entity Listeners</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.PersistenceUnitDefaults#getEntityListeners()
	 * @see #getPersistenceUnitDefaults()
	 * @generated
	 */
	EReference getPersistenceUnitDefaults_EntityListeners();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.jpa.orm.PersistenceUnitMetadata <em>Persistence Unit Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Persistence Unit Metadata</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.PersistenceUnitMetadata
	 * @generated
	 */
	EClass getPersistenceUnitMetadata();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.jpa.orm.PersistenceUnitMetadata#getXmlMappingMetadataComplete <em>Xml Mapping Metadata Complete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Xml Mapping Metadata Complete</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.PersistenceUnitMetadata#getXmlMappingMetadataComplete()
	 * @see #getPersistenceUnitMetadata()
	 * @generated
	 */
	EReference getPersistenceUnitMetadata_XmlMappingMetadataComplete();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.jpa.orm.PersistenceUnitMetadata#getPersistenceUnitDefaults <em>Persistence Unit Defaults</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Persistence Unit Defaults</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.PersistenceUnitMetadata#getPersistenceUnitDefaults()
	 * @see #getPersistenceUnitMetadata()
	 * @generated
	 */
	EReference getPersistenceUnitMetadata_PersistenceUnitDefaults();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.jpa.orm.PostLoad <em>Post Load</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Post Load</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.PostLoad
	 * @generated
	 */
	EClass getPostLoad();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.jpa.orm.PostLoad#getMethodName <em>Method Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method Name</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.PostLoad#getMethodName()
	 * @see #getPostLoad()
	 * @generated
	 */
	EAttribute getPostLoad_MethodName();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.jpa.orm.PostPersist <em>Post Persist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Post Persist</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.PostPersist
	 * @generated
	 */
	EClass getPostPersist();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.jpa.orm.PostPersist#getMethodName <em>Method Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method Name</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.PostPersist#getMethodName()
	 * @see #getPostPersist()
	 * @generated
	 */
	EAttribute getPostPersist_MethodName();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.jpa.orm.PostRemove <em>Post Remove</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Post Remove</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.PostRemove
	 * @generated
	 */
	EClass getPostRemove();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.jpa.orm.PostRemove#getMethodName <em>Method Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method Name</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.PostRemove#getMethodName()
	 * @see #getPostRemove()
	 * @generated
	 */
	EAttribute getPostRemove_MethodName();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.jpa.orm.PostUpdate <em>Post Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Post Update</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.PostUpdate
	 * @generated
	 */
	EClass getPostUpdate();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.jpa.orm.PostUpdate#getMethodName <em>Method Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method Name</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.PostUpdate#getMethodName()
	 * @see #getPostUpdate()
	 * @generated
	 */
	EAttribute getPostUpdate_MethodName();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.jpa.orm.PrePersist <em>Pre Persist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pre Persist</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.PrePersist
	 * @generated
	 */
	EClass getPrePersist();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.jpa.orm.PrePersist#getMethodName <em>Method Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method Name</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.PrePersist#getMethodName()
	 * @see #getPrePersist()
	 * @generated
	 */
	EAttribute getPrePersist_MethodName();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.jpa.orm.PreRemove <em>Pre Remove</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pre Remove</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.PreRemove
	 * @generated
	 */
	EClass getPreRemove();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.jpa.orm.PreRemove#getMethodName <em>Method Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method Name</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.PreRemove#getMethodName()
	 * @see #getPreRemove()
	 * @generated
	 */
	EAttribute getPreRemove_MethodName();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.jpa.orm.PreUpdate <em>Pre Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pre Update</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.PreUpdate
	 * @generated
	 */
	EClass getPreUpdate();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.jpa.orm.PreUpdate#getMethodName <em>Method Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method Name</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.PreUpdate#getMethodName()
	 * @see #getPreUpdate()
	 * @generated
	 */
	EAttribute getPreUpdate_MethodName();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.jpa.orm.PrimaryKeyJoinColumn <em>Primary Key Join Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primary Key Join Column</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.PrimaryKeyJoinColumn
	 * @generated
	 */
	EClass getPrimaryKeyJoinColumn();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.jpa.orm.PrimaryKeyJoinColumn#getColumnDefinition <em>Column Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column Definition</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.PrimaryKeyJoinColumn#getColumnDefinition()
	 * @see #getPrimaryKeyJoinColumn()
	 * @generated
	 */
	EAttribute getPrimaryKeyJoinColumn_ColumnDefinition();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.jpa.orm.PrimaryKeyJoinColumn#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.PrimaryKeyJoinColumn#getName()
	 * @see #getPrimaryKeyJoinColumn()
	 * @generated
	 */
	EAttribute getPrimaryKeyJoinColumn_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.jpa.orm.PrimaryKeyJoinColumn#getReferencedColumnName <em>Referenced Column Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Referenced Column Name</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.PrimaryKeyJoinColumn#getReferencedColumnName()
	 * @see #getPrimaryKeyJoinColumn()
	 * @generated
	 */
	EAttribute getPrimaryKeyJoinColumn_ReferencedColumnName();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.jpa.orm.QueryHint <em>Query Hint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Query Hint</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.QueryHint
	 * @generated
	 */
	EClass getQueryHint();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.jpa.orm.QueryHint#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.QueryHint#getName()
	 * @see #getQueryHint()
	 * @generated
	 */
	EAttribute getQueryHint_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.jpa.orm.QueryHint#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.QueryHint#getValue()
	 * @see #getQueryHint()
	 * @generated
	 */
	EAttribute getQueryHint_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.jpa.orm.SecondaryTable <em>Secondary Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Secondary Table</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.SecondaryTable
	 * @generated
	 */
	EClass getSecondaryTable();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.jpa.orm.SecondaryTable#getPrimaryKeyJoinColumn <em>Primary Key Join Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Primary Key Join Column</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.SecondaryTable#getPrimaryKeyJoinColumn()
	 * @see #getSecondaryTable()
	 * @generated
	 */
	EReference getSecondaryTable_PrimaryKeyJoinColumn();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.jpa.orm.SecondaryTable#getUniqueConstraint <em>Unique Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Unique Constraint</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.SecondaryTable#getUniqueConstraint()
	 * @see #getSecondaryTable()
	 * @generated
	 */
	EReference getSecondaryTable_UniqueConstraint();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.jpa.orm.SecondaryTable#getCatalog <em>Catalog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Catalog</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.SecondaryTable#getCatalog()
	 * @see #getSecondaryTable()
	 * @generated
	 */
	EAttribute getSecondaryTable_Catalog();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.jpa.orm.SecondaryTable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.SecondaryTable#getName()
	 * @see #getSecondaryTable()
	 * @generated
	 */
	EAttribute getSecondaryTable_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.jpa.orm.SecondaryTable#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schema</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.SecondaryTable#getSchema()
	 * @see #getSecondaryTable()
	 * @generated
	 */
	EAttribute getSecondaryTable_Schema();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.jpa.orm.SequenceGenerator <em>Sequence Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequence Generator</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.SequenceGenerator
	 * @generated
	 */
	EClass getSequenceGenerator();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.jpa.orm.SequenceGenerator#getAllocationSize <em>Allocation Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allocation Size</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.SequenceGenerator#getAllocationSize()
	 * @see #getSequenceGenerator()
	 * @generated
	 */
	EAttribute getSequenceGenerator_AllocationSize();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.jpa.orm.SequenceGenerator#getInitialValue <em>Initial Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initial Value</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.SequenceGenerator#getInitialValue()
	 * @see #getSequenceGenerator()
	 * @generated
	 */
	EAttribute getSequenceGenerator_InitialValue();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.jpa.orm.SequenceGenerator#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.SequenceGenerator#getName()
	 * @see #getSequenceGenerator()
	 * @generated
	 */
	EAttribute getSequenceGenerator_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.jpa.orm.SequenceGenerator#getSequenceName <em>Sequence Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sequence Name</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.SequenceGenerator#getSequenceName()
	 * @see #getSequenceGenerator()
	 * @generated
	 */
	EAttribute getSequenceGenerator_SequenceName();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.jpa.orm.SqlResultSetMapping <em>Sql Result Set Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sql Result Set Mapping</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.SqlResultSetMapping
	 * @generated
	 */
	EClass getSqlResultSetMapping();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.jpa.orm.SqlResultSetMapping#getEntityResult <em>Entity Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entity Result</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.SqlResultSetMapping#getEntityResult()
	 * @see #getSqlResultSetMapping()
	 * @generated
	 */
	EReference getSqlResultSetMapping_EntityResult();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.jpa.orm.SqlResultSetMapping#getColumnResult <em>Column Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Column Result</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.SqlResultSetMapping#getColumnResult()
	 * @see #getSqlResultSetMapping()
	 * @generated
	 */
	EReference getSqlResultSetMapping_ColumnResult();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.jpa.orm.SqlResultSetMapping#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.SqlResultSetMapping#getName()
	 * @see #getSqlResultSetMapping()
	 * @generated
	 */
	EAttribute getSqlResultSetMapping_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.jpa.orm.Table <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.Table
	 * @generated
	 */
	EClass getTable();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.jpa.orm.Table#getUniqueConstraint <em>Unique Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Unique Constraint</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.Table#getUniqueConstraint()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_UniqueConstraint();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.jpa.orm.Table#getCatalog <em>Catalog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Catalog</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.Table#getCatalog()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_Catalog();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.jpa.orm.Table#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.Table#getName()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.jpa.orm.Table#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schema</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.Table#getSchema()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_Schema();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.jpa.orm.TableGenerator <em>Table Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table Generator</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.TableGenerator
	 * @generated
	 */
	EClass getTableGenerator();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.jpa.orm.TableGenerator#getUniqueConstraint <em>Unique Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Unique Constraint</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.TableGenerator#getUniqueConstraint()
	 * @see #getTableGenerator()
	 * @generated
	 */
	EReference getTableGenerator_UniqueConstraint();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.jpa.orm.TableGenerator#getAllocationSize <em>Allocation Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allocation Size</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.TableGenerator#getAllocationSize()
	 * @see #getTableGenerator()
	 * @generated
	 */
	EAttribute getTableGenerator_AllocationSize();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.jpa.orm.TableGenerator#getCatalog <em>Catalog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Catalog</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.TableGenerator#getCatalog()
	 * @see #getTableGenerator()
	 * @generated
	 */
	EAttribute getTableGenerator_Catalog();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.jpa.orm.TableGenerator#getInitialValue <em>Initial Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initial Value</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.TableGenerator#getInitialValue()
	 * @see #getTableGenerator()
	 * @generated
	 */
	EAttribute getTableGenerator_InitialValue();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.jpa.orm.TableGenerator#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.TableGenerator#getName()
	 * @see #getTableGenerator()
	 * @generated
	 */
	EAttribute getTableGenerator_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.jpa.orm.TableGenerator#getPkColumnName <em>Pk Column Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pk Column Name</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.TableGenerator#getPkColumnName()
	 * @see #getTableGenerator()
	 * @generated
	 */
	EAttribute getTableGenerator_PkColumnName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.jpa.orm.TableGenerator#getPkColumnValue <em>Pk Column Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pk Column Value</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.TableGenerator#getPkColumnValue()
	 * @see #getTableGenerator()
	 * @generated
	 */
	EAttribute getTableGenerator_PkColumnValue();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.jpa.orm.TableGenerator#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schema</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.TableGenerator#getSchema()
	 * @see #getTableGenerator()
	 * @generated
	 */
	EAttribute getTableGenerator_Schema();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.jpa.orm.TableGenerator#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Table</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.TableGenerator#getTable()
	 * @see #getTableGenerator()
	 * @generated
	 */
	EAttribute getTableGenerator_Table();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.jpa.orm.TableGenerator#getValueColumnName <em>Value Column Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Column Name</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.TableGenerator#getValueColumnName()
	 * @see #getTableGenerator()
	 * @generated
	 */
	EAttribute getTableGenerator_ValueColumnName();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.jpa.orm.Transient <em>Transient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transient</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.Transient
	 * @generated
	 */
	EClass getTransient();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.jpa.orm.Transient#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.Transient#getName()
	 * @see #getTransient()
	 * @generated
	 */
	EAttribute getTransient_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.jpa.orm.UniqueConstraint <em>Unique Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unique Constraint</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.UniqueConstraint
	 * @generated
	 */
	EClass getUniqueConstraint();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.emf.teneo.jpa.orm.UniqueConstraint#getColumnName <em>Column Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Column Name</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.UniqueConstraint#getColumnName()
	 * @see #getUniqueConstraint()
	 * @generated
	 */
	EAttribute getUniqueConstraint_ColumnName();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.jpa.orm.Version <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Version</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.Version
	 * @generated
	 */
	EClass getVersion();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.jpa.orm.Version#getColumn <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Column</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.Version#getColumn()
	 * @see #getVersion()
	 * @generated
	 */
	EReference getVersion_Column();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.jpa.orm.Version#getTemporal <em>Temporal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Temporal</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.Version#getTemporal()
	 * @see #getVersion()
	 * @generated
	 */
	EAttribute getVersion_Temporal();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.jpa.orm.Version#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.Version#getName()
	 * @see #getVersion()
	 * @generated
	 */
	EAttribute getVersion_Name();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.emf.teneo.jpa.orm.AccessType <em>Access Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Access Type</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.AccessType
	 * @generated
	 */
	EEnum getAccessType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.emf.teneo.jpa.orm.DiscriminatorType <em>Discriminator Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Discriminator Type</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.DiscriminatorType
	 * @generated
	 */
	EEnum getDiscriminatorType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.emf.teneo.jpa.orm.EnumType <em>Enum Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Enum Type</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.EnumType
	 * @generated
	 */
	EEnum getEnumType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.emf.teneo.jpa.orm.FetchType <em>Fetch Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Fetch Type</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.FetchType
	 * @generated
	 */
	EEnum getFetchType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.emf.teneo.jpa.orm.GenerationType <em>Generation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Generation Type</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.GenerationType
	 * @generated
	 */
	EEnum getGenerationType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.emf.teneo.jpa.orm.InheritanceType <em>Inheritance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Inheritance Type</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.InheritanceType
	 * @generated
	 */
	EEnum getInheritanceType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.emf.teneo.jpa.orm.TemporalType <em>Temporal Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Temporal Type</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.TemporalType
	 * @generated
	 */
	EEnum getTemporalType();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.emf.teneo.jpa.orm.AccessType <em>Access Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Access Type Object</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.AccessType
	 * @model instanceClass="org.eclipse.emf.teneo.jpa.orm.AccessType"
	 *        extendedMetaData="name='access-type:Object' baseType='access-type'"
	 * @generated
	 */
	EDataType getAccessTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.emf.teneo.jpa.orm.DiscriminatorType <em>Discriminator Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Discriminator Type Object</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.DiscriminatorType
	 * @model instanceClass="org.eclipse.emf.teneo.jpa.orm.DiscriminatorType"
	 *        extendedMetaData="name='discriminator-type:Object' baseType='discriminator-type'"
	 * @generated
	 */
	EDataType getDiscriminatorTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Discriminator Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Discriminator Value</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='discriminator-value' baseType='http://www.eclipse.org/emf/2003/XMLType#string'"
	 * @generated
	 */
	EDataType getDiscriminatorValue();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.emf.teneo.jpa.orm.EnumType <em>Enumerated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Enumerated</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.EnumType
	 * @model instanceClass="org.eclipse.emf.teneo.jpa.orm.EnumType"
	 *        extendedMetaData="name='enumerated' baseType='enum-type'"
	 * @generated
	 */
	EDataType getEnumerated();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.emf.teneo.jpa.orm.EnumType <em>Enum Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Enum Type Object</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.EnumType
	 * @model instanceClass="org.eclipse.emf.teneo.jpa.orm.EnumType"
	 *        extendedMetaData="name='enum-type:Object' baseType='enum-type'"
	 * @generated
	 */
	EDataType getEnumTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.emf.teneo.jpa.orm.FetchType <em>Fetch Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Fetch Type Object</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.FetchType
	 * @model instanceClass="org.eclipse.emf.teneo.jpa.orm.FetchType"
	 *        extendedMetaData="name='fetch-type:Object' baseType='fetch-type'"
	 * @generated
	 */
	EDataType getFetchTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.emf.teneo.jpa.orm.GenerationType <em>Generation Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Generation Type Object</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.GenerationType
	 * @model instanceClass="org.eclipse.emf.teneo.jpa.orm.GenerationType"
	 *        extendedMetaData="name='generation-type:Object' baseType='generation-type'"
	 * @generated
	 */
	EDataType getGenerationTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.emf.teneo.jpa.orm.InheritanceType <em>Inheritance Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Inheritance Type Object</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.InheritanceType
	 * @model instanceClass="org.eclipse.emf.teneo.jpa.orm.InheritanceType"
	 *        extendedMetaData="name='inheritance-type:Object' baseType='inheritance-type'"
	 * @generated
	 */
	EDataType getInheritanceTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Order By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Order By</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='order-by' baseType='http://www.eclipse.org/emf/2003/XMLType#string'"
	 * @generated
	 */
	EDataType getOrderBy();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.emf.teneo.jpa.orm.TemporalType <em>Temporal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Temporal</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.TemporalType
	 * @model instanceClass="org.eclipse.emf.teneo.jpa.orm.TemporalType"
	 *        extendedMetaData="name='temporal' baseType='temporal-type'"
	 * @generated
	 */
	EDataType getTemporal();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.emf.teneo.jpa.orm.TemporalType <em>Temporal Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Temporal Type Object</em>'.
	 * @see org.eclipse.emf.teneo.jpa.orm.TemporalType
	 * @model instanceClass="org.eclipse.emf.teneo.jpa.orm.TemporalType"
	 *        extendedMetaData="name='temporal-type:Object' baseType='temporal-type'"
	 * @generated
	 */
	EDataType getTemporalTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Version Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Version Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='versionType' baseType='http://www.eclipse.org/emf/2003/XMLType#token' pattern='[0-9]+(\\.[0-9]+)*'"
	 * @generated
	 */
	EDataType getVersionType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	OrmFactory getOrmFactory();

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
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.jpa.orm.impl.AssociationOverrideImpl <em>Association Override</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.jpa.orm.impl.AssociationOverrideImpl
		 * @see org.eclipse.emf.teneo.jpa.orm.impl.OrmPackageImpl#getAssociationOverride()
		 * @generated
		 */
		EClass ASSOCIATION_OVERRIDE = eINSTANCE.getAssociationOverride();

		/**
		 * The meta object literal for the '<em><b>Join Column</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION_OVERRIDE__JOIN_COLUMN = eINSTANCE.getAssociationOverride_JoinColumn();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSOCIATION_OVERRIDE__NAME = eINSTANCE.getAssociationOverride_Name();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.jpa.orm.impl.AttributeOverrideImpl <em>Attribute Override</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.jpa.orm.impl.AttributeOverrideImpl
		 * @see org.eclipse.emf.teneo.jpa.orm.impl.OrmPackageImpl#getAttributeOverride()
		 * @generated
		 */
		EClass ATTRIBUTE_OVERRIDE = eINSTANCE.getAttributeOverride();

		/**
		 * The meta object literal for the '<em><b>Column</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_OVERRIDE__COLUMN = eINSTANCE.getAttributeOverride_Column();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_OVERRIDE__NAME = eINSTANCE.getAttributeOverride_Name();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.jpa.orm.impl.AttributesImpl <em>Attributes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.jpa.orm.impl.AttributesImpl
		 * @see org.eclipse.emf.teneo.jpa.orm.impl.OrmPackageImpl#getAttributes()
		 * @generated
		 */
		EClass ATTRIBUTES = eINSTANCE.getAttributes();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTES__ID = eINSTANCE.getAttributes_Id();

		/**
		 * The meta object literal for the '<em><b>Embedded Id</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTES__EMBEDDED_ID = eINSTANCE.getAttributes_EmbeddedId();

		/**
		 * The meta object literal for the '<em><b>Basic</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTES__BASIC = eINSTANCE.getAttributes_Basic();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTES__VERSION = eINSTANCE.getAttributes_Version();

		/**
		 * The meta object literal for the '<em><b>Many To One</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTES__MANY_TO_ONE = eINSTANCE.getAttributes_ManyToOne();

		/**
		 * The meta object literal for the '<em><b>One To Many</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTES__ONE_TO_MANY = eINSTANCE.getAttributes_OneToMany();

		/**
		 * The meta object literal for the '<em><b>One To One</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTES__ONE_TO_ONE = eINSTANCE.getAttributes_OneToOne();

		/**
		 * The meta object literal for the '<em><b>Many To Many</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTES__MANY_TO_MANY = eINSTANCE.getAttributes_ManyToMany();

		/**
		 * The meta object literal for the '<em><b>Embedded</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTES__EMBEDDED = eINSTANCE.getAttributes_Embedded();

		/**
		 * The meta object literal for the '<em><b>Transient</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTES__TRANSIENT = eINSTANCE.getAttributes_Transient();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.jpa.orm.impl.BasicImpl <em>Basic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.jpa.orm.impl.BasicImpl
		 * @see org.eclipse.emf.teneo.jpa.orm.impl.OrmPackageImpl#getBasic()
		 * @generated
		 */
		EClass BASIC = eINSTANCE.getBasic();

		/**
		 * The meta object literal for the '<em><b>Column</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASIC__COLUMN = eINSTANCE.getBasic_Column();

		/**
		 * The meta object literal for the '<em><b>Lob</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASIC__LOB = eINSTANCE.getBasic_Lob();

		/**
		 * The meta object literal for the '<em><b>Temporal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASIC__TEMPORAL = eINSTANCE.getBasic_Temporal();

		/**
		 * The meta object literal for the '<em><b>Enumerated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASIC__ENUMERATED = eINSTANCE.getBasic_Enumerated();

		/**
		 * The meta object literal for the '<em><b>Fetch</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASIC__FETCH = eINSTANCE.getBasic_Fetch();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASIC__NAME = eINSTANCE.getBasic_Name();

		/**
		 * The meta object literal for the '<em><b>Optional</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASIC__OPTIONAL = eINSTANCE.getBasic_Optional();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.jpa.orm.impl.CascadeTypeImpl <em>Cascade Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.jpa.orm.impl.CascadeTypeImpl
		 * @see org.eclipse.emf.teneo.jpa.orm.impl.OrmPackageImpl#getCascadeType()
		 * @generated
		 */
		EClass CASCADE_TYPE = eINSTANCE.getCascadeType();

		/**
		 * The meta object literal for the '<em><b>Cascade All</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASCADE_TYPE__CASCADE_ALL = eINSTANCE.getCascadeType_CascadeAll();

		/**
		 * The meta object literal for the '<em><b>Cascade Persist</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASCADE_TYPE__CASCADE_PERSIST = eINSTANCE.getCascadeType_CascadePersist();

		/**
		 * The meta object literal for the '<em><b>Cascade Merge</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASCADE_TYPE__CASCADE_MERGE = eINSTANCE.getCascadeType_CascadeMerge();

		/**
		 * The meta object literal for the '<em><b>Cascade Remove</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASCADE_TYPE__CASCADE_REMOVE = eINSTANCE.getCascadeType_CascadeRemove();

		/**
		 * The meta object literal for the '<em><b>Cascade Refresh</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASCADE_TYPE__CASCADE_REFRESH = eINSTANCE.getCascadeType_CascadeRefresh();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.jpa.orm.impl.ColumnImpl <em>Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.jpa.orm.impl.ColumnImpl
		 * @see org.eclipse.emf.teneo.jpa.orm.impl.OrmPackageImpl#getColumn()
		 * @generated
		 */
		EClass COLUMN = eINSTANCE.getColumn();

		/**
		 * The meta object literal for the '<em><b>Column Definition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__COLUMN_DEFINITION = eINSTANCE.getColumn_ColumnDefinition();

		/**
		 * The meta object literal for the '<em><b>Insertable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__INSERTABLE = eINSTANCE.getColumn_Insertable();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__LENGTH = eINSTANCE.getColumn_Length();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__NAME = eINSTANCE.getColumn_Name();

		/**
		 * The meta object literal for the '<em><b>Nullable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__NULLABLE = eINSTANCE.getColumn_Nullable();

		/**
		 * The meta object literal for the '<em><b>Precision</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__PRECISION = eINSTANCE.getColumn_Precision();

		/**
		 * The meta object literal for the '<em><b>Scale</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__SCALE = eINSTANCE.getColumn_Scale();

		/**
		 * The meta object literal for the '<em><b>Table</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__TABLE = eINSTANCE.getColumn_Table();

		/**
		 * The meta object literal for the '<em><b>Unique</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__UNIQUE = eINSTANCE.getColumn_Unique();

		/**
		 * The meta object literal for the '<em><b>Updatable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__UPDATABLE = eINSTANCE.getColumn_Updatable();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.jpa.orm.impl.ColumnResultImpl <em>Column Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.jpa.orm.impl.ColumnResultImpl
		 * @see org.eclipse.emf.teneo.jpa.orm.impl.OrmPackageImpl#getColumnResult()
		 * @generated
		 */
		EClass COLUMN_RESULT = eINSTANCE.getColumnResult();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN_RESULT__NAME = eINSTANCE.getColumnResult_Name();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.jpa.orm.impl.DiscriminatorColumnImpl <em>Discriminator Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.jpa.orm.impl.DiscriminatorColumnImpl
		 * @see org.eclipse.emf.teneo.jpa.orm.impl.OrmPackageImpl#getDiscriminatorColumn()
		 * @generated
		 */
		EClass DISCRIMINATOR_COLUMN = eINSTANCE.getDiscriminatorColumn();

		/**
		 * The meta object literal for the '<em><b>Column Definition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISCRIMINATOR_COLUMN__COLUMN_DEFINITION = eINSTANCE.getDiscriminatorColumn_ColumnDefinition();

		/**
		 * The meta object literal for the '<em><b>Discriminator Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISCRIMINATOR_COLUMN__DISCRIMINATOR_TYPE = eINSTANCE.getDiscriminatorColumn_DiscriminatorType();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISCRIMINATOR_COLUMN__LENGTH = eINSTANCE.getDiscriminatorColumn_Length();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISCRIMINATOR_COLUMN__NAME = eINSTANCE.getDiscriminatorColumn_Name();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.jpa.orm.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.jpa.orm.impl.DocumentRootImpl
		 * @see org.eclipse.emf.teneo.jpa.orm.impl.OrmPackageImpl#getDocumentRoot()
		 * @generated
		 */
		EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

		/**
		 * The meta object literal for the '<em><b>Entity Mappings</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ENTITY_MAPPINGS = eINSTANCE.getDocumentRoot_EntityMappings();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.jpa.orm.impl.EmbeddableImpl <em>Embeddable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.jpa.orm.impl.EmbeddableImpl
		 * @see org.eclipse.emf.teneo.jpa.orm.impl.OrmPackageImpl#getEmbeddable()
		 * @generated
		 */
		EClass EMBEDDABLE = eINSTANCE.getEmbeddable();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMBEDDABLE__DESCRIPTION = eINSTANCE.getEmbeddable_Description();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMBEDDABLE__ATTRIBUTES = eINSTANCE.getEmbeddable_Attributes();

		/**
		 * The meta object literal for the '<em><b>Access</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMBEDDABLE__ACCESS = eINSTANCE.getEmbeddable_Access();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMBEDDABLE__CLASS = eINSTANCE.getEmbeddable_Class();

		/**
		 * The meta object literal for the '<em><b>Metadata Complete</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMBEDDABLE__METADATA_COMPLETE = eINSTANCE.getEmbeddable_MetadataComplete();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.jpa.orm.impl.EmbeddableAttributesImpl <em>Embeddable Attributes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.jpa.orm.impl.EmbeddableAttributesImpl
		 * @see org.eclipse.emf.teneo.jpa.orm.impl.OrmPackageImpl#getEmbeddableAttributes()
		 * @generated
		 */
		EClass EMBEDDABLE_ATTRIBUTES = eINSTANCE.getEmbeddableAttributes();

		/**
		 * The meta object literal for the '<em><b>Basic</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMBEDDABLE_ATTRIBUTES__BASIC = eINSTANCE.getEmbeddableAttributes_Basic();

		/**
		 * The meta object literal for the '<em><b>Transient</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMBEDDABLE_ATTRIBUTES__TRANSIENT = eINSTANCE.getEmbeddableAttributes_Transient();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.jpa.orm.impl.EmbeddedImpl <em>Embedded</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.jpa.orm.impl.EmbeddedImpl
		 * @see org.eclipse.emf.teneo.jpa.orm.impl.OrmPackageImpl#getEmbedded()
		 * @generated
		 */
		EClass EMBEDDED = eINSTANCE.getEmbedded();

		/**
		 * The meta object literal for the '<em><b>Attribute Override</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMBEDDED__ATTRIBUTE_OVERRIDE = eINSTANCE.getEmbedded_AttributeOverride();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMBEDDED__NAME = eINSTANCE.getEmbedded_Name();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.jpa.orm.impl.EmbeddedIdImpl <em>Embedded Id</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.jpa.orm.impl.EmbeddedIdImpl
		 * @see org.eclipse.emf.teneo.jpa.orm.impl.OrmPackageImpl#getEmbeddedId()
		 * @generated
		 */
		EClass EMBEDDED_ID = eINSTANCE.getEmbeddedId();

		/**
		 * The meta object literal for the '<em><b>Attribute Override</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMBEDDED_ID__ATTRIBUTE_OVERRIDE = eINSTANCE.getEmbeddedId_AttributeOverride();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMBEDDED_ID__NAME = eINSTANCE.getEmbeddedId_Name();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.jpa.orm.impl.EmptyTypeImpl <em>Empty Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.jpa.orm.impl.EmptyTypeImpl
		 * @see org.eclipse.emf.teneo.jpa.orm.impl.OrmPackageImpl#getEmptyType()
		 * @generated
		 */
		EClass EMPTY_TYPE = eINSTANCE.getEmptyType();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.jpa.orm.impl.EntityImpl <em>Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.jpa.orm.impl.EntityImpl
		 * @see org.eclipse.emf.teneo.jpa.orm.impl.OrmPackageImpl#getEntity()
		 * @generated
		 */
		EClass ENTITY = eINSTANCE.getEntity();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY__DESCRIPTION = eINSTANCE.getEntity_Description();

		/**
		 * The meta object literal for the '<em><b>Table</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__TABLE = eINSTANCE.getEntity_Table();

		/**
		 * The meta object literal for the '<em><b>Secondary Table</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__SECONDARY_TABLE = eINSTANCE.getEntity_SecondaryTable();

		/**
		 * The meta object literal for the '<em><b>Primary Key Join Column</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__PRIMARY_KEY_JOIN_COLUMN = eINSTANCE.getEntity_PrimaryKeyJoinColumn();

		/**
		 * The meta object literal for the '<em><b>Id Class</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__ID_CLASS = eINSTANCE.getEntity_IdClass();

		/**
		 * The meta object literal for the '<em><b>Inheritance</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__INHERITANCE = eINSTANCE.getEntity_Inheritance();

		/**
		 * The meta object literal for the '<em><b>Discriminator Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY__DISCRIMINATOR_VALUE = eINSTANCE.getEntity_DiscriminatorValue();

		/**
		 * The meta object literal for the '<em><b>Discriminator Column</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__DISCRIMINATOR_COLUMN = eINSTANCE.getEntity_DiscriminatorColumn();

		/**
		 * The meta object literal for the '<em><b>Sequence Generator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__SEQUENCE_GENERATOR = eINSTANCE.getEntity_SequenceGenerator();

		/**
		 * The meta object literal for the '<em><b>Table Generator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__TABLE_GENERATOR = eINSTANCE.getEntity_TableGenerator();

		/**
		 * The meta object literal for the '<em><b>Named Query</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__NAMED_QUERY = eINSTANCE.getEntity_NamedQuery();

		/**
		 * The meta object literal for the '<em><b>Named Native Query</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__NAMED_NATIVE_QUERY = eINSTANCE.getEntity_NamedNativeQuery();

		/**
		 * The meta object literal for the '<em><b>Sql Result Set Mapping</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__SQL_RESULT_SET_MAPPING = eINSTANCE.getEntity_SqlResultSetMapping();

		/**
		 * The meta object literal for the '<em><b>Exclude Default Listeners</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__EXCLUDE_DEFAULT_LISTENERS = eINSTANCE.getEntity_ExcludeDefaultListeners();

		/**
		 * The meta object literal for the '<em><b>Exclude Superclass Listeners</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__EXCLUDE_SUPERCLASS_LISTENERS = eINSTANCE.getEntity_ExcludeSuperclassListeners();

		/**
		 * The meta object literal for the '<em><b>Entity Listeners</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__ENTITY_LISTENERS = eINSTANCE.getEntity_EntityListeners();

		/**
		 * The meta object literal for the '<em><b>Pre Persist</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__PRE_PERSIST = eINSTANCE.getEntity_PrePersist();

		/**
		 * The meta object literal for the '<em><b>Post Persist</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__POST_PERSIST = eINSTANCE.getEntity_PostPersist();

		/**
		 * The meta object literal for the '<em><b>Pre Remove</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__PRE_REMOVE = eINSTANCE.getEntity_PreRemove();

		/**
		 * The meta object literal for the '<em><b>Post Remove</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__POST_REMOVE = eINSTANCE.getEntity_PostRemove();

		/**
		 * The meta object literal for the '<em><b>Pre Update</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__PRE_UPDATE = eINSTANCE.getEntity_PreUpdate();

		/**
		 * The meta object literal for the '<em><b>Post Update</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__POST_UPDATE = eINSTANCE.getEntity_PostUpdate();

		/**
		 * The meta object literal for the '<em><b>Post Load</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__POST_LOAD = eINSTANCE.getEntity_PostLoad();

		/**
		 * The meta object literal for the '<em><b>Attribute Override</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__ATTRIBUTE_OVERRIDE = eINSTANCE.getEntity_AttributeOverride();

		/**
		 * The meta object literal for the '<em><b>Association Override</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__ASSOCIATION_OVERRIDE = eINSTANCE.getEntity_AssociationOverride();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__ATTRIBUTES = eINSTANCE.getEntity_Attributes();

		/**
		 * The meta object literal for the '<em><b>Access</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY__ACCESS = eINSTANCE.getEntity_Access();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY__CLASS = eINSTANCE.getEntity_Class();

		/**
		 * The meta object literal for the '<em><b>Metadata Complete</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY__METADATA_COMPLETE = eINSTANCE.getEntity_MetadataComplete();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY__NAME = eINSTANCE.getEntity_Name();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.jpa.orm.impl.EntityListenerImpl <em>Entity Listener</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.jpa.orm.impl.EntityListenerImpl
		 * @see org.eclipse.emf.teneo.jpa.orm.impl.OrmPackageImpl#getEntityListener()
		 * @generated
		 */
		EClass ENTITY_LISTENER = eINSTANCE.getEntityListener();

		/**
		 * The meta object literal for the '<em><b>Pre Persist</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_LISTENER__PRE_PERSIST = eINSTANCE.getEntityListener_PrePersist();

		/**
		 * The meta object literal for the '<em><b>Post Persist</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_LISTENER__POST_PERSIST = eINSTANCE.getEntityListener_PostPersist();

		/**
		 * The meta object literal for the '<em><b>Pre Remove</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_LISTENER__PRE_REMOVE = eINSTANCE.getEntityListener_PreRemove();

		/**
		 * The meta object literal for the '<em><b>Post Remove</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_LISTENER__POST_REMOVE = eINSTANCE.getEntityListener_PostRemove();

		/**
		 * The meta object literal for the '<em><b>Pre Update</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_LISTENER__PRE_UPDATE = eINSTANCE.getEntityListener_PreUpdate();

		/**
		 * The meta object literal for the '<em><b>Post Update</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_LISTENER__POST_UPDATE = eINSTANCE.getEntityListener_PostUpdate();

		/**
		 * The meta object literal for the '<em><b>Post Load</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_LISTENER__POST_LOAD = eINSTANCE.getEntityListener_PostLoad();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_LISTENER__CLASS = eINSTANCE.getEntityListener_Class();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.jpa.orm.impl.EntityListenersImpl <em>Entity Listeners</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.jpa.orm.impl.EntityListenersImpl
		 * @see org.eclipse.emf.teneo.jpa.orm.impl.OrmPackageImpl#getEntityListeners()
		 * @generated
		 */
		EClass ENTITY_LISTENERS = eINSTANCE.getEntityListeners();

		/**
		 * The meta object literal for the '<em><b>Entity Listener</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_LISTENERS__ENTITY_LISTENER = eINSTANCE.getEntityListeners_EntityListener();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.jpa.orm.impl.EntityMappingsTypeImpl <em>Entity Mappings Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.jpa.orm.impl.EntityMappingsTypeImpl
		 * @see org.eclipse.emf.teneo.jpa.orm.impl.OrmPackageImpl#getEntityMappingsType()
		 * @generated
		 */
		EClass ENTITY_MAPPINGS_TYPE = eINSTANCE.getEntityMappingsType();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_MAPPINGS_TYPE__DESCRIPTION = eINSTANCE.getEntityMappingsType_Description();

		/**
		 * The meta object literal for the '<em><b>Persistence Unit Metadata</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_MAPPINGS_TYPE__PERSISTENCE_UNIT_METADATA = eINSTANCE.getEntityMappingsType_PersistenceUnitMetadata();

		/**
		 * The meta object literal for the '<em><b>Package</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_MAPPINGS_TYPE__PACKAGE = eINSTANCE.getEntityMappingsType_Package();

		/**
		 * The meta object literal for the '<em><b>Schema</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_MAPPINGS_TYPE__SCHEMA = eINSTANCE.getEntityMappingsType_Schema();

		/**
		 * The meta object literal for the '<em><b>Catalog</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_MAPPINGS_TYPE__CATALOG = eINSTANCE.getEntityMappingsType_Catalog();

		/**
		 * The meta object literal for the '<em><b>Access</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_MAPPINGS_TYPE__ACCESS = eINSTANCE.getEntityMappingsType_Access();

		/**
		 * The meta object literal for the '<em><b>Sequence Generator</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_MAPPINGS_TYPE__SEQUENCE_GENERATOR = eINSTANCE.getEntityMappingsType_SequenceGenerator();

		/**
		 * The meta object literal for the '<em><b>Table Generator</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_MAPPINGS_TYPE__TABLE_GENERATOR = eINSTANCE.getEntityMappingsType_TableGenerator();

		/**
		 * The meta object literal for the '<em><b>Named Query</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_MAPPINGS_TYPE__NAMED_QUERY = eINSTANCE.getEntityMappingsType_NamedQuery();

		/**
		 * The meta object literal for the '<em><b>Named Native Query</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_MAPPINGS_TYPE__NAMED_NATIVE_QUERY = eINSTANCE.getEntityMappingsType_NamedNativeQuery();

		/**
		 * The meta object literal for the '<em><b>Sql Result Set Mapping</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_MAPPINGS_TYPE__SQL_RESULT_SET_MAPPING = eINSTANCE.getEntityMappingsType_SqlResultSetMapping();

		/**
		 * The meta object literal for the '<em><b>Mapped Superclass</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_MAPPINGS_TYPE__MAPPED_SUPERCLASS = eINSTANCE.getEntityMappingsType_MappedSuperclass();

		/**
		 * The meta object literal for the '<em><b>Entity</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_MAPPINGS_TYPE__ENTITY = eINSTANCE.getEntityMappingsType_Entity();

		/**
		 * The meta object literal for the '<em><b>Embeddable</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_MAPPINGS_TYPE__EMBEDDABLE = eINSTANCE.getEntityMappingsType_Embeddable();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_MAPPINGS_TYPE__VERSION = eINSTANCE.getEntityMappingsType_Version();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.jpa.orm.impl.EntityResultImpl <em>Entity Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.jpa.orm.impl.EntityResultImpl
		 * @see org.eclipse.emf.teneo.jpa.orm.impl.OrmPackageImpl#getEntityResult()
		 * @generated
		 */
		EClass ENTITY_RESULT = eINSTANCE.getEntityResult();

		/**
		 * The meta object literal for the '<em><b>Field Result</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_RESULT__FIELD_RESULT = eINSTANCE.getEntityResult_FieldResult();

		/**
		 * The meta object literal for the '<em><b>Discriminator Column</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_RESULT__DISCRIMINATOR_COLUMN = eINSTANCE.getEntityResult_DiscriminatorColumn();

		/**
		 * The meta object literal for the '<em><b>Entity Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_RESULT__ENTITY_CLASS = eINSTANCE.getEntityResult_EntityClass();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.jpa.orm.impl.FieldResultImpl <em>Field Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.jpa.orm.impl.FieldResultImpl
		 * @see org.eclipse.emf.teneo.jpa.orm.impl.OrmPackageImpl#getFieldResult()
		 * @generated
		 */
		EClass FIELD_RESULT = eINSTANCE.getFieldResult();

		/**
		 * The meta object literal for the '<em><b>Column</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD_RESULT__COLUMN = eINSTANCE.getFieldResult_Column();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD_RESULT__NAME = eINSTANCE.getFieldResult_Name();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.jpa.orm.impl.GeneratedValueImpl <em>Generated Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.jpa.orm.impl.GeneratedValueImpl
		 * @see org.eclipse.emf.teneo.jpa.orm.impl.OrmPackageImpl#getGeneratedValue()
		 * @generated
		 */
		EClass GENERATED_VALUE = eINSTANCE.getGeneratedValue();

		/**
		 * The meta object literal for the '<em><b>Generator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATED_VALUE__GENERATOR = eINSTANCE.getGeneratedValue_Generator();

		/**
		 * The meta object literal for the '<em><b>Strategy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATED_VALUE__STRATEGY = eINSTANCE.getGeneratedValue_Strategy();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.jpa.orm.impl.IdImpl <em>Id</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.jpa.orm.impl.IdImpl
		 * @see org.eclipse.emf.teneo.jpa.orm.impl.OrmPackageImpl#getId()
		 * @generated
		 */
		EClass ID = eINSTANCE.getId();

		/**
		 * The meta object literal for the '<em><b>Column</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ID__COLUMN = eINSTANCE.getId_Column();

		/**
		 * The meta object literal for the '<em><b>Generated Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ID__GENERATED_VALUE = eINSTANCE.getId_GeneratedValue();

		/**
		 * The meta object literal for the '<em><b>Temporal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID__TEMPORAL = eINSTANCE.getId_Temporal();

		/**
		 * The meta object literal for the '<em><b>Table Generator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ID__TABLE_GENERATOR = eINSTANCE.getId_TableGenerator();

		/**
		 * The meta object literal for the '<em><b>Sequence Generator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ID__SEQUENCE_GENERATOR = eINSTANCE.getId_SequenceGenerator();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID__NAME = eINSTANCE.getId_Name();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.jpa.orm.impl.IdClassImpl <em>Id Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.jpa.orm.impl.IdClassImpl
		 * @see org.eclipse.emf.teneo.jpa.orm.impl.OrmPackageImpl#getIdClass()
		 * @generated
		 */
		EClass ID_CLASS = eINSTANCE.getIdClass();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_CLASS__CLASS = eINSTANCE.getIdClass_Class();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.jpa.orm.impl.InheritanceImpl <em>Inheritance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.jpa.orm.impl.InheritanceImpl
		 * @see org.eclipse.emf.teneo.jpa.orm.impl.OrmPackageImpl#getInheritance()
		 * @generated
		 */
		EClass INHERITANCE = eINSTANCE.getInheritance();

		/**
		 * The meta object literal for the '<em><b>Strategy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INHERITANCE__STRATEGY = eINSTANCE.getInheritance_Strategy();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.jpa.orm.impl.JoinColumnImpl <em>Join Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.jpa.orm.impl.JoinColumnImpl
		 * @see org.eclipse.emf.teneo.jpa.orm.impl.OrmPackageImpl#getJoinColumn()
		 * @generated
		 */
		EClass JOIN_COLUMN = eINSTANCE.getJoinColumn();

		/**
		 * The meta object literal for the '<em><b>Column Definition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOIN_COLUMN__COLUMN_DEFINITION = eINSTANCE.getJoinColumn_ColumnDefinition();

		/**
		 * The meta object literal for the '<em><b>Insertable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOIN_COLUMN__INSERTABLE = eINSTANCE.getJoinColumn_Insertable();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOIN_COLUMN__NAME = eINSTANCE.getJoinColumn_Name();

		/**
		 * The meta object literal for the '<em><b>Nullable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOIN_COLUMN__NULLABLE = eINSTANCE.getJoinColumn_Nullable();

		/**
		 * The meta object literal for the '<em><b>Referenced Column Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOIN_COLUMN__REFERENCED_COLUMN_NAME = eINSTANCE.getJoinColumn_ReferencedColumnName();

		/**
		 * The meta object literal for the '<em><b>Table</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOIN_COLUMN__TABLE = eINSTANCE.getJoinColumn_Table();

		/**
		 * The meta object literal for the '<em><b>Unique</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOIN_COLUMN__UNIQUE = eINSTANCE.getJoinColumn_Unique();

		/**
		 * The meta object literal for the '<em><b>Updatable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOIN_COLUMN__UPDATABLE = eINSTANCE.getJoinColumn_Updatable();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.jpa.orm.impl.JoinTableImpl <em>Join Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.jpa.orm.impl.JoinTableImpl
		 * @see org.eclipse.emf.teneo.jpa.orm.impl.OrmPackageImpl#getJoinTable()
		 * @generated
		 */
		EClass JOIN_TABLE = eINSTANCE.getJoinTable();

		/**
		 * The meta object literal for the '<em><b>Join Column</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOIN_TABLE__JOIN_COLUMN = eINSTANCE.getJoinTable_JoinColumn();

		/**
		 * The meta object literal for the '<em><b>Inverse Join Column</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOIN_TABLE__INVERSE_JOIN_COLUMN = eINSTANCE.getJoinTable_InverseJoinColumn();

		/**
		 * The meta object literal for the '<em><b>Unique Constraint</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOIN_TABLE__UNIQUE_CONSTRAINT = eINSTANCE.getJoinTable_UniqueConstraint();

		/**
		 * The meta object literal for the '<em><b>Catalog</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOIN_TABLE__CATALOG = eINSTANCE.getJoinTable_Catalog();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOIN_TABLE__NAME = eINSTANCE.getJoinTable_Name();

		/**
		 * The meta object literal for the '<em><b>Schema</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOIN_TABLE__SCHEMA = eINSTANCE.getJoinTable_Schema();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.jpa.orm.impl.LobImpl <em>Lob</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.jpa.orm.impl.LobImpl
		 * @see org.eclipse.emf.teneo.jpa.orm.impl.OrmPackageImpl#getLob()
		 * @generated
		 */
		EClass LOB = eINSTANCE.getLob();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.jpa.orm.impl.ManyToManyImpl <em>Many To Many</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.jpa.orm.impl.ManyToManyImpl
		 * @see org.eclipse.emf.teneo.jpa.orm.impl.OrmPackageImpl#getManyToMany()
		 * @generated
		 */
		EClass MANY_TO_MANY = eINSTANCE.getManyToMany();

		/**
		 * The meta object literal for the '<em><b>Order By</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MANY_TO_MANY__ORDER_BY = eINSTANCE.getManyToMany_OrderBy();

		/**
		 * The meta object literal for the '<em><b>Map Key</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MANY_TO_MANY__MAP_KEY = eINSTANCE.getManyToMany_MapKey();

		/**
		 * The meta object literal for the '<em><b>Join Table</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MANY_TO_MANY__JOIN_TABLE = eINSTANCE.getManyToMany_JoinTable();

		/**
		 * The meta object literal for the '<em><b>Cascade</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MANY_TO_MANY__CASCADE = eINSTANCE.getManyToMany_Cascade();

		/**
		 * The meta object literal for the '<em><b>Fetch</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MANY_TO_MANY__FETCH = eINSTANCE.getManyToMany_Fetch();

		/**
		 * The meta object literal for the '<em><b>Mapped By</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MANY_TO_MANY__MAPPED_BY = eINSTANCE.getManyToMany_MappedBy();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MANY_TO_MANY__NAME = eINSTANCE.getManyToMany_Name();

		/**
		 * The meta object literal for the '<em><b>Target Entity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MANY_TO_MANY__TARGET_ENTITY = eINSTANCE.getManyToMany_TargetEntity();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.jpa.orm.impl.ManyToOneImpl <em>Many To One</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.jpa.orm.impl.ManyToOneImpl
		 * @see org.eclipse.emf.teneo.jpa.orm.impl.OrmPackageImpl#getManyToOne()
		 * @generated
		 */
		EClass MANY_TO_ONE = eINSTANCE.getManyToOne();

		/**
		 * The meta object literal for the '<em><b>Join Column</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MANY_TO_ONE__JOIN_COLUMN = eINSTANCE.getManyToOne_JoinColumn();

		/**
		 * The meta object literal for the '<em><b>Join Table</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MANY_TO_ONE__JOIN_TABLE = eINSTANCE.getManyToOne_JoinTable();

		/**
		 * The meta object literal for the '<em><b>Cascade</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MANY_TO_ONE__CASCADE = eINSTANCE.getManyToOne_Cascade();

		/**
		 * The meta object literal for the '<em><b>Fetch</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MANY_TO_ONE__FETCH = eINSTANCE.getManyToOne_Fetch();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MANY_TO_ONE__NAME = eINSTANCE.getManyToOne_Name();

		/**
		 * The meta object literal for the '<em><b>Optional</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MANY_TO_ONE__OPTIONAL = eINSTANCE.getManyToOne_Optional();

		/**
		 * The meta object literal for the '<em><b>Target Entity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MANY_TO_ONE__TARGET_ENTITY = eINSTANCE.getManyToOne_TargetEntity();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.jpa.orm.impl.MapKeyImpl <em>Map Key</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.jpa.orm.impl.MapKeyImpl
		 * @see org.eclipse.emf.teneo.jpa.orm.impl.OrmPackageImpl#getMapKey()
		 * @generated
		 */
		EClass MAP_KEY = eINSTANCE.getMapKey();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAP_KEY__NAME = eINSTANCE.getMapKey_Name();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.jpa.orm.impl.MappedSuperclassImpl <em>Mapped Superclass</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.jpa.orm.impl.MappedSuperclassImpl
		 * @see org.eclipse.emf.teneo.jpa.orm.impl.OrmPackageImpl#getMappedSuperclass()
		 * @generated
		 */
		EClass MAPPED_SUPERCLASS = eINSTANCE.getMappedSuperclass();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAPPED_SUPERCLASS__DESCRIPTION = eINSTANCE.getMappedSuperclass_Description();

		/**
		 * The meta object literal for the '<em><b>Id Class</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPED_SUPERCLASS__ID_CLASS = eINSTANCE.getMappedSuperclass_IdClass();

		/**
		 * The meta object literal for the '<em><b>Exclude Default Listeners</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPED_SUPERCLASS__EXCLUDE_DEFAULT_LISTENERS = eINSTANCE.getMappedSuperclass_ExcludeDefaultListeners();

		/**
		 * The meta object literal for the '<em><b>Exclude Superclass Listeners</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPED_SUPERCLASS__EXCLUDE_SUPERCLASS_LISTENERS = eINSTANCE.getMappedSuperclass_ExcludeSuperclassListeners();

		/**
		 * The meta object literal for the '<em><b>Entity Listeners</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPED_SUPERCLASS__ENTITY_LISTENERS = eINSTANCE.getMappedSuperclass_EntityListeners();

		/**
		 * The meta object literal for the '<em><b>Pre Persist</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPED_SUPERCLASS__PRE_PERSIST = eINSTANCE.getMappedSuperclass_PrePersist();

		/**
		 * The meta object literal for the '<em><b>Post Persist</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPED_SUPERCLASS__POST_PERSIST = eINSTANCE.getMappedSuperclass_PostPersist();

		/**
		 * The meta object literal for the '<em><b>Pre Remove</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPED_SUPERCLASS__PRE_REMOVE = eINSTANCE.getMappedSuperclass_PreRemove();

		/**
		 * The meta object literal for the '<em><b>Post Remove</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPED_SUPERCLASS__POST_REMOVE = eINSTANCE.getMappedSuperclass_PostRemove();

		/**
		 * The meta object literal for the '<em><b>Pre Update</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPED_SUPERCLASS__PRE_UPDATE = eINSTANCE.getMappedSuperclass_PreUpdate();

		/**
		 * The meta object literal for the '<em><b>Post Update</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPED_SUPERCLASS__POST_UPDATE = eINSTANCE.getMappedSuperclass_PostUpdate();

		/**
		 * The meta object literal for the '<em><b>Post Load</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPED_SUPERCLASS__POST_LOAD = eINSTANCE.getMappedSuperclass_PostLoad();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPED_SUPERCLASS__ATTRIBUTES = eINSTANCE.getMappedSuperclass_Attributes();

		/**
		 * The meta object literal for the '<em><b>Access</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAPPED_SUPERCLASS__ACCESS = eINSTANCE.getMappedSuperclass_Access();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAPPED_SUPERCLASS__CLASS = eINSTANCE.getMappedSuperclass_Class();

		/**
		 * The meta object literal for the '<em><b>Metadata Complete</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAPPED_SUPERCLASS__METADATA_COMPLETE = eINSTANCE.getMappedSuperclass_MetadataComplete();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.jpa.orm.impl.NamedNativeQueryImpl <em>Named Native Query</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.jpa.orm.impl.NamedNativeQueryImpl
		 * @see org.eclipse.emf.teneo.jpa.orm.impl.OrmPackageImpl#getNamedNativeQuery()
		 * @generated
		 */
		EClass NAMED_NATIVE_QUERY = eINSTANCE.getNamedNativeQuery();

		/**
		 * The meta object literal for the '<em><b>Query</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_NATIVE_QUERY__QUERY = eINSTANCE.getNamedNativeQuery_Query();

		/**
		 * The meta object literal for the '<em><b>Hint</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAMED_NATIVE_QUERY__HINT = eINSTANCE.getNamedNativeQuery_Hint();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_NATIVE_QUERY__NAME = eINSTANCE.getNamedNativeQuery_Name();

		/**
		 * The meta object literal for the '<em><b>Result Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_NATIVE_QUERY__RESULT_CLASS = eINSTANCE.getNamedNativeQuery_ResultClass();

		/**
		 * The meta object literal for the '<em><b>Result Set Mapping</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_NATIVE_QUERY__RESULT_SET_MAPPING = eINSTANCE.getNamedNativeQuery_ResultSetMapping();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.jpa.orm.impl.NamedQueryImpl <em>Named Query</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.jpa.orm.impl.NamedQueryImpl
		 * @see org.eclipse.emf.teneo.jpa.orm.impl.OrmPackageImpl#getNamedQuery()
		 * @generated
		 */
		EClass NAMED_QUERY = eINSTANCE.getNamedQuery();

		/**
		 * The meta object literal for the '<em><b>Query</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_QUERY__QUERY = eINSTANCE.getNamedQuery_Query();

		/**
		 * The meta object literal for the '<em><b>Hint</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAMED_QUERY__HINT = eINSTANCE.getNamedQuery_Hint();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_QUERY__NAME = eINSTANCE.getNamedQuery_Name();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.jpa.orm.impl.OneToManyImpl <em>One To Many</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.jpa.orm.impl.OneToManyImpl
		 * @see org.eclipse.emf.teneo.jpa.orm.impl.OrmPackageImpl#getOneToMany()
		 * @generated
		 */
		EClass ONE_TO_MANY = eINSTANCE.getOneToMany();

		/**
		 * The meta object literal for the '<em><b>Order By</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ONE_TO_MANY__ORDER_BY = eINSTANCE.getOneToMany_OrderBy();

		/**
		 * The meta object literal for the '<em><b>Map Key</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ONE_TO_MANY__MAP_KEY = eINSTANCE.getOneToMany_MapKey();

		/**
		 * The meta object literal for the '<em><b>Join Table</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ONE_TO_MANY__JOIN_TABLE = eINSTANCE.getOneToMany_JoinTable();

		/**
		 * The meta object literal for the '<em><b>Join Column</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ONE_TO_MANY__JOIN_COLUMN = eINSTANCE.getOneToMany_JoinColumn();

		/**
		 * The meta object literal for the '<em><b>Cascade</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ONE_TO_MANY__CASCADE = eINSTANCE.getOneToMany_Cascade();

		/**
		 * The meta object literal for the '<em><b>Fetch</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ONE_TO_MANY__FETCH = eINSTANCE.getOneToMany_Fetch();

		/**
		 * The meta object literal for the '<em><b>Mapped By</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ONE_TO_MANY__MAPPED_BY = eINSTANCE.getOneToMany_MappedBy();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ONE_TO_MANY__NAME = eINSTANCE.getOneToMany_Name();

		/**
		 * The meta object literal for the '<em><b>Target Entity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ONE_TO_MANY__TARGET_ENTITY = eINSTANCE.getOneToMany_TargetEntity();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.jpa.orm.impl.OneToOneImpl <em>One To One</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.jpa.orm.impl.OneToOneImpl
		 * @see org.eclipse.emf.teneo.jpa.orm.impl.OrmPackageImpl#getOneToOne()
		 * @generated
		 */
		EClass ONE_TO_ONE = eINSTANCE.getOneToOne();

		/**
		 * The meta object literal for the '<em><b>Primary Key Join Column</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ONE_TO_ONE__PRIMARY_KEY_JOIN_COLUMN = eINSTANCE.getOneToOne_PrimaryKeyJoinColumn();

		/**
		 * The meta object literal for the '<em><b>Join Column</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ONE_TO_ONE__JOIN_COLUMN = eINSTANCE.getOneToOne_JoinColumn();

		/**
		 * The meta object literal for the '<em><b>Join Table</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ONE_TO_ONE__JOIN_TABLE = eINSTANCE.getOneToOne_JoinTable();

		/**
		 * The meta object literal for the '<em><b>Cascade</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ONE_TO_ONE__CASCADE = eINSTANCE.getOneToOne_Cascade();

		/**
		 * The meta object literal for the '<em><b>Fetch</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ONE_TO_ONE__FETCH = eINSTANCE.getOneToOne_Fetch();

		/**
		 * The meta object literal for the '<em><b>Mapped By</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ONE_TO_ONE__MAPPED_BY = eINSTANCE.getOneToOne_MappedBy();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ONE_TO_ONE__NAME = eINSTANCE.getOneToOne_Name();

		/**
		 * The meta object literal for the '<em><b>Optional</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ONE_TO_ONE__OPTIONAL = eINSTANCE.getOneToOne_Optional();

		/**
		 * The meta object literal for the '<em><b>Target Entity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ONE_TO_ONE__TARGET_ENTITY = eINSTANCE.getOneToOne_TargetEntity();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.jpa.orm.impl.PersistenceUnitDefaultsImpl <em>Persistence Unit Defaults</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.jpa.orm.impl.PersistenceUnitDefaultsImpl
		 * @see org.eclipse.emf.teneo.jpa.orm.impl.OrmPackageImpl#getPersistenceUnitDefaults()
		 * @generated
		 */
		EClass PERSISTENCE_UNIT_DEFAULTS = eINSTANCE.getPersistenceUnitDefaults();

		/**
		 * The meta object literal for the '<em><b>Schema</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSISTENCE_UNIT_DEFAULTS__SCHEMA = eINSTANCE.getPersistenceUnitDefaults_Schema();

		/**
		 * The meta object literal for the '<em><b>Catalog</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSISTENCE_UNIT_DEFAULTS__CATALOG = eINSTANCE.getPersistenceUnitDefaults_Catalog();

		/**
		 * The meta object literal for the '<em><b>Access</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSISTENCE_UNIT_DEFAULTS__ACCESS = eINSTANCE.getPersistenceUnitDefaults_Access();

		/**
		 * The meta object literal for the '<em><b>Cascade Persist</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSISTENCE_UNIT_DEFAULTS__CASCADE_PERSIST = eINSTANCE.getPersistenceUnitDefaults_CascadePersist();

		/**
		 * The meta object literal for the '<em><b>Entity Listeners</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSISTENCE_UNIT_DEFAULTS__ENTITY_LISTENERS = eINSTANCE.getPersistenceUnitDefaults_EntityListeners();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.jpa.orm.impl.PersistenceUnitMetadataImpl <em>Persistence Unit Metadata</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.jpa.orm.impl.PersistenceUnitMetadataImpl
		 * @see org.eclipse.emf.teneo.jpa.orm.impl.OrmPackageImpl#getPersistenceUnitMetadata()
		 * @generated
		 */
		EClass PERSISTENCE_UNIT_METADATA = eINSTANCE.getPersistenceUnitMetadata();

		/**
		 * The meta object literal for the '<em><b>Xml Mapping Metadata Complete</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSISTENCE_UNIT_METADATA__XML_MAPPING_METADATA_COMPLETE = eINSTANCE.getPersistenceUnitMetadata_XmlMappingMetadataComplete();

		/**
		 * The meta object literal for the '<em><b>Persistence Unit Defaults</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSISTENCE_UNIT_METADATA__PERSISTENCE_UNIT_DEFAULTS = eINSTANCE.getPersistenceUnitMetadata_PersistenceUnitDefaults();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.jpa.orm.impl.PostLoadImpl <em>Post Load</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.jpa.orm.impl.PostLoadImpl
		 * @see org.eclipse.emf.teneo.jpa.orm.impl.OrmPackageImpl#getPostLoad()
		 * @generated
		 */
		EClass POST_LOAD = eINSTANCE.getPostLoad();

		/**
		 * The meta object literal for the '<em><b>Method Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POST_LOAD__METHOD_NAME = eINSTANCE.getPostLoad_MethodName();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.jpa.orm.impl.PostPersistImpl <em>Post Persist</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.jpa.orm.impl.PostPersistImpl
		 * @see org.eclipse.emf.teneo.jpa.orm.impl.OrmPackageImpl#getPostPersist()
		 * @generated
		 */
		EClass POST_PERSIST = eINSTANCE.getPostPersist();

		/**
		 * The meta object literal for the '<em><b>Method Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POST_PERSIST__METHOD_NAME = eINSTANCE.getPostPersist_MethodName();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.jpa.orm.impl.PostRemoveImpl <em>Post Remove</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.jpa.orm.impl.PostRemoveImpl
		 * @see org.eclipse.emf.teneo.jpa.orm.impl.OrmPackageImpl#getPostRemove()
		 * @generated
		 */
		EClass POST_REMOVE = eINSTANCE.getPostRemove();

		/**
		 * The meta object literal for the '<em><b>Method Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POST_REMOVE__METHOD_NAME = eINSTANCE.getPostRemove_MethodName();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.jpa.orm.impl.PostUpdateImpl <em>Post Update</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.jpa.orm.impl.PostUpdateImpl
		 * @see org.eclipse.emf.teneo.jpa.orm.impl.OrmPackageImpl#getPostUpdate()
		 * @generated
		 */
		EClass POST_UPDATE = eINSTANCE.getPostUpdate();

		/**
		 * The meta object literal for the '<em><b>Method Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POST_UPDATE__METHOD_NAME = eINSTANCE.getPostUpdate_MethodName();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.jpa.orm.impl.PrePersistImpl <em>Pre Persist</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.jpa.orm.impl.PrePersistImpl
		 * @see org.eclipse.emf.teneo.jpa.orm.impl.OrmPackageImpl#getPrePersist()
		 * @generated
		 */
		EClass PRE_PERSIST = eINSTANCE.getPrePersist();

		/**
		 * The meta object literal for the '<em><b>Method Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRE_PERSIST__METHOD_NAME = eINSTANCE.getPrePersist_MethodName();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.jpa.orm.impl.PreRemoveImpl <em>Pre Remove</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.jpa.orm.impl.PreRemoveImpl
		 * @see org.eclipse.emf.teneo.jpa.orm.impl.OrmPackageImpl#getPreRemove()
		 * @generated
		 */
		EClass PRE_REMOVE = eINSTANCE.getPreRemove();

		/**
		 * The meta object literal for the '<em><b>Method Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRE_REMOVE__METHOD_NAME = eINSTANCE.getPreRemove_MethodName();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.jpa.orm.impl.PreUpdateImpl <em>Pre Update</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.jpa.orm.impl.PreUpdateImpl
		 * @see org.eclipse.emf.teneo.jpa.orm.impl.OrmPackageImpl#getPreUpdate()
		 * @generated
		 */
		EClass PRE_UPDATE = eINSTANCE.getPreUpdate();

		/**
		 * The meta object literal for the '<em><b>Method Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRE_UPDATE__METHOD_NAME = eINSTANCE.getPreUpdate_MethodName();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.jpa.orm.impl.PrimaryKeyJoinColumnImpl <em>Primary Key Join Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.jpa.orm.impl.PrimaryKeyJoinColumnImpl
		 * @see org.eclipse.emf.teneo.jpa.orm.impl.OrmPackageImpl#getPrimaryKeyJoinColumn()
		 * @generated
		 */
		EClass PRIMARY_KEY_JOIN_COLUMN = eINSTANCE.getPrimaryKeyJoinColumn();

		/**
		 * The meta object literal for the '<em><b>Column Definition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIMARY_KEY_JOIN_COLUMN__COLUMN_DEFINITION = eINSTANCE.getPrimaryKeyJoinColumn_ColumnDefinition();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIMARY_KEY_JOIN_COLUMN__NAME = eINSTANCE.getPrimaryKeyJoinColumn_Name();

		/**
		 * The meta object literal for the '<em><b>Referenced Column Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIMARY_KEY_JOIN_COLUMN__REFERENCED_COLUMN_NAME = eINSTANCE.getPrimaryKeyJoinColumn_ReferencedColumnName();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.jpa.orm.impl.QueryHintImpl <em>Query Hint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.jpa.orm.impl.QueryHintImpl
		 * @see org.eclipse.emf.teneo.jpa.orm.impl.OrmPackageImpl#getQueryHint()
		 * @generated
		 */
		EClass QUERY_HINT = eINSTANCE.getQueryHint();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUERY_HINT__NAME = eINSTANCE.getQueryHint_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUERY_HINT__VALUE = eINSTANCE.getQueryHint_Value();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.jpa.orm.impl.SecondaryTableImpl <em>Secondary Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.jpa.orm.impl.SecondaryTableImpl
		 * @see org.eclipse.emf.teneo.jpa.orm.impl.OrmPackageImpl#getSecondaryTable()
		 * @generated
		 */
		EClass SECONDARY_TABLE = eINSTANCE.getSecondaryTable();

		/**
		 * The meta object literal for the '<em><b>Primary Key Join Column</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECONDARY_TABLE__PRIMARY_KEY_JOIN_COLUMN = eINSTANCE.getSecondaryTable_PrimaryKeyJoinColumn();

		/**
		 * The meta object literal for the '<em><b>Unique Constraint</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECONDARY_TABLE__UNIQUE_CONSTRAINT = eINSTANCE.getSecondaryTable_UniqueConstraint();

		/**
		 * The meta object literal for the '<em><b>Catalog</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECONDARY_TABLE__CATALOG = eINSTANCE.getSecondaryTable_Catalog();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECONDARY_TABLE__NAME = eINSTANCE.getSecondaryTable_Name();

		/**
		 * The meta object literal for the '<em><b>Schema</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECONDARY_TABLE__SCHEMA = eINSTANCE.getSecondaryTable_Schema();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.jpa.orm.impl.SequenceGeneratorImpl <em>Sequence Generator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.jpa.orm.impl.SequenceGeneratorImpl
		 * @see org.eclipse.emf.teneo.jpa.orm.impl.OrmPackageImpl#getSequenceGenerator()
		 * @generated
		 */
		EClass SEQUENCE_GENERATOR = eINSTANCE.getSequenceGenerator();

		/**
		 * The meta object literal for the '<em><b>Allocation Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEQUENCE_GENERATOR__ALLOCATION_SIZE = eINSTANCE.getSequenceGenerator_AllocationSize();

		/**
		 * The meta object literal for the '<em><b>Initial Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEQUENCE_GENERATOR__INITIAL_VALUE = eINSTANCE.getSequenceGenerator_InitialValue();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEQUENCE_GENERATOR__NAME = eINSTANCE.getSequenceGenerator_Name();

		/**
		 * The meta object literal for the '<em><b>Sequence Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEQUENCE_GENERATOR__SEQUENCE_NAME = eINSTANCE.getSequenceGenerator_SequenceName();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.jpa.orm.impl.SqlResultSetMappingImpl <em>Sql Result Set Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.jpa.orm.impl.SqlResultSetMappingImpl
		 * @see org.eclipse.emf.teneo.jpa.orm.impl.OrmPackageImpl#getSqlResultSetMapping()
		 * @generated
		 */
		EClass SQL_RESULT_SET_MAPPING = eINSTANCE.getSqlResultSetMapping();

		/**
		 * The meta object literal for the '<em><b>Entity Result</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SQL_RESULT_SET_MAPPING__ENTITY_RESULT = eINSTANCE.getSqlResultSetMapping_EntityResult();

		/**
		 * The meta object literal for the '<em><b>Column Result</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SQL_RESULT_SET_MAPPING__COLUMN_RESULT = eINSTANCE.getSqlResultSetMapping_ColumnResult();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SQL_RESULT_SET_MAPPING__NAME = eINSTANCE.getSqlResultSetMapping_Name();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.jpa.orm.impl.TableImpl <em>Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.jpa.orm.impl.TableImpl
		 * @see org.eclipse.emf.teneo.jpa.orm.impl.OrmPackageImpl#getTable()
		 * @generated
		 */
		EClass TABLE = eINSTANCE.getTable();

		/**
		 * The meta object literal for the '<em><b>Unique Constraint</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__UNIQUE_CONSTRAINT = eINSTANCE.getTable_UniqueConstraint();

		/**
		 * The meta object literal for the '<em><b>Catalog</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE__CATALOG = eINSTANCE.getTable_Catalog();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE__NAME = eINSTANCE.getTable_Name();

		/**
		 * The meta object literal for the '<em><b>Schema</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE__SCHEMA = eINSTANCE.getTable_Schema();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.jpa.orm.impl.TableGeneratorImpl <em>Table Generator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.jpa.orm.impl.TableGeneratorImpl
		 * @see org.eclipse.emf.teneo.jpa.orm.impl.OrmPackageImpl#getTableGenerator()
		 * @generated
		 */
		EClass TABLE_GENERATOR = eINSTANCE.getTableGenerator();

		/**
		 * The meta object literal for the '<em><b>Unique Constraint</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE_GENERATOR__UNIQUE_CONSTRAINT = eINSTANCE.getTableGenerator_UniqueConstraint();

		/**
		 * The meta object literal for the '<em><b>Allocation Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_GENERATOR__ALLOCATION_SIZE = eINSTANCE.getTableGenerator_AllocationSize();

		/**
		 * The meta object literal for the '<em><b>Catalog</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_GENERATOR__CATALOG = eINSTANCE.getTableGenerator_Catalog();

		/**
		 * The meta object literal for the '<em><b>Initial Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_GENERATOR__INITIAL_VALUE = eINSTANCE.getTableGenerator_InitialValue();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_GENERATOR__NAME = eINSTANCE.getTableGenerator_Name();

		/**
		 * The meta object literal for the '<em><b>Pk Column Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_GENERATOR__PK_COLUMN_NAME = eINSTANCE.getTableGenerator_PkColumnName();

		/**
		 * The meta object literal for the '<em><b>Pk Column Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_GENERATOR__PK_COLUMN_VALUE = eINSTANCE.getTableGenerator_PkColumnValue();

		/**
		 * The meta object literal for the '<em><b>Schema</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_GENERATOR__SCHEMA = eINSTANCE.getTableGenerator_Schema();

		/**
		 * The meta object literal for the '<em><b>Table</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_GENERATOR__TABLE = eINSTANCE.getTableGenerator_Table();

		/**
		 * The meta object literal for the '<em><b>Value Column Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_GENERATOR__VALUE_COLUMN_NAME = eINSTANCE.getTableGenerator_ValueColumnName();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.jpa.orm.impl.TransientImpl <em>Transient</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.jpa.orm.impl.TransientImpl
		 * @see org.eclipse.emf.teneo.jpa.orm.impl.OrmPackageImpl#getTransient()
		 * @generated
		 */
		EClass TRANSIENT = eINSTANCE.getTransient();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSIENT__NAME = eINSTANCE.getTransient_Name();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.jpa.orm.impl.UniqueConstraintImpl <em>Unique Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.jpa.orm.impl.UniqueConstraintImpl
		 * @see org.eclipse.emf.teneo.jpa.orm.impl.OrmPackageImpl#getUniqueConstraint()
		 * @generated
		 */
		EClass UNIQUE_CONSTRAINT = eINSTANCE.getUniqueConstraint();

		/**
		 * The meta object literal for the '<em><b>Column Name</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIQUE_CONSTRAINT__COLUMN_NAME = eINSTANCE.getUniqueConstraint_ColumnName();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.jpa.orm.impl.VersionImpl <em>Version</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.jpa.orm.impl.VersionImpl
		 * @see org.eclipse.emf.teneo.jpa.orm.impl.OrmPackageImpl#getVersion()
		 * @generated
		 */
		EClass VERSION = eINSTANCE.getVersion();

		/**
		 * The meta object literal for the '<em><b>Column</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERSION__COLUMN = eINSTANCE.getVersion_Column();

		/**
		 * The meta object literal for the '<em><b>Temporal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERSION__TEMPORAL = eINSTANCE.getVersion_Temporal();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERSION__NAME = eINSTANCE.getVersion_Name();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.jpa.orm.AccessType <em>Access Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.jpa.orm.AccessType
		 * @see org.eclipse.emf.teneo.jpa.orm.impl.OrmPackageImpl#getAccessType()
		 * @generated
		 */
		EEnum ACCESS_TYPE = eINSTANCE.getAccessType();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.jpa.orm.DiscriminatorType <em>Discriminator Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.jpa.orm.DiscriminatorType
		 * @see org.eclipse.emf.teneo.jpa.orm.impl.OrmPackageImpl#getDiscriminatorType()
		 * @generated
		 */
		EEnum DISCRIMINATOR_TYPE = eINSTANCE.getDiscriminatorType();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.jpa.orm.EnumType <em>Enum Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.jpa.orm.EnumType
		 * @see org.eclipse.emf.teneo.jpa.orm.impl.OrmPackageImpl#getEnumType()
		 * @generated
		 */
		EEnum ENUM_TYPE = eINSTANCE.getEnumType();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.jpa.orm.FetchType <em>Fetch Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.jpa.orm.FetchType
		 * @see org.eclipse.emf.teneo.jpa.orm.impl.OrmPackageImpl#getFetchType()
		 * @generated
		 */
		EEnum FETCH_TYPE = eINSTANCE.getFetchType();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.jpa.orm.GenerationType <em>Generation Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.jpa.orm.GenerationType
		 * @see org.eclipse.emf.teneo.jpa.orm.impl.OrmPackageImpl#getGenerationType()
		 * @generated
		 */
		EEnum GENERATION_TYPE = eINSTANCE.getGenerationType();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.jpa.orm.InheritanceType <em>Inheritance Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.jpa.orm.InheritanceType
		 * @see org.eclipse.emf.teneo.jpa.orm.impl.OrmPackageImpl#getInheritanceType()
		 * @generated
		 */
		EEnum INHERITANCE_TYPE = eINSTANCE.getInheritanceType();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.jpa.orm.TemporalType <em>Temporal Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.jpa.orm.TemporalType
		 * @see org.eclipse.emf.teneo.jpa.orm.impl.OrmPackageImpl#getTemporalType()
		 * @generated
		 */
		EEnum TEMPORAL_TYPE = eINSTANCE.getTemporalType();

		/**
		 * The meta object literal for the '<em>Access Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.jpa.orm.AccessType
		 * @see org.eclipse.emf.teneo.jpa.orm.impl.OrmPackageImpl#getAccessTypeObject()
		 * @generated
		 */
		EDataType ACCESS_TYPE_OBJECT = eINSTANCE.getAccessTypeObject();

		/**
		 * The meta object literal for the '<em>Discriminator Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.jpa.orm.DiscriminatorType
		 * @see org.eclipse.emf.teneo.jpa.orm.impl.OrmPackageImpl#getDiscriminatorTypeObject()
		 * @generated
		 */
		EDataType DISCRIMINATOR_TYPE_OBJECT = eINSTANCE.getDiscriminatorTypeObject();

		/**
		 * The meta object literal for the '<em>Discriminator Value</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.emf.teneo.jpa.orm.impl.OrmPackageImpl#getDiscriminatorValue()
		 * @generated
		 */
		EDataType DISCRIMINATOR_VALUE = eINSTANCE.getDiscriminatorValue();

		/**
		 * The meta object literal for the '<em>Enumerated</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.jpa.orm.EnumType
		 * @see org.eclipse.emf.teneo.jpa.orm.impl.OrmPackageImpl#getEnumerated()
		 * @generated
		 */
		EDataType ENUMERATED = eINSTANCE.getEnumerated();

		/**
		 * The meta object literal for the '<em>Enum Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.jpa.orm.EnumType
		 * @see org.eclipse.emf.teneo.jpa.orm.impl.OrmPackageImpl#getEnumTypeObject()
		 * @generated
		 */
		EDataType ENUM_TYPE_OBJECT = eINSTANCE.getEnumTypeObject();

		/**
		 * The meta object literal for the '<em>Fetch Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.jpa.orm.FetchType
		 * @see org.eclipse.emf.teneo.jpa.orm.impl.OrmPackageImpl#getFetchTypeObject()
		 * @generated
		 */
		EDataType FETCH_TYPE_OBJECT = eINSTANCE.getFetchTypeObject();

		/**
		 * The meta object literal for the '<em>Generation Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.jpa.orm.GenerationType
		 * @see org.eclipse.emf.teneo.jpa.orm.impl.OrmPackageImpl#getGenerationTypeObject()
		 * @generated
		 */
		EDataType GENERATION_TYPE_OBJECT = eINSTANCE.getGenerationTypeObject();

		/**
		 * The meta object literal for the '<em>Inheritance Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.jpa.orm.InheritanceType
		 * @see org.eclipse.emf.teneo.jpa.orm.impl.OrmPackageImpl#getInheritanceTypeObject()
		 * @generated
		 */
		EDataType INHERITANCE_TYPE_OBJECT = eINSTANCE.getInheritanceTypeObject();

		/**
		 * The meta object literal for the '<em>Order By</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.emf.teneo.jpa.orm.impl.OrmPackageImpl#getOrderBy()
		 * @generated
		 */
		EDataType ORDER_BY = eINSTANCE.getOrderBy();

		/**
		 * The meta object literal for the '<em>Temporal</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.jpa.orm.TemporalType
		 * @see org.eclipse.emf.teneo.jpa.orm.impl.OrmPackageImpl#getTemporal()
		 * @generated
		 */
		EDataType TEMPORAL = eINSTANCE.getTemporal();

		/**
		 * The meta object literal for the '<em>Temporal Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.jpa.orm.TemporalType
		 * @see org.eclipse.emf.teneo.jpa.orm.impl.OrmPackageImpl#getTemporalTypeObject()
		 * @generated
		 */
		EDataType TEMPORAL_TYPE_OBJECT = eINSTANCE.getTemporalTypeObject();

		/**
		 * The meta object literal for the '<em>Version Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.emf.teneo.jpa.orm.impl.OrmPackageImpl#getVersionType()
		 * @generated
		 */
		EDataType VERSION_TYPE = eINSTANCE.getVersionType();

	}

} //OrmPackage

/**
 * <copyright>
 * </copyright>
 *
 * $Id: HbModelPackage.java,v 1.4 2007/01/24 23:29:25 mtaal Exp $
 */
package org.eclipse.emf.teneo.hibernate.hbmodel;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.teneo.annotations.pamodel.PamodelPackage;

/**
 * <!-- begin-user-doc --> The <b>Package</b> for the model. It contains accessors for the meta objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.teneo.hibernate.hbmodel.HbModelFactory
 * @model kind="package"
 * @generated
 */
public interface HbModelPackage extends EPackage {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2005, 2006 Springsite BV (The Netherlands) and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public\nLicense v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n   Martin Taal\n   Douglas Bitting\n";

	/**
	 * The package name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "hbmodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/emf/teneo/2006/HbModel";

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
	HbModelPackage eINSTANCE = org.eclipse.emf.teneo.hibernate.hbmodel.impl.HbModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.hibernate.hbmodel.HbAnnotatedETypeElement <em>Hb Annotated EType Element</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.hibernate.hbmodel.HbAnnotatedETypeElement
	 * @see org.eclipse.emf.teneo.hibernate.hbmodel.impl.HbModelPackageImpl#getHbAnnotatedETypeElement()
	 * @generated
	 */
	int HB_ANNOTATED_ETYPE_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Annotated Element</b></em>' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HB_ANNOTATED_ETYPE_ELEMENT__ANNOTATED_ELEMENT = PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__ANNOTATED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Transient</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HB_ANNOTATED_ETYPE_ELEMENT__TRANSIENT = PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__TRANSIENT;

	/**
	 * The feature id for the '<em><b>Attribute Overrides</b></em>' containment reference list.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HB_ANNOTATED_ETYPE_ELEMENT__ATTRIBUTE_OVERRIDES = PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__ATTRIBUTE_OVERRIDES;

	/**
	 * The feature id for the '<em><b>Join Table</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HB_ANNOTATED_ETYPE_ELEMENT__JOIN_TABLE = PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__JOIN_TABLE;

	/**
	 * The feature id for the '<em><b>One To Many</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HB_ANNOTATED_ETYPE_ELEMENT__ONE_TO_MANY = PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__ONE_TO_MANY;

	/**
	 * The feature id for the '<em><b>Sequence Generator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HB_ANNOTATED_ETYPE_ELEMENT__SEQUENCE_GENERATOR = PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__SEQUENCE_GENERATOR;

	/**
	 * The feature id for the '<em><b>Table Generator</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HB_ANNOTATED_ETYPE_ELEMENT__TABLE_GENERATOR = PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__TABLE_GENERATORS;

	/**
	 * The feature id for the '<em><b>Join Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HB_ANNOTATED_ETYPE_ELEMENT__JOIN_COLUMNS = PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__JOIN_COLUMNS;

	/**
	 * The feature id for the '<em><b>Column</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HB_ANNOTATED_ETYPE_ELEMENT__COLUMN = PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__COLUMN;

	/**
	 * The feature id for the '<em><b>Pa EClass</b></em>' container reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HB_ANNOTATED_ETYPE_ELEMENT__PA_ECLASS = PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__PA_ECLASS;

	/**
	 * The feature id for the '<em><b>Annotated EStructural Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HB_ANNOTATED_ETYPE_ELEMENT__ANNOTATED_ESTRUCTURAL_FEATURE = PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__ANNOTATED_ESTRUCTURAL_FEATURE;

	/**
	 * The feature id for the '<em><b>Hb Where</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HB_ANNOTATED_ETYPE_ELEMENT__HB_WHERE = PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Hb Collection Of Elements</b></em>' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int HB_ANNOTATED_ETYPE_ELEMENT__HB_COLLECTION_OF_ELEMENTS = PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Hb Map Key</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HB_ANNOTATED_ETYPE_ELEMENT__HB_MAP_KEY = PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Hb Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HB_ANNOTATED_ETYPE_ELEMENT__HB_COLUMNS = PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Hb Cascade</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HB_ANNOTATED_ETYPE_ELEMENT__HB_CASCADE = PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Hb Id Bag</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HB_ANNOTATED_ETYPE_ELEMENT__HB_ID_BAG = PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Hb Annotated EType Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HB_ANNOTATED_ETYPE_ELEMENT_FEATURE_COUNT = PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.hibernate.hbmodel.impl.HbAnnotatedEAttributeImpl <em>Hb Annotated EAttribute</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.hibernate.hbmodel.impl.HbAnnotatedEAttributeImpl
	 * @see org.eclipse.emf.teneo.hibernate.hbmodel.impl.HbModelPackageImpl#getHbAnnotatedEAttribute()
	 * @generated
	 */
	int HB_ANNOTATED_EATTRIBUTE = 1;

	/**
	 * The feature id for the '<em><b>Annotated Element</b></em>' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HB_ANNOTATED_EATTRIBUTE__ANNOTATED_ELEMENT = PamodelPackage.PANNOTATED_EATTRIBUTE__ANNOTATED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Transient</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HB_ANNOTATED_EATTRIBUTE__TRANSIENT = PamodelPackage.PANNOTATED_EATTRIBUTE__TRANSIENT;

	/**
	 * The feature id for the '<em><b>Attribute Overrides</b></em>' containment reference list.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HB_ANNOTATED_EATTRIBUTE__ATTRIBUTE_OVERRIDES = PamodelPackage.PANNOTATED_EATTRIBUTE__ATTRIBUTE_OVERRIDES;

	/**
	 * The feature id for the '<em><b>Join Table</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HB_ANNOTATED_EATTRIBUTE__JOIN_TABLE = PamodelPackage.PANNOTATED_EATTRIBUTE__JOIN_TABLE;

	/**
	 * The feature id for the '<em><b>One To Many</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HB_ANNOTATED_EATTRIBUTE__ONE_TO_MANY = PamodelPackage.PANNOTATED_EATTRIBUTE__ONE_TO_MANY;

	/**
	 * The feature id for the '<em><b>Sequence Generator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HB_ANNOTATED_EATTRIBUTE__SEQUENCE_GENERATOR = PamodelPackage.PANNOTATED_EATTRIBUTE__SEQUENCE_GENERATOR;

	/**
	 * The feature id for the '<em><b>Table Generator</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HB_ANNOTATED_EATTRIBUTE__TABLE_GENERATOR = PamodelPackage.PANNOTATED_EATTRIBUTE__TABLE_GENERATORS;

	/**
	 * The feature id for the '<em><b>Join Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HB_ANNOTATED_EATTRIBUTE__JOIN_COLUMNS = PamodelPackage.PANNOTATED_EATTRIBUTE__JOIN_COLUMNS;

	/**
	 * The feature id for the '<em><b>Column</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HB_ANNOTATED_EATTRIBUTE__COLUMN = PamodelPackage.PANNOTATED_EATTRIBUTE__COLUMN;

	/**
	 * The feature id for the '<em><b>Pa EClass</b></em>' container reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HB_ANNOTATED_EATTRIBUTE__PA_ECLASS = PamodelPackage.PANNOTATED_EATTRIBUTE__PA_ECLASS;

	/**
	 * The feature id for the '<em><b>Annotated EStructural Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HB_ANNOTATED_EATTRIBUTE__ANNOTATED_ESTRUCTURAL_FEATURE = PamodelPackage.PANNOTATED_EATTRIBUTE__ANNOTATED_ESTRUCTURAL_FEATURE;

	/**
	 * The feature id for the '<em><b>Annotated EAttribute</b></em>' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HB_ANNOTATED_EATTRIBUTE__ANNOTATED_EATTRIBUTE = PamodelPackage.PANNOTATED_EATTRIBUTE__ANNOTATED_EATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Basic</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HB_ANNOTATED_EATTRIBUTE__BASIC = PamodelPackage.PANNOTATED_EATTRIBUTE__BASIC;

	/**
	 * The feature id for the '<em><b>Enumerated</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HB_ANNOTATED_EATTRIBUTE__ENUMERATED = PamodelPackage.PANNOTATED_EATTRIBUTE__ENUMERATED;

	/**
	 * The feature id for the '<em><b>Generated Value</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HB_ANNOTATED_EATTRIBUTE__GENERATED_VALUE = PamodelPackage.PANNOTATED_EATTRIBUTE__GENERATED_VALUE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int HB_ANNOTATED_EATTRIBUTE__ID = PamodelPackage.PANNOTATED_EATTRIBUTE__ID;

	/**
	 * The feature id for the '<em><b>Lob</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HB_ANNOTATED_EATTRIBUTE__LOB = PamodelPackage.PANNOTATED_EATTRIBUTE__LOB;

	/**
	 * The feature id for the '<em><b>Temporal</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HB_ANNOTATED_EATTRIBUTE__TEMPORAL = PamodelPackage.PANNOTATED_EATTRIBUTE__TEMPORAL;

	/**
	 * The feature id for the '<em><b>Version</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HB_ANNOTATED_EATTRIBUTE__VERSION = PamodelPackage.PANNOTATED_EATTRIBUTE__VERSION;

	/**
	 * The feature id for the '<em><b>Hb Where</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HB_ANNOTATED_EATTRIBUTE__HB_WHERE = PamodelPackage.PANNOTATED_EATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Hb Collection Of Elements</b></em>' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int HB_ANNOTATED_EATTRIBUTE__HB_COLLECTION_OF_ELEMENTS = PamodelPackage.PANNOTATED_EATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Hb Map Key</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HB_ANNOTATED_EATTRIBUTE__HB_MAP_KEY = PamodelPackage.PANNOTATED_EATTRIBUTE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Hb Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HB_ANNOTATED_EATTRIBUTE__HB_COLUMNS = PamodelPackage.PANNOTATED_EATTRIBUTE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Hb Cascade</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HB_ANNOTATED_EATTRIBUTE__HB_CASCADE = PamodelPackage.PANNOTATED_EATTRIBUTE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Hb Id Bag</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HB_ANNOTATED_EATTRIBUTE__HB_ID_BAG = PamodelPackage.PANNOTATED_EATTRIBUTE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Hb Type</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HB_ANNOTATED_EATTRIBUTE__HB_TYPE = PamodelPackage.PANNOTATED_EATTRIBUTE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Hb Annotated EAttribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HB_ANNOTATED_EATTRIBUTE_FEATURE_COUNT = PamodelPackage.PANNOTATED_EATTRIBUTE_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.hibernate.hbmodel.impl.HbAnnotatedEClassImpl <em>Hb Annotated EClass</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.hibernate.hbmodel.impl.HbAnnotatedEClassImpl
	 * @see org.eclipse.emf.teneo.hibernate.hbmodel.impl.HbModelPackageImpl#getHbAnnotatedEClass()
	 * @generated
	 */
	int HB_ANNOTATED_ECLASS = 2;

	/**
	 * The feature id for the '<em><b>Annotated Element</b></em>' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HB_ANNOTATED_ECLASS__ANNOTATED_ELEMENT = PamodelPackage.PANNOTATED_ECLASS__ANNOTATED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Transient</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HB_ANNOTATED_ECLASS__TRANSIENT = PamodelPackage.PANNOTATED_ECLASS__TRANSIENT;

	/**
	 * The feature id for the '<em><b>Pa EPackage</b></em>' container reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HB_ANNOTATED_ECLASS__PA_EPACKAGE = PamodelPackage.PANNOTATED_ECLASS__PA_EPACKAGE;

	/**
	 * The feature id for the '<em><b>Annotated EClass</b></em>' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HB_ANNOTATED_ECLASS__ANNOTATED_ECLASS = PamodelPackage.PANNOTATED_ECLASS__ANNOTATED_ECLASS;

	/**
	 * The feature id for the '<em><b>Pa EStructural Features</b></em>' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int HB_ANNOTATED_ECLASS__PA_ESTRUCTURAL_FEATURES = PamodelPackage.PANNOTATED_ECLASS__PA_ESTRUCTURAL_FEATURES;

	/**
	 * The feature id for the '<em><b>Attribute Overrides</b></em>' containment reference list.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HB_ANNOTATED_ECLASS__ATTRIBUTE_OVERRIDES = PamodelPackage.PANNOTATED_ECLASS__ATTRIBUTE_OVERRIDES;

	/**
	 * The feature id for the '<em><b>Discriminator Column</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HB_ANNOTATED_ECLASS__DISCRIMINATOR_COLUMN = PamodelPackage.PANNOTATED_ECLASS__DISCRIMINATOR_COLUMN;

	/**
	 * The feature id for the '<em><b>Discriminator Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HB_ANNOTATED_ECLASS__DISCRIMINATOR_VALUE = PamodelPackage.PANNOTATED_ECLASS__DISCRIMINATOR_VALUE;

	/**
	 * The feature id for the '<em><b>Embeddable</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HB_ANNOTATED_ECLASS__EMBEDDABLE = PamodelPackage.PANNOTATED_ECLASS__EMBEDDABLE;

	/**
	 * The feature id for the '<em><b>Mapped Superclass</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HB_ANNOTATED_ECLASS__MAPPED_SUPERCLASS = PamodelPackage.PANNOTATED_ECLASS__MAPPED_SUPERCLASS;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HB_ANNOTATED_ECLASS__ENTITY = PamodelPackage.PANNOTATED_ECLASS__ENTITY;

	/**
	 * The feature id for the '<em><b>Id Class</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HB_ANNOTATED_ECLASS__ID_CLASS = PamodelPackage.PANNOTATED_ECLASS__ID_CLASS;

	/**
	 * The feature id for the '<em><b>Inheritance</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HB_ANNOTATED_ECLASS__INHERITANCE = PamodelPackage.PANNOTATED_ECLASS__INHERITANCE;

	/**
	 * The feature id for the '<em><b>Primary Key Join Columns</b></em>' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int HB_ANNOTATED_ECLASS__PRIMARY_KEY_JOIN_COLUMNS = PamodelPackage.PANNOTATED_ECLASS__PRIMARY_KEY_JOIN_COLUMNS;

	/**
	 * The feature id for the '<em><b>Secondary Tables</b></em>' containment reference list.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HB_ANNOTATED_ECLASS__SECONDARY_TABLES = PamodelPackage.PANNOTATED_ECLASS__SECONDARY_TABLES;

	/**
	 * The feature id for the '<em><b>Table</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HB_ANNOTATED_ECLASS__TABLE = PamodelPackage.PANNOTATED_ECLASS__TABLE;

	/**
	 * The feature id for the '<em><b>Table Generator</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HB_ANNOTATED_ECLASS__TABLE_GENERATOR = PamodelPackage.PANNOTATED_ECLASS__TABLE_GENERATOR;

	/**
	 * The feature id for the '<em><b>Association Overrides</b></em>' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int HB_ANNOTATED_ECLASS__ASSOCIATION_OVERRIDES = PamodelPackage.PANNOTATED_ECLASS__ASSOCIATION_OVERRIDES;

	/**
	 * The feature id for the '<em><b>Hb Cache</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HB_ANNOTATED_ECLASS__HB_CACHE = PamodelPackage.PANNOTATED_ECLASS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Hb Annotated EClass</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HB_ANNOTATED_ECLASS_FEATURE_COUNT = PamodelPackage.PANNOTATED_ECLASS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.hibernate.hbmodel.HbAnnotatedEModelElement <em>Hb Annotated EModel Element</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.hibernate.hbmodel.HbAnnotatedEModelElement
	 * @see org.eclipse.emf.teneo.hibernate.hbmodel.impl.HbModelPackageImpl#getHbAnnotatedEModelElement()
	 * @generated
	 */
	int HB_ANNOTATED_EMODEL_ELEMENT = 3;

	/**
	 * The feature id for the '<em><b>Annotated Element</b></em>' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HB_ANNOTATED_EMODEL_ELEMENT__ANNOTATED_ELEMENT = PamodelPackage.PANNOTATED_EMODEL_ELEMENT__ANNOTATED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Transient</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HB_ANNOTATED_EMODEL_ELEMENT__TRANSIENT = PamodelPackage.PANNOTATED_EMODEL_ELEMENT__TRANSIENT;

	/**
	 * The number of structural features of the '<em>Hb Annotated EModel Element</em>' class.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HB_ANNOTATED_EMODEL_ELEMENT_FEATURE_COUNT = PamodelPackage.PANNOTATED_EMODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.hibernate.hbmodel.impl.HbAnnotatedEPackageImpl <em>Hb Annotated EPackage</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.hibernate.hbmodel.impl.HbAnnotatedEPackageImpl
	 * @see org.eclipse.emf.teneo.hibernate.hbmodel.impl.HbModelPackageImpl#getHbAnnotatedEPackage()
	 * @generated
	 */
	int HB_ANNOTATED_EPACKAGE = 4;

	/**
	 * The feature id for the '<em><b>Annotated Element</b></em>' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HB_ANNOTATED_EPACKAGE__ANNOTATED_ELEMENT = PamodelPackage.PANNOTATED_EPACKAGE__ANNOTATED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Transient</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HB_ANNOTATED_EPACKAGE__TRANSIENT = PamodelPackage.PANNOTATED_EPACKAGE__TRANSIENT;

	/**
	 * The feature id for the '<em><b>Pa Model</b></em>' container reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HB_ANNOTATED_EPACKAGE__PA_MODEL = PamodelPackage.PANNOTATED_EPACKAGE__PA_MODEL;

	/**
	 * The feature id for the '<em><b>Annotated EPackage</b></em>' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HB_ANNOTATED_EPACKAGE__ANNOTATED_EPACKAGE = PamodelPackage.PANNOTATED_EPACKAGE__ANNOTATED_EPACKAGE;

	/**
	 * The feature id for the '<em><b>Pa EClasses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HB_ANNOTATED_EPACKAGE__PA_ECLASSES = PamodelPackage.PANNOTATED_EPACKAGE__PA_ECLASSES;

	/**
	 * The feature id for the '<em><b>Sequence Generators</b></em>' containment reference list.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HB_ANNOTATED_EPACKAGE__SEQUENCE_GENERATORS = PamodelPackage.PANNOTATED_EPACKAGE__SEQUENCE_GENERATORS;

	/**
	 * The feature id for the '<em><b>Table Generators</b></em>' containment reference list.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HB_ANNOTATED_EPACKAGE__TABLE_GENERATORS = PamodelPackage.PANNOTATED_EPACKAGE__TABLE_GENERATORS;

	/**
	 * The feature id for the '<em><b>Pa EData Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HB_ANNOTATED_EPACKAGE__PA_EDATA_TYPES = PamodelPackage.PANNOTATED_EPACKAGE__PA_EDATA_TYPES;

	/**
	 * The feature id for the '<em><b>Hb Generic Generators</b></em>' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int HB_ANNOTATED_EPACKAGE__HB_GENERIC_GENERATORS = PamodelPackage.PANNOTATED_EPACKAGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Hb Type Def</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HB_ANNOTATED_EPACKAGE__HB_TYPE_DEF = PamodelPackage.PANNOTATED_EPACKAGE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Hb Annotated EPackage</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HB_ANNOTATED_EPACKAGE_FEATURE_COUNT = PamodelPackage.PANNOTATED_EPACKAGE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.hibernate.hbmodel.impl.HbAnnotatedEReferenceImpl <em>Hb Annotated EReference</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.hibernate.hbmodel.impl.HbAnnotatedEReferenceImpl
	 * @see org.eclipse.emf.teneo.hibernate.hbmodel.impl.HbModelPackageImpl#getHbAnnotatedEReference()
	 * @generated
	 */
	int HB_ANNOTATED_EREFERENCE = 5;

	/**
	 * The feature id for the '<em><b>Annotated Element</b></em>' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HB_ANNOTATED_EREFERENCE__ANNOTATED_ELEMENT = PamodelPackage.PANNOTATED_EREFERENCE__ANNOTATED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Transient</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HB_ANNOTATED_EREFERENCE__TRANSIENT = PamodelPackage.PANNOTATED_EREFERENCE__TRANSIENT;

	/**
	 * The feature id for the '<em><b>Attribute Overrides</b></em>' containment reference list.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HB_ANNOTATED_EREFERENCE__ATTRIBUTE_OVERRIDES = PamodelPackage.PANNOTATED_EREFERENCE__ATTRIBUTE_OVERRIDES;

	/**
	 * The feature id for the '<em><b>Join Table</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HB_ANNOTATED_EREFERENCE__JOIN_TABLE = PamodelPackage.PANNOTATED_EREFERENCE__JOIN_TABLE;

	/**
	 * The feature id for the '<em><b>One To Many</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HB_ANNOTATED_EREFERENCE__ONE_TO_MANY = PamodelPackage.PANNOTATED_EREFERENCE__ONE_TO_MANY;

	/**
	 * The feature id for the '<em><b>Sequence Generator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HB_ANNOTATED_EREFERENCE__SEQUENCE_GENERATOR = PamodelPackage.PANNOTATED_EREFERENCE__SEQUENCE_GENERATOR;

	/**
	 * The feature id for the '<em><b>Table Generator</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HB_ANNOTATED_EREFERENCE__TABLE_GENERATOR = PamodelPackage.PANNOTATED_EREFERENCE__TABLE_GENERATORS;

	/**
	 * The feature id for the '<em><b>Join Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HB_ANNOTATED_EREFERENCE__JOIN_COLUMNS = PamodelPackage.PANNOTATED_EREFERENCE__JOIN_COLUMNS;

	/**
	 * The feature id for the '<em><b>Column</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HB_ANNOTATED_EREFERENCE__COLUMN = PamodelPackage.PANNOTATED_EREFERENCE__COLUMN;

	/**
	 * The feature id for the '<em><b>Pa EClass</b></em>' container reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HB_ANNOTATED_EREFERENCE__PA_ECLASS = PamodelPackage.PANNOTATED_EREFERENCE__PA_ECLASS;

	/**
	 * The feature id for the '<em><b>Annotated EStructural Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HB_ANNOTATED_EREFERENCE__ANNOTATED_ESTRUCTURAL_FEATURE = PamodelPackage.PANNOTATED_EREFERENCE__ANNOTATED_ESTRUCTURAL_FEATURE;

	/**
	 * The feature id for the '<em><b>Annotated EReference</b></em>' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HB_ANNOTATED_EREFERENCE__ANNOTATED_EREFERENCE = PamodelPackage.PANNOTATED_EREFERENCE__ANNOTATED_EREFERENCE;

	/**
	 * The feature id for the '<em><b>Embedded</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HB_ANNOTATED_EREFERENCE__EMBEDDED = PamodelPackage.PANNOTATED_EREFERENCE__EMBEDDED;

	/**
	 * The feature id for the '<em><b>Embedded Id</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HB_ANNOTATED_EREFERENCE__EMBEDDED_ID = PamodelPackage.PANNOTATED_EREFERENCE__EMBEDDED_ID;

	/**
	 * The feature id for the '<em><b>Many To Many</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HB_ANNOTATED_EREFERENCE__MANY_TO_MANY = PamodelPackage.PANNOTATED_EREFERENCE__MANY_TO_MANY;

	/**
	 * The feature id for the '<em><b>Many To One</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HB_ANNOTATED_EREFERENCE__MANY_TO_ONE = PamodelPackage.PANNOTATED_EREFERENCE__MANY_TO_ONE;

	/**
	 * The feature id for the '<em><b>Map Key</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HB_ANNOTATED_EREFERENCE__MAP_KEY = PamodelPackage.PANNOTATED_EREFERENCE__MAP_KEY;

	/**
	 * The feature id for the '<em><b>One To One</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HB_ANNOTATED_EREFERENCE__ONE_TO_ONE = PamodelPackage.PANNOTATED_EREFERENCE__ONE_TO_ONE;

	/**
	 * The feature id for the '<em><b>Order By</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HB_ANNOTATED_EREFERENCE__ORDER_BY = PamodelPackage.PANNOTATED_EREFERENCE__ORDER_BY;

	/**
	 * The feature id for the '<em><b>Primary Key Join Columns</b></em>' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int HB_ANNOTATED_EREFERENCE__PRIMARY_KEY_JOIN_COLUMNS = PamodelPackage.PANNOTATED_EREFERENCE__PRIMARY_KEY_JOIN_COLUMNS;

	/**
	 * The feature id for the '<em><b>Hb Where</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HB_ANNOTATED_EREFERENCE__HB_WHERE = PamodelPackage.PANNOTATED_EREFERENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Hb Collection Of Elements</b></em>' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int HB_ANNOTATED_EREFERENCE__HB_COLLECTION_OF_ELEMENTS = PamodelPackage.PANNOTATED_EREFERENCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Hb Map Key</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HB_ANNOTATED_EREFERENCE__HB_MAP_KEY = PamodelPackage.PANNOTATED_EREFERENCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Hb Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HB_ANNOTATED_EREFERENCE__HB_COLUMNS = PamodelPackage.PANNOTATED_EREFERENCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Hb Cascade</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HB_ANNOTATED_EREFERENCE__HB_CASCADE = PamodelPackage.PANNOTATED_EREFERENCE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Hb Id Bag</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HB_ANNOTATED_EREFERENCE__HB_ID_BAG = PamodelPackage.PANNOTATED_EREFERENCE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Hb Cache</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HB_ANNOTATED_EREFERENCE__HB_CACHE = PamodelPackage.PANNOTATED_EREFERENCE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Hb Fetch</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HB_ANNOTATED_EREFERENCE__HB_FETCH = PamodelPackage.PANNOTATED_EREFERENCE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Hb Annotated EReference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HB_ANNOTATED_EREFERENCE_FEATURE_COUNT = PamodelPackage.PANNOTATED_EREFERENCE_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.hibernate.hbmodel.impl.HbAnnotatedEDataTypeImpl <em>Hb Annotated EData Type</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.hibernate.hbmodel.impl.HbAnnotatedEDataTypeImpl
	 * @see org.eclipse.emf.teneo.hibernate.hbmodel.impl.HbModelPackageImpl#getHbAnnotatedEDataType()
	 * @generated
	 */
	int HB_ANNOTATED_EDATA_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Annotated Element</b></em>' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HB_ANNOTATED_EDATA_TYPE__ANNOTATED_ELEMENT = PamodelPackage.PANNOTATED_EDATA_TYPE__ANNOTATED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Transient</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HB_ANNOTATED_EDATA_TYPE__TRANSIENT = PamodelPackage.PANNOTATED_EDATA_TYPE__TRANSIENT;

	/**
	 * The feature id for the '<em><b>Attribute Overrides</b></em>' containment reference list.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HB_ANNOTATED_EDATA_TYPE__ATTRIBUTE_OVERRIDES = PamodelPackage.PANNOTATED_EDATA_TYPE__ATTRIBUTE_OVERRIDES;

	/**
	 * The feature id for the '<em><b>Join Table</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HB_ANNOTATED_EDATA_TYPE__JOIN_TABLE = PamodelPackage.PANNOTATED_EDATA_TYPE__JOIN_TABLE;

	/**
	 * The feature id for the '<em><b>One To Many</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HB_ANNOTATED_EDATA_TYPE__ONE_TO_MANY = PamodelPackage.PANNOTATED_EDATA_TYPE__ONE_TO_MANY;

	/**
	 * The feature id for the '<em><b>Sequence Generator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HB_ANNOTATED_EDATA_TYPE__SEQUENCE_GENERATOR = PamodelPackage.PANNOTATED_EDATA_TYPE__SEQUENCE_GENERATOR;

	/**
	 * The feature id for the '<em><b>Table Generator</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HB_ANNOTATED_EDATA_TYPE__TABLE_GENERATOR = PamodelPackage.PANNOTATED_EDATA_TYPE__TABLE_GENERATORS;

	/**
	 * The feature id for the '<em><b>Join Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HB_ANNOTATED_EDATA_TYPE__JOIN_COLUMNS = PamodelPackage.PANNOTATED_EDATA_TYPE__JOIN_COLUMNS;

	/**
	 * The feature id for the '<em><b>Column</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HB_ANNOTATED_EDATA_TYPE__COLUMN = PamodelPackage.PANNOTATED_EDATA_TYPE__COLUMN;

	/**
	 * The feature id for the '<em><b>Annotated EData Type</b></em>' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HB_ANNOTATED_EDATA_TYPE__ANNOTATED_EDATA_TYPE = PamodelPackage.PANNOTATED_EDATA_TYPE__ANNOTATED_EDATA_TYPE;

	/**
	 * The feature id for the '<em><b>Basic</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HB_ANNOTATED_EDATA_TYPE__BASIC = PamodelPackage.PANNOTATED_EDATA_TYPE__BASIC;

	/**
	 * The feature id for the '<em><b>Enumerated</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HB_ANNOTATED_EDATA_TYPE__ENUMERATED = PamodelPackage.PANNOTATED_EDATA_TYPE__ENUMERATED;

	/**
	 * The feature id for the '<em><b>Generated Value</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HB_ANNOTATED_EDATA_TYPE__GENERATED_VALUE = PamodelPackage.PANNOTATED_EDATA_TYPE__GENERATED_VALUE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int HB_ANNOTATED_EDATA_TYPE__ID = PamodelPackage.PANNOTATED_EDATA_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Lob</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HB_ANNOTATED_EDATA_TYPE__LOB = PamodelPackage.PANNOTATED_EDATA_TYPE__LOB;

	/**
	 * The feature id for the '<em><b>Temporal</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HB_ANNOTATED_EDATA_TYPE__TEMPORAL = PamodelPackage.PANNOTATED_EDATA_TYPE__TEMPORAL;

	/**
	 * The feature id for the '<em><b>Version</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HB_ANNOTATED_EDATA_TYPE__VERSION = PamodelPackage.PANNOTATED_EDATA_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Pa EPackage</b></em>' container reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HB_ANNOTATED_EDATA_TYPE__PA_EPACKAGE = PamodelPackage.PANNOTATED_EDATA_TYPE__PA_EPACKAGE;

	/**
	 * The feature id for the '<em><b>Pa EClass</b></em>' container reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HB_ANNOTATED_EDATA_TYPE__PA_ECLASS = PamodelPackage.PANNOTATED_EDATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Annotated EStructural Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HB_ANNOTATED_EDATA_TYPE__ANNOTATED_ESTRUCTURAL_FEATURE = PamodelPackage.PANNOTATED_EDATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Hb Where</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HB_ANNOTATED_EDATA_TYPE__HB_WHERE = PamodelPackage.PANNOTATED_EDATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Hb Collection Of Elements</b></em>' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int HB_ANNOTATED_EDATA_TYPE__HB_COLLECTION_OF_ELEMENTS = PamodelPackage.PANNOTATED_EDATA_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Hb Map Key</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HB_ANNOTATED_EDATA_TYPE__HB_MAP_KEY = PamodelPackage.PANNOTATED_EDATA_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Hb Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HB_ANNOTATED_EDATA_TYPE__HB_COLUMNS = PamodelPackage.PANNOTATED_EDATA_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Hb Cascade</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HB_ANNOTATED_EDATA_TYPE__HB_CASCADE = PamodelPackage.PANNOTATED_EDATA_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Hb Id Bag</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HB_ANNOTATED_EDATA_TYPE__HB_ID_BAG = PamodelPackage.PANNOTATED_EDATA_TYPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Hb Type Def</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HB_ANNOTATED_EDATA_TYPE__HB_TYPE_DEF = PamodelPackage.PANNOTATED_EDATA_TYPE_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Hb Annotated EData Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HB_ANNOTATED_EDATA_TYPE_FEATURE_COUNT = PamodelPackage.PANNOTATED_EDATA_TYPE_FEATURE_COUNT + 9;

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.hibernate.hbmodel.HbAnnotatedETypeElement <em>Hb Annotated EType Element</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hb Annotated EType Element</em>'.
	 * @see org.eclipse.emf.teneo.hibernate.hbmodel.HbAnnotatedETypeElement
	 * @generated
	 */
	EClass getHbAnnotatedETypeElement();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.hibernate.hbmodel.HbAnnotatedETypeElement#getHbWhere <em>Hb Where</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Hb Where</em>'.
	 * @see org.eclipse.emf.teneo.hibernate.hbmodel.HbAnnotatedETypeElement#getHbWhere()
	 * @see #getHbAnnotatedETypeElement()
	 * @generated
	 */
	EReference getHbAnnotatedETypeElement_HbWhere();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.hibernate.hbmodel.HbAnnotatedETypeElement#getHbCollectionOfElements <em>Hb Collection Of Elements</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Hb Collection Of Elements</em>'.
	 * @see org.eclipse.emf.teneo.hibernate.hbmodel.HbAnnotatedETypeElement#getHbCollectionOfElements()
	 * @see #getHbAnnotatedETypeElement()
	 * @generated
	 */
	EReference getHbAnnotatedETypeElement_HbCollectionOfElements();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.hibernate.hbmodel.HbAnnotatedETypeElement#getHbMapKey <em>Hb Map Key</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Hb Map Key</em>'.
	 * @see org.eclipse.emf.teneo.hibernate.hbmodel.HbAnnotatedETypeElement#getHbMapKey()
	 * @see #getHbAnnotatedETypeElement()
	 * @generated
	 */
	EReference getHbAnnotatedETypeElement_HbMapKey();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.hibernate.hbmodel.HbAnnotatedETypeElement#getHbColumns <em>Hb Columns</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hb Columns</em>'.
	 * @see org.eclipse.emf.teneo.hibernate.hbmodel.HbAnnotatedETypeElement#getHbColumns()
	 * @see #getHbAnnotatedETypeElement()
	 * @generated
	 */
	EReference getHbAnnotatedETypeElement_HbColumns();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.hibernate.hbmodel.HbAnnotatedETypeElement#getHbCascade <em>Hb Cascade</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Hb Cascade</em>'.
	 * @see org.eclipse.emf.teneo.hibernate.hbmodel.HbAnnotatedETypeElement#getHbCascade()
	 * @see #getHbAnnotatedETypeElement()
	 * @generated
	 */
	EReference getHbAnnotatedETypeElement_HbCascade();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.hibernate.hbmodel.HbAnnotatedETypeElement#getHbIdBag <em>Hb Id Bag</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Hb Id Bag</em>'.
	 * @see org.eclipse.emf.teneo.hibernate.hbmodel.HbAnnotatedETypeElement#getHbIdBag()
	 * @see #getHbAnnotatedETypeElement()
	 * @generated
	 */
	EReference getHbAnnotatedETypeElement_HbIdBag();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.hibernate.hbmodel.HbAnnotatedEAttribute <em>Hb Annotated EAttribute</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hb Annotated EAttribute</em>'.
	 * @see org.eclipse.emf.teneo.hibernate.hbmodel.HbAnnotatedEAttribute
	 * @generated
	 */
	EClass getHbAnnotatedEAttribute();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.hibernate.hbmodel.HbAnnotatedEAttribute#getHbType <em>Hb Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Hb Type</em>'.
	 * @see org.eclipse.emf.teneo.hibernate.hbmodel.HbAnnotatedEAttribute#getHbType()
	 * @see #getHbAnnotatedEAttribute()
	 * @generated
	 */
	EReference getHbAnnotatedEAttribute_HbType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.hibernate.hbmodel.HbAnnotatedEClass <em>Hb Annotated EClass</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hb Annotated EClass</em>'.
	 * @see org.eclipse.emf.teneo.hibernate.hbmodel.HbAnnotatedEClass
	 * @generated
	 */
	EClass getHbAnnotatedEClass();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.hibernate.hbmodel.HbAnnotatedEClass#getHbCache <em>Hb Cache</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Hb Cache</em>'.
	 * @see org.eclipse.emf.teneo.hibernate.hbmodel.HbAnnotatedEClass#getHbCache()
	 * @see #getHbAnnotatedEClass()
	 * @generated
	 */
	EReference getHbAnnotatedEClass_HbCache();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.hibernate.hbmodel.HbAnnotatedEModelElement <em>Hb Annotated EModel Element</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hb Annotated EModel Element</em>'.
	 * @see org.eclipse.emf.teneo.hibernate.hbmodel.HbAnnotatedEModelElement
	 * @generated
	 */
	EClass getHbAnnotatedEModelElement();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.hibernate.hbmodel.HbAnnotatedEPackage <em>Hb Annotated EPackage</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hb Annotated EPackage</em>'.
	 * @see org.eclipse.emf.teneo.hibernate.hbmodel.HbAnnotatedEPackage
	 * @generated
	 */
	EClass getHbAnnotatedEPackage();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.hibernate.hbmodel.HbAnnotatedEPackage#getHbGenericGenerators <em>Hb Generic Generators</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hb Generic Generators</em>'.
	 * @see org.eclipse.emf.teneo.hibernate.hbmodel.HbAnnotatedEPackage#getHbGenericGenerators()
	 * @see #getHbAnnotatedEPackage()
	 * @generated
	 */
	EReference getHbAnnotatedEPackage_HbGenericGenerators();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.hibernate.hbmodel.HbAnnotatedEPackage#getHbTypeDef <em>Hb Type Def</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hb Type Def</em>'.
	 * @see org.eclipse.emf.teneo.hibernate.hbmodel.HbAnnotatedEPackage#getHbTypeDef()
	 * @see #getHbAnnotatedEPackage()
	 * @generated
	 */
	EReference getHbAnnotatedEPackage_HbTypeDef();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.hibernate.hbmodel.HbAnnotatedEReference <em>Hb Annotated EReference</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hb Annotated EReference</em>'.
	 * @see org.eclipse.emf.teneo.hibernate.hbmodel.HbAnnotatedEReference
	 * @generated
	 */
	EClass getHbAnnotatedEReference();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.hibernate.hbmodel.HbAnnotatedEReference#getHbCache <em>Hb Cache</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Hb Cache</em>'.
	 * @see org.eclipse.emf.teneo.hibernate.hbmodel.HbAnnotatedEReference#getHbCache()
	 * @see #getHbAnnotatedEReference()
	 * @generated
	 */
	EReference getHbAnnotatedEReference_HbCache();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.teneo.hibernate.hbmodel.HbAnnotatedEReference#getHbFetch <em>Hb Fetch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Hb Fetch</em>'.
	 * @see org.eclipse.emf.teneo.hibernate.hbmodel.HbAnnotatedEReference#getHbFetch()
	 * @see #getHbAnnotatedEReference()
	 * @generated
	 */
	EReference getHbAnnotatedEReference_HbFetch();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.hibernate.hbmodel.HbAnnotatedEDataType <em>Hb Annotated EData Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hb Annotated EData Type</em>'.
	 * @see org.eclipse.emf.teneo.hibernate.hbmodel.HbAnnotatedEDataType
	 * @generated
	 */
	EClass getHbAnnotatedEDataType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.hibernate.hbmodel.HbAnnotatedEDataType#getHbTypeDef <em>Hb Type Def</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Hb Type Def</em>'.
	 * @see org.eclipse.emf.teneo.hibernate.hbmodel.HbAnnotatedEDataType#getHbTypeDef()
	 * @see #getHbAnnotatedEDataType()
	 * @generated
	 */
	EReference getHbAnnotatedEDataType_HbTypeDef();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	HbModelFactory getHbModelFactory();

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
	interface Literals  {
		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.hibernate.hbmodel.HbAnnotatedETypeElement <em>Hb Annotated EType Element</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.hibernate.hbmodel.HbAnnotatedETypeElement
		 * @see org.eclipse.emf.teneo.hibernate.hbmodel.impl.HbModelPackageImpl#getHbAnnotatedETypeElement()
		 * @generated
		 */
		EClass HB_ANNOTATED_ETYPE_ELEMENT = eINSTANCE.getHbAnnotatedETypeElement();

		/**
		 * The meta object literal for the '<em><b>Hb Where</b></em>' containment reference feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference HB_ANNOTATED_ETYPE_ELEMENT__HB_WHERE = eINSTANCE.getHbAnnotatedETypeElement_HbWhere();

		/**
		 * The meta object literal for the '<em><b>Hb Collection Of Elements</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference HB_ANNOTATED_ETYPE_ELEMENT__HB_COLLECTION_OF_ELEMENTS = eINSTANCE.getHbAnnotatedETypeElement_HbCollectionOfElements();

		/**
		 * The meta object literal for the '<em><b>Hb Map Key</b></em>' containment reference feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference HB_ANNOTATED_ETYPE_ELEMENT__HB_MAP_KEY = eINSTANCE.getHbAnnotatedETypeElement_HbMapKey();

		/**
		 * The meta object literal for the '<em><b>Hb Columns</b></em>' containment reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference HB_ANNOTATED_ETYPE_ELEMENT__HB_COLUMNS = eINSTANCE.getHbAnnotatedETypeElement_HbColumns();

		/**
		 * The meta object literal for the '<em><b>Hb Cascade</b></em>' containment reference feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference HB_ANNOTATED_ETYPE_ELEMENT__HB_CASCADE = eINSTANCE.getHbAnnotatedETypeElement_HbCascade();

		/**
		 * The meta object literal for the '<em><b>Hb Id Bag</b></em>' containment reference feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference HB_ANNOTATED_ETYPE_ELEMENT__HB_ID_BAG = eINSTANCE.getHbAnnotatedETypeElement_HbIdBag();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.hibernate.hbmodel.impl.HbAnnotatedEAttributeImpl <em>Hb Annotated EAttribute</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.hibernate.hbmodel.impl.HbAnnotatedEAttributeImpl
		 * @see org.eclipse.emf.teneo.hibernate.hbmodel.impl.HbModelPackageImpl#getHbAnnotatedEAttribute()
		 * @generated
		 */
		EClass HB_ANNOTATED_EATTRIBUTE = eINSTANCE.getHbAnnotatedEAttribute();

		/**
		 * The meta object literal for the '<em><b>Hb Type</b></em>' containment reference feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference HB_ANNOTATED_EATTRIBUTE__HB_TYPE = eINSTANCE.getHbAnnotatedEAttribute_HbType();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.hibernate.hbmodel.impl.HbAnnotatedEClassImpl <em>Hb Annotated EClass</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.hibernate.hbmodel.impl.HbAnnotatedEClassImpl
		 * @see org.eclipse.emf.teneo.hibernate.hbmodel.impl.HbModelPackageImpl#getHbAnnotatedEClass()
		 * @generated
		 */
		EClass HB_ANNOTATED_ECLASS = eINSTANCE.getHbAnnotatedEClass();

		/**
		 * The meta object literal for the '<em><b>Hb Cache</b></em>' containment reference feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference HB_ANNOTATED_ECLASS__HB_CACHE = eINSTANCE.getHbAnnotatedEClass_HbCache();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.hibernate.hbmodel.HbAnnotatedEModelElement <em>Hb Annotated EModel Element</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.hibernate.hbmodel.HbAnnotatedEModelElement
		 * @see org.eclipse.emf.teneo.hibernate.hbmodel.impl.HbModelPackageImpl#getHbAnnotatedEModelElement()
		 * @generated
		 */
		EClass HB_ANNOTATED_EMODEL_ELEMENT = eINSTANCE.getHbAnnotatedEModelElement();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.hibernate.hbmodel.impl.HbAnnotatedEPackageImpl <em>Hb Annotated EPackage</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.hibernate.hbmodel.impl.HbAnnotatedEPackageImpl
		 * @see org.eclipse.emf.teneo.hibernate.hbmodel.impl.HbModelPackageImpl#getHbAnnotatedEPackage()
		 * @generated
		 */
		EClass HB_ANNOTATED_EPACKAGE = eINSTANCE.getHbAnnotatedEPackage();

		/**
		 * The meta object literal for the '<em><b>Hb Generic Generators</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference HB_ANNOTATED_EPACKAGE__HB_GENERIC_GENERATORS = eINSTANCE.getHbAnnotatedEPackage_HbGenericGenerators();

		/**
		 * The meta object literal for the '<em><b>Hb Type Def</b></em>' containment reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference HB_ANNOTATED_EPACKAGE__HB_TYPE_DEF = eINSTANCE.getHbAnnotatedEPackage_HbTypeDef();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.hibernate.hbmodel.impl.HbAnnotatedEReferenceImpl <em>Hb Annotated EReference</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.hibernate.hbmodel.impl.HbAnnotatedEReferenceImpl
		 * @see org.eclipse.emf.teneo.hibernate.hbmodel.impl.HbModelPackageImpl#getHbAnnotatedEReference()
		 * @generated
		 */
		EClass HB_ANNOTATED_EREFERENCE = eINSTANCE.getHbAnnotatedEReference();

		/**
		 * The meta object literal for the '<em><b>Hb Cache</b></em>' containment reference feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference HB_ANNOTATED_EREFERENCE__HB_CACHE = eINSTANCE.getHbAnnotatedEReference_HbCache();

		/**
		 * The meta object literal for the '<em><b>Hb Fetch</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HB_ANNOTATED_EREFERENCE__HB_FETCH = eINSTANCE.getHbAnnotatedEReference_HbFetch();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.hibernate.hbmodel.impl.HbAnnotatedEDataTypeImpl <em>Hb Annotated EData Type</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.hibernate.hbmodel.impl.HbAnnotatedEDataTypeImpl
		 * @see org.eclipse.emf.teneo.hibernate.hbmodel.impl.HbModelPackageImpl#getHbAnnotatedEDataType()
		 * @generated
		 */
		EClass HB_ANNOTATED_EDATA_TYPE = eINSTANCE.getHbAnnotatedEDataType();

		/**
		 * The meta object literal for the '<em><b>Hb Type Def</b></em>' containment reference feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference HB_ANNOTATED_EDATA_TYPE__HB_TYPE_DEF = eINSTANCE.getHbAnnotatedEDataType_HbTypeDef();

	}

	/**
	 * {@see PamodelPackage#pAnnotationReference(EClass, EClass)}
	 */
	public EReference pAnnotationReference(EClass paElementEClass, EClass pAnnotationEClass);

} // HbModelPackage

/**
 * <copyright>
 * </copyright>
 *
 * $Id: PamodelPackage.java,v 1.2 2006/07/04 21:56:28 mtaal Exp $
 */
package org.eclipse.emf.teneo.annotations.pamodel;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc --> The <b>Package</b> for the model. It contains accessors for the meta objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.teneo.annotations.pamodel.PamodelFactory
 * @model kind="package"
 * @generated
 */
public interface PamodelPackage extends EPackage{
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2005, 2006 Springsite BV (The Netherlands) and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public\nLicense v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n   Martin Taal\n   Davide Marchignoli\n";

	/**
	 * The package name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "pamodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/emf/teneo/elver/2005/pamodel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.elver.pamodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	PamodelPackage eINSTANCE = org.eclipse.emf.teneo.annotations.pamodel.impl.PamodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.annotations.pamodel.impl.PAnnotatedEModelElementImpl <em>PAnnotated EModel Element</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.annotations.pamodel.impl.PAnnotatedEModelElementImpl
	 * @see org.eclipse.emf.teneo.annotations.pamodel.impl.PamodelPackageImpl#getPAnnotatedEModelElement()
	 * @generated
	 */
	int PANNOTATED_EMODEL_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Annotated Element</b></em>' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANNOTATED_EMODEL_ELEMENT__ANNOTATED_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Transient</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANNOTATED_EMODEL_ELEMENT__TRANSIENT = 1;

	/**
	 * The number of structural features of the the '<em>PAnnotated EModel Element</em>' class.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANNOTATED_EMODEL_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.annotations.pamodel.impl.PAnnotatedModelImpl <em>PAnnotated Model</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.annotations.pamodel.impl.PAnnotatedModelImpl
	 * @see org.eclipse.emf.teneo.annotations.pamodel.impl.PamodelPackageImpl#getPAnnotatedModel()
	 * @generated
	 */
	int PANNOTATED_MODEL = 1;

	/**
	 * The feature id for the '<em><b>Pa EPackages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANNOTATED_MODEL__PA_EPACKAGES = 0;

	/**
	 * The number of structural features of the the '<em>PAnnotated Model</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANNOTATED_MODEL_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.annotations.pamodel.impl.PAnnotatedEPackageImpl <em>PAnnotated EPackage</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.annotations.pamodel.impl.PAnnotatedEPackageImpl
	 * @see org.eclipse.emf.teneo.annotations.pamodel.impl.PamodelPackageImpl#getPAnnotatedEPackage()
	 * @generated
	 */
	int PANNOTATED_EPACKAGE = 2;

	/**
	 * The feature id for the '<em><b>Annotated Element</b></em>' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANNOTATED_EPACKAGE__ANNOTATED_ELEMENT = PANNOTATED_EMODEL_ELEMENT__ANNOTATED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Transient</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANNOTATED_EPACKAGE__TRANSIENT = PANNOTATED_EMODEL_ELEMENT__TRANSIENT;

	/**
	 * The feature id for the '<em><b>Pa Model</b></em>' container reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANNOTATED_EPACKAGE__PA_MODEL = PANNOTATED_EMODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Annotated EPackage</b></em>' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANNOTATED_EPACKAGE__ANNOTATED_EPACKAGE = PANNOTATED_EMODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Pa EClasses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANNOTATED_EPACKAGE__PA_ECLASSES = PANNOTATED_EMODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Sequence Generator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANNOTATED_EPACKAGE__SEQUENCE_GENERATOR = PANNOTATED_EMODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Table Generator</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANNOTATED_EPACKAGE__TABLE_GENERATOR = PANNOTATED_EMODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the the '<em>PAnnotated EPackage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANNOTATED_EPACKAGE_FEATURE_COUNT = PANNOTATED_EMODEL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.annotations.pamodel.impl.PAnnotatedEClassImpl <em>PAnnotated EClass</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.annotations.pamodel.impl.PAnnotatedEClassImpl
	 * @see org.eclipse.emf.teneo.annotations.pamodel.impl.PamodelPackageImpl#getPAnnotatedEClass()
	 * @generated
	 */
	int PANNOTATED_ECLASS = 3;

	/**
	 * The feature id for the '<em><b>Annotated Element</b></em>' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANNOTATED_ECLASS__ANNOTATED_ELEMENT = PANNOTATED_EMODEL_ELEMENT__ANNOTATED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Transient</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANNOTATED_ECLASS__TRANSIENT = PANNOTATED_EMODEL_ELEMENT__TRANSIENT;

	/**
	 * The feature id for the '<em><b>Pa EPackage</b></em>' container reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANNOTATED_ECLASS__PA_EPACKAGE = PANNOTATED_EMODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Annotated EClass</b></em>' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANNOTATED_ECLASS__ANNOTATED_ECLASS = PANNOTATED_EMODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Pa EStructural Features</b></em>' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PANNOTATED_ECLASS__PA_ESTRUCTURAL_FEATURES = PANNOTATED_EMODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Attribute Overrides</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANNOTATED_ECLASS__ATTRIBUTE_OVERRIDES = PANNOTATED_EMODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Discriminator Column</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANNOTATED_ECLASS__DISCRIMINATOR_COLUMN = PANNOTATED_EMODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Discriminator Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANNOTATED_ECLASS__DISCRIMINATOR_VALUE = PANNOTATED_EMODEL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Embeddable</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANNOTATED_ECLASS__EMBEDDABLE = PANNOTATED_EMODEL_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Exclude Default Listeners</b></em>' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PANNOTATED_ECLASS__EXCLUDE_DEFAULT_LISTENERS = PANNOTATED_EMODEL_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Exclude Superclass Listeners</b></em>' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PANNOTATED_ECLASS__EXCLUDE_SUPERCLASS_LISTENERS = PANNOTATED_EMODEL_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Mapped Superclass</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANNOTATED_ECLASS__MAPPED_SUPERCLASS = PANNOTATED_EMODEL_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANNOTATED_ECLASS__ENTITY = PANNOTATED_EMODEL_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Entity Listener</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANNOTATED_ECLASS__ENTITY_LISTENER = PANNOTATED_EMODEL_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Id Class</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANNOTATED_ECLASS__ID_CLASS = PANNOTATED_EMODEL_ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Inheritance</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANNOTATED_ECLASS__INHERITANCE = PANNOTATED_EMODEL_ELEMENT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Join Column</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANNOTATED_ECLASS__JOIN_COLUMN = PANNOTATED_EMODEL_ELEMENT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Primary Key Join Columns</b></em>' containment reference.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANNOTATED_ECLASS__PRIMARY_KEY_JOIN_COLUMNS = PANNOTATED_EMODEL_ELEMENT_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Secondary Tables</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANNOTATED_ECLASS__SECONDARY_TABLES = PANNOTATED_EMODEL_ELEMENT_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Sequence Generator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANNOTATED_ECLASS__SEQUENCE_GENERATOR = PANNOTATED_EMODEL_ELEMENT_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Table</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANNOTATED_ECLASS__TABLE = PANNOTATED_EMODEL_ELEMENT_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Table Generator</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANNOTATED_ECLASS__TABLE_GENERATOR = PANNOTATED_EMODEL_ELEMENT_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Association Overrides</b></em>' containment reference.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANNOTATED_ECLASS__ASSOCIATION_OVERRIDES = PANNOTATED_EMODEL_ELEMENT_FEATURE_COUNT + 20;

	/**
	 * The number of structural features of the the '<em>PAnnotated EClass</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANNOTATED_ECLASS_FEATURE_COUNT = PANNOTATED_EMODEL_ELEMENT_FEATURE_COUNT + 21;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.annotations.pamodel.impl.PAnnotatedEStructuralFeatureImpl <em>PAnnotated EStructural Feature</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.annotations.pamodel.impl.PAnnotatedEStructuralFeatureImpl
	 * @see org.eclipse.emf.teneo.annotations.pamodel.impl.PamodelPackageImpl#getPAnnotatedEStructuralFeature()
	 * @generated
	 */
	int PANNOTATED_ESTRUCTURAL_FEATURE = 4;

	/**
	 * The feature id for the '<em><b>Annotated Element</b></em>' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANNOTATED_ESTRUCTURAL_FEATURE__ANNOTATED_ELEMENT = PANNOTATED_EMODEL_ELEMENT__ANNOTATED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Transient</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANNOTATED_ESTRUCTURAL_FEATURE__TRANSIENT = PANNOTATED_EMODEL_ELEMENT__TRANSIENT;

	/**
	 * The feature id for the '<em><b>Pa EClass</b></em>' container reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANNOTATED_ESTRUCTURAL_FEATURE__PA_ECLASS = PANNOTATED_EMODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Annotated EStructural Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANNOTATED_ESTRUCTURAL_FEATURE__ANNOTATED_ESTRUCTURAL_FEATURE = PANNOTATED_EMODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Attribute Overrides</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANNOTATED_ESTRUCTURAL_FEATURE__ATTRIBUTE_OVERRIDES = PANNOTATED_EMODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANNOTATED_ESTRUCTURAL_FEATURE__COLUMNS = PANNOTATED_EMODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Join Table</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANNOTATED_ESTRUCTURAL_FEATURE__JOIN_TABLE = PANNOTATED_EMODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>One To Many</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANNOTATED_ESTRUCTURAL_FEATURE__ONE_TO_MANY = PANNOTATED_EMODEL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Sequence Generator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANNOTATED_ESTRUCTURAL_FEATURE__SEQUENCE_GENERATOR = PANNOTATED_EMODEL_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Table Generator</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANNOTATED_ESTRUCTURAL_FEATURE__TABLE_GENERATOR = PANNOTATED_EMODEL_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Join Columns</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANNOTATED_ESTRUCTURAL_FEATURE__JOIN_COLUMNS = PANNOTATED_EMODEL_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Id Bag</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANNOTATED_ESTRUCTURAL_FEATURE__ID_BAG = PANNOTATED_EMODEL_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Indexed</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANNOTATED_ESTRUCTURAL_FEATURE__INDEXED = PANNOTATED_EMODEL_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANNOTATED_ESTRUCTURAL_FEATURE__UNIQUE = PANNOTATED_EMODEL_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the the '<em>PAnnotated EStructural Feature</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PANNOTATED_ESTRUCTURAL_FEATURE_FEATURE_COUNT = PANNOTATED_EMODEL_ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.annotations.pamodel.impl.PAnnotatedEAttributeImpl <em>PAnnotated EAttribute</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.annotations.pamodel.impl.PAnnotatedEAttributeImpl
	 * @see org.eclipse.emf.teneo.annotations.pamodel.impl.PamodelPackageImpl#getPAnnotatedEAttribute()
	 * @generated
	 */
	int PANNOTATED_EATTRIBUTE = 5;

	/**
	 * The feature id for the '<em><b>Annotated Element</b></em>' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANNOTATED_EATTRIBUTE__ANNOTATED_ELEMENT = PANNOTATED_ESTRUCTURAL_FEATURE__ANNOTATED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Transient</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANNOTATED_EATTRIBUTE__TRANSIENT = PANNOTATED_ESTRUCTURAL_FEATURE__TRANSIENT;

	/**
	 * The feature id for the '<em><b>Pa EClass</b></em>' container reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANNOTATED_EATTRIBUTE__PA_ECLASS = PANNOTATED_ESTRUCTURAL_FEATURE__PA_ECLASS;

	/**
	 * The feature id for the '<em><b>Annotated EStructural Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANNOTATED_EATTRIBUTE__ANNOTATED_ESTRUCTURAL_FEATURE = PANNOTATED_ESTRUCTURAL_FEATURE__ANNOTATED_ESTRUCTURAL_FEATURE;

	/**
	 * The feature id for the '<em><b>Attribute Overrides</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANNOTATED_EATTRIBUTE__ATTRIBUTE_OVERRIDES = PANNOTATED_ESTRUCTURAL_FEATURE__ATTRIBUTE_OVERRIDES;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANNOTATED_EATTRIBUTE__COLUMNS = PANNOTATED_ESTRUCTURAL_FEATURE__COLUMNS;

	/**
	 * The feature id for the '<em><b>Join Table</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANNOTATED_EATTRIBUTE__JOIN_TABLE = PANNOTATED_ESTRUCTURAL_FEATURE__JOIN_TABLE;

	/**
	 * The feature id for the '<em><b>One To Many</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANNOTATED_EATTRIBUTE__ONE_TO_MANY = PANNOTATED_ESTRUCTURAL_FEATURE__ONE_TO_MANY;

	/**
	 * The feature id for the '<em><b>Sequence Generator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANNOTATED_EATTRIBUTE__SEQUENCE_GENERATOR = PANNOTATED_ESTRUCTURAL_FEATURE__SEQUENCE_GENERATOR;

	/**
	 * The feature id for the '<em><b>Table Generator</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANNOTATED_EATTRIBUTE__TABLE_GENERATOR = PANNOTATED_ESTRUCTURAL_FEATURE__TABLE_GENERATOR;

	/**
	 * The feature id for the '<em><b>Join Columns</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANNOTATED_EATTRIBUTE__JOIN_COLUMNS = PANNOTATED_ESTRUCTURAL_FEATURE__JOIN_COLUMNS;

	/**
	 * The feature id for the '<em><b>Id Bag</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANNOTATED_EATTRIBUTE__ID_BAG = PANNOTATED_ESTRUCTURAL_FEATURE__ID_BAG;

	/**
	 * The feature id for the '<em><b>Indexed</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANNOTATED_EATTRIBUTE__INDEXED = PANNOTATED_ESTRUCTURAL_FEATURE__INDEXED;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANNOTATED_EATTRIBUTE__UNIQUE = PANNOTATED_ESTRUCTURAL_FEATURE__UNIQUE;

	/**
	 * The feature id for the '<em><b>Annotated EAttribute</b></em>' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANNOTATED_EATTRIBUTE__ANNOTATED_EATTRIBUTE = PANNOTATED_ESTRUCTURAL_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Basic</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANNOTATED_EATTRIBUTE__BASIC = PANNOTATED_ESTRUCTURAL_FEATURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Enumerated</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANNOTATED_EATTRIBUTE__ENUMERATED = PANNOTATED_ESTRUCTURAL_FEATURE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Generated Value</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANNOTATED_EATTRIBUTE__GENERATED_VALUE = PANNOTATED_ESTRUCTURAL_FEATURE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PANNOTATED_EATTRIBUTE__ID = PANNOTATED_ESTRUCTURAL_FEATURE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Lob</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANNOTATED_EATTRIBUTE__LOB = PANNOTATED_ESTRUCTURAL_FEATURE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Temporal</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANNOTATED_EATTRIBUTE__TEMPORAL = PANNOTATED_ESTRUCTURAL_FEATURE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Version</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANNOTATED_EATTRIBUTE__VERSION = PANNOTATED_ESTRUCTURAL_FEATURE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANNOTATED_EATTRIBUTE__TYPE = PANNOTATED_ESTRUCTURAL_FEATURE_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the the '<em>PAnnotated EAttribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANNOTATED_EATTRIBUTE_FEATURE_COUNT = PANNOTATED_ESTRUCTURAL_FEATURE_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.annotations.pamodel.impl.PAnnotatedEReferenceImpl <em>PAnnotated EReference</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.annotations.pamodel.impl.PAnnotatedEReferenceImpl
	 * @see org.eclipse.emf.teneo.annotations.pamodel.impl.PamodelPackageImpl#getPAnnotatedEReference()
	 * @generated
	 */
	int PANNOTATED_EREFERENCE = 6;

	/**
	 * The feature id for the '<em><b>Annotated Element</b></em>' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANNOTATED_EREFERENCE__ANNOTATED_ELEMENT = PANNOTATED_ESTRUCTURAL_FEATURE__ANNOTATED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Transient</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANNOTATED_EREFERENCE__TRANSIENT = PANNOTATED_ESTRUCTURAL_FEATURE__TRANSIENT;

	/**
	 * The feature id for the '<em><b>Pa EClass</b></em>' container reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANNOTATED_EREFERENCE__PA_ECLASS = PANNOTATED_ESTRUCTURAL_FEATURE__PA_ECLASS;

	/**
	 * The feature id for the '<em><b>Annotated EStructural Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANNOTATED_EREFERENCE__ANNOTATED_ESTRUCTURAL_FEATURE = PANNOTATED_ESTRUCTURAL_FEATURE__ANNOTATED_ESTRUCTURAL_FEATURE;

	/**
	 * The feature id for the '<em><b>Attribute Overrides</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANNOTATED_EREFERENCE__ATTRIBUTE_OVERRIDES = PANNOTATED_ESTRUCTURAL_FEATURE__ATTRIBUTE_OVERRIDES;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANNOTATED_EREFERENCE__COLUMNS = PANNOTATED_ESTRUCTURAL_FEATURE__COLUMNS;

	/**
	 * The feature id for the '<em><b>Join Table</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANNOTATED_EREFERENCE__JOIN_TABLE = PANNOTATED_ESTRUCTURAL_FEATURE__JOIN_TABLE;

	/**
	 * The feature id for the '<em><b>One To Many</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANNOTATED_EREFERENCE__ONE_TO_MANY = PANNOTATED_ESTRUCTURAL_FEATURE__ONE_TO_MANY;

	/**
	 * The feature id for the '<em><b>Sequence Generator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANNOTATED_EREFERENCE__SEQUENCE_GENERATOR = PANNOTATED_ESTRUCTURAL_FEATURE__SEQUENCE_GENERATOR;

	/**
	 * The feature id for the '<em><b>Table Generator</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANNOTATED_EREFERENCE__TABLE_GENERATOR = PANNOTATED_ESTRUCTURAL_FEATURE__TABLE_GENERATOR;

	/**
	 * The feature id for the '<em><b>Join Columns</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANNOTATED_EREFERENCE__JOIN_COLUMNS = PANNOTATED_ESTRUCTURAL_FEATURE__JOIN_COLUMNS;

	/**
	 * The feature id for the '<em><b>Id Bag</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANNOTATED_EREFERENCE__ID_BAG = PANNOTATED_ESTRUCTURAL_FEATURE__ID_BAG;

	/**
	 * The feature id for the '<em><b>Indexed</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANNOTATED_EREFERENCE__INDEXED = PANNOTATED_ESTRUCTURAL_FEATURE__INDEXED;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANNOTATED_EREFERENCE__UNIQUE = PANNOTATED_ESTRUCTURAL_FEATURE__UNIQUE;

	/**
	 * The feature id for the '<em><b>Annotated EReference</b></em>' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANNOTATED_EREFERENCE__ANNOTATED_EREFERENCE = PANNOTATED_ESTRUCTURAL_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Embedded</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANNOTATED_EREFERENCE__EMBEDDED = PANNOTATED_ESTRUCTURAL_FEATURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Embedded Id</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANNOTATED_EREFERENCE__EMBEDDED_ID = PANNOTATED_ESTRUCTURAL_FEATURE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Many To Many</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANNOTATED_EREFERENCE__MANY_TO_MANY = PANNOTATED_ESTRUCTURAL_FEATURE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Many To One</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANNOTATED_EREFERENCE__MANY_TO_ONE = PANNOTATED_ESTRUCTURAL_FEATURE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Map Key</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANNOTATED_EREFERENCE__MAP_KEY = PANNOTATED_ESTRUCTURAL_FEATURE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>One To One</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANNOTATED_EREFERENCE__ONE_TO_ONE = PANNOTATED_ESTRUCTURAL_FEATURE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Order By</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANNOTATED_EREFERENCE__ORDER_BY = PANNOTATED_ESTRUCTURAL_FEATURE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Primary Key Join Column</b></em>' containment reference.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANNOTATED_EREFERENCE__PRIMARY_KEY_JOIN_COLUMN = PANNOTATED_ESTRUCTURAL_FEATURE_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the the '<em>PAnnotated EReference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANNOTATED_EREFERENCE_FEATURE_COUNT = PANNOTATED_ESTRUCTURAL_FEATURE_FEATURE_COUNT + 9;

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEModelElement <em>PAnnotated EModel Element</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>PAnnotated EModel Element</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEModelElement
	 * @generated
	 */
	EClass getPAnnotatedEModelElement();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEModelElement#getAnnotatedElement <em>Annotated Element</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Annotated Element</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEModelElement#getAnnotatedElement()
	 * @see #getPAnnotatedEModelElement()
	 * @generated
	 */
	EReference getPAnnotatedEModelElement_AnnotatedElement();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEModelElement#getTransient <em>Transient</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transient</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEModelElement#getTransient()
	 * @see #getPAnnotatedEModelElement()
	 * @generated
	 */
	EReference getPAnnotatedEModelElement_Transient();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedModel <em>PAnnotated Model</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>PAnnotated Model</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedModel
	 * @generated
	 */
	EClass getPAnnotatedModel();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedModel#getPaEPackages <em>Pa EPackages</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pa EPackages</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedModel#getPaEPackages()
	 * @see #getPAnnotatedModel()
	 * @generated
	 */
	EReference getPAnnotatedModel_PaEPackages();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEPackage <em>PAnnotated EPackage</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>PAnnotated EPackage</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEPackage
	 * @generated
	 */
	EClass getPAnnotatedEPackage();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEPackage#getPaModel <em>Pa Model</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Pa Model</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEPackage#getPaModel()
	 * @see #getPAnnotatedEPackage()
	 * @generated
	 */
	EReference getPAnnotatedEPackage_PaModel();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEPackage#getAnnotatedEPackage <em>Annotated EPackage</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Annotated EPackage</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEPackage#getAnnotatedEPackage()
	 * @see #getPAnnotatedEPackage()
	 * @generated
	 */
	EReference getPAnnotatedEPackage_AnnotatedEPackage();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEPackage#getPaEClasses <em>Pa EClasses</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pa EClasses</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEPackage#getPaEClasses()
	 * @see #getPAnnotatedEPackage()
	 * @generated
	 */
	EReference getPAnnotatedEPackage_PaEClasses();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEPackage#getSequenceGenerator <em>Sequence Generator</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sequence Generator</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEPackage#getSequenceGenerator()
	 * @see #getPAnnotatedEPackage()
	 * @generated
	 */
	EReference getPAnnotatedEPackage_SequenceGenerator();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEPackage#getTableGenerator <em>Table Generator</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Table Generator</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEPackage#getTableGenerator()
	 * @see #getPAnnotatedEPackage()
	 * @generated
	 */
	EReference getPAnnotatedEPackage_TableGenerator();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEClass <em>PAnnotated EClass</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>PAnnotated EClass</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEClass
	 * @generated
	 */
	EClass getPAnnotatedEClass();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEClass#getPaEPackage <em>Pa EPackage</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Pa EPackage</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEClass#getPaEPackage()
	 * @see #getPAnnotatedEClass()
	 * @generated
	 */
	EReference getPAnnotatedEClass_PaEPackage();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEClass#getAnnotatedEClass <em>Annotated EClass</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Annotated EClass</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEClass#getAnnotatedEClass()
	 * @see #getPAnnotatedEClass()
	 * @generated
	 */
	EReference getPAnnotatedEClass_AnnotatedEClass();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEClass#getPaEStructuralFeatures <em>Pa EStructural Features</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pa EStructural Features</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEClass#getPaEStructuralFeatures()
	 * @see #getPAnnotatedEClass()
	 * @generated
	 */
	EReference getPAnnotatedEClass_PaEStructuralFeatures();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEClass#getAttributeOverrides <em>Attribute Overrides</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Attribute Overrides</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEClass#getAttributeOverrides()
	 * @see #getPAnnotatedEClass()
	 * @generated
	 */
	EReference getPAnnotatedEClass_AttributeOverrides();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEClass#getDiscriminatorColumn <em>Discriminator Column</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Discriminator Column</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEClass#getDiscriminatorColumn()
	 * @see #getPAnnotatedEClass()
	 * @generated
	 */
	EReference getPAnnotatedEClass_DiscriminatorColumn();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEClass#getDiscriminatorValue <em>Discriminator Value</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Discriminator Value</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEClass#getDiscriminatorValue()
	 * @see #getPAnnotatedEClass()
	 * @generated
	 */
	EReference getPAnnotatedEClass_DiscriminatorValue();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEClass#getEmbeddable <em>Embeddable</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Embeddable</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEClass#getEmbeddable()
	 * @see #getPAnnotatedEClass()
	 * @generated
	 */
	EReference getPAnnotatedEClass_Embeddable();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEClass#getExcludeDefaultListeners <em>Exclude Default Listeners</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exclude Default Listeners</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEClass#getExcludeDefaultListeners()
	 * @see #getPAnnotatedEClass()
	 * @generated
	 */
	EReference getPAnnotatedEClass_ExcludeDefaultListeners();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEClass#getExcludeSuperclassListeners <em>Exclude Superclass Listeners</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exclude Superclass Listeners</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEClass#getExcludeSuperclassListeners()
	 * @see #getPAnnotatedEClass()
	 * @generated
	 */
	EReference getPAnnotatedEClass_ExcludeSuperclassListeners();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEClass#getMappedSuperclass <em>Mapped Superclass</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mapped Superclass</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEClass#getMappedSuperclass()
	 * @see #getPAnnotatedEClass()
	 * @generated
	 */
	EReference getPAnnotatedEClass_MappedSuperclass();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEClass#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Entity</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEClass#getEntity()
	 * @see #getPAnnotatedEClass()
	 * @generated
	 */
	EReference getPAnnotatedEClass_Entity();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEClass#getEntityListener <em>Entity Listener</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Entity Listener</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEClass#getEntityListener()
	 * @see #getPAnnotatedEClass()
	 * @generated
	 */
	EReference getPAnnotatedEClass_EntityListener();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEClass#getIdClass <em>Id Class</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Id Class</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEClass#getIdClass()
	 * @see #getPAnnotatedEClass()
	 * @generated
	 */
	EReference getPAnnotatedEClass_IdClass();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEClass#getInheritance <em>Inheritance</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Inheritance</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEClass#getInheritance()
	 * @see #getPAnnotatedEClass()
	 * @generated
	 */
	EReference getPAnnotatedEClass_Inheritance();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEClass#getJoinColumn <em>Join Column</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Join Column</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEClass#getJoinColumn()
	 * @see #getPAnnotatedEClass()
	 * @generated
	 */
	EReference getPAnnotatedEClass_JoinColumn();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEClass#getPrimaryKeyJoinColumns <em>Primary Key Join Columns</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Primary Key Join Columns</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEClass#getPrimaryKeyJoinColumns()
	 * @see #getPAnnotatedEClass()
	 * @generated
	 */
	EReference getPAnnotatedEClass_PrimaryKeyJoinColumns();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEClass#getSecondaryTables <em>Secondary Tables</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Secondary Tables</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEClass#getSecondaryTables()
	 * @see #getPAnnotatedEClass()
	 * @generated
	 */
	EReference getPAnnotatedEClass_SecondaryTables();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEClass#getSequenceGenerator <em>Sequence Generator</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sequence Generator</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEClass#getSequenceGenerator()
	 * @see #getPAnnotatedEClass()
	 * @generated
	 */
	EReference getPAnnotatedEClass_SequenceGenerator();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEClass#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Table</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEClass#getTable()
	 * @see #getPAnnotatedEClass()
	 * @generated
	 */
	EReference getPAnnotatedEClass_Table();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEClass#getTableGenerator <em>Table Generator</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Table Generator</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEClass#getTableGenerator()
	 * @see #getPAnnotatedEClass()
	 * @generated
	 */
	EReference getPAnnotatedEClass_TableGenerator();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEClass#getAssociationOverrides <em>Association Overrides</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Association Overrides</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEClass#getAssociationOverrides()
	 * @see #getPAnnotatedEClass()
	 * @generated
	 */
	EReference getPAnnotatedEClass_AssociationOverrides();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEStructuralFeature <em>PAnnotated EStructural Feature</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>PAnnotated EStructural Feature</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEStructuralFeature
	 * @generated
	 */
	EClass getPAnnotatedEStructuralFeature();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEStructuralFeature#getPaEClass <em>Pa EClass</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Pa EClass</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEStructuralFeature#getPaEClass()
	 * @see #getPAnnotatedEStructuralFeature()
	 * @generated
	 */
	EReference getPAnnotatedEStructuralFeature_PaEClass();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEStructuralFeature#getAnnotatedEStructuralFeature <em>Annotated EStructural Feature</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Annotated EStructural Feature</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEStructuralFeature#getAnnotatedEStructuralFeature()
	 * @see #getPAnnotatedEStructuralFeature()
	 * @generated
	 */
	EReference getPAnnotatedEStructuralFeature_AnnotatedEStructuralFeature();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEStructuralFeature#getAttributeOverrides <em>Attribute Overrides</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Attribute Overrides</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEStructuralFeature#getAttributeOverrides()
	 * @see #getPAnnotatedEStructuralFeature()
	 * @generated
	 */
	EReference getPAnnotatedEStructuralFeature_AttributeOverrides();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEStructuralFeature#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Columns</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEStructuralFeature#getColumns()
	 * @see #getPAnnotatedEStructuralFeature()
	 * @generated
	 */
	EReference getPAnnotatedEStructuralFeature_Columns();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEStructuralFeature#getJoinTable <em>Join Table</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Join Table</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEStructuralFeature#getJoinTable()
	 * @see #getPAnnotatedEStructuralFeature()
	 * @generated
	 */
	EReference getPAnnotatedEStructuralFeature_JoinTable();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEStructuralFeature#getOneToMany <em>One To Many</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>One To Many</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEStructuralFeature#getOneToMany()
	 * @see #getPAnnotatedEStructuralFeature()
	 * @generated
	 */
	EReference getPAnnotatedEStructuralFeature_OneToMany();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEStructuralFeature#getSequenceGenerator <em>Sequence Generator</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sequence Generator</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEStructuralFeature#getSequenceGenerator()
	 * @see #getPAnnotatedEStructuralFeature()
	 * @generated
	 */
	EReference getPAnnotatedEStructuralFeature_SequenceGenerator();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEStructuralFeature#getTableGenerator <em>Table Generator</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Table Generator</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEStructuralFeature#getTableGenerator()
	 * @see #getPAnnotatedEStructuralFeature()
	 * @generated
	 */
	EReference getPAnnotatedEStructuralFeature_TableGenerator();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEStructuralFeature#getJoinColumns <em>Join Columns</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Join Columns</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEStructuralFeature#getJoinColumns()
	 * @see #getPAnnotatedEStructuralFeature()
	 * @generated
	 */
	EReference getPAnnotatedEStructuralFeature_JoinColumns();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEStructuralFeature#getIndexed <em>Indexed</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Indexed</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEStructuralFeature#getIndexed()
	 * @see #getPAnnotatedEStructuralFeature()
	 * @generated
	 */
	EReference getPAnnotatedEStructuralFeature_Indexed();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEStructuralFeature#getUnique <em>Unique</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Unique</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEStructuralFeature#getUnique()
	 * @see #getPAnnotatedEStructuralFeature()
	 * @generated
	 */
	EReference getPAnnotatedEStructuralFeature_Unique();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEStructuralFeature#getIdBag <em>Id Bag</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Id Bag</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEStructuralFeature#getIdBag()
	 * @see #getPAnnotatedEStructuralFeature()
	 * @generated
	 */
	EReference getPAnnotatedEStructuralFeature_IdBag();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEAttribute <em>PAnnotated EAttribute</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>PAnnotated EAttribute</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEAttribute
	 * @generated
	 */
	EClass getPAnnotatedEAttribute();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEAttribute#getAnnotatedEAttribute <em>Annotated EAttribute</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Annotated EAttribute</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEAttribute#getAnnotatedEAttribute()
	 * @see #getPAnnotatedEAttribute()
	 * @generated
	 */
	EReference getPAnnotatedEAttribute_AnnotatedEAttribute();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEAttribute#getBasic <em>Basic</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Basic</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEAttribute#getBasic()
	 * @see #getPAnnotatedEAttribute()
	 * @generated
	 */
	EReference getPAnnotatedEAttribute_Basic();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEAttribute#getEnumerated <em>Enumerated</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Enumerated</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEAttribute#getEnumerated()
	 * @see #getPAnnotatedEAttribute()
	 * @generated
	 */
	EReference getPAnnotatedEAttribute_Enumerated();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEAttribute#getGeneratedValue <em>Generated Value</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Generated Value</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEAttribute#getGeneratedValue()
	 * @see #getPAnnotatedEAttribute()
	 * @generated
	 */
	EReference getPAnnotatedEAttribute_GeneratedValue();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEAttribute#getId <em>Id</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Id</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEAttribute#getId()
	 * @see #getPAnnotatedEAttribute()
	 * @generated
	 */
	EReference getPAnnotatedEAttribute_Id();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEAttribute#getLob <em>Lob</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lob</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEAttribute#getLob()
	 * @see #getPAnnotatedEAttribute()
	 * @generated
	 */
	EReference getPAnnotatedEAttribute_Lob();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEAttribute#getTemporal <em>Temporal</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Temporal</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEAttribute#getTemporal()
	 * @see #getPAnnotatedEAttribute()
	 * @generated
	 */
	EReference getPAnnotatedEAttribute_Temporal();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEAttribute#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Version</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEAttribute#getVersion()
	 * @see #getPAnnotatedEAttribute()
	 * @generated
	 */
	EReference getPAnnotatedEAttribute_Version();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEAttribute#getType <em>Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEAttribute#getType()
	 * @see #getPAnnotatedEAttribute()
	 * @generated
	 */
	EReference getPAnnotatedEAttribute_Type();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEReference <em>PAnnotated EReference</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>PAnnotated EReference</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEReference
	 * @generated
	 */
	EClass getPAnnotatedEReference();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEReference#getAnnotatedEReference <em>Annotated EReference</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Annotated EReference</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEReference#getAnnotatedEReference()
	 * @see #getPAnnotatedEReference()
	 * @generated
	 */
	EReference getPAnnotatedEReference_AnnotatedEReference();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEReference#getEmbedded <em>Embedded</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Embedded</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEReference#getEmbedded()
	 * @see #getPAnnotatedEReference()
	 * @generated
	 */
	EReference getPAnnotatedEReference_Embedded();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEReference#getEmbeddedId <em>Embedded Id</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Embedded Id</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEReference#getEmbeddedId()
	 * @see #getPAnnotatedEReference()
	 * @generated
	 */
	EReference getPAnnotatedEReference_EmbeddedId();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEReference#getManyToMany <em>Many To Many</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Many To Many</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEReference#getManyToMany()
	 * @see #getPAnnotatedEReference()
	 * @generated
	 */
	EReference getPAnnotatedEReference_ManyToMany();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEReference#getManyToOne <em>Many To One</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Many To One</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEReference#getManyToOne()
	 * @see #getPAnnotatedEReference()
	 * @generated
	 */
	EReference getPAnnotatedEReference_ManyToOne();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEReference#getMapKey <em>Map Key</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Map Key</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEReference#getMapKey()
	 * @see #getPAnnotatedEReference()
	 * @generated
	 */
	EReference getPAnnotatedEReference_MapKey();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEReference#getOneToOne <em>One To One</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>One To One</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEReference#getOneToOne()
	 * @see #getPAnnotatedEReference()
	 * @generated
	 */
	EReference getPAnnotatedEReference_OneToOne();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEReference#getOrderBy <em>Order By</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Order By</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEReference#getOrderBy()
	 * @see #getPAnnotatedEReference()
	 * @generated
	 */
	EReference getPAnnotatedEReference_OrderBy();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEReference#getPrimaryKeyJoinColumn <em>Primary Key Join Column</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Primary Key Join Column</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEReference#getPrimaryKeyJoinColumn()
	 * @see #getPAnnotatedEReference()
	 * @generated
	 */
	EReference getPAnnotatedEReference_PrimaryKeyJoinColumn();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PamodelFactory getPamodelFactory();

	/**
	 * @return Returns the EReference in paElementEClass that has pAnnotationEClass as reference type.
	 *         <p>
	 *         Returns null if either paElementEClass is not the EClass of a PAnnotatedElement, or pAnnotationEClass is
	 *         not the EClass of a PAnnotation, or such a feature does not exist in paElementEClass.
	 */
	public EReference pAnnotationReference(EClass paElementEClass, EClass pAnnotationEClass);

} // PamodelPackage

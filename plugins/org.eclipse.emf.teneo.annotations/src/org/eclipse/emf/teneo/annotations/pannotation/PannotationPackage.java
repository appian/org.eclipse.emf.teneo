/**
 * <copyright>
 * </copyright>
 *
 * $Id: PannotationPackage.java,v 1.2 2006/07/04 21:56:29 mtaal Exp $
 */
package org.eclipse.emf.teneo.annotations.pannotation;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see org.eclipse.emf.teneo.annotations.pannotation.PannotationFactory
 * @model kind="package"
 * @generated
 */
public interface PannotationPackage extends EPackage{
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
	String eNAME = "pannotation";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/emf/teneo/elver/2005/PAnnotation";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.elver.annotation";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	PannotationPackage eINSTANCE = org.eclipse.emf.teneo.annotations.pannotation.impl.PannotationPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.annotations.pannotation.PAnnotation <em>PAnnotation</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.annotations.pannotation.PAnnotation
	 * @see org.eclipse.emf.teneo.annotations.pannotation.impl.PannotationPackageImpl#getPAnnotation()
	 * @generated
	 */
	int PANNOTATION = 0;

	/**
	 * The feature id for the '<em><b>EModel Element</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PANNOTATION__EMODEL_ELEMENT = 0;

	/**
	 * The number of structural features of the the '<em>PAnnotation</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANNOTATION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.annotations.pannotation.impl.AttributeOverrideImpl <em>Attribute Override</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.annotations.pannotation.impl.AttributeOverrideImpl
	 * @see org.eclipse.emf.teneo.annotations.pannotation.impl.PannotationPackageImpl#getAttributeOverride()
	 * @generated
	 */
	int ATTRIBUTE_OVERRIDE = 1;

	/**
	 * The feature id for the '<em><b>EModel Element</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_OVERRIDE__EMODEL_ELEMENT = PANNOTATION__EMODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_OVERRIDE__NAME = PANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Column</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_OVERRIDE__COLUMN = PANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the the '<em>Attribute Override</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_OVERRIDE_FEATURE_COUNT = PANNOTATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.annotations.pannotation.impl.AttributeOverridesImpl <em>Attribute Overrides</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.annotations.pannotation.impl.AttributeOverridesImpl
	 * @see org.eclipse.emf.teneo.annotations.pannotation.impl.PannotationPackageImpl#getAttributeOverrides()
	 * @generated
	 */
	int ATTRIBUTE_OVERRIDES = 2;

	/**
	 * The feature id for the '<em><b>EModel Element</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_OVERRIDES__EMODEL_ELEMENT = PANNOTATION__EMODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_OVERRIDES__VALUE = PANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the the '<em>Attribute Overrides</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_OVERRIDES_FEATURE_COUNT = PANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.annotations.pannotation.impl.BasicImpl <em>Basic</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.annotations.pannotation.impl.BasicImpl
	 * @see org.eclipse.emf.teneo.annotations.pannotation.impl.PannotationPackageImpl#getBasic()
	 * @generated
	 */
	int BASIC = 5;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.annotations.pannotation.impl.ColumnImpl <em>Column</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.annotations.pannotation.impl.ColumnImpl
	 * @see org.eclipse.emf.teneo.annotations.pannotation.impl.PannotationPackageImpl#getColumn()
	 * @generated
	 */
	int COLUMN = 6;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.annotations.pannotation.impl.ColumnResultImpl <em>Column Result</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.annotations.pannotation.impl.ColumnResultImpl
	 * @see org.eclipse.emf.teneo.annotations.pannotation.impl.PannotationPackageImpl#getColumnResult()
	 * @generated
	 */
	int COLUMN_RESULT = 8;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.annotations.pannotation.impl.DiscriminatorColumnImpl <em>Discriminator Column</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.annotations.pannotation.impl.DiscriminatorColumnImpl
	 * @see org.eclipse.emf.teneo.annotations.pannotation.impl.PannotationPackageImpl#getDiscriminatorColumn()
	 * @generated
	 */
	int DISCRIMINATOR_COLUMN = 9;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.annotations.pannotation.impl.DiscriminatorValueImpl <em>Discriminator Value</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.annotations.pannotation.impl.DiscriminatorValueImpl
	 * @see org.eclipse.emf.teneo.annotations.pannotation.impl.PannotationPackageImpl#getDiscriminatorValue()
	 * @generated
	 */
	int DISCRIMINATOR_VALUE = 10;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.annotations.pannotation.impl.EmbeddableImpl <em>Embeddable</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.annotations.pannotation.impl.EmbeddableImpl
	 * @see org.eclipse.emf.teneo.annotations.pannotation.impl.PannotationPackageImpl#getEmbeddable()
	 * @generated
	 */
	int EMBEDDABLE = 11;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.annotations.pannotation.impl.MappedSuperclassImpl <em>Mapped Superclass</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.annotations.pannotation.impl.MappedSuperclassImpl
	 * @see org.eclipse.emf.teneo.annotations.pannotation.impl.PannotationPackageImpl#getMappedSuperclass()
	 * @generated
	 */
	int MAPPED_SUPERCLASS = 34;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.annotations.pannotation.impl.EmbeddedImpl <em>Embedded</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.annotations.pannotation.impl.EmbeddedImpl
	 * @see org.eclipse.emf.teneo.annotations.pannotation.impl.PannotationPackageImpl#getEmbedded()
	 * @generated
	 */
	int EMBEDDED = 12;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.annotations.pannotation.impl.EmbeddedIdImpl <em>Embedded Id</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.annotations.pannotation.impl.EmbeddedIdImpl
	 * @see org.eclipse.emf.teneo.annotations.pannotation.impl.PannotationPackageImpl#getEmbeddedId()
	 * @generated
	 */
	int EMBEDDED_ID = 13;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.annotations.pannotation.impl.EnumeratedImpl <em>Enumerated</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.annotations.pannotation.impl.EnumeratedImpl
	 * @see org.eclipse.emf.teneo.annotations.pannotation.impl.PannotationPackageImpl#getEnumerated()
	 * @generated
	 */
	int ENUMERATED = 17;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.annotations.pannotation.impl.EntityImpl <em>Entity</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.annotations.pannotation.impl.EntityImpl
	 * @see org.eclipse.emf.teneo.annotations.pannotation.impl.PannotationPackageImpl#getEntity()
	 * @generated
	 */
	int ENTITY = 14;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.annotations.pannotation.impl.EntityListenerImpl <em>Entity Listener</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.annotations.pannotation.impl.EntityListenerImpl
	 * @see org.eclipse.emf.teneo.annotations.pannotation.impl.PannotationPackageImpl#getEntityListener()
	 * @generated
	 */
	int ENTITY_LISTENER = 15;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.annotations.pannotation.impl.EntityResultImpl <em>Entity Result</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.annotations.pannotation.impl.EntityResultImpl
	 * @see org.eclipse.emf.teneo.annotations.pannotation.impl.PannotationPackageImpl#getEntityResult()
	 * @generated
	 */
	int ENTITY_RESULT = 16;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.annotations.pannotation.impl.ExcludeDefaultListenersImpl <em>Exclude Default Listeners</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.annotations.pannotation.impl.ExcludeDefaultListenersImpl
	 * @see org.eclipse.emf.teneo.annotations.pannotation.impl.PannotationPackageImpl#getExcludeDefaultListeners()
	 * @generated
	 */
	int EXCLUDE_DEFAULT_LISTENERS = 18;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.annotations.pannotation.impl.ExcludeSuperclassListenersImpl <em>Exclude Superclass Listeners</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.annotations.pannotation.impl.ExcludeSuperclassListenersImpl
	 * @see org.eclipse.emf.teneo.annotations.pannotation.impl.PannotationPackageImpl#getExcludeSuperclassListeners()
	 * @generated
	 */
	int EXCLUDE_SUPERCLASS_LISTENERS = 19;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.annotations.pannotation.impl.FieldResultImpl <em>Field Result</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.annotations.pannotation.impl.FieldResultImpl
	 * @see org.eclipse.emf.teneo.annotations.pannotation.impl.PannotationPackageImpl#getFieldResult()
	 * @generated
	 */
	int FIELD_RESULT = 20;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.annotations.pannotation.impl.FlushModeImpl <em>Flush Mode</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.annotations.pannotation.impl.FlushModeImpl
	 * @see org.eclipse.emf.teneo.annotations.pannotation.impl.PannotationPackageImpl#getFlushMode()
	 * @generated
	 */
	int FLUSH_MODE = 21;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.annotations.pannotation.impl.GeneratedValueImpl <em>Generated Value</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.annotations.pannotation.impl.GeneratedValueImpl
	 * @see org.eclipse.emf.teneo.annotations.pannotation.impl.PannotationPackageImpl#getGeneratedValue()
	 * @generated
	 */
	int GENERATED_VALUE = 22;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.annotations.pannotation.impl.IdImpl <em>Id</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.annotations.pannotation.impl.IdImpl
	 * @see org.eclipse.emf.teneo.annotations.pannotation.impl.PannotationPackageImpl#getId()
	 * @generated
	 */
	int ID = 23;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.annotations.pannotation.impl.IdClassImpl <em>Id Class</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.annotations.pannotation.impl.IdClassImpl
	 * @see org.eclipse.emf.teneo.annotations.pannotation.impl.PannotationPackageImpl#getIdClass()
	 * @generated
	 */
	int ID_CLASS = 25;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.annotations.pannotation.impl.InheritanceImpl <em>Inheritance</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.annotations.pannotation.impl.InheritanceImpl
	 * @see org.eclipse.emf.teneo.annotations.pannotation.impl.PannotationPackageImpl#getInheritance()
	 * @generated
	 */
	int INHERITANCE = 26;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.annotations.pannotation.impl.JoinColumnImpl <em>Join Column</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.annotations.pannotation.impl.JoinColumnImpl
	 * @see org.eclipse.emf.teneo.annotations.pannotation.impl.PannotationPackageImpl#getJoinColumn()
	 * @generated
	 */
	int JOIN_COLUMN = 27;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.annotations.pannotation.impl.JoinColumnsImpl <em>Join Columns</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.annotations.pannotation.impl.JoinColumnsImpl
	 * @see org.eclipse.emf.teneo.annotations.pannotation.impl.PannotationPackageImpl#getJoinColumns()
	 * @generated
	 */
	int JOIN_COLUMNS = 28;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.annotations.pannotation.impl.JoinTableImpl <em>Join Table</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.annotations.pannotation.impl.JoinTableImpl
	 * @see org.eclipse.emf.teneo.annotations.pannotation.impl.PannotationPackageImpl#getJoinTable()
	 * @generated
	 */
	int JOIN_TABLE = 29;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.annotations.pannotation.impl.LobImpl <em>Lob</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.annotations.pannotation.impl.LobImpl
	 * @see org.eclipse.emf.teneo.annotations.pannotation.impl.PannotationPackageImpl#getLob()
	 * @generated
	 */
	int LOB = 30;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.annotations.pannotation.impl.ManyToManyImpl <em>Many To Many</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.annotations.pannotation.impl.ManyToManyImpl
	 * @see org.eclipse.emf.teneo.annotations.pannotation.impl.PannotationPackageImpl#getManyToMany()
	 * @generated
	 */
	int MANY_TO_MANY = 31;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.annotations.pannotation.impl.ManyToOneImpl <em>Many To One</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.annotations.pannotation.impl.ManyToOneImpl
	 * @see org.eclipse.emf.teneo.annotations.pannotation.impl.PannotationPackageImpl#getManyToOne()
	 * @generated
	 */
	int MANY_TO_ONE = 32;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.annotations.pannotation.impl.MapKeyImpl <em>Map Key</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.annotations.pannotation.impl.MapKeyImpl
	 * @see org.eclipse.emf.teneo.annotations.pannotation.impl.PannotationPackageImpl#getMapKey()
	 * @generated
	 */
	int MAP_KEY = 33;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.annotations.pannotation.impl.NamedNativeQueriesImpl <em>Named Native Queries</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.annotations.pannotation.impl.NamedNativeQueriesImpl
	 * @see org.eclipse.emf.teneo.annotations.pannotation.impl.PannotationPackageImpl#getNamedNativeQueries()
	 * @generated
	 */
	int NAMED_NATIVE_QUERIES = 35;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.annotations.pannotation.impl.NamedNativeQueryImpl <em>Named Native Query</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.annotations.pannotation.impl.NamedNativeQueryImpl
	 * @see org.eclipse.emf.teneo.annotations.pannotation.impl.PannotationPackageImpl#getNamedNativeQuery()
	 * @generated
	 */
	int NAMED_NATIVE_QUERY = 36;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.annotations.pannotation.impl.NamedQueriesImpl <em>Named Queries</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.annotations.pannotation.impl.NamedQueriesImpl
	 * @see org.eclipse.emf.teneo.annotations.pannotation.impl.PannotationPackageImpl#getNamedQueries()
	 * @generated
	 */
	int NAMED_QUERIES = 37;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.annotations.pannotation.impl.NamedQueryImpl <em>Named Query</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.annotations.pannotation.impl.NamedQueryImpl
	 * @see org.eclipse.emf.teneo.annotations.pannotation.impl.PannotationPackageImpl#getNamedQuery()
	 * @generated
	 */
	int NAMED_QUERY = 38;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.annotations.pannotation.impl.OneToManyImpl <em>One To Many</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.annotations.pannotation.impl.OneToManyImpl
	 * @see org.eclipse.emf.teneo.annotations.pannotation.impl.PannotationPackageImpl#getOneToMany()
	 * @generated
	 */
	int ONE_TO_MANY = 39;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.annotations.pannotation.impl.OneToOneImpl <em>One To One</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.annotations.pannotation.impl.OneToOneImpl
	 * @see org.eclipse.emf.teneo.annotations.pannotation.impl.PannotationPackageImpl#getOneToOne()
	 * @generated
	 */
	int ONE_TO_ONE = 40;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.annotations.pannotation.impl.OrderByImpl <em>Order By</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.annotations.pannotation.impl.OrderByImpl
	 * @see org.eclipse.emf.teneo.annotations.pannotation.impl.PannotationPackageImpl#getOrderBy()
	 * @generated
	 */
	int ORDER_BY = 41;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.annotations.pannotation.impl.PersistenceContextImpl <em>Persistence Context</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.annotations.pannotation.impl.PersistenceContextImpl
	 * @see org.eclipse.emf.teneo.annotations.pannotation.impl.PannotationPackageImpl#getPersistenceContext()
	 * @generated
	 */
	int PERSISTENCE_CONTEXT = 43;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.annotations.pannotation.impl.PersistenceContextsImpl <em>Persistence Contexts</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.annotations.pannotation.impl.PersistenceContextsImpl
	 * @see org.eclipse.emf.teneo.annotations.pannotation.impl.PannotationPackageImpl#getPersistenceContexts()
	 * @generated
	 */
	int PERSISTENCE_CONTEXTS = 44;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.annotations.pannotation.impl.PersistenceUnitImpl <em>Persistence Unit</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.annotations.pannotation.impl.PersistenceUnitImpl
	 * @see org.eclipse.emf.teneo.annotations.pannotation.impl.PannotationPackageImpl#getPersistenceUnit()
	 * @generated
	 */
	int PERSISTENCE_UNIT = 45;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.annotations.pannotation.impl.PersistenceUnitsImpl <em>Persistence Units</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.annotations.pannotation.impl.PersistenceUnitsImpl
	 * @see org.eclipse.emf.teneo.annotations.pannotation.impl.PannotationPackageImpl#getPersistenceUnits()
	 * @generated
	 */
	int PERSISTENCE_UNITS = 46;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.annotations.pannotation.impl.PostLoadImpl <em>Post Load</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.annotations.pannotation.impl.PostLoadImpl
	 * @see org.eclipse.emf.teneo.annotations.pannotation.impl.PannotationPackageImpl#getPostLoad()
	 * @generated
	 */
	int POST_LOAD = 47;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.annotations.pannotation.impl.PostPersistImpl <em>Post Persist</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.annotations.pannotation.impl.PostPersistImpl
	 * @see org.eclipse.emf.teneo.annotations.pannotation.impl.PannotationPackageImpl#getPostPersist()
	 * @generated
	 */
	int POST_PERSIST = 48;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.annotations.pannotation.impl.PostRemoveImpl <em>Post Remove</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.annotations.pannotation.impl.PostRemoveImpl
	 * @see org.eclipse.emf.teneo.annotations.pannotation.impl.PannotationPackageImpl#getPostRemove()
	 * @generated
	 */
	int POST_REMOVE = 49;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.annotations.pannotation.impl.PostUpdateImpl <em>Post Update</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.annotations.pannotation.impl.PostUpdateImpl
	 * @see org.eclipse.emf.teneo.annotations.pannotation.impl.PannotationPackageImpl#getPostUpdate()
	 * @generated
	 */
	int POST_UPDATE = 50;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.annotations.pannotation.impl.PrePersistImpl <em>Pre Persist</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.annotations.pannotation.impl.PrePersistImpl
	 * @see org.eclipse.emf.teneo.annotations.pannotation.impl.PannotationPackageImpl#getPrePersist()
	 * @generated
	 */
	int PRE_PERSIST = 51;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.annotations.pannotation.impl.PreRemoveImpl <em>Pre Remove</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.annotations.pannotation.impl.PreRemoveImpl
	 * @see org.eclipse.emf.teneo.annotations.pannotation.impl.PannotationPackageImpl#getPreRemove()
	 * @generated
	 */
	int PRE_REMOVE = 52;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.annotations.pannotation.impl.PreUpdateImpl <em>Pre Update</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.annotations.pannotation.impl.PreUpdateImpl
	 * @see org.eclipse.emf.teneo.annotations.pannotation.impl.PannotationPackageImpl#getPreUpdate()
	 * @generated
	 */
	int PRE_UPDATE = 53;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.annotations.pannotation.impl.PrimaryKeyJoinColumnImpl <em>Primary Key Join Column</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.annotations.pannotation.impl.PrimaryKeyJoinColumnImpl
	 * @see org.eclipse.emf.teneo.annotations.pannotation.impl.PannotationPackageImpl#getPrimaryKeyJoinColumn()
	 * @generated
	 */
	int PRIMARY_KEY_JOIN_COLUMN = 54;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.annotations.pannotation.impl.PrimaryKeyJoinColumnsImpl <em>Primary Key Join Columns</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.annotations.pannotation.impl.PrimaryKeyJoinColumnsImpl
	 * @see org.eclipse.emf.teneo.annotations.pannotation.impl.PannotationPackageImpl#getPrimaryKeyJoinColumns()
	 * @generated
	 */
	int PRIMARY_KEY_JOIN_COLUMNS = 55;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.annotations.pannotation.impl.QueryHintImpl <em>Query Hint</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.annotations.pannotation.impl.QueryHintImpl
	 * @see org.eclipse.emf.teneo.annotations.pannotation.impl.PannotationPackageImpl#getQueryHint()
	 * @generated
	 */
	int QUERY_HINT = 56;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.annotations.pannotation.impl.SecondaryTableImpl <em>Secondary Table</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.annotations.pannotation.impl.SecondaryTableImpl
	 * @see org.eclipse.emf.teneo.annotations.pannotation.impl.PannotationPackageImpl#getSecondaryTable()
	 * @generated
	 */
	int SECONDARY_TABLE = 57;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.annotations.pannotation.impl.SecondaryTablesImpl <em>Secondary Tables</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.annotations.pannotation.impl.SecondaryTablesImpl
	 * @see org.eclipse.emf.teneo.annotations.pannotation.impl.PannotationPackageImpl#getSecondaryTables()
	 * @generated
	 */
	int SECONDARY_TABLES = 58;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.annotations.pannotation.impl.SequenceGeneratorImpl <em>Sequence Generator</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.annotations.pannotation.impl.SequenceGeneratorImpl
	 * @see org.eclipse.emf.teneo.annotations.pannotation.impl.PannotationPackageImpl#getSequenceGenerator()
	 * @generated
	 */
	int SEQUENCE_GENERATOR = 59;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.annotations.pannotation.impl.SqlResultSetMappingImpl <em>Sql Result Set Mapping</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.annotations.pannotation.impl.SqlResultSetMappingImpl
	 * @see org.eclipse.emf.teneo.annotations.pannotation.impl.PannotationPackageImpl#getSqlResultSetMapping()
	 * @generated
	 */
	int SQL_RESULT_SET_MAPPING = 60;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.annotations.pannotation.impl.TableImpl <em>Table</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.annotations.pannotation.impl.TableImpl
	 * @see org.eclipse.emf.teneo.annotations.pannotation.impl.PannotationPackageImpl#getTable()
	 * @generated
	 */
	int TABLE = 61;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.annotations.pannotation.impl.TableGeneratorImpl <em>Table Generator</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.annotations.pannotation.impl.TableGeneratorImpl
	 * @see org.eclipse.emf.teneo.annotations.pannotation.impl.PannotationPackageImpl#getTableGenerator()
	 * @generated
	 */
	int TABLE_GENERATOR = 62;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.annotations.pannotation.impl.TemporalImpl <em>Temporal</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.annotations.pannotation.impl.TemporalImpl
	 * @see org.eclipse.emf.teneo.annotations.pannotation.impl.PannotationPackageImpl#getTemporal()
	 * @generated
	 */
	int TEMPORAL = 63;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.annotations.pannotation.impl.TransientImpl <em>Transient</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.annotations.pannotation.impl.TransientImpl
	 * @see org.eclipse.emf.teneo.annotations.pannotation.impl.PannotationPackageImpl#getTransient()
	 * @generated
	 */
	int TRANSIENT = 65;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.annotations.pannotation.impl.UniqueConstraintImpl <em>Unique Constraint</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.annotations.pannotation.impl.UniqueConstraintImpl
	 * @see org.eclipse.emf.teneo.annotations.pannotation.impl.PannotationPackageImpl#getUniqueConstraint()
	 * @generated
	 */
	int UNIQUE_CONSTRAINT = 66;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.annotations.pannotation.impl.VersionImpl <em>Version</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.annotations.pannotation.impl.VersionImpl
	 * @see org.eclipse.emf.teneo.annotations.pannotation.impl.PannotationPackageImpl#getVersion()
	 * @generated
	 */
	int VERSION = 67;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.annotations.pannotation.impl.AssociationOverrideImpl <em>Association Override</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.annotations.pannotation.impl.AssociationOverrideImpl
	 * @see org.eclipse.emf.teneo.annotations.pannotation.impl.PannotationPackageImpl#getAssociationOverride()
	 * @generated
	 */
	int ASSOCIATION_OVERRIDE = 3;

	/**
	 * The feature id for the '<em><b>EModel Element</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_OVERRIDE__EMODEL_ELEMENT = PANNOTATION__EMODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_OVERRIDE__NAME = PANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Join Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_OVERRIDE__JOIN_COLUMNS = PANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the the '<em>Association Override</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_OVERRIDE_FEATURE_COUNT = PANNOTATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.annotations.pannotation.impl.AssociationOverridesImpl <em>Association Overrides</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.annotations.pannotation.impl.AssociationOverridesImpl
	 * @see org.eclipse.emf.teneo.annotations.pannotation.impl.PannotationPackageImpl#getAssociationOverrides()
	 * @generated
	 */
	int ASSOCIATION_OVERRIDES = 4;

	/**
	 * The feature id for the '<em><b>EModel Element</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_OVERRIDES__EMODEL_ELEMENT = PANNOTATION__EMODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_OVERRIDES__VALUE = PANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the the '<em>Association Overrides</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_OVERRIDES_FEATURE_COUNT = PANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>EModel Element</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BASIC__EMODEL_ELEMENT = PANNOTATION__EMODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Fetch</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC__FETCH = PANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC__OPTIONAL = PANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the the '<em>Basic</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_FEATURE_COUNT = PANNOTATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>EModel Element</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COLUMN__EMODEL_ELEMENT = PANNOTATION__EMODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__NAME = PANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__UNIQUE = PANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Nullable</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__NULLABLE = PANNOTATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Insertable</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__INSERTABLE = PANNOTATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Updatable</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__UPDATABLE = PANNOTATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Column Definition</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__COLUMN_DEFINITION = PANNOTATION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Table</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__TABLE = PANNOTATION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__LENGTH = PANNOTATION_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Precision</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__PRECISION = PANNOTATION_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Scale</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__SCALE = PANNOTATION_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the the '<em>Column</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_FEATURE_COUNT = PANNOTATION_FEATURE_COUNT + 10;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.annotations.pannotation.impl.IndexedImpl <em>Indexed</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.annotations.pannotation.impl.IndexedImpl
	 * @see org.eclipse.emf.teneo.annotations.pannotation.impl.PannotationPackageImpl#getIndexed()
	 * @generated
	 */
	int INDEXED = 68;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.annotations.pannotation.impl.UniqueImpl <em>Unique</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.annotations.pannotation.impl.UniqueImpl
	 * @see org.eclipse.emf.teneo.annotations.pannotation.impl.PannotationPackageImpl#getUnique()
	 * @generated
	 */
	int UNIQUE = 69;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.annotations.pannotation.impl.IdBagImpl <em>Id Bag</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.annotations.pannotation.impl.IdBagImpl
	 * @see org.eclipse.emf.teneo.annotations.pannotation.impl.PannotationPackageImpl#getIdBag()
	 * @generated
	 */
	int ID_BAG = 24;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.annotations.pannotation.impl.ColumnsImpl <em>Columns</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.annotations.pannotation.impl.ColumnsImpl
	 * @see org.eclipse.emf.teneo.annotations.pannotation.impl.PannotationPackageImpl#getColumns()
	 * @generated
	 */
	int COLUMNS = 7;

	/**
	 * The feature id for the '<em><b>EModel Element</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COLUMNS__EMODEL_ELEMENT = PANNOTATION__EMODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMNS__VALUE = PANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the the '<em>Columns</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMNS_FEATURE_COUNT = PANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>EModel Element</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COLUMN_RESULT__EMODEL_ELEMENT = PANNOTATION__EMODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_RESULT__NAME = PANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the the '<em>Column Result</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_RESULT_FEATURE_COUNT = PANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>EModel Element</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DISCRIMINATOR_COLUMN__EMODEL_ELEMENT = PANNOTATION__EMODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRIMINATOR_COLUMN__NAME = PANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Discriminator Type</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRIMINATOR_COLUMN__DISCRIMINATOR_TYPE = PANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Column Definition</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRIMINATOR_COLUMN__COLUMN_DEFINITION = PANNOTATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRIMINATOR_COLUMN__LENGTH = PANNOTATION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the the '<em>Discriminator Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRIMINATOR_COLUMN_FEATURE_COUNT = PANNOTATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>EModel Element</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DISCRIMINATOR_VALUE__EMODEL_ELEMENT = PANNOTATION__EMODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRIMINATOR_VALUE__VALUE = PANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the the '<em>Discriminator Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRIMINATOR_VALUE_FEATURE_COUNT = PANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>EModel Element</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EMBEDDABLE__EMODEL_ELEMENT = PANNOTATION__EMODEL_ELEMENT;

	/**
	 * The number of structural features of the the '<em>Embeddable</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBEDDABLE_FEATURE_COUNT = PANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>EModel Element</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EMBEDDED__EMODEL_ELEMENT = PANNOTATION__EMODEL_ELEMENT;

	/**
	 * The number of structural features of the the '<em>Embedded</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBEDDED_FEATURE_COUNT = PANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>EModel Element</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EMBEDDED_ID__EMODEL_ELEMENT = PANNOTATION__EMODEL_ELEMENT;

	/**
	 * The number of structural features of the the '<em>Embedded Id</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBEDDED_ID_FEATURE_COUNT = PANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>EModel Element</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENTITY__EMODEL_ELEMENT = PANNOTATION__EMODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__NAME = PANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the the '<em>Entity</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_FEATURE_COUNT = PANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>EModel Element</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENTITY_LISTENER__EMODEL_ELEMENT = PANNOTATION__EMODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_LISTENER__VALUE = PANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the the '<em>Entity Listener</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_LISTENER_FEATURE_COUNT = PANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>EModel Element</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENTITY_RESULT__EMODEL_ELEMENT = PANNOTATION__EMODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Entity Class</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENTITY_RESULT__ENTITY_CLASS = PANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_RESULT__FIELDS = PANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Discriminator Column</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_RESULT__DISCRIMINATOR_COLUMN = PANNOTATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the the '<em>Entity Result</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_RESULT_FEATURE_COUNT = PANNOTATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>EModel Element</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENUMERATED__EMODEL_ELEMENT = PANNOTATION__EMODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATED__VALUE = PANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the the '<em>Enumerated</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATED_FEATURE_COUNT = PANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>EModel Element</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EXCLUDE_DEFAULT_LISTENERS__EMODEL_ELEMENT = PANNOTATION__EMODEL_ELEMENT;

	/**
	 * The number of structural features of the the '<em>Exclude Default Listeners</em>' class.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUDE_DEFAULT_LISTENERS_FEATURE_COUNT = PANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>EModel Element</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EXCLUDE_SUPERCLASS_LISTENERS__EMODEL_ELEMENT = PANNOTATION__EMODEL_ELEMENT;

	/**
	 * The number of structural features of the the '<em>Exclude Superclass Listeners</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EXCLUDE_SUPERCLASS_LISTENERS_FEATURE_COUNT = PANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>EModel Element</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FIELD_RESULT__EMODEL_ELEMENT = PANNOTATION__EMODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_RESULT__NAME = PANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_RESULT__COLUMN = PANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the the '<em>Field Result</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_RESULT_FEATURE_COUNT = PANNOTATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>EModel Element</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FLUSH_MODE__EMODEL_ELEMENT = PANNOTATION__EMODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLUSH_MODE__VALUE = PANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the the '<em>Flush Mode</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLUSH_MODE_FEATURE_COUNT = PANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>EModel Element</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GENERATED_VALUE__EMODEL_ELEMENT = PANNOTATION__EMODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Strategy</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATED_VALUE__STRATEGY = PANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Generator</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATED_VALUE__GENERATOR = PANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the the '<em>Generated Value</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATED_VALUE_FEATURE_COUNT = PANNOTATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>EModel Element</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ID__EMODEL_ELEMENT = PANNOTATION__EMODEL_ELEMENT;

	/**
	 * The number of structural features of the the '<em>Id</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ID_FEATURE_COUNT = PANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>EModel Element</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ID_BAG__EMODEL_ELEMENT = PANNOTATION__EMODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Generator</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BAG__GENERATOR = PANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BAG__TYPE = PANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the the '<em>Id Bag</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BAG_FEATURE_COUNT = PANNOTATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>EModel Element</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ID_CLASS__EMODEL_ELEMENT = PANNOTATION__EMODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_CLASS__VALUE = PANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the the '<em>Id Class</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_CLASS_FEATURE_COUNT = PANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>EModel Element</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INHERITANCE__EMODEL_ELEMENT = PANNOTATION__EMODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Strategy</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITANCE__STRATEGY = PANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the the '<em>Inheritance</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITANCE_FEATURE_COUNT = PANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>EModel Element</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int JOIN_COLUMN__EMODEL_ELEMENT = PANNOTATION__EMODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_COLUMN__NAME = PANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Referenced Column Name</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_COLUMN__REFERENCED_COLUMN_NAME = PANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_COLUMN__UNIQUE = PANNOTATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Nullable</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_COLUMN__NULLABLE = PANNOTATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Insertable</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_COLUMN__INSERTABLE = PANNOTATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Updatable</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_COLUMN__UPDATABLE = PANNOTATION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Column Definition</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_COLUMN__COLUMN_DEFINITION = PANNOTATION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Table</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_COLUMN__TABLE = PANNOTATION_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the the '<em>Join Column</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_COLUMN_FEATURE_COUNT = PANNOTATION_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>EModel Element</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int JOIN_COLUMNS__EMODEL_ELEMENT = PANNOTATION__EMODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_COLUMNS__VALUE = PANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the the '<em>Join Columns</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_COLUMNS_FEATURE_COUNT = PANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>EModel Element</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int JOIN_TABLE__EMODEL_ELEMENT = PANNOTATION__EMODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_TABLE__NAME = PANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Catalog</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_TABLE__CATALOG = PANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_TABLE__SCHEMA = PANNOTATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Join Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_TABLE__JOIN_COLUMNS = PANNOTATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Inverse Join Columns</b></em>' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int JOIN_TABLE__INVERSE_JOIN_COLUMNS = PANNOTATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Unique Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_TABLE__UNIQUE_CONSTRAINTS = PANNOTATION_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the the '<em>Join Table</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_TABLE_FEATURE_COUNT = PANNOTATION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>EModel Element</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LOB__EMODEL_ELEMENT = PANNOTATION__EMODEL_ELEMENT;

	/**
	 * The number of structural features of the the '<em>Lob</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LOB_FEATURE_COUNT = PANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>EModel Element</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MANY_TO_MANY__EMODEL_ELEMENT = PANNOTATION__EMODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Target Entity</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MANY_TO_MANY__TARGET_ENTITY = PANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cascade</b></em>' attribute list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MANY_TO_MANY__CASCADE = PANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Fetch</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_MANY__FETCH = PANNOTATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Mapped By</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_MANY__MAPPED_BY = PANNOTATION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the the '<em>Many To Many</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_MANY_FEATURE_COUNT = PANNOTATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>EModel Element</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MANY_TO_ONE__EMODEL_ELEMENT = PANNOTATION__EMODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Target Entity</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MANY_TO_ONE__TARGET_ENTITY = PANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cascade</b></em>' attribute list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MANY_TO_ONE__CASCADE = PANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Fetch</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_ONE__FETCH = PANNOTATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_ONE__OPTIONAL = PANNOTATION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the the '<em>Many To One</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_ONE_FEATURE_COUNT = PANNOTATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>EModel Element</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MAP_KEY__EMODEL_ELEMENT = PANNOTATION__EMODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_KEY__NAME = PANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the the '<em>Map Key</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_KEY_FEATURE_COUNT = PANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>EModel Element</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MAPPED_SUPERCLASS__EMODEL_ELEMENT = PANNOTATION__EMODEL_ELEMENT;

	/**
	 * The number of structural features of the the '<em>Mapped Superclass</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPED_SUPERCLASS_FEATURE_COUNT = PANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>EModel Element</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAMED_NATIVE_QUERIES__EMODEL_ELEMENT = PANNOTATION__EMODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_NATIVE_QUERIES__VALUE = PANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the the '<em>Named Native Queries</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_NATIVE_QUERIES_FEATURE_COUNT = PANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>EModel Element</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAMED_NATIVE_QUERY__EMODEL_ELEMENT = PANNOTATION__EMODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_NATIVE_QUERY__NAME = PANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Query</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_NATIVE_QUERY__QUERY = PANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Hints</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_NATIVE_QUERY__HINTS = PANNOTATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Result Class</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAMED_NATIVE_QUERY__RESULT_CLASS = PANNOTATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Result Set Mapping</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_NATIVE_QUERY__RESULT_SET_MAPPING = PANNOTATION_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the the '<em>Named Native Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_NATIVE_QUERY_FEATURE_COUNT = PANNOTATION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>EModel Element</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAMED_QUERIES__EMODEL_ELEMENT = PANNOTATION__EMODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_QUERIES__VALUE = PANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the the '<em>Named Queries</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_QUERIES_FEATURE_COUNT = PANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>EModel Element</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAMED_QUERY__EMODEL_ELEMENT = PANNOTATION__EMODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_QUERY__NAME = PANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Query</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_QUERY__QUERY = PANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Hints</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_QUERY__HINTS = PANNOTATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the the '<em>Named Query</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_QUERY_FEATURE_COUNT = PANNOTATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>EModel Element</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ONE_TO_MANY__EMODEL_ELEMENT = PANNOTATION__EMODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Target Entity</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ONE_TO_MANY__TARGET_ENTITY = PANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cascade</b></em>' attribute list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ONE_TO_MANY__CASCADE = PANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Fetch</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_MANY__FETCH = PANNOTATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Mapped By</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_MANY__MAPPED_BY = PANNOTATION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the the '<em>One To Many</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_MANY_FEATURE_COUNT = PANNOTATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>EModel Element</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ONE_TO_ONE__EMODEL_ELEMENT = PANNOTATION__EMODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Target Entity</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ONE_TO_ONE__TARGET_ENTITY = PANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cascade</b></em>' attribute list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ONE_TO_ONE__CASCADE = PANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Fetch</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_ONE__FETCH = PANNOTATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_ONE__OPTIONAL = PANNOTATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Mapped By</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_ONE__MAPPED_BY = PANNOTATION_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the the '<em>One To One</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_ONE_FEATURE_COUNT = PANNOTATION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>EModel Element</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ORDER_BY__EMODEL_ELEMENT = PANNOTATION__EMODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_BY__VALUE = PANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the the '<em>Order By</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_BY_FEATURE_COUNT = PANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.annotations.pannotation.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.annotations.pannotation.impl.ParameterImpl
	 * @see org.eclipse.emf.teneo.annotations.pannotation.impl.PannotationPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 42;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__VALUE = 1;

	/**
	 * The number of structural features of the the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = 2;

	/**
	 * The feature id for the '<em><b>EModel Element</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_CONTEXT__EMODEL_ELEMENT = PANNOTATION__EMODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_CONTEXT__NAME = PANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Unit Name</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_CONTEXT__UNIT_NAME = PANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_CONTEXT__TYPE = PANNOTATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the the '<em>Persistence Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_CONTEXT_FEATURE_COUNT = PANNOTATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>EModel Element</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_CONTEXTS__EMODEL_ELEMENT = PANNOTATION__EMODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_CONTEXTS__VALUE = PANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the the '<em>Persistence Contexts</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_CONTEXTS_FEATURE_COUNT = PANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>EModel Element</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_UNIT__EMODEL_ELEMENT = PANNOTATION__EMODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_UNIT__NAME = PANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Unit Name</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_UNIT__UNIT_NAME = PANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the the '<em>Persistence Unit</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_UNIT_FEATURE_COUNT = PANNOTATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>EModel Element</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_UNITS__EMODEL_ELEMENT = PANNOTATION__EMODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_UNITS__VALUE = PANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the the '<em>Persistence Units</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_UNITS_FEATURE_COUNT = PANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>EModel Element</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int POST_LOAD__EMODEL_ELEMENT = PANNOTATION__EMODEL_ELEMENT;

	/**
	 * The number of structural features of the the '<em>Post Load</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_LOAD_FEATURE_COUNT = PANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>EModel Element</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int POST_PERSIST__EMODEL_ELEMENT = PANNOTATION__EMODEL_ELEMENT;

	/**
	 * The number of structural features of the the '<em>Post Persist</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_PERSIST_FEATURE_COUNT = PANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>EModel Element</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int POST_REMOVE__EMODEL_ELEMENT = PANNOTATION__EMODEL_ELEMENT;

	/**
	 * The number of structural features of the the '<em>Post Remove</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_REMOVE_FEATURE_COUNT = PANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>EModel Element</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int POST_UPDATE__EMODEL_ELEMENT = PANNOTATION__EMODEL_ELEMENT;

	/**
	 * The number of structural features of the the '<em>Post Update</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_UPDATE_FEATURE_COUNT = PANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>EModel Element</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PRE_PERSIST__EMODEL_ELEMENT = PANNOTATION__EMODEL_ELEMENT;

	/**
	 * The number of structural features of the the '<em>Pre Persist</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_PERSIST_FEATURE_COUNT = PANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>EModel Element</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PRE_REMOVE__EMODEL_ELEMENT = PANNOTATION__EMODEL_ELEMENT;

	/**
	 * The number of structural features of the the '<em>Pre Remove</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_REMOVE_FEATURE_COUNT = PANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>EModel Element</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PRE_UPDATE__EMODEL_ELEMENT = PANNOTATION__EMODEL_ELEMENT;

	/**
	 * The number of structural features of the the '<em>Pre Update</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_UPDATE_FEATURE_COUNT = PANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>EModel Element</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PRIMARY_KEY_JOIN_COLUMN__EMODEL_ELEMENT = PANNOTATION__EMODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_KEY_JOIN_COLUMN__NAME = PANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Referenced Column Name</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_KEY_JOIN_COLUMN__REFERENCED_COLUMN_NAME = PANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Column Definition</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_KEY_JOIN_COLUMN__COLUMN_DEFINITION = PANNOTATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the the '<em>Primary Key Join Column</em>' class.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_KEY_JOIN_COLUMN_FEATURE_COUNT = PANNOTATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>EModel Element</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PRIMARY_KEY_JOIN_COLUMNS__EMODEL_ELEMENT = PANNOTATION__EMODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_KEY_JOIN_COLUMNS__VALUE = PANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the the '<em>Primary Key Join Columns</em>' class.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_KEY_JOIN_COLUMNS_FEATURE_COUNT = PANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>EModel Element</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUERY_HINT__EMODEL_ELEMENT = PANNOTATION__EMODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_HINT__NAME = PANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_HINT__VALUE = PANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the the '<em>Query Hint</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_HINT_FEATURE_COUNT = PANNOTATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>EModel Element</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SECONDARY_TABLE__EMODEL_ELEMENT = PANNOTATION__EMODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECONDARY_TABLE__NAME = PANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Catalog</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECONDARY_TABLE__CATALOG = PANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECONDARY_TABLE__SCHEMA = PANNOTATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Pk Join Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECONDARY_TABLE__PK_JOIN_COLUMNS = PANNOTATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Unique Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECONDARY_TABLE__UNIQUE_CONSTRAINTS = PANNOTATION_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the the '<em>Secondary Table</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECONDARY_TABLE_FEATURE_COUNT = PANNOTATION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>EModel Element</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SECONDARY_TABLES__EMODEL_ELEMENT = PANNOTATION__EMODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECONDARY_TABLES__VALUE = PANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the the '<em>Secondary Tables</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECONDARY_TABLES_FEATURE_COUNT = PANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>EModel Element</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_GENERATOR__EMODEL_ELEMENT = PANNOTATION__EMODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_GENERATOR__NAME = PANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sequence Name</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_GENERATOR__SEQUENCE_NAME = PANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Initial Value</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_GENERATOR__INITIAL_VALUE = PANNOTATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Allocation Size</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_GENERATOR__ALLOCATION_SIZE = PANNOTATION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the the '<em>Sequence Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_GENERATOR_FEATURE_COUNT = PANNOTATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>EModel Element</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SQL_RESULT_SET_MAPPING__EMODEL_ELEMENT = PANNOTATION__EMODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_RESULT_SET_MAPPING__NAME = PANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Entities</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_RESULT_SET_MAPPING__ENTITIES = PANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_RESULT_SET_MAPPING__COLUMNS = PANNOTATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the the '<em>Sql Result Set Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_RESULT_SET_MAPPING_FEATURE_COUNT = PANNOTATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>EModel Element</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TABLE__EMODEL_ELEMENT = PANNOTATION__EMODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__NAME = PANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Catalog</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__CATALOG = PANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__SCHEMA = PANNOTATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Unique Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__UNIQUE_CONSTRAINTS = PANNOTATION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the the '<em>Table</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_FEATURE_COUNT = PANNOTATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>EModel Element</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TABLE_GENERATOR__EMODEL_ELEMENT = PANNOTATION__EMODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_GENERATOR__NAME = PANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Table</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_GENERATOR__TABLE = PANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Catalog</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_GENERATOR__CATALOG = PANNOTATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_GENERATOR__SCHEMA = PANNOTATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Pk Column Name</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TABLE_GENERATOR__PK_COLUMN_NAME = PANNOTATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Value Column Name</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_GENERATOR__VALUE_COLUMN_NAME = PANNOTATION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Pk Column Value</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_GENERATOR__PK_COLUMN_VALUE = PANNOTATION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Initial Value</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TABLE_GENERATOR__INITIAL_VALUE = PANNOTATION_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Allocation Size</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_GENERATOR__ALLOCATION_SIZE = PANNOTATION_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Unique Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_GENERATOR__UNIQUE_CONSTRAINTS = PANNOTATION_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the the '<em>Table Generator</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_GENERATOR_FEATURE_COUNT = PANNOTATION_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>EModel Element</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TEMPORAL__EMODEL_ELEMENT = PANNOTATION__EMODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL__VALUE = PANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the the '<em>Temporal</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_FEATURE_COUNT = PANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.annotations.pannotation.impl.TypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.annotations.pannotation.impl.TypeImpl
	 * @see org.eclipse.emf.teneo.annotations.pannotation.impl.PannotationPackageImpl#getType()
	 * @generated
	 */
	int TYPE = 64;

	/**
	 * The feature id for the '<em><b>EModel Element</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TYPE__EMODEL_ELEMENT = PANNOTATION__EMODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__TYPE = PANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' reference list.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__PARAMETERS = PANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the the '<em>Type</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TYPE_FEATURE_COUNT = PANNOTATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>EModel Element</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TRANSIENT__EMODEL_ELEMENT = PANNOTATION__EMODEL_ELEMENT;

	/**
	 * The number of structural features of the the '<em>Transient</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSIENT_FEATURE_COUNT = PANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>EModel Element</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UNIQUE_CONSTRAINT__EMODEL_ELEMENT = PANNOTATION__EMODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Column Names</b></em>' attribute list.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUE_CONSTRAINT__COLUMN_NAMES = PANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the the '<em>Unique Constraint</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUE_CONSTRAINT_FEATURE_COUNT = PANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>EModel Element</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VERSION__EMODEL_ELEMENT = PANNOTATION__EMODEL_ELEMENT;

	/**
	 * The number of structural features of the the '<em>Version</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_FEATURE_COUNT = PANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>EModel Element</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INDEXED__EMODEL_ELEMENT = PANNOTATION__EMODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEXED__VALUE = PANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the the '<em>Indexed</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEXED_FEATURE_COUNT = PANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>EModel Element</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UNIQUE__EMODEL_ELEMENT = PANNOTATION__EMODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUE__VALUE = PANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the the '<em>Unique</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUE_FEATURE_COUNT = PANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.annotations.pannotation.FetchType <em>Fetch Type</em>}' enum.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.annotations.pannotation.FetchType
	 * @see org.eclipse.emf.teneo.annotations.pannotation.impl.PannotationPackageImpl#getFetchType()
	 * @generated
	 */
	int FETCH_TYPE = 73;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.annotations.pannotation.DiscriminatorType <em>Discriminator Type</em>}' enum.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.annotations.pannotation.DiscriminatorType
	 * @see org.eclipse.emf.teneo.annotations.pannotation.impl.PannotationPackageImpl#getDiscriminatorType()
	 * @generated
	 */
	int DISCRIMINATOR_TYPE = 71;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.annotations.pannotation.EnumType <em>Enum Type</em>}' enum.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.annotations.pannotation.EnumType
	 * @see org.eclipse.emf.teneo.annotations.pannotation.impl.PannotationPackageImpl#getEnumType()
	 * @generated
	 */
	int ENUM_TYPE = 72;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.annotations.pannotation.InheritanceType <em>Inheritance Type</em>}' enum.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.annotations.pannotation.InheritanceType
	 * @see org.eclipse.emf.teneo.annotations.pannotation.impl.PannotationPackageImpl#getInheritanceType()
	 * @generated
	 */
	int INHERITANCE_TYPE = 76;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.annotations.pannotation.CascadeType <em>Cascade Type</em>}' enum.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.annotations.pannotation.CascadeType
	 * @see org.eclipse.emf.teneo.annotations.pannotation.impl.PannotationPackageImpl#getCascadeType()
	 * @generated
	 */
	int CASCADE_TYPE = 70;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.annotations.pannotation.PersistenceContextType <em>Persistence Context Type</em>}' enum.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.annotations.pannotation.PersistenceContextType
	 * @see org.eclipse.emf.teneo.annotations.pannotation.impl.PannotationPackageImpl#getPersistenceContextType()
	 * @generated
	 */
	int PERSISTENCE_CONTEXT_TYPE = 77;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.annotations.pannotation.TemporalType <em>Temporal Type</em>}' enum.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.annotations.pannotation.TemporalType
	 * @see org.eclipse.emf.teneo.annotations.pannotation.impl.PannotationPackageImpl#getTemporalType()
	 * @generated
	 */
	int TEMPORAL_TYPE = 78;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.annotations.pannotation.FlushModeType <em>Flush Mode Type</em>}' enum.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.annotations.pannotation.FlushModeType
	 * @see org.eclipse.emf.teneo.annotations.pannotation.impl.PannotationPackageImpl#getFlushModeType()
	 * @generated
	 */
	int FLUSH_MODE_TYPE = 74;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.annotations.pannotation.GenerationType <em>Generation Type</em>}' enum.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.annotations.pannotation.GenerationType
	 * @see org.eclipse.emf.teneo.annotations.pannotation.impl.PannotationPackageImpl#getGenerationType()
	 * @generated
	 */
	int GENERATION_TYPE = 75;

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.annotations.pannotation.PAnnotation <em>PAnnotation</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>PAnnotation</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.PAnnotation
	 * @generated
	 */
	EClass getPAnnotation();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.teneo.annotations.pannotation.PAnnotation#getEModelElement <em>EModel Element</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EModel Element</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.PAnnotation#getEModelElement()
	 * @see #getPAnnotation()
	 * @generated
	 */
	EReference getPAnnotation_EModelElement();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.annotations.pannotation.AttributeOverride <em>Attribute Override</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Override</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.AttributeOverride
	 * @generated
	 */
	EClass getAttributeOverride();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.annotations.pannotation.AttributeOverride#getName <em>Name</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.AttributeOverride#getName()
	 * @see #getAttributeOverride()
	 * @generated
	 */
	EAttribute getAttributeOverride_Name();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.annotations.pannotation.AttributeOverride#getColumn <em>Column</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Column</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.AttributeOverride#getColumn()
	 * @see #getAttributeOverride()
	 * @generated
	 */
	EReference getAttributeOverride_Column();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.annotations.pannotation.AttributeOverrides <em>Attribute Overrides</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Overrides</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.AttributeOverrides
	 * @generated
	 */
	EClass getAttributeOverrides();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.annotations.pannotation.AttributeOverrides#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Value</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.AttributeOverrides#getValue()
	 * @see #getAttributeOverrides()
	 * @generated
	 */
	EReference getAttributeOverrides_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.annotations.pannotation.Basic <em>Basic</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Basic</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.Basic
	 * @generated
	 */
	EClass getBasic();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.annotations.pannotation.Basic#getFetch <em>Fetch</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fetch</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.Basic#getFetch()
	 * @see #getBasic()
	 * @generated
	 */
	EAttribute getBasic_Fetch();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.annotations.pannotation.Basic#isOptional <em>Optional</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Optional</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.Basic#isOptional()
	 * @see #getBasic()
	 * @generated
	 */
	EAttribute getBasic_Optional();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.annotations.pannotation.Column <em>Column</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Column</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.Column
	 * @generated
	 */
	EClass getColumn();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.annotations.pannotation.Column#getName <em>Name</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.Column#getName()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.annotations.pannotation.Column#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.Column#getLength()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_Length();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.annotations.pannotation.Column#getScale <em>Scale</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scale</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.Column#getScale()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_Scale();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.annotations.pannotation.Column#isUnique <em>Unique</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unique</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.Column#isUnique()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_Unique();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.annotations.pannotation.Column#getPrecision <em>Precision</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Precision</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.Column#getPrecision()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_Precision();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.annotations.pannotation.Column#isNullable <em>Nullable</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nullable</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.Column#isNullable()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_Nullable();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.annotations.pannotation.Column#isInsertable <em>Insertable</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Insertable</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.Column#isInsertable()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_Insertable();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.annotations.pannotation.Column#isUpdatable <em>Updatable</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Updatable</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.Column#isUpdatable()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_Updatable();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.annotations.pannotation.Column#getColumnDefinition <em>Column Definition</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column Definition</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.Column#getColumnDefinition()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_ColumnDefinition();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.annotations.pannotation.Column#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Table</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.Column#getTable()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_Table();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.annotations.pannotation.ColumnResult <em>Column Result</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Column Result</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.ColumnResult
	 * @generated
	 */
	EClass getColumnResult();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.annotations.pannotation.ColumnResult#getName <em>Name</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.ColumnResult#getName()
	 * @see #getColumnResult()
	 * @generated
	 */
	EAttribute getColumnResult_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.annotations.pannotation.DiscriminatorColumn <em>Discriminator Column</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Discriminator Column</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.DiscriminatorColumn
	 * @generated
	 */
	EClass getDiscriminatorColumn();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.annotations.pannotation.DiscriminatorColumn#getName <em>Name</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.DiscriminatorColumn#getName()
	 * @see #getDiscriminatorColumn()
	 * @generated
	 */
	EAttribute getDiscriminatorColumn_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.annotations.pannotation.DiscriminatorColumn#getDiscriminatorType <em>Discriminator Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Discriminator Type</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.DiscriminatorColumn#getDiscriminatorType()
	 * @see #getDiscriminatorColumn()
	 * @generated
	 */
	EAttribute getDiscriminatorColumn_DiscriminatorType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.annotations.pannotation.DiscriminatorColumn#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.DiscriminatorColumn#getLength()
	 * @see #getDiscriminatorColumn()
	 * @generated
	 */
	EAttribute getDiscriminatorColumn_Length();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.annotations.pannotation.DiscriminatorValue <em>Discriminator Value</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Discriminator Value</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.DiscriminatorValue
	 * @generated
	 */
	EClass getDiscriminatorValue();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.annotations.pannotation.DiscriminatorValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.DiscriminatorValue#getValue()
	 * @see #getDiscriminatorValue()
	 * @generated
	 */
	EAttribute getDiscriminatorValue_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.annotations.pannotation.DiscriminatorColumn#getColumnDefinition <em>Column Definition</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column Definition</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.DiscriminatorColumn#getColumnDefinition()
	 * @see #getDiscriminatorColumn()
	 * @generated
	 */
	EAttribute getDiscriminatorColumn_ColumnDefinition();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.annotations.pannotation.Embeddable <em>Embeddable</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Embeddable</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.Embeddable
	 * @generated
	 */
	EClass getEmbeddable();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.annotations.pannotation.MappedSuperclass <em>Mapped Superclass</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mapped Superclass</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.MappedSuperclass
	 * @generated
	 */
	EClass getMappedSuperclass();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.annotations.pannotation.Embedded <em>Embedded</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Embedded</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.Embedded
	 * @generated
	 */
	EClass getEmbedded();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.annotations.pannotation.EmbeddedId <em>Embedded Id</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Embedded Id</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.EmbeddedId
	 * @generated
	 */
	EClass getEmbeddedId();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.annotations.pannotation.Enumerated <em>Enumerated</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumerated</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.Enumerated
	 * @generated
	 */
	EClass getEnumerated();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.annotations.pannotation.Enumerated#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.Enumerated#getValue()
	 * @see #getEnumerated()
	 * @generated
	 */
	EAttribute getEnumerated_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.annotations.pannotation.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.Entity
	 * @generated
	 */
	EClass getEntity();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.annotations.pannotation.Entity#getName <em>Name</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.Entity#getName()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.annotations.pannotation.EntityListener <em>Entity Listener</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity Listener</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.EntityListener
	 * @generated
	 */
	EClass getEntityListener();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.annotations.pannotation.EntityListener#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.EntityListener#getValue()
	 * @see #getEntityListener()
	 * @generated
	 */
	EAttribute getEntityListener_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.annotations.pannotation.EntityResult <em>Entity Result</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity Result</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.EntityResult
	 * @generated
	 */
	EClass getEntityResult();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.annotations.pannotation.EntityResult#getEntityClass <em>Entity Class</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Entity Class</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.EntityResult#getEntityClass()
	 * @see #getEntityResult()
	 * @generated
	 */
	EAttribute getEntityResult_EntityClass();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.annotations.pannotation.EntityResult#getFields <em>Fields</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fields</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.EntityResult#getFields()
	 * @see #getEntityResult()
	 * @generated
	 */
	EReference getEntityResult_Fields();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.annotations.pannotation.EntityResult#getDiscriminatorColumn <em>Discriminator Column</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Discriminator Column</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.EntityResult#getDiscriminatorColumn()
	 * @see #getEntityResult()
	 * @generated
	 */
	EAttribute getEntityResult_DiscriminatorColumn();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.annotations.pannotation.ExcludeDefaultListeners <em>Exclude Default Listeners</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exclude Default Listeners</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.ExcludeDefaultListeners
	 * @generated
	 */
	EClass getExcludeDefaultListeners();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.annotations.pannotation.ExcludeSuperclassListeners <em>Exclude Superclass Listeners</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exclude Superclass Listeners</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.ExcludeSuperclassListeners
	 * @generated
	 */
	EClass getExcludeSuperclassListeners();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.annotations.pannotation.FieldResult <em>Field Result</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field Result</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.FieldResult
	 * @generated
	 */
	EClass getFieldResult();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.annotations.pannotation.FieldResult#getName <em>Name</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.FieldResult#getName()
	 * @see #getFieldResult()
	 * @generated
	 */
	EAttribute getFieldResult_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.annotations.pannotation.FieldResult#getColumn <em>Column</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.FieldResult#getColumn()
	 * @see #getFieldResult()
	 * @generated
	 */
	EAttribute getFieldResult_Column();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.annotations.pannotation.FlushMode <em>Flush Mode</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flush Mode</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.FlushMode
	 * @generated
	 */
	EClass getFlushMode();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.annotations.pannotation.FlushMode#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.FlushMode#getValue()
	 * @see #getFlushMode()
	 * @generated
	 */
	EAttribute getFlushMode_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.annotations.pannotation.GeneratedValue <em>Generated Value</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generated Value</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.GeneratedValue
	 * @generated
	 */
	EClass getGeneratedValue();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.annotations.pannotation.GeneratedValue#getStrategy <em>Strategy</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Strategy</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.GeneratedValue#getStrategy()
	 * @see #getGeneratedValue()
	 * @generated
	 */
	EAttribute getGeneratedValue_Strategy();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.annotations.pannotation.GeneratedValue#getGenerator <em>Generator</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generator</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.GeneratedValue#getGenerator()
	 * @see #getGeneratedValue()
	 * @generated
	 */
	EAttribute getGeneratedValue_Generator();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.annotations.pannotation.Id <em>Id</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Id</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.Id
	 * @generated
	 */
	EClass getId();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.annotations.pannotation.IdClass <em>Id Class</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Id Class</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.IdClass
	 * @generated
	 */
	EClass getIdClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.annotations.pannotation.IdClass#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.IdClass#getValue()
	 * @see #getIdClass()
	 * @generated
	 */
	EAttribute getIdClass_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.annotations.pannotation.Inheritance <em>Inheritance</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inheritance</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.Inheritance
	 * @generated
	 */
	EClass getInheritance();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.annotations.pannotation.Inheritance#getStrategy <em>Strategy</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Strategy</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.Inheritance#getStrategy()
	 * @see #getInheritance()
	 * @generated
	 */
	EAttribute getInheritance_Strategy();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.annotations.pannotation.JoinColumn <em>Join Column</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Join Column</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.JoinColumn
	 * @generated
	 */
	EClass getJoinColumn();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.annotations.pannotation.JoinColumn#getName <em>Name</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.JoinColumn#getName()
	 * @see #getJoinColumn()
	 * @generated
	 */
	EAttribute getJoinColumn_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.annotations.pannotation.JoinColumn#isUnique <em>Unique</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unique</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.JoinColumn#isUnique()
	 * @see #getJoinColumn()
	 * @generated
	 */
	EAttribute getJoinColumn_Unique();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.annotations.pannotation.JoinColumn#isNullable <em>Nullable</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nullable</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.JoinColumn#isNullable()
	 * @see #getJoinColumn()
	 * @generated
	 */
	EAttribute getJoinColumn_Nullable();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.annotations.pannotation.JoinColumn#isInsertable <em>Insertable</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Insertable</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.JoinColumn#isInsertable()
	 * @see #getJoinColumn()
	 * @generated
	 */
	EAttribute getJoinColumn_Insertable();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.annotations.pannotation.JoinColumn#isUpdatable <em>Updatable</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Updatable</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.JoinColumn#isUpdatable()
	 * @see #getJoinColumn()
	 * @generated
	 */
	EAttribute getJoinColumn_Updatable();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.annotations.pannotation.JoinColumn#getColumnDefinition <em>Column Definition</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column Definition</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.JoinColumn#getColumnDefinition()
	 * @see #getJoinColumn()
	 * @generated
	 */
	EAttribute getJoinColumn_ColumnDefinition();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.annotations.pannotation.JoinColumn#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Table</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.JoinColumn#getTable()
	 * @see #getJoinColumn()
	 * @generated
	 */
	EAttribute getJoinColumn_Table();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.annotations.pannotation.JoinColumn#getReferencedColumnName <em>Referenced Column Name</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Referenced Column Name</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.JoinColumn#getReferencedColumnName()
	 * @see #getJoinColumn()
	 * @generated
	 */
	EAttribute getJoinColumn_ReferencedColumnName();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.annotations.pannotation.JoinColumns <em>Join Columns</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Join Columns</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.JoinColumns
	 * @generated
	 */
	EClass getJoinColumns();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.annotations.pannotation.JoinColumns#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Value</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.JoinColumns#getValue()
	 * @see #getJoinColumns()
	 * @generated
	 */
	EReference getJoinColumns_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.annotations.pannotation.JoinTable <em>Join Table</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Join Table</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.JoinTable
	 * @generated
	 */
	EClass getJoinTable();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.annotations.pannotation.JoinTable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.JoinTable#getName()
	 * @see #getJoinTable()
	 * @generated
	 */
	EAttribute getJoinTable_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.annotations.pannotation.JoinTable#getCatalog <em>Catalog</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Catalog</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.JoinTable#getCatalog()
	 * @see #getJoinTable()
	 * @generated
	 */
	EAttribute getJoinTable_Catalog();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.annotations.pannotation.JoinTable#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schema</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.JoinTable#getSchema()
	 * @see #getJoinTable()
	 * @generated
	 */
	EAttribute getJoinTable_Schema();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.annotations.pannotation.JoinTable#getJoinColumns <em>Join Columns</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Join Columns</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.JoinTable#getJoinColumns()
	 * @see #getJoinTable()
	 * @generated
	 */
	EReference getJoinTable_JoinColumns();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.annotations.pannotation.JoinTable#getInverseJoinColumns <em>Inverse Join Columns</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inverse Join Columns</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.JoinTable#getInverseJoinColumns()
	 * @see #getJoinTable()
	 * @generated
	 */
	EReference getJoinTable_InverseJoinColumns();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.annotations.pannotation.JoinTable#getUniqueConstraints <em>Unique Constraints</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Unique Constraints</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.JoinTable#getUniqueConstraints()
	 * @see #getJoinTable()
	 * @generated
	 */
	EReference getJoinTable_UniqueConstraints();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.annotations.pannotation.Lob <em>Lob</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lob</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.Lob
	 * @generated
	 */
	EClass getLob();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.annotations.pannotation.ManyToMany <em>Many To Many</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Many To Many</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.ManyToMany
	 * @generated
	 */
	EClass getManyToMany();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.annotations.pannotation.ManyToMany#getFetch <em>Fetch</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fetch</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.ManyToMany#getFetch()
	 * @see #getManyToMany()
	 * @generated
	 */
	EAttribute getManyToMany_Fetch();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.annotations.pannotation.ManyToMany#getTargetEntity <em>Target Entity</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Entity</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.ManyToMany#getTargetEntity()
	 * @see #getManyToMany()
	 * @generated
	 */
	EAttribute getManyToMany_TargetEntity();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.emf.teneo.annotations.pannotation.ManyToMany#getCascade <em>Cascade</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Cascade</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.ManyToMany#getCascade()
	 * @see #getManyToMany()
	 * @generated
	 */
	EAttribute getManyToMany_Cascade();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.annotations.pannotation.ManyToMany#getMappedBy <em>Mapped By</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mapped By</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.ManyToMany#getMappedBy()
	 * @see #getManyToMany()
	 * @generated
	 */
	EAttribute getManyToMany_MappedBy();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.annotations.pannotation.ManyToOne <em>Many To One</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Many To One</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.ManyToOne
	 * @generated
	 */
	EClass getManyToOne();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.annotations.pannotation.ManyToOne#getFetch <em>Fetch</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fetch</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.ManyToOne#getFetch()
	 * @see #getManyToOne()
	 * @generated
	 */
	EAttribute getManyToOne_Fetch();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.annotations.pannotation.ManyToOne#isOptional <em>Optional</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Optional</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.ManyToOne#isOptional()
	 * @see #getManyToOne()
	 * @generated
	 */
	EAttribute getManyToOne_Optional();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.annotations.pannotation.ManyToOne#getTargetEntity <em>Target Entity</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Entity</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.ManyToOne#getTargetEntity()
	 * @see #getManyToOne()
	 * @generated
	 */
	EAttribute getManyToOne_TargetEntity();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.emf.teneo.annotations.pannotation.ManyToOne#getCascade <em>Cascade</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Cascade</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.ManyToOne#getCascade()
	 * @see #getManyToOne()
	 * @generated
	 */
	EAttribute getManyToOne_Cascade();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.annotations.pannotation.MapKey <em>Map Key</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Map Key</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.MapKey
	 * @generated
	 */
	EClass getMapKey();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.annotations.pannotation.MapKey#getName <em>Name</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.MapKey#getName()
	 * @see #getMapKey()
	 * @generated
	 */
	EAttribute getMapKey_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.annotations.pannotation.NamedNativeQueries <em>Named Native Queries</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Native Queries</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.NamedNativeQueries
	 * @generated
	 */
	EClass getNamedNativeQueries();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.annotations.pannotation.NamedNativeQueries#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Value</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.NamedNativeQueries#getValue()
	 * @see #getNamedNativeQueries()
	 * @generated
	 */
	EReference getNamedNativeQueries_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.annotations.pannotation.NamedNativeQuery <em>Named Native Query</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Native Query</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.NamedNativeQuery
	 * @generated
	 */
	EClass getNamedNativeQuery();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.annotations.pannotation.NamedNativeQuery#getName <em>Name</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.NamedNativeQuery#getName()
	 * @see #getNamedNativeQuery()
	 * @generated
	 */
	EAttribute getNamedNativeQuery_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.annotations.pannotation.NamedNativeQuery#getQuery <em>Query</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Query</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.NamedNativeQuery#getQuery()
	 * @see #getNamedNativeQuery()
	 * @generated
	 */
	EAttribute getNamedNativeQuery_Query();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.annotations.pannotation.NamedNativeQuery#getHints <em>Hints</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hints</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.NamedNativeQuery#getHints()
	 * @see #getNamedNativeQuery()
	 * @generated
	 */
	EReference getNamedNativeQuery_Hints();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.annotations.pannotation.NamedNativeQuery#getResultClass <em>Result Class</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Result Class</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.NamedNativeQuery#getResultClass()
	 * @see #getNamedNativeQuery()
	 * @generated
	 */
	EAttribute getNamedNativeQuery_ResultClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.annotations.pannotation.NamedNativeQuery#getResultSetMapping <em>Result Set Mapping</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Result Set Mapping</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.NamedNativeQuery#getResultSetMapping()
	 * @see #getNamedNativeQuery()
	 * @generated
	 */
	EAttribute getNamedNativeQuery_ResultSetMapping();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.annotations.pannotation.NamedQueries <em>Named Queries</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Queries</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.NamedQueries
	 * @generated
	 */
	EClass getNamedQueries();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.annotations.pannotation.NamedQueries#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Value</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.NamedQueries#getValue()
	 * @see #getNamedQueries()
	 * @generated
	 */
	EReference getNamedQueries_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.annotations.pannotation.NamedQuery <em>Named Query</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Query</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.NamedQuery
	 * @generated
	 */
	EClass getNamedQuery();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.annotations.pannotation.NamedQuery#getName <em>Name</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.NamedQuery#getName()
	 * @see #getNamedQuery()
	 * @generated
	 */
	EAttribute getNamedQuery_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.annotations.pannotation.NamedQuery#getQuery <em>Query</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Query</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.NamedQuery#getQuery()
	 * @see #getNamedQuery()
	 * @generated
	 */
	EAttribute getNamedQuery_Query();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.annotations.pannotation.NamedQuery#getHints <em>Hints</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hints</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.NamedQuery#getHints()
	 * @see #getNamedQuery()
	 * @generated
	 */
	EReference getNamedQuery_Hints();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.annotations.pannotation.OneToMany <em>One To Many</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>One To Many</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.OneToMany
	 * @generated
	 */
	EClass getOneToMany();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.annotations.pannotation.OneToMany#getFetch <em>Fetch</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fetch</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.OneToMany#getFetch()
	 * @see #getOneToMany()
	 * @generated
	 */
	EAttribute getOneToMany_Fetch();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.annotations.pannotation.OneToMany#getTargetEntity <em>Target Entity</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Entity</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.OneToMany#getTargetEntity()
	 * @see #getOneToMany()
	 * @generated
	 */
	EAttribute getOneToMany_TargetEntity();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.emf.teneo.annotations.pannotation.OneToMany#getCascade <em>Cascade</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Cascade</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.OneToMany#getCascade()
	 * @see #getOneToMany()
	 * @generated
	 */
	EAttribute getOneToMany_Cascade();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.annotations.pannotation.OneToMany#getMappedBy <em>Mapped By</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mapped By</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.OneToMany#getMappedBy()
	 * @see #getOneToMany()
	 * @generated
	 */
	EAttribute getOneToMany_MappedBy();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.annotations.pannotation.OneToOne <em>One To One</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>One To One</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.OneToOne
	 * @generated
	 */
	EClass getOneToOne();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.annotations.pannotation.OneToOne#getFetch <em>Fetch</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fetch</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.OneToOne#getFetch()
	 * @see #getOneToOne()
	 * @generated
	 */
	EAttribute getOneToOne_Fetch();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.annotations.pannotation.OneToOne#isOptional <em>Optional</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Optional</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.OneToOne#isOptional()
	 * @see #getOneToOne()
	 * @generated
	 */
	EAttribute getOneToOne_Optional();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.annotations.pannotation.OneToOne#getTargetEntity <em>Target Entity</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Entity</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.OneToOne#getTargetEntity()
	 * @see #getOneToOne()
	 * @generated
	 */
	EAttribute getOneToOne_TargetEntity();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.emf.teneo.annotations.pannotation.OneToOne#getCascade <em>Cascade</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Cascade</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.OneToOne#getCascade()
	 * @see #getOneToOne()
	 * @generated
	 */
	EAttribute getOneToOne_Cascade();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.annotations.pannotation.OneToOne#getMappedBy <em>Mapped By</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mapped By</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.OneToOne#getMappedBy()
	 * @see #getOneToOne()
	 * @generated
	 */
	EAttribute getOneToOne_MappedBy();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.annotations.pannotation.OrderBy <em>Order By</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Order By</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.OrderBy
	 * @generated
	 */
	EClass getOrderBy();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.annotations.pannotation.OrderBy#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.OrderBy#getValue()
	 * @see #getOrderBy()
	 * @generated
	 */
	EAttribute getOrderBy_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.annotations.pannotation.PersistenceContext <em>Persistence Context</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Persistence Context</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.PersistenceContext
	 * @generated
	 */
	EClass getPersistenceContext();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.annotations.pannotation.PersistenceContext#getName <em>Name</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.PersistenceContext#getName()
	 * @see #getPersistenceContext()
	 * @generated
	 */
	EAttribute getPersistenceContext_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.annotations.pannotation.PersistenceContext#getType <em>Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.PersistenceContext#getType()
	 * @see #getPersistenceContext()
	 * @generated
	 */
	EAttribute getPersistenceContext_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.annotations.pannotation.PersistenceContext#getUnitName <em>Unit Name</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit Name</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.PersistenceContext#getUnitName()
	 * @see #getPersistenceContext()
	 * @generated
	 */
	EAttribute getPersistenceContext_UnitName();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.annotations.pannotation.PersistenceContexts <em>Persistence Contexts</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Persistence Contexts</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.PersistenceContexts
	 * @generated
	 */
	EClass getPersistenceContexts();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.annotations.pannotation.PersistenceContexts#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Value</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.PersistenceContexts#getValue()
	 * @see #getPersistenceContexts()
	 * @generated
	 */
	EReference getPersistenceContexts_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.annotations.pannotation.PersistenceUnit <em>Persistence Unit</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Persistence Unit</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.PersistenceUnit
	 * @generated
	 */
	EClass getPersistenceUnit();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.annotations.pannotation.PersistenceUnit#getName <em>Name</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.PersistenceUnit#getName()
	 * @see #getPersistenceUnit()
	 * @generated
	 */
	EAttribute getPersistenceUnit_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.annotations.pannotation.PersistenceUnit#getUnitName <em>Unit Name</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit Name</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.PersistenceUnit#getUnitName()
	 * @see #getPersistenceUnit()
	 * @generated
	 */
	EAttribute getPersistenceUnit_UnitName();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.annotations.pannotation.PersistenceUnits <em>Persistence Units</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Persistence Units</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.PersistenceUnits
	 * @generated
	 */
	EClass getPersistenceUnits();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.annotations.pannotation.PersistenceUnits#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Value</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.PersistenceUnits#getValue()
	 * @see #getPersistenceUnits()
	 * @generated
	 */
	EReference getPersistenceUnits_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.annotations.pannotation.PostLoad <em>Post Load</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Post Load</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.PostLoad
	 * @generated
	 */
	EClass getPostLoad();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.annotations.pannotation.PostPersist <em>Post Persist</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Post Persist</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.PostPersist
	 * @generated
	 */
	EClass getPostPersist();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.annotations.pannotation.PostRemove <em>Post Remove</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Post Remove</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.PostRemove
	 * @generated
	 */
	EClass getPostRemove();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.annotations.pannotation.PostUpdate <em>Post Update</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Post Update</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.PostUpdate
	 * @generated
	 */
	EClass getPostUpdate();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.annotations.pannotation.PrePersist <em>Pre Persist</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pre Persist</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.PrePersist
	 * @generated
	 */
	EClass getPrePersist();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.annotations.pannotation.PreRemove <em>Pre Remove</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pre Remove</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.PreRemove
	 * @generated
	 */
	EClass getPreRemove();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.annotations.pannotation.PreUpdate <em>Pre Update</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pre Update</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.PreUpdate
	 * @generated
	 */
	EClass getPreUpdate();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.annotations.pannotation.PrimaryKeyJoinColumn <em>Primary Key Join Column</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primary Key Join Column</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.PrimaryKeyJoinColumn
	 * @generated
	 */
	EClass getPrimaryKeyJoinColumn();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.annotations.pannotation.PrimaryKeyJoinColumn#getName <em>Name</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.PrimaryKeyJoinColumn#getName()
	 * @see #getPrimaryKeyJoinColumn()
	 * @generated
	 */
	EAttribute getPrimaryKeyJoinColumn_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.annotations.pannotation.PrimaryKeyJoinColumn#getColumnDefinition <em>Column Definition</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column Definition</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.PrimaryKeyJoinColumn#getColumnDefinition()
	 * @see #getPrimaryKeyJoinColumn()
	 * @generated
	 */
	EAttribute getPrimaryKeyJoinColumn_ColumnDefinition();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.annotations.pannotation.PrimaryKeyJoinColumn#getReferencedColumnName <em>Referenced Column Name</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Referenced Column Name</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.PrimaryKeyJoinColumn#getReferencedColumnName()
	 * @see #getPrimaryKeyJoinColumn()
	 * @generated
	 */
	EAttribute getPrimaryKeyJoinColumn_ReferencedColumnName();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.annotations.pannotation.PrimaryKeyJoinColumns <em>Primary Key Join Columns</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primary Key Join Columns</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.PrimaryKeyJoinColumns
	 * @generated
	 */
	EClass getPrimaryKeyJoinColumns();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.annotations.pannotation.PrimaryKeyJoinColumns#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Value</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.PrimaryKeyJoinColumns#getValue()
	 * @see #getPrimaryKeyJoinColumns()
	 * @generated
	 */
	EReference getPrimaryKeyJoinColumns_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.annotations.pannotation.QueryHint <em>Query Hint</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Query Hint</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.QueryHint
	 * @generated
	 */
	EClass getQueryHint();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.annotations.pannotation.QueryHint#getName <em>Name</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.QueryHint#getName()
	 * @see #getQueryHint()
	 * @generated
	 */
	EAttribute getQueryHint_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.annotations.pannotation.QueryHint#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.QueryHint#getValue()
	 * @see #getQueryHint()
	 * @generated
	 */
	EAttribute getQueryHint_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.annotations.pannotation.SecondaryTable <em>Secondary Table</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Secondary Table</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.SecondaryTable
	 * @generated
	 */
	EClass getSecondaryTable();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.annotations.pannotation.SecondaryTable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.SecondaryTable#getName()
	 * @see #getSecondaryTable()
	 * @generated
	 */
	EAttribute getSecondaryTable_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.annotations.pannotation.SecondaryTable#getCatalog <em>Catalog</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Catalog</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.SecondaryTable#getCatalog()
	 * @see #getSecondaryTable()
	 * @generated
	 */
	EAttribute getSecondaryTable_Catalog();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.annotations.pannotation.SecondaryTable#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schema</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.SecondaryTable#getSchema()
	 * @see #getSecondaryTable()
	 * @generated
	 */
	EAttribute getSecondaryTable_Schema();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.annotations.pannotation.SecondaryTable#getPkJoinColumns <em>Pk Join Columns</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pk Join Columns</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.SecondaryTable#getPkJoinColumns()
	 * @see #getSecondaryTable()
	 * @generated
	 */
	EReference getSecondaryTable_PkJoinColumns();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.annotations.pannotation.SecondaryTable#getUniqueConstraints <em>Unique Constraints</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Unique Constraints</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.SecondaryTable#getUniqueConstraints()
	 * @see #getSecondaryTable()
	 * @generated
	 */
	EReference getSecondaryTable_UniqueConstraints();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.annotations.pannotation.SecondaryTables <em>Secondary Tables</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Secondary Tables</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.SecondaryTables
	 * @generated
	 */
	EClass getSecondaryTables();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.annotations.pannotation.SecondaryTables#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Value</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.SecondaryTables#getValue()
	 * @see #getSecondaryTables()
	 * @generated
	 */
	EReference getSecondaryTables_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.annotations.pannotation.SequenceGenerator <em>Sequence Generator</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequence Generator</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.SequenceGenerator
	 * @generated
	 */
	EClass getSequenceGenerator();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.annotations.pannotation.SequenceGenerator#getName <em>Name</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.SequenceGenerator#getName()
	 * @see #getSequenceGenerator()
	 * @generated
	 */
	EAttribute getSequenceGenerator_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.annotations.pannotation.SequenceGenerator#getInitialValue <em>Initial Value</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initial Value</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.SequenceGenerator#getInitialValue()
	 * @see #getSequenceGenerator()
	 * @generated
	 */
	EAttribute getSequenceGenerator_InitialValue();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.annotations.pannotation.SequenceGenerator#getSequenceName <em>Sequence Name</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sequence Name</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.SequenceGenerator#getSequenceName()
	 * @see #getSequenceGenerator()
	 * @generated
	 */
	EAttribute getSequenceGenerator_SequenceName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.annotations.pannotation.SequenceGenerator#getAllocationSize <em>Allocation Size</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allocation Size</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.SequenceGenerator#getAllocationSize()
	 * @see #getSequenceGenerator()
	 * @generated
	 */
	EAttribute getSequenceGenerator_AllocationSize();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.annotations.pannotation.SqlResultSetMapping <em>Sql Result Set Mapping</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sql Result Set Mapping</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.SqlResultSetMapping
	 * @generated
	 */
	EClass getSqlResultSetMapping();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.annotations.pannotation.SqlResultSetMapping#getName <em>Name</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.SqlResultSetMapping#getName()
	 * @see #getSqlResultSetMapping()
	 * @generated
	 */
	EAttribute getSqlResultSetMapping_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.annotations.pannotation.SqlResultSetMapping#getEntities <em>Entities</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entities</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.SqlResultSetMapping#getEntities()
	 * @see #getSqlResultSetMapping()
	 * @generated
	 */
	EReference getSqlResultSetMapping_Entities();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.annotations.pannotation.SqlResultSetMapping#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Columns</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.SqlResultSetMapping#getColumns()
	 * @see #getSqlResultSetMapping()
	 * @generated
	 */
	EReference getSqlResultSetMapping_Columns();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.annotations.pannotation.Table <em>Table</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.Table
	 * @generated
	 */
	EClass getTable();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.annotations.pannotation.Table#getName <em>Name</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.Table#getName()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.annotations.pannotation.Table#getCatalog <em>Catalog</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Catalog</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.Table#getCatalog()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_Catalog();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.annotations.pannotation.Table#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schema</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.Table#getSchema()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_Schema();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.annotations.pannotation.Table#getUniqueConstraints <em>Unique Constraints</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Unique Constraints</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.Table#getUniqueConstraints()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_UniqueConstraints();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.annotations.pannotation.TableGenerator <em>Table Generator</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table Generator</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.TableGenerator
	 * @generated
	 */
	EClass getTableGenerator();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.annotations.pannotation.TableGenerator#getName <em>Name</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.TableGenerator#getName()
	 * @see #getTableGenerator()
	 * @generated
	 */
	EAttribute getTableGenerator_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.annotations.pannotation.TableGenerator#getAllocationSize <em>Allocation Size</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allocation Size</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.TableGenerator#getAllocationSize()
	 * @see #getTableGenerator()
	 * @generated
	 */
	EAttribute getTableGenerator_AllocationSize();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.annotations.pannotation.TableGenerator#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Table</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.TableGenerator#getTable()
	 * @see #getTableGenerator()
	 * @generated
	 */
	EAttribute getTableGenerator_Table();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.annotations.pannotation.TableGenerator#getCatalog <em>Catalog</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Catalog</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.TableGenerator#getCatalog()
	 * @see #getTableGenerator()
	 * @generated
	 */
	EAttribute getTableGenerator_Catalog();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.annotations.pannotation.TableGenerator#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schema</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.TableGenerator#getSchema()
	 * @see #getTableGenerator()
	 * @generated
	 */
	EAttribute getTableGenerator_Schema();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.annotations.pannotation.TableGenerator#getPkColumnName <em>Pk Column Name</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pk Column Name</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.TableGenerator#getPkColumnName()
	 * @see #getTableGenerator()
	 * @generated
	 */
	EAttribute getTableGenerator_PkColumnName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.annotations.pannotation.TableGenerator#getValueColumnName <em>Value Column Name</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Column Name</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.TableGenerator#getValueColumnName()
	 * @see #getTableGenerator()
	 * @generated
	 */
	EAttribute getTableGenerator_ValueColumnName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.annotations.pannotation.TableGenerator#getInitialValue <em>Initial Value</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initial Value</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.TableGenerator#getInitialValue()
	 * @see #getTableGenerator()
	 * @generated
	 */
	EAttribute getTableGenerator_InitialValue();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.annotations.pannotation.TableGenerator#getPkColumnValue <em>Pk Column Value</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pk Column Value</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.TableGenerator#getPkColumnValue()
	 * @see #getTableGenerator()
	 * @generated
	 */
	EAttribute getTableGenerator_PkColumnValue();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.annotations.pannotation.TableGenerator#getUniqueConstraints <em>Unique Constraints</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Unique Constraints</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.TableGenerator#getUniqueConstraints()
	 * @see #getTableGenerator()
	 * @generated
	 */
	EReference getTableGenerator_UniqueConstraints();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.annotations.pannotation.Temporal <em>Temporal</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Temporal</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.Temporal
	 * @generated
	 */
	EClass getTemporal();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.annotations.pannotation.Temporal#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.Temporal#getValue()
	 * @see #getTemporal()
	 * @generated
	 */
	EAttribute getTemporal_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.annotations.pannotation.Transient <em>Transient</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transient</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.Transient
	 * @generated
	 */
	EClass getTransient();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.annotations.pannotation.UniqueConstraint <em>Unique Constraint</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unique Constraint</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.UniqueConstraint
	 * @generated
	 */
	EClass getUniqueConstraint();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.emf.teneo.annotations.pannotation.UniqueConstraint#getColumnNames <em>Column Names</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Column Names</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.UniqueConstraint#getColumnNames()
	 * @see #getUniqueConstraint()
	 * @generated
	 */
	EAttribute getUniqueConstraint_ColumnNames();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.annotations.pannotation.Version <em>Version</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Version</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.Version
	 * @generated
	 */
	EClass getVersion();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.annotations.pannotation.Indexed <em>Indexed</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Indexed</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.Indexed
	 * @generated
	 */
	EClass getIndexed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.annotations.pannotation.Indexed#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.Indexed#isValue()
	 * @see #getIndexed()
	 * @generated
	 */
	EAttribute getIndexed_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.annotations.pannotation.Unique <em>Unique</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unique</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.Unique
	 * @generated
	 */
	EClass getUnique();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.annotations.pannotation.Unique#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.Unique#isValue()
	 * @see #getUnique()
	 * @generated
	 */
	EAttribute getUnique_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.annotations.pannotation.Columns <em>Columns</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Columns</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.Columns
	 * @generated
	 */
	EClass getColumns();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.annotations.pannotation.Columns#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Value</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.Columns#getValue()
	 * @see #getColumns()
	 * @generated
	 */
	EReference getColumns_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.annotations.pannotation.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.annotations.pannotation.Parameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.Parameter#getName()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.annotations.pannotation.Parameter#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.Parameter#getValue()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.annotations.pannotation.Type <em>Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.Type
	 * @generated
	 */
	EClass getType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.annotations.pannotation.Type#getType <em>Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.Type#getType()
	 * @see #getType()
	 * @generated
	 */
	EAttribute getType_Type();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.emf.teneo.annotations.pannotation.Type#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Parameters</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.Type#getParameters()
	 * @see #getType()
	 * @generated
	 */
	EReference getType_Parameters();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.annotations.pannotation.IdBag <em>Id Bag</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Id Bag</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.IdBag
	 * @generated
	 */
	EClass getIdBag();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.annotations.pannotation.IdBag#getGenerator <em>Generator</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generator</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.IdBag#getGenerator()
	 * @see #getIdBag()
	 * @generated
	 */
	EAttribute getIdBag_Generator();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.annotations.pannotation.IdBag#getType <em>Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.IdBag#getType()
	 * @see #getIdBag()
	 * @generated
	 */
	EAttribute getIdBag_Type();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.annotations.pannotation.AssociationOverride <em>Association Override</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Association Override</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.AssociationOverride
	 * @generated
	 */
	EClass getAssociationOverride();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.annotations.pannotation.AssociationOverride#getName <em>Name</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.AssociationOverride#getName()
	 * @see #getAssociationOverride()
	 * @generated
	 */
	EAttribute getAssociationOverride_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.annotations.pannotation.AssociationOverride#getJoinColumns <em>Join Columns</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Join Columns</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.AssociationOverride#getJoinColumns()
	 * @see #getAssociationOverride()
	 * @generated
	 */
	EReference getAssociationOverride_JoinColumns();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.annotations.pannotation.AssociationOverrides <em>Association Overrides</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Association Overrides</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.AssociationOverrides
	 * @generated
	 */
	EClass getAssociationOverrides();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.annotations.pannotation.AssociationOverrides#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Value</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.AssociationOverrides#getValue()
	 * @see #getAssociationOverrides()
	 * @generated
	 */
	EReference getAssociationOverrides_Value();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.emf.teneo.annotations.pannotation.FetchType <em>Fetch Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Fetch Type</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.FetchType
	 * @generated
	 */
	EEnum getFetchType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.emf.teneo.annotations.pannotation.DiscriminatorType <em>Discriminator Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Discriminator Type</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.DiscriminatorType
	 * @generated
	 */
	EEnum getDiscriminatorType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.emf.teneo.annotations.pannotation.EnumType <em>Enum Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Enum Type</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.EnumType
	 * @generated
	 */
	EEnum getEnumType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.emf.teneo.annotations.pannotation.InheritanceType <em>Inheritance Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Inheritance Type</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.InheritanceType
	 * @generated
	 */
	EEnum getInheritanceType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.emf.teneo.annotations.pannotation.CascadeType <em>Cascade Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Cascade Type</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.CascadeType
	 * @generated
	 */
	EEnum getCascadeType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.emf.teneo.annotations.pannotation.PersistenceContextType <em>Persistence Context Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Persistence Context Type</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.PersistenceContextType
	 * @generated
	 */
	EEnum getPersistenceContextType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.emf.teneo.annotations.pannotation.TemporalType <em>Temporal Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Temporal Type</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.TemporalType
	 * @generated
	 */
	EEnum getTemporalType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.emf.teneo.annotations.pannotation.FlushModeType <em>Flush Mode Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Flush Mode Type</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.FlushModeType
	 * @generated
	 */
	EEnum getFlushModeType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.emf.teneo.annotations.pannotation.GenerationType <em>Generation Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Generation Type</em>'.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.GenerationType
	 * @generated
	 */
	EEnum getGenerationType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PannotationFactory getPannotationFactory();

	/**
	 * @return Returns the eModelElement s types the given annotation applies to. Returns null if the given EClass is
	 *         not annotation Class.
	 */
	EClass[] getTargets(EClass pAnnotationEClass);

	/**
	 * @param pAnnotationEClass
	 *            EClass of the annotation.
	 * @param targetElementEClass
	 *            EClass of the target.
	 * @return Returns true if and only pAnnotationEClass is the EClass of a PAnnotation and targetElementEClass is the
	 *         EClass of a possible target of such annotation.
	 */
	boolean isTarget(EClass pAnnotationEClass, EClass targetElementEClass);

} // PannotationPackage

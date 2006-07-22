/**
 * <copyright>
 * </copyright>
 *
 * $Id: PannotationFactoryImpl.java,v 1.3 2006/07/22 13:10:04 mtaal Exp $
 */
package org.eclipse.emf.teneo.annotations.pannotation.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.teneo.annotations.pannotation.AssociationOverride;
import org.eclipse.emf.teneo.annotations.pannotation.AssociationOverrides;
import org.eclipse.emf.teneo.annotations.pannotation.AttributeOverride;
import org.eclipse.emf.teneo.annotations.pannotation.AttributeOverrides;
import org.eclipse.emf.teneo.annotations.pannotation.Basic;
import org.eclipse.emf.teneo.annotations.pannotation.CascadeType;
import org.eclipse.emf.teneo.annotations.pannotation.Column;
import org.eclipse.emf.teneo.annotations.pannotation.ColumnResult;
import org.eclipse.emf.teneo.annotations.pannotation.Columns;
import org.eclipse.emf.teneo.annotations.pannotation.DiscriminatorColumn;
import org.eclipse.emf.teneo.annotations.pannotation.DiscriminatorType;
import org.eclipse.emf.teneo.annotations.pannotation.DiscriminatorValue;
import org.eclipse.emf.teneo.annotations.pannotation.Embeddable;
import org.eclipse.emf.teneo.annotations.pannotation.Embedded;
import org.eclipse.emf.teneo.annotations.pannotation.EmbeddedId;
import org.eclipse.emf.teneo.annotations.pannotation.Entity;
import org.eclipse.emf.teneo.annotations.pannotation.EntityListener;
import org.eclipse.emf.teneo.annotations.pannotation.EntityResult;
import org.eclipse.emf.teneo.annotations.pannotation.EnumType;
import org.eclipse.emf.teneo.annotations.pannotation.Enumerated;
import org.eclipse.emf.teneo.annotations.pannotation.ExcludeDefaultListeners;
import org.eclipse.emf.teneo.annotations.pannotation.ExcludeSuperclassListeners;
import org.eclipse.emf.teneo.annotations.pannotation.FetchType;
import org.eclipse.emf.teneo.annotations.pannotation.FieldResult;
import org.eclipse.emf.teneo.annotations.pannotation.FlushMode;
import org.eclipse.emf.teneo.annotations.pannotation.FlushModeType;
import org.eclipse.emf.teneo.annotations.pannotation.GeneratedValue;
import org.eclipse.emf.teneo.annotations.pannotation.GenerationType;
import org.eclipse.emf.teneo.annotations.pannotation.Id;
import org.eclipse.emf.teneo.annotations.pannotation.IdBag;
import org.eclipse.emf.teneo.annotations.pannotation.IdClass;
import org.eclipse.emf.teneo.annotations.pannotation.Indexed;
import org.eclipse.emf.teneo.annotations.pannotation.Inheritance;
import org.eclipse.emf.teneo.annotations.pannotation.InheritanceType;
import org.eclipse.emf.teneo.annotations.pannotation.JoinColumn;
import org.eclipse.emf.teneo.annotations.pannotation.JoinColumns;
import org.eclipse.emf.teneo.annotations.pannotation.JoinTable;
import org.eclipse.emf.teneo.annotations.pannotation.Lob;
import org.eclipse.emf.teneo.annotations.pannotation.ManyToMany;
import org.eclipse.emf.teneo.annotations.pannotation.ManyToOne;
import org.eclipse.emf.teneo.annotations.pannotation.MapKey;
import org.eclipse.emf.teneo.annotations.pannotation.MappedSuperclass;
import org.eclipse.emf.teneo.annotations.pannotation.NamedNativeQueries;
import org.eclipse.emf.teneo.annotations.pannotation.NamedNativeQuery;
import org.eclipse.emf.teneo.annotations.pannotation.NamedQueries;
import org.eclipse.emf.teneo.annotations.pannotation.NamedQuery;
import org.eclipse.emf.teneo.annotations.pannotation.OneToMany;
import org.eclipse.emf.teneo.annotations.pannotation.OneToOne;
import org.eclipse.emf.teneo.annotations.pannotation.OrderBy;
import org.eclipse.emf.teneo.annotations.pannotation.PannotationFactory;
import org.eclipse.emf.teneo.annotations.pannotation.PannotationPackage;
import org.eclipse.emf.teneo.annotations.pannotation.Parameter;
import org.eclipse.emf.teneo.annotations.pannotation.PersistenceContext;
import org.eclipse.emf.teneo.annotations.pannotation.PersistenceContextType;
import org.eclipse.emf.teneo.annotations.pannotation.PersistenceContexts;
import org.eclipse.emf.teneo.annotations.pannotation.PersistenceUnit;
import org.eclipse.emf.teneo.annotations.pannotation.PersistenceUnits;
import org.eclipse.emf.teneo.annotations.pannotation.PostLoad;
import org.eclipse.emf.teneo.annotations.pannotation.PostPersist;
import org.eclipse.emf.teneo.annotations.pannotation.PostRemove;
import org.eclipse.emf.teneo.annotations.pannotation.PostUpdate;
import org.eclipse.emf.teneo.annotations.pannotation.PrePersist;
import org.eclipse.emf.teneo.annotations.pannotation.PreRemove;
import org.eclipse.emf.teneo.annotations.pannotation.PreUpdate;
import org.eclipse.emf.teneo.annotations.pannotation.PrimaryKeyJoinColumn;
import org.eclipse.emf.teneo.annotations.pannotation.PrimaryKeyJoinColumns;
import org.eclipse.emf.teneo.annotations.pannotation.QueryHint;
import org.eclipse.emf.teneo.annotations.pannotation.SecondaryTable;
import org.eclipse.emf.teneo.annotations.pannotation.SecondaryTables;
import org.eclipse.emf.teneo.annotations.pannotation.SequenceGenerator;
import org.eclipse.emf.teneo.annotations.pannotation.SqlResultSetMapping;
import org.eclipse.emf.teneo.annotations.pannotation.Table;
import org.eclipse.emf.teneo.annotations.pannotation.TableGenerator;
import org.eclipse.emf.teneo.annotations.pannotation.Temporal;
import org.eclipse.emf.teneo.annotations.pannotation.TemporalType;
import org.eclipse.emf.teneo.annotations.pannotation.Transient;
import org.eclipse.emf.teneo.annotations.pannotation.Type;
import org.eclipse.emf.teneo.annotations.pannotation.Unique;
import org.eclipse.emf.teneo.annotations.pannotation.UniqueConstraint;
import org.eclipse.emf.teneo.annotations.pannotation.Version;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PannotationFactoryImpl extends EFactoryImpl implements PannotationFactory {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2005, 2006 Springsite BV (The Netherlands) and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public\nLicense v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n   Martin Taal\n   Davide Marchignoli\n";

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PannotationFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case PannotationPackage.ATTRIBUTE_OVERRIDE: return createAttributeOverride();
			case PannotationPackage.ATTRIBUTE_OVERRIDES: return createAttributeOverrides();
			case PannotationPackage.ASSOCIATION_OVERRIDE: return createAssociationOverride();
			case PannotationPackage.ASSOCIATION_OVERRIDES: return createAssociationOverrides();
			case PannotationPackage.BASIC: return createBasic();
			case PannotationPackage.COLUMN: return createColumn();
			case PannotationPackage.COLUMNS: return createColumns();
			case PannotationPackage.COLUMN_RESULT: return createColumnResult();
			case PannotationPackage.DISCRIMINATOR_COLUMN: return createDiscriminatorColumn();
			case PannotationPackage.DISCRIMINATOR_VALUE: return createDiscriminatorValue();
			case PannotationPackage.EMBEDDABLE: return createEmbeddable();
			case PannotationPackage.EMBEDDED: return createEmbedded();
			case PannotationPackage.EMBEDDED_ID: return createEmbeddedId();
			case PannotationPackage.ENTITY: return createEntity();
			case PannotationPackage.ENTITY_LISTENER: return createEntityListener();
			case PannotationPackage.ENTITY_RESULT: return createEntityResult();
			case PannotationPackage.ENUMERATED: return createEnumerated();
			case PannotationPackage.EXCLUDE_DEFAULT_LISTENERS: return createExcludeDefaultListeners();
			case PannotationPackage.EXCLUDE_SUPERCLASS_LISTENERS: return createExcludeSuperclassListeners();
			case PannotationPackage.FIELD_RESULT: return createFieldResult();
			case PannotationPackage.FLUSH_MODE: return createFlushMode();
			case PannotationPackage.GENERATED_VALUE: return createGeneratedValue();
			case PannotationPackage.ID: return createId();
			case PannotationPackage.ID_BAG: return createIdBag();
			case PannotationPackage.ID_CLASS: return createIdClass();
			case PannotationPackage.INHERITANCE: return createInheritance();
			case PannotationPackage.JOIN_COLUMN: return createJoinColumn();
			case PannotationPackage.JOIN_COLUMNS: return createJoinColumns();
			case PannotationPackage.JOIN_TABLE: return createJoinTable();
			case PannotationPackage.LOB: return createLob();
			case PannotationPackage.MANY_TO_MANY: return createManyToMany();
			case PannotationPackage.MANY_TO_ONE: return createManyToOne();
			case PannotationPackage.MAP_KEY: return createMapKey();
			case PannotationPackage.MAPPED_SUPERCLASS: return createMappedSuperclass();
			case PannotationPackage.NAMED_NATIVE_QUERIES: return createNamedNativeQueries();
			case PannotationPackage.NAMED_NATIVE_QUERY: return createNamedNativeQuery();
			case PannotationPackage.NAMED_QUERIES: return createNamedQueries();
			case PannotationPackage.NAMED_QUERY: return createNamedQuery();
			case PannotationPackage.ONE_TO_MANY: return createOneToMany();
			case PannotationPackage.ONE_TO_ONE: return createOneToOne();
			case PannotationPackage.ORDER_BY: return createOrderBy();
			case PannotationPackage.PARAMETER: return createParameter();
			case PannotationPackage.PERSISTENCE_CONTEXT: return createPersistenceContext();
			case PannotationPackage.PERSISTENCE_CONTEXTS: return createPersistenceContexts();
			case PannotationPackage.PERSISTENCE_UNIT: return createPersistenceUnit();
			case PannotationPackage.PERSISTENCE_UNITS: return createPersistenceUnits();
			case PannotationPackage.POST_LOAD: return createPostLoad();
			case PannotationPackage.POST_PERSIST: return createPostPersist();
			case PannotationPackage.POST_REMOVE: return createPostRemove();
			case PannotationPackage.POST_UPDATE: return createPostUpdate();
			case PannotationPackage.PRE_PERSIST: return createPrePersist();
			case PannotationPackage.PRE_REMOVE: return createPreRemove();
			case PannotationPackage.PRE_UPDATE: return createPreUpdate();
			case PannotationPackage.PRIMARY_KEY_JOIN_COLUMN: return createPrimaryKeyJoinColumn();
			case PannotationPackage.PRIMARY_KEY_JOIN_COLUMNS: return createPrimaryKeyJoinColumns();
			case PannotationPackage.QUERY_HINT: return createQueryHint();
			case PannotationPackage.SECONDARY_TABLE: return createSecondaryTable();
			case PannotationPackage.SECONDARY_TABLES: return createSecondaryTables();
			case PannotationPackage.SEQUENCE_GENERATOR: return createSequenceGenerator();
			case PannotationPackage.SQL_RESULT_SET_MAPPING: return createSqlResultSetMapping();
			case PannotationPackage.TABLE: return createTable();
			case PannotationPackage.TABLE_GENERATOR: return createTableGenerator();
			case PannotationPackage.TEMPORAL: return createTemporal();
			case PannotationPackage.TYPE: return createType();
			case PannotationPackage.TRANSIENT: return createTransient();
			case PannotationPackage.UNIQUE_CONSTRAINT: return createUniqueConstraint();
			case PannotationPackage.VERSION: return createVersion();
			case PannotationPackage.INDEXED: return createIndexed();
			case PannotationPackage.UNIQUE: return createUnique();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case PannotationPackage.CASCADE_TYPE: {
				CascadeType result = CascadeType.get(initialValue);
				if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
				return result;
			}
			case PannotationPackage.DISCRIMINATOR_TYPE: {
				DiscriminatorType result = DiscriminatorType.get(initialValue);
				if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
				return result;
			}
			case PannotationPackage.ENUM_TYPE: {
				EnumType result = EnumType.get(initialValue);
				if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
				return result;
			}
			case PannotationPackage.FETCH_TYPE: {
				FetchType result = FetchType.get(initialValue);
				if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
				return result;
			}
			case PannotationPackage.FLUSH_MODE_TYPE: {
				FlushModeType result = FlushModeType.get(initialValue);
				if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
				return result;
			}
			case PannotationPackage.GENERATION_TYPE: {
				GenerationType result = GenerationType.get(initialValue);
				if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
				return result;
			}
			case PannotationPackage.INHERITANCE_TYPE: {
				InheritanceType result = InheritanceType.get(initialValue);
				if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
				return result;
			}
			case PannotationPackage.PERSISTENCE_CONTEXT_TYPE: {
				PersistenceContextType result = PersistenceContextType.get(initialValue);
				if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
				return result;
			}
			case PannotationPackage.TEMPORAL_TYPE: {
				TemporalType result = TemporalType.get(initialValue);
				if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
				return result;
			}
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case PannotationPackage.CASCADE_TYPE:
				return instanceValue == null ? null : instanceValue.toString();
			case PannotationPackage.DISCRIMINATOR_TYPE:
				return instanceValue == null ? null : instanceValue.toString();
			case PannotationPackage.ENUM_TYPE:
				return instanceValue == null ? null : instanceValue.toString();
			case PannotationPackage.FETCH_TYPE:
				return instanceValue == null ? null : instanceValue.toString();
			case PannotationPackage.FLUSH_MODE_TYPE:
				return instanceValue == null ? null : instanceValue.toString();
			case PannotationPackage.GENERATION_TYPE:
				return instanceValue == null ? null : instanceValue.toString();
			case PannotationPackage.INHERITANCE_TYPE:
				return instanceValue == null ? null : instanceValue.toString();
			case PannotationPackage.PERSISTENCE_CONTEXT_TYPE:
				return instanceValue == null ? null : instanceValue.toString();
			case PannotationPackage.TEMPORAL_TYPE:
				return instanceValue == null ? null : instanceValue.toString();
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeOverride createAttributeOverride() {
		AttributeOverrideImpl attributeOverride = new AttributeOverrideImpl();
		return attributeOverride;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeOverrides createAttributeOverrides() {
		AttributeOverridesImpl attributeOverrides = new AttributeOverridesImpl();
		return attributeOverrides;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Basic createBasic() {
		BasicImpl basic = new BasicImpl();
		return basic;
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
	public ColumnResult createColumnResult() {
		ColumnResultImpl columnResult = new ColumnResultImpl();
		return columnResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiscriminatorColumn createDiscriminatorColumn() {
		DiscriminatorColumnImpl discriminatorColumn = new DiscriminatorColumnImpl();
		return discriminatorColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiscriminatorValue createDiscriminatorValue() {
		DiscriminatorValueImpl discriminatorValue = new DiscriminatorValueImpl();
		return discriminatorValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Embeddable createEmbeddable() {
		EmbeddableImpl embeddable = new EmbeddableImpl();
		return embeddable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappedSuperclass createMappedSuperclass() {
		MappedSuperclassImpl mappedSuperclass = new MappedSuperclassImpl();
		return mappedSuperclass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Embedded createEmbedded() {
		EmbeddedImpl embedded = new EmbeddedImpl();
		return embedded;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmbeddedId createEmbeddedId() {
		EmbeddedIdImpl embeddedId = new EmbeddedIdImpl();
		return embeddedId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enumerated createEnumerated() {
		EnumeratedImpl enumerated = new EnumeratedImpl();
		return enumerated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity createEntity() {
		EntityImpl entity = new EntityImpl();
		return entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityListener createEntityListener() {
		EntityListenerImpl entityListener = new EntityListenerImpl();
		return entityListener;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityResult createEntityResult() {
		EntityResultImpl entityResult = new EntityResultImpl();
		return entityResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExcludeDefaultListeners createExcludeDefaultListeners() {
		ExcludeDefaultListenersImpl excludeDefaultListeners = new ExcludeDefaultListenersImpl();
		return excludeDefaultListeners;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExcludeSuperclassListeners createExcludeSuperclassListeners() {
		ExcludeSuperclassListenersImpl excludeSuperclassListeners = new ExcludeSuperclassListenersImpl();
		return excludeSuperclassListeners;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FieldResult createFieldResult() {
		FieldResultImpl fieldResult = new FieldResultImpl();
		return fieldResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlushMode createFlushMode() {
		FlushModeImpl flushMode = new FlushModeImpl();
		return flushMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratedValue createGeneratedValue() {
		GeneratedValueImpl generatedValue = new GeneratedValueImpl();
		return generatedValue;
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
	public IdClass createIdClass() {
		IdClassImpl idClass = new IdClassImpl();
		return idClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Inheritance createInheritance() {
		InheritanceImpl inheritance = new InheritanceImpl();
		return inheritance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JoinColumn createJoinColumn() {
		JoinColumnImpl joinColumn = new JoinColumnImpl();
		return joinColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JoinColumns createJoinColumns() {
		JoinColumnsImpl joinColumns = new JoinColumnsImpl();
		return joinColumns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JoinTable createJoinTable() {
		JoinTableImpl joinTable = new JoinTableImpl();
		return joinTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lob createLob() {
		LobImpl lob = new LobImpl();
		return lob;
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
	public MapKey createMapKey() {
		MapKeyImpl mapKey = new MapKeyImpl();
		return mapKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedNativeQueries createNamedNativeQueries() {
		NamedNativeQueriesImpl namedNativeQueries = new NamedNativeQueriesImpl();
		return namedNativeQueries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedNativeQuery createNamedNativeQuery() {
		NamedNativeQueryImpl namedNativeQuery = new NamedNativeQueryImpl();
		return namedNativeQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedQueries createNamedQueries() {
		NamedQueriesImpl namedQueries = new NamedQueriesImpl();
		return namedQueries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedQuery createNamedQuery() {
		NamedQueryImpl namedQuery = new NamedQueryImpl();
		return namedQuery;
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
	public OrderBy createOrderBy() {
		OrderByImpl orderBy = new OrderByImpl();
		return orderBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersistenceContext createPersistenceContext() {
		PersistenceContextImpl persistenceContext = new PersistenceContextImpl();
		return persistenceContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersistenceContexts createPersistenceContexts() {
		PersistenceContextsImpl persistenceContexts = new PersistenceContextsImpl();
		return persistenceContexts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersistenceUnit createPersistenceUnit() {
		PersistenceUnitImpl persistenceUnit = new PersistenceUnitImpl();
		return persistenceUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersistenceUnits createPersistenceUnits() {
		PersistenceUnitsImpl persistenceUnits = new PersistenceUnitsImpl();
		return persistenceUnits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PostLoad createPostLoad() {
		PostLoadImpl postLoad = new PostLoadImpl();
		return postLoad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PostPersist createPostPersist() {
		PostPersistImpl postPersist = new PostPersistImpl();
		return postPersist;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PostRemove createPostRemove() {
		PostRemoveImpl postRemove = new PostRemoveImpl();
		return postRemove;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PostUpdate createPostUpdate() {
		PostUpdateImpl postUpdate = new PostUpdateImpl();
		return postUpdate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrePersist createPrePersist() {
		PrePersistImpl prePersist = new PrePersistImpl();
		return prePersist;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PreRemove createPreRemove() {
		PreRemoveImpl preRemove = new PreRemoveImpl();
		return preRemove;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PreUpdate createPreUpdate() {
		PreUpdateImpl preUpdate = new PreUpdateImpl();
		return preUpdate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimaryKeyJoinColumn createPrimaryKeyJoinColumn() {
		PrimaryKeyJoinColumnImpl primaryKeyJoinColumn = new PrimaryKeyJoinColumnImpl();
		return primaryKeyJoinColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimaryKeyJoinColumns createPrimaryKeyJoinColumns() {
		PrimaryKeyJoinColumnsImpl primaryKeyJoinColumns = new PrimaryKeyJoinColumnsImpl();
		return primaryKeyJoinColumns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryHint createQueryHint() {
		QueryHintImpl queryHint = new QueryHintImpl();
		return queryHint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecondaryTable createSecondaryTable() {
		SecondaryTableImpl secondaryTable = new SecondaryTableImpl();
		return secondaryTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecondaryTables createSecondaryTables() {
		SecondaryTablesImpl secondaryTables = new SecondaryTablesImpl();
		return secondaryTables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequenceGenerator createSequenceGenerator() {
		SequenceGeneratorImpl sequenceGenerator = new SequenceGeneratorImpl();
		return sequenceGenerator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SqlResultSetMapping createSqlResultSetMapping() {
		SqlResultSetMappingImpl sqlResultSetMapping = new SqlResultSetMappingImpl();
		return sqlResultSetMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table createTable() {
		TableImpl table = new TableImpl();
		return table;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableGenerator createTableGenerator() {
		TableGeneratorImpl tableGenerator = new TableGeneratorImpl();
		return tableGenerator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Temporal createTemporal() {
		TemporalImpl temporal = new TemporalImpl();
		return temporal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transient createTransient() {
		TransientImpl transient_ = new TransientImpl();
		return transient_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UniqueConstraint createUniqueConstraint() {
		UniqueConstraintImpl uniqueConstraint = new UniqueConstraintImpl();
		return uniqueConstraint;
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
	public Indexed createIndexed() {
		IndexedImpl indexed = new IndexedImpl();
		return indexed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Unique createUnique() {
		UniqueImpl unique = new UniqueImpl();
		return unique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Columns createColumns() {
		ColumnsImpl columns = new ColumnsImpl();
		return columns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter createParameter() {
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
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
	public IdBag createIdBag() {
		IdBagImpl idBag = new IdBagImpl();
		return idBag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssociationOverride createAssociationOverride() {
		AssociationOverrideImpl associationOverride = new AssociationOverrideImpl();
		return associationOverride;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssociationOverrides createAssociationOverrides() {
		AssociationOverridesImpl associationOverrides = new AssociationOverridesImpl();
		return associationOverrides;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PannotationPackage getPannotationPackage() {
		return (PannotationPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	public static PannotationPackage getPackage() {
		return PannotationPackage.eINSTANCE;
	}

} //PannotationFactoryImpl

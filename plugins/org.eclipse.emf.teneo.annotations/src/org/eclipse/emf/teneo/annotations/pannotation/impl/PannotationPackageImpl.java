/**
 * <copyright>
 * </copyright>
 *
 * $Id: PannotationPackageImpl.java,v 1.1 2006/07/04 21:37:01 mtaal Exp $
 */
package org.eclipse.emf.teneo.annotations.pannotation.impl;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.teneo.annotations.pamodel.PamodelPackage;
import org.eclipse.emf.teneo.annotations.pamodel.impl.PamodelPackageImpl;
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
import org.eclipse.emf.teneo.annotations.pannotation.PAnnotation;
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
import org.eclipse.emf.teneo.annotations.pannotation.util.PannotationValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PannotationPackageImpl extends EPackageImpl implements PannotationPackage {
	public static final String TARGET_ANNOTATION_SOURCE = "http://annotation.elver.org/internal/Target";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright 2004-2006, Elver.org (http://www.eclipse.org/emf/teneo).\nLicensed under the Apache License, Version 2.0 (the \"License\");\n\nyou may not use this file except in compliance with the License.\nYou may obtain a copy of the License at\nhttp://www.apache.org/licenses/LICENSE-2.0\nUnless required by applicable law or agreed to in writing, software\ndistributed under the License is distributed on an \"AS IS\" BASIS,\nWITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.\nSee the License for the specific language governing permissions and\nlimitations under the License.";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pAnnotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeOverrideEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeOverridesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass basicEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass columnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass columnResultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass discriminatorColumnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass discriminatorValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass embeddableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mappedSuperclassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass embeddedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass embeddedIdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumeratedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityListenerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityResultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass excludeDefaultListenersEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass excludeSuperclassListenersEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fieldResultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flushModeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generatedValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass idEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass idClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inheritanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass joinColumnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass joinColumnsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass joinTableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lobEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass manyToManyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass manyToOneEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mapKeyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedNativeQueriesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedNativeQueryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedQueriesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedQueryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oneToManyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oneToOneEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orderByEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass persistenceContextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass persistenceContextsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass persistenceUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass persistenceUnitsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass postLoadEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass postPersistEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass postRemoveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass postUpdateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass prePersistEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass preRemoveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass preUpdateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primaryKeyJoinColumnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primaryKeyJoinColumnsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass queryHintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass secondaryTableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass secondaryTablesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sequenceGeneratorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sqlResultSetMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tableGeneratorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass temporalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transientEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uniqueConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass versionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass indexedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uniqueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass columnsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass idBagEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass associationOverrideEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass associationOverridesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum fetchTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum discriminatorTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum inheritanceTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cascadeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum persistenceContextTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum temporalTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum flushModeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum generationTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.emf.teneo.annotations.pannotation.PannotationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PannotationPackageImpl() {
		super(eNS_URI, PannotationFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this
	 * model, and for any others upon which it depends.  Simple
	 * dependencies are satisfied by calling this method on all
	 * dependent packages before doing anything else.  This method drives
	 * initialization for interdependent packages directly, in parallel
	 * with this package, itself.
	 * <p>Of this package and its interdependencies, all packages which
	 * have not yet been registered by their URI values are first created
	 * and registered.  The packages are then initialized in two steps:
	 * meta-model objects for all of the packages are created before any
	 * are initialized, since one package's meta-model objects may refer to
	 * those of another.
	 * <p>Invocation of this method will not affect any packages that have
	 * already been initialized.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PannotationPackage init() {
		if (isInited) return (PannotationPackage)EPackage.Registry.INSTANCE.getEPackage(PannotationPackage.eNS_URI);

		// Obtain or create and register package
		PannotationPackageImpl thePannotationPackage = (PannotationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof PannotationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new PannotationPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		PamodelPackageImpl thePamodelPackage = (PamodelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PamodelPackage.eNS_URI) instanceof PamodelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PamodelPackage.eNS_URI) : PamodelPackage.eINSTANCE);

		// Create package meta-data objects
		thePannotationPackage.createPackageContents();
		thePamodelPackage.createPackageContents();

		// Initialize created meta-data
		thePannotationPackage.initializePackageContents();
		thePamodelPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(thePannotationPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return PannotationValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		thePannotationPackage.freeze();

		return thePannotationPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPAnnotation() {
		return pAnnotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPAnnotation_EModelElement() {
		return (EReference)pAnnotationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeOverride() {
		return attributeOverrideEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeOverride_Name() {
		return (EAttribute)attributeOverrideEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeOverride_Column() {
		return (EReference)attributeOverrideEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeOverrides() {
		return attributeOverridesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeOverrides_Value() {
		return (EReference)attributeOverridesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBasic() {
		return basicEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBasic_Fetch() {
		return (EAttribute)basicEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBasic_Optional() {
		return (EAttribute)basicEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getColumn() {
		return columnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColumn_Name() {
		return (EAttribute)columnEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColumn_Length() {
		return (EAttribute)columnEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColumn_Scale() {
		return (EAttribute)columnEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColumn_Unique() {
		return (EAttribute)columnEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColumn_Precision() {
		return (EAttribute)columnEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColumn_Nullable() {
		return (EAttribute)columnEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColumn_Insertable() {
		return (EAttribute)columnEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColumn_Updatable() {
		return (EAttribute)columnEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColumn_ColumnDefinition() {
		return (EAttribute)columnEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColumn_Table() {
		return (EAttribute)columnEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getColumnResult() {
		return columnResultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColumnResult_Name() {
		return (EAttribute)columnResultEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiscriminatorColumn() {
		return discriminatorColumnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiscriminatorColumn_Name() {
		return (EAttribute)discriminatorColumnEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiscriminatorColumn_DiscriminatorType() {
		return (EAttribute)discriminatorColumnEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiscriminatorColumn_Length() {
		return (EAttribute)discriminatorColumnEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiscriminatorValue() {
		return discriminatorValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiscriminatorValue_Value() {
		return (EAttribute)discriminatorValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiscriminatorColumn_ColumnDefinition() {
		return (EAttribute)discriminatorColumnEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEmbeddable() {
		return embeddableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMappedSuperclass() {
		return mappedSuperclassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEmbedded() {
		return embeddedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEmbeddedId() {
		return embeddedIdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumerated() {
		return enumeratedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnumerated_Value() {
		return (EAttribute)enumeratedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntity() {
		return entityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntity_Name() {
		return (EAttribute)entityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntityListener() {
		return entityListenerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntityListener_Value() {
		return (EAttribute)entityListenerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntityResult() {
		return entityResultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntityResult_EntityClass() {
		return (EAttribute)entityResultEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityResult_Fields() {
		return (EReference)entityResultEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntityResult_DiscriminatorColumn() {
		return (EAttribute)entityResultEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExcludeDefaultListeners() {
		return excludeDefaultListenersEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExcludeSuperclassListeners() {
		return excludeSuperclassListenersEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFieldResult() {
		return fieldResultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFieldResult_Name() {
		return (EAttribute)fieldResultEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFieldResult_Column() {
		return (EAttribute)fieldResultEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFlushMode() {
		return flushModeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFlushMode_Value() {
		return (EAttribute)flushModeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeneratedValue() {
		return generatedValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneratedValue_Strategy() {
		return (EAttribute)generatedValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneratedValue_Generator() {
		return (EAttribute)generatedValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getId() {
		return idEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIdClass() {
		return idClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIdClass_Value() {
		return (EAttribute)idClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInheritance() {
		return inheritanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInheritance_Strategy() {
		return (EAttribute)inheritanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJoinColumn() {
		return joinColumnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJoinColumn_Name() {
		return (EAttribute)joinColumnEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJoinColumn_Unique() {
		return (EAttribute)joinColumnEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJoinColumn_Nullable() {
		return (EAttribute)joinColumnEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJoinColumn_Insertable() {
		return (EAttribute)joinColumnEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJoinColumn_Updatable() {
		return (EAttribute)joinColumnEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJoinColumn_ColumnDefinition() {
		return (EAttribute)joinColumnEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJoinColumn_Table() {
		return (EAttribute)joinColumnEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJoinColumn_ReferencedColumnName() {
		return (EAttribute)joinColumnEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJoinColumns() {
		return joinColumnsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJoinColumns_Value() {
		return (EReference)joinColumnsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJoinTable() {
		return joinTableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJoinTable_Name() {
		return (EAttribute)joinTableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJoinTable_Catalog() {
		return (EAttribute)joinTableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJoinTable_Schema() {
		return (EAttribute)joinTableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJoinTable_JoinColumns() {
		return (EReference)joinTableEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJoinTable_InverseJoinColumns() {
		return (EReference)joinTableEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJoinTable_UniqueConstraints() {
		return (EReference)joinTableEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLob() {
		return lobEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getManyToMany() {
		return manyToManyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getManyToMany_Fetch() {
		return (EAttribute)manyToManyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getManyToMany_TargetEntity() {
		return (EAttribute)manyToManyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getManyToMany_Cascade() {
		return (EAttribute)manyToManyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getManyToMany_MappedBy() {
		return (EAttribute)manyToManyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getManyToOne() {
		return manyToOneEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getManyToOne_Fetch() {
		return (EAttribute)manyToOneEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getManyToOne_Optional() {
		return (EAttribute)manyToOneEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getManyToOne_TargetEntity() {
		return (EAttribute)manyToOneEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getManyToOne_Cascade() {
		return (EAttribute)manyToOneEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMapKey() {
		return mapKeyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMapKey_Name() {
		return (EAttribute)mapKeyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedNativeQueries() {
		return namedNativeQueriesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamedNativeQueries_Value() {
		return (EReference)namedNativeQueriesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedNativeQuery() {
		return namedNativeQueryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedNativeQuery_Name() {
		return (EAttribute)namedNativeQueryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedNativeQuery_Query() {
		return (EAttribute)namedNativeQueryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamedNativeQuery_Hints() {
		return (EReference)namedNativeQueryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedNativeQuery_ResultClass() {
		return (EAttribute)namedNativeQueryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedNativeQuery_ResultSetMapping() {
		return (EAttribute)namedNativeQueryEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedQueries() {
		return namedQueriesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamedQueries_Value() {
		return (EReference)namedQueriesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedQuery() {
		return namedQueryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedQuery_Name() {
		return (EAttribute)namedQueryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedQuery_Query() {
		return (EAttribute)namedQueryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamedQuery_Hints() {
		return (EReference)namedQueryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOneToMany() {
		return oneToManyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOneToMany_Fetch() {
		return (EAttribute)oneToManyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOneToMany_TargetEntity() {
		return (EAttribute)oneToManyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOneToMany_Cascade() {
		return (EAttribute)oneToManyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOneToMany_MappedBy() {
		return (EAttribute)oneToManyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOneToOne() {
		return oneToOneEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOneToOne_Fetch() {
		return (EAttribute)oneToOneEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOneToOne_Optional() {
		return (EAttribute)oneToOneEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOneToOne_TargetEntity() {
		return (EAttribute)oneToOneEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOneToOne_Cascade() {
		return (EAttribute)oneToOneEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOneToOne_MappedBy() {
		return (EAttribute)oneToOneEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrderBy() {
		return orderByEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrderBy_Value() {
		return (EAttribute)orderByEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPersistenceContext() {
		return persistenceContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersistenceContext_Name() {
		return (EAttribute)persistenceContextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersistenceContext_Type() {
		return (EAttribute)persistenceContextEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersistenceContext_UnitName() {
		return (EAttribute)persistenceContextEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPersistenceContexts() {
		return persistenceContextsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersistenceContexts_Value() {
		return (EReference)persistenceContextsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPersistenceUnit() {
		return persistenceUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersistenceUnit_Name() {
		return (EAttribute)persistenceUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersistenceUnit_UnitName() {
		return (EAttribute)persistenceUnitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPersistenceUnits() {
		return persistenceUnitsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersistenceUnits_Value() {
		return (EReference)persistenceUnitsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPostLoad() {
		return postLoadEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPostPersist() {
		return postPersistEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPostRemove() {
		return postRemoveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPostUpdate() {
		return postUpdateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrePersist() {
		return prePersistEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPreRemove() {
		return preRemoveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPreUpdate() {
		return preUpdateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrimaryKeyJoinColumn() {
		return primaryKeyJoinColumnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrimaryKeyJoinColumn_Name() {
		return (EAttribute)primaryKeyJoinColumnEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrimaryKeyJoinColumn_ColumnDefinition() {
		return (EAttribute)primaryKeyJoinColumnEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrimaryKeyJoinColumn_ReferencedColumnName() {
		return (EAttribute)primaryKeyJoinColumnEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrimaryKeyJoinColumns() {
		return primaryKeyJoinColumnsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrimaryKeyJoinColumns_Value() {
		return (EReference)primaryKeyJoinColumnsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQueryHint() {
		return queryHintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQueryHint_Name() {
		return (EAttribute)queryHintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQueryHint_Value() {
		return (EAttribute)queryHintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSecondaryTable() {
		return secondaryTableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSecondaryTable_Name() {
		return (EAttribute)secondaryTableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSecondaryTable_Catalog() {
		return (EAttribute)secondaryTableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSecondaryTable_Schema() {
		return (EAttribute)secondaryTableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSecondaryTable_PkJoinColumns() {
		return (EReference)secondaryTableEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSecondaryTable_UniqueConstraints() {
		return (EReference)secondaryTableEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSecondaryTables() {
		return secondaryTablesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSecondaryTables_Value() {
		return (EReference)secondaryTablesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSequenceGenerator() {
		return sequenceGeneratorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSequenceGenerator_Name() {
		return (EAttribute)sequenceGeneratorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSequenceGenerator_InitialValue() {
		return (EAttribute)sequenceGeneratorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSequenceGenerator_SequenceName() {
		return (EAttribute)sequenceGeneratorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSequenceGenerator_AllocationSize() {
		return (EAttribute)sequenceGeneratorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSqlResultSetMapping() {
		return sqlResultSetMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSqlResultSetMapping_Name() {
		return (EAttribute)sqlResultSetMappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSqlResultSetMapping_Entities() {
		return (EReference)sqlResultSetMappingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSqlResultSetMapping_Columns() {
		return (EReference)sqlResultSetMappingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTable() {
		return tableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTable_Name() {
		return (EAttribute)tableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTable_Catalog() {
		return (EAttribute)tableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTable_Schema() {
		return (EAttribute)tableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTable_UniqueConstraints() {
		return (EReference)tableEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTableGenerator() {
		return tableGeneratorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTableGenerator_Name() {
		return (EAttribute)tableGeneratorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTableGenerator_AllocationSize() {
		return (EAttribute)tableGeneratorEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTableGenerator_Table() {
		return (EAttribute)tableGeneratorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTableGenerator_Catalog() {
		return (EAttribute)tableGeneratorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTableGenerator_Schema() {
		return (EAttribute)tableGeneratorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTableGenerator_PkColumnName() {
		return (EAttribute)tableGeneratorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTableGenerator_ValueColumnName() {
		return (EAttribute)tableGeneratorEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTableGenerator_InitialValue() {
		return (EAttribute)tableGeneratorEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTableGenerator_PkColumnValue() {
		return (EAttribute)tableGeneratorEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTableGenerator_UniqueConstraints() {
		return (EReference)tableGeneratorEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTemporal() {
		return temporalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTemporal_Value() {
		return (EAttribute)temporalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransient() {
		return transientEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUniqueConstraint() {
		return uniqueConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUniqueConstraint_ColumnNames() {
		return (EAttribute)uniqueConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVersion() {
		return versionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIndexed() {
		return indexedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIndexed_Value() {
		return (EAttribute)indexedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnique() {
		return uniqueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnique_Value() {
		return (EAttribute)uniqueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getColumns() {
		return columnsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getColumns_Value() {
		return (EReference)columnsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameter() {
		return parameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_Name() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_Value() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getType() {
		return typeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getType_Type() {
		return (EAttribute)typeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getType_Parameters() {
		return (EReference)typeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIdBag() {
		return idBagEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIdBag_Generator() {
		return (EAttribute)idBagEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIdBag_Type() {
		return (EAttribute)idBagEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssociationOverride() {
		return associationOverrideEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssociationOverride_Name() {
		return (EAttribute)associationOverrideEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssociationOverride_JoinColumns() {
		return (EReference)associationOverrideEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssociationOverrides() {
		return associationOverridesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssociationOverrides_Value() {
		return (EReference)associationOverridesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFetchType() {
		return fetchTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDiscriminatorType() {
		return discriminatorTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEnumType() {
		return enumTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getInheritanceType() {
		return inheritanceTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCascadeType() {
		return cascadeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPersistenceContextType() {
		return persistenceContextTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTemporalType() {
		return temporalTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFlushModeType() {
		return flushModeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGenerationType() {
		return generationTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PannotationFactory getPannotationFactory() {
		return (PannotationFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		pAnnotationEClass = createEClass(PANNOTATION);
		createEReference(pAnnotationEClass, PANNOTATION__EMODEL_ELEMENT);

		attributeOverrideEClass = createEClass(ATTRIBUTE_OVERRIDE);
		createEAttribute(attributeOverrideEClass, ATTRIBUTE_OVERRIDE__NAME);
		createEReference(attributeOverrideEClass, ATTRIBUTE_OVERRIDE__COLUMN);

		attributeOverridesEClass = createEClass(ATTRIBUTE_OVERRIDES);
		createEReference(attributeOverridesEClass, ATTRIBUTE_OVERRIDES__VALUE);

		associationOverrideEClass = createEClass(ASSOCIATION_OVERRIDE);
		createEAttribute(associationOverrideEClass, ASSOCIATION_OVERRIDE__NAME);
		createEReference(associationOverrideEClass, ASSOCIATION_OVERRIDE__JOIN_COLUMNS);

		associationOverridesEClass = createEClass(ASSOCIATION_OVERRIDES);
		createEReference(associationOverridesEClass, ASSOCIATION_OVERRIDES__VALUE);

		basicEClass = createEClass(BASIC);
		createEAttribute(basicEClass, BASIC__FETCH);
		createEAttribute(basicEClass, BASIC__OPTIONAL);

		columnEClass = createEClass(COLUMN);
		createEAttribute(columnEClass, COLUMN__NAME);
		createEAttribute(columnEClass, COLUMN__UNIQUE);
		createEAttribute(columnEClass, COLUMN__NULLABLE);
		createEAttribute(columnEClass, COLUMN__INSERTABLE);
		createEAttribute(columnEClass, COLUMN__UPDATABLE);
		createEAttribute(columnEClass, COLUMN__COLUMN_DEFINITION);
		createEAttribute(columnEClass, COLUMN__TABLE);
		createEAttribute(columnEClass, COLUMN__LENGTH);
		createEAttribute(columnEClass, COLUMN__PRECISION);
		createEAttribute(columnEClass, COLUMN__SCALE);

		columnsEClass = createEClass(COLUMNS);
		createEReference(columnsEClass, COLUMNS__VALUE);

		columnResultEClass = createEClass(COLUMN_RESULT);
		createEAttribute(columnResultEClass, COLUMN_RESULT__NAME);

		discriminatorColumnEClass = createEClass(DISCRIMINATOR_COLUMN);
		createEAttribute(discriminatorColumnEClass, DISCRIMINATOR_COLUMN__NAME);
		createEAttribute(discriminatorColumnEClass, DISCRIMINATOR_COLUMN__DISCRIMINATOR_TYPE);
		createEAttribute(discriminatorColumnEClass, DISCRIMINATOR_COLUMN__COLUMN_DEFINITION);
		createEAttribute(discriminatorColumnEClass, DISCRIMINATOR_COLUMN__LENGTH);

		discriminatorValueEClass = createEClass(DISCRIMINATOR_VALUE);
		createEAttribute(discriminatorValueEClass, DISCRIMINATOR_VALUE__VALUE);

		embeddableEClass = createEClass(EMBEDDABLE);

		embeddedEClass = createEClass(EMBEDDED);

		embeddedIdEClass = createEClass(EMBEDDED_ID);

		entityEClass = createEClass(ENTITY);
		createEAttribute(entityEClass, ENTITY__NAME);

		entityListenerEClass = createEClass(ENTITY_LISTENER);
		createEAttribute(entityListenerEClass, ENTITY_LISTENER__VALUE);

		entityResultEClass = createEClass(ENTITY_RESULT);
		createEAttribute(entityResultEClass, ENTITY_RESULT__ENTITY_CLASS);
		createEReference(entityResultEClass, ENTITY_RESULT__FIELDS);
		createEAttribute(entityResultEClass, ENTITY_RESULT__DISCRIMINATOR_COLUMN);

		enumeratedEClass = createEClass(ENUMERATED);
		createEAttribute(enumeratedEClass, ENUMERATED__VALUE);

		excludeDefaultListenersEClass = createEClass(EXCLUDE_DEFAULT_LISTENERS);

		excludeSuperclassListenersEClass = createEClass(EXCLUDE_SUPERCLASS_LISTENERS);

		fieldResultEClass = createEClass(FIELD_RESULT);
		createEAttribute(fieldResultEClass, FIELD_RESULT__NAME);
		createEAttribute(fieldResultEClass, FIELD_RESULT__COLUMN);

		flushModeEClass = createEClass(FLUSH_MODE);
		createEAttribute(flushModeEClass, FLUSH_MODE__VALUE);

		generatedValueEClass = createEClass(GENERATED_VALUE);
		createEAttribute(generatedValueEClass, GENERATED_VALUE__STRATEGY);
		createEAttribute(generatedValueEClass, GENERATED_VALUE__GENERATOR);

		idEClass = createEClass(ID);

		idBagEClass = createEClass(ID_BAG);
		createEAttribute(idBagEClass, ID_BAG__GENERATOR);
		createEAttribute(idBagEClass, ID_BAG__TYPE);

		idClassEClass = createEClass(ID_CLASS);
		createEAttribute(idClassEClass, ID_CLASS__VALUE);

		inheritanceEClass = createEClass(INHERITANCE);
		createEAttribute(inheritanceEClass, INHERITANCE__STRATEGY);

		joinColumnEClass = createEClass(JOIN_COLUMN);
		createEAttribute(joinColumnEClass, JOIN_COLUMN__NAME);
		createEAttribute(joinColumnEClass, JOIN_COLUMN__REFERENCED_COLUMN_NAME);
		createEAttribute(joinColumnEClass, JOIN_COLUMN__UNIQUE);
		createEAttribute(joinColumnEClass, JOIN_COLUMN__NULLABLE);
		createEAttribute(joinColumnEClass, JOIN_COLUMN__INSERTABLE);
		createEAttribute(joinColumnEClass, JOIN_COLUMN__UPDATABLE);
		createEAttribute(joinColumnEClass, JOIN_COLUMN__COLUMN_DEFINITION);
		createEAttribute(joinColumnEClass, JOIN_COLUMN__TABLE);

		joinColumnsEClass = createEClass(JOIN_COLUMNS);
		createEReference(joinColumnsEClass, JOIN_COLUMNS__VALUE);

		joinTableEClass = createEClass(JOIN_TABLE);
		createEAttribute(joinTableEClass, JOIN_TABLE__NAME);
		createEAttribute(joinTableEClass, JOIN_TABLE__CATALOG);
		createEAttribute(joinTableEClass, JOIN_TABLE__SCHEMA);
		createEReference(joinTableEClass, JOIN_TABLE__JOIN_COLUMNS);
		createEReference(joinTableEClass, JOIN_TABLE__INVERSE_JOIN_COLUMNS);
		createEReference(joinTableEClass, JOIN_TABLE__UNIQUE_CONSTRAINTS);

		lobEClass = createEClass(LOB);

		manyToManyEClass = createEClass(MANY_TO_MANY);
		createEAttribute(manyToManyEClass, MANY_TO_MANY__TARGET_ENTITY);
		createEAttribute(manyToManyEClass, MANY_TO_MANY__CASCADE);
		createEAttribute(manyToManyEClass, MANY_TO_MANY__FETCH);
		createEAttribute(manyToManyEClass, MANY_TO_MANY__MAPPED_BY);

		manyToOneEClass = createEClass(MANY_TO_ONE);
		createEAttribute(manyToOneEClass, MANY_TO_ONE__TARGET_ENTITY);
		createEAttribute(manyToOneEClass, MANY_TO_ONE__CASCADE);
		createEAttribute(manyToOneEClass, MANY_TO_ONE__FETCH);
		createEAttribute(manyToOneEClass, MANY_TO_ONE__OPTIONAL);

		mapKeyEClass = createEClass(MAP_KEY);
		createEAttribute(mapKeyEClass, MAP_KEY__NAME);

		mappedSuperclassEClass = createEClass(MAPPED_SUPERCLASS);

		namedNativeQueriesEClass = createEClass(NAMED_NATIVE_QUERIES);
		createEReference(namedNativeQueriesEClass, NAMED_NATIVE_QUERIES__VALUE);

		namedNativeQueryEClass = createEClass(NAMED_NATIVE_QUERY);
		createEAttribute(namedNativeQueryEClass, NAMED_NATIVE_QUERY__NAME);
		createEAttribute(namedNativeQueryEClass, NAMED_NATIVE_QUERY__QUERY);
		createEReference(namedNativeQueryEClass, NAMED_NATIVE_QUERY__HINTS);
		createEAttribute(namedNativeQueryEClass, NAMED_NATIVE_QUERY__RESULT_CLASS);
		createEAttribute(namedNativeQueryEClass, NAMED_NATIVE_QUERY__RESULT_SET_MAPPING);

		namedQueriesEClass = createEClass(NAMED_QUERIES);
		createEReference(namedQueriesEClass, NAMED_QUERIES__VALUE);

		namedQueryEClass = createEClass(NAMED_QUERY);
		createEAttribute(namedQueryEClass, NAMED_QUERY__NAME);
		createEAttribute(namedQueryEClass, NAMED_QUERY__QUERY);
		createEReference(namedQueryEClass, NAMED_QUERY__HINTS);

		oneToManyEClass = createEClass(ONE_TO_MANY);
		createEAttribute(oneToManyEClass, ONE_TO_MANY__TARGET_ENTITY);
		createEAttribute(oneToManyEClass, ONE_TO_MANY__CASCADE);
		createEAttribute(oneToManyEClass, ONE_TO_MANY__FETCH);
		createEAttribute(oneToManyEClass, ONE_TO_MANY__MAPPED_BY);

		oneToOneEClass = createEClass(ONE_TO_ONE);
		createEAttribute(oneToOneEClass, ONE_TO_ONE__TARGET_ENTITY);
		createEAttribute(oneToOneEClass, ONE_TO_ONE__CASCADE);
		createEAttribute(oneToOneEClass, ONE_TO_ONE__FETCH);
		createEAttribute(oneToOneEClass, ONE_TO_ONE__OPTIONAL);
		createEAttribute(oneToOneEClass, ONE_TO_ONE__MAPPED_BY);

		orderByEClass = createEClass(ORDER_BY);
		createEAttribute(orderByEClass, ORDER_BY__VALUE);

		parameterEClass = createEClass(PARAMETER);
		createEAttribute(parameterEClass, PARAMETER__NAME);
		createEAttribute(parameterEClass, PARAMETER__VALUE);

		persistenceContextEClass = createEClass(PERSISTENCE_CONTEXT);
		createEAttribute(persistenceContextEClass, PERSISTENCE_CONTEXT__NAME);
		createEAttribute(persistenceContextEClass, PERSISTENCE_CONTEXT__UNIT_NAME);
		createEAttribute(persistenceContextEClass, PERSISTENCE_CONTEXT__TYPE);

		persistenceContextsEClass = createEClass(PERSISTENCE_CONTEXTS);
		createEReference(persistenceContextsEClass, PERSISTENCE_CONTEXTS__VALUE);

		persistenceUnitEClass = createEClass(PERSISTENCE_UNIT);
		createEAttribute(persistenceUnitEClass, PERSISTENCE_UNIT__NAME);
		createEAttribute(persistenceUnitEClass, PERSISTENCE_UNIT__UNIT_NAME);

		persistenceUnitsEClass = createEClass(PERSISTENCE_UNITS);
		createEReference(persistenceUnitsEClass, PERSISTENCE_UNITS__VALUE);

		postLoadEClass = createEClass(POST_LOAD);

		postPersistEClass = createEClass(POST_PERSIST);

		postRemoveEClass = createEClass(POST_REMOVE);

		postUpdateEClass = createEClass(POST_UPDATE);

		prePersistEClass = createEClass(PRE_PERSIST);

		preRemoveEClass = createEClass(PRE_REMOVE);

		preUpdateEClass = createEClass(PRE_UPDATE);

		primaryKeyJoinColumnEClass = createEClass(PRIMARY_KEY_JOIN_COLUMN);
		createEAttribute(primaryKeyJoinColumnEClass, PRIMARY_KEY_JOIN_COLUMN__NAME);
		createEAttribute(primaryKeyJoinColumnEClass, PRIMARY_KEY_JOIN_COLUMN__REFERENCED_COLUMN_NAME);
		createEAttribute(primaryKeyJoinColumnEClass, PRIMARY_KEY_JOIN_COLUMN__COLUMN_DEFINITION);

		primaryKeyJoinColumnsEClass = createEClass(PRIMARY_KEY_JOIN_COLUMNS);
		createEReference(primaryKeyJoinColumnsEClass, PRIMARY_KEY_JOIN_COLUMNS__VALUE);

		queryHintEClass = createEClass(QUERY_HINT);
		createEAttribute(queryHintEClass, QUERY_HINT__NAME);
		createEAttribute(queryHintEClass, QUERY_HINT__VALUE);

		secondaryTableEClass = createEClass(SECONDARY_TABLE);
		createEAttribute(secondaryTableEClass, SECONDARY_TABLE__NAME);
		createEAttribute(secondaryTableEClass, SECONDARY_TABLE__CATALOG);
		createEAttribute(secondaryTableEClass, SECONDARY_TABLE__SCHEMA);
		createEReference(secondaryTableEClass, SECONDARY_TABLE__PK_JOIN_COLUMNS);
		createEReference(secondaryTableEClass, SECONDARY_TABLE__UNIQUE_CONSTRAINTS);

		secondaryTablesEClass = createEClass(SECONDARY_TABLES);
		createEReference(secondaryTablesEClass, SECONDARY_TABLES__VALUE);

		sequenceGeneratorEClass = createEClass(SEQUENCE_GENERATOR);
		createEAttribute(sequenceGeneratorEClass, SEQUENCE_GENERATOR__NAME);
		createEAttribute(sequenceGeneratorEClass, SEQUENCE_GENERATOR__SEQUENCE_NAME);
		createEAttribute(sequenceGeneratorEClass, SEQUENCE_GENERATOR__INITIAL_VALUE);
		createEAttribute(sequenceGeneratorEClass, SEQUENCE_GENERATOR__ALLOCATION_SIZE);

		sqlResultSetMappingEClass = createEClass(SQL_RESULT_SET_MAPPING);
		createEAttribute(sqlResultSetMappingEClass, SQL_RESULT_SET_MAPPING__NAME);
		createEReference(sqlResultSetMappingEClass, SQL_RESULT_SET_MAPPING__ENTITIES);
		createEReference(sqlResultSetMappingEClass, SQL_RESULT_SET_MAPPING__COLUMNS);

		tableEClass = createEClass(TABLE);
		createEAttribute(tableEClass, TABLE__NAME);
		createEAttribute(tableEClass, TABLE__CATALOG);
		createEAttribute(tableEClass, TABLE__SCHEMA);
		createEReference(tableEClass, TABLE__UNIQUE_CONSTRAINTS);

		tableGeneratorEClass = createEClass(TABLE_GENERATOR);
		createEAttribute(tableGeneratorEClass, TABLE_GENERATOR__NAME);
		createEAttribute(tableGeneratorEClass, TABLE_GENERATOR__TABLE);
		createEAttribute(tableGeneratorEClass, TABLE_GENERATOR__CATALOG);
		createEAttribute(tableGeneratorEClass, TABLE_GENERATOR__SCHEMA);
		createEAttribute(tableGeneratorEClass, TABLE_GENERATOR__PK_COLUMN_NAME);
		createEAttribute(tableGeneratorEClass, TABLE_GENERATOR__VALUE_COLUMN_NAME);
		createEAttribute(tableGeneratorEClass, TABLE_GENERATOR__PK_COLUMN_VALUE);
		createEAttribute(tableGeneratorEClass, TABLE_GENERATOR__INITIAL_VALUE);
		createEAttribute(tableGeneratorEClass, TABLE_GENERATOR__ALLOCATION_SIZE);
		createEReference(tableGeneratorEClass, TABLE_GENERATOR__UNIQUE_CONSTRAINTS);

		temporalEClass = createEClass(TEMPORAL);
		createEAttribute(temporalEClass, TEMPORAL__VALUE);

		typeEClass = createEClass(TYPE);
		createEAttribute(typeEClass, TYPE__TYPE);
		createEReference(typeEClass, TYPE__PARAMETERS);

		transientEClass = createEClass(TRANSIENT);

		uniqueConstraintEClass = createEClass(UNIQUE_CONSTRAINT);
		createEAttribute(uniqueConstraintEClass, UNIQUE_CONSTRAINT__COLUMN_NAMES);

		versionEClass = createEClass(VERSION);

		indexedEClass = createEClass(INDEXED);
		createEAttribute(indexedEClass, INDEXED__VALUE);

		uniqueEClass = createEClass(UNIQUE);
		createEAttribute(uniqueEClass, UNIQUE__VALUE);

		// Create enums
		cascadeTypeEEnum = createEEnum(CASCADE_TYPE);
		discriminatorTypeEEnum = createEEnum(DISCRIMINATOR_TYPE);
		enumTypeEEnum = createEEnum(ENUM_TYPE);
		fetchTypeEEnum = createEEnum(FETCH_TYPE);
		flushModeTypeEEnum = createEEnum(FLUSH_MODE_TYPE);
		generationTypeEEnum = createEEnum(GENERATION_TYPE);
		inheritanceTypeEEnum = createEEnum(INHERITANCE_TYPE);
		persistenceContextTypeEEnum = createEEnum(PERSISTENCE_CONTEXT_TYPE);
		temporalTypeEEnum = createEEnum(TEMPORAL_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Add supertypes to classes
		attributeOverrideEClass.getESuperTypes().add(this.getPAnnotation());
		attributeOverridesEClass.getESuperTypes().add(this.getPAnnotation());
		associationOverrideEClass.getESuperTypes().add(this.getPAnnotation());
		associationOverridesEClass.getESuperTypes().add(this.getPAnnotation());
		basicEClass.getESuperTypes().add(this.getPAnnotation());
		columnEClass.getESuperTypes().add(this.getPAnnotation());
		columnsEClass.getESuperTypes().add(this.getPAnnotation());
		columnResultEClass.getESuperTypes().add(this.getPAnnotation());
		discriminatorColumnEClass.getESuperTypes().add(this.getPAnnotation());
		discriminatorValueEClass.getESuperTypes().add(this.getPAnnotation());
		embeddableEClass.getESuperTypes().add(this.getPAnnotation());
		embeddedEClass.getESuperTypes().add(this.getPAnnotation());
		embeddedIdEClass.getESuperTypes().add(this.getPAnnotation());
		entityEClass.getESuperTypes().add(this.getPAnnotation());
		entityListenerEClass.getESuperTypes().add(this.getPAnnotation());
		entityResultEClass.getESuperTypes().add(this.getPAnnotation());
		enumeratedEClass.getESuperTypes().add(this.getPAnnotation());
		excludeDefaultListenersEClass.getESuperTypes().add(this.getPAnnotation());
		excludeSuperclassListenersEClass.getESuperTypes().add(this.getPAnnotation());
		fieldResultEClass.getESuperTypes().add(this.getPAnnotation());
		flushModeEClass.getESuperTypes().add(this.getPAnnotation());
		generatedValueEClass.getESuperTypes().add(this.getPAnnotation());
		idEClass.getESuperTypes().add(this.getPAnnotation());
		idBagEClass.getESuperTypes().add(this.getPAnnotation());
		idClassEClass.getESuperTypes().add(this.getPAnnotation());
		inheritanceEClass.getESuperTypes().add(this.getPAnnotation());
		joinColumnEClass.getESuperTypes().add(this.getPAnnotation());
		joinColumnsEClass.getESuperTypes().add(this.getPAnnotation());
		joinTableEClass.getESuperTypes().add(this.getPAnnotation());
		lobEClass.getESuperTypes().add(this.getPAnnotation());
		manyToManyEClass.getESuperTypes().add(this.getPAnnotation());
		manyToOneEClass.getESuperTypes().add(this.getPAnnotation());
		mapKeyEClass.getESuperTypes().add(this.getPAnnotation());
		mappedSuperclassEClass.getESuperTypes().add(this.getPAnnotation());
		namedNativeQueriesEClass.getESuperTypes().add(this.getPAnnotation());
		namedNativeQueryEClass.getESuperTypes().add(this.getPAnnotation());
		namedQueriesEClass.getESuperTypes().add(this.getPAnnotation());
		namedQueryEClass.getESuperTypes().add(this.getPAnnotation());
		oneToManyEClass.getESuperTypes().add(this.getPAnnotation());
		oneToOneEClass.getESuperTypes().add(this.getPAnnotation());
		orderByEClass.getESuperTypes().add(this.getPAnnotation());
		persistenceContextEClass.getESuperTypes().add(this.getPAnnotation());
		persistenceContextsEClass.getESuperTypes().add(this.getPAnnotation());
		persistenceUnitEClass.getESuperTypes().add(this.getPAnnotation());
		persistenceUnitsEClass.getESuperTypes().add(this.getPAnnotation());
		postLoadEClass.getESuperTypes().add(this.getPAnnotation());
		postPersistEClass.getESuperTypes().add(this.getPAnnotation());
		postRemoveEClass.getESuperTypes().add(this.getPAnnotation());
		postUpdateEClass.getESuperTypes().add(this.getPAnnotation());
		prePersistEClass.getESuperTypes().add(this.getPAnnotation());
		preRemoveEClass.getESuperTypes().add(this.getPAnnotation());
		preUpdateEClass.getESuperTypes().add(this.getPAnnotation());
		primaryKeyJoinColumnEClass.getESuperTypes().add(this.getPAnnotation());
		primaryKeyJoinColumnsEClass.getESuperTypes().add(this.getPAnnotation());
		queryHintEClass.getESuperTypes().add(this.getPAnnotation());
		secondaryTableEClass.getESuperTypes().add(this.getPAnnotation());
		secondaryTablesEClass.getESuperTypes().add(this.getPAnnotation());
		sequenceGeneratorEClass.getESuperTypes().add(this.getPAnnotation());
		sqlResultSetMappingEClass.getESuperTypes().add(this.getPAnnotation());
		tableEClass.getESuperTypes().add(this.getPAnnotation());
		tableGeneratorEClass.getESuperTypes().add(this.getPAnnotation());
		temporalEClass.getESuperTypes().add(this.getPAnnotation());
		typeEClass.getESuperTypes().add(this.getPAnnotation());
		transientEClass.getESuperTypes().add(this.getPAnnotation());
		uniqueConstraintEClass.getESuperTypes().add(this.getPAnnotation());
		versionEClass.getESuperTypes().add(this.getPAnnotation());
		indexedEClass.getESuperTypes().add(this.getPAnnotation());
		uniqueEClass.getESuperTypes().add(this.getPAnnotation());

		// Initialize classes and features; add operations and parameters
		initEClass(pAnnotationEClass, PAnnotation.class, "PAnnotation", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPAnnotation_EModelElement(), ecorePackage.getEModelElement(), null, "eModelElement", null, 1, 1, PAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeOverrideEClass, AttributeOverride.class, "AttributeOverride", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttributeOverride_Name(), ecorePackage.getEString(), "name", null, 1, 1, AttributeOverride.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttributeOverride_Column(), this.getColumn(), null, "column", null, 1, 1, AttributeOverride.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeOverridesEClass, AttributeOverrides.class, "AttributeOverrides", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttributeOverrides_Value(), this.getAttributeOverride(), null, "value", null, 1, -1, AttributeOverrides.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(associationOverrideEClass, AssociationOverride.class, "AssociationOverride", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAssociationOverride_Name(), ecorePackage.getEString(), "name", null, 1, 1, AssociationOverride.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssociationOverride_JoinColumns(), this.getJoinColumn(), null, "joinColumns", null, 1, -1, AssociationOverride.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(associationOverridesEClass, AssociationOverrides.class, "AssociationOverrides", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssociationOverrides_Value(), this.getAssociationOverride(), null, "value", null, 1, -1, AssociationOverrides.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(basicEClass, Basic.class, "Basic", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBasic_Fetch(), this.getFetchType(), "fetch", "EAGER", 0, 1, Basic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBasic_Optional(), ecorePackage.getEBoolean(), "optional", "true", 0, 1, Basic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(columnEClass, Column.class, "Column", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getColumn_Name(), ecorePackage.getEString(), "name", null, 0, 1, Column.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColumn_Unique(), ecorePackage.getEBoolean(), "unique", "false", 0, 1, Column.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColumn_Nullable(), ecorePackage.getEBoolean(), "nullable", "true", 0, 1, Column.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColumn_Insertable(), ecorePackage.getEBoolean(), "insertable", "true", 0, 1, Column.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColumn_Updatable(), ecorePackage.getEBoolean(), "updatable", "true", 0, 1, Column.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColumn_ColumnDefinition(), ecorePackage.getEString(), "columnDefinition", null, 0, 1, Column.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColumn_Table(), ecorePackage.getEString(), "table", null, 0, 1, Column.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColumn_Length(), ecorePackage.getEInt(), "length", "255", 0, 1, Column.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColumn_Precision(), ecorePackage.getEInt(), "precision", "0", 0, 1, Column.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColumn_Scale(), ecorePackage.getEInt(), "scale", "0", 0, 1, Column.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(columnsEClass, Columns.class, "Columns", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getColumns_Value(), this.getColumn(), null, "value", null, 1, -1, Columns.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(columnResultEClass, ColumnResult.class, "ColumnResult", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getColumnResult_Name(), ecorePackage.getEString(), "name", null, 0, 1, ColumnResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(discriminatorColumnEClass, DiscriminatorColumn.class, "DiscriminatorColumn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiscriminatorColumn_Name(), ecorePackage.getEString(), "name", "DTYPE", 0, 1, DiscriminatorColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiscriminatorColumn_DiscriminatorType(), this.getDiscriminatorType(), "discriminatorType", "STRING", 0, 1, DiscriminatorColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiscriminatorColumn_ColumnDefinition(), ecorePackage.getEString(), "columnDefinition", null, 0, 1, DiscriminatorColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiscriminatorColumn_Length(), ecorePackage.getEInt(), "length", "31", 0, 1, DiscriminatorColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(discriminatorValueEClass, DiscriminatorValue.class, "DiscriminatorValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiscriminatorValue_Value(), ecorePackage.getEString(), "value", null, 0, 1, DiscriminatorValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(embeddableEClass, Embeddable.class, "Embeddable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(embeddedEClass, Embedded.class, "Embedded", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(embeddedIdEClass, EmbeddedId.class, "EmbeddedId", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(entityEClass, Entity.class, "Entity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEntity_Name(), ecorePackage.getEString(), "name", null, 0, 1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entityListenerEClass, EntityListener.class, "EntityListener", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEntityListener_Value(), ecorePackage.getEString(), "value", null, 0, 1, EntityListener.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entityResultEClass, EntityResult.class, "EntityResult", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEntityResult_EntityClass(), ecorePackage.getEString(), "entityClass", null, 1, 1, EntityResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntityResult_Fields(), this.getFieldResult(), null, "fields", null, 0, -1, EntityResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntityResult_DiscriminatorColumn(), ecorePackage.getEString(), "discriminatorColumn", null, 0, 1, EntityResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enumeratedEClass, Enumerated.class, "Enumerated", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEnumerated_Value(), this.getEnumType(), "value", "ORDINAL", 0, 1, Enumerated.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(excludeDefaultListenersEClass, ExcludeDefaultListeners.class, "ExcludeDefaultListeners", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(excludeSuperclassListenersEClass, ExcludeSuperclassListeners.class, "ExcludeSuperclassListeners", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(fieldResultEClass, FieldResult.class, "FieldResult", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFieldResult_Name(), ecorePackage.getEString(), "name", null, 1, 1, FieldResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFieldResult_Column(), ecorePackage.getEString(), "column", null, 1, 1, FieldResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(flushModeEClass, FlushMode.class, "FlushMode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFlushMode_Value(), this.getFlushModeType(), "value", "AUTO", 0, 1, FlushMode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(generatedValueEClass, GeneratedValue.class, "GeneratedValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGeneratedValue_Strategy(), this.getGenerationType(), "strategy", "AUTO", 0, 1, GeneratedValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGeneratedValue_Generator(), ecorePackage.getEString(), "generator", null, 0, 1, GeneratedValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(idEClass, Id.class, "Id", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(idBagEClass, IdBag.class, "IdBag", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIdBag_Generator(), ecorePackage.getEString(), "generator", "increment", 0, 1, IdBag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIdBag_Type(), ecorePackage.getEString(), "type", "long", 0, 1, IdBag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(idClassEClass, IdClass.class, "IdClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIdClass_Value(), ecorePackage.getEString(), "value", null, 1, 1, IdClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inheritanceEClass, Inheritance.class, "Inheritance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInheritance_Strategy(), this.getInheritanceType(), "strategy", "SINGLE_TABLE", 0, 1, Inheritance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(joinColumnEClass, JoinColumn.class, "JoinColumn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJoinColumn_Name(), ecorePackage.getEString(), "name", null, 0, 1, JoinColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJoinColumn_ReferencedColumnName(), ecorePackage.getEString(), "referencedColumnName", null, 0, 1, JoinColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJoinColumn_Unique(), ecorePackage.getEBoolean(), "unique", "false", 0, 1, JoinColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJoinColumn_Nullable(), ecorePackage.getEBoolean(), "nullable", "true", 0, 1, JoinColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJoinColumn_Insertable(), ecorePackage.getEBoolean(), "insertable", "true", 0, 1, JoinColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJoinColumn_Updatable(), ecorePackage.getEBoolean(), "updatable", "true", 0, 1, JoinColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJoinColumn_ColumnDefinition(), ecorePackage.getEString(), "columnDefinition", null, 0, 1, JoinColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJoinColumn_Table(), ecorePackage.getEString(), "table", null, 0, 1, JoinColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(joinColumnsEClass, JoinColumns.class, "JoinColumns", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJoinColumns_Value(), this.getJoinColumn(), null, "value", null, 1, -1, JoinColumns.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(joinTableEClass, JoinTable.class, "JoinTable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJoinTable_Name(), ecorePackage.getEString(), "name", null, 0, 1, JoinTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJoinTable_Catalog(), ecorePackage.getEString(), "catalog", null, 0, 1, JoinTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJoinTable_Schema(), ecorePackage.getEString(), "schema", null, 0, 1, JoinTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJoinTable_JoinColumns(), this.getJoinColumn(), null, "joinColumns", null, 0, -1, JoinTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJoinTable_InverseJoinColumns(), this.getJoinColumn(), null, "inverseJoinColumns", null, 0, -1, JoinTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJoinTable_UniqueConstraints(), this.getUniqueConstraint(), null, "uniqueConstraints", null, 0, -1, JoinTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lobEClass, Lob.class, "Lob", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(manyToManyEClass, ManyToMany.class, "ManyToMany", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getManyToMany_TargetEntity(), ecorePackage.getEString(), "targetEntity", null, 0, 1, ManyToMany.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getManyToMany_Cascade(), this.getCascadeType(), "cascade", null, 0, -1, ManyToMany.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getManyToMany_Fetch(), this.getFetchType(), "fetch", "LAZY", 0, 1, ManyToMany.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getManyToMany_MappedBy(), ecorePackage.getEString(), "mappedBy", null, 0, 1, ManyToMany.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(manyToOneEClass, ManyToOne.class, "ManyToOne", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getManyToOne_TargetEntity(), ecorePackage.getEString(), "targetEntity", null, 0, 1, ManyToOne.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getManyToOne_Cascade(), this.getCascadeType(), "cascade", null, 0, -1, ManyToOne.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getManyToOne_Fetch(), this.getFetchType(), "fetch", "EAGER", 0, 1, ManyToOne.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getManyToOne_Optional(), ecorePackage.getEBoolean(), "optional", "true", 0, 1, ManyToOne.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mapKeyEClass, MapKey.class, "MapKey", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMapKey_Name(), ecorePackage.getEString(), "name", null, 0, 1, MapKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mappedSuperclassEClass, MappedSuperclass.class, "MappedSuperclass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(namedNativeQueriesEClass, NamedNativeQueries.class, "NamedNativeQueries", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNamedNativeQueries_Value(), this.getNamedNativeQuery(), null, "value", null, 0, -1, NamedNativeQueries.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(namedNativeQueryEClass, NamedNativeQuery.class, "NamedNativeQuery", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedNativeQuery_Name(), ecorePackage.getEString(), "name", null, 1, 1, NamedNativeQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNamedNativeQuery_Query(), ecorePackage.getEString(), "query", null, 1, 1, NamedNativeQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNamedNativeQuery_Hints(), this.getQueryHint(), null, "hints", null, 0, -1, NamedNativeQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNamedNativeQuery_ResultClass(), ecorePackage.getEString(), "resultClass", null, 0, 1, NamedNativeQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNamedNativeQuery_ResultSetMapping(), ecorePackage.getEString(), "resultSetMapping", null, 0, 1, NamedNativeQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(namedQueriesEClass, NamedQueries.class, "NamedQueries", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNamedQueries_Value(), this.getNamedQuery(), null, "value", null, 0, -1, NamedQueries.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(namedQueryEClass, NamedQuery.class, "NamedQuery", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedQuery_Name(), ecorePackage.getEString(), "name", null, 1, 1, NamedQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNamedQuery_Query(), ecorePackage.getEString(), "query", null, 1, 1, NamedQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNamedQuery_Hints(), this.getQueryHint(), null, "hints", null, 0, -1, NamedQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(oneToManyEClass, OneToMany.class, "OneToMany", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOneToMany_TargetEntity(), ecorePackage.getEString(), "targetEntity", null, 0, 1, OneToMany.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOneToMany_Cascade(), this.getCascadeType(), "cascade", null, 0, -1, OneToMany.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOneToMany_Fetch(), this.getFetchType(), "fetch", "LAZY", 0, 1, OneToMany.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOneToMany_MappedBy(), ecorePackage.getEString(), "mappedBy", null, 0, 1, OneToMany.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(oneToOneEClass, OneToOne.class, "OneToOne", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOneToOne_TargetEntity(), ecorePackage.getEString(), "targetEntity", null, 0, 1, OneToOne.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOneToOne_Cascade(), this.getCascadeType(), "cascade", null, 0, -1, OneToOne.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOneToOne_Fetch(), this.getFetchType(), "fetch", "EAGER", 0, 1, OneToOne.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOneToOne_Optional(), ecorePackage.getEBoolean(), "optional", "true", 0, 1, OneToOne.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOneToOne_MappedBy(), ecorePackage.getEString(), "mappedBy", null, 0, 1, OneToOne.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(orderByEClass, OrderBy.class, "OrderBy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrderBy_Value(), ecorePackage.getEString(), "value", null, 0, 1, OrderBy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParameter_Name(), ecorePackage.getEString(), "name", null, 1, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_Value(), ecorePackage.getEString(), "value", null, 1, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(persistenceContextEClass, PersistenceContext.class, "PersistenceContext", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPersistenceContext_Name(), ecorePackage.getEString(), "name", null, 0, 1, PersistenceContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersistenceContext_UnitName(), ecorePackage.getEString(), "unitName", null, 0, 1, PersistenceContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersistenceContext_Type(), this.getPersistenceContextType(), "type", "TRANSACTION", 0, 1, PersistenceContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(persistenceContextsEClass, PersistenceContexts.class, "PersistenceContexts", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPersistenceContexts_Value(), this.getPersistenceContext(), null, "value", null, 0, -1, PersistenceContexts.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(persistenceUnitEClass, PersistenceUnit.class, "PersistenceUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPersistenceUnit_Name(), ecorePackage.getEString(), "name", null, 0, 1, PersistenceUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersistenceUnit_UnitName(), ecorePackage.getEString(), "unitName", null, 0, 1, PersistenceUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(persistenceUnitsEClass, PersistenceUnits.class, "PersistenceUnits", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPersistenceUnits_Value(), this.getPersistenceUnit(), null, "value", null, 0, -1, PersistenceUnits.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(postLoadEClass, PostLoad.class, "PostLoad", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(postPersistEClass, PostPersist.class, "PostPersist", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(postRemoveEClass, PostRemove.class, "PostRemove", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(postUpdateEClass, PostUpdate.class, "PostUpdate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(prePersistEClass, PrePersist.class, "PrePersist", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(preRemoveEClass, PreRemove.class, "PreRemove", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(preUpdateEClass, PreUpdate.class, "PreUpdate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(primaryKeyJoinColumnEClass, PrimaryKeyJoinColumn.class, "PrimaryKeyJoinColumn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPrimaryKeyJoinColumn_Name(), ecorePackage.getEString(), "name", null, 0, 1, PrimaryKeyJoinColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPrimaryKeyJoinColumn_ReferencedColumnName(), ecorePackage.getEString(), "referencedColumnName", null, 0, 1, PrimaryKeyJoinColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPrimaryKeyJoinColumn_ColumnDefinition(), ecorePackage.getEString(), "columnDefinition", null, 0, 1, PrimaryKeyJoinColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(primaryKeyJoinColumnsEClass, PrimaryKeyJoinColumns.class, "PrimaryKeyJoinColumns", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPrimaryKeyJoinColumns_Value(), this.getPrimaryKeyJoinColumn(), null, "value", null, 1, -1, PrimaryKeyJoinColumns.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(queryHintEClass, QueryHint.class, "QueryHint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQueryHint_Name(), ecorePackage.getEString(), "name", null, 0, 1, QueryHint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQueryHint_Value(), ecorePackage.getEString(), "value", null, 0, 1, QueryHint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(secondaryTableEClass, SecondaryTable.class, "SecondaryTable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSecondaryTable_Name(), ecorePackage.getEString(), "name", null, 1, 1, SecondaryTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSecondaryTable_Catalog(), ecorePackage.getEString(), "catalog", null, 0, 1, SecondaryTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSecondaryTable_Schema(), ecorePackage.getEString(), "schema", null, 0, 1, SecondaryTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSecondaryTable_PkJoinColumns(), this.getPrimaryKeyJoinColumn(), null, "pkJoinColumns", null, 0, -1, SecondaryTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSecondaryTable_UniqueConstraints(), this.getUniqueConstraint(), null, "uniqueConstraints", null, 0, -1, SecondaryTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(secondaryTablesEClass, SecondaryTables.class, "SecondaryTables", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSecondaryTables_Value(), this.getSecondaryTable(), null, "value", null, 1, -1, SecondaryTables.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sequenceGeneratorEClass, SequenceGenerator.class, "SequenceGenerator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSequenceGenerator_Name(), ecorePackage.getEString(), "name", null, 1, 1, SequenceGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSequenceGenerator_SequenceName(), ecorePackage.getEString(), "sequenceName", null, 0, 1, SequenceGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSequenceGenerator_InitialValue(), ecorePackage.getEInt(), "initialValue", "0", 0, 1, SequenceGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSequenceGenerator_AllocationSize(), ecorePackage.getEInt(), "allocationSize", "50", 0, 1, SequenceGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sqlResultSetMappingEClass, SqlResultSetMapping.class, "SqlResultSetMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSqlResultSetMapping_Name(), ecorePackage.getEString(), "name", null, 1, 1, SqlResultSetMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSqlResultSetMapping_Entities(), this.getEntityResult(), null, "entities", null, 0, -1, SqlResultSetMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSqlResultSetMapping_Columns(), this.getColumnResult(), null, "columns", null, 0, -1, SqlResultSetMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tableEClass, Table.class, "Table", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTable_Name(), ecorePackage.getEString(), "name", null, 0, 1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTable_Catalog(), ecorePackage.getEString(), "catalog", null, 0, 1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTable_Schema(), ecorePackage.getEString(), "schema", null, 0, 1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTable_UniqueConstraints(), this.getUniqueConstraint(), null, "uniqueConstraints", null, 0, -1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tableGeneratorEClass, TableGenerator.class, "TableGenerator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTableGenerator_Name(), ecorePackage.getEString(), "name", null, 1, 1, TableGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTableGenerator_Table(), ecorePackage.getEString(), "table", null, 0, 1, TableGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTableGenerator_Catalog(), ecorePackage.getEString(), "catalog", null, 0, 1, TableGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTableGenerator_Schema(), ecorePackage.getEString(), "schema", null, 0, 1, TableGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTableGenerator_PkColumnName(), ecorePackage.getEString(), "pkColumnName", null, 0, 1, TableGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTableGenerator_ValueColumnName(), ecorePackage.getEString(), "valueColumnName", null, 0, 1, TableGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTableGenerator_PkColumnValue(), ecorePackage.getEString(), "pkColumnValue", null, 0, 1, TableGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTableGenerator_InitialValue(), ecorePackage.getEInt(), "initialValue", "0", 0, 1, TableGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTableGenerator_AllocationSize(), ecorePackage.getEInt(), "allocationSize", "50", 0, 1, TableGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTableGenerator_UniqueConstraints(), this.getUniqueConstraint(), null, "uniqueConstraints", null, 0, -1, TableGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(temporalEClass, Temporal.class, "Temporal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTemporal_Value(), this.getTemporalType(), "value", "TIMESTAMP", 0, 1, Temporal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeEClass, Type.class, "Type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getType_Type(), ecorePackage.getEString(), "type", null, 1, 1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getType_Parameters(), this.getParameter(), null, "parameters", null, 0, -1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transientEClass, Transient.class, "Transient", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(uniqueConstraintEClass, UniqueConstraint.class, "UniqueConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUniqueConstraint_ColumnNames(), ecorePackage.getEString(), "columnNames", null, 1, -1, UniqueConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(versionEClass, Version.class, "Version", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(indexedEClass, Indexed.class, "Indexed", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIndexed_Value(), ecorePackage.getEBoolean(), "value", null, 0, 1, Indexed.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uniqueEClass, Unique.class, "Unique", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUnique_Value(), ecorePackage.getEBoolean(), "value", null, 0, 1, Unique.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(cascadeTypeEEnum, CascadeType.class, "CascadeType");
		addEEnumLiteral(cascadeTypeEEnum, CascadeType.ALL_LITERAL);
		addEEnumLiteral(cascadeTypeEEnum, CascadeType.PERSIST_LITERAL);
		addEEnumLiteral(cascadeTypeEEnum, CascadeType.MERGE_LITERAL);
		addEEnumLiteral(cascadeTypeEEnum, CascadeType.REMOVE_LITERAL);
		addEEnumLiteral(cascadeTypeEEnum, CascadeType.REFRESH_LITERAL);

		initEEnum(discriminatorTypeEEnum, DiscriminatorType.class, "DiscriminatorType");
		addEEnumLiteral(discriminatorTypeEEnum, DiscriminatorType.STRING_LITERAL);
		addEEnumLiteral(discriminatorTypeEEnum, DiscriminatorType.CHAR_LITERAL);
		addEEnumLiteral(discriminatorTypeEEnum, DiscriminatorType.INTEGER_LITERAL);

		initEEnum(enumTypeEEnum, EnumType.class, "EnumType");
		addEEnumLiteral(enumTypeEEnum, EnumType.ORDINAL_LITERAL);
		addEEnumLiteral(enumTypeEEnum, EnumType.STRING_LITERAL);

		initEEnum(fetchTypeEEnum, FetchType.class, "FetchType");
		addEEnumLiteral(fetchTypeEEnum, FetchType.LAZY_LITERAL);
		addEEnumLiteral(fetchTypeEEnum, FetchType.EAGER_LITERAL);

		initEEnum(flushModeTypeEEnum, FlushModeType.class, "FlushModeType");
		addEEnumLiteral(flushModeTypeEEnum, FlushModeType.AUTO_LITERAL);
		addEEnumLiteral(flushModeTypeEEnum, FlushModeType.COMMIT_LITERAL);

		initEEnum(generationTypeEEnum, GenerationType.class, "GenerationType");
		addEEnumLiteral(generationTypeEEnum, GenerationType.TABLE_LITERAL);
		addEEnumLiteral(generationTypeEEnum, GenerationType.SEQUENCE_LITERAL);
		addEEnumLiteral(generationTypeEEnum, GenerationType.IDENTITY_LITERAL);
		addEEnumLiteral(generationTypeEEnum, GenerationType.AUTO_LITERAL);

		initEEnum(inheritanceTypeEEnum, InheritanceType.class, "InheritanceType");
		addEEnumLiteral(inheritanceTypeEEnum, InheritanceType.SINGLE_TABLE_LITERAL);
		addEEnumLiteral(inheritanceTypeEEnum, InheritanceType.TABLE_PER_CLASS_LITERAL);
		addEEnumLiteral(inheritanceTypeEEnum, InheritanceType.JOINED_LITERAL);

		initEEnum(persistenceContextTypeEEnum, PersistenceContextType.class, "PersistenceContextType");
		addEEnumLiteral(persistenceContextTypeEEnum, PersistenceContextType.TRANSACTION_LITERAL);
		addEEnumLiteral(persistenceContextTypeEEnum, PersistenceContextType.EXTENDED_LITERAL);

		initEEnum(temporalTypeEEnum, TemporalType.class, "TemporalType");
		addEEnumLiteral(temporalTypeEEnum, TemporalType.DATE_LITERAL);
		addEEnumLiteral(temporalTypeEEnum, TemporalType.TIME_LITERAL);
		addEEnumLiteral(temporalTypeEEnum, TemporalType.TIMESTAMP_LITERAL);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2004/EmfaticAnnotationMap
		createEmfaticAnnotationMapAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://annotation.elver.org/internal/Target
		createTargetAnnotations();
		// http://annotation.elver.org/internal/Collection
		createCollectionAnnotations();
		// http://annotation.elver.org/internal/Unsupported
		createUnsupportedAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2004/EmfaticAnnotationMap</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEmfaticAnnotationMapAnnotations() {
		String source = "http://www.eclipse.org/emf/2004/EmfaticAnnotationMap";		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "Target", "http://annotation.elver.org/internal/Target",
			 "Unsupported", "http://annotation.elver.org/internal/Unsupported"
		   });																																																																																																																				
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";			
		addAnnotation
		  (pAnnotationEClass, 
		   source, 
		   new String[] {
			 "constraints", "CompatibleEModelElementType AnnotationIsSupported"
		   });									
		addAnnotation
		  (basicEClass, 
		   source, 
		   new String[] {
			 "constraints", "AllowedElementType"
		   });				
		addAnnotation
		  (columnEClass, 
		   source, 
		   new String[] {
			 "constraints", "ScalePrecisionForNumeric LengthForString"
		   });						
		addAnnotation
		  (discriminatorValueEClass, 
		   source, 
		   new String[] {
			 "constraints", "NoAbstract"
		   });			
		addAnnotation
		  (embeddableEClass, 
		   source, 
		   new String[] {
			 "constraints", "NoInterface"
		   });			
		addAnnotation
		  (embeddedEClass, 
		   source, 
		   new String[] {
			 "constraints", "EmbedByValue"
		   });			
		addAnnotation
		  (embeddedIdEClass, 
		   source, 
		   new String[] {
			 "constraints", "EmbedByValue"
		   });			
		addAnnotation
		  (entityEClass, 
		   source, 
		   new String[] {
			 "constraints", "NoInterface NoReservedName"
		   });						
		addAnnotation
		  (enumeratedEClass, 
		   source, 
		   new String[] {
			 "constraints", "AllowedElementType"
		   });											
		addAnnotation
		  (idEClass, 
		   source, 
		   new String[] {
			 "constraints", "AllowedElementType"
		   });											
		addAnnotation
		  (lobEClass, 
		   source, 
		   new String[] {
			 "constraints", "AllowedType"
		   });			
		addAnnotation
		  (manyToManyEClass, 
		   source, 
		   new String[] {
			 "constraints", "IsManyValued"
		   });			
		addAnnotation
		  (manyToOneEClass, 
		   source, 
		   new String[] {
			 "constraints", "IsNotManyValued"
		   });					
		addAnnotation
		  (mappedSuperclassEClass, 
		   source, 
		   new String[] {
			 "constraints", "NoInterface"
		   });											
		addAnnotation
		  (oneToManyEClass, 
		   source, 
		   new String[] {
			 "constraints", "IsManyValued"
		   });			
		addAnnotation
		  (oneToOneEClass, 
		   source, 
		   new String[] {
			 "constraints", "IsNotManyValued"
		   });			
		addAnnotation
		  (orderByEClass, 
		   source, 
		   new String[] {
			 "constraints", "WellFormedOrder IsManyValued"
		   });																																							
		addAnnotation
		  (temporalEClass, 
		   source, 
		   new String[] {
			 "constraints", "AllowedElementType"
		   });					
		addAnnotation
		  (versionEClass, 
		   source, 
		   new String[] {
			 "constraints", "AllowedElementType"
		   });		
	}

	/**
	 * Initializes the annotations for <b>http://annotation.elver.org/internal/Target</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createTargetAnnotations() {
		String source = "http://annotation.elver.org/internal/Target";				
		addAnnotation
		  (attributeOverrideEClass, 
		   source, 
		   new String[] {
			 "0", "EClass",
			 "1", "EStructuralFeature"
		   });			
		addAnnotation
		  (attributeOverridesEClass, 
		   source, 
		   new String[] {
			 "0", "EClass",
			 "1", "EStructuralFeature"
		   });		
		addAnnotation
		  (associationOverrideEClass, 
		   source, 
		   new String[] {
			 "0", "EClass"
		   });			
		addAnnotation
		  (associationOverridesEClass, 
		   source, 
		   new String[] {
			 "0", "EClass"
		   });		
		addAnnotation
		  (basicEClass, 
		   source, 
		   new String[] {
			 "0", "EAttribute"
		   });			
		addAnnotation
		  (columnEClass, 
		   source, 
		   new String[] {
			 "0", "EStructuralFeature"
		   });				
		addAnnotation
		  (columnsEClass, 
		   source, 
		   new String[] {
			 "0", "EStructuralFeature"
		   });			
		addAnnotation
		  (discriminatorColumnEClass, 
		   source, 
		   new String[] {
			 "0", "EClass"
		   });		
		addAnnotation
		  (discriminatorValueEClass, 
		   source, 
		   new String[] {
			 "0", "EClass"
		   });			
		addAnnotation
		  (embeddableEClass, 
		   source, 
		   new String[] {
			 "0", "EClass"
		   });			
		addAnnotation
		  (embeddedEClass, 
		   source, 
		   new String[] {
			 "0", "EReference"
		   });			
		addAnnotation
		  (embeddedIdEClass, 
		   source, 
		   new String[] {
			 "0", "EReference"
		   });			
		addAnnotation
		  (entityEClass, 
		   source, 
		   new String[] {
			 "0", "EClass"
		   });			
		addAnnotation
		  (entityListenerEClass, 
		   source, 
		   new String[] {
			 "0", "EClass"
		   });				
		addAnnotation
		  (enumeratedEClass, 
		   source, 
		   new String[] {
			 "0", "EStructuralFeature"
		   });			
		addAnnotation
		  (excludeDefaultListenersEClass, 
		   source, 
		   new String[] {
			 "0", "EClass"
		   });			
		addAnnotation
		  (excludeSuperclassListenersEClass, 
		   source, 
		   new String[] {
			 "0", "EClass"
		   });				
		addAnnotation
		  (flushModeEClass, 
		   source, 
		   new String[] {
			 "0", "EClass",
			 "1", "EOperation"
		   });			
		addAnnotation
		  (generatedValueEClass, 
		   source, 
		   new String[] {
			 "0", "EAttribute"
		   });		
		addAnnotation
		  (idEClass, 
		   source, 
		   new String[] {
			 "0", "EAttribute"
		   });			
		addAnnotation
		  (idBagEClass, 
		   source, 
		   new String[] {
			 "0", "EStructuralFeature"
		   });		
		addAnnotation
		  (idClassEClass, 
		   source, 
		   new String[] {
			 "0", "EClass"
		   });			
		addAnnotation
		  (inheritanceEClass, 
		   source, 
		   new String[] {
			 "0", "EClass"
		   });		
		addAnnotation
		  (joinColumnEClass, 
		   source, 
		   new String[] {
			 "0", "EClass",
			 "1", "EReference"
		   });			
		addAnnotation
		  (joinColumnsEClass, 
		   source, 
		   new String[] {
			 "0", "EReference"
		   });		
		addAnnotation
		  (joinTableEClass, 
		   source, 
		   new String[] {
			 "0", "EStructuralFeature"
		   });		
		addAnnotation
		  (lobEClass, 
		   source, 
		   new String[] {
			 "0", "EAttribute"
		   });			
		addAnnotation
		  (manyToManyEClass, 
		   source, 
		   new String[] {
			 "0", "EReference"
		   });			
		addAnnotation
		  (manyToOneEClass, 
		   source, 
		   new String[] {
			 "0", "EReference"
		   });			
		addAnnotation
		  (mapKeyEClass, 
		   source, 
		   new String[] {
			 "0", "EStructuralFeature"
		   });			
		addAnnotation
		  (mappedSuperclassEClass, 
		   source, 
		   new String[] {
			 "0", "EClass"
		   });			
		addAnnotation
		  (namedNativeQueriesEClass, 
		   source, 
		   new String[] {
			 "0", "EClass",
			 "1", "EPackage"
		   });			
		addAnnotation
		  (namedNativeQueryEClass, 
		   source, 
		   new String[] {
			 "0", "EClass",
			 "1", "EPackage"
		   });			
		addAnnotation
		  (namedQueriesEClass, 
		   source, 
		   new String[] {
			 "0", "EClass",
			 "1", "EPackage"
		   });			
		addAnnotation
		  (namedQueryEClass, 
		   source, 
		   new String[] {
			 "0", "EClass",
			 "1", "EPackage"
		   });			
		addAnnotation
		  (oneToManyEClass, 
		   source, 
		   new String[] {
			 "0", "EStructuralFeature"
		   });			
		addAnnotation
		  (oneToOneEClass, 
		   source, 
		   new String[] {
			 "0", "EReference"
		   });			
		addAnnotation
		  (orderByEClass, 
		   source, 
		   new String[] {
			 "0", "EReference"
		   });			
		addAnnotation
		  (persistenceContextEClass, 
		   source, 
		   new String[] {
			 "0", "EClass",
			 "1", "EStructuralFeature",
			 "2", "EOperation",
			 "3", "EAnnotation"
		   });			
		addAnnotation
		  (persistenceContextsEClass, 
		   source, 
		   new String[] {
			 "0", "EClass",
			 "1", "EStructuralFeature",
			 "2", "EOperation",
			 "3", "EParameter"
		   });			
		addAnnotation
		  (persistenceUnitEClass, 
		   source, 
		   new String[] {
			 "0", "EClass",
			 "1", "EStructuralFeature",
			 "2", "EOperation",
			 "3", "EAnnotation"
		   });			
		addAnnotation
		  (persistenceUnitsEClass, 
		   source, 
		   new String[] {
			 "0", "EClass"
		   });			
		addAnnotation
		  (postLoadEClass, 
		   source, 
		   new String[] {
			 "0", "EOperation"
		   });			
		addAnnotation
		  (postPersistEClass, 
		   source, 
		   new String[] {
			 "0", "EOperation"
		   });			
		addAnnotation
		  (postRemoveEClass, 
		   source, 
		   new String[] {
			 "2", "EOperation"
		   });			
		addAnnotation
		  (postUpdateEClass, 
		   source, 
		   new String[] {
			 "0", "EOperation"
		   });			
		addAnnotation
		  (prePersistEClass, 
		   source, 
		   new String[] {
			 "0", "EOperation"
		   });			
		addAnnotation
		  (preRemoveEClass, 
		   source, 
		   new String[] {
			 "0", "EOperation"
		   });			
		addAnnotation
		  (preUpdateEClass, 
		   source, 
		   new String[] {
			 "0", "EOperation"
		   });			
		addAnnotation
		  (primaryKeyJoinColumnEClass, 
		   source, 
		   new String[] {
			 "0", "EClass",
			 "1", "EReference"
		   });			
		addAnnotation
		  (primaryKeyJoinColumnsEClass, 
		   source, 
		   new String[] {
			 "0", "EClass"
		   });			
		addAnnotation
		  (secondaryTableEClass, 
		   source, 
		   new String[] {
			 "0", "EClass"
		   });				
		addAnnotation
		  (secondaryTablesEClass, 
		   source, 
		   new String[] {
			 "0", "EClass"
		   });			
		addAnnotation
		  (sequenceGeneratorEClass, 
		   source, 
		   new String[] {
			 "0", "EClass",
			 "1", "EStructuralFeature",
			 "2", "EPackage"
		   });		
		addAnnotation
		  (sqlResultSetMappingEClass, 
		   source, 
		   new String[] {
			 "0", "EClass",
			 "1", "EOperation",
			 "2", "EPackage"
		   });			
		addAnnotation
		  (tableEClass, 
		   source, 
		   new String[] {
			 "0", "EClass"
		   });		
		addAnnotation
		  (tableGeneratorEClass, 
		   source, 
		   new String[] {
			 "0", "EClass",
			 "1", "EStructuralFeature",
			 "2", "EPackage"
		   });		
		addAnnotation
		  (temporalEClass, 
		   source, 
		   new String[] {
			 "0", "EAttribute"
		   });			
		addAnnotation
		  (typeEClass, 
		   source, 
		   new String[] {
			 "0", "EAttribute"
		   });		
		addAnnotation
		  (transientEClass, 
		   source, 
		   new String[] {
			 "0", "EModelElement"
		   });		
		addAnnotation
		  (versionEClass, 
		   source, 
		   new String[] {
			 "0", "EAttribute"
		   });			
		addAnnotation
		  (indexedEClass, 
		   source, 
		   new String[] {
			 "0", "EStructuralFeature"
		   });		
		addAnnotation
		  (uniqueEClass, 
		   source, 
		   new String[] {
			 "0", "EStructuralFeature"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://annotation.elver.org/internal/Collection</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createCollectionAnnotations() {
		String source = "http://annotation.elver.org/internal/Collection";					
		addAnnotation
		  (attributeOverrideEClass, 
		   source, 
		   new String[] {
			 "name", "AttributeOverrides"
		   });				
		addAnnotation
		  (associationOverrideEClass, 
		   source, 
		   new String[] {
			 "name", "AssociationOverrides"
		   });						
		addAnnotation
		  (columnEClass, 
		   source, 
		   new String[] {
			 "name", "Columns"
		   });																																				
		addAnnotation
		  (joinColumnEClass, 
		   source, 
		   new String[] {
			 "name", "JoinColumns"
		   });																																																			
		addAnnotation
		  (primaryKeyJoinColumnEClass, 
		   source, 
		   new String[] {
			 "name", "PrimaryKeyJoinColumns"
		   });						
		addAnnotation
		  (secondaryTableEClass, 
		   source, 
		   new String[] {
			 "name", "SecondaryTables"
		   });															
	}

	/**
	 * Initializes the annotations for <b>http://annotation.elver.org/internal/Unsupported</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUnsupportedAnnotations() {
		String source = "http://annotation.elver.org/internal/Unsupported";																
		addAnnotation
		  (columnResultEClass, 
		   source, 
		   new String[] {
		   });														
		addAnnotation
		  (entityListenerEClass, 
		   source, 
		   new String[] {
		   });		
		addAnnotation
		  (entityResultEClass, 
		   source, 
		   new String[] {
		   });					
		addAnnotation
		  (excludeDefaultListenersEClass, 
		   source, 
		   new String[] {
		   });			
		addAnnotation
		  (excludeSuperclassListenersEClass, 
		   source, 
		   new String[] {
		   });		
		addAnnotation
		  (fieldResultEClass, 
		   source, 
		   new String[] {
		   });			
		addAnnotation
		  (flushModeEClass, 
		   source, 
		   new String[] {
		   });							
		addAnnotation
		  (idClassEClass, 
		   source, 
		   new String[] {
		   });														
		addAnnotation
		  (mapKeyEClass, 
		   source, 
		   new String[] {
		   });					
		addAnnotation
		  (namedNativeQueriesEClass, 
		   source, 
		   new String[] {
		   });			
		addAnnotation
		  (namedNativeQueryEClass, 
		   source, 
		   new String[] {
		   });			
		addAnnotation
		  (namedQueriesEClass, 
		   source, 
		   new String[] {
		   });			
		addAnnotation
		  (namedQueryEClass, 
		   source, 
		   new String[] {
		   });									
		addAnnotation
		  (persistenceContextEClass, 
		   source, 
		   new String[] {
		   });			
		addAnnotation
		  (persistenceContextsEClass, 
		   source, 
		   new String[] {
		   });			
		addAnnotation
		  (persistenceUnitEClass, 
		   source, 
		   new String[] {
		   });			
		addAnnotation
		  (persistenceUnitsEClass, 
		   source, 
		   new String[] {
		   });			
		addAnnotation
		  (postLoadEClass, 
		   source, 
		   new String[] {
		   });			
		addAnnotation
		  (postPersistEClass, 
		   source, 
		   new String[] {
		   });			
		addAnnotation
		  (postRemoveEClass, 
		   source, 
		   new String[] {
		   });			
		addAnnotation
		  (postUpdateEClass, 
		   source, 
		   new String[] {
		   });			
		addAnnotation
		  (prePersistEClass, 
		   source, 
		   new String[] {
		   });			
		addAnnotation
		  (preRemoveEClass, 
		   source, 
		   new String[] {
		   });			
		addAnnotation
		  (preUpdateEClass, 
		   source, 
		   new String[] {
		   });					
		addAnnotation
		  (queryHintEClass, 
		   source, 
		   new String[] {
		   });			
		addAnnotation
		  (secondaryTableEClass, 
		   source, 
		   new String[] {
		   });				
		addAnnotation
		  (secondaryTablesEClass, 
		   source, 
		   new String[] {
		   });				
		addAnnotation
		  (sqlResultSetMappingEClass, 
		   source, 
		   new String[] {
		   });										
	}

	/**
	 * Compute the list of targets starting from the <code>java.lang.annotation.Target</code>
	 * annotation.
	 */
	public EClass[] getTargets(EClass pAnnotationEClass) {
		// TODO cache result
		EClass[] result = null;
		if (getPAnnotation().isSuperTypeOf(pAnnotationEClass)) {
			EAnnotation targetAnnotation = pAnnotationEClass.getEAnnotation(TARGET_ANNOTATION_SOURCE);
			Collection targets = targetAnnotation != null ? targetAnnotation.getDetails().values() : Collections.EMPTY_LIST;
			result = new EClass[targets.size()];
			int j = 0;
			for (Iterator i=targets.iterator(); i.hasNext(); j++) {
				EClassifier eClassifier = EcorePackage.eINSTANCE.getEClassifier((String) i.next());
				result[j] = eClassifier instanceof EClass ? (EClass) eClassifier : null;
			}
		}
		return result;
	}

	/**
	 * Compute if the given targetElementEClass is a target for the pAnnotation EClass
	 * basing on the <code>java.lang.annotation.Target</code> annotation.
	 */
	public boolean isTarget(EClass pAnnotationEClass, EClass targetElementEClass) {
		boolean hasTarget = false;
		if (getPAnnotation().isSuperTypeOf(pAnnotationEClass)) {
			EClass[] admissibleTargets = getTargets(pAnnotationEClass);
			for (int i=0; !hasTarget && i < admissibleTargets.length; i++)
				hasTarget |= admissibleTargets[i].isSuperTypeOf(targetElementEClass);
		}
		
		return hasTarget;
	}

} //PannotationPackageImpl

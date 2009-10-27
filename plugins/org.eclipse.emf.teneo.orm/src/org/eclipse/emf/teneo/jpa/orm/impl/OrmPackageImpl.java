/**
 * <copyright>
 * </copyright>
 *
 * $Id: OrmPackageImpl.java,v 1.4 2009/10/27 23:13:29 mtaal Exp $
 */
package org.eclipse.emf.teneo.jpa.orm.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.eclipse.emf.teneo.jpa.orm.AccessType;
import org.eclipse.emf.teneo.jpa.orm.AssociationOverride;
import org.eclipse.emf.teneo.jpa.orm.AttributeOverride;
import org.eclipse.emf.teneo.jpa.orm.Attributes;
import org.eclipse.emf.teneo.jpa.orm.Basic;
import org.eclipse.emf.teneo.jpa.orm.CascadeType;
import org.eclipse.emf.teneo.jpa.orm.Column;
import org.eclipse.emf.teneo.jpa.orm.ColumnResult;
import org.eclipse.emf.teneo.jpa.orm.DiscriminatorColumn;
import org.eclipse.emf.teneo.jpa.orm.DiscriminatorType;
import org.eclipse.emf.teneo.jpa.orm.DocumentRoot;
import org.eclipse.emf.teneo.jpa.orm.Embeddable;
import org.eclipse.emf.teneo.jpa.orm.EmbeddableAttributes;
import org.eclipse.emf.teneo.jpa.orm.Embedded;
import org.eclipse.emf.teneo.jpa.orm.EmbeddedId;
import org.eclipse.emf.teneo.jpa.orm.EmptyType;
import org.eclipse.emf.teneo.jpa.orm.Entity;
import org.eclipse.emf.teneo.jpa.orm.EntityListener;
import org.eclipse.emf.teneo.jpa.orm.EntityListeners;
import org.eclipse.emf.teneo.jpa.orm.EntityMappingsType;
import org.eclipse.emf.teneo.jpa.orm.EntityResult;
import org.eclipse.emf.teneo.jpa.orm.EnumType;
import org.eclipse.emf.teneo.jpa.orm.FetchType;
import org.eclipse.emf.teneo.jpa.orm.FieldResult;
import org.eclipse.emf.teneo.jpa.orm.GeneratedValue;
import org.eclipse.emf.teneo.jpa.orm.GenerationType;
import org.eclipse.emf.teneo.jpa.orm.Id;
import org.eclipse.emf.teneo.jpa.orm.IdClass;
import org.eclipse.emf.teneo.jpa.orm.Inheritance;
import org.eclipse.emf.teneo.jpa.orm.InheritanceType;
import org.eclipse.emf.teneo.jpa.orm.JoinColumn;
import org.eclipse.emf.teneo.jpa.orm.JoinTable;
import org.eclipse.emf.teneo.jpa.orm.Lob;
import org.eclipse.emf.teneo.jpa.orm.ManyToMany;
import org.eclipse.emf.teneo.jpa.orm.ManyToOne;
import org.eclipse.emf.teneo.jpa.orm.MapKey;
import org.eclipse.emf.teneo.jpa.orm.MappedSuperclass;
import org.eclipse.emf.teneo.jpa.orm.NamedNativeQuery;
import org.eclipse.emf.teneo.jpa.orm.NamedQuery;
import org.eclipse.emf.teneo.jpa.orm.OneToMany;
import org.eclipse.emf.teneo.jpa.orm.OneToOne;
import org.eclipse.emf.teneo.jpa.orm.OrmFactory;
import org.eclipse.emf.teneo.jpa.orm.OrmPackage;
import org.eclipse.emf.teneo.jpa.orm.PersistenceUnitDefaults;
import org.eclipse.emf.teneo.jpa.orm.PersistenceUnitMetadata;
import org.eclipse.emf.teneo.jpa.orm.PostLoad;
import org.eclipse.emf.teneo.jpa.orm.PostPersist;
import org.eclipse.emf.teneo.jpa.orm.PostRemove;
import org.eclipse.emf.teneo.jpa.orm.PostUpdate;
import org.eclipse.emf.teneo.jpa.orm.PrePersist;
import org.eclipse.emf.teneo.jpa.orm.PreRemove;
import org.eclipse.emf.teneo.jpa.orm.PreUpdate;
import org.eclipse.emf.teneo.jpa.orm.PrimaryKeyJoinColumn;
import org.eclipse.emf.teneo.jpa.orm.QueryHint;
import org.eclipse.emf.teneo.jpa.orm.SecondaryTable;
import org.eclipse.emf.teneo.jpa.orm.SequenceGenerator;
import org.eclipse.emf.teneo.jpa.orm.SqlResultSetMapping;
import org.eclipse.emf.teneo.jpa.orm.Table;
import org.eclipse.emf.teneo.jpa.orm.TableGenerator;
import org.eclipse.emf.teneo.jpa.orm.TemporalType;
import org.eclipse.emf.teneo.jpa.orm.Transient;
import org.eclipse.emf.teneo.jpa.orm.UniqueConstraint;
import org.eclipse.emf.teneo.jpa.orm.Version;

import org.eclipse.emf.teneo.jpa.orm.util.OrmValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OrmPackageImpl extends EPackageImpl implements OrmPackage {
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
	private EClass attributeOverrideEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributesEClass = null;

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
	private EClass cascadeTypeEClass = null;

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
	private EClass documentRootEClass = null;

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
	private EClass embeddableAttributesEClass = null;

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
	private EClass emptyTypeEClass = null;

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
	private EClass entityListenersEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityMappingsTypeEClass = null;

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
	private EClass fieldResultEClass = null;

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
	private EClass mappedSuperclassEClass = null;

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
	private EClass persistenceUnitDefaultsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass persistenceUnitMetadataEClass = null;

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
	private EEnum accessTypeEEnum = null;

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
	private EEnum fetchTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum generationTypeEEnum = null;

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
	private EEnum temporalTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType accessTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType discriminatorTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType discriminatorValueEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumeratedEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType fetchTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType generationTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType inheritanceTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType orderByEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType temporalEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType temporalTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType versionTypeEDataType = null;

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
	 * @see org.eclipse.emf.teneo.jpa.orm.OrmPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private OrmPackageImpl() {
		super(eNS_URI, OrmFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link OrmPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static OrmPackage init() {
		if (isInited) return (OrmPackage)EPackage.Registry.INSTANCE.getEPackage(OrmPackage.eNS_URI);

		// Obtain or create and register package
		OrmPackageImpl theOrmPackage = (OrmPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof OrmPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new OrmPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theOrmPackage.createPackageContents();

		// Initialize created meta-data
		theOrmPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theOrmPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return OrmValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theOrmPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(OrmPackage.eNS_URI, theOrmPackage);
		return theOrmPackage;
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
	public EReference getAssociationOverride_JoinColumn() {
		return (EReference)associationOverrideEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssociationOverride_Name() {
		return (EAttribute)associationOverrideEClass.getEStructuralFeatures().get(1);
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
	public EReference getAttributeOverride_Column() {
		return (EReference)attributeOverrideEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeOverride_Name() {
		return (EAttribute)attributeOverrideEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributes() {
		return attributesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributes_Id() {
		return (EReference)attributesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributes_EmbeddedId() {
		return (EReference)attributesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributes_Basic() {
		return (EReference)attributesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributes_Version() {
		return (EReference)attributesEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributes_ManyToOne() {
		return (EReference)attributesEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributes_OneToMany() {
		return (EReference)attributesEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributes_OneToOne() {
		return (EReference)attributesEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributes_ManyToMany() {
		return (EReference)attributesEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributes_Embedded() {
		return (EReference)attributesEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributes_Transient() {
		return (EReference)attributesEClass.getEStructuralFeatures().get(9);
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
	public EReference getBasic_Column() {
		return (EReference)basicEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBasic_Lob() {
		return (EReference)basicEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBasic_Temporal() {
		return (EAttribute)basicEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBasic_Enumerated() {
		return (EAttribute)basicEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBasic_Fetch() {
		return (EAttribute)basicEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBasic_Name() {
		return (EAttribute)basicEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBasic_Optional() {
		return (EAttribute)basicEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCascadeType() {
		return cascadeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCascadeType_CascadeAll() {
		return (EReference)cascadeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCascadeType_CascadePersist() {
		return (EReference)cascadeTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCascadeType_CascadeMerge() {
		return (EReference)cascadeTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCascadeType_CascadeRemove() {
		return (EReference)cascadeTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCascadeType_CascadeRefresh() {
		return (EReference)cascadeTypeEClass.getEStructuralFeatures().get(4);
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
	public EAttribute getColumn_ColumnDefinition() {
		return (EAttribute)columnEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColumn_Insertable() {
		return (EAttribute)columnEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColumn_Length() {
		return (EAttribute)columnEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColumn_Name() {
		return (EAttribute)columnEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColumn_Nullable() {
		return (EAttribute)columnEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColumn_Precision() {
		return (EAttribute)columnEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColumn_Scale() {
		return (EAttribute)columnEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColumn_Table() {
		return (EAttribute)columnEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColumn_Unique() {
		return (EAttribute)columnEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColumn_Updatable() {
		return (EAttribute)columnEClass.getEStructuralFeatures().get(9);
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
	public EAttribute getDiscriminatorColumn_ColumnDefinition() {
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
		return (EAttribute)discriminatorColumnEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiscriminatorColumn_Name() {
		return (EAttribute)discriminatorColumnEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentRoot() {
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Mixed() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XMLNSPrefixMap() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XSISchemaLocation() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_EntityMappings() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
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
	public EAttribute getEmbeddable_Description() {
		return (EAttribute)embeddableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEmbeddable_Attributes() {
		return (EReference)embeddableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEmbeddable_Access() {
		return (EAttribute)embeddableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEmbeddable_Class() {
		return (EAttribute)embeddableEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEmbeddable_MetadataComplete() {
		return (EAttribute)embeddableEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEmbeddableAttributes() {
		return embeddableAttributesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEmbeddableAttributes_Basic() {
		return (EReference)embeddableAttributesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEmbeddableAttributes_Transient() {
		return (EReference)embeddableAttributesEClass.getEStructuralFeatures().get(1);
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
	public EReference getEmbedded_AttributeOverride() {
		return (EReference)embeddedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEmbedded_Name() {
		return (EAttribute)embeddedEClass.getEStructuralFeatures().get(1);
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
	public EReference getEmbeddedId_AttributeOverride() {
		return (EReference)embeddedIdEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEmbeddedId_Name() {
		return (EAttribute)embeddedIdEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEmptyType() {
		return emptyTypeEClass;
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
	public EAttribute getEntity_Description() {
		return (EAttribute)entityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntity_Table() {
		return (EReference)entityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntity_SecondaryTable() {
		return (EReference)entityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntity_PrimaryKeyJoinColumn() {
		return (EReference)entityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntity_IdClass() {
		return (EReference)entityEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntity_Inheritance() {
		return (EReference)entityEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntity_DiscriminatorValue() {
		return (EAttribute)entityEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntity_DiscriminatorColumn() {
		return (EReference)entityEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntity_SequenceGenerator() {
		return (EReference)entityEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntity_TableGenerator() {
		return (EReference)entityEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntity_NamedQuery() {
		return (EReference)entityEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntity_NamedNativeQuery() {
		return (EReference)entityEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntity_SqlResultSetMapping() {
		return (EReference)entityEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntity_ExcludeDefaultListeners() {
		return (EReference)entityEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntity_ExcludeSuperclassListeners() {
		return (EReference)entityEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntity_EntityListeners() {
		return (EReference)entityEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntity_PrePersist() {
		return (EReference)entityEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntity_PostPersist() {
		return (EReference)entityEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntity_PreRemove() {
		return (EReference)entityEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntity_PostRemove() {
		return (EReference)entityEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntity_PreUpdate() {
		return (EReference)entityEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntity_PostUpdate() {
		return (EReference)entityEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntity_PostLoad() {
		return (EReference)entityEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntity_AttributeOverride() {
		return (EReference)entityEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntity_AssociationOverride() {
		return (EReference)entityEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntity_Attributes() {
		return (EReference)entityEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntity_Access() {
		return (EAttribute)entityEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntity_Class() {
		return (EAttribute)entityEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntity_MetadataComplete() {
		return (EAttribute)entityEClass.getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntity_Name() {
		return (EAttribute)entityEClass.getEStructuralFeatures().get(29);
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
	public EReference getEntityListener_PrePersist() {
		return (EReference)entityListenerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityListener_PostPersist() {
		return (EReference)entityListenerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityListener_PreRemove() {
		return (EReference)entityListenerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityListener_PostRemove() {
		return (EReference)entityListenerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityListener_PreUpdate() {
		return (EReference)entityListenerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityListener_PostUpdate() {
		return (EReference)entityListenerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityListener_PostLoad() {
		return (EReference)entityListenerEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntityListener_Class() {
		return (EAttribute)entityListenerEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntityListeners() {
		return entityListenersEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityListeners_EntityListener() {
		return (EReference)entityListenersEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntityMappingsType() {
		return entityMappingsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntityMappingsType_Description() {
		return (EAttribute)entityMappingsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityMappingsType_PersistenceUnitMetadata() {
		return (EReference)entityMappingsTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntityMappingsType_Package() {
		return (EAttribute)entityMappingsTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntityMappingsType_Schema() {
		return (EAttribute)entityMappingsTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntityMappingsType_Catalog() {
		return (EAttribute)entityMappingsTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntityMappingsType_Access() {
		return (EAttribute)entityMappingsTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityMappingsType_SequenceGenerator() {
		return (EReference)entityMappingsTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityMappingsType_TableGenerator() {
		return (EReference)entityMappingsTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityMappingsType_NamedQuery() {
		return (EReference)entityMappingsTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityMappingsType_NamedNativeQuery() {
		return (EReference)entityMappingsTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityMappingsType_SqlResultSetMapping() {
		return (EReference)entityMappingsTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityMappingsType_MappedSuperclass() {
		return (EReference)entityMappingsTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityMappingsType_Entity() {
		return (EReference)entityMappingsTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityMappingsType_Embeddable() {
		return (EReference)entityMappingsTypeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntityMappingsType_Version() {
		return (EAttribute)entityMappingsTypeEClass.getEStructuralFeatures().get(14);
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
	public EReference getEntityResult_FieldResult() {
		return (EReference)entityResultEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntityResult_DiscriminatorColumn() {
		return (EAttribute)entityResultEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntityResult_EntityClass() {
		return (EAttribute)entityResultEClass.getEStructuralFeatures().get(2);
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
	public EAttribute getFieldResult_Column() {
		return (EAttribute)fieldResultEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFieldResult_Name() {
		return (EAttribute)fieldResultEClass.getEStructuralFeatures().get(1);
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
	public EAttribute getGeneratedValue_Generator() {
		return (EAttribute)generatedValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneratedValue_Strategy() {
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
	public EReference getId_Column() {
		return (EReference)idEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getId_GeneratedValue() {
		return (EReference)idEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getId_Temporal() {
		return (EAttribute)idEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getId_TableGenerator() {
		return (EReference)idEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getId_SequenceGenerator() {
		return (EReference)idEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getId_Name() {
		return (EAttribute)idEClass.getEStructuralFeatures().get(5);
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
	public EAttribute getIdClass_Class() {
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
	public EAttribute getJoinColumn_ColumnDefinition() {
		return (EAttribute)joinColumnEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJoinColumn_Insertable() {
		return (EAttribute)joinColumnEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJoinColumn_Name() {
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
	public EAttribute getJoinColumn_ReferencedColumnName() {
		return (EAttribute)joinColumnEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJoinColumn_Table() {
		return (EAttribute)joinColumnEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJoinColumn_Unique() {
		return (EAttribute)joinColumnEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJoinColumn_Updatable() {
		return (EAttribute)joinColumnEClass.getEStructuralFeatures().get(7);
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
	public EReference getJoinTable_JoinColumn() {
		return (EReference)joinTableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJoinTable_InverseJoinColumn() {
		return (EReference)joinTableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJoinTable_UniqueConstraint() {
		return (EReference)joinTableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJoinTable_Catalog() {
		return (EAttribute)joinTableEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJoinTable_Name() {
		return (EAttribute)joinTableEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJoinTable_Schema() {
		return (EAttribute)joinTableEClass.getEStructuralFeatures().get(5);
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
	public EAttribute getManyToMany_OrderBy() {
		return (EAttribute)manyToManyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getManyToMany_MapKey() {
		return (EReference)manyToManyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getManyToMany_JoinTable() {
		return (EReference)manyToManyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getManyToMany_Cascade() {
		return (EReference)manyToManyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getManyToMany_Fetch() {
		return (EAttribute)manyToManyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getManyToMany_MappedBy() {
		return (EAttribute)manyToManyEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getManyToMany_Name() {
		return (EAttribute)manyToManyEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getManyToMany_TargetEntity() {
		return (EAttribute)manyToManyEClass.getEStructuralFeatures().get(7);
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
	public EReference getManyToOne_JoinColumn() {
		return (EReference)manyToOneEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getManyToOne_JoinTable() {
		return (EReference)manyToOneEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getManyToOne_Cascade() {
		return (EReference)manyToOneEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getManyToOne_Fetch() {
		return (EAttribute)manyToOneEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getManyToOne_Name() {
		return (EAttribute)manyToOneEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getManyToOne_Optional() {
		return (EAttribute)manyToOneEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getManyToOne_TargetEntity() {
		return (EAttribute)manyToOneEClass.getEStructuralFeatures().get(6);
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
	public EClass getMappedSuperclass() {
		return mappedSuperclassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMappedSuperclass_Description() {
		return (EAttribute)mappedSuperclassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMappedSuperclass_IdClass() {
		return (EReference)mappedSuperclassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMappedSuperclass_ExcludeDefaultListeners() {
		return (EReference)mappedSuperclassEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMappedSuperclass_ExcludeSuperclassListeners() {
		return (EReference)mappedSuperclassEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMappedSuperclass_EntityListeners() {
		return (EReference)mappedSuperclassEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMappedSuperclass_PrePersist() {
		return (EReference)mappedSuperclassEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMappedSuperclass_PostPersist() {
		return (EReference)mappedSuperclassEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMappedSuperclass_PreRemove() {
		return (EReference)mappedSuperclassEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMappedSuperclass_PostRemove() {
		return (EReference)mappedSuperclassEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMappedSuperclass_PreUpdate() {
		return (EReference)mappedSuperclassEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMappedSuperclass_PostUpdate() {
		return (EReference)mappedSuperclassEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMappedSuperclass_PostLoad() {
		return (EReference)mappedSuperclassEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMappedSuperclass_Attributes() {
		return (EReference)mappedSuperclassEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMappedSuperclass_Access() {
		return (EAttribute)mappedSuperclassEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMappedSuperclass_Class() {
		return (EAttribute)mappedSuperclassEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMappedSuperclass_MetadataComplete() {
		return (EAttribute)mappedSuperclassEClass.getEStructuralFeatures().get(15);
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
	public EAttribute getNamedNativeQuery_Query() {
		return (EAttribute)namedNativeQueryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamedNativeQuery_Hint() {
		return (EReference)namedNativeQueryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedNativeQuery_Name() {
		return (EAttribute)namedNativeQueryEClass.getEStructuralFeatures().get(2);
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
	public EClass getNamedQuery() {
		return namedQueryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedQuery_Query() {
		return (EAttribute)namedQueryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamedQuery_Hint() {
		return (EReference)namedQueryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedQuery_Name() {
		return (EAttribute)namedQueryEClass.getEStructuralFeatures().get(2);
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
	public EAttribute getOneToMany_OrderBy() {
		return (EAttribute)oneToManyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOneToMany_MapKey() {
		return (EReference)oneToManyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOneToMany_JoinTable() {
		return (EReference)oneToManyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOneToMany_JoinColumn() {
		return (EReference)oneToManyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOneToMany_Cascade() {
		return (EReference)oneToManyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOneToMany_Fetch() {
		return (EAttribute)oneToManyEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOneToMany_MappedBy() {
		return (EAttribute)oneToManyEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOneToMany_Name() {
		return (EAttribute)oneToManyEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOneToMany_TargetEntity() {
		return (EAttribute)oneToManyEClass.getEStructuralFeatures().get(8);
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
	public EReference getOneToOne_PrimaryKeyJoinColumn() {
		return (EReference)oneToOneEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOneToOne_JoinColumn() {
		return (EReference)oneToOneEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOneToOne_JoinTable() {
		return (EReference)oneToOneEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOneToOne_Cascade() {
		return (EReference)oneToOneEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOneToOne_Fetch() {
		return (EAttribute)oneToOneEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOneToOne_MappedBy() {
		return (EAttribute)oneToOneEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOneToOne_Name() {
		return (EAttribute)oneToOneEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOneToOne_Optional() {
		return (EAttribute)oneToOneEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOneToOne_TargetEntity() {
		return (EAttribute)oneToOneEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPersistenceUnitDefaults() {
		return persistenceUnitDefaultsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersistenceUnitDefaults_Schema() {
		return (EAttribute)persistenceUnitDefaultsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersistenceUnitDefaults_Catalog() {
		return (EAttribute)persistenceUnitDefaultsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersistenceUnitDefaults_Access() {
		return (EAttribute)persistenceUnitDefaultsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersistenceUnitDefaults_CascadePersist() {
		return (EReference)persistenceUnitDefaultsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersistenceUnitDefaults_EntityListeners() {
		return (EReference)persistenceUnitDefaultsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPersistenceUnitMetadata() {
		return persistenceUnitMetadataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersistenceUnitMetadata_XmlMappingMetadataComplete() {
		return (EReference)persistenceUnitMetadataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersistenceUnitMetadata_PersistenceUnitDefaults() {
		return (EReference)persistenceUnitMetadataEClass.getEStructuralFeatures().get(1);
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
	public EAttribute getPostLoad_MethodName() {
		return (EAttribute)postLoadEClass.getEStructuralFeatures().get(0);
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
	public EAttribute getPostPersist_MethodName() {
		return (EAttribute)postPersistEClass.getEStructuralFeatures().get(0);
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
	public EAttribute getPostRemove_MethodName() {
		return (EAttribute)postRemoveEClass.getEStructuralFeatures().get(0);
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
	public EAttribute getPostUpdate_MethodName() {
		return (EAttribute)postUpdateEClass.getEStructuralFeatures().get(0);
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
	public EAttribute getPrePersist_MethodName() {
		return (EAttribute)prePersistEClass.getEStructuralFeatures().get(0);
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
	public EAttribute getPreRemove_MethodName() {
		return (EAttribute)preRemoveEClass.getEStructuralFeatures().get(0);
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
	public EAttribute getPreUpdate_MethodName() {
		return (EAttribute)preUpdateEClass.getEStructuralFeatures().get(0);
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
	public EAttribute getPrimaryKeyJoinColumn_ColumnDefinition() {
		return (EAttribute)primaryKeyJoinColumnEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrimaryKeyJoinColumn_Name() {
		return (EAttribute)primaryKeyJoinColumnEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrimaryKeyJoinColumn_ReferencedColumnName() {
		return (EAttribute)primaryKeyJoinColumnEClass.getEStructuralFeatures().get(2);
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
	public EReference getSecondaryTable_PrimaryKeyJoinColumn() {
		return (EReference)secondaryTableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSecondaryTable_UniqueConstraint() {
		return (EReference)secondaryTableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSecondaryTable_Catalog() {
		return (EAttribute)secondaryTableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSecondaryTable_Name() {
		return (EAttribute)secondaryTableEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSecondaryTable_Schema() {
		return (EAttribute)secondaryTableEClass.getEStructuralFeatures().get(4);
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
	public EAttribute getSequenceGenerator_AllocationSize() {
		return (EAttribute)sequenceGeneratorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSequenceGenerator_InitialValue() {
		return (EAttribute)sequenceGeneratorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSequenceGenerator_Name() {
		return (EAttribute)sequenceGeneratorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSequenceGenerator_SequenceName() {
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
	public EReference getSqlResultSetMapping_EntityResult() {
		return (EReference)sqlResultSetMappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSqlResultSetMapping_ColumnResult() {
		return (EReference)sqlResultSetMappingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSqlResultSetMapping_Name() {
		return (EAttribute)sqlResultSetMappingEClass.getEStructuralFeatures().get(2);
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
	public EReference getTable_UniqueConstraint() {
		return (EReference)tableEClass.getEStructuralFeatures().get(0);
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
	public EAttribute getTable_Name() {
		return (EAttribute)tableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTable_Schema() {
		return (EAttribute)tableEClass.getEStructuralFeatures().get(3);
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
	public EReference getTableGenerator_UniqueConstraint() {
		return (EReference)tableGeneratorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTableGenerator_AllocationSize() {
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
	public EAttribute getTableGenerator_InitialValue() {
		return (EAttribute)tableGeneratorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTableGenerator_Name() {
		return (EAttribute)tableGeneratorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTableGenerator_PkColumnName() {
		return (EAttribute)tableGeneratorEClass.getEStructuralFeatures().get(5);
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
	public EAttribute getTableGenerator_Schema() {
		return (EAttribute)tableGeneratorEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTableGenerator_Table() {
		return (EAttribute)tableGeneratorEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTableGenerator_ValueColumnName() {
		return (EAttribute)tableGeneratorEClass.getEStructuralFeatures().get(9);
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
	public EAttribute getTransient_Name() {
		return (EAttribute)transientEClass.getEStructuralFeatures().get(0);
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
	public EAttribute getUniqueConstraint_ColumnName() {
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
	public EReference getVersion_Column() {
		return (EReference)versionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVersion_Temporal() {
		return (EAttribute)versionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVersion_Name() {
		return (EAttribute)versionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAccessType() {
		return accessTypeEEnum;
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
	public EEnum getFetchType() {
		return fetchTypeEEnum;
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
	public EEnum getInheritanceType() {
		return inheritanceTypeEEnum;
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
	public EDataType getAccessTypeObject() {
		return accessTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDiscriminatorTypeObject() {
		return discriminatorTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDiscriminatorValue() {
		return discriminatorValueEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEnumerated() {
		return enumeratedEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEnumTypeObject() {
		return enumTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFetchTypeObject() {
		return fetchTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getGenerationTypeObject() {
		return generationTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getInheritanceTypeObject() {
		return inheritanceTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getOrderBy() {
		return orderByEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTemporal() {
		return temporalEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTemporalTypeObject() {
		return temporalTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getVersionType() {
		return versionTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrmFactory getOrmFactory() {
		return (OrmFactory)getEFactoryInstance();
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
		associationOverrideEClass = createEClass(ASSOCIATION_OVERRIDE);
		createEReference(associationOverrideEClass, ASSOCIATION_OVERRIDE__JOIN_COLUMN);
		createEAttribute(associationOverrideEClass, ASSOCIATION_OVERRIDE__NAME);

		attributeOverrideEClass = createEClass(ATTRIBUTE_OVERRIDE);
		createEReference(attributeOverrideEClass, ATTRIBUTE_OVERRIDE__COLUMN);
		createEAttribute(attributeOverrideEClass, ATTRIBUTE_OVERRIDE__NAME);

		attributesEClass = createEClass(ATTRIBUTES);
		createEReference(attributesEClass, ATTRIBUTES__ID);
		createEReference(attributesEClass, ATTRIBUTES__EMBEDDED_ID);
		createEReference(attributesEClass, ATTRIBUTES__BASIC);
		createEReference(attributesEClass, ATTRIBUTES__VERSION);
		createEReference(attributesEClass, ATTRIBUTES__MANY_TO_ONE);
		createEReference(attributesEClass, ATTRIBUTES__ONE_TO_MANY);
		createEReference(attributesEClass, ATTRIBUTES__ONE_TO_ONE);
		createEReference(attributesEClass, ATTRIBUTES__MANY_TO_MANY);
		createEReference(attributesEClass, ATTRIBUTES__EMBEDDED);
		createEReference(attributesEClass, ATTRIBUTES__TRANSIENT);

		basicEClass = createEClass(BASIC);
		createEReference(basicEClass, BASIC__COLUMN);
		createEReference(basicEClass, BASIC__LOB);
		createEAttribute(basicEClass, BASIC__TEMPORAL);
		createEAttribute(basicEClass, BASIC__ENUMERATED);
		createEAttribute(basicEClass, BASIC__FETCH);
		createEAttribute(basicEClass, BASIC__NAME);
		createEAttribute(basicEClass, BASIC__OPTIONAL);

		cascadeTypeEClass = createEClass(CASCADE_TYPE);
		createEReference(cascadeTypeEClass, CASCADE_TYPE__CASCADE_ALL);
		createEReference(cascadeTypeEClass, CASCADE_TYPE__CASCADE_PERSIST);
		createEReference(cascadeTypeEClass, CASCADE_TYPE__CASCADE_MERGE);
		createEReference(cascadeTypeEClass, CASCADE_TYPE__CASCADE_REMOVE);
		createEReference(cascadeTypeEClass, CASCADE_TYPE__CASCADE_REFRESH);

		columnEClass = createEClass(COLUMN);
		createEAttribute(columnEClass, COLUMN__COLUMN_DEFINITION);
		createEAttribute(columnEClass, COLUMN__INSERTABLE);
		createEAttribute(columnEClass, COLUMN__LENGTH);
		createEAttribute(columnEClass, COLUMN__NAME);
		createEAttribute(columnEClass, COLUMN__NULLABLE);
		createEAttribute(columnEClass, COLUMN__PRECISION);
		createEAttribute(columnEClass, COLUMN__SCALE);
		createEAttribute(columnEClass, COLUMN__TABLE);
		createEAttribute(columnEClass, COLUMN__UNIQUE);
		createEAttribute(columnEClass, COLUMN__UPDATABLE);

		columnResultEClass = createEClass(COLUMN_RESULT);
		createEAttribute(columnResultEClass, COLUMN_RESULT__NAME);

		discriminatorColumnEClass = createEClass(DISCRIMINATOR_COLUMN);
		createEAttribute(discriminatorColumnEClass, DISCRIMINATOR_COLUMN__COLUMN_DEFINITION);
		createEAttribute(discriminatorColumnEClass, DISCRIMINATOR_COLUMN__DISCRIMINATOR_TYPE);
		createEAttribute(discriminatorColumnEClass, DISCRIMINATOR_COLUMN__LENGTH);
		createEAttribute(discriminatorColumnEClass, DISCRIMINATOR_COLUMN__NAME);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ENTITY_MAPPINGS);

		embeddableEClass = createEClass(EMBEDDABLE);
		createEAttribute(embeddableEClass, EMBEDDABLE__DESCRIPTION);
		createEReference(embeddableEClass, EMBEDDABLE__ATTRIBUTES);
		createEAttribute(embeddableEClass, EMBEDDABLE__ACCESS);
		createEAttribute(embeddableEClass, EMBEDDABLE__CLASS);
		createEAttribute(embeddableEClass, EMBEDDABLE__METADATA_COMPLETE);

		embeddableAttributesEClass = createEClass(EMBEDDABLE_ATTRIBUTES);
		createEReference(embeddableAttributesEClass, EMBEDDABLE_ATTRIBUTES__BASIC);
		createEReference(embeddableAttributesEClass, EMBEDDABLE_ATTRIBUTES__TRANSIENT);

		embeddedEClass = createEClass(EMBEDDED);
		createEReference(embeddedEClass, EMBEDDED__ATTRIBUTE_OVERRIDE);
		createEAttribute(embeddedEClass, EMBEDDED__NAME);

		embeddedIdEClass = createEClass(EMBEDDED_ID);
		createEReference(embeddedIdEClass, EMBEDDED_ID__ATTRIBUTE_OVERRIDE);
		createEAttribute(embeddedIdEClass, EMBEDDED_ID__NAME);

		emptyTypeEClass = createEClass(EMPTY_TYPE);

		entityEClass = createEClass(ENTITY);
		createEAttribute(entityEClass, ENTITY__DESCRIPTION);
		createEReference(entityEClass, ENTITY__TABLE);
		createEReference(entityEClass, ENTITY__SECONDARY_TABLE);
		createEReference(entityEClass, ENTITY__PRIMARY_KEY_JOIN_COLUMN);
		createEReference(entityEClass, ENTITY__ID_CLASS);
		createEReference(entityEClass, ENTITY__INHERITANCE);
		createEAttribute(entityEClass, ENTITY__DISCRIMINATOR_VALUE);
		createEReference(entityEClass, ENTITY__DISCRIMINATOR_COLUMN);
		createEReference(entityEClass, ENTITY__SEQUENCE_GENERATOR);
		createEReference(entityEClass, ENTITY__TABLE_GENERATOR);
		createEReference(entityEClass, ENTITY__NAMED_QUERY);
		createEReference(entityEClass, ENTITY__NAMED_NATIVE_QUERY);
		createEReference(entityEClass, ENTITY__SQL_RESULT_SET_MAPPING);
		createEReference(entityEClass, ENTITY__EXCLUDE_DEFAULT_LISTENERS);
		createEReference(entityEClass, ENTITY__EXCLUDE_SUPERCLASS_LISTENERS);
		createEReference(entityEClass, ENTITY__ENTITY_LISTENERS);
		createEReference(entityEClass, ENTITY__PRE_PERSIST);
		createEReference(entityEClass, ENTITY__POST_PERSIST);
		createEReference(entityEClass, ENTITY__PRE_REMOVE);
		createEReference(entityEClass, ENTITY__POST_REMOVE);
		createEReference(entityEClass, ENTITY__PRE_UPDATE);
		createEReference(entityEClass, ENTITY__POST_UPDATE);
		createEReference(entityEClass, ENTITY__POST_LOAD);
		createEReference(entityEClass, ENTITY__ATTRIBUTE_OVERRIDE);
		createEReference(entityEClass, ENTITY__ASSOCIATION_OVERRIDE);
		createEReference(entityEClass, ENTITY__ATTRIBUTES);
		createEAttribute(entityEClass, ENTITY__ACCESS);
		createEAttribute(entityEClass, ENTITY__CLASS);
		createEAttribute(entityEClass, ENTITY__METADATA_COMPLETE);
		createEAttribute(entityEClass, ENTITY__NAME);

		entityListenerEClass = createEClass(ENTITY_LISTENER);
		createEReference(entityListenerEClass, ENTITY_LISTENER__PRE_PERSIST);
		createEReference(entityListenerEClass, ENTITY_LISTENER__POST_PERSIST);
		createEReference(entityListenerEClass, ENTITY_LISTENER__PRE_REMOVE);
		createEReference(entityListenerEClass, ENTITY_LISTENER__POST_REMOVE);
		createEReference(entityListenerEClass, ENTITY_LISTENER__PRE_UPDATE);
		createEReference(entityListenerEClass, ENTITY_LISTENER__POST_UPDATE);
		createEReference(entityListenerEClass, ENTITY_LISTENER__POST_LOAD);
		createEAttribute(entityListenerEClass, ENTITY_LISTENER__CLASS);

		entityListenersEClass = createEClass(ENTITY_LISTENERS);
		createEReference(entityListenersEClass, ENTITY_LISTENERS__ENTITY_LISTENER);

		entityMappingsTypeEClass = createEClass(ENTITY_MAPPINGS_TYPE);
		createEAttribute(entityMappingsTypeEClass, ENTITY_MAPPINGS_TYPE__DESCRIPTION);
		createEReference(entityMappingsTypeEClass, ENTITY_MAPPINGS_TYPE__PERSISTENCE_UNIT_METADATA);
		createEAttribute(entityMappingsTypeEClass, ENTITY_MAPPINGS_TYPE__PACKAGE);
		createEAttribute(entityMappingsTypeEClass, ENTITY_MAPPINGS_TYPE__SCHEMA);
		createEAttribute(entityMappingsTypeEClass, ENTITY_MAPPINGS_TYPE__CATALOG);
		createEAttribute(entityMappingsTypeEClass, ENTITY_MAPPINGS_TYPE__ACCESS);
		createEReference(entityMappingsTypeEClass, ENTITY_MAPPINGS_TYPE__SEQUENCE_GENERATOR);
		createEReference(entityMappingsTypeEClass, ENTITY_MAPPINGS_TYPE__TABLE_GENERATOR);
		createEReference(entityMappingsTypeEClass, ENTITY_MAPPINGS_TYPE__NAMED_QUERY);
		createEReference(entityMappingsTypeEClass, ENTITY_MAPPINGS_TYPE__NAMED_NATIVE_QUERY);
		createEReference(entityMappingsTypeEClass, ENTITY_MAPPINGS_TYPE__SQL_RESULT_SET_MAPPING);
		createEReference(entityMappingsTypeEClass, ENTITY_MAPPINGS_TYPE__MAPPED_SUPERCLASS);
		createEReference(entityMappingsTypeEClass, ENTITY_MAPPINGS_TYPE__ENTITY);
		createEReference(entityMappingsTypeEClass, ENTITY_MAPPINGS_TYPE__EMBEDDABLE);
		createEAttribute(entityMappingsTypeEClass, ENTITY_MAPPINGS_TYPE__VERSION);

		entityResultEClass = createEClass(ENTITY_RESULT);
		createEReference(entityResultEClass, ENTITY_RESULT__FIELD_RESULT);
		createEAttribute(entityResultEClass, ENTITY_RESULT__DISCRIMINATOR_COLUMN);
		createEAttribute(entityResultEClass, ENTITY_RESULT__ENTITY_CLASS);

		fieldResultEClass = createEClass(FIELD_RESULT);
		createEAttribute(fieldResultEClass, FIELD_RESULT__COLUMN);
		createEAttribute(fieldResultEClass, FIELD_RESULT__NAME);

		generatedValueEClass = createEClass(GENERATED_VALUE);
		createEAttribute(generatedValueEClass, GENERATED_VALUE__GENERATOR);
		createEAttribute(generatedValueEClass, GENERATED_VALUE__STRATEGY);

		idEClass = createEClass(ID);
		createEReference(idEClass, ID__COLUMN);
		createEReference(idEClass, ID__GENERATED_VALUE);
		createEAttribute(idEClass, ID__TEMPORAL);
		createEReference(idEClass, ID__TABLE_GENERATOR);
		createEReference(idEClass, ID__SEQUENCE_GENERATOR);
		createEAttribute(idEClass, ID__NAME);

		idClassEClass = createEClass(ID_CLASS);
		createEAttribute(idClassEClass, ID_CLASS__CLASS);

		inheritanceEClass = createEClass(INHERITANCE);
		createEAttribute(inheritanceEClass, INHERITANCE__STRATEGY);

		joinColumnEClass = createEClass(JOIN_COLUMN);
		createEAttribute(joinColumnEClass, JOIN_COLUMN__COLUMN_DEFINITION);
		createEAttribute(joinColumnEClass, JOIN_COLUMN__INSERTABLE);
		createEAttribute(joinColumnEClass, JOIN_COLUMN__NAME);
		createEAttribute(joinColumnEClass, JOIN_COLUMN__NULLABLE);
		createEAttribute(joinColumnEClass, JOIN_COLUMN__REFERENCED_COLUMN_NAME);
		createEAttribute(joinColumnEClass, JOIN_COLUMN__TABLE);
		createEAttribute(joinColumnEClass, JOIN_COLUMN__UNIQUE);
		createEAttribute(joinColumnEClass, JOIN_COLUMN__UPDATABLE);

		joinTableEClass = createEClass(JOIN_TABLE);
		createEReference(joinTableEClass, JOIN_TABLE__JOIN_COLUMN);
		createEReference(joinTableEClass, JOIN_TABLE__INVERSE_JOIN_COLUMN);
		createEReference(joinTableEClass, JOIN_TABLE__UNIQUE_CONSTRAINT);
		createEAttribute(joinTableEClass, JOIN_TABLE__CATALOG);
		createEAttribute(joinTableEClass, JOIN_TABLE__NAME);
		createEAttribute(joinTableEClass, JOIN_TABLE__SCHEMA);

		lobEClass = createEClass(LOB);

		manyToManyEClass = createEClass(MANY_TO_MANY);
		createEAttribute(manyToManyEClass, MANY_TO_MANY__ORDER_BY);
		createEReference(manyToManyEClass, MANY_TO_MANY__MAP_KEY);
		createEReference(manyToManyEClass, MANY_TO_MANY__JOIN_TABLE);
		createEReference(manyToManyEClass, MANY_TO_MANY__CASCADE);
		createEAttribute(manyToManyEClass, MANY_TO_MANY__FETCH);
		createEAttribute(manyToManyEClass, MANY_TO_MANY__MAPPED_BY);
		createEAttribute(manyToManyEClass, MANY_TO_MANY__NAME);
		createEAttribute(manyToManyEClass, MANY_TO_MANY__TARGET_ENTITY);

		manyToOneEClass = createEClass(MANY_TO_ONE);
		createEReference(manyToOneEClass, MANY_TO_ONE__JOIN_COLUMN);
		createEReference(manyToOneEClass, MANY_TO_ONE__JOIN_TABLE);
		createEReference(manyToOneEClass, MANY_TO_ONE__CASCADE);
		createEAttribute(manyToOneEClass, MANY_TO_ONE__FETCH);
		createEAttribute(manyToOneEClass, MANY_TO_ONE__NAME);
		createEAttribute(manyToOneEClass, MANY_TO_ONE__OPTIONAL);
		createEAttribute(manyToOneEClass, MANY_TO_ONE__TARGET_ENTITY);

		mapKeyEClass = createEClass(MAP_KEY);
		createEAttribute(mapKeyEClass, MAP_KEY__NAME);

		mappedSuperclassEClass = createEClass(MAPPED_SUPERCLASS);
		createEAttribute(mappedSuperclassEClass, MAPPED_SUPERCLASS__DESCRIPTION);
		createEReference(mappedSuperclassEClass, MAPPED_SUPERCLASS__ID_CLASS);
		createEReference(mappedSuperclassEClass, MAPPED_SUPERCLASS__EXCLUDE_DEFAULT_LISTENERS);
		createEReference(mappedSuperclassEClass, MAPPED_SUPERCLASS__EXCLUDE_SUPERCLASS_LISTENERS);
		createEReference(mappedSuperclassEClass, MAPPED_SUPERCLASS__ENTITY_LISTENERS);
		createEReference(mappedSuperclassEClass, MAPPED_SUPERCLASS__PRE_PERSIST);
		createEReference(mappedSuperclassEClass, MAPPED_SUPERCLASS__POST_PERSIST);
		createEReference(mappedSuperclassEClass, MAPPED_SUPERCLASS__PRE_REMOVE);
		createEReference(mappedSuperclassEClass, MAPPED_SUPERCLASS__POST_REMOVE);
		createEReference(mappedSuperclassEClass, MAPPED_SUPERCLASS__PRE_UPDATE);
		createEReference(mappedSuperclassEClass, MAPPED_SUPERCLASS__POST_UPDATE);
		createEReference(mappedSuperclassEClass, MAPPED_SUPERCLASS__POST_LOAD);
		createEReference(mappedSuperclassEClass, MAPPED_SUPERCLASS__ATTRIBUTES);
		createEAttribute(mappedSuperclassEClass, MAPPED_SUPERCLASS__ACCESS);
		createEAttribute(mappedSuperclassEClass, MAPPED_SUPERCLASS__CLASS);
		createEAttribute(mappedSuperclassEClass, MAPPED_SUPERCLASS__METADATA_COMPLETE);

		namedNativeQueryEClass = createEClass(NAMED_NATIVE_QUERY);
		createEAttribute(namedNativeQueryEClass, NAMED_NATIVE_QUERY__QUERY);
		createEReference(namedNativeQueryEClass, NAMED_NATIVE_QUERY__HINT);
		createEAttribute(namedNativeQueryEClass, NAMED_NATIVE_QUERY__NAME);
		createEAttribute(namedNativeQueryEClass, NAMED_NATIVE_QUERY__RESULT_CLASS);
		createEAttribute(namedNativeQueryEClass, NAMED_NATIVE_QUERY__RESULT_SET_MAPPING);

		namedQueryEClass = createEClass(NAMED_QUERY);
		createEAttribute(namedQueryEClass, NAMED_QUERY__QUERY);
		createEReference(namedQueryEClass, NAMED_QUERY__HINT);
		createEAttribute(namedQueryEClass, NAMED_QUERY__NAME);

		oneToManyEClass = createEClass(ONE_TO_MANY);
		createEAttribute(oneToManyEClass, ONE_TO_MANY__ORDER_BY);
		createEReference(oneToManyEClass, ONE_TO_MANY__MAP_KEY);
		createEReference(oneToManyEClass, ONE_TO_MANY__JOIN_TABLE);
		createEReference(oneToManyEClass, ONE_TO_MANY__JOIN_COLUMN);
		createEReference(oneToManyEClass, ONE_TO_MANY__CASCADE);
		createEAttribute(oneToManyEClass, ONE_TO_MANY__FETCH);
		createEAttribute(oneToManyEClass, ONE_TO_MANY__MAPPED_BY);
		createEAttribute(oneToManyEClass, ONE_TO_MANY__NAME);
		createEAttribute(oneToManyEClass, ONE_TO_MANY__TARGET_ENTITY);

		oneToOneEClass = createEClass(ONE_TO_ONE);
		createEReference(oneToOneEClass, ONE_TO_ONE__PRIMARY_KEY_JOIN_COLUMN);
		createEReference(oneToOneEClass, ONE_TO_ONE__JOIN_COLUMN);
		createEReference(oneToOneEClass, ONE_TO_ONE__JOIN_TABLE);
		createEReference(oneToOneEClass, ONE_TO_ONE__CASCADE);
		createEAttribute(oneToOneEClass, ONE_TO_ONE__FETCH);
		createEAttribute(oneToOneEClass, ONE_TO_ONE__MAPPED_BY);
		createEAttribute(oneToOneEClass, ONE_TO_ONE__NAME);
		createEAttribute(oneToOneEClass, ONE_TO_ONE__OPTIONAL);
		createEAttribute(oneToOneEClass, ONE_TO_ONE__TARGET_ENTITY);

		persistenceUnitDefaultsEClass = createEClass(PERSISTENCE_UNIT_DEFAULTS);
		createEAttribute(persistenceUnitDefaultsEClass, PERSISTENCE_UNIT_DEFAULTS__SCHEMA);
		createEAttribute(persistenceUnitDefaultsEClass, PERSISTENCE_UNIT_DEFAULTS__CATALOG);
		createEAttribute(persistenceUnitDefaultsEClass, PERSISTENCE_UNIT_DEFAULTS__ACCESS);
		createEReference(persistenceUnitDefaultsEClass, PERSISTENCE_UNIT_DEFAULTS__CASCADE_PERSIST);
		createEReference(persistenceUnitDefaultsEClass, PERSISTENCE_UNIT_DEFAULTS__ENTITY_LISTENERS);

		persistenceUnitMetadataEClass = createEClass(PERSISTENCE_UNIT_METADATA);
		createEReference(persistenceUnitMetadataEClass, PERSISTENCE_UNIT_METADATA__XML_MAPPING_METADATA_COMPLETE);
		createEReference(persistenceUnitMetadataEClass, PERSISTENCE_UNIT_METADATA__PERSISTENCE_UNIT_DEFAULTS);

		postLoadEClass = createEClass(POST_LOAD);
		createEAttribute(postLoadEClass, POST_LOAD__METHOD_NAME);

		postPersistEClass = createEClass(POST_PERSIST);
		createEAttribute(postPersistEClass, POST_PERSIST__METHOD_NAME);

		postRemoveEClass = createEClass(POST_REMOVE);
		createEAttribute(postRemoveEClass, POST_REMOVE__METHOD_NAME);

		postUpdateEClass = createEClass(POST_UPDATE);
		createEAttribute(postUpdateEClass, POST_UPDATE__METHOD_NAME);

		prePersistEClass = createEClass(PRE_PERSIST);
		createEAttribute(prePersistEClass, PRE_PERSIST__METHOD_NAME);

		preRemoveEClass = createEClass(PRE_REMOVE);
		createEAttribute(preRemoveEClass, PRE_REMOVE__METHOD_NAME);

		preUpdateEClass = createEClass(PRE_UPDATE);
		createEAttribute(preUpdateEClass, PRE_UPDATE__METHOD_NAME);

		primaryKeyJoinColumnEClass = createEClass(PRIMARY_KEY_JOIN_COLUMN);
		createEAttribute(primaryKeyJoinColumnEClass, PRIMARY_KEY_JOIN_COLUMN__COLUMN_DEFINITION);
		createEAttribute(primaryKeyJoinColumnEClass, PRIMARY_KEY_JOIN_COLUMN__NAME);
		createEAttribute(primaryKeyJoinColumnEClass, PRIMARY_KEY_JOIN_COLUMN__REFERENCED_COLUMN_NAME);

		queryHintEClass = createEClass(QUERY_HINT);
		createEAttribute(queryHintEClass, QUERY_HINT__NAME);
		createEAttribute(queryHintEClass, QUERY_HINT__VALUE);

		secondaryTableEClass = createEClass(SECONDARY_TABLE);
		createEReference(secondaryTableEClass, SECONDARY_TABLE__PRIMARY_KEY_JOIN_COLUMN);
		createEReference(secondaryTableEClass, SECONDARY_TABLE__UNIQUE_CONSTRAINT);
		createEAttribute(secondaryTableEClass, SECONDARY_TABLE__CATALOG);
		createEAttribute(secondaryTableEClass, SECONDARY_TABLE__NAME);
		createEAttribute(secondaryTableEClass, SECONDARY_TABLE__SCHEMA);

		sequenceGeneratorEClass = createEClass(SEQUENCE_GENERATOR);
		createEAttribute(sequenceGeneratorEClass, SEQUENCE_GENERATOR__ALLOCATION_SIZE);
		createEAttribute(sequenceGeneratorEClass, SEQUENCE_GENERATOR__INITIAL_VALUE);
		createEAttribute(sequenceGeneratorEClass, SEQUENCE_GENERATOR__NAME);
		createEAttribute(sequenceGeneratorEClass, SEQUENCE_GENERATOR__SEQUENCE_NAME);

		sqlResultSetMappingEClass = createEClass(SQL_RESULT_SET_MAPPING);
		createEReference(sqlResultSetMappingEClass, SQL_RESULT_SET_MAPPING__ENTITY_RESULT);
		createEReference(sqlResultSetMappingEClass, SQL_RESULT_SET_MAPPING__COLUMN_RESULT);
		createEAttribute(sqlResultSetMappingEClass, SQL_RESULT_SET_MAPPING__NAME);

		tableEClass = createEClass(TABLE);
		createEReference(tableEClass, TABLE__UNIQUE_CONSTRAINT);
		createEAttribute(tableEClass, TABLE__CATALOG);
		createEAttribute(tableEClass, TABLE__NAME);
		createEAttribute(tableEClass, TABLE__SCHEMA);

		tableGeneratorEClass = createEClass(TABLE_GENERATOR);
		createEReference(tableGeneratorEClass, TABLE_GENERATOR__UNIQUE_CONSTRAINT);
		createEAttribute(tableGeneratorEClass, TABLE_GENERATOR__ALLOCATION_SIZE);
		createEAttribute(tableGeneratorEClass, TABLE_GENERATOR__CATALOG);
		createEAttribute(tableGeneratorEClass, TABLE_GENERATOR__INITIAL_VALUE);
		createEAttribute(tableGeneratorEClass, TABLE_GENERATOR__NAME);
		createEAttribute(tableGeneratorEClass, TABLE_GENERATOR__PK_COLUMN_NAME);
		createEAttribute(tableGeneratorEClass, TABLE_GENERATOR__PK_COLUMN_VALUE);
		createEAttribute(tableGeneratorEClass, TABLE_GENERATOR__SCHEMA);
		createEAttribute(tableGeneratorEClass, TABLE_GENERATOR__TABLE);
		createEAttribute(tableGeneratorEClass, TABLE_GENERATOR__VALUE_COLUMN_NAME);

		transientEClass = createEClass(TRANSIENT);
		createEAttribute(transientEClass, TRANSIENT__NAME);

		uniqueConstraintEClass = createEClass(UNIQUE_CONSTRAINT);
		createEAttribute(uniqueConstraintEClass, UNIQUE_CONSTRAINT__COLUMN_NAME);

		versionEClass = createEClass(VERSION);
		createEReference(versionEClass, VERSION__COLUMN);
		createEAttribute(versionEClass, VERSION__TEMPORAL);
		createEAttribute(versionEClass, VERSION__NAME);

		// Create enums
		accessTypeEEnum = createEEnum(ACCESS_TYPE);
		discriminatorTypeEEnum = createEEnum(DISCRIMINATOR_TYPE);
		enumTypeEEnum = createEEnum(ENUM_TYPE);
		fetchTypeEEnum = createEEnum(FETCH_TYPE);
		generationTypeEEnum = createEEnum(GENERATION_TYPE);
		inheritanceTypeEEnum = createEEnum(INHERITANCE_TYPE);
		temporalTypeEEnum = createEEnum(TEMPORAL_TYPE);

		// Create data types
		accessTypeObjectEDataType = createEDataType(ACCESS_TYPE_OBJECT);
		discriminatorTypeObjectEDataType = createEDataType(DISCRIMINATOR_TYPE_OBJECT);
		discriminatorValueEDataType = createEDataType(DISCRIMINATOR_VALUE);
		enumeratedEDataType = createEDataType(ENUMERATED);
		enumTypeObjectEDataType = createEDataType(ENUM_TYPE_OBJECT);
		fetchTypeObjectEDataType = createEDataType(FETCH_TYPE_OBJECT);
		generationTypeObjectEDataType = createEDataType(GENERATION_TYPE_OBJECT);
		inheritanceTypeObjectEDataType = createEDataType(INHERITANCE_TYPE_OBJECT);
		orderByEDataType = createEDataType(ORDER_BY);
		temporalEDataType = createEDataType(TEMPORAL);
		temporalTypeObjectEDataType = createEDataType(TEMPORAL_TYPE_OBJECT);
		versionTypeEDataType = createEDataType(VERSION_TYPE);
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

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(associationOverrideEClass, AssociationOverride.class, "AssociationOverride", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssociationOverride_JoinColumn(), this.getJoinColumn(), null, "joinColumn", null, 1, -1, AssociationOverride.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssociationOverride_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, AssociationOverride.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeOverrideEClass, AttributeOverride.class, "AttributeOverride", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttributeOverride_Column(), this.getColumn(), null, "column", null, 1, 1, AttributeOverride.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributeOverride_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, AttributeOverride.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributesEClass, Attributes.class, "Attributes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttributes_Id(), this.getId(), null, "id", null, 0, -1, Attributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttributes_EmbeddedId(), this.getEmbeddedId(), null, "embeddedId", null, 0, 1, Attributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttributes_Basic(), this.getBasic(), null, "basic", null, 0, -1, Attributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttributes_Version(), this.getVersion(), null, "version", null, 0, -1, Attributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttributes_ManyToOne(), this.getManyToOne(), null, "manyToOne", null, 0, -1, Attributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttributes_OneToMany(), this.getOneToMany(), null, "oneToMany", null, 0, -1, Attributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttributes_OneToOne(), this.getOneToOne(), null, "oneToOne", null, 0, -1, Attributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttributes_ManyToMany(), this.getManyToMany(), null, "manyToMany", null, 0, -1, Attributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttributes_Embedded(), this.getEmbedded(), null, "embedded", null, 0, -1, Attributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttributes_Transient(), this.getTransient(), null, "transient", null, 0, -1, Attributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(basicEClass, Basic.class, "Basic", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBasic_Column(), this.getColumn(), null, "column", null, 0, 1, Basic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBasic_Lob(), this.getLob(), null, "lob", null, 0, 1, Basic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBasic_Temporal(), this.getTemporal(), "temporal", null, 0, 1, Basic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBasic_Enumerated(), this.getEnumerated(), "enumerated", null, 0, 1, Basic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBasic_Fetch(), this.getFetchType(), "fetch", null, 0, 1, Basic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBasic_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, Basic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBasic_Optional(), theXMLTypePackage.getBoolean(), "optional", null, 0, 1, Basic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cascadeTypeEClass, CascadeType.class, "CascadeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCascadeType_CascadeAll(), this.getEmptyType(), null, "cascadeAll", null, 0, 1, CascadeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCascadeType_CascadePersist(), this.getEmptyType(), null, "cascadePersist", null, 0, 1, CascadeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCascadeType_CascadeMerge(), this.getEmptyType(), null, "cascadeMerge", null, 0, 1, CascadeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCascadeType_CascadeRemove(), this.getEmptyType(), null, "cascadeRemove", null, 0, 1, CascadeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCascadeType_CascadeRefresh(), this.getEmptyType(), null, "cascadeRefresh", null, 0, 1, CascadeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(columnEClass, Column.class, "Column", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getColumn_ColumnDefinition(), theXMLTypePackage.getString(), "columnDefinition", null, 0, 1, Column.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColumn_Insertable(), theXMLTypePackage.getBoolean(), "insertable", null, 0, 1, Column.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColumn_Length(), theXMLTypePackage.getInt(), "length", null, 0, 1, Column.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColumn_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, Column.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColumn_Nullable(), theXMLTypePackage.getBoolean(), "nullable", null, 0, 1, Column.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColumn_Precision(), theXMLTypePackage.getInt(), "precision", null, 0, 1, Column.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColumn_Scale(), theXMLTypePackage.getInt(), "scale", null, 0, 1, Column.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColumn_Table(), theXMLTypePackage.getString(), "table", null, 0, 1, Column.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColumn_Unique(), theXMLTypePackage.getBoolean(), "unique", null, 0, 1, Column.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColumn_Updatable(), theXMLTypePackage.getBoolean(), "updatable", null, 0, 1, Column.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(columnResultEClass, ColumnResult.class, "ColumnResult", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getColumnResult_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, ColumnResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(discriminatorColumnEClass, DiscriminatorColumn.class, "DiscriminatorColumn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiscriminatorColumn_ColumnDefinition(), theXMLTypePackage.getString(), "columnDefinition", null, 0, 1, DiscriminatorColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiscriminatorColumn_DiscriminatorType(), this.getDiscriminatorType(), "discriminatorType", null, 0, 1, DiscriminatorColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiscriminatorColumn_Length(), theXMLTypePackage.getInt(), "length", null, 0, 1, DiscriminatorColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiscriminatorColumn_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, DiscriminatorColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_EntityMappings(), this.getEntityMappingsType(), null, "entityMappings", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(embeddableEClass, Embeddable.class, "Embeddable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEmbeddable_Description(), theXMLTypePackage.getString(), "description", null, 0, 1, Embeddable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEmbeddable_Attributes(), this.getEmbeddableAttributes(), null, "attributes", null, 0, 1, Embeddable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEmbeddable_Access(), this.getAccessType(), "access", null, 0, 1, Embeddable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEmbeddable_Class(), theXMLTypePackage.getString(), "class", null, 1, 1, Embeddable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEmbeddable_MetadataComplete(), theXMLTypePackage.getBoolean(), "metadataComplete", null, 0, 1, Embeddable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(embeddableAttributesEClass, EmbeddableAttributes.class, "EmbeddableAttributes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEmbeddableAttributes_Basic(), this.getBasic(), null, "basic", null, 0, -1, EmbeddableAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEmbeddableAttributes_Transient(), this.getTransient(), null, "transient", null, 0, -1, EmbeddableAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(embeddedEClass, Embedded.class, "Embedded", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEmbedded_AttributeOverride(), this.getAttributeOverride(), null, "attributeOverride", null, 0, -1, Embedded.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEmbedded_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, Embedded.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(embeddedIdEClass, EmbeddedId.class, "EmbeddedId", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEmbeddedId_AttributeOverride(), this.getAttributeOverride(), null, "attributeOverride", null, 0, -1, EmbeddedId.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEmbeddedId_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, EmbeddedId.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(emptyTypeEClass, EmptyType.class, "EmptyType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(entityEClass, Entity.class, "Entity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEntity_Description(), theXMLTypePackage.getString(), "description", null, 0, 1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntity_Table(), this.getTable(), null, "table", null, 0, 1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntity_SecondaryTable(), this.getSecondaryTable(), null, "secondaryTable", null, 0, -1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntity_PrimaryKeyJoinColumn(), this.getPrimaryKeyJoinColumn(), null, "primaryKeyJoinColumn", null, 0, -1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntity_IdClass(), this.getIdClass(), null, "idClass", null, 0, 1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntity_Inheritance(), this.getInheritance(), null, "inheritance", null, 0, 1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntity_DiscriminatorValue(), this.getDiscriminatorValue(), "discriminatorValue", null, 0, 1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntity_DiscriminatorColumn(), this.getDiscriminatorColumn(), null, "discriminatorColumn", null, 0, 1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntity_SequenceGenerator(), this.getSequenceGenerator(), null, "sequenceGenerator", null, 0, 1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntity_TableGenerator(), this.getTableGenerator(), null, "tableGenerator", null, 0, 1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntity_NamedQuery(), this.getNamedQuery(), null, "namedQuery", null, 0, -1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntity_NamedNativeQuery(), this.getNamedNativeQuery(), null, "namedNativeQuery", null, 0, -1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntity_SqlResultSetMapping(), this.getSqlResultSetMapping(), null, "sqlResultSetMapping", null, 0, -1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntity_ExcludeDefaultListeners(), this.getEmptyType(), null, "excludeDefaultListeners", null, 0, 1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntity_ExcludeSuperclassListeners(), this.getEmptyType(), null, "excludeSuperclassListeners", null, 0, 1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntity_EntityListeners(), this.getEntityListeners(), null, "entityListeners", null, 0, 1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntity_PrePersist(), this.getPrePersist(), null, "prePersist", null, 0, 1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntity_PostPersist(), this.getPostPersist(), null, "postPersist", null, 0, 1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntity_PreRemove(), this.getPreRemove(), null, "preRemove", null, 0, 1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntity_PostRemove(), this.getPostRemove(), null, "postRemove", null, 0, 1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntity_PreUpdate(), this.getPreUpdate(), null, "preUpdate", null, 0, 1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntity_PostUpdate(), this.getPostUpdate(), null, "postUpdate", null, 0, 1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntity_PostLoad(), this.getPostLoad(), null, "postLoad", null, 0, 1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntity_AttributeOverride(), this.getAttributeOverride(), null, "attributeOverride", null, 0, -1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntity_AssociationOverride(), this.getAssociationOverride(), null, "associationOverride", null, 0, -1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntity_Attributes(), this.getAttributes(), null, "attributes", null, 0, 1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntity_Access(), this.getAccessType(), "access", null, 0, 1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntity_Class(), theXMLTypePackage.getString(), "class", null, 1, 1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntity_MetadataComplete(), theXMLTypePackage.getBoolean(), "metadataComplete", null, 0, 1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntity_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entityListenerEClass, EntityListener.class, "EntityListener", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEntityListener_PrePersist(), this.getPrePersist(), null, "prePersist", null, 0, 1, EntityListener.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntityListener_PostPersist(), this.getPostPersist(), null, "postPersist", null, 0, 1, EntityListener.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntityListener_PreRemove(), this.getPreRemove(), null, "preRemove", null, 0, 1, EntityListener.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntityListener_PostRemove(), this.getPostRemove(), null, "postRemove", null, 0, 1, EntityListener.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntityListener_PreUpdate(), this.getPreUpdate(), null, "preUpdate", null, 0, 1, EntityListener.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntityListener_PostUpdate(), this.getPostUpdate(), null, "postUpdate", null, 0, 1, EntityListener.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntityListener_PostLoad(), this.getPostLoad(), null, "postLoad", null, 0, 1, EntityListener.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntityListener_Class(), theXMLTypePackage.getString(), "class", null, 1, 1, EntityListener.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entityListenersEClass, EntityListeners.class, "EntityListeners", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEntityListeners_EntityListener(), this.getEntityListener(), null, "entityListener", null, 0, -1, EntityListeners.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entityMappingsTypeEClass, EntityMappingsType.class, "EntityMappingsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEntityMappingsType_Description(), theXMLTypePackage.getString(), "description", null, 0, 1, EntityMappingsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntityMappingsType_PersistenceUnitMetadata(), this.getPersistenceUnitMetadata(), null, "persistenceUnitMetadata", null, 0, 1, EntityMappingsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntityMappingsType_Package(), theXMLTypePackage.getString(), "package", null, 0, 1, EntityMappingsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntityMappingsType_Schema(), theXMLTypePackage.getString(), "schema", null, 0, 1, EntityMappingsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntityMappingsType_Catalog(), theXMLTypePackage.getString(), "catalog", null, 0, 1, EntityMappingsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntityMappingsType_Access(), this.getAccessType(), "access", null, 0, 1, EntityMappingsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntityMappingsType_SequenceGenerator(), this.getSequenceGenerator(), null, "sequenceGenerator", null, 0, -1, EntityMappingsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntityMappingsType_TableGenerator(), this.getTableGenerator(), null, "tableGenerator", null, 0, -1, EntityMappingsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntityMappingsType_NamedQuery(), this.getNamedQuery(), null, "namedQuery", null, 0, -1, EntityMappingsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntityMappingsType_NamedNativeQuery(), this.getNamedNativeQuery(), null, "namedNativeQuery", null, 0, -1, EntityMappingsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntityMappingsType_SqlResultSetMapping(), this.getSqlResultSetMapping(), null, "sqlResultSetMapping", null, 0, -1, EntityMappingsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntityMappingsType_MappedSuperclass(), this.getMappedSuperclass(), null, "mappedSuperclass", null, 0, -1, EntityMappingsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntityMappingsType_Entity(), this.getEntity(), null, "entity", null, 0, -1, EntityMappingsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntityMappingsType_Embeddable(), this.getEmbeddable(), null, "embeddable", null, 0, -1, EntityMappingsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntityMappingsType_Version(), this.getVersionType(), "version", "1.0", 1, 1, EntityMappingsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entityResultEClass, EntityResult.class, "EntityResult", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEntityResult_FieldResult(), this.getFieldResult(), null, "fieldResult", null, 0, -1, EntityResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntityResult_DiscriminatorColumn(), theXMLTypePackage.getString(), "discriminatorColumn", null, 0, 1, EntityResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntityResult_EntityClass(), theXMLTypePackage.getString(), "entityClass", null, 1, 1, EntityResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fieldResultEClass, FieldResult.class, "FieldResult", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFieldResult_Column(), theXMLTypePackage.getString(), "column", null, 1, 1, FieldResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFieldResult_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, FieldResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(generatedValueEClass, GeneratedValue.class, "GeneratedValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGeneratedValue_Generator(), theXMLTypePackage.getString(), "generator", null, 0, 1, GeneratedValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGeneratedValue_Strategy(), this.getGenerationType(), "strategy", null, 0, 1, GeneratedValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(idEClass, Id.class, "Id", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getId_Column(), this.getColumn(), null, "column", null, 0, 1, Id.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getId_GeneratedValue(), this.getGeneratedValue(), null, "generatedValue", null, 0, 1, Id.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getId_Temporal(), this.getTemporal(), "temporal", null, 0, 1, Id.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getId_TableGenerator(), this.getTableGenerator(), null, "tableGenerator", null, 0, 1, Id.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getId_SequenceGenerator(), this.getSequenceGenerator(), null, "sequenceGenerator", null, 0, 1, Id.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getId_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, Id.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(idClassEClass, IdClass.class, "IdClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIdClass_Class(), theXMLTypePackage.getString(), "class", null, 1, 1, IdClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inheritanceEClass, Inheritance.class, "Inheritance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInheritance_Strategy(), this.getInheritanceType(), "strategy", null, 0, 1, Inheritance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(joinColumnEClass, JoinColumn.class, "JoinColumn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJoinColumn_ColumnDefinition(), theXMLTypePackage.getString(), "columnDefinition", null, 0, 1, JoinColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJoinColumn_Insertable(), theXMLTypePackage.getBoolean(), "insertable", null, 0, 1, JoinColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJoinColumn_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, JoinColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJoinColumn_Nullable(), theXMLTypePackage.getBoolean(), "nullable", null, 0, 1, JoinColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJoinColumn_ReferencedColumnName(), theXMLTypePackage.getString(), "referencedColumnName", null, 0, 1, JoinColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJoinColumn_Table(), theXMLTypePackage.getString(), "table", null, 0, 1, JoinColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJoinColumn_Unique(), theXMLTypePackage.getBoolean(), "unique", null, 0, 1, JoinColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJoinColumn_Updatable(), theXMLTypePackage.getBoolean(), "updatable", null, 0, 1, JoinColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(joinTableEClass, JoinTable.class, "JoinTable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJoinTable_JoinColumn(), this.getJoinColumn(), null, "joinColumn", null, 0, -1, JoinTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJoinTable_InverseJoinColumn(), this.getJoinColumn(), null, "inverseJoinColumn", null, 0, -1, JoinTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJoinTable_UniqueConstraint(), this.getUniqueConstraint(), null, "uniqueConstraint", null, 0, -1, JoinTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJoinTable_Catalog(), theXMLTypePackage.getString(), "catalog", null, 0, 1, JoinTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJoinTable_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, JoinTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJoinTable_Schema(), theXMLTypePackage.getString(), "schema", null, 0, 1, JoinTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lobEClass, Lob.class, "Lob", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(manyToManyEClass, ManyToMany.class, "ManyToMany", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getManyToMany_OrderBy(), this.getOrderBy(), "orderBy", null, 0, 1, ManyToMany.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getManyToMany_MapKey(), this.getMapKey(), null, "mapKey", null, 0, 1, ManyToMany.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getManyToMany_JoinTable(), this.getJoinTable(), null, "joinTable", null, 0, 1, ManyToMany.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getManyToMany_Cascade(), this.getCascadeType(), null, "cascade", null, 0, 1, ManyToMany.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getManyToMany_Fetch(), this.getFetchType(), "fetch", null, 0, 1, ManyToMany.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getManyToMany_MappedBy(), theXMLTypePackage.getString(), "mappedBy", null, 0, 1, ManyToMany.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getManyToMany_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, ManyToMany.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getManyToMany_TargetEntity(), theXMLTypePackage.getString(), "targetEntity", null, 0, 1, ManyToMany.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(manyToOneEClass, ManyToOne.class, "ManyToOne", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getManyToOne_JoinColumn(), this.getJoinColumn(), null, "joinColumn", null, 0, -1, ManyToOne.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getManyToOne_JoinTable(), this.getJoinTable(), null, "joinTable", null, 0, 1, ManyToOne.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getManyToOne_Cascade(), this.getCascadeType(), null, "cascade", null, 0, 1, ManyToOne.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getManyToOne_Fetch(), this.getFetchType(), "fetch", null, 0, 1, ManyToOne.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getManyToOne_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, ManyToOne.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getManyToOne_Optional(), theXMLTypePackage.getBoolean(), "optional", null, 0, 1, ManyToOne.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getManyToOne_TargetEntity(), theXMLTypePackage.getString(), "targetEntity", null, 0, 1, ManyToOne.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mapKeyEClass, MapKey.class, "MapKey", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMapKey_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, MapKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mappedSuperclassEClass, MappedSuperclass.class, "MappedSuperclass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMappedSuperclass_Description(), theXMLTypePackage.getString(), "description", null, 0, 1, MappedSuperclass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMappedSuperclass_IdClass(), this.getIdClass(), null, "idClass", null, 0, 1, MappedSuperclass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMappedSuperclass_ExcludeDefaultListeners(), this.getEmptyType(), null, "excludeDefaultListeners", null, 0, 1, MappedSuperclass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMappedSuperclass_ExcludeSuperclassListeners(), this.getEmptyType(), null, "excludeSuperclassListeners", null, 0, 1, MappedSuperclass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMappedSuperclass_EntityListeners(), this.getEntityListeners(), null, "entityListeners", null, 0, 1, MappedSuperclass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMappedSuperclass_PrePersist(), this.getPrePersist(), null, "prePersist", null, 0, 1, MappedSuperclass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMappedSuperclass_PostPersist(), this.getPostPersist(), null, "postPersist", null, 0, 1, MappedSuperclass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMappedSuperclass_PreRemove(), this.getPreRemove(), null, "preRemove", null, 0, 1, MappedSuperclass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMappedSuperclass_PostRemove(), this.getPostRemove(), null, "postRemove", null, 0, 1, MappedSuperclass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMappedSuperclass_PreUpdate(), this.getPreUpdate(), null, "preUpdate", null, 0, 1, MappedSuperclass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMappedSuperclass_PostUpdate(), this.getPostUpdate(), null, "postUpdate", null, 0, 1, MappedSuperclass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMappedSuperclass_PostLoad(), this.getPostLoad(), null, "postLoad", null, 0, 1, MappedSuperclass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMappedSuperclass_Attributes(), this.getAttributes(), null, "attributes", null, 0, 1, MappedSuperclass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMappedSuperclass_Access(), this.getAccessType(), "access", null, 0, 1, MappedSuperclass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMappedSuperclass_Class(), theXMLTypePackage.getString(), "class", null, 1, 1, MappedSuperclass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMappedSuperclass_MetadataComplete(), theXMLTypePackage.getBoolean(), "metadataComplete", null, 0, 1, MappedSuperclass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(namedNativeQueryEClass, NamedNativeQuery.class, "NamedNativeQuery", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedNativeQuery_Query(), theXMLTypePackage.getString(), "query", null, 1, 1, NamedNativeQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNamedNativeQuery_Hint(), this.getQueryHint(), null, "hint", null, 0, -1, NamedNativeQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNamedNativeQuery_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, NamedNativeQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNamedNativeQuery_ResultClass(), theXMLTypePackage.getString(), "resultClass", null, 0, 1, NamedNativeQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNamedNativeQuery_ResultSetMapping(), theXMLTypePackage.getString(), "resultSetMapping", null, 0, 1, NamedNativeQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(namedQueryEClass, NamedQuery.class, "NamedQuery", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedQuery_Query(), theXMLTypePackage.getString(), "query", null, 1, 1, NamedQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNamedQuery_Hint(), this.getQueryHint(), null, "hint", null, 0, -1, NamedQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNamedQuery_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, NamedQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(oneToManyEClass, OneToMany.class, "OneToMany", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOneToMany_OrderBy(), this.getOrderBy(), "orderBy", null, 0, 1, OneToMany.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOneToMany_MapKey(), this.getMapKey(), null, "mapKey", null, 0, 1, OneToMany.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOneToMany_JoinTable(), this.getJoinTable(), null, "joinTable", null, 0, 1, OneToMany.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOneToMany_JoinColumn(), this.getJoinColumn(), null, "joinColumn", null, 0, -1, OneToMany.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOneToMany_Cascade(), this.getCascadeType(), null, "cascade", null, 0, 1, OneToMany.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOneToMany_Fetch(), this.getFetchType(), "fetch", null, 0, 1, OneToMany.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOneToMany_MappedBy(), theXMLTypePackage.getString(), "mappedBy", null, 0, 1, OneToMany.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOneToMany_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, OneToMany.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOneToMany_TargetEntity(), theXMLTypePackage.getString(), "targetEntity", null, 0, 1, OneToMany.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(oneToOneEClass, OneToOne.class, "OneToOne", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOneToOne_PrimaryKeyJoinColumn(), this.getPrimaryKeyJoinColumn(), null, "primaryKeyJoinColumn", null, 0, -1, OneToOne.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOneToOne_JoinColumn(), this.getJoinColumn(), null, "joinColumn", null, 0, -1, OneToOne.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOneToOne_JoinTable(), this.getJoinTable(), null, "joinTable", null, 0, 1, OneToOne.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOneToOne_Cascade(), this.getCascadeType(), null, "cascade", null, 0, 1, OneToOne.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOneToOne_Fetch(), this.getFetchType(), "fetch", null, 0, 1, OneToOne.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOneToOne_MappedBy(), theXMLTypePackage.getString(), "mappedBy", null, 0, 1, OneToOne.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOneToOne_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, OneToOne.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOneToOne_Optional(), theXMLTypePackage.getBoolean(), "optional", null, 0, 1, OneToOne.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOneToOne_TargetEntity(), theXMLTypePackage.getString(), "targetEntity", null, 0, 1, OneToOne.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(persistenceUnitDefaultsEClass, PersistenceUnitDefaults.class, "PersistenceUnitDefaults", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPersistenceUnitDefaults_Schema(), theXMLTypePackage.getString(), "schema", null, 0, 1, PersistenceUnitDefaults.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersistenceUnitDefaults_Catalog(), theXMLTypePackage.getString(), "catalog", null, 0, 1, PersistenceUnitDefaults.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersistenceUnitDefaults_Access(), this.getAccessType(), "access", null, 0, 1, PersistenceUnitDefaults.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPersistenceUnitDefaults_CascadePersist(), this.getEmptyType(), null, "cascadePersist", null, 0, 1, PersistenceUnitDefaults.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPersistenceUnitDefaults_EntityListeners(), this.getEntityListeners(), null, "entityListeners", null, 0, 1, PersistenceUnitDefaults.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(persistenceUnitMetadataEClass, PersistenceUnitMetadata.class, "PersistenceUnitMetadata", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPersistenceUnitMetadata_XmlMappingMetadataComplete(), this.getEmptyType(), null, "xmlMappingMetadataComplete", null, 0, 1, PersistenceUnitMetadata.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPersistenceUnitMetadata_PersistenceUnitDefaults(), this.getPersistenceUnitDefaults(), null, "persistenceUnitDefaults", null, 0, 1, PersistenceUnitMetadata.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(postLoadEClass, PostLoad.class, "PostLoad", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPostLoad_MethodName(), theXMLTypePackage.getString(), "methodName", null, 1, 1, PostLoad.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(postPersistEClass, PostPersist.class, "PostPersist", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPostPersist_MethodName(), theXMLTypePackage.getString(), "methodName", null, 1, 1, PostPersist.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(postRemoveEClass, PostRemove.class, "PostRemove", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPostRemove_MethodName(), theXMLTypePackage.getString(), "methodName", null, 1, 1, PostRemove.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(postUpdateEClass, PostUpdate.class, "PostUpdate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPostUpdate_MethodName(), theXMLTypePackage.getString(), "methodName", null, 1, 1, PostUpdate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(prePersistEClass, PrePersist.class, "PrePersist", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPrePersist_MethodName(), theXMLTypePackage.getString(), "methodName", null, 1, 1, PrePersist.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(preRemoveEClass, PreRemove.class, "PreRemove", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPreRemove_MethodName(), theXMLTypePackage.getString(), "methodName", null, 1, 1, PreRemove.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(preUpdateEClass, PreUpdate.class, "PreUpdate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPreUpdate_MethodName(), theXMLTypePackage.getString(), "methodName", null, 1, 1, PreUpdate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(primaryKeyJoinColumnEClass, PrimaryKeyJoinColumn.class, "PrimaryKeyJoinColumn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPrimaryKeyJoinColumn_ColumnDefinition(), theXMLTypePackage.getString(), "columnDefinition", null, 0, 1, PrimaryKeyJoinColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPrimaryKeyJoinColumn_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, PrimaryKeyJoinColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPrimaryKeyJoinColumn_ReferencedColumnName(), theXMLTypePackage.getString(), "referencedColumnName", null, 0, 1, PrimaryKeyJoinColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(queryHintEClass, QueryHint.class, "QueryHint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQueryHint_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, QueryHint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQueryHint_Value(), theXMLTypePackage.getString(), "value", null, 1, 1, QueryHint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(secondaryTableEClass, SecondaryTable.class, "SecondaryTable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSecondaryTable_PrimaryKeyJoinColumn(), this.getPrimaryKeyJoinColumn(), null, "primaryKeyJoinColumn", null, 0, -1, SecondaryTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSecondaryTable_UniqueConstraint(), this.getUniqueConstraint(), null, "uniqueConstraint", null, 0, -1, SecondaryTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSecondaryTable_Catalog(), theXMLTypePackage.getString(), "catalog", null, 0, 1, SecondaryTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSecondaryTable_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, SecondaryTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSecondaryTable_Schema(), theXMLTypePackage.getString(), "schema", null, 0, 1, SecondaryTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sequenceGeneratorEClass, SequenceGenerator.class, "SequenceGenerator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSequenceGenerator_AllocationSize(), theXMLTypePackage.getInt(), "allocationSize", null, 0, 1, SequenceGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSequenceGenerator_InitialValue(), theXMLTypePackage.getInt(), "initialValue", null, 0, 1, SequenceGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSequenceGenerator_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, SequenceGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSequenceGenerator_SequenceName(), theXMLTypePackage.getString(), "sequenceName", null, 0, 1, SequenceGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sqlResultSetMappingEClass, SqlResultSetMapping.class, "SqlResultSetMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSqlResultSetMapping_EntityResult(), this.getEntityResult(), null, "entityResult", null, 0, -1, SqlResultSetMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSqlResultSetMapping_ColumnResult(), this.getColumnResult(), null, "columnResult", null, 0, -1, SqlResultSetMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSqlResultSetMapping_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, SqlResultSetMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tableEClass, Table.class, "Table", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTable_UniqueConstraint(), this.getUniqueConstraint(), null, "uniqueConstraint", null, 0, -1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTable_Catalog(), theXMLTypePackage.getString(), "catalog", null, 0, 1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTable_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTable_Schema(), theXMLTypePackage.getString(), "schema", null, 0, 1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tableGeneratorEClass, TableGenerator.class, "TableGenerator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTableGenerator_UniqueConstraint(), this.getUniqueConstraint(), null, "uniqueConstraint", null, 0, -1, TableGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTableGenerator_AllocationSize(), theXMLTypePackage.getInt(), "allocationSize", null, 0, 1, TableGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTableGenerator_Catalog(), theXMLTypePackage.getString(), "catalog", null, 0, 1, TableGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTableGenerator_InitialValue(), theXMLTypePackage.getInt(), "initialValue", null, 0, 1, TableGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTableGenerator_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, TableGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTableGenerator_PkColumnName(), theXMLTypePackage.getString(), "pkColumnName", null, 0, 1, TableGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTableGenerator_PkColumnValue(), theXMLTypePackage.getString(), "pkColumnValue", null, 0, 1, TableGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTableGenerator_Schema(), theXMLTypePackage.getString(), "schema", null, 0, 1, TableGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTableGenerator_Table(), theXMLTypePackage.getString(), "table", null, 0, 1, TableGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTableGenerator_ValueColumnName(), theXMLTypePackage.getString(), "valueColumnName", null, 0, 1, TableGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transientEClass, Transient.class, "Transient", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTransient_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, Transient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uniqueConstraintEClass, UniqueConstraint.class, "UniqueConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUniqueConstraint_ColumnName(), theXMLTypePackage.getString(), "columnName", null, 1, -1, UniqueConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(versionEClass, Version.class, "Version", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVersion_Column(), this.getColumn(), null, "column", null, 0, 1, Version.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVersion_Temporal(), this.getTemporal(), "temporal", null, 0, 1, Version.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVersion_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, Version.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(accessTypeEEnum, AccessType.class, "AccessType");
		addEEnumLiteral(accessTypeEEnum, AccessType.PROPERTY);
		addEEnumLiteral(accessTypeEEnum, AccessType.FIELD);

		initEEnum(discriminatorTypeEEnum, DiscriminatorType.class, "DiscriminatorType");
		addEEnumLiteral(discriminatorTypeEEnum, DiscriminatorType.STRING);
		addEEnumLiteral(discriminatorTypeEEnum, DiscriminatorType.CHAR);
		addEEnumLiteral(discriminatorTypeEEnum, DiscriminatorType.INTEGER);

		initEEnum(enumTypeEEnum, EnumType.class, "EnumType");
		addEEnumLiteral(enumTypeEEnum, EnumType.ORDINAL);
		addEEnumLiteral(enumTypeEEnum, EnumType.STRING);

		initEEnum(fetchTypeEEnum, FetchType.class, "FetchType");
		addEEnumLiteral(fetchTypeEEnum, FetchType.LAZY);
		addEEnumLiteral(fetchTypeEEnum, FetchType.EAGER);

		initEEnum(generationTypeEEnum, GenerationType.class, "GenerationType");
		addEEnumLiteral(generationTypeEEnum, GenerationType.TABLE);
		addEEnumLiteral(generationTypeEEnum, GenerationType.SEQUENCE);
		addEEnumLiteral(generationTypeEEnum, GenerationType.IDENTITY);
		addEEnumLiteral(generationTypeEEnum, GenerationType.AUTO);

		initEEnum(inheritanceTypeEEnum, InheritanceType.class, "InheritanceType");
		addEEnumLiteral(inheritanceTypeEEnum, InheritanceType.SINGLETABLE);
		addEEnumLiteral(inheritanceTypeEEnum, InheritanceType.JOINED);
		addEEnumLiteral(inheritanceTypeEEnum, InheritanceType.TABLEPERCLASS);

		initEEnum(temporalTypeEEnum, TemporalType.class, "TemporalType");
		addEEnumLiteral(temporalTypeEEnum, TemporalType.DATE);
		addEEnumLiteral(temporalTypeEEnum, TemporalType.TIME);
		addEEnumLiteral(temporalTypeEEnum, TemporalType.TIMESTAMP);

		// Initialize data types
		initEDataType(accessTypeObjectEDataType, AccessType.class, "AccessTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(discriminatorTypeObjectEDataType, DiscriminatorType.class, "DiscriminatorTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(discriminatorValueEDataType, String.class, "DiscriminatorValue", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(enumeratedEDataType, EnumType.class, "Enumerated", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(enumTypeObjectEDataType, EnumType.class, "EnumTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(fetchTypeObjectEDataType, FetchType.class, "FetchTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(generationTypeObjectEDataType, GenerationType.class, "GenerationTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(inheritanceTypeObjectEDataType, InheritanceType.class, "InheritanceTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(orderByEDataType, String.class, "OrderBy", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(temporalEDataType, TemporalType.class, "Temporal", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(temporalTypeObjectEDataType, TemporalType.class, "TemporalTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(versionTypeEDataType, String.class, "VersionType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
		// teneo.escape
		createTeneoAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";			
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "qualified", "true"
		   });			
		addAnnotation
		  (accessTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "access-type"
		   });		
		addAnnotation
		  (accessTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "access-type:Object",
			 "baseType", "access-type"
		   });			
		addAnnotation
		  (associationOverrideEClass, 
		   source, 
		   new String[] {
			 "name", "association-override",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getAssociationOverride_JoinColumn(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "join-column",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAssociationOverride_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });			
		addAnnotation
		  (attributeOverrideEClass, 
		   source, 
		   new String[] {
			 "name", "attribute-override",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getAttributeOverride_Column(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "column",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAttributeOverride_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });			
		addAnnotation
		  (attributesEClass, 
		   source, 
		   new String[] {
			 "name", "attributes",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getAttributes_Id(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "id",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAttributes_EmbeddedId(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "embedded-id",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAttributes_Basic(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "basic",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAttributes_Version(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "version",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAttributes_ManyToOne(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "many-to-one",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAttributes_OneToMany(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "one-to-many",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAttributes_OneToOne(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "one-to-one",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAttributes_ManyToMany(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "many-to-many",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAttributes_Embedded(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "embedded",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAttributes_Transient(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "transient",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (basicEClass, 
		   source, 
		   new String[] {
			 "name", "basic",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getBasic_Column(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "column",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getBasic_Lob(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "lob",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getBasic_Temporal(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "temporal",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getBasic_Enumerated(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "enumerated",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getBasic_Fetch(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "fetch"
		   });		
		addAnnotation
		  (getBasic_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });		
		addAnnotation
		  (getBasic_Optional(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "optional"
		   });			
		addAnnotation
		  (cascadeTypeEClass, 
		   source, 
		   new String[] {
			 "name", "cascade-type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getCascadeType_CascadeAll(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "cascade-all",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getCascadeType_CascadePersist(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "cascade-persist",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getCascadeType_CascadeMerge(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "cascade-merge",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getCascadeType_CascadeRemove(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "cascade-remove",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getCascadeType_CascadeRefresh(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "cascade-refresh",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (columnEClass, 
		   source, 
		   new String[] {
			 "name", "column",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getColumn_ColumnDefinition(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "column-definition"
		   });		
		addAnnotation
		  (getColumn_Insertable(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "insertable"
		   });		
		addAnnotation
		  (getColumn_Length(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "length"
		   });		
		addAnnotation
		  (getColumn_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });			
		addAnnotation
		  (getColumn_Nullable(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "nullable"
		   });		
		addAnnotation
		  (getColumn_Precision(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "precision"
		   });		
		addAnnotation
		  (getColumn_Scale(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "scale"
		   });		
		addAnnotation
		  (getColumn_Table(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "table"
		   });		
		addAnnotation
		  (getColumn_Unique(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "unique"
		   });		
		addAnnotation
		  (getColumn_Updatable(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "updatable"
		   });			
		addAnnotation
		  (columnResultEClass, 
		   source, 
		   new String[] {
			 "name", "column-result",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getColumnResult_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });			
		addAnnotation
		  (discriminatorColumnEClass, 
		   source, 
		   new String[] {
			 "name", "discriminator-column",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getDiscriminatorColumn_ColumnDefinition(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "column-definition"
		   });		
		addAnnotation
		  (getDiscriminatorColumn_DiscriminatorType(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "discriminator-type"
		   });		
		addAnnotation
		  (getDiscriminatorColumn_Length(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "length"
		   });		
		addAnnotation
		  (getDiscriminatorColumn_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });				
		addAnnotation
		  (discriminatorTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "discriminator-type"
		   });		
		addAnnotation
		  (discriminatorTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "discriminator-type:Object",
			 "baseType", "discriminator-type"
		   });			
		addAnnotation
		  (discriminatorValueEDataType, 
		   source, 
		   new String[] {
			 "name", "discriminator-value",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string"
		   });		
		addAnnotation
		  (documentRootEClass, 
		   source, 
		   new String[] {
			 "name", "",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getDocumentRoot_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });		
		addAnnotation
		  (getDocumentRoot_XMLNSPrefixMap(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xmlns:prefix"
		   });		
		addAnnotation
		  (getDocumentRoot_XSISchemaLocation(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xsi:schemaLocation"
		   });		
		addAnnotation
		  (getDocumentRoot_EntityMappings(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "entity-mappings",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (embeddableEClass, 
		   source, 
		   new String[] {
			 "name", "embeddable",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getEmbeddable_Description(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "description",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getEmbeddable_Attributes(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "attributes",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getEmbeddable_Access(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "access"
		   });		
		addAnnotation
		  (getEmbeddable_Class(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "class"
		   });		
		addAnnotation
		  (getEmbeddable_MetadataComplete(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "metadata-complete"
		   });		
		addAnnotation
		  (embeddableAttributesEClass, 
		   source, 
		   new String[] {
			 "name", "embeddable-attributes",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getEmbeddableAttributes_Basic(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "basic",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getEmbeddableAttributes_Transient(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "transient",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (embeddedEClass, 
		   source, 
		   new String[] {
			 "name", "embedded",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getEmbedded_AttributeOverride(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "attribute-override",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getEmbedded_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });			
		addAnnotation
		  (embeddedIdEClass, 
		   source, 
		   new String[] {
			 "name", "embedded-id",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getEmbeddedId_AttributeOverride(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "attribute-override",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getEmbeddedId_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });		
		addAnnotation
		  (emptyTypeEClass, 
		   source, 
		   new String[] {
			 "name", "emptyType",
			 "kind", "empty"
		   });			
		addAnnotation
		  (entityEClass, 
		   source, 
		   new String[] {
			 "name", "entity",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getEntity_Description(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "description",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getEntity_Table(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "table",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getEntity_SecondaryTable(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "secondary-table",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getEntity_PrimaryKeyJoinColumn(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "primary-key-join-column",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getEntity_IdClass(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "id-class",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getEntity_Inheritance(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "inheritance",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getEntity_DiscriminatorValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "discriminator-value",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getEntity_DiscriminatorColumn(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "discriminator-column",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getEntity_SequenceGenerator(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "sequence-generator",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getEntity_TableGenerator(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "table-generator",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getEntity_NamedQuery(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "named-query",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getEntity_NamedNativeQuery(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "named-native-query",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getEntity_SqlResultSetMapping(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "sql-result-set-mapping",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getEntity_ExcludeDefaultListeners(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "exclude-default-listeners",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getEntity_ExcludeSuperclassListeners(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "exclude-superclass-listeners",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getEntity_EntityListeners(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "entity-listeners",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getEntity_PrePersist(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "pre-persist",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getEntity_PostPersist(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "post-persist",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getEntity_PreRemove(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "pre-remove",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getEntity_PostRemove(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "post-remove",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getEntity_PreUpdate(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "pre-update",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getEntity_PostUpdate(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "post-update",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getEntity_PostLoad(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "post-load",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getEntity_AttributeOverride(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "attribute-override",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getEntity_AssociationOverride(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "association-override",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getEntity_Attributes(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "attributes",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getEntity_Access(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "access"
		   });		
		addAnnotation
		  (getEntity_Class(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "class"
		   });		
		addAnnotation
		  (getEntity_MetadataComplete(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "metadata-complete"
		   });		
		addAnnotation
		  (getEntity_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });			
		addAnnotation
		  (entityListenerEClass, 
		   source, 
		   new String[] {
			 "name", "entity-listener",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getEntityListener_PrePersist(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "pre-persist",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getEntityListener_PostPersist(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "post-persist",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getEntityListener_PreRemove(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "pre-remove",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getEntityListener_PostRemove(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "post-remove",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getEntityListener_PreUpdate(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "pre-update",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getEntityListener_PostUpdate(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "post-update",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getEntityListener_PostLoad(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "post-load",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getEntityListener_Class(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "class"
		   });			
		addAnnotation
		  (entityListenersEClass, 
		   source, 
		   new String[] {
			 "name", "entity-listeners",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getEntityListeners_EntityListener(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "entity-listener",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (entityMappingsTypeEClass, 
		   source, 
		   new String[] {
			 "name", "entity-mappings_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getEntityMappingsType_Description(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "description",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getEntityMappingsType_PersistenceUnitMetadata(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "persistence-unit-metadata",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getEntityMappingsType_Package(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "package",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getEntityMappingsType_Schema(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "schema",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getEntityMappingsType_Catalog(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "catalog",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getEntityMappingsType_Access(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "access",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getEntityMappingsType_SequenceGenerator(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "sequence-generator",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getEntityMappingsType_TableGenerator(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "table-generator",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getEntityMappingsType_NamedQuery(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "named-query",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getEntityMappingsType_NamedNativeQuery(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "named-native-query",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getEntityMappingsType_SqlResultSetMapping(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "sql-result-set-mapping",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getEntityMappingsType_MappedSuperclass(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "mapped-superclass",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getEntityMappingsType_Entity(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "entity",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getEntityMappingsType_Embeddable(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "embeddable",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getEntityMappingsType_Version(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "version"
		   });			
		addAnnotation
		  (entityResultEClass, 
		   source, 
		   new String[] {
			 "name", "entity-result",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getEntityResult_FieldResult(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "field-result",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getEntityResult_DiscriminatorColumn(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "discriminator-column"
		   });		
		addAnnotation
		  (getEntityResult_EntityClass(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "entity-class"
		   });			
		addAnnotation
		  (enumeratedEDataType, 
		   source, 
		   new String[] {
			 "name", "enumerated",
			 "baseType", "enum-type"
		   });			
		addAnnotation
		  (enumTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "enum-type"
		   });		
		addAnnotation
		  (enumTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "enum-type:Object",
			 "baseType", "enum-type"
		   });			
		addAnnotation
		  (fetchTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "fetch-type"
		   });		
		addAnnotation
		  (fetchTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "fetch-type:Object",
			 "baseType", "fetch-type"
		   });			
		addAnnotation
		  (fieldResultEClass, 
		   source, 
		   new String[] {
			 "name", "field-result",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getFieldResult_Column(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "column"
		   });		
		addAnnotation
		  (getFieldResult_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });			
		addAnnotation
		  (generatedValueEClass, 
		   source, 
		   new String[] {
			 "name", "generated-value",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getGeneratedValue_Generator(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "generator"
		   });		
		addAnnotation
		  (getGeneratedValue_Strategy(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "strategy"
		   });			
		addAnnotation
		  (generationTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "generation-type"
		   });		
		addAnnotation
		  (generationTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "generation-type:Object",
			 "baseType", "generation-type"
		   });			
		addAnnotation
		  (idEClass, 
		   source, 
		   new String[] {
			 "name", "id",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getId_Column(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "column",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getId_GeneratedValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "generated-value",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getId_Temporal(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "temporal",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getId_TableGenerator(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "table-generator",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getId_SequenceGenerator(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "sequence-generator",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getId_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });			
		addAnnotation
		  (idClassEClass, 
		   source, 
		   new String[] {
			 "name", "id-class",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getIdClass_Class(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "class"
		   });			
		addAnnotation
		  (inheritanceEClass, 
		   source, 
		   new String[] {
			 "name", "inheritance",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getInheritance_Strategy(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "strategy"
		   });			
		addAnnotation
		  (inheritanceTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "inheritance-type"
		   });		
		addAnnotation
		  (inheritanceTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "inheritance-type:Object",
			 "baseType", "inheritance-type"
		   });			
		addAnnotation
		  (joinColumnEClass, 
		   source, 
		   new String[] {
			 "name", "join-column",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getJoinColumn_ColumnDefinition(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "column-definition"
		   });		
		addAnnotation
		  (getJoinColumn_Insertable(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "insertable"
		   });		
		addAnnotation
		  (getJoinColumn_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });			
		addAnnotation
		  (getJoinColumn_Nullable(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "nullable"
		   });		
		addAnnotation
		  (getJoinColumn_ReferencedColumnName(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "referenced-column-name"
		   });		
		addAnnotation
		  (getJoinColumn_Table(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "table"
		   });		
		addAnnotation
		  (getJoinColumn_Unique(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "unique"
		   });		
		addAnnotation
		  (getJoinColumn_Updatable(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "updatable"
		   });			
		addAnnotation
		  (joinTableEClass, 
		   source, 
		   new String[] {
			 "name", "join-table",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getJoinTable_JoinColumn(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "join-column",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getJoinTable_InverseJoinColumn(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "inverse-join-column",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getJoinTable_UniqueConstraint(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "unique-constraint",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getJoinTable_Catalog(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "catalog"
		   });		
		addAnnotation
		  (getJoinTable_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });			
		addAnnotation
		  (getJoinTable_Schema(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "schema"
		   });			
		addAnnotation
		  (lobEClass, 
		   source, 
		   new String[] {
			 "name", "lob",
			 "kind", "empty"
		   });			
		addAnnotation
		  (manyToManyEClass, 
		   source, 
		   new String[] {
			 "name", "many-to-many",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getManyToMany_OrderBy(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "order-by",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getManyToMany_MapKey(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "map-key",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getManyToMany_JoinTable(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "join-table",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getManyToMany_Cascade(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "cascade",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getManyToMany_Fetch(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "fetch"
		   });		
		addAnnotation
		  (getManyToMany_MappedBy(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "mapped-by"
		   });		
		addAnnotation
		  (getManyToMany_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });		
		addAnnotation
		  (getManyToMany_TargetEntity(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "target-entity"
		   });			
		addAnnotation
		  (manyToOneEClass, 
		   source, 
		   new String[] {
			 "name", "many-to-one",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getManyToOne_JoinColumn(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "join-column",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getManyToOne_JoinTable(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "join-table",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getManyToOne_Cascade(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "cascade",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getManyToOne_Fetch(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "fetch"
		   });		
		addAnnotation
		  (getManyToOne_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });		
		addAnnotation
		  (getManyToOne_Optional(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "optional"
		   });		
		addAnnotation
		  (getManyToOne_TargetEntity(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "target-entity"
		   });			
		addAnnotation
		  (mapKeyEClass, 
		   source, 
		   new String[] {
			 "name", "map-key",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getMapKey_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });			
		addAnnotation
		  (mappedSuperclassEClass, 
		   source, 
		   new String[] {
			 "name", "mapped-superclass",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getMappedSuperclass_Description(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "description",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getMappedSuperclass_IdClass(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "id-class",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getMappedSuperclass_ExcludeDefaultListeners(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "exclude-default-listeners",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getMappedSuperclass_ExcludeSuperclassListeners(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "exclude-superclass-listeners",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getMappedSuperclass_EntityListeners(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "entity-listeners",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getMappedSuperclass_PrePersist(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "pre-persist",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getMappedSuperclass_PostPersist(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "post-persist",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getMappedSuperclass_PreRemove(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "pre-remove",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getMappedSuperclass_PostRemove(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "post-remove",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getMappedSuperclass_PreUpdate(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "pre-update",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getMappedSuperclass_PostUpdate(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "post-update",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getMappedSuperclass_PostLoad(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "post-load",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getMappedSuperclass_Attributes(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "attributes",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getMappedSuperclass_Access(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "access"
		   });		
		addAnnotation
		  (getMappedSuperclass_Class(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "class"
		   });		
		addAnnotation
		  (getMappedSuperclass_MetadataComplete(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "metadata-complete"
		   });			
		addAnnotation
		  (namedNativeQueryEClass, 
		   source, 
		   new String[] {
			 "name", "named-native-query",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getNamedNativeQuery_Query(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "query",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getNamedNativeQuery_Hint(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "hint",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getNamedNativeQuery_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });		
		addAnnotation
		  (getNamedNativeQuery_ResultClass(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "result-class"
		   });		
		addAnnotation
		  (getNamedNativeQuery_ResultSetMapping(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "result-set-mapping"
		   });			
		addAnnotation
		  (namedQueryEClass, 
		   source, 
		   new String[] {
			 "name", "named-query",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getNamedQuery_Query(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "query",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getNamedQuery_Hint(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "hint",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getNamedQuery_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });			
		addAnnotation
		  (oneToManyEClass, 
		   source, 
		   new String[] {
			 "name", "one-to-many",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getOneToMany_OrderBy(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "order-by",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getOneToMany_MapKey(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "map-key",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getOneToMany_JoinTable(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "join-table",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getOneToMany_JoinColumn(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "join-column",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getOneToMany_Cascade(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "cascade",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getOneToMany_Fetch(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "fetch"
		   });		
		addAnnotation
		  (getOneToMany_MappedBy(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "mapped-by"
		   });		
		addAnnotation
		  (getOneToMany_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });		
		addAnnotation
		  (getOneToMany_TargetEntity(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "target-entity"
		   });			
		addAnnotation
		  (oneToOneEClass, 
		   source, 
		   new String[] {
			 "name", "one-to-one",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getOneToOne_PrimaryKeyJoinColumn(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "primary-key-join-column",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getOneToOne_JoinColumn(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "join-column",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getOneToOne_JoinTable(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "join-table",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getOneToOne_Cascade(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "cascade",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getOneToOne_Fetch(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "fetch"
		   });		
		addAnnotation
		  (getOneToOne_MappedBy(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "mapped-by"
		   });		
		addAnnotation
		  (getOneToOne_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });		
		addAnnotation
		  (getOneToOne_Optional(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "optional"
		   });		
		addAnnotation
		  (getOneToOne_TargetEntity(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "target-entity"
		   });			
		addAnnotation
		  (orderByEDataType, 
		   source, 
		   new String[] {
			 "name", "order-by",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string"
		   });			
		addAnnotation
		  (persistenceUnitDefaultsEClass, 
		   source, 
		   new String[] {
			 "name", "persistence-unit-defaults",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getPersistenceUnitDefaults_Schema(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "schema",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getPersistenceUnitDefaults_Catalog(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "catalog",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getPersistenceUnitDefaults_Access(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "access",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getPersistenceUnitDefaults_CascadePersist(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "cascade-persist",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getPersistenceUnitDefaults_EntityListeners(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "entity-listeners",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (persistenceUnitMetadataEClass, 
		   source, 
		   new String[] {
			 "name", "persistence-unit-metadata",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getPersistenceUnitMetadata_XmlMappingMetadataComplete(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "xml-mapping-metadata-complete",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getPersistenceUnitMetadata_PersistenceUnitDefaults(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "persistence-unit-defaults",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (postLoadEClass, 
		   source, 
		   new String[] {
			 "name", "post-load",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getPostLoad_MethodName(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "method-name"
		   });			
		addAnnotation
		  (postPersistEClass, 
		   source, 
		   new String[] {
			 "name", "post-persist",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getPostPersist_MethodName(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "method-name"
		   });			
		addAnnotation
		  (postRemoveEClass, 
		   source, 
		   new String[] {
			 "name", "post-remove",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getPostRemove_MethodName(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "method-name"
		   });			
		addAnnotation
		  (postUpdateEClass, 
		   source, 
		   new String[] {
			 "name", "post-update",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getPostUpdate_MethodName(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "method-name"
		   });			
		addAnnotation
		  (prePersistEClass, 
		   source, 
		   new String[] {
			 "name", "pre-persist",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getPrePersist_MethodName(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "method-name"
		   });			
		addAnnotation
		  (preRemoveEClass, 
		   source, 
		   new String[] {
			 "name", "pre-remove",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getPreRemove_MethodName(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "method-name"
		   });			
		addAnnotation
		  (preUpdateEClass, 
		   source, 
		   new String[] {
			 "name", "pre-update",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getPreUpdate_MethodName(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "method-name"
		   });			
		addAnnotation
		  (primaryKeyJoinColumnEClass, 
		   source, 
		   new String[] {
			 "name", "primary-key-join-column",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getPrimaryKeyJoinColumn_ColumnDefinition(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "column-definition"
		   });		
		addAnnotation
		  (getPrimaryKeyJoinColumn_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });		
		addAnnotation
		  (getPrimaryKeyJoinColumn_ReferencedColumnName(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "referenced-column-name"
		   });			
		addAnnotation
		  (queryHintEClass, 
		   source, 
		   new String[] {
			 "name", "query-hint",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getQueryHint_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });		
		addAnnotation
		  (getQueryHint_Value(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "value"
		   });			
		addAnnotation
		  (secondaryTableEClass, 
		   source, 
		   new String[] {
			 "name", "secondary-table",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getSecondaryTable_PrimaryKeyJoinColumn(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "primary-key-join-column",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSecondaryTable_UniqueConstraint(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "unique-constraint",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSecondaryTable_Catalog(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "catalog"
		   });		
		addAnnotation
		  (getSecondaryTable_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });		
		addAnnotation
		  (getSecondaryTable_Schema(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "schema"
		   });			
		addAnnotation
		  (sequenceGeneratorEClass, 
		   source, 
		   new String[] {
			 "name", "sequence-generator",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getSequenceGenerator_AllocationSize(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "allocation-size"
		   });		
		addAnnotation
		  (getSequenceGenerator_InitialValue(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "initial-value"
		   });		
		addAnnotation
		  (getSequenceGenerator_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });		
		addAnnotation
		  (getSequenceGenerator_SequenceName(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "sequence-name"
		   });			
		addAnnotation
		  (sqlResultSetMappingEClass, 
		   source, 
		   new String[] {
			 "name", "sql-result-set-mapping",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getSqlResultSetMapping_EntityResult(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "entity-result",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSqlResultSetMapping_ColumnResult(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "column-result",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSqlResultSetMapping_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });			
		addAnnotation
		  (tableEClass, 
		   source, 
		   new String[] {
			 "name", "table",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getTable_UniqueConstraint(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "unique-constraint",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTable_Catalog(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "catalog"
		   });		
		addAnnotation
		  (getTable_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });			
		addAnnotation
		  (getTable_Schema(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "schema"
		   });			
		addAnnotation
		  (tableGeneratorEClass, 
		   source, 
		   new String[] {
			 "name", "table-generator",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getTableGenerator_UniqueConstraint(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "unique-constraint",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTableGenerator_AllocationSize(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "allocation-size"
		   });		
		addAnnotation
		  (getTableGenerator_Catalog(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "catalog"
		   });		
		addAnnotation
		  (getTableGenerator_InitialValue(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "initial-value"
		   });		
		addAnnotation
		  (getTableGenerator_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });		
		addAnnotation
		  (getTableGenerator_PkColumnName(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "pk-column-name"
		   });		
		addAnnotation
		  (getTableGenerator_PkColumnValue(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "pk-column-value"
		   });		
		addAnnotation
		  (getTableGenerator_Schema(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "schema"
		   });		
		addAnnotation
		  (getTableGenerator_Table(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "table"
		   });		
		addAnnotation
		  (getTableGenerator_ValueColumnName(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "value-column-name"
		   });			
		addAnnotation
		  (temporalEDataType, 
		   source, 
		   new String[] {
			 "name", "temporal",
			 "baseType", "temporal-type"
		   });			
		addAnnotation
		  (temporalTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "temporal-type"
		   });		
		addAnnotation
		  (temporalTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "temporal-type:Object",
			 "baseType", "temporal-type"
		   });			
		addAnnotation
		  (transientEClass, 
		   source, 
		   new String[] {
			 "name", "transient",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getTransient_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });			
		addAnnotation
		  (uniqueConstraintEClass, 
		   source, 
		   new String[] {
			 "name", "unique-constraint",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getUniqueConstraint_ColumnName(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "column-name",
			 "namespace", "##targetNamespace"
		   });				
		addAnnotation
		  (versionEClass, 
		   source, 
		   new String[] {
			 "name", "version",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getVersion_Column(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "column",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getVersion_Temporal(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "temporal",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getVersion_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });		
		addAnnotation
		  (versionTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "versionType",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#token",
			 "pattern", "[0-9]+(\\.[0-9]+)*"
		   });
	}

	/**
	 * Initializes the annotations for <b>teneo.escape</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createTeneoAnnotations() {
		String source = "teneo.escape";																																																	
		addAnnotation
		  (getColumn_Name(), 
		   source, 
		   new String[] {
			 "value", "true"
		   });																	
		addAnnotation
		  (getDiscriminatorColumn_Name(), 
		   source, 
		   new String[] {
			 "value", "true"
		   });																																																																																																																																											
		addAnnotation
		  (getJoinColumn_Name(), 
		   source, 
		   new String[] {
			 "value", "true"
		   });														
		addAnnotation
		  (getJoinTable_Name(), 
		   source, 
		   new String[] {
			 "value", "true"
		   });																																																																																																																																																	
		addAnnotation
		  (getTable_Name(), 
		   source, 
		   new String[] {
			 "value", "true"
		   });																										
		addAnnotation
		  (getUniqueConstraint_ColumnName(), 
		   source, 
		   new String[] {
			 "value", "true"
		   });						
	}

} //OrmPackageImpl

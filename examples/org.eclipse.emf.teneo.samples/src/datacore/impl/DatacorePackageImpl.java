/**
 * <copyright>
 * </copyright>
 *
 * $Id: DatacorePackageImpl.java,v 1.1 2007/03/07 23:34:08 mtaal Exp $
 */
package datacore.impl;

import datacore.CSMCharacteristicDefinition;
import datacore.CSMCharacteristicValueContainer;
import datacore.CSMClass;
import datacore.CSMElement;
import datacore.CSMInstance;
import datacore.CSMMetaElement;
import datacore.CSMObject;
import datacore.CSMRepresentation;
import datacore.CSMRepresentationRoot;
import datacore.CSMRepresentationRootDescriptor;
import datacore.CSMType;
import datacore.CSMValue;
import datacore.CSMValueSet;
import datacore.ColumnDefinition;
import datacore.DataSourceDefinitions;
import datacore.DatacoreFactory;
import datacore.DatacorePackage;
import datacore.Interval;
import datacore.UserProperty;

import datacore.represantations.RepresantationsPackage;

import datacore.represantations.impl.RepresantationsPackageImpl;

import datacore.types.TypesPackage;

import datacore.types.impl.TypesPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DatacorePackageImpl extends EPackageImpl implements DatacorePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass csmxmlEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass csmElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass csmMetaElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass csmClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass csmCharacteristicDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass csmInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass csmCharacteristicValueContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass csmValueSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass csmTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass csmObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass csmRepresentationRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass csmValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intervalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass csmRepresentationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataSourceDefinitionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass columnDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass csmRepresentationRootDescriptorEClass = null;

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
	 * @see datacore.DatacorePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DatacorePackageImpl() {
		super(eNS_URI, DatacoreFactory.eINSTANCE);
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
	public static DatacorePackage init() {
		if (isInited) return (DatacorePackage)EPackage.Registry.INSTANCE.getEPackage(DatacorePackage.eNS_URI);

		// Obtain or create and register package
		DatacorePackageImpl theDatacorePackage = (DatacorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof DatacorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new DatacorePackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		TypesPackageImpl theTypesPackage = (TypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) instanceof TypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) : TypesPackage.eINSTANCE);
		RepresantationsPackageImpl theRepresantationsPackage = (RepresantationsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RepresantationsPackage.eNS_URI) instanceof RepresantationsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RepresantationsPackage.eNS_URI) : RepresantationsPackage.eINSTANCE);

		// Create package meta-data objects
		theDatacorePackage.createPackageContents();
		theTypesPackage.createPackageContents();
		theRepresantationsPackage.createPackageContents();

		// Initialize created meta-data
		theDatacorePackage.initializePackageContents();
		theTypesPackage.initializePackageContents();
		theRepresantationsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDatacorePackage.freeze();

		return theDatacorePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCSMXML() {
		return csmxmlEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCSMXML_Elements() {
		return (EReference)csmxmlEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCSMXML_Types() {
		return (EReference)csmxmlEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCSMElement() {
		return csmElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCSMElement_ReferencedElements() {
		return (EReference)csmElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCSMElement_CsmXML() {
		return (EReference)csmElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCSMMetaElement() {
		return csmMetaElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCSMMetaElement_ID() {
		return (EAttribute)csmMetaElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCSMMetaElement_UserProperties() {
		return (EReference)csmMetaElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCSMClass() {
		return csmClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCSMClass_CsmCharacteristicDefinitions() {
		return (EReference)csmClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCSMClass_Instances() {
		return (EReference)csmClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCSMClass_ValidCSMTypes() {
		return (EReference)csmClassEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCSMClass_Description() {
		return (EAttribute)csmClassEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCSMClass_DatasourceDefinition() {
		return (EReference)csmClassEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCSMClass_KeyCharachteristicDefinition() {
		return (EReference)csmClassEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCSMClass_ClassRepresentations() {
		return (EReference)csmClassEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCSMCharacteristicDefinition() {
		return csmCharacteristicDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCSMCharacteristicDefinition_CsmClass() {
		return (EReference)csmCharacteristicDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCSMCharacteristicDefinition_CsmCharacteristicType() {
		return (EReference)csmCharacteristicDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCSMCharacteristicDefinition_UserDefined() {
		return (EAttribute)csmCharacteristicDefinitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCSMCharacteristicDefinition_Name() {
		return (EAttribute)csmCharacteristicDefinitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCSMCharacteristicDefinition_ValueContainer() {
		return (EReference)csmCharacteristicDefinitionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCSMCharacteristicDefinition_AliasName() {
		return (EAttribute)csmCharacteristicDefinitionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCSMCharacteristicDefinition_Index() {
		return (EAttribute)csmCharacteristicDefinitionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCSMCharacteristicDefinition_DataSource() {
		return (EReference)csmCharacteristicDefinitionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCSMCharacteristicDefinition_FreeParameter() {
		return (EAttribute)csmCharacteristicDefinitionEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCSMInstance() {
		return csmInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCSMInstance_CsmValueContainer() {
		return (EReference)csmInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCSMInstance_CsmReprasentation() {
		return (EReference)csmInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCSMInstance_ContainingCSMClass() {
		return (EReference)csmInstanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCSMCharacteristicValueContainer() {
		return csmCharacteristicValueContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCSMCharacteristicValueContainer_Valid() {
		return (EAttribute)csmCharacteristicValueContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCSMCharacteristicValueContainer_CsmInstance() {
		return (EReference)csmCharacteristicValueContainerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCSMCharacteristicValueContainer_ConcreteValue() {
		return (EReference)csmCharacteristicValueContainerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCSMCharacteristicValueContainer_ValueSet() {
		return (EReference)csmCharacteristicValueContainerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCSMCharacteristicValueContainer_DataType() {
		return (EReference)csmCharacteristicValueContainerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCSMValueSet() {
		return csmValueSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCSMValueSet_DataType() {
		return (EReference)csmValueSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCSMType() {
		return csmTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCSMObject() {
		return csmObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCSMRepresentationRoot() {
		return csmRepresentationRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCSMRepresentationRoot_Name() {
		return (EAttribute)csmRepresentationRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCSMRepresentationRoot_ModelName() {
		return (EAttribute)csmRepresentationRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCSMRepresentationRoot_CsmInstance() {
		return (EReference)csmRepresentationRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCSMRepresentationRoot_RepresentationTree() {
		return (EReference)csmRepresentationRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCSMRepresentationRoot_ValueDescriptors() {
		return (EReference)csmRepresentationRootEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCSMValue() {
		return csmValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterval() {
		return intervalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterval_Min() {
		return (EReference)intervalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterval_Max() {
		return (EReference)intervalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInterval_IncludeMin() {
		return (EAttribute)intervalEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInterval_IncludeMax() {
		return (EAttribute)intervalEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterval_Kind() {
		return (EReference)intervalEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterval_Increment() {
		return (EReference)intervalEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUserProperty() {
		return userPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserProperty_Name() {
		return (EAttribute)userPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserProperty_Value() {
		return (EAttribute)userPropertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCSMRepresentation() {
		return csmRepresentationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCSMRepresentation_Parent() {
		return (EReference)csmRepresentationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCSMRepresentation_Children() {
		return (EReference)csmRepresentationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCSMRepresentation_Valid() {
		return (EAttribute)csmRepresentationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCSMRepresentation_RepresentationRoot() {
		return (EReference)csmRepresentationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCSMRepresentation_OwnerCSMClass() {
		return (EReference)csmRepresentationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataSourceDefinitions() {
		return dataSourceDefinitionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataSourceDefinitions_OwnerClass() {
		return (EReference)dataSourceDefinitionsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataSourceDefinitions_Report() {
		return (EAttribute)dataSourceDefinitionsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getColumnDefinition() {
		return columnDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColumnDefinition_ColumnName() {
		return (EAttribute)columnDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColumnDefinition_DatasetName() {
		return (EAttribute)columnDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCSMRepresentationRootDescriptor() {
		return csmRepresentationRootDescriptorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCSMRepresentationRootDescriptor_RepresentationRoot() {
		return (EReference)csmRepresentationRootDescriptorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCSMRepresentationRootDescriptor_CharacteristicID() {
		return (EAttribute)csmRepresentationRootDescriptorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCSMRepresentationRootDescriptor_CharacteriticValue() {
		return (EAttribute)csmRepresentationRootDescriptorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatacoreFactory getDatacoreFactory() {
		return (DatacoreFactory)getEFactoryInstance();
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
		csmxmlEClass = createEClass(CSMXML);
		createEReference(csmxmlEClass, CSMXML__ELEMENTS);
		createEReference(csmxmlEClass, CSMXML__TYPES);

		csmElementEClass = createEClass(CSM_ELEMENT);
		createEReference(csmElementEClass, CSM_ELEMENT__REFERENCED_ELEMENTS);
		createEReference(csmElementEClass, CSM_ELEMENT__CSM_XML);

		csmMetaElementEClass = createEClass(CSM_META_ELEMENT);
		createEAttribute(csmMetaElementEClass, CSM_META_ELEMENT__ID);
		createEReference(csmMetaElementEClass, CSM_META_ELEMENT__USER_PROPERTIES);

		csmClassEClass = createEClass(CSM_CLASS);
		createEReference(csmClassEClass, CSM_CLASS__CSM_CHARACTERISTIC_DEFINITIONS);
		createEReference(csmClassEClass, CSM_CLASS__INSTANCES);
		createEReference(csmClassEClass, CSM_CLASS__VALID_CSM_TYPES);
		createEAttribute(csmClassEClass, CSM_CLASS__DESCRIPTION);
		createEReference(csmClassEClass, CSM_CLASS__DATASOURCE_DEFINITION);
		createEReference(csmClassEClass, CSM_CLASS__KEY_CHARACHTERISTIC_DEFINITION);
		createEReference(csmClassEClass, CSM_CLASS__CLASS_REPRESENTATIONS);

		csmCharacteristicDefinitionEClass = createEClass(CSM_CHARACTERISTIC_DEFINITION);
		createEReference(csmCharacteristicDefinitionEClass, CSM_CHARACTERISTIC_DEFINITION__CSM_CLASS);
		createEReference(csmCharacteristicDefinitionEClass, CSM_CHARACTERISTIC_DEFINITION__CSM_CHARACTERISTIC_TYPE);
		createEAttribute(csmCharacteristicDefinitionEClass, CSM_CHARACTERISTIC_DEFINITION__USER_DEFINED);
		createEAttribute(csmCharacteristicDefinitionEClass, CSM_CHARACTERISTIC_DEFINITION__NAME);
		createEReference(csmCharacteristicDefinitionEClass, CSM_CHARACTERISTIC_DEFINITION__VALUE_CONTAINER);
		createEAttribute(csmCharacteristicDefinitionEClass, CSM_CHARACTERISTIC_DEFINITION__ALIAS_NAME);
		createEAttribute(csmCharacteristicDefinitionEClass, CSM_CHARACTERISTIC_DEFINITION__INDEX);
		createEReference(csmCharacteristicDefinitionEClass, CSM_CHARACTERISTIC_DEFINITION__DATA_SOURCE);
		createEAttribute(csmCharacteristicDefinitionEClass, CSM_CHARACTERISTIC_DEFINITION__FREE_PARAMETER);

		csmInstanceEClass = createEClass(CSM_INSTANCE);
		createEReference(csmInstanceEClass, CSM_INSTANCE__CSM_VALUE_CONTAINER);
		createEReference(csmInstanceEClass, CSM_INSTANCE__CSM_REPRASENTATION);
		createEReference(csmInstanceEClass, CSM_INSTANCE__CONTAINING_CSM_CLASS);

		csmCharacteristicValueContainerEClass = createEClass(CSM_CHARACTERISTIC_VALUE_CONTAINER);
		createEAttribute(csmCharacteristicValueContainerEClass, CSM_CHARACTERISTIC_VALUE_CONTAINER__VALID);
		createEReference(csmCharacteristicValueContainerEClass, CSM_CHARACTERISTIC_VALUE_CONTAINER__CSM_INSTANCE);
		createEReference(csmCharacteristicValueContainerEClass, CSM_CHARACTERISTIC_VALUE_CONTAINER__CONCRETE_VALUE);
		createEReference(csmCharacteristicValueContainerEClass, CSM_CHARACTERISTIC_VALUE_CONTAINER__VALUE_SET);
		createEReference(csmCharacteristicValueContainerEClass, CSM_CHARACTERISTIC_VALUE_CONTAINER__DATA_TYPE);

		csmValueSetEClass = createEClass(CSM_VALUE_SET);
		createEReference(csmValueSetEClass, CSM_VALUE_SET__DATA_TYPE);

		csmTypeEClass = createEClass(CSM_TYPE);

		csmObjectEClass = createEClass(CSM_OBJECT);

		csmRepresentationRootEClass = createEClass(CSM_REPRESENTATION_ROOT);
		createEAttribute(csmRepresentationRootEClass, CSM_REPRESENTATION_ROOT__NAME);
		createEAttribute(csmRepresentationRootEClass, CSM_REPRESENTATION_ROOT__MODEL_NAME);
		createEReference(csmRepresentationRootEClass, CSM_REPRESENTATION_ROOT__CSM_INSTANCE);
		createEReference(csmRepresentationRootEClass, CSM_REPRESENTATION_ROOT__REPRESENTATION_TREE);
		createEReference(csmRepresentationRootEClass, CSM_REPRESENTATION_ROOT__VALUE_DESCRIPTORS);

		csmValueEClass = createEClass(CSM_VALUE);

		intervalEClass = createEClass(INTERVAL);
		createEReference(intervalEClass, INTERVAL__MIN);
		createEReference(intervalEClass, INTERVAL__MAX);
		createEAttribute(intervalEClass, INTERVAL__INCLUDE_MIN);
		createEAttribute(intervalEClass, INTERVAL__INCLUDE_MAX);
		createEReference(intervalEClass, INTERVAL__KIND);
		createEReference(intervalEClass, INTERVAL__INCREMENT);

		userPropertyEClass = createEClass(USER_PROPERTY);
		createEAttribute(userPropertyEClass, USER_PROPERTY__NAME);
		createEAttribute(userPropertyEClass, USER_PROPERTY__VALUE);

		csmRepresentationEClass = createEClass(CSM_REPRESENTATION);
		createEReference(csmRepresentationEClass, CSM_REPRESENTATION__PARENT);
		createEReference(csmRepresentationEClass, CSM_REPRESENTATION__CHILDREN);
		createEAttribute(csmRepresentationEClass, CSM_REPRESENTATION__VALID);
		createEReference(csmRepresentationEClass, CSM_REPRESENTATION__REPRESENTATION_ROOT);
		createEReference(csmRepresentationEClass, CSM_REPRESENTATION__OWNER_CSM_CLASS);

		dataSourceDefinitionsEClass = createEClass(DATA_SOURCE_DEFINITIONS);
		createEReference(dataSourceDefinitionsEClass, DATA_SOURCE_DEFINITIONS__OWNER_CLASS);
		createEAttribute(dataSourceDefinitionsEClass, DATA_SOURCE_DEFINITIONS__REPORT);

		columnDefinitionEClass = createEClass(COLUMN_DEFINITION);
		createEAttribute(columnDefinitionEClass, COLUMN_DEFINITION__COLUMN_NAME);
		createEAttribute(columnDefinitionEClass, COLUMN_DEFINITION__DATASET_NAME);

		csmRepresentationRootDescriptorEClass = createEClass(CSM_REPRESENTATION_ROOT_DESCRIPTOR);
		createEReference(csmRepresentationRootDescriptorEClass, CSM_REPRESENTATION_ROOT_DESCRIPTOR__REPRESENTATION_ROOT);
		createEAttribute(csmRepresentationRootDescriptorEClass, CSM_REPRESENTATION_ROOT_DESCRIPTOR__CHARACTERISTIC_ID);
		createEAttribute(csmRepresentationRootDescriptorEClass, CSM_REPRESENTATION_ROOT_DESCRIPTOR__CHARACTERITIC_VALUE);
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
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);
		RepresantationsPackage theRepresantationsPackage = (RepresantationsPackage)EPackage.Registry.INSTANCE.getEPackage(RepresantationsPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theTypesPackage);
		getESubpackages().add(theRepresantationsPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		csmMetaElementEClass.getESuperTypes().add(this.getCSMElement());
		csmClassEClass.getESuperTypes().add(this.getCSMMetaElement());
		csmCharacteristicDefinitionEClass.getESuperTypes().add(this.getCSMMetaElement());
		csmInstanceEClass.getESuperTypes().add(this.getCSMObject());
		csmCharacteristicValueContainerEClass.getESuperTypes().add(this.getCSMObject());
		csmObjectEClass.getESuperTypes().add(this.getCSMElement());
		csmValueEClass.getESuperTypes().add(this.getCSMValueSet());
		intervalEClass.getESuperTypes().add(this.getCSMValueSet());

		// Initialize classes and features; add operations and parameters
		initEClass(csmxmlEClass, datacore.CSMXML.class, "CSMXML", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCSMXML_Elements(), this.getCSMElement(), this.getCSMElement_CsmXML(), "elements", null, 0, -1, datacore.CSMXML.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCSMXML_Types(), this.getCSMType(), null, "types", "", 0, -1, datacore.CSMXML.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = addEOperation(csmxmlEClass, this.getCSMInstance(), "createCSMInstance", 0, 1);
		addEParameter(op, this.getCSMClass(), "csmClass", 1, 1);

		op = addEOperation(csmxmlEClass, this.getCSMClass(), "createCSMClass", 0, 1);
		addEParameter(op, ecorePackage.getEFactory(), "factory", 0, 1);
		addEParameter(op, ecorePackage.getEClass(), "eClass", 0, 1);

		initEClass(csmElementEClass, CSMElement.class, "CSMElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCSMElement_ReferencedElements(), this.getCSMElement(), null, "referencedElements", null, 0, -1, CSMElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCSMElement_CsmXML(), this.getCSMXML(), this.getCSMXML_Elements(), "csmXML", null, 0, 1, CSMElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(csmMetaElementEClass, CSMMetaElement.class, "CSMMetaElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCSMMetaElement_ID(), ecorePackage.getEString(), "ID", null, 0, 1, CSMMetaElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCSMMetaElement_UserProperties(), this.getUserProperty(), null, "userProperties", null, 0, -1, CSMMetaElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(csmMetaElementEClass, null, "putUserProperty");
		addEParameter(op, ecorePackage.getEString(), "key", 0, 1);
		addEParameter(op, ecorePackage.getEString(), "value", 0, 1);

		op = addEOperation(csmMetaElementEClass, this.getUserProperty(), "getUserProperty", 0, 1);
		addEParameter(op, ecorePackage.getEString(), "key", 0, 1);

		initEClass(csmClassEClass, CSMClass.class, "CSMClass", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCSMClass_CsmCharacteristicDefinitions(), this.getCSMCharacteristicDefinition(), this.getCSMCharacteristicDefinition_CsmClass(), "csmCharacteristicDefinitions", null, 0, -1, CSMClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCSMClass_Instances(), this.getCSMInstance(), this.getCSMInstance_ContainingCSMClass(), "instances", null, 0, -1, CSMClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCSMClass_ValidCSMTypes(), this.getCSMType(), null, "validCSMTypes", null, 0, -1, CSMClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCSMClass_Description(), ecorePackage.getEString(), "description", null, 0, 1, CSMClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCSMClass_DatasourceDefinition(), this.getDataSourceDefinitions(), this.getDataSourceDefinitions_OwnerClass(), "datasourceDefinition", "", 0, 1, CSMClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCSMClass_KeyCharachteristicDefinition(), this.getCSMCharacteristicDefinition(), null, "keyCharachteristicDefinition", null, 0, 1, CSMClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCSMClass_ClassRepresentations(), this.getCSMRepresentation(), this.getCSMRepresentation_OwnerCSMClass(), "classRepresentations", null, 0, -1, CSMClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(csmClassEClass, this.getCSMCharacteristicDefinition(), "addCharacteristicsDefinition", 0, 1);
		addEParameter(op, this.getCSMType(), "type", 0, 1);

		op = addEOperation(csmClassEClass, this.getCSMInstance(), "createCSMInstance", 0, 1);

		op = addEOperation(csmClassEClass, null, "removeCharacteristicsDefinition");
		addEParameter(op, this.getCSMCharacteristicDefinition(), "characteristicDefinition", 0, 1);

		op = addEOperation(csmClassEClass, this.getCSMInstance(), "createCSMInstance", 0, 1);
		addEParameter(op, this.getCSMXML(), "owner", 0, 1);

		op = addEOperation(csmClassEClass, null, "deleteCharacteristicDefinition");
		addEParameter(op, this.getCSMCharacteristicDefinition(), "characteristicDefinition", 0, 1);

		op = addEOperation(csmClassEClass, null, "deleteCSMInstance");
		addEParameter(op, this.getCSMInstance(), "csmInstance", 0, 1);

		op = addEOperation(csmClassEClass, null, "removeCSMInstance");
		addEParameter(op, this.getCSMInstance(), "csmIntsance", 0, 1);

		op = addEOperation(csmClassEClass, this.getCSMCharacteristicDefinition(), "getCSMCharacteristicDefinition", 0, 1);
		addEParameter(op, ecorePackage.getEString(), "id", 0, 1);

		op = addEOperation(csmClassEClass, this.getCSMCharacteristicDefinition(), "getCSMCharacteristicDefinition", 0, 1);
		addEParameter(op, ecorePackage.getEInt(), "index", 0, 1);

		addEOperation(csmClassEClass, null, "deleteAllCSMInstances");

		initEClass(csmCharacteristicDefinitionEClass, CSMCharacteristicDefinition.class, "CSMCharacteristicDefinition", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCSMCharacteristicDefinition_CsmClass(), this.getCSMClass(), this.getCSMClass_CsmCharacteristicDefinitions(), "csmClass", null, 0, 1, CSMCharacteristicDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCSMCharacteristicDefinition_CsmCharacteristicType(), this.getCSMType(), null, "csmCharacteristicType", null, 0, 1, CSMCharacteristicDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCSMCharacteristicDefinition_UserDefined(), ecorePackage.getEBoolean(), "userDefined", null, 0, 1, CSMCharacteristicDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCSMCharacteristicDefinition_Name(), ecorePackage.getEString(), "Name", null, 0, 1, CSMCharacteristicDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCSMCharacteristicDefinition_ValueContainer(), this.getCSMCharacteristicValueContainer(), this.getCSMCharacteristicValueContainer_DataType(), "valueContainer", null, 0, -1, CSMCharacteristicDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCSMCharacteristicDefinition_AliasName(), ecorePackage.getEString(), "aliasName", null, 0, 1, CSMCharacteristicDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCSMCharacteristicDefinition_Index(), ecorePackage.getEInt(), "index", null, 0, 1, CSMCharacteristicDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCSMCharacteristicDefinition_DataSource(), this.getColumnDefinition(), null, "dataSource", "", 0, 1, CSMCharacteristicDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCSMCharacteristicDefinition_FreeParameter(), ecorePackage.getEBoolean(), "freeParameter", "false", 0, 1, CSMCharacteristicDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(csmCharacteristicDefinitionEClass, this.getCSMCharacteristicValueContainer(), "createCSMCharacteristicValueContainer", 0, 1);
		addEParameter(op, this.getCSMInstance(), "csmInstance", 0, 1);

		op = addEOperation(csmCharacteristicDefinitionEClass, null, "deleteCSMCharactersitcValueContainer");
		addEParameter(op, this.getCSMCharacteristicValueContainer(), "valueContainer", 0, 1);

		addEOperation(csmCharacteristicDefinitionEClass, null, "deleteAllCSMCahracteristicValueContainer");

		op = addEOperation(csmCharacteristicDefinitionEClass, this.getCSMCharacteristicValueContainer(), "getCSMCahracteristicValueContainer", 0, 1);
		addEParameter(op, this.getCSMInstance(), "csmInstance", 0, 1);

		op = addEOperation(csmCharacteristicDefinitionEClass, ecorePackage.getEBoolean(), "containsOnlyUniqueValues", 0, 1);

		op = addEOperation(csmCharacteristicDefinitionEClass, ecorePackage.getEBoolean(), "isKey", 0, 1);

		initEClass(csmInstanceEClass, CSMInstance.class, "CSMInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCSMInstance_CsmValueContainer(), this.getCSMCharacteristicValueContainer(), this.getCSMCharacteristicValueContainer_CsmInstance(), "csmValueContainer", null, 0, -1, CSMInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCSMInstance_CsmReprasentation(), this.getCSMRepresentationRoot(), this.getCSMRepresentationRoot_CsmInstance(), "csmReprasentation", null, 0, -1, CSMInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCSMInstance_ContainingCSMClass(), this.getCSMClass(), this.getCSMClass_Instances(), "containingCSMClass", null, 0, 1, CSMInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(csmInstanceEClass, this.getCSMCharacteristicValueContainer(), "getCSMCharacteristicValueContainer", 0, 1);
		addEParameter(op, this.getCSMCharacteristicDefinition(), "characteristicDefinition", 0, 1);

		op = addEOperation(csmInstanceEClass, this.getCSMCharacteristicValueContainer(), "createCSMCharacteristicValueContainer", 0, 1);
		addEParameter(op, this.getCSMCharacteristicDefinition(), "characteristcDefinition", 0, 1);

		op = addEOperation(csmInstanceEClass, null, "deleteCSMCharactersitcValueContainer");
		addEParameter(op, this.getCSMCharacteristicValueContainer(), "valueContainer", 0, 1);

		addEOperation(csmInstanceEClass, null, "deleteAllCSMCharacteristicValueContainer");

		op = addEOperation(csmInstanceEClass, ecorePackage.getEBoolean(), "isValid", 0, 1);

		op = addEOperation(csmInstanceEClass, ecorePackage.getEBoolean(), "allNotUserDefinedContainerSet", 0, 1);

		initEClass(csmCharacteristicValueContainerEClass, CSMCharacteristicValueContainer.class, "CSMCharacteristicValueContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCSMCharacteristicValueContainer_Valid(), ecorePackage.getEBoolean(), "valid", "false", 0, 1, CSMCharacteristicValueContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCSMCharacteristicValueContainer_CsmInstance(), this.getCSMInstance(), this.getCSMInstance_CsmValueContainer(), "csmInstance", null, 0, 1, CSMCharacteristicValueContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCSMCharacteristicValueContainer_ConcreteValue(), this.getCSMValue(), null, "concreteValue", null, 0, 1, CSMCharacteristicValueContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCSMCharacteristicValueContainer_ValueSet(), this.getCSMValueSet(), null, "valueSet", null, 0, -1, CSMCharacteristicValueContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCSMCharacteristicValueContainer_DataType(), this.getCSMCharacteristicDefinition(), this.getCSMCharacteristicDefinition_ValueContainer(), "dataType", null, 0, 1, CSMCharacteristicValueContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(csmCharacteristicValueContainerEClass, ecorePackage.getEBoolean(), "isConcreteValueSet", 0, 1);

		op = addEOperation(csmCharacteristicValueContainerEClass, this.getCSMValue(), "setCSMConcreteValue", 0, 1);
		addEParameter(op, ecorePackage.getEString(), "value", 0, 1);

		op = addEOperation(csmCharacteristicValueContainerEClass, null, "addCSMValueToValueSet");
		addEParameter(op, ecorePackage.getEString(), "value", 0, 1);

		op = addEOperation(csmCharacteristicValueContainerEClass, null, "addIntervalToValueSet");
		addEParameter(op, ecorePackage.getEString(), "min", 0, 1);
		addEParameter(op, ecorePackage.getEString(), "max", 0, 1);
		addEParameter(op, ecorePackage.getEBoolean(), "includeMax", 0, 1);
		addEParameter(op, ecorePackage.getEBoolean(), "includeMin", 0, 1);
		addEParameter(op, ecorePackage.getEString(), "increment", 0, 1);

		addEOperation(csmCharacteristicValueContainerEClass, null, "clearValueSet");

		initEClass(csmValueSetEClass, CSMValueSet.class, "CSMValueSet", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCSMValueSet_DataType(), this.getCSMType(), null, "dataType", null, 0, 1, CSMValueSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(csmValueSetEClass, ecorePackage.getEString(), "getStringReprasentation", 0, 1);

		initEClass(csmTypeEClass, CSMType.class, "CSMType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(csmTypeEClass, this.getCSMValue(), "createCSMValue", 0, 1);
		addEParameter(op, ecorePackage.getEString(), "valueStringReprasentation", 1, 1);

		op = addEOperation(csmTypeEClass, ecorePackage.getEBoolean(), "isValid", 0, 1);
		addEParameter(op, ecorePackage.getEString(), "value", 0, 1);

		op = addEOperation(csmTypeEClass, this.getInterval(), "createCSMInterval", 0, 1);
		addEParameter(op, ecorePackage.getEString(), "min", 0, 1);
		addEParameter(op, ecorePackage.getEString(), "max", 0, 1);
		addEParameter(op, ecorePackage.getEBoolean(), "includeMin", 0, 1);
		addEParameter(op, ecorePackage.getEBoolean(), "includeMax", 0, 1);
		addEParameter(op, ecorePackage.getEString(), "increment", 0, 1);

		initEClass(csmObjectEClass, CSMObject.class, "CSMObject", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(csmRepresentationRootEClass, CSMRepresentationRoot.class, "CSMRepresentationRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCSMRepresentationRoot_Name(), ecorePackage.getEString(), "name", null, 0, 1, CSMRepresentationRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCSMRepresentationRoot_ModelName(), ecorePackage.getEString(), "modelName", null, 0, 1, CSMRepresentationRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCSMRepresentationRoot_CsmInstance(), this.getCSMInstance(), this.getCSMInstance_CsmReprasentation(), "csmInstance", null, 0, 1, CSMRepresentationRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCSMRepresentationRoot_RepresentationTree(), this.getCSMRepresentation(), this.getCSMRepresentation_RepresentationRoot(), "representationTree", "", 0, 1, CSMRepresentationRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCSMRepresentationRoot_ValueDescriptors(), this.getCSMRepresentationRootDescriptor(), this.getCSMRepresentationRootDescriptor_RepresentationRoot(), "valueDescriptors", null, 0, -1, CSMRepresentationRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(csmValueEClass, CSMValue.class, "CSMValue", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(csmValueEClass, ecorePackage.getEBoolean(), "setValueFromString", 0, 1);
		addEParameter(op, ecorePackage.getEString(), "value", 0, 1);

		initEClass(intervalEClass, Interval.class, "Interval", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInterval_Min(), this.getCSMValue(), null, "min", null, 0, 1, Interval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterval_Max(), this.getCSMValue(), null, "max", null, 0, 1, Interval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInterval_IncludeMin(), ecorePackage.getEBoolean(), "includeMin", null, 0, 1, Interval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInterval_IncludeMax(), ecorePackage.getEBoolean(), "includeMax", null, 0, 1, Interval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterval_Kind(), this.getCSMValue(), null, "kind", null, 0, 1, Interval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterval_Increment(), this.getCSMValue(), null, "increment", null, 0, 1, Interval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(userPropertyEClass, UserProperty.class, "UserProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUserProperty_Name(), ecorePackage.getEString(), "name", null, 0, 1, UserProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUserProperty_Value(), ecorePackage.getEString(), "value", null, 0, 1, UserProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(csmRepresentationEClass, CSMRepresentation.class, "CSMRepresentation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCSMRepresentation_Parent(), this.getCSMRepresentation(), this.getCSMRepresentation_Children(), "parent", null, 0, 1, CSMRepresentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCSMRepresentation_Children(), this.getCSMRepresentation(), this.getCSMRepresentation_Parent(), "children", null, 0, -1, CSMRepresentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCSMRepresentation_Valid(), ecorePackage.getEBoolean(), "valid", null, 0, 1, CSMRepresentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCSMRepresentation_RepresentationRoot(), this.getCSMRepresentationRoot(), this.getCSMRepresentationRoot_RepresentationTree(), "representationRoot", null, 0, 1, CSMRepresentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCSMRepresentation_OwnerCSMClass(), this.getCSMClass(), this.getCSMClass_ClassRepresentations(), "ownerCSMClass", null, 0, 1, CSMRepresentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(csmRepresentationEClass, null, "scrap");

		initEClass(dataSourceDefinitionsEClass, DataSourceDefinitions.class, "DataSourceDefinitions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataSourceDefinitions_OwnerClass(), this.getCSMClass(), this.getCSMClass_DatasourceDefinition(), "ownerClass", null, 0, 1, DataSourceDefinitions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataSourceDefinitions_Report(), ecorePackage.getEString(), "report", null, 0, 1, DataSourceDefinitions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(columnDefinitionEClass, ColumnDefinition.class, "ColumnDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getColumnDefinition_ColumnName(), ecorePackage.getEString(), "columnName", null, 0, 1, ColumnDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColumnDefinition_DatasetName(), ecorePackage.getEString(), "datasetName", null, 0, 1, ColumnDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(csmRepresentationRootDescriptorEClass, CSMRepresentationRootDescriptor.class, "CSMRepresentationRootDescriptor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCSMRepresentationRootDescriptor_RepresentationRoot(), this.getCSMRepresentationRoot(), this.getCSMRepresentationRoot_ValueDescriptors(), "representationRoot", null, 0, 1, CSMRepresentationRootDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCSMRepresentationRootDescriptor_CharacteristicID(), ecorePackage.getEString(), "characteristicID", null, 0, 1, CSMRepresentationRootDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCSMRepresentationRootDescriptor_CharacteriticValue(), ecorePackage.getEString(), "characteriticValue", null, 0, 1, CSMRepresentationRootDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// teneo.jpa
		createTeneoAnnotations();
	}

	/**
	 * Initializes the annotations for <b>teneo.jpa</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createTeneoAnnotations() {
		String source = "teneo.jpa";		
		addAnnotation
		  (getCSMClass_Description(), 
		   source, 
		   new String[] {
			 "appinfo", "@Type(type=\"text\")"
		   });
	}

} //DatacorePackageImpl

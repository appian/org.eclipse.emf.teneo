/**
 * <copyright>
 * </copyright>
 *
 * $Id: CapaPackageImpl.java,v 1.2 2006/11/07 10:22:28 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.sample.capa.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.eclipse.emf.teneo.samples.emf.sample.capa.CapaFactory;
import org.eclipse.emf.teneo.samples.emf.sample.capa.CapaPackage;
import org.eclipse.emf.teneo.samples.emf.sample.capa.CapacityEntry;
import org.eclipse.emf.teneo.samples.emf.sample.capa.Machine;
import org.eclipse.emf.teneo.samples.emf.sample.capa.MachineList;
import org.eclipse.emf.teneo.samples.emf.sample.capa.Production;
import org.eclipse.emf.teneo.samples.emf.sample.capa.Task;
import org.eclipse.emf.teneo.samples.emf.sample.capa.WorkDay;
import org.eclipse.emf.teneo.samples.emf.sample.capa.WorkWeek;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CapaPackageImpl extends EPackageImpl implements CapaPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass capacityEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass machineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass machineListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workDayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workWeekEClass = null;

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
	 * @see org.eclipse.emf.teneo.samples.emf.sample.capa.CapaPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CapaPackageImpl() {
		super(eNS_URI, CapaFactory.eINSTANCE);
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
	public static CapaPackage init() {
		if (isInited) return (CapaPackage)EPackage.Registry.INSTANCE.getEPackage(CapaPackage.eNS_URI);

		// Obtain or create and register package
		CapaPackageImpl theCapaPackage = (CapaPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof CapaPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new CapaPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theCapaPackage.createPackageContents();

		// Initialize created meta-data
		theCapaPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCapaPackage.freeze();

		return theCapaPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCapacityEntry() {
		return capacityEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCapacityEntry_CapacityEntryId() {
		return (EAttribute)capacityEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCapacityEntry_Name() {
		return (EAttribute)capacityEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMachine() {
		return machineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMachine_WorkWeek() {
		return (EReference)machineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMachine_Tasks() {
		return (EReference)machineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_MachineId() {
		return (EAttribute)machineEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_MachineSearchString() {
		return (EAttribute)machineEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_Multiplicity() {
		return (EAttribute)machineEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_TaskSearchString() {
		return (EAttribute)machineEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMachineList() {
		return machineListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMachineList_Machines() {
		return (EReference)machineListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProduction() {
		return productionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProduction_Article() {
		return (EAttribute)productionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProduction_DueTime() {
		return (EAttribute)productionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProduction_MissingAmount() {
		return (EAttribute)productionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProduction_ProductionId() {
		return (EAttribute)productionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProduction_StartTime() {
		return (EAttribute)productionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProduction_TotalAmount() {
		return (EAttribute)productionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTask() {
		return taskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_CapacityEntry() {
		return (EReference)taskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_Production() {
		return (EReference)taskEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTask_Name() {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTask_TaskId() {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTask_TimePerPice() {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTask_TimePerPreperation() {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWorkDay() {
		return workDayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkDay_DayOfWeek() {
		return (EAttribute)workDayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkDay_Duration() {
		return (EAttribute)workDayEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkDay_StartTime() {
		return (EAttribute)workDayEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWorkWeek() {
		return workWeekEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkWeek_Days() {
		return (EReference)workWeekEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkWeek_WorkWeekId() {
		return (EAttribute)workWeekEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapaFactory getCapaFactory() {
		return (CapaFactory)getEFactoryInstance();
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
		capacityEntryEClass = createEClass(CAPACITY_ENTRY);
		createEAttribute(capacityEntryEClass, CAPACITY_ENTRY__CAPACITY_ENTRY_ID);
		createEAttribute(capacityEntryEClass, CAPACITY_ENTRY__NAME);

		machineEClass = createEClass(MACHINE);
		createEReference(machineEClass, MACHINE__WORK_WEEK);
		createEReference(machineEClass, MACHINE__TASKS);
		createEAttribute(machineEClass, MACHINE__MACHINE_ID);
		createEAttribute(machineEClass, MACHINE__MACHINE_SEARCH_STRING);
		createEAttribute(machineEClass, MACHINE__MULTIPLICITY);
		createEAttribute(machineEClass, MACHINE__TASK_SEARCH_STRING);

		machineListEClass = createEClass(MACHINE_LIST);
		createEReference(machineListEClass, MACHINE_LIST__MACHINES);

		productionEClass = createEClass(PRODUCTION);
		createEAttribute(productionEClass, PRODUCTION__ARTICLE);
		createEAttribute(productionEClass, PRODUCTION__DUE_TIME);
		createEAttribute(productionEClass, PRODUCTION__MISSING_AMOUNT);
		createEAttribute(productionEClass, PRODUCTION__PRODUCTION_ID);
		createEAttribute(productionEClass, PRODUCTION__START_TIME);
		createEAttribute(productionEClass, PRODUCTION__TOTAL_AMOUNT);

		taskEClass = createEClass(TASK);
		createEReference(taskEClass, TASK__CAPACITY_ENTRY);
		createEReference(taskEClass, TASK__PRODUCTION);
		createEAttribute(taskEClass, TASK__NAME);
		createEAttribute(taskEClass, TASK__TASK_ID);
		createEAttribute(taskEClass, TASK__TIME_PER_PICE);
		createEAttribute(taskEClass, TASK__TIME_PER_PREPERATION);

		workDayEClass = createEClass(WORK_DAY);
		createEAttribute(workDayEClass, WORK_DAY__DAY_OF_WEEK);
		createEAttribute(workDayEClass, WORK_DAY__DURATION);
		createEAttribute(workDayEClass, WORK_DAY__START_TIME);

		workWeekEClass = createEClass(WORK_WEEK);
		createEReference(workWeekEClass, WORK_WEEK__DAYS);
		createEAttribute(workWeekEClass, WORK_WEEK__WORK_WEEK_ID);
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

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(capacityEntryEClass, CapacityEntry.class, "CapacityEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCapacityEntry_CapacityEntryId(), theXMLTypePackage.getString(), "capacityEntryId", null, 0, 1, CapacityEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCapacityEntry_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, CapacityEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(machineEClass, Machine.class, "Machine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMachine_WorkWeek(), this.getWorkWeek(), null, "workWeek", null, 1, 1, Machine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMachine_Tasks(), this.getTask(), null, "tasks", null, 0, -1, Machine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_MachineId(), theXMLTypePackage.getString(), "machineId", null, 0, 1, Machine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_MachineSearchString(), theXMLTypePackage.getString(), "machineSearchString", null, 0, 1, Machine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_Multiplicity(), theXMLTypePackage.getInt(), "multiplicity", null, 0, 1, Machine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_TaskSearchString(), theXMLTypePackage.getString(), "taskSearchString", null, 0, 1, Machine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(machineListEClass, MachineList.class, "MachineList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMachineList_Machines(), this.getMachine(), null, "machines", null, 0, -1, MachineList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(productionEClass, Production.class, "Production", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProduction_Article(), theXMLTypePackage.getString(), "article", null, 0, 1, Production.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProduction_DueTime(), theXMLTypePackage.getDate(), "dueTime", null, 0, 1, Production.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProduction_MissingAmount(), theXMLTypePackage.getFloat(), "missingAmount", null, 0, 1, Production.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProduction_ProductionId(), theXMLTypePackage.getString(), "productionId", null, 0, 1, Production.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProduction_StartTime(), theXMLTypePackage.getDate(), "startTime", null, 0, 1, Production.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProduction_TotalAmount(), theXMLTypePackage.getFloat(), "totalAmount", null, 0, 1, Production.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(taskEClass, Task.class, "Task", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTask_CapacityEntry(), this.getCapacityEntry(), null, "capacityEntry", null, 1, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTask_Production(), this.getProduction(), null, "production", null, 1, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTask_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTask_TaskId(), theXMLTypePackage.getString(), "taskId", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTask_TimePerPice(), theXMLTypePackage.getFloat(), "timePerPice", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTask_TimePerPreperation(), theXMLTypePackage.getFloat(), "timePerPreperation", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(workDayEClass, WorkDay.class, "WorkDay", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWorkDay_DayOfWeek(), theXMLTypePackage.getInt(), "dayOfWeek", null, 0, 1, WorkDay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkDay_Duration(), theXMLTypePackage.getInt(), "duration", null, 0, 1, WorkDay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkDay_StartTime(), theXMLTypePackage.getInt(), "startTime", null, 0, 1, WorkDay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(workWeekEClass, WorkWeek.class, "WorkWeek", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWorkWeek_Days(), this.getWorkDay(), null, "days", null, 0, 7, WorkWeek.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkWeek_WorkWeekId(), theXMLTypePackage.getString(), "workWeekId", null, 0, 1, WorkWeek.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
		// teneo.jpa
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
		  (capacityEntryEClass, 
		   source, 
		   new String[] {
			 "name", "CapacityEntry",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getCapacityEntry_CapacityEntryId(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "CapacityEntryId"
		   });		
		addAnnotation
		  (getCapacityEntry_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Name"
		   });		
		addAnnotation
		  (machineEClass, 
		   source, 
		   new String[] {
			 "name", "Machine",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getMachine_WorkWeek(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "WorkWeek"
		   });			
		addAnnotation
		  (getMachine_Tasks(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Tasks"
		   });		
		addAnnotation
		  (getMachine_MachineId(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "MachineId"
		   });		
		addAnnotation
		  (getMachine_MachineSearchString(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "MachineSearchString"
		   });		
		addAnnotation
		  (getMachine_Multiplicity(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Multiplicity"
		   });		
		addAnnotation
		  (getMachine_TaskSearchString(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "TaskSearchString"
		   });		
		addAnnotation
		  (machineListEClass, 
		   source, 
		   new String[] {
			 "name", "MachineList",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getMachineList_Machines(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Machines"
		   });		
		addAnnotation
		  (productionEClass, 
		   source, 
		   new String[] {
			 "name", "Production",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getProduction_Article(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Article"
		   });		
		addAnnotation
		  (getProduction_DueTime(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "DueTime"
		   });		
		addAnnotation
		  (getProduction_MissingAmount(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "MissingAmount"
		   });		
		addAnnotation
		  (getProduction_ProductionId(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "ProductionId"
		   });		
		addAnnotation
		  (getProduction_StartTime(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "StartTime"
		   });		
		addAnnotation
		  (getProduction_TotalAmount(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "TotalAmount"
		   });		
		addAnnotation
		  (taskEClass, 
		   source, 
		   new String[] {
			 "name", "Task",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getTask_CapacityEntry(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "CapacityEntry"
		   });		
		addAnnotation
		  (getTask_Production(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Production"
		   });		
		addAnnotation
		  (getTask_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Name"
		   });		
		addAnnotation
		  (getTask_TaskId(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "TaskId"
		   });		
		addAnnotation
		  (getTask_TimePerPice(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "TimePerPice"
		   });		
		addAnnotation
		  (getTask_TimePerPreperation(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "TimePerPreperation"
		   });		
		addAnnotation
		  (workDayEClass, 
		   source, 
		   new String[] {
			 "name", "WorkDay",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getWorkDay_DayOfWeek(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "DayOfWeek"
		   });		
		addAnnotation
		  (getWorkDay_Duration(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Duration"
		   });		
		addAnnotation
		  (getWorkDay_StartTime(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "StartTime"
		   });		
		addAnnotation
		  (workWeekEClass, 
		   source, 
		   new String[] {
			 "name", "WorkWeek",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getWorkWeek_Days(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Days"
		   });		
		addAnnotation
		  (getWorkWeek_WorkWeekId(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "WorkWeekId"
		   });
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
		  (getMachine_Tasks(), 
		   source, 
		   new String[] {
			 "appinfo", "@Transient"
		   });																												
	}

} //CapaPackageImpl

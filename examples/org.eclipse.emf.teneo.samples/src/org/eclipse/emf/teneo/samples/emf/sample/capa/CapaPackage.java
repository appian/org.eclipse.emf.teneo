/**
 * <copyright>
 * </copyright>
 *
 * $Id: CapaPackage.java,v 1.1 2006/08/14 05:08:59 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.sample.capa;

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
 * @see org.eclipse.emf.teneo.samples.emf.sample.capa.CapaFactory
 * @model kind="package"
 * @generated
 */
public interface CapaPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "capa";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/emf/teneo/samples/emf/sample/capa";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "capa";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CapaPackage eINSTANCE = org.eclipse.emf.teneo.samples.emf.sample.capa.impl.CapaPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.sample.capa.impl.CapacityEntryImpl <em>Capacity Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.sample.capa.impl.CapacityEntryImpl
	 * @see org.eclipse.emf.teneo.samples.emf.sample.capa.impl.CapaPackageImpl#getCapacityEntry()
	 * @generated
	 */
	int CAPACITY_ENTRY = 0;

	/**
	 * The feature id for the '<em><b>Capacity Entry Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPACITY_ENTRY__CAPACITY_ENTRY_ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPACITY_ENTRY__NAME = 1;

	/**
	 * The number of structural features of the '<em>Capacity Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPACITY_ENTRY_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.sample.capa.impl.MachineImpl <em>Machine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.sample.capa.impl.MachineImpl
	 * @see org.eclipse.emf.teneo.samples.emf.sample.capa.impl.CapaPackageImpl#getMachine()
	 * @generated
	 */
	int MACHINE = 1;

	/**
	 * The feature id for the '<em><b>Work Week</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__WORK_WEEK = 0;

	/**
	 * The feature id for the '<em><b>Tasks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__TASKS = 1;

	/**
	 * The feature id for the '<em><b>Machine Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__MACHINE_ID = 2;

	/**
	 * The feature id for the '<em><b>Machine Search String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__MACHINE_SEARCH_STRING = 3;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__MULTIPLICITY = 4;

	/**
	 * The feature id for the '<em><b>Task Search String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__TASK_SEARCH_STRING = 5;

	/**
	 * The number of structural features of the '<em>Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.sample.capa.impl.MachineListImpl <em>Machine List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.sample.capa.impl.MachineListImpl
	 * @see org.eclipse.emf.teneo.samples.emf.sample.capa.impl.CapaPackageImpl#getMachineList()
	 * @generated
	 */
	int MACHINE_LIST = 2;

	/**
	 * The feature id for the '<em><b>Machines</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_LIST__MACHINES = 0;

	/**
	 * The number of structural features of the '<em>Machine List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_LIST_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.sample.capa.impl.ProductionImpl <em>Production</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.sample.capa.impl.ProductionImpl
	 * @see org.eclipse.emf.teneo.samples.emf.sample.capa.impl.CapaPackageImpl#getProduction()
	 * @generated
	 */
	int PRODUCTION = 3;

	/**
	 * The feature id for the '<em><b>Article</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTION__ARTICLE = 0;

	/**
	 * The feature id for the '<em><b>Due Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTION__DUE_TIME = 1;

	/**
	 * The feature id for the '<em><b>Missing Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTION__MISSING_AMOUNT = 2;

	/**
	 * The feature id for the '<em><b>Production Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTION__PRODUCTION_ID = 3;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTION__START_TIME = 4;

	/**
	 * The feature id for the '<em><b>Total Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTION__TOTAL_AMOUNT = 5;

	/**
	 * The number of structural features of the '<em>Production</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTION_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.sample.capa.impl.TaskImpl <em>Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.sample.capa.impl.TaskImpl
	 * @see org.eclipse.emf.teneo.samples.emf.sample.capa.impl.CapaPackageImpl#getTask()
	 * @generated
	 */
	int TASK = 4;

	/**
	 * The feature id for the '<em><b>Capacity Entry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__CAPACITY_ENTRY = 0;

	/**
	 * The feature id for the '<em><b>Production</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__PRODUCTION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__NAME = 2;

	/**
	 * The feature id for the '<em><b>Task Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__TASK_ID = 3;

	/**
	 * The feature id for the '<em><b>Time Per Pice</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__TIME_PER_PICE = 4;

	/**
	 * The feature id for the '<em><b>Time Per Preperation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__TIME_PER_PREPERATION = 5;

	/**
	 * The number of structural features of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.sample.capa.impl.WorkDayImpl <em>Work Day</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.sample.capa.impl.WorkDayImpl
	 * @see org.eclipse.emf.teneo.samples.emf.sample.capa.impl.CapaPackageImpl#getWorkDay()
	 * @generated
	 */
	int WORK_DAY = 5;

	/**
	 * The feature id for the '<em><b>Day Of Week</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_DAY__DAY_OF_WEEK = 0;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_DAY__DURATION = 1;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_DAY__START_TIME = 2;

	/**
	 * The number of structural features of the '<em>Work Day</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_DAY_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.sample.capa.impl.WorkWeekImpl <em>Work Week</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.sample.capa.impl.WorkWeekImpl
	 * @see org.eclipse.emf.teneo.samples.emf.sample.capa.impl.CapaPackageImpl#getWorkWeek()
	 * @generated
	 */
	int WORK_WEEK = 6;

	/**
	 * The feature id for the '<em><b>Days</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_WEEK__DAYS = 0;

	/**
	 * The feature id for the '<em><b>Work Week Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_WEEK__WORK_WEEK_ID = 1;

	/**
	 * The number of structural features of the '<em>Work Week</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_WEEK_FEATURE_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.sample.capa.CapacityEntry <em>Capacity Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Capacity Entry</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.capa.CapacityEntry
	 * @generated
	 */
	EClass getCapacityEntry();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.sample.capa.CapacityEntry#getCapacityEntryId <em>Capacity Entry Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Capacity Entry Id</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.capa.CapacityEntry#getCapacityEntryId()
	 * @see #getCapacityEntry()
	 * @generated
	 */
	EAttribute getCapacityEntry_CapacityEntryId();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.sample.capa.CapacityEntry#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.capa.CapacityEntry#getName()
	 * @see #getCapacityEntry()
	 * @generated
	 */
	EAttribute getCapacityEntry_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.sample.capa.Machine <em>Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Machine</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.capa.Machine
	 * @generated
	 */
	EClass getMachine();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.samples.emf.sample.capa.Machine#getWorkWeek <em>Work Week</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Work Week</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.capa.Machine#getWorkWeek()
	 * @see #getMachine()
	 * @generated
	 */
	EReference getMachine_WorkWeek();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.samples.emf.sample.capa.Machine#getTasks <em>Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tasks</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.capa.Machine#getTasks()
	 * @see #getMachine()
	 * @generated
	 */
	EReference getMachine_Tasks();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.sample.capa.Machine#getMachineId <em>Machine Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Machine Id</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.capa.Machine#getMachineId()
	 * @see #getMachine()
	 * @generated
	 */
	EAttribute getMachine_MachineId();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.sample.capa.Machine#getMachineSearchString <em>Machine Search String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Machine Search String</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.capa.Machine#getMachineSearchString()
	 * @see #getMachine()
	 * @generated
	 */
	EAttribute getMachine_MachineSearchString();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.sample.capa.Machine#getMultiplicity <em>Multiplicity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplicity</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.capa.Machine#getMultiplicity()
	 * @see #getMachine()
	 * @generated
	 */
	EAttribute getMachine_Multiplicity();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.sample.capa.Machine#getTaskSearchString <em>Task Search String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Task Search String</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.capa.Machine#getTaskSearchString()
	 * @see #getMachine()
	 * @generated
	 */
	EAttribute getMachine_TaskSearchString();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.sample.capa.MachineList <em>Machine List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Machine List</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.capa.MachineList
	 * @generated
	 */
	EClass getMachineList();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.samples.emf.sample.capa.MachineList#getMachines <em>Machines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Machines</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.capa.MachineList#getMachines()
	 * @see #getMachineList()
	 * @generated
	 */
	EReference getMachineList_Machines();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.sample.capa.Production <em>Production</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Production</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.capa.Production
	 * @generated
	 */
	EClass getProduction();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.sample.capa.Production#getArticle <em>Article</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Article</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.capa.Production#getArticle()
	 * @see #getProduction()
	 * @generated
	 */
	EAttribute getProduction_Article();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.sample.capa.Production#getDueTime <em>Due Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Due Time</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.capa.Production#getDueTime()
	 * @see #getProduction()
	 * @generated
	 */
	EAttribute getProduction_DueTime();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.sample.capa.Production#getMissingAmount <em>Missing Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Missing Amount</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.capa.Production#getMissingAmount()
	 * @see #getProduction()
	 * @generated
	 */
	EAttribute getProduction_MissingAmount();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.sample.capa.Production#getProductionId <em>Production Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Production Id</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.capa.Production#getProductionId()
	 * @see #getProduction()
	 * @generated
	 */
	EAttribute getProduction_ProductionId();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.sample.capa.Production#getStartTime <em>Start Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Time</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.capa.Production#getStartTime()
	 * @see #getProduction()
	 * @generated
	 */
	EAttribute getProduction_StartTime();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.sample.capa.Production#getTotalAmount <em>Total Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Amount</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.capa.Production#getTotalAmount()
	 * @see #getProduction()
	 * @generated
	 */
	EAttribute getProduction_TotalAmount();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.sample.capa.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.capa.Task
	 * @generated
	 */
	EClass getTask();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.samples.emf.sample.capa.Task#getCapacityEntry <em>Capacity Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Capacity Entry</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.capa.Task#getCapacityEntry()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_CapacityEntry();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.samples.emf.sample.capa.Task#getProduction <em>Production</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Production</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.capa.Task#getProduction()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_Production();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.sample.capa.Task#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.capa.Task#getName()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.sample.capa.Task#getTaskId <em>Task Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Task Id</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.capa.Task#getTaskId()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_TaskId();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.sample.capa.Task#getTimePerPice <em>Time Per Pice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Per Pice</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.capa.Task#getTimePerPice()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_TimePerPice();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.sample.capa.Task#getTimePerPreperation <em>Time Per Preperation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Per Preperation</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.capa.Task#getTimePerPreperation()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_TimePerPreperation();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.sample.capa.WorkDay <em>Work Day</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Work Day</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.capa.WorkDay
	 * @generated
	 */
	EClass getWorkDay();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.sample.capa.WorkDay#getDayOfWeek <em>Day Of Week</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Day Of Week</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.capa.WorkDay#getDayOfWeek()
	 * @see #getWorkDay()
	 * @generated
	 */
	EAttribute getWorkDay_DayOfWeek();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.sample.capa.WorkDay#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.capa.WorkDay#getDuration()
	 * @see #getWorkDay()
	 * @generated
	 */
	EAttribute getWorkDay_Duration();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.sample.capa.WorkDay#getStartTime <em>Start Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Time</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.capa.WorkDay#getStartTime()
	 * @see #getWorkDay()
	 * @generated
	 */
	EAttribute getWorkDay_StartTime();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.sample.capa.WorkWeek <em>Work Week</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Work Week</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.capa.WorkWeek
	 * @generated
	 */
	EClass getWorkWeek();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.samples.emf.sample.capa.WorkWeek#getDays <em>Days</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Days</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.capa.WorkWeek#getDays()
	 * @see #getWorkWeek()
	 * @generated
	 */
	EReference getWorkWeek_Days();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.sample.capa.WorkWeek#getWorkWeekId <em>Work Week Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Work Week Id</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.capa.WorkWeek#getWorkWeekId()
	 * @see #getWorkWeek()
	 * @generated
	 */
	EAttribute getWorkWeek_WorkWeekId();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CapaFactory getCapaFactory();

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
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.emf.sample.capa.impl.CapacityEntryImpl <em>Capacity Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.emf.sample.capa.impl.CapacityEntryImpl
		 * @see org.eclipse.emf.teneo.samples.emf.sample.capa.impl.CapaPackageImpl#getCapacityEntry()
		 * @generated
		 */
		EClass CAPACITY_ENTRY = eINSTANCE.getCapacityEntry();

		/**
		 * The meta object literal for the '<em><b>Capacity Entry Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAPACITY_ENTRY__CAPACITY_ENTRY_ID = eINSTANCE.getCapacityEntry_CapacityEntryId();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAPACITY_ENTRY__NAME = eINSTANCE.getCapacityEntry_Name();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.emf.sample.capa.impl.MachineImpl <em>Machine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.emf.sample.capa.impl.MachineImpl
		 * @see org.eclipse.emf.teneo.samples.emf.sample.capa.impl.CapaPackageImpl#getMachine()
		 * @generated
		 */
		EClass MACHINE = eINSTANCE.getMachine();

		/**
		 * The meta object literal for the '<em><b>Work Week</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MACHINE__WORK_WEEK = eINSTANCE.getMachine_WorkWeek();

		/**
		 * The meta object literal for the '<em><b>Tasks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MACHINE__TASKS = eINSTANCE.getMachine_Tasks();

		/**
		 * The meta object literal for the '<em><b>Machine Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE__MACHINE_ID = eINSTANCE.getMachine_MachineId();

		/**
		 * The meta object literal for the '<em><b>Machine Search String</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE__MACHINE_SEARCH_STRING = eINSTANCE.getMachine_MachineSearchString();

		/**
		 * The meta object literal for the '<em><b>Multiplicity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE__MULTIPLICITY = eINSTANCE.getMachine_Multiplicity();

		/**
		 * The meta object literal for the '<em><b>Task Search String</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE__TASK_SEARCH_STRING = eINSTANCE.getMachine_TaskSearchString();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.emf.sample.capa.impl.MachineListImpl <em>Machine List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.emf.sample.capa.impl.MachineListImpl
		 * @see org.eclipse.emf.teneo.samples.emf.sample.capa.impl.CapaPackageImpl#getMachineList()
		 * @generated
		 */
		EClass MACHINE_LIST = eINSTANCE.getMachineList();

		/**
		 * The meta object literal for the '<em><b>Machines</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MACHINE_LIST__MACHINES = eINSTANCE.getMachineList_Machines();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.emf.sample.capa.impl.ProductionImpl <em>Production</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.emf.sample.capa.impl.ProductionImpl
		 * @see org.eclipse.emf.teneo.samples.emf.sample.capa.impl.CapaPackageImpl#getProduction()
		 * @generated
		 */
		EClass PRODUCTION = eINSTANCE.getProduction();

		/**
		 * The meta object literal for the '<em><b>Article</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCTION__ARTICLE = eINSTANCE.getProduction_Article();

		/**
		 * The meta object literal for the '<em><b>Due Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCTION__DUE_TIME = eINSTANCE.getProduction_DueTime();

		/**
		 * The meta object literal for the '<em><b>Missing Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCTION__MISSING_AMOUNT = eINSTANCE.getProduction_MissingAmount();

		/**
		 * The meta object literal for the '<em><b>Production Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCTION__PRODUCTION_ID = eINSTANCE.getProduction_ProductionId();

		/**
		 * The meta object literal for the '<em><b>Start Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCTION__START_TIME = eINSTANCE.getProduction_StartTime();

		/**
		 * The meta object literal for the '<em><b>Total Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCTION__TOTAL_AMOUNT = eINSTANCE.getProduction_TotalAmount();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.emf.sample.capa.impl.TaskImpl <em>Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.emf.sample.capa.impl.TaskImpl
		 * @see org.eclipse.emf.teneo.samples.emf.sample.capa.impl.CapaPackageImpl#getTask()
		 * @generated
		 */
		EClass TASK = eINSTANCE.getTask();

		/**
		 * The meta object literal for the '<em><b>Capacity Entry</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__CAPACITY_ENTRY = eINSTANCE.getTask_CapacityEntry();

		/**
		 * The meta object literal for the '<em><b>Production</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__PRODUCTION = eINSTANCE.getTask_Production();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__NAME = eINSTANCE.getTask_Name();

		/**
		 * The meta object literal for the '<em><b>Task Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__TASK_ID = eINSTANCE.getTask_TaskId();

		/**
		 * The meta object literal for the '<em><b>Time Per Pice</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__TIME_PER_PICE = eINSTANCE.getTask_TimePerPice();

		/**
		 * The meta object literal for the '<em><b>Time Per Preperation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__TIME_PER_PREPERATION = eINSTANCE.getTask_TimePerPreperation();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.emf.sample.capa.impl.WorkDayImpl <em>Work Day</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.emf.sample.capa.impl.WorkDayImpl
		 * @see org.eclipse.emf.teneo.samples.emf.sample.capa.impl.CapaPackageImpl#getWorkDay()
		 * @generated
		 */
		EClass WORK_DAY = eINSTANCE.getWorkDay();

		/**
		 * The meta object literal for the '<em><b>Day Of Week</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_DAY__DAY_OF_WEEK = eINSTANCE.getWorkDay_DayOfWeek();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_DAY__DURATION = eINSTANCE.getWorkDay_Duration();

		/**
		 * The meta object literal for the '<em><b>Start Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_DAY__START_TIME = eINSTANCE.getWorkDay_StartTime();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.emf.sample.capa.impl.WorkWeekImpl <em>Work Week</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.emf.sample.capa.impl.WorkWeekImpl
		 * @see org.eclipse.emf.teneo.samples.emf.sample.capa.impl.CapaPackageImpl#getWorkWeek()
		 * @generated
		 */
		EClass WORK_WEEK = eINSTANCE.getWorkWeek();

		/**
		 * The meta object literal for the '<em><b>Days</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_WEEK__DAYS = eINSTANCE.getWorkWeek_Days();

		/**
		 * The meta object literal for the '<em><b>Work Week Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_WEEK__WORK_WEEK_ID = eINSTANCE.getWorkWeek_WorkWeekId();

	}

} //CapaPackage

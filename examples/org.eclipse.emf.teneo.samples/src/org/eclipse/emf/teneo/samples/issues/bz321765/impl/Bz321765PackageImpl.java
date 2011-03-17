/**
 * <copyright>
 * </copyright>
 *
 * $Id: Bz321765PackageImpl.java,v 1.1 2011/03/17 09:47:34 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.bz321765.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.eclipse.emf.teneo.samples.issues.bz321765.Bz321765Factory;
import org.eclipse.emf.teneo.samples.issues.bz321765.Bz321765Package;
import org.eclipse.emf.teneo.samples.issues.bz321765.Employee;
import org.eclipse.emf.teneo.samples.issues.bz321765.EmployeePK;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Bz321765PackageImpl extends EPackageImpl implements Bz321765Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass employeeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass employeePKEClass = null;

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
	 * @see org.eclipse.emf.teneo.samples.issues.bz321765.Bz321765Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Bz321765PackageImpl() {
		super(eNS_URI, Bz321765Factory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Bz321765Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Bz321765Package init() {
		if (isInited) return (Bz321765Package)EPackage.Registry.INSTANCE.getEPackage(Bz321765Package.eNS_URI);

		// Obtain or create and register package
		Bz321765PackageImpl theBz321765Package = (Bz321765PackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Bz321765PackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Bz321765PackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theBz321765Package.createPackageContents();

		// Initialize created meta-data
		theBz321765Package.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theBz321765Package.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Bz321765Package.eNS_URI, theBz321765Package);
		return theBz321765Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEmployee() {
		return employeeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEmployee_EmployeePK() {
		return (EReference)employeeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEmployee_Title() {
		return (EAttribute)employeeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEmployee_Salary() {
		return (EAttribute)employeeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEmployeePK() {
		return employeePKEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEmployeePK_Id() {
		return (EAttribute)employeePKEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEmployeePK_FirstName() {
		return (EAttribute)employeePKEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEmployeePK_LastName() {
		return (EAttribute)employeePKEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bz321765Factory getBz321765Factory() {
		return (Bz321765Factory)getEFactoryInstance();
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
		employeeEClass = createEClass(EMPLOYEE);
		createEReference(employeeEClass, EMPLOYEE__EMPLOYEE_PK);
		createEAttribute(employeeEClass, EMPLOYEE__TITLE);
		createEAttribute(employeeEClass, EMPLOYEE__SALARY);

		employeePKEClass = createEClass(EMPLOYEE_PK);
		createEAttribute(employeePKEClass, EMPLOYEE_PK__ID);
		createEAttribute(employeePKEClass, EMPLOYEE_PK__FIRST_NAME);
		createEAttribute(employeePKEClass, EMPLOYEE_PK__LAST_NAME);
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
		initEClass(employeeEClass, Employee.class, "Employee", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEmployee_EmployeePK(), this.getEmployeePK(), null, "employeePK", null, 1, 1, Employee.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEmployee_Title(), theXMLTypePackage.getString(), "title", null, 1, 1, Employee.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEmployee_Salary(), theXMLTypePackage.getInteger(), "salary", null, 1, 1, Employee.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(employeePKEClass, EmployeePK.class, "EmployeePK", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEmployeePK_Id(), theXMLTypePackage.getInteger(), "id", null, 1, 1, EmployeePK.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEmployeePK_FirstName(), theXMLTypePackage.getString(), "firstName", null, 1, 1, EmployeePK.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEmployeePK_LastName(), theXMLTypePackage.getString(), "lastName", null, 1, 1, EmployeePK.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		  (employeeEClass, 
		   source, 
		   new String[] {
			 "name", "Employee",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (getEmployee_EmployeePK(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "EmployeePK"
		   });		
		addAnnotation
		  (getEmployee_Title(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Title"
		   });		
		addAnnotation
		  (getEmployee_Salary(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Salary"
		   });			
		addAnnotation
		  (employeePKEClass, 
		   source, 
		   new String[] {
			 "name", "EmployeePK",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getEmployeePK_Id(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "id"
		   });		
		addAnnotation
		  (getEmployeePK_FirstName(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "firstName"
		   });		
		addAnnotation
		  (getEmployeePK_LastName(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "lastName"
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
		  (getEmployee_EmployeePK(), 
		   source, 
		   new String[] {
			 "appinfo", "\n\t\t\t\t\t\t@EmbeddedId\n\t\t\t\t\t"
		   });					
		addAnnotation
		  (employeePKEClass, 
		   source, 
		   new String[] {
			 "appinfo", "\n\t\t\t\t@Embeddable\n\t\t\t"
		   });				
	}

} //Bz321765PackageImpl

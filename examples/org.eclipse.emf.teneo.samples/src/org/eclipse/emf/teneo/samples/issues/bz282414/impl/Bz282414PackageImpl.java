/**
 * <copyright>
 * </copyright>
 *
 * $Id: Bz282414PackageImpl.java,v 1.1 2009/07/05 00:09:05 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.bz282414.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.eclipse.emf.teneo.samples.issues.bz282414.Bar;
import org.eclipse.emf.teneo.samples.issues.bz282414.BarKey;
import org.eclipse.emf.teneo.samples.issues.bz282414.Bz282414Factory;
import org.eclipse.emf.teneo.samples.issues.bz282414.Bz282414Package;
import org.eclipse.emf.teneo.samples.issues.bz282414.Foo;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Bz282414PackageImpl extends EPackageImpl implements Bz282414Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass barEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass barKeyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fooEClass = null;

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
	 * @see org.eclipse.emf.teneo.samples.issues.bz282414.Bz282414Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Bz282414PackageImpl() {
		super(eNS_URI, Bz282414Factory.eINSTANCE);
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
	public static Bz282414Package init() {
		if (isInited) return (Bz282414Package)EPackage.Registry.INSTANCE.getEPackage(Bz282414Package.eNS_URI);

		// Obtain or create and register package
		Bz282414PackageImpl theBz282414Package = (Bz282414PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof Bz282414PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new Bz282414PackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theBz282414Package.createPackageContents();

		// Initialize created meta-data
		theBz282414Package.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theBz282414Package.freeze();

		return theBz282414Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBar() {
		return barEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBar_BarKey() {
		return (EReference)barEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBarKey() {
		return barKeyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBarKey_ClassId() {
		return (EAttribute)barKeyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBarKey_GroupId() {
		return (EAttribute)barKeyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFoo() {
		return fooEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFoo_BagOfBars() {
		return (EReference)fooEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFoo_ClientId() {
		return (EAttribute)fooEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFoo_DnmSK() {
		return (EAttribute)fooEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bz282414Factory getBz282414Factory() {
		return (Bz282414Factory)getEFactoryInstance();
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
		barEClass = createEClass(BAR);
		createEReference(barEClass, BAR__BAR_KEY);

		barKeyEClass = createEClass(BAR_KEY);
		createEAttribute(barKeyEClass, BAR_KEY__CLASS_ID);
		createEAttribute(barKeyEClass, BAR_KEY__GROUP_ID);

		fooEClass = createEClass(FOO);
		createEReference(fooEClass, FOO__BAG_OF_BARS);
		createEAttribute(fooEClass, FOO__CLIENT_ID);
		createEAttribute(fooEClass, FOO__DNM_SK);
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
		initEClass(barEClass, Bar.class, "Bar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBar_BarKey(), this.getBarKey(), null, "barKey", null, 1, 1, Bar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(barKeyEClass, BarKey.class, "BarKey", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBarKey_ClassId(), theXMLTypePackage.getString(), "classId", null, 0, 1, BarKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBarKey_GroupId(), theXMLTypePackage.getString(), "groupId", null, 0, 1, BarKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fooEClass, Foo.class, "Foo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFoo_BagOfBars(), this.getBar(), null, "bagOfBars", null, 0, -1, Foo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFoo_ClientId(), theXMLTypePackage.getString(), "clientId", "", 0, 1, Foo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFoo_DnmSK(), theXMLTypePackage.getLong(), "dnmSK", "0", 0, 1, Foo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// teneo.jpa
		createTeneoAnnotations();
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
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
		  (barEClass, 
		   source, 
		   new String[] {
			 "appinfo", "@Entity\n\t\t\t\t@Table(name=\"BAR_TABLE\")"
		   });			
		addAnnotation
		  (getBar_BarKey(), 
		   source, 
		   new String[] {
			 "appinfo", "\n\t\t\t\t\t\t@Embedded @AttributeOverrides({@AttributeOverride(name=\"groupId\",\n\t\t\t\t\t\tcolumn=@Column(name=\"GRP_ID\")),@AttributeOverride(name=\"classId\",\n\t\t\t\t\t\tcolumn=@Column(name=\"CLAS_ID\"))})\n"
		   });			
		addAnnotation
		  (barKeyEClass, 
		   source, 
		   new String[] {
			 "appinfo", "@Embeddable"
		   });			
		addAnnotation
		  (getBarKey_ClassId(), 
		   source, 
		   new String[] {
			 "appinfo", "@Column(name=\"CLAS_ID\",\n\t\t\t\t\tnullable=false)"
		   });			
		addAnnotation
		  (getBarKey_GroupId(), 
		   source, 
		   new String[] {
			 "appinfo", "@Column(name=\"GRP_ID\",\n\t\t\t\t\tnullable=false)"
		   });			
		addAnnotation
		  (fooEClass, 
		   source, 
		   new String[] {
			 "appinfo", "@Entity @Table( name=\"FOO_TABLE\"\n\t\t\t\t)"
		   });			
		addAnnotation
		  (getFoo_BagOfBars(), 
		   source, 
		   new String[] {
			 "appinfo", "\n\t\t\t\t\t\t@OneToMany(fetch=FetchType.LAZY, indexed=false)\n\t\t\t\t\t\t@JoinColumn(name=\"GRP_ID\", referencedColumnName=\"CLI_ID\")\n"
		   });			
		addAnnotation
		  (getFoo_ClientId(), 
		   source, 
		   new String[] {
			 "appinfo", "@Column(name=\"CLI_ID\",\n\t\t\t\t\tlength=\"8\")"
		   });			
		addAnnotation
		  (getFoo_DnmSK(), 
		   source, 
		   new String[] {
			 "appinfo", "\n\t\t\t\t\t@Id @Column(name=\"DNM_SK\", nullable=\"false\",insertable = true,\n\t\t\t\t\tupdatable = false)\n\t\t\t\t\t@GeneratedValue\n\t\t\t\t"
		   });	
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
		  (barEClass, 
		   source, 
		   new String[] {
			 "name", "Bar",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (getBar_BarKey(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "barKey"
		   });			
		addAnnotation
		  (barKeyEClass, 
		   source, 
		   new String[] {
			 "name", "BarKey",
			 "kind", "empty"
		   });			
		addAnnotation
		  (getBarKey_ClassId(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "classId"
		   });			
		addAnnotation
		  (getBarKey_GroupId(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "groupId"
		   });			
		addAnnotation
		  (fooEClass, 
		   source, 
		   new String[] {
			 "name", "Foo",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (getFoo_BagOfBars(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "BagOfBars"
		   });			
		addAnnotation
		  (getFoo_ClientId(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "clientId"
		   });			
		addAnnotation
		  (getFoo_DnmSK(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "dnmSK"
		   });
	}

} //Bz282414PackageImpl

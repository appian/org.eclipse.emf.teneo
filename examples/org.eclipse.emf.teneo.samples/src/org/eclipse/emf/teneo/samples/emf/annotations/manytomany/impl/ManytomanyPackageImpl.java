/**
 * <copyright>
 * </copyright>
 *
 * $Id: ManytomanyPackageImpl.java,v 1.3 2006/11/23 13:51:32 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.annotations.manytomany.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.teneo.samples.emf.annotations.manytomany.Cntr;
import org.eclipse.emf.teneo.samples.emf.annotations.manytomany.Lft;
import org.eclipse.emf.teneo.samples.emf.annotations.manytomany.ManytomanyFactory;
import org.eclipse.emf.teneo.samples.emf.annotations.manytomany.ManytomanyPackage;
import org.eclipse.emf.teneo.samples.emf.annotations.manytomany.Rght;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ManytomanyPackageImpl extends EPackageImpl implements ManytomanyPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cntrEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lftEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rghtEClass = null;

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
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.manytomany.ManytomanyPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ManytomanyPackageImpl() {
		super(eNS_URI, ManytomanyFactory.eINSTANCE);
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
	public static ManytomanyPackage init() {
		if (isInited) return (ManytomanyPackage)EPackage.Registry.INSTANCE.getEPackage(ManytomanyPackage.eNS_URI);

		// Obtain or create and register package
		ManytomanyPackageImpl theManytomanyPackage = (ManytomanyPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof ManytomanyPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new ManytomanyPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theManytomanyPackage.createPackageContents();

		// Initialize created meta-data
		theManytomanyPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theManytomanyPackage.freeze();

		return theManytomanyPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCntr() {
		return cntrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCntr_Rght() {
		return (EReference)cntrEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCntr_Lft() {
		return (EReference)cntrEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLft() {
		return lftEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLft_Cntr() {
		return (EReference)lftEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRght() {
		return rghtEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRght_Cntr() {
		return (EReference)rghtEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ManytomanyFactory getManytomanyFactory() {
		return (ManytomanyFactory)getEFactoryInstance();
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
		cntrEClass = createEClass(CNTR);
		createEReference(cntrEClass, CNTR__RGHT);
		createEReference(cntrEClass, CNTR__LFT);

		lftEClass = createEClass(LFT);
		createEReference(lftEClass, LFT__CNTR);

		rghtEClass = createEClass(RGHT);
		createEReference(rghtEClass, RGHT__CNTR);
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

		// Initialize classes and features; add operations and parameters
		initEClass(cntrEClass, Cntr.class, "Cntr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCntr_Rght(), this.getRght(), this.getRght_Cntr(), "rght", null, 1, -1, Cntr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCntr_Lft(), this.getLft(), this.getLft_Cntr(), "lft", null, 1, -1, Cntr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lftEClass, Lft.class, "Lft", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLft_Cntr(), this.getCntr(), this.getCntr_Lft(), "cntr", null, 1, -1, Lft.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rghtEClass, Rght.class, "Rght", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRght_Cntr(), this.getCntr(), this.getCntr_Rght(), "cntr", null, 1, -1, Rght.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		  (cntrEClass, 
		   source, 
		   new String[] {
			 "name", "Cntr",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (getCntr_Rght(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "rght"
		   });			
		addAnnotation
		  (getCntr_Lft(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "lft"
		   });		
		addAnnotation
		  (lftEClass, 
		   source, 
		   new String[] {
			 "name", "Lft",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (getLft_Cntr(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "cntr"
		   });		
		addAnnotation
		  (rghtEClass, 
		   source, 
		   new String[] {
			 "name", "Rght",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (getRght_Cntr(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "cntr"
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
		  (getCntr_Rght(), 
		   source, 
		   new String[] {
			 "appinfo", "\n\t\t\t\t\t@ManyToMany(fetch=EAGER cascade={MERGE PERSIST} targetEntity=\"Rght\" indexed=\"false\")\n\t\t\t\t\t@JoinTable(name=\"RightCenter\")\n\t\t\t\t\t"
		   });			
		addAnnotation
		  (getCntr_Lft(), 
		   source, 
		   new String[] {
			 "appinfo", "\n\t\t\t\t\t\t@ManyToMany(fetch=EAGER cascade={MERGE PERSIST} targetEntity=\"Lft\")\n\t\t\t\t\t"
		   });				
		addAnnotation
		  (getLft_Cntr(), 
		   source, 
		   new String[] {
			 "appinfo", "\n\t\t\t\t\t@ManyToMany(fetch=LAZY cascade={MERGE PERSIST} targetEntity=\"Cntr\" mappedBy=\"lft\")\n\t\t\t\t\t"
		   });				
		addAnnotation
		  (getRght_Cntr(), 
		   source, 
		   new String[] {
			 "appinfo", "\n\t\t\t\t\t\t@ManyToMany(fetch=LAZY cascade={MERGE PERSIST} targetEntity=\"Cntr\" mappedBy=\"rght\" indexed=\"false\")\n\t\t\t\t\t\t@JoinTable(name=\"RightCenter\")\n\t\t\t\t\t"
		   });	
	}

} //ManytomanyPackageImpl

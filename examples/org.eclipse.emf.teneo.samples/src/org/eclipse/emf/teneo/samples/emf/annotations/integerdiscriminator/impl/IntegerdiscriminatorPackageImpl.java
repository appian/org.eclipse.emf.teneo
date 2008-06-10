/**
 * <copyright>
 * </copyright>
 *
 * $Id: IntegerdiscriminatorPackageImpl.java,v 1.1 2008/06/10 06:45:05 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.annotations.integerdiscriminator.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.eclipse.emf.teneo.samples.emf.annotations.integerdiscriminator.AbstractSub;
import org.eclipse.emf.teneo.samples.emf.annotations.integerdiscriminator.IntegerdiscriminatorFactory;
import org.eclipse.emf.teneo.samples.emf.annotations.integerdiscriminator.IntegerdiscriminatorPackage;
import org.eclipse.emf.teneo.samples.emf.annotations.integerdiscriminator.OtherSub;
import org.eclipse.emf.teneo.samples.emf.annotations.integerdiscriminator.Sub;
import org.eclipse.emf.teneo.samples.emf.annotations.integerdiscriminator.Super;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class IntegerdiscriminatorPackageImpl extends EPackageImpl implements IntegerdiscriminatorPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass superEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass otherSubEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractSubEClass = null;

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
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.integerdiscriminator.IntegerdiscriminatorPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private IntegerdiscriminatorPackageImpl() {
		super(eNS_URI, IntegerdiscriminatorFactory.eINSTANCE);
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
	public static IntegerdiscriminatorPackage init() {
		if (isInited) return (IntegerdiscriminatorPackage)EPackage.Registry.INSTANCE.getEPackage(IntegerdiscriminatorPackage.eNS_URI);

		// Obtain or create and register package
		IntegerdiscriminatorPackageImpl theIntegerdiscriminatorPackage = (IntegerdiscriminatorPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof IntegerdiscriminatorPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new IntegerdiscriminatorPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theIntegerdiscriminatorPackage.createPackageContents();

		// Initialize created meta-data
		theIntegerdiscriminatorPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theIntegerdiscriminatorPackage.freeze();

		return theIntegerdiscriminatorPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSuper() {
		return superEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSuper_Name() {
		return (EAttribute)superEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSub() {
		return subEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOtherSub() {
		return otherSubEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractSub() {
		return abstractSubEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerdiscriminatorFactory getIntegerdiscriminatorFactory() {
		return (IntegerdiscriminatorFactory)getEFactoryInstance();
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
		superEClass = createEClass(SUPER);
		createEAttribute(superEClass, SUPER__NAME);

		subEClass = createEClass(SUB);

		otherSubEClass = createEClass(OTHER_SUB);

		abstractSubEClass = createEClass(ABSTRACT_SUB);
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
		subEClass.getESuperTypes().add(this.getSuper());
		otherSubEClass.getESuperTypes().add(this.getSuper());
		abstractSubEClass.getESuperTypes().add(this.getSuper());

		// Initialize classes and features; add operations and parameters
		initEClass(superEClass, Super.class, "Super", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSuper_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, Super.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(subEClass, Sub.class, "Sub", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(otherSubEClass, OtherSub.class, "OtherSub", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(abstractSubEClass, AbstractSub.class, "AbstractSub", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

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
		  (superEClass, 
		   source, 
		   new String[] {
			 "value", "@Entity\n@Table(name = \"SUPER_TABLE\")\n@Inheritance(strategy = InheritanceType.SINGLE_TABLE)\n@DiscriminatorColumn(name = \"DISC\", discriminatorType = DiscriminatorType.INTEGER)"
		   });			
		addAnnotation
		  (otherSubEClass, 
		   source, 
		   new String[] {
			 "value", "@DiscriminatorValue(\"500\")"
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
		  (getSuper_Name(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "name"
		   });	
	}

} //IntegerdiscriminatorPackageImpl

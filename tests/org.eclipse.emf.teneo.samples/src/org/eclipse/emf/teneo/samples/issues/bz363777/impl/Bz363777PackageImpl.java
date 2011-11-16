/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.emf.teneo.samples.issues.bz363777.impl;

import java.util.Map;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.teneo.samples.issues.bz363777.Bz363777Factory;
import org.eclipse.emf.teneo.samples.issues.bz363777.Bz363777Package;
import org.eclipse.emf.teneo.samples.issues.bz363777.ChannelMap;
import org.eclipse.emf.teneo.samples.issues.bz363777.ChannelMapService;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Bz363777PackageImpl extends EPackageImpl implements Bz363777Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass chanelMapToChanelMapServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass channelMapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass channelMapServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass neEClass = null;

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
	 * @see org.eclipse.emf.teneo.samples.issues.bz363777.Bz363777Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Bz363777PackageImpl() {
		super(eNS_URI, Bz363777Factory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Bz363777Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Bz363777Package init() {
		if (isInited) return (Bz363777Package)EPackage.Registry.INSTANCE.getEPackage(Bz363777Package.eNS_URI);

		// Obtain or create and register package
		Bz363777PackageImpl theBz363777Package = (Bz363777PackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Bz363777PackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Bz363777PackageImpl());

		isInited = true;

		// Create package meta-data objects
		theBz363777Package.createPackageContents();

		// Initialize created meta-data
		theBz363777Package.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theBz363777Package.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Bz363777Package.eNS_URI, theBz363777Package);
		return theBz363777Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChanelMapToChanelMapService() {
		return chanelMapToChanelMapServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChanelMapToChanelMapService_Value() {
		return (EReference)chanelMapToChanelMapServiceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChanelMapToChanelMapService_Key() {
		return (EReference)chanelMapToChanelMapServiceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChannelMap() {
		return channelMapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChannelMap_Key() {
		return (EAttribute)channelMapEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChannelMapService() {
		return channelMapServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChannelMapService_Name() {
		return (EAttribute)channelMapServiceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNE() {
		return neEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNE_MapChannels() {
		return (EReference)neEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bz363777Factory getBz363777Factory() {
		return (Bz363777Factory)getEFactoryInstance();
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
		chanelMapToChanelMapServiceEClass = createEClass(CHANEL_MAP_TO_CHANEL_MAP_SERVICE);
		createEReference(chanelMapToChanelMapServiceEClass, CHANEL_MAP_TO_CHANEL_MAP_SERVICE__VALUE);
		createEReference(chanelMapToChanelMapServiceEClass, CHANEL_MAP_TO_CHANEL_MAP_SERVICE__KEY);

		channelMapEClass = createEClass(CHANNEL_MAP);
		createEAttribute(channelMapEClass, CHANNEL_MAP__KEY);

		channelMapServiceEClass = createEClass(CHANNEL_MAP_SERVICE);
		createEAttribute(channelMapServiceEClass, CHANNEL_MAP_SERVICE__NAME);

		neEClass = createEClass(NE);
		createEReference(neEClass, NE__MAP_CHANNELS);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(chanelMapToChanelMapServiceEClass, Map.Entry.class, "ChanelMapToChanelMapService", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEReference(getChanelMapToChanelMapService_Value(), this.getChannelMapService(), null, "value", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChanelMapToChanelMapService_Key(), this.getChannelMap(), null, "key", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(channelMapEClass, ChannelMap.class, "ChannelMap", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getChannelMap_Key(), ecorePackage.getEIntegerObject(), "key", null, 0, 1, ChannelMap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(channelMapServiceEClass, ChannelMapService.class, "ChannelMapService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getChannelMapService_Name(), ecorePackage.getEString(), "name", null, 0, 1, ChannelMapService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(neEClass, org.eclipse.emf.teneo.samples.issues.bz363777.NE.class, "NE", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNE_MapChannels(), this.getChanelMapToChanelMapService(), null, "mapChannels", null, 0, -1, org.eclipse.emf.teneo.samples.issues.bz363777.NE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		  (chanelMapToChanelMapServiceEClass, 
		   source, 
		   new String[] {
			 "kind", "empty"
		   });		
		addAnnotation
		  (channelMapEClass, 
		   source, 
		   new String[] {
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (getChannelMap_Key(), 
		   source, 
		   new String[] {
			 "kind", "element"
		   });		
		addAnnotation
		  (channelMapServiceEClass, 
		   source, 
		   new String[] {
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getChannelMapService_Name(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "name",
			 "namespace", ""
		   });		
		addAnnotation
		  (neEClass, 
		   source, 
		   new String[] {
			 "kind", "elementOnly"
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
		  (channelMapEClass, 
		   source, 
		   new String[] {
			 "appinfo", "@Entity"
		   });				
	}

} //Bz363777PackageImpl

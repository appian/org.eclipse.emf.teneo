/**
 * <copyright>
 * </copyright>
 *
 * $Id: EmbeddedPackageImpl.java,v 1.8 2009/12/04 15:06:57 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.annotations.embedded.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.eclipse.emf.teneo.samples.emf.annotations.embedded.AOneToMany;
import org.eclipse.emf.teneo.samples.emf.annotations.embedded.AlsoEmbeddable;
import org.eclipse.emf.teneo.samples.emf.annotations.embedded.AnotherEmbeddable;
import org.eclipse.emf.teneo.samples.emf.annotations.embedded.Embeddable;
import org.eclipse.emf.teneo.samples.emf.annotations.embedded.EmbeddedFactory;
import org.eclipse.emf.teneo.samples.emf.annotations.embedded.EmbeddedPackage;
import org.eclipse.emf.teneo.samples.emf.annotations.embedded.Embedder;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EmbeddedPackageImpl extends EPackageImpl implements EmbeddedPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass alsoEmbeddableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass anotherEmbeddableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aOneToManyEClass = null;

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
	private EClass embedderEClass = null;

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
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.embedded.EmbeddedPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EmbeddedPackageImpl() {
		super(eNS_URI, EmbeddedFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link EmbeddedPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EmbeddedPackage init() {
		if (isInited) return (EmbeddedPackage)EPackage.Registry.INSTANCE.getEPackage(EmbeddedPackage.eNS_URI);

		// Obtain or create and register package
		EmbeddedPackageImpl theEmbeddedPackage = (EmbeddedPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EmbeddedPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EmbeddedPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theEmbeddedPackage.createPackageContents();

		// Initialize created meta-data
		theEmbeddedPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEmbeddedPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EmbeddedPackage.eNS_URI, theEmbeddedPackage);
		return theEmbeddedPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAlsoEmbeddable() {
		return alsoEmbeddableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAlsoEmbeddable_Name() {
		return (EAttribute)alsoEmbeddableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnotherEmbeddable() {
		return anotherEmbeddableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnotherEmbeddable_AnotherName() {
		return (EAttribute)anotherEmbeddableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnotherEmbeddable_AOneToMany() {
		return (EReference)anotherEmbeddableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAOneToMany() {
		return aOneToManyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAOneToMany_Name() {
		return (EAttribute)aOneToManyEClass.getEStructuralFeatures().get(0);
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
	public EAttribute getEmbeddable_MyString() {
		return (EAttribute)embeddableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEmbeddable_MyInteger() {
		return (EAttribute)embeddableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEmbedder() {
		return embedderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEmbedder_FirstEmbedded() {
		return (EReference)embedderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEmbedder_SecondEmbedded() {
		return (EReference)embedderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEmbedder_ThirdEmbedded() {
		return (EReference)embedderEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEmbedder_FourthEmbedded() {
		return (EReference)embedderEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEmbedder_FifthEmbedded() {
		return (EReference)embedderEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEmbedder_AlsoEmbeddable() {
		return (EReference)embedderEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEmbedder_AnotherEmbedded() {
		return (EReference)embedderEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmbeddedFactory getEmbeddedFactory() {
		return (EmbeddedFactory)getEFactoryInstance();
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
		alsoEmbeddableEClass = createEClass(ALSO_EMBEDDABLE);
		createEAttribute(alsoEmbeddableEClass, ALSO_EMBEDDABLE__NAME);

		anotherEmbeddableEClass = createEClass(ANOTHER_EMBEDDABLE);
		createEAttribute(anotherEmbeddableEClass, ANOTHER_EMBEDDABLE__ANOTHER_NAME);
		createEReference(anotherEmbeddableEClass, ANOTHER_EMBEDDABLE__AONE_TO_MANY);

		aOneToManyEClass = createEClass(AONE_TO_MANY);
		createEAttribute(aOneToManyEClass, AONE_TO_MANY__NAME);

		embeddableEClass = createEClass(EMBEDDABLE);
		createEAttribute(embeddableEClass, EMBEDDABLE__MY_STRING);
		createEAttribute(embeddableEClass, EMBEDDABLE__MY_INTEGER);

		embedderEClass = createEClass(EMBEDDER);
		createEReference(embedderEClass, EMBEDDER__FIRST_EMBEDDED);
		createEReference(embedderEClass, EMBEDDER__SECOND_EMBEDDED);
		createEReference(embedderEClass, EMBEDDER__THIRD_EMBEDDED);
		createEReference(embedderEClass, EMBEDDER__FOURTH_EMBEDDED);
		createEReference(embedderEClass, EMBEDDER__FIFTH_EMBEDDED);
		createEReference(embedderEClass, EMBEDDER__ALSO_EMBEDDABLE);
		createEReference(embedderEClass, EMBEDDER__ANOTHER_EMBEDDED);
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
		anotherEmbeddableEClass.getESuperTypes().add(this.getAlsoEmbeddable());

		// Initialize classes and features; add operations and parameters
		initEClass(alsoEmbeddableEClass, AlsoEmbeddable.class, "AlsoEmbeddable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAlsoEmbeddable_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, AlsoEmbeddable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(anotherEmbeddableEClass, AnotherEmbeddable.class, "AnotherEmbeddable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAnotherEmbeddable_AnotherName(), theXMLTypePackage.getString(), "anotherName", null, 1, 1, AnotherEmbeddable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnotherEmbeddable_AOneToMany(), this.getAOneToMany(), null, "aOneToMany", null, 1, -1, AnotherEmbeddable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(aOneToManyEClass, AOneToMany.class, "AOneToMany", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAOneToMany_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, AOneToMany.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(embeddableEClass, Embeddable.class, "Embeddable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEmbeddable_MyString(), theXMLTypePackage.getString(), "myString", null, 1, 1, Embeddable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEmbeddable_MyInteger(), theXMLTypePackage.getInt(), "myInteger", null, 1, 1, Embeddable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(embedderEClass, Embedder.class, "Embedder", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEmbedder_FirstEmbedded(), this.getEmbeddable(), null, "firstEmbedded", null, 1, 1, Embedder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEmbedder_SecondEmbedded(), this.getEmbeddable(), null, "secondEmbedded", null, 1, 1, Embedder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEmbedder_ThirdEmbedded(), this.getEmbeddable(), null, "thirdEmbedded", null, 1, 1, Embedder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEmbedder_FourthEmbedded(), this.getEmbeddable(), null, "fourthEmbedded", null, 1, -1, Embedder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEmbedder_FifthEmbedded(), this.getEmbeddable(), null, "fifthEmbedded", null, 1, 1, Embedder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEmbedder_AlsoEmbeddable(), this.getAlsoEmbeddable(), null, "alsoEmbeddable", null, 1, 1, Embedder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEmbedder_AnotherEmbedded(), this.getAnotherEmbeddable(), null, "anotherEmbedded", null, 1, 1, Embedder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// teneo.jpa
		createTeneoAnnotations();
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
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
		  (alsoEmbeddableEClass, 
		   source, 
		   new String[] {
			 "name", "AlsoEmbeddable",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getAlsoEmbeddable_Name(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "name"
		   });			
		addAnnotation
		  (anotherEmbeddableEClass, 
		   source, 
		   new String[] {
			 "name", "AnotherEmbeddable",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getAnotherEmbeddable_AnotherName(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "anotherName"
		   });		
		addAnnotation
		  (getAnotherEmbeddable_AOneToMany(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "aOneToMany"
		   });			
		addAnnotation
		  (aOneToManyEClass, 
		   source, 
		   new String[] {
			 "name", "AOneToMany",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getAOneToMany_Name(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "name"
		   });			
		addAnnotation
		  (embeddableEClass, 
		   source, 
		   new String[] {
			 "name", "Embeddable",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getEmbeddable_MyString(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "myString"
		   });		
		addAnnotation
		  (getEmbeddable_MyInteger(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "myInteger"
		   });		
		addAnnotation
		  (embedderEClass, 
		   source, 
		   new String[] {
			 "name", "Embedder",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (getEmbedder_FirstEmbedded(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "firstEmbedded"
		   });			
		addAnnotation
		  (getEmbedder_SecondEmbedded(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "secondEmbedded"
		   });			
		addAnnotation
		  (getEmbedder_ThirdEmbedded(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "thirdEmbedded"
		   });			
		addAnnotation
		  (getEmbedder_FourthEmbedded(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "fourthEmbedded"
		   });			
		addAnnotation
		  (getEmbedder_FifthEmbedded(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "fifthEmbedded"
		   });		
		addAnnotation
		  (getEmbedder_AlsoEmbeddable(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "alsoEmbeddable"
		   });			
		addAnnotation
		  (getEmbedder_AnotherEmbedded(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "anotherEmbedded"
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
		  (alsoEmbeddableEClass, 
		   source, 
		   new String[] {
			 "appinfo", "@Embeddable"
		   });				
		addAnnotation
		  (anotherEmbeddableEClass, 
		   source, 
		   new String[] {
			 "appinfo", "@Embeddable"
		   });					
		addAnnotation
		  (aOneToManyEClass, 
		   source, 
		   new String[] {
			 "appinfo", "@Embeddable"
		   });				
		addAnnotation
		  (embeddableEClass, 
		   source, 
		   new String[] {
			 "appinfo", "@Embeddable"
		   });						
		addAnnotation
		  (getEmbedder_FirstEmbedded(), 
		   source, 
		   new String[] {
			 "appinfo", "\n\t\t\t\t\t@Embedded\n\t\t\t\t\t@AttributeOverride(name=\"myString\" column=@Column(name=\"columnString3\"))\n\t\t\t\t\t"
		   });			
		addAnnotation
		  (getEmbedder_SecondEmbedded(), 
		   source, 
		   new String[] {
			 "appinfo", "\n\t\t\t\t\t@Embedded\n\t\t\t\t\t@AttributeOverride(name=\"myString\" column=@Column(name=\"columnString1\"))\n\t\t\t\t\t@AttributeOverride(name=\"myInteger\" column=@Column(name=\"columnInteger1\"))\n\t\t\t\t\t"
		   });			
		addAnnotation
		  (getEmbedder_ThirdEmbedded(), 
		   source, 
		   new String[] {
			 "appinfo", "\n\t\t\t\t\t@Embedded\n\t\t\t\t\t@AttributeOverride(name=\"myString\" column=@Column(name=\"columnString2\"))\n\t\t\t\t\t@AttributeOverride(name=\"myInteger\" column=@Column(name=\"columnInteger2\"))\n\t\t\t\t\t"
		   });			
		addAnnotation
		  (getEmbedder_FourthEmbedded(), 
		   source, 
		   new String[] {
			 "appinfo", "\n\t\t\t\t\t@Embedded\n\t\t\t\t\t"
		   });			
		addAnnotation
		  (getEmbedder_FifthEmbedded(), 
		   source, 
		   new String[] {
			 "appinfo", "\n\t\t\t\t\t@Embedded\n\t\t\t\t\t"
		   });				
		addAnnotation
		  (getEmbedder_AnotherEmbedded(), 
		   source, 
		   new String[] {
			 "appinfo", "\n\t\t\t\t\t@Embedded\n\t\t\t\t\t"
		   });	
	}

} //EmbeddedPackageImpl

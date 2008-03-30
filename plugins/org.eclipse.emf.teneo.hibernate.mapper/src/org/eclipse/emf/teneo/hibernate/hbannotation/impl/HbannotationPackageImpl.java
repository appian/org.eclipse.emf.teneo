/**
 * <copyright>
 * </copyright>
 *
 * $Id: HbannotationPackageImpl.java,v 1.5 2008/03/30 20:55:12 mtaal Exp $
 */
package org.eclipse.emf.teneo.hibernate.hbannotation.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.teneo.annotations.pamodel.PamodelPackage;
import org.eclipse.emf.teneo.annotations.pannotation.PannotationPackage;
import org.eclipse.emf.teneo.hibernate.hbannotation.Cache;
import org.eclipse.emf.teneo.hibernate.hbannotation.CacheConcurrencyStrategy;
import org.eclipse.emf.teneo.hibernate.hbannotation.Cascade;
import org.eclipse.emf.teneo.hibernate.hbannotation.CollectionOfElements;
import org.eclipse.emf.teneo.hibernate.hbannotation.Fetch;
import org.eclipse.emf.teneo.hibernate.hbannotation.Generated;
import org.eclipse.emf.teneo.hibernate.hbannotation.GenerationTime;
import org.eclipse.emf.teneo.hibernate.hbannotation.GenericGenerator;
import org.eclipse.emf.teneo.hibernate.hbannotation.HbAnnotation;
import org.eclipse.emf.teneo.hibernate.hbannotation.HbFetchType;
import org.eclipse.emf.teneo.hibernate.hbannotation.HbannotationFactory;
import org.eclipse.emf.teneo.hibernate.hbannotation.HbannotationPackage;
import org.eclipse.emf.teneo.hibernate.hbannotation.IdBag;
import org.eclipse.emf.teneo.hibernate.hbannotation.Index;
import org.eclipse.emf.teneo.hibernate.hbannotation.MapKey;
import org.eclipse.emf.teneo.hibernate.hbannotation.NamedQuery;
import org.eclipse.emf.teneo.hibernate.hbannotation.OnDelete;
import org.eclipse.emf.teneo.hibernate.hbannotation.OnDeleteAction;
import org.eclipse.emf.teneo.hibernate.hbannotation.Parameter;
import org.eclipse.emf.teneo.hibernate.hbannotation.Proxy;
import org.eclipse.emf.teneo.hibernate.hbannotation.Type;
import org.eclipse.emf.teneo.hibernate.hbannotation.TypeDef;
import org.eclipse.emf.teneo.hibernate.hbannotation.Where;
import org.eclipse.emf.teneo.hibernate.hbannotation.util.HbannotationValidator;
import org.eclipse.emf.teneo.hibernate.hbmodel.HbmodelPackage;
import org.eclipse.emf.teneo.hibernate.hbmodel.impl.HbmodelPackageImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!-- end-user-doc -->
 * @generated
 */
public class HbannotationPackageImpl extends EPackageImpl implements HbannotationPackage {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hbAnnotationEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cascadeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass collectionOfElementsEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mapKeyEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass whereEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass idBagEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genericGeneratorEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cacheEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeDefEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fetchEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass onDeleteEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass proxyEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass indexEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generatedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedQueryEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cacheConcurrencyStrategyEEnum = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum hbFetchTypeEEnum = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum onDeleteActionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum generationTimeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.emf.teneo.hibernate.hbannotation.HbannotationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private HbannotationPackageImpl() {
		super(eNS_URI, HbannotationFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static HbannotationPackage init() {
		if (isInited) return (HbannotationPackage)EPackage.Registry.INSTANCE.getEPackage(HbannotationPackage.eNS_URI);

		// Obtain or create and register package
		HbannotationPackageImpl theHbannotationPackage = (HbannotationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof HbannotationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new HbannotationPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		PamodelPackage.eINSTANCE.eClass();
		PannotationPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		HbmodelPackageImpl theHbmodelPackage = (HbmodelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(HbmodelPackage.eNS_URI) instanceof HbmodelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(HbmodelPackage.eNS_URI) : HbmodelPackage.eINSTANCE);

		// Create package meta-data objects
		theHbannotationPackage.createPackageContents();
		theHbmodelPackage.createPackageContents();

		// Initialize created meta-data
		theHbannotationPackage.initializePackageContents();
		theHbmodelPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theHbannotationPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return HbannotationValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theHbannotationPackage.freeze();

		return theHbannotationPackage;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHbAnnotation() {
		return hbAnnotationEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCascade() {
		return cascadeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCascade_Value() {
		return (EAttribute)cascadeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCollectionOfElements() {
		return collectionOfElementsEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollectionOfElements_TargetElement() {
		return (EAttribute)collectionOfElementsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollectionOfElements_Fetch() {
		return (EAttribute)collectionOfElementsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMapKey() {
		return mapKeyEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMapKey_Columns() {
		return (EReference)mapKeyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameter() {
		return parameterEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_Name() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_Value() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getType() {
		return typeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getType_Type() {
		return (EAttribute)typeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getType_Parameters() {
		return (EReference)typeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWhere() {
		return whereEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWhere_Clause() {
		return (EAttribute)whereEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIdBag() {
		return idBagEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIdBag_Generator() {
		return (EAttribute)idBagEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIdBag_Type() {
		return (EAttribute)idBagEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIdBag_Table() {
		return (EAttribute)idBagEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenericGenerator() {
		return genericGeneratorEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenericGenerator_Name() {
		return (EAttribute)genericGeneratorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenericGenerator_Strategy() {
		return (EAttribute)genericGeneratorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenericGenerator_Parameters() {
		return (EReference)genericGeneratorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCache() {
		return cacheEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCache_Usage() {
		return (EAttribute)cacheEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCache_Region() {
		return (EAttribute)cacheEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCache_Include() {
		return (EAttribute)cacheEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeDef() {
		return typeDefEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypeDef_Name() {
		return (EAttribute)typeDefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeDef_Parameters() {
		return (EReference)typeDefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypeDef_TypeClass() {
		return (EAttribute)typeDefEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFetch() {
		return fetchEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFetch_Value() {
		return (EAttribute)fetchEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOnDelete() {
		return onDeleteEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOnDelete_Action() {
		return (EAttribute)onDeleteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProxy() {
		return proxyEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProxy_ProxyClass() {
		return (EAttribute)proxyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProxy_Lazy() {
		return (EAttribute)proxyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIndex() {
		return indexEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIndex_Name() {
		return (EAttribute)indexEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenerated() {
		return generatedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenerated_Value() {
		return (EAttribute)generatedEClass.getEStructuralFeatures().get(0);
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
	public EAttribute getNamedQuery_Name() {
		return (EAttribute)namedQueryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedQuery_Query() {
		return (EAttribute)namedQueryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCacheConcurrencyStrategy() {
		return cacheConcurrencyStrategyEEnum;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getHbFetchType() {
		return hbFetchTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOnDeleteAction() {
		return onDeleteActionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGenerationTime() {
		return generationTimeEEnum;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public HbannotationFactory getHbannotationFactory() {
		return (HbannotationFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		hbAnnotationEClass = createEClass(HB_ANNOTATION);

		cascadeEClass = createEClass(CASCADE);
		createEAttribute(cascadeEClass, CASCADE__VALUE);

		collectionOfElementsEClass = createEClass(COLLECTION_OF_ELEMENTS);
		createEAttribute(collectionOfElementsEClass, COLLECTION_OF_ELEMENTS__TARGET_ELEMENT);
		createEAttribute(collectionOfElementsEClass, COLLECTION_OF_ELEMENTS__FETCH);

		mapKeyEClass = createEClass(MAP_KEY);
		createEReference(mapKeyEClass, MAP_KEY__COLUMNS);

		parameterEClass = createEClass(PARAMETER);
		createEAttribute(parameterEClass, PARAMETER__NAME);
		createEAttribute(parameterEClass, PARAMETER__VALUE);

		typeEClass = createEClass(TYPE);
		createEAttribute(typeEClass, TYPE__TYPE);
		createEReference(typeEClass, TYPE__PARAMETERS);

		whereEClass = createEClass(WHERE);
		createEAttribute(whereEClass, WHERE__CLAUSE);

		idBagEClass = createEClass(ID_BAG);
		createEAttribute(idBagEClass, ID_BAG__GENERATOR);
		createEAttribute(idBagEClass, ID_BAG__TYPE);
		createEAttribute(idBagEClass, ID_BAG__TABLE);

		genericGeneratorEClass = createEClass(GENERIC_GENERATOR);
		createEAttribute(genericGeneratorEClass, GENERIC_GENERATOR__NAME);
		createEAttribute(genericGeneratorEClass, GENERIC_GENERATOR__STRATEGY);
		createEReference(genericGeneratorEClass, GENERIC_GENERATOR__PARAMETERS);

		cacheEClass = createEClass(CACHE);
		createEAttribute(cacheEClass, CACHE__USAGE);
		createEAttribute(cacheEClass, CACHE__REGION);
		createEAttribute(cacheEClass, CACHE__INCLUDE);

		typeDefEClass = createEClass(TYPE_DEF);
		createEAttribute(typeDefEClass, TYPE_DEF__NAME);
		createEReference(typeDefEClass, TYPE_DEF__PARAMETERS);
		createEAttribute(typeDefEClass, TYPE_DEF__TYPE_CLASS);

		fetchEClass = createEClass(FETCH);
		createEAttribute(fetchEClass, FETCH__VALUE);

		onDeleteEClass = createEClass(ON_DELETE);
		createEAttribute(onDeleteEClass, ON_DELETE__ACTION);

		proxyEClass = createEClass(PROXY);
		createEAttribute(proxyEClass, PROXY__PROXY_CLASS);
		createEAttribute(proxyEClass, PROXY__LAZY);

		indexEClass = createEClass(INDEX);
		createEAttribute(indexEClass, INDEX__NAME);

		generatedEClass = createEClass(GENERATED);
		createEAttribute(generatedEClass, GENERATED__VALUE);

		namedQueryEClass = createEClass(NAMED_QUERY);
		createEAttribute(namedQueryEClass, NAMED_QUERY__NAME);
		createEAttribute(namedQueryEClass, NAMED_QUERY__QUERY);

		// Create enums
		cacheConcurrencyStrategyEEnum = createEEnum(CACHE_CONCURRENCY_STRATEGY);
		hbFetchTypeEEnum = createEEnum(HB_FETCH_TYPE);
		onDeleteActionEEnum = createEEnum(ON_DELETE_ACTION);
		generationTimeEEnum = createEEnum(GENERATION_TIME);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
		PannotationPackage thePannotationPackage = (PannotationPackage)EPackage.Registry.INSTANCE.getEPackage(PannotationPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		hbAnnotationEClass.getESuperTypes().add(thePannotationPackage.getPAnnotation());
		cascadeEClass.getESuperTypes().add(this.getHbAnnotation());
		collectionOfElementsEClass.getESuperTypes().add(this.getHbAnnotation());
		mapKeyEClass.getESuperTypes().add(this.getHbAnnotation());
		parameterEClass.getESuperTypes().add(this.getHbAnnotation());
		typeEClass.getESuperTypes().add(this.getHbAnnotation());
		whereEClass.getESuperTypes().add(this.getHbAnnotation());
		idBagEClass.getESuperTypes().add(this.getHbAnnotation());
		genericGeneratorEClass.getESuperTypes().add(this.getHbAnnotation());
		cacheEClass.getESuperTypes().add(this.getHbAnnotation());
		typeDefEClass.getESuperTypes().add(this.getHbAnnotation());
		fetchEClass.getESuperTypes().add(this.getHbAnnotation());
		onDeleteEClass.getESuperTypes().add(this.getHbAnnotation());
		proxyEClass.getESuperTypes().add(this.getHbAnnotation());
		indexEClass.getESuperTypes().add(this.getHbAnnotation());
		generatedEClass.getESuperTypes().add(this.getHbAnnotation());
		namedQueryEClass.getESuperTypes().add(this.getHbAnnotation());

		// Initialize classes and features; add operations and parameters
		initEClass(hbAnnotationEClass, HbAnnotation.class, "HbAnnotation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(cascadeEClass, Cascade.class, "Cascade", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCascade_Value(), thePannotationPackage.getCascadeType(), "value", null, 0, -1, Cascade.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(collectionOfElementsEClass, CollectionOfElements.class, "CollectionOfElements", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCollectionOfElements_TargetElement(), ecorePackage.getEString(), "targetElement", null, 0, 1, CollectionOfElements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollectionOfElements_Fetch(), thePannotationPackage.getFetchType(), "fetch", "LAZY", 0, 1, CollectionOfElements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mapKeyEClass, MapKey.class, "MapKey", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMapKey_Columns(), thePannotationPackage.getColumn(), null, "columns", null, 0, -1, MapKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParameter_Name(), ecorePackage.getEString(), "name", null, 1, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_Value(), ecorePackage.getEString(), "value", null, 1, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeEClass, Type.class, "Type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getType_Type(), ecorePackage.getEString(), "type", null, 1, 1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getType_Parameters(), this.getParameter(), null, "parameters", null, 0, -1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(whereEClass, Where.class, "Where", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWhere_Clause(), ecorePackage.getEString(), "clause", null, 0, 1, Where.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(idBagEClass, IdBag.class, "IdBag", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIdBag_Generator(), ecorePackage.getEString(), "generator", "increment", 0, 1, IdBag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIdBag_Type(), ecorePackage.getEString(), "type", "long", 0, 1, IdBag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIdBag_Table(), ecorePackage.getEString(), "table", null, 0, 1, IdBag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(genericGeneratorEClass, GenericGenerator.class, "GenericGenerator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGenericGenerator_Name(), ecorePackage.getEString(), "name", null, 1, 1, GenericGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenericGenerator_Strategy(), ecorePackage.getEString(), "strategy", null, 1, 1, GenericGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenericGenerator_Parameters(), this.getParameter(), null, "parameters", null, 0, -1, GenericGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cacheEClass, Cache.class, "Cache", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCache_Usage(), this.getCacheConcurrencyStrategy(), "usage", null, 0, 1, Cache.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCache_Region(), ecorePackage.getEString(), "region", null, 0, 1, Cache.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCache_Include(), ecorePackage.getEString(), "include", null, 0, 1, Cache.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeDefEClass, TypeDef.class, "TypeDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTypeDef_Name(), ecorePackage.getEString(), "name", null, 1, 1, TypeDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTypeDef_Parameters(), this.getParameter(), null, "parameters", null, 0, -1, TypeDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTypeDef_TypeClass(), ecorePackage.getEString(), "typeClass", null, 1, 1, TypeDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fetchEClass, Fetch.class, "Fetch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFetch_Value(), this.getHbFetchType(), "value", null, 0, 1, Fetch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(onDeleteEClass, OnDelete.class, "OnDelete", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOnDelete_Action(), this.getOnDeleteAction(), "action", null, 0, 1, OnDelete.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(proxyEClass, Proxy.class, "Proxy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProxy_ProxyClass(), ecorePackage.getEString(), "proxyClass", null, 0, 1, Proxy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProxy_Lazy(), ecorePackage.getEBoolean(), "lazy", "true", 0, 1, Proxy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(indexEClass, Index.class, "Index", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIndex_Name(), ecorePackage.getEString(), "name", null, 0, 1, Index.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(generatedEClass, Generated.class, "Generated", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGenerated_Value(), this.getGenerationTime(), "value", null, 0, 1, Generated.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(namedQueryEClass, NamedQuery.class, "NamedQuery", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedQuery_Name(), ecorePackage.getEString(), "name", null, 0, 1, NamedQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNamedQuery_Query(), ecorePackage.getEString(), "query", null, 0, 1, NamedQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(cacheConcurrencyStrategyEEnum, CacheConcurrencyStrategy.class, "CacheConcurrencyStrategy");
		addEEnumLiteral(cacheConcurrencyStrategyEEnum, CacheConcurrencyStrategy.NONE);
		addEEnumLiteral(cacheConcurrencyStrategyEEnum, CacheConcurrencyStrategy.READ_ONLY);
		addEEnumLiteral(cacheConcurrencyStrategyEEnum, CacheConcurrencyStrategy.NONSTRICT_READ_WRITE);
		addEEnumLiteral(cacheConcurrencyStrategyEEnum, CacheConcurrencyStrategy.READ_WRITE);
		addEEnumLiteral(cacheConcurrencyStrategyEEnum, CacheConcurrencyStrategy.TRANSACTIONAL);

		initEEnum(hbFetchTypeEEnum, HbFetchType.class, "HbFetchType");
		addEEnumLiteral(hbFetchTypeEEnum, HbFetchType.JOIN);
		addEEnumLiteral(hbFetchTypeEEnum, HbFetchType.SELECT);
		addEEnumLiteral(hbFetchTypeEEnum, HbFetchType.SUBSELECT);

		initEEnum(onDeleteActionEEnum, OnDeleteAction.class, "OnDeleteAction");
		addEEnumLiteral(onDeleteActionEEnum, OnDeleteAction.NO_ACTION);
		addEEnumLiteral(onDeleteActionEEnum, OnDeleteAction.CASCADE);

		initEEnum(generationTimeEEnum, GenerationTime.class, "GenerationTime");
		addEEnumLiteral(generationTimeEEnum, GenerationTime.NEVER);
		addEEnumLiteral(generationTimeEEnum, GenerationTime.INSERT);
		addEEnumLiteral(generationTimeEEnum, GenerationTime.ALWAYS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// teneo.mapping.source
		createTeneoAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://annotation.elver.org/internal/Target
		createTargetAnnotations();
		// http://annotation.elver.org/internal/Collection
		createCollectionAnnotations();
	}

	/**
	 * Initializes the annotations for <b>teneo.mapping.source</b>.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	protected void createTeneoAnnotations() {
		String source = "teneo.mapping.source";		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "1", "http://hibernate.elver.org/"
		   });																			
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";			
		addAnnotation
		  (hbAnnotationEClass, 
		   source, 
		   new String[] {
			 "constraints", "CompatibleEModelElementType AnnotationIsSupported"
		   });																		
	}

	/**
	 * Initializes the annotations for <b>http://annotation.elver.org/internal/Target</b>. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void createTargetAnnotations() {
		String source = "http://annotation.elver.org/internal/Target";				
		addAnnotation
		  (cascadeEClass, 
		   source, 
		   new String[] {
			 "0", "EStructuralFeature"
		   });		
		addAnnotation
		  (collectionOfElementsEClass, 
		   source, 
		   new String[] {
			 "0", "EStructuralFeature"
		   });		
		addAnnotation
		  (mapKeyEClass, 
		   source, 
		   new String[] {
			 "0", "EStructuralFeature"
		   });			
		addAnnotation
		  (parameterEClass, 
		   source, 
		   new String[] {
			 "0", "EStructuralFeature",
			 "1", "EClass",
			 "2", "EPackage"
		   });		
		addAnnotation
		  (typeEClass, 
		   source, 
		   new String[] {
			 "0", "EStructuralFeature"
		   });		
		addAnnotation
		  (whereEClass, 
		   source, 
		   new String[] {
			 "0", "EStructuralFeature"
		   });		
		addAnnotation
		  (idBagEClass, 
		   source, 
		   new String[] {
			 "0", "EStructuralFeature"
		   });		
		addAnnotation
		  (genericGeneratorEClass, 
		   source, 
		   new String[] {
			 "0", "EStructuralFeature",
			 "1", "EClass",
			 "2", "EPackage"
		   });			
		addAnnotation
		  (cacheEClass, 
		   source, 
		   new String[] {
			 "0", "EReference",
			 "1", "EClass"
		   });		
		addAnnotation
		  (typeDefEClass, 
		   source, 
		   new String[] {
			 "0", "EStructuralFeature",
			 "1", "EClass",
			 "2", "EPackage"
		   });		
		addAnnotation
		  (fetchEClass, 
		   source, 
		   new String[] {
			 "0", "EStructuralFeature"
		   });		
		addAnnotation
		  (onDeleteEClass, 
		   source, 
		   new String[] {
			 "0", "EStructuralFeature"
		   });		
		addAnnotation
		  (proxyEClass, 
		   source, 
		   new String[] {
			 "0", "EClass"
		   });		
		addAnnotation
		  (indexEClass, 
		   source, 
		   new String[] {
			 "0", "EStructuralFeature"
		   });		
		addAnnotation
		  (generatedEClass, 
		   source, 
		   new String[] {
			 "0", "EAttribute"
		   });		
		addAnnotation
		  (namedQueryEClass, 
		   source, 
		   new String[] {
			 "0", "EClass"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://annotation.elver.org/internal/Collection</b>. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void createCollectionAnnotations() {
		String source = "http://annotation.elver.org/internal/Collection";							
		addAnnotation
		  (parameterEClass, 
		   source, 
		   new String[] {
			 "name", "Parameters",
			 "packageNS", "http://www.eclipse.org/emf/teneo/2006/HbAnnotation"
		   });							
		addAnnotation
		  (genericGeneratorEClass, 
		   source, 
		   new String[] {
			 "name", "GenericGenerators",
			 "packageNS", "http://www.eclipse.org/emf/teneo/2006/HbAnnotation"
		   });								
	}

} // HbannotationPackageImpl

/**
 * <copyright>
 * </copyright>
 *
 * $Id: ClaimPackageImpl.java,v 1.3 2009/11/10 10:05:32 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.sample.claim.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.eclipse.emf.teneo.samples.emf.sample.claim.Claim;
import org.eclipse.emf.teneo.samples.emf.sample.claim.ClaimCompositeKey;
import org.eclipse.emf.teneo.samples.emf.sample.claim.ClaimFactory;
import org.eclipse.emf.teneo.samples.emf.sample.claim.ClaimLine;
import org.eclipse.emf.teneo.samples.emf.sample.claim.ClaimLineCompositeKey;
import org.eclipse.emf.teneo.samples.emf.sample.claim.ClaimPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ClaimPackageImpl extends EPackageImpl implements ClaimPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass claimEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass claimCompositeKeyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass claimLineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass claimLineCompositeKeyEClass = null;

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
	 * @see org.eclipse.emf.teneo.samples.emf.sample.claim.ClaimPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ClaimPackageImpl() {
		super(eNS_URI, ClaimFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ClaimPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ClaimPackage init() {
		if (isInited) return (ClaimPackage)EPackage.Registry.INSTANCE.getEPackage(ClaimPackage.eNS_URI);

		// Obtain or create and register package
		ClaimPackageImpl theClaimPackage = (ClaimPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ClaimPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ClaimPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theClaimPackage.createPackageContents();

		// Initialize created meta-data
		theClaimPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theClaimPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ClaimPackage.eNS_URI, theClaimPackage);
		return theClaimPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClaim() {
		return claimEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaim_ClaimCompositeKey() {
		return (EReference)claimEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClaim_BillingName() {
		return (EAttribute)claimEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClaim_ClaimGroupVSPId() {
		return (EAttribute)claimEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClaim_ClaimStatus() {
		return (EAttribute)claimEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaim_ClaimLine() {
		return (EReference)claimEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClaimCompositeKey() {
		return claimCompositeKeyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClaimCompositeKey_ClaimNumber() {
		return (EAttribute)claimCompositeKeyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClaimCompositeKey_ClaimExtensionNumber() {
		return (EAttribute)claimCompositeKeyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClaimLine() {
		return claimLineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimLine_Claim() {
		return (EReference)claimLineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimLine_ClaimLineCompositeKey() {
		return (EReference)claimLineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClaimLine_ClaimLineBilledAmount() {
		return (EAttribute)claimLineEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClaimLine_ServiceCode() {
		return (EAttribute)claimLineEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClaimLine_ClaimLineStatus() {
		return (EAttribute)claimLineEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClaimLineCompositeKey() {
		return claimLineCompositeKeyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimLineCompositeKey_Claim() {
		return (EReference)claimLineCompositeKeyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClaimLineCompositeKey_ClaimLineNumber() {
		return (EAttribute)claimLineCompositeKeyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimFactory getClaimFactory() {
		return (ClaimFactory)getEFactoryInstance();
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
		claimEClass = createEClass(CLAIM);
		createEReference(claimEClass, CLAIM__CLAIM_COMPOSITE_KEY);
		createEAttribute(claimEClass, CLAIM__BILLING_NAME);
		createEAttribute(claimEClass, CLAIM__CLAIM_GROUP_VSP_ID);
		createEAttribute(claimEClass, CLAIM__CLAIM_STATUS);
		createEReference(claimEClass, CLAIM__CLAIM_LINE);

		claimCompositeKeyEClass = createEClass(CLAIM_COMPOSITE_KEY);
		createEAttribute(claimCompositeKeyEClass, CLAIM_COMPOSITE_KEY__CLAIM_NUMBER);
		createEAttribute(claimCompositeKeyEClass, CLAIM_COMPOSITE_KEY__CLAIM_EXTENSION_NUMBER);

		claimLineEClass = createEClass(CLAIM_LINE);
		createEReference(claimLineEClass, CLAIM_LINE__CLAIM);
		createEReference(claimLineEClass, CLAIM_LINE__CLAIM_LINE_COMPOSITE_KEY);
		createEAttribute(claimLineEClass, CLAIM_LINE__CLAIM_LINE_BILLED_AMOUNT);
		createEAttribute(claimLineEClass, CLAIM_LINE__SERVICE_CODE);
		createEAttribute(claimLineEClass, CLAIM_LINE__CLAIM_LINE_STATUS);

		claimLineCompositeKeyEClass = createEClass(CLAIM_LINE_COMPOSITE_KEY);
		createEReference(claimLineCompositeKeyEClass, CLAIM_LINE_COMPOSITE_KEY__CLAIM);
		createEAttribute(claimLineCompositeKeyEClass, CLAIM_LINE_COMPOSITE_KEY__CLAIM_LINE_NUMBER);
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
		initEClass(claimEClass, Claim.class, "Claim", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClaim_ClaimCompositeKey(), this.getClaimCompositeKey(), null, "claimCompositeKey", null, 1, 1, Claim.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClaim_BillingName(), theXMLTypePackage.getString(), "billingName", "", 1, 1, Claim.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClaim_ClaimGroupVSPId(), theXMLTypePackage.getString(), "claimGroupVSPId", "", 1, 1, Claim.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClaim_ClaimStatus(), theXMLTypePackage.getString(), "claimStatus", "", 1, 1, Claim.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClaim_ClaimLine(), this.getClaimLine(), this.getClaimLine_Claim(), "claimLine", null, 0, -1, Claim.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(claimCompositeKeyEClass, ClaimCompositeKey.class, "ClaimCompositeKey", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getClaimCompositeKey_ClaimNumber(), theXMLTypePackage.getString(), "claimNumber", null, 1, 1, ClaimCompositeKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClaimCompositeKey_ClaimExtensionNumber(), theXMLTypePackage.getString(), "claimExtensionNumber", null, 1, 1, ClaimCompositeKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(claimLineEClass, ClaimLine.class, "ClaimLine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClaimLine_Claim(), this.getClaim(), this.getClaim_ClaimLine(), "claim", null, 1, 1, ClaimLine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClaimLine_ClaimLineCompositeKey(), this.getClaimLineCompositeKey(), null, "claimLineCompositeKey", null, 1, 1, ClaimLine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClaimLine_ClaimLineBilledAmount(), theXMLTypePackage.getDecimal(), "claimLineBilledAmount", null, 1, 1, ClaimLine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClaimLine_ServiceCode(), theXMLTypePackage.getString(), "serviceCode", null, 1, 1, ClaimLine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClaimLine_ClaimLineStatus(), theXMLTypePackage.getString(), "claimLineStatus", "", 1, 1, ClaimLine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(claimLineCompositeKeyEClass, ClaimLineCompositeKey.class, "ClaimLineCompositeKey", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClaimLineCompositeKey_Claim(), this.getClaim(), null, "claim", null, 1, 1, ClaimLineCompositeKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClaimLineCompositeKey_ClaimLineNumber(), theXMLTypePackage.getString(), "claimLineNumber", null, 1, 1, ClaimLineCompositeKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// teneo.extra
		createTeneoAnnotations();
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
		// teneo.extra.test
		createTeneo_1Annotations();
		// teneo.jpa
		createTeneo_2Annotations();
		// teneo.extra.test2
		createTeneo_3Annotations();
	}

	/**
	 * Initializes the annotations for <b>teneo.extra</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createTeneoAnnotations() {
		String source = "teneo.extra";			
		addAnnotation
		  (claimEClass, 
		   source, 
		   new String[] {
			 "appinfo", "\t\n\t@Table(\n\t  name=PCLM_NPRC_CLM\n\t  uniqueConstraints = {\t@UniqueConstraint(columnNames={\"CLM_NBR\", \"CLM_EXT_NBR\"})\n\t  \t\t\t\t\t  }\t  \n\t)\n\t"
		   });													
		addAnnotation
		  (getClaim_ClaimLine(), 
		   source, 
		   new String[] {
			 "appinfo", "\n\t\t\t\t\t@OneToMany(mappedBy=\"ClaimLine\", indexed=false)\n\t\t\t\t\t@JoinColumns({\n    \t\t\t\t\t@JoinColumn(name=\"CLM_NBR\"),\n    \t\t\t\t\t@JoinColumn(name=\"CLM_EXT_NBR\")\n    \t\t\t\t})\t\n\t\t\t\t"
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
		  (claimEClass, 
		   source, 
		   new String[] {
			 "name", "Claim",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (getClaim_ClaimCompositeKey(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "claimCompositeKey",
			 "namespace", "##targetNamespace"
		   });				
		addAnnotation
		  (getClaim_BillingName(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "billingName",
			 "namespace", "##targetNamespace"
		   });				
		addAnnotation
		  (getClaim_ClaimGroupVSPId(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "claimGroupVSPId",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getClaim_ClaimStatus(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "claimStatus",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getClaim_ClaimLine(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "claimLine",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (claimCompositeKeyEClass, 
		   source, 
		   new String[] {
			 "name", "ClaimCompositeKey",
			 "kind", "elementOnly"
		   });				
		addAnnotation
		  (getClaimCompositeKey_ClaimNumber(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "claimNumber",
			 "namespace", "##targetNamespace"
		   });				
		addAnnotation
		  (getClaimCompositeKey_ClaimExtensionNumber(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "claimExtensionNumber",
			 "namespace", "##targetNamespace"
		   });				
		addAnnotation
		  (claimLineEClass, 
		   source, 
		   new String[] {
			 "name", "ClaimLine",
			 "kind", "elementOnly"
		   });				
		addAnnotation
		  (getClaimLine_Claim(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "claim",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getClaimLine_ClaimLineCompositeKey(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "claimLineCompositeKey",
			 "namespace", "##targetNamespace"
		   });				
		addAnnotation
		  (getClaimLine_ClaimLineBilledAmount(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "claimLineBilledAmount",
			 "namespace", "##targetNamespace"
		   });				
		addAnnotation
		  (getClaimLine_ServiceCode(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "serviceCode",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getClaimLine_ClaimLineStatus(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "claimLineStatus",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (claimLineCompositeKeyEClass, 
		   source, 
		   new String[] {
			 "name", "ClaimLineCompositeKey",
			 "kind", "elementOnly"
		   });				
		addAnnotation
		  (getClaimLineCompositeKey_Claim(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "claim",
			 "namespace", "##targetNamespace"
		   });				
		addAnnotation
		  (getClaimLineCompositeKey_ClaimLineNumber(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "claimLineNumber",
			 "namespace", "##targetNamespace"
		   });
	}

	/**
	 * Initializes the annotations for <b>teneo.extra.test</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createTeneo_1Annotations() {
		String source = "teneo.extra.test";					
		addAnnotation
		  (getClaim_ClaimCompositeKey(), 
		   source, 
		   new String[] {
			 "appinfo", "@EmbeddedId"
		   });							
		addAnnotation
		  (getClaim_ClaimGroupVSPId(), 
		   source, 
		   new String[] {
			 "appinfo", "@Column(name=CLM_GRP_VSP_ID,length=\"3\")"
		   });			
		addAnnotation
		  (getClaim_ClaimStatus(), 
		   source, 
		   new String[] {
			 "appinfo", "@Column(name=CLM_STATUS,length=\"2\")"
		   });								
		addAnnotation
		  (getClaimCompositeKey_ClaimNumber(), 
		   source, 
		   new String[] {
			 "appinfo", "\n\t\t\t\t\t@Column(name=CLM_NBR)\n\t\t\t\t"
		   });																												
	}

	/**
	 * Initializes the annotations for <b>teneo.jpa</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createTeneo_2Annotations() {
		String source = "teneo.jpa";								
		addAnnotation
		  (getClaim_BillingName(), 
		   source, 
		   new String[] {
			 "appinfo", "@Column(name=BILLING_NAME,length=\"50\")"
		   });										
		addAnnotation
		  (claimCompositeKeyEClass, 
		   source, 
		   new String[] {
			 "appinfo", "@Embeddable"
		   });										
		addAnnotation
		  (claimLineEClass, 
		   source, 
		   new String[] {
			 "appinfo", "\t\n\t\t@Table(\n\t\t  name=PCLM_NPRC_CLMLN\t\t  \n\t\t  uniqueConstraints = {\t@UniqueConstraint(columnNames={\"CLM_NBR\", \"CLM_EXT_NBR\", \"CLMLN_NBR\"})\n\t\t  \t\t\t\t\t  }\t  \n\t\t )\n\t\t"
		   });				
		addAnnotation
		  (getClaimLine_Claim(), 
		   source, 
		   new String[] {
			 "appinfo", "\n\t\t\t\t\t\t@Transient\n\t\t\t\t\t"
		   });			
		addAnnotation
		  (getClaimLine_ClaimLineCompositeKey(), 
		   source, 
		   new String[] {
			 "appinfo", "@EmbeddedId"
		   });				
		addAnnotation
		  (getClaimLine_ClaimLineBilledAmount(), 
		   source, 
		   new String[] {
			 "appinfo", "\n\t\t\t\t\t@Column(name=CLMLN_BILL_AMT)\n\t\t\t\t"
		   });				
		addAnnotation
		  (getClaimLine_ServiceCode(), 
		   source, 
		   new String[] {
			 "appinfo", "\n\t\t\t\t\t@Column(name=SVC_CD)\n\t\t\t\t"
		   });			
		addAnnotation
		  (getClaimLine_ClaimLineStatus(), 
		   source, 
		   new String[] {
			 "appinfo", "@Column(name=CLMLN_STATUS,length=\"2\")"
		   });			
		addAnnotation
		  (claimLineCompositeKeyEClass, 
		   source, 
		   new String[] {
			 "appinfo", "@Embeddable"
		   });				
		addAnnotation
		  (getClaimLineCompositeKey_Claim(), 
		   source, 
		   new String[] {
			 "appinfo", "\n\t\t\t\t\t\t@ManyToOne\n\t\t\t\t\t\t@JoinColumns({\n\t\t    \t\t\t\t@JoinColumn(name=\"CLM_NBR\", referencedColumnName = \"CLM_NBR\"),\n\t\t    \t\t\t\t@JoinColumn(name=\"CLM_EXT_NBR\", referencedColumnName =\"CLM_EXT_NBR\")\n\t\t    \t\t\t})\n\t\t\t\t\t\t"
		   });				
		addAnnotation
		  (getClaimLineCompositeKey_ClaimLineNumber(), 
		   source, 
		   new String[] {
			 "appinfo", "\n\t\t\t\t\t@Column(name=CLMLN_NBR)\n\t\t\t\t"
		   });	
	}

	/**
	 * Initializes the annotations for <b>teneo.extra.test2</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createTeneo_3Annotations() {
		String source = "teneo.extra.test2";																							
		addAnnotation
		  (getClaimCompositeKey_ClaimExtensionNumber(), 
		   source, 
		   new String[] {
			 "appinfo", "\n\t\t\t\t\t@Column(name=CLM_EXT_NBR)\n\t\t\t\t"
		   });																									
	}

} //ClaimPackageImpl

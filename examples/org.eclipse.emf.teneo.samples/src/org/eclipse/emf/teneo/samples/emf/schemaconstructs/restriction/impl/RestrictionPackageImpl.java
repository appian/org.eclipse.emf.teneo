/**
 * <copyright>
 * </copyright>
 *
 * $Id: RestrictionPackageImpl.java,v 1.1 2006/07/11 16:57:15 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.schemaconstructs.restriction.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.eclipse.emf.ecore.xml.type.impl.XMLTypePackageImpl;

import org.eclipse.emf.teneo.samples.emf.schemaconstructs.restriction.Member;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.restriction.RestrictionFactory;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.restriction.RestrictionPackage;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.restriction.XMLDeviant;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RestrictionPackageImpl extends EPackageImpl implements RestrictionPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass memberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmlDeviantEClass = null;

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
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.restriction.RestrictionPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RestrictionPackageImpl() {
		super(eNS_URI, RestrictionFactory.eINSTANCE);
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
	public static RestrictionPackage init() {
		if (isInited) return (RestrictionPackage)EPackage.Registry.INSTANCE.getEPackage(RestrictionPackage.eNS_URI);

		// Obtain or create and register package
		RestrictionPackageImpl theRestrictionPackage = (RestrictionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof RestrictionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new RestrictionPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackageImpl.init();

		// Create package meta-data objects
		theRestrictionPackage.createPackageContents();

		// Initialize created meta-data
		theRestrictionPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRestrictionPackage.freeze();

		return theRestrictionPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMember() {
		return memberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXMLDeviant() {
		return xmlDeviantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXMLDeviant_NumPosts() {
		return (EAttribute)xmlDeviantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXMLDeviant_Signature() {
		return (EAttribute)xmlDeviantEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXMLDeviant_Email() {
		return (EAttribute)xmlDeviantEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXMLDeviant_FirstSubscribed() {
		return (EAttribute)xmlDeviantEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXMLDeviant_MailReader() {
		return (EAttribute)xmlDeviantEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RestrictionFactory getRestrictionFactory() {
		return (RestrictionFactory)getEFactoryInstance();
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
		memberEClass = createEClass(MEMBER);

		xmlDeviantEClass = createEClass(XML_DEVIANT);
		createEAttribute(xmlDeviantEClass, XML_DEVIANT__NUM_POSTS);
		createEAttribute(xmlDeviantEClass, XML_DEVIANT__SIGNATURE);
		createEAttribute(xmlDeviantEClass, XML_DEVIANT__EMAIL);
		createEAttribute(xmlDeviantEClass, XML_DEVIANT__FIRST_SUBSCRIBED);
		createEAttribute(xmlDeviantEClass, XML_DEVIANT__MAIL_READER);
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
		XMLTypePackageImpl theXMLTypePackage = (XMLTypePackageImpl)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Add supertypes to classes
		memberEClass.getESuperTypes().add(this.getXMLDeviant());

		// Initialize classes and features; add operations and parameters
		initEClass(memberEClass, Member.class, "Member", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(xmlDeviantEClass, XMLDeviant.class, "XMLDeviant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getXMLDeviant_NumPosts(), theXMLTypePackage.getInteger(), "numPosts", null, 0, 1, XMLDeviant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXMLDeviant_Signature(), theXMLTypePackage.getString(), "signature", null, 1, 1, XMLDeviant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXMLDeviant_Email(), theXMLTypePackage.getString(), "email", null, 0, 1, XMLDeviant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXMLDeviant_FirstSubscribed(), theXMLTypePackage.getDate(), "firstSubscribed", null, 0, 1, XMLDeviant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXMLDeviant_MailReader(), theXMLTypePackage.getString(), "mailReader", null, 0, 1, XMLDeviant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
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
		  (memberEClass, 
		   source, 
		   new String[] {
			 "name", "Member",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (xmlDeviantEClass, 
		   source, 
		   new String[] {
			 "name", "XML-Deviant",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getXMLDeviant_NumPosts(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "numPosts"
		   });		
		addAnnotation
		  (getXMLDeviant_Signature(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "signature"
		   });		
		addAnnotation
		  (getXMLDeviant_Email(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "email"
		   });		
		addAnnotation
		  (getXMLDeviant_FirstSubscribed(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "firstSubscribed"
		   });		
		addAnnotation
		  (getXMLDeviant_MailReader(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "mailReader"
		   });
	}

} //RestrictionPackageImpl

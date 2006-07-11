/**
 * <copyright>
 * </copyright>
 *
 * $Id: PlayPackageImpl.java,v 1.1 2006/07/11 16:57:07 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.sample.play.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.eclipse.emf.ecore.xml.type.impl.XMLTypePackageImpl;


import org.eclipse.emf.teneo.samples.emf.sample.play.ActType;
import org.eclipse.emf.teneo.samples.emf.sample.play.DocumentRoot;
import org.eclipse.emf.teneo.samples.emf.sample.play.FmType;
import org.eclipse.emf.teneo.samples.emf.sample.play.PersonaGroupType;
import org.eclipse.emf.teneo.samples.emf.sample.play.PersonaeType;
import org.eclipse.emf.teneo.samples.emf.sample.play.PlayFactory;
import org.eclipse.emf.teneo.samples.emf.sample.play.PlayPackage;
import org.eclipse.emf.teneo.samples.emf.sample.play.PlayType;
import org.eclipse.emf.teneo.samples.emf.sample.play.SceneType;
import org.eclipse.emf.teneo.samples.emf.sample.play.SpeechType;
import org.eclipse.emf.teneo.samples.emf.sample.play.util.PlayValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PlayPackageImpl extends EPackageImpl implements PlayPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fmTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass personaeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass personaGroupTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass playTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sceneTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass speechTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType pindexTypeEDataType = null;

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
	 * @see org.eclipse.emf.teneo.samples.emf.sample.play.PlayPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PlayPackageImpl() {
		super(eNS_URI, PlayFactory.eINSTANCE);
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
	public static PlayPackage init() {
		if (isInited) return (PlayPackage)EPackage.Registry.INSTANCE.getEPackage(PlayPackage.eNS_URI);

		// Obtain or create and register package
		PlayPackageImpl thePlayPackage = (PlayPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof PlayPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new PlayPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackageImpl.init();

		// Create package meta-data objects
		thePlayPackage.createPackageContents();

		// Initialize created meta-data
		thePlayPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(thePlayPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return PlayValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		thePlayPackage.freeze();

		return thePlayPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActType() {
		return actTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActType_Scene() {
		return (EReference)actTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActType_Pindex() {
		return (EAttribute)actTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActType_Title() {
		return (EAttribute)actTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentRoot() {
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Mixed() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XMLNSPrefixMap() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XSISchemaLocation() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Act() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Fm() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_GroupDescription() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Line() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_P() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Persona() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Personae() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PersonaGroup() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Play() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_PlaySubTitle() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Scene() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_SceneDescription() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Speaker() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Speech() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_StageDirections() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Title() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFmType() {
		return fmTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFmType_P() {
		return (EAttribute)fmTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPersonaeType() {
		return personaeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonaeType_Group() {
		return (EAttribute)personaeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonaeType_Title() {
		return (EAttribute)personaeTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonaeType_Persona() {
		return (EAttribute)personaeTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonaeType_PersonaGroup() {
		return (EReference)personaeTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPersonaGroupType() {
		return personaGroupTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonaGroupType_Persona() {
		return (EAttribute)personaGroupTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonaGroupType_GroupDescription() {
		return (EAttribute)personaGroupTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlayType() {
		return playTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlayType_Title() {
		return (EAttribute)playTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlayType_Fm() {
		return (EReference)playTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlayType_Personae() {
		return (EReference)playTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlayType_SceneDescription() {
		return (EAttribute)playTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlayType_PlaySubTitle() {
		return (EAttribute)playTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlayType_Act() {
		return (EReference)playTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSceneType() {
		return sceneTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSceneType_Group() {
		return (EAttribute)sceneTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSceneType_StageDirections() {
		return (EAttribute)sceneTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSceneType_Speech() {
		return (EReference)sceneTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSceneType_Pindex() {
		return (EAttribute)sceneTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSceneType_Title() {
		return (EAttribute)sceneTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpeechType() {
		return speechTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpeechType_Group() {
		return (EAttribute)speechTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpeechType_Speaker() {
		return (EAttribute)speechTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpeechType_Line() {
		return (EAttribute)speechTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpeechType_StageDirections() {
		return (EAttribute)speechTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPindexType() {
		return pindexTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlayFactory getPlayFactory() {
		return (PlayFactory)getEFactoryInstance();
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
		actTypeEClass = createEClass(ACT_TYPE);
		createEReference(actTypeEClass, ACT_TYPE__SCENE);
		createEAttribute(actTypeEClass, ACT_TYPE__PINDEX);
		createEAttribute(actTypeEClass, ACT_TYPE__TITLE);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ACT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__FM);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__GROUP_DESCRIPTION);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__LINE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__P);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__PERSONA);
		createEReference(documentRootEClass, DOCUMENT_ROOT__PERSONAE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__PERSONA_GROUP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__PLAY);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__PLAY_SUB_TITLE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SCENE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__SCENE_DESCRIPTION);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__SPEAKER);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SPEECH);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__STAGE_DIRECTIONS);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__TITLE);

		fmTypeEClass = createEClass(FM_TYPE);
		createEAttribute(fmTypeEClass, FM_TYPE__P);

		personaeTypeEClass = createEClass(PERSONAE_TYPE);
		createEAttribute(personaeTypeEClass, PERSONAE_TYPE__GROUP);
		createEAttribute(personaeTypeEClass, PERSONAE_TYPE__TITLE);
		createEAttribute(personaeTypeEClass, PERSONAE_TYPE__PERSONA);
		createEReference(personaeTypeEClass, PERSONAE_TYPE__PERSONA_GROUP);

		personaGroupTypeEClass = createEClass(PERSONA_GROUP_TYPE);
		createEAttribute(personaGroupTypeEClass, PERSONA_GROUP_TYPE__PERSONA);
		createEAttribute(personaGroupTypeEClass, PERSONA_GROUP_TYPE__GROUP_DESCRIPTION);

		playTypeEClass = createEClass(PLAY_TYPE);
		createEAttribute(playTypeEClass, PLAY_TYPE__TITLE);
		createEReference(playTypeEClass, PLAY_TYPE__FM);
		createEReference(playTypeEClass, PLAY_TYPE__PERSONAE);
		createEAttribute(playTypeEClass, PLAY_TYPE__SCENE_DESCRIPTION);
		createEAttribute(playTypeEClass, PLAY_TYPE__PLAY_SUB_TITLE);
		createEReference(playTypeEClass, PLAY_TYPE__ACT);

		sceneTypeEClass = createEClass(SCENE_TYPE);
		createEAttribute(sceneTypeEClass, SCENE_TYPE__GROUP);
		createEAttribute(sceneTypeEClass, SCENE_TYPE__STAGE_DIRECTIONS);
		createEReference(sceneTypeEClass, SCENE_TYPE__SPEECH);
		createEAttribute(sceneTypeEClass, SCENE_TYPE__PINDEX);
		createEAttribute(sceneTypeEClass, SCENE_TYPE__TITLE);

		speechTypeEClass = createEClass(SPEECH_TYPE);
		createEAttribute(speechTypeEClass, SPEECH_TYPE__GROUP);
		createEAttribute(speechTypeEClass, SPEECH_TYPE__SPEAKER);
		createEAttribute(speechTypeEClass, SPEECH_TYPE__LINE);
		createEAttribute(speechTypeEClass, SPEECH_TYPE__STAGE_DIRECTIONS);

		// Create data types
		pindexTypeEDataType = createEDataType(PINDEX_TYPE);
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

		// Initialize classes and features; add operations and parameters
		initEClass(actTypeEClass, ActType.class, "ActType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActType_Scene(), this.getSceneType(), null, "scene", null, 1, -1, ActType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActType_Pindex(), theXMLTypePackage.getByte(), "pindex", null, 1, 1, ActType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActType_Title(), theXMLTypePackage.getString(), "title", null, 1, 1, ActType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Act(), this.getActType(), null, "act", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Fm(), this.getFmType(), null, "fm", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_GroupDescription(), theXMLTypePackage.getString(), "groupDescription", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Line(), theXMLTypePackage.getString(), "line", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_P(), theXMLTypePackage.getString(), "p", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Persona(), theXMLTypePackage.getString(), "persona", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Personae(), this.getPersonaeType(), null, "personae", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_PersonaGroup(), this.getPersonaGroupType(), null, "personaGroup", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Play(), this.getPlayType(), null, "play", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_PlaySubTitle(), theXMLTypePackage.getString(), "playSubTitle", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Scene(), this.getSceneType(), null, "scene", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_SceneDescription(), theXMLTypePackage.getString(), "sceneDescription", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Speaker(), theXMLTypePackage.getString(), "speaker", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Speech(), this.getSpeechType(), null, "speech", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_StageDirections(), theXMLTypePackage.getString(), "stageDirections", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Title(), theXMLTypePackage.getString(), "title", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(fmTypeEClass, FmType.class, "FmType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFmType_P(), theXMLTypePackage.getString(), "p", null, 1, -1, FmType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(personaeTypeEClass, PersonaeType.class, "PersonaeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPersonaeType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, PersonaeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersonaeType_Title(), theXMLTypePackage.getString(), "title", null, 0, -1, PersonaeType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersonaeType_Persona(), theXMLTypePackage.getString(), "persona", null, 0, -1, PersonaeType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getPersonaeType_PersonaGroup(), this.getPersonaGroupType(), null, "personaGroup", null, 0, -1, PersonaeType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(personaGroupTypeEClass, PersonaGroupType.class, "PersonaGroupType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPersonaGroupType_Persona(), theXMLTypePackage.getString(), "persona", null, 1, -1, PersonaGroupType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersonaGroupType_GroupDescription(), theXMLTypePackage.getString(), "groupDescription", null, 1, 1, PersonaGroupType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(playTypeEClass, PlayType.class, "PlayType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPlayType_Title(), theXMLTypePackage.getString(), "title", null, 1, 1, PlayType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlayType_Fm(), this.getFmType(), null, "fm", null, 1, 1, PlayType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlayType_Personae(), this.getPersonaeType(), null, "personae", null, 1, 1, PlayType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlayType_SceneDescription(), theXMLTypePackage.getString(), "sceneDescription", null, 1, 1, PlayType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlayType_PlaySubTitle(), theXMLTypePackage.getString(), "playSubTitle", null, 1, 1, PlayType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlayType_Act(), this.getActType(), null, "act", null, 1, -1, PlayType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sceneTypeEClass, SceneType.class, "SceneType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSceneType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, SceneType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSceneType_StageDirections(), theXMLTypePackage.getString(), "stageDirections", null, 0, -1, SceneType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSceneType_Speech(), this.getSpeechType(), null, "speech", null, 0, -1, SceneType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getSceneType_Pindex(), this.getPindexType(), "pindex", null, 1, 1, SceneType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSceneType_Title(), theXMLTypePackage.getString(), "title", null, 1, 1, SceneType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(speechTypeEClass, SpeechType.class, "SpeechType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSpeechType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, SpeechType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpeechType_Speaker(), theXMLTypePackage.getString(), "speaker", null, 0, -1, SpeechType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpeechType_Line(), theXMLTypePackage.getString(), "line", null, 0, -1, SpeechType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpeechType_StageDirections(), theXMLTypePackage.getString(), "stageDirections", null, 0, -1, SpeechType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		// Initialize data types
		initEDataType(pindexTypeEDataType, String.class, "PindexType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// null
		createNullAnnotations();
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>null</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createNullAnnotations() {
		String source = null;		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "appinfo", "\n\t\t\t<jxb:globalBindings collectionType=\"java.util.Vector\"/>\n\t\t"
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
		  (actTypeEClass, 
		   source, 
		   new String[] {
			 "name", "act_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getActType_Scene(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "scene",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getActType_Pindex(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "pindex"
		   });		
		addAnnotation
		  (getActType_Title(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "title"
		   });		
		addAnnotation
		  (documentRootEClass, 
		   source, 
		   new String[] {
			 "name", "",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getDocumentRoot_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });		
		addAnnotation
		  (getDocumentRoot_XMLNSPrefixMap(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xmlns:prefix"
		   });		
		addAnnotation
		  (getDocumentRoot_XSISchemaLocation(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xsi:schemaLocation"
		   });		
		addAnnotation
		  (getDocumentRoot_Act(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "act",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Fm(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "fm",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_GroupDescription(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "groupDescription",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Line(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "line",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_P(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "p",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Persona(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "persona",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Personae(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "personae",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_PersonaGroup(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "personaGroup",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Play(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "play",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_PlaySubTitle(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "playSubTitle",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Scene(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "scene",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_SceneDescription(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "sceneDescription",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Speaker(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "speaker",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Speech(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "speech",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_StageDirections(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "stageDirections",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Title(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "title",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (fmTypeEClass, 
		   source, 
		   new String[] {
			 "name", "fm_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getFmType_P(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "p",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (personaeTypeEClass, 
		   source, 
		   new String[] {
			 "name", "personae_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getPersonaeType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });		
		addAnnotation
		  (getPersonaeType_Title(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "title",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getPersonaeType_Persona(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "persona",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getPersonaeType_PersonaGroup(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "personaGroup",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (personaGroupTypeEClass, 
		   source, 
		   new String[] {
			 "name", "personaGroup_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getPersonaGroupType_Persona(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "persona",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getPersonaGroupType_GroupDescription(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "groupDescription",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (pindexTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "pindex_._type",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#NMTOKEN",
			 "enumeration", "1 2"
		   });		
		addAnnotation
		  (playTypeEClass, 
		   source, 
		   new String[] {
			 "name", "play_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getPlayType_Title(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "title",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getPlayType_Fm(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "fm",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getPlayType_Personae(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "personae",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getPlayType_SceneDescription(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "sceneDescription",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getPlayType_PlaySubTitle(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "playSubTitle",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getPlayType_Act(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "act",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (sceneTypeEClass, 
		   source, 
		   new String[] {
			 "name", "scene_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getSceneType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });		
		addAnnotation
		  (getSceneType_StageDirections(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "stageDirections",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getSceneType_Speech(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "speech",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getSceneType_Pindex(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "pindex"
		   });		
		addAnnotation
		  (getSceneType_Title(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "title"
		   });		
		addAnnotation
		  (speechTypeEClass, 
		   source, 
		   new String[] {
			 "name", "speech_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getSpeechType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });		
		addAnnotation
		  (getSpeechType_Speaker(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "speaker",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getSpeechType_Line(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "line",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getSpeechType_StageDirections(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "stageDirections",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });
	}

} //PlayPackageImpl

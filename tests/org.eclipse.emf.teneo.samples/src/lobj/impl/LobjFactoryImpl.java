/**
 * <copyright>
 * </copyright>
 *
 * $Id: LobjFactoryImpl.java,v 1.3 2007/03/28 13:56:59 mtaal Exp $
 */
package lobj.impl;

import lobj.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LobjFactoryImpl extends EFactoryImpl implements LobjFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LobjFactory init() {
		try {
			LobjFactory theLobjFactory = (LobjFactory)EPackage.Registry.INSTANCE.getEFactory("lobj.ecore"); 
			if (theLobjFactory != null) {
				return theLobjFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new LobjFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LobjFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case LobjPackage.HYPERTEXT_BLOCK: return createHypertextBlock();
			case LobjPackage.HYPERTEXT_CONTENT: return createHypertextContent();
			case LobjPackage.BLOCK_FOLDER: return createBlockFolder();
			case LobjPackage.CATEGORY: return createCategory();
			case LobjPackage.CORR_BLOCK: return createCorrBlock();
			case LobjPackage.COURSE: return createCourse();
			case LobjPackage.ITEM: return createItem();
			case LobjPackage.LEARNING_UNIT: return createLearningUnit();
			case LobjPackage.LU_FOLDER: return createLuFolder();
			case LobjPackage.MODULE: return createModule();
			case LobjPackage.MODULE_FOLDER: return createModuleFolder();
			case LobjPackage.RESRC_FOLDER: return createResrcFolder();
			case LobjPackage.THEME: return createTheme();
			case LobjPackage.PRESENTATION_BLOCK: return createPresentationBlock();
			case LobjPackage.THEME_NODE: return createThemeNode();
			case LobjPackage.LU_NODE: return createLuNode();
			case LobjPackage.RESRC_FILE: return createResrcFile();
			case LobjPackage.BLOCK_AUDIOFILE: return createBlockAudiofile();
			case LobjPackage.RESRC_FILETYPE: return createResrcFiletype();
			case LobjPackage.ACCESS_CONTROL: return createAccessControl();
			case LobjPackage.ADDRESS: return createAddress();
			case LobjPackage.AFFILIATION: return createAffiliation();
			case LobjPackage.AUTHOR: return createAuthor();
			case LobjPackage.BLOCK_META: return createBlockMeta();
			case LobjPackage.BLOCKTYPE: return createBlocktype();
			case LobjPackage.TITLE_META: return createTitleMeta();
			case LobjPackage.COURSE_META: return createCourseMeta();
			case LobjPackage.SIMPLE_DIDAC_META: return createSimpleDidacMeta();
			case LobjPackage.DIDAC_META: return createDidacMeta();
			case LobjPackage.DOMAIN: return createDomain();
			case LobjPackage.EDITION: return createEdition();
			case LobjPackage.FOLDER_META: return createFolderMeta();
			case LobjPackage.LU_META: return createLuMeta();
			case LobjPackage.USERAUTHORIZATION: return createUserauthorization();
			case LobjPackage.NOTE: return createNote();
			case LobjPackage.PERSON: return createPerson();
			case LobjPackage.PUBLISHER: return createPublisher();
			case LobjPackage.PUBLISH_INFO: return createPublishInfo();
			case LobjPackage.RESRC_META: return createResrcMeta();
			case LobjPackage.SHAREDNOTES: return createSharednotes();
			case LobjPackage.COURSETYPE: return createCoursetype();
			case LobjPackage.EXTERNAL_METADATA: return createExternalMetadata();
			case LobjPackage.LANGUAGE: return createLanguage();
			case LobjPackage.PRECOGNITION: return createPrecognition();
			case LobjPackage.INTERNAL_REF: return createInternalRef();
			case LobjPackage.MODULE_META: return createModuleMeta();
			case LobjPackage.SOURCE: return createSource();
			case LobjPackage.AUTHORIZATION_TYPES: return createAuthorizationTypes();
			case LobjPackage.USER: return createUser();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HypertextBlock createHypertextBlock() {
		HypertextBlockImpl hypertextBlock = new HypertextBlockImpl();
		return hypertextBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HypertextContent createHypertextContent() {
		HypertextContentImpl hypertextContent = new HypertextContentImpl();
		return hypertextContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BlockFolder createBlockFolder() {
		BlockFolderImpl blockFolder = new BlockFolderImpl();
		return blockFolder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Category createCategory() {
		CategoryImpl category = new CategoryImpl();
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CorrBlock createCorrBlock() {
		CorrBlockImpl corrBlock = new CorrBlockImpl();
		return corrBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Course createCourse() {
		CourseImpl course = new CourseImpl();
		return course;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Item createItem() {
		ItemImpl item = new ItemImpl();
		return item;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LearningUnit createLearningUnit() {
		LearningUnitImpl learningUnit = new LearningUnitImpl();
		return learningUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LuFolder createLuFolder() {
		LuFolderImpl luFolder = new LuFolderImpl();
		return luFolder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Module createModule() {
		ModuleImpl module = new ModuleImpl();
		return module;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModuleFolder createModuleFolder() {
		ModuleFolderImpl moduleFolder = new ModuleFolderImpl();
		return moduleFolder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResrcFolder createResrcFolder() {
		ResrcFolderImpl resrcFolder = new ResrcFolderImpl();
		return resrcFolder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Theme createTheme() {
		ThemeImpl theme = new ThemeImpl();
		return theme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PresentationBlock createPresentationBlock() {
		PresentationBlockImpl presentationBlock = new PresentationBlockImpl();
		return presentationBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThemeNode createThemeNode() {
		ThemeNodeImpl themeNode = new ThemeNodeImpl();
		return themeNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LuNode createLuNode() {
		LuNodeImpl luNode = new LuNodeImpl();
		return luNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResrcFile createResrcFile() {
		ResrcFileImpl resrcFile = new ResrcFileImpl();
		return resrcFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BlockAudiofile createBlockAudiofile() {
		BlockAudiofileImpl blockAudiofile = new BlockAudiofileImpl();
		return blockAudiofile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResrcFiletype createResrcFiletype() {
		ResrcFiletypeImpl resrcFiletype = new ResrcFiletypeImpl();
		return resrcFiletype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessControl createAccessControl() {
		AccessControlImpl accessControl = new AccessControlImpl();
		return accessControl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Address createAddress() {
		AddressImpl address = new AddressImpl();
		return address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Affiliation createAffiliation() {
		AffiliationImpl affiliation = new AffiliationImpl();
		return affiliation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Author createAuthor() {
		AuthorImpl author = new AuthorImpl();
		return author;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BlockMeta createBlockMeta() {
		BlockMetaImpl blockMeta = new BlockMetaImpl();
		return blockMeta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Blocktype createBlocktype() {
		BlocktypeImpl blocktype = new BlocktypeImpl();
		return blocktype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TitleMeta createTitleMeta() {
		TitleMetaImpl titleMeta = new TitleMetaImpl();
		return titleMeta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CourseMeta createCourseMeta() {
		CourseMetaImpl courseMeta = new CourseMetaImpl();
		return courseMeta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleDidacMeta createSimpleDidacMeta() {
		SimpleDidacMetaImpl simpleDidacMeta = new SimpleDidacMetaImpl();
		return simpleDidacMeta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DidacMeta createDidacMeta() {
		DidacMetaImpl didacMeta = new DidacMetaImpl();
		return didacMeta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Domain createDomain() {
		DomainImpl domain = new DomainImpl();
		return domain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Edition createEdition() {
		EditionImpl edition = new EditionImpl();
		return edition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FolderMeta createFolderMeta() {
		FolderMetaImpl folderMeta = new FolderMetaImpl();
		return folderMeta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LuMeta createLuMeta() {
		LuMetaImpl luMeta = new LuMetaImpl();
		return luMeta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Userauthorization createUserauthorization() {
		UserauthorizationImpl userauthorization = new UserauthorizationImpl();
		return userauthorization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Note createNote() {
		NoteImpl note = new NoteImpl();
		return note;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person createPerson() {
		PersonImpl person = new PersonImpl();
		return person;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Publisher createPublisher() {
		PublisherImpl publisher = new PublisherImpl();
		return publisher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PublishInfo createPublishInfo() {
		PublishInfoImpl publishInfo = new PublishInfoImpl();
		return publishInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResrcMeta createResrcMeta() {
		ResrcMetaImpl resrcMeta = new ResrcMetaImpl();
		return resrcMeta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sharednotes createSharednotes() {
		SharednotesImpl sharednotes = new SharednotesImpl();
		return sharednotes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coursetype createCoursetype() {
		CoursetypeImpl coursetype = new CoursetypeImpl();
		return coursetype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalMetadata createExternalMetadata() {
		ExternalMetadataImpl externalMetadata = new ExternalMetadataImpl();
		return externalMetadata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Language createLanguage() {
		LanguageImpl language = new LanguageImpl();
		return language;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Precognition createPrecognition() {
		PrecognitionImpl precognition = new PrecognitionImpl();
		return precognition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalRef createInternalRef() {
		InternalRefImpl internalRef = new InternalRefImpl();
		return internalRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModuleMeta createModuleMeta() {
		ModuleMetaImpl moduleMeta = new ModuleMetaImpl();
		return moduleMeta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Source createSource() {
		SourceImpl source = new SourceImpl();
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuthorizationTypes createAuthorizationTypes() {
		AuthorizationTypesImpl authorizationTypes = new AuthorizationTypesImpl();
		return authorizationTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User createUser() {
		UserImpl user = new UserImpl();
		return user;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LobjPackage getLobjPackage() {
		return (LobjPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	public static LobjPackage getPackage() {
		return LobjPackage.eINSTANCE;
	}

} //LobjFactoryImpl
